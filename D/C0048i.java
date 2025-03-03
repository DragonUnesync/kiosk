package D;

import B.C0022x;
import C7.d;
import android.util.Range;
import android.util.Size;
import t.C1412a;

/* renamed from: D.i  reason: case insensitive filesystem */
public final class C0048i {

    /* renamed from: f  reason: collision with root package name */
    public static final Range f903f = new Range(0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final Size f904a;

    /* renamed from: b  reason: collision with root package name */
    public final C0022x f905b;

    /* renamed from: c  reason: collision with root package name */
    public final Range f906c;

    /* renamed from: d  reason: collision with root package name */
    public final C1412a f907d;
    public final boolean e;

    public C0048i(Size size, C0022x xVar, Range range, C1412a aVar, boolean z) {
        this.f904a = size;
        this.f905b = xVar;
        this.f906c = range;
        this.f907d = aVar;
        this.e = z;
    }

    public final d a() {
        d dVar = new d(2);
        dVar.f732V = this.f904a;
        dVar.f733W = this.f905b;
        dVar.f734X = this.f906c;
        dVar.f735Y = this.f907d;
        dVar.f736Z = Boolean.valueOf(this.e);
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0048i)) {
            return false;
        }
        C0048i iVar = (C0048i) obj;
        if (this.f904a.equals(iVar.f904a) && this.f905b.equals(iVar.f905b) && this.f906c.equals(iVar.f906c)) {
            C1412a aVar = iVar.f907d;
            C1412a aVar2 = this.f907d;
            if (aVar2 != null ? aVar2.equals(aVar) : aVar == null) {
                if (this.e == iVar.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i8;
        int hashCode = (((((this.f904a.hashCode() ^ 1000003) * 1000003) ^ this.f905b.hashCode()) * 1000003) ^ this.f906c.hashCode()) * 1000003;
        C1412a aVar = this.f907d;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.hashCode();
        }
        int i9 = (hashCode ^ i) * 1000003;
        if (this.e) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        return i9 ^ i8;
    }

    public final String toString() {
        return "StreamSpec{resolution=" + this.f904a + ", dynamicRange=" + this.f905b + ", expectedFrameRateRange=" + this.f906c + ", implementationOptions=" + this.f907d + ", zslDisabled=" + this.e + "}";
    }
}
