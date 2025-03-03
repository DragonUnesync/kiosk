package v2;

import j$.util.concurrent.ConcurrentHashMap;
import y2.C1628c;

/* renamed from: v2.a  reason: case insensitive filesystem */
public final class C1558a implements Comparable {

    /* renamed from: Y  reason: collision with root package name */
    public static final ConcurrentHashMap f16000Y = new ConcurrentHashMap(10000, 0.75f);

    /* renamed from: U  reason: collision with root package name */
    public final String f16001U;

    /* renamed from: V  reason: collision with root package name */
    public final c f16002V;

    /* renamed from: W  reason: collision with root package name */
    public final C1559b f16003W;

    /* renamed from: X  reason: collision with root package name */
    public C1559b f16004X;

    public C1558a(String str, c cVar, C1559b bVar) {
        if (str == null) {
            throw new NullPointerException("descriptor == null");
        } else if (cVar != null) {
            this.f16001U = str;
            this.f16002V = cVar;
            this.f16003W = bVar;
            this.f16004X = null;
        } else {
            throw new NullPointerException("returnType == null");
        }
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [v2.b, y2.c] */
    public static C1558a b(String str) {
        c cVar;
        int i;
        C1558a aVar = (C1558a) f16000Y.get(str);
        if (aVar != null) {
            return aVar;
        }
        int length = str.length();
        if (str.charAt(0) == '(') {
            int i8 = 1;
            int i9 = 0;
            while (true) {
                if (i8 >= length) {
                    i8 = 0;
                    break;
                }
                char charAt = str.charAt(i8);
                if (charAt == ')') {
                    break;
                }
                if (charAt >= 'A' && charAt <= 'Z') {
                    i9++;
                }
                i8++;
            }
            if (i8 == 0 || i8 == length - 1) {
                throw new IllegalArgumentException("bad descriptor");
            } else if (str.indexOf(41, i8 + 1) == -1) {
                c[] cVarArr = new c[i9];
                int i10 = 1;
                int i11 = 0;
                while (true) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 == ')') {
                        String substring = str.substring(i10 + 1);
                        ConcurrentHashMap concurrentHashMap = c.f16049Z;
                        try {
                            if (substring.equals("V")) {
                                cVar = c.f16058i0;
                            } else {
                                cVar = c.f(substring);
                            }
                            ? cVar2 = new C1628c(i11);
                            for (int i12 = 0; i12 < i11; i12++) {
                                cVar2.f(i12, cVarArr[i12]);
                            }
                            return new C1558a(str, cVar, cVar2);
                        } catch (NullPointerException unused) {
                            throw new NullPointerException("descriptor == null");
                        }
                    } else {
                        int i13 = i10;
                        while (charAt2 == '[') {
                            i13++;
                            charAt2 = str.charAt(i13);
                        }
                        if (charAt2 == 'L') {
                            int indexOf = str.indexOf(59, i13);
                            if (indexOf != -1) {
                                i = indexOf + 1;
                            } else {
                                throw new IllegalArgumentException("bad descriptor");
                            }
                        } else {
                            i = i13 + 1;
                        }
                        cVarArr[i11] = c.f(str.substring(i10, i));
                        i11++;
                        i10 = i;
                    }
                }
            } else {
                throw new IllegalArgumentException("bad descriptor");
            }
        } else {
            throw new IllegalArgumentException("bad descriptor");
        }
    }

    /* renamed from: a */
    public final int compareTo(C1558a aVar) {
        if (this == aVar) {
            return 0;
        }
        int compareTo = this.f16002V.f16075U.compareTo(aVar.f16002V.f16075U);
        if (compareTo != 0) {
            return compareTo;
        }
        C1559b bVar = this.f16003W;
        int length = bVar.f16371V.length;
        C1559b bVar2 = aVar.f16003W;
        int length2 = bVar2.f16371V.length;
        int min = Math.min(length, length2);
        for (int i = 0; i < min; i++) {
            int compareTo2 = ((c) bVar.e(i)).f16075U.compareTo(((c) bVar2.e(i)).f16075U);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: v2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: y2.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: v2.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: v2.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v2.C1559b c() {
        /*
            r9 = this;
            v2.b r0 = r9.f16004X
            if (r0 != 0) goto L_0x0039
            v2.b r0 = r9.f16003W
            java.lang.Object[] r1 = r0.f16371V
            int r1 = r1.length
            v2.b r2 = new v2.b
            r2.<init>(r1)
            r3 = 0
            r4 = 0
        L_0x0010:
            if (r3 >= r1) goto L_0x0034
            java.lang.Object r5 = r0.e(r3)
            v2.c r5 = (v2.c) r5
            r6 = 1
            int r7 = r5.f16076V
            if (r7 == r6) goto L_0x002b
            r8 = 2
            if (r7 == r8) goto L_0x002b
            r8 = 3
            if (r7 == r8) goto L_0x002b
            r8 = 6
            if (r7 == r8) goto L_0x002b
            r8 = 8
            if (r7 == r8) goto L_0x002b
            goto L_0x002e
        L_0x002b:
            v2.c r5 = v2.c.f16055f0
            r4 = 1
        L_0x002e:
            r2.f(r3, r5)
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0034:
            if (r4 == 0) goto L_0x0037
            r0 = r2
        L_0x0037:
            r9.f16004X = r0
        L_0x0039:
            v2.b r0 = r9.f16004X
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.C1558a.c():v2.b");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1558a)) {
            return false;
        }
        return this.f16001U.equals(((C1558a) obj).f16001U);
    }

    public final int hashCode() {
        return this.f16001U.hashCode();
    }

    public final String toString() {
        return this.f16001U;
    }
}
