package M0;

import N.e;
import P0.l;
import P0.z;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: M0.b  reason: case insensitive filesystem */
public final class C0114b {

    /* renamed from: a  reason: collision with root package name */
    public final int f2893a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2894b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri[] f2895c;

    /* renamed from: d  reason: collision with root package name */
    public final C[] f2896d;
    public final int[] e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f2897f;

    static {
        e.D(0, 1, 2, 3, 4);
        z.J(5);
        z.J(6);
        z.J(7);
        z.J(8);
    }

    public C0114b(int i, int i8, int[] iArr, C[] cArr, long[] jArr) {
        boolean z;
        Uri uri;
        int i9 = 0;
        if (iArr.length == cArr.length) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        this.f2893a = i;
        this.f2894b = i8;
        this.e = iArr;
        this.f2896d = cArr;
        this.f2897f = jArr;
        this.f2895c = new Uri[cArr.length];
        while (true) {
            Uri[] uriArr = this.f2895c;
            if (i9 < uriArr.length) {
                C c8 = cArr[i9];
                if (c8 == null) {
                    uri = null;
                } else {
                    C0137z zVar = c8.f2786b;
                    zVar.getClass();
                    uri = zVar.f3060a;
                }
                uriArr[i9] = uri;
                i9++;
            } else {
                return;
            }
        }
    }

    public final int a(int i) {
        int i8;
        int i9 = i + 1;
        while (true) {
            int[] iArr = this.e;
            if (i9 >= iArr.length || (i8 = iArr[i9]) == 0 || i8 == 1) {
                return i9;
            }
            i9++;
        }
        return i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0114b.class != obj.getClass()) {
            return false;
        }
        C0114b bVar = (C0114b) obj;
        if (this.f2893a != bVar.f2893a || this.f2894b != bVar.f2894b || !Arrays.equals(this.f2896d, bVar.f2896d) || !Arrays.equals(this.e, bVar.e) || !Arrays.equals(this.f2897f, bVar.f2897f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = (int) 0;
        int hashCode = Arrays.hashCode(this.f2896d);
        int hashCode2 = Arrays.hashCode(this.e);
        return (((Arrays.hashCode(this.f2897f) + ((hashCode2 + ((hashCode + (((((this.f2893a * 31) + this.f2894b) * 31) + i) * 31)) * 31)) * 31)) * 31) + i) * 31;
    }
}
