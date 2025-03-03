package Q0;

import M0.E;
import M0.G;
import M0.S;
import M0.r;
import N.e;
import P0.l;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import org.altbeacon.bluetooth.Pdu;

public final class a implements G {
    public static final Parcelable.Creator<a> CREATOR = new S(1);

    /* renamed from: U  reason: collision with root package name */
    public final String f4009U;

    /* renamed from: V  reason: collision with root package name */
    public final byte[] f4010V;

    /* renamed from: W  reason: collision with root package name */
    public final int f4011W;

    /* renamed from: X  reason: collision with root package name */
    public final int f4012X;

    public a(String str, byte[] bArr, int i, int i8) {
        v(str, bArr, i8);
        this.f4009U = str;
        this.f4010V = bArr;
        this.f4011W = i;
        this.f4012X = i8;
    }

    public static void v(String str, byte[] bArr, int i) {
        byte b8;
        str.getClass();
        boolean z = false;
        char c8 = 65535;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1555642602:
                if (str.equals("editable.tracks.samples.location")) {
                    c8 = 1;
                    break;
                }
                break;
            case 101820674:
                if (str.equals("editable.tracks.length")) {
                    c8 = 2;
                    break;
                }
                break;
            case 188404399:
                if (str.equals("editable.tracks.offset")) {
                    c8 = 3;
                    break;
                }
                break;
            case 1805012160:
                if (str.equals("editable.tracks.map")) {
                    c8 = 4;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                if (i == 23 && bArr.length == 4) {
                    z = true;
                }
                l.d(z);
                return;
            case 1:
                if (i == 75 && bArr.length == 1 && ((b8 = bArr[0]) == 0 || b8 == 1)) {
                    z = true;
                }
                l.d(z);
                return;
            case 2:
            case 3:
                if (i == 78 && bArr.length == 8) {
                    z = true;
                }
                l.d(z);
                return;
            case 4:
                if (i == 0) {
                    z = true;
                }
                l.d(z);
                return;
            default:
                return;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final /* synthetic */ void e(E e) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f4009U.equals(aVar.f4009U) || !Arrays.equals(this.f4010V, aVar.f4010V) || this.f4011W != aVar.f4011W || this.f4012X != aVar.f4012X) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f4010V) + e.u(527, 31, this.f4009U)) * 31) + this.f4011W) * 31) + this.f4012X;
    }

    public final /* synthetic */ r i() {
        return null;
    }

    public final ArrayList k() {
        l.i("Metadata is not an editable tracks map", this.f4009U.equals("editable.tracks.map"));
        byte[] bArr = this.f4010V;
        byte b8 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b8; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        String str;
        String str2 = this.f4009U;
        byte[] bArr = this.f4010V;
        int i = this.f4012X;
        if (i != 0) {
            if (i == 1) {
                str = z.o(bArr);
            } else if (i == 23) {
                str = String.valueOf(Float.intBitsToFloat(E.e.l(bArr)));
            } else if (i == 67) {
                str = String.valueOf(E.e.l(bArr));
            } else if (i == 75) {
                str = String.valueOf(bArr[0] & Pdu.MANUFACTURER_DATA_PDU_TYPE);
            } else if (i == 78) {
                str = String.valueOf(new P0.r(bArr).A());
            }
            return "mdta: key=" + str2 + ", value=" + str;
        } else if (str2.equals("editable.tracks.map")) {
            ArrayList k8 = k();
            StringBuilder r8 = g.r("track types = ");
            new G3.e(String.valueOf(',')).a(r8, k8.iterator());
            str = r8.toString();
            return "mdta: key=" + str2 + ", value=" + str;
        }
        str = z.b0(bArr);
        return "mdta: key=" + str2 + ", value=" + str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f4009U);
        parcel.writeByteArray(this.f4010V);
        parcel.writeInt(this.f4011W);
        parcel.writeInt(this.f4012X);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f4009U = readString;
        byte[] createByteArray = parcel.createByteArray();
        this.f4010V = createByteArray;
        this.f4011W = parcel.readInt();
        int readInt = parcel.readInt();
        this.f4012X = readInt;
        v(readString, createByteArray, readInt);
    }
}
