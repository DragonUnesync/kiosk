package com.bumptech.glide.load.data;

import Q0.g;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.altbeacon.bluetooth.Pdu;

public final class i extends FilterInputStream implements InputStreamRetargetInterface {

    /* renamed from: W  reason: collision with root package name */
    public static final byte[] f9038W = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: X  reason: collision with root package name */
    public static final int f9039X = 31;

    /* renamed from: U  reason: collision with root package name */
    public final byte f9040U;

    /* renamed from: V  reason: collision with root package name */
    public int f9041V;

    public i(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(g.m(i, "Cannot add invalid orientation: "));
        }
        this.f9040U = (byte) i;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int i;
        int i8;
        int i9 = this.f9041V;
        if (i9 < 2 || i9 > (i8 = f9039X)) {
            i = super.read();
        } else if (i9 == i8) {
            i = this.f9040U;
        } else {
            i = f9038W[i9 - 2] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        }
        if (i != -1) {
            this.f9041V++;
        }
        return i;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j7) {
        long skip = super.skip(j7);
        if (skip > 0) {
            this.f9041V = (int) (((long) this.f9041V) + skip);
        }
        return skip;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i8) {
        int i9;
        int i10 = this.f9041V;
        int i11 = f9039X;
        if (i10 > i11) {
            i9 = super.read(bArr, i, i8);
        } else if (i10 == i11) {
            bArr[i] = this.f9040U;
            i9 = 1;
        } else if (i10 < 2) {
            i9 = super.read(bArr, i, 2 - i10);
        } else {
            int min = Math.min(i11 - i10, i8);
            System.arraycopy(f9038W, this.f9041V - 2, bArr, i, min);
            i9 = min;
        }
        if (i9 > 0) {
            this.f9041V += i9;
        }
        return i9;
    }
}
