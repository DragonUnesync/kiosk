package g2;

import B3.q;
import C3.m;
import Y.e;
import Y.g;
import Y.h;
import Y.i;
import Z.a;
import a1.C0410a;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import v0.C1510H;
import v0.C1553z;

public abstract class p implements Cloneable {

    /* renamed from: s0  reason: collision with root package name */
    public static final Animator[] f11963s0 = new Animator[0];

    /* renamed from: t0  reason: collision with root package name */
    public static final int[] f11964t0 = {2, 1, 3, 4};

    /* renamed from: u0  reason: collision with root package name */
    public static final C0410a f11965u0 = new C0410a(27);

    /* renamed from: v0  reason: collision with root package name */
    public static final ThreadLocal f11966v0 = new ThreadLocal();

    /* renamed from: U  reason: collision with root package name */
    public final String f11967U = getClass().getName();

    /* renamed from: V  reason: collision with root package name */
    public long f11968V = -1;

    /* renamed from: W  reason: collision with root package name */
    public long f11969W = -1;

    /* renamed from: X  reason: collision with root package name */
    public TimeInterpolator f11970X = null;

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayList f11971Y = new ArrayList();

    /* renamed from: Z  reason: collision with root package name */
    public final ArrayList f11972Z = new ArrayList();

    /* renamed from: a0  reason: collision with root package name */
    public q f11973a0 = new q(16);

    /* renamed from: b0  reason: collision with root package name */
    public q f11974b0 = new q(16);

    /* renamed from: c0  reason: collision with root package name */
    public C0948a f11975c0 = null;

    /* renamed from: d0  reason: collision with root package name */
    public final int[] f11976d0 = f11964t0;

    /* renamed from: e0  reason: collision with root package name */
    public ArrayList f11977e0;

    /* renamed from: f0  reason: collision with root package name */
    public ArrayList f11978f0;

    /* renamed from: g0  reason: collision with root package name */
    public n[] f11979g0;

    /* renamed from: h0  reason: collision with root package name */
    public final ArrayList f11980h0 = new ArrayList();

    /* renamed from: i0  reason: collision with root package name */
    public Animator[] f11981i0 = f11963s0;

    /* renamed from: j0  reason: collision with root package name */
    public int f11982j0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f11983k0 = false;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f11984l0 = false;

    /* renamed from: m0  reason: collision with root package name */
    public p f11985m0 = null;

    /* renamed from: n0  reason: collision with root package name */
    public ArrayList f11986n0 = null;

    /* renamed from: o0  reason: collision with root package name */
    public ArrayList f11987o0 = new ArrayList();
    public C0410a p0 = f11965u0;

    /* renamed from: q0  reason: collision with root package name */
    public long f11988q0;

    /* renamed from: r0  reason: collision with root package name */
    public long f11989r0;

