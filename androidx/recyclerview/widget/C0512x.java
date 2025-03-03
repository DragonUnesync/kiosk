package androidx.recyclerview.widget;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: androidx.recyclerview.widget.x  reason: case insensitive filesystem */
public final class C0512x implements Parcelable {
    public static final Parcelable.Creator<C0512x> CREATOR = new S(17);

    /* renamed from: U  reason: collision with root package name */
    public int f8544U;

    /* renamed from: V  reason: collision with root package name */
    public int f8545V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f8546W;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8544U);
        parcel.writeInt(this.f8545V);
        parcel.writeInt(this.f8546W ? 1 : 0);
    }
}
