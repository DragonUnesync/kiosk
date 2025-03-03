package android.support.v4.media;

import M0.S;
import Y.i;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.b;

@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new S(8);

    /* renamed from: U  reason: collision with root package name */
    public final Bundle f7230U;

    static {
        i iVar = new i((Object) null);
        iVar.put("android.media.metadata.TITLE", 1);
        iVar.put("android.media.metadata.ARTIST", 1);
        iVar.put("android.media.metadata.DURATION", 0);
        iVar.put("android.media.metadata.ALBUM", 1);
        iVar.put("android.media.metadata.AUTHOR", 1);
        iVar.put("android.media.metadata.WRITER", 1);
        iVar.put("android.media.metadata.COMPOSER", 1);
        iVar.put("android.media.metadata.COMPILATION", 1);
        iVar.put("android.media.metadata.DATE", 1);
        iVar.put("android.media.metadata.YEAR", 0);
        iVar.put("android.media.metadata.GENRE", 1);
        iVar.put("android.media.metadata.TRACK_NUMBER", 0);
        iVar.put("android.media.metadata.NUM_TRACKS", 0);
        iVar.put("android.media.metadata.DISC_NUMBER", 0);
        iVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        iVar.put("android.media.metadata.ART", 2);
        iVar.put("android.media.metadata.ART_URI", 1);
        iVar.put("android.media.metadata.ALBUM_ART", 2);
        iVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        iVar.put("android.media.metadata.USER_RATING", 3);
        iVar.put("android.media.metadata.RATING", 3);
        iVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        iVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        iVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        iVar.put("android.media.metadata.DISPLAY_ICON", 2);
        iVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        iVar.put("android.media.metadata.MEDIA_ID", 1);
        iVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        iVar.put("android.media.metadata.MEDIA_URI", 1);
        iVar.put("android.media.metadata.ADVERTISEMENT", 0);
        iVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f7230U = parcel.readBundle(b.class.getClassLoader());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f7230U);
    }
}
