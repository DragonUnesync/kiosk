package H1;

import A.f;
import java.util.ArrayDeque;
import org.altbeacon.bluetooth.Pdu;
import p1.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f1815a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f1816b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final e f1817c = new e();

    /* renamed from: d  reason: collision with root package name */
    public f f1818d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f1819f;

    /* renamed from: g  reason: collision with root package name */
    public long f1820g;

    public final long a(l lVar, int i) {
        byte[] bArr = this.f1815a;
        lVar.c(bArr, 0, i, false);
        long j7 = 0;
        for (int i8 = 0; i8 < i; i8++) {
            j7 = (j7 << 8) | ((long) (bArr[i8] & Pdu.MANUFACTURER_DATA_PDU_TYPE));
        }
        return j7;
    }
}
