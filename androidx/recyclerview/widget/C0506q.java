package androidx.recyclerview.widget;

import java.util.Arrays;

/* renamed from: androidx.recyclerview.widget.q  reason: case insensitive filesystem */
public final class C0506q {

    /* renamed from: a  reason: collision with root package name */
    public int f8491a;

    /* renamed from: b  reason: collision with root package name */
    public int f8492b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f8493c;

    /* renamed from: d  reason: collision with root package name */
    public int f8494d;

    public final void a(int i, int i8) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i8 >= 0) {
            int i9 = this.f8494d;
            int i10 = i9 * 2;
            int[] iArr = this.f8493c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f8493c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[(i9 * 4)];
                this.f8493c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f8493c;
            iArr4[i10] = i;
            iArr4[i10 + 1] = i8;
            this.f8494d++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    public final void b(RecyclerView recyclerView, boolean z) {
        this.f8494d = 0;
        int[] iArr = this.f8493c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        Q q7 = recyclerView.mLayout;
        if (recyclerView.mAdapter != null && q7 != null && q7.f8316c0) {
            if (z) {
                if (!recyclerView.mAdapterHelper.g()) {
                    q7.t(recyclerView.mAdapter.getItemCount(), this);
                }
            } else if (!recyclerView.hasPendingAdapterUpdates()) {
                q7.s(this.f8491a, this.f8492b, recyclerView.mState, this);
            }
            int i = this.f8494d;
            if (i > q7.f8317d0) {
                q7.f8317d0 = i;
                q7.f8318e0 = z;
                recyclerView.mRecycler.n();
            }
        }
    }
}
