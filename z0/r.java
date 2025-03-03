package Z0;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new S(5);

    /* renamed from: U  reason: collision with root package name */
    public final int f6929U;

    /* renamed from: V  reason: collision with root package name */
    public final int f6930V;

    /* renamed from: W  reason: collision with root package name */
    public final String f6931W;

    /* renamed from: X  reason: collision with root package name */
    public final String f6932X;

    /* renamed from: Y  reason: collision with root package name */
    public final String f6933Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f6934Z;

    public r(int i, int i8, String str, String str2, String str3, String str4) {
        this.f6929U = i;
        this.f6930V = i8;
        this.f6931W = str;
        this.f6932X = str2;
        this.f6933Y = str3;
        this.f6934Z = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f6929U != rVar.f6929U || this.f6930V != rVar.f6930V || !TextUtils.equals(this.f6931W, rVar.f6931W) || !TextUtils.equals(this.f6932X, rVar.f6932X) || !TextUtils.equals(this.f6933Y, rVar.f6933Y) || !TextUtils.equals(this.f6934Z, rVar.f6934Z)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i8;
        int i9;
        int i10 = ((this.f6929U * 31) + this.f6930V) * 31;
        int i11 = 0;
        String str = this.f6931W;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i12 = (i10 + i) * 31;
        String str2 = this.f6932X;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i13 = (i12 + i8) * 31;
        String str3 = this.f6933Y;
        if (str3 != null) {
            i9 = str3.hashCode();
        } else {
            i9 = 0;
        }
        int i14 = (i13 + i9) * 31;
        String str4 = this.f6934Z;
        if (str4 != null) {
            i11 = str4.hashCode();
        }
        return i14 + i11;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6929U);
        parcel.writeInt(this.f6930V);
        parcel.writeString(this.f6931W);
        parcel.writeString(this.f6932X);
        parcel.writeString(this.f6933Y);
        parcel.writeString(this.f6934Z);
    }

    public r(Parcel parcel) {
        this.f6929U = parcel.readInt();
        this.f6930V = parcel.readInt();
        this.f6931W = parcel.readString();
        this.f6932X = parcel.readString();
        this.f6933Y = parcel.readString();
        this.f6934Z = parcel.readString();
    }
}
