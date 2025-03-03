package D2;

import B2.f;
import B2.i;
import B2.m;
import E2.e;
import E2.g;
import V0.v;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

public final class F implements f {

    /* renamed from: j  reason: collision with root package name */
    public static final v f1044j = new v(50);

    /* renamed from: b  reason: collision with root package name */
    public final g f1045b;

    /* renamed from: c  reason: collision with root package name */
    public final f f1046c;

    /* renamed from: d  reason: collision with root package name */
    public final f f1047d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1048f;

    /* renamed from: g  reason: collision with root package name */
    public final Class f1049g;

    /* renamed from: h  reason: collision with root package name */
    public final i f1050h;
    public final m i;

    public F(g gVar, f fVar, f fVar2, int i8, int i9, m mVar, Class cls, i iVar) {
        this.f1045b = gVar;
        this.f1046c = fVar;
        this.f1047d = fVar2;
        this.e = i8;
        this.f1048f = i9;
        this.i = mVar;
        this.f1049g = cls;
        this.f1050h = iVar;
    }

    public final void a(MessageDigest messageDigest) {
        Object f8;
        g gVar = this.f1045b;
        Class<byte[]> cls = byte[].class;
        synchronized (gVar) {
            E2.f fVar = gVar.f1339b;
            E2.i iVar = (E2.i) ((ArrayDeque) fVar.f1328V).poll();
            if (iVar == null) {
                iVar = fVar.p();
            }
            e eVar = (e) iVar;
            eVar.f1335b = 8;
            eVar.f1336c = cls;
            f8 = gVar.f(eVar, cls);
        }
        byte[] bArr = (byte[]) f8;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f1048f).array();
        this.f1047d.a(messageDigest);
        this.f1046c.a(messageDigest);
        messageDigest.update(bArr);
        m mVar = this.i;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.f1050h.a(messageDigest);
        v vVar = f1044j;
        Class cls2 = this.f1049g;
        byte[] bArr2 = (byte[]) vVar.a(cls2);
        if (bArr2 == null) {
            bArr2 = cls2.getName().getBytes(f.f383a);
            vVar.f(cls2, bArr2);
        }
        messageDigest.update(bArr2);
        this.f1045b.h(bArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r4 = (D2.F) r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof D2.F
            r1 = 0
            if (r0 == 0) goto L_0x0046
            D2.F r4 = (D2.F) r4
            int r0 = r4.f1048f
            int r2 = r3.f1048f
            if (r2 != r0) goto L_0x0046
            int r0 = r3.e
            int r2 = r4.e
            if (r0 != r2) goto L_0x0046
            B2.m r0 = r3.i
            B2.m r2 = r4.i
            boolean r0 = W2.m.b(r0, r2)
            if (r0 == 0) goto L_0x0046
            java.lang.Class r0 = r3.f1049g
            java.lang.Class r2 = r4.f1049g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            B2.f r0 = r3.f1046c
            B2.f r2 = r4.f1046c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            B2.f r0 = r3.f1047d
            B2.f r2 = r4.f1047d
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0046
            B2.i r0 = r3.f1050h
            B2.i r4 = r4.f1050h
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0046
            r1 = 1
        L_0x0046:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.F.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = ((((this.f1047d.hashCode() + (this.f1046c.hashCode() * 31)) * 31) + this.e) * 31) + this.f1048f;
        m mVar = this.i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        int hashCode2 = this.f1049g.hashCode();
        return this.f1050h.f388b.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f1046c + ", signature=" + this.f1047d + ", width=" + this.e + ", height=" + this.f1048f + ", decodedResourceClass=" + this.f1049g + ", transformation='" + this.i + "', options=" + this.f1050h + '}';
    }
}
