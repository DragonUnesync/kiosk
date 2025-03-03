package E1;

import A1.a;
import M0.E;
import M0.G;
import M0.r;
import P0.l;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class c implements G {
    public static final Parcelable.Creator<c> CREATOR = new a(17);

    /* renamed from: U  reason: collision with root package name */
    public final ArrayList f1324U;

    public c(ArrayList arrayList) {
        this.f1324U = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j7 = ((b) arrayList.get(0)).f1322V;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                } else if (((b) arrayList.get(i)).f1321U < j7) {
                    z = true;
                    break;
                } else {
                    j7 = ((b) arrayList.get(i)).f1322V;
                    i++;
                }
            }
        }
        l.d(!z);
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
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f1324U.equals(((c) obj).f1324U);
    }

    public final int hashCode() {
        return this.f1324U.hashCode();
    }

    public final /* synthetic */ r i() {
        return null;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f1324U;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f1324U);
    }
}
