package Z0;

import M0.E;
import M0.G;
import M0.S;
import M0.r;
import N.e;
import Q0.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class s implements G {
    public static final Parcelable.Creator<s> CREATOR = new S(4);

    /* renamed from: U  reason: collision with root package name */
    public final String f6935U;

    /* renamed from: V  reason: collision with root package name */
    public final String f6936V;

    /* renamed from: W  reason: collision with root package name */
    public final List f6937W;

    public s(String str, List list, String str2) {
        this.f6935U = str;
        this.f6936V = str2;
        this.f6937W = DesugarCollections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        if (!TextUtils.equals(this.f6935U, sVar.f6935U) || !TextUtils.equals(this.f6936V, sVar.f6936V) || !this.f6937W.equals(sVar.f6937W)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i8 = 0;
        String str = this.f6935U;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = i * 31;
        String str2 = this.f6936V;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return this.f6937W.hashCode() + ((i9 + i8) * 31);
    }

    public final /* synthetic */ r i() {
        return null;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f6935U;
        if (str2 != null) {
            str = e.A(g.s(" [", str2, ", "), this.f6936V, "]");
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6935U);
        parcel.writeString(this.f6936V);
        List list = this.f6937W;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeParcelable((Parcelable) list.get(i8), 0);
        }
    }

    public s(Parcel parcel) {
        this.f6935U = parcel.readString();
        this.f6936V = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((r) parcel.readParcelable(r.class.getClassLoader()));
        }
        this.f6937W = DesugarCollections.unmodifiableList(arrayList);
    }
}
