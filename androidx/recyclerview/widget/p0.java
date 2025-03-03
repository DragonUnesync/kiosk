package androidx.recyclerview.widget;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new S(18);

    /* renamed from: U  reason: collision with root package name */
    public int f8487U;

    /* renamed from: V  reason: collision with root package name */
    public int f8488V;

    /* renamed from: W  reason: collision with root package name */
    public int[] f8489W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f8490X;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f8487U + ", mGapDir=" + this.f8488V + ", mHasUnwantedGapAfter=" + this.f8490X + ", mGapPerSpan=" + Arrays.toString(this.f8489W) + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8487U);
        parcel.writeInt(this.f8488V);
        parcel.writeInt(this.f8490X ? 1 : 0);
        int[] iArr = this.f8489W;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.f8489W);
    }
}
