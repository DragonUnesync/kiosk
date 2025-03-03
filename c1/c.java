package C1;

import A1.a;
import M0.E;
import M0.G;
import M0.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class c implements G {
    public static final Parcelable.Creator<c> CREATOR = new a(4);

    /* renamed from: U  reason: collision with root package name */
    public final byte[] f539U;

    /* renamed from: V  reason: collision with root package name */
    public final String f540V;

    /* renamed from: W  reason: collision with root package name */
    public final String f541W;

    public c(String str, byte[] bArr, String str2) {
        this.f539U = bArr;
        this.f540V = str;
        this.f541W = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void e(E e) {
        String str = this.f540V;
        if (str != null) {
            e.f2792a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f539U, ((c) obj).f539U);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f539U);
    }

    public final /* synthetic */ r i() {
        return null;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        int length = this.f539U.length;
        return "ICY: title=\"" + this.f540V + "\", url=\"" + this.f541W + "\", rawMetadata.length=\"" + length + "\"";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f539U);
        parcel.writeString(this.f540V);
        parcel.writeString(this.f541W);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f539U = createByteArray;
        this.f540V = parcel.readString();
        this.f541W = parcel.readString();
    }
}
