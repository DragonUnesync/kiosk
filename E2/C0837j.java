package e2;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: e2.j  reason: case insensitive filesystem */
public final class C0837j extends View.BaseSavedState {
    public static final Parcelable.Creator<C0837j> CREATOR = new S(24);

    /* renamed from: U  reason: collision with root package name */
    public final boolean f11201U;

    public C0837j(Parcelable parcelable, boolean z) {
        super(parcelable);
        this.f11201U = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f11201U ? (byte) 1 : 0);
    }

    public C0837j(Parcel parcel) {
        super(parcel);
        this.f11201U = parcel.readByte() != 0;
    }
}
