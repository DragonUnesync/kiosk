package F1;

import A1.a;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class i extends b {
    public static final Parcelable.Creator<i> CREATOR = new a(23);

    /* renamed from: U  reason: collision with root package name */
    public final List f1509U;

    public i(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new h(parcel));
        }
        this.f1509U = DesugarCollections.unmodifiableList(arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.f1509U;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            h hVar = (h) list.get(i8);
            parcel.writeLong(hVar.f1500a);
            parcel.writeByte(hVar.f1501b ? (byte) 1 : 0);
            parcel.writeByte(hVar.f1502c ? (byte) 1 : 0);
            parcel.writeByte(hVar.f1503d ? (byte) 1 : 0);
            List list2 = hVar.f1504f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i9 = 0; i9 < size2; i9++) {
                g gVar = (g) list2.get(i9);
                parcel.writeInt(gVar.f1498a);
                parcel.writeLong(gVar.f1499b);
            }
            parcel.writeLong(hVar.e);
            parcel.writeByte(hVar.f1505g ? (byte) 1 : 0);
            parcel.writeLong(hVar.f1506h);
            parcel.writeInt(hVar.i);
            parcel.writeInt(hVar.f1507j);
            parcel.writeInt(hVar.f1508k);
        }
    }

    public i(ArrayList arrayList) {
        this.f1509U = DesugarCollections.unmodifiableList(arrayList);
    }
}
