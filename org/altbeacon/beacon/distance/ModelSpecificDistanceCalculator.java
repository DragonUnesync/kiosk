package org.altbeacon.beacon.distance;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.altbeacon.beacon.BuildConfig;
import org.altbeacon.beacon.distance.ModelSpecificDistanceUpdater;
import org.altbeacon.beacon.logging.LogManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ModelSpecificDistanceCalculator implements DistanceCalculator {
    private static final String CONFIG_FILE = "model-distance-calculations.json";
    private static final String TAG = "ModelSpecificDistanceCalculator";
    private Context mContext;
    private AndroidModel mDefaultModel;
    /* access modifiers changed from: private */
    public DistanceCalculator mDistanceCalculator;
    private final ReentrantLock mLock;
    private AndroidModel mModel;
    Map<AndroidModel, DistanceCalculator> mModelMap;
    /* access modifiers changed from: private */
    public String mRemoteUpdateUrlString;
    /* access modifiers changed from: private */
    public AndroidModel mRequestedModel;

    public ModelSpecificDistanceCalculator(Context context, String str) {
        this(context, str, AndroidModel.forThisDevice());
    }

    private void buildModelMap(String str) {
        boolean z;
        HashMap hashMap = new HashMap();
        JSONArray jSONArray = new JSONObject(str).getJSONArray("models");
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has("default")) {
                z = jSONObject.getBoolean("default");
            } else {
                z = false;
            }
            double d8 = jSONObject.getDouble("coefficient1");
            double d9 = jSONObject.getDouble("coefficient2");
            double d10 = jSONObject.getDouble("coefficient3");
            String string = jSONObject.getString("version");
            String string2 = jSONObject.getString("build_number");
            String string3 = jSONObject.getString("model");
            String string4 = jSONObject.getString("manufacturer");
            JSONArray jSONArray2 = jSONArray;
            String str2 = string3;
            CurveFittedDistanceCalculator curveFittedDistanceCalculator = new CurveFittedDistanceCalculator(d8, d9, d10);
            AndroidModel androidModel = new AndroidModel(string, string2, str2, string4);
            hashMap.put(androidModel, curveFittedDistanceCalculator);
            if (z) {
                this.mDefaultModel = androidModel;
            }
            i++;
            jSONArray = jSONArray2;
        }
        this.mModelMap = hashMap;
    }

    private DistanceCalculator findCalculatorForModel(AndroidModel androidModel) {
        LogManager.d(TAG, "Finding best distance calculator for %s, %s, %s, %s", androidModel.getVersion(), androidModel.getBuildNumber(), androidModel.getModel(), androidModel.getManufacturer());
        Map<AndroidModel, DistanceCalculator> map = this.mModelMap;
        AndroidModel androidModel2 = null;
        if (map == null) {
            LogManager.d(TAG, "Cannot get distance calculator because modelMap was never initialized", new Object[0]);
            return null;
        }
        int i = 0;
        for (AndroidModel next : map.keySet()) {
            if (next.matchScore(androidModel) > i) {
                i = next.matchScore(androidModel);
                androidModel2 = next;
            }
        }
        if (androidModel2 != null) {
            LogManager.d(TAG, "found a match with score %s", Integer.valueOf(i));
            LogManager.d(TAG, "Finding best distance calculator for %s, %s, %s, %s", androidModel2.getVersion(), androidModel2.getBuildNumber(), androidModel2.getModel(), androidModel2.getManufacturer());
            this.mModel = androidModel2;
        } else {
            this.mModel = this.mDefaultModel;
            LogManager.w(TAG, "Cannot find match for this device.  Using default", new Object[0]);
        }
        return this.mModelMap.get(this.mModel);
    }

    private SharedPreferences getSharedPreferences() {
        return this.mContext.getSharedPreferences(BuildConfig.LIBRARY_PACKAGE_NAME, 0);
    }

    private void loadDefaultModelMap() {
        try {
            buildModelMap(stringFromFilePath(CONFIG_FILE));
        } catch (Exception e) {
            this.mModelMap = new HashMap();
            LogManager.e(e, TAG, "Cannot build model distance calculations", new Object[0]);
        }
    }

    private void loadModelMap() {
        boolean z;
        if (this.mRemoteUpdateUrlString != null) {
            z = loadModelMapFromStorage();
            if (!z) {
                requestModelMapFromWeb();
            }
        } else {
            z = false;
        }
        if (!z) {
            loadDefaultModelMap();
        }
        this.mDistanceCalculator = findCalculatorForModelWithLock(this.mRequestedModel);
    }

    /* access modifiers changed from: private */
    public boolean loadModelMapFromStorage() {
        String string = getSharedPreferences().getString(CONFIG_FILE, (String) null);
        if (string == null) {
            return false;
        }
        try {
            buildModelMapWithLock(string);
            return true;
        } catch (JSONException e) {
            LogManager.e(e, TAG, "Cannot update distance models from online database at %s with JSON: %s", this.mRemoteUpdateUrlString, string);
            return false;
        }
    }

    @TargetApi(11)
    private void requestModelMapFromWeb() {
        if (this.mContext.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            LogManager.w(TAG, "App has no android.permission.INTERNET permission.  Cannot check for distance model updates", new Object[0]);
        } else {
            new ModelSpecificDistanceUpdater(this.mContext, this.mRemoteUpdateUrlString, new ModelSpecificDistanceUpdater.CompletionHandler() {
                public void onComplete(String str, Exception exc, int i) {
                    if (exc != null) {
                        LogManager.w(ModelSpecificDistanceCalculator.TAG, "Cannot updated distance models from online database at %s", exc, ModelSpecificDistanceCalculator.this.mRemoteUpdateUrlString);
                    } else if (i != 200) {
                        LogManager.w(ModelSpecificDistanceCalculator.TAG, "Cannot updated distance models from online database at %s due to HTTP status code %s", ModelSpecificDistanceCalculator.this.mRemoteUpdateUrlString, Integer.valueOf(i));
                    } else {
                        LogManager.d(ModelSpecificDistanceCalculator.TAG, "Successfully downloaded distance models from online database at %s", ModelSpecificDistanceCalculator.this.mRemoteUpdateUrlString);
                        try {
                            ModelSpecificDistanceCalculator.this.buildModelMapWithLock(str);
                            if (ModelSpecificDistanceCalculator.this.saveJson(str)) {
                                ModelSpecificDistanceCalculator.this.loadModelMapFromStorage();
                                ModelSpecificDistanceCalculator modelSpecificDistanceCalculator = ModelSpecificDistanceCalculator.this;
                                modelSpecificDistanceCalculator.mDistanceCalculator = modelSpecificDistanceCalculator.findCalculatorForModelWithLock(modelSpecificDistanceCalculator.mRequestedModel);
                                LogManager.i(ModelSpecificDistanceCalculator.TAG, "Successfully updated distance model with latest from online database", new Object[0]);
                            }
                        } catch (JSONException e) {
                            LogManager.w(e, ModelSpecificDistanceCalculator.TAG, "Cannot parse json from downloaded distance model", new Object[0]);
                        }
                    }
                }
            }).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: private */
    public boolean saveJson(String str) {
        getSharedPreferences().edit().putString(CONFIG_FILE, str).commit();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String stringFromFilePath(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Cannot load resource at "
            java.lang.String r1 = "/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            java.lang.Class<org.altbeacon.beacon.distance.ModelSpecificDistanceCalculator> r4 = org.altbeacon.beacon.distance.ModelSpecificDistanceCalculator.class
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            r5.<init>(r1)     // Catch:{ all -> 0x007b }
            r5.append(r8)     // Catch:{ all -> 0x007b }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x007b }
            java.io.InputStream r4 = r4.getResourceAsStream(r5)     // Catch:{ all -> 0x007b }
            if (r4 != 0) goto L_0x0039
            java.lang.Class r5 = r7.getClass()     // Catch:{ all -> 0x0037 }
            java.lang.ClassLoader r5 = r5.getClassLoader()     // Catch:{ all -> 0x0037 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r6.<init>(r1)     // Catch:{ all -> 0x0037 }
            r6.append(r8)     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0037 }
            java.io.InputStream r4 = r5.getResourceAsStream(r1)     // Catch:{ all -> 0x0037 }
            goto L_0x0039
        L_0x0037:
            r8 = move-exception
            goto L_0x007d
        L_0x0039:
            if (r4 == 0) goto L_0x0069
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ all -> 0x0037 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0037 }
            java.lang.String r1 = "UTF-8"
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0037 }
            r8.<init>(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = r8.readLine()     // Catch:{ all -> 0x005a }
        L_0x004b:
            if (r0 == 0) goto L_0x005e
            r2.append(r0)     // Catch:{ all -> 0x005a }
            r0 = 10
            r2.append(r0)     // Catch:{ all -> 0x005a }
            java.lang.String r0 = r8.readLine()     // Catch:{ all -> 0x005a }
            goto L_0x004b
        L_0x005a:
            r0 = move-exception
            r3 = r8
            r8 = r0
            goto L_0x007d
        L_0x005e:
            r8.close()
            r4.close()
            java.lang.String r8 = r2.toString()
            return r8
        L_0x0069:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x0037 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0037 }
            r2.<init>(r0)     // Catch:{ all -> 0x0037 }
            r2.append(r8)     // Catch:{ all -> 0x0037 }
            java.lang.String r8 = r2.toString()     // Catch:{ all -> 0x0037 }
            r1.<init>(r8)     // Catch:{ all -> 0x0037 }
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x007b:
            r8 = move-exception
            r4 = r3
        L_0x007d:
            if (r3 == 0) goto L_0x0082
            r3.close()
        L_0x0082:
            if (r4 == 0) goto L_0x0087
            r4.close()
        L_0x0087:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.distance.ModelSpecificDistanceCalculator.stringFromFilePath(java.lang.String):java.lang.String");
    }

    public void buildModelMapWithLock(String str) {
        this.mLock.lock();
        try {
            buildModelMap(str);
        } finally {
            this.mLock.unlock();
        }
    }

    public double calculateDistance(int i, double d8) {
        DistanceCalculator distanceCalculator = this.mDistanceCalculator;
        if (distanceCalculator != null) {
            return distanceCalculator.calculateDistance(i, d8);
        }
        LogManager.w(TAG, "distance calculator has not been set", new Object[0]);
        return -1.0d;
    }

    public DistanceCalculator findCalculatorForModelWithLock(AndroidModel androidModel) {
        this.mLock.lock();
        try {
            return findCalculatorForModel(androidModel);
        } finally {
            this.mLock.unlock();
        }
    }

    public AndroidModel getModel() {
        return this.mModel;
    }

    public AndroidModel getRequestedModel() {
        return this.mRequestedModel;
    }

    public ModelSpecificDistanceCalculator(Context context, String str, AndroidModel androidModel) {
        this.mRemoteUpdateUrlString = null;
        this.mLock = new ReentrantLock();
        this.mRequestedModel = androidModel;
        this.mRemoteUpdateUrlString = str;
        this.mContext = context;
        loadModelMap();
        this.mDistanceCalculator = findCalculatorForModelWithLock(androidModel);
    }
}
