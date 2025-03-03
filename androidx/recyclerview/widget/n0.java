package androidx.recyclerview.widget;

import java.util.Arrays;

public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public int f8452a;

    /* renamed from: b  reason: collision with root package name */
    public int f8453b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8454c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8455d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f8456f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f8457g;

    public n0(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f8457g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f8452a = -1;
        this.f8453b = RecyclerView.UNDEFINED_DURATION;
        this.f8454c = false;
        this.f8455d = false;
        this.e = false;
        int[] iArr = this.f8456f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
