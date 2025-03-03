package E;

import I.a;
import K3.b;
import P0.r;
import P0.z;
import Q7.d;
import Q7.f;
import Q7.g;
import R0.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.manager.q;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import k0.C1131a;
import n0.C1232a;
import n0.C1233b;
import n0.C1234c;
import org.altbeacon.bluetooth.Pdu;
import y0.C1616b;
import y0.C1617c;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Handler f1287a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f1288b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1289c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f1290d;
    public static boolean e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1291f;

    /* renamed from: g  reason: collision with root package name */
    public static Method f1292g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f1293h;
    public static Field i;

    public static List a(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new b(0, iArr.length, iArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(android.content.Context r8, java.lang.String r9) {
        /*
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r8.getPackageName()
            int r0 = r8.checkPermission(r9, r0, r1)
            r3 = -1
            if (r0 != r3) goto L_0x0015
            goto L_0x008c
        L_0x0015:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r0 < r4) goto L_0x0020
            java.lang.String r9 = j0.C1112a.c(r9)
            goto L_0x0021
        L_0x0020:
            r9 = 0
        L_0x0021:
            r5 = 0
            if (r9 != 0) goto L_0x0027
        L_0x0024:
            r3 = 0
            goto L_0x008c
        L_0x0027:
            if (r2 != 0) goto L_0x0039
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L_0x008c
            int r6 = r2.length
            if (r6 > 0) goto L_0x0037
            goto L_0x008c
        L_0x0037:
            r2 = r2[r5]
        L_0x0039:
            int r3 = android.os.Process.myUid()
            java.lang.String r6 = r8.getPackageName()
            r7 = 1
            if (r3 != r1) goto L_0x007a
            boolean r3 = j$.util.Objects.equals(r6, r2)
            if (r3 == 0) goto L_0x007a
            r3 = 29
            if (r0 < r3) goto L_0x006d
            android.app.AppOpsManager r0 = j0.g.b(r8)
            int r3 = android.os.Binder.getCallingUid()
            if (r0 != 0) goto L_0x005a
            r2 = 1
            goto L_0x005e
        L_0x005a:
            int r2 = r0.checkOpNoThrow(r9, r3, r2)
        L_0x005e:
            if (r2 == 0) goto L_0x0061
            goto L_0x0087
        L_0x0061:
            java.lang.String r8 = j0.g.a(r8)
            if (r0 != 0) goto L_0x0068
            goto L_0x0086
        L_0x0068:
            int r7 = r0.checkOpNoThrow(r9, r1, r8)
            goto L_0x0086
        L_0x006d:
            if (r0 < r4) goto L_0x0086
            java.lang.Object r8 = j0.C1112a.a(r8)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r7 = j0.C1112a.b(r8, r9, r2)
            goto L_0x0086
        L_0x007a:
            if (r0 < r4) goto L_0x0086
            java.lang.Object r8 = j0.C1112a.a(r8)
            android.app.AppOpsManager r8 = (android.app.AppOpsManager) r8
            int r7 = j0.C1112a.b(r8, r9, r2)
        L_0x0086:
            r2 = r7
        L_0x0087:
            if (r2 != 0) goto L_0x008a
            goto L_0x0024
        L_0x008a:
            r8 = -2
            r3 = -2
        L_0x008c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: E.e.b(android.content.Context, java.lang.String):int");
    }

    public static int c(long j7) {
        boolean z;
        int i8 = (int) j7;
        if (((long) i8) == j7) {
            z = true;
        } else {
            z = false;
        }
        g.e(z, "Out of range: %s", j7);
        return i8;
    }

    public static void d(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        if (Build.VERSION.SDK_INT >= 23) {
            drawable.clearColorFilter();
            return;
        }
        drawable.clearColorFilter();
        if (drawable instanceof InsetDrawable) {
            d(((InsetDrawable) drawable).getDrawable());
        } else if (drawable instanceof C1233b) {
            d(((C1234c) ((C1233b) drawable)).f13560Z);
        } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
            int childCount = drawableContainerState.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                Drawable child = drawableContainerState.getChild(i8);
                if (child != null) {
                    d(child);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, Q7.f] */
    public static f e(String str) {
        ? obj = new Object();
        d dVar = new d();
        obj.f4220a = dVar;
        g.C(str, "url");
        try {
            dVar.f4197a = new A1.d(new URL(str)).j();
            return obj;
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException(N.e.y("The supplied URL, '", str, "', is malformed. Make sure it is an absolute URL, and starts with 'http://' or 'https://'. See https://jsoup.org/cookbook/extracting-data/working-with-urls"), e8);
        }
    }

    public static int f(int i8, int i9) {
        boolean z;
        if (i9 <= 1073741823) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Math.min(Math.max(i8, i9), 1073741823);
        }
        throw new IllegalArgumentException(R.e.n("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i9), 1073741823));
    }

    public static final void g(int i8, int i9) {
        if (i8 > i9) {
            throw new IndexOutOfBoundsException(N.e.v("toIndex (", i8, ") is greater than size (", i9, ")."));
        }
    }

    public static Handler h(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1131a.b(looper);
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e8) {
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e8);
            return new Handler(looper);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException(cause);
            }
        }
    }

    public static q i(int i8, int i9, int i10, int i11) {
        return new q(ImageReader.newInstance(i8, i9, i10, i11));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.ref.WeakReference} */
    /* JADX WARNING: type inference failed for: r1v5, types: [v0.G, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean j(android.view.View r4, android.view.KeyEvent r5) {
        /*
            java.util.WeakHashMap r0 = v0.C1510H.f15874a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 < r1) goto L_0x000b
            goto L_0x009e
        L_0x000b:
            java.util.ArrayList r0 = v0.C1509G.f15870d
            r0 = 2131362546(0x7f0a02f2, float:1.8344876E38)
            java.lang.Object r1 = r4.getTag(r0)
            v0.G r1 = (v0.C1509G) r1
            r3 = 0
            if (r1 != 0) goto L_0x0027
            v0.G r1 = new v0.G
            r1.<init>()
            r1.f15871a = r3
            r1.f15872b = r3
            r1.f15873c = r3
            r4.setTag(r0, r1)
        L_0x0027:
            java.lang.ref.WeakReference r4 = r1.f15873c
            if (r4 == 0) goto L_0x0032
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L_0x0032
            goto L_0x009e
        L_0x0032:
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r5)
            r1.f15873c = r4
            android.util.SparseArray r4 = r1.f15872b
            if (r4 != 0) goto L_0x0044
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r1.f15872b = r4
        L_0x0044:
            android.util.SparseArray r4 = r1.f15872b
            int r0 = r5.getAction()
            r1 = 1
            if (r0 != r1) goto L_0x0060
            int r0 = r5.getKeyCode()
            int r0 = r4.indexOfKey(r0)
            if (r0 < 0) goto L_0x0060
            java.lang.Object r3 = r4.valueAt(r0)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            r4.removeAt(r0)
        L_0x0060:
            if (r3 != 0) goto L_0x006d
            int r5 = r5.getKeyCode()
            java.lang.Object r4 = r4.get(r5)
            r3 = r4
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
        L_0x006d:
            if (r3 == 0) goto L_0x009e
            java.lang.Object r4 = r3.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x009d
            boolean r5 = r4.isAttachedToWindow()
            if (r5 == 0) goto L_0x009d
            r5 = 2131362547(0x7f0a02f3, float:1.8344878E38)
            java.lang.Object r4 = r4.getTag(r5)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x009d
            int r5 = r4.size()
            int r5 = r5 - r1
            if (r5 >= 0) goto L_0x0090
            goto L_0x009d
        L_0x0090:
            java.lang.Object r4 = r4.get(r5)
            r4.getClass()
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        L_0x009d:
            r2 = 1
        L_0x009e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E.e.j(android.view.View, android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean k(v0.C1536i r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L_0x0005
            return r1
        L_0x0005:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L_0x0010
            boolean r7 = r7.b(r10)
            return r7
        L_0x0010:
            boolean r2 = r9 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L_0x0083
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L_0x0066
            android.app.ActionBar r8 = r9.getActionBar()
            int r2 = r10.getKeyCode()
            r4 = 82
            if (r2 != r4) goto L_0x0066
            if (r8 == 0) goto L_0x0066
            boolean r2 = f1291f
            if (r2 != 0) goto L_0x004c
            java.lang.Class r2 = r8.getClass()     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r1] = r6     // Catch:{ NoSuchMethodException -> 0x004a }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x004a }
            f1292g = r2     // Catch:{ NoSuchMethodException -> 0x004a }
        L_0x004a:
            f1291f = r0
        L_0x004c:
            java.lang.reflect.Method r2 = f1292g
            if (r2 == 0) goto L_0x0063
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            r4[r1] = r10     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            java.lang.Object r8 = r2.invoke(r8, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            if (r8 != 0) goto L_0x005b
            goto L_0x0063
        L_0x005b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            boolean r1 = r8.booleanValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
        L_0x0063:
            if (r1 == 0) goto L_0x0066
            goto L_0x0082
        L_0x0066:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x006d
            goto L_0x0082
        L_0x006d:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = v0.C1510H.b(r7, r10)
            if (r8 == 0) goto L_0x0078
            goto L_0x0082
        L_0x0078:
            if (r7 == 0) goto L_0x007e
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        L_0x007e:
            boolean r0 = r10.dispatch(r9, r3, r9)
        L_0x0082:
            return r0
        L_0x0083:
            boolean r2 = r9 instanceof android.app.Dialog
            if (r2 == 0) goto L_0x00d7
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = f1293h
            if (r7 != 0) goto L_0x009c
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x009a }
            i = r7     // Catch:{ NoSuchFieldException -> 0x009a }
            r7.setAccessible(r0)     // Catch:{ NoSuchFieldException -> 0x009a }
        L_0x009a:
            f1293h = r0
        L_0x009c:
            java.lang.reflect.Field r7 = i
            if (r7 == 0) goto L_0x00a8
            java.lang.Object r7 = r7.get(r9)     // Catch:{ IllegalAccessException -> 0x00a7 }
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch:{ IllegalAccessException -> 0x00a7 }
            goto L_0x00a9
        L_0x00a7:
        L_0x00a8:
            r7 = r3
        L_0x00a9:
            if (r7 == 0) goto L_0x00b6
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto L_0x00b6
            goto L_0x00d6
        L_0x00b6:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L_0x00c1
            goto L_0x00d6
        L_0x00c1:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = v0.C1510H.b(r7, r10)
            if (r8 == 0) goto L_0x00cc
            goto L_0x00d6
        L_0x00cc:
            if (r7 == 0) goto L_0x00d2
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        L_0x00d2:
            boolean r0 = r10.dispatch(r9, r3, r9)
        L_0x00d6:
            return r0
        L_0x00d7:
            if (r8 == 0) goto L_0x00df
            boolean r8 = v0.C1510H.b(r8, r10)
            if (r8 != 0) goto L_0x00e7
        L_0x00df:
            boolean r7 = r7.b(r10)
            if (r7 == 0) goto L_0x00e6
            goto L_0x00e7
        L_0x00e6:
            r0 = 0
        L_0x00e7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E.e.k(v0.i, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static int l(byte[] bArr) {
        boolean z;
        if (bArr.length >= 4) {
            z = true;
        } else {
            z = false;
        }
        int length = bArr.length;
        if (z) {
            byte b8 = bArr[0];
            byte b9 = bArr[1];
            byte b10 = bArr[2];
            byte b11 = bArr[3];
            int i8 = (b10 & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8;
            return (b11 & Pdu.MANUFACTURER_DATA_PDU_TYPE) | i8 | (b8 << 24) | ((b9 & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16);
        }
        throw new IllegalArgumentException(R.e.n("array too small: %s < %s", Integer.valueOf(length), 4));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Y6.l m(javax.net.ssl.SSLSession r6) {
        /*
            D6.r r0 = D6.r.f1269U
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L_0x007a
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0018
        L_0x0012:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
        L_0x0018:
            if (r2 != 0) goto L_0x006e
            Y6.b r2 = Y6.g.f6619b
            Y6.g r1 = r2.c(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L_0x0066
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x005e
            Y6.x r2 = R.e.f(r2)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch:{ SSLPeerUnverifiedException -> 0x0042 }
            if (r3 == 0) goto L_0x0042
            int r4 = r3.length     // Catch:{ SSLPeerUnverifiedException -> 0x0042 }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ SSLPeerUnverifiedException -> 0x0042 }
            java.util.List r3 = Z6.b.k(r3)     // Catch:{ SSLPeerUnverifiedException -> 0x0042 }
            goto L_0x0043
        L_0x0042:
            r3 = r0
        L_0x0043:
            Y6.l r4 = new Y6.l
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L_0x0054
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.util.List r0 = Z6.b.k(r6)
        L_0x0054:
            Y6.k r6 = new Y6.k
            r5 = 0
            r6.<init>(r5, r3)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L_0x005e:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L_0x0066:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            r6.<init>(r0)
            throw r6
        L_0x006e:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        L_0x007a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: E.e.m(javax.net.ssl.SSLSession):Y6.l");
    }

    public static float n(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1617c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static l o(int i8) {
        int i9 = z.f3748a;
        Locale locale = Locale.US;
        return new l(Uri.parse("rtp://0.0.0.0:" + i8), 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 0);
    }

    public static Handler p() {
        if (f1287a != null) {
            return f1287a;
        }
        synchronized (e.class) {
            try {
                if (f1287a == null) {
                    f1287a = h(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f1287a;
    }

    public static int q(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.i(drawable);
        }
        if (!e) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", (Class[]) null);
                f1290d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e8) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e8);
            }
            e = true;
        }
        Method method = f1290d;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, (Object[]) null)).intValue();
        } catch (Exception e9) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e9);
            f1290d = null;
            return 0;
        }
    }

    public static int r(int i8, int i9, int i10, int[] iArr) {
        while (i9 < i10) {
            if (iArr[i9] == i8) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    public static float s(EdgeEffect edgeEffect, float f8, float f9) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1617c.c(edgeEffect, f8, f9);
        }
        C1616b.a(edgeEffect, f8, f9);
        return f8;
    }

    public static long t(r rVar, int i8, int i9) {
        rVar.H(i8);
        if (rVar.a() < 5) {
            return -9223372036854775807L;
        }
        int i10 = rVar.i();
        if ((8388608 & i10) != 0 || ((2096896 & i10) >> 8) != i9 || (i10 & 32) == 0 || rVar.v() < 7 || rVar.a() < 7 || (rVar.v() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        rVar.g(bArr, 0, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static int u(long j7) {
        if (j7 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j7 < -2147483648L) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        return (int) j7;
    }

    public static boolean v(Drawable drawable, int i8) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.t(drawable, i8);
        }
        if (!f1289c) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f1288b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e8) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e8);
            }
            f1289c = true;
        }
        Method method = f1288b;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i8)});
                return true;
            } catch (Exception e9) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e9);
                f1288b = null;
            }
        }
        return false;
    }

    public static void w(Drawable drawable, int i8) {
        drawable.setTint(i8);
    }

    public static int x(Context context, int i8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i8});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int[] y(Collection collection) {
        if (collection instanceof b) {
            b bVar = (b) collection;
            return Arrays.copyOfRange(bVar.f2660U, bVar.f2661V, bVar.f2662W);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            Object obj = array[i8];
            obj.getClass();
            iArr[i8] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [n0.c, android.graphics.drawable.Drawable] */
    public static Drawable z(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof C1232a)) {
            return drawable;
        }
        ? drawable2 = new Drawable();
        drawable2.f13558X = drawable2.c();
        drawable2.h(drawable);
        C1234c.a();
        return drawable2;
    }
}
