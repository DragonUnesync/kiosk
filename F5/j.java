package F5;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class j extends View.BaseSavedState {
    public static final Parcelable.Creator<j> CREATOR = new a(25);

    /* renamed from: U  reason: collision with root package name */
    public final int f1591U;

    public j(Parcelable parcelable, int i) {
        super(parcelable);
        this.f1591U = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1591U);
    }

    public j(Parcel parcel) {
        super(parcel);
        this.f1591U = parcel.readInt();
    }
}
