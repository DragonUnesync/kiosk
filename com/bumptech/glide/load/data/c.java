package com.bumptech.glide.load.data;

import E2.g;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class c extends OutputStream {

    /* renamed from: U  reason: collision with root package name */
    public final FileOutputStream f9031U;

    /* renamed from: V  reason: collision with root package name */
    public byte[] f9032V;

    /* renamed from: W  reason: collision with root package name */
    public final g f9033W;

    /* renamed from: X  reason: collision with root package name */
    public int f9034X;

    public c(FileOutputStream fileOutputStream, g gVar) {
        this.f9031U = fileOutputStream;
        this.f9033W = gVar;
        this.f9032V = (byte[]) gVar.d(byte[].class, 65536);
    }

    /* JADX INFO: finally extract failed */
    public final void close() {
        FileOutputStream fileOutputStream = this.f9031U;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f9032V;
            if (bArr != null) {
                this.f9033W.h(bArr);
                this.f9032V = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    public final void flush() {
        int i = this.f9034X;
        FileOutputStream fileOutputStream = this.f9031U;
        if (i > 0) {
            fileOutputStream.write(this.f9032V, 0, i);
            this.f9034X = 0;
        }
        fileOutputStream.flush();
    }

    public final void write(int i) {
        byte[] bArr = this.f9032V;
        int i8 = this.f9034X;
        int i9 = i8 + 1;
        this.f9034X = i9;
        bArr[i8] = (byte) i;
        if (i9 == bArr.length && i9 > 0) {
            this.f9031U.write(bArr, 0, i9);
            this.f9034X = 0;
        }
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i8) {
        int i9 = 0;
        do {
            int i10 = i8 - i9;
            int i11 = i + i9;
            int i12 = this.f9034X;
            FileOutputStream fileOutputStream = this.f9031U;
            if (i12 != 0 || i10 < this.f9032V.length) {
                int min = Math.min(i10, this.f9032V.length - i12);
                System.arraycopy(bArr, i11, this.f9032V, this.f9034X, min);
                int i13 = this.f9034X + min;
                this.f9034X = i13;
                i9 += min;
                byte[] bArr2 = this.f9032V;
                if (i13 == bArr2.length && i13 > 0) {
                    fileOutputStream.write(bArr2, 0, i13);
                    this.f9034X = 0;
                    continue;
                }
            } else {
                fileOutputStream.write(bArr, i11, i10);
                return;
            }
        } while (i9 < i8);
    }
}
