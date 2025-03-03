package P5;

import de.ozerov.fully.U0;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3930U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ String f3931V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ boolean f3932W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ boolean f3933X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ boolean f3934Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f3935Z;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ Object f3936a0;

    public /* synthetic */ w(Object obj, String str, boolean z, boolean z6, boolean z8, boolean z9, int i) {
        this.f3930U = i;
        this.f3936a0 = obj;
        this.f3931V = str;
        this.f3932W = z;
        this.f3933X = z6;
        this.f3934Y = z8;
        this.f3935Z = z9;
    }

    public final void run() {
        switch (this.f3930U) {
            case 0:
                ((C0140c) this.f3936a0).f3879b.f9928Q0.m(this.f3931V, this.f3932W, this.f3933X, this.f3934Y, this.f3935Z);
                return;
            default:
                ((U0) this.f3936a0).f10414a.f9928Q0.m(this.f3931V, this.f3932W, this.f3933X, this.f3934Y, this.f3935Z);
                return;
        }
    }
}
