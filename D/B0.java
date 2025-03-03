package D;

import B.C;
import B.j0;
import F.h;
import K.a;
import K.b;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public final class B0 extends x0 {
    public final b i = new b(0);

    /* renamed from: j  reason: collision with root package name */
    public boolean f742j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f743k = false;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f744l = new ArrayList();

    public final void a(C0 c02) {
        Object obj;
        I i8 = c02.f752g;
        int i9 = i8.f790c;
        j0 j0Var = this.f959b;
        if (i9 != -1) {
            this.f743k = true;
            int i10 = j0Var.f264U;
            Integer valueOf = Integer.valueOf(i9);
            List list = C0.i;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i10))) {
                i9 = i10;
            }
            j0Var.f264U = i9;
        }
        C0036c cVar = I.f787j;
        Object obj2 = C0048i.f903f;
        C0053k0 k0Var = i8.f789b;
        try {
            obj2 = k0Var.b0(cVar);
        } catch (IllegalArgumentException unused) {
        }
        Range range = (Range) obj2;
        Objects.requireNonNull(range);
        Range range2 = C0048i.f903f;
        if (!range.equals(range2)) {
            C0041e0 e0Var = (C0041e0) j0Var.f267X;
            C0036c cVar2 = I.f787j;
            e0Var.getClass();
            try {
                obj = e0Var.b0(cVar2);
            } catch (IllegalArgumentException unused2) {
                obj = range2;
            }
            if (((Range) obj).equals(range2)) {
                ((C0041e0) j0Var.f267X).e(I.f787j, range);
            } else {
                C0041e0 e0Var2 = (C0041e0) j0Var.f267X;
                C0036c cVar3 = I.f787j;
                Object obj3 = C0048i.f903f;
                e0Var2.getClass();
                try {
                    obj3 = e0Var2.b0(cVar3);
                } catch (IllegalArgumentException unused3) {
                }
                if (!((Range) obj3).equals(range)) {
                    this.f742j = false;
                    h.j("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                }
            }
        }
        int a8 = i8.a();
        if (a8 != 0) {
            j0Var.getClass();
            if (a8 != 0) {
                ((C0041e0) j0Var.f267X).e(L0.f808B, Integer.valueOf(a8));
            }
        }
        int b8 = i8.b();
        if (b8 != 0) {
            j0Var.getClass();
            if (b8 != 0) {
                ((C0041e0) j0Var.f267X).e(L0.f809C, Integer.valueOf(b8));
            }
        }
        I i11 = c02.f752g;
        ((C0045g0) j0Var.f269Z).f785a.putAll(i11.f792f.f785a);
        this.f960c.addAll(c02.f749c);
        this.f961d.addAll(c02.f750d);
        j0Var.a(i11.f791d);
        this.e.addAll(c02.e);
        A0 a02 = c02.f751f;
        if (a02 != null) {
            this.f744l.add(a02);
        }
        InputConfiguration inputConfiguration = c02.f753h;
        if (inputConfiguration != null) {
            this.f963g = inputConfiguration;
        }
        LinkedHashSet<C0044g> linkedHashSet = this.f958a;
        linkedHashSet.addAll(c02.f747a);
        HashSet hashSet = (HashSet) j0Var.f266W;
        hashSet.addAll(DesugarCollections.unmodifiableList(i8.f788a));
        ArrayList arrayList = new ArrayList();
        for (C0044g gVar : linkedHashSet) {
            arrayList.add(gVar.f899a);
            for (N add : gVar.f900b) {
                arrayList.add(add);
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            h.j("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.f742j = false;
        }
        C0044g gVar2 = c02.f748b;
        if (gVar2 != null) {
            C0044g gVar3 = this.f964h;
            if (gVar3 == gVar2 || gVar3 == null) {
                this.f964h = gVar2;
            } else {
                h.j("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.f742j = false;
            }
        }
        j0Var.e(k0Var);
    }

    public final C0 b() {
        C c8;
        if (this.f742j) {
            ArrayList arrayList = new ArrayList(this.f958a);
            b bVar = this.i;
            if (bVar.f2535a) {
                Collections.sort(arrayList, new a(0, bVar));
            }
            if (!this.f744l.isEmpty()) {
                c8 = new C(3, this);
            } else {
                c8 = null;
            }
            return new C0(arrayList, new ArrayList(this.f960c), new ArrayList(this.f961d), new ArrayList(this.e), this.f959b.f(), c8, this.f963g, this.f964h);
        }
        throw new IllegalArgumentException("Unsupported session configuration combination");
    }
}
