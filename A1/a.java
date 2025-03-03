package A1;

import B1.b;
import C1.c;
import D1.d;
import D1.e;
import D1.f;
import D1.k;
import D1.l;
import D1.m;
import D1.n;
import D1.o;
import F1.i;
import F1.j;
import H3.O;
import M0.C0125m;
import M0.C0126n;
import M0.H;
import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.ArrayList;

public final class a implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24a;

    public /* synthetic */ a(int i) {
        this.f24a = i;
    }

    public final Object createFromParcel(Parcel parcel) {
        switch (this.f24a) {
            case 0:
                return new b(parcel);
            case 1:
                return new B1.a(parcel);
            case 2:
                return new b(parcel);
            case 3:
                return new C1.b(parcel);
            case 4:
                return new c(parcel);
            case 5:
                return new D1.a(parcel);
            case 6:
                return new D1.b(parcel);
            case 7:
                return new D1.c(parcel);
            case 8:
                return new d(parcel);
            case 9:
                return new e(parcel);
            case 10:
                return new f(parcel);
            case 11:
                return new k(parcel);
            case 12:
                return new l(parcel);
            case 13:
                return new m(parcel);
            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new n(readString, readString2, O.n(createStringArray));
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                return new o(parcel);
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                return new E1.a(parcel);
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, E1.b.class.getClassLoader());
                return new E1.c(arrayList);
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                return new E1.b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                return new E1.d(parcel);
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                return new F1.a(parcel);
            case 21:
                return new F1.e(parcel);
            case 22:
                return new Object();
            case 23:
                return new i(parcel);
            case 24:
                return new j(parcel.readLong(), parcel.readLong());
            case 25:
                return new F5.j(parcel);
            case 26:
                return new b(parcel);
            case 27:
                return new C0126n(parcel);
            case 28:
                return new C0125m(parcel);
            default:
                return new H(parcel);
        }
    }

    public final Object[] newArray(int i) {
        switch (this.f24a) {
            case 0:
                return new b[i];
            case 1:
                return new B1.a[i];
            case 2:
                return new b[i];
            case 3:
                return new C1.b[i];
            case 4:
                return new c[i];
            case 5:
                return new D1.a[i];
            case 6:
                return new D1.b[i];
            case 7:
                return new D1.c[i];
            case 8:
                return new d[i];
            case 9:
                return new e[i];
            case 10:
                return new f[i];
            case 11:
                return new k[i];
            case 12:
                return new l[i];
            case 13:
                return new m[i];
            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                return new n[i];
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                return new o[i];
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                return new E1.a[i];
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                return new E1.c[i];
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                return new E1.b[i];
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                return new E1.d[i];
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                return new F1.a[i];
            case 21:
                return new F1.e[i];
            case 22:
                return new F1.f[i];
            case 23:
                return new i[i];
            case 24:
                return new j[i];
            case 25:
                return new F5.j[i];
            case 26:
                return new G1.a[i];
            case 27:
                return new C0126n[i];
            case 28:
                return new C0125m[i];
            default:
                return new H[i];
        }
    }
}
