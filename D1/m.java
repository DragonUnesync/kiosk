package D1;

import A1.a;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a(13);

    /* renamed from: V  reason: collision with root package name */
    public final String f1019V;

    /* renamed from: W  reason: collision with root package name */
    public final byte[] f1020W;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f1019V = str;
        this.f1020W = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        int i = z.f3748a;
        if (!Objects.equals(this.f1019V, mVar.f1019V) || !Arrays.equals(this.f1020W, mVar.f1020W)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        String str = this.f1019V;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.f1020W) + ((527 + i) * 31);
    }

    public final String toString() {
        return this.f1009U + ": owner=" + this.f1019V;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1019V);
        parcel.writeByteArray(this.f1020W);
    }

    public m(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f1019V = readString;
        this.f1020W = parcel.createByteArray();
    }
}
