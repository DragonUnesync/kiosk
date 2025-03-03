package M3;

import java.util.EnumMap;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f3149a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3150b;

    /* renamed from: c  reason: collision with root package name */
    public n[] f3151c;

    /* renamed from: d  reason: collision with root package name */
    public final a f3152d;
    public EnumMap e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l(String str, byte[] bArr, n[] nVarArr, a aVar) {
        this(str, bArr, nVarArr, aVar, 0);
        System.currentTimeMillis();
    }

    public final void a(EnumMap enumMap) {
        if (enumMap != null) {
            EnumMap enumMap2 = this.e;
            if (enumMap2 == null) {
                this.e = enumMap;
            } else {
                enumMap2.putAll(enumMap);
            }
        }
    }

    public final void b(m mVar, Object obj) {
        if (this.e == null) {
            this.e = new EnumMap(m.class);
        }
        this.e.put(mVar, obj);
    }

    public final String toString() {
        return this.f3149a;
    }

    public l(String str, byte[] bArr, n[] nVarArr, a aVar, int i) {
        this.f3149a = str;
        this.f3150b = bArr;
        this.f3151c = nVarArr;
        this.f3152d = aVar;
        this.e = null;
    }
}
