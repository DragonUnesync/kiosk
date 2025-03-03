package O1;

import H3.M;
import H3.O;
import H3.i0;
import J1.d;
import M1.a;
import M1.k;
import M1.l;
import N.e;
import N1.f;
import O0.b;
import P0.c;
import P0.r;
import P0.z;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.text.Layout;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.ArrayList;
import java.util.List;

public final class h implements l {

    /* renamed from: b0  reason: collision with root package name */
    public static final byte[] f3592b0 = {0, 7, 8, 15};

    /* renamed from: c0  reason: collision with root package name */
    public static final byte[] f3593c0 = {0, 119, -120, -1};

    /* renamed from: d0  reason: collision with root package name */
    public static final byte[] f3594d0 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: U  reason: collision with root package name */
    public final Paint f3595U;

    /* renamed from: V  reason: collision with root package name */
    public final Paint f3596V;

    /* renamed from: W  reason: collision with root package name */
    public final Canvas f3597W = new Canvas();

    /* renamed from: X  reason: collision with root package name */
    public final b f3598X = new b(719, 575, 0, 719, 0, 575);

    /* renamed from: Y  reason: collision with root package name */
    public final a f3599Y = new a(0, new int[]{0, -1, -16777216, -8421505}, c(), d());

    /* renamed from: Z  reason: collision with root package name */
    public final g f3600Z;

    /* renamed from: a0  reason: collision with root package name */
    public Bitmap f3601a0;

    public h(List list) {
        r rVar = new r((byte[]) list.get(0));
        int B8 = rVar.B();
        int B9 = rVar.B();
        Paint paint = new Paint();
        this.f3595U = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f3596V = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f3600Z = new g(B8, B9);
    }

    public static byte[] b(int i, int i8, f fVar) {
        byte[] bArr = new byte[i];
        for (int i9 = 0; i9 < i; i9++) {
            bArr[i9] = (byte) fVar.i(i8);
        }
        return bArr;
    }

