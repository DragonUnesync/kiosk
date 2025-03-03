package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.emoji2.text.f;

/* renamed from: androidx.recyclerview.widget.z  reason: case insensitive filesystem */
public final class C0514z extends f {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8561d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0514z(Q q7, int i) {
        super(q7);
        this.f8561d = i;
    }

    public final int b(View view) {
        switch (this.f8561d) {
            case 0:
                ((Q) this.f7786b).getClass();
                return Q.O(view) + ((S) view.getLayoutParams()).rightMargin;
            default:
                ((Q) this.f7786b).getClass();
                return Q.J(view) + ((S) view.getLayoutParams()).bottomMargin;
        }
    }

    public final int c(View view) {
        switch (this.f8561d) {
            case 0:
                S s8 = (S) view.getLayoutParams();
                ((Q) this.f7786b).getClass();
                return Q.N(view) + s8.leftMargin + s8.rightMargin;
            default:
                S s9 = (S) view.getLayoutParams();
                ((Q) this.f7786b).getClass();
                return Q.M(view) + s9.topMargin + s9.bottomMargin;
        }
    }

    public final int d(View view) {
        switch (this.f8561d) {
            case 0:
                S s8 = (S) view.getLayoutParams();
                ((Q) this.f7786b).getClass();
                return Q.M(view) + s8.topMargin + s8.bottomMargin;
            default:
                S s9 = (S) view.getLayoutParams();
                ((Q) this.f7786b).getClass();
                return Q.N(view) + s9.leftMargin + s9.rightMargin;
        }
    }

    public final int e(View view) {
        switch (this.f8561d) {
            case 0:
                ((Q) this.f7786b).getClass();
                return Q.L(view) - ((S) view.getLayoutParams()).leftMargin;
            default:
                ((Q) this.f7786b).getClass();
                return Q.P(view) - ((S) view.getLayoutParams()).topMargin;
        }
    }

    public final int f() {
        switch (this.f8561d) {
            case 0:
                return ((Q) this.f7786b).f8321h0;
            default:
                return ((Q) this.f7786b).f8322i0;
        }
    }

    public final int g() {
        switch (this.f8561d) {
            case 0:
                Q q7 = (Q) this.f7786b;
                return q7.f8321h0 - q7.getPaddingRight();
            default:
                Q q8 = (Q) this.f7786b;
                return q8.f8322i0 - q8.getPaddingBottom();
        }
    }

    public final int h() {
        switch (this.f8561d) {
            case 0:
                return ((Q) this.f7786b).getPaddingRight();
            default:
                return ((Q) this.f7786b).getPaddingBottom();
        }
    }

    public final int i() {
        switch (this.f8561d) {
            case 0:
                return ((Q) this.f7786b).f8319f0;
            default:
                return ((Q) this.f7786b).f8320g0;
        }
    }

    public final int j() {
        switch (this.f8561d) {
            case 0:
                return ((Q) this.f7786b).f8320g0;
            default:
                return ((Q) this.f7786b).f8319f0;
        }
    }

    public final int k() {
        switch (this.f8561d) {
            case 0:
                return ((Q) this.f7786b).getPaddingLeft();
            default:
                return ((Q) this.f7786b).getPaddingTop();
        }
    }

    public final int l() {
        switch (this.f8561d) {
            case 0:
                Q q7 = (Q) this.f7786b;
                return (q7.f8321h0 - q7.getPaddingLeft()) - q7.getPaddingRight();
            default:
                Q q8 = (Q) this.f7786b;
                return (q8.f8322i0 - q8.getPaddingTop()) - q8.getPaddingBottom();
        }
    }

    public final int n(View view) {
        switch (this.f8561d) {
            case 0:
                Rect rect = (Rect) this.f7787c;
                ((Q) this.f7786b).V(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.f7787c;
                ((Q) this.f7786b).V(view, rect2);
                return rect2.bottom;
        }
    }

    public final int o(View view) {
        switch (this.f8561d) {
            case 0:
                Rect rect = (Rect) this.f7787c;
                ((Q) this.f7786b).V(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.f7787c;
                ((Q) this.f7786b).V(view, rect2);
                return rect2.top;
        }
    }

    public final void p(int i) {
        switch (this.f8561d) {
            case 0:
                ((Q) this.f7786b).Z(i);
                return;
            default:
                ((Q) this.f7786b).a0(i);
                return;
        }
    }
}
