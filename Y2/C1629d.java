package y2;

import java.io.FilterWriter;
import java.io.StringWriter;

/* renamed from: y2.d  reason: case insensitive filesystem */
public final class C1629d extends FilterWriter {

    /* renamed from: U  reason: collision with root package name */
    public final String f16372U;

    /* renamed from: V  reason: collision with root package name */
    public final int f16373V;

    /* renamed from: W  reason: collision with root package name */
    public final int f16374W;

    /* renamed from: X  reason: collision with root package name */
    public int f16375X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f16376Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f16377Z;

    public C1629d(int i, StringWriter stringWriter, String str) {
        super(stringWriter);
        int i8;
        if (i >= 0) {
            if (i != 0) {
                i8 = i;
            } else {
                i8 = Integer.MAX_VALUE;
            }
            this.f16373V = i8;
            boolean z = true;
            int i9 = i >> 1;
            this.f16374W = i9;
            this.f16372U = str.length() == 0 ? null : str;
            this.f16375X = 0;
            this.f16376Y = i9 == 0 ? false : z;
            this.f16377Z = 0;
            return;
        }
        throw new IllegalArgumentException("width < 0");
    }

    public final void write(int i) {
        int i8;
        synchronized (this.lock) {
            try {
                boolean z = true;
                if (this.f16376Y) {
                    if (i == 32) {
                        int i9 = this.f16377Z + 1;
                        this.f16377Z = i9;
                        int i10 = this.f16374W;
                        if (i9 >= i10) {
                            this.f16377Z = i10;
                            this.f16376Y = false;
                        }
                    } else {
                        this.f16376Y = false;
                    }
                }
                if (this.f16375X == this.f16373V && i != 10) {
                    this.out.write(10);
                    this.f16375X = 0;
                }
                if (this.f16375X == 0) {
                    String str = this.f16372U;
                    if (str != null) {
                        this.out.write(str);
                    }
                    if (!this.f16376Y) {
                        int i11 = 0;
                        while (true) {
                            i8 = this.f16377Z;
                            if (i11 >= i8) {
                                break;
                            }
                            this.out.write(32);
                            i11++;
                        }
                        this.f16375X = i8;
                    }
                }
                this.out.write(i);
                if (i == 10) {
                    this.f16375X = 0;
                    if (this.f16374W == 0) {
                        z = false;
                    }
                    this.f16376Y = z;
                    this.f16377Z = 0;
                } else {
                    this.f16375X++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void write(char[] cArr, int i, int i8) {
        synchronized (this.lock) {
            while (i8 > 0) {
                try {
                    write(cArr[i]);
                    i++;
                    i8--;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void write(String str, int i, int i8) {
        synchronized (this.lock) {
            while (i8 > 0) {
                try {
                    write(str.charAt(i));
                    i++;
                    i8--;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
