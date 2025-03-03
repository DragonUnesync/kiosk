package androidx.fragment.app;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class M implements Parcelable {
    public static final Parcelable.Creator<M> CREATOR = new S(15);

    /* renamed from: U  reason: collision with root package name */
    public ArrayList f7896U;

    /* renamed from: V  reason: collision with root package name */
    public ArrayList f7897V;

    /* renamed from: W  reason: collision with root package name */
    public C0451b[] f7898W;

    /* renamed from: X  reason: collision with root package name */
    public int f7899X;

    /* renamed from: Y  reason: collision with root package name */
    public String f7900Y;

    /* renamed from: Z  reason: collision with root package name */
    public ArrayList f7901Z;

    /* renamed from: a0  reason: collision with root package name */
    public ArrayList f7902a0;

    /* renamed from: b0  reason: collision with root package name */
    public ArrayList f7903b0;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f7896U);
        parcel.writeStringList(this.f7897V);
        parcel.writeTypedArray(this.f7898W, i);
        parcel.writeInt(this.f7899X);
        parcel.writeString(this.f7900Y);
        parcel.writeStringList(this.f7901Z);
        parcel.writeTypedList(this.f7902a0);
        parcel.writeTypedList(this.f7903b0);
    }
}
