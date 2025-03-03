package z2;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public final class e implements Closeable {

    /* renamed from: U  reason: collision with root package name */
    public final FileInputStream f16443U;

    /* renamed from: V  reason: collision with root package name */
    public final Charset f16444V;

    /* renamed from: W  reason: collision with root package name */
    public byte[] f16445W;

    /* renamed from: X  reason: collision with root package name */
    public int f16446X;

    /* renamed from: Y  reason: collision with root package name */
    public int f16447Y;

    public e(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(f.f16448a)) {
            this.f16443U = fileInputStream;
            this.f16444V = charset;
            this.f16445W = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void close() {
        synchronized (this.f16443U) {
            try {
                if (this.f16445W != null) {
                    this.f16445W = null;
                    this.f16443U.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String k() {
        int i;
        synchronized (this.f16443U) {
            try {
                byte[] bArr = this.f16445W;
                if (bArr != null) {
                    if (this.f16446X >= this.f16447Y) {
                        int read = this.f16443U.read(bArr, 0, bArr.length);
                        if (read != -1) {
                            this.f16446X = 0;
                            this.f16447Y = read;
                        } else {
                            throw new EOFException();
                        }
                    }
                    for (int i8 = this.f16446X; i8 != this.f16447Y; i8++) {
                        byte[] bArr2 = this.f16445W;
                        if (bArr2[i8] == 10) {
                            int i9 = this.f16446X;
                            if (i8 != i9) {
                                i = i8 - 1;
                                if (bArr2[i] == 13) {
                                    String str = new String(bArr2, i9, i - i9, this.f16444V.name());
                                    this.f16446X = i8 + 1;
                                    return str;
                                }
                            }
                            i = i8;
                            String str2 = new String(bArr2, i9, i - i9, this.f16444V.name());
                            this.f16446X = i8 + 1;
                            return str2;
                        }
                    }
                    d dVar = new d(this, (this.f16447Y - this.f16446X) + 80);
                    while (true) {
                        byte[] bArr3 = this.f16445W;
                        int i10 = this.f16446X;
                        dVar.write(bArr3, i10, this.f16447Y - i10);
                        this.f16447Y = -1;
                        byte[] bArr4 = this.f16445W;
                        int read2 = this.f16443U.read(bArr4, 0, bArr4.length);
                        if (read2 != -1) {
                            this.f16446X = 0;
                            this.f16447Y = read2;
                            int i11 = 0;
                            while (true) {
                                if (i11 != this.f16447Y) {
                                    byte[] bArr5 = this.f16445W;
                                    if (bArr5[i11] == 10) {
                                        int i12 = this.f16446X;
                                        if (i11 != i12) {
                                            dVar.write(bArr5, i12, i11 - i12);
                                        }
                                        this.f16446X = i11 + 1;
                                        String dVar2 = dVar.toString();
                                        return dVar2;
                                    }
                                    i11++;
                                }
                            }
                        } else {
                            throw new EOFException();
                        }
                    }
                } else {
                    throw new IOException("LineReader is closed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
