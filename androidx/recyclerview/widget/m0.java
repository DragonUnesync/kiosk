package androidx.recyclerview.widget;

public final class m0 extends W {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8448a = false;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B f8449b;

    public m0(B b8) {
        this.f8449b = b8;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f8448a) {
            this.f8448a = false;
            this.f8449b.f();
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i8) {
        if (i != 0 || i8 != 0) {
            this.f8448a = true;
        }
    }
}
