package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* renamed from: U  reason: collision with root package name */
    public int f7238U;

    /* renamed from: V  reason: collision with root package name */
    public int f7239V;

    /* renamed from: W  reason: collision with root package name */
    public int f7240W;

    /* renamed from: X  reason: collision with root package name */
    public int f7241X;

    /* renamed from: Y  reason: collision with root package name */
    public int f7242Y;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7238U);
        parcel.writeInt(this.f7240W);
        parcel.writeInt(this.f7241X);
        parcel.writeInt(this.f7242Y);
        parcel.writeInt(this.f7239V);
    }
}
