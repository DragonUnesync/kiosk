package androidx.recyclerview.widget;

public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public int f8395a;

    /* renamed from: b  reason: collision with root package name */
    public int f8396b;

    /* renamed from: c  reason: collision with root package name */
    public int f8397c;

    /* renamed from: d  reason: collision with root package name */
    public int f8398d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8399f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8400g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8401h;
    public boolean i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8402j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8403k;

    /* renamed from: l  reason: collision with root package name */
    public int f8404l;

    /* renamed from: m  reason: collision with root package name */
    public long f8405m;

    /* renamed from: n  reason: collision with root package name */
    public int f8406n;

    public final void a(int i8) {
        if ((this.f8398d & i8) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i8) + " but it is " + Integer.toBinaryString(this.f8398d));
        }
    }

    public final int b() {
        if (this.f8400g) {
            return this.f8396b - this.f8397c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f8395a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.i + ", mPreviousLayoutItemCount=" + this.f8396b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f8397c + ", mStructureChanged=" + this.f8399f + ", mInPreLayout=" + this.f8400g + ", mRunSimpleAnimations=" + this.f8402j + ", mRunPredictiveAnimations=" + this.f8403k + '}';
    }
}
