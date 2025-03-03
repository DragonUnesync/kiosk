package h0;

import B0.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new A3.e(4);

    /* renamed from: W  reason: collision with root package name */
    public SparseArray f12274W;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f12274W = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f12274W.append(iArr[i], readParcelableArray[i]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i8;
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f12274W;
        if (sparseArray != null) {
            i8 = sparseArray.size();
        } else {
            i8 = 0;
        }
        parcel.writeInt(i8);
        int[] iArr = new int[i8];
        Parcelable[] parcelableArr = new Parcelable[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            iArr[i9] = this.f12274W.keyAt(i9);
            parcelableArr[i9] = (Parcelable) this.f12274W.valueAt(i9);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
