package i2;

import N.e;
import Y.i;
import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: i2.b  reason: case insensitive filesystem */
public final class C1097b extends C1096a {

    /* renamed from: d  reason: collision with root package name */
    public final SparseIntArray f12716d;
    public final Parcel e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12717f;

    /* renamed from: g  reason: collision with root package name */
    public final int f12718g;

    /* renamed from: h  reason: collision with root package name */
    public final String f12719h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f12720j;

    /* renamed from: k  reason: collision with root package name */
    public int f12721k;

    /* JADX WARNING: type inference failed for: r5v0, types: [Y.e, Y.i] */
    /* JADX WARNING: type inference failed for: r6v0, types: [Y.e, Y.i] */
    /* JADX WARNING: type inference failed for: r7v0, types: [Y.e, Y.i] */
    public C1097b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new i((Object) null), new i((Object) null), new i((Object) null));
    }

    public final C1097b a() {
        Parcel parcel = this.e;
        int dataPosition = parcel.dataPosition();
        int i8 = this.f12720j;
        if (i8 == this.f12717f) {
            i8 = this.f12718g;
        }
        return new C1097b(parcel, dataPosition, i8, e.A(new StringBuilder(), this.f12719h, "  "), this.f12713a, this.f12714b, this.f12715c);
    }

    public final boolean e(int i8) {
        while (this.f12720j < this.f12718g) {
            int i9 = this.f12721k;
            if (i9 == i8) {
                return true;
            }
            if (String.valueOf(i9).compareTo(String.valueOf(i8)) > 0) {
                return false;
            }
            int i10 = this.f12720j;
            Parcel parcel = this.e;
            parcel.setDataPosition(i10);
            int readInt = parcel.readInt();
            this.f12721k = parcel.readInt();
            this.f12720j += readInt;
        }
        if (this.f12721k == i8) {
            return true;
        }
        return false;
    }

    public final void i(int i8) {
        int i9 = this.i;
        SparseIntArray sparseIntArray = this.f12716d;
        Parcel parcel = this.e;
        if (i9 >= 0) {
            int i10 = sparseIntArray.get(i9);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i10);
            parcel.writeInt(dataPosition - i10);
            parcel.setDataPosition(dataPosition);
        }
        this.i = i8;
        sparseIntArray.put(i8, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i8);
    }

    public C1097b(Parcel parcel, int i8, int i9, String str, Y.e eVar, Y.e eVar2, Y.e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f12716d = new SparseIntArray();
        this.i = -1;
        this.f12721k = -1;
        this.e = parcel;
        this.f12717f = i8;
        this.f12718g = i9;
        this.f12720j = i8;
        this.f12719h = str;
    }
}
