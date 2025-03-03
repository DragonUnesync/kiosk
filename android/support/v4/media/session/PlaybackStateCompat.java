package android.support.v4.media.session;

import Q0.g;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);

    /* renamed from: U  reason: collision with root package name */
    public final int f7243U;

    /* renamed from: V  reason: collision with root package name */
    public final long f7244V;

    /* renamed from: W  reason: collision with root package name */
    public final long f7245W;

    /* renamed from: X  reason: collision with root package name */
    public final float f7246X;

    /* renamed from: Y  reason: collision with root package name */
    public final long f7247Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f7248Z;

    /* renamed from: a0  reason: collision with root package name */
    public final CharSequence f7249a0;

    /* renamed from: b0  reason: collision with root package name */
    public final long f7250b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ArrayList f7251c0;

    /* renamed from: d0  reason: collision with root package name */
    public final long f7252d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Bundle f7253e0;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: U  reason: collision with root package name */
        public final String f7254U;

        /* renamed from: V  reason: collision with root package name */
        public final CharSequence f7255V;

        /* renamed from: W  reason: collision with root package name */
        public final int f7256W;

        /* renamed from: X  reason: collision with root package name */
        public final Bundle f7257X;

        public CustomAction(Parcel parcel) {
            this.f7254U = parcel.readString();
            this.f7255V = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f7256W = parcel.readInt();
            this.f7257X = parcel.readBundle(b.class.getClassLoader());
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + this.f7255V + ", mIcon=" + this.f7256W + ", mExtras=" + this.f7257X;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f7254U);
            TextUtils.writeToParcel(this.f7255V, parcel, i);
            parcel.writeInt(this.f7256W);
            parcel.writeBundle(this.f7257X);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f7243U = parcel.readInt();
        this.f7244V = parcel.readLong();
        this.f7246X = parcel.readFloat();
        this.f7250b0 = parcel.readLong();
        this.f7245W = parcel.readLong();
        this.f7247Y = parcel.readLong();
        this.f7249a0 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7251c0 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f7252d0 = parcel.readLong();
        this.f7253e0 = parcel.readBundle(b.class.getClassLoader());
        this.f7248Z = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f7243U);
        sb.append(", position=");
        sb.append(this.f7244V);
        sb.append(", buffered position=");
        sb.append(this.f7245W);
        sb.append(", speed=");
        sb.append(this.f7246X);
        sb.append(", updated=");
        sb.append(this.f7250b0);
        sb.append(", actions=");
        sb.append(this.f7247Y);
        sb.append(", error code=");
        sb.append(this.f7248Z);
        sb.append(", error message=");
        sb.append(this.f7249a0);
        sb.append(", custom actions=");
        sb.append(this.f7251c0);
        sb.append(", active item id=");
        return g.o(sb, this.f7252d0, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7243U);
        parcel.writeLong(this.f7244V);
        parcel.writeFloat(this.f7246X);
        parcel.writeLong(this.f7250b0);
        parcel.writeLong(this.f7245W);
        parcel.writeLong(this.f7247Y);
        TextUtils.writeToParcel(this.f7249a0, parcel, i);
        parcel.writeTypedList(this.f7251c0);
        parcel.writeLong(this.f7252d0);
        parcel.writeBundle(this.f7253e0);
        parcel.writeInt(this.f7248Z);
    }
}
