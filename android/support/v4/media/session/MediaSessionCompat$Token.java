package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new a(2);

    /* renamed from: U  reason: collision with root package name */
    public final Object f7236U;

    /* renamed from: V  reason: collision with root package name */
    public final Parcelable f7237V;

    public MediaSessionCompat$Token(Parcelable parcelable) {
        this.f7237V = parcelable;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Parcelable parcelable = this.f7237V;
        if (parcelable != null) {
            Parcelable parcelable2 = mediaSessionCompat$Token.f7237V;
            if (parcelable2 == null) {
                return false;
            }
            return parcelable.equals(parcelable2);
        } else if (mediaSessionCompat$Token.f7237V == null) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        Parcelable parcelable = this.f7237V;
        if (parcelable == null) {
            return 0;
        }
        return parcelable.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7237V, i);
    }
}
