package V0;

import H3.P;
import P0.t;
import P0.z;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

public final class p {

    /* renamed from: A  reason: collision with root package name */
    public long f5551A;

    /* renamed from: B  reason: collision with root package name */
    public long f5552B;

    /* renamed from: C  reason: collision with root package name */
    public long f5553C;

    /* renamed from: D  reason: collision with root package name */
    public boolean f5554D;

    /* renamed from: E  reason: collision with root package name */
    public long f5555E;

    /* renamed from: F  reason: collision with root package name */
    public long f5556F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f5557G;

    /* renamed from: H  reason: collision with root package name */
    public long f5558H;

    /* renamed from: I  reason: collision with root package name */
    public t f5559I;

    /* renamed from: a  reason: collision with root package name */
    public final P f5560a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f5561b;

    /* renamed from: c  reason: collision with root package name */
    public AudioTrack f5562c;

    /* renamed from: d  reason: collision with root package name */
    public int f5563d;
    public o e;

    /* renamed from: f  reason: collision with root package name */
    public int f5564f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5565g;

    /* renamed from: h  reason: collision with root package name */
    public long f5566h;
    public float i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5567j;

    /* renamed from: k  reason: collision with root package name */
    public long f5568k;

    /* renamed from: l  reason: collision with root package name */
    public long f5569l;

    /* renamed from: m  reason: collision with root package name */
    public Method f5570m;

    /* renamed from: n  reason: collision with root package name */
    public long f5571n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5572o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5573p;

    /* renamed from: q  reason: collision with root package name */
    public long f5574q;

    /* renamed from: r  reason: collision with root package name */
    public long f5575r;

    /* renamed from: s  reason: collision with root package name */
    public long f5576s;

    /* renamed from: t  reason: collision with root package name */
    public long f5577t;

    /* renamed from: u  reason: collision with root package name */
    public long f5578u;

    /* renamed from: v  reason: collision with root package name */
    public int f5579v;

    /* renamed from: w  reason: collision with root package name */
    public int f5580w;

    /* renamed from: x  reason: collision with root package name */
    public long f5581x;

    /* renamed from: y  reason: collision with root package name */
    public long f5582y;
    public long z;

