package D1;

import A1.a;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a(8);

    /* renamed from: V  reason: collision with root package name */
    public final String f992V;

    /* renamed from: W  reason: collision with root package name */
    public final boolean f993W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f994X;

    /* renamed from: Y  reason: collision with root package name */
    public final String[] f995Y;

    /* renamed from: Z  reason: collision with root package name */
    public final i[] f996Z;

    public d(String str, boolean z, boolean z6, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f992V = str;
        this.f993W = z;
        this.f994X = z6;
        this.f995Y = strArr;
        this.f996Z = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f993W == dVar.f993W && this.f994X == dVar.f994X) {
            int i = z.f3748a;
            if (!Objects.equals(this.f992V, dVar.f992V) || !Arrays.equals(this.f995Y, dVar.f995Y) || !Arrays.equals(this.f996Z, dVar.f996Z)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i8 = (((true + (this.f993W ? 1 : 0)) * 31) + (this.f994X ? 1 : 0)) * 31;
        String str = this.f992V;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i8 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f992V);
        parcel.writeByte(this.f993W ? (byte) 1 : 0);
        parcel.writeByte(this.f994X ? (byte) 1 : 0);
        parcel.writeStringArray(this.f995Y);
        i[] iVarArr = this.f996Z;
        parcel.writeInt(iVarArr.length);
        for (i writeParcelable : iVarArr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f992V = readString;
        this.f993W = parcel.readByte() != 0;
        this.f994X = parcel.readByte() != 0;
        this.f995Y = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f996Z = new i[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f996Z[i8] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
