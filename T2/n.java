package t2;

import Q0.g;
import android.support.v4.media.session.b;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.Arrays;
import v2.C1559b;
import v2.c;
import v2.e;
import y2.C1628c;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final int f15209a;

    /* renamed from: b  reason: collision with root package name */
    public final c f15210b;

    /* renamed from: c  reason: collision with root package name */
    public final e f15211c;

    /* renamed from: d  reason: collision with root package name */
    public final C1559b f15212d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f15213f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15214g;

    public n(int i, c cVar, e eVar, C1559b bVar, int i8, boolean z, String str) {
        if (cVar == null) {
            throw new NullPointerException("result == null");
        } else if (eVar == null) {
            throw new NullPointerException("sources == null");
        } else if (bVar == null) {
            throw new NullPointerException("exceptions == null");
        } else if (i8 < 1 || i8 > 6) {
            throw new IllegalArgumentException(g.m(i8, "invalid branchingness: "));
        } else if (bVar.f16371V.length == 0 || i8 == 6) {
            this.f15209a = i;
            this.f15210b = cVar;
            this.f15211c = eVar;
            this.f15212d = bVar;
            this.e = i8;
            this.f15213f = z;
            this.f15214g = str;
        } else {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (t2.n) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof t2.n
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            t2.n r5 = (t2.n) r5
            int r1 = r5.f15209a
            int r3 = r4.f15209a
            if (r3 != r1) goto L_0x0033
            int r1 = r4.e
            int r3 = r5.e
            if (r1 != r3) goto L_0x0033
            v2.c r1 = r4.f15210b
            v2.c r3 = r5.f15210b
            if (r1 != r3) goto L_0x0033
            v2.e r1 = r4.f15211c
            v2.e r3 = r5.f15211c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0033
            v2.b r1 = r4.f15212d
            v2.b r5 = r5.f15212d
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.n.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int u3 = N.e.u(((this.f15209a * 31) + this.e) * 31, 31, this.f15210b.f16075U);
        return Arrays.hashCode(this.f15212d.f16371V) + ((Arrays.hashCode(((C1628c) this.f15211c).f16371V) + u3) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder(40);
        sb.append("Rop{");
        int i = this.f15209a;
        switch (i) {
            case 1:
                str = "nop";
                break;
            case 2:
                str = "move";
                break;
            case 3:
                str = "move-param";
                break;
            case 4:
                str = "move-exception";
                break;
            case 5:
                str = "const";
                break;
            case 6:
                str = "goto";
                break;
            case 7:
                str = "if-eq";
                break;
            case 8:
                str = "if-ne";
                break;
            case 9:
                str = "if-lt";
                break;
            case 10:
                str = "if-ge";
                break;
            case 11:
                str = "if-le";
                break;
            case 12:
                str = "if-gt";
                break;
            case 13:
                str = "switch";
                break;
            case EnterpriseDeviceManager.KNOX_2_3:
                str = "add";
                break;
            case EnterpriseDeviceManager.KNOX_2_4:
                str = "sub";
                break;
            case EnterpriseDeviceManager.KNOX_2_4_1:
                str = "mul";
                break;
            case EnterpriseDeviceManager.KNOX_2_5:
                str = "div";
                break;
            case EnterpriseDeviceManager.KNOX_2_5_1:
                str = "rem";
                break;
            case EnterpriseDeviceManager.KNOX_2_6:
                str = "neg";
                break;
            case EnterpriseDeviceManager.KNOX_2_7:
                str = "and";
                break;
            case 21:
                str = "or";
                break;
            case 22:
                str = "xor";
                break;
            case 23:
                str = "shl";
                break;
            case 24:
                str = "shr";
                break;
            case 25:
                str = "ushr";
                break;
            case 26:
                str = "not";
                break;
            case 27:
                str = "cmpl";
                break;
            case 28:
                str = "cmpg";
                break;
            case 29:
                str = "conv";
                break;
            case 30:
                str = "to-byte";
                break;
            case 31:
                str = "to-char";
                break;
            case 32:
                str = "to-short";
                break;
            case 33:
                str = "return";
                break;
            case 34:
                str = "array-length";
                break;
            case 35:
                str = "throw";
                break;
            case 36:
                str = "monitor-enter";
                break;
            case 37:
                str = "monitor-exit";
                break;
            case 38:
                str = "aget";
                break;
            case 39:
                str = "aput";
                break;
            case 40:
                str = "new-instance";
                break;
            case 41:
                str = "new-array";
                break;
            case 42:
                str = "filled-new-array";
                break;
            case 43:
                str = "check-cast";
                break;
            case 44:
                str = "instance-of";
                break;
            case 45:
                str = "get-field";
                break;
            case 46:
                str = "get-static";
                break;
            case 47:
                str = "put-field";
                break;
            case 48:
                str = "put-static";
                break;
            case 49:
                str = "invoke-static";
                break;
            case 50:
                str = "invoke-virtual";
                break;
            case 51:
                str = "invoke-super";
                break;
            case 52:
                str = "invoke-direct";
                break;
            case 53:
                str = "invoke-interface";
                break;
            case 55:
                str = "move-result";
                break;
            case 56:
                str = "move-result-pseudo";
                break;
            case 57:
                str = "fill-array-data";
                break;
            case 58:
                str = "invoke-polymorphic";
                break;
            case 59:
                str = "invoke-custom";
                break;
            default:
                str = "unknown-".concat(b.O(i));
                break;
        }
        sb.append(str);
        c cVar = c.f16058i0;
        c cVar2 = this.f15210b;
        if (cVar2 != cVar) {
            sb.append(" ");
            sb.append(cVar2);
        } else {
            sb.append(" .");
        }
        sb.append(" <-");
        e eVar = this.f15211c;
        int length = ((C1628c) eVar).f16371V.length;
        if (length == 0) {
            sb.append(" .");
        } else {
            for (int i8 = 0; i8 < length; i8++) {
                sb.append(' ');
                sb.append(eVar.b(i8));
            }
        }
        if (this.f15213f) {
            sb.append(" call");
        }
        C1559b bVar = this.f15212d;
        int length2 = bVar.f16371V.length;
        if (length2 != 0) {
            sb.append(" throws");
            for (int i9 = 0; i9 < length2; i9++) {
                sb.append(' ');
                if (((c) bVar.e(i9)) == c.f16065q0) {
                    sb.append("<any>");
                } else {
                    sb.append((c) bVar.e(i9));
                }
            }
        } else {
            int i10 = this.e;
            if (i10 == 1) {
                sb.append(" flows");
            } else if (i10 == 2) {
                sb.append(" returns");
            } else if (i10 == 3) {
                sb.append(" gotos");
            } else if (i10 == 4) {
                sb.append(" ifs");
            } else if (i10 != 5) {
                sb.append(" ".concat(b.O(i10)));
            } else {
                sb.append(" switches");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public n(int i, c cVar, C1559b bVar, int i8, String str) {
        this(i, cVar, bVar, C1559b.f16011W, i8, false, str);
    }

    public n(int i, c cVar, e eVar, String str) {
        this(i, cVar, eVar, C1559b.f16011W, 1, false, str);
    }

    public n(int i, c cVar, e eVar, C1559b bVar, String str) {
        this(i, cVar, eVar, bVar, 6, false, str);
    }

    public n(int i, C1559b bVar, C1559b bVar2) {
        this(i, c.f16058i0, bVar, bVar2, 6, true, (String) null);
    }
}
