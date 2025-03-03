package x2;

import G5.m;
import de.ozerov.fully.F0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import n2.f;
import n2.g;
import n2.h;
import n2.i;
import n2.j;
import t2.l;
import t2.n;
import t2.o;
import t2.p;
import t2.q;
import t2.r;
import v2.C1558a;
import v2.C1559b;

/* renamed from: x2.c  reason: case insensitive filesystem */
public final class C1604c {

    /* renamed from: h  reason: collision with root package name */
    public static final Map f16257h = DesugarCollections.synchronizedMap(new HashMap());
    public static final HashMap i;

    /* renamed from: j  reason: collision with root package name */
    public static final HashMap f16258j = new HashMap();

    /* renamed from: k  reason: collision with root package name */
    public static final HashMap f16259k;

    /* renamed from: a  reason: collision with root package name */
    public final Class f16260a;

    /* renamed from: b  reason: collision with root package name */
    public final ClassLoader f16261b = C1604c.class.getClassLoader();

    /* renamed from: c  reason: collision with root package name */
    public F0 f16262c;

    /* renamed from: d  reason: collision with root package name */
    public File f16263d;
    public final Class[] e = new Class[0];

    /* renamed from: f  reason: collision with root package name */
    public final Object[] f16264f = new Object[0];

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f16265g = new ArrayList();

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        Class<Boolean> cls = Boolean.class;
        hashMap.put(Boolean.TYPE, cls);
        Class<Integer> cls2 = Integer.class;
        hashMap.put(Integer.TYPE, cls2);
        Class<Byte> cls3 = Byte.class;
        hashMap.put(Byte.TYPE, cls3);
        Class<Long> cls4 = Long.class;
        hashMap.put(Long.TYPE, cls4);
        Class<Short> cls5 = Short.class;
        hashMap.put(Short.TYPE, cls5);
        Class<Float> cls6 = Float.class;
        hashMap.put(Float.TYPE, cls6);
        Class<Double> cls7 = Double.class;
        hashMap.put(Double.TYPE, cls7);
        Class<Character> cls8 = Character.class;
        hashMap.put(Character.TYPE, cls8);
        for (Map.Entry entry : hashMap.entrySet()) {
            i a8 = i.a((Class) entry.getKey());
            i a9 = i.a((Class) entry.getValue());
            f16258j.put(a8, a9.b(a9, "valueOf", a8));
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(Boolean.TYPE, i.a(cls).b(i.f13743d, "booleanValue", new i[0]));
        hashMap2.put(Integer.TYPE, i.a(cls2).b(i.i, "intValue", new i[0]));
        hashMap2.put(Byte.TYPE, i.a(cls3).b(i.e, "byteValue", new i[0]));
        hashMap2.put(Long.TYPE, i.a(cls4).b(i.f13747j, "longValue", new i[0]));
        hashMap2.put(Short.TYPE, i.a(cls5).b(i.f13748k, "shortValue", new i[0]));
        hashMap2.put(Float.TYPE, i.a(cls6).b(i.f13746h, "floatValue", new i[0]));
        hashMap2.put(Double.TYPE, i.a(cls7).b(i.f13745g, "doubleValue", new i[0]));
        hashMap2.put(Character.TYPE, i.a(cls8).b(i.f13744f, "charValue", new i[0]));
        f16259k = hashMap2;
    }

    public C1604c(Class cls) {
        this.f16260a = cls;
    }

    public static void b(HashSet hashSet, HashSet hashSet2, Class cls) {
        for (Method method : cls.getDeclaredMethods()) {
            if ((method.getModifiers() & 16) != 0) {
                C1602a aVar = new C1602a(method);
                hashSet2.add(aVar);
                hashSet.remove(aVar);
            } else if ((method.getModifiers() & 8) == 0 && ((Modifier.isPublic(method.getModifiers()) || Modifier.isProtected(method.getModifiers())) && (!method.getName().equals("finalize") || method.getParameterTypes().length != 0))) {
                C1602a aVar2 = new C1602a(method);
                if (!hashSet2.contains(aVar2)) {
                    hashSet.add(aVar2);
                }
            }
        }
        if (cls.isInterface()) {
            for (Class b8 : cls.getInterfaces()) {
                b(hashSet, hashSet2, b8);
            }
        }
    }

    public static String c(Method method) {
        String name = method.getReturnType().getName();
        return "super$" + method.getName() + "$" + name.replace('.', '_').replace('[', '_').replace(';', '_');
    }

