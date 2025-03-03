package e3;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

public final class e extends ViewGroup.MarginLayoutParams implements b {
    public static final Parcelable.Creator<e> CREATOR = new S(25);

    /* renamed from: U  reason: collision with root package name */
    public int f11220U;

    /* renamed from: V  reason: collision with root package name */
    public float f11221V;

    /* renamed from: W  reason: collision with root package name */
    public float f11222W;

    /* renamed from: X  reason: collision with root package name */
    public int f11223X;

    /* renamed from: Y  reason: collision with root package name */
    public float f11224Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f11225Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f11226a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f11227b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f11228c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f11229d0;

    public final void a(int i) {
        this.f11226a0 = i;
    }

    public final int b() {
        return this.height;
    }

    public final int c() {
        return this.width;
    }

    public final float d() {
        return this.f11221V;
    }

    public final int describeContents() {
        return 0;
    }

    public final float f() {
        return this.f11224Y;
    }

    public final int g() {
        return this.f11223X;
    }

    public final int getOrder() {
        return this.f11220U;
    }

    public final float h() {
        return this.f11222W;
    }

    public final int j() {
        return this.rightMargin;
    }

    public final int l() {
        return this.f11226a0;
    }

    public final int m() {
        return this.f11225Z;
    }

    public final boolean n() {
        return this.f11229d0;
    }

    public final int o() {
        return this.f11228c0;
    }

    public final void p(int i) {
        this.f11225Z = i;
    }

    public final int q() {
        return this.bottomMargin;
    }

    public final int r() {
        return this.leftMargin;
    }

    public final int t() {
        return this.f11227b0;
    }

    public final int u() {
        return this.topMargin;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11220U);
        parcel.writeFloat(this.f11221V);
        parcel.writeFloat(this.f11222W);
        parcel.writeInt(this.f11223X);
        parcel.writeFloat(this.f11224Y);
        parcel.writeInt(this.f11225Z);
        parcel.writeInt(this.f11226a0);
        parcel.writeInt(this.f11227b0);
        parcel.writeInt(this.f11228c0);
        parcel.writeByte(this.f11229d0 ? (byte) 1 : 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }
}
