package D4;

import i5.s;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f1237a;

    /* renamed from: b  reason: collision with root package name */
    public final s f1238b;

    /* renamed from: c  reason: collision with root package name */
    public i f1239c;

    /* renamed from: d  reason: collision with root package name */
    public long f1240d;
    public byte e;

    /* renamed from: f  reason: collision with root package name */
    public byte f1241f = 2;

    /* renamed from: g  reason: collision with root package name */
    public byte f1242g;

    /* renamed from: h  reason: collision with root package name */
    public byte f1243h = 2;

    static {
        new h(0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [i5.s, java.lang.Object] */
    public j(int i) {
        ? obj = new Object();
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
        obj.f12758d = new Object[numberOfLeadingZeros];
        obj.f12757c = (int) (((float) numberOfLeadingZeros) * 0.25f);
        this.f1238b = obj;
        this.f1237a = i;
    }

    public final void a(i iVar, long j7) {
        i iVar2 = iVar.e;
        if (iVar2 != null) {
            i iVar3 = iVar.f1236f;
            long a8 = iVar.a(j7);
            while (iVar2.a(j7) < a8) {
                if (iVar.f1233b == 0 && iVar2.f1233b != 0) {
                    byte b8 = (byte) (this.e + 1);
                    this.e = b8;
                    byte b9 = this.f1241f;
                    if (b8 >= b9) {
                        this.e = 0;
                        if (b9 < 126) {
                            this.f1241f = (byte) (b9 + ((byte) Math.min(2, 126 - b9)));
                        }
                        iVar.f1233b = iVar2.f1233b | 65536;
                        iVar2.f1233b = 0;
                    } else {
                        return;
                    }
                }
                i iVar4 = iVar2.e;
                iVar2.e = iVar;
                iVar.f1236f = iVar2;
                if (iVar3 == null) {
                    iVar2.f1236f = null;
                    this.f1239c = iVar2;
                } else {
                    iVar3.e = iVar2;
                    iVar2.f1236f = iVar3;
                }
                if (iVar4 == null) {
                    iVar.e = null;
                    return;
                }
                iVar.e = iVar4;
                iVar4.f1236f = iVar;
                iVar3 = iVar2;
                iVar2 = iVar4;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (i iVar = this.f1239c; iVar != null; iVar = iVar.e) {
            sb.append("\n  ");
            sb.append(iVar);
        }
        sb.append("\n}");
        return sb.toString();
    }
}
