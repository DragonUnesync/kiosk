package androidx.recyclerview.widget;

import android.view.View;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8302a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8303b;

    public /* synthetic */ O(int i, Object obj) {
        this.f8302a = i;
        this.f8303b = obj;
    }

    public int a(View view) {
        switch (this.f8302a) {
            case 0:
                ((Q) this.f8303b).getClass();
                return Q.O(view) + ((S) view.getLayoutParams()).rightMargin;
            default:
                ((Q) this.f8303b).getClass();
                return Q.J(view) + ((S) view.getLayoutParams()).bottomMargin;
        }
    }

    public int b(View view) {
        switch (this.f8302a) {
            case 0:
                ((Q) this.f8303b).getClass();
                return Q.L(view) - ((S) view.getLayoutParams()).leftMargin;
            default:
                ((Q) this.f8303b).getClass();
                return Q.P(view) - ((S) view.getLayoutParams()).topMargin;
        }
    }

    public int c() {
        switch (this.f8302a) {
            case 0:
                Q q7 = (Q) this.f8303b;
                return q7.f8321h0 - q7.getPaddingRight();
            default:
                Q q8 = (Q) this.f8303b;
                return q8.f8322i0 - q8.getPaddingBottom();
        }
    }

    public int d() {
        switch (this.f8302a) {
            case 0:
                return ((Q) this.f8303b).getPaddingLeft();
            default:
                return ((Q) this.f8303b).getPaddingTop();
        }
    }
}
