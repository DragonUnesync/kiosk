package m3;

import Q0.d;
import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: m3.b  reason: case insensitive filesystem */
public final class C1210b extends d {

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f13350W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f13351X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1210b(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 4);
        this.f13350W = i;
        switch (i) {
            case 1:
                this.f13351X = carouselLayoutManager;
                super(0, 4);
                return;
            default:
                this.f13351X = carouselLayoutManager;
                return;
        }
    }

    public final int e() {
        switch (this.f13350W) {
            case 0:
                return this.f13351X.f8322i0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f13351X;
                return carouselLayoutManager.f8322i0 - carouselLayoutManager.getPaddingBottom();
        }
    }

    public final int f() {
        switch (this.f13350W) {
            case 0:
                return this.f13351X.getPaddingLeft();
            default:
                return 0;
        }
    }

    public final int g() {
        switch (this.f13350W) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f13351X;
                return carouselLayoutManager.f8321h0 - carouselLayoutManager.getPaddingRight();
            default:
                return this.f13351X.f8321h0;
        }
    }

    public final int h() {
        switch (this.f13350W) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f13351X;
                if (carouselLayoutManager.P0()) {
                    return carouselLayoutManager.f8321h0;
                }
                return 0;
        }
    }

    public final int i() {
        switch (this.f13350W) {
            case 0:
                return 0;
            default:
                return this.f13351X.getPaddingTop();
        }
    }
}
