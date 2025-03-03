package M0;

import P0.z;
import android.os.Parcel;
import android.os.Parcelable;

public final class T implements Comparable, Parcelable {
    public static final Parcelable.Creator<T> CREATOR = new S(0);

    /* renamed from: U  reason: collision with root package name */
    public final int f2859U;

    /* renamed from: V  reason: collision with root package name */
    public final int f2860V;

    /* renamed from: W  reason: collision with root package name */
    public final int f2861W;

    static {
        z.J(0);
        z.J(1);
        z.J(2);
    }

    public T() {
        this.f2859U = -1;
        this.f2860V = -1;
        this.f2861W = -1;
    }

    public final int compareTo(Object obj) {
        T t8 = (T) obj;
        int i = this.f2859U - t8.f2859U;
        if (i != 0) {
            return i;
        }
        int i8 = this.f2860V - t8.f2860V;
        if (i8 == 0) {
            return this.f2861W - t8.f2861W;
        }
        return i8;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || T.class != obj.getClass()) {
            return false;
        }
        T t8 = (T) obj;
        if (this.f2859U == t8.f2859U && this.f2860V == t8.f2860V && this.f2861W == t8.f2861W) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f2859U * 31) + this.f2860V) * 31) + this.f2861W;
    }

    public final String toString() {
        return this.f2859U + "." + this.f2860V + "." + this.f2861W;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2859U);
        parcel.writeInt(this.f2860V);
        parcel.writeInt(this.f2861W);
    }

    public T(Parcel parcel) {
        this.f2859U = parcel.readInt();
        this.f2860V = parcel.readInt();
        this.f2861W = parcel.readInt();
    }
}
