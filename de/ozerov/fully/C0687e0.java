package de.ozerov.fully;

import a.C0408a;
import android.content.pm.PackageStats;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: de.ozerov.fully.e0  reason: case insensitive filesystem */
public final class C0687e0 extends Binder implements C0408a {
    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i8) {
        Object obj;
        boolean z;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.content.pm.IPackageStatsObserver");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.content.pm.IPackageStatsObserver");
            return true;
        } else if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i8);
        } else {
            Parcelable.Creator creator = PackageStats.CREATOR;
            if (parcel.readInt() != 0) {
                obj = creator.createFromParcel(parcel);
            } else {
                obj = null;
            }
            PackageStats packageStats = (PackageStats) obj;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (packageStats != null && z) {
                P.f10239h = packageStats;
            }
            return true;
        }
    }
}
