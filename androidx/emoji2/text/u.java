package androidx.emoji2.text;

import B3.q;
import D0.a;
import java.nio.ByteBuffer;

public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal f7823d = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    public final int f7824a;

    /* renamed from: b  reason: collision with root package name */
    public final q f7825b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f7826c = 0;

    public u(q qVar, int i) {
        this.f7825b = qVar;
        this.f7824a = i;
    }

    public final int a(int i) {
        a c8 = c();
        int a8 = c8.a(16);
        if (a8 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c8.f980d;
        int i8 = a8 + c8.f977a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i8) + i8 + 4);
    }

    public final int b() {
        a c8 = c();
        int a8 = c8.a(16);
        if (a8 == 0) {
            return 0;
        }
        int i = a8 + c8.f977a;
        return ((ByteBuffer) c8.f980d).getInt(((ByteBuffer) c8.f980d).getInt(i) + i);
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, D0.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final D0.a c() {
        /*
            r4 = this;
            java.lang.ThreadLocal r0 = f7823d
            java.lang.Object r1 = r0.get()
            D0.a r1 = (D0.a) r1
            if (r1 != 0) goto L_0x0012
            D0.a r1 = new D0.a
            r1.<init>()
            r0.set(r1)
        L_0x0012:
            B3.q r0 = r4.f7825b
            java.lang.Object r0 = r0.f449U
            D0.b r0 = (D0.b) r0
            r2 = 6
            int r2 = r0.a(r2)
            if (r2 == 0) goto L_0x005e
            int r3 = r0.f977a
            int r2 = r2 + r3
            java.lang.Object r3 = r0.f980d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            int r3 = r3 + 4
            int r2 = r4.f7824a
            int r2 = r2 * 4
            int r2 = r2 + r3
            java.lang.Object r3 = r0.f980d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r2)
            int r3 = r3 + r2
            java.lang.Object r0 = r0.f980d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            r1.f980d = r0
            if (r0 == 0) goto L_0x0057
            r1.f977a = r3
            int r0 = r0.getInt(r3)
            int r3 = r3 - r0
            r1.f978b = r3
            java.lang.Object r0 = r1.f980d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            short r0 = r0.getShort(r3)
            r1.f979c = r0
            goto L_0x005e
        L_0x0057:
            r0 = 0
            r1.f977a = r0
            r1.f978b = r0
            r1.f979c = r0
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.u.c():D0.a");
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        a c8 = c();
        int a8 = c8.a(4);
        if (a8 != 0) {
            i = ((ByteBuffer) c8.f980d).getInt(a8 + c8.f977a);
        } else {
            i = 0;
        }
        sb.append(Integer.toHexString(i));
        sb.append(", codepoints:");
        int b8 = b();
        for (int i8 = 0; i8 < b8; i8++) {
            sb.append(Integer.toHexString(a(i8)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
