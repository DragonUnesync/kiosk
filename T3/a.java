package T3;

import M3.h;
import M3.n;
import S3.b;
import androidx.constraintlayout.widget.ConstraintLayout;
import p1.C1332b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f4999a;

    /* renamed from: b  reason: collision with root package name */
    public int f5000b;

    /* renamed from: c  reason: collision with root package name */
    public int f5001c;

    /* renamed from: d  reason: collision with root package name */
    public int f5002d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f5003f;

    /* renamed from: g  reason: collision with root package name */
    public Object f5004g;

    public a(b bVar, int i, int i8, int i9) {
        this.f5004g = bVar;
        int i10 = bVar.f4506V;
        this.f4999a = i10;
        int i11 = bVar.f4505U;
        this.f5000b = i11;
        int i12 = i / 2;
        int i13 = i8 - i12;
        this.f5001c = i13;
        int i14 = i8 + i12;
        this.f5002d = i14;
        int i15 = i9 - i12;
        this.f5003f = i15;
        int i16 = i9 + i12;
        this.e = i16;
        if (i15 < 0 || i13 < 0 || i16 >= i10 || i14 >= i11) {
            throw h.f3144W;
        }
    }

    public boolean a(int i, int i8, int i9, boolean z) {
        b bVar = (b) this.f5004g;
        if (z) {
            while (i <= i8) {
                if (bVar.b(i, i9)) {
                    return true;
                }
                i++;
            }
            return false;
        }
        while (i <= i8) {
            if (bVar.b(i9, i)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public n[] b() {
        int i;
        boolean z;
        int i8;
        int i9 = this.f5001c;
        int i10 = this.f5002d;
        int i11 = this.f5003f;
        int i12 = this.e;
        boolean z6 = true;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            i = this.f5000b;
            if (!z6) {
                z = false;
                break;
            }
            boolean z12 = true;
            boolean z13 = false;
            while (true) {
                if ((z12 || !z8) && i10 < i) {
                    z12 = a(i11, i12, i10, false);
                    if (z12) {
                        i10++;
                        z8 = true;
                        z13 = true;
                    } else if (!z8) {
                        i10++;
                    }
                }
            }
            if (i10 < i) {
                boolean z14 = true;
                while (true) {
                    i8 = this.f4999a;
                    if ((z14 || !z9) && i12 < i8) {
                        z14 = a(i9, i10, i12, true);
                        if (z14) {
                            i12++;
                            z9 = true;
                            z13 = true;
                        } else if (!z9) {
                            i12++;
                        }
                    }
                }
                if (i12 < i8) {
                    boolean z15 = true;
                    while (true) {
                        if ((z15 || !z10) && i9 >= 0) {
                            z15 = a(i11, i12, i9, false);
                            if (z15) {
                                i9--;
                                z10 = true;
                                z13 = true;
                            } else if (!z10) {
                                i9--;
                            }
                        }
                    }
                    if (i9 >= 0) {
                        z6 = z13;
                        boolean z16 = true;
                        while (true) {
                            if ((z16 || !z11) && i11 >= 0) {
                                z16 = a(i9, i10, i11, true);
                                if (z16) {
                                    i11--;
                                    z6 = true;
                                    z11 = true;
                                } else if (!z11) {
                                    i11--;
                                }
                            }
                        }
                        if (i11 < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        z = true;
        if (!z) {
            int i13 = i10 - i9;
            n nVar = null;
            int i14 = 1;
            while (nVar == null && i14 < i13) {
                nVar = c((float) i9, (float) (i12 - i14), (float) (i9 + i14), (float) i12);
                i14++;
            }
            if (nVar != null) {
                n nVar2 = null;
                int i15 = 1;
                while (nVar2 == null && i15 < i13) {
                    nVar2 = c((float) i9, (float) (i11 + i15), (float) (i9 + i15), (float) i11);
                    i15++;
                }
                if (nVar2 != null) {
                    n nVar3 = null;
                    int i16 = 1;
                    while (nVar3 == null && i16 < i13) {
                        nVar3 = c((float) i10, (float) (i11 + i16), (float) (i10 - i16), (float) i11);
                        i16++;
                    }
                    if (nVar3 != null) {
                        n nVar4 = null;
                        int i17 = 1;
                        while (nVar4 == null && i17 < i13) {
                            nVar4 = c((float) i10, (float) (i12 - i17), (float) (i10 - i17), (float) i12);
                            i17++;
                        }
                        if (nVar4 != null) {
                            float f8 = nVar4.f3164a;
                            float f9 = nVar.f3164a;
                            float f10 = nVar3.f3164a;
                            float f11 = nVar2.f3164a;
                            float f12 = nVar4.f3165b;
                            float f13 = nVar.f3165b;
                            float f14 = nVar3.f3165b;
                            float f15 = nVar2.f3165b;
                            if (f8 < ((float) i) / 2.0f) {
                                return new n[]{new n(f11 - 1.0f, f15 + 1.0f), new n(f9 + 1.0f, f13 + 1.0f), new n(f10 - 1.0f, f14 - 1.0f), new n(f8 + 1.0f, f12 - 1.0f)};
                            }
                            return new n[]{new n(f11 + 1.0f, f15 + 1.0f), new n(f9 + 1.0f, f13 - 1.0f), new n(f10 - 1.0f, f14 + 1.0f), new n(f8 - 1.0f, f12 - 1.0f)};
                        }
                        throw h.f3144W;
                    }
                    throw h.f3144W;
                }
                throw h.f3144W;
            }
            throw h.f3144W;
        }
        throw h.f3144W;
    }

    public n c(float f8, float f9, float f10, float f11) {
        int V02 = n2.a.V0(n2.a.y(f8, f9, f10, f11));
        float f12 = (float) V02;
        float f13 = (f10 - f8) / f12;
        float f14 = (f11 - f9) / f12;
        for (int i = 0; i < V02; i++) {
            float f15 = (float) i;
            int V03 = n2.a.V0((f15 * f13) + f8);
            int V04 = n2.a.V0((f15 * f14) + f9);
            if (((b) this.f5004g).b(V03, V04)) {
                return new n((float) V03, (float) V04);
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(d0.d r18, e0.C0818b r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            int r3 = r1.f9603V
            r4 = 8
            r5 = 0
            if (r3 != r4) goto L_0x0017
            r2.e = r5
            r2.f11133f = r5
            r2.f11134g = r5
            return
        L_0x0017:
            int r3 = r2.f11129a
            int r4 = r2.f11130b
            int r6 = r2.f11131c
            int r7 = r2.f11132d
            int r8 = r0.f4999a
            int r9 = r0.f5000b
            int r8 = r8 + r9
            int r9 = r0.f5001c
            android.view.View r10 = r1.f9602U
            int r11 = u.C1477r.h(r3)
            d0.c r12 = r1.z
            d0.c r13 = r1.f9632x
            int[] r14 = r1.f9616g
            r15 = 1
            r5 = 2
            if (r11 == 0) goto L_0x00a2
            if (r11 == r15) goto L_0x0096
            if (r11 == r5) goto L_0x0057
            r6 = 3
            if (r11 == r6) goto L_0x0041
            r6 = 0
        L_0x003e:
            r9 = 0
            goto L_0x00ac
        L_0x0041:
            int r6 = r0.e
            if (r13 == 0) goto L_0x0048
            int r11 = r13.e
            goto L_0x0049
        L_0x0048:
            r11 = 0
        L_0x0049:
            if (r12 == 0) goto L_0x004e
            int r15 = r12.e
            int r11 = r11 + r15
        L_0x004e:
            int r9 = r9 + r11
            r11 = -1
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r11)
            r14[r5] = r11
            goto L_0x003e
        L_0x0057:
            int r6 = r0.e
            r11 = -2
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r11)
            int r9 = r1.f9618j
            r11 = 1
            if (r9 != r11) goto L_0x0066
            r9 = 1
        L_0x0064:
            r11 = 0
            goto L_0x0068
        L_0x0066:
            r9 = 0
            goto L_0x0064
        L_0x0068:
            r14[r5] = r11
            boolean r15 = r2.f11136j
            if (r15 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x0080
            r15 = 3
            r16 = r14[r15]
            if (r16 == 0) goto L_0x0080
            r15 = r14[r11]
            int r11 = r18.l()
            if (r15 != r11) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r11 = 1
            goto L_0x0081
        L_0x0080:
            r11 = 0
        L_0x0081:
            if (r9 == 0) goto L_0x0089
            if (r11 == 0) goto L_0x0086
            goto L_0x0089
        L_0x0086:
            r11 = 1073741824(0x40000000, float:2.0)
            goto L_0x0094
        L_0x0089:
            int r6 = r18.l()
            r11 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            goto L_0x003e
        L_0x0094:
            r9 = 1
            goto L_0x00ac
        L_0x0096:
            r11 = 1073741824(0x40000000, float:2.0)
            int r6 = r0.e
            r15 = -2
            int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r15)
            r14[r5] = r15
            goto L_0x0094
        L_0x00a2:
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            r14[r5] = r6
            r6 = r9
            goto L_0x003e
        L_0x00ac:
            int r11 = u.C1477r.h(r4)
            if (r11 == 0) goto L_0x012b
            r15 = 1
            if (r11 == r15) goto L_0x011c
            if (r11 == r5) goto L_0x00dd
            r7 = 3
            if (r11 == r7) goto L_0x00bf
            r7 = 0
            r8 = 3
            r11 = 0
            goto L_0x0135
        L_0x00bf:
            int r7 = r0.f5003f
            if (r13 == 0) goto L_0x00c8
            d0.c r11 = r1.f9633y
            int r11 = r11.e
            goto L_0x00c9
        L_0x00c8:
            r11 = 0
        L_0x00c9:
            if (r12 == 0) goto L_0x00d0
            d0.c r12 = r1.f9582A
            int r12 = r12.e
            int r11 = r11 + r12
        L_0x00d0:
            int r8 = r8 + r11
            r11 = -1
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
            r12 = 3
            r14[r12] = r11
            r11 = r7
        L_0x00da:
            r7 = 0
        L_0x00db:
            r8 = 3
            goto L_0x0135
        L_0x00dd:
            r12 = 3
            int r7 = r0.f5003f
            r11 = -2
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
            int r7 = r1.f9619k
            r8 = 1
            if (r7 != r8) goto L_0x00ed
            r7 = 1
        L_0x00eb:
            r13 = 0
            goto L_0x00ef
        L_0x00ed:
            r7 = 0
            goto L_0x00eb
        L_0x00ef:
            r14[r12] = r13
            boolean r12 = r2.f11136j
            if (r12 == 0) goto L_0x010c
            if (r7 == 0) goto L_0x0106
            r12 = r14[r5]
            if (r12 == 0) goto L_0x0106
            r12 = r14[r8]
            int r8 = r18.i()
            if (r12 != r8) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r8 = 1
            goto L_0x0107
        L_0x0106:
            r8 = 0
        L_0x0107:
            if (r7 == 0) goto L_0x010f
            if (r8 == 0) goto L_0x010c
            goto L_0x010f
        L_0x010c:
            r12 = 1073741824(0x40000000, float:2.0)
            goto L_0x011a
        L_0x010f:
            int r7 = r18.i()
            r12 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            goto L_0x00da
        L_0x011a:
            r7 = 1
            goto L_0x00db
        L_0x011c:
            r12 = 1073741824(0x40000000, float:2.0)
            int r7 = r0.f5003f
            r11 = -2
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r11)
            r8 = 3
            r14[r8] = r11
            r11 = r7
            r7 = 1
            goto L_0x0135
        L_0x012b:
            r8 = 3
            r12 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            r14[r8] = r7
            r7 = 0
        L_0x0135:
            if (r3 != r8) goto L_0x0139
            r12 = 1
            goto L_0x013a
        L_0x0139:
            r12 = 0
        L_0x013a:
            if (r4 != r8) goto L_0x013e
            r8 = 1
            goto L_0x013f
        L_0x013e:
            r8 = 0
        L_0x013f:
            r13 = 4
            r15 = 1
            if (r4 == r13) goto L_0x0148
            if (r4 != r15) goto L_0x0146
            goto L_0x0148
        L_0x0146:
            r4 = 0
            goto L_0x0149
        L_0x0148:
            r4 = 1
        L_0x0149:
            if (r3 == r13) goto L_0x0150
            if (r3 != r15) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r3 = 0
            goto L_0x0151
        L_0x0150:
            r3 = 1
        L_0x0151:
            r13 = 0
            if (r12 == 0) goto L_0x015c
            float r15 = r1.f9593L
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x015c
            r15 = 1
            goto L_0x015d
        L_0x015c:
            r15 = 0
        L_0x015d:
            if (r8 == 0) goto L_0x0167
            float r5 = r1.f9593L
            int r5 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r5 <= 0) goto L_0x0167
            r5 = 1
            goto L_0x0168
        L_0x0167:
            r5 = 0
        L_0x0168:
            android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
            f0.e r13 = (f0.C0877e) r13
            boolean r0 = r2.f11136j
            if (r0 != 0) goto L_0x0185
            if (r12 == 0) goto L_0x0185
            int r0 = r1.f9618j
            if (r0 != 0) goto L_0x0185
            if (r8 == 0) goto L_0x0185
            int r0 = r1.f9619k
            if (r0 == 0) goto L_0x017f
            goto L_0x0185
        L_0x017f:
            r0 = -1
            r7 = 0
            r11 = 0
            r14 = 0
            goto L_0x0232
        L_0x0185:
            boolean r0 = r10 instanceof f0.q
            if (r0 == 0) goto L_0x0197
            boolean r0 = r1 instanceof d0.g
            if (r0 == 0) goto L_0x0197
            r0 = r1
            d0.g r0 = (d0.g) r0
            r8 = r10
            f0.q r8 = (f0.q) r8
            r8.h(r0, r6, r11)
            goto L_0x019a
        L_0x0197:
            r10.measure(r6, r11)
        L_0x019a:
            int r0 = r10.getMeasuredWidth()
            int r8 = r10.getMeasuredHeight()
            int r12 = r10.getBaseline()
            if (r9 == 0) goto L_0x01b0
            r9 = 0
            r14[r9] = r0
            r16 = 2
            r14[r16] = r8
            goto L_0x01b7
        L_0x01b0:
            r9 = 0
            r16 = 2
            r14[r9] = r9
            r14[r16] = r9
        L_0x01b7:
            if (r7 == 0) goto L_0x01c1
            r7 = 1
            r14[r7] = r8
            r16 = 3
            r14[r16] = r0
            goto L_0x01c8
        L_0x01c1:
            r7 = 1
            r16 = 3
            r14[r7] = r9
            r14[r16] = r9
        L_0x01c8:
            int r7 = r1.f9621m
            if (r7 <= 0) goto L_0x01d1
            int r7 = java.lang.Math.max(r7, r0)
            goto L_0x01d2
        L_0x01d1:
            r7 = r0
        L_0x01d2:
            int r14 = r1.f9622n
            if (r14 <= 0) goto L_0x01da
            int r7 = java.lang.Math.min(r14, r7)
        L_0x01da:
            int r14 = r1.f9624p
            if (r14 <= 0) goto L_0x01e3
            int r14 = java.lang.Math.max(r14, r8)
            goto L_0x01e4
        L_0x01e3:
            r14 = r8
        L_0x01e4:
            int r9 = r1.f9625q
            if (r9 <= 0) goto L_0x01ec
            int r14 = java.lang.Math.min(r9, r14)
        L_0x01ec:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r15 == 0) goto L_0x01fb
            if (r4 == 0) goto L_0x01fb
            float r3 = r1.f9593L
            float r4 = (float) r14
            float r4 = r4 * r3
            float r4 = r4 + r9
            int r3 = (int) r4
            r7 = r3
            goto L_0x0206
        L_0x01fb:
            if (r5 == 0) goto L_0x0206
            if (r3 == 0) goto L_0x0206
            float r3 = r1.f9593L
            float r4 = (float) r7
            float r4 = r4 / r3
            float r4 = r4 + r9
            int r3 = (int) r4
            r14 = r3
        L_0x0206:
            if (r0 != r7) goto L_0x020e
            if (r8 == r14) goto L_0x020b
            goto L_0x020e
        L_0x020b:
            r11 = r12
            r0 = -1
            goto L_0x0232
        L_0x020e:
            if (r0 == r7) goto L_0x0217
            r0 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r0)
            goto L_0x0219
        L_0x0217:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x0219:
            if (r8 == r14) goto L_0x021f
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
        L_0x021f:
            r10.measure(r6, r11)
            int r11 = r10.getMeasuredWidth()
            int r0 = r10.getMeasuredHeight()
            int r3 = r10.getBaseline()
            r14 = r0
            r7 = r11
            r0 = -1
            r11 = r3
        L_0x0232:
            if (r11 == r0) goto L_0x0236
            r0 = 1
            goto L_0x0237
        L_0x0236:
            r0 = 0
        L_0x0237:
            int r3 = r2.f11131c
            if (r7 != r3) goto L_0x0242
            int r3 = r2.f11132d
            if (r14 == r3) goto L_0x0240
            goto L_0x0242
        L_0x0240:
            r5 = 0
            goto L_0x0243
        L_0x0242:
            r5 = 1
        L_0x0243:
            r2.i = r5
            boolean r3 = r13.f11328X
            if (r3 == 0) goto L_0x024a
            r0 = 1
        L_0x024a:
            if (r0 == 0) goto L_0x0256
            r3 = -1
            if (r11 == r3) goto L_0x0256
            int r1 = r1.f9597P
            if (r1 == r11) goto L_0x0256
            r1 = 1
            r2.i = r1
        L_0x0256:
            r2.e = r7
            r2.f11133f = r14
            r2.f11135h = r0
            r2.f11134g = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T3.a.d(d0.d, e0.b):void");
    }

    public boolean e(int i) {
        boolean z;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        if ((i & -2097152) == -2097152) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (i8 = (i >>> 19) & 3) == 1 || (i9 = (i >>> 17) & 3) == 0 || (i10 = (i >>> 12) & 15) == 0 || i10 == 15 || (i11 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.f4999a = i8;
        this.f5004g = C1332b.f14356s[3 - i9];
        int i14 = C1332b.f14357t[i11];
        this.f5001c = i14;
        int i15 = 2;
        if (i8 == 2) {
            this.f5001c = i14 / 2;
        } else if (i8 == 0) {
            this.f5001c = i14 / 4;
        }
        int i16 = (i >>> 9) & 1;
        int i17 = 1152;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 == 3) {
                    i17 = 384;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else if (i8 != 3) {
            i17 = 576;
        }
        this.f5003f = i17;
        if (i9 == 3) {
            if (i8 == 3) {
                i13 = C1332b.f14358u[i10 - 1];
            } else {
                i13 = C1332b.f14359v[i10 - 1];
            }
            this.e = i13;
            this.f5000b = (((i13 * 12) / this.f5001c) + i16) * 4;
        } else {
            int i18 = 144;
            if (i8 == 3) {
                if (i9 == 2) {
                    i12 = C1332b.f14360w[i10 - 1];
                } else {
                    i12 = C1332b.f14361x[i10 - 1];
                }
                this.e = i12;
                this.f5000b = ((i12 * 144) / this.f5001c) + i16;
            } else {
                int i19 = C1332b.f14362y[i10 - 1];
                this.e = i19;
                if (i9 == 1) {
                    i18 = 72;
                }
                this.f5000b = ((i18 * i19) / this.f5001c) + i16;
            }
        }
        if (((i >> 6) & 3) == 3) {
            i15 = 1;
        }
        this.f5002d = i15;
        return true;
    }

    public a(b bVar) {
        this(bVar, 10, bVar.f4505U / 2, bVar.f4506V / 2);
    }

    public a(ConstraintLayout constraintLayout) {
        this.f5004g = constraintLayout;
    }
}
