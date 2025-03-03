package B;

import A.g;
import A1.d;
import a0.m;
import android.app.Service;
import android.os.Handler;
import android.util.SparseArray;
import de.ozerov.fully.K2;
import java.util.concurrent.Executor;
import n2.a;
import u.C1441A;
import u.C1468i;

/* renamed from: B.v  reason: case insensitive filesystem */
public final class C0020v {

    /* renamed from: l  reason: collision with root package name */
    public static final Object f325l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public static final SparseArray f326m = new SparseArray();

    /* renamed from: a  reason: collision with root package name */
    public final d f327a = new d(5);

    /* renamed from: b  reason: collision with root package name */
    public final Object f328b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final C0021w f329c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f330d;
    public final Handler e;

    /* renamed from: f  reason: collision with root package name */
    public C1468i f331f;

    /* renamed from: g  reason: collision with root package name */
    public K2 f332g;

    /* renamed from: h  reason: collision with root package name */
    public C1441A f333h;
    public final i0 i;

    /* renamed from: j  reason: collision with root package name */
    public final m f334j;

    /* renamed from: k  reason: collision with root package name */
    public int f335k = 1;

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e4, code lost:
        r0 = r1;
        r1 = r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0020v(android.app.Service r9) {
        /*
            r8 = this;
            r8.<init>()
            A1.d r0 = new A1.d
            r1 = 5
            r0.<init>((int) r1)
            r8.f327a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r8.f328b = r0
            r0 = 1
            r8.f335k = r0
            java.lang.String r1 = "CameraX"
            android.content.Context r2 = com.bumptech.glide.d.h(r9)
        L_0x001b:
            boolean r3 = r2 instanceof android.content.ContextWrapper
            r4 = 0
            if (r3 == 0) goto L_0x002e
            boolean r3 = r2 instanceof android.app.Application
            if (r3 == 0) goto L_0x0027
            android.app.Application r2 = (android.app.Application) r2
            goto L_0x002e
        L_0x0027:
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            goto L_0x001b
        L_0x002e:
            r2 = 640(0x280, float:8.97E-43)
            android.content.Context r3 = com.bumptech.glide.d.h(r9)     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
            android.content.pm.PackageManager r5 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
            java.lang.Class<androidx.camera.core.impl.MetadataHolderService> r7 = androidx.camera.core.impl.MetadataHolderService.class
            r6.<init>(r3, r7)     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
            android.content.pm.ServiceInfo r3 = r5.getServiceInfo(r6, r2)     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
            android.os.Bundle r3 = r3.metaData     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
            if (r3 == 0) goto L_0x005c
            java.lang.String r5 = "androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER"
            java.lang.String r3 = r3.getString(r5)     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
            goto L_0x005d
        L_0x004e:
            r3 = move-exception
            goto L_0x0075
        L_0x0050:
            r3 = move-exception
            goto L_0x0075
        L_0x0052:
            r3 = move-exception
            goto L_0x0075
        L_0x0054:
            r3 = move-exception
            goto L_0x0075
        L_0x0056:
            r3 = move-exception
            goto L_0x0075
        L_0x0058:
            r3 = move-exception
            goto L_0x0075
        L_0x005a:
            r3 = move-exception
            goto L_0x0075
        L_0x005c:
            r3 = r4
        L_0x005d:
            if (r3 != 0) goto L_0x0066
            java.lang.String r3 = "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'."
            F.h.l(r1, r3)     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
        L_0x0064:
            r3 = r4
            goto L_0x007b
        L_0x0066:
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
            java.lang.reflect.Constructor r3 = r3.getDeclaredConstructor(r4)     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
            androidx.camera.camera2.Camera2Config$DefaultProvider r3 = (androidx.camera.camera2.Camera2Config$DefaultProvider) r3     // Catch:{ NameNotFoundException -> 0x005a, ClassNotFoundException -> 0x0058, InstantiationException -> 0x0056, InvocationTargetException -> 0x0054, NoSuchMethodException -> 0x0052, IllegalAccessException -> 0x0050, NullPointerException -> 0x004e }
            goto L_0x007b
        L_0x0075:
            java.lang.String r5 = "Failed to retrieve default CameraXConfig.Provider from meta-data"
            F.h.m(r1, r5, r3)
            goto L_0x0064
        L_0x007b:
            if (r3 == 0) goto L_0x01ec
            B.w r1 = r3.getCameraXConfig()
            r8.f329c = r1
            D.c r3 = B.C0021w.f357e0
            D.k0 r1 = r1.f358U
            java.lang.Object r1 = r1.b0(r3)     // Catch:{ IllegalArgumentException -> 0x008c }
            goto L_0x008d
        L_0x008c:
            r1 = r4
        L_0x008d:
            D.p0 r1 = (D.p0) r1
            if (r1 == 0) goto L_0x00a5
            java.lang.String r2 = "CameraX"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "QuirkSettings from CameraXConfig: "
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            F.h.j(r2, r3)
            goto L_0x00df
        L_0x00a5:
            java.lang.String r1 = "QuirkSettingsLoader"
            android.content.pm.PackageManager r3 = r9.getPackageManager()
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x00c6 }
            java.lang.Class<D.r0> r6 = D.r0.class
            r5.<init>(r9, r6)     // Catch:{ NameNotFoundException -> 0x00c6 }
            android.content.pm.ServiceInfo r2 = r3.getServiceInfo(r5, r2)     // Catch:{ NameNotFoundException -> 0x00c6 }
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x00c6 }
            if (r2 != 0) goto L_0x00c1
            java.lang.String r2 = "No metadata in MetadataHolderService."
            F.h.I(r1, r2)     // Catch:{ NameNotFoundException -> 0x00c6 }
        L_0x00bf:
            r1 = r4
            goto L_0x00cc
        L_0x00c1:
            D.p0 r1 = D7.b.a(r9, r2)     // Catch:{ NameNotFoundException -> 0x00c6 }
            goto L_0x00cc
        L_0x00c6:
            java.lang.String r2 = "QuirkSettings$MetadataHolderService is not found."
            F.h.j(r1, r2)
            goto L_0x00bf
        L_0x00cc:
            java.lang.String r2 = "CameraX"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "QuirkSettings from app metadata: "
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            F.h.j(r2, r3)
        L_0x00df:
            if (r1 != 0) goto L_0x00f6
            D.p0 r1 = D.q0.f940b
            java.lang.String r2 = "CameraX"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "QuirkSettings by default: "
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            F.h.j(r2, r3)
        L_0x00f6:
            D.q0 r2 = D.q0.f941c
            D.f0 r2 = r2.f942a
            java.lang.Object r3 = r2.f895W
            monitor-enter(r3)
            java.lang.Object r5 = r2.f896X     // Catch:{ all -> 0x010d }
            java.util.concurrent.atomic.AtomicReference r5 = (java.util.concurrent.atomic.AtomicReference) r5     // Catch:{ all -> 0x010d }
            java.lang.Object r5 = r5.getAndSet(r1)     // Catch:{ all -> 0x010d }
            boolean r1 = j$.util.Objects.equals(r5, r1)     // Catch:{ all -> 0x010d }
            if (r1 == 0) goto L_0x0110
            monitor-exit(r3)     // Catch:{ all -> 0x010d }
            goto L_0x0141
        L_0x010d:
            r9 = move-exception
            goto L_0x01ea
        L_0x0110:
            int r1 = r2.f894V     // Catch:{ all -> 0x010d }
            int r1 = r1 + r0
            r2.f894V = r1     // Catch:{ all -> 0x010d }
            boolean r5 = r2.f893U     // Catch:{ all -> 0x010d }
            if (r5 == 0) goto L_0x011b
            monitor-exit(r3)     // Catch:{ all -> 0x010d }
            goto L_0x0141
        L_0x011b:
            r2.f893U = r0     // Catch:{ all -> 0x010d }
            java.lang.Object r0 = r2.f898Z     // Catch:{ all -> 0x010d }
            java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0     // Catch:{ all -> 0x010d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x010d }
            monitor-exit(r3)     // Catch:{ all -> 0x010d }
        L_0x0126:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0136
            java.lang.Object r3 = r0.next()
            D.E0 r3 = (D.E0) r3
            r3.a(r1)
            goto L_0x0126
        L_0x0136:
            java.lang.Object r0 = r2.f895W
            monitor-enter(r0)
            int r3 = r2.f894V     // Catch:{ all -> 0x01d7 }
            if (r3 != r1) goto L_0x01d9
            r1 = 0
            r2.f893U = r1     // Catch:{ all -> 0x01d7 }
            monitor-exit(r0)     // Catch:{ all -> 0x01d7 }
        L_0x0141:
            B.w r0 = r8.f329c
            D.c r1 = B.C0021w.f351Y
            D.k0 r0 = r0.f358U
            java.lang.Object r0 = r0.b0(r1)     // Catch:{ IllegalArgumentException -> 0x014c }
            goto L_0x014d
        L_0x014c:
            r0 = r4
        L_0x014d:
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            B.w r1 = r8.f329c
            D.c r2 = B.C0021w.f352Z
            D.k0 r1 = r1.f358U
            java.lang.Object r1 = r1.b0(r2)     // Catch:{ IllegalArgumentException -> 0x015a }
            goto L_0x015b
        L_0x015a:
            r1 = r4
        L_0x015b:
            android.os.Handler r1 = (android.os.Handler) r1
            if (r0 != 0) goto L_0x0164
            B.p r0 = new B.p
            r0.<init>()
        L_0x0164:
            r8.f330d = r0
            if (r1 != 0) goto L_0x017f
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "CameraX-scheduler"
            r2 = 10
            r0.<init>(r1, r2)
            r0.start()
            android.os.Looper r0 = r0.getLooper()
            android.os.Handler r0 = E.e.h(r0)
            r8.e = r0
            goto L_0x0181
        L_0x017f:
            r8.e = r1
        L_0x0181:
            B.w r0 = r8.f329c
            D.c r1 = B.C0021w.f353a0
            r0.getClass()
            D.K r0 = r0.x()
            D.k0 r0 = (D.C0053k0) r0
            java.lang.Object r0 = r0.o0(r1, r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            a(r0)
            B.w r0 = r8.f329c
            r0.getClass()
            D.c r1 = B.C0021w.f356d0
            D.C r2 = B.i0.f261a
            D.k0 r0 = r0.f358U
            java.lang.Object r2 = r0.b0(r1)     // Catch:{ IllegalArgumentException -> 0x01a6 }
        L_0x01a6:
            B.i0 r2 = (B.i0) r2
            j$.util.Objects.requireNonNull(r2)
            long r0 = r2.b()
            boolean r3 = r2 instanceof D.C
            if (r3 == 0) goto L_0x01c8
            D.C r2 = (D.C) r2
            int r2 = r2.f745b
            switch(r2) {
                case 0: goto L_0x01c1;
                default: goto L_0x01ba;
            }
        L_0x01ba:
            D.C r2 = new D.C
            r3 = 1
            r2.<init>(r3, r0)
            goto L_0x01ce
        L_0x01c1:
            D.C r2 = new D.C
            r3 = 0
            r2.<init>(r3, r0)
            goto L_0x01ce
        L_0x01c8:
            D.I0 r3 = new D.I0
            r3.<init>(r0, r2)
            r2 = r3
        L_0x01ce:
            r8.i = r2
            a0.m r9 = r8.b(r9)
            r8.f334j = r9
            return
        L_0x01d7:
            r9 = move-exception
            goto L_0x01e8
        L_0x01d9:
            java.lang.Object r1 = r2.f898Z     // Catch:{ all -> 0x01d7 }
            java.util.concurrent.CopyOnWriteArraySet r1 = (java.util.concurrent.CopyOnWriteArraySet) r1     // Catch:{ all -> 0x01d7 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01d7 }
            int r3 = r2.f894V     // Catch:{ all -> 0x01d7 }
            monitor-exit(r0)     // Catch:{ all -> 0x01d7 }
            r0 = r1
            r1 = r3
            goto L_0x0126
        L_0x01e8:
            monitor-exit(r0)     // Catch:{ all -> 0x01d7 }
            throw r9
        L_0x01ea:
            monitor-exit(r3)     // Catch:{ all -> 0x010d }
            throw r9
        L_0x01ec:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C0020v.<init>(android.app.Service):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Integer r6) {
        /*
            java.lang.Object r0 = f325l
            monitor-enter(r0)
            if (r6 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x0007:
            r6 = move-exception
            goto L_0x006b
        L_0x0009:
            int r1 = r6.intValue()     // Catch:{ all -> 0x0007 }
            java.lang.String r2 = "minLogLevel"
            r3 = 6
            r4 = 3
            n2.a.j(r2, r1, r4, r3)     // Catch:{ all -> 0x0007 }
            android.util.SparseArray r1 = f326m     // Catch:{ all -> 0x0007 }
            int r2 = r6.intValue()     // Catch:{ all -> 0x0007 }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0007 }
            r5 = 1
            if (r2 == 0) goto L_0x0030
            int r2 = r6.intValue()     // Catch:{ all -> 0x0007 }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0007 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0007 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0007 }
            int r5 = r5 + r2
        L_0x0030:
            int r6 = r6.intValue()     // Catch:{ all -> 0x0007 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0007 }
            r1.put(r6, r2)     // Catch:{ all -> 0x0007 }
            int r6 = r1.size()     // Catch:{ all -> 0x0007 }
            if (r6 != 0) goto L_0x0044
            F.h.f1407V = r4     // Catch:{ all -> 0x0007 }
            goto L_0x0069
        L_0x0044:
            java.lang.Object r6 = r1.get(r4)     // Catch:{ all -> 0x0007 }
            if (r6 == 0) goto L_0x004d
            F.h.f1407V = r4     // Catch:{ all -> 0x0007 }
            goto L_0x0069
        L_0x004d:
            r6 = 4
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0007 }
            if (r2 == 0) goto L_0x0057
            F.h.f1407V = r6     // Catch:{ all -> 0x0007 }
            goto L_0x0069
        L_0x0057:
            r6 = 5
            java.lang.Object r2 = r1.get(r6)     // Catch:{ all -> 0x0007 }
            if (r2 == 0) goto L_0x0061
            F.h.f1407V = r6     // Catch:{ all -> 0x0007 }
            goto L_0x0069
        L_0x0061:
            java.lang.Object r6 = r1.get(r3)     // Catch:{ all -> 0x0007 }
            if (r6 == 0) goto L_0x0069
            F.h.f1407V = r3     // Catch:{ all -> 0x0007 }
        L_0x0069:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            return
        L_0x006b:
            monitor-exit(r0)     // Catch:{ all -> 0x0007 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: B.C0020v.a(java.lang.Integer):void");
    }

    public final m b(Service service) {
        m i8;
        synchronized (this.f328b) {
            boolean z = true;
            if (this.f335k != 1) {
                z = false;
            }
            a.m("CameraX.initInternal() should only be called once per instance", z);
            this.f335k = 2;
            i8 = com.bumptech.glide.d.i(new g(this, 1, service));
        }
        return i8;
    }

    public final void c() {
        synchronized (this.f328b) {
            this.f335k = 4;
        }
    }
}