    public static void d(m mVar, Method method, g gVar, g gVar2) {
        m mVar2 = mVar;
        g gVar3 = gVar;
        g gVar4 = gVar2;
        i a8 = i.a(AbstractMethodError.class);
        i[] iVarArr = {i.f13751n};
        a8.getClass();
        h hVar = new h(a8, i.f13749l, "<init>", new j(iVarArr));
        mVar.i(gVar3, "'" + method + "' cannot be called");
        g[] gVarArr = {gVar3};
        if (gVar4 != null) {
            mVar.a(new q(o.f15223C1, (p) mVar2.f1717h, l.f15206W, (C1559b) mVar2.f1718j, a8.f13755c), (f) null);
            mVar.j(gVar4, true);
            String a9 = hVar.a(true);
            if (a9 != null) {
                ConcurrentHashMap concurrentHashMap = C1558a.f16000Y;
                C1558a aVar = (C1558a) concurrentHashMap.get(a9);
                if (aVar == null) {
                    C1558a b8 = C1558a.b(a9);
                    C1558a aVar2 = (C1558a) concurrentHashMap.putIfAbsent(b8.f16001U, b8);
                    if (aVar2 != null) {
                        aVar = aVar2;
                    } else {
                        aVar = b8;
                    }
                }
                mVar.g(new n(52, aVar.c(), C1559b.f16018d0), hVar, (g) null, gVar2, gVarArr);
                mVar.a(new r(o.f15322h1, (p) mVar2.f1717h, l.h(gVar2.a()), (C1559b) mVar2.f1718j), (f) null);
                return;
            }
            ConcurrentHashMap concurrentHashMap2 = C1558a.f16000Y;
            throw new NullPointerException("descriptor == null");
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARNING: type inference failed for: r14v12, types: [y2.c, t2.l] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0555  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0652  */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x07fb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a() {
        /*
            r71 = this;
            r1 = r71
            java.lang.ClassLoader r0 = r1.f16261b
            java.lang.String r4 = "descriptor == null"
            de.ozerov.fully.F0 r5 = r1.f16262c
            if (r5 == 0) goto L_0x000c
            r5 = 1
            goto L_0x000d
        L_0x000c:
            r5 = 0
        L_0x000d:
            if (r5 == 0) goto L_0x094e
            java.lang.Class[] r5 = r1.e
            int r8 = r5.length
            java.lang.Object[] r9 = r1.f16264f
            int r10 = r9.length
            if (r8 != r10) goto L_0x0019
            r8 = 1
            goto L_0x001a
        L_0x0019:
            r8 = 0
        L_0x001a:
            if (r8 == 0) goto L_0x0945
            x2.b r8 = new x2.b
            java.util.ArrayList r10 = r1.f16265g
            java.lang.Class r11 = r1.f16260a
            r8.<init>(r11, r10, r0)
            java.util.Map r12 = f16257h
            java.lang.Object r13 = r12.get(r8)
            java.lang.Class r13 = (java.lang.Class) r13
            java.lang.String r14 = "$__handler"
            if (r13 == 0) goto L_0x003b
            r2 = r1
            r0 = r5
            r19 = r9
            r21 = r11
            r18 = r14
            goto L_0x087b
        L_0x003b:
            de.ozerov.fully.K2 r13 = new de.ozerov.fully.K2
            r13.<init>()
            int r15 = r10.hashCode()
            java.lang.String r15 = java.lang.Integer.toHexString(r15)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r2 = r11.getName()
            java.lang.String r7 = "."
            java.lang.String r3 = "/"
            java.lang.String r2 = r2.replace(r7, r3)
            r6.append(r2)
            java.lang.String r2 = "_"
            r6.append(r2)
            java.lang.String r2 = "_Proxy"
            java.lang.String r2 = N.e.A(r6, r15, r2)
            java.lang.String r3 = "L"
            java.lang.String r6 = ";"
            java.lang.String r3 = N.e.y(r3, r2, r6)
            n2.i r6 = new n2.i
            java.lang.String r7 = "V"
            boolean r7 = r3.equals(r7)     // Catch:{ NullPointerException -> 0x007c }
            if (r7 == 0) goto L_0x0080
            v2.c r7 = v2.c.f16058i0     // Catch:{ NullPointerException -> 0x007c }
            goto L_0x0084
        L_0x007c:
            r2 = r1
            r1 = r4
            goto L_0x093f
        L_0x0080:
            v2.c r7 = v2.c.f(r3)
        L_0x0084:
            r6.<init>(r3, r7)
            n2.i r3 = n2.i.a(r11)
            java.lang.Class<java.lang.reflect.InvocationHandler> r7 = java.lang.reflect.InvocationHandler.class
            n2.i r15 = n2.i.a(r7)
            java.lang.Class<java.lang.reflect.Method[]> r18 = java.lang.reflect.Method[].class
            r19 = r9
            n2.i r9 = n2.i.a(r18)
            r20 = r5
            n2.e r5 = new n2.e
            r5.<init>(r6, r15, r14)
            r15 = 2
            r13.s(r5, r15)
            n2.e r5 = new n2.e
            java.lang.String r15 = "$__methodArray"
            r5.<init>(r6, r9, r15)
            r9 = 10
            r13.s(r5, r9)
            java.lang.reflect.Constructor[] r5 = r11.getDeclaredConstructors()
            int r9 = r5.length
            r22 = r8
            r21 = r11
            r11 = 0
        L_0x00ba:
            java.lang.String r8 = "static methods cannot access 'this'"
            if (r11 >= r9) goto L_0x0199
            r23 = r5[r11]
            r24 = r5
            int r5 = r23.getModifiers()
            r25 = r9
            r9 = 16
            if (r5 != r9) goto L_0x00d7
            r26 = r0
            r27 = r2
            r34 = r3
            r23 = r12
        L_0x00d4:
            r0 = 1
            goto L_0x017a
        L_0x00d7:
            java.lang.Class[] r5 = r23.getParameterTypes()
            int r9 = r5.length
            r23 = r12
            n2.i[] r12 = new n2.i[r9]
            r26 = r0
            r0 = 0
        L_0x00e3:
            int r1 = r5.length
            if (r0 >= r1) goto L_0x00f1
            r1 = r5[r0]
            n2.i r1 = n2.i.a(r1)
            r12[r0] = r1
            r1 = 1
            int r0 = r0 + r1
            goto L_0x00e3
        L_0x00f1:
            n2.h r0 = new n2.h
            n2.j r1 = new n2.j
            r1.<init>(r12)
            n2.i r5 = n2.i.f13749l
            r27 = r2
            java.lang.String r2 = "<init>"
            r0.<init>(r6, r5, r2, r1)
            G5.m r0 = r13.r(r0)
            java.lang.Object r1 = r0.e
            n2.g r1 = (n2.g) r1
            if (r1 == 0) goto L_0x0193
            G5.m.d(r1, r6)
            n2.g[] r5 = new n2.g[r9]
            r8 = 0
        L_0x0111:
            if (r8 >= r9) goto L_0x0122
            r28 = r9
            r9 = r12[r8]
            n2.g r9 = r0.e(r8, r9)
            r5[r8] = r9
            r9 = 1
            int r8 = r8 + r9
            r9 = r28
            goto L_0x0111
        L_0x0122:
            r9 = 1
            r3.getClass()
            n2.h r8 = new n2.h
            n2.j r9 = new n2.j
            r9.<init>(r12)
            n2.i r12 = n2.i.f13749l
            r8.<init>(r3, r12, r2, r9)
            r2 = 1
            java.lang.String r9 = r8.a(r2)
            if (r9 == 0) goto L_0x018b
            j$.util.concurrent.ConcurrentHashMap r2 = v2.C1558a.f16000Y
            java.lang.Object r12 = r2.get(r9)
            v2.a r12 = (v2.C1558a) r12
            if (r12 == 0) goto L_0x0144
            goto L_0x0155
        L_0x0144:
            v2.a r9 = v2.C1558a.b(r9)
            java.lang.String r12 = r9.f16001U
            java.lang.Object r2 = r2.putIfAbsent(r12, r9)
            v2.a r2 = (v2.C1558a) r2
            if (r2 == 0) goto L_0x0154
            r12 = r2
            goto L_0x0155
        L_0x0154:
            r12 = r9
        L_0x0155:
            t2.n r2 = t2.o.f15293a
            t2.n r2 = new t2.n
            v2.b r9 = r12.c()
            v2.b r12 = v2.C1559b.f16018d0
            r34 = r3
            r3 = 52
            r2.<init>(r3, r9, r12)
            r31 = 0
            r28 = r0
            r29 = r2
            r30 = r8
            r32 = r1
            r33 = r5
            r28.g(r29, r30, r31, r32, r33)
            r0.n()
            goto L_0x00d4
        L_0x017a:
            int r11 = r11 + r0
            r1 = r71
            r12 = r23
            r5 = r24
            r9 = r25
            r0 = r26
            r2 = r27
            r3 = r34
            goto L_0x00ba
        L_0x018b:
            j$.util.concurrent.ConcurrentHashMap r0 = v2.C1558a.f16000Y
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0193:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0199:
            r26 = r0
            r27 = r2
            r34 = r3
            r23 = r12
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r2 = r21
        L_0x01ad:
            if (r2 == 0) goto L_0x01b7
            b(r0, r1, r2)
            java.lang.Class r2 = r2.getSuperclass()
            goto L_0x01ad
        L_0x01b7:
            r2 = r21
        L_0x01b9:
            if (r2 == 0) goto L_0x01d0
            java.lang.Class[] r3 = r2.getInterfaces()
            int r5 = r3.length
            r9 = 0
        L_0x01c1:
            if (r9 >= r5) goto L_0x01cb
            r11 = r3[r9]
            b(r0, r1, r11)
            r11 = 1
            int r9 = r9 + r11
            goto L_0x01c1
        L_0x01cb:
            java.lang.Class r2 = r2.getSuperclass()
            goto L_0x01b9
        L_0x01d0:
            java.util.Iterator r2 = r10.iterator()
        L_0x01d4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01e4
            java.lang.Object r3 = r2.next()
            java.lang.Class r3 = (java.lang.Class) r3
            b(r0, r1, r3)
            goto L_0x01d4
        L_0x01e4:
            int r1 = r0.size()
            java.lang.reflect.Method[] r2 = new java.lang.reflect.Method[r1]
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L_0x01ef:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0204
            java.lang.Object r5 = r0.next()
            x2.a r5 = (x2.C1602a) r5
            r9 = 1
            int r11 = r3 + 1
            java.lang.reflect.Method r5 = r5.f16253d
            r2[r3] = r5
            r3 = r11
            goto L_0x01ef
        L_0x0204:
            C7.e r0 = new C7.e
            r3 = 7
            r0.<init>(r3)
            java.util.Arrays.sort(r2, r0)
            n2.i r0 = n2.i.a(r7)
            n2.i r3 = n2.i.a(r18)
            r0.getClass()
            u2.r r5 = new u2.r
            u2.t r7 = new u2.t
            r7.<init>(r14)
            u2.t r9 = new u2.t
            java.lang.String r11 = r0.f13753a
            r9.<init>(r11)
            r5.<init>(r7, r9)
            u2.h r7 = new u2.h
            u2.u r9 = r6.f13755c
            r7.<init>(r9, r5)
            r3.getClass()
            u2.r r5 = new u2.r
            u2.t r11 = new u2.t
            r11.<init>(r15)
            u2.t r12 = new u2.t
            r18 = r14
            java.lang.String r14 = r3.f13753a
            r12.<init>(r14)
            r5.<init>(r11, r12)
            u2.h r11 = new u2.h
            r11.<init>(r9, r5)
            java.lang.Class<java.lang.reflect.Method> r5 = java.lang.reflect.Method.class
            n2.i r5 = n2.i.a(r5)
            java.lang.Class<java.lang.Object[]> r9 = java.lang.Object[].class
            n2.i r9 = n2.i.a(r9)
            n2.i r12 = n2.i.f13750m
            java.lang.String r14 = "invoke"
            r25 = r10
            r24 = r15
            r15 = 3
            n2.i[] r10 = new n2.i[r15]
            r15 = 0
            r10[r15] = r12
            r15 = 1
            r10[r15] = r5
            r15 = 2
            r10[r15] = r9
            n2.h r10 = r0.b(r12, r14, r10)
            r15 = 0
        L_0x0270:
            if (r15 >= r1) goto L_0x080b
            r14 = r2[r15]
            java.lang.String r12 = r14.getName()
            r35 = r1
            java.lang.Class[] r1 = r14.getParameterTypes()
            r36 = r2
            int r2 = r1.length
            r37 = r8
            n2.i[] r8 = new n2.i[r2]
            r38 = r10
            r10 = 0
        L_0x0288:
            if (r10 >= r2) goto L_0x0297
            r28 = r1[r10]
            n2.i r28 = n2.i.a(r28)
            r8[r10] = r28
            r17 = 1
            int r10 = r10 + 1
            goto L_0x0288
        L_0x0297:
            java.lang.Class r10 = r14.getReturnType()
            r39 = r4
            n2.i r4 = n2.i.a(r10)
            r40 = r7
            n2.h r7 = r6.b(r4, r12, r8)
            java.lang.Class<java.lang.AbstractMethodError> r28 = java.lang.AbstractMethodError.class
            r41 = r2
            n2.i r2 = n2.i.a(r28)
            G5.m r7 = r13.r(r7)
            r42 = r13
            java.lang.Object r13 = r7.e
            n2.g r13 = (n2.g) r13
            if (r13 == 0) goto L_0x0803
            G5.m.d(r13, r6)
            r43 = r6
            n2.g r6 = r7.k(r0)
            r44 = r13
            n2.i r13 = n2.i.f13750m
            r45 = r6
            n2.g r6 = r7.k(r13)
            r46 = r6
            n2.i r6 = n2.i.i
            r47 = r11
            n2.g r11 = r7.k(r6)
            r48 = r11
            n2.g r11 = r7.k(r9)
            r49 = r9
            n2.g r9 = r7.k(r6)
            n2.g r13 = r7.k(r13)
            r50 = r13
            n2.g r13 = r7.k(r4)
            r51 = r13
            n2.g r13 = r7.k(r3)
            r52 = r3
            n2.g r3 = r7.k(r5)
            n2.g r6 = r7.k(r6)
            r53 = r5
            java.util.HashMap r5 = i
            java.lang.Object r5 = r5.get(r10)
            java.lang.Class r5 = (java.lang.Class) r5
            if (r5 == 0) goto L_0x0315
            n2.i r5 = n2.i.a(r5)
            n2.g r5 = r7.k(r5)
            r54 = r5
            goto L_0x0317
        L_0x0315:
            r54 = 0
        L_0x0317:
            n2.g r5 = r7.k(r0)
            r55 = r0
            int r0 = r14.getModifiers()
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x0343
            int r0 = r1.length
            n2.g[] r0 = new n2.g[r0]
            n2.g r28 = r7.k(r4)
            r29 = r0
            r0 = r34
            n2.h r12 = r0.b(r4, r12, r8)
            r57 = r1
            r56 = r2
            r58 = r4
            r1 = r12
            r4 = r28
            r2 = r29
            r12 = 0
            r59 = 0
            goto L_0x035a
        L_0x0343:
            r0 = r34
            n2.i r12 = n2.i.f13751n
            n2.g r12 = r7.k(r12)
            n2.g r28 = r7.k(r2)
            r57 = r1
            r56 = r2
            r58 = r4
            r59 = r28
            r1 = 0
            r2 = 0
            r4 = 0
        L_0x035a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r7.i(r6, r0)
            t2.q r0 = new t2.q
            r60 = r15
            n2.i r15 = r13.f13736b
            v2.c r15 = r15.f13754b
            t2.n r28 = t2.o.f15293a
            r61 = r12
            int r12 = r15.f16076V
            switch(r12) {
                case 1: goto L_0x0391;
                case 2: goto L_0x038e;
                case 3: goto L_0x038b;
                case 4: goto L_0x0388;
                case 5: goto L_0x0385;
                case 6: goto L_0x0382;
                case 7: goto L_0x037f;
                case 8: goto L_0x037c;
                case 9: goto L_0x0377;
                default: goto L_0x0372;
            }
        L_0x0372:
            t2.o.a(r15)
            r0 = 0
            throw r0
        L_0x0377:
            t2.n r12 = t2.o.f15296a2
        L_0x0379:
            r29 = r12
            goto L_0x0394
        L_0x037c:
            t2.n r12 = t2.o.f15311e2
            goto L_0x0379
        L_0x037f:
            t2.n r12 = t2.o.f15286X1
            goto L_0x0379
        L_0x0382:
            t2.n r12 = t2.o.f15283W1
            goto L_0x0379
        L_0x0385:
            t2.n r12 = t2.o.f15289Y1
            goto L_0x0379
        L_0x0388:
            t2.n r12 = t2.o.f15292Z1
            goto L_0x0379
        L_0x038b:
            t2.n r12 = t2.o.f15308d2
            goto L_0x0379
        L_0x038e:
            t2.n r12 = t2.o.f15304c2
            goto L_0x0379
        L_0x0391:
            t2.n r12 = t2.o.f15300b2
            goto L_0x0379
        L_0x0394:
            t2.l r31 = t2.l.f15206W
            java.lang.Object r12 = r7.f1718j
            r32 = r12
            v2.b r32 = (v2.C1559b) r32
            java.lang.Object r12 = r7.f1717h
            r30 = r12
            t2.p r30 = (t2.p) r30
            r28 = r0
            r33 = r47
            r28.<init>(r29, r30, r31, r32, r33)
            r12 = 0
            r7.a(r0, r12)
            r0 = 1
            r7.j(r13, r0)
            t2.r r0 = new t2.r
            n2.i r12 = r3.f13736b
            v2.c r12 = r12.f13754b
            int r15 = r12.f16076V
            switch(r15) {
                case 1: goto L_0x03d9;
                case 2: goto L_0x03d6;
                case 3: goto L_0x03d3;
                case 4: goto L_0x03d0;
                case 5: goto L_0x03cd;
                case 6: goto L_0x03ca;
                case 7: goto L_0x03c7;
                case 8: goto L_0x03c4;
                case 9: goto L_0x03c1;
                default: goto L_0x03bc;
            }
        L_0x03bc:
            t2.o.a(r12)
            r0 = 0
            throw r0
        L_0x03c1:
            t2.n r12 = t2.o.f15348o1
            goto L_0x03db
        L_0x03c4:
            t2.n r12 = t2.o.s1
            goto L_0x03db
        L_0x03c7:
            t2.n r12 = t2.o.f15337l1
            goto L_0x03db
        L_0x03ca:
            t2.n r12 = t2.o.f15333k1
            goto L_0x03db
        L_0x03cd:
            t2.n r12 = t2.o.f15341m1
            goto L_0x03db
        L_0x03d0:
            t2.n r12 = t2.o.f15345n1
            goto L_0x03db
        L_0x03d3:
            t2.n r12 = t2.o.f15356r1
            goto L_0x03db
        L_0x03d6:
            t2.n r12 = t2.o.f15353q1
            goto L_0x03db
        L_0x03d9:
            t2.n r12 = t2.o.f15350p1
        L_0x03db:
            t2.k r13 = r13.a()
            t2.k r6 = r6.a()
            t2.l r6 = t2.l.i(r13, r6)
            java.lang.Object r13 = r7.f1717h
            t2.p r13 = (t2.p) r13
            java.lang.Object r15 = r7.f1718j
            v2.b r15 = (v2.C1559b) r15
            r0.<init>(r12, r13, r6, r15)
            r6 = 0
            r7.a(r0, r6)
            r0 = 1
            r7.j(r3, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r41)
            r7.i(r9, r0)
            t2.q r0 = new t2.q
            n2.i r6 = r11.f13736b
            v2.c r12 = r6.f13754b
            r12.getClass()
            r70 = r4
            v2.c r4 = r12.e()
            int r4 = r4.f16076V
            switch(r4) {
                case 1: goto L_0x0447;
                case 2: goto L_0x0444;
                case 3: goto L_0x0441;
                case 4: goto L_0x043e;
                case 5: goto L_0x043b;
                case 6: goto L_0x0438;
                case 7: goto L_0x0435;
                case 8: goto L_0x0432;
                case 9: goto L_0x041a;
                default: goto L_0x0415;
            }
        L_0x0415:
            t2.o.a(r12)
            r0 = 0
            throw r0
        L_0x041a:
            t2.n r4 = new t2.n
            v2.b r65 = v2.C1559b.f16012X
            v2.b r66 = t2.C1422d.f15192d
            r63 = 41
            java.lang.String r69 = "new-array-object"
            r67 = 6
            r68 = 0
            r62 = r4
            r64 = r12
            r62.<init>(r63, r64, r65, r66, r67, r68, r69)
        L_0x042f:
            r29 = r4
            goto L_0x044a
        L_0x0432:
            t2.n r4 = t2.o.f15247K1
            goto L_0x042f
        L_0x0435:
            t2.n r4 = t2.o.f15229E1
            goto L_0x042f
        L_0x0438:
            t2.n r4 = t2.o.f15226D1
            goto L_0x042f
        L_0x043b:
            t2.n r4 = t2.o.f15232F1
            goto L_0x042f
        L_0x043e:
            t2.n r4 = t2.o.f15235G1
            goto L_0x042f
        L_0x0441:
            t2.n r4 = t2.o.f15244J1
            goto L_0x042f
        L_0x0444:
            t2.n r4 = t2.o.f15241I1
            goto L_0x042f
        L_0x0447:
            t2.n r4 = t2.o.f15238H1
            goto L_0x042f
        L_0x044a:
            t2.k r4 = r9.a()
            t2.l r31 = t2.l.h(r4)
            java.lang.Object r4 = r7.f1718j
            r32 = r4
            v2.b r32 = (v2.C1559b) r32
            u2.u r4 = r6.f13755c
            java.lang.Object r6 = r7.f1717h
            r30 = r6
            t2.p r30 = (t2.p) r30
            r28 = r0
            r33 = r4
            r28.<init>(r29, r30, r31, r32, r33)
            r4 = 0
            r7.a(r0, r4)
            r0 = 1
            r7.j(r11, r0)
            t2.q r0 = new t2.q
            r4 = r45
            n2.i r6 = r4.f13736b
            v2.c r9 = r6.f13754b
            int r12 = r9.f16076V
            switch(r12) {
                case 1: goto L_0x049b;
                case 2: goto L_0x0498;
                case 3: goto L_0x0495;
                case 4: goto L_0x0492;
                case 5: goto L_0x048f;
                case 6: goto L_0x048c;
                case 7: goto L_0x0489;
                case 8: goto L_0x0486;
                case 9: goto L_0x0481;
                default: goto L_0x047c;
            }
        L_0x047c:
            t2.o.a(r9)
            r0 = 0
            throw r0
        L_0x0481:
            t2.n r9 = t2.o.f15268R1
        L_0x0483:
            r29 = r9
            goto L_0x049e
        L_0x0486:
            t2.n r9 = t2.o.f15280V1
            goto L_0x0483
        L_0x0489:
            t2.n r9 = t2.o.f15259O1
            goto L_0x0483
        L_0x048c:
            t2.n r9 = t2.o.f15256N1
            goto L_0x0483
        L_0x048f:
            t2.n r9 = t2.o.f15262P1
            goto L_0x0483
        L_0x0492:
            t2.n r9 = t2.o.f15265Q1
            goto L_0x0483
        L_0x0495:
            t2.n r9 = t2.o.f15277U1
            goto L_0x0483
        L_0x0498:
            t2.n r9 = t2.o.f15274T1
            goto L_0x0483
        L_0x049b:
            t2.n r9 = t2.o.f15271S1
            goto L_0x0483
        L_0x049e:
            t2.k r9 = r44.a()
            t2.l r31 = t2.l.h(r9)
            java.lang.Object r9 = r7.f1718j
            r32 = r9
            v2.b r32 = (v2.C1559b) r32
            java.lang.Object r9 = r7.f1717h
            r30 = r9
            t2.p r30 = (t2.p) r30
            r28 = r0
            r33 = r40
            r28.<init>(r29, r30, r31, r32, r33)
            r9 = 0
            r7.a(r0, r9)
            r0 = 1
            r7.j(r4, r0)
            r7.i(r5, r9)
            n2.f r0 = new n2.f
            r0.<init>()
            r7.b(r0)
            n2.i r9 = r5.f13736b
            v2.c r9 = r9.f13754b
            v2.c r6 = r6.f13754b
            v2.b r6 = v2.C1559b.i(r9, r6)
            t2.n r9 = t2.o.f15215A
            t2.n r12 = t2.o.f15233G
            t2.n r28 = t2.o.f15357s
            t2.n r29 = t2.o.f15372y
            r30 = r9
            r9 = r6
            y2.c r9 = (y2.C1628c) r9
            java.lang.Object[] r9 = r9.f16371V
            int r9 = r9.length
            r45 = r1
            r1 = 1
            if (r9 == r1) goto L_0x0510
            r1 = 2
            if (r9 != r1) goto L_0x0525
            r1 = 0
            v2.c r9 = r6.b(r1)
            int r1 = r9.b()
            r9 = 1
            v2.c r28 = r6.b(r9)
            int r9 = r28.b()
            if (r1 != r9) goto L_0x0525
            r9 = 6
            if (r1 == r9) goto L_0x050d
            r9 = 9
            if (r1 != r9) goto L_0x0525
            if (r12 == 0) goto L_0x0525
            r9 = r12
            goto L_0x053b
        L_0x050d:
            r9 = r30
            goto L_0x053b
        L_0x0510:
            r1 = 0
            v2.c r9 = r6.b(r1)
            int r1 = r9.b()
            r9 = 6
            if (r1 == r9) goto L_0x0539
            r9 = 9
            if (r1 != r9) goto L_0x0525
            if (r29 == 0) goto L_0x0525
            r9 = r29
            goto L_0x053b
        L_0x0525:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "bad types: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0539:
            r9 = r28
        L_0x053b:
            t2.i r1 = new t2.i
            t2.k r5 = r5.a()
            t2.k r6 = r4.a()
            t2.l r5 = t2.l.i(r5, r6)
            r6 = 0
            r1.<init>(r9, r13, r6, r5)
            r7.a(r1, r0)
            r5 = r41
            r1 = 0
        L_0x0553:
            if (r1 >= r5) goto L_0x0636
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r9 = r48
            r7.i(r9, r6)
            r6 = r8[r1]
            n2.g r6 = r7.e(r1, r6)
            java.util.HashMap r12 = f16258j
            r41 = r5
            n2.i r5 = r6.f13736b
            java.lang.Object r5 = r12.get(r5)
            n2.h r5 = (n2.h) r5
            if (r5 != 0) goto L_0x0579
            r62 = r2
            r48 = r8
            r63 = r14
            goto L_0x05cc
        L_0x0579:
            r48 = r8
            r12 = 1
            n2.g[] r8 = new n2.g[r12]
            r16 = 0
            r8[r16] = r6
            java.lang.String r6 = r5.a(r12)
            if (r6 == 0) goto L_0x062c
            j$.util.concurrent.ConcurrentHashMap r12 = v2.C1558a.f16000Y
            java.lang.Object r28 = r12.get(r6)
            v2.a r28 = (v2.C1558a) r28
            if (r28 == 0) goto L_0x0595
            r62 = r2
            goto L_0x05aa
        L_0x0595:
            v2.a r6 = v2.C1558a.b(r6)
            r62 = r2
            java.lang.String r2 = r6.f16001U
            java.lang.Object r2 = r12.putIfAbsent(r2, r6)
            v2.a r2 = (v2.C1558a) r2
            if (r2 == 0) goto L_0x05a8
            r28 = r2
            goto L_0x05aa
        L_0x05a8:
            r28 = r6
        L_0x05aa:
            t2.n r2 = t2.o.f15293a
            t2.n r2 = new t2.n
            v2.b r6 = r28.c()
            v2.b r12 = v2.C1559b.f16018d0
            r63 = r14
            r14 = 49
            r2.<init>(r14, r6, r12)
            r32 = 0
            r28 = r7
            r29 = r2
            r30 = r5
            r31 = r50
            r33 = r8
            r28.g(r29, r30, r31, r32, r33)
            r6 = r50
        L_0x05cc:
            t2.r r2 = new t2.r
            n2.i r5 = r6.f13736b
            v2.c r5 = r5.f13754b
            t2.n r8 = t2.o.f15293a
            int r8 = r5.f16076V
            switch(r8) {
                case 1: goto L_0x05f6;
                case 2: goto L_0x05f3;
                case 3: goto L_0x05f0;
                case 4: goto L_0x05ed;
                case 5: goto L_0x05ea;
                case 6: goto L_0x05e7;
                case 7: goto L_0x05e4;
                case 8: goto L_0x05e1;
                case 9: goto L_0x05de;
                default: goto L_0x05d9;
            }
        L_0x05d9:
            t2.o.a(r5)
            r0 = 0
            throw r0
        L_0x05de:
            t2.n r5 = t2.o.f15371x1
            goto L_0x05f8
        L_0x05e1:
            t2.n r5 = t2.o.f15220B1
            goto L_0x05f8
        L_0x05e4:
            t2.n r5 = t2.o.f15363u1
            goto L_0x05f8
        L_0x05e7:
            t2.n r5 = t2.o.t1
            goto L_0x05f8
        L_0x05ea:
            t2.n r5 = t2.o.f15366v1
            goto L_0x05f8
        L_0x05ed:
            t2.n r5 = t2.o.w1
            goto L_0x05f8
        L_0x05f0:
            t2.n r5 = t2.o.f15217A1
            goto L_0x05f8
        L_0x05f3:
            t2.n r5 = t2.o.f15376z1
            goto L_0x05f8
        L_0x05f6:
            t2.n r5 = t2.o.f15374y1
        L_0x05f8:
            t2.k r6 = r6.a()
            t2.k r8 = r11.a()
            t2.k r12 = r9.a()
            t2.l r14 = new t2.l
            r28 = r9
            r9 = 3
            r14.<init>(r9)
            r9 = 0
            r14.f(r9, r6)
            r6 = 1
            r14.f(r6, r8)
            r8 = 2
            r14.f(r8, r12)
            r2.<init>(r5, r13, r14, r15)
            r5 = 0
            r7.a(r2, r5)
            int r1 = r1 + r6
            r5 = r41
            r8 = r48
            r2 = r62
            r14 = r63
            r48 = r28
            goto L_0x0553
        L_0x062c:
            j$.util.concurrent.ConcurrentHashMap r0 = v2.C1558a.f16000Y
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r39
            r0.<init>(r1)
            throw r0
        L_0x0636:
            r62 = r2
            r48 = r8
            r63 = r14
            r1 = r39
            r2 = 3
            r6 = 1
            n2.g[] r5 = new n2.g[r2]
            r8 = 0
            r5[r8] = r44
            r5[r6] = r3
            r3 = 2
            r5[r3] = r11
            r8 = r38
            java.lang.String r9 = r8.a(r6)
            if (r9 == 0) goto L_0x07fb
            j$.util.concurrent.ConcurrentHashMap r6 = v2.C1558a.f16000Y
            java.lang.Object r11 = r6.get(r9)
            v2.a r11 = (v2.C1558a) r11
            if (r11 == 0) goto L_0x065d
            goto L_0x066d
        L_0x065d:
            v2.a r9 = v2.C1558a.b(r9)
            java.lang.String r11 = r9.f16001U
            java.lang.Object r11 = r6.putIfAbsent(r11, r9)
            v2.a r11 = (v2.C1558a) r11
            if (r11 == 0) goto L_0x066c
            goto L_0x066d
        L_0x066c:
            r11 = r9
        L_0x066d:
            t2.n r9 = t2.o.f15293a
            t2.n r9 = new t2.n
            v2.b r11 = r11.c()
            v2.b r12 = v2.C1559b.f16018d0
            r14 = 53
            r9.<init>(r14, r11, r12)
            r28 = r7
            r29 = r9
            r30 = r8
            r31 = r46
            r32 = r4
            r33 = r5
            r28.g(r29, r30, r31, r32, r33)
            java.util.HashMap r4 = f16259k
            boolean r5 = r4.containsKey(r10)
            if (r5 == 0) goto L_0x06e8
            r5 = r46
            r9 = r54
            r7.c(r9, r5)
            java.lang.Object r4 = r4.get(r10)
            n2.h r4 = (n2.h) r4
            r15 = 0
            n2.g[] r5 = new n2.g[r15]
            r11 = 1
            java.lang.String r14 = r4.a(r11)
            if (r14 == 0) goto L_0x06e2
            java.lang.Object r11 = r6.get(r14)
            v2.a r11 = (v2.C1558a) r11
            if (r11 == 0) goto L_0x06b3
            goto L_0x06c2
        L_0x06b3:
            v2.a r11 = v2.C1558a.b(r14)
            java.lang.String r14 = r11.f16001U
            java.lang.Object r6 = r6.putIfAbsent(r14, r11)
            v2.a r6 = (v2.C1558a) r6
            if (r6 == 0) goto L_0x06c2
            r11 = r6
        L_0x06c2:
            t2.n r6 = new t2.n
            v2.b r11 = r11.c()
            r14 = 50
            r6.<init>(r14, r11, r12)
            r28 = r7
            r29 = r6
            r30 = r4
            r31 = r51
            r32 = r9
            r33 = r5
            r28.g(r29, r30, r31, r32, r33)
            r4 = r51
            r7.m(r4)
            goto L_0x06ff
        L_0x06e2:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x06e8:
            r5 = r46
            r4 = r51
            r15 = 0
            java.lang.Class r6 = java.lang.Void.TYPE
            boolean r6 = r6.equals(r10)
            if (r6 == 0) goto L_0x06f9
            r7.n()
            goto L_0x06ff
        L_0x06f9:
            r7.c(r4, r5)
            r7.m(r4)
        L_0x06ff:
            r7.b(r0)
            boolean r4 = r0.f13731c
            if (r4 != 0) goto L_0x07f3
            r4 = 1
            r0.f13731c = r4
            java.lang.Object r4 = r7.f1711a
            n2.f r4 = (n2.f) r4
            if (r4 == 0) goto L_0x071f
            r7.b(r0)
            t2.i r4 = new t2.i
            t2.n r5 = t2.o.f15354r
            t2.l r6 = t2.l.f15206W
            r9 = 0
            r4.<init>(r5, r13, r9, r6)
            r7.a(r4, r0)
        L_0x071f:
            r7.f1711a = r0
            int r0 = r63.getModifiers()
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L_0x075d
            r4 = r62
            r0 = 0
        L_0x072c:
            int r5 = r4.length
            if (r0 >= r5) goto L_0x073a
            r5 = r48[r0]
            n2.g r5 = r7.e(r0, r5)
            r4[r0] = r5
            r5 = 1
            int r0 = r0 + r5
            goto L_0x072c
        L_0x073a:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0750
            r13 = r44
            r12 = r45
            r0 = 0
            r7.h(r12, r0, r13, r4)
            r7.n()
        L_0x074d:
            r0 = r63
            goto L_0x0768
        L_0x0750:
            r13 = r44
            r12 = r45
            r0 = r70
            r7.h(r12, r0, r13, r4)
            r7.m(r0)
            goto L_0x074d
        L_0x075d:
            r12 = r45
            r5 = r59
            r4 = r61
            r0 = r63
            d(r7, r0, r4, r5)
        L_0x0768:
            java.lang.String r4 = c(r0)
            r5 = r43
            r6 = r48
            r7 = r58
            n2.h r4 = r5.b(r7, r4, r6)
            r9 = r42
            G5.m r4 = r9.r(r4)
            int r11 = r0.getModifiers()
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 != 0) goto L_0x07c7
            java.lang.Object r0 = r4.e
            n2.g r0 = (n2.g) r0
            if (r0 == 0) goto L_0x07bf
            G5.m.d(r0, r5)
            r11 = r57
            int r11 = r11.length
            n2.g[] r13 = new n2.g[r11]
            r14 = 0
        L_0x0793:
            if (r14 >= r11) goto L_0x07a1
            r2 = r6[r14]
            n2.g r2 = r4.e(r14, r2)
            r13[r14] = r2
            r2 = 1
            int r14 = r14 + r2
            r2 = 3
            goto L_0x0793
        L_0x07a1:
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x07b1
            r2 = 0
            r4.h(r12, r2, r0, r13)
            r4.n()
            goto L_0x07bb
        L_0x07b1:
            n2.g r2 = r4.k(r7)
            r4.h(r12, r2, r0, r13)
            r4.m(r2)
        L_0x07bb:
            r2 = r37
        L_0x07bd:
            r0 = 1
            goto L_0x07d9
        L_0x07bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r2 = r37
            r0.<init>(r2)
            throw r0
        L_0x07c7:
            r2 = r37
            n2.i r6 = n2.i.f13751n
            n2.g r6 = r4.k(r6)
            r7 = r56
            n2.g r7 = r4.k(r7)
            d(r4, r0, r6, r7)
            goto L_0x07bd
        L_0x07d9:
            int r4 = r60 + 1
            r15 = r4
            r6 = r5
            r10 = r8
            r13 = r9
            r7 = r40
            r11 = r47
            r9 = r49
            r3 = r52
            r5 = r53
            r0 = r55
            r4 = r1
            r8 = r2
            r1 = r35
            r2 = r36
            goto L_0x0270
        L_0x07f3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already marked"
            r0.<init>(r1)
            throw r0
        L_0x07fb:
            j$.util.concurrent.ConcurrentHashMap r0 = v2.C1558a.f16000Y
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0803:
            r2 = r37
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x080b:
            r36 = r2
            r5 = r6
            r9 = r13
            r15 = 0
            java.lang.String r0 = ".generated"
            r1 = r27
            java.lang.String r0 = N.e.x(r1, r0)
            int r2 = r25.size()
            n2.i[] r2 = new n2.i[r2]
            java.util.Iterator r3 = r25.iterator()
            r6 = 0
        L_0x0823:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x083a
            java.lang.Object r4 = r3.next()
            java.lang.Class r4 = (java.lang.Class) r4
            r7 = 1
            int r8 = r6 + 1
            n2.i r4 = n2.i.a(r4)
            r2[r6] = r4
            r6 = r8
            goto L_0x0823
        L_0x083a:
            r7 = 1
            n2.d r3 = r9.C(r5)
            boolean r4 = r3.f13720b
            if (r4 != 0) goto L_0x0929
            r3.f13720b = r7
            r3.f13721c = r7
            r4 = r34
            r3.f13722d = r4
            r3.e = r0
            n2.j r0 = new n2.j
            r0.<init>(r2)
            r3.f13723f = r0
            r2 = r71
            java.io.File r0 = r2.f16263d
            r3 = r26
            java.lang.ClassLoader r0 = r9.v(r3, r0)
            java.lang.Class r13 = r0.loadClass(r1)     // Catch:{ IllegalAccessError -> 0x0911, ClassNotFoundException -> 0x0909 }
            r0 = r24
            java.lang.reflect.Field r0 = r13.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x08fb, IllegalAccessException -> 0x08f9 }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ NoSuchFieldException -> 0x08fb, IllegalAccessException -> 0x08f9 }
            r1 = r36
            r3 = 0
            r0.set(r3, r1)     // Catch:{ NoSuchFieldException -> 0x08fb, IllegalAccessException -> 0x08f9 }
            r0 = r22
            r1 = r23
            r1.put(r0, r13)
            r0 = r20
        L_0x087b:
            java.lang.reflect.Constructor r0 = r13.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x08d5 }
            r1 = r19
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ InstantiationException -> 0x08cd, IllegalAccessException -> 0x08c5, InvocationTargetException -> 0x08ab }
            de.ozerov.fully.F0 r1 = r2.f16262c
            java.lang.Class r3 = r0.getClass()     // Catch:{ NoSuchFieldException -> 0x089b, IllegalAccessException -> 0x0899 }
            r4 = r18
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x089b, IllegalAccessException -> 0x0899 }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x089b, IllegalAccessException -> 0x0899 }
            r3.set(r0, r1)     // Catch:{ NoSuchFieldException -> 0x089b, IllegalAccessException -> 0x0899 }
            return r0
        L_0x0899:
            r0 = move-exception
            goto L_0x089d
        L_0x089b:
            r0 = move-exception
            goto L_0x08a3
        L_0x089d:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x08a3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Not a valid proxy instance"
            r1.<init>(r3, r0)
            throw r1
        L_0x08ab:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r0 = r1.getCause()
            boolean r1 = r0 instanceof java.lang.Error
            if (r1 != 0) goto L_0x08c2
            boolean r1 = r0 instanceof java.lang.RuntimeException
            if (r1 == 0) goto L_0x08bc
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L_0x08bc:
            java.lang.reflect.UndeclaredThrowableException r1 = new java.lang.reflect.UndeclaredThrowableException
            r1.<init>(r0)
            throw r1
        L_0x08c2:
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L_0x08c5:
            r0 = move-exception
            r1 = r0
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x08cd:
            r0 = move-exception
            r1 = r0
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x08d5:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No constructor for "
            r3.<init>(r4)
            java.lang.String r4 = r21.getName()
            r3.append(r4)
            java.lang.String r4 = " with parameter types "
            r3.append(r4)
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L_0x08f9:
            r0 = move-exception
            goto L_0x08fd
        L_0x08fb:
            r0 = move-exception
            goto L_0x0903
        L_0x08fd:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x0903:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x0909:
            r0 = move-exception
            r1 = r0
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0911:
            r0 = move-exception
            r1 = r0
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "cannot proxy inaccessible class "
            r3.<init>(r4)
            r4 = r21
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3, r1)
            throw r0
        L_0x0929:
            r2 = r71
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "already declared: "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x093f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0945:
            r2 = r1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "constructorArgValues.length != constructorArgTypes.length"
            r0.<init>(r1)
            throw r0
        L_0x094e:
            r2 = r1
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "handler == null"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.C1604c.a():java.lang.Object");
    }
}
