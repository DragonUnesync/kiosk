package D;

import H3.O;
import M0.J;
import P0.l;
import f1.w;
import f1.x;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.regex.Matcher;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public int f738a;

    /* renamed from: b  reason: collision with root package name */
    public long f739b;

    /* renamed from: c  reason: collision with root package name */
    public Object f740c;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Exception, code=java.lang.Throwable, for r5v0, types: [java.lang.Throwable, java.lang.Object, java.lang.Exception] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A(long r3, java.lang.Throwable r5) {
        /*
            r2 = this;
            r2.<init>()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r3
            r2.f739b = r0
            boolean r3 = r5 instanceof D.G
            r4 = 2
            if (r3 == 0) goto L_0x0014
            r2.f738a = r4
            r2.f740c = r5
            goto L_0x0038
        L_0x0014:
            boolean r3 = r5 instanceof B.Y
            r0 = 0
            if (r3 == 0) goto L_0x0034
            java.lang.Throwable r3 = r5.getCause()
            if (r3 == 0) goto L_0x0020
            r5 = r3
        L_0x0020:
            r2.f740c = r5
            boolean r3 = r5 instanceof B.C0018t
            if (r3 == 0) goto L_0x0029
            r2.f738a = r4
            goto L_0x0038
        L_0x0029:
            boolean r3 = r5 instanceof java.lang.IllegalArgumentException
            if (r3 == 0) goto L_0x0031
            r3 = 1
            r2.f738a = r3
            goto L_0x0038
        L_0x0031:
            r2.f738a = r0
            goto L_0x0038
        L_0x0034:
            r2.f738a = r0
            r2.f740c = r5
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D.A.<init>(long, java.lang.Exception):void");
    }

    public static byte[] b(byte b8, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b8, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public O a(byte[] bArr) {
        boolean z;
        long j7;
        if (bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        String str = new String(bArr, 0, bArr.length - 2, w.f11625a0);
        ArrayList arrayList = (ArrayList) this.f740c;
        arrayList.add(str);
        int i = this.f738a;
        if (i != 1) {
            if (i == 2) {
                try {
                    Matcher matcher = x.f11634c.matcher(str);
                    if (matcher.find()) {
                        String group = matcher.group(1);
                        group.getClass();
                        j7 = Long.parseLong(group);
                    } else {
                        j7 = -1;
                    }
                    if (j7 != -1) {
                        this.f739b = j7;
                    }
                    if (!str.isEmpty()) {
                        return null;
                    }
                    if (this.f739b > 0) {
                        this.f738a = 3;
                        return null;
                    }
                    O m8 = O.m(arrayList);
                    arrayList.clear();
                    this.f738a = 1;
                    this.f739b = 0;
                    return m8;
                } catch (NumberFormatException e) {
                    throw J.b(e, str);
                }
            } else {
                throw new IllegalStateException();
            }
        } else if (!x.f11632a.matcher(str).matches() && !x.f11633b.matcher(str).matches()) {
            return null;
        } else {
            this.f738a = 2;
            return null;
        }
    }
}