    public static int[] c() {
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i12 = 1; i12 < 16; i12++) {
            if (i12 < 8) {
                if ((i12 & 1) != 0) {
                    i9 = 255;
                } else {
                    i9 = 0;
                }
                if ((i12 & 2) != 0) {
                    i10 = 255;
                } else {
                    i10 = 0;
                }
                if ((i12 & 4) != 0) {
                    i11 = 255;
                } else {
                    i11 = 0;
                }
                iArr[i12] = e(255, i9, i10, i11);
            } else {
                int i13 = 127;
                if ((i12 & 1) != 0) {
                    i = 127;
                } else {
                    i = 0;
                }
                if ((i12 & 2) != 0) {
                    i8 = 127;
                } else {
                    i8 = 0;
                }
                if ((i12 & 4) == 0) {
                    i13 = 0;
                }
                iArr[i12] = e(255, i, i8, i13);
            }
        }
        return iArr;
    }

    public static int[] d() {
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i25 = 0; i25 < 256; i25++) {
            int i26 = 255;
            if (i25 < 8) {
                if ((i25 & 1) != 0) {
                    i23 = 255;
                } else {
                    i23 = 0;
                }
                if ((i25 & 2) != 0) {
                    i24 = 255;
                } else {
                    i24 = 0;
                }
                if ((i25 & 4) == 0) {
                    i26 = 0;
                }
                iArr[i25] = e(63, i23, i24, i26);
            } else {
                int i27 = i25 & 136;
                int i28 = 170;
                int i29 = 85;
                if (i27 == 0) {
                    if ((i25 & 1) != 0) {
                        i = 85;
                    } else {
                        i = 0;
                    }
                    if ((i25 & 16) != 0) {
                        i8 = 170;
                    } else {
                        i8 = 0;
                    }
                    int i30 = i + i8;
                    if ((i25 & 2) != 0) {
                        i9 = 85;
                    } else {
                        i9 = 0;
                    }
                    if ((i25 & 32) != 0) {
                        i10 = 170;
                    } else {
                        i10 = 0;
                    }
                    int i31 = i9 + i10;
                    if ((i25 & 4) == 0) {
                        i29 = 0;
                    }
                    if ((i25 & 64) == 0) {
                        i28 = 0;
                    }
                    iArr[i25] = e(255, i30, i31, i29 + i28);
                } else if (i27 != 8) {
                    int i32 = 43;
                    if (i27 == 128) {
                        if ((i25 & 1) != 0) {
                            i15 = 43;
                        } else {
                            i15 = 0;
                        }
                        int i33 = i15 + 127;
                        if ((i25 & 16) != 0) {
                            i16 = 85;
                        } else {
                            i16 = 0;
                        }
                        int i34 = i33 + i16;
                        if ((i25 & 2) != 0) {
                            i17 = 43;
                        } else {
                            i17 = 0;
                        }
                        int i35 = i17 + 127;
                        if ((i25 & 32) != 0) {
                            i18 = 85;
                        } else {
                            i18 = 0;
                        }
                        int i36 = i35 + i18;
                        if ((i25 & 4) == 0) {
                            i32 = 0;
                        }
                        int i37 = i32 + 127;
                        if ((i25 & 64) == 0) {
                            i29 = 0;
                        }
                        iArr[i25] = e(255, i34, i36, i37 + i29);
                    } else if (i27 == 136) {
                        if ((i25 & 1) != 0) {
                            i19 = 43;
                        } else {
                            i19 = 0;
                        }
                        if ((i25 & 16) != 0) {
                            i20 = 85;
                        } else {
                            i20 = 0;
                        }
                        int i38 = i19 + i20;
                        if ((i25 & 2) != 0) {
                            i21 = 43;
                        } else {
                            i21 = 0;
                        }
                        if ((i25 & 32) != 0) {
                            i22 = 85;
                        } else {
                            i22 = 0;
                        }
                        int i39 = i21 + i22;
                        if ((i25 & 4) == 0) {
                            i32 = 0;
                        }
                        if ((i25 & 64) == 0) {
                            i29 = 0;
                        }
                        iArr[i25] = e(255, i38, i39, i32 + i29);
                    }
                } else {
                    if ((i25 & 1) != 0) {
                        i11 = 85;
                    } else {
                        i11 = 0;
                    }
                    if ((i25 & 16) != 0) {
                        i12 = 170;
                    } else {
                        i12 = 0;
                    }
                    int i40 = i11 + i12;
                    if ((i25 & 2) != 0) {
                        i13 = 85;
                    } else {
                        i13 = 0;
                    }
                    if ((i25 & 32) != 0) {
                        i14 = 170;
                    } else {
                        i14 = 0;
                    }
                    int i41 = i13 + i14;
                    if ((i25 & 4) == 0) {
                        i29 = 0;
                    }
                    if ((i25 & 64) == 0) {
                        i28 = 0;
                    }
                    iArr[i25] = e(127, i40, i41, i29 + i28);
                }
            }
        }
        return iArr;
    }

    public static int e(int i, int i8, int i9, int i10) {
        return (i << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v54, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v67, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v68, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v69, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v70, resolved type: byte} */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v34, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v6, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x021d A[LOOP:3: B:86:0x016c->B:116:0x021d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0144 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0218 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0117 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x014a A[LOOP:2: B:38:0x00aa->B:73:0x014a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void f(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            r0 = r23
            r1 = r25
            r8 = r28
            N1.f r9 = new N1.f
            int r2 = r0.length
            r9.<init>((int) r2, (byte[]) r0)
            r2 = r26
            r10 = r27
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x0013:
            int r3 = r9.b()
            if (r3 == 0) goto L_0x0228
            r14 = 8
            int r3 = r9.i(r14)
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x0222
            r15 = 2
            r7 = 1
            r16 = 0
            r6 = 3
            r5 = 4
            switch(r3) {
                case 16: goto L_0x0152;
                case 17: goto L_0x009a;
                case 18: goto L_0x0041;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r3) {
                case 32: goto L_0x003c;
                case 33: goto L_0x0037;
                case 34: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0013
        L_0x0030:
            r3 = 16
            byte[] r12 = b(r3, r14, r9)
            goto L_0x0013
        L_0x0037:
            byte[] r11 = b(r5, r14, r9)
            goto L_0x0013
        L_0x003c:
            byte[] r13 = b(r5, r5, r9)
            goto L_0x0013
        L_0x0041:
            r15 = r2
            r2 = 0
        L_0x0043:
            int r3 = r9.i(r14)
            if (r3 == 0) goto L_0x004e
            r17 = r2
            r18 = 1
            goto L_0x0074
        L_0x004e:
            boolean r3 = r9.h()
            r4 = 7
            if (r3 != 0) goto L_0x0067
            int r3 = r9.i(r4)
            if (r3 == 0) goto L_0x0061
            r17 = r2
            r18 = r3
            r3 = 0
            goto L_0x0074
        L_0x0061:
            r3 = 0
            r17 = 1
            r18 = 0
            goto L_0x0074
        L_0x0067:
            int r3 = r9.i(r4)
            int r4 = r9.i(r14)
            r17 = r2
            r18 = r3
            r3 = r4
        L_0x0074:
            if (r18 == 0) goto L_0x008e
            if (r8 == 0) goto L_0x008e
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r15
            float r4 = (float) r10
            int r2 = r15 + r18
            float r5 = (float) r2
            int r2 = r10 + 1
            float r6 = (float) r2
            r2 = r29
            r0 = 1
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x008f
        L_0x008e:
            r0 = 1
        L_0x008f:
            int r15 = r15 + r18
            if (r17 == 0) goto L_0x0096
            r2 = r15
            goto L_0x0013
        L_0x0096:
            r2 = r17
            r7 = 1
            goto L_0x0043
        L_0x009a:
            r0 = 1
            if (r1 != r6) goto L_0x00a6
            if (r12 != 0) goto L_0x00a2
            byte[] r3 = f3594d0
            goto L_0x00a3
        L_0x00a2:
            r3 = r12
        L_0x00a3:
            r17 = r3
            goto L_0x00a8
        L_0x00a6:
            r17 = 0
        L_0x00a8:
            r7 = r2
            r2 = 0
        L_0x00aa:
            int r3 = r9.i(r5)
            if (r3 == 0) goto L_0x00b6
            r18 = r2
        L_0x00b2:
            r19 = 1
            goto L_0x0115
        L_0x00b6:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00d0
            int r3 = r9.i(r6)
            if (r3 == 0) goto L_0x00ca
            int r3 = r3 + 2
            r18 = r2
            r19 = r3
            r3 = 0
            goto L_0x0115
        L_0x00ca:
            r3 = 0
            r18 = 1
        L_0x00cd:
            r19 = 0
            goto L_0x0115
        L_0x00d0:
            boolean r3 = r9.h()
            if (r3 != 0) goto L_0x00e5
            int r3 = r9.i(r15)
            int r3 = r3 + r5
            int r4 = r9.i(r5)
        L_0x00df:
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x0115
        L_0x00e5:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x0111
            if (r3 == r0) goto L_0x010b
            if (r3 == r15) goto L_0x0100
            if (r3 == r6) goto L_0x00f5
            r18 = r2
            r3 = 0
            goto L_0x00cd
        L_0x00f5:
            int r3 = r9.i(r14)
            int r3 = r3 + 25
            int r4 = r9.i(r5)
            goto L_0x00df
        L_0x0100:
            int r3 = r9.i(r5)
            int r3 = r3 + 9
            int r4 = r9.i(r5)
            goto L_0x00df
        L_0x010b:
            r18 = r2
            r3 = 0
            r19 = 2
            goto L_0x0115
        L_0x0111:
            r18 = r2
            r3 = 0
            goto L_0x00b2
        L_0x0115:
            if (r19 == 0) goto L_0x013d
            if (r8 == 0) goto L_0x013d
            if (r17 == 0) goto L_0x011d
            byte r3 = r17[r3]
        L_0x011d:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r2 = (float) r2
            int r5 = r10 + 1
            float r5 = (float) r5
            r20 = r2
            r2 = r29
            r22 = r5
            r5 = r20
            r14 = 3
            r6 = r22
            r20 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0140
        L_0x013d:
            r20 = r7
            r14 = 3
        L_0x0140:
            int r7 = r20 + r19
            if (r18 == 0) goto L_0x014a
            r9.c()
        L_0x0147:
            r2 = r7
            goto L_0x0013
        L_0x014a:
            r2 = r18
            r5 = 4
            r6 = 3
            r14 = 8
            goto L_0x00aa
        L_0x0152:
            r0 = 1
            r14 = 3
            if (r1 != r14) goto L_0x015f
            if (r11 != 0) goto L_0x015b
            byte[] r3 = f3593c0
            goto L_0x015c
        L_0x015b:
            r3 = r11
        L_0x015c:
            r17 = r3
            goto L_0x016a
        L_0x015f:
            if (r1 != r15) goto L_0x0168
            if (r13 != 0) goto L_0x0166
            byte[] r3 = f3592b0
            goto L_0x015c
        L_0x0166:
            r3 = r13
            goto L_0x015c
        L_0x0168:
            r17 = 0
        L_0x016a:
            r7 = r2
            r2 = 0
        L_0x016c:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x017b
            r18 = r2
        L_0x0174:
            r5 = 4
            r6 = 8
            r19 = 1
            goto L_0x01e8
        L_0x017b:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x0193
            int r3 = r9.i(r14)
            int r3 = r3 + r14
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            r5 = 4
            r6 = 8
            goto L_0x01e8
        L_0x0193:
            boolean r3 = r9.h()
            if (r3 == 0) goto L_0x019d
            r18 = r2
            r3 = 0
            goto L_0x0174
        L_0x019d:
            int r3 = r9.i(r15)
            if (r3 == 0) goto L_0x01e1
            if (r3 == r0) goto L_0x01d8
            if (r3 == r15) goto L_0x01c5
            if (r3 == r14) goto L_0x01b2
            r18 = r2
            r3 = 0
            r5 = 4
            r6 = 8
        L_0x01af:
            r19 = 0
            goto L_0x01e8
        L_0x01b2:
            r6 = 8
            int r3 = r9.i(r6)
            int r3 = r3 + 29
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            r5 = 4
            goto L_0x01e8
        L_0x01c5:
            r5 = 4
            r6 = 8
            int r3 = r9.i(r5)
            int r3 = r3 + 12
            int r4 = r9.i(r15)
            r18 = r2
            r19 = r3
            r3 = r4
            goto L_0x01e8
        L_0x01d8:
            r5 = 4
            r6 = 8
            r18 = r2
            r3 = 0
            r19 = 2
            goto L_0x01e8
        L_0x01e1:
            r5 = 4
            r6 = 8
            r3 = 0
            r18 = 1
            goto L_0x01af
        L_0x01e8:
            if (r19 == 0) goto L_0x020f
            if (r8 == 0) goto L_0x020f
            if (r17 == 0) goto L_0x01f0
            byte r3 = r17[r3]
        L_0x01f0:
            r2 = r24[r3]
            r8.setColor(r2)
            float r3 = (float) r7
            float r4 = (float) r10
            int r2 = r7 + r19
            float r2 = (float) r2
            int r0 = r10 + 1
            float r0 = (float) r0
            r21 = r2
            r2 = r29
            r22 = 4
            r5 = r21
            r21 = 8
            r6 = r0
            r0 = r7
            r7 = r28
            r2.drawRect(r3, r4, r5, r6, r7)
            goto L_0x0214
        L_0x020f:
            r0 = r7
            r21 = 8
            r22 = 4
        L_0x0214:
            int r7 = r0 + r19
            if (r18 == 0) goto L_0x021d
            r9.c()
            goto L_0x0147
        L_0x021d:
            r2 = r18
            r0 = 1
            goto L_0x016c
        L_0x0222:
            int r10 = r10 + 2
            r2 = r26
            goto L_0x0013
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O1.h.f(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a g(f fVar, int i) {
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        f fVar2 = fVar;
        int i13 = 8;
        int i14 = fVar2.i(8);
        fVar2.u(8);
        int i15 = 2;
        int i16 = i - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] c8 = c();
        int[] d8 = d();
        while (i16 > 0) {
            int i17 = fVar2.i(i13);
            int i18 = fVar2.i(i13);
            if ((i18 & 128) != 0) {
                iArr = iArr2;
            } else if ((i18 & 64) != 0) {
                iArr = c8;
            } else {
                iArr = d8;
            }
            if ((i18 & 1) != 0) {
                i11 = fVar2.i(i13);
                i10 = fVar2.i(i13);
                i9 = fVar2.i(i13);
                i8 = fVar2.i(i13);
                i12 = i16 - 6;
            } else {
                i9 = fVar2.i(4) << 4;
                i12 = i16 - 4;
                int i19 = fVar2.i(4) << 4;
                i8 = fVar2.i(i15) << 6;
                i11 = fVar2.i(6) << i15;
                i10 = i19;
            }
            if (i11 == 0) {
                i10 = 0;
                i9 = 0;
                i8 = 255;
            }
            double d9 = (double) i11;
            double d10 = (double) (i10 - 128);
            double d11 = (double) (i9 - 128);
            iArr[i17] = e((byte) (255 - (i8 & 255)), z.i((int) ((1.402d * d10) + d9), 0, 255), z.i((int) ((d9 - (0.34414d * d11)) - (d10 * 0.71414d)), 0, 255), z.i((int) ((d11 * 1.772d) + d9), 0, 255));
            i16 = i12;
            i14 = i14;
            d8 = d8;
            i13 = 8;
            i15 = 2;
        }
        return new a(i14, iArr2, c8, d8);
    }

    public static c h(f fVar) {
        byte[] bArr;
        int i = fVar.i(16);
        fVar.u(4);
        int i8 = fVar.i(2);
        boolean h5 = fVar.h();
        fVar.u(1);
        byte[] bArr2 = z.f3752f;
        if (i8 == 1) {
            fVar.u(fVar.i(8) * 16);
        } else if (i8 == 0) {
            int i9 = fVar.i(16);
            int i10 = fVar.i(16);
            if (i9 > 0) {
                bArr2 = new byte[i9];
                fVar.l(i9, bArr2);
            }
            if (i10 > 0) {
                bArr = new byte[i10];
                fVar.l(i10, bArr);
                return new c(i, h5, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(i, h5, bArr2, bArr);
    }

    public final void D(byte[] bArr, int i, int i8, k kVar, c cVar) {
        g gVar;
        a aVar;
        int i9;
        int i10;
        b bVar;
        ArrayList arrayList;
        int i11;
        g gVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        e eVar;
        Paint paint;
        int[] iArr;
        e eVar2;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21 = i;
        int i22 = 8;
        f fVar = new f(i21 + i8, bArr);
        fVar.r(i21);
        while (true) {
            int b8 = fVar.b();
            gVar = this.f3600Z;
            if (b8 < 48 || fVar.i(i22) != 15) {
                d dVar = gVar.i;
            } else {
                int i23 = fVar.i(i22);
                int i24 = 16;
                int i25 = fVar.i(16);
                int i26 = fVar.i(16);
                int f8 = fVar.f() + i26;
                if (i26 * 8 > fVar.b()) {
                    P0.l.B("DvbParser", "Data field length exceeds limit");
                    fVar.u(fVar.b());
                } else {
                    switch (i23) {
                        case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                            if (i25 == gVar.f3585a) {
                                d dVar2 = gVar.i;
                                fVar.i(i22);
                                int i27 = fVar.i(4);
                                int i28 = fVar.i(2);
                                fVar.u(2);
                                int i29 = i26 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i29 > 0) {
                                    int i30 = fVar.i(i22);
                                    fVar.u(i22);
                                    i29 -= 6;
                                    sparseArray.put(i30, new d(fVar.i(16), fVar.i(16)));
                                    i22 = 8;
                                }
                                d dVar3 = new d(i27, i28, sparseArray);
                                if (i28 == 0) {
                                    if (!(dVar2 == null || dVar2.f2351U == i27)) {
                                        gVar.i = dVar3;
                                        break;
                                    }
                                } else {
                                    gVar.i = dVar3;
                                    gVar.f3587c.clear();
                                    gVar.f3588d.clear();
                                    gVar.e.clear();
                                    break;
                                }
                            }
                            break;
                        case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                            d dVar4 = gVar.i;
                            if (i25 == gVar.f3585a && dVar4 != null) {
                                int i31 = fVar.i(i22);
                                fVar.u(4);
                                boolean h5 = fVar.h();
                                fVar.u(3);
                                int i32 = fVar.i(16);
                                int i33 = fVar.i(16);
                                fVar.i(3);
                                int i34 = fVar.i(3);
                                fVar.u(2);
                                int i35 = fVar.i(i22);
                                int i36 = fVar.i(i22);
                                int i37 = fVar.i(4);
                                int i38 = fVar.i(2);
                                fVar.u(2);
                                int i39 = i26 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i39 > 0) {
                                    int i40 = fVar.i(i24);
                                    int i41 = fVar.i(2);
                                    fVar.i(2);
                                    int i42 = fVar.i(12);
                                    fVar.u(4);
                                    int i43 = fVar.i(12);
                                    int i44 = i39 - 6;
                                    if (i41 == 1 || i41 == 2) {
                                        fVar.i(i22);
                                        fVar.i(i22);
                                        i39 -= 8;
                                    } else {
                                        i39 = i44;
                                    }
                                    sparseArray2.put(i40, new f(i42, i43));
                                    i24 = 16;
                                }
                                e eVar3 = new e(i31, h5, i32, i33, i34, i35, i36, i37, i38, sparseArray2);
                                SparseArray sparseArray3 = gVar.f3587c;
                                if (dVar4.f2352V == 0 && (eVar2 = (e) sparseArray3.get(i31)) != null) {
                                    int i45 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = eVar2.f3582j;
                                        if (i45 < sparseArray4.size()) {
                                            eVar3.f3582j.put(sparseArray4.keyAt(i45), (f) sparseArray4.valueAt(i45));
                                            i45++;
                                        }
                                    }
                                }
                                sparseArray3.put(eVar3.f3575a, eVar3);
                                break;
                            }
                        case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                            if (i25 != gVar.f3585a) {
                                if (i25 == gVar.f3586b) {
                                    a g8 = g(fVar, i26);
                                    gVar.f3589f.put(g8.f3560a, g8);
                                    break;
                                }
                            } else {
                                a g9 = g(fVar, i26);
                                gVar.f3588d.put(g9.f3560a, g9);
                                break;
                            }
                            break;
                        case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                            if (i25 != gVar.f3585a) {
                                if (i25 == gVar.f3586b) {
                                    c h8 = h(fVar);
                                    gVar.f3590g.put(h8.f3569a, h8);
                                    break;
                                }
                            } else {
                                c h9 = h(fVar);
                                gVar.e.put(h9.f3569a, h9);
                                break;
                            }
                            break;
                        case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                            if (i25 == gVar.f3585a) {
                                fVar.u(4);
                                boolean h10 = fVar.h();
                                fVar.u(3);
                                int i46 = fVar.i(16);
                                int i47 = fVar.i(16);
                                if (h10) {
                                    int i48 = fVar.i(16);
                                    int i49 = fVar.i(16);
                                    int i50 = fVar.i(16);
                                    i19 = i49;
                                    i17 = fVar.i(16);
                                    i18 = i50;
                                    i20 = i48;
                                } else {
                                    i19 = i46;
                                    i17 = i47;
                                    i20 = 0;
                                    i18 = 0;
                                }
                                gVar.f3591h = new b(i46, i47, i20, i19, i18, i17);
                                break;
                            }
                            break;
                    }
                    fVar.v(f8 - fVar.f());
                }
                i22 = 8;
            }
        }
        d dVar5 = gVar.i;
        if (dVar5 == null) {
            M m8 = O.f2026V;
            aVar = new a(i0.f2073Y, -9223372036854775807L, -9223372036854775807L);
        } else {
            b bVar2 = gVar.f3591h;
            if (bVar2 == null) {
                bVar2 = this.f3598X;
            }
            Bitmap bitmap = this.f3601a0;
            Canvas canvas = this.f3597W;
            if (!(bitmap != null && bVar2.f3564a + 1 == bitmap.getWidth() && bVar2.f3565b + 1 == this.f3601a0.getHeight())) {
                Bitmap createBitmap = Bitmap.createBitmap(bVar2.f3564a + 1, bVar2.f3565b + 1, Bitmap.Config.ARGB_8888);
                this.f3601a0 = createBitmap;
                canvas.setBitmap(createBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            int i51 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) dVar5.f2353W;
                if (i51 < sparseArray5.size()) {
                    canvas.save();
                    d dVar6 = (d) sparseArray5.valueAt(i51);
                    e eVar4 = (e) gVar.f3587c.get(sparseArray5.keyAt(i51));
                    int i52 = dVar6.f3573a + bVar2.f3566c;
                    int i53 = dVar6.f3574b + bVar2.e;
                    int min = Math.min(eVar4.f3577c + i52, bVar2.f3567d);
                    int i54 = eVar4.f3578d;
                    int i55 = i53 + i54;
                    canvas.clipRect(i52, i53, min, Math.min(i55, bVar2.f3568f));
                    SparseArray sparseArray6 = gVar.f3588d;
                    int i56 = eVar4.f3579f;
                    a aVar2 = (a) sparseArray6.get(i56);
                    if (aVar2 == null && (aVar2 = (a) gVar.f3589f.get(i56)) == null) {
                        aVar2 = this.f3599Y;
                    }
                    int i57 = 0;
                    while (true) {
                        SparseArray sparseArray7 = eVar4.f3582j;
                        if (i57 < sparseArray7.size()) {
                            int keyAt = sparseArray7.keyAt(i57);
                            f fVar2 = (f) sparseArray7.valueAt(i57);
                            d dVar7 = dVar5;
                            c cVar2 = (c) gVar.e.get(keyAt);
                            if (cVar2 == null) {
                                cVar2 = (c) gVar.f3590g.get(keyAt);
                            }
                            if (cVar2 != null) {
                                if (cVar2.f3570b) {
                                    paint = null;
                                } else {
                                    paint = this.f3595U;
                                }
                                gVar2 = gVar;
                                int i58 = fVar2.f3583a + i52;
                                int i59 = fVar2.f3584b + i53;
                                i11 = i51;
                                int i60 = eVar4.e;
                                int i61 = i57;
                                if (i60 == 3) {
                                    iArr = aVar2.f3563d;
                                } else if (i60 == 2) {
                                    iArr = aVar2.f3562c;
                                } else {
                                    iArr = aVar2.f3561b;
                                }
                                i12 = i61;
                                arrayList = arrayList2;
                                int i62 = i55;
                                int[] iArr2 = iArr;
                                bVar = bVar2;
                                int i63 = i54;
                                int i64 = i60;
                                i14 = i63;
                                int i65 = i53;
                                int i66 = i58;
                                i13 = i62;
                                i16 = i52;
                                i15 = i65;
                                eVar = eVar4;
                                Paint paint2 = paint;
                                Canvas canvas2 = canvas;
                                f(cVar2.f3571c, iArr2, i64, i66, i59, paint2, canvas2);
                                f(cVar2.f3572d, iArr2, i64, i66, i59 + 1, paint2, canvas2);
                            } else {
                                bVar = bVar2;
                                arrayList = arrayList2;
                                i11 = i51;
                                gVar2 = gVar;
                                i12 = i57;
                                i13 = i55;
                                i14 = i54;
                                i15 = i53;
                                i16 = i52;
                                eVar = eVar4;
                            }
                            i57 = i12 + 1;
                            eVar4 = eVar;
                            i52 = i16;
                            dVar5 = dVar7;
                            gVar = gVar2;
                            i51 = i11;
                            bVar2 = bVar;
                            i54 = i14;
                            i55 = i13;
                            i53 = i15;
                            arrayList2 = arrayList;
                        } else {
                            d dVar8 = dVar5;
                            b bVar3 = bVar2;
                            ArrayList arrayList3 = arrayList2;
                            int i67 = i51;
                            g gVar3 = gVar;
                            int i68 = i55;
                            int i69 = i54;
                            int i70 = i53;
                            int i71 = i52;
                            e eVar5 = eVar4;
                            boolean z = eVar5.f3576b;
                            int i72 = eVar5.f3577c;
                            if (z) {
                                int i73 = eVar5.e;
                                if (i73 == 3) {
                                    i10 = aVar2.f3563d[eVar5.f3580g];
                                } else if (i73 == 2) {
                                    i10 = aVar2.f3562c[eVar5.f3581h];
                                } else {
                                    i10 = aVar2.f3561b[eVar5.i];
                                }
                                Paint paint3 = this.f3596V;
                                paint3.setColor(i10);
                                i9 = i70;
                                canvas.drawRect((float) i71, (float) i9, (float) (i71 + i72), (float) i68, paint3);
                            } else {
                                i9 = i70;
                            }
                            int i74 = i69;
                            Bitmap createBitmap2 = Bitmap.createBitmap(this.f3601a0, i71, i9, i72, i74);
                            float f9 = (float) i71;
                            b bVar4 = bVar3;
                            float f10 = (float) bVar4.f3564a;
                            float f11 = f9 / f10;
                            float f12 = (float) bVar4.f3565b;
                            ArrayList arrayList4 = arrayList3;
                            arrayList4.add(new b((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, createBitmap2, ((float) i9) / f12, 0, 0, f11, 0, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, ((float) i72) / f10, ((float) i74) / f12, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f));
                            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas.restore();
                            i51 = i67 + 1;
                            dVar5 = dVar8;
                            gVar = gVar3;
                            b bVar5 = bVar4;
                            arrayList2 = arrayList4;
                            bVar2 = bVar5;
                        }
                    }
                } else {
                    aVar = new a(arrayList2, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        cVar.accept(aVar);
    }

    public final void a() {
        g gVar = this.f3600Z;
        gVar.f3587c.clear();
        gVar.f3588d.clear();
        gVar.e.clear();
        gVar.f3589f.clear();
        gVar.f3590g.clear();
        gVar.f3591h = null;
        gVar.i = null;
    }

    public final /* synthetic */ M1.d o(byte[] bArr, int i, int i8) {
        return e.o(this, bArr, i8);
    }

    public final int y() {
        return 2;
    }
}
