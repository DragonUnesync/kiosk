package androidx.fragment.app;

import M0.S;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b  reason: case insensitive filesystem */
public final class C0451b implements Parcelable {
    public static final Parcelable.Creator<C0451b> CREATOR = new S(12);

    /* renamed from: U  reason: collision with root package name */
    public final int[] f7973U;

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f7974V;

    /* renamed from: W  reason: collision with root package name */
    public final int[] f7975W;

    /* renamed from: X  reason: collision with root package name */
    public final int[] f7976X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f7977Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f7978Z;

    /* renamed from: a0  reason: collision with root package name */
    public final int f7979a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f7980b0;

    /* renamed from: c0  reason: collision with root package name */
    public final CharSequence f7981c0;

    /* renamed from: d0  reason: collision with root package name */
    public final int f7982d0;

    /* renamed from: e0  reason: collision with root package name */
    public final CharSequence f7983e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ArrayList f7984f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ArrayList f7985g0;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f7986h0;

    public C0451b(C0450a aVar) {
        int size = aVar.f7955a.size();
        this.f7973U = new int[(size * 6)];
        if (aVar.f7960g) {
            this.f7974V = new ArrayList(size);
            this.f7975W = new int[size];
            this.f7976X = new int[size];
            int i = 0;
            for (int i8 = 0; i8 < size; i8++) {
                S s8 = (S) aVar.f7955a.get(i8);
                int i9 = i + 1;
                this.f7973U[i] = s8.f7928a;
                ArrayList arrayList = this.f7974V;
                C0470v vVar = s8.f7929b;
                arrayList.add(vVar != null ? vVar.f8063Y : null);
                int[] iArr = this.f7973U;
                iArr[i9] = s8.f7930c;
                iArr[i + 2] = s8.f7931d;
                iArr[i + 3] = s8.e;
                int i10 = i + 5;
                iArr[i + 4] = s8.f7932f;
                i += 6;
                iArr[i10] = s8.f7933g;
                this.f7975W[i8] = s8.f7934h.ordinal();
                this.f7976X[i8] = s8.i.ordinal();
            }
            this.f7977Y = aVar.f7959f;
            this.f7978Z = aVar.i;
            this.f7979a0 = aVar.f7972t;
            this.f7980b0 = aVar.f7962j;
            this.f7981c0 = aVar.f7963k;
            this.f7982d0 = aVar.f7964l;
            this.f7983e0 = aVar.f7965m;
            this.f7984f0 = aVar.f7966n;
            this.f7985g0 = aVar.f7967o;
            this.f7986h0 = aVar.f7968p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f7973U);
        parcel.writeStringList(this.f7974V);
        parcel.writeIntArray(this.f7975W);
        parcel.writeIntArray(this.f7976X);
        parcel.writeInt(this.f7977Y);
        parcel.writeString(this.f7978Z);
        parcel.writeInt(this.f7979a0);
        parcel.writeInt(this.f7980b0);
        TextUtils.writeToParcel(this.f7981c0, parcel, 0);
        parcel.writeInt(this.f7982d0);
        TextUtils.writeToParcel(this.f7983e0, parcel, 0);
        parcel.writeStringList(this.f7984f0);
        parcel.writeStringList(this.f7985g0);
        parcel.writeInt(this.f7986h0 ? 1 : 0);
    }

    public C0451b(Parcel parcel) {
        this.f7973U = parcel.createIntArray();
        this.f7974V = parcel.createStringArrayList();
        this.f7975W = parcel.createIntArray();
        this.f7976X = parcel.createIntArray();
        this.f7977Y = parcel.readInt();
        this.f7978Z = parcel.readString();
        this.f7979a0 = parcel.readInt();
        this.f7980b0 = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f7981c0 = (CharSequence) creator.createFromParcel(parcel);
        this.f7982d0 = parcel.readInt();
        this.f7983e0 = (CharSequence) creator.createFromParcel(parcel);
        this.f7984f0 = parcel.createStringArrayList();
        this.f7985g0 = parcel.createStringArrayList();
        this.f7986h0 = parcel.readInt() != 0;
    }
}
