package f0;

import d0.C0627a;
import d0.d;

/* renamed from: f0.a  reason: case insensitive filesystem */
public final class C0873a extends C0875c {

    /* renamed from: d0  reason: collision with root package name */
    public int f11290d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f11291e0;

    /* renamed from: f0  reason: collision with root package name */
    public C0627a f11292f0;

    public final void f(d dVar, boolean z) {
        int i = this.f11290d0;
        this.f11291e0 = i;
        if (z) {
            if (i == 5) {
                this.f11291e0 = 1;
            } else if (i == 6) {
                this.f11291e0 = 0;
            }
        } else if (i == 5) {
            this.f11291e0 = 0;
        } else if (i == 6) {
            this.f11291e0 = 1;
        }
        if (dVar instanceof C0627a) {
            ((C0627a) dVar).f9558f0 = this.f11291e0;
        }
    }

    public int getMargin() {
        return this.f11292f0.f9560h0;
    }

    public int getType() {
        return this.f11290d0;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f11292f0.f9559g0 = z;
    }

    public void setDpMargin(int i) {
        this.f11292f0.f9560h0 = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f11292f0.f9560h0 = i;
    }

    public void setType(int i) {
        this.f11290d0 = i;
    }
}
