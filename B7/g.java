package B7;

import B.e0;
import B.t0;
import C3.F;
import D7.b;
import G3.d;
import I7.a;
import J7.c;
import M0.O;
import O6.l;
import P0.h;
import P6.f;
import T0.C0220l;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.view.PreviewView;
import com.samsung.android.knox.EnterpriseDeviceManager;
import j$.io.FileRetargetClass;
import j$.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.NoSuchFileException;
import r7.r;

public final /* synthetic */ class g implements l, F, e0, d, a, h {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f474U;

    public /* synthetic */ g(int i) {
        this.f474U = i;
    }

    public void C(t0 t0Var) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(t0Var.f307b.getWidth(), t0Var.f307b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        t0Var.a(surface, b.l(), new H.d(surface, 0, surfaceTexture));
    }

    public Object a(Object obj) {
        r rVar = (r) obj;
        switch (this.f474U) {
            case 0:
                f.e(rVar, "it");
                return rVar.f15067a.getClass().getName();
            default:
                f.e(rVar, "it");
                i iVar = rVar.f15068b;
                f.e(iVar, "<this>");
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                iVar.printStackTrace(printWriter);
                printWriter.flush();
                String stringWriter2 = stringWriter.toString();
                f.d(stringWriter2, "toString(...)");
                return stringWriter2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02c3  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x031a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r35) {
        /*
            r34 = this;
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = r34
            int r7 = r6.f474U
            switch(r7) {
                case 9: goto L_0x0386;
                case 10: goto L_0x000b;
                case 11: goto L_0x0369;
                case 12: goto L_0x018d;
                case 13: goto L_0x002b;
                case 14: goto L_0x0015;
                default: goto L_0x000b;
            }
        L_0x000b:
            U0.d r0 = new U0.d
            r1 = r35
            P0.t r1 = (P0.t) r1
            r0.<init>(r1)
            return r0
        L_0x0015:
            r0 = r35
            M1.a r0 = (M1.a) r0
            long r0 = r0.f3065b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0026
            r0 = 0
        L_0x0026:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L_0x002b:
            r7 = r35
            O0.b r7 = (O0.b) r7
            r7.getClass()
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.CharSequence r9 = r7.f3528a
            if (r9 == 0) goto L_0x0108
            java.lang.String r10 = O0.b.f3520r
            r8.putCharSequence(r10, r9)
            boolean r10 = r9 instanceof android.text.Spanned
            if (r10 == 0) goto L_0x0108
            android.text.Spanned r9 = (android.text.Spanned) r9
            java.lang.String r10 = O0.d.f3545a
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r11 = r9.length()
            java.lang.Class<O0.g> r12 = O0.g.class
            java.lang.Object[] r11 = r9.getSpans(r4, r11, r12)
            O0.g[] r11 = (O0.g[]) r11
            int r12 = r11.length
            r13 = 0
        L_0x005b:
            if (r13 >= r12) goto L_0x007e
            r14 = r11[r13]
            r14.getClass()
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            java.lang.String r0 = O0.g.f3549c
            java.lang.String r1 = r14.f3551a
            r15.putString(r0, r1)
            java.lang.String r0 = O0.g.f3550d
            int r1 = r14.f3552b
            r15.putInt(r0, r1)
            android.os.Bundle r0 = O0.d.a(r9, r14, r5, r15)
            r10.add(r0)
            int r13 = r13 + r5
            goto L_0x005b
        L_0x007e:
            int r0 = r9.length()
            java.lang.Class<O0.h> r1 = O0.h.class
            java.lang.Object[] r0 = r9.getSpans(r4, r0, r1)
            O0.h[] r0 = (O0.h[]) r0
            int r1 = r0.length
            r11 = 0
        L_0x008c:
            if (r11 >= r1) goto L_0x00b6
            r12 = r0[r11]
            r12.getClass()
            android.os.Bundle r13 = new android.os.Bundle
            r13.<init>()
            java.lang.String r14 = O0.h.f3553d
            int r15 = r12.f3555a
            r13.putInt(r14, r15)
            java.lang.String r14 = O0.h.e
            int r15 = r12.f3556b
            r13.putInt(r14, r15)
            java.lang.String r14 = O0.h.f3554f
            int r15 = r12.f3557c
            r13.putInt(r14, r15)
            android.os.Bundle r12 = O0.d.a(r9, r12, r3, r13)
            r10.add(r12)
            int r11 = r11 + r5
            goto L_0x008c
        L_0x00b6:
            int r0 = r9.length()
            java.lang.Class<O0.e> r1 = O0.e.class
            java.lang.Object[] r0 = r9.getSpans(r4, r0, r1)
            O0.e[] r0 = (O0.e[]) r0
            int r1 = r0.length
            r3 = 0
        L_0x00c4:
            if (r3 >= r1) goto L_0x00d2
            r11 = r0[r3]
            r12 = 0
            android.os.Bundle r11 = O0.d.a(r9, r11, r2, r12)
            r10.add(r11)
            int r3 = r3 + r5
            goto L_0x00c4
        L_0x00d2:
            int r0 = r9.length()
            java.lang.Class<O0.i> r1 = O0.i.class
            java.lang.Object[] r0 = r9.getSpans(r4, r0, r1)
            O0.i[] r0 = (O0.i[]) r0
            int r1 = r0.length
            r2 = 0
        L_0x00e0:
            if (r2 >= r1) goto L_0x00fd
            r3 = r0[r2]
            r3.getClass()
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r12 = O0.i.f3558b
            java.lang.String r13 = r3.f3559a
            r11.putString(r12, r13)
            r12 = 4
            android.os.Bundle r3 = O0.d.a(r9, r3, r12, r11)
            r10.add(r3)
            int r2 = r2 + r5
            goto L_0x00e0
        L_0x00fd:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x0108
            java.lang.String r0 = O0.b.f3521s
            r8.putParcelableArrayList(r0, r10)
        L_0x0108:
            java.lang.String r0 = O0.b.f3522t
            android.text.Layout$Alignment r1 = r7.f3529b
            r8.putSerializable(r0, r1)
            java.lang.String r0 = O0.b.f3523u
            android.text.Layout$Alignment r1 = r7.f3530c
            r8.putSerializable(r0, r1)
            java.lang.String r0 = O0.b.f3526x
            float r1 = r7.e
            r8.putFloat(r0, r1)
            java.lang.String r0 = O0.b.f3527y
            int r1 = r7.f3532f
            r8.putInt(r0, r1)
            java.lang.String r0 = O0.b.z
            int r1 = r7.f3533g
            r8.putInt(r0, r1)
            java.lang.String r0 = O0.b.f3510A
            float r1 = r7.f3534h
            r8.putFloat(r0, r1)
            java.lang.String r0 = O0.b.f3511B
            int r1 = r7.i
            r8.putInt(r0, r1)
            java.lang.String r0 = O0.b.f3512C
            int r1 = r7.f3539n
            r8.putInt(r0, r1)
            java.lang.String r0 = O0.b.f3513D
            float r1 = r7.f3540o
            r8.putFloat(r0, r1)
            java.lang.String r0 = O0.b.f3514E
            float r1 = r7.f3535j
            r8.putFloat(r0, r1)
            java.lang.String r0 = O0.b.f3515F
            float r1 = r7.f3536k
            r8.putFloat(r0, r1)
            java.lang.String r0 = O0.b.f3517H
            boolean r1 = r7.f3537l
            r8.putBoolean(r0, r1)
            java.lang.String r0 = O0.b.f3516G
            int r1 = r7.f3538m
            r8.putInt(r0, r1)
            java.lang.String r0 = O0.b.f3518I
            int r1 = r7.f3541p
            r8.putInt(r0, r1)
            java.lang.String r0 = O0.b.f3519J
            float r1 = r7.f3542q
            r8.putFloat(r0, r1)
            android.graphics.Bitmap r0 = r7.f3531d
            if (r0 == 0) goto L_0x018c
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            boolean r0 = r0.compress(r2, r4, r1)
            P0.l.j(r0)
            java.lang.String r0 = O0.b.f3525w
            byte[] r1 = r1.toByteArray()
            r8.putByteArray(r0, r1)
        L_0x018c:
            return r8
        L_0x018d:
            r12 = 0
            r0 = r35
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = O0.b.f3520r
            java.lang.CharSequence r1 = r0.getCharSequence(r1)
            if (r1 == 0) goto L_0x023f
            java.lang.String r7 = O0.b.f3521s
            java.util.ArrayList r7 = r0.getParcelableArrayList(r7)
            if (r7 == 0) goto L_0x023c
            android.text.SpannableString r1 = android.text.SpannableString.valueOf(r1)
            java.util.Iterator r7 = r7.iterator()
        L_0x01aa:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x023c
            java.lang.Object r8 = r7.next()
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.String r9 = O0.d.f3545a
            int r9 = r8.getInt(r9)
            java.lang.String r10 = O0.d.f3546b
            int r10 = r8.getInt(r10)
            java.lang.String r11 = O0.d.f3547c
            int r11 = r8.getInt(r11)
            java.lang.String r13 = O0.d.f3548d
            r14 = -1
            int r13 = r8.getInt(r13, r14)
            java.lang.String r14 = O0.d.e
            android.os.Bundle r8 = r8.getBundle(r14)
            if (r13 == r5) goto L_0x021d
            if (r13 == r3) goto L_0x01fe
            if (r13 == r2) goto L_0x01f4
            r14 = 4
            if (r13 == r14) goto L_0x01df
            goto L_0x0238
        L_0x01df:
            r8.getClass()
            O0.i r13 = new O0.i
            java.lang.String r15 = O0.i.f3558b
            java.lang.String r8 = r8.getString(r15)
            r8.getClass()
            r13.<init>(r8)
            r1.setSpan(r13, r9, r10, r11)
            goto L_0x0238
        L_0x01f4:
            r14 = 4
            O0.e r8 = new O0.e
            r8.<init>()
            r1.setSpan(r8, r9, r10, r11)
            goto L_0x0238
        L_0x01fe:
            r14 = 4
            r8.getClass()
            O0.h r13 = new O0.h
            java.lang.String r15 = O0.h.f3553d
            int r15 = r8.getInt(r15)
            java.lang.String r2 = O0.h.e
            int r2 = r8.getInt(r2)
            java.lang.String r3 = O0.h.f3554f
            int r3 = r8.getInt(r3)
            r13.<init>(r15, r2, r3)
            r1.setSpan(r13, r9, r10, r11)
            goto L_0x0238
        L_0x021d:
            r14 = 4
            r8.getClass()
            O0.g r2 = new O0.g
            java.lang.String r3 = O0.g.f3549c
            java.lang.String r3 = r8.getString(r3)
            r3.getClass()
            java.lang.String r13 = O0.g.f3550d
            int r8 = r8.getInt(r13)
            r2.<init>(r3, r8)
            r1.setSpan(r2, r9, r10, r11)
        L_0x0238:
            r2 = 3
            r3 = 2
            goto L_0x01aa
        L_0x023c:
            r17 = r1
            goto L_0x0241
        L_0x023f:
            r17 = r12
        L_0x0241:
            java.lang.String r1 = O0.b.f3522t
            java.io.Serializable r1 = r0.getSerializable(r1)
            android.text.Layout$Alignment r1 = (android.text.Layout.Alignment) r1
            if (r1 == 0) goto L_0x024e
            r18 = r1
            goto L_0x0250
        L_0x024e:
            r18 = r12
        L_0x0250:
            java.lang.String r1 = O0.b.f3523u
            java.io.Serializable r1 = r0.getSerializable(r1)
            android.text.Layout$Alignment r1 = (android.text.Layout.Alignment) r1
            if (r1 == 0) goto L_0x025d
            r19 = r1
            goto L_0x025f
        L_0x025d:
            r19 = r12
        L_0x025f:
            java.lang.String r1 = O0.b.f3524v
            android.os.Parcelable r1 = r0.getParcelable(r1)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L_0x026c
        L_0x0269:
            r20 = r1
            goto L_0x027c
        L_0x026c:
            java.lang.String r1 = O0.b.f3525w
            byte[] r1 = r0.getByteArray(r1)
            if (r1 == 0) goto L_0x027a
            int r2 = r1.length
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r4, r2)
            goto L_0x0269
        L_0x027a:
            r20 = r12
        L_0x027c:
            java.lang.String r1 = O0.b.f3526x
            boolean r2 = r0.containsKey(r1)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x029e
            java.lang.String r2 = O0.b.f3527y
            boolean r8 = r0.containsKey(r2)
            if (r8 == 0) goto L_0x029e
            float r1 = r0.getFloat(r1)
            int r2 = r0.getInt(r2)
            r21 = r1
            r22 = r2
            goto L_0x02a3
        L_0x029e:
            r21 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x02a3:
            java.lang.String r1 = O0.b.z
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x02b2
            int r1 = r0.getInt(r1)
            r23 = r1
            goto L_0x02b4
        L_0x02b2:
            r23 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x02b4:
            java.lang.String r1 = O0.b.f3510A
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x02c3
            float r1 = r0.getFloat(r1)
            r24 = r1
            goto L_0x02c6
        L_0x02c3:
            r24 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x02c6:
            java.lang.String r1 = O0.b.f3511B
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x02d5
            int r1 = r0.getInt(r1)
            r25 = r1
            goto L_0x02d7
        L_0x02d5:
            r25 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x02d7:
            java.lang.String r1 = O0.b.f3513D
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x02f4
            java.lang.String r2 = O0.b.f3512C
            boolean r8 = r0.containsKey(r2)
            if (r8 == 0) goto L_0x02f4
            float r1 = r0.getFloat(r1)
            int r2 = r0.getInt(r2)
            r27 = r1
            r26 = r2
            goto L_0x02f9
        L_0x02f4:
            r26 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x02f9:
            java.lang.String r1 = O0.b.f3514E
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x0308
            float r1 = r0.getFloat(r1)
            r28 = r1
            goto L_0x030b
        L_0x0308:
            r28 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x030b:
            java.lang.String r1 = O0.b.f3515F
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x031a
            float r1 = r0.getFloat(r1)
            r29 = r1
            goto L_0x031d
        L_0x031a:
            r29 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x031d:
            java.lang.String r1 = O0.b.f3516G
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x032c
            int r1 = r0.getInt(r1)
            r31 = r1
            goto L_0x0331
        L_0x032c:
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = 0
            r31 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L_0x0331:
            java.lang.String r1 = O0.b.f3517H
            boolean r1 = r0.getBoolean(r1, r4)
            if (r1 != 0) goto L_0x033c
            r30 = 0
            goto L_0x033e
        L_0x033c:
            r30 = r5
        L_0x033e:
            java.lang.String r1 = O0.b.f3518I
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x034d
            int r1 = r0.getInt(r1)
            r32 = r1
            goto L_0x034f
        L_0x034d:
            r32 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x034f:
            java.lang.String r1 = O0.b.f3519J
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x035e
            float r0 = r0.getFloat(r1)
            r33 = r0
            goto L_0x0361
        L_0x035e:
            r0 = 0
            r33 = 0
        L_0x0361:
            O0.b r0 = new O0.b
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            return r0
        L_0x0369:
            r0 = r35
            M0.t r0 = (M0.C0131t) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r0.f3048a
            r1.append(r2)
            java.lang.String r2 = ": "
            r1.append(r2)
            java.lang.String r0 = r0.f3049b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0386:
            r0 = r35
            J1.r r0 = (J1.r) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B7.g.apply(java.lang.Object):java.lang.Object");
    }

    public void b(Object obj) {
        switch (this.f474U) {
            case 5:
                File file = (File) obj;
                Objects.requireNonNull(file, "file");
                try {
                    G7.b a8 = G7.f.a(FileRetargetClass.toPath(file), G7.f.f1755a, G7.g.f1757U);
                    if (a8.f1746c.f1743a < 1 && a8.f1745b.f1743a < 1) {
                        throw new FileNotFoundException("File does not exist: " + file);
                    }
                    return;
                } catch (NoSuchFileException e) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Cannot delete file: " + file);
                    fileNotFoundException.initCause(e);
                    throw fileNotFoundException;
                } catch (IOException e8) {
                    throw new IOException("Cannot delete file: " + file, e8);
                }
            default:
                c cVar = (c) obj;
                throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", new Object[]{Integer.MAX_VALUE}));
        }
    }

    public Object c(c cVar) {
        return J7.a.f2520U;
    }

    public /* synthetic */ g(PreviewView previewView) {
        this.f474U = 19;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m0a(Object obj) {
        switch (this.f474U) {
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                ((O) obj).v(new C0220l(2, new C6.b("Player release timed out.", 4), 1003));
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                ((O) obj).j();
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                ((U0.h) obj).getClass();
                return;
            case 21:
                ((U0.h) obj).getClass();
                return;
            case 22:
                ((U0.h) obj).getClass();
                return;
            case 23:
                ((U0.h) obj).getClass();
                return;
            case 24:
                ((U0.h) obj).getClass();
                return;
            case 25:
                ((U0.h) obj).getClass();
                return;
            case 26:
                ((U0.h) obj).getClass();
                return;
            case 27:
                ((U0.h) obj).getClass();
                return;
            case 28:
                ((U0.h) obj).getClass();
                return;
            default:
                ((U0.h) obj).getClass();
                return;
        }
    }
}
