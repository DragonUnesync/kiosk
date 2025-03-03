package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.c  reason: case insensitive filesystem */
public final class C0601c extends Binder implements C0600b {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f8704c = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0602d f8705b;

    public C0601c(C0602d dVar) {
        this.f8705b = dVar;
        attachInterface(this, C0600b.f8703a);
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i8) {
        Object obj;
        String str = C0600b.f8703a;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        } else if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i8);
        } else {
            int readInt = parcel.readInt();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            C0602d dVar = this.f8705b;
            dVar.getClass();
            dVar.k(readInt, (Bundle) obj);
            return true;
        }
    }
}
