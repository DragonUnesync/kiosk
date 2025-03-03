package androidx.recyclerview.widget;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new S(19);

    /* renamed from: U  reason: collision with root package name */
    public int f8495U;

    /* renamed from: V  reason: collision with root package name */
    public int f8496V;

    /* renamed from: W  reason: collision with root package name */
    public int f8497W;

    /* renamed from: X  reason: collision with root package name */
    public int[] f8498X;

    /* renamed from: Y  reason: collision with root package name */
    public int f8499Y;

    /* renamed from: Z  reason: collision with root package name */
    public int[] f8500Z;

    /* renamed from: a0  reason: collision with root package name */
    public ArrayList f8501a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f8502b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f8503c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f8504d0;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8495U);
        parcel.writeInt(this.f8496V);
        parcel.writeInt(this.f8497W);
        if (this.f8497W > 0) {
            parcel.writeIntArray(this.f8498X);
        }
        parcel.writeInt(this.f8499Y);
        if (this.f8499Y > 0) {
            parcel.writeIntArray(this.f8500Z);
        }
        parcel.writeInt(this.f8502b0 ? 1 : 0);
        parcel.writeInt(this.f8503c0 ? 1 : 0);
        parcel.writeInt(this.f8504d0 ? 1 : 0);
        parcel.writeList(this.f8501a0);
    }
}
