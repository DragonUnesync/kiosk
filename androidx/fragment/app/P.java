package androidx.fragment.app;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;

public final class P implements Parcelable {
    public static final Parcelable.Creator<P> CREATOR = new S(16);

    /* renamed from: U  reason: collision with root package name */
    public final String f7909U;

    /* renamed from: V  reason: collision with root package name */
    public final String f7910V;

    /* renamed from: W  reason: collision with root package name */
    public final boolean f7911W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f7912X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f7913Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f7914Z;

    /* renamed from: a0  reason: collision with root package name */
    public final String f7915a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f7916b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f7917c0;

    /* renamed from: d0  reason: collision with root package name */
    public final boolean f7918d0;

    /* renamed from: e0  reason: collision with root package name */
    public final boolean f7919e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f7920f0;

    /* renamed from: g0  reason: collision with root package name */
    public final String f7921g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f7922h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f7923i0;

    public P(C0470v vVar) {
        this.f7909U = vVar.getClass().getName();
        this.f7910V = vVar.f8063Y;
        this.f7911W = vVar.f8072h0;
        this.f7912X = vVar.f8074j0;
        this.f7913Y = vVar.f8081r0;
        this.f7914Z = vVar.f8082s0;
        this.f7915a0 = vVar.f8083t0;
        this.f7916b0 = vVar.f8086w0;
        this.f7917c0 = vVar.f8070f0;
        this.f7918d0 = vVar.f8085v0;
        this.f7919e0 = vVar.f8084u0;
        this.f7920f0 = vVar.f8052H0.ordinal();
        this.f7921g0 = vVar.f8066b0;
        this.f7922h0 = vVar.f8067c0;
        this.f7923i0 = vVar.f8047C0;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f7909U);
        sb.append(" (");
        sb.append(this.f7910V);
        sb.append(")}:");
        if (this.f7911W) {
            sb.append(" fromLayout");
        }
        if (this.f7912X) {
            sb.append(" dynamicContainer");
        }
        int i = this.f7914Z;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f7915a0;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f7916b0) {
            sb.append(" retainInstance");
        }
        if (this.f7917c0) {
            sb.append(" removing");
        }
        if (this.f7918d0) {
            sb.append(" detached");
        }
        if (this.f7919e0) {
            sb.append(" hidden");
        }
        String str2 = this.f7921g0;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f7922h0);
        }
        if (this.f7923i0) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7909U);
        parcel.writeString(this.f7910V);
        parcel.writeInt(this.f7911W ? 1 : 0);
        parcel.writeInt(this.f7912X ? 1 : 0);
        parcel.writeInt(this.f7913Y);
        parcel.writeInt(this.f7914Z);
        parcel.writeString(this.f7915a0);
        parcel.writeInt(this.f7916b0 ? 1 : 0);
        parcel.writeInt(this.f7917c0 ? 1 : 0);
        parcel.writeInt(this.f7918d0 ? 1 : 0);
        parcel.writeInt(this.f7919e0 ? 1 : 0);
        parcel.writeInt(this.f7920f0);
        parcel.writeString(this.f7921g0);
        parcel.writeInt(this.f7922h0);
        parcel.writeInt(this.f7923i0 ? 1 : 0);
    }

    public P(Parcel parcel) {
        this.f7909U = parcel.readString();
        this.f7910V = parcel.readString();
        boolean z = false;
        this.f7911W = parcel.readInt() != 0;
        this.f7912X = parcel.readInt() != 0;
        this.f7913Y = parcel.readInt();
        this.f7914Z = parcel.readInt();
        this.f7915a0 = parcel.readString();
        this.f7916b0 = parcel.readInt() != 0;
        this.f7917c0 = parcel.readInt() != 0;
        this.f7918d0 = parcel.readInt() != 0;
        this.f7919e0 = parcel.readInt() != 0;
        this.f7920f0 = parcel.readInt();
        this.f7921g0 = parcel.readString();
        this.f7922h0 = parcel.readInt();
        this.f7923i0 = parcel.readInt() != 0 ? true : z;
    }
}