    public p(P p3) {
        this.f5560a = p3;
        try {
            this.f5570m = AudioTrack.class.getMethod("getLatency", (Class[]) null);
        } catch (NoSuchMethodException unused) {
        }
        this.f5561b = new long[10];
        this.f5559I = t.f3738a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x022f A[Catch:{ Exception -> 0x0245 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(boolean r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = 1
            android.media.AudioTrack r2 = r0.f5562c
            r2.getClass()
            int r2 = r2.getPlayState()
            H3.P r3 = r0.f5560a
            r8 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r3 = r3.f2027U
            V0.y r3 = (V0.y) r3
            r10 = 2
            r11 = 0
            r13 = 0
            r14 = 3
            if (r2 != r14) goto L_0x0249
            P0.t r2 = r0.f5559I
            r2.getClass()
            long r15 = java.lang.System.nanoTime()
            long r4 = r15 / r8
            long r6 = r0.f5569l
            long r6 = r4 - r6
            r17 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r2 < 0) goto L_0x0074
            long r6 = r28.b()
            int r2 = r0.f5564f
            long r6 = P0.z.U(r2, r6)
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0040
            goto L_0x0249
        L_0x0040:
            int r2 = r0.f5579v
            float r15 = r0.i
            long r6 = P0.z.B(r6, r15)
            long r6 = r6 - r4
            long[] r15 = r0.f5561b
            r15[r2] = r6
            int r2 = r0.f5579v
            int r2 = r2 + r1
            r6 = 10
            int r2 = r2 % r6
            r0.f5579v = r2
            int r2 = r0.f5580w
            if (r2 >= r6) goto L_0x005c
            int r2 = r2 + r1
            r0.f5580w = r2
        L_0x005c:
            r0.f5569l = r4
            r0.f5568k = r11
            r2 = 0
        L_0x0061:
            int r6 = r0.f5580w
            if (r2 >= r6) goto L_0x0074
            long r11 = r0.f5568k
            r19 = r15[r2]
            long r6 = (long) r6
            long r19 = r19 / r6
            long r6 = r19 + r11
            r0.f5568k = r6
            int r2 = r2 + r1
            r11 = 0
            goto L_0x0061
        L_0x0074:
            boolean r2 = r0.f5565g
            if (r2 == 0) goto L_0x007a
            goto L_0x0249
        L_0x007a:
            V0.o r2 = r0.e
            r2.getClass()
            V0.n r6 = r2.f5546a
            if (r6 == 0) goto L_0x0122
            long r11 = r2.e
            long r11 = r4 - r11
            long r8 = r2.f5549d
            int r21 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r21 >= 0) goto L_0x008f
            goto L_0x0122
        L_0x008f:
            r2.e = r4
            android.media.AudioTrack r8 = r6.f5540a
            android.media.AudioTimestamp r9 = r6.f5541b
            boolean r8 = r8.getTimestamp(r9)
            if (r8 == 0) goto L_0x00c6
            long r11 = r9.framePosition
            r22 = r8
            long r7 = r6.f5543d
            int r23 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r23 <= 0) goto L_0x00b8
            boolean r15 = r6.f5544f
            if (r15 == 0) goto L_0x00b1
            long r14 = r6.f5545g
            long r14 = r14 + r7
            r6.f5545g = r14
            r6.f5544f = r13
            goto L_0x00b8
        L_0x00b1:
            long r7 = r6.f5542c
            r14 = 1
            long r7 = r7 + r14
            r6.f5542c = r7
        L_0x00b8:
            r6.f5543d = r11
            long r7 = r6.f5545g
            long r11 = r11 + r7
            long r7 = r6.f5542c
            r14 = 32
            long r7 = r7 << r14
            long r11 = r11 + r7
            r6.e = r11
            goto L_0x00c8
        L_0x00c6:
            r22 = r8
        L_0x00c8:
            int r7 = r2.f5547b
            if (r7 == 0) goto L_0x00fb
            if (r7 == r1) goto L_0x00e9
            if (r7 == r10) goto L_0x00e3
            r8 = 3
            if (r7 == r8) goto L_0x00dd
            r8 = 4
            if (r7 != r8) goto L_0x00d7
            goto L_0x011f
        L_0x00d7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00dd:
            if (r22 == 0) goto L_0x011f
            r2.a()
            goto L_0x011f
        L_0x00e3:
            if (r22 != 0) goto L_0x011f
            r2.a()
            goto L_0x011f
        L_0x00e9:
            if (r22 == 0) goto L_0x00f7
            long r7 = r6.e
            long r11 = r2.f5550f
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x011f
            r2.b(r10)
            goto L_0x011f
        L_0x00f7:
            r2.a()
            goto L_0x011f
        L_0x00fb:
            if (r22 == 0) goto L_0x0110
            long r7 = r9.nanoTime
            r11 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r11
            long r11 = r2.f5548c
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 < 0) goto L_0x0122
            long r7 = r6.e
            r2.f5550f = r7
            r2.b(r1)
            goto L_0x011f
        L_0x0110:
            long r7 = r2.f5548c
            long r7 = r4 - r7
            r11 = 500000(0x7a120, double:2.47033E-318)
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x011f
            r7 = 3
            r2.b(r7)
        L_0x011f:
            r8 = r22
            goto L_0x0123
        L_0x0122:
            r8 = 0
        L_0x0123:
            r11 = 5000000(0x4c4b40, double:2.470328E-317)
            java.lang.String r7 = "DefaultAudioSink"
            if (r8 != 0) goto L_0x012c
            goto L_0x01f1
        L_0x012c:
            if (r6 == 0) goto L_0x0137
            android.media.AudioTimestamp r8 = r6.f5541b
            long r8 = r8.nanoTime
            r19 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 / r19
            goto L_0x013c
        L_0x0137:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x013c:
            if (r6 == 0) goto L_0x0143
            long r13 = r6.e
            r23 = r2
            goto L_0x0147
        L_0x0143:
            r23 = r2
            r13 = -1
        L_0x0147:
            long r1 = r28.b()
            int r6 = r0.f5564f
            long r1 = P0.z.U(r6, r1)
            long r24 = r8 - r4
            long r24 = java.lang.Math.abs(r24)
            java.lang.String r6 = ", "
            int r26 = (r24 > r11 ? 1 : (r24 == r11 ? 0 : -1))
            if (r26 <= 0) goto L_0x019b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r10 = "Spurious audio timestamp (system clock mismatch): "
            r15.<init>(r10)
            r15.append(r13)
            r15.append(r6)
            r15.append(r8)
            r15.append(r6)
            r15.append(r4)
            r15.append(r6)
            r15.append(r1)
            r15.append(r6)
            long r1 = r3.j()
            r15.append(r1)
            r15.append(r6)
            long r1 = r3.k()
            r15.append(r1)
            java.lang.String r1 = r15.toString()
            P0.l.B(r7, r1)
            r10 = r23
            r1 = 4
            r10.b(r1)
            goto L_0x01f1
        L_0x019b:
            r10 = r23
            int r15 = r0.f5564f
            long r26 = P0.z.U(r15, r13)
            long r26 = r26 - r1
            long r26 = java.lang.Math.abs(r26)
            int r15 = (r26 > r11 ? 1 : (r26 == r11 ? 0 : -1))
            if (r15 <= 0) goto L_0x01e9
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r11 = "Spurious audio timestamp (frame position mismatch): "
            r15.<init>(r11)
            r15.append(r13)
            r15.append(r6)
            r15.append(r8)
            r15.append(r6)
            r15.append(r4)
            r15.append(r6)
            r15.append(r1)
            r15.append(r6)
            long r1 = r3.j()
            r15.append(r1)
            r15.append(r6)
            long r1 = r3.k()
            r15.append(r1)
            java.lang.String r1 = r15.toString()
            P0.l.B(r7, r1)
            r1 = 4
            r10.b(r1)
            goto L_0x01f1
        L_0x01e9:
            r1 = 4
            int r2 = r10.f5547b
            if (r2 != r1) goto L_0x01f1
            r10.a()
        L_0x01f1:
            boolean r1 = r0.f5573p
            if (r1 == 0) goto L_0x0249
            java.lang.reflect.Method r1 = r0.f5570m
            if (r1 == 0) goto L_0x0249
            long r8 = r0.f5574q
            long r8 = r4 - r8
            r10 = 500000(0x7a120, double:2.47033E-318)
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0249
            r2 = 0
            android.media.AudioTrack r6 = r0.f5562c     // Catch:{ Exception -> 0x0245 }
            r6.getClass()     // Catch:{ Exception -> 0x0245 }
            java.lang.Object r1 = r1.invoke(r6, r2)     // Catch:{ Exception -> 0x0245 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0245 }
            int r6 = P0.z.f3748a     // Catch:{ Exception -> 0x0245 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x0245 }
            long r8 = (long) r1     // Catch:{ Exception -> 0x0245 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            long r10 = r0.f5566h     // Catch:{ Exception -> 0x0245 }
            long r8 = r8 - r10
            r0.f5571n = r8     // Catch:{ Exception -> 0x0245 }
            r10 = 0
            long r8 = java.lang.Math.max(r8, r10)     // Catch:{ Exception -> 0x0245 }
            r0.f5571n = r8     // Catch:{ Exception -> 0x0245 }
            r10 = 5000000(0x4c4b40, double:2.470328E-317)
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0247
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0245 }
            java.lang.String r6 = "Ignoring impossibly large audio latency: "
            r1.<init>(r6)     // Catch:{ Exception -> 0x0245 }
            r1.append(r8)     // Catch:{ Exception -> 0x0245 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0245 }
            P0.l.B(r7, r1)     // Catch:{ Exception -> 0x0245 }
            r6 = 0
            r0.f5571n = r6     // Catch:{ Exception -> 0x0245 }
            goto L_0x0247
        L_0x0245:
            r0.f5570m = r2
        L_0x0247:
            r0.f5574q = r4
        L_0x0249:
            P0.t r1 = r0.f5559I
            r1.getClass()
            long r1 = java.lang.System.nanoTime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r4
            V0.o r4 = r0.e
            r4.getClass()
            int r5 = r4.f5547b
            r6 = 2
            if (r5 != r6) goto L_0x0261
            r13 = 1
            goto L_0x0262
        L_0x0261:
            r13 = 0
        L_0x0262:
            if (r13 == 0) goto L_0x028e
            V0.n r4 = r4.f5546a
            if (r4 == 0) goto L_0x026b
            long r5 = r4.e
            goto L_0x026d
        L_0x026b:
            r5 = -1
        L_0x026d:
            int r7 = r0.f5564f
            long r5 = P0.z.U(r7, r5)
            if (r4 == 0) goto L_0x027f
            android.media.AudioTimestamp r4 = r4.f5541b
            long r7 = r4.nanoTime
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 / r9
            r17 = r7
            goto L_0x0284
        L_0x027f:
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0284:
            long r7 = r1 - r17
            float r4 = r0.i
            long r7 = P0.z.x(r7, r4)
            long r7 = r7 + r5
            goto L_0x02b3
        L_0x028e:
            int r4 = r0.f5580w
            if (r4 != 0) goto L_0x029e
            long r4 = r28.b()
            int r6 = r0.f5564f
            long r4 = P0.z.U(r6, r4)
        L_0x029c:
            r7 = r4
            goto L_0x02a8
        L_0x029e:
            long r4 = r0.f5568k
            long r4 = r4 + r1
            float r6 = r0.i
            long r4 = P0.z.x(r4, r6)
            goto L_0x029c
        L_0x02a8:
            if (r29 != 0) goto L_0x02b3
            long r4 = r0.f5571n
            long r7 = r7 - r4
            r4 = 0
            long r7 = java.lang.Math.max(r4, r7)
        L_0x02b3:
            boolean r4 = r0.f5554D
            if (r4 == r13) goto L_0x02bf
            long r4 = r0.f5553C
            r0.f5556F = r4
            long r4 = r0.f5552B
            r0.f5555E = r4
        L_0x02bf:
            long r4 = r0.f5556F
            long r4 = r1 - r4
            r9 = 1000000(0xf4240, double:4.940656E-318)
            int r6 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x02e1
            long r11 = r0.f5555E
            float r6 = r0.i
            long r14 = P0.z.x(r4, r6)
            long r14 = r14 + r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r11
            long r4 = r4 / r9
            long r7 = r7 * r4
            long r4 = r11 - r4
            long r4 = r4 * r14
            long r4 = r4 + r7
            long r7 = r4 / r11
        L_0x02e1:
            boolean r4 = r0.f5567j
            if (r4 != 0) goto L_0x031e
            long r4 = r0.f5552B
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x031e
            r6 = 1
            r0.f5567j = r6
            long r4 = r7 - r4
            long r4 = P0.z.c0(r4)
            float r6 = r0.i
            long r4 = P0.z.B(r4, r6)
            P0.t r6 = r0.f5559I
            r6.getClass()
            long r9 = java.lang.System.currentTimeMillis()
            long r4 = P0.z.c0(r4)
            long r9 = r9 - r4
            H3.P r3 = r3.f5664r
            if (r3 == 0) goto L_0x031e
            java.lang.Object r3 = r3.f2027U
            V0.B r3 = (V0.B) r3
            V0.i r3 = r3.f5482x1
            android.os.Handler r4 = r3.f5527b
            if (r4 == 0) goto L_0x031e
            V0.h r5 = new V0.h
            r5.<init>(r3, r9)
            r4.post(r5)
        L_0x031e:
            r0.f5553C = r1
            r0.f5552B = r7
            r0.f5554D = r13
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.p.a(boolean):long");
    }

    public final long b() {
        this.f5559I.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f5581x != -9223372036854775807L) {
            AudioTrack audioTrack = this.f5562c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 2) {
                return this.z;
            }
            return Math.min(this.f5551A, this.z + z.W(z.x(z.O(elapsedRealtime) - this.f5581x, this.i), (long) this.f5564f, 1000000, RoundingMode.UP));
        }
        if (elapsedRealtime - this.f5575r >= 5) {
            AudioTrack audioTrack2 = this.f5562c;
            audioTrack2.getClass();
            int playState = audioTrack2.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack2.getPlaybackHeadPosition()) & 4294967295L;
                if (this.f5565g) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.f5578u = this.f5576s;
                    }
                    playbackHeadPosition += this.f5578u;
                }
                if (z.f3748a <= 29) {
                    if (playbackHeadPosition != 0 || this.f5576s <= 0 || playState != 3) {
                        this.f5582y = -9223372036854775807L;
                    } else if (this.f5582y == -9223372036854775807L) {
                        this.f5582y = elapsedRealtime;
                    }
                }
                long j7 = this.f5576s;
                if (j7 > playbackHeadPosition) {
                    if (this.f5557G) {
                        this.f5558H += j7;
                        this.f5557G = false;
                    } else {
                        this.f5577t++;
                    }
                }
                this.f5576s = playbackHeadPosition;
            }
            this.f5575r = elapsedRealtime;
        }
        return this.f5576s + this.f5558H + (this.f5577t << 32);
    }

    public final boolean c(long j7) {
        long a8 = a(false);
        int i8 = this.f5564f;
        int i9 = z.f3748a;
        if (j7 <= z.W(a8, (long) i8, 1000000, RoundingMode.UP)) {
            if (!this.f5565g) {
                return false;
            }
            AudioTrack audioTrack = this.f5562c;
            audioTrack.getClass();
            if (!(audioTrack.getPlayState() == 2 && b() == 0)) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        this.f5568k = 0;
        this.f5580w = 0;
        this.f5579v = 0;
        this.f5569l = 0;
        this.f5553C = 0;
        this.f5556F = 0;
        this.f5567j = false;
    }
}
