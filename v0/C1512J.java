package v0;

import C6.d;
import C6.g;
import F6.a;
import F6.b;
import F6.c;
import O6.p;
import P6.f;
import P6.k;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;

/* renamed from: v0.J  reason: case insensitive filesystem */
public final class C1512J implements p, a, Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final a f15881U;

    /* renamed from: V  reason: collision with root package name */
    public int f15882V;

    /* renamed from: W  reason: collision with root package name */
    public /* synthetic */ Object f15883W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ View f15884X;

    public C1512J(View view, a aVar) {
        this.f15884X = view;
        this.f15881U = aVar;
        if (aVar != null && aVar.a() != c.f1592U) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    public final b a() {
        return c.f1592U;
    }

    public final void b(Object obj) {
        a aVar = this;
        while (true) {
            C1512J j7 = (C1512J) aVar;
            a aVar2 = j7.f15881U;
            f.b(aVar2);
            try {
                obj = j7.d(obj);
                if (obj == G6.a.f1741U) {
                    return;
                }
            } catch (Throwable th) {
                obj = new d(th);
            }
            j7.getClass();
            if (aVar2 instanceof C1512J) {
                aVar = aVar2;
            } else {
                aVar2.b(obj);
                return;
            }
        }
    }

    public final Object c(Object obj, Serializable serializable) {
        C1512J j7 = new C1512J(this.f15884X, (a) serializable);
        j7.f15883W = (V6.d) obj;
        return j7.d(g.f721c);
    }

    public final Object d(Object obj) {
        Object obj2;
        Object obj3 = G6.a.f1741U;
        int i = this.f15882V;
        View view = this.f15884X;
        if (i != 0) {
            Object obj4 = g.f721c;
            if (i == 1) {
                V6.d dVar = (V6.d) this.f15883W;
                n2.a.h1(obj);
                if (view instanceof ViewGroup) {
                    this.f15883W = null;
                    this.f15882V = 2;
                    dVar.getClass();
                    V6.g gVar = new V6.g(new D6.b(3, (ViewGroup) view));
                    if (!gVar.f5997V.hasNext()) {
                        obj2 = obj4;
                    } else {
                        dVar.f5994W = gVar;
                        dVar.f5992U = 2;
                        dVar.f5995X = this;
                        obj2 = obj3;
                    }
                    if (obj2 != obj3) {
                        obj2 = obj4;
                    }
                    if (obj2 == obj3) {
                        return obj3;
                    }
                }
            } else if (i == 2) {
                n2.a.h1(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj4;
        }
        n2.a.h1(obj);
        V6.d dVar2 = (V6.d) this.f15883W;
        this.f15883W = dVar2;
        this.f15882V = 1;
        dVar2.f5993V = view;
        dVar2.f5992U = 3;
        dVar2.f5995X = this;
        return obj3;
    }

    public void e() {
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.StackTraceElement] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f() {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Continuation at "
            r0.<init>(r1)
            java.lang.Class r1 = r9.getClass()
            java.lang.Class<H6.a> r2 = H6.a.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r2)
            H6.a r1 = (H6.a) r1
            r2 = 0
            if (r1 != 0) goto L_0x0018
            goto L_0x00f0
        L_0x0018:
            int r3 = r1.v()
            r4 = 1
            if (r3 > r4) goto L_0x0103
            r3 = -1
            java.lang.Class r5 = r9.getClass()     // Catch:{ Exception -> 0x0038 }
            java.lang.String r6 = "label"
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ Exception -> 0x0038 }
            r5.setAccessible(r4)     // Catch:{ Exception -> 0x0038 }
            java.lang.Object r5 = r5.get(r9)     // Catch:{ Exception -> 0x0038 }
            boolean r6 = r5 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0038 }
            if (r6 == 0) goto L_0x003a
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Exception -> 0x0038 }
            goto L_0x003b
        L_0x0038:
            goto L_0x0045
        L_0x003a:
            r5 = r2
        L_0x003b:
            if (r5 == 0) goto L_0x0042
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0038 }
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            int r5 = r5 - r4
            goto L_0x0046
        L_0x0045:
            r5 = -1
        L_0x0046:
            if (r5 >= 0) goto L_0x0049
            goto L_0x004f
        L_0x0049:
            int[] r3 = r1.l()
            r3 = r3[r5]
        L_0x004f:
            H6.b r4 = H6.c.f2206b
            H6.b r5 = H6.c.f2205a
            if (r4 != 0) goto L_0x0091
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            java.lang.String r6 = "getModule"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r2)     // Catch:{ Exception -> 0x008e }
            java.lang.Class r6 = r9.getClass()     // Catch:{ Exception -> 0x008e }
            java.lang.ClassLoader r6 = r6.getClassLoader()     // Catch:{ Exception -> 0x008e }
            java.lang.String r7 = "java.lang.Module"
            java.lang.Class r6 = r6.loadClass(r7)     // Catch:{ Exception -> 0x008e }
            java.lang.String r7 = "getDescriptor"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r2)     // Catch:{ Exception -> 0x008e }
            java.lang.Class r7 = r9.getClass()     // Catch:{ Exception -> 0x008e }
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ Exception -> 0x008e }
            java.lang.String r8 = "java.lang.module.ModuleDescriptor"
            java.lang.Class r7 = r7.loadClass(r8)     // Catch:{ Exception -> 0x008e }
            java.lang.String r8 = "name"
            java.lang.reflect.Method r7 = r7.getDeclaredMethod(r8, r2)     // Catch:{ Exception -> 0x008e }
            H6.b r8 = new H6.b     // Catch:{ Exception -> 0x008e }
            r8.<init>(r4, r6, r7)     // Catch:{ Exception -> 0x008e }
            H6.c.f2206b = r8     // Catch:{ Exception -> 0x008e }
            r4 = r8
            goto L_0x0091
        L_0x008e:
            H6.c.f2206b = r5
            r4 = r5
        L_0x0091:
            if (r4 != r5) goto L_0x0094
            goto L_0x00c3
        L_0x0094:
            java.lang.reflect.Method r5 = r4.f2202a
            if (r5 == 0) goto L_0x00a1
            java.lang.Class r6 = r9.getClass()
            java.lang.Object r5 = r5.invoke(r6, r2)
            goto L_0x00a2
        L_0x00a1:
            r5 = r2
        L_0x00a2:
            if (r5 != 0) goto L_0x00a5
            goto L_0x00c3
        L_0x00a5:
            java.lang.reflect.Method r6 = r4.f2203b
            if (r6 == 0) goto L_0x00ae
            java.lang.Object r5 = r6.invoke(r5, r2)
            goto L_0x00af
        L_0x00ae:
            r5 = r2
        L_0x00af:
            if (r5 != 0) goto L_0x00b2
            goto L_0x00c3
        L_0x00b2:
            java.lang.reflect.Method r4 = r4.f2204c
            if (r4 == 0) goto L_0x00bb
            java.lang.Object r4 = r4.invoke(r5, r2)
            goto L_0x00bc
        L_0x00bb:
            r4 = r2
        L_0x00bc:
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L_0x00c3
            r2 = r4
            java.lang.String r2 = (java.lang.String) r2
        L_0x00c3:
            if (r2 != 0) goto L_0x00ca
            java.lang.String r2 = r1.c()
            goto L_0x00e2
        L_0x00ca:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r2 = 47
            r4.append(r2)
            java.lang.String r2 = r1.c()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x00e2:
            java.lang.StackTraceElement r4 = new java.lang.StackTraceElement
            java.lang.String r5 = r1.m()
            java.lang.String r1 = r1.f()
            r4.<init>(r2, r5, r1, r3)
            r2 = r4
        L_0x00f0:
            if (r2 == 0) goto L_0x00f3
            goto L_0x00fb
        L_0x00f3:
            java.lang.Class r1 = r9.getClass()
            java.lang.String r2 = r1.getName()
        L_0x00fb:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0103:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Debug metadata version mismatch. Expected: 1, got "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ". Please update the Kotlin standard library."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1512J.f():java.lang.String");
    }

    public final String toString() {
        if (this.f15881U != null) {
            return f();
        }
        k.f3956a.getClass();
        String obj = C1512J.class.getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        f.d(obj, "renderLambdaToString(...)");
        return obj;
    }
}
