package android.support.v4.media;

import M0.S;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new S(6);

    /* renamed from: U  reason: collision with root package name */
    public final int f7219U;

    /* renamed from: V  reason: collision with root package name */
    public final MediaDescriptionCompat f7220V;

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f7219U = parcel.readInt();
        this.f7220V = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f7219U + ", mDescription=" + this.f7220V + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7219U);
        this.f7220V.writeToParcel(parcel, i);
    }
}
