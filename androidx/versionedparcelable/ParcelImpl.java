package androidx.versionedparcelable;

import M0.S;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import i2.C1097b;
import i2.C1098c;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new S(28);

    /* renamed from: U  reason: collision with root package name */
    public final C1098c f8599U;

    public ParcelImpl(Parcel parcel) {
        this.f8599U = new C1097b(parcel).h();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        new C1097b(parcel).l(this.f8599U);
    }
}
