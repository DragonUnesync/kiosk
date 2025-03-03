package e3;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f11230a;

    /* renamed from: b  reason: collision with root package name */
    public int f11231b;

    /* renamed from: c  reason: collision with root package name */
    public int f11232c;

    /* renamed from: d  reason: collision with root package name */
    public int f11233d = 0;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11234f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11235g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ FlexboxLayoutManager f11236h;

    public f(FlexboxLayoutManager flexboxLayoutManager) {
        this.f11236h = flexboxLayoutManager;
    }

    public static void a(f fVar) {
        int i;
        int i8;
        FlexboxLayoutManager flexboxLayoutManager = fVar.f11236h;
        if (flexboxLayoutManager.j() || !flexboxLayoutManager.f9126n0) {
            if (fVar.e) {
                i = flexboxLayoutManager.f9133v0.g();
            } else {
                i = flexboxLayoutManager.f9133v0.k();
            }
            fVar.f11232c = i;
            return;
        }
        if (fVar.e) {
            i8 = flexboxLayoutManager.f9133v0.g();
        } else {
            i8 = flexboxLayoutManager.f8321h0 - flexboxLayoutManager.f9133v0.k();
        }
        fVar.f11232c = i8;
    }

    public static void b(f fVar) {
        fVar.f11230a = -1;
        fVar.f11231b = -1;
        fVar.f11232c = RecyclerView.UNDEFINED_DURATION;
        boolean z = false;
        fVar.f11234f = false;
        fVar.f11235g = false;
        FlexboxLayoutManager flexboxLayoutManager = fVar.f11236h;
        if (flexboxLayoutManager.j()) {
            int i = flexboxLayoutManager.f9123k0;
            if (i == 0) {
                if (flexboxLayoutManager.f9122j0 == 1) {
                    z = true;
                }
                fVar.e = z;
                return;
            }
            if (i == 2) {
                z = true;
            }
            fVar.e = z;
            return;
        }
        int i8 = flexboxLayoutManager.f9123k0;
        if (i8 == 0) {
            if (flexboxLayoutManager.f9122j0 == 3) {
                z = true;
            }
            fVar.e = z;
            return;
        }
        if (i8 == 2) {
            z = true;
        }
        fVar.e = z;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f11230a + ", mFlexLinePosition=" + this.f11231b + ", mCoordinate=" + this.f11232c + ", mPerpendicularCoordinate=" + this.f11233d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f11234f + ", mAssignedFromSavedState=" + this.f11235g + '}';
    }
}
