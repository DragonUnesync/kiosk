package c1;

import H3.L;
import H3.O;
import H3.i0;
import M0.C0121i;
import M0.C0123k;
import M0.I;
import M0.r;
import N1.f;
import P0.a;
import P0.l;
import P0.z;
import Q0.g;
import Q0.i;
import Q0.q;
import T0.C0215g;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import j$.util.Objects;
import java.util.List;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final String f8797a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8798b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8799c;

    /* renamed from: d  reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f8800d;
    public final boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8801f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8802g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8803h;
    public final boolean i;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z6, boolean z8, boolean z9) {
        str.getClass();
        this.f8797a = str;
        this.f8798b = str2;
        this.f8799c = str3;
        this.f8800d = codecCapabilities;
        this.f8802g = z;
        this.e = z6;
        this.f8801f = z8;
        this.f8803h = z9;
        this.i = I.n(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i8, int i9, double d8) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(z.f(i8, widthAlignment) * widthAlignment, z.f(i9, heightAlignment) * heightAlignment);
        int i10 = point.x;
        int i11 = point.y;
        if (d8 == -1.0d || d8 < 1.0d) {
            return videoCapabilities.isSizeSupported(i10, i11);
        }
        return videoCapabilities.areSizeAndRateSupported(i10, i11, Math.floor(d8));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r10) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if ("Nexus 10".equals(r3) == false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static c1.n h(java.lang.String r10, java.lang.String r11, java.lang.String r12, android.media.MediaCodecInfo.CodecCapabilities r13, boolean r14, boolean r15, boolean r16, boolean r17) {
        /*
            r1 = r10
            r4 = r13
            c1.n r9 = new c1.n
            r0 = 0
            r2 = 1
            if (r4 == 0) goto L_0x003b
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r13.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x003b
            int r3 = P0.z.f3748a
            r5 = 22
            if (r3 > r5) goto L_0x0039
            java.lang.String r3 = P0.z.f3751d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0028
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0039
        L_0x0028:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r10)
            if (r3 != 0) goto L_0x003b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x0044
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r13.isFeatureSupported(r3)
        L_0x0044:
            if (r17 != 0) goto L_0x0053
            if (r4 == 0) goto L_0x0051
            java.lang.String r3 = "secure-playback"
            boolean r3 = r13.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r7 = 0
            goto L_0x0054
        L_0x0053:
            r7 = 1
        L_0x0054:
            int r3 = P0.z.f3748a
            r5 = 35
            if (r3 < r5) goto L_0x0066
            if (r4 == 0) goto L_0x0066
            java.lang.String r3 = "detached-surface"
            boolean r3 = r13.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x0066
            r8 = 1
            goto L_0x0067
        L_0x0066:
            r8 = 0
        L_0x0067:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.n.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):c1.n");
    }

    public final C0215g b(r rVar, r rVar2) {
        int i8;
        int i9;
        String str = rVar.f3036n;
        String str2 = rVar2.f3036n;
        int i10 = z.f3748a;
        if (!Objects.equals(str, str2)) {
            i8 = 8;
        } else {
            i8 = 0;
        }
        if (this.i) {
            if (rVar.f3046x != rVar2.f3046x) {
                i8 |= 1024;
            }
            if (!this.e && !(rVar.f3043u == rVar2.f3043u && rVar.f3044v == rVar2.f3044v)) {
                i8 |= 512;
            }
            C0121i iVar = rVar.f3013B;
            boolean e8 = C0121i.e(iVar);
            C0121i iVar2 = rVar2.f3013B;
            if ((!e8 || !C0121i.e(iVar2)) && !Objects.equals(iVar, iVar2)) {
                i8 |= 2048;
            }
            if (z.f3751d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f8797a) && !rVar.c(rVar2)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                if (rVar.c(rVar2)) {
                    i9 = 3;
                } else {
                    i9 = 2;
                }
                return new C0215g(this.f8797a, rVar, rVar2, i9, 0);
            }
        } else {
            if (rVar.f3014C != rVar2.f3014C) {
                i8 |= 4096;
            }
            if (rVar.f3015D != rVar2.f3015D) {
                i8 |= 8192;
            }
            if (rVar.f3016E != rVar2.f3016E) {
                i8 |= 16384;
            }
            String str3 = this.f8798b;
            if (i8 == 0 && "audio/mp4a-latm".equals(str3)) {
                Pair d8 = v.d(rVar);
                Pair d9 = v.d(rVar2);
                if (!(d8 == null || d9 == null)) {
                    int intValue = ((Integer) d8.first).intValue();
                    int intValue2 = ((Integer) d9.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C0215g(this.f8797a, rVar, rVar2, 3, 0);
                    }
                }
            }
            if (!rVar.c(rVar2)) {
                i8 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i8 |= 2;
            }
            if (i8 == 0) {
                return new C0215g(this.f8797a, rVar, rVar2, 1, 0);
            }
        }
        return new C0215g(this.f8797a, rVar, rVar2, 0, i8);
    }

    public final boolean c(r rVar, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i8;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pair;
        String str;
        Pair pair2;
        r rVar2 = rVar;
        int i9 = 4;
        int i10 = 3;
        Pair d8 = v.d(rVar);
        String str2 = this.f8799c;
        String str3 = rVar2.f3036n;
        if (str3 != null && str3.equals("video/mv-hevc") && str2.equals("video/hevc")) {
            List list = rVar2.f3039q;
            int i11 = 0;
            loop0:
            while (true) {
                if (i11 >= list.size()) {
                    pair = null;
                    str = null;
                    break;
                }
                byte[] bArr = (byte[]) list.get(i11);
                int length = bArr.length;
                if (length > i10) {
                    boolean[] zArr = new boolean[i10];
                    L j7 = O.j();
                    int i12 = 0;
                    while (i12 < bArr.length) {
                        int b8 = q.b(bArr, i12, bArr.length, zArr);
                        if (b8 != bArr.length) {
                            j7.a(Integer.valueOf(b8));
                        }
                        i12 = b8 + 3;
                    }
                    i0 g8 = j7.g();
                    for (int i13 = 0; i13 < g8.size(); i13++) {
                        if (((Integer) g8.get(i13)).intValue() + i10 < length) {
                            f fVar = new f(bArr, ((Integer) g8.get(i13)).intValue() + i10, length);
                            C0123k d9 = q.d(fVar);
                            if (d9.f2964b == 33 && d9.f2965c == 0) {
                                fVar.u(4);
                                int i14 = fVar.i(3);
                                fVar.t();
                                pair = null;
                                i e8 = q.e(fVar, true, i14, (i) null);
                                str = a.b(e8.f4026a, e8.f4027b, e8.f4028c, e8.f4029d, e8.e, e8.f4030f);
                                break loop0;
                            }
                            i10 = 3;
                        }
                    }
                    continue;
                }
                i11++;
            }
            if (str == null) {
                pair2 = pair;
            } else {
                String trim = str.trim();
                int i15 = z.f3748a;
                pair2 = a.c(str, trim.split("\\.", -1), rVar2.f3013B);
            }
            d8 = pair2;
        }
        if (d8 == null) {
            return true;
        }
        int intValue = ((Integer) d8.first).intValue();
        int intValue2 = ((Integer) d8.second).intValue();
        boolean equals = "video/dolby-vision".equals(str3);
        String str4 = this.f8798b;
        if (equals) {
            if ("video/avc".equals(str4)) {
                intValue = 8;
            } else if ("video/hevc".equals(str4)) {
                intValue = 2;
            }
            intValue2 = 0;
        }
        if (!this.i && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8800d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (z.f3748a <= 23 && "video/x-vnd.on2.vp9".equals(str4) && codecProfileLevelArr.length == 0) {
            if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                i8 = 0;
            } else {
                i8 = videoCapabilities.getBitrateRange().getUpper().intValue();
            }
            if (i8 >= 180000000) {
                i9 = 1024;
            } else if (i8 >= 120000000) {
                i9 = 512;
            } else if (i8 >= 60000000) {
                i9 = 256;
            } else if (i8 >= 30000000) {
                i9 = 128;
            } else if (i8 >= 18000000) {
                i9 = 64;
            } else if (i8 >= 12000000) {
                i9 = 32;
            } else if (i8 >= 7200000) {
                i9 = 16;
            } else if (i8 >= 3600000) {
                i9 = 8;
            } else if (i8 < 1800000) {
                if (i8 >= 800000) {
                    i9 = 2;
                } else {
                    i9 = 1;
                }
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i9;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z)) {
                if (!"video/hevc".equals(str4) || 2 != intValue) {
                    return true;
                }
                String str5 = z.f3749b;
                if (!"sailfish".equals(str5) && !"marlin".equals(str5)) {
                    return true;
                }
            }
        }
        g("codec.profileLevel, " + rVar2.f3033k + ", " + str2);
        return false;
    }

    public final boolean d(r rVar) {
        boolean z;
        int i8;
        int i9;
        String str = rVar.f3036n;
        String str2 = this.f8798b;
        if (str2.equals(str) || str2.equals(v.b(rVar))) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !c(rVar, true)) {
            return false;
        }
        if (this.i) {
            int i10 = rVar.f3043u;
            if (i10 <= 0 || (i9 = rVar.f3044v) <= 0) {
                return true;
            }
            return f(i10, i9, (double) rVar.f3045w);
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f8800d;
        int i11 = rVar.f3015D;
        if (i11 != -1) {
            if (codecCapabilities == null) {
                g("sampleRate.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                } else if (!audioCapabilities.isSampleRateSupported(i11)) {
                    g("sampleRate.support, " + i11);
                }
            }
            return false;
        }
        int i12 = rVar.f3014C;
        if (i12 == -1) {
            return true;
        }
        if (codecCapabilities == null) {
            g("channelCount.caps");
        } else {
            MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities2 == null) {
                g("channelCount.aCaps");
            } else {
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((z.f3748a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    if ("audio/ac3".equals(str2)) {
                        i8 = 6;
                    } else if ("audio/eac3".equals(str2)) {
                        i8 = 16;
                    } else {
                        i8 = 30;
                    }
                    l.B("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f8797a + ", [" + maxInputChannelCount + " to " + i8 + "]");
                    maxInputChannelCount = i8;
                }
                if (maxInputChannelCount >= i12) {
                    return true;
                }
                g("channelCount.support, " + i12);
            }
        }
        return false;
    }

    public final boolean e(r rVar) {
        if (this.i) {
            return this.e;
        }
        Pair d8 = v.d(rVar);
        if (d8 == null || ((Integer) d8.first).intValue() != 42) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r2 == false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(int r12, int r13, double r14) {
        /*
            r11 = this;
            r0 = 0
            android.media.MediaCodecInfo$CodecCapabilities r1 = r11.f8800d
            if (r1 != 0) goto L_0x000b
            java.lang.String r12 = "sizeAndRate.caps"
            r11.g(r12)
            return r0
        L_0x000b:
            android.media.MediaCodecInfo$VideoCapabilities r1 = r1.getVideoCapabilities()
            if (r1 != 0) goto L_0x0017
            java.lang.String r12 = "sizeAndRate.vCaps"
            r11.g(r12)
            return r0
        L_0x0017:
            int r2 = P0.z.f3748a
            r3 = 1
            r4 = 29
            java.lang.String r5 = "@"
            java.lang.String r6 = "x"
            if (r2 < r4) goto L_0x00a1
            r7 = 2
            if (r2 < r4) goto L_0x008a
            java.lang.Boolean r4 = g7.C0996d.f12029b
            if (r4 == 0) goto L_0x0030
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0030
            goto L_0x008a
        L_0x0030:
            java.util.List r4 = r1.getSupportedPerformancePoints()
            if (r4 == 0) goto L_0x008a
            boolean r8 = r4.isEmpty()
            if (r8 == 0) goto L_0x003d
            goto L_0x008a
        L_0x003d:
            B3.l.l()
            int r8 = (int) r14
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r8 = B3.l.e(r12, r13, r8)
            r9 = 0
        L_0x0046:
            int r10 = r4.size()
            if (r9 >= r10) goto L_0x005f
            java.lang.Object r10 = r4.get(r9)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r10 = B3.l.f(r10)
            boolean r10 = r10.covers(r8)
            if (r10 == 0) goto L_0x005c
            r4 = 2
            goto L_0x0060
        L_0x005c:
            int r9 = r9 + 1
            goto L_0x0046
        L_0x005f:
            r4 = 1
        L_0x0060:
            if (r4 != r3) goto L_0x008b
            java.lang.Boolean r8 = g7.C0996d.f12029b
            if (r8 != 0) goto L_0x008b
            r8 = 35
            if (r2 < r8) goto L_0x006c
        L_0x006a:
            r2 = 0
            goto L_0x0082
        L_0x006c:
            int r2 = com.bumptech.glide.d.f(r0)
            int r8 = com.bumptech.glide.d.f(r3)
            if (r2 != 0) goto L_0x0078
        L_0x0076:
            r2 = 1
            goto L_0x0082
        L_0x0078:
            if (r8 != 0) goto L_0x007d
            if (r2 == r7) goto L_0x006a
            goto L_0x0076
        L_0x007d:
            if (r2 != r7) goto L_0x0076
            if (r8 == r7) goto L_0x006a
            goto L_0x0076
        L_0x0082:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            g7.C0996d.f12029b = r8
            if (r2 == 0) goto L_0x008b
        L_0x008a:
            r4 = 0
        L_0x008b:
            if (r4 != r7) goto L_0x008e
            return r3
        L_0x008e:
            if (r4 != r3) goto L_0x00a1
            java.lang.String r1 = "sizeAndRate.cover, "
            java.lang.StringBuilder r12 = u.C1477r.e(r1, r12, r6, r13, r5)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            r11.g(r12)
            return r0
        L_0x00a1:
            boolean r2 = a(r1, r12, r13, r14)
            if (r2 != 0) goto L_0x0116
            if (r12 >= r13) goto L_0x0105
            java.lang.String r2 = "OMX.MTK.VIDEO.DECODER.HEVC"
            java.lang.String r4 = r11.f8797a
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00be
            java.lang.String r2 = "mcv5a"
            java.lang.String r7 = P0.z.f3749b
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L_0x00be
            goto L_0x0105
        L_0x00be:
            boolean r1 = a(r1, r13, r12, r14)
            if (r1 != 0) goto L_0x00c5
            goto L_0x0105
        L_0x00c5:
            java.lang.String r0 = "sizeAndRate.rotated, "
            java.lang.StringBuilder r12 = u.C1477r.e(r0, r12, r6, r13, r5)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "AssumedSupport ["
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = "] ["
            r13.append(r12)
            r13.append(r4)
            java.lang.String r14 = ", "
            r13.append(r14)
            java.lang.String r14 = r11.f8798b
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = P0.z.e
            r13.append(r12)
            java.lang.String r12 = "]"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            java.lang.String r13 = "MediaCodecInfo"
            P0.l.n(r13, r12)
            goto L_0x0116
        L_0x0105:
            java.lang.String r1 = "sizeAndRate.support, "
            java.lang.StringBuilder r12 = u.C1477r.e(r1, r12, r6, r13, r5)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            r11.g(r12)
            return r0
        L_0x0116:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.n.f(int, int, double):boolean");
    }

    public final void g(String str) {
        StringBuilder s8 = g.s("NoSupport [", str, "] [");
        s8.append(this.f8797a);
        s8.append(", ");
        s8.append(this.f8798b);
        s8.append("] [");
        s8.append(z.e);
        s8.append("]");
        l.n("MediaCodecInfo", s8.toString());
    }

    public final String toString() {
        return this.f8797a;
    }
}
