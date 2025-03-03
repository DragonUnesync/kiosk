package D1;

import A1.a;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a(12);

    /* renamed from: V  reason: collision with root package name */
    public final int f1014V;

    /* renamed from: W  reason: collision with root package name */
    public final int f1015W;

    /* renamed from: X  reason: collision with root package name */
    public final int f1016X;

    /* renamed from: Y  reason: collision with root package name */
    public final int[] f1017Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int[] f1018Z;

    public l(int i, int i8, int[] iArr, int[] iArr2, int i9) {
        super("MLLT");
        this.f1014V = i;
        this.f1015W = i8;
        this.f1016X = i9;
        this.f1017Y = iArr;
        this.f1018Z = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f1014V == lVar.f1014V && this.f1015W == lVar.f1015W && this.f1016X == lVar.f1016X && Arrays.equals(this.f1017Y, lVar.f1017Y) && Arrays.equals(this.f1018Z, lVar.f1018Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f1017Y);
        return Arrays.hashCode(this.f1018Z) + ((hashCode + ((((((527 + this.f1014V) * 31) + this.f1015W) * 31) + this.f1016X) * 31)) * 31);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1014V);
        parcel.writeInt(this.f1015W);
        parcel.writeInt(this.f1016X);
        parcel.writeIntArray(this.f1017Y);
        parcel.writeIntArray(this.f1018Z);
    }

    public l(Parcel parcel) {
        super("MLLT");
        this.f1014V = parcel.readInt();
        this.f1015W = parcel.readInt();
        this.f1016X = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = z.f3748a;
        this.f1017Y = createIntArray;
        this.f1018Z = parcel.createIntArray();
    }
}
