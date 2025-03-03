package C1;

import A1.a;
import M0.E;
import M0.G;
import M0.r;
import P0.l;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

public final class b implements G {
    public static final Parcelable.Creator<b> CREATOR = new a(3);

    /* renamed from: U  reason: collision with root package name */
    public final int f533U;

    /* renamed from: V  reason: collision with root package name */
    public final String f534V;

    /* renamed from: W  reason: collision with root package name */
    public final String f535W;

    /* renamed from: X  reason: collision with root package name */
    public final String f536X;

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f537Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f538Z;

    public b(int i, String str, String str2, String str3, boolean z, int i8) {
        l.d(i8 == -1 || i8 > 0);
        this.f533U = i;
        this.f534V = str;
        this.f535W = str2;
        this.f536X = str3;
        this.f537Y = z;
        this.f538Z = i8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static C1.b k(java.util.Map r14) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "Invalid bitrate: "
            java.lang.String r2 = "icy-br"
            java.lang.Object r2 = r14.get(r2)
            java.util.List r2 = (java.util.List) r2
            java.lang.String r3 = "IcyHeaders"
            r4 = 1
            r5 = 0
            r6 = -1
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            int r7 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0036 }
            int r7 = r7 * 1000
            if (r7 <= 0) goto L_0x0023
            r1 = 1
            goto L_0x0034
        L_0x0023:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0037 }
            r8.<init>(r1)     // Catch:{ NumberFormatException -> 0x0037 }
            r8.append(r2)     // Catch:{ NumberFormatException -> 0x0037 }
            java.lang.String r1 = r8.toString()     // Catch:{ NumberFormatException -> 0x0037 }
            P0.l.B(r3, r1)     // Catch:{ NumberFormatException -> 0x0037 }
            r1 = 0
            r7 = -1
        L_0x0034:
            r8 = r7
            goto L_0x0041
        L_0x0036:
            r7 = -1
        L_0x0037:
            java.lang.String r1 = "Invalid bitrate header: "
            N.e.H(r1, r2, r3)
            r8 = r7
            r1 = 0
            goto L_0x0041
        L_0x003f:
            r1 = 0
            r8 = -1
        L_0x0041:
            java.lang.String r2 = "icy-genre"
            java.lang.Object r2 = r14.get(r2)
            java.util.List r2 = (java.util.List) r2
            r7 = 0
            if (r2 == 0) goto L_0x0055
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = 1
            goto L_0x0056
        L_0x0055:
            r9 = r7
        L_0x0056:
            java.lang.String r2 = "icy-name"
            java.lang.Object r2 = r14.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0069
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = 1
            goto L_0x006a
        L_0x0069:
            r10 = r7
        L_0x006a:
            java.lang.String r2 = "icy-url"
            java.lang.Object r2 = r14.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x007d
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = 1
            goto L_0x007e
        L_0x007d:
            r11 = r7
        L_0x007e:
            java.lang.String r2 = "icy-pub"
            java.lang.Object r2 = r14.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0097
            java.lang.Object r1 = r2.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "1"
            boolean r1 = r1.equals(r2)
            r12 = r1
            r1 = 1
            goto L_0x0098
        L_0x0097:
            r12 = 0
        L_0x0098:
            java.lang.String r2 = "icy-metaint"
            java.lang.Object r14 = r14.get(r2)
            java.util.List r14 = (java.util.List) r14
            if (r14 == 0) goto L_0x00c8
            java.lang.Object r14 = r14.get(r5)
            java.lang.String r14 = (java.lang.String) r14
            int r2 = java.lang.Integer.parseInt(r14)     // Catch:{ NumberFormatException -> 0x00c4 }
            if (r2 <= 0) goto L_0x00b0
            r6 = r2
            goto L_0x00c0
        L_0x00b0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00c3 }
            r4.<init>(r0)     // Catch:{ NumberFormatException -> 0x00c3 }
            r4.append(r14)     // Catch:{ NumberFormatException -> 0x00c3 }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00c3 }
            P0.l.B(r3, r4)     // Catch:{ NumberFormatException -> 0x00c3 }
            r4 = r1
        L_0x00c0:
            r1 = r4
        L_0x00c1:
            r13 = r6
            goto L_0x00c9
        L_0x00c3:
            r6 = r2
        L_0x00c4:
            N.e.H(r0, r14, r3)
            goto L_0x00c1
        L_0x00c8:
            r13 = -1
        L_0x00c9:
            if (r1 == 0) goto L_0x00d1
            C1.b r14 = new C1.b
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x00d1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.b.k(java.util.Map):C1.b");
    }

    public final int describeContents() {
        return 0;
    }

    public final void e(E e) {
        String str = this.f535W;
        if (str != null) {
            e.f2811v = str;
        }
        String str2 = this.f534V;
        if (str2 != null) {
            e.f2810u = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f533U == bVar.f533U) {
            int i = z.f3748a;
            if (!Objects.equals(this.f534V, bVar.f534V) || !Objects.equals(this.f535W, bVar.f535W) || !Objects.equals(this.f536X, bVar.f536X) || this.f537Y != bVar.f537Y || this.f538Z != bVar.f538Z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i8;
        int i9 = (527 + this.f533U) * 31;
        int i10 = 0;
        String str = this.f534V;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i11 = (i9 + i) * 31;
        String str2 = this.f535W;
        if (str2 != null) {
            i8 = str2.hashCode();
        } else {
            i8 = 0;
        }
        int i12 = (i11 + i8) * 31;
        String str3 = this.f536X;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((((i12 + i10) * 31) + (this.f537Y ? 1 : 0)) * 31) + this.f538Z;
    }

    public final /* synthetic */ r i() {
        return null;
    }

    public final /* synthetic */ byte[] s() {
        return null;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f535W + "\", genre=\"" + this.f534V + "\", bitrate=" + this.f533U + ", metadataInterval=" + this.f538Z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f533U);
        parcel.writeString(this.f534V);
        parcel.writeString(this.f535W);
        parcel.writeString(this.f536X);
        int i8 = z.f3748a;
        parcel.writeInt(this.f537Y ? 1 : 0);
        parcel.writeInt(this.f538Z);
    }

    public b(Parcel parcel) {
        this.f533U = parcel.readInt();
        this.f534V = parcel.readString();
        this.f535W = parcel.readString();
        this.f536X = parcel.readString();
        int i = z.f3748a;
        this.f537Y = parcel.readInt() != 0;
        this.f538Z = parcel.readInt();
    }
}
