package R2;

import B.C0009j;
import B.C0020v;
import B.q0;
import E7.e;
import F.h;
import M.m;
import M0.C0120h;
import M0.C0129q;
import M0.I;
import M1.d;
import M1.l;
import P0.w;
import P0.z;
import P6.f;
import Q0.g;
import S0.b;
import S7.p;
import U.t;
import U3.a;
import U7.q;
import V1.C;
import V1.D;
import V1.E;
import V1.y;
import a1.C0410a;
import a1.r;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import androidx.emoji2.text.n;
import androidx.emoji2.text.u;
import androidx.emoji2.text.v;
import androidx.fragment.app.C0470v;
import androidx.fragment.app.L;
import androidx.recyclerview.widget.O;
import androidx.recyclerview.widget.Q;
import c1.C0610b;
import c1.C0611c;
import c1.j;
import c1.k;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.C0767r3;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.K2;
import de.ozerov.fully.P;
import h.C1022j;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import n1.C1239d;
import p1.C1332b;
import p1.C1338h;
import p1.G;
import p1.i;

public final class c implements q, G.c, l, i, C, r, n, j, k {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f4335U;

    /* renamed from: V  reason: collision with root package name */
    public Object f4336V;

    /* renamed from: W  reason: collision with root package name */
    public Object f4337W;

    public /* synthetic */ c(char c8, int i) {
        this.f4335U = i;
    }

