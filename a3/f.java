package A3;

import B0.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class f extends b {
    public static final Parcelable.Creator<f> CREATOR = new e(0);

    /* renamed from: W  reason: collision with root package name */
    public final int f88W;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f88W = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f88W);
    }

    public f(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f88W = sideSheetBehavior.f9376h;
    }
}
