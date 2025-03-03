package M0;

import A1.a;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: M0.n  reason: case insensitive filesystem */
public final class C0126n implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0126n> CREATOR = new a(27);

    /* renamed from: U  reason: collision with root package name */
    public final C0125m[] f2973U;

    /* renamed from: V  reason: collision with root package name */
    public int f2974V;

    /* renamed from: W  reason: collision with root package name */
    public final String f2975W;

    /* renamed from: X  reason: collision with root package name */
    public final int f2976X;

    public C0126n(String str, ArrayList arrayList) {
        this(str, false, (C0125m[]) arrayList.toArray(new C0125m[0]));
    }

    public final int compare(Object obj, Object obj2) {
        C0125m mVar = (C0125m) obj;
        C0125m mVar2 = (C0125m) obj2;
        UUID uuid = C0119g.f2943a;
        if (!uuid.equals(mVar.f2969V)) {
            return mVar.f2969V.compareTo(mVar2.f2969V);
        }
        if (uuid.equals(mVar2.f2969V)) {
            return 0;
        }
        return 1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0126n.class != obj.getClass()) {
            return false;
        }
        C0126n nVar = (C0126n) obj;
        int i = z.f3748a;
        if (!Objects.equals(this.f2975W, nVar.f2975W) || !Arrays.equals(this.f2973U, nVar.f2973U)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        if (this.f2974V == 0) {
            String str = this.f2975W;
            if (str == null) {
                i = 0;
            } else {
                i = str.hashCode();
            }
            this.f2974V = (i * 31) + Arrays.hashCode(this.f2973U);
        }
        return this.f2974V;
    }

    public final C0126n k(String str) {
        int i = z.f3748a;
        if (Objects.equals(this.f2975W, str)) {
            return this;
        }
        return new C0126n(str, false, this.f2973U);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2975W);
        parcel.writeTypedArray(this.f2973U, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: M0.m[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0126n(java.lang.String r1, boolean r2, M0.C0125m... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f2975W = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            M0.m[] r3 = (M0.C0125m[]) r3
        L_0x000e:
            r0.f2973U = r3
            int r1 = r3.length
            r0.f2976X = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.C0126n.<init>(java.lang.String, boolean, M0.m[]):void");
    }

    public C0126n(Parcel parcel) {
        this.f2975W = parcel.readString();
        C0125m[] mVarArr = (C0125m[]) parcel.createTypedArray(C0125m.CREATOR);
        int i = z.f3748a;
        this.f2973U = mVarArr;
        this.f2976X = mVarArr.length;
    }
}
