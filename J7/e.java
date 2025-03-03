package J7;

import E7.f;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

public final class e extends OutputStream {

    /* renamed from: Z  reason: collision with root package name */
    public static final /* synthetic */ int f2527Z = 0;

    /* renamed from: U  reason: collision with root package name */
    public final ArrayList f2528U = new ArrayList();

    /* renamed from: V  reason: collision with root package name */
    public int f2529V;

    /* renamed from: W  reason: collision with root package name */
    public int f2530W;

    /* renamed from: X  reason: collision with root package name */
    public byte[] f2531X;

    /* renamed from: Y  reason: collision with root package name */
    public int f2532Y;

    public e() {
        k(8192);
    }

    public final void close() {
    }

    public final void k(int i) {
        int i8 = this.f2529V;
        ArrayList arrayList = this.f2528U;
        if (i8 < arrayList.size() - 1) {
            this.f2530W += this.f2531X.length;
            int i9 = this.f2529V + 1;
            this.f2529V = i9;
            this.f2531X = (byte[]) arrayList.get(i9);
            return;
        }
        byte[] bArr = this.f2531X;
        if (bArr == null) {
            this.f2530W = 0;
        } else {
            i = Math.max(bArr.length << 1, i - this.f2530W);
            this.f2530W += this.f2531X.length;
        }
        this.f2529V++;
        byte[] bArr2 = f.f1385a;
        byte[] bArr3 = new byte[i];
        this.f2531X = bArr3;
        arrayList.add(bArr3);
    }

    public final byte[] l() {
        int i = this.f2532Y;
        if (i == 0) {
            return f.f1385a;
        }
        byte[] bArr = f.f1385a;
        byte[] bArr2 = new byte[i];
        Iterator it = this.f2528U.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            int min = Math.min(bArr3.length, i);
            System.arraycopy(bArr3, 0, bArr2, i8, min);
            i8 += min;
            i -= min;
            if (i == 0) {
                break;
            }
        }
        return bArr2;
    }

    public final String toString() {
        return new String(l(), Charset.defaultCharset());
    }

    public final void write(byte[] bArr, int i, int i8) {
        int i9;
        if (i < 0 || i > bArr.length || i8 < 0 || (i9 = i + i8) > bArr.length || i9 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", new Object[]{Integer.valueOf(i), Integer.valueOf(i8)}));
        } else if (i8 != 0) {
            int i10 = this.f2532Y;
            int i11 = i10 + i8;
            int i12 = i10 - this.f2530W;
            while (i8 > 0) {
                int min = Math.min(i8, this.f2531X.length - i12);
                System.arraycopy(bArr, i9 - i8, this.f2531X, i12, min);
                i8 -= min;
                if (i8 > 0) {
                    k(i11);
                    i12 = 0;
                }
            }
            this.f2532Y = i11;
        }
    }

    public final void write(int i) {
        int i8 = this.f2532Y;
        int i9 = i8 - this.f2530W;
        if (i9 == this.f2531X.length) {
            k(i8 + 1);
            i9 = 0;
        }
        this.f2531X[i9] = (byte) i;
        this.f2532Y++;
    }
}
