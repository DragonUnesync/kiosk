package D1;

import A1.a;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a(7);

    /* renamed from: V  reason: collision with root package name */
    public final String f986V;

    /* renamed from: W  reason: collision with root package name */
    public final int f987W;

    /* renamed from: X  reason: collision with root package name */
    public final int f988X;

    /* renamed from: Y  reason: collision with root package name */
    public final long f989Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f990Z;

    /* renamed from: a0  reason: collision with root package name */
    public final i[] f991a0;

    public c(String str, int i, int i8, long j7, long j8, i[] iVarArr) {
        super("CHAP");
        this.f986V = str;
        this.f987W = i;
        this.f988X = i8;
        this.f989Y = j7;
        this.f990Z = j8;
        this.f991a0 = iVarArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f987W == cVar.f987W && this.f988X == cVar.f988X && this.f989Y == cVar.f989Y && this.f990Z == cVar.f990Z) {
            int i = z.f3748a;
            if (!Objects.equals(this.f986V, cVar.f986V) || !Arrays.equals(this.f991a0, cVar.f991a0)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i8 = (((((((527 + this.f987W) * 31) + this.f988X) * 31) + ((int) this.f989Y)) * 31) + ((int) this.f990Z)) * 31;
        String str = this.f986V;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i8 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f986V);
        parcel.writeInt(this.f987W);
        parcel.writeInt(this.f988X);
        parcel.writeLong(this.f989Y);
        parcel.writeLong(this.f990Z);
        i[] iVarArr = this.f991a0;
        parcel.writeInt(iVarArr.length);
        for (i writeParcelable : iVarArr) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f986V = readString;
        this.f987W = parcel.readInt();
        this.f988X = parcel.readInt();
        this.f989Y = parcel.readLong();
        this.f990Z = parcel.readLong();
        int readInt = parcel.readInt();
        this.f991a0 = new i[readInt];
        for (int i8 = 0; i8 < readInt; i8++) {
            this.f991a0[i8] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}
