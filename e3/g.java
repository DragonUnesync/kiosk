package e3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.S;

public final class g extends S implements b {
    public static final Parcelable.Creator<g> CREATOR = new M0.S(26);

    /* renamed from: Y  reason: collision with root package name */
    public float f11237Y;

    /* renamed from: Z  reason: collision with root package name */
    public float f11238Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f11239a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f11240b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f11241c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f11242d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f11243e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f11244f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f11245g0;

    public final void a(int i) {
        this.f11242d0 = i;
    }

    public final int b() {
        return this.height;
    }

    public final int c() {
        return this.width;
    }

    public final float d() {
        return this.f11237Y;
    }

    public final int describeContents() {
        return 0;
    }

    public final float f() {
        return this.f11240b0;
    }

    public final int g() {
        return this.f11239a0;
    }

    public final int getOrder() {
        return 1;
    }

    public final float h() {
        return this.f11238Z;
    }

    public final int j() {
        return this.rightMargin;
    }

    public final int l() {
        return this.f11242d0;
    }

    public final int m() {
        return this.f11241c0;
    }

    public final boolean n() {
        return this.f11245g0;
    }

    public final int o() {
        return this.f11244f0;
    }

    public final void p(int i) {
        this.f11241c0 = i;
    }

    public final int q() {
        return this.bottomMargin;
    }

    public final int r() {
        return this.leftMargin;
    }

    public final int t() {
        return this.f11243e0;
    }

    public final int u() {
        return this.topMargin;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f11237Y);
        parcel.writeFloat(this.f11238Z);
        parcel.writeInt(this.f11239a0);
        parcel.writeFloat(this.f11240b0);
        parcel.writeInt(this.f11241c0);
        parcel.writeInt(this.f11242d0);
        parcel.writeInt(this.f11243e0);
        parcel.writeInt(this.f11244f0);
        parcel.writeByte(this.f11245g0 ? (byte) 1 : 0);
        parcel.writeInt(this.bottomMargin);
        parcel.writeInt(this.leftMargin);
        parcel.writeInt(this.rightMargin);
        parcel.writeInt(this.topMargin);
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
    }
}
