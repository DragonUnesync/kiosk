package R7;

import E7.d;
import Q7.g;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.function.Supplier;
import org.altbeacon.bluetooth.Pdu;

public final class c extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: Z  reason: collision with root package name */
    public static final R2.c f4361Z = new R2.c((Supplier) new d(2));

    /* renamed from: U  reason: collision with root package name */
    public byte[] f4362U;

    /* renamed from: V  reason: collision with root package name */
    public int f4363V;

    /* renamed from: W  reason: collision with root package name */
    public int f4364W;

    /* renamed from: X  reason: collision with root package name */
    public int f4365X = -1;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f4366Y = false;

    public c(InputStream inputStream) {
        super(inputStream);
    }

    public final int available() {
        int i;
        if (this.f4362U != null && (i = this.f4364W - this.f4363V) > 0) {
            return i;
        }
        if (this.f4366Y) {
            return 0;
        }
        return this.in.available();
    }

    public final void close() {
        super.close();
        byte[] bArr = this.f4362U;
        if (bArr != null) {
            f4361Z.u0(bArr);
            this.f4362U = null;
        }
    }

    public final void k() {
        if (!this.f4366Y) {
            if (this.f4362U == null) {
                this.f4362U = (byte[]) f4361Z.F();
            }
            int i = this.f4365X;
            if (i < 0) {
                this.f4363V = 0;
            } else {
                int i8 = this.f4363V;
                if (i8 >= 8192) {
                    if (i > 0) {
                        int i9 = i8 - i;
                        byte[] bArr = this.f4362U;
                        System.arraycopy(bArr, i, bArr, 0, i9);
                        this.f4363V = i9;
                        this.f4365X = 0;
                    } else {
                        this.f4365X = -1;
                        this.f4363V = 0;
                    }
                }
            }
            this.f4364W = this.f4363V;
            InputStream inputStream = this.in;
            byte[] bArr2 = this.f4362U;
            int i10 = this.f4363V;
            int read = inputStream.read(bArr2, i10, bArr2.length - i10);
            if (read > 0) {
                this.f4364W = this.f4363V + read;
                while (this.f4362U.length - this.f4364W > 0 && this.in.available() >= 1) {
                    InputStream inputStream2 = this.in;
                    byte[] bArr3 = this.f4362U;
                    int i11 = this.f4364W;
                    read = inputStream2.read(bArr3, i11, bArr3.length - i11);
                    if (read <= 0) {
                        break;
                    }
                    this.f4364W += read;
                }
            }
            if (read == -1) {
                this.f4366Y = true;
                super.close();
            }
        }
    }

    public final void mark(int i) {
        if (i <= 8192) {
            this.f4365X = this.f4363V;
            return;
        }
        throw new IllegalArgumentException("Read-ahead limit is greater than buffer size");
    }

    public final int read() {
        if (this.f4363V >= this.f4364W) {
            k();
            if (this.f4363V >= this.f4364W) {
                return -1;
            }
        }
        g.D(this.f4362U);
        byte[] bArr = this.f4362U;
        int i = this.f4363V;
        this.f4363V = i + 1;
        return bArr[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
    }

    public final void reset() {
        int i = this.f4365X;
        if (i >= 0) {
            this.f4363V = i;
            return;
        }
        throw new IOException("Resetting to invalid mark");
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i8) {
        g.D(bArr);
        if (i < 0 || i8 < 0 || i8 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i8 == 0) {
            return 0;
        } else {
            int i9 = this.f4364W - this.f4363V;
            if (i9 <= 0) {
                if (this.f4366Y || this.f4365X >= 0) {
                    k();
                    i9 = this.f4364W - this.f4363V;
                } else {
                    int read = this.in.read(bArr, i, i8);
                    if (read == -1) {
                        this.f4366Y = true;
                        super.close();
                    }
                    return read;
                }
            }
            int min = Math.min(i9, i8);
            if (min <= 0) {
                return -1;
            }
            g.D(this.f4362U);
            System.arraycopy(this.f4362U, this.f4363V, bArr, i, min);
            this.f4363V += min;
            return min;
        }
    }
}
