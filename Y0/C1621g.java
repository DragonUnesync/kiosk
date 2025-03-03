package y0;

import N.e;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import o.M;

/* renamed from: y0.g  reason: case insensitive filesystem */
public final class C1621g extends View.BaseSavedState {
    public static final Parcelable.Creator<C1621g> CREATOR = new M(1);

    /* renamed from: U  reason: collision with root package name */
    public int f16358U;

    public final String toString() {
        StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" scrollPosition=");
        return e.z(sb, this.f16358U, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f16358U);
    }
}
