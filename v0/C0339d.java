package V0;

import D2.o;
import H3.L;
import H3.O;
import H3.P;
import H3.U;
import H3.i0;
import H3.n0;
import M0.C0117e;
import M0.I;
import M0.r;
import P0.z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.util.Pair;
import android.util.SparseArray;
import j$.util.Objects;

/* renamed from: V0.d  reason: case insensitive filesystem */
public final class C0339d {

    /* renamed from: c  reason: collision with root package name */
    public static final C0339d f5512c = new C0339d(O.r(C0338c.f5508d));

    /* renamed from: d  reason: collision with root package name */
    public static final i0 f5513d = O.t(2, 5, 6);
    public static final n0 e;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f5514a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public final int f5515b;

    static {
        o oVar = new o(4);
        oVar.n(5, 6);
        oVar.n(17, 6);
        oVar.n(7, 6);
        oVar.n(30, 10);
        oVar.n(18, 6);
        oVar.n(6, 8);
        oVar.n(8, 8);
        oVar.n(14, 8);
        e = oVar.c();
    }

    public C0339d(i0 i0Var) {
        for (int i = 0; i < i0Var.f2075X; i++) {
            C0338c cVar = (C0338c) i0Var.get(i);
            this.f5514a.put(cVar.f5509a, cVar);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f5514a.size(); i9++) {
            i8 = Math.max(i8, ((C0338c) this.f5514a.valueAt(i9)).f5510b);
        }
        this.f5515b = i8;
    }

