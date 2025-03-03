package android.support.v4.media.session;

import Q0.g;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

@SuppressLint({"BanParcelableUsage"})
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a(1);

    /* renamed from: U  reason: collision with root package name */
    public final MediaDescriptionCompat f7233U;

    /* renamed from: V  reason: collision with root package name */
    public final long f7234V;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f7233U = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f7234V = parcel.readLong();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f7233U);
        sb.append(", Id=");
        return g.o(sb, this.f7234V, " }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.f7233U.writeToParcel(parcel, i);
        parcel.writeLong(this.f7234V);
    }
}
