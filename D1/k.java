package D1;

import A1.a;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a(11);

    /* renamed from: V  reason: collision with root package name */
    public final String f1011V;

    /* renamed from: W  reason: collision with root package name */
    public final String f1012W;

    /* renamed from: X  reason: collision with root package name */
    public final String f1013X;

    public k(String str, String str2, String str3) {
        super("----");
        this.f1011V = str;
        this.f1012W = str2;
        this.f1013X = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        int i = z.f3748a;
        if (!Objects.equals(this.f1012W, kVar.f1012W) || !Objects.equals(this.f1011V, kVar.f1011V) || !Objects.equals(this.f1013X, kVar.f1013X)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i8;
        int i9 = 0;
        String str = this.f1011V;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = (527 + i) * 31;
        String str2 = this.f1012W;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str3 = this.f1013X;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }

    public final String toString() {
        return this.f1009U + ": domain=" + this.f1011V + ", description=" + this.f1012W;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1009U);
        parcel.writeString(this.f1011V);
        parcel.writeString(this.f1013X);
    }

    public k(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f1011V = readString;
        this.f1012W = parcel.readString();
        this.f1013X = parcel.readString();
    }
}
