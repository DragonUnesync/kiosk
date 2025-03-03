package V1;

import N1.f;
import android.util.SparseArray;
import p1.G;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final G f5844a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5845b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5846c;

    /* renamed from: d  reason: collision with root package name */
    public final SparseArray f5847d = new SparseArray();
    public final SparseArray e = new SparseArray();

    /* renamed from: f  reason: collision with root package name */
    public final f f5848f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f5849g;

    /* renamed from: h  reason: collision with root package name */
    public int f5850h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public long f5851j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5852k;

    /* renamed from: l  reason: collision with root package name */
    public long f5853l;

    /* renamed from: m  reason: collision with root package name */
    public o f5854m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public o f5855n = new Object();

    /* renamed from: o  reason: collision with root package name */
    public boolean f5856o;

    /* renamed from: p  reason: collision with root package name */
    public long f5857p;

    /* renamed from: q  reason: collision with root package name */
    public long f5858q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5859r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5860s;

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, V1.o] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, V1.o] */
    public p(G g8, boolean z, boolean z6) {
        this.f5844a = g8;
        this.f5845b = z;
        this.f5846c = z6;
        byte[] bArr = new byte[128];
        this.f5849g = bArr;
        this.f5848f = new f(bArr, 0, 0);
        this.f5852k = false;
        this.f5856o = false;
        o oVar = this.f5855n;
        oVar.f5831b = false;
        oVar.f5830a = false;
    }

    public final void a() {
        boolean z;
        int i8;
        boolean z6 = false;
        if (this.f5845b) {
            o oVar = this.f5855n;
            if (!oVar.f5831b || !((i8 = oVar.e) == 7 || i8 == 2)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = this.f5860s;
        }
        boolean z8 = this.f5859r;
        int i9 = this.i;
        if (i9 == 5 || (z && i9 == 1)) {
            z6 = true;
        }
        this.f5859r = z8 | z6;
    }
}
