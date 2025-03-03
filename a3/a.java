package A3;

import D7.b;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class a extends b {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f77U;

    /* renamed from: V  reason: collision with root package name */
    public final SideSheetBehavior f78V;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f77U = i;
        this.f78V = sideSheetBehavior;
    }

    public final boolean B(float f8) {
        switch (this.f77U) {
            case 0:
                return f8 > 0.0f;
            default:
                return f8 < 0.0f;
        }
    }

    public final boolean D(View view) {
        switch (this.f77U) {
            case 0:
                if (view.getRight() < (q() - r()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (q() + this.f78V.f9380m) / 2) {
                    return true;
                }
                return false;
        }
    }

    public final boolean E(float f8, float f9) {
        switch (this.f77U) {
            case 0:
                if (Math.abs(f8) > Math.abs(f9)) {
                    float abs = Math.abs(f8);
                    this.f78V.getClass();
                    if (abs > ((float) 500)) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f8) > Math.abs(f9)) {
                    float abs2 = Math.abs(f8);
                    this.f78V.getClass();
                    if (abs2 > ((float) 500)) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final boolean M(View view, float f8) {
        switch (this.f77U) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f78V;
                float abs = Math.abs((f8 * sideSheetBehavior.f9378k) + ((float) view.getLeft()));
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                    return true;
                }
                return false;
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f78V;
                float abs2 = Math.abs((f8 * sideSheetBehavior2.f9378k) + ((float) view.getRight()));
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    public final void Q(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i8) {
        switch (this.f77U) {
            case 0:
                if (i <= this.f78V.f9380m) {
                    marginLayoutParams.leftMargin = i8;
                    return;
                }
                return;
            default:
                int i9 = this.f78V.f9380m;
                if (i <= i9) {
                    marginLayoutParams.rightMargin = i9 - i;
                    return;
                }
                return;
        }
    }

    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f77U) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float c(int i) {
        switch (this.f77U) {
            case 0:
                float r8 = (float) r();
                return (((float) i) - r8) / (((float) q()) - r8);
            default:
                float f8 = (float) this.f78V.f9380m;
                return (f8 - ((float) i)) / (f8 - ((float) q()));
        }
    }

    public final int q() {
        switch (this.f77U) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f78V;
                return Math.max(0, sideSheetBehavior.f9381n + sideSheetBehavior.f9382o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f78V;
                return Math.max(0, (sideSheetBehavior2.f9380m - sideSheetBehavior2.f9379l) - sideSheetBehavior2.f9382o);
        }
    }

    public final int r() {
        switch (this.f77U) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f78V;
                return (-sideSheetBehavior.f9379l) - sideSheetBehavior.f9382o;
            default:
                return this.f78V.f9380m;
        }
    }

    public final int t() {
        switch (this.f77U) {
            case 0:
                return this.f78V.f9382o;
            default:
                return this.f78V.f9380m;
        }
    }

    public final int u() {
        switch (this.f77U) {
            case 0:
                return -this.f78V.f9379l;
            default:
                return q();
        }
    }

    public final int v(View view) {
        switch (this.f77U) {
            case 0:
                return view.getRight() + this.f78V.f9382o;
            default:
                return view.getLeft() - this.f78V.f9382o;
        }
    }

    public final int w(CoordinatorLayout coordinatorLayout) {
        switch (this.f77U) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int x() {
        switch (this.f77U) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }
}
