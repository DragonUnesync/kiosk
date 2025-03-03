package B1;

import A1.a;
import F.h;
import M0.E;
import M0.G;
import M0.r;
import N.e;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;

public class b implements G {
    public static final Parcelable.Creator<b> CREATOR = new a(2);

    /* renamed from: U  reason: collision with root package name */
    public final String f376U;

    /* renamed from: V  reason: collision with root package name */
    public final String f377V;

    public b(String str, String str2) {
        this.f376U = h.F(str);
        this.f377V = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void e(E e) {
        String str = this.f376U;
        str.getClass();
        String str2 = this.f377V;
        char c8 = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c8 = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c8 = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c8 = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c8 = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c8 = 4;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                e.f2794c = str2;
                return;
            case 1:
                e.f2792a = str2;
                return;
            case 2:
                e.e = str2;
                return;
            case 3:
                e.f2795d = str2;
                return;
            case 4:
                e.f2793b = str2;
                return;
            default:
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (!this.f376U.equals(bVar.f376U) || !this.f377V.equals(bVar.f377V)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f377V.hashCode() + e.u(527, 31, this.f376U);
    }

    public final /* synthetic */ r i() {
        return null;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        return "VC: " + this.f376U + "=" + this.f377V;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f376U);
        parcel.writeString(this.f377V);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i = z.f3748a;
        this.f376U = readString;
        this.f377V = parcel.readString();
    }
}
