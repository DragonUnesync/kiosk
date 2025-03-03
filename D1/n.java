package D1;

import A1.a;
import H3.O;
import H3.i0;
import N.e;
import P0.l;
import P0.z;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.ArrayList;

public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a(14);

    /* renamed from: V  reason: collision with root package name */
    public final String f1021V;

    /* renamed from: W  reason: collision with root package name */
    public final O f1022W;

    public n(String str, String str2, i0 i0Var) {
        super(str);
        l.d(!i0Var.isEmpty());
        this.f1021V = str2;
        O m8 = O.m(i0Var);
        this.f1022W = m8;
        String str3 = (String) m8.get(0);
    }

    public static ArrayList k(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(M0.E r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r3 = 10
            r4 = 4
            java.lang.String r5 = r0.f1009U
            r5.getClass()
            r6 = 3
            r7 = 2
            r8 = 1
            H3.O r9 = r0.f1022W
            r10 = 0
            int r12 = r5.hashCode()
            switch(r12) {
                case 82815: goto L_0x0139;
                case 82878: goto L_0x012d;
                case 82897: goto L_0x0121;
                case 83253: goto L_0x0115;
                case 83254: goto L_0x0109;
                case 83255: goto L_0x00fd;
                case 83341: goto L_0x00f1;
                case 83378: goto L_0x00e5;
                case 83536: goto L_0x00d7;
                case 83552: goto L_0x00c9;
                case 2567331: goto L_0x00bb;
                case 2569357: goto L_0x00ad;
                case 2569358: goto L_0x009f;
                case 2569891: goto L_0x0091;
                case 2570401: goto L_0x0084;
                case 2570410: goto L_0x0077;
                case 2571565: goto L_0x006a;
                case 2575251: goto L_0x005d;
                case 2581512: goto L_0x0050;
                case 2581513: goto L_0x0043;
                case 2581514: goto L_0x0036;
                case 2583398: goto L_0x0029;
                case 2590194: goto L_0x001c;
                default: goto L_0x0019;
            }
        L_0x0019:
            r5 = -1
            goto L_0x0144
        L_0x001c:
            java.lang.String r12 = "TYER"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x0025
            goto L_0x0019
        L_0x0025:
            r5 = 22
            goto L_0x0144
        L_0x0029:
            java.lang.String r12 = "TRCK"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x0032
            goto L_0x0019
        L_0x0032:
            r5 = 21
            goto L_0x0144
        L_0x0036:
            java.lang.String r12 = "TPE3"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x003f
            goto L_0x0019
        L_0x003f:
            r5 = 20
            goto L_0x0144
        L_0x0043:
            java.lang.String r12 = "TPE2"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x004c
            goto L_0x0019
        L_0x004c:
            r5 = 19
            goto L_0x0144
        L_0x0050:
            java.lang.String r12 = "TPE1"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x0059
            goto L_0x0019
        L_0x0059:
            r5 = 18
            goto L_0x0144
        L_0x005d:
            java.lang.String r12 = "TIT2"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x0066
            goto L_0x0019
        L_0x0066:
            r5 = 17
            goto L_0x0144
        L_0x006a:
            java.lang.String r12 = "TEXT"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x0073
            goto L_0x0019
        L_0x0073:
            r5 = 16
            goto L_0x0144
        L_0x0077:
            java.lang.String r12 = "TDRL"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x0080
            goto L_0x0019
        L_0x0080:
            r5 = 15
            goto L_0x0144
        L_0x0084:
            java.lang.String r12 = "TDRC"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x008d
            goto L_0x0019
        L_0x008d:
            r5 = 14
            goto L_0x0144
        L_0x0091:
            java.lang.String r12 = "TDAT"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x009b
            goto L_0x0019
        L_0x009b:
            r5 = 13
            goto L_0x0144
        L_0x009f:
            java.lang.String r12 = "TCON"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x00a9
            goto L_0x0019
        L_0x00a9:
            r5 = 12
            goto L_0x0144
        L_0x00ad:
            java.lang.String r12 = "TCOM"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x00b7
            goto L_0x0019
        L_0x00b7:
            r5 = 11
            goto L_0x0144
        L_0x00bb:
            java.lang.String r12 = "TALB"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x00c5
            goto L_0x0019
        L_0x00c5:
            r5 = 10
            goto L_0x0144
        L_0x00c9:
            java.lang.String r12 = "TYE"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x00d3
            goto L_0x0019
        L_0x00d3:
            r5 = 9
            goto L_0x0144
        L_0x00d7:
            java.lang.String r12 = "TXT"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x00e1
            goto L_0x0019
        L_0x00e1:
            r5 = 8
            goto L_0x0144
        L_0x00e5:
            java.lang.String r12 = "TT2"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x00ef
            goto L_0x0019
        L_0x00ef:
            r5 = 7
            goto L_0x0144
        L_0x00f1:
            java.lang.String r12 = "TRK"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x00fb
            goto L_0x0019
        L_0x00fb:
            r5 = 6
            goto L_0x0144
        L_0x00fd:
            java.lang.String r12 = "TP3"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x0107
            goto L_0x0019
        L_0x0107:
            r5 = 5
            goto L_0x0144
        L_0x0109:
            java.lang.String r12 = "TP2"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x0113
            goto L_0x0019
        L_0x0113:
            r5 = 4
            goto L_0x0144
        L_0x0115:
            java.lang.String r12 = "TP1"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x011f
            goto L_0x0019
        L_0x011f:
            r5 = 3
            goto L_0x0144
        L_0x0121:
            java.lang.String r12 = "TDA"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x012b
            goto L_0x0019
        L_0x012b:
            r5 = 2
            goto L_0x0144
        L_0x012d:
            java.lang.String r12 = "TCM"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x0137
            goto L_0x0019
        L_0x0137:
            r5 = 1
            goto L_0x0144
        L_0x0139:
            java.lang.String r12 = "TAL"
            boolean r5 = r5.equals(r12)
            if (r5 != 0) goto L_0x0143
            goto L_0x0019
        L_0x0143:
            r5 = 0
        L_0x0144:
            switch(r5) {
                case 0: goto L_0x0307;
                case 1: goto L_0x02fd;
                case 2: goto L_0x02d7;
                case 3: goto L_0x02cd;
                case 4: goto L_0x02c3;
                case 5: goto L_0x02b9;
                case 6: goto L_0x028e;
                case 7: goto L_0x0283;
                case 8: goto L_0x0278;
                case 9: goto L_0x0264;
                case 10: goto L_0x0307;
                case 11: goto L_0x02fd;
                case 12: goto L_0x01ac;
                case 13: goto L_0x02d7;
                case 14: goto L_0x0179;
                case 15: goto L_0x0149;
                case 16: goto L_0x0278;
                case 17: goto L_0x0283;
                case 18: goto L_0x02cd;
                case 19: goto L_0x02c3;
                case 20: goto L_0x02b9;
                case 21: goto L_0x028e;
                case 22: goto L_0x0264;
                default: goto L_0x0147;
            }
        L_0x0147:
            goto L_0x0310
        L_0x0149:
            java.lang.Object r2 = r9.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            java.util.ArrayList r2 = k(r2)
            int r3 = r2.size()
            if (r3 == r8) goto L_0x016f
            if (r3 == r7) goto L_0x0167
            if (r3 == r6) goto L_0x015f
            goto L_0x0310
        L_0x015f:
            java.lang.Object r3 = r2.get(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r1.f2806q = r3
        L_0x0167:
            java.lang.Object r3 = r2.get(r8)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r1.f2805p = r3
        L_0x016f:
            java.lang.Object r2 = r2.get(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1.f2804o = r2
            goto L_0x0310
        L_0x0179:
            java.lang.Object r2 = r9.get(r10)
            java.lang.String r2 = (java.lang.String) r2
            java.util.ArrayList r2 = k(r2)
            int r3 = r2.size()
            if (r3 == r8) goto L_0x01a1
            if (r3 == r7) goto L_0x0198
            if (r3 == r6) goto L_0x018f
            goto L_0x0310
        L_0x018f:
            java.lang.Object r3 = r2.get(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r1.c(r3)
        L_0x0198:
            java.lang.Object r3 = r2.get(r8)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r1.d(r3)
        L_0x01a1:
            java.lang.Object r2 = r2.get(r10)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r1.e(r2)
            goto L_0x0310
        L_0x01ac:
            java.lang.Object r4 = r9.get(r10)
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x01be
        L_0x01bb:
            r2 = 0
            goto L_0x022d
        L_0x01be:
            char r5 = r4.charAt(r10)
            r6 = 45
            if (r5 != r6) goto L_0x01c8
            r5 = 1
            goto L_0x01c9
        L_0x01c8:
            r5 = 0
        L_0x01c9:
            int r6 = r4.length()
            if (r5 != r6) goto L_0x01d0
            goto L_0x01bb
        L_0x01d0:
            int r6 = r5 + 1
            char r7 = r4.charAt(r5)
            r12 = 128(0x80, float:1.794E-43)
            if (r7 >= r12) goto L_0x01df
            byte[] r13 = K3.c.f2663a
            byte r7 = r13[r7]
            goto L_0x01e2
        L_0x01df:
            byte[] r7 = K3.c.f2663a
            r7 = -1
        L_0x01e2:
            if (r7 < 0) goto L_0x01bb
            if (r7 < r3) goto L_0x01e7
            goto L_0x01bb
        L_0x01e7:
            int r7 = -r7
            long r13 = (long) r7
            long r10 = (long) r3
            r15 = -9223372036854775808
            long r17 = r15 / r10
        L_0x01ee:
            int r7 = r4.length()
            if (r6 >= r7) goto L_0x021c
            int r7 = r6 + 1
            char r6 = r4.charAt(r6)
            if (r6 >= r12) goto L_0x0201
            byte[] r19 = K3.c.f2663a
            byte r6 = r19[r6]
            goto L_0x0204
        L_0x0201:
            byte[] r6 = K3.c.f2663a
            r6 = -1
        L_0x0204:
            if (r6 < 0) goto L_0x01bb
            if (r6 >= r3) goto L_0x01bb
            int r19 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r19 >= 0) goto L_0x020d
            goto L_0x01bb
        L_0x020d:
            long r13 = r13 * r10
            long r2 = (long) r6
            long r20 = r2 + r15
            int r6 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r6 >= 0) goto L_0x0217
            goto L_0x01bb
        L_0x0217:
            long r13 = r13 - r2
            r6 = r7
            r3 = 10
            goto L_0x01ee
        L_0x021c:
            if (r5 == 0) goto L_0x0223
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            goto L_0x022d
        L_0x0223:
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 != 0) goto L_0x0228
            goto L_0x01bb
        L_0x0228:
            long r2 = -r13
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x022d:
            if (r2 == 0) goto L_0x0246
            long r3 = r2.longValue()
            int r5 = r2.intValue()
            long r5 = (long) r5
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x023d
            goto L_0x0246
        L_0x023d:
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0247
        L_0x0246:
            r2 = 0
        L_0x0247:
            if (r2 != 0) goto L_0x0255
            r3 = 0
            java.lang.Object r2 = r9.get(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.b(r2)
            goto L_0x0310
        L_0x0255:
            int r2 = r2.intValue()
            java.lang.String r2 = D1.j.a(r2)
            if (r2 == 0) goto L_0x0310
            r1.b(r2)
            goto L_0x0310
        L_0x0264:
            r3 = 0
            java.lang.Object r2 = r9.get(r3)     // Catch:{  }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{  }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{  }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{  }
            r1.e(r2)     // Catch:{  }
            goto L_0x0310
        L_0x0278:
            r2 = 0
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.f2807r = r2
            goto L_0x0310
        L_0x0283:
            r2 = 0
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.f2792a = r2
            goto L_0x0310
        L_0x028e:
            r2 = 0
            java.lang.Object r3 = r9.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "/"
            java.lang.String[] r3 = P0.z.Z(r3, r4)
            r2 = r3[r2]     // Catch:{  }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{  }
            int r4 = r3.length     // Catch:{  }
            if (r4 <= r8) goto L_0x02af
            r3 = r3[r8]     // Catch:{  }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{  }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{  }
            goto L_0x02b0
        L_0x02af:
            r3 = 0
        L_0x02b0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{  }
            r1.f2798h = r2     // Catch:{  }
            r1.i = r3     // Catch:{  }
            goto L_0x0310
        L_0x02b9:
            r2 = 0
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.f2809t = r2
            goto L_0x0310
        L_0x02c3:
            r2 = 0
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.f2795d = r2
            goto L_0x0310
        L_0x02cd:
            r2 = 0
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.f2793b = r2
            goto L_0x0310
        L_0x02d7:
            r2 = 0
            java.lang.Object r3 = r9.get(r2)     // Catch:{ NumberFormatException -> 0x0310 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NumberFormatException -> 0x0310 }
            java.lang.String r4 = r3.substring(r7, r4)     // Catch:{ NumberFormatException -> 0x0310 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x0310 }
            java.lang.String r2 = r3.substring(r2, r7)     // Catch:{ NumberFormatException -> 0x0310 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0310 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0310 }
            r1.d(r3)     // Catch:{ NumberFormatException -> 0x0310 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0310 }
            r1.c(r2)     // Catch:{ NumberFormatException -> 0x0310 }
            goto L_0x0310
        L_0x02fd:
            r2 = 0
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.f2808s = r2
            goto L_0x0310
        L_0x0307:
            r2 = 0
            java.lang.Object r2 = r9.get(r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.f2794c = r2
        L_0x0310:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.n.e(M0.E):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        int i = z.f3748a;
        if (!Objects.equals(this.f1009U, nVar.f1009U) || !Objects.equals(this.f1021V, nVar.f1021V) || !this.f1022W.equals(nVar.f1022W)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int u3 = e.u(527, 31, this.f1009U);
        String str = this.f1021V;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.f1022W.hashCode() + ((u3 + i) * 31);
    }

    public final String toString() {
        return this.f1009U + ": description=" + this.f1021V + ": values=" + this.f1022W;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1009U);
        parcel.writeString(this.f1021V);
        parcel.writeStringArray((String[]) this.f1022W.toArray((Object[]) new String[0]));
    }
}
