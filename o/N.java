package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class N extends View.BaseSavedState {
    public static final Parcelable.Creator<N> CREATOR = new M(0);

    /* renamed from: U  reason: collision with root package name */
    public boolean f13862U;

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f13862U ? (byte) 1 : 0);
    }
}
