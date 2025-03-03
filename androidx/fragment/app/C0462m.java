package androidx.fragment.app;

import D6.i;
import D6.o;
import N.e;
import P6.f;
import Q0.g;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.m  reason: case insensitive filesystem */
public final class C0462m {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f8008a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8009b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f8010c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f8011d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8012f;

    public C0462m(ViewGroup viewGroup) {
        f.e(viewGroup, "container");
        this.f8008a = viewGroup;
    }

    public static final C0462m j(ViewGroup viewGroup, L l8) {
        f.e(viewGroup, "container");
        f.e(l8, "fragmentManager");
        f.d(l8.J(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(2131362499);
        if (tag instanceof C0462m) {
            return (C0462m) tag;
        }
        C0462m mVar = new C0462m(viewGroup);
        viewGroup.setTag(2131362499, mVar);
        return mVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z;
        Iterator it = arrayList.iterator();
        loop0:
        while (true) {
            z = true;
            while (it.hasNext()) {
                W w2 = (W) it.next();
                if (!w2.f7952k.isEmpty()) {
                    ArrayList arrayList2 = w2.f7952k;
                    if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            V v4 = (V) it2.next();
                            v4.getClass();
                            if (!(v4 instanceof C0458i)) {
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                o.N(arrayList3, ((W) it3.next()).f7952k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(W w2) {
        f.e(w2, "operation");
        if (w2.i) {
            g.b(w2.f7944a, w2.f7946c.L(), this.f8008a);
            w2.i = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.fragment.app.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: androidx.fragment.app.W} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: androidx.fragment.app.W} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.ArrayList r12, boolean r13) {
        /*
            r11 = this;
            java.util.Iterator r0 = r12.iterator()
        L_0x0004:
            boolean r1 = r0.hasNext()
            r2 = 2
            r3 = 0
            java.lang.String r4 = "operation.fragment.mView"
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r0.next()
            r5 = r1
            androidx.fragment.app.W r5 = (androidx.fragment.app.W) r5
            androidx.fragment.app.v r6 = r5.f7946c
            android.view.View r6 = r6.f8045A0
            P6.f.d(r6, r4)
            int r6 = N7.a.a(r6)
            if (r6 != r2) goto L_0x0004
            int r5 = r5.f7944a
            if (r5 == r2) goto L_0x0004
            goto L_0x0028
        L_0x0027:
            r1 = r3
        L_0x0028:
            androidx.fragment.app.W r1 = (androidx.fragment.app.W) r1
            int r0 = r12.size()
            java.util.ListIterator r0 = r12.listIterator(r0)
        L_0x0032:
            boolean r5 = r0.hasPrevious()
            if (r5 == 0) goto L_0x0051
            java.lang.Object r5 = r0.previous()
            r6 = r5
            androidx.fragment.app.W r6 = (androidx.fragment.app.W) r6
            androidx.fragment.app.v r7 = r6.f7946c
            android.view.View r7 = r7.f8045A0
            P6.f.d(r7, r4)
            int r7 = N7.a.a(r7)
            if (r7 == r2) goto L_0x0032
            int r6 = r6.f7944a
            if (r6 != r2) goto L_0x0032
            r3 = r5
        L_0x0051:
            androidx.fragment.app.W r3 = (androidx.fragment.app.W) r3
            java.lang.String r0 = "FragmentManager"
            boolean r4 = android.util.Log.isLoggable(r0, r2)
            if (r4 == 0) goto L_0x0074
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Executing operations from "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r5 = " to "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r0, r4)
        L_0x0074:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.Object r6 = D6.i.Q(r12)
            androidx.fragment.app.W r6 = (androidx.fragment.app.W) r6
            androidx.fragment.app.v r6 = r6.f7946c
            java.util.Iterator r7 = r12.iterator()
        L_0x008a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00ad
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.W r8 = (androidx.fragment.app.W) r8
            androidx.fragment.app.v r8 = r8.f7946c
            androidx.fragment.app.u r8 = r8.f8048D0
            androidx.fragment.app.u r9 = r6.f8048D0
            int r10 = r9.f8036b
            r8.f8036b = r10
            int r10 = r9.f8037c
            r8.f8037c = r10
            int r10 = r9.f8038d
            r8.f8038d = r10
            int r9 = r9.e
            r8.e = r9
            goto L_0x008a
        L_0x00ad:
            java.util.Iterator r12 = r12.iterator()
        L_0x00b1:
            boolean r6 = r12.hasNext()
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0110
            java.lang.Object r6 = r12.next()
            androidx.fragment.app.W r6 = (androidx.fragment.app.W) r6
            androidx.fragment.app.g r9 = new androidx.fragment.app.g
            r9.<init>(r6, r13)
            r4.add(r9)
            androidx.fragment.app.l r9 = new androidx.fragment.app.l
            if (r13 == 0) goto L_0x00cf
            if (r6 != r1) goto L_0x00d2
        L_0x00cd:
            r7 = 1
            goto L_0x00d2
        L_0x00cf:
            if (r6 != r3) goto L_0x00d2
            goto L_0x00cd
        L_0x00d2:
            r9.<init>((androidx.fragment.app.W) r6)
            int r8 = r6.f7944a
            androidx.fragment.app.v r10 = r6.f7946c
            if (r8 != r2) goto L_0x00e4
            if (r13 == 0) goto L_0x00e0
            androidx.fragment.app.u r8 = r10.f8048D0
            goto L_0x00ec
        L_0x00e0:
            r10.getClass()
            goto L_0x00ec
        L_0x00e4:
            if (r13 == 0) goto L_0x00e9
            androidx.fragment.app.u r8 = r10.f8048D0
            goto L_0x00ec
        L_0x00e9:
            r10.getClass()
        L_0x00ec:
            int r8 = r6.f7944a
            if (r8 != r2) goto L_0x00f7
            if (r13 == 0) goto L_0x00f5
            androidx.fragment.app.u r8 = r10.f8048D0
            goto L_0x00f7
        L_0x00f5:
            androidx.fragment.app.u r8 = r10.f8048D0
        L_0x00f7:
            if (r7 == 0) goto L_0x0101
            if (r13 == 0) goto L_0x00fe
            androidx.fragment.app.u r7 = r10.f8048D0
            goto L_0x0101
        L_0x00fe:
            r10.getClass()
        L_0x0101:
            r5.add(r9)
            androidx.fragment.app.d r7 = new androidx.fragment.app.d
            r8 = 0
            r7.<init>(r11, r6, r8)
            java.util.ArrayList r6 = r6.f7947d
            r6.add(r7)
            goto L_0x00b1
        L_0x0110:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r5.iterator()
        L_0x0119:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0130
            java.lang.Object r1 = r13.next()
            r3 = r1
            androidx.fragment.app.l r3 = (androidx.fragment.app.C0461l) r3
            boolean r3 = r3.i()
            if (r3 != 0) goto L_0x0119
            r12.add(r1)
            goto L_0x0119
        L_0x0130:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x0139:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0149
            java.lang.Object r1 = r12.next()
            androidx.fragment.app.l r1 = (androidx.fragment.app.C0461l) r1
            r1.getClass()
            goto L_0x0139
        L_0x0149:
            java.util.Iterator r12 = r13.iterator()
        L_0x014d:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x015d
            java.lang.Object r13 = r12.next()
            androidx.fragment.app.l r13 = (androidx.fragment.app.C0461l) r13
            r13.getClass()
            goto L_0x014d
        L_0x015d:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r1 = r4.iterator()
        L_0x016b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0181
            java.lang.Object r3 = r1.next()
            androidx.fragment.app.g r3 = (androidx.fragment.app.C0456g) r3
            java.lang.Object r3 = r3.f1328V
            androidx.fragment.app.W r3 = (androidx.fragment.app.W) r3
            java.util.ArrayList r3 = r3.f7952k
            D6.o.N(r13, r3)
            goto L_0x016b
        L_0x0181:
            boolean r13 = r13.isEmpty()
            java.util.Iterator r1 = r4.iterator()
            r3 = 0
        L_0x018a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01f0
            java.lang.Object r4 = r1.next()
            androidx.fragment.app.g r4 = (androidx.fragment.app.C0456g) r4
            android.view.ViewGroup r5 = r11.f8008a
            android.content.Context r5 = r5.getContext()
            java.lang.Object r6 = r4.f1328V
            androidx.fragment.app.W r6 = (androidx.fragment.app.W) r6
            java.lang.String r9 = "context"
            P6.f.d(r5, r9)
            R2.c r5 = r4.p(r5)
            if (r5 != 0) goto L_0x01ac
            goto L_0x018a
        L_0x01ac:
            java.lang.Object r5 = r5.f4337W
            android.animation.AnimatorSet r5 = (android.animation.AnimatorSet) r5
            if (r5 != 0) goto L_0x01b6
            r12.add(r4)
            goto L_0x018a
        L_0x01b6:
            androidx.fragment.app.v r5 = r6.f7946c
            java.util.ArrayList r9 = r6.f7952k
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x01dd
            boolean r4 = android.util.Log.isLoggable(r0, r2)
            if (r4 == 0) goto L_0x018a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Ignoring Animator set on "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r5 = " as this Fragment was involved in a Transition."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r0, r4)
            goto L_0x018a
        L_0x01dd:
            int r3 = r6.f7944a
            r5 = 3
            if (r3 != r5) goto L_0x01e4
            r6.i = r7
        L_0x01e4:
            androidx.fragment.app.i r3 = new androidx.fragment.app.i
            r3.<init>(r4)
            java.util.ArrayList r4 = r6.f7951j
            r4.add(r3)
            r3 = 1
            goto L_0x018a
        L_0x01f0:
            java.util.Iterator r12 = r12.iterator()
        L_0x01f4:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x024d
            java.lang.Object r1 = r12.next()
            androidx.fragment.app.g r1 = (androidx.fragment.app.C0456g) r1
            java.lang.Object r4 = r1.f1328V
            androidx.fragment.app.W r4 = (androidx.fragment.app.W) r4
            androidx.fragment.app.v r5 = r4.f7946c
            java.lang.String r6 = "Ignoring Animation set on "
            if (r13 != 0) goto L_0x0225
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto L_0x01f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r5)
            java.lang.String r4 = " as Animations cannot run alongside Transitions."
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
            goto L_0x01f4
        L_0x0225:
            if (r3 == 0) goto L_0x0242
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto L_0x01f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r5)
            java.lang.String r4 = " as Animations cannot run alongside Animators."
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
            goto L_0x01f4
        L_0x0242:
            androidx.fragment.app.f r5 = new androidx.fragment.app.f
            r5.<init>(r1)
            java.util.ArrayList r1 = r4.f7951j
            r1.add(r5)
            goto L_0x01f4
        L_0x024d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0462m.b(java.util.ArrayList, boolean):void");
    }

    public final void c(ArrayList arrayList) {
        f.e(arrayList, "operations");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o.N(arrayList2, ((W) it.next()).f7952k);
        }
        List U8 = i.U(i.W(arrayList2));
        int size = U8.size();
        for (int i = 0; i < size; i++) {
            ((V) U8.get(i)).b(this.f8008a);
        }
        int size2 = arrayList.size();
        for (int i8 = 0; i8 < size2; i8++) {
            a((W) arrayList.get(i8));
        }
        List U9 = i.U(arrayList);
        int size3 = U9.size();
        for (int i9 = 0; i9 < size3; i9++) {
            W w2 = (W) U9.get(i9);
            if (w2.f7952k.isEmpty()) {
                w2.b();
            }
        }
    }

    public final void d(int i, int i8, Q q7) {
        synchronized (this.f8009b) {
            try {
                C0470v vVar = q7.f7926c;
                f.d(vVar, "fragmentStateManager.fragment");
                W g8 = g(vVar);
                if (g8 == null) {
                    C0470v vVar2 = q7.f7926c;
                    if (vVar2.f8071g0) {
                        g8 = h(vVar2);
                    } else {
                        g8 = null;
                    }
                }
                if (g8 != null) {
                    g8.d(i, i8);
                    return;
                }
                W w2 = new W(i, i8, q7);
                this.f8009b.add(w2);
                w2.f7947d.add(new C0453d(this, w2, 1));
                w2.f7947d.add(new C0453d(this, w2, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(int i, Q q7) {
        e.E(i, "finalState");
        f.e(q7, "fragmentStateManager");
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + q7.f7926c);
        }
        d(i, 2, q7);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0164, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r9 = this;
            boolean r0 = r9.f8012f
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            android.view.ViewGroup r0 = r9.f8008a
            boolean r0 = r0.isAttachedToWindow()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            r9.i()
            r9.e = r1
            return
        L_0x0014:
            java.util.ArrayList r0 = r9.f8009b
            monitor-enter(r0)
            java.util.ArrayList r2 = r9.f8010c     // Catch:{ all -> 0x0042 }
            java.util.ArrayList r2 = D6.i.V(r2)     // Catch:{ all -> 0x0042 }
            java.util.ArrayList r3 = r9.f8010c     // Catch:{ all -> 0x0042 }
            r3.clear()     // Catch:{ all -> 0x0042 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0042 }
        L_0x0026:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0042 }
            r5 = 1
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0042 }
            androidx.fragment.app.W r4 = (androidx.fragment.app.W) r4     // Catch:{ all -> 0x0042 }
            java.util.ArrayList r6 = r9.f8009b     // Catch:{ all -> 0x0042 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r6 != 0) goto L_0x0045
            androidx.fragment.app.v r6 = r4.f7946c     // Catch:{ all -> 0x0042 }
            boolean r6 = r6.f8071g0     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0045
            goto L_0x0046
        L_0x0042:
            r1 = move-exception
            goto L_0x0165
        L_0x0045:
            r5 = 0
        L_0x0046:
            r4.f7949g = r5     // Catch:{ all -> 0x0042 }
            goto L_0x0026
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0042 }
        L_0x004d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0042 }
            r4 = 2
            if (r3 == 0) goto L_0x00af
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0042 }
            androidx.fragment.app.W r3 = (androidx.fragment.app.W) r3     // Catch:{ all -> 0x0042 }
            boolean r6 = r9.f8011d     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0080
            java.lang.String r6 = "FragmentManager"
            boolean r4 = android.util.Log.isLoggable(r6, r4)     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x007c
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r6.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r7 = "SpecialEffectsController: Completing non-seekable operation "
            r6.append(r7)     // Catch:{ all -> 0x0042 }
            r6.append(r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0042 }
            android.util.Log.v(r4, r6)     // Catch:{ all -> 0x0042 }
        L_0x007c:
            r3.b()     // Catch:{ all -> 0x0042 }
            goto L_0x00a3
        L_0x0080:
            java.lang.String r6 = "FragmentManager"
            boolean r4 = android.util.Log.isLoggable(r6, r4)     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x009e
            java.lang.String r4 = "FragmentManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r6.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r7 = "SpecialEffectsController: Cancelling operation "
            r6.append(r7)     // Catch:{ all -> 0x0042 }
            r6.append(r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0042 }
            android.util.Log.v(r4, r6)     // Catch:{ all -> 0x0042 }
        L_0x009e:
            android.view.ViewGroup r4 = r9.f8008a     // Catch:{ all -> 0x0042 }
            r3.a(r4)     // Catch:{ all -> 0x0042 }
        L_0x00a3:
            r9.f8011d = r1     // Catch:{ all -> 0x0042 }
            boolean r4 = r3.f7948f     // Catch:{ all -> 0x0042 }
            if (r4 != 0) goto L_0x004d
            java.util.ArrayList r4 = r9.f8010c     // Catch:{ all -> 0x0042 }
            r4.add(r3)     // Catch:{ all -> 0x0042 }
            goto L_0x004d
        L_0x00af:
            java.util.ArrayList r2 = r9.f8009b     // Catch:{ all -> 0x0042 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r2 != 0) goto L_0x0163
            r9.m()     // Catch:{ all -> 0x0042 }
            java.util.ArrayList r2 = r9.f8009b     // Catch:{ all -> 0x0042 }
            java.util.ArrayList r2 = D6.i.V(r2)     // Catch:{ all -> 0x0042 }
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x00c8
            monitor-exit(r0)
            return
        L_0x00c8:
            java.util.ArrayList r3 = r9.f8009b     // Catch:{ all -> 0x0042 }
            r3.clear()     // Catch:{ all -> 0x0042 }
            java.util.ArrayList r3 = r9.f8010c     // Catch:{ all -> 0x0042 }
            r3.addAll(r2)     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "FragmentManager"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x0042 }
            if (r3 == 0) goto L_0x00e1
            java.lang.String r3 = "FragmentManager"
            java.lang.String r6 = "SpecialEffectsController: Executing pending operations"
            android.util.Log.v(r3, r6)     // Catch:{ all -> 0x0042 }
        L_0x00e1:
            boolean r3 = r9.e     // Catch:{ all -> 0x0042 }
            r9.b(r2, r3)     // Catch:{ all -> 0x0042 }
            boolean r3 = k(r2)     // Catch:{ all -> 0x0042 }
            java.util.Iterator r6 = r2.iterator()     // Catch:{ all -> 0x0042 }
            r7 = 1
        L_0x00ef:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x0042 }
            if (r8 == 0) goto L_0x0103
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0042 }
            androidx.fragment.app.W r8 = (androidx.fragment.app.W) r8     // Catch:{ all -> 0x0042 }
            androidx.fragment.app.v r8 = r8.f7946c     // Catch:{ all -> 0x0042 }
            boolean r8 = r8.f8071g0     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x00ef
            r7 = 0
            goto L_0x00ef
        L_0x0103:
            if (r7 == 0) goto L_0x0108
            if (r3 != 0) goto L_0x0108
            goto L_0x0109
        L_0x0108:
            r5 = 0
        L_0x0109:
            r9.f8011d = r5     // Catch:{ all -> 0x0042 }
            java.lang.String r5 = "FragmentManager"
            boolean r5 = android.util.Log.isLoggable(r5, r4)     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x0131
            java.lang.String r5 = "FragmentManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0042 }
            r6.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r8 = "SpecialEffectsController: Operation seekable = "
            r6.append(r8)     // Catch:{ all -> 0x0042 }
            r6.append(r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r8 = " \ntransition = "
            r6.append(r8)     // Catch:{ all -> 0x0042 }
            r6.append(r7)     // Catch:{ all -> 0x0042 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0042 }
            android.util.Log.v(r5, r6)     // Catch:{ all -> 0x0042 }
        L_0x0131:
            if (r7 != 0) goto L_0x013a
            r9.l(r2)     // Catch:{ all -> 0x0042 }
            r9.c(r2)     // Catch:{ all -> 0x0042 }
            goto L_0x0152
        L_0x013a:
            if (r3 == 0) goto L_0x0152
            r9.l(r2)     // Catch:{ all -> 0x0042 }
            int r3 = r2.size()     // Catch:{ all -> 0x0042 }
            r5 = 0
        L_0x0144:
            if (r5 >= r3) goto L_0x0152
            java.lang.Object r6 = r2.get(r5)     // Catch:{ all -> 0x0042 }
            androidx.fragment.app.W r6 = (androidx.fragment.app.W) r6     // Catch:{ all -> 0x0042 }
            r9.a(r6)     // Catch:{ all -> 0x0042 }
            int r5 = r5 + 1
            goto L_0x0144
        L_0x0152:
            r9.e = r1     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r1, r4)     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0163
            java.lang.String r1 = "FragmentManager"
            java.lang.String r2 = "SpecialEffectsController: Finished executing pending operations"
            android.util.Log.v(r1, r2)     // Catch:{ all -> 0x0042 }
        L_0x0163:
            monitor-exit(r0)
            return
        L_0x0165:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0462m.f():void");
    }

    public final W g(C0470v vVar) {
        Object obj;
        Iterator it = this.f8009b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            W w2 = (W) obj;
            if (f.a(w2.f7946c, vVar) && !w2.e) {
                break;
            }
        }
        return (W) obj;
    }

    public final W h(C0470v vVar) {
        Object obj;
        Iterator it = this.f8010c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            W w2 = (W) obj;
            if (f.a(w2.f7946c, vVar) && !w2.e) {
                break;
            }
        }
        return (W) obj;
    }

    public final void i() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.f8008a.isAttachedToWindow();
        synchronized (this.f8009b) {
            try {
                m();
                l(this.f8009b);
                ArrayList V8 = i.V(this.f8010c);
                Iterator it = V8.iterator();
                while (it.hasNext()) {
                    ((W) it.next()).f7949g = false;
                }
                Iterator it2 = V8.iterator();
                while (it2.hasNext()) {
                    W w2 = (W) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f8008a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + w2);
                    }
                    w2.a(this.f8008a);
                }
                ArrayList V9 = i.V(this.f8009b);
                Iterator it3 = V9.iterator();
                while (it3.hasNext()) {
                    ((W) it3.next()).f7949g = false;
                }
                Iterator it4 = V9.iterator();
                while (it4.hasNext()) {
                    W w4 = (W) it4.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f8008a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + w4);
                    }
                    w4.a(this.f8008a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(ArrayList arrayList) {
        float f8;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            W w2 = (W) arrayList.get(i);
            if (!w2.f7950h) {
                w2.f7950h = true;
                int i8 = w2.f7945b;
                Q q7 = w2.f7953l;
                if (i8 == 2) {
                    C0470v vVar = q7.f7926c;
                    f.d(vVar, "fragmentStateManager.fragment");
                    View findFocus = vVar.f8045A0.findFocus();
                    if (findFocus != null) {
                        vVar.g().f8043k = findFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + vVar);
                        }
                    }
                    View L8 = w2.f7946c.L();
                    if (L8.getParent() == null) {
                        q7.b();
                        L8.setAlpha(0.0f);
                    }
                    if (L8.getAlpha() == 0.0f && L8.getVisibility() == 0) {
                        L8.setVisibility(4);
                    }
                    C0469u uVar = vVar.f8048D0;
                    if (uVar == null) {
                        f8 = 1.0f;
                    } else {
                        f8 = uVar.f8042j;
                    }
                    L8.setAlpha(f8);
                } else if (i8 == 3) {
                    C0470v vVar2 = q7.f7926c;
                    f.d(vVar2, "fragmentStateManager.fragment");
                    View L9 = vVar2.L();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Clearing focus " + L9.findFocus() + " on view " + L9 + " for Fragment " + vVar2);
                    }
                    L9.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o.N(arrayList2, ((W) it.next()).f7952k);
        }
        List U8 = i.U(i.W(arrayList2));
        int size2 = U8.size();
        for (int i9 = 0; i9 < size2; i9++) {
            V v4 = (V) U8.get(i9);
            v4.getClass();
            ViewGroup viewGroup = this.f8008a;
            f.e(viewGroup, "container");
            if (!v4.f7942a) {
                v4.d(viewGroup);
            }
            v4.f7942a = true;
        }
    }

    public final void m() {
        Iterator it = this.f8009b.iterator();
        while (it.hasNext()) {
            W w2 = (W) it.next();
            int i = 2;
            if (w2.f7945b == 2) {
                int visibility = w2.f7946c.L().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i = 3;
                        } else {
                            throw new IllegalArgumentException(g.m(visibility, "Unknown visibility "));
                        }
                    }
                }
                w2.d(i, 1);
            }
        }
    }
}