    public static int g0(int i, int i8) {
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            i9++;
            if (i9 == i8) {
                i10++;
                i9 = 0;
            } else if (i9 > i8) {
                i10++;
                i9 = 1;
            }
        }
        if (i9 + 1 > i8) {
            return i10 + 1;
        }
        return i10;
    }

    private final synchronized void j0() {
        C0767r3 r3Var = (C0767r3) this.f4337W;
        if (r3Var != null) {
            r3Var.e();
        }
    }

    private final synchronized void k0() {
        C0767r3 r3Var = (C0767r3) this.f4337W;
        if (r3Var != null) {
            r3Var.e();
        }
    }

    public static M3.n q0(M3.n nVar, float f8, float f9) {
        float f10;
        float f11;
        float f12 = nVar.f3164a;
        if (f12 < f8) {
            f10 = f12 - 1.0f;
        } else {
            f10 = f12 + 1.0f;
        }
        float f13 = nVar.f3165b;
        if (f13 < f9) {
            f11 = f13 - 1.0f;
        } else {
            f11 = f13 + 1.0f;
        }
        return new M3.n(f10, f11);
    }

    public static M3.n y0(M3.n nVar, M3.n nVar2, int i) {
        float f8 = nVar2.f3164a;
        float f9 = nVar.f3164a;
        float f10 = (float) (i + 1);
        float f11 = nVar2.f3165b;
        float f12 = nVar.f3165b;
        return new M3.n(f9 + ((f8 - f9) / f10), f12 + ((f11 - f12) / f10));
    }

    public void A(int i, long j7) {
        ((MediaCodec) this.f4336V).releaseOutputBuffer(i, j7);
    }

    public int B() {
        return ((MediaCodec) this.f4336V).dequeueInputBuffer(0);
    }

    public void C() {
        byte[] bArr = z.f3752f;
        P0.r rVar = (P0.r) this.f4337W;
        rVar.getClass();
        rVar.F(bArr.length, bArr);
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r10v3, types: [U1.c, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v41 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        if (")".equals(U1.b.b(r8, r11)) == false) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void D(byte[] r20, int r21, int r22, M1.k r23, P0.c r24) {
        /*
            r19 = this;
            r1 = r19
            r0 = r21
            r2 = 2
            r3 = 0
            r4 = -1
            r5 = 1
            int r6 = r0 + r22
            java.lang.Object r7 = r1.f4336V
            P0.r r7 = (P0.r) r7
            r8 = r20
            r7.F(r6, r8)
            r7.H(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            U1.j.d(r7)     // Catch:{ J -> 0x040c }
        L_0x001e:
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r6 = r7.j(r6)
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x002b
            goto L_0x001e
        L_0x002b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0030:
            r8 = -1
            r9 = 0
        L_0x0032:
            if (r8 != r4) goto L_0x0056
            int r9 = r7.f3733b
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = r7.j(r8)
            if (r8 != 0) goto L_0x0040
            r8 = 0
            goto L_0x0032
        L_0x0040:
            java.lang.String r11 = "STYLE"
            boolean r11 = r11.equals(r8)
            if (r11 == 0) goto L_0x004a
            r8 = 2
            goto L_0x0032
        L_0x004a:
            java.lang.String r11 = "NOTE"
            boolean r8 = r8.startsWith(r11)
            if (r8 == 0) goto L_0x0054
            r8 = 1
            goto L_0x0032
        L_0x0054:
            r8 = 3
            goto L_0x0032
        L_0x0056:
            r7.H(r9)
            if (r8 == 0) goto L_0x03ff
            if (r8 != r5) goto L_0x006a
        L_0x005d:
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r8 = r7.j(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0030
            goto L_0x005d
        L_0x006a:
            r9 = 0
            if (r8 != r2) goto L_0x03bc
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x03b4
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            r7.j(r8)
            java.lang.Object r8 = r1.f4337W
            U1.b r8 = (U1.b) r8
            java.lang.StringBuilder r11 = r8.f5379b
            r11.setLength(r3)
            int r12 = r7.f3733b
        L_0x0083:
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r13 = r7.j(r13)
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            if (r13 == 0) goto L_0x03b0
            byte[] r13 = r7.f3732a
            int r14 = r7.f3733b
            P0.r r8 = r8.f5378a
            r8.F(r14, r13)
            r8.H(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x00a0:
            U1.b.c(r8)
            int r13 = r8.a()
            java.lang.String r14 = "{"
            java.lang.String r15 = ""
            r10 = 5
            if (r13 >= r10) goto L_0x00b1
        L_0x00ae:
            r2 = r9
            goto L_0x0117
        L_0x00b1:
            java.nio.charset.Charset r13 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r10 = r8.t(r10, r13)
            java.lang.String r13 = "::cue"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x00c0
            goto L_0x00ae
        L_0x00c0:
            int r10 = r8.f3733b
            java.lang.String r13 = U1.b.b(r8, r11)
            if (r13 != 0) goto L_0x00c9
            goto L_0x00ae
        L_0x00c9:
            boolean r16 = r14.equals(r13)
            if (r16 == 0) goto L_0x00d4
            r8.H(r10)
            r2 = r15
            goto L_0x0117
        L_0x00d4:
            java.lang.String r10 = "("
            boolean r10 = r10.equals(r13)
            if (r10 == 0) goto L_0x0109
            int r10 = r8.f3733b
            int r13 = r8.f3734c
            r16 = 0
        L_0x00e2:
            if (r10 >= r13) goto L_0x00fa
            if (r16 != 0) goto L_0x00fa
            byte[] r2 = r8.f3732a
            int r17 = r10 + 1
            byte r2 = r2[r10]
            char r2 = (char) r2
            r10 = 41
            if (r2 != r10) goto L_0x00f3
            r2 = 1
            goto L_0x00f4
        L_0x00f3:
            r2 = 0
        L_0x00f4:
            r16 = r2
            r10 = r17
            r2 = 2
            goto L_0x00e2
        L_0x00fa:
            int r10 = r10 + r4
            int r2 = r8.f3733b
            int r10 = r10 - r2
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r2 = r8.t(r10, r2)
            java.lang.String r2 = r2.trim()
            goto L_0x010a
        L_0x0109:
            r2 = r9
        L_0x010a:
            java.lang.String r10 = U1.b.b(r8, r11)
            java.lang.String r13 = ")"
            boolean r10 = r13.equals(r10)
            if (r10 != 0) goto L_0x0117
            goto L_0x00ae
        L_0x0117:
            if (r2 == 0) goto L_0x0123
            java.lang.String r10 = U1.b.b(r8, r11)
            boolean r10 = r14.equals(r10)
            if (r10 != 0) goto L_0x0127
        L_0x0123:
            r1 = 1
            r3 = 2
            goto L_0x03a5
        L_0x0127:
            U1.c r10 = new U1.c
            r10.<init>()
            r10.f5380a = r15
            r10.f5381b = r15
            java.util.Set r13 = java.util.Collections.emptySet()
            r10.f5382c = r13
            r10.f5383d = r15
            r10.e = r9
            r10.f5385g = r3
            r10.i = r3
            r10.f5387j = r4
            r10.f5388k = r4
            r10.f5389l = r4
            r10.f5390m = r4
            r10.f5392o = r4
            r10.f5393p = r3
            boolean r13 = r15.equals(r2)
            if (r13 == 0) goto L_0x0151
            goto L_0x01b6
        L_0x0151:
            r13 = 91
            int r13 = r2.indexOf(r13)
            if (r13 == r4) goto L_0x0176
            java.util.regex.Pattern r14 = U1.b.f5376c
            java.lang.String r9 = r2.substring(r13)
            java.util.regex.Matcher r9 = r14.matcher(r9)
            boolean r14 = r9.matches()
            if (r14 == 0) goto L_0x0172
            java.lang.String r9 = r9.group(r5)
            r9.getClass()
            r10.f5383d = r9
        L_0x0172:
            java.lang.String r2 = r2.substring(r3, r13)
        L_0x0176:
            int r9 = P0.z.f3748a
            java.lang.String r9 = "\\."
            java.lang.String[] r2 = r2.split(r9, r4)
            r9 = r2[r3]
            r13 = 35
            int r13 = r9.indexOf(r13)
            if (r13 == r4) goto L_0x0196
            java.lang.String r14 = r9.substring(r3, r13)
            r10.f5381b = r14
            int r13 = r13 + r5
            java.lang.String r9 = r9.substring(r13)
            r10.f5380a = r9
            goto L_0x0198
        L_0x0196:
            r10.f5381b = r9
        L_0x0198:
            int r9 = r2.length
            if (r9 <= r5) goto L_0x01b6
            int r9 = r2.length
            int r13 = r2.length
            if (r9 > r13) goto L_0x01a1
            r13 = 1
            goto L_0x01a2
        L_0x01a1:
            r13 = 0
        L_0x01a2:
            P0.l.d(r13)
            java.lang.Object[] r2 = java.util.Arrays.copyOfRange(r2, r5, r9)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.HashSet r9 = new java.util.HashSet
            java.util.List r2 = java.util.Arrays.asList(r2)
            r9.<init>(r2)
            r10.f5382c = r9
        L_0x01b6:
            r2 = 0
            r9 = 0
        L_0x01b8:
            java.lang.String r13 = "}"
            if (r2 != 0) goto L_0x0391
            int r2 = r8.f3733b
            java.lang.String r9 = U1.b.b(r8, r11)
            if (r9 == 0) goto L_0x01cd
            boolean r14 = r13.equals(r9)
            if (r14 == 0) goto L_0x01cb
            goto L_0x01cd
        L_0x01cb:
            r14 = 0
            goto L_0x01ce
        L_0x01cd:
            r14 = 1
        L_0x01ce:
            if (r14 != 0) goto L_0x0387
            r8.H(r2)
            U1.b.c(r8)
            java.lang.String r2 = U1.b.a(r8, r11)
            boolean r17 = r15.equals(r2)
            if (r17 == 0) goto L_0x01e2
            goto L_0x0387
        L_0x01e2:
            java.lang.String r3 = ":"
            java.lang.String r4 = U1.b.b(r8, r11)
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01f0
            goto L_0x0387
        L_0x01f0:
            U1.b.c(r8)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
        L_0x01f9:
            java.lang.String r5 = ";"
            if (r4 != 0) goto L_0x0225
            int r1 = r8.f3733b
            r22 = r4
            java.lang.String r4 = U1.b.b(r8, r11)
            if (r4 != 0) goto L_0x0209
            r1 = 0
            goto L_0x0229
        L_0x0209:
            boolean r18 = r13.equals(r4)
            if (r18 != 0) goto L_0x021e
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0216
            goto L_0x021e
        L_0x0216:
            r3.append(r4)
            r1 = r19
            r4 = r22
            goto L_0x01f9
        L_0x021e:
            r8.H(r1)
            r4 = 1
            r1 = r19
            goto L_0x01f9
        L_0x0225:
            java.lang.String r1 = r3.toString()
        L_0x0229:
            if (r1 == 0) goto L_0x0387
            boolean r3 = r15.equals(r1)
            if (r3 == 0) goto L_0x0233
            goto L_0x0387
        L_0x0233:
            int r3 = r8.f3733b
            java.lang.String r4 = U1.b.b(r8, r11)
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0240
            goto L_0x0249
        L_0x0240:
            boolean r4 = r13.equals(r4)
            if (r4 == 0) goto L_0x0387
            r8.H(r3)
        L_0x0249:
            java.lang.String r3 = "color"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x025c
            r3 = 1
            int r1 = P0.b.a(r1, r3)
            r10.f5384f = r1
            r10.f5385g = r3
            goto L_0x0387
        L_0x025c:
            r3 = 1
            java.lang.String r4 = "background-color"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x026f
            int r1 = P0.b.a(r1, r3)
            r10.f5386h = r1
            r10.i = r3
            goto L_0x0387
        L_0x026f:
            java.lang.String r4 = "ruby-position"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x0290
            java.lang.String r2 = "over"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x0283
            r10.f5392o = r3
            goto L_0x0387
        L_0x0283:
            java.lang.String r2 = "under"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0387
            r1 = 2
            r10.f5392o = r1
            goto L_0x0387
        L_0x0290:
            java.lang.String r3 = "text-combine-upright"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02b0
            java.lang.String r2 = "all"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x02ab
            java.lang.String r2 = "digits"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x02a9
            goto L_0x02ab
        L_0x02a9:
            r1 = 0
            goto L_0x02ac
        L_0x02ab:
            r1 = 1
        L_0x02ac:
            r10.f5393p = r1
            goto L_0x0387
        L_0x02b0:
            java.lang.String r3 = "text-decoration"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02c5
            java.lang.String r2 = "underline"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0387
            r1 = 1
            r10.f5387j = r1
            goto L_0x0387
        L_0x02c5:
            java.lang.String r3 = "font-family"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02d5
            java.lang.String r1 = F.h.E(r1)
            r10.e = r1
            goto L_0x0387
        L_0x02d5:
            java.lang.String r3 = "font-weight"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L_0x02ea
            java.lang.String r2 = "bold"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0387
            r3 = 1
            r10.f5388k = r3
            goto L_0x0387
        L_0x02ea:
            r3 = 1
            java.lang.String r4 = "font-style"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L_0x02ff
            java.lang.String r2 = "italic"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0387
            r10.f5389l = r3
            goto L_0x0387
        L_0x02ff:
            java.lang.String r3 = "font-size"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0387
            java.lang.String r2 = F.h.E(r1)
            java.util.regex.Pattern r3 = U1.b.f5377d
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x0330
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid font-size: '"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "'."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "WebvttCssParser"
            P0.l.B(r2, r1)
            goto L_0x0387
        L_0x0330:
            r1 = 2
            java.lang.String r3 = r2.group(r1)
            r3.getClass()
            int r1 = r3.hashCode()
            switch(r1) {
                case 37: goto L_0x0357;
                case 3240: goto L_0x034c;
                case 3592: goto L_0x0341;
                default: goto L_0x033f;
            }
        L_0x033f:
            r3 = -1
            goto L_0x0361
        L_0x0341:
            java.lang.String r1 = "px"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x034a
            goto L_0x033f
        L_0x034a:
            r3 = 2
            goto L_0x0361
        L_0x034c:
            java.lang.String r1 = "em"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0355
            goto L_0x033f
        L_0x0355:
            r3 = 1
            goto L_0x0361
        L_0x0357:
            java.lang.String r1 = "%"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0360
            goto L_0x033f
        L_0x0360:
            r3 = 0
        L_0x0361:
            switch(r3) {
                case 0: goto L_0x0374;
                case 1: goto L_0x036f;
                case 2: goto L_0x036a;
                default: goto L_0x0364;
            }
        L_0x0364:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x036a:
            r1 = 1
            r10.f5390m = r1
            r3 = 2
            goto L_0x0379
        L_0x036f:
            r1 = 1
            r3 = 2
            r10.f5390m = r3
            goto L_0x0379
        L_0x0374:
            r1 = 1
            r3 = 2
            r4 = 3
            r10.f5390m = r4
        L_0x0379:
            java.lang.String r2 = r2.group(r1)
            r2.getClass()
            float r2 = java.lang.Float.parseFloat(r2)
            r10.f5391n = r2
            goto L_0x0389
        L_0x0387:
            r1 = 1
            r3 = 2
        L_0x0389:
            r1 = r19
            r2 = r14
            r3 = 0
            r4 = -1
            r5 = 1
            goto L_0x01b8
        L_0x0391:
            r1 = 1
            r3 = 2
            boolean r2 = r13.equals(r9)
            if (r2 == 0) goto L_0x039c
            r12.add(r10)
        L_0x039c:
            r1 = r19
            r2 = 2
            r3 = 0
            r4 = -1
            r5 = 1
            r9 = 0
            goto L_0x00a0
        L_0x03a5:
            r0.addAll(r12)
        L_0x03a8:
            r1 = r19
            r2 = 2
            r3 = 0
            r4 = -1
            r5 = 1
            goto L_0x0030
        L_0x03b0:
            r1 = r19
            goto L_0x0083
        L_0x03b4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "A style block was found after the first cue."
            r0.<init>(r1)
            throw r0
        L_0x03bc:
            r1 = 1
            r2 = 3
            r3 = 2
            if (r8 != r2) goto L_0x03a8
            java.util.regex.Pattern r2 = U1.i.f5415a
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r4 = r7.j(r2)
            if (r4 != 0) goto L_0x03cd
            r9 = 0
            goto L_0x03f9
        L_0x03cd:
            java.util.regex.Pattern r5 = U1.i.f5415a
            java.util.regex.Matcher r8 = r5.matcher(r4)
            boolean r9 = r8.matches()
            if (r9 == 0) goto L_0x03df
            r9 = 0
            U1.d r9 = U1.i.d(r9, r8, r7, r0)
            goto L_0x03f9
        L_0x03df:
            r9 = 0
            java.lang.String r2 = r7.j(r2)
            if (r2 != 0) goto L_0x03e7
            goto L_0x03f9
        L_0x03e7:
            java.util.regex.Matcher r2 = r5.matcher(r2)
            boolean r5 = r2.matches()
            if (r5 == 0) goto L_0x03f9
            java.lang.String r4 = r4.trim()
            U1.d r9 = U1.i.d(r4, r2, r7, r0)
        L_0x03f9:
            if (r9 == 0) goto L_0x03a8
            r6.add(r9)
            goto L_0x03a8
        L_0x03ff:
            B.q0 r0 = new B.q0
            r0.<init>((java.util.ArrayList) r6)
            r1 = r23
            r2 = r24
            com.bumptech.glide.d.v(r0, r1, r2)
            return
        L_0x040c:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.c.D(byte[], int, int, M1.k, P0.c):void");
    }

    public c E(c cVar) {
        a aVar = (a) this.f4336V;
        if (!aVar.equals((a) cVar.f4336V)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (p0()) {
            return cVar;
        } else {
            if (cVar.p0()) {
                return this;
            }
            int[] iArr = (int[]) this.f4337W;
            int length = iArr.length;
            int[] iArr2 = (int[]) cVar.f4337W;
            if (length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length2 = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length2);
            for (int i = length2; i < iArr.length; i++) {
                iArr4[i] = iArr2[i - length2] ^ iArr[i];
            }
            return new c(aVar, iArr4);
        }
    }

    public Object F() {
        Stack h02 = h0();
        if (!h02.isEmpty()) {
            return h02.pop();
        }
        return ((Supplier) this.f4337W).get();
    }

    public synchronized void G(String str) {
        PendingIntent pendingIntent = (PendingIntent) ((m) this.f4337W).get(str);
        if (pendingIntent != null) {
            ((AlarmManager) ((FullyActivity) this.f4336V).getSystemService("alarm")).cancel(pendingIntent);
            ((m) this.f4337W).remove(str);
        }
    }

    public void H() {
        int r8 = new d4.k((Context) (FullyActivity) this.f4336V, 1).r();
        if (P.H((FullyActivity) this.f4336V) || r8 <= 0 || r8 <= Math.round(P.g((FullyActivity) this.f4336V))) {
            i0();
            return;
        }
        synchronized (this) {
            try {
                C0767r3 r3Var = (C0767r3) this.f4337W;
                if (r3Var == null || !r3Var.f10924n) {
                    if (((C0767r3) this.f4337W) == null) {
                        View inflate = ((LayoutInflater) ((FullyActivity) this.f4336V).getSystemService("layout_inflater")).inflate(2131558437, (ViewGroup) null);
                        C0767r3 r3Var2 = new C0767r3((FullyActivity) this.f4336V);
                        this.f4337W = r3Var2;
                        r3Var2.h(inflate);
                        C0767r3 r3Var3 = (C0767r3) this.f4337W;
                        r3Var3.f10920j = 8388661;
                        r3Var3.f10916d = true;
                        r3Var3.e = true;
                        r3Var3.f10921k = true;
                        r3Var3.f10918g = -2;
                        r3Var3.f10919h = -2;
                        r3Var3.f10926p = "batteryWarning";
                    }
                    ((C0767r3) this.f4337W).j();
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(1500);
                    alphaAnimation.setRepeatCount(-1);
                    alphaAnimation.setRepeatMode(2);
                    ((C0767r3) this.f4337W).f10915c.findViewById(2131361899).startAnimation(alphaAnimation);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public void I() {
        this.f4336V = null;
        this.f4337W = null;
    }

    public void J(long j7, P0.r rVar) {
        if (rVar.a() >= 9) {
            int i = rVar.i();
            int i8 = rVar.i();
            int v4 = rVar.v();
            if (i == 434 && i8 == 1195456820 && v4 == 3) {
                C1332b.f(j7, rVar, (G[]) this.f4337W);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public D.C0043f0 t(u.C1455O r10) {
        /*
            r9 = this;
            java.lang.String r0 = "createCodec:"
            java.lang.Object r1 = r10.f15529a
            c1.n r1 = (c1.n) r1
            java.lang.String r1 = r1.f8797a
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0086 }
            r3.<init>(r0)     // Catch:{ Exception -> 0x0086 }
            r3.append(r1)     // Catch:{ Exception -> 0x0086 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0086 }
            android.os.Trace.beginSection(r0)     // Catch:{ Exception -> 0x0086 }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r1)     // Catch:{ Exception -> 0x0086 }
            java.lang.Object r1 = r10.f15531c     // Catch:{ Exception -> 0x0045 }
            M0.r r1 = (M0.r) r1     // Catch:{ Exception -> 0x0045 }
            int r3 = P0.z.f3748a     // Catch:{ Exception -> 0x0045 }
            r4 = 34
            r5 = 35
            if (r3 >= r4) goto L_0x0029
            goto L_0x0034
        L_0x0029:
            if (r3 >= r5) goto L_0x0047
            java.lang.String r1 = r1.f3036n     // Catch:{ Exception -> 0x0045 }
            boolean r1 = M0.I.n(r1)     // Catch:{ Exception -> 0x0045 }
            if (r1 == 0) goto L_0x0034
            goto L_0x0047
        L_0x0034:
            c1.e r1 = new c1.e     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r4 = r9.f4337W     // Catch:{ Exception -> 0x0045 }
            c1.c r4 = (c1.C0611c) r4     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r4 = r4.get()     // Catch:{ Exception -> 0x0045 }
            android.os.HandlerThread r4 = (android.os.HandlerThread) r4     // Catch:{ Exception -> 0x0045 }
            r1.<init>(r0, r4)     // Catch:{ Exception -> 0x0045 }
            r4 = 0
            goto L_0x004e
        L_0x0045:
            r10 = move-exception
            goto L_0x0088
        L_0x0047:
            Z1.c r1 = new Z1.c     // Catch:{ Exception -> 0x0045 }
            r4 = 6
            r1.<init>((int) r4, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0045 }
            r4 = 4
        L_0x004e:
            D.f0 r6 = new D.f0     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r7 = r9.f4336V     // Catch:{ Exception -> 0x0045 }
            c1.c r7 = (c1.C0611c) r7     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x0045 }
            android.os.HandlerThread r7 = (android.os.HandlerThread) r7     // Catch:{ Exception -> 0x0045 }
            java.lang.Object r8 = r10.f15533f     // Catch:{ Exception -> 0x0045 }
            B.q0 r8 = (B.q0) r8     // Catch:{ Exception -> 0x0045 }
            r6.<init>(r0, r7, r1, r8)     // Catch:{ Exception -> 0x0045 }
            android.os.Trace.endSection()     // Catch:{ Exception -> 0x0077 }
            java.lang.Object r1 = r10.f15532d     // Catch:{ Exception -> 0x0077 }
            android.view.Surface r1 = (android.view.Surface) r1     // Catch:{ Exception -> 0x0077 }
            if (r1 != 0) goto L_0x007a
            java.lang.Object r2 = r10.f15529a     // Catch:{ Exception -> 0x0077 }
            c1.n r2 = (c1.n) r2     // Catch:{ Exception -> 0x0077 }
            boolean r2 = r2.f8803h     // Catch:{ Exception -> 0x0077 }
            if (r2 == 0) goto L_0x007a
            if (r3 < r5) goto L_0x007a
            r4 = r4 | 8
            goto L_0x007a
        L_0x0077:
            r10 = move-exception
            r2 = r6
            goto L_0x0088
        L_0x007a:
            java.lang.Object r2 = r10.f15530b     // Catch:{ Exception -> 0x0077 }
            android.media.MediaFormat r2 = (android.media.MediaFormat) r2     // Catch:{ Exception -> 0x0077 }
            java.lang.Object r10 = r10.e     // Catch:{ Exception -> 0x0077 }
            android.media.MediaCrypto r10 = (android.media.MediaCrypto) r10     // Catch:{ Exception -> 0x0077 }
            D.C0043f0.b(r6, r2, r1, r10, r4)     // Catch:{ Exception -> 0x0077 }
            return r6
        L_0x0086:
            r10 = move-exception
            r0 = r2
        L_0x0088:
            if (r2 != 0) goto L_0x0090
            if (r0 == 0) goto L_0x0093
            r0.release()
            goto L_0x0093
        L_0x0090:
            r2.release()
        L_0x0093:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.c.t(u.O):D.f0");
    }

    public void L(p1.q qVar, V1.G g8) {
        boolean z;
        int i = 0;
        while (true) {
            G[] gArr = (G[]) this.f4337W;
            if (i < gArr.length) {
                g8.c();
                g8.d();
                G q7 = qVar.q(g8.f5716c, 3);
                M0.r rVar = (M0.r) ((List) this.f4336V).get(i);
                String str = rVar.f3036n;
                if ("application/cea-608".equals(str) || "application/cea-708".equals(str)) {
                    z = true;
                } else {
                    z = false;
                }
                P0.l.c("Invalid closed caption MIME type provided: " + str, z);
                C0129q qVar2 = new C0129q();
                g8.d();
                qVar2.f2989a = (String) g8.e;
                qVar2.f2999m = I.o(str);
                qVar2.e = rVar.e;
                qVar2.f2992d = rVar.f3028d;
                qVar2.f2984G = rVar.f3019H;
                qVar2.f3002p = rVar.f3039q;
                g.v(qVar2, q7);
                gArr[i] = q7;
                i++;
            } else {
                return;
            }
        }
    }

    public void M(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.M(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void N(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        L l8 = (L) this.f4336V;
        C1022j jVar = l8.f7893w.f8093e0;
        C0470v vVar2 = l8.f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.N(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void O(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.O(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void P(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.P(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void Q(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.Q(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void R(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.R(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void S(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        L l8 = (L) this.f4336V;
        C1022j jVar = l8.f7893w.f8093e0;
        C0470v vVar2 = l8.f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.S(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void T(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.T(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void U(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.U(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void V(C0470v vVar, Bundle bundle, boolean z) {
        f.e(vVar, "f");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.V(vVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void W(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.W(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void X(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.X(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void Y(C0470v vVar, View view, boolean z) {
        f.e(vVar, "f");
        f.e(view, "v");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.Y(vVar, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public void Z(C0470v vVar, boolean z) {
        f.e(vVar, "f");
        C0470v vVar2 = ((L) this.f4336V).f7895y;
        if (vVar2 != null) {
            vVar2.l().f7885o.Z(vVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f4337W).iterator();
        if (!it.hasNext()) {
            return;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        } else if (z) {
            throw null;
        } else {
            throw null;
        }
    }

    public /* synthetic */ void a() {
    }

    public int a0(int i) {
        if (i == 0) {
            return c0(0);
        }
        int[] iArr = (int[]) this.f4337W;
        if (i == 1) {
            int i8 = 0;
            for (int i9 : iArr) {
                a aVar = a.f5421h;
                i8 ^= i9;
            }
            return i8;
        }
        int i10 = iArr[0];
        int length = iArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            i10 = ((a) this.f4336V).b(i, i10) ^ iArr[i11];
        }
        return i10;
    }

    public void b(w wVar, p1.q qVar, V1.G g8) {
    }

    public View b0(int i, int i8, int i9, int i10) {
        int i11;
        View view;
        O o2 = (O) this.f4336V;
        int d8 = o2.d();
        int c8 = o2.c();
        if (i8 > i) {
            i11 = 1;
        } else {
            i11 = -1;
        }
        View view2 = null;
        while (i != i8) {
            switch (o2.f8302a) {
                case 0:
                    view = ((Q) o2.f8303b).F(i);
                    break;
                default:
                    view = ((Q) o2.f8303b).F(i);
                    break;
            }
            int b8 = o2.b(view);
            int a8 = o2.a(view);
            C0120h hVar = (C0120h) this.f4337W;
            hVar.f2949c = d8;
            hVar.f2950d = c8;
            hVar.e = b8;
            hVar.f2951f = a8;
            if (i9 != 0) {
                hVar.f2948b = i9;
                if (hVar.a()) {
                    return view;
                }
            }
            if (i10 != 0) {
                hVar.f2948b = i10;
                if (hVar.a()) {
                    view2 = view;
                }
            }
            i += i11;
        }
        return view2;
    }

    public void c(int i, int i8, int i9, long j7) {
        ((MediaCodec) this.f4336V).queueInputBuffer(i, 0, i8, j7, i9);
    }

    public int c0(int i) {
        int[] iArr = (int[]) this.f4337W;
        return iArr[(iArr.length - 1) - i];
    }

    public void d(int i, b bVar, long j7, int i8) {
        ((MediaCodec) this.f4336V).queueSecureInputBuffer(i, 0, bVar.i, j7, i8);
    }

    public int d0() {
        return ((int[]) this.f4337W).length - 1;
    }

    public void e(P0.r rVar) {
        E e;
        if (rVar.v() == 0 && (rVar.v() & 128) != 0) {
            rVar.I(6);
            int a8 = rVar.a() / 4;
            int i = 0;
            while (true) {
                e = (E) this.f4337W;
                if (i >= a8) {
                    break;
                }
                N1.f fVar = (N1.f) this.f4336V;
                rVar.g(fVar.f3344b, 0, 4);
                fVar.r(0);
                int i8 = fVar.i(16);
                fVar.u(3);
                if (i8 == 0) {
                    fVar.u(13);
                } else {
                    int i9 = fVar.i(13);
                    if (e.f5700h.get(i9) == null) {
                        e.f5700h.put(i9, new D(new K1.k(e, i9)));
                        e.f5705n++;
                    }
                }
                i++;
            }
            if (e.f5694a != 2) {
                e.f5700h.remove(0);
            }
        }
    }

    public synchronized List e0(String str) {
        List list;
        if (!((ArrayList) this.f4336V).contains(str)) {
            ((ArrayList) this.f4336V).add(str);
        }
        list = (List) ((HashMap) this.f4337W).get(str);
        if (list == null) {
            list = new ArrayList();
            ((HashMap) this.f4337W).put(str, list);
        }
        return list;
    }

    public void f(Object obj) {
        boolean z;
        switch (this.f4335U) {
            case 6:
                if (((C0009j) obj).f262a != 3) {
                    z = true;
                } else {
                    z = false;
                }
                n2.a.m("Unexpected result from SurfaceRequest. Surface was provided twice.", z);
                h.j("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                ((SurfaceTexture) this.f4336V).release();
                t tVar = (t) ((G5.c) this.f4337W).f1663V;
                if (tVar.f5311j != null) {
                    tVar.f5311j = null;
                    return;
                }
                return;
            default:
                Void voidR = (Void) obj;
                ((a0.j) this.f4336V).a((C0020v) this.f4337W);
                return;
        }
    }

    public synchronized ArrayList f0(Class cls, Class cls2) {
        ArrayList arrayList;
        boolean z;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f4336V).iterator();
        while (it.hasNext()) {
            List<d> list = (List) ((HashMap) this.f4337W).get((String) it.next());
            if (list != null) {
                for (d dVar : list) {
                    if (!dVar.f4338a.isAssignableFrom(cls) || !cls2.isAssignableFrom(dVar.f4339b)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z && !arrayList.contains(dVar.f4339b)) {
                        arrayList.add(dVar.f4339b);
                    }
                }
            }
        }
        return arrayList;
    }

    public void flush() {
        ((MediaCodec) this.f4336V).flush();
    }

    public void g(Bundle bundle) {
        ((MediaCodec) this.f4336V).setParameters(bundle);
    }

    public int h(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = ((MediaCodec) this.f4336V).dequeueOutputBuffer(bufferInfo, 0);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public Stack h0() {
        e eVar = (e) this.f4336V;
        Stack stack = (Stack) ((SoftReference) eVar.get()).get();
        if (stack != null) {
            return stack;
        }
        Stack stack2 = new Stack();
        eVar.set(new SoftReference(stack2));
        return stack2;
    }

    public l1.r i(a1.n nVar, a1.k kVar) {
        ((C0410a) this.f4336V).getClass();
        return new K2((Object) new a1.q(nVar, kVar), 3, (Object) (List) this.f4337W);
    }

    public synchronized void i0() {
        switch (this.f4335U) {
            case 25:
                j0();
                return;
            default:
                k0();
                return;
        }
    }

    public Object j() {
        return (androidx.emoji2.text.z) this.f4336V;
    }

    public void k(int i) {
        ((MediaCodec) this.f4336V).releaseOutputBuffer(i, false);
    }

    public void l(C1239d dVar, Handler handler) {
        ((MediaCodec) this.f4336V).setOnFrameRenderedListener(new C0610b(this, dVar, 1), handler);
    }

    public void l0() {
        ((SparseIntArray) this.f4336V).clear();
    }

    public boolean m(CharSequence charSequence, int i, int i8, u uVar) {
        Spannable spannable;
        if ((uVar.f7826c & 4) > 0) {
            return true;
        }
        if (((androidx.emoji2.text.z) this.f4336V) == null) {
            if (charSequence instanceof Spannable) {
                spannable = (Spannable) charSequence;
            } else {
                spannable = new SpannableString(charSequence);
            }
            this.f4336V = new androidx.emoji2.text.z(spannable);
        }
        ((C0410a) this.f4337W).getClass();
        ((androidx.emoji2.text.z) this.f4336V).setSpan(new v(uVar), i, i8, 33);
        return true;
    }

    public boolean m0(M3.n nVar) {
        float f8 = nVar.f3164a;
        if (f8 < 0.0f) {
            return false;
        }
        S3.b bVar = (S3.b) this.f4336V;
        if (f8 >= ((float) bVar.f4505U)) {
            return false;
        }
        float f9 = nVar.f3165b;
        if (f9 <= 0.0f || f9 >= ((float) bVar.f4506V)) {
            return false;
        }
        return true;
    }

    public void n(int i) {
        ((MediaCodec) this.f4336V).setVideoScalingMode(i);
    }

    public void n0(p pVar, int i) {
        if (!pVar.q().equals("#text")) {
            try {
                pVar.u((StringBuilder) this.f4336V, i, (S7.g) this.f4337W);
            } catch (IOException e) {
                throw new C6.b((Throwable) e, 3);
            }
        }
    }

    public /* synthetic */ d o(byte[] bArr, int i, int i8) {
        return N.e.o(this, bArr, i8);
    }

    public boolean o0(View view) {
        O o2 = (O) this.f4336V;
        int d8 = o2.d();
        int c8 = o2.c();
        int b8 = o2.b(view);
        int a8 = o2.a(view);
        C0120h hVar = (C0120h) this.f4337W;
        hVar.f2949c = d8;
        hVar.f2950d = c8;
        hVar.e = b8;
        hVar.f2951f = a8;
        hVar.f2948b = 24579;
        return hVar.a();
    }

    public MediaFormat p() {
        return ((MediaCodec) this.f4336V).getOutputFormat();
    }

    public boolean p0() {
        if (((int[]) this.f4337W)[0] == 0) {
            return true;
        }
        return false;
    }

    public void q() {
        ((MediaCodec) this.f4336V).detachOutputSurface();
    }

    public ByteBuffer r(int i) {
        return ((MediaCodec) this.f4336V).getInputBuffer(i);
    }

    public void r0(p pVar, int i) {
        try {
            pVar.t((StringBuilder) this.f4336V, i, (S7.g) this.f4337W);
        } catch (IOException e) {
            throw new C6.b((Throwable) e, 3);
        }
    }

    /* JADX INFO: finally extract failed */
    public void release() {
        q0 q0Var = (q0) this.f4337W;
        MediaCodec mediaCodec = (MediaCodec) this.f4336V;
        try {
            int i = z.f3748a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
            if (i >= 35 && q0Var != null) {
                q0Var.B(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (z.f3748a >= 35 && q0Var != null) {
                q0Var.B(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    public void s(Surface surface) {
        ((MediaCodec) this.f4336V).setOutputSurface(surface);
    }

    public c s0(int i) {
        a aVar = (a) this.f4336V;
        if (i == 0) {
            return aVar.f5430c;
        }
        if (i == 1) {
            return this;
        }
        int[] iArr = (int[]) this.f4337W;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i8 = 0; i8 < length; i8++) {
            iArr2[i8] = aVar.b(iArr[i8], i);
        }
        return new c(aVar, iArr2);
    }

    public void t0(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((Y.e) this.f4337W)) {
            ((Y.e) this.f4337W).put(new W2.k(cls, cls2, cls3), list);
        }
    }

    public String toString() {
        switch (this.f4335U) {
            case 8:
                if (p0()) {
                    return "0";
                }
                StringBuilder sb = new StringBuilder(d0() * 8);
                for (int d02 = d0(); d02 >= 0; d02--) {
                    int c02 = c0(d02);
                    if (c02 != 0) {
                        if (c02 < 0) {
                            if (d02 == d0()) {
                                sb.append("-");
                            } else {
                                sb.append(" - ");
                            }
                            c02 = -c02;
                        } else if (sb.length() > 0) {
                            sb.append(" + ");
                        }
                        if (d02 == 0 || c02 != 1) {
                            a aVar = (a) this.f4336V;
                            if (c02 != 0) {
                                int i = aVar.f5429b[c02];
                                if (i == 0) {
                                    sb.append('1');
                                } else if (i == 1) {
                                    sb.append('a');
                                } else {
                                    sb.append("a^");
                                    sb.append(i);
                                }
                            } else {
                                aVar.getClass();
                                throw new IllegalArgumentException();
                            }
                        }
                        if (d02 != 0) {
                            if (d02 == 1) {
                                sb.append('x');
                            } else {
                                sb.append("x^");
                                sb.append(d02);
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ boolean u(Z1.c cVar) {
        return false;
    }

    public void u0(Object obj) {
        Stack h02 = h0();
        if (h02.size() < 12) {
            h02.push(obj);
        }
    }

    public ByteBuffer v(int i) {
        return ((MediaCodec) this.f4336V).getOutputBuffer(i);
    }

    public void v0(String str, String str2) {
        G(str);
        if (!str2.isEmpty()) {
            try {
                Calendar instance = Calendar.getInstance();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
                instance.setTimeInMillis(System.currentTimeMillis());
                Calendar instance2 = Calendar.getInstance();
                instance2.setTime(simpleDateFormat.parse(str2.trim()));
                instance.set(11, instance2.get(11));
                instance.set(12, instance2.get(12));
                instance.set(13, 0);
                if (instance.getTimeInMillis() <= System.currentTimeMillis()) {
                    instance.add(5, 1);
                }
                x0(instance, str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public C1338h w(p1.l lVar, long j7) {
        int a8;
        C1338h hVar;
        p1.l lVar2 = lVar;
        long j8 = lVar2.f14408X;
        int min = (int) Math.min(20000, lVar2.f14407W - j8);
        P0.r rVar = (P0.r) this.f4337W;
        rVar.E(min);
        lVar2.r(rVar.f3732a, 0, min, false);
        int i = -1;
        long j9 = -9223372036854775807L;
        int i8 = -1;
        while (rVar.a() >= 4) {
            if (y.a(rVar.f3733b, rVar.f3732a) != 442) {
                rVar.I(1);
            } else {
                rVar.I(4);
                long c8 = V1.z.c(rVar);
                if (c8 != -9223372036854775807L) {
                    long b8 = ((w) this.f4336V).b(c8);
                    if (b8 > j7) {
                        if (j9 == -9223372036854775807L) {
                            return new C1338h(-1, b8, j8);
                        }
                        hVar = new C1338h(0, -9223372036854775807L, j8 + ((long) i8));
                    } else if (100000 + b8 > j7) {
                        hVar = new C1338h(0, -9223372036854775807L, j8 + ((long) rVar.f3733b));
                    } else {
                        i8 = rVar.f3733b;
                        j9 = b8;
                    }
                    return hVar;
                }
                int i9 = rVar.f3734c;
                if (rVar.a() >= 10) {
                    rVar.I(9);
                    int v4 = rVar.v() & 7;
                    if (rVar.a() >= v4) {
                        rVar.I(v4);
                        if (rVar.a() >= 4) {
                            if (y.a(rVar.f3733b, rVar.f3732a) == 443) {
                                rVar.I(4);
                                int B8 = rVar.B();
                                if (rVar.a() < B8) {
                                    rVar.H(i9);
                                } else {
                                    rVar.I(B8);
                                }
                            }
                            while (true) {
                                if (rVar.a() < 4 || (a8 = y.a(rVar.f3733b, rVar.f3732a)) == 442 || a8 == 441 || (a8 >>> 8) != 1) {
                                    break;
                                }
                                rVar.I(4);
                                if (rVar.a() < 2) {
                                    rVar.H(i9);
                                    break;
                                }
                                rVar.H(Math.min(rVar.f3734c, rVar.f3733b + rVar.B()));
                            }
                        } else {
                            rVar.H(i9);
                        }
                    } else {
                        rVar.H(i9);
                    }
                } else {
                    rVar.H(i9);
                }
                i = rVar.f3733b;
            }
        }
        if (j9 != -9223372036854775807L) {
            return new C1338h(-2, j9, j8 + ((long) i));
        }
        return C1338h.f14390d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        r12 = r3.get(7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void w0(java.lang.String r17, java.util.ArrayList r18) {
        /*
            r16 = this;
            r0 = r17
            r1 = 1
            r16.G(r17)
            boolean r2 = r18.isEmpty()
            if (r2 == 0) goto L_0x000d
            return
        L_0x000d:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.lang.String r3 = "HH:mm"
            java.util.Locale r4 = java.util.Locale.getDefault()
            r2.<init>(r3, r4)
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x001f:
            java.lang.String r7 = "c"
            r8 = 8
            if (r6 >= r8) goto L_0x00ca
            java.util.Iterator r9 = r18.iterator()
        L_0x0029:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00c0
            java.lang.Object r10 = r9.next()
            de.ozerov.fully.k3 r10 = (de.ozerov.fully.C0726k3) r10
            java.lang.String r11 = "wakeup"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x0040
            java.lang.String r11 = r10.f10773b
            goto L_0x0042
        L_0x0040:
            java.lang.String r11 = r10.f10772a
        L_0x0042:
            if (r11 == 0) goto L_0x0029
            java.lang.String r12 = r11.trim()
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x004f
            goto L_0x0029
        L_0x004f:
            java.util.Calendar r12 = java.util.Calendar.getInstance()
            java.lang.String r13 = r11.trim()     // Catch:{ Exception -> 0x00b5 }
            java.util.Date r13 = r2.parse(r13)     // Catch:{ Exception -> 0x00b5 }
            r12.setTime(r13)     // Catch:{ Exception -> 0x00b5 }
            r11 = 11
            int r13 = r12.get(r11)
            r3.set(r11, r13)
            r11 = 12
            int r12 = r12.get(r11)
            r3.set(r11, r12)
            r11 = 13
            r3.set(r11, r4)
            long r11 = r3.getTimeInMillis()
            long r13 = java.lang.System.currentTimeMillis()
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 > 0) goto L_0x0082
            goto L_0x0029
        L_0x0082:
            r11 = 7
            int r12 = r3.get(r11)
            int r10 = r10.f10774c
            if (r10 == r12) goto L_0x009f
            if (r10 == r8) goto L_0x009f
            r13 = 10
            if (r10 != r13) goto L_0x0095
            if (r12 == r11) goto L_0x009f
            if (r12 == r1) goto L_0x009f
        L_0x0095:
            r11 = 9
            if (r10 != r11) goto L_0x0029
            r10 = 2
            if (r12 < r10) goto L_0x0029
            r10 = 6
            if (r12 > r10) goto L_0x0029
        L_0x009f:
            if (r5 == 0) goto L_0x00ad
            long r10 = r3.getTimeInMillis()
            long r12 = r5.getTimeInMillis()
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 >= 0) goto L_0x0029
        L_0x00ad:
            java.lang.Object r5 = r3.clone()
            java.util.Calendar r5 = (java.util.Calendar) r5
            goto L_0x0029
        L_0x00b5:
            java.lang.String r10 = "Invalid time "
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.e(r7, r10)
            goto L_0x0029
        L_0x00c0:
            if (r5 == 0) goto L_0x00c3
            goto L_0x00ca
        L_0x00c3:
            r7 = 5
            r3.add(r7, r1)
            int r6 = r6 + r1
            goto L_0x001f
        L_0x00ca:
            if (r5 == 0) goto L_0x00d2
            r1 = r16
            r1.x0(r5, r0)
            goto L_0x00dd
        L_0x00d2:
            r1 = r16
            java.lang.String r2 = "Next time not found for "
            java.lang.String r0 = r2.concat(r0)
            android.util.Log.e(r7, r0)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.c.w0(java.lang.String, java.util.ArrayList):void");
    }

    public l1.r x() {
        return new K2((Object) ((C0410a) this.f4336V).x(), 3, (Object) (List) this.f4337W);
    }

    public void x0(Calendar calendar, String str) {
        FullyActivity fullyActivity = (FullyActivity) this.f4336V;
        AlarmManager alarmManager = (AlarmManager) fullyActivity.getSystemService("alarm");
        try {
            if (!n2.a.r0() || alarmManager.canScheduleExactAlarms()) {
                int hashCode = str.hashCode();
                Intent intent = new Intent("com.fullykiosk.singleapp.action.alarm");
                intent.putExtra("alarmType", str);
                PendingIntent broadcast = PendingIntent.getBroadcast(fullyActivity, hashCode, intent, 335544320);
                alarmManager.setAlarmClock(new AlarmManager.AlarmClockInfo(calendar.getTimeInMillis(), broadcast), broadcast);
                ((m) this.f4337W).put(str, broadcast);
                Log.i("c", "Alarm " + str + " set to " + new SimpleDateFormat("EEEE, MMMM d, yyyy 'at' HH:mm", Locale.getDefault()).format(calendar.getTime()));
                return;
            }
            Log.w("c", "Can't schedule alarm due to missing permissions");
        } catch (Exception e) {
            g.z(e, new StringBuilder("Failed to set alarm due to "), "c");
        }
    }

    public int y() {
        return 1;
    }

    public void z(Throwable th) {
        switch (this.f4335U) {
            case 6:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            default:
                ((a0.j) this.f4336V).b(th);
                return;
        }
    }

    public int z0(M3.n nVar, M3.n nVar2) {
        boolean z;
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        M3.n nVar3 = nVar;
        M3.n nVar4 = nVar2;
        int i12 = (int) nVar3.f3164a;
        int i13 = (int) nVar3.f3165b;
        int i14 = (int) nVar4.f3164a;
        int i15 = (int) nVar4.f3165b;
        int i16 = 0;
        int i17 = 1;
        if (Math.abs(i15 - i13) > Math.abs(i14 - i12)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i18 = i12;
            i12 = i13;
            i13 = i18;
            int i19 = i14;
            i14 = i15;
            i15 = i19;
        }
        int abs = Math.abs(i14 - i12);
        int abs2 = Math.abs(i15 - i13);
        int i20 = (-abs) / 2;
        if (i13 < i15) {
            i = 1;
        } else {
            i = -1;
        }
        if (i12 >= i14) {
            i17 = -1;
        }
        if (z) {
            i8 = i13;
        } else {
            i8 = i12;
        }
        if (z) {
            i9 = i12;
        } else {
            i9 = i13;
        }
        S3.b bVar = (S3.b) this.f4336V;
        boolean b8 = bVar.b(i8, i9);
        while (i12 != i14) {
            if (z) {
                i10 = i13;
            } else {
                i10 = i12;
            }
            if (z) {
                i11 = i12;
            } else {
                i11 = i13;
            }
            boolean b9 = bVar.b(i10, i11);
            if (b9 != b8) {
                i16++;
                b8 = b9;
            }
            i20 += abs2;
            if (i20 > 0) {
                if (i13 == i15) {
                    break;
                }
                i13 += i;
                i20 -= abs;
            }
            i12 += i17;
        }
        return i16;
    }

    public /* synthetic */ c(Context context, int i) {
        this.f4335U = i;
        this.f4336V = context;
    }

    public /* synthetic */ c(Object obj, int i, Object obj2) {
        this.f4335U = i;
        this.f4336V = obj;
        this.f4337W = obj2;
    }

    public c(int i, byte b8) {
        this.f4335U = i;
        switch (i) {
            case 1:
                this.f4336V = new ArrayList();
                this.f4337W = new HashMap();
                return;
            case 7:
                this.f4336V = new P0.r();
                this.f4337W = new U1.b();
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                this.f4336V = new SparseIntArray();
                this.f4337W = new SparseIntArray();
                return;
            default:
                this.f4336V = new AtomicReference();
                this.f4337W = new Y.i((Object) null);
                return;
        }
    }

    public c(C0410a aVar) {
        this.f4335U = 24;
        this.f4336V = new HashMap();
        this.f4337W = aVar;
    }

    public c(L l8) {
        this.f4335U = 19;
        f.e(l8, "fragmentManager");
        this.f4336V = l8;
        this.f4337W = new CopyOnWriteArrayList();
    }

    public c(FullyActivity fullyActivity) {
        this.f4335U = 26;
        this.f4337W = new HashMap(3);
        this.f4336V = fullyActivity;
    }

    public c(Supplier supplier) {
        this.f4335U = 2;
        this.f4337W = supplier;
        this.f4336V = new e(new E7.d(3), 2);
    }

    public c(S3.b bVar) {
        this.f4335U = 13;
        this.f4336V = bVar;
        this.f4337W = new T3.a(bVar);
    }

    public c(List list) {
        this.f4335U = 12;
        this.f4336V = list;
        this.f4337W = new G[list.size()];
    }

    public c(a aVar, int[] iArr) {
        this.f4335U = 8;
        if (iArr.length != 0) {
            this.f4336V = aVar;
            int length = iArr.length;
            int i = 1;
            if (length <= 1 || iArr[0] != 0) {
                this.f4337W = iArr;
                return;
            }
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.f4337W = new int[]{0};
                return;
            }
            int i8 = length - i;
            int[] iArr2 = new int[i8];
            this.f4337W = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i8);
            return;
        }
        throw new IllegalArgumentException();
    }

    public c(w wVar) {
        this.f4335U = 10;
        this.f4336V = wVar;
        this.f4337W = new P0.r();
    }

    public c(int i) {
        this.f4335U = 22;
        C0611c cVar = new C0611c(i, 0);
        C0611c cVar2 = new C0611c(i, 1);
        this.f4336V = cVar;
        this.f4337W = cVar2;
    }

    public c(MediaCodec mediaCodec, q0 q0Var) {
        this.f4335U = 23;
        this.f4336V = mediaCodec;
        this.f4337W = q0Var;
        if (z.f3748a >= 35 && q0Var != null) {
            LoudnessCodecController loudnessCodecController = (LoudnessCodecController) q0Var.f302X;
            if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
                P0.l.j(((HashSet) q0Var.f300V).add(mediaCodec));
            }
        }
    }

    public c(O o2) {
        this.f4335U = 21;
        this.f4336V = o2;
        C0120h hVar = new C0120h(2);
        hVar.f2948b = 0;
        this.f4337W = hVar;
    }

    public c(G5.c cVar, SurfaceTexture surfaceTexture) {
        this.f4335U = 6;
        this.f4337W = cVar;
        this.f4336V = surfaceTexture;
    }

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f4335U = 3;
        this.f4336V = cryptoInfo;
        this.f4337W = J4.b.c();
    }

    public c(Animation animation) {
        this.f4335U = 18;
        this.f4336V = animation;
        this.f4337W = null;
    }

    public c(Animator animator) {
        this.f4335U = 18;
        this.f4336V = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4337W = animatorSet;
        animatorSet.play(animator);
    }

    public c(E e) {
        this.f4335U = 11;
        this.f4337W = e;
        this.f4336V = new N1.f(4, new byte[4]);
    }
}
