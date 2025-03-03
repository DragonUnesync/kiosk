package c;

import M0.S;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.d  reason: case insensitive filesystem */
public class C0602d implements Parcelable {
    public static final Parcelable.Creator<C0602d> CREATOR = new S(20);

    /* renamed from: U  reason: collision with root package name */
    public C0600b f8706U;

    public final int describeContents() {
        return 0;
    }

    public void k(int i, Bundle bundle) {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f8706U == null) {
                    this.f8706U = new C0601c(this);
                }
                parcel.writeStrongBinder(this.f8706U.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
