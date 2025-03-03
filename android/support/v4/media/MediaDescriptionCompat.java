package android.support.v4.media;

import M0.S;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new S(7);

    /* renamed from: U  reason: collision with root package name */
    public final String f7221U;

    /* renamed from: V  reason: collision with root package name */
    public final CharSequence f7222V;

    /* renamed from: W  reason: collision with root package name */
    public final CharSequence f7223W;

    /* renamed from: X  reason: collision with root package name */
    public final CharSequence f7224X;

    /* renamed from: Y  reason: collision with root package name */
    public final Bitmap f7225Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Uri f7226Z;

    /* renamed from: a0  reason: collision with root package name */
    public final Bundle f7227a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Uri f7228b0;

    /* renamed from: c0  reason: collision with root package name */
    public MediaDescription f7229c0;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f7221U = str;
        this.f7222V = charSequence;
        this.f7223W = charSequence2;
        this.f7224X = charSequence3;
        this.f7225Y = bitmap;
        this.f7226Z = uri;
        this.f7227a0 = bundle;
        this.f7228b0 = uri2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f7222V + ", " + this.f7223W + ", " + this.f7224X;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i8 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = this.f7229c0;
        if (mediaDescription == null) {
            MediaDescription.Builder b8 = a.b();
            a.n(b8, this.f7221U);
            a.p(b8, this.f7222V);
            a.o(b8, this.f7223W);
            a.j(b8, this.f7224X);
            a.l(b8, this.f7225Y);
            a.m(b8, this.f7226Z);
            Bundle bundle2 = this.f7227a0;
            Uri uri = this.f7228b0;
            if (i8 >= 23 || uri == null) {
                a.k(b8, bundle2);
            } else {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                a.k(b8, bundle);
            }
            if (i8 >= 23) {
                b.b(b8, uri);
            }
            mediaDescription = a.a(b8);
            this.f7229c0 = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }
}
