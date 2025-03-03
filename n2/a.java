package n2;

import B.q0;
import B2.k;
import C6.d;
import D.s0;
import D2.j;
import F.h;
import H2.B;
import H2.C0080a;
import H2.x;
import H2.z;
import H3.P;
import K2.A;
import K2.C0109a;
import K2.C0110b;
import K2.C0111c;
import K2.D;
import K2.p;
import P6.f;
import Q0.g;
import Y2.e;
import Z1.c;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.webkit.MimeTypeMap;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.bumptech.glide.b;
import com.bumptech.glide.i;
import com.bumptech.glide.load.data.l;
import de.ozerov.fully.FullyActivity;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import j$.nio.channels.DesugarChannels;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.IDN;
import java.net.URI;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.crypto.Cipher;
import org.altbeacon.beacon.service.RangedBeacon;
import org.altbeacon.bluetooth.Pdu;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u.C1477r;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f13713a = 0;

    public static Bitmap A(Drawable drawable) {
        Bitmap bitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }

    public static boolean A0() {
        if (Build.VERSION.SDK_INT >= 27) {
            return true;
        }
        return false;
    }

    public static void B(String str, Throwable th) {
        f.e(str, "msg");
        f.e(th, "tr");
        Log.e("a", str, th);
    }

    public static boolean B0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static void C(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File x8 : listFiles) {
                x(x8);
            }
        }
    }

    public static boolean C0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public static JSONObject D(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public static boolean D0(View view, float f8, float f9) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i8 = iArr[1];
        if (f8 <= ((float) i) || f8 >= ((float) (view.getWidth() + i)) || f9 <= ((float) i8) || f9 >= ((float) (view.getHeight() + i8))) {
            return false;
        }
        return true;
    }

    public static HashMap E(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static boolean E0() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    public static String F(Context context, String str) {
        File J8;
        if (!str.contains("/sd_ext") || (J8 = J(context)) == null) {
            return str;
        }
        return str.replace("/sd_ext", J8.getAbsolutePath());
    }

    public static boolean F0() {
        if (Build.VERSION.SDK_INT >= 34) {
            return true;
        }
        return false;
    }

    public static String G(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    public static boolean G0(Context context, String str) {
        try {
            return w0(context, new File(new URI(str)));
        } catch (Exception unused) {
            return false;
        }
    }

    public static String H() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date());
    }

    public static String H0(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            sb.append(it.next().toString());
        }
        while (it.hasNext()) {
            sb.append(",");
            sb.append(it.next().toString());
        }
        return sb.toString();
    }

    public static String I() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date());
    }

    public static ArrayList I0(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONArray) {
                obj = I0((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = J0((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:54|55|79) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r3.getAbsolutePath();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00d6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File J(android.content.Context r7) {
        /*
            boolean r0 = q0()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x005c
            java.io.File[] r7 = r7.getExternalCacheDirs()
            int r0 = r7.length
        L_0x000d:
            if (r1 >= r0) goto L_0x005b
            r3 = r7[r1]
            if (r3 == 0) goto L_0x0058
            boolean r4 = android.os.Environment.isExternalStorageRemovable(r3)     // Catch:{ Exception -> 0x0043 }
            if (r4 == 0) goto L_0x0058
            java.lang.String r4 = "mounted"
            java.lang.String r5 = android.os.Environment.getExternalStorageState(r3)     // Catch:{ Exception -> 0x0043 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x0043 }
            if (r4 == 0) goto L_0x0058
            r4 = r3
        L_0x0026:
            r5 = r4
        L_0x0027:
            if (r4 == 0) goto L_0x0036
            java.io.File r4 = r4.getParentFile()     // Catch:{ Exception -> 0x0043 }
            if (r4 == 0) goto L_0x0027
            boolean r6 = r4.canRead()     // Catch:{ Exception -> 0x0043 }
            if (r6 == 0) goto L_0x0027
            goto L_0x0026
        L_0x0036:
            java.lang.String r4 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0043 }
            java.lang.String r6 = "/"
            boolean r3 = r4.equals(r6)     // Catch:{ Exception -> 0x0043 }
            if (r3 != 0) goto L_0x0058
            return r5
        L_0x0043:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to examine "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " due to "
            r5.append(r3)
            java.lang.String r3 = "a"
            Q0.g.z(r4, r5, r3)
        L_0x0058:
            int r1 = r1 + 1
            goto L_0x000d
        L_0x005b:
            return r2
        L_0x005c:
            java.io.File r7 = new java.io.File
            java.lang.String r0 = "/storage"
            r7.<init>(r0)
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x006f
            boolean r0 = r7.canRead()
            if (r0 != 0) goto L_0x0076
        L_0x006f:
            java.io.File r7 = new java.io.File
            java.lang.String r0 = "/mnt"
            r7.<init>(r0)
        L_0x0076:
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x00e2
            java.io.File[] r7 = r7.listFiles()     // Catch:{ Exception -> 0x00da }
            int r0 = r7.length     // Catch:{ Exception -> 0x00da }
        L_0x0081:
            if (r1 >= r0) goto L_0x00e2
            r3 = r7[r1]     // Catch:{ Exception -> 0x00da }
            boolean r4 = r3.exists()     // Catch:{ Exception -> 0x00da }
            if (r4 == 0) goto L_0x00dc
            boolean r4 = r3.canRead()     // Catch:{ Exception -> 0x00da }
            if (r4 == 0) goto L_0x00dc
            boolean r4 = r3.isDirectory()     // Catch:{ Exception -> 0x00da }
            if (r4 == 0) goto L_0x00dc
            boolean r4 = android.os.Environment.isExternalStorageRemovable(r3)     // Catch:{ Exception -> 0x00d6 }
            if (r4 == 0) goto L_0x00dc
            java.lang.String r4 = r3.getParent()     // Catch:{ Exception -> 0x00d6 }
            if (r4 != 0) goto L_0x00a5
            r5 = r3
            goto L_0x00b6
        L_0x00a5:
            java.io.File r4 = r3.getParentFile()     // Catch:{ Exception -> 0x00d6 }
            java.io.File r4 = r4.getCanonicalFile()     // Catch:{ Exception -> 0x00d6 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r6 = r3.getName()     // Catch:{ Exception -> 0x00d6 }
            r5.<init>(r4, r6)     // Catch:{ Exception -> 0x00d6 }
        L_0x00b6:
            java.io.File r4 = r5.getCanonicalFile()     // Catch:{ Exception -> 0x00d6 }
            java.io.File r5 = r5.getAbsoluteFile()     // Catch:{ Exception -> 0x00d6 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x00d6 }
            if (r4 == 0) goto L_0x00dc
            java.lang.String r4 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r5 = "/internal_sd"
            boolean r4 = r4.endsWith(r5)     // Catch:{ Exception -> 0x00d6 }
            if (r4 != 0) goto L_0x00dc
            r2 = r3
            goto L_0x00e2
        L_0x00d6:
            r3.getAbsolutePath()     // Catch:{ Exception -> 0x00da }
            goto L_0x00dc
        L_0x00da:
            r7 = move-exception
            goto L_0x00df
        L_0x00dc:
            int r1 = r1 + 1
            goto L_0x0081
        L_0x00df:
            r7.printStackTrace()
        L_0x00e2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a.J(android.content.Context):java.io.File");
    }

    public static HashMap J0(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = I0((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = J0((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static String K(String str) {
        if (str.contains("?")) {
            str = str.substring(0, str.indexOf("?"));
        }
        if (str.lastIndexOf(".") == -1) {
            return null;
        }
        String substring = str.substring(str.lastIndexOf(".") + 1);
        if (substring.contains("%")) {
            substring = substring.substring(0, substring.indexOf("%"));
        }
        if (substring.contains("/")) {
            substring = substring.substring(0, substring.indexOf("/"));
        }
        return substring.toLowerCase();
    }

    public static ArrayList K0(File file, FileFilter fileFilter) {
        ArrayList arrayList = new ArrayList();
        if (!(file == null || file.listFiles(fileFilter) == null)) {
            for (File file2 : file.listFiles(fileFilter)) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                } else {
                    arrayList.addAll(K0(file2, fileFilter));
                }
            }
        }
        return arrayList;
    }

    public static String L(FullyActivity fullyActivity, Uri uri) {
        Cursor query = fullyActivity.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return null;
        }
        int columnIndex = query.getColumnIndex("_display_name");
        if (columnIndex != -1) {
            query.moveToFirst();
            String string = query.getString(columnIndex);
            query.close();
            return string;
        }
        query.close();
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|23|(2:25|26)|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        android.util.Log.e("a", "Error opening asset " + r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r4 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        android.util.Log.e("a", "Error closing asset ".concat(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        android.util.Log.e("a", "Error closing asset ".concat(r8));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0046 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a A[SYNTHETIC, Splitter:B:31:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String L0(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "Error closing asset "
            java.lang.String r1 = "a"
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            r3.<init>()     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            android.content.res.AssetManager r7 = r7.getAssets()     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            java.io.InputStream r7 = r7.open(r8)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            r5.<init>(r7)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            r7 = 1
        L_0x001d:
            java.lang.String r5 = r4.readLine()     // Catch:{ IOException -> 0x0046 }
            if (r5 == 0) goto L_0x0033
            if (r7 == 0) goto L_0x0027
            r7 = 0
            goto L_0x002c
        L_0x0027:
            r6 = 10
            r3.append(r6)     // Catch:{ IOException -> 0x0046 }
        L_0x002c:
            r3.append(r5)     // Catch:{ IOException -> 0x0046 }
            goto L_0x001d
        L_0x0030:
            r7 = move-exception
            r2 = r4
            goto L_0x0068
        L_0x0033:
            java.lang.String r7 = r3.toString()     // Catch:{ IOException -> 0x0046 }
            r4.close()     // Catch:{ IOException -> 0x003b }
            goto L_0x0042
        L_0x003b:
            java.lang.String r8 = r0.concat(r8)
            android.util.Log.e(r1, r8)
        L_0x0042:
            return r7
        L_0x0043:
            r7 = move-exception
            goto L_0x0068
        L_0x0045:
            r4 = r2
        L_0x0046:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r7.<init>()     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = "Error opening asset "
            r7.append(r3)     // Catch:{ all -> 0x0030 }
            r7.append(r8)     // Catch:{ all -> 0x0030 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0030 }
            android.util.Log.e(r1, r7)     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x0067
            r4.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x0067
        L_0x0060:
            java.lang.String r7 = r0.concat(r8)
            android.util.Log.e(r1, r7)
        L_0x0067:
            return r2
        L_0x0068:
            if (r2 == 0) goto L_0x0075
            r2.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0075
        L_0x006e:
            java.lang.String r8 = r0.concat(r8)
            android.util.Log.e(r1, r8)
        L_0x0075:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a.L0(android.content.Context, java.lang.String):java.lang.String");
    }

    public static boolean M0(String str, String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (String matches : strArr) {
            if (str.matches(matches)) {
                return true;
            }
        }
        return false;
    }

    public static JSONObject N(Intent intent) {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (!(intent == null || (extras = intent.getExtras()) == null)) {
            for (String next : extras.keySet()) {
                try {
                    jSONObject.put(next, extras.get(next));
                } catch (Exception e) {
                    g.x(e, g.s("Failed to put ", next, " into JSON due to "), "a");
                }
            }
        }
        return jSONObject;
    }

    public static String N0(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("md5");
            instance.update(str.getBytes());
            return g(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JSONObject O(Intent intent) {
        if (intent.getExtras() == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        b(jSONObject, intent.getExtras());
        return jSONObject;
    }

    public static int O0(int i) {
        int i8 = i % 65536;
        if (i8 >= 0) {
            return i8;
        }
        return i8 + 65536;
    }

    public static View P(int i, ListView listView) {
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int childCount = (listView.getChildCount() + firstVisiblePosition) - 1;
        if (i >= firstVisiblePosition && i <= childCount) {
            return listView.getChildAt(i - firstVisiblePosition);
        }
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            return adapter.getView(i, (View) null, listView);
        }
        return null;
    }

    public static Intent P0(String str) {
        Intent parseUri = Intent.parseUri(str, 1);
        if (parseUri.getAction() != null && parseUri.getAction().equals("android.intent.action.VIEW") && !str.contains("action=android.intent.action.VIEW")) {
            parseUri.setAction((String) null);
        }
        return parseUri;
    }

    public static boolean Q(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject.has(str)) {
            try {
                return jSONObject.getBoolean(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return z;
    }

    public static int Q0(String str) {
        if (str == null) {
            return -1;
        }
        Matcher matcher = Pattern.compile("Chrome/([0-9]*)").matcher(str);
        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        }
        return 0;
    }

    public static int R(JSONObject jSONObject, String str, int i) {
        if (jSONObject.has(str)) {
            try {
                return jSONObject.getInt(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        g7.l.c(r1, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String R0(java.io.File r3) {
        /*
            java.nio.charset.Charset r0 = W6.a.f6191a
            java.lang.String r1 = "charset"
            P6.f.e(r0, r1)
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r3)
            r1.<init>(r2, r0)
            java.lang.String r3 = B.C0003d.F(r1)     // Catch:{ all -> 0x001a }
            r0 = 0
            g7.l.c(r1, r0)
            return r3
        L_0x001a:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x001c }
        L_0x001c:
            r0 = move-exception
            g7.l.c(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a.R0(java.io.File):java.lang.String");
    }

    public static String S(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str2;
    }

    public static String S0(String str) {
        if (str == null || str.length() <= 0 || str.charAt(str.length() - 1) != '/') {
            return str;
        }
        return str.substring(0, str.length() - 1);
    }

    public static String T(ClassLoader classLoader, Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("path");
            declaredField.setAccessible(true);
            return (String) declaredField.get(classLoader);
        } catch (ClassCastException | IllegalAccessException | NoSuchFieldException unused) {
            String obj = classLoader.toString();
            if (obj.contains("DexPathList")) {
                int indexOf = obj.indexOf("DexPathList");
                int i = indexOf + 11;
                if (obj.length() <= indexOf + 15) {
                    return obj;
                }
                String substring = obj.substring(i);
                int indexOf2 = substring.indexOf(93);
                if (substring.charAt(0) != '[' || substring.charAt(1) != '[' || indexOf2 < 0) {
                    return obj;
                }
                String[] split = substring.substring(2, indexOf2).split(",");
                for (int i8 = 0; i8 < split.length; i8++) {
                    int indexOf3 = split[i8].indexOf(34);
                    int lastIndexOf = split[i8].lastIndexOf(34);
                    if (indexOf3 > 0 && indexOf3 < lastIndexOf) {
                        split[i8] = split[i8].substring(indexOf3 + 1, lastIndexOf);
                    }
                }
                StringBuilder sb = new StringBuilder();
                for (String str : split) {
                    if (sb.length() > 0) {
                        sb.append(':');
                    }
                    sb.append(str);
                }
                return sb.toString();
            }
            int lastIndexOf2 = obj.lastIndexOf(91);
            if (lastIndexOf2 != -1) {
                obj = obj.substring(lastIndexOf2 + 1);
            }
            int indexOf4 = obj.indexOf(93);
            if (indexOf4 == -1) {
                return obj;
            }
            return obj.substring(0, indexOf4);
        }
    }

    public static void T0(JSONObject jSONObject, String str, String str2) {
        if (jSONObject.has(str)) {
            try {
                jSONObject.put(str2, jSONObject.get(str));
                jSONObject.remove(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static String U(Context context) {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                return next.processName;
            }
        }
        return null;
    }

    public static String U0(String str, String str2, String str3) {
        return str.replaceAll("(?i)" + Pattern.quote(str2), str3);
    }

    public static String V(long j7) {
        if (j7 <= 0) {
            return "0";
        }
        double d8 = (double) j7;
        int log10 = (int) (Math.log10(d8) / Math.log10(1024.0d));
        return new DecimalFormat("#,##0.#").format(d8 / Math.pow(1024.0d, (double) log10)) + " " + new String[]{"B", "KB", "MB", "GB", "TB"}[log10];
    }

    public static int V0(float f8) {
        float f9;
        if (f8 < 0.0f) {
            f9 = -0.5f;
        } else {
            f9 = 0.5f;
        }
        return (int) (f8 + f9);
    }

    public static String[] W(String str) {
        if (str.trim().isEmpty()) {
            return new String[0];
        }
        String[] e12 = e1(str);
        for (int i = 0; i < e12.length; i++) {
            e12[i] = ("(?i)\\Q" + e12[i].trim() + "\\E").replace("*", "\\E.*?\\Q");
        }
        return e12;
    }

    public static Bitmap X(Bitmap bitmap, int i, int i8) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) i) / ((float) width), ((float) i8) / ((float) height));
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        bitmap.recycle();
        return createBitmap;
    }

    public static Bitmap Y(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public static String Y0(Context context, String str) {
        File J8 = J(context);
        if (J8 != null) {
            return str.replace(J8.getAbsolutePath(), "/sd_ext");
        }
        return str;
    }

    public static ArrayList Z(Context context, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (Environment.getExternalStorageDirectory().canRead()) {
            arrayList.add(new Y2.g("Shared Storage", Environment.getExternalStorageDirectory(), true, false));
        }
        File J8 = J(context);
        if (J8 != null) {
            arrayList.add(new Y2.g("Shared Storage (SD Card)", J8, true, true));
        }
        for (File file : context.getApplicationContext().getExternalFilesDirs((String) null)) {
            if (file != null) {
                if (file.getParentFile() != null && file.getParentFile().canRead() && !z) {
                    file = file.getParentFile();
                }
                if (J8 == null || !file.getAbsolutePath().startsWith(J8.getAbsolutePath())) {
                    arrayList.add(new Y2.g("App-Specific Storage", file, false, false));
                } else {
                    arrayList.add(new Y2.g("App-Specific Storage (SD Card)", file, false, true));
                }
            }
        }
        if (z0()) {
            arrayList.add(new Y2.g("Private App Storage", context.getDataDir(), false, false));
        }
        return arrayList;
    }

    public static void Z0(AlertDialog alertDialog) {
        try {
            alertDialog.show();
        } catch (Exception e) {
            g.x(e, new StringBuilder("Show Alert Dialog failed due to "), "a");
        }
    }

    public static String a(int i, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i - 3) + "...";
    }

    public static String a0(String str) {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                sb.append("\n");
            } else {
                bufferedReader.close();
                String sb2 = sb.toString();
                fileInputStream.close();
                return sb2;
            }
        }
    }

    public static void a1(int i, Context context, String str) {
        c1(context, str, i, 81);
    }

    public static void b(JSONObject jSONObject, Bundle bundle) {
        for (String next : bundle.keySet()) {
            try {
                jSONObject.put(next, JSONObject.wrap(bundle.get(next)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public static int b0(Context context) {
        return context.getApplicationContext().getApplicationInfo().targetSdkVersion;
    }

    public static void b1(Context context, String str) {
        c1(context, str, 0, 81);
    }

    public static Intent c(Intent intent) {
        try {
            return Intent.parseUri(o0(intent).replace(";end", ";launchHwFlags=0x400000;end"), 1);
        } catch (Exception e) {
            e.getMessage();
            return intent;
        }
    }

    public static File c0(Context context, String str) {
        if (!u0()) {
            return context.getExternalFilesDir(str);
        }
        if (str != null) {
            return Environment.getExternalStoragePublicDirectory(str);
        }
        return Environment.getExternalStorageDirectory();
    }

    public static void c1(Context context, String str, int i, int i8) {
        new Handler(Looper.getMainLooper()).post(new e(context, str, i, i8));
    }

    public static boolean d(String[] strArr, String str) {
        if (strArr == null) {
            return false;
        }
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static String d0(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        try {
            Date parse = simpleDateFormat.parse(str);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            return simpleDateFormat2.format(parse);
        } catch (Exception e) {
            g.z(e, g.s("Couldn't convert local time to UTC for ", str, " due to "), "a");
            return str;
        }
    }

    public static HashMap d1(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        for (String split : str.split(Pattern.quote(str2))) {
            String[] split2 = split.split(Pattern.quote(str3));
            if (split2.length == 2) {
                hashMap.put(split2[0], split2[1]);
            }
        }
        return hashMap;
    }

    public static void e(View view) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        animationDrawable.addFrame(new ColorDrawable(0), 200);
        animationDrawable.addFrame(new ColorDrawable(view.getContext().getResources().getColor(2131099697)), 400);
        animationDrawable.addFrame(new ColorDrawable(0), 400);
        animationDrawable.addFrame(new ColorDrawable(view.getContext().getResources().getColor(2131099697)), 400);
        animationDrawable.addFrame(new ColorDrawable(0), 400);
        animationDrawable.addFrame(new ColorDrawable(view.getContext().getResources().getColor(2131099697)), 2200);
        animationDrawable.addFrame(new ColorDrawable(0), 200);
        animationDrawable.setEnterFadeDuration(50);
        animationDrawable.setExitFadeDuration(50);
        animationDrawable.setOneShot(true);
        view.setBackground(animationDrawable);
        animationDrawable.start();
        view.postDelayed(new Y2.f(view, 0), RangedBeacon.DEFAULT_MAX_TRACKING_AGE);
    }

    public static Intent e0(Context context, String str) {
        String mimeTypeFromExtension;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(F(context, str)));
        String K4 = K(str);
        if (!(K4 == null || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(K4)) == null)) {
            intent.setDataAndType(Uri.parse(F(context, str)), mimeTypeFromExtension);
        }
        return intent;
    }

    public static String[] e1(String str) {
        if (str.trim().isEmpty()) {
            return new String[0];
        }
        return str.replaceAll("(?m)^[ \t]*\r?\n", "").replaceAll("(\r\n)", "\n").split("\n");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: l7.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: l7.f} */
    /* JADX WARNING: type inference failed for: r9v1, types: [l7.f, l7.w, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(long r19, l7.f r21, int r22, java.util.ArrayList r23, int r24, int r25, java.util.ArrayList r26) {
        /*
            r0 = r21
            r1 = r22
            r10 = r23
            r2 = r24
            r11 = r25
            r12 = r26
            java.lang.String r3 = "Failed requirement."
            if (r2 >= r11) goto L_0x01b2
            r4 = r2
        L_0x0011:
            if (r4 >= r11) goto L_0x0028
            java.lang.Object r5 = r10.get(r4)
            l7.i r5 = (l7.i) r5
            int r5 = r5.a()
            if (r5 < r1) goto L_0x0022
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0022:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x0028:
            java.lang.Object r3 = r23.get(r24)
            l7.i r3 = (l7.i) r3
            int r4 = r11 + -1
            java.lang.Object r4 = r10.get(r4)
            l7.i r4 = (l7.i) r4
            int r5 = r3.a()
            r13 = -1
            if (r1 != r5) goto L_0x0053
            java.lang.Object r3 = r12.get(r2)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            int r2 = r2 + 1
            java.lang.Object r5 = r10.get(r2)
            l7.i r5 = (l7.i) r5
            r6 = r2
            r2 = r3
            r3 = r5
            goto L_0x0055
        L_0x0053:
            r6 = r2
            r2 = -1
        L_0x0055:
            byte r5 = r3.d(r1)
            byte r7 = r4.d(r1)
            r8 = 4
            r9 = 2
            if (r5 == r7) goto L_0x012a
            int r3 = r6 + 1
            r4 = 1
        L_0x0064:
            if (r3 >= r11) goto L_0x0083
            int r5 = r3 + -1
            java.lang.Object r5 = r10.get(r5)
            l7.i r5 = (l7.i) r5
            byte r5 = r5.d(r1)
            java.lang.Object r7 = r10.get(r3)
            l7.i r7 = (l7.i) r7
            byte r7 = r7.d(r1)
            if (r5 == r7) goto L_0x0080
            int r4 = r4 + 1
        L_0x0080:
            int r3 = r3 + 1
            goto L_0x0064
        L_0x0083:
            long r14 = r0.f13216V
            long r7 = (long) r8
            long r14 = r14 / r7
            long r14 = r14 + r19
            r16 = r7
            long r7 = (long) r9
            long r14 = r14 + r7
            int r3 = r4 * 2
            long r7 = (long) r3
            long r14 = r14 + r7
            r0.B(r4)
            r0.B(r2)
            r2 = r6
        L_0x0098:
            if (r2 >= r11) goto L_0x00bc
            java.lang.Object r3 = r10.get(r2)
            l7.i r3 = (l7.i) r3
            byte r3 = r3.d(r1)
            if (r2 == r6) goto L_0x00b4
            int r4 = r2 + -1
            java.lang.Object r4 = r10.get(r4)
            l7.i r4 = (l7.i) r4
            byte r4 = r4.d(r1)
            if (r3 == r4) goto L_0x00b9
        L_0x00b4:
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0.B(r3)
        L_0x00b9:
            int r2 = r2 + 1
            goto L_0x0098
        L_0x00bc:
            l7.f r9 = new l7.f
            r9.<init>()
            r7 = r6
        L_0x00c2:
            if (r7 >= r11) goto L_0x0124
            java.lang.Object r2 = r10.get(r7)
            l7.i r2 = (l7.i) r2
            byte r2 = r2.d(r1)
            int r3 = r7 + 1
            r4 = r3
        L_0x00d1:
            if (r4 >= r11) goto L_0x00e4
            java.lang.Object r5 = r10.get(r4)
            l7.i r5 = (l7.i) r5
            byte r5 = r5.d(r1)
            if (r2 == r5) goto L_0x00e1
            r8 = r4
            goto L_0x00e5
        L_0x00e1:
            int r4 = r4 + 1
            goto L_0x00d1
        L_0x00e4:
            r8 = r11
        L_0x00e5:
            if (r3 != r8) goto L_0x0106
            int r2 = r1 + 1
            java.lang.Object r3 = r10.get(r7)
            l7.i r3 = (l7.i) r3
            int r3 = r3.a()
            if (r2 != r3) goto L_0x0106
            java.lang.Object r2 = r12.get(r7)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r0.B(r2)
            r18 = r8
            r13 = r9
            goto L_0x011f
        L_0x0106:
            long r2 = r9.f13216V
            long r2 = r2 / r16
            long r2 = r2 + r14
            int r3 = (int) r2
            int r3 = r3 * -1
            r0.B(r3)
            int r5 = r1 + 1
            r2 = r14
            r4 = r9
            r6 = r23
            r18 = r8
            r13 = r9
            r9 = r26
            f(r2, r4, r5, r6, r7, r8, r9)
        L_0x011f:
            r9 = r13
            r7 = r18
            r13 = -1
            goto L_0x00c2
        L_0x0124:
            r13 = r9
            r0.y(r13)
            goto L_0x01b1
        L_0x012a:
            int r5 = r3.a()
            int r7 = r4.a()
            int r5 = java.lang.Math.min(r5, r7)
            r7 = 0
            r13 = r1
        L_0x0138:
            if (r13 >= r5) goto L_0x0149
            byte r14 = r3.d(r13)
            byte r15 = r4.d(r13)
            if (r14 != r15) goto L_0x0149
            int r7 = r7 + 1
            int r13 = r13 + 1
            goto L_0x0138
        L_0x0149:
            long r4 = r0.f13216V
            long r13 = (long) r8
            long r4 = r4 / r13
            long r4 = r4 + r19
            long r8 = (long) r9
            long r4 = r4 + r8
            long r8 = (long) r7
            long r4 = r4 + r8
            r8 = 1
            long r4 = r4 + r8
            int r8 = -r7
            r0.B(r8)
            r0.B(r2)
            int r7 = r7 + r1
        L_0x015e:
            if (r1 >= r7) goto L_0x016c
            byte r2 = r3.d(r1)
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0.B(r2)
            int r1 = r1 + 1
            goto L_0x015e
        L_0x016c:
            int r1 = r6 + 1
            if (r1 != r11) goto L_0x0192
            java.lang.Object r1 = r10.get(r6)
            l7.i r1 = (l7.i) r1
            int r1 = r1.a()
            if (r7 != r1) goto L_0x018a
            java.lang.Object r1 = r12.get(r6)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.B(r1)
            goto L_0x01b1
        L_0x018a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
        L_0x0192:
            l7.f r9 = new l7.f
            r9.<init>()
            long r1 = r9.f13216V
            long r1 = r1 / r13
            long r1 = r1 + r4
            int r2 = (int) r1
            r1 = -1
            int r2 = r2 * -1
            r0.B(r2)
            r1 = r4
            r3 = r9
            r4 = r7
            r5 = r23
            r7 = r25
            r8 = r26
            f(r1, r3, r4, r5, r6, r7, r8)
            r0.y(r9)
        L_0x01b1:
            return
        L_0x01b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a.f(long, l7.f, int, java.util.ArrayList, int, int, java.util.ArrayList):void");
    }

    public static File[] f0(String str) {
        int lastIndexOf;
        int lastIndexOf2;
        int lastIndexOf3;
        int indexOf;
        Integer num;
        ArrayList arrayList = new ArrayList();
        if (str.startsWith("dexPath=")) {
            int indexOf2 = str.indexOf(44);
            if (indexOf2 == -1) {
                str = str.substring(8);
            } else {
                str = str.substring(8, indexOf2);
            }
        }
        for (String str2 : str.split(":")) {
            if (!(!str2.startsWith("/data/app/") || (lastIndexOf = str2.lastIndexOf(".apk")) != str2.length() - 4 || (lastIndexOf2 = str2.lastIndexOf("/", lastIndexOf)) == 9 || (lastIndexOf3 = str2.lastIndexOf("/", lastIndexOf2 - 1)) == -1 || (indexOf = str2.indexOf("-", lastIndexOf3)) == -1)) {
                String substring = str2.substring(lastIndexOf3 + 1, indexOf);
                File file = new File(C1477r.d("/data/data/", substring));
                File file2 = null;
                if (!file.isDirectory() || !file.canWrite()) {
                    file = null;
                }
                if (file == null) {
                    try {
                        num = (Integer) Class.forName("android.os.Process").getMethod("myUid", (Class[]) null).invoke((Object) null, (Object[]) null);
                    } catch (Exception unused) {
                        num = null;
                    }
                    if (num != null) {
                        File file3 = new File(String.format("/data/user/%d/%s", new Object[]{Integer.valueOf(num.intValue() / 100000), substring}));
                        if (file3.isDirectory() && file3.canWrite()) {
                            file2 = file3;
                        }
                    }
                    file = file2;
                }
                if (file != null) {
                    File file4 = new File(file, "cache");
                    if ((file4.exists() || file4.mkdir()) && file4.isDirectory() && file4.canWrite()) {
                        arrayList.add(file4);
                    }
                }
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    public static String[] f1(String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.removeAll(new ArrayList(Arrays.asList(strArr2)));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String g(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & Pdu.MANUFACTURER_DATA_PDU_TYPE);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public static boolean g0(Context context) {
        if (!y0()) {
            return true;
        }
        if (q0() && Environment.isExternalStorageManager()) {
            return true;
        }
        if (!E0() || b0(context) < 33) {
            if (j0.f.a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                return true;
            }
            return false;
        } else if (!F0() || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 34) {
            if (j0.f.a(context, "android.permission.READ_MEDIA_IMAGES") == 0 || j0.f.a(context, "android.permission.READ_MEDIA_VIDEO") == 0 || j0.f.a(context, "android.permission.READ_MEDIA_AUDIO") == 0) {
                return true;
            }
            return false;
        } else if (j0.f.a(context, "android.permission.READ_MEDIA_IMAGES") == 0 || j0.f.a(context, "android.permission.READ_MEDIA_VIDEO") == 0 || j0.f.a(context, "android.permission.READ_MEDIA_AUDIO") == 0 || j0.f.a(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int g1(int[] iArr) {
        int i = 0;
        for (int i8 : iArr) {
            i += i8;
        }
        return i;
    }

    public static void h(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static boolean h0(Context context) {
        if (!y0()) {
            return true;
        }
        if (q0() && Environment.isExternalStorageManager()) {
            return true;
        }
        if ((!q0() || u0()) && j0.f.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }

    public static final void h1(Object obj) {
        if (obj instanceof d) {
            throw ((d) obj).f713U;
        }
    }

    public static void i(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean i0(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr == null) {
                return false;
            }
            for (String equals : strArr) {
                if (equals.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            Log.d("a", "Failed to get package info due to " + e.getMessage());
        }
    }

    public static void i1(File file, File file2) {
        File file3;
        FileOutputStream fileOutputStream;
        if (new ZipInputStream(new BufferedInputStream(new FileInputStream(file))).getNextEntry() != null) {
            ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        break;
                    } else if (nextEntry.getName().equals(".delete") && !nextEntry.isDirectory()) {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(zipInputStream));
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            } else if (!readLine.trim().isEmpty()) {
                                x(new File(file2, readLine));
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    zipInputStream.close();
                    throw th;
                }
            }
            zipInputStream.close();
            ZipInputStream zipInputStream2 = new ZipInputStream(new BufferedInputStream(new FileInputStream(file)));
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    ZipEntry nextEntry2 = zipInputStream2.getNextEntry();
                    if (nextEntry2 != null) {
                        File file4 = new File(file2, nextEntry2.getName());
                        if (!file4.getCanonicalPath().startsWith(file2.getCanonicalPath())) {
                            Log.w("a", "Skipping malicious ZIP entry " + nextEntry2.getName());
                        } else {
                            if (nextEntry2.isDirectory()) {
                                file3 = file4;
                            } else {
                                file3 = file4.getParentFile();
                            }
                            if (!file3.isDirectory()) {
                                if (!file3.mkdirs()) {
                                    throw new FileNotFoundException("Failed to create directory: " + file3.getAbsolutePath());
                                }
                            }
                            if (!nextEntry2.isDirectory()) {
                                if (!nextEntry2.getName().equals(".delete")) {
                                    if (nextEntry2.getSize() == 0) {
                                        file4.delete();
                                    } else {
                                        fileOutputStream = new FileOutputStream(file4);
                                        while (true) {
                                            int read = zipInputStream2.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, read);
                                        }
                                        fileOutputStream.close();
                                    }
                                }
                            }
                        }
                    } else {
                        zipInputStream2.close();
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                zipInputStream = zipInputStream2;
                zipInputStream.close();
                throw th;
            }
        } else {
            throw new Exception("File " + file.getAbsolutePath() + " is likely not a valid ZIP file");
        }
    }

    public static void j(String str, int i, int i8, int i9) {
        if (i < i8) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i8 + ", " + i9 + "] (too low)");
        } else if (i > i9) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i8 + ", " + i9 + "] (too high)");
        }
    }

    public static String j0(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes());
            return g(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String j1(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void k(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static byte[] k0(String str) {
        String upperCase = str.replace(" ", "").toUpperCase();
        if (upperCase.length() % 2 != 0) {
            upperCase = "0".concat(upperCase);
        }
        int length = upperCase.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) (Character.digit(upperCase.charAt(i + 1), 16) + (Character.digit(upperCase.charAt(i), 16) << 4));
        }
        return bArr;
    }

    public static String k1(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replaceAll("\n", "%0A").replaceAll("\r", "%0D");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void l0(String str) {
        f.e(str, "msg");
        Log.i("a", str);
    }

    public static boolean l1(String str, String str2) {
        try {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            byte[] decode = Base64.decode(str2, 0);
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuOh3bAk4u/tjiCIAL70Rei6c+pBso28SYfaSWVQuuX1MSPAjUzuDboX9THO1V47YzGW1n/4LOXw3zRteAGhoXOQhcVt5pMw+Rl1MSqQ3bJGBWi3p7078FdjoRj/5CBzCjrcp5npyMbj3wbaD3jGAwrggShHn1cP1kkcC2dt3cNALh+ekSW1m1MCq7Prq9mRB5WFeqShWmQQ+q8p/dGVKT/jzIPkE4IYqKD/yPJ91CQYL2XEsMHZ900qvN/wpexYcLzFh3IughNglo7hnm733CqfMtAIR0Ny2oE/hOMZCco8s/Fof4mCugBRrelVH7q/vRShzo6GWDtADT8QT/5k2iwIDAQAB", 0)));
            Signature instance = Signature.getInstance("SHA256withRSA");
            instance.initVerify(generatePublic);
            instance.update(bytes);
            return instance.verify(decode);
        } catch (Exception e) {
            e.printStackTrace();
            Log.e("a", "Exception verifying signature");
            return false;
        }
    }

    public static void m(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static String m0(String str) {
        try {
            URL url = new URL(str);
            StringBuilder sb = new StringBuilder();
            sb.append(url.getProtocol());
            sb.append("://");
            if (url.getUserInfo() != null) {
                sb.append(url.getUserInfo());
                sb.append("@");
            }
            sb.append(IDN.toASCII(url.getHost()));
            if (url.getPort() != -1) {
                sb.append(":");
                sb.append(url.getPort());
            }
            if (url.getPath() != null) {
                sb.append(url.getPath());
            }
            if (url.getQuery() != null) {
                sb.append("?");
                sb.append(url.getQuery());
            }
            if (url.getRef() != null) {
                sb.append("#");
                sb.append(url.getRef());
            }
            return sb.toString();
        } catch (Exception e) {
            g.x(e, g.s("Failed to idnToAcsii for URL ", str, " due to "), "a");
            return str;
        }
    }

    public static void m1(String str) {
        f.e(str, "msg");
        Log.w("a", str);
    }

    public static int n(int i, int i8) {
        boolean z;
        long j7 = ((long) i) + ((long) i8);
        int i9 = (int) j7;
        if (j7 == ((long) i9)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return i9;
        }
        throw new ArithmeticException(N.e.v("overflow: checkedAdd(", i, ", ", i8, ")"));
    }

    public static String n0(String str) {
        try {
            URL url = new URL(str);
            StringBuilder sb = new StringBuilder();
            sb.append(url.getProtocol());
            sb.append("://");
            if (url.getUserInfo() != null) {
                sb.append(url.getUserInfo());
                sb.append("@");
            }
            sb.append(IDN.toUnicode(url.getHost()));
            if (url.getPort() != -1) {
                sb.append(":");
                sb.append(url.getPort());
            }
            if (url.getPath() != null) {
                sb.append(url.getPath());
            }
            if (url.getQuery() != null) {
                sb.append("?");
                sb.append(url.getQuery());
            }
            if (url.getRef() != null) {
                sb.append("#");
                sb.append(url.getRef());
            }
            return sb.toString();
        } catch (Exception e) {
            g.x(e, g.s("Failed to idnToUnicode for URL ", str, " due to "), "a");
            return str;
        }
    }

    public static void n1(String str, Throwable th) {
        f.e(str, "msg");
        Log.w("a", str, th);
    }

    public static int o(int i, int i8, int i9) {
        if (i < i8) {
            return i8;
        }
        if (i > i9) {
            return i9;
        }
        return i;
    }

    public static String o0(Intent intent) {
        try {
            String uri = intent.toUri(1);
            if (intent.getAction() == null || !intent.getAction().equals("android.intent.action.VIEW")) {
                return uri;
            }
            return uri.replaceAll(";end$", ";action=android.intent.action.VIEW;end");
        } catch (Exception e) {
            g.z(e, new StringBuilder("Failed to get Intent URL due to "), "a");
            return "intent://failed_to_get";
        }
    }

    public static int p(float f8, Context context) {
        return Math.round((((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f) * f8);
    }

    public static boolean p0() {
        if (Build.VERSION.SDK_INT >= 29) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        g7.l.c(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void p1(java.io.File r2, java.lang.String r3) {
        /*
            java.nio.charset.Charset r0 = W6.a.f6191a
            java.lang.String r1 = "text"
            P6.f.e(r3, r1)
            java.lang.String r1 = "charset"
            P6.f.e(r0, r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            q1(r1, r3, r0)     // Catch:{ all -> 0x0019 }
            r2 = 0
            g7.l.c(r1, r2)
            return
        L_0x0019:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001b }
        L_0x001b:
            r3 = move-exception
            g7.l.c(r1, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a.p1(java.io.File, java.lang.String):void");
    }

    public static void q(Window window, Window window2) {
        window2.setFlags(window.getAttributes().flags, 208273536);
        window2.setStatusBarColor(window.getStatusBarColor());
        window2.setNavigationBarColor(window.getNavigationBarColor());
    }

    public static boolean q0() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    public static final void q1(FileOutputStream fileOutputStream, String str, Charset charset) {
        boolean z;
        f.e(str, "text");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            f.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        f.b(onUnmappableCharacter);
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) ((float) Math.ceil((double) onUnmappableCharacter.maxBytesPerChar()))));
        f.d(allocate2, "allocate(...)");
        int i = 0;
        int i8 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i8, str.length() - i);
            int i9 = i + min;
            char[] array = allocate.array();
            f.d(array, "array(...)");
            str.getChars(i, i9, array, i8);
            allocate.limit(min + i8);
            i8 = 1;
            if (i9 == str.length()) {
                z = true;
            } else {
                z = false;
            }
            if (onUnmappableCharacter.encode(allocate, allocate2, z).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i8 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i = i9;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public static void r(Window window, Window window2) {
        q(window, window2);
        window2.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility());
    }

    public static boolean r0() {
        if (Build.VERSION.SDK_INT >= 31) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [androidx.emoji2.text.f, androidx.emoji2.text.q] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.emoji2.text.q s(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000d
            androidx.emoji2.text.b r0 = new androidx.emoji2.text.b
            r1 = 1
            r0.<init>((int) r1)
            goto L_0x0013
        L_0x000d:
            a1.a r0 = new a1.a
            r1 = 1
            r0.<init>((int) r1)
        L_0x0013:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            l(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x002c:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0048
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L_0x002c
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L_0x002c
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L_0x002c
            goto L_0x0049
        L_0x0048:
            r4 = r5
        L_0x0049:
            if (r4 != 0) goto L_0x004d
        L_0x004b:
            r1 = r5
            goto L_0x007c
        L_0x004d:
            java.lang.String r2 = r4.authority     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.String r4 = r4.packageName     // Catch:{ NameNotFoundException -> 0x0075 }
            android.content.pm.Signature[] r0 = r0.q(r1, r4)     // Catch:{ NameNotFoundException -> 0x0075 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0075 }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x0075 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0075 }
        L_0x005b:
            if (r3 >= r6) goto L_0x0069
            r7 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0075 }
            byte[] r7 = r7.toByteArray()     // Catch:{ NameNotFoundException -> 0x0075 }
            r1.add(r7)     // Catch:{ NameNotFoundException -> 0x0075 }
            int r3 = r3 + 1
            goto L_0x005b
        L_0x0069:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ NameNotFoundException -> 0x0075 }
            r0.d r1 = new r0.d     // Catch:{ NameNotFoundException -> 0x0075 }
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch:{ NameNotFoundException -> 0x0075 }
            goto L_0x007c
        L_0x0075:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L_0x004b
        L_0x007c:
            if (r1 != 0) goto L_0x007f
            goto L_0x0089
        L_0x007f:
            androidx.emoji2.text.q r5 = new androidx.emoji2.text.q
            androidx.emoji2.text.p r0 = new androidx.emoji2.text.p
            r0.<init>(r8, r1)
            r5.<init>((androidx.emoji2.text.i) r0)
        L_0x0089:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.a.s(android.content.Context):androidx.emoji2.text.q");
    }

    public static boolean s0(File file, File file2) {
        for (File parentFile = file.getParentFile(); parentFile != null; parentFile = parentFile.getParentFile()) {
            if (parentFile.equals(file2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v12, types: [B2.e, java.lang.Object] */
    public static i t(b bVar, List list, h hVar) {
        k kVar;
        k kVar2;
        Resources resources;
        int i;
        String str;
        b bVar2 = bVar;
        E2.b bVar3 = bVar2.f8970V;
        com.bumptech.glide.e eVar = bVar2.f8972X;
        Context applicationContext = eVar.getApplicationContext();
        c cVar = eVar.f8991h;
        i iVar = new i();
        Object obj = new Object();
        s0 s0Var = iVar.f9004g;
        synchronized (s0Var) {
            s0Var.f949a.add(obj);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 27) {
            iVar.i(new Object());
        }
        Resources resources2 = applicationContext.getResources();
        ArrayList f8 = iVar.f();
        E2.g gVar = bVar2.f8973Y;
        O2.a aVar = new O2.a(applicationContext, f8, bVar3, gVar);
        D d8 = new D(bVar3, new K1.i(5));
        p pVar = new p(iVar.f(), resources2.getDisplayMetrics(), bVar3, gVar);
        if (i8 < 28 || !((Map) cVar.f6955V).containsKey(com.bumptech.glide.c.class)) {
            kVar = new K2.f(pVar, 0);
            kVar2 = new C0109a(pVar, 2, gVar);
        } else {
            kVar2 = new K2.g(1);
            kVar = new K2.g(0);
        }
        Class<ByteBuffer> cls = ByteBuffer.class;
        Class<Drawable> cls2 = Drawable.class;
        O2.a aVar2 = aVar;
        Class<InputStream> cls3 = InputStream.class;
        if (i8 >= 28) {
            i = i8;
            resources = resources2;
            iVar.d("Animation", cls3, cls2, new M2.a(new A1.d(f8, 21, gVar), 1));
            iVar.d("Animation", cls, cls2, new M2.a(new A1.d(f8, 21, gVar), 0));
        } else {
            i = i8;
            resources = resources2;
        }
        M2.c cVar2 = new M2.c(applicationContext);
        C0110b bVar4 = new C0110b(gVar);
        M2.c cVar3 = cVar2;
        Class<Drawable> cls4 = cls2;
        j jVar = new j(3, (byte) 0);
        P2.c cVar4 = new P2.c(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        P2.c cVar5 = cVar4;
        j jVar2 = jVar;
        iVar.a(cls, new z(5));
        iVar.a(cls3, new A.f(29, (Object) gVar));
        Class<Bitmap> cls5 = Bitmap.class;
        iVar.d("Bitmap", cls, cls5, kVar);
        iVar.d("Bitmap", cls3, cls5, kVar2);
        ContentResolver contentResolver2 = contentResolver;
        Context context = applicationContext;
        String str2 = Build.FINGERPRINT;
        boolean equals = "robolectric".equals(str2);
        String str3 = str2;
        Class<ParcelFileDescriptor> cls6 = ParcelFileDescriptor.class;
        if (!equals) {
            str = "Animation";
            iVar.d("Bitmap", cls6, cls5, new K2.f(pVar, 1));
        } else {
            str = "Animation";
        }
        Class<AssetFileDescriptor> cls7 = AssetFileDescriptor.class;
        iVar.d("Bitmap", cls7, cls5, new D(bVar3, new K1.i(2)));
        iVar.d("Bitmap", cls6, cls5, d8);
        z zVar = z.f1999V;
        iVar.c(cls5, cls5, zVar);
        Class<AssetFileDescriptor> cls8 = cls7;
        iVar.d("Bitmap", cls5, cls5, new A(0));
        iVar.b(cls5, bVar4);
        Resources resources3 = resources;
        Class<BitmapDrawable> cls9 = BitmapDrawable.class;
        iVar.d("BitmapDrawable", cls, cls9, new C0109a(resources3, kVar));
        iVar.d("BitmapDrawable", cls3, cls9, new C0109a(resources3, kVar2));
        iVar.d("BitmapDrawable", cls6, cls9, new C0109a(resources3, d8));
        iVar.b(cls9, new A1.d(bVar3, 17, bVar4));
        O2.a aVar3 = aVar2;
        O2.i iVar2 = new O2.i(f8, aVar3, gVar);
        Class<O2.c> cls10 = O2.c.class;
        String str4 = str;
        iVar.d(str4, cls3, cls10, iVar2);
        iVar.d(str4, cls, cls10, aVar3);
        iVar.b(cls10, new K1.i(12));
        Class<A2.d> cls11 = A2.d.class;
        iVar.c(cls11, cls11, zVar);
        iVar.d("Bitmap", cls11, cls5, new C0111c(bVar3));
        Class<Uri> cls12 = Uri.class;
        M2.c cVar6 = cVar3;
        Class<Drawable> cls13 = cls4;
        iVar.d("legacy_append", cls12, cls13, cVar6);
        Class<O2.c> cls14 = cls10;
        iVar.d("legacy_append", cls12, cls5, new C0109a(cVar6, 1, bVar3));
        iVar.j(new L2.a(0));
        Class<File> cls15 = File.class;
        iVar.c(cls15, cls, new z(6));
        E2.b bVar5 = bVar3;
        iVar.c(cls15, cls3, new E2.a(1, new z(9)));
        iVar.d("legacy_append", cls15, cls15, new A(2));
        iVar.c(cls15, cls6, new E2.a(1, new z(8)));
        iVar.c(cls15, cls15, zVar);
        iVar.j(new l(gVar));
        if (!"robolectric".equals(str3)) {
            iVar.j(new L2.a(2));
        }
        Context context2 = context;
        F2.e eVar2 = new F2.e(context2, 3, false);
        Class<BitmapDrawable> cls16 = cls9;
        F2.e eVar3 = new F2.e(context2, 1, false);
        Class<Bitmap> cls17 = cls5;
        F2.e eVar4 = new F2.e(context2, 2, false);
        Class cls18 = Integer.TYPE;
        iVar.c(cls18, cls3, eVar2);
        Class<Integer> cls19 = Integer.class;
        iVar.c(cls19, cls3, eVar2);
        Class<AssetFileDescriptor> cls20 = cls8;
        iVar.c(cls18, cls20, eVar3);
        iVar.c(cls19, cls20, eVar3);
        iVar.c(cls18, cls13, eVar4);
        iVar.c(cls19, cls13, eVar4);
        String str5 = "legacy_append";
        iVar.c(cls12, cls3, new F2.e(context2, 6, false));
        iVar.c(cls12, cls20, new F2.e(context2, 5, false));
        x xVar = new x(resources3, 2);
        x xVar2 = new x(resources3, 0);
        Class<Drawable> cls21 = cls13;
        x xVar3 = new x(resources3, 1);
        iVar.c(cls19, cls12, xVar);
        iVar.c(cls18, cls12, xVar);
        iVar.c(cls19, cls20, xVar2);
        iVar.c(cls18, cls20, xVar2);
        iVar.c(cls19, cls3, xVar3);
        iVar.c(cls18, cls3, xVar3);
        Class<String> cls22 = String.class;
        iVar.c(cls22, cls3, new A.f(27));
        iVar.c(cls12, cls3, new A.f(27));
        iVar.c(cls22, cls3, new z(13));
        iVar.c(cls22, cls6, new z(12));
        iVar.c(cls22, cls20, new z(11));
        iVar.c(cls12, cls3, new C0080a(context2.getAssets(), 1));
        iVar.c(cls12, cls20, new C0080a(context2.getAssets(), 0));
        iVar.c(cls12, cls3, new F2.e(context2, 7, false));
        iVar.c(cls12, cls3, new F2.e(context2, 8, false));
        int i9 = i;
        if (i9 >= 29) {
            iVar.c(cls12, cls3, new I2.b(context2, cls3));
            iVar.c(cls12, cls6, new I2.b(context2, cls6));
        }
        ContentResolver contentResolver3 = contentResolver2;
        iVar.c(cls12, cls3, new B(contentResolver3, 2));
        iVar.c(cls12, cls6, new B(contentResolver3, 1));
        iVar.c(cls12, cls20, new B(contentResolver3, 0));
        iVar.c(cls12, cls3, new z(14));
        iVar.c(URL.class, cls3, new z3.e(28));
        iVar.c(cls12, cls15, new F2.e(context2, 4, false));
        iVar.c(H2.g.class, cls3, new P(2));
        Class<byte[]> cls23 = byte[].class;
        iVar.c(cls23, cls, new z(2));
        iVar.c(cls23, cls3, new z(4));
        iVar.c(cls12, cls12, zVar);
        Class<Drawable> cls24 = cls21;
        iVar.c(cls24, cls24, zVar);
        iVar.d(str5, cls24, cls24, new A(1));
        Class<BitmapDrawable> cls25 = cls16;
        Class<Bitmap> cls26 = cls17;
        iVar.k(cls26, cls25, new x(resources3, 3));
        j jVar3 = jVar2;
        iVar.k(cls26, cls23, jVar3);
        E2.b bVar6 = bVar5;
        P2.c cVar7 = cVar5;
        iVar.k(cls24, cls23, new q0((Object) bVar6, (Object) jVar3, (Object) cVar7, 14));
        iVar.k(cls14, cls23, cVar7);
        if (i9 >= 23) {
            D d9 = new D(bVar6, new K1.i(3));
            iVar.d("legacy_append", ByteBuffer.class, cls26, d9);
            iVar.d("legacy_append", ByteBuffer.class, cls25, new C0109a(resources3, d9));
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            if (hVar != null) {
                hVar.A();
            }
            return iVar;
        }
        throw g.k(it);
    }

    public static File u(Context context, String str, String str2) {
        String str3 = str + "_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "_";
        File file = new File(context.getCacheDir(), "uploads");
        if (!file.exists()) {
            file.mkdirs();
        }
        return File.createTempFile(str3, ".".concat(str2), file);
    }

    public static boolean u0() {
        if (!p0()) {
            return true;
        }
        if (!q0()) {
            return Environment.isExternalStorageLegacy();
        }
        if (Environment.isExternalStorageLegacy() || Environment.isExternalStorageManager()) {
            return true;
        }
        return false;
    }

    public static String v(byte[] bArr) {
        int i = 0;
        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0V4UTL1ILuJXnLSylDDSr40z/zlxMLoUXnzL9CnV7Ciz4xAzqzEjj8mE/FYLxFWdm+MDf86GUjauUR9vG0v0gmj65A/Hh4SABvLy/H+3nysQtphE2nqdvh8E043wGRqmC6B8nh8YKXyM6+tqCTI+Ywb7aWLZbgzBXQznclg4rJozDfj0CjyHjoxd4yIcRTDSdbsW6IeXdg1QcKizq5Nz0IIuHzUbEy3kWfDmV9ubjHqO1mWqw7lGzh0r5/zX7LOT/tBYD+op5HcoXHGF1jhCH6pu54T6X/kD9gDCyUven2zRm2PQtK2hHVT+sdaRVm0dVVJuvO6JLO1QiBqWh230FQIDAQAB", 0)));
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(2, generatePublic);
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length);
        while (i < bArr.length) {
            int min = Math.min(bArr.length - i, 256);
            allocate.put(instance.doFinal(bArr, i, min));
            i += min;
        }
        byte[] bArr2 = new byte[allocate.position()];
        allocate.rewind();
        allocate.get(bArr2);
        return new String(bArr2, StandardCharsets.UTF_8);
    }

    public static boolean v0(String str) {
        if (str != null) {
            try {
                if (DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(new FileInputStream(new File(str.replace("file:", ""))).getChannel()).size() == 0) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                Log.e("a", "File not found for check: ".concat(str), e);
            }
        }
        return true;
    }

    public static void w(String str) {
        if (str != null) {
            try {
                new File(str.replace("file:", "")).delete();
            } catch (Exception e) {
                Log.e("a", "File unable to delete: ".concat(str));
                e.printStackTrace();
            }
        }
    }

    public static boolean w0(Context context, File file) {
        if (file == null) {
            return false;
        }
        Iterator it = Z(context, false).iterator();
        while (it.hasNext()) {
            Y2.g gVar = (Y2.g) it.next();
            if (!gVar.f6585c) {
                File file2 = gVar.f6584b;
                if (s0(file, file2) || file.equals(file2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void x(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File x8 : listFiles) {
                x(x8);
            }
        }
        file.delete();
    }

    public static boolean x0(Context context) {
        try {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (installerPackageName == null || !installerPackageName.equals("com.android.vending")) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static float y(float f8, float f9, float f10, float f11) {
        double d8 = (double) (f8 - f10);
        double d9 = (double) (f9 - f11);
        return (float) Math.sqrt((d9 * d9) + (d8 * d8));
    }

    public static boolean y0() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    public static float z(int i, int i8, int i9, int i10) {
        double d8 = (double) (i - i9);
        double d9 = (double) (i8 - i10);
        return (float) Math.sqrt((d9 * d9) + (d8 * d8));
    }

    public static boolean z0() {
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    public abstract InputFilter[] M(InputFilter[] inputFilterArr);

    public abstract void W0(boolean z);

    public abstract void X0(boolean z);

    public abstract TransformationMethod o1(TransformationMethod transformationMethod);

    public abstract boolean t0();
}