    public static void b(q qVar, View view, x xVar) {
        ((e) qVar.f449U).put(view, xVar);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) qVar.f450V;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        String g8 = C1553z.g(view);
        if (g8 != null) {
            e eVar = (e) qVar.f452X;
            if (eVar.containsKey(g8)) {
                eVar.put(g8, (Object) null);
            } else {
                eVar.put(g8, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                g gVar = (g) qVar.f451W;
                if (gVar.f6300U) {
                    int i = gVar.f6303X;
                    long[] jArr = gVar.f6301V;
                    Object[] objArr = gVar.f6302W;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i; i9++) {
                        Object obj = objArr[i9];
                        if (obj != h.f6304a) {
                            if (i9 != i8) {
                                jArr[i8] = jArr[i9];
                                objArr[i8] = obj;
                                objArr[i9] = null;
                            }
                            i8++;
                        }
                    }
                    gVar.f6300U = false;
                    gVar.f6303X = i8;
                }
                if (a.b(gVar.f6301V, gVar.f6303X, itemIdAtPosition) >= 0) {
                    View view2 = (View) gVar.d(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        gVar.g((Object) null, itemIdAtPosition);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                gVar.g(view, itemIdAtPosition);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [Y.e, Y.i, java.lang.Object] */
    public static e p() {
        ThreadLocal threadLocal = f11966v0;
        e eVar = (e) threadLocal.get();
        if (eVar != null) {
            return eVar;
        }
        ? iVar = new i((Object) null);
        threadLocal.set(iVar);
        return iVar;
    }

    public static boolean v(x xVar, x xVar2, String str) {
        Object obj = xVar.f12000a.get(str);
        Object obj2 = xVar2.f12000a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(FrameLayout frameLayout) {
        if (this.f11983k0) {
            if (!this.f11984l0) {
                ArrayList arrayList = this.f11980h0;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f11981i0);
                this.f11981i0 = f11963s0;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f11981i0 = animatorArr;
                w(this, o.f11962P, false);
            }
            this.f11983k0 = false;
        }
    }

    public void B() {
        J();
        e p3 = p();
        Iterator it = this.f11987o0.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p3.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new C0957j(this, p3));
                    long j7 = this.f11969W;
                    if (j7 >= 0) {
                        animator.setDuration(j7);
                    }
                    long j8 = this.f11968V;
                    if (j8 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j8);
                    }
                    TimeInterpolator timeInterpolator = this.f11970X;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new m(1, this));
                    animator.start();
                }
            }
        }
        this.f11987o0.clear();
        m();
    }

    public void C(long j7, long j8) {
        boolean z;
        long j9 = j7;
        long j10 = this.f11988q0;
        if (j9 < j8) {
            z = true;
        } else {
            z = false;
        }
        int i = (j8 > 0 ? 1 : (j8 == 0 ? 0 : -1));
        if ((i < 0 && j9 >= 0) || (j8 > j10 && j9 <= j10)) {
            this.f11984l0 = false;
            w(this, o.f11958L, z);
        }
        ArrayList arrayList = this.f11980h0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f11981i0);
        this.f11981i0 = f11963s0;
        for (int i8 = 0; i8 < size; i8++) {
            Animator animator = animatorArr[i8];
            animatorArr[i8] = null;
            l.b(animator, Math.min(Math.max(0, j9), l.a(animator)));
        }
        this.f11981i0 = animatorArr;
        int i9 = (j9 > j10 ? 1 : (j9 == j10 ? 0 : -1));
        if ((i9 > 0 && j8 <= j10) || (j9 < 0 && i >= 0)) {
            if (i9 > 0) {
                this.f11984l0 = true;
            }
            w(this, o.f11959M, z);
        }
    }

    public void D(long j7) {
        this.f11969W = j7;
    }

    public void E(Q7.g gVar) {
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f11970X = timeInterpolator;
    }

    public void G(C0410a aVar) {
        if (aVar == null) {
            this.p0 = f11965u0;
        } else {
            this.p0 = aVar;
        }
    }

    public void H() {
    }

    public void I(long j7) {
        this.f11968V = j7;
    }

    public final void J() {
        if (this.f11982j0 == 0) {
            w(this, o.f11958L, false);
            this.f11984l0 = false;
        }
        this.f11982j0++;
    }

    public String K(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f11969W != -1) {
            sb.append("dur(");
            sb.append(this.f11969W);
            sb.append(") ");
        }
        if (this.f11968V != -1) {
            sb.append("dly(");
            sb.append(this.f11968V);
            sb.append(") ");
        }
        if (this.f11970X != null) {
            sb.append("interp(");
            sb.append(this.f11970X);
            sb.append(") ");
        }
        ArrayList arrayList = this.f11971Y;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f11972Z;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    if (i8 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i8));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(n nVar) {
        if (this.f11986n0 == null) {
            this.f11986n0 = new ArrayList();
        }
        this.f11986n0.add(nVar);
    }

    public void c() {
        ArrayList arrayList = this.f11980h0;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f11981i0);
        this.f11981i0 = f11963s0;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f11981i0 = animatorArr;
        w(this, o.f11960N, false);
    }

    public abstract void d(x xVar);

    public final void e(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                x xVar = new x(view);
                if (z) {
                    g(xVar);
                } else {
                    d(xVar);
                }
                xVar.f12002c.add(this);
                f(xVar);
                if (z) {
                    b(this.f11973a0, view, xVar);
                } else {
                    b(this.f11974b0, view, xVar);
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    e(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public void f(x xVar) {
    }

    public abstract void g(x xVar);

    public final void h(FrameLayout frameLayout, boolean z) {
        i(z);
        ArrayList arrayList = this.f11971Y;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f11972Z;
        if (size > 0 || arrayList2.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
                if (findViewById != null) {
                    x xVar = new x(findViewById);
                    if (z) {
                        g(xVar);
                    } else {
                        d(xVar);
                    }
                    xVar.f12002c.add(this);
                    f(xVar);
                    if (z) {
                        b(this.f11973a0, findViewById, xVar);
                    } else {
                        b(this.f11974b0, findViewById, xVar);
                    }
                }
            }
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                View view = (View) arrayList2.get(i8);
                x xVar2 = new x(view);
                if (z) {
                    g(xVar2);
                } else {
                    d(xVar2);
                }
                xVar2.f12002c.add(this);
                f(xVar2);
                if (z) {
                    b(this.f11973a0, view, xVar2);
                } else {
                    b(this.f11974b0, view, xVar2);
                }
            }
            return;
        }
        e(frameLayout, z);
    }

    public final void i(boolean z) {
        if (z) {
            ((e) this.f11973a0.f449U).clear();
            ((SparseArray) this.f11973a0.f450V).clear();
            ((g) this.f11973a0.f451W).b();
            return;
        }
        ((e) this.f11974b0.f449U).clear();
        ((SparseArray) this.f11974b0.f450V).clear();
        ((g) this.f11974b0.f451W).b();
    }

    /* renamed from: j */
    public p clone() {
        try {
            p pVar = (p) super.clone();
            pVar.f11987o0 = new ArrayList();
            pVar.f11973a0 = new q(16);
            pVar.f11974b0 = new q(16);
            pVar.f11977e0 = null;
            pVar.f11978f0 = null;
            pVar.f11985m0 = this;
            pVar.f11986n0 = null;
            return pVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator k(FrameLayout frameLayout, x xVar, x xVar2) {
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v11, types: [g2.k, java.lang.Object] */
    public void l(FrameLayout frameLayout, q qVar, q qVar2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        x xVar;
        View view;
        x xVar2;
        Animator animator;
        e p3 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i8 = 0;
        while (i8 < size) {
            x xVar3 = (x) arrayList.get(i8);
            x xVar4 = (x) arrayList2.get(i8);
            if (xVar3 != null && !xVar3.f12002c.contains(this)) {
                xVar3 = null;
            }
            if (xVar4 != null && !xVar4.f12002c.contains(this)) {
                xVar4 = null;
            }
            if (!(xVar3 == null && xVar4 == null) && (xVar3 == null || xVar4 == null || t(xVar3, xVar4))) {
                Animator k8 = k(frameLayout, xVar3, xVar4);
                if (k8 != null) {
                    String str = this.f11967U;
                    if (xVar4 != null) {
                        String[] q7 = q();
                        view = xVar4.f12001b;
                        if (q7 != null && q7.length > 0) {
                            xVar2 = new x(view);
                            x xVar5 = (x) ((e) qVar2.f449U).get(view);
                            i = size;
                            if (xVar5 != null) {
                                int i9 = 0;
                                while (i9 < q7.length) {
                                    HashMap hashMap = xVar2.f12000a;
                                    String str2 = q7[i9];
                                    hashMap.put(str2, xVar5.f12000a.get(str2));
                                    i9++;
                                    ArrayList arrayList3 = arrayList;
                                    q7 = q7;
                                }
                            }
                            int i10 = p3.f6308W;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= i10) {
                                    animator = k8;
                                    break;
                                }
                                k kVar = (k) p3.get((Animator) p3.f(i11));
                                if (kVar.f11954c != null && kVar.f11952a == view && kVar.f11953b.equals(str) && kVar.f11954c.equals(xVar2)) {
                                    animator = null;
                                    break;
                                }
                                i11++;
                            }
                        } else {
                            q qVar3 = qVar2;
                            i = size;
                            animator = k8;
                            xVar2 = null;
                        }
                        k8 = animator;
                        xVar = xVar2;
                    } else {
                        q qVar4 = qVar2;
                        i = size;
                        view = xVar3.f12001b;
                        xVar = null;
                    }
                    if (k8 != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        ? obj = new Object();
                        obj.f11952a = view;
                        obj.f11953b = str;
                        obj.f11954c = xVar;
                        obj.f11955d = windowId;
                        obj.e = this;
                        obj.f11956f = k8;
                        p3.put(k8, obj);
                        this.f11987o0.add(k8);
                    }
                    i8++;
                    size = i;
                }
            } else {
                FrameLayout frameLayout2 = frameLayout;
            }
            q qVar5 = qVar2;
            i = size;
            i8++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                k kVar2 = (k) p3.get((Animator) this.f11987o0.get(sparseIntArray.keyAt(i12)));
                long startDelay = kVar2.f11956f.getStartDelay();
                kVar2.f11956f.setStartDelay(startDelay + (((long) sparseIntArray.valueAt(i12)) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i = this.f11982j0 - 1;
        this.f11982j0 = i;
        if (i == 0) {
            w(this, o.f11959M, false);
            for (int i8 = 0; i8 < ((g) this.f11973a0.f451W).h(); i8++) {
                View view = (View) ((g) this.f11973a0.f451W).i(i8);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i9 = 0; i9 < ((g) this.f11974b0.f451W).h(); i9++) {
                View view2 = (View) ((g) this.f11974b0.f451W).i(i9);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f11984l0 = true;
        }
    }

    public final x n(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0948a aVar = this.f11975c0;
        if (aVar != null) {
            return aVar.n(view, z);
        }
        if (z) {
            arrayList = this.f11977e0;
        } else {
            arrayList = this.f11978f0;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            x xVar = (x) arrayList.get(i);
            if (xVar == null) {
                return null;
            }
            if (xVar.f12001b == view) {
                break;
            }
            i++;
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.f11978f0;
        } else {
            arrayList2 = this.f11977e0;
        }
        return (x) arrayList2.get(i);
    }

    public final p o() {
        C0948a aVar = this.f11975c0;
        if (aVar != null) {
            return aVar.o();
        }
        return this;
    }

    public String[] q() {
        return null;
    }

    public final x r(View view, boolean z) {
        q qVar;
        C0948a aVar = this.f11975c0;
        if (aVar != null) {
            return aVar.r(view, z);
        }
        if (z) {
            qVar = this.f11973a0;
        } else {
            qVar = this.f11974b0;
        }
        return (x) ((e) qVar.f449U).get(view);
    }

    public boolean s() {
        return !this.f11980h0.isEmpty();
    }

    public boolean t(x xVar, x xVar2) {
        if (xVar == null || xVar2 == null) {
            return false;
        }
        String[] q7 = q();
        if (q7 != null) {
            int length = q7.length;
            int i = 0;
            while (i < length) {
                if (!v(xVar, xVar2, q7[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String v4 : xVar.f12000a.keySet()) {
            if (v(xVar, xVar2, v4)) {
            }
        }
        return false;
        return true;
    }

    public final String toString() {
        return K("");
    }

    public final boolean u(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f11971Y;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f11972Z;
        if ((size != 0 || arrayList2.size() != 0) && !arrayList.contains(Integer.valueOf(id)) && !arrayList2.contains(view)) {
            return false;
        }
        return true;
    }

    public final void w(p pVar, o oVar, boolean z) {
        p pVar2 = this.f11985m0;
        if (pVar2 != null) {
            pVar2.w(pVar, oVar, z);
        }
        ArrayList arrayList = this.f11986n0;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f11986n0.size();
            n[] nVarArr = this.f11979g0;
            if (nVarArr == null) {
                nVarArr = new n[size];
            }
            this.f11979g0 = null;
            n[] nVarArr2 = (n[]) this.f11986n0.toArray(nVarArr);
            for (int i = 0; i < size; i++) {
                oVar.b(nVarArr2[i], pVar, z);
                nVarArr2[i] = null;
            }
            this.f11979g0 = nVarArr2;
        }
    }

    public void x(ViewGroup viewGroup) {
        if (!this.f11984l0) {
            ArrayList arrayList = this.f11980h0;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f11981i0);
            this.f11981i0 = f11963s0;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.f11981i0 = animatorArr;
            w(this, o.f11961O, false);
            this.f11983k0 = true;
        }
    }

    public void y() {
        e p3 = p();
        this.f11988q0 = 0;
        for (int i = 0; i < this.f11987o0.size(); i++) {
            Animator animator = (Animator) this.f11987o0.get(i);
            k kVar = (k) p3.get(animator);
            if (!(animator == null || kVar == null)) {
                long j7 = this.f11969W;
                Animator animator2 = kVar.f11956f;
                if (j7 >= 0) {
                    animator2.setDuration(j7);
                }
                long j8 = this.f11968V;
                if (j8 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j8);
                }
                TimeInterpolator timeInterpolator = this.f11970X;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f11980h0.add(animator);
                this.f11988q0 = Math.max(this.f11988q0, l.a(animator));
            }
        }
        this.f11987o0.clear();
    }

    public p z(n nVar) {
        p pVar;
        ArrayList arrayList = this.f11986n0;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(nVar) && (pVar = this.f11985m0) != null) {
            pVar.z(nVar);
        }
        if (this.f11986n0.size() == 0) {
            this.f11986n0 = null;
        }
        return this;
    }
}
