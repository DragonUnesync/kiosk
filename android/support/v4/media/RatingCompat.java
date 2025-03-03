package android.support.v4.media;

import M0.S;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new S(9);

    /* renamed from: U  reason: collision with root package name */
    public final int f7231U;

    /* renamed from: V  reason: collision with root package name */
    public final float f7232V;

    public RatingCompat(int i, float f8) {
        this.f7231U = i;
        this.f7232V = f8;
    }

    public final int describeContents() {
        return this.f7231U;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f7231U);
        sb.append(" rating=");
        float f8 = this.f7232V;
        if (f8 < 0.0f) {
            str = "unrated";
        } else {
            str = String.valueOf(f8);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7231U);
        parcel.writeFloat(this.f7232V);
    }
}
