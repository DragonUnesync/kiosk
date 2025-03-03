package A3;

import B0.b;
import C3.G;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.c0;
import k3.C1161a;
import l3.C1174b;
import o.Z0;
import o.m1;
import t3.C1427a;

public final class e implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f87a;

    public /* synthetic */ e(int i) {
        this.f87a = i;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f87a) {
            case 0:
                return new f(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return b.f366V;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new G(parcel, classLoader);
            case 3:
                return new c0(parcel, classLoader);
            case 4:
                return new h0.e(parcel, classLoader);
            case 5:
                return new C1161a(parcel, classLoader);
            case 6:
                return new C1174b(parcel, classLoader);
            case 7:
                return new Z0(parcel, classLoader);
            case 8:
                return new m1(parcel, classLoader);
            default:
                return new C1427a(parcel, classLoader);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.f87a) {
            case 0:
                return new f[i];
            case 1:
                return new b[i];
            case 2:
                return new G[i];
            case 3:
                return new c0[i];
            case 4:
                return new h0.e[i];
            case 5:
                return new C1161a[i];
            case 6:
                return new C1174b[i];
            case 7:
                return new Z0[i];
            case 8:
                return new m1[i];
            default:
                return new C1427a[i];
        }
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.f87a) {
            case 0:
                return new f(parcel, (ClassLoader) null);
            case 1:
                if (parcel.readParcelable((ClassLoader) null) == null) {
                    return b.f366V;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new G(parcel, (ClassLoader) null);
            case 3:
                return new c0(parcel, (ClassLoader) null);
            case 4:
                return new h0.e(parcel, (ClassLoader) null);
            case 5:
                return new C1161a(parcel, (ClassLoader) null);
            case 6:
                return new C1174b(parcel, (ClassLoader) null);
            case 7:
                return new Z0(parcel, (ClassLoader) null);
            case 8:
                return new m1(parcel, (ClassLoader) null);
            default:
                return new C1427a(parcel, (ClassLoader) null);
        }
    }
}
