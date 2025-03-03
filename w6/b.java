package W6;

import P6.f;
import T6.c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u.C1477r;

public final class b implements Iterator {

    /* renamed from: U  reason: collision with root package name */
    public int f6192U = -1;

    /* renamed from: V  reason: collision with root package name */
    public int f6193V;

    /* renamed from: W  reason: collision with root package name */
    public int f6194W;

    /* renamed from: X  reason: collision with root package name */
    public c f6195X;

    /* renamed from: Y  reason: collision with root package name */
    public int f6196Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ c f6197Z;

    public b(c cVar) {
        this.f6197Z = cVar;
        int i = cVar.f6199b;
        int length = cVar.f6198a.length();
        if (length >= 0) {
            if (i < 0) {
                i = 0;
            } else if (i > length) {
                i = length;
            }
            this.f6193V = i;
            this.f6194W = i;
            return;
        }
        throw new IllegalArgumentException(C1477r.c(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [T6.c, T6.a] */
    /* JADX WARNING: type inference failed for: r0v2, types: [P6.g, O6.p] */
    /* JADX WARNING: type inference failed for: r0v8, types: [T6.c, T6.a] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r7 < r3) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            int r0 = r8.f6194W
            r1 = 0
            if (r0 >= 0) goto L_0x000b
            r8.f6192U = r1
            r0 = 0
            r8.f6195X = r0
            goto L_0x0075
        L_0x000b:
            W6.c r2 = r8.f6197Z
            int r3 = r2.f6200c
            java.lang.String r4 = r2.f6198a
            r5 = -1
            r6 = 1
            if (r3 <= 0) goto L_0x001c
            int r7 = r8.f6196Y
            int r7 = r7 + r6
            r8.f6196Y = r7
            if (r7 >= r3) goto L_0x0022
        L_0x001c:
            int r3 = r4.length()
            if (r0 <= r3) goto L_0x0032
        L_0x0022:
            T6.c r0 = new T6.c
            int r1 = r8.f6193V
            int r2 = W6.d.d0(r4)
            r0.<init>(r1, r2, r6)
            r8.f6195X = r0
            r8.f6194W = r5
            goto L_0x0073
        L_0x0032:
            P6.g r0 = r2.f6201d
            int r2 = r8.f6194W
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.c(r4, r2)
            C6.c r0 = (C6.c) r0
            if (r0 != 0) goto L_0x0052
            T6.c r0 = new T6.c
            int r1 = r8.f6193V
            int r2 = W6.d.d0(r4)
            r0.<init>(r1, r2, r6)
            r8.f6195X = r0
            r8.f6194W = r5
            goto L_0x0073
        L_0x0052:
            java.lang.Object r2 = r0.f711U
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f712V
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r8.f6193V
            T6.c r3 = B.C0003d.Q(r3, r2)
            r8.f6195X = r3
            int r2 = r2 + r0
            r8.f6193V = r2
            if (r0 != 0) goto L_0x0070
            r1 = 1
        L_0x0070:
            int r2 = r2 + r1
            r8.f6194W = r2
        L_0x0073:
            r8.f6192U = r6
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W6.b.a():void");
    }

    public final boolean hasNext() {
        if (this.f6192U == -1) {
            a();
        }
        if (this.f6192U == 1) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (this.f6192U == -1) {
            a();
        }
        if (this.f6192U != 0) {
            c cVar = this.f6195X;
            f.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f6195X = null;
            this.f6192U = -1;
            return cVar;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
