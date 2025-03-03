package A2;

import E2.b;
import E2.g;
import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public int[] f59a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f60b = new int[256];

    /* renamed from: c  reason: collision with root package name */
    public final A1.d f61c;

    /* renamed from: d  reason: collision with root package name */
    public ByteBuffer f62d;
    public byte[] e;

    /* renamed from: f  reason: collision with root package name */
    public short[] f63f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f64g;

    /* renamed from: h  reason: collision with root package name */
    public byte[] f65h;
    public byte[] i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f66j;

    /* renamed from: k  reason: collision with root package name */
    public int f67k;

    /* renamed from: l  reason: collision with root package name */
    public b f68l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f69m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f70n;

    /* renamed from: o  reason: collision with root package name */
    public int f71o;

    /* renamed from: p  reason: collision with root package name */
    public final int f72p;

    /* renamed from: q  reason: collision with root package name */
    public final int f73q;

    /* renamed from: r  reason: collision with root package name */
    public final int f74r;

    /* renamed from: s  reason: collision with root package name */
    public Boolean f75s;

    /* renamed from: t  reason: collision with root package name */
    public Bitmap.Config f76t = Bitmap.Config.ARGB_8888;

    public d(A1.d dVar, b bVar, ByteBuffer byteBuffer, int i8) {
        byte[] bArr;
        int[] iArr;
        this.f61c = dVar;
        this.f68l = new b();
        synchronized (this) {
            if (i8 > 0) {
                try {
                    int highestOneBit = Integer.highestOneBit(i8);
                    this.f71o = 0;
                    this.f68l = bVar;
                    this.f67k = -1;
                    ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                    this.f62d = asReadOnlyBuffer;
                    asReadOnlyBuffer.position(0);
                    this.f62d.order(ByteOrder.LITTLE_ENDIAN);
                    this.f70n = false;
                    Iterator it = bVar.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((a) it.next()).f42g == 3) {
                                this.f70n = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    this.f72p = highestOneBit;
                    int i9 = bVar.f50f;
                    this.f74r = i9 / highestOneBit;
                    int i10 = bVar.f51g;
                    this.f73q = i10 / highestOneBit;
                    int i11 = i9 * i10;
                    g gVar = (g) this.f61c.f36W;
                    if (gVar == null) {
                        bArr = new byte[i11];
                    } else {
                        bArr = (byte[]) gVar.d(byte[].class, i11);
                    }
                    this.i = bArr;
                    A1.d dVar2 = this.f61c;
                    int i12 = this.f74r * this.f73q;
                    g gVar2 = (g) dVar2.f36W;
                    if (gVar2 == null) {
                        iArr = new int[i12];
                    } else {
                        iArr = (int[]) gVar2.d(int[].class, i12);
                    }
                    this.f66j = iArr;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i8);
            }
        }
    }

    public final Bitmap a() {
        Bitmap.Config config;
        Boolean bool = this.f75s;
        if (bool == null || bool.booleanValue()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = this.f76t;
        }
        Bitmap e8 = ((b) this.f61c.f35V).e(this.f74r, this.f73q, config);
        e8.setHasAlpha(true);
        return e8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f1, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045 A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dd A[Catch:{ all -> 0x0014 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.Bitmap b() {
        /*
            r9 = this;
            java.lang.String r0 = "Unable to decode frame, status="
            java.lang.String r1 = "No valid color table found for frame #"
            java.lang.String r2 = "Unable to decode frame, frameCount="
            monitor-enter(r9)
            A2.b r3 = r9.f68l     // Catch:{ all -> 0x0014 }
            int r3 = r3.f48c     // Catch:{ all -> 0x0014 }
            r4 = 3
            r5 = 1
            if (r3 <= 0) goto L_0x0017
            int r3 = r9.f67k     // Catch:{ all -> 0x0014 }
            if (r3 >= 0) goto L_0x0040
            goto L_0x0017
        L_0x0014:
            r0 = move-exception
            goto L_0x00f2
        L_0x0017:
            java.lang.String r3 = "d"
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x0014 }
            if (r3 == 0) goto L_0x003e
            java.lang.String r3 = "d"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0014 }
            r6.<init>(r2)     // Catch:{ all -> 0x0014 }
            A2.b r2 = r9.f68l     // Catch:{ all -> 0x0014 }
            int r2 = r2.f48c     // Catch:{ all -> 0x0014 }
            r6.append(r2)     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = ", framePointer="
            r6.append(r2)     // Catch:{ all -> 0x0014 }
            int r2 = r9.f67k     // Catch:{ all -> 0x0014 }
            r6.append(r2)     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x0014 }
            android.util.Log.d(r3, r2)     // Catch:{ all -> 0x0014 }
        L_0x003e:
            r9.f71o = r5     // Catch:{ all -> 0x0014 }
        L_0x0040:
            int r2 = r9.f71o     // Catch:{ all -> 0x0014 }
            r3 = 0
            if (r2 == r5) goto L_0x00d5
            r6 = 2
            if (r2 != r6) goto L_0x004a
            goto L_0x00d5
        L_0x004a:
            r0 = 0
            r9.f71o = r0     // Catch:{ all -> 0x0014 }
            byte[] r2 = r9.e     // Catch:{ all -> 0x0014 }
            if (r2 != 0) goto L_0x0068
            A1.d r2 = r9.f61c     // Catch:{ all -> 0x0014 }
            java.lang.Object r2 = r2.f36W     // Catch:{ all -> 0x0014 }
            E2.g r2 = (E2.g) r2     // Catch:{ all -> 0x0014 }
            r7 = 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L_0x005e
            byte[] r2 = new byte[r7]     // Catch:{ all -> 0x0014 }
            goto L_0x0066
        L_0x005e:
            java.lang.Class<byte[]> r8 = byte[].class
            java.lang.Object r2 = r2.d(r8, r7)     // Catch:{ all -> 0x0014 }
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x0014 }
        L_0x0066:
            r9.e = r2     // Catch:{ all -> 0x0014 }
        L_0x0068:
            A2.b r2 = r9.f68l     // Catch:{ all -> 0x0014 }
            java.util.ArrayList r2 = r2.e     // Catch:{ all -> 0x0014 }
            int r7 = r9.f67k     // Catch:{ all -> 0x0014 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ all -> 0x0014 }
            A2.a r2 = (A2.a) r2     // Catch:{ all -> 0x0014 }
            int r7 = r9.f67k     // Catch:{ all -> 0x0014 }
            int r7 = r7 - r5
            if (r7 < 0) goto L_0x0084
            A2.b r8 = r9.f68l     // Catch:{ all -> 0x0014 }
            java.util.ArrayList r8 = r8.e     // Catch:{ all -> 0x0014 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x0014 }
            A2.a r7 = (A2.a) r7     // Catch:{ all -> 0x0014 }
            goto L_0x0085
        L_0x0084:
            r7 = r3
        L_0x0085:
            int[] r8 = r2.f45k     // Catch:{ all -> 0x0014 }
            if (r8 == 0) goto L_0x008a
            goto L_0x008e
        L_0x008a:
            A2.b r8 = r9.f68l     // Catch:{ all -> 0x0014 }
            int[] r8 = r8.f46a     // Catch:{ all -> 0x0014 }
        L_0x008e:
            r9.f59a = r8     // Catch:{ all -> 0x0014 }
            if (r8 != 0) goto L_0x00b1
            java.lang.String r0 = "d"
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = "d"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0014 }
            r2.<init>(r1)     // Catch:{ all -> 0x0014 }
            int r1 = r9.f67k     // Catch:{ all -> 0x0014 }
            r2.append(r1)     // Catch:{ all -> 0x0014 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0014 }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x0014 }
        L_0x00ad:
            r9.f71o = r5     // Catch:{ all -> 0x0014 }
            monitor-exit(r9)
            return r3
        L_0x00b1:
            boolean r1 = r2.f41f     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x00cf
            int[] r1 = r9.f60b     // Catch:{ all -> 0x0014 }
            int r3 = r8.length     // Catch:{ all -> 0x0014 }
            java.lang.System.arraycopy(r8, r0, r1, r0, r3)     // Catch:{ all -> 0x0014 }
            int[] r1 = r9.f60b     // Catch:{ all -> 0x0014 }
            r9.f59a = r1     // Catch:{ all -> 0x0014 }
            int r3 = r2.f43h     // Catch:{ all -> 0x0014 }
            r1[r3] = r0     // Catch:{ all -> 0x0014 }
            int r0 = r2.f42g     // Catch:{ all -> 0x0014 }
            if (r0 != r6) goto L_0x00cf
            int r0 = r9.f67k     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x00cf
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0014 }
            r9.f75s = r0     // Catch:{ all -> 0x0014 }
        L_0x00cf:
            android.graphics.Bitmap r0 = r9.d(r2, r7)     // Catch:{ all -> 0x0014 }
            monitor-exit(r9)
            return r0
        L_0x00d5:
            java.lang.String r1 = "d"
            boolean r1 = android.util.Log.isLoggable(r1, r4)     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x00f0
            java.lang.String r1 = "d"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0014 }
            r2.<init>(r0)     // Catch:{ all -> 0x0014 }
            int r0 = r9.f71o     // Catch:{ all -> 0x0014 }
            r2.append(r0)     // Catch:{ all -> 0x0014 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0014 }
            android.util.Log.d(r1, r0)     // Catch:{ all -> 0x0014 }
        L_0x00f0:
            monitor-exit(r9)
            return r3
        L_0x00f2:
            monitor-exit(r9)     // Catch:{ all -> 0x0014 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.d.b():android.graphics.Bitmap");
    }

    public final void c(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f76t = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v42, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        if (r3.f53j == r1.f43h) goto L_0x0047;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r5v29, types: [short] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap d(A2.a r34, A2.a r35) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            r2 = r35
            int[] r10 = r0.f66j
            A1.d r11 = r0.f61c
            r12 = 0
            if (r2 != 0) goto L_0x001e
            android.graphics.Bitmap r3 = r0.f69m
            if (r3 == 0) goto L_0x0018
            java.lang.Object r4 = r11.f35V
            E2.b r4 = (E2.b) r4
            r4.h(r3)
        L_0x0018:
            r3 = 0
            r0.f69m = r3
            java.util.Arrays.fill(r10, r12)
        L_0x001e:
            r13 = 3
            if (r2 == 0) goto L_0x002c
            int r3 = r2.f42g
            if (r3 != r13) goto L_0x002c
            android.graphics.Bitmap r3 = r0.f69m
            if (r3 != 0) goto L_0x002c
            java.util.Arrays.fill(r10, r12)
        L_0x002c:
            r14 = 2
            if (r2 == 0) goto L_0x0080
            int r3 = r2.f42g
            if (r3 <= 0) goto L_0x0080
            if (r3 != r14) goto L_0x006e
            boolean r3 = r1.f41f
            if (r3 != 0) goto L_0x0047
            A2.b r3 = r0.f68l
            int r4 = r3.f54k
            int[] r5 = r1.f45k
            if (r5 == 0) goto L_0x0048
            int r3 = r3.f53j
            int r5 = r1.f43h
            if (r3 != r5) goto L_0x0048
        L_0x0047:
            r4 = 0
        L_0x0048:
            int r3 = r2.f40d
            int r5 = r0.f72p
            int r3 = r3 / r5
            int r6 = r2.f38b
            int r6 = r6 / r5
            int r7 = r2.f39c
            int r7 = r7 / r5
            int r2 = r2.f37a
            int r2 = r2 / r5
            int r5 = r0.f74r
            int r6 = r6 * r5
            int r6 = r6 + r2
            int r3 = r3 * r5
            int r3 = r3 + r6
        L_0x005e:
            if (r6 >= r3) goto L_0x0080
            int r2 = r6 + r7
            r5 = r6
        L_0x0063:
            if (r5 >= r2) goto L_0x006a
            r10[r5] = r4
            int r5 = r5 + 1
            goto L_0x0063
        L_0x006a:
            int r2 = r0.f74r
            int r6 = r6 + r2
            goto L_0x005e
        L_0x006e:
            if (r3 != r13) goto L_0x0080
            android.graphics.Bitmap r2 = r0.f69m
            if (r2 == 0) goto L_0x0080
            int r8 = r0.f74r
            int r9 = r0.f73q
            r4 = 0
            r6 = 0
            r7 = 0
            r3 = r10
            r5 = r8
            r2.getPixels(r3, r4, r5, r6, r7, r8, r9)
        L_0x0080:
            java.nio.ByteBuffer r2 = r0.f62d
            int r3 = r1.f44j
            r2.position(r3)
            int r2 = r1.f39c
            int r3 = r1.f40d
            int r2 = r2 * r3
            byte[] r3 = r0.i
            if (r3 == 0) goto L_0x0094
            int r3 = r3.length
            if (r3 >= r2) goto L_0x00a7
        L_0x0094:
            java.lang.Object r3 = r11.f36W
            E2.g r3 = (E2.g) r3
            if (r3 != 0) goto L_0x009d
            byte[] r3 = new byte[r2]
            goto L_0x00a5
        L_0x009d:
            java.lang.Class<byte[]> r4 = byte[].class
            java.lang.Object r3 = r3.d(r4, r2)
            byte[] r3 = (byte[]) r3
        L_0x00a5:
            r0.i = r3
        L_0x00a7:
            byte[] r3 = r0.i
            short[] r4 = r0.f63f
            r5 = 4096(0x1000, float:5.74E-42)
            if (r4 != 0) goto L_0x00b3
            short[] r4 = new short[r5]
            r0.f63f = r4
        L_0x00b3:
            short[] r4 = r0.f63f
            byte[] r6 = r0.f64g
            if (r6 != 0) goto L_0x00bd
            byte[] r6 = new byte[r5]
            r0.f64g = r6
        L_0x00bd:
            byte[] r6 = r0.f64g
            byte[] r7 = r0.f65h
            if (r7 != 0) goto L_0x00c9
            r7 = 4097(0x1001, float:5.741E-42)
            byte[] r7 = new byte[r7]
            r0.f65h = r7
        L_0x00c9:
            byte[] r7 = r0.f65h
            java.nio.ByteBuffer r8 = r0.f62d
            byte r8 = r8.get()
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = 1
            int r11 = r9 << r8
            int r15 = r11 + 1
            int r16 = r11 + 2
            int r8 = r8 + r9
            int r17 = r9 << r8
            int r17 = r17 + -1
            r14 = 0
        L_0x00e0:
            if (r14 >= r11) goto L_0x00ec
            r4[r14] = r12
            byte r5 = (byte) r14
            r6[r14] = r5
            int r14 = r14 + 1
            r5 = 4096(0x1000, float:5.74E-42)
            goto L_0x00e0
        L_0x00ec:
            byte[] r5 = r0.e
            r27 = r8
            r25 = r16
            r26 = r17
            r14 = 0
            r19 = -1
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r28 = 0
            r29 = 0
        L_0x0105:
            r30 = 8
            if (r14 >= r2) goto L_0x0133
            if (r20 != 0) goto L_0x013f
            java.nio.ByteBuffer r9 = r0.f62d
            byte r9 = r9.get()
            r9 = r9 & 255(0xff, float:3.57E-43)
            if (r9 > 0) goto L_0x011a
            r31 = r8
            r32 = r14
            goto L_0x012e
        L_0x011a:
            java.nio.ByteBuffer r13 = r0.f62d
            byte[] r12 = r0.e
            r31 = r8
            int r8 = r13.remaining()
            int r8 = java.lang.Math.min(r9, r8)
            r32 = r14
            r14 = 0
            r13.get(r12, r14, r8)
        L_0x012e:
            if (r9 > 0) goto L_0x013a
            r8 = 3
            r0.f71o = r8
        L_0x0133:
            r22 = r10
            r12 = r24
            r14 = 0
            goto L_0x01fd
        L_0x013a:
            r20 = r9
            r21 = 0
            goto L_0x0143
        L_0x013f:
            r31 = r8
            r32 = r14
        L_0x0143:
            byte r8 = r5[r21]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r22
            int r23 = r23 + r8
            int r22 = r22 + 8
            r8 = 1
            int r21 = r21 + 1
            r8 = -1
            int r20 = r20 + -1
            r9 = r19
            r12 = r22
            r13 = r25
            r8 = r27
            r14 = r32
            r19 = r5
            r5 = r28
        L_0x0161:
            if (r12 < r8) goto L_0x01ea
            r22 = r10
            r10 = r23 & r26
            int r23 = r23 >> r8
            int r12 = r12 - r8
            if (r10 != r11) goto L_0x0176
            r13 = r16
            r26 = r17
            r10 = r22
            r8 = r31
            r9 = -1
            goto L_0x0161
        L_0x0176:
            if (r10 != r15) goto L_0x018d
            r28 = r5
            r27 = r8
            r25 = r13
            r5 = r19
            r10 = r22
            r8 = r31
            r13 = 3
            r19 = r9
            r22 = r12
            r9 = 1
            r12 = 0
            goto L_0x0105
        L_0x018d:
            r25 = r12
            r12 = -1
            if (r9 != r12) goto L_0x01a1
            byte r5 = r6[r10]
            r3[r24] = r5
            int r24 = r24 + 1
            int r14 = r14 + 1
            r5 = r10
            r9 = r5
            r10 = r22
            r12 = r25
            goto L_0x0161
        L_0x01a1:
            if (r10 < r13) goto L_0x01aa
            byte r5 = (byte) r5
            r7[r29] = r5
            int r29 = r29 + 1
            r5 = r9
            goto L_0x01ab
        L_0x01aa:
            r5 = r10
        L_0x01ab:
            if (r5 < r11) goto L_0x01b6
            byte r12 = r6[r5]
            r7[r29] = r12
            int r29 = r29 + 1
            short r5 = r4[r5]
            goto L_0x01ab
        L_0x01b6:
            byte r5 = r6[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r12 = (byte) r5
            r3[r24] = r12
        L_0x01bd:
            int r24 = r24 + 1
            int r14 = r14 + 1
            if (r29 <= 0) goto L_0x01ca
            int r29 = r29 + -1
            byte r27 = r7[r29]
            r3[r24] = r27
            goto L_0x01bd
        L_0x01ca:
            r27 = r5
            r5 = 4096(0x1000, float:5.74E-42)
            if (r13 >= r5) goto L_0x01e1
            short r9 = (short) r9
            r4[r13] = r9
            r6[r13] = r12
            int r13 = r13 + 1
            r9 = r13 & r26
            if (r9 != 0) goto L_0x01e1
            if (r13 >= r5) goto L_0x01e1
            int r8 = r8 + 1
            int r26 = r26 + r13
        L_0x01e1:
            r9 = r10
            r10 = r22
            r12 = r25
            r5 = r27
            goto L_0x0161
        L_0x01ea:
            r28 = r5
            r27 = r8
            r22 = r12
            r25 = r13
            r5 = r19
            r8 = r31
            r12 = 0
            r13 = 3
            r19 = r9
            r9 = 1
            goto L_0x0105
        L_0x01fd:
            java.util.Arrays.fill(r3, r12, r2, r14)
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x0279
            int r2 = r0.f72p
            r3 = 1
            if (r2 == r3) goto L_0x020b
            goto L_0x0279
        L_0x020b:
            int[] r2 = r0.f66j
            int r3 = r1.f40d
            int r4 = r1.f38b
            int r5 = r1.f39c
            int r6 = r1.f37a
            int r7 = r0.f67k
            if (r7 != 0) goto L_0x021b
            r7 = 1
            goto L_0x021c
        L_0x021b:
            r7 = 0
        L_0x021c:
            int r8 = r0.f74r
            byte[] r9 = r0.i
            int[] r10 = r0.f59a
            r11 = -1
            r12 = 0
        L_0x0224:
            if (r12 >= r3) goto L_0x025b
            int r13 = r12 + r4
            int r13 = r13 * r8
            int r15 = r13 + r6
            int r14 = r15 + r5
            int r13 = r13 + r8
            if (r13 >= r14) goto L_0x0232
            r14 = r13
        L_0x0232:
            int r13 = r1.f39c
            int r13 = r13 * r12
        L_0x0236:
            if (r15 >= r14) goto L_0x0253
            r16 = r3
            byte r3 = r9[r13]
            r17 = r4
            r4 = r3 & 255(0xff, float:3.57E-43)
            if (r4 == r11) goto L_0x024a
            r4 = r10[r4]
            if (r4 == 0) goto L_0x0249
            r2[r15] = r4
            goto L_0x024a
        L_0x0249:
            r11 = r3
        L_0x024a:
            int r13 = r13 + 1
            int r15 = r15 + 1
            r3 = r16
            r4 = r17
            goto L_0x0236
        L_0x0253:
            r16 = r3
            r17 = r4
            int r12 = r12 + 1
            r14 = 0
            goto L_0x0224
        L_0x025b:
            java.lang.Boolean r2 = r0.f75s
            if (r2 == 0) goto L_0x0265
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x026e
        L_0x0265:
            java.lang.Boolean r2 = r0.f75s
            if (r2 != 0) goto L_0x0270
            if (r7 == 0) goto L_0x0270
            r2 = -1
            if (r11 == r2) goto L_0x0270
        L_0x026e:
            r12 = 1
            goto L_0x0271
        L_0x0270:
            r12 = 0
        L_0x0271:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f75s = r2
            goto L_0x040b
        L_0x0279:
            int[] r2 = r0.f66j
            int r3 = r1.f40d
            int r4 = r0.f72p
            int r3 = r3 / r4
            int r5 = r1.f38b
            int r5 = r5 / r4
            int r6 = r1.f39c
            int r6 = r6 / r4
            int r7 = r1.f37a
            int r7 = r7 / r4
            int r8 = r0.f67k
            if (r8 != 0) goto L_0x028f
            r14 = 1
            goto L_0x0290
        L_0x028f:
            r14 = 0
        L_0x0290:
            int r8 = r0.f74r
            int r9 = r0.f73q
            byte[] r10 = r0.i
            int[] r11 = r0.f59a
            java.lang.Boolean r12 = r0.f75s
            r13 = 0
            r15 = 0
            r16 = 1
            r17 = 8
        L_0x02a0:
            if (r13 >= r3) goto L_0x03f7
            r35 = r12
            boolean r12 = r1.e
            if (r12 == 0) goto L_0x02d1
            if (r15 < r3) goto L_0x02cc
            int r12 = r16 + 1
            r18 = r3
            r3 = 2
            if (r12 == r3) goto L_0x02c7
            r3 = 3
            if (r12 == r3) goto L_0x02c0
            r3 = 4
            if (r12 == r3) goto L_0x02ba
            r16 = r12
            goto L_0x02ce
        L_0x02ba:
            r16 = r12
            r15 = 1
            r17 = 2
            goto L_0x02ce
        L_0x02c0:
            r3 = 4
            r16 = r12
            r15 = 2
            r17 = 4
            goto L_0x02ce
        L_0x02c7:
            r3 = 4
            r16 = r12
            r15 = 4
            goto L_0x02ce
        L_0x02cc:
            r18 = r3
        L_0x02ce:
            int r3 = r15 + r17
            goto L_0x02d5
        L_0x02d1:
            r18 = r3
            r3 = r15
            r15 = r13
        L_0x02d5:
            int r15 = r15 + r5
            r12 = 1
            if (r4 != r12) goto L_0x02db
            r12 = 1
            goto L_0x02dc
        L_0x02db:
            r12 = 0
        L_0x02dc:
            if (r15 >= r9) goto L_0x03d7
            int r15 = r15 * r8
            int r19 = r15 + r7
            r20 = r3
            int r3 = r19 + r6
            int r15 = r15 + r8
            if (r15 >= r3) goto L_0x02ea
            r3 = r15
        L_0x02ea:
            int r15 = r13 * r4
            r21 = r5
            int r5 = r1.f39c
            int r15 = r15 * r5
            if (r12 == 0) goto L_0x031e
            r12 = r35
            r5 = r19
        L_0x02f8:
            if (r5 >= r3) goto L_0x0314
            r23 = r6
            byte r6 = r10[r15]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r11[r6]
            if (r6 == 0) goto L_0x0307
            r2[r5] = r6
            goto L_0x030e
        L_0x0307:
            if (r14 == 0) goto L_0x030e
            if (r12 != 0) goto L_0x030e
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r12 = r6
        L_0x030e:
            int r15 = r15 + r4
            int r5 = r5 + 1
            r6 = r23
            goto L_0x02f8
        L_0x0314:
            r23 = r6
        L_0x0316:
            r29 = r7
            r31 = r8
            r32 = r9
            goto L_0x03e5
        L_0x031e:
            r23 = r6
            int r5 = r3 - r19
            int r5 = r5 * r4
            int r5 = r5 + r15
            r12 = r35
            r6 = r19
        L_0x0329:
            if (r6 >= r3) goto L_0x0316
            r19 = r3
            int r3 = r1.f39c
            r29 = r7
            r31 = r8
            r7 = r15
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
        L_0x033e:
            int r8 = r0.f72p
            int r8 = r8 + r15
            if (r7 >= r8) goto L_0x0373
            byte[] r8 = r0.i
            r32 = r9
            int r9 = r8.length
            if (r7 >= r9) goto L_0x0375
            if (r7 >= r5) goto L_0x0375
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f59a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x036e
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x036e:
            int r7 = r7 + 1
            r9 = r32
            goto L_0x033e
        L_0x0373:
            r32 = r9
        L_0x0375:
            int r3 = r3 + r15
            r7 = r3
        L_0x0377:
            int r8 = r0.f72p
            int r8 = r8 + r3
            if (r7 >= r8) goto L_0x03a8
            byte[] r8 = r0.i
            int r9 = r8.length
            if (r7 >= r9) goto L_0x03a8
            if (r7 >= r5) goto L_0x03a8
            byte r8 = r8[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int[] r9 = r0.f59a
            r8 = r9[r8]
            if (r8 == 0) goto L_0x03a5
            int r9 = r8 >> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r24 = r24 + r9
            int r9 = r8 >> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r25 = r25 + r9
            int r9 = r8 >> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r26 = r26 + r9
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r27 = r27 + r8
            int r28 = r28 + 1
        L_0x03a5:
            int r7 = r7 + 1
            goto L_0x0377
        L_0x03a8:
            if (r28 != 0) goto L_0x03ac
            r3 = 0
            goto L_0x03be
        L_0x03ac:
            int r24 = r24 / r28
            int r3 = r24 << 24
            int r25 = r25 / r28
            int r7 = r25 << 16
            r3 = r3 | r7
            int r26 = r26 / r28
            int r7 = r26 << 8
            r3 = r3 | r7
            int r27 = r27 / r28
            r3 = r3 | r27
        L_0x03be:
            if (r3 == 0) goto L_0x03c3
            r2[r6] = r3
            goto L_0x03ca
        L_0x03c3:
            if (r14 == 0) goto L_0x03ca
            if (r12 != 0) goto L_0x03ca
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r12 = r3
        L_0x03ca:
            int r15 = r15 + r4
            int r6 = r6 + 1
            r3 = r19
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x0329
        L_0x03d7:
            r20 = r3
            r21 = r5
            r23 = r6
            r29 = r7
            r31 = r8
            r32 = r9
            r12 = r35
        L_0x03e5:
            int r13 = r13 + 1
            r3 = r18
            r15 = r20
            r5 = r21
            r6 = r23
            r7 = r29
            r8 = r31
            r9 = r32
            goto L_0x02a0
        L_0x03f7:
            r35 = r12
            java.lang.Boolean r2 = r0.f75s
            if (r2 != 0) goto L_0x040b
            if (r35 != 0) goto L_0x0401
            r12 = 0
            goto L_0x0405
        L_0x0401:
            boolean r12 = r35.booleanValue()
        L_0x0405:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r12)
            r0.f75s = r2
        L_0x040b:
            boolean r2 = r0.f70n
            if (r2 == 0) goto L_0x042f
            int r1 = r1.f42g
            if (r1 == 0) goto L_0x0416
            r2 = 1
            if (r1 != r2) goto L_0x042f
        L_0x0416:
            android.graphics.Bitmap r1 = r0.f69m
            if (r1 != 0) goto L_0x0420
            android.graphics.Bitmap r1 = r33.a()
            r0.f69m = r1
        L_0x0420:
            android.graphics.Bitmap r1 = r0.f69m
            int r7 = r0.f74r
            int r8 = r0.f73q
            r3 = 0
            r5 = 0
            r6 = 0
            r2 = r22
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
        L_0x042f:
            android.graphics.Bitmap r9 = r33.a()
            int r7 = r0.f74r
            int r8 = r0.f73q
            r3 = 0
            r5 = 0
            r6 = 0
            r1 = r9
            r2 = r22
            r4 = r7
            r1.setPixels(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.d.d(A2.a, A2.a):android.graphics.Bitmap");
    }
}
