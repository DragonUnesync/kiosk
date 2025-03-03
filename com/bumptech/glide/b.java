package com.bumptech.glide;

import D2.q;
import E2.g;
import F.h;
import F2.f;
import K1.i;
import W2.m;
import Y.e;
import Z1.c;
import a1.C0410a;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import com.bumptech.glide.manager.k;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b implements ComponentCallbacks2 {

    /* renamed from: c0  reason: collision with root package name */
    public static volatile b f8967c0;

    /* renamed from: d0  reason: collision with root package name */
    public static volatile boolean f8968d0;

    /* renamed from: U  reason: collision with root package name */
    public final q f8969U;

    /* renamed from: V  reason: collision with root package name */
    public final E2.b f8970V;

    /* renamed from: W  reason: collision with root package name */
    public final f f8971W;

    /* renamed from: X  reason: collision with root package name */
    public final e f8972X;

    /* renamed from: Y  reason: collision with root package name */
    public final g f8973Y;

    /* renamed from: Z  reason: collision with root package name */
    public final k f8974Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C0410a f8975a0;

    /* renamed from: b0  reason: collision with root package name */
    public final ArrayList f8976b0 = new ArrayList();

    public b(Context context, q qVar, f fVar, E2.b bVar, g gVar, k kVar, C0410a aVar, int i, C0410a aVar2, e eVar, List list, List list2, h hVar, c cVar) {
        this.f8969U = qVar;
        this.f8970V = bVar;
        this.f8973Y = gVar;
        this.f8971W = fVar;
        this.f8974Z = kVar;
        this.f8975a0 = aVar;
        this.f8972X = new e(context, gVar, new j(this, list2, hVar), new i(17), aVar2, eVar, list, qVar, cVar, i);
    }

    /* JADX INFO: finally extract failed */
    public static b a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (f8967c0 == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                generatedAppGlideModule = GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (InstantiationException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e8);
            } catch (NoSuchMethodException e9) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e9);
            } catch (InvocationTargetException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            }
            synchronized (b.class) {
                if (f8967c0 == null) {
                    if (!f8968d0) {
                        f8968d0 = true;
                        try {
                            b(context, generatedAppGlideModule);
                            f8968d0 = false;
                        } catch (Throwable th) {
                            f8968d0 = false;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                }
            }
        }
        return f8967c0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: z3.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: E2.h} */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, G2.b] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Object, G2.b] */
    /* JADX WARNING: type inference failed for: r8v6, types: [java.lang.Object, G2.b] */
    /* JADX WARNING: type inference failed for: r12v3, types: [F2.h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5, types: [F2.f, V0.v] */
    /* JADX WARNING: type inference failed for: r12v4, types: [java.lang.Object, G2.b] */
    /* JADX WARNING: type inference failed for: r11v3, types: [Y.e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0364  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r33, com.bumptech.glide.GeneratedAppGlideModule r34) {
        /*
            r1 = 1
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            Y.e r11 = new Y.e
            r6 = 0
            r11.<init>(r6)
            D2.A r7 = new D2.A
            r7.<init>(r5)
            a1.a r10 = new a1.a
            r0 = 11
            r10.<init>((int) r0)
            android.content.Context r15 = r33.getApplicationContext()
            java.util.Collections.emptyList()
            if (r34 == 0) goto L_0x0023
            r34.v()
        L_0x0023:
            java.lang.String r0 = "Got app info metadata: "
            java.lang.String r8 = "ManifestParser"
            boolean r9 = android.util.Log.isLoggable(r8, r4)
            if (r9 == 0) goto L_0x0032
            java.lang.String r9 = "Loading Glide modules"
            android.util.Log.d(r8, r9)
        L_0x0032:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            android.content.pm.PackageManager r9 = r15.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0064 }
            java.lang.String r12 = r15.getPackageName()     // Catch:{ NameNotFoundException -> 0x0064 }
            r14 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r9 = r9.getApplicationInfo(r12, r14)     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r9 == 0) goto L_0x009c
            android.os.Bundle r12 = r9.metaData     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r12 != 0) goto L_0x004c
            goto L_0x009c
        L_0x004c:
            boolean r12 = android.util.Log.isLoggable(r8, r5)     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r12 == 0) goto L_0x0066
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0064 }
            r12.<init>(r0)     // Catch:{ NameNotFoundException -> 0x0064 }
            android.os.Bundle r0 = r9.metaData     // Catch:{ NameNotFoundException -> 0x0064 }
            r12.append(r0)     // Catch:{ NameNotFoundException -> 0x0064 }
            java.lang.String r0 = r12.toString()     // Catch:{ NameNotFoundException -> 0x0064 }
            android.util.Log.v(r8, r0)     // Catch:{ NameNotFoundException -> 0x0064 }
            goto L_0x0066
        L_0x0064:
            r0 = move-exception
            goto L_0x00a8
        L_0x0066:
            android.os.Bundle r0 = r9.metaData     // Catch:{ NameNotFoundException -> 0x0064 }
            java.util.Set r0 = r0.keySet()     // Catch:{ NameNotFoundException -> 0x0064 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ NameNotFoundException -> 0x0064 }
        L_0x0070:
            boolean r12 = r0.hasNext()     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r12 == 0) goto L_0x0090
            java.lang.Object r12 = r0.next()     // Catch:{ NameNotFoundException -> 0x0064 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ NameNotFoundException -> 0x0064 }
            java.lang.String r14 = "GlideModule"
            android.os.Bundle r5 = r9.metaData     // Catch:{ NameNotFoundException -> 0x0064 }
            java.lang.Object r5 = r5.get(r12)     // Catch:{ NameNotFoundException -> 0x0064 }
            boolean r5 = r14.equals(r5)     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r5 != 0) goto L_0x008c
            r5 = 2
            goto L_0x0070
        L_0x008c:
            N7.a.p(r12)     // Catch:{ NameNotFoundException -> 0x0064 }
            throw r6     // Catch:{ NameNotFoundException -> 0x0064 }
        L_0x0090:
            boolean r0 = android.util.Log.isLoggable(r8, r4)     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "Finished loading Glide modules"
            android.util.Log.d(r8, r0)     // Catch:{ NameNotFoundException -> 0x0064 }
            goto L_0x00b4
        L_0x009c:
            boolean r0 = android.util.Log.isLoggable(r8, r4)     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "Got null app info metadata"
            android.util.Log.d(r8, r0)     // Catch:{ NameNotFoundException -> 0x0064 }
            goto L_0x00b4
        L_0x00a8:
            r5 = 6
            boolean r5 = android.util.Log.isLoggable(r8, r5)
            if (r5 == 0) goto L_0x00b4
            java.lang.String r5 = "Failed to parse glide modules"
            android.util.Log.e(r8, r5, r0)
        L_0x00b4:
            if (r34 == 0) goto L_0x00d3
            java.util.Set r0 = r34.K()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d3
            r34.K()
            java.util.Iterator r0 = r13.iterator()
            boolean r5 = r0.hasNext()
            if (r5 != 0) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            java.lang.ClassCastException r0 = Q0.g.k(r0)
            throw r0
        L_0x00d3:
            java.lang.String r0 = "Glide"
            boolean r0 = android.util.Log.isLoggable(r0, r4)
            if (r0 == 0) goto L_0x00eb
            java.util.Iterator r0 = r13.iterator()
            boolean r5 = r0.hasNext()
            if (r5 != 0) goto L_0x00e6
            goto L_0x00eb
        L_0x00e6:
            java.lang.ClassCastException r0 = Q0.g.k(r0)
            throw r0
        L_0x00eb:
            if (r34 == 0) goto L_0x00f1
            a1.a r6 = r34.L()
        L_0x00f1:
            java.util.Iterator r0 = r13.iterator()
            boolean r5 = r0.hasNext()
            if (r5 != 0) goto L_0x0364
            if (r34 == 0) goto L_0x0100
            r34.c()
        L_0x0100:
            G2.b r0 = new G2.b
            r0.<init>()
            int r5 = G2.e.f1635W
            if (r5 != 0) goto L_0x0117
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()
            int r5 = r5.availableProcessors()
            int r5 = java.lang.Math.min(r3, r5)
            G2.e.f1635W = r5
        L_0x0117:
            int r19 = G2.e.f1635W
            java.lang.String r5 = "source"
            boolean r8 = android.text.TextUtils.isEmpty(r5)
            if (r8 != 0) goto L_0x035c
            java.util.concurrent.ThreadPoolExecutor r8 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r22 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.PriorityBlockingQueue r23 = new java.util.concurrent.PriorityBlockingQueue
            r23.<init>()
            G2.c r9 = new G2.c
            r9.<init>(r0, r5, r2)
            r20 = 0
            r17 = r8
            r18 = r19
            r24 = r9
            r17.<init>(r18, r19, r20, r22, r23, r24)
            G2.e r0 = new G2.e
            r0.<init>(r8)
            int r5 = G2.e.f1635W
            G2.b r5 = new G2.b
            r5.<init>()
            java.lang.String r8 = "disk-cache"
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x0354
            java.util.concurrent.ThreadPoolExecutor r9 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r22 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.PriorityBlockingQueue r23 = new java.util.concurrent.PriorityBlockingQueue
            r23.<init>()
            G2.c r12 = new G2.c
            r14 = 1
            r12.<init>(r5, r8, r14)
            r20 = 0
            r17 = r9
            r18 = r14
            r19 = r14
            r24 = r12
            r17.<init>(r18, r19, r20, r22, r23, r24)
            G2.e r5 = new G2.e
            r5.<init>(r9)
            int r8 = G2.e.f1635W
            if (r8 != 0) goto L_0x0181
            java.lang.Runtime r8 = java.lang.Runtime.getRuntime()
            int r8 = r8.availableProcessors()
            int r8 = java.lang.Math.min(r3, r8)
            G2.e.f1635W = r8
        L_0x0181:
            int r8 = G2.e.f1635W
            if (r8 < r3) goto L_0x0188
            r19 = 2
            goto L_0x018a
        L_0x0188:
            r19 = 1
        L_0x018a:
            G2.b r8 = new G2.b
            r8.<init>()
            java.lang.String r9 = "animation"
            boolean r12 = android.text.TextUtils.isEmpty(r9)
            if (r12 != 0) goto L_0x034c
            java.util.concurrent.ThreadPoolExecutor r12 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r22 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.PriorityBlockingQueue r23 = new java.util.concurrent.PriorityBlockingQueue
            r23.<init>()
            G2.c r14 = new G2.c
            r14.<init>(r8, r9, r1)
            r20 = 0
            r17 = r12
            r18 = r19
            r24 = r14
            r17.<init>(r18, r19, r20, r22, r23, r24)
            G2.e r8 = new G2.e
            r8.<init>(r12)
            F2.g r9 = new F2.g
            r9.<init>(r15)
            F2.h r12 = new F2.h
            r12.<init>()
            android.content.Context r14 = r9.f1523a
            android.app.ActivityManager r1 = r9.f1524b
            boolean r17 = r1.isLowRamDevice()
            if (r17 == 0) goto L_0x01ce
            r17 = 2097152(0x200000, float:2.938736E-39)
            r2 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x01d2
        L_0x01ce:
            r17 = 4194304(0x400000, float:5.877472E-39)
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x01d2:
            r12.f1529c = r2
            int r17 = r1.getMemoryClass()
            r19 = 1048576(0x100000, float:1.469368E-39)
            int r4 = r17 * r19
            boolean r17 = r1.isLowRamDevice()
            float r4 = (float) r4
            if (r17 == 0) goto L_0x01e7
            r17 = 1051260355(0x3ea8f5c3, float:0.33)
            goto L_0x01ea
        L_0x01e7:
            r17 = 1053609165(0x3ecccccd, float:0.4)
        L_0x01ea:
            float r4 = r4 * r17
            int r4 = java.lang.Math.round(r4)
            A.f r3 = r9.f1525c
            java.lang.Object r3 = r3.f17V
            android.util.DisplayMetrics r3 = (android.util.DisplayMetrics) r3
            r33 = r13
            int r13 = r3.widthPixels
            int r3 = r3.heightPixels
            int r13 = r13 * r3
            r3 = 4
            int r13 = r13 * 4
            float r3 = (float) r13
            float r9 = r9.f1526d
            float r13 = r3 * r9
            int r13 = java.lang.Math.round(r13)
            r17 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r17
            int r3 = java.lang.Math.round(r3)
            r19 = r11
            int r11 = r4 - r2
            r21 = r10
            int r10 = r3 + r13
            if (r10 > r11) goto L_0x0221
            r12.f1528b = r3
            r12.f1527a = r13
            goto L_0x0235
        L_0x0221:
            float r3 = (float) r11
            float r11 = r9 + r17
            float r3 = r3 / r11
            float r17 = r17 * r3
            int r11 = java.lang.Math.round(r17)
            r12.f1528b = r11
            float r3 = r3 * r9
            int r3 = java.lang.Math.round(r3)
            r12.f1527a = r3
        L_0x0235:
            java.lang.String r3 = "MemorySizeCalculator"
            r9 = 3
            boolean r9 = android.util.Log.isLoggable(r3, r9)
            if (r9 == 0) goto L_0x02a8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "Calculation complete, Calculated memory cache size: "
            r9.<init>(r11)
            int r11 = r12.f1528b
            r17 = r6
            r13 = r7
            long r6 = (long) r11
            java.lang.String r6 = android.text.format.Formatter.formatFileSize(r14, r6)
            r9.append(r6)
            java.lang.String r6 = ", pool size: "
            r9.append(r6)
            int r6 = r12.f1527a
            long r6 = (long) r6
            java.lang.String r6 = android.text.format.Formatter.formatFileSize(r14, r6)
            r9.append(r6)
            java.lang.String r6 = ", byte array size: "
            r9.append(r6)
            long r6 = (long) r2
            java.lang.String r2 = android.text.format.Formatter.formatFileSize(r14, r6)
            r9.append(r2)
            java.lang.String r2 = ", memory class limited? "
            r9.append(r2)
            if (r10 <= r4) goto L_0x0277
            r2 = 1
            goto L_0x0278
        L_0x0277:
            r2 = 0
        L_0x0278:
            r9.append(r2)
            java.lang.String r2 = ", max size: "
            r9.append(r2)
            long r6 = (long) r4
            java.lang.String r2 = android.text.format.Formatter.formatFileSize(r14, r6)
            r9.append(r2)
            java.lang.String r2 = ", memoryClass: "
            r9.append(r2)
            int r2 = r1.getMemoryClass()
            r9.append(r2)
            java.lang.String r2 = ", isLowMemoryDevice: "
            r9.append(r2)
            boolean r1 = r1.isLowRamDevice()
            r9.append(r1)
            java.lang.String r1 = r9.toString()
            android.util.Log.d(r3, r1)
            goto L_0x02ab
        L_0x02a8:
            r17 = r6
            r13 = r7
        L_0x02ab:
            a1.a r9 = new a1.a
            r1 = 14
            r9.<init>((int) r1)
            int r1 = r12.f1527a
            if (r1 <= 0) goto L_0x02be
            E2.h r2 = new E2.h
            long r3 = (long) r1
            r2.<init>(r3)
            r6 = r2
            goto L_0x02c6
        L_0x02be:
            z3.e r1 = new z3.e
            r2 = 22
            r1.<init>(r2)
            r6 = r1
        L_0x02c6:
            E2.g r7 = new E2.g
            int r1 = r12.f1529c
            r7.<init>(r1)
            F2.f r4 = new F2.f
            int r1 = r12.f1528b
            long r1 = (long) r1
            r4.<init>(r1)
            A.f r1 = new A.f
            r1.<init>((android.content.Context) r15)
            D2.q r3 = new D2.q
            G2.e r2 = new G2.e
            java.util.concurrent.ThreadPoolExecutor r10 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r27 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.SynchronousQueue r28 = new java.util.concurrent.SynchronousQueue
            r28.<init>()
            G2.c r11 = new G2.c
            G2.b r12 = new G2.b
            r12.<init>()
            java.lang.String r14 = "source-unlimited"
            r16 = r9
            r9 = 0
            r11.<init>(r12, r14, r9)
            long r25 = G2.e.f1634V
            r23 = 0
            r24 = 2147483647(0x7fffffff, float:NaN)
            r22 = r10
            r29 = r11
            r22.<init>(r23, r24, r25, r27, r28, r29)
            r2.<init>(r10)
            r24 = r3
            r25 = r4
            r26 = r1
            r27 = r5
            r28 = r0
            r29 = r2
            r30 = r8
            r24.<init>(r25, r26, r27, r28, r29, r30)
            java.util.List r12 = java.util.Collections.emptyList()
            Z1.c r0 = new Z1.c
            r0.<init>((D2.A) r13)
            com.bumptech.glide.manager.k r8 = new com.bumptech.glide.manager.k
            r1 = r17
            r8.<init>(r1)
            com.bumptech.glide.b r14 = new com.bumptech.glide.b
            r9 = 4
            r1 = r14
            r2 = r15
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r16
            r10 = r21
            r11 = r19
            r13 = r33
            r31 = r14
            r14 = r34
            r32 = r15
            r15 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0 = r31
            r1 = r32
            r1.registerComponentCallbacks(r0)
            f8967c0 = r0
            return
        L_0x034c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Name must be non-null and non-empty, but given: animation"
            r0.<init>(r1)
            throw r0
        L_0x0354:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Name must be non-null and non-empty, but given: disk-cache"
            r0.<init>(r1)
            throw r0
        L_0x035c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Name must be non-null and non-empty, but given: source"
            r0.<init>(r1)
            throw r0
        L_0x0364:
            java.lang.ClassCastException r0 = Q0.g.k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.b.b(android.content.Context, com.bumptech.glide.GeneratedAppGlideModule):void");
    }

    public final void c(o oVar) {
        synchronized (this.f8976b0) {
            try {
                if (this.f8976b0.contains(oVar)) {
                    this.f8976b0.remove(oVar);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        m.a();
        this.f8971W.h(0);
        this.f8970V.l();
        this.f8973Y.a();
    }

    public final void onTrimMemory(int i) {
        m.a();
        synchronized (this.f8976b0) {
            try {
                Iterator it = this.f8976b0.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).getClass();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f8971W.i(i);
        this.f8970V.k(i);
        this.f8973Y.i(i);
    }
}
