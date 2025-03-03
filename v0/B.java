package V0;

import B.q0;
import G5.m;
import H3.O;
import H3.P;
import H3.i0;
import K.a;
import M0.C0129q;
import M0.I;
import M0.L;
import M0.r;
import N0.g;
import P0.l;
import P0.t;
import P0.z;
import S0.f;
import T0.C0215g;
import T0.C0229v;
import T0.J;
import T0.d0;
import U.p;
import Y0.e;
import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.lifecycle.c;
import c1.i;
import c1.j;
import c1.k;
import c1.n;
import c1.q;
import c1.v;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class B extends q implements J {

    /* renamed from: A1  reason: collision with root package name */
    public int f5472A1;

    /* renamed from: B1  reason: collision with root package name */
    public boolean f5473B1;

    /* renamed from: C1  reason: collision with root package name */
    public boolean f5474C1;

    /* renamed from: D1  reason: collision with root package name */
    public r f5475D1;

    /* renamed from: E1  reason: collision with root package name */
    public r f5476E1;

    /* renamed from: F1  reason: collision with root package name */
    public long f5477F1;

    /* renamed from: G1  reason: collision with root package name */
    public boolean f5478G1;

    /* renamed from: H1  reason: collision with root package name */
    public boolean f5479H1;

    /* renamed from: I1  reason: collision with root package name */
    public boolean f5480I1;

    /* renamed from: J1  reason: collision with root package name */
    public int f5481J1;
    public final Context w1;

    /* renamed from: x1  reason: collision with root package name */
    public final i f5482x1;

    /* renamed from: y1  reason: collision with root package name */
    public final y f5483y1;

    /* renamed from: z1  reason: collision with root package name */
    public final q0 f5484z1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B(Context context, j jVar, Handler handler, C0229v vVar, y yVar) {
        super(1, jVar, 44100.0f);
        q0 q0Var;
        if (z.f3748a >= 35) {
            q0Var = new q0();
        } else {
            q0Var = null;
        }
        this.w1 = context.getApplicationContext();
        this.f5483y1 = yVar;
        this.f5484z1 = q0Var;
        this.f5481J1 = -1000;
        this.f5482x1 = new i(handler, vVar, 0);
        yVar.f5664r = new P((Object) this);
    }

    public final C0215g C(n nVar, r rVar, r rVar2) {
        boolean z;
        int i;
        C0215g b8 = nVar.b(rVar, rVar2);
        if (this.f8870y0 != null || !q0(rVar2)) {
            z = false;
        } else {
            z = true;
        }
        int i8 = b8.e;
        if (z) {
            i8 |= 32768;
        }
        if (w0(nVar, rVar2) > this.f5472A1) {
            i8 |= 64;
        }
        int i9 = i8;
        if (i9 != 0) {
            i = 0;
        } else {
            i = b8.f4836d;
        }
        return new C0215g(nVar.f8797a, rVar, rVar2, i, i9);
    }

    public final float N(float f8, r[] rVarArr) {
        int i = -1;
        for (r rVar : rVarArr) {
            int i8 = rVar.f3015D;
            if (i8 != -1) {
                i = Math.max(i, i8);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f8 * ((float) i);
    }

    public final ArrayList O(i iVar, r rVar, boolean z) {
        i0 i0Var;
        n nVar;
        if (rVar.f3036n == null) {
            i0Var = i0.f2073Y;
        } else {
            if (this.f5483y1.i(rVar) != 0) {
                List e = v.e("audio/raw", false, false);
                if (e.isEmpty()) {
                    nVar = null;
                } else {
                    nVar = (n) e.get(0);
                }
                if (nVar != null) {
                    i0Var = O.r(nVar);
                }
            }
            i0Var = v.g(iVar, rVar, z, false);
        }
        HashMap hashMap = v.f8875a;
        ArrayList arrayList = new ArrayList(i0Var);
        Collections.sort(arrayList, new a(1, new c(1, rVar)));
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        if ("AXON 7 mini".equals(r6) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final u.C1455O P(c1.n r13, M0.r r14, android.media.MediaCrypto r15, float r16) {
        /*
            r12 = this;
            r0 = r12
            r2 = r13
            r4 = r14
            r1 = r16
            M0.r[] r3 = r0.f4807d0
            r3.getClass()
            int r5 = r12.w0(r13, r14)
            int r6 = r3.length
            r7 = 1
            r8 = 0
            if (r6 != r7) goto L_0x0014
            goto L_0x002d
        L_0x0014:
            int r6 = r3.length
            r9 = 0
        L_0x0016:
            if (r9 >= r6) goto L_0x002d
            r10 = r3[r9]
            T0.g r11 = r13.b(r14, r10)
            int r11 = r11.f4836d
            if (r11 == 0) goto L_0x002a
            int r10 = r12.w0(r13, r10)
            int r5 = java.lang.Math.max(r5, r10)
        L_0x002a:
            int r9 = r9 + 1
            goto L_0x0016
        L_0x002d:
            r0.f5472A1 = r5
            int r3 = P0.z.f3748a
            r5 = 24
            java.lang.String r6 = r2.f8797a
            if (r3 >= r5) goto L_0x0065
            java.lang.String r9 = "OMX.SEC.aac.dec"
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x0065
            java.lang.String r9 = "samsung"
            java.lang.String r10 = P0.z.f3750c
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0065
            java.lang.String r9 = P0.z.f3749b
            java.lang.String r10 = "zeroflte"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x0063
            java.lang.String r10 = "herolte"
            boolean r10 = r9.startsWith(r10)
            if (r10 != 0) goto L_0x0063
            java.lang.String r10 = "heroqlte"
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x0065
        L_0x0063:
            r9 = 1
            goto L_0x0066
        L_0x0065:
            r9 = 0
        L_0x0066:
            r0.f5473B1 = r9
            java.lang.String r9 = "OMX.google.opus.decoder"
            boolean r9 = r6.equals(r9)
            if (r9 != 0) goto L_0x008b
            java.lang.String r9 = "c2.android.opus.decoder"
            boolean r9 = r6.equals(r9)
            if (r9 != 0) goto L_0x008b
            java.lang.String r9 = "OMX.google.vorbis.decoder"
            boolean r9 = r6.equals(r9)
            if (r9 != 0) goto L_0x008b
            java.lang.String r9 = "c2.android.vorbis.decoder"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x0089
            goto L_0x008b
        L_0x0089:
            r6 = 0
            goto L_0x008c
        L_0x008b:
            r6 = 1
        L_0x008c:
            r0.f5474C1 = r6
            int r6 = r0.f5472A1
            android.media.MediaFormat r9 = new android.media.MediaFormat
            r9.<init>()
            java.lang.String r10 = r2.f8799c
            java.lang.String r11 = "mime"
            r9.setString(r11, r10)
            int r10 = r4.f3014C
            java.lang.String r11 = "channel-count"
            r9.setInteger(r11, r10)
            java.lang.String r10 = "sample-rate"
            int r11 = r4.f3015D
            r9.setInteger(r10, r11)
            java.util.List r10 = r4.f3039q
            P0.l.A(r9, r10)
            java.lang.String r10 = "max-input-size"
            P0.l.w(r9, r10, r6)
            r6 = 23
            if (r3 < r6) goto L_0x00dd
            java.lang.String r10 = "priority"
            r9.setInteger(r10, r8)
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r10 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r10 == 0) goto L_0x00dd
            if (r3 != r6) goto L_0x00d8
            java.lang.String r6 = P0.z.f3751d
            java.lang.String r10 = "ZTE B2017G"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x00dd
            java.lang.String r10 = "AXON 7 mini"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L_0x00d8
            goto L_0x00dd
        L_0x00d8:
            java.lang.String r6 = "operating-rate"
            r9.setFloat(r6, r1)
        L_0x00dd:
            r1 = 28
            java.lang.String r6 = r4.f3036n
            if (r3 > r1) goto L_0x00f0
            java.lang.String r1 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00f0
            java.lang.String r1 = "ac4-is-sync"
            r9.setInteger(r1, r7)
        L_0x00f0:
            java.lang.String r1 = "audio/raw"
            if (r3 < r5) goto L_0x011b
            M0.q r5 = new M0.q
            r5.<init>()
            java.lang.String r7 = M0.I.o(r1)
            r5.f2999m = r7
            int r7 = r4.f3014C
            r5.f2979B = r7
            r5.f2980C = r11
            r7 = 4
            r5.f2981D = r7
            M0.r r10 = new M0.r
            r10.<init>(r5)
            V0.y r5 = r0.f5483y1
            int r5 = r5.i(r10)
            r10 = 2
            if (r5 != r10) goto L_0x011b
            java.lang.String r5 = "pcm-encoding"
            r9.setInteger(r5, r7)
        L_0x011b:
            r5 = 32
            if (r3 < r5) goto L_0x0126
            java.lang.String r5 = "max-output-channel-count"
            r7 = 99
            r9.setInteger(r5, r7)
        L_0x0126:
            r5 = 35
            if (r3 < r5) goto L_0x0136
            int r3 = r0.f5481J1
            int r3 = -r3
            int r3 = java.lang.Math.max(r8, r3)
            java.lang.String r5 = "importance"
            r9.setInteger(r5, r3)
        L_0x0136:
            java.lang.String r3 = r2.f8798b
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0146
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0146
            r1 = r4
            goto L_0x0147
        L_0x0146:
            r1 = 0
        L_0x0147:
            r0.f5476E1 = r1
            u.O r8 = new u.O
            r5 = 0
            B.q0 r7 = r0.f5484z1
            r1 = r8
            r2 = r13
            r3 = r9
            r4 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.B.P(c1.n, M0.r, android.media.MediaCrypto, float):u.O");
    }

    public final void Q(f fVar) {
        r rVar;
        s sVar;
        if (z.f3748a >= 29 && (rVar = fVar.f4384W) != null && Objects.equals(rVar.f3036n, "audio/opus") && this.f8839a1) {
            ByteBuffer byteBuffer = fVar.f4389b0;
            byteBuffer.getClass();
            r rVar2 = fVar.f4384W;
            rVar2.getClass();
            if (byteBuffer.remaining() == 8) {
                int i = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                y yVar = this.f5483y1;
                AudioTrack audioTrack = yVar.f5668v;
                if (audioTrack != null && y.p(audioTrack) && (sVar = yVar.f5666t) != null && sVar.f5599k) {
                    yVar.f5668v.setOffloadDelayPadding(rVar2.f3017F, i);
                }
            }
        }
    }

    public final void V(Exception exc) {
        l.p("MediaCodecAudioRenderer", "Audio codec error", exc);
        i iVar = this.f5482x1;
        Handler handler = iVar.f5527b;
        if (handler != null) {
            handler.post(new h(iVar, (Object) exc, 3));
        }
    }

    public final void W(long j7, long j8, String str) {
        i iVar = this.f5482x1;
        Handler handler = iVar.f5527b;
        if (handler != null) {
            handler.post(new h(iVar, str, j7, j8));
        }
    }

    public final void X(String str) {
        i iVar = this.f5482x1;
        Handler handler = iVar.f5527b;
        if (handler != null) {
            handler.post(new h(iVar, (Object) str, 7));
        }
    }

    public final C0215g Y(R2.c cVar) {
        r rVar = (r) cVar.f4337W;
        rVar.getClass();
        this.f5475D1 = rVar;
        C0215g Y7 = super.Y(cVar);
        i iVar = this.f5482x1;
        Handler handler = iVar.f5527b;
        if (handler != null) {
            handler.post(new h(iVar, rVar, Y7));
        }
        return Y7;
    }

    public final void Z(r rVar, MediaFormat mediaFormat) {
        int i;
        int i8;
        r rVar2 = this.f5476E1;
        boolean z = true;
        int[] iArr = null;
        if (rVar2 != null) {
            rVar = rVar2;
        } else if (this.f8817E0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(rVar.f3036n)) {
                i = rVar.f3016E;
            } else if (z.f3748a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = z.z(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = 2;
            }
            C0129q qVar = new C0129q();
            qVar.f2999m = I.o("audio/raw");
            qVar.f2981D = i;
            qVar.f2982E = rVar.f3017F;
            qVar.f2983F = rVar.f3018G;
            qVar.f2997k = rVar.f3034l;
            qVar.f2989a = rVar.f3025a;
            qVar.f2990b = rVar.f3026b;
            qVar.f2991c = O.m(rVar.f3027c);
            qVar.f2992d = rVar.f3028d;
            qVar.e = rVar.e;
            qVar.f2993f = rVar.f3029f;
            qVar.f2979B = mediaFormat.getInteger("channel-count");
            qVar.f2980C = mediaFormat.getInteger("sample-rate");
            r rVar3 = new r(qVar);
            boolean z6 = this.f5473B1;
            int i9 = rVar3.f3014C;
            if (z6 && i9 == 6 && (i8 = rVar.f3014C) < 6) {
                iArr = new int[i8];
                for (int i10 = 0; i10 < i8; i10++) {
                    iArr[i10] = i10;
                }
            } else if (this.f5474C1) {
                if (i9 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i9 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i9 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i9 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i9 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            rVar = rVar3;
        }
        try {
            int i11 = z.f3748a;
            y yVar = this.f5483y1;
            if (i11 >= 29) {
                if (this.f8839a1) {
                    d0 d0Var = this.f4801X;
                    d0Var.getClass();
                    if (d0Var.f4796a != 0) {
                        d0 d0Var2 = this.f4801X;
                        d0Var2.getClass();
                        int i12 = d0Var2.f4796a;
                        yVar.getClass();
                        if (i11 < 29) {
                            z = false;
                        }
                        l.j(z);
                        yVar.f5656j = i12;
                    }
                }
                yVar.getClass();
                if (i11 < 29) {
                    z = false;
                }
                l.j(z);
                yVar.f5656j = 0;
            }
            yVar.d(rVar, iArr);
        } catch (k e) {
            throw f(e, e.f5534U, false, 5001);
        }
    }

    public final boolean a() {
        boolean z = this.f5480I1;
        this.f5480I1 = false;
        return z;
    }

    public final void a0() {
        this.f5483y1.getClass();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.media.AudioDeviceInfo} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r9, java.lang.Object r10) {
        /*
            r8 = this;
            r0 = 2
            V0.y r1 = r8.f5483y1
            if (r9 == r0) goto L_0x0156
            r0 = 3
            if (r9 == r0) goto L_0x0128
            r0 = 6
            if (r9 == r0) goto L_0x010e
            r0 = 12
            r2 = 0
            if (r9 == r0) goto L_0x00dd
            r0 = 16
            r3 = 0
            r4 = 35
            if (r9 == r0) goto L_0x00b2
            r0 = 9
            if (r9 == r0) goto L_0x007c
            r0 = 10
            if (r9 == r0) goto L_0x0029
            r0 = 11
            if (r9 != r0) goto L_0x0174
            T0.A r10 = (T0.A) r10
            r8.f8871z0 = r10
            goto L_0x0174
        L_0x0029:
            r10.getClass()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            int r10 = r1.f5637X
            if (r10 == r9) goto L_0x0040
            r1.f5637X = r9
            if (r9 == 0) goto L_0x003b
            r3 = 1
        L_0x003b:
            r1.f5636W = r3
            r1.g()
        L_0x0040:
            int r10 = P0.z.f3748a
            if (r10 < r4) goto L_0x0174
            B.q0 r10 = r8.f5484z1
            if (r10 == 0) goto L_0x0174
            java.lang.Object r0 = r10.f302X
            android.media.LoudnessCodecController r0 = (android.media.LoudnessCodecController) r0
            if (r0 == 0) goto L_0x0053
            r0.close()
            r10.f302X = r2
        L_0x0053:
            c1.h r0 = new c1.h
            r0.<init>(r10)
            android.media.LoudnessCodecController r9 = android.media.LoudnessCodecController.create(r9, L3.a.f2693U, r0)
            r10.f302X = r9
            java.lang.Object r10 = r10.f300V
            java.util.HashSet r10 = (java.util.HashSet) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0066:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r0 = r10.next()
            android.media.MediaCodec r0 = (android.media.MediaCodec) r0
            boolean r0 = r9.addMediaCodec(r0)
            if (r0 != 0) goto L_0x0066
            r10.remove()
            goto L_0x0066
        L_0x007c:
            r10.getClass()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            r1.f5617D = r9
            boolean r9 = r1.x()
            if (r9 == 0) goto L_0x0091
            M0.L r9 = M0.L.f2845d
        L_0x008f:
            r3 = r9
            goto L_0x0094
        L_0x0091:
            M0.L r9 = r1.f5616C
            goto L_0x008f
        L_0x0094:
            V0.t r9 = new V0.t
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = r9
            r2.<init>(r3, r4, r6)
            boolean r10 = r1.o()
            if (r10 == 0) goto L_0x00ae
            r1.f5614A = r9
            goto L_0x0174
        L_0x00ae:
            r1.f5615B = r9
            goto L_0x0174
        L_0x00b2:
            r10.getClass()
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            r8.f5481J1 = r9
            c1.k r9 = r8.f8817E0
            if (r9 != 0) goto L_0x00c3
            goto L_0x0174
        L_0x00c3:
            int r10 = P0.z.f3748a
            if (r10 < r4) goto L_0x0174
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            int r0 = r8.f5481J1
            int r0 = -r0
            int r0 = java.lang.Math.max(r3, r0)
            java.lang.String r1 = "importance"
            r10.putInt(r1, r0)
            r9.g(r10)
            goto L_0x0174
        L_0x00dd:
            int r9 = P0.z.f3748a
            r0 = 23
            if (r9 < r0) goto L_0x0174
            android.media.AudioDeviceInfo r9 = B3.a.g(r10)
            if (r9 != 0) goto L_0x00eb
            r10 = r2
            goto L_0x00f3
        L_0x00eb:
            r1.getClass()
            H3.P r10 = new H3.P
            r10.<init>((java.lang.Object) r9)
        L_0x00f3:
            r1.f5639Z = r10
            G5.m r10 = r1.f5670x
            if (r10 == 0) goto L_0x00fc
            r10.o(r9)
        L_0x00fc:
            android.media.AudioTrack r9 = r1.f5668v
            if (r9 == 0) goto L_0x0174
            H3.P r10 = r1.f5639Z
            if (r10 != 0) goto L_0x0105
            goto L_0x010a
        L_0x0105:
            java.lang.Object r10 = r10.f2027U
            r2 = r10
            android.media.AudioDeviceInfo r2 = (android.media.AudioDeviceInfo) r2
        L_0x010a:
            r9.setPreferredDevice(r2)
            goto L_0x0174
        L_0x010e:
            M0.f r10 = (M0.C0118f) r10
            r10.getClass()
            M0.f r9 = r1.f5638Y
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x011c
            goto L_0x0174
        L_0x011c:
            android.media.AudioTrack r9 = r1.f5668v
            if (r9 == 0) goto L_0x0125
            M0.f r9 = r1.f5638Y
            r9.getClass()
        L_0x0125:
            r1.f5638Y = r10
            goto L_0x0174
        L_0x0128:
            M0.e r10 = (M0.C0117e) r10
            r10.getClass()
            M0.e r9 = r1.z
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x0136
            goto L_0x0174
        L_0x0136:
            r1.z = r10
            boolean r9 = r1.f5641a0
            if (r9 == 0) goto L_0x013d
            goto L_0x0174
        L_0x013d:
            G5.m r9 = r1.f5670x
            if (r9 == 0) goto L_0x0152
            r9.f1718j = r10
            java.lang.Object r0 = r9.f1713c
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r9.i
            H3.P r2 = (H3.P) r2
            V0.d r10 = V0.C0339d.b(r0, r10, r2)
            r9.l(r10)
        L_0x0152:
            r1.g()
            goto L_0x0174
        L_0x0156:
            r10.getClass()
            java.lang.Float r10 = (java.lang.Float) r10
            float r9 = r10.floatValue()
            float r10 = r1.f5628O
            int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r10 == 0) goto L_0x0174
            r1.f5628O = r9
            boolean r9 = r1.o()
            if (r9 == 0) goto L_0x0174
            android.media.AudioTrack r9 = r1.f5668v
            float r10 = r1.f5628O
            r9.setVolume(r10)
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.B.b(int, java.lang.Object):void");
    }

    public final L c() {
        return this.f5483y1.f5616C;
    }

    public final void c0() {
        this.f5483y1.f5625L = true;
    }

    public final void d(L l8) {
        y yVar = this.f5483y1;
        yVar.getClass();
        yVar.f5616C = new L(z.h(l8.f2846a, 0.1f, 8.0f), z.h(l8.f2847b, 0.1f, 8.0f));
        if (yVar.x()) {
            yVar.v();
            return;
        }
        t tVar = new t(l8, -9223372036854775807L, -9223372036854775807L);
        if (yVar.o()) {
            yVar.f5614A = tVar;
        } else {
            yVar.f5615B = tVar;
        }
    }

    public final long e() {
        if (this.f4805b0 == 2) {
            x0();
        }
        return this.f5477F1;
    }

    public final boolean g0(long j7, long j8, k kVar, ByteBuffer byteBuffer, int i, int i8, int i9, long j9, boolean z, boolean z6, r rVar) {
        int i10;
        int i11;
        byteBuffer.getClass();
        if (this.f5476E1 == null || (i8 & 2) == 0) {
            y yVar = this.f5483y1;
            if (z) {
                if (kVar != null) {
                    kVar.k(i);
                }
                this.f8862r1.f4822f += i9;
                yVar.f5625L = true;
                return true;
            }
            try {
                if (!yVar.l(j9, i9, byteBuffer)) {
                    return false;
                }
                if (kVar != null) {
                    kVar.k(i);
                }
                this.f8862r1.e += i9;
                return true;
            } catch (l e) {
                r rVar2 = this.f5475D1;
                if (this.f8839a1) {
                    d0 d0Var = this.f4801X;
                    d0Var.getClass();
                    if (d0Var.f4796a != 0) {
                        i10 = 5004;
                        throw f(e, rVar2, e.f5536V, i10);
                    }
                }
                i10 = 5001;
                throw f(e, rVar2, e.f5536V, i10);
            } catch (m e8) {
                if (this.f8839a1) {
                    d0 d0Var2 = this.f4801X;
                    d0Var2.getClass();
                    if (d0Var2.f4796a != 0) {
                        i11 = 5003;
                        throw f(e8, rVar, e8.f5538V, i11);
                    }
                }
                i11 = 5002;
                throw f(e8, rVar, e8.f5538V, i11);
            }
        } else {
            kVar.getClass();
            kVar.k(i);
            return true;
        }
    }

    public final J h() {
        return this;
    }

    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    public final void j0() {
        int i;
        try {
            y yVar = this.f5483y1;
            if (!yVar.f5632S && yVar.o() && yVar.f()) {
                yVar.s();
                yVar.f5632S = true;
            }
        } catch (m e) {
            if (this.f8839a1) {
                i = 5003;
            } else {
                i = 5002;
            }
            throw f(e, e.f5539W, e.f5538V, i);
        }
    }

    public final boolean k() {
        if (this.f8855n1) {
            y yVar = this.f5483y1;
            if (!yVar.o() || (yVar.f5632S && !yVar.m())) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        if (this.f5483y1.m() || super.l()) {
            return true;
        }
        return false;
    }

    public final void m() {
        i iVar = this.f5482x1;
        this.f5479H1 = true;
        this.f5475D1 = null;
        try {
            this.f5483y1.g();
            try {
                super.m();
            } finally {
                iVar.a(this.f8862r1);
            }
        } catch (Throwable th) {
            super.m();
            throw th;
        } finally {
            iVar.a(this.f8862r1);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [T0.f, java.lang.Object] */
    public final void n(boolean z, boolean z6) {
        ? obj = new Object();
        this.f8862r1 = obj;
        i iVar = this.f5482x1;
        Handler handler = iVar.f5527b;
        if (handler != null) {
            handler.post(new h(iVar, (Object) obj, 0));
        }
        d0 d0Var = this.f4801X;
        d0Var.getClass();
        boolean z8 = d0Var.f4797b;
        y yVar = this.f5483y1;
        if (z8) {
            l.j(yVar.f5636W);
            if (!yVar.f5641a0) {
                yVar.f5641a0 = true;
                yVar.g();
            }
        } else if (yVar.f5641a0) {
            yVar.f5641a0 = false;
            yVar.g();
        }
        U0.j jVar = this.f4803Z;
        jVar.getClass();
        yVar.f5663q = jVar;
        t tVar = this.f4804a0;
        tVar.getClass();
        yVar.f5651g.f5559I = tVar;
    }

    public final void o(long j7, boolean z) {
        super.o(j7, z);
        this.f5483y1.g();
        this.f5477F1 = j7;
        this.f5480I1 = false;
        this.f5478G1 = true;
    }

    public final void p() {
        q0 q0Var;
        C0340e eVar;
        m mVar = this.f5483y1.f5670x;
        if (mVar != null && mVar.f1712b) {
            mVar.f1717h = null;
            int i = z.f3748a;
            Context context = (Context) mVar.f1713c;
            if (i >= 23 && (eVar = (C0340e) mVar.e) != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(eVar);
            }
            context.unregisterReceiver((N5.f) mVar.f1715f);
            C0341f fVar = (C0341f) mVar.f1716g;
            if (fVar != null) {
                fVar.f5517a.unregisterContentObserver(fVar);
            }
            mVar.f1712b = false;
        }
        if (z.f3748a >= 35 && (q0Var = this.f5484z1) != null) {
            ((HashSet) q0Var.f300V).clear();
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) q0Var.f302X;
            if (loudnessCodecController != null) {
                loudnessCodecController.close();
            }
        }
    }

    public final void q() {
        y yVar = this.f5483y1;
        this.f5480I1 = false;
        try {
            E();
            i0();
            P p3 = this.f8870y0;
            if (p3 != null) {
                p3.D0((e) null);
            }
            this.f8870y0 = null;
            if (this.f5479H1) {
                this.f5479H1 = false;
                yVar.u();
            }
        } catch (Throwable th) {
            if (this.f5479H1) {
                this.f5479H1 = false;
                yVar.u();
            }
            throw th;
        }
    }

    public final boolean q0(r rVar) {
        d0 d0Var = this.f4801X;
        d0Var.getClass();
        if (d0Var.f4796a != 0) {
            int v02 = v0(rVar);
            if ((v02 & 512) != 0) {
                d0 d0Var2 = this.f4801X;
                d0Var2.getClass();
                if (d0Var2.f4796a == 2 || (v02 & 1024) != 0 || (rVar.f3017F == 0 && rVar.f3018G == 0)) {
                    return true;
                }
            }
        }
        if (this.f5483y1.i(rVar) != 0) {
            return true;
        }
        return false;
    }

    public final void r() {
        this.f5483y1.r();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r5 != null) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int r0(c1.i r17, M0.r r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = r1.f3036n
            boolean r2 = M0.I.k(r2)
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r1 = Q0.g.e(r3, r3, r3, r3)
            return r1
        L_0x0012:
            r2 = 1
            int r4 = r1.f3023L
            if (r4 == 0) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            r6 = 2
            if (r4 == 0) goto L_0x0022
            if (r4 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r4 = 0
            goto L_0x0023
        L_0x0022:
            r4 = 1
        L_0x0023:
            r7 = 32
            r8 = 0
            java.lang.String r9 = "audio/raw"
            r10 = 8
            r11 = 4
            V0.y r12 = r0.f5483y1
            if (r4 == 0) goto L_0x0054
            if (r5 == 0) goto L_0x0045
            java.util.List r5 = c1.v.e(r9, r3, r3)
            boolean r13 = r5.isEmpty()
            if (r13 == 0) goto L_0x003d
            r5 = r8
            goto L_0x0043
        L_0x003d:
            java.lang.Object r5 = r5.get(r3)
            c1.n r5 = (c1.n) r5
        L_0x0043:
            if (r5 == 0) goto L_0x0054
        L_0x0045:
            int r5 = r0.v0(r1)
            int r13 = r12.i(r1)
            if (r13 == 0) goto L_0x0055
            int r1 = Q0.g.e(r11, r10, r7, r5)
            return r1
        L_0x0054:
            r5 = 0
        L_0x0055:
            java.lang.String r13 = r1.f3036n
            boolean r14 = r9.equals(r13)
            if (r14 == 0) goto L_0x0069
            int r14 = r12.i(r1)
            if (r14 == 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            int r1 = Q0.g.e(r2, r3, r3, r3)
            return r1
        L_0x0069:
            M0.q r14 = new M0.q
            r14.<init>()
            java.lang.String r15 = M0.I.o(r9)
            r14.f2999m = r15
            int r15 = r1.f3014C
            r14.f2979B = r15
            int r15 = r1.f3015D
            r14.f2980C = r15
            r14.f2981D = r6
            M0.r r15 = new M0.r
            r15.<init>(r14)
            int r14 = r12.i(r15)
            if (r14 == 0) goto L_0x010a
            if (r13 != 0) goto L_0x008e
            H3.i0 r8 = H3.i0.f2073Y
            goto L_0x00b2
        L_0x008e:
            int r12 = r12.i(r1)
            if (r12 == 0) goto L_0x00ac
            java.util.List r9 = c1.v.e(r9, r3, r3)
            boolean r12 = r9.isEmpty()
            if (r12 == 0) goto L_0x009f
            goto L_0x00a5
        L_0x009f:
            java.lang.Object r8 = r9.get(r3)
            c1.n r8 = (c1.n) r8
        L_0x00a5:
            if (r8 == 0) goto L_0x00ac
            H3.i0 r8 = H3.O.r(r8)
            goto L_0x00b2
        L_0x00ac:
            r8 = r17
            H3.i0 r8 = c1.v.g(r8, r1, r3, r3)
        L_0x00b2:
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x00bd
            int r1 = Q0.g.e(r2, r3, r3, r3)
            return r1
        L_0x00bd:
            if (r4 != 0) goto L_0x00c4
            int r1 = Q0.g.e(r6, r3, r3, r3)
            return r1
        L_0x00c4:
            java.lang.Object r4 = r8.get(r3)
            c1.n r4 = (c1.n) r4
            boolean r6 = r4.d(r1)
            if (r6 != 0) goto L_0x00e6
            r9 = 1
        L_0x00d1:
            int r12 = r8.f2075X
            if (r9 >= r12) goto L_0x00e6
            java.lang.Object r12 = r8.get(r9)
            c1.n r12 = (c1.n) r12
            boolean r13 = r12.d(r1)
            if (r13 == 0) goto L_0x00e3
            r4 = 0
            goto L_0x00e9
        L_0x00e3:
            int r9 = r9 + 1
            goto L_0x00d1
        L_0x00e6:
            r12 = r4
            r2 = r6
            r4 = 1
        L_0x00e9:
            if (r2 == 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r11 = 3
        L_0x00ed:
            if (r2 == 0) goto L_0x00f7
            boolean r1 = r12.e(r1)
            if (r1 == 0) goto L_0x00f7
            r10 = 16
        L_0x00f7:
            boolean r1 = r12.f8802g
            if (r1 == 0) goto L_0x00fe
            r1 = 64
            goto L_0x00ff
        L_0x00fe:
            r1 = 0
        L_0x00ff:
            if (r4 == 0) goto L_0x0103
            r3 = 128(0x80, float:1.794E-43)
        L_0x0103:
            r2 = r11 | r10
            r2 = r2 | r7
            r1 = r1 | r2
            r1 = r1 | r3
            r1 = r1 | r5
            return r1
        L_0x010a:
            int r1 = Q0.g.e(r2, r3, r3, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.B.r0(c1.i, M0.r):int");
    }

    public final void s() {
        x0();
        y yVar = this.f5483y1;
        yVar.f5635V = false;
        if (yVar.o()) {
            p pVar = yVar.f5651g;
            pVar.d();
            if (pVar.f5581x == -9223372036854775807L) {
                o oVar = pVar.e;
                oVar.getClass();
                oVar.a();
            } else {
                pVar.z = pVar.b();
                if (!y.p(yVar.f5668v)) {
                    return;
                }
            }
            yVar.f5668v.pause();
        }
    }

    public final int v0(r rVar) {
        int i;
        g h5 = this.f5483y1.h(rVar);
        if (!h5.f5521a) {
            return 0;
        }
        if (h5.f5522b) {
            i = 1536;
        } else {
            i = 512;
        }
        if (h5.f5523c) {
            return i | 2048;
        }
        return i;
    }

    public final int w0(n nVar, r rVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(nVar.f8797a) || (i = z.f3748a) >= 24 || (i == 23 && z.N(this.w1))) {
            return rVar.f3037o;
        }
        return -1;
    }

    public final void x0() {
        long j7;
        ArrayDeque arrayDeque;
        long j8;
        long j9;
        boolean k8 = k();
        y yVar = this.f5483y1;
        if (!yVar.o() || yVar.f5626M) {
            j7 = Long.MIN_VALUE;
        } else {
            long min = Math.min(yVar.f5651g.a(k8), z.U(yVar.f5666t.e, yVar.k()));
            while (true) {
                arrayDeque = yVar.f5653h;
                if (arrayDeque.isEmpty() || min < ((t) arrayDeque.getFirst()).f5603c) {
                    t tVar = yVar.f5615B;
                    long j10 = min - tVar.f5603c;
                    long x8 = z.x(j10, tVar.f5601a.f2846a);
                    boolean isEmpty = arrayDeque.isEmpty();
                    q0 q0Var = yVar.f5642b;
                } else {
                    yVar.f5615B = (t) arrayDeque.remove();
                }
            }
            t tVar2 = yVar.f5615B;
            long j102 = min - tVar2.f5603c;
            long x82 = z.x(j102, tVar2.f5601a.f2846a);
            boolean isEmpty2 = arrayDeque.isEmpty();
            q0 q0Var2 = yVar.f5642b;
            if (isEmpty2) {
                g gVar = (g) q0Var2.f302X;
                if (gVar.isActive()) {
                    if (gVar.f3276o >= 1024) {
                        long j11 = gVar.f3275n;
                        N0.f fVar = gVar.f3271j;
                        fVar.getClass();
                        long j12 = j11 - ((long) ((fVar.f3252k * fVar.f3245b) * 2));
                        int i = gVar.f3270h.f3233a;
                        int i8 = gVar.f3269g.f3233a;
                        if (i == i8) {
                            j9 = z.W(j102, j12, gVar.f3276o, RoundingMode.DOWN);
                        } else {
                            j9 = z.W(j102, j12 * ((long) i), gVar.f3276o * ((long) i8), RoundingMode.DOWN);
                        }
                    } else {
                        j9 = (long) (((double) gVar.f3266c) * ((double) j102));
                    }
                    j102 = j9;
                }
                t tVar3 = yVar.f5615B;
                j8 = tVar3.f5602b + j102;
                tVar3.f5604d = j102 - x82;
            } else {
                t tVar4 = yVar.f5615B;
                j8 = tVar4.f5602b + x82 + tVar4.f5604d;
            }
            long j13 = ((D) q0Var2.f301W).f5496q;
            j7 = z.U(yVar.f5666t.e, j13) + j8;
            long j14 = yVar.f5652g0;
            if (j13 > j14) {
                long U8 = z.U(yVar.f5666t.e, j13 - j14);
                yVar.f5652g0 = j13;
                yVar.f5654h0 += U8;
                if (yVar.f5655i0 == null) {
                    yVar.f5655i0 = new Handler(Looper.myLooper());
                }
                yVar.f5655i0.removeCallbacksAndMessages((Object) null);
                yVar.f5655i0.postDelayed(new p(2, (Object) yVar), 100);
            }
        }
        if (j7 != Long.MIN_VALUE) {
            if (!this.f5478G1) {
                j7 = Math.max(this.f5477F1, j7);
            }
            this.f5477F1 = j7;
            this.f5478G1 = false;
        }
    }
}
