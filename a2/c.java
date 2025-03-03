package A2;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import org.altbeacon.bluetooth.Pdu;
import u.C1477r;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f55a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f56b;

    /* renamed from: c  reason: collision with root package name */
    public b f57c;

    /* renamed from: d  reason: collision with root package name */
    public int f58d = 0;

    public final boolean a() {
        if (this.f57c.f47b != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [java.lang.Object, A2.a] */
    /* JADX WARNING: type inference failed for: r6v32, types: [java.lang.Object, A2.a] */
    public final b b() {
        boolean z;
        byte[] bArr;
        boolean z6;
        boolean z8;
        boolean z9;
        if (this.f56b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (a()) {
            return this.f57c;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append((char) c());
            }
            if (!sb.toString().startsWith("GIF")) {
                this.f57c.f47b = 1;
            } else {
                this.f57c.f50f = this.f56b.getShort();
                this.f57c.f51g = this.f56b.getShort();
                int c8 = c();
                b bVar = this.f57c;
                if ((c8 & 128) != 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                bVar.f52h = z9;
                bVar.i = (int) Math.pow(2.0d, (double) ((c8 & 7) + 1));
                this.f57c.f53j = c();
                b bVar2 = this.f57c;
                c();
                bVar2.getClass();
                if (this.f57c.f52h && !a()) {
                    b bVar3 = this.f57c;
                    bVar3.f46a = e(bVar3.i);
                    b bVar4 = this.f57c;
                    bVar4.f54k = bVar4.f46a[bVar4.f53j];
                }
            }
            if (!a()) {
                boolean z10 = false;
                while (!z10 && !a() && this.f57c.f48c <= Integer.MAX_VALUE) {
                    int c9 = c();
                    if (c9 == 33) {
                        int c10 = c();
                        if (c10 == 1) {
                            f();
                        } else if (c10 == 249) {
                            this.f57c.f49d = new Object();
                            c();
                            int c11 = c();
                            a aVar = this.f57c.f49d;
                            int i8 = (c11 & 28) >> 2;
                            aVar.f42g = i8;
                            if (i8 == 0) {
                                aVar.f42g = 1;
                            }
                            if ((c11 & 1) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            aVar.f41f = z;
                            short s8 = this.f56b.getShort();
                            if (s8 < 2) {
                                s8 = 10;
                            }
                            a aVar2 = this.f57c.f49d;
                            aVar2.i = s8 * 10;
                            aVar2.f43h = c();
                            c();
                        } else if (c10 == 254) {
                            f();
                        } else if (c10 != 255) {
                            f();
                        } else {
                            d();
                            StringBuilder sb2 = new StringBuilder();
                            int i9 = 0;
                            while (true) {
                                bArr = this.f55a;
                                if (i9 >= 11) {
                                    break;
                                }
                                sb2.append((char) bArr[i9]);
                                i9++;
                            }
                            if (sb2.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    if (bArr[0] == 1) {
                                        byte b8 = bArr[1];
                                        byte b9 = bArr[2];
                                        this.f57c.getClass();
                                    }
                                    if (this.f58d <= 0) {
                                        break;
                                    }
                                } while (a());
                            } else {
                                f();
                            }
                        }
                    } else if (c9 == 44) {
                        b bVar5 = this.f57c;
                        if (bVar5.f49d == null) {
                            bVar5.f49d = new Object();
                        }
                        bVar5.f49d.f37a = this.f56b.getShort();
                        this.f57c.f49d.f38b = this.f56b.getShort();
                        this.f57c.f49d.f39c = this.f56b.getShort();
                        this.f57c.f49d.f40d = this.f56b.getShort();
                        int c12 = c();
                        if ((c12 & 128) != 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        int pow = (int) Math.pow(2.0d, (double) ((c12 & 7) + 1));
                        a aVar3 = this.f57c.f49d;
                        if ((c12 & 64) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        aVar3.e = z8;
                        if (z6) {
                            aVar3.f45k = e(pow);
                        } else {
                            aVar3.f45k = null;
                        }
                        this.f57c.f49d.f44j = this.f56b.position();
                        c();
                        f();
                        if (!a()) {
                            b bVar6 = this.f57c;
                            bVar6.f48c++;
                            bVar6.e.add(bVar6.f49d);
                        }
                    } else if (c9 != 59) {
                        this.f57c.f47b = 1;
                    } else {
                        z10 = true;
                    }
                }
                b bVar7 = this.f57c;
                if (bVar7.f48c < 0) {
                    bVar7.f47b = 1;
                }
            }
            return this.f57c;
        }
    }

    public final int c() {
        try {
            return this.f56b.get() & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        } catch (Exception unused) {
            this.f57c.f47b = 1;
            return 0;
        }
    }

    public final void d() {
        int c8 = c();
        this.f58d = c8;
        if (c8 > 0) {
            int i = 0;
            int i8 = 0;
            while (true) {
                try {
                    int i9 = this.f58d;
                    if (i < i9) {
                        i8 = i9 - i;
                        this.f56b.get(this.f55a, i, i8);
                        i += i8;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder e8 = C1477r.e("Error Reading Block n: ", i, " count: ", i8, " blockSize: ");
                        e8.append(this.f58d);
                        Log.d("GifHeaderParser", e8.toString(), e);
                    }
                    this.f57c.f47b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f56b.get(bArr);
            iArr = new int[256];
            int i8 = 0;
            int i9 = 0;
            while (i8 < i) {
                byte b8 = bArr[i9] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                int i10 = i9 + 2;
                byte b9 = bArr[i9 + 1] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                i9 += 3;
                int i11 = i8 + 1;
                iArr[i8] = (b9 << 8) | (b8 << 16) | -16777216 | (bArr[i10] & Pdu.MANUFACTURER_DATA_PDU_TYPE);
                i8 = i11;
            }
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.f57c.f47b = 1;
        }
        return iArr;
    }

    public final void f() {
        int c8;
        do {
            c8 = c();
            this.f56b.position(Math.min(this.f56b.position() + c8, this.f56b.limit()));
        } while (c8 > 0);
    }
}
