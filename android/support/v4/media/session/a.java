package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;

public final class a implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7258a;

    public /* synthetic */ a(int i) {
        this.f7258a = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f7258a) {
            case 0:
                ? obj = new Object();
                obj.f7235U = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 1:
                return new MediaSessionCompat$QueueItem(parcel);
            case 2:
                return new MediaSessionCompat$Token(parcel.readParcelable((ClassLoader) null));
            case 3:
                ? obj2 = new Object();
                obj2.f7238U = parcel.readInt();
                obj2.f7240W = parcel.readInt();
                obj2.f7241X = parcel.readInt();
                obj2.f7242Y = parcel.readInt();
                obj2.f7239V = parcel.readInt();
                return obj2;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.f7258a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 1:
                return new MediaSessionCompat$QueueItem[i];
            case 2:
                return new MediaSessionCompat$Token[i];
            case 3:
                return new ParcelableVolumeInfo[i];
            default:
                return new PlaybackStateCompat[i];
        }
    }
}
