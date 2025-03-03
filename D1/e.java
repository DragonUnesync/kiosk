package D1;

import A1.a;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a(9);

    /* renamed from: V  reason: collision with root package name */
    public final String f997V;

    /* renamed from: W  reason: collision with root package name */
    public final String f998W;

    /* renamed from: X  reason: collision with root package name */
    public final String f999X;

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f997V = str;
        this.f998W = str2;
        this.f999X = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        int i = z.f3748a;
        if (!Objects.equals(this.f998W, eVar.f998W) || !Objects.equals(this.f997V, eVar.f997V) || !Objects.equals(this.f999X, eVar.f999X)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i8;
        int i9 = 0;
        String str = this.f997V;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i10 = (527 + i) * 31;
        String str2 = this.f998W;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (i10 + i8) * 31;
        String str3 = this.f999X;
        if (str3 != null) {
            i9 = str3.hashCode();
        }
        return i11 + i9;
    }

    public final String toString() {
        return this.f1009U + ": language=" + this.f997V + ", description=" + this.f998W + ", text=" + this.f999X;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1009U);
        parcel.writeString(this.f997V);
        parcel.writeString(this.f999X);
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f997V = readString;
        this.f998W = parcel.readString();
        this.f999X = parcel.readString();
    }
}
