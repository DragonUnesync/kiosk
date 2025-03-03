package F0;

import N.e;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final int f1428a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1429b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1430c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f1431d;

    public c(byte[] bArr, int i, int i8) {
        this(-1, bArr, i, i8);
    }

    public static c a(String str) {
        byte[] bytes = str.concat("\u0000").getBytes(g.f1450M);
        return new c(bytes, 2, bytes.length);
    }

    public static c b(long j7, ByteOrder byteOrder) {
        long[] jArr = {j7};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(g.f1441D[4] * jArr.length)]);
        wrap.order(byteOrder);
        for (long j8 : jArr) {
            wrap.putInt((int) j8);
        }
        return new c(wrap.array(), 4, jArr.length);
    }

    public static c c(e[] eVarArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(g.f1441D[5] * eVarArr.length)]);
        wrap.order(byteOrder);
        for (e eVar : eVarArr) {
            wrap.putInt((int) eVar.f1436a);
            wrap.putInt((int) eVar.f1437b);
        }
        return new c(wrap.array(), 5, eVarArr.length);
    }

    public static c d(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[(g.f1441D[3] * iArr.length)]);
        wrap.order(byteOrder);
        for (int i8 : iArr) {
            wrap.putShort((short) i8);
        }
        return new c(wrap.array(), 3, iArr.length);
    }

    public final double e(ByteOrder byteOrder) {
        Serializable h5 = h(byteOrder);
        if (h5 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        } else if (h5 instanceof String) {
            return Double.parseDouble((String) h5);
        } else {
            if (h5 instanceof long[]) {
                long[] jArr = (long[]) h5;
                if (jArr.length == 1) {
                    return (double) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h5 instanceof int[]) {
                int[] iArr = (int[]) h5;
                if (iArr.length == 1) {
                    return (double) iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h5 instanceof double[]) {
                double[] dArr = (double[]) h5;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h5 instanceof e[]) {
                e[] eVarArr = (e[]) h5;
                if (eVarArr.length == 1) {
                    e eVar = eVarArr[0];
                    return ((double) eVar.f1436a) / ((double) eVar.f1437b);
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a double value");
            }
        }
    }

    public final int f(ByteOrder byteOrder) {
        Serializable h5 = h(byteOrder);
        if (h5 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (h5 instanceof String) {
            return Integer.parseInt((String) h5);
        } else {
            if (h5 instanceof long[]) {
                long[] jArr = (long[]) h5;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (h5 instanceof int[]) {
                int[] iArr = (int[]) h5;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    public final String g(ByteOrder byteOrder) {
        Serializable h5 = h(byteOrder);
        if (h5 == null) {
            return null;
        }
        if (h5 instanceof String) {
            return (String) h5;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (h5 instanceof long[]) {
            long[] jArr = (long[]) h5;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (h5 instanceof int[]) {
            int[] iArr = (int[]) h5;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (h5 instanceof double[]) {
            double[] dArr = (double[]) h5;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        } else if (!(h5 instanceof e[])) {
            return null;
        } else {
            e[] eVarArr = (e[]) h5;
            while (i < eVarArr.length) {
                sb.append(eVarArr[i].f1436a);
                sb.append('/');
                sb.append(eVarArr[i].f1437b);
                i++;
                if (i != eVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v23, types: [long[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v24, types: [F0.e[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v27, types: [F0.e[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARNING: type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0171 A[SYNTHETIC, Splitter:B:154:0x0171] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.Serializable h(java.nio.ByteOrder r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            byte[] r2 = r14.f1431d
            java.lang.String r3 = "IOException occurred while closing InputStream"
            java.lang.String r4 = "ExifInterface"
            r5 = 0
            F0.b r6 = new F0.b     // Catch:{ IOException -> 0x015d, all -> 0x015b }
            r6.<init>((byte[]) r2)     // Catch:{ IOException -> 0x015d, all -> 0x015b }
            r6.f1425V = r15     // Catch:{ IOException -> 0x0035 }
            int r15 = r14.f1428a     // Catch:{ IOException -> 0x0035 }
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r9 = r14.f1429b
            switch(r15) {
                case 1: goto L_0x012d;
                case 2: goto L_0x00ef;
                case 3: goto L_0x00da;
                case 4: goto L_0x00c3;
                case 5: goto L_0x00a1;
                case 6: goto L_0x012d;
                case 7: goto L_0x00ef;
                case 8: goto L_0x008c;
                case 9: goto L_0x0077;
                case 10: goto L_0x0057;
                case 11: goto L_0x0041;
                case 12: goto L_0x0025;
                default: goto L_0x001c;
            }
        L_0x001c:
            r6.close()     // Catch:{ IOException -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r15 = move-exception
            android.util.Log.e(r4, r3, r15)
        L_0x0024:
            return r5
        L_0x0025:
            double[] r15 = new double[r9]     // Catch:{ IOException -> 0x0035 }
        L_0x0027:
            if (r0 >= r9) goto L_0x0038
            double r7 = r6.readDouble()     // Catch:{ IOException -> 0x0035 }
            r15[r0] = r7     // Catch:{ IOException -> 0x0035 }
            int r0 = r0 + r1
            goto L_0x0027
        L_0x0031:
            r15 = move-exception
            r5 = r6
            goto L_0x016f
        L_0x0035:
            r15 = move-exception
            goto L_0x015f
        L_0x0038:
            r6.close()     // Catch:{ IOException -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x0040:
            return r15
        L_0x0041:
            double[] r15 = new double[r9]     // Catch:{ IOException -> 0x0035 }
        L_0x0043:
            if (r0 >= r9) goto L_0x004e
            float r2 = r6.readFloat()     // Catch:{ IOException -> 0x0035 }
            double r7 = (double) r2     // Catch:{ IOException -> 0x0035 }
            r15[r0] = r7     // Catch:{ IOException -> 0x0035 }
            int r0 = r0 + r1
            goto L_0x0043
        L_0x004e:
            r6.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x0056:
            return r15
        L_0x0057:
            F0.e[] r15 = new F0.e[r9]     // Catch:{ IOException -> 0x0035 }
        L_0x0059:
            if (r0 >= r9) goto L_0x006e
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0035 }
            long r7 = (long) r2     // Catch:{ IOException -> 0x0035 }
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0035 }
            long r10 = (long) r2     // Catch:{ IOException -> 0x0035 }
            F0.e r2 = new F0.e     // Catch:{ IOException -> 0x0035 }
            r2.<init>(r7, r10)     // Catch:{ IOException -> 0x0035 }
            r15[r0] = r2     // Catch:{ IOException -> 0x0035 }
            int r0 = r0 + r1
            goto L_0x0059
        L_0x006e:
            r6.close()     // Catch:{ IOException -> 0x0072 }
            goto L_0x0076
        L_0x0072:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x0076:
            return r15
        L_0x0077:
            int[] r15 = new int[r9]     // Catch:{ IOException -> 0x0035 }
        L_0x0079:
            if (r0 >= r9) goto L_0x0083
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0035 }
            r15[r0] = r2     // Catch:{ IOException -> 0x0035 }
            int r0 = r0 + r1
            goto L_0x0079
        L_0x0083:
            r6.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x008b
        L_0x0087:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x008b:
            return r15
        L_0x008c:
            int[] r15 = new int[r9]     // Catch:{ IOException -> 0x0035 }
        L_0x008e:
            if (r0 >= r9) goto L_0x0098
            short r2 = r6.readShort()     // Catch:{ IOException -> 0x0035 }
            r15[r0] = r2     // Catch:{ IOException -> 0x0035 }
            int r0 = r0 + r1
            goto L_0x008e
        L_0x0098:
            r6.close()     // Catch:{ IOException -> 0x009c }
            goto L_0x00a0
        L_0x009c:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x00a0:
            return r15
        L_0x00a1:
            F0.e[] r15 = new F0.e[r9]     // Catch:{ IOException -> 0x0035 }
        L_0x00a3:
            if (r0 >= r9) goto L_0x00ba
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0035 }
            long r10 = (long) r2     // Catch:{ IOException -> 0x0035 }
            long r10 = r10 & r7
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0035 }
            long r12 = (long) r2     // Catch:{ IOException -> 0x0035 }
            long r12 = r12 & r7
            F0.e r2 = new F0.e     // Catch:{ IOException -> 0x0035 }
            r2.<init>(r10, r12)     // Catch:{ IOException -> 0x0035 }
            r15[r0] = r2     // Catch:{ IOException -> 0x0035 }
            int r0 = r0 + r1
            goto L_0x00a3
        L_0x00ba:
            r6.close()     // Catch:{ IOException -> 0x00be }
            goto L_0x00c2
        L_0x00be:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x00c2:
            return r15
        L_0x00c3:
            long[] r15 = new long[r9]     // Catch:{ IOException -> 0x0035 }
        L_0x00c5:
            if (r0 >= r9) goto L_0x00d1
            int r2 = r6.readInt()     // Catch:{ IOException -> 0x0035 }
            long r10 = (long) r2     // Catch:{ IOException -> 0x0035 }
            long r10 = r10 & r7
            r15[r0] = r10     // Catch:{ IOException -> 0x0035 }
            int r0 = r0 + r1
            goto L_0x00c5
        L_0x00d1:
            r6.close()     // Catch:{ IOException -> 0x00d5 }
            goto L_0x00d9
        L_0x00d5:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x00d9:
            return r15
        L_0x00da:
            int[] r15 = new int[r9]     // Catch:{ IOException -> 0x0035 }
        L_0x00dc:
            if (r0 >= r9) goto L_0x00e6
            int r2 = r6.readUnsignedShort()     // Catch:{ IOException -> 0x0035 }
            r15[r0] = r2     // Catch:{ IOException -> 0x0035 }
            int r0 = r0 + r1
            goto L_0x00dc
        L_0x00e6:
            r6.close()     // Catch:{ IOException -> 0x00ea }
            goto L_0x00ee
        L_0x00ea:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x00ee:
            return r15
        L_0x00ef:
            byte[] r15 = F0.g.f1442E     // Catch:{ IOException -> 0x0035 }
            int r15 = r15.length     // Catch:{ IOException -> 0x0035 }
            if (r9 < r15) goto L_0x0104
            r15 = 0
        L_0x00f5:
            byte[] r7 = F0.g.f1442E     // Catch:{ IOException -> 0x0035 }
            int r8 = r7.length     // Catch:{ IOException -> 0x0035 }
            if (r15 >= r8) goto L_0x0103
            byte r8 = r2[r15]     // Catch:{ IOException -> 0x0035 }
            byte r7 = r7[r15]     // Catch:{ IOException -> 0x0035 }
            if (r8 == r7) goto L_0x0101
            goto L_0x0104
        L_0x0101:
            int r15 = r15 + r1
            goto L_0x00f5
        L_0x0103:
            int r0 = r7.length     // Catch:{ IOException -> 0x0035 }
        L_0x0104:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0035 }
            r15.<init>()     // Catch:{ IOException -> 0x0035 }
        L_0x0109:
            if (r0 >= r9) goto L_0x0120
            byte r7 = r2[r0]     // Catch:{ IOException -> 0x0035 }
            if (r7 != 0) goto L_0x0110
            goto L_0x0120
        L_0x0110:
            r8 = 32
            if (r7 < r8) goto L_0x0119
            char r7 = (char) r7     // Catch:{ IOException -> 0x0035 }
            r15.append(r7)     // Catch:{ IOException -> 0x0035 }
            goto L_0x011e
        L_0x0119:
            r7 = 63
            r15.append(r7)     // Catch:{ IOException -> 0x0035 }
        L_0x011e:
            int r0 = r0 + r1
            goto L_0x0109
        L_0x0120:
            java.lang.String r15 = r15.toString()     // Catch:{ IOException -> 0x0035 }
            r6.close()     // Catch:{ IOException -> 0x0128 }
            goto L_0x012c
        L_0x0128:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x012c:
            return r15
        L_0x012d:
            int r15 = r2.length     // Catch:{ IOException -> 0x0035 }
            if (r15 != r1) goto L_0x014b
            byte r15 = r2[r0]     // Catch:{ IOException -> 0x0035 }
            if (r15 < 0) goto L_0x014b
            if (r15 > r1) goto L_0x014b
            java.lang.String r2 = new java.lang.String     // Catch:{ IOException -> 0x0035 }
            int r15 = r15 + 48
            char r15 = (char) r15     // Catch:{ IOException -> 0x0035 }
            char[] r1 = new char[r1]     // Catch:{ IOException -> 0x0035 }
            r1[r0] = r15     // Catch:{ IOException -> 0x0035 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0035 }
            r6.close()     // Catch:{ IOException -> 0x0146 }
            goto L_0x014a
        L_0x0146:
            r15 = move-exception
            android.util.Log.e(r4, r3, r15)
        L_0x014a:
            return r2
        L_0x014b:
            java.lang.String r15 = new java.lang.String     // Catch:{ IOException -> 0x0035 }
            java.nio.charset.Charset r0 = F0.g.f1450M     // Catch:{ IOException -> 0x0035 }
            r15.<init>(r2, r0)     // Catch:{ IOException -> 0x0035 }
            r6.close()     // Catch:{ IOException -> 0x0156 }
            goto L_0x015a
        L_0x0156:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x015a:
            return r15
        L_0x015b:
            r15 = move-exception
            goto L_0x016f
        L_0x015d:
            r15 = move-exception
            r6 = r5
        L_0x015f:
            java.lang.String r0 = "IOException occurred during reading a value"
            android.util.Log.w(r4, r0, r15)     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x016e
            r6.close()     // Catch:{ IOException -> 0x016a }
            goto L_0x016e
        L_0x016a:
            r15 = move-exception
            android.util.Log.e(r4, r3, r15)
        L_0x016e:
            return r5
        L_0x016f:
            if (r5 == 0) goto L_0x0179
            r5.close()     // Catch:{ IOException -> 0x0175 }
            goto L_0x0179
        L_0x0175:
            r0 = move-exception
            android.util.Log.e(r4, r3, r0)
        L_0x0179:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.c.h(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(g.f1440C[this.f1428a]);
        sb.append(", data length:");
        return e.z(sb, this.f1431d.length, ")");
    }

    public c(long j7, byte[] bArr, int i, int i8) {
        this.f1428a = i;
        this.f1429b = i8;
        this.f1430c = j7;
        this.f1431d = bArr;
    }
}