    public static i0 a(int[] iArr, int i) {
        L j7 = O.j();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int cVar : iArr) {
            j7.a(new C0338c(cVar, i));
        }
        return j7.g();
    }

    public static C0339d b(Context context, C0117e eVar, P p3) {
        return c(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), eVar, p3);
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [H3.T, H3.I] */
    /* JADX WARNING: type inference failed for: r8v2, types: [H3.T, H3.I] */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0266, code lost:
        if ("Xiaomi".equals(r6) == false) goto L_0x0278;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static V0.C0339d c(android.content.Context r16, android.content.Intent r17, M0.C0117e r18, H3.P r19) {
        /*
            r0 = r17
            r1 = 2
            r2 = 0
            r3 = 1
            java.lang.String r4 = "audio"
            r5 = r16
            java.lang.Object r4 = r5.getSystemService(r4)
            r4.getClass()
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            r6 = 33
            if (r19 == 0) goto L_0x0019
            r8 = r19
            goto L_0x0040
        L_0x0019:
            int r7 = P0.z.f3748a
            r8 = 0
            if (r7 < r6) goto L_0x0040
            H3.P r7 = r18.a()     // Catch:{ RuntimeException -> 0x003f }
            java.lang.Object r7 = r7.f2027U     // Catch:{ RuntimeException -> 0x003f }
            android.media.AudioAttributes r7 = (android.media.AudioAttributes) r7     // Catch:{ RuntimeException -> 0x003f }
            java.util.List r7 = r4.getAudioDevicesForAttributes(r7)     // Catch:{ RuntimeException -> 0x003f }
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto L_0x0031
            goto L_0x0040
        L_0x0031:
            H3.P r8 = new H3.P
            java.lang.Object r7 = r7.get(r2)
            android.media.AudioDeviceInfo r7 = B3.a.g(r7)
            r8.<init>((java.lang.Object) r7)
            goto L_0x0040
        L_0x003f:
        L_0x0040:
            int r7 = P0.z.f3748a
            java.lang.String r9 = "android.hardware.type.automotive"
            r10 = 23
            H3.n0 r11 = e
            r12 = 12
            if (r7 < r6) goto L_0x0121
            boolean r13 = P0.z.N(r16)
            if (r13 != 0) goto L_0x005e
            if (r7 < r10) goto L_0x0121
            android.content.pm.PackageManager r13 = r16.getPackageManager()
            boolean r13 = r13.hasSystemFeature(r9)
            if (r13 == 0) goto L_0x0121
        L_0x005e:
            H3.P r0 = r18.a()
            java.lang.Object r0 = r0.f2027U
            android.media.AudioAttributes r0 = (android.media.AudioAttributes) r0
            java.util.List r0 = r4.getDirectProfilesForAttributes(r0)
            V0.d r4 = new V0.d
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.HashSet r6 = new java.util.HashSet
            int[] r7 = new int[]{r12}
            java.util.List r7 = E.e.a(r7)
            r6.<init>(r7)
            r5.put(r1, r6)
        L_0x0085:
            int r1 = r0.size()
            if (r2 >= r1) goto L_0x00e8
            java.lang.Object r1 = r0.get(r2)
            android.media.AudioProfile r1 = U0.g.a(r1)
            int r6 = r1.getEncapsulationType()
            if (r6 != r3) goto L_0x009a
            goto L_0x00e6
        L_0x009a:
            int r6 = r1.getFormat()
            boolean r7 = P0.z.K(r6)
            if (r7 != 0) goto L_0x00af
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r7 = r11.containsKey(r7)
            if (r7 != 0) goto L_0x00af
            goto L_0x00e6
        L_0x00af:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r7 = r5.containsKey(r7)
            if (r7 == 0) goto L_0x00d2
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r6 = r5.get(r6)
            java.util.Set r6 = (java.util.Set) r6
            r6.getClass()
            int[] r1 = r1.getChannelMasks()
            java.util.List r1 = E.e.a(r1)
            r6.addAll(r1)
            goto L_0x00e6
        L_0x00d2:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.HashSet r7 = new java.util.HashSet
            int[] r1 = r1.getChannelMasks()
            java.util.List r1 = E.e.a(r1)
            r7.<init>(r1)
            r5.put(r6, r7)
        L_0x00e6:
            int r2 = r2 + r3
            goto L_0x0085
        L_0x00e8:
            H3.L r0 = H3.O.j()
            java.util.Set r1 = r5.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f4:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0119
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            V0.c r3 = new V0.c
            java.lang.Object r5 = r2.getKey()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            r3.<init>((int) r5, (java.util.Set) r2)
            r0.a(r3)
            goto L_0x00f4
        L_0x0119:
            H3.i0 r0 = r0.g()
            r4.<init>(r0)
            return r4
        L_0x0121:
            r13 = 4
            if (r7 < r10) goto L_0x01ab
            if (r8 != 0) goto L_0x012b
            android.media.AudioDeviceInfo[] r4 = r4.getDevices(2)
            goto L_0x0133
        L_0x012b:
            android.media.AudioDeviceInfo[] r4 = new android.media.AudioDeviceInfo[r3]
            java.lang.Object r8 = r8.f2027U
            android.media.AudioDeviceInfo r8 = (android.media.AudioDeviceInfo) r8
            r4[r2] = r8
        L_0x0133:
            H3.T r8 = new H3.T
            r8.<init>(r13)
            r14 = 8
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r15 = 7
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.lang.Integer[] r12 = new java.lang.Integer[r1]
            r12[r2] = r14
            r12[r3] = r15
            H3.C0103u.c(r1, r12)
            r8.e(r1)
            java.lang.Object[] r14 = r8.f2014a
            int r15 = r8.f2015b
            java.lang.System.arraycopy(r12, r2, r14, r15, r1)
            int r12 = r8.f2015b
            int r12 = r12 + r1
            r8.f2015b = r12
            r12 = 31
            if (r7 < r12) goto L_0x0183
            r12 = 26
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r14 = 27
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Integer[] r15 = new java.lang.Integer[r1]
            r15[r2] = r12
            r15[r3] = r14
            H3.C0103u.c(r1, r15)
            r8.e(r1)
            java.lang.Object[] r12 = r8.f2014a
            int r14 = r8.f2015b
            java.lang.System.arraycopy(r15, r2, r12, r14, r1)
            int r12 = r8.f2015b
            int r12 = r12 + r1
            r8.f2015b = r12
        L_0x0183:
            if (r7 < r6) goto L_0x018e
            r6 = 30
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.a(r6)
        L_0x018e:
            H3.U r6 = r8.g()
            int r7 = r4.length
            r8 = 0
        L_0x0194:
            if (r8 >= r7) goto L_0x01ab
            r12 = r4[r8]
            int r12 = r12.getType()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            boolean r12 = r6.contains(r12)
            if (r12 == 0) goto L_0x01a9
            V0.d r0 = f5512c
            return r0
        L_0x01a9:
            int r8 = r8 + r3
            goto L_0x0194
        L_0x01ab:
            H3.T r4 = new H3.T
            r4.<init>(r13)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r4.a(r6)
            int r6 = P0.z.f3748a
            r7 = 29
            r8 = 10
            if (r6 < r7) goto L_0x0245
            boolean r7 = P0.z.N(r16)
            if (r7 != 0) goto L_0x01d1
            if (r6 < r10) goto L_0x0245
            android.content.pm.PackageManager r6 = r16.getPackageManager()
            boolean r6 = r6.hasSystemFeature(r9)
            if (r6 == 0) goto L_0x0245
        L_0x01d1:
            H3.L r0 = H3.O.j()
            H3.U r2 = r11.keySet()
            H3.x0 r2 = r2.iterator()
        L_0x01dd:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0222
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r5 = r3.intValue()
            int r6 = P0.z.f3748a
            int r7 = P0.z.p(r5)
            if (r6 >= r7) goto L_0x01f6
            goto L_0x01dd
        L_0x01f6:
            android.media.AudioFormat$Builder r6 = new android.media.AudioFormat$Builder
            r6.<init>()
            r7 = 12
            android.media.AudioFormat$Builder r6 = r6.setChannelMask(r7)
            android.media.AudioFormat$Builder r5 = r6.setEncoding(r5)
            r6 = 48000(0xbb80, float:6.7262E-41)
            android.media.AudioFormat$Builder r5 = r5.setSampleRate(r6)
            android.media.AudioFormat r5 = r5.build()
            H3.P r6 = r18.a()
            java.lang.Object r6 = r6.f2027U
            android.media.AudioAttributes r6 = (android.media.AudioAttributes) r6
            boolean r5 = android.media.AudioTrack.isDirectPlaybackSupported(r5, r6)
            if (r5 == 0) goto L_0x01dd
            r0.a(r3)
            goto L_0x01dd
        L_0x0222:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.a(r1)
            H3.i0 r0 = r0.g()
            r0.getClass()
            r4.d(r0)
            V0.d r0 = new V0.d
            H3.U r1 = r4.g()
            int[] r1 = E.e.y(r1)
            H3.i0 r1 = a(r1, r8)
            r0.<init>(r1)
            return r0
        L_0x0245:
            android.content.ContentResolver r1 = r16.getContentResolver()
            java.lang.String r5 = "use_external_surround_sound_flag"
            int r5 = android.provider.Settings.Global.getInt(r1, r5, r2)
            if (r5 != r3) goto L_0x0253
            r5 = 1
            goto L_0x0254
        L_0x0253:
            r5 = 0
        L_0x0254:
            if (r5 != 0) goto L_0x0268
            java.lang.String r6 = P0.z.f3750c
            java.lang.String r7 = "Amazon"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L_0x0268
            java.lang.String r7 = "Xiaomi"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0278
        L_0x0268:
            java.lang.String r6 = "external_surround_sound_enabled"
            int r1 = android.provider.Settings.Global.getInt(r1, r6, r2)
            if (r1 != r3) goto L_0x0278
            H3.i0 r1 = f5513d
            r1.getClass()
            r4.d(r1)
        L_0x0278:
            if (r0 == 0) goto L_0x02ae
            if (r5 != 0) goto L_0x02ae
            java.lang.String r1 = "android.media.extra.AUDIO_PLUG_STATE"
            int r1 = r0.getIntExtra(r1, r2)
            if (r1 != r3) goto L_0x02ae
            java.lang.String r1 = "android.media.extra.ENCODINGS"
            int[] r1 = r0.getIntArrayExtra(r1)
            if (r1 == 0) goto L_0x0296
            java.util.List r1 = E.e.a(r1)
            r1.getClass()
            r4.d(r1)
        L_0x0296:
            V0.d r1 = new V0.d
            H3.U r2 = r4.g()
            int[] r2 = E.e.y(r2)
            java.lang.String r3 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r0 = r0.getIntExtra(r3, r8)
            H3.i0 r0 = a(r2, r0)
            r1.<init>(r0)
            return r1
        L_0x02ae:
            V0.d r0 = new V0.d
            H3.U r1 = r4.g()
            int[] r1 = E.e.y(r1)
            H3.i0 r1 = a(r1, r8)
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.C0339d.c(android.content.Context, android.content.Intent, M0.e, H3.P):V0.d");
    }

    public final Pair d(C0117e eVar, r rVar) {
        r rVar2 = rVar;
        String str = rVar2.f3036n;
        str.getClass();
        int d8 = I.d(str, rVar2.f3033k);
        Integer valueOf = Integer.valueOf(d8);
        n0 n0Var = e;
        if (!n0Var.containsKey(valueOf)) {
            return null;
        }
        if (d8 == 18 && !e(18)) {
            d8 = 6;
        } else if ((d8 == 8 && !e(8)) || (d8 == 30 && !e(30))) {
            d8 = 7;
        }
        if (!e(d8)) {
            return null;
        }
        C0338c cVar = (C0338c) this.f5514a.get(d8);
        cVar.getClass();
        boolean z = false;
        int i = 10;
        int i8 = cVar.f5510b;
        U u3 = cVar.f5511c;
        int i9 = rVar2.f3014C;
        if (i9 == -1 || d8 == 18) {
            int i10 = rVar2.f3015D;
            if (i10 == -1) {
                i10 = 48000;
            }
            if (u3 == null) {
                int i11 = z.f3748a;
                int i12 = cVar.f5509a;
                if (i11 >= 29) {
                    while (true) {
                        if (i <= 0) {
                            break;
                        }
                        int r8 = z.r(i);
                        if (r8 != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i12).setSampleRate(i10).setChannelMask(r8).build(), (AudioAttributes) eVar.a().f2027U)) {
                            z = i;
                            break;
                        }
                        i--;
                    }
                    i8 = z;
                } else {
                    int i13 = 0;
                    Object obj = n0Var.get(Integer.valueOf(i12));
                    if (obj != null) {
                        i13 = obj;
                    }
                    i8 = ((Integer) i13).intValue();
                }
            }
            i9 = i8;
        } else if (!rVar2.f3036n.equals("audio/vnd.dts.uhd;profile=p2") || z.f3748a >= 33) {
            if (u3 != null) {
                int r9 = z.r(i9);
                if (r9 != 0) {
                    z = u3.contains(Integer.valueOf(r9));
                }
            } else if (i9 <= i8) {
                z = true;
            }
            if (!z) {
                return null;
            }
        } else if (i9 > 10) {
            return null;
        }
        int i14 = z.f3748a;
        if (i14 <= 28) {
            if (i9 == 7) {
                i9 = 8;
            } else if (i9 == 3 || i9 == 4 || i9 == 5) {
                i9 = 6;
            }
        }
        if (i14 <= 26 && "fugu".equals(z.f3749b) && i9 == 1) {
            i9 = 2;
        }
        int r10 = z.r(i9);
        if (r10 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(d8), Integer.valueOf(r10));
    }

    public final boolean e(int i) {
        SparseArray sparseArray = this.f5514a;
        int i8 = z.f3748a;
        if (sparseArray.indexOfKey(i) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        if (r3 == null) goto L_0x0049;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r9 instanceof V0.C0339d
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            V0.d r9 = (V0.C0339d) r9
            android.util.SparseArray r1 = r8.f5514a
            android.util.SparseArray r3 = r9.f5514a
            int r4 = P0.z.f3748a
            if (r1 != 0) goto L_0x0017
            if (r3 != 0) goto L_0x0019
            goto L_0x0049
        L_0x0017:
            if (r3 != 0) goto L_0x001b
        L_0x0019:
            r1 = 0
            goto L_0x004a
        L_0x001b:
            int r4 = P0.z.f3748a
            r5 = 31
            if (r4 < r5) goto L_0x0026
            boolean r1 = r1.contentEquals(r3)
            goto L_0x004a
        L_0x0026:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L_0x0031
            goto L_0x0019
        L_0x0031:
            r5 = 0
        L_0x0032:
            if (r5 >= r4) goto L_0x0049
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = j$.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L_0x0047
            goto L_0x0019
        L_0x0047:
            int r5 = r5 + r0
            goto L_0x0032
        L_0x0049:
            r1 = 1
        L_0x004a:
            if (r1 == 0) goto L_0x0053
            int r1 = r8.f5515b
            int r9 = r9.f5515b
            if (r1 != r9) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V0.C0339d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        SparseArray sparseArray = this.f5514a;
        if (z.f3748a >= 31) {
            i = sparseArray.contentHashCode();
        } else {
            int i8 = 17;
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                int keyAt = sparseArray.keyAt(i9);
                i8 = Objects.hashCode(sparseArray.valueAt(i9)) + ((keyAt + (i8 * 31)) * 31);
            }
            i = i8;
        }
        return (i * 31) + this.f5515b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f5515b + ", audioProfiles=" + this.f5514a + "]";
    }
}
