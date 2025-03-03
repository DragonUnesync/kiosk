package F1;

import A1.a;
import Q0.g;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class e extends b {
    public static final Parcelable.Creator<e> CREATOR = new a(21);

    /* renamed from: U  reason: collision with root package name */
    public final long f1485U;

    /* renamed from: V  reason: collision with root package name */
    public final boolean f1486V;

    /* renamed from: W  reason: collision with root package name */
    public final boolean f1487W;

    /* renamed from: X  reason: collision with root package name */
    public final boolean f1488X;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f1489Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f1490Z;

    /* renamed from: a0  reason: collision with root package name */
    public final long f1491a0;

    /* renamed from: b0  reason: collision with root package name */
    public final List f1492b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f1493c0;

    /* renamed from: d0  reason: collision with root package name */
    public final long f1494d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f1495e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f1496f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f1497g0;

    public e(long j7, boolean z, boolean z6, boolean z8, boolean z9, long j8, long j9, List list, boolean z10, long j10, int i, int i8, int i9) {
        this.f1485U = j7;
        this.f1486V = z;
        this.f1487W = z6;
        this.f1488X = z8;
        this.f1489Y = z9;
        this.f1490Z = j8;
        this.f1491a0 = j9;
        this.f1492b0 = DesugarCollections.unmodifiableList(list);
        this.f1493c0 = z10;
        this.f1494d0 = j10;
        this.f1495e0 = i;
        this.f1496f0 = i8;
        this.f1497g0 = i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
        sb.append(this.f1490Z);
        sb.append(", programSplicePlaybackPositionUs= ");
        return g.o(sb, this.f1491a0, " }");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1485U);
        parcel.writeByte(this.f1486V ? (byte) 1 : 0);
        parcel.writeByte(this.f1487W ? (byte) 1 : 0);
        parcel.writeByte(this.f1488X ? (byte) 1 : 0);
        parcel.writeByte(this.f1489Y ? (byte) 1 : 0);
        parcel.writeLong(this.f1490Z);
        parcel.writeLong(this.f1491a0);
        List list = this.f1492b0;
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) list.get(i8);
            parcel.writeInt(dVar.f1482a);
            parcel.writeLong(dVar.f1483b);
            parcel.writeLong(dVar.f1484c);
        }
        parcel.writeByte(this.f1493c0 ? (byte) 1 : 0);
        parcel.writeLong(this.f1494d0);
        parcel.writeInt(this.f1495e0);
        parcel.writeInt(this.f1496f0);
        parcel.writeInt(this.f1497g0);
    }

    public e(Parcel parcel) {
        this.f1485U = parcel.readLong();
        boolean z = true;
        this.f1486V = parcel.readByte() == 1;
        this.f1487W = parcel.readByte() == 1;
        this.f1488X = parcel.readByte() == 1;
        this.f1489Y = parcel.readByte() == 1;
        this.f1490Z = parcel.readLong();
        this.f1491a0 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new d(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f1492b0 = DesugarCollections.unmodifiableList(arrayList);
        this.f1493c0 = parcel.readByte() != 1 ? false : z;
        this.f1494d0 = parcel.readLong();
        this.f1495e0 = parcel.readInt();
        this.f1496f0 = parcel.readInt();
        this.f1497g0 = parcel.readInt();
    }
}
