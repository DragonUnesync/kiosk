package F1;

import android.os.Parcel;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f1500a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1501b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1502c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1503d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final List f1504f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1505g;

    /* renamed from: h  reason: collision with root package name */
    public final long f1506h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1507j;

    /* renamed from: k  reason: collision with root package name */
    public final int f1508k;

    public h(long j7, boolean z, boolean z6, boolean z8, ArrayList arrayList, long j8, boolean z9, long j9, int i8, int i9, int i10) {
        this.f1500a = j7;
        this.f1501b = z;
        this.f1502c = z6;
        this.f1503d = z8;
        this.f1504f = DesugarCollections.unmodifiableList(arrayList);
        this.e = j8;
        this.f1505g = z9;
        this.f1506h = j9;
        this.i = i8;
        this.f1507j = i9;
        this.f1508k = i10;
    }

    public h(Parcel parcel) {
        this.f1500a = parcel.readLong();
        boolean z = false;
        this.f1501b = parcel.readByte() == 1;
        this.f1502c = parcel.readByte() == 1;
        this.f1503d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            arrayList.add(new g(parcel.readInt(), parcel.readLong()));
        }
        this.f1504f = DesugarCollections.unmodifiableList(arrayList);
        this.e = parcel.readLong();
        this.f1505g = parcel.readByte() == 1 ? true : z;
        this.f1506h = parcel.readLong();
        this.i = parcel.readInt();
        this.f1507j = parcel.readInt();
        this.f1508k = parcel.readInt();
    }
}
