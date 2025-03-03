package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import y0.C1621g;
import z1.C1644a;

public final class M implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13861a;

    public /* synthetic */ M(int i) {
        this.f13861a = i;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View$BaseSavedState, java.lang.Object, o.N] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.view.View$BaseSavedState, y0.g, java.lang.Object] */
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        switch (this.f13861a) {
            case 0:
                ? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readByte() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                baseSavedState.f13862U = z;
                return baseSavedState;
            case 1:
                ? baseSavedState2 = new View.BaseSavedState(parcel);
                baseSavedState2.f16358U = parcel.readInt();
                return baseSavedState2;
            default:
                String readString = parcel.readString();
                readString.getClass();
                return new C1644a(parcel.readInt(), readString);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.f13861a) {
            case 0:
                return new N[i];
            case 1:
                return new C1621g[i];
            default:
                return new C1644a[i];
        }
    }
}
