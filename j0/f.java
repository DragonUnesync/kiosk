package j0;

import G.l;
import I.a;
import N.e;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import h.C1022j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Executor;
import k0.C1131a;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f12834a = new Object();

    public static int a(Context context, String str) {
        boolean z = true;
        if (str != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                return context.checkPermission(str, Process.myPid(), Process.myUid());
            }
            l lVar = new l(context);
            if (i >= 24) {
                z = j.a(lVar.f12840a);
            } else {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                String packageName = context.getApplicationContext().getPackageName();
                int i8 = applicationInfo.uid;
                try {
                    Class<?> cls = Class.forName(AppOpsManager.class.getName());
                    Class cls2 = Integer.TYPE;
                    Method method = cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class});
                    Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
                    num.getClass();
                    if (((Integer) method.invoke(appOpsManager, new Object[]{num, Integer.valueOf(i8), packageName})).intValue() != 0) {
                        z = false;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                }
            }
            if (z) {
                return 0;
            }
            return -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static int b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(context, i);
        }
        return context.getResources().getColor(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r5.f13080c == r8.hashCode()) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList c(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            l0.j r1 = new l0.j
            r1.<init>(r0, r8)
            java.lang.Object r2 = l0.l.f13085c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = l0.l.f13084b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x003c }
            r4 = 0
            if (r3 == 0) goto L_0x004f
            int r5 = r3.size()     // Catch:{ all -> 0x003c }
            if (r5 <= 0) goto L_0x004f
            java.lang.Object r5 = r3.get(r9)     // Catch:{ all -> 0x003c }
            l0.i r5 = (l0.i) r5     // Catch:{ all -> 0x003c }
            if (r5 == 0) goto L_0x004f
            android.content.res.Configuration r6 = r5.f13079b     // Catch:{ all -> 0x003c }
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch:{ all -> 0x003c }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x004c
            if (r8 != 0) goto L_0x003e
            int r6 = r5.f13080c     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x0048
            goto L_0x003e
        L_0x003c:
            r8 = move-exception
            goto L_0x009d
        L_0x003e:
            if (r8 == 0) goto L_0x004c
            int r6 = r5.f13080c     // Catch:{ all -> 0x003c }
            int r7 = r8.hashCode()     // Catch:{ all -> 0x003c }
            if (r6 != r7) goto L_0x004c
        L_0x0048:
            android.content.res.ColorStateList r3 = r5.f13078a     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            goto L_0x0051
        L_0x004c:
            r3.remove(r9)     // Catch:{ all -> 0x003c }
        L_0x004f:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            r3 = r4
        L_0x0051:
            if (r3 == 0) goto L_0x0054
            goto L_0x009c
        L_0x0054:
            java.lang.ThreadLocal r2 = l0.l.f13083a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0066
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L_0x0066:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L_0x0075
            r3 = 31
            if (r2 > r3) goto L_0x0075
            goto L_0x0086
        L_0x0075:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = l0.C1170c.a(r0, r2, r8)     // Catch:{ Exception -> 0x007e }
            goto L_0x0086
        L_0x007e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L_0x0086:
            if (r4 == 0) goto L_0x008d
            l0.l.a(r1, r9, r4, r8)
            r3 = r4
            goto L_0x009c
        L_0x008d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L_0x0098
            android.content.res.ColorStateList r3 = l0.h.a(r0, r9, r8)
            goto L_0x009c
        L_0x0098:
            android.content.res.ColorStateList r3 = r0.getColorStateList(r9)
        L_0x009c:
            return r3
        L_0x009d:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.f.c(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static Executor d(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1131a.d(context);
        }
        return new F.f(new Handler(context.getMainLooper()));
    }

    public static Intent e(C1022j jVar) {
        Intent parentActivityIntent = jVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String g8 = g(jVar, jVar.getComponentName());
            if (g8 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(jVar, g8);
            try {
                if (g(jVar, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + g8 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent f(C1022j jVar, ComponentName componentName) {
        String g8 = g(jVar, componentName);
        if (g8 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), g8);
        if (g(jVar, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String g(Activity activity, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = activity.getPackageManager();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            i = 269222528;
        } else if (i8 >= 24) {
            i = 787072;
        } else {
            i = 640;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return activity.getPackageName() + string;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:21|(2:31|32)|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r5 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004c, code lost:
        if (r5 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0056 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:33:0x0056=Splitter:B:33:0x0056, B:27:0x004f=Splitter:B:27:0x004f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void h(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = f12834a
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x0012 }
            if (r1 == 0) goto L_0x0014
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0012:
            r5 = move-exception
            goto L_0x0060
        L_0x0014:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch:{ FileNotFoundException -> 0x0057 }
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch:{ all -> 0x0012 }
            r2 = 0
            r1.setOutput(r5, r2)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0044 }
            r1.startDocument(r3, r4)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch:{ Exception -> 0x0044 }
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch:{ Exception -> 0x0044 }
            r1.endDocument()     // Catch:{ Exception -> 0x0044 }
            if (r5 == 0) goto L_0x004f
        L_0x003e:
            r5.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x004f
        L_0x0042:
            r6 = move-exception
            goto L_0x0051
        L_0x0044:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r1, r2, r6)     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x004f
            goto L_0x003e
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0051:
            if (r5 == 0) goto L_0x0056
            r5.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            throw r6     // Catch:{ all -> 0x0012 }
        L_0x0057:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r5, r6)     // Catch:{ all -> 0x0012 }
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.f.h(android.content.Context, java.lang.String):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|(2:40|41)|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        if (r2 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0053, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005a, code lost:
        if (r1.isEmpty() == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        r8.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0056 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0069 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0056=Splitter:B:32:0x0056, B:42:0x0069=Splitter:B:42:0x0069} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String i(android.content.Context r8) {
        /*
            java.lang.Object r0 = f12834a
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch:{ FileNotFoundException -> 0x006a }
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            int r4 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x004c }
        L_0x0018:
            int r5 = r3.next()     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            r6 = 1
            if (r5 == r6) goto L_0x0044
            r6 = 3
            if (r5 != r6) goto L_0x002b
            int r7 = r3.getDepth()     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            if (r7 <= r4) goto L_0x0044
            goto L_0x002b
        L_0x0029:
            r8 = move-exception
            goto L_0x0064
        L_0x002b:
            if (r5 == r6) goto L_0x0018
            r6 = 4
            if (r5 != r6) goto L_0x0031
            goto L_0x0018
        L_0x0031:
            java.lang.String r5 = r3.getName()     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch:{ IOException | XmlPullParserException -> 0x004c }
            if (r5 == 0) goto L_0x0018
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch:{ IOException | XmlPullParserException -> 0x004c }
        L_0x0044:
            if (r2 == 0) goto L_0x0056
        L_0x0046:
            r2.close()     // Catch:{ IOException -> 0x0056 }
            goto L_0x0056
        L_0x004a:
            r8 = move-exception
            goto L_0x006c
        L_0x004c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x0056
            goto L_0x0046
        L_0x0056:
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x004a }
            if (r2 != 0) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch:{ all -> 0x004a }
        L_0x0062:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x0064:
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            throw r8     // Catch:{ all -> 0x004a }
        L_0x006a:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r1
        L_0x006c:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.f.i(android.content.Context):java.lang.String");
    }

    public static void j(Activity activity, String[] strArr, int i) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        int i8 = 0;
        while (i8 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i8])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i8], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i8));
                }
                i8++;
            } else {
                throw new IllegalArgumentException(e.A(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[(strArr.length - size)];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size != strArr.length) {
                int i9 = 0;
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    if (!hashSet.contains(Integer.valueOf(i10))) {
                        strArr2[i9] = strArr[i10];
                        i9++;
                    }
                }
            } else {
                return;
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof C1114c) {
                C1114c cVar = (C1114c) activity;
            }
            C1112a.d(activity, strArr, i);
        } else if (activity instanceof C1113b) {
            new Handler(Looper.getMainLooper()).post(new l((Object) strArr2, (Object) activity, i, 4));
        }
    }
}
