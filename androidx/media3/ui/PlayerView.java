package androidx.media3.ui;

import E2.a;
import H3.O;
import H3.P;
import M0.C0113a;
import M0.C0127o;
import M0.Q;
import M0.h0;
import P0.l;
import T0.C0220l;
import T0.C0232y;
import Y1.A;
import Y1.B;
import Y1.C0368a;
import Y1.C0375h;
import Y1.q;
import Y1.r;
import Y1.w;
import Y1.z;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PlayerView extends FrameLayout {

    /* renamed from: D0  reason: collision with root package name */
    public static final /* synthetic */ int f8209D0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public boolean f8210A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f8211B0;

    /* renamed from: C0  reason: collision with root package name */
    public boolean f8212C0;

    /* renamed from: U  reason: collision with root package name */
    public final z f8213U;

    /* renamed from: V  reason: collision with root package name */
    public final AspectRatioFrameLayout f8214V;

    /* renamed from: W  reason: collision with root package name */
    public final View f8215W;

    /* renamed from: a0  reason: collision with root package name */
    public final View f8216a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f8217b0;

    /* renamed from: c0  reason: collision with root package name */
    public final P f8218c0;

    /* renamed from: d0  reason: collision with root package name */
    public final ImageView f8219d0;

    /* renamed from: e0  reason: collision with root package name */
    public final ImageView f8220e0;

    /* renamed from: f0  reason: collision with root package name */
    public final SubtitleView f8221f0;

    /* renamed from: g0  reason: collision with root package name */
    public final View f8222g0;

    /* renamed from: h0  reason: collision with root package name */
    public final TextView f8223h0;

    /* renamed from: i0  reason: collision with root package name */
    public final r f8224i0;

    /* renamed from: j0  reason: collision with root package name */
    public final FrameLayout f8225j0;

    /* renamed from: k0  reason: collision with root package name */
    public final FrameLayout f8226k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Handler f8227l0 = new Handler(Looper.getMainLooper());

    /* renamed from: m0  reason: collision with root package name */
    public final Class f8228m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Method f8229n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Object f8230o0;
    public Q p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f8231q0;

    /* renamed from: r0  reason: collision with root package name */
    public q f8232r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f8233s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f8234t0;

    /* renamed from: u0  reason: collision with root package name */
    public Drawable f8235u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f8236v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f8237w0;

    /* renamed from: x0  reason: collision with root package name */
    public CharSequence f8238x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f8239y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f8240z0;

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: H3.P} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v39, resolved type: H3.P} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v74, resolved type: H3.P} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0302 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PlayerView(android.content.Context r24, android.util.AttributeSet r25) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            r3 = 1
            r4 = 0
            r1.<init>(r0, r2, r4)
            Y1.z r5 = new Y1.z
            r5.<init>(r1)
            r1.f8213U = r5
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r6.<init>(r7)
            r1.f8227l0 = r6
            boolean r6 = r23.isInEditMode()
            r7 = 0
            if (r6 == 0) goto L_0x0087
            r1.f8214V = r7
            r1.f8215W = r7
            r1.f8216a0 = r7
            r1.f8217b0 = r4
            r1.f8218c0 = r7
            r1.f8219d0 = r7
            r1.f8220e0 = r7
            r1.f8221f0 = r7
            r1.f8222g0 = r7
            r1.f8223h0 = r7
            r1.f8224i0 = r7
            r1.f8225j0 = r7
            r1.f8226k0 = r7
            r1.f8228m0 = r7
            r1.f8229n0 = r7
            r1.f8230o0 = r7
            android.widget.ImageView r2 = new android.widget.ImageView
            r2.<init>(r0)
            int r3 = P0.z.f3748a
            r4 = 2131230864(0x7f080090, float:1.8077793E38)
            r5 = 23
            if (r3 < r5) goto L_0x0069
            android.content.res.Resources r3 = r23.getResources()
            android.content.res.Resources$Theme r0 = r24.getTheme()
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r4, r0)
            r2.setImageDrawable(r0)
            int r0 = r3.getColor(2131099767, (android.content.res.Resources.Theme) null)
            r2.setBackgroundColor(r0)
            goto L_0x0082
        L_0x0069:
            android.content.res.Resources r3 = r23.getResources()
            android.content.res.Resources$Theme r0 = r24.getTheme()
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r4, r0)
            r2.setImageDrawable(r0)
            r0 = 2131099767(0x7f060077, float:1.7811897E38)
            int r0 = r3.getColor(r0)
            r2.setBackgroundColor(r0)
        L_0x0082:
            r1.addView(r2)
            goto L_0x0334
        L_0x0087:
            r8 = 3
            r9 = 2131558479(0x7f0d004f, float:1.8742275E38)
            if (r2 == 0) goto L_0x0123
            android.content.res.Resources$Theme r11 = r24.getTheme()
            int[] r12 = Y1.C.f6324d
            android.content.res.TypedArray r11 = r11.obtainStyledAttributes(r2, r12, r4, r4)
            r12 = 42
            boolean r13 = r11.hasValue(r12)     // Catch:{ all -> 0x011e }
            int r12 = r11.getColor(r12, r4)     // Catch:{ all -> 0x011e }
            r14 = 22
            int r9 = r11.getResourceId(r14, r9)     // Catch:{ all -> 0x011e }
            r14 = 49
            boolean r14 = r11.getBoolean(r14, r3)     // Catch:{ all -> 0x011e }
            int r15 = r11.getInt(r8, r3)     // Catch:{ all -> 0x011e }
            r7 = 9
            int r7 = r11.getResourceId(r7, r4)     // Catch:{ all -> 0x011e }
            r8 = 15
            int r8 = r11.getInt(r8, r4)     // Catch:{ all -> 0x011e }
            r6 = 50
            boolean r6 = r11.getBoolean(r6, r3)     // Catch:{ all -> 0x011e }
            r10 = 45
            int r10 = r11.getInt(r10, r3)     // Catch:{ all -> 0x011e }
            r3 = 28
            int r3 = r11.getInt(r3, r4)     // Catch:{ all -> 0x011e }
            r4 = 38
            r18 = r3
            r3 = 5000(0x1388, float:7.006E-42)
            int r3 = r11.getInt(r4, r3)     // Catch:{ all -> 0x011e }
            r4 = 14
            r16 = r3
            r3 = 1
            boolean r4 = r11.getBoolean(r4, r3)     // Catch:{ all -> 0x011e }
            r19 = r4
            r4 = 4
            boolean r20 = r11.getBoolean(r4, r3)     // Catch:{ all -> 0x011e }
            r3 = 35
            r4 = 0
            int r3 = r11.getInteger(r3, r4)     // Catch:{ all -> 0x011e }
            boolean r4 = r1.f8237w0     // Catch:{ all -> 0x011e }
            r21 = r3
            r3 = 16
            boolean r3 = r11.getBoolean(r3, r4)     // Catch:{ all -> 0x011e }
            r1.f8237w0 = r3     // Catch:{ all -> 0x011e }
            r3 = 13
            r4 = 1
            boolean r3 = r11.getBoolean(r3, r4)     // Catch:{ all -> 0x011e }
            r11.recycle()
            r11 = r8
            r4 = r19
            r8 = r21
            r19 = r15
            r15 = r13
            r13 = r10
            r10 = r7
            r7 = r3
            r3 = r18
            r18 = r14
            r14 = r12
            r12 = r9
            r22 = r20
            r20 = r6
            r6 = r22
            goto L_0x013a
        L_0x011e:
            r0 = move-exception
            r11.recycle()
            throw r0
        L_0x0123:
            r3 = 5000(0x1388, float:7.006E-42)
            r3 = 0
            r4 = 1
            r6 = 1
            r7 = 1
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 2131558479(0x7f0d004f, float:1.8742275E38)
            r13 = 1
            r14 = 0
            r15 = 0
            r16 = 5000(0x1388, float:7.006E-42)
            r18 = 1
            r19 = 1
            r20 = 1
        L_0x013a:
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r24)
            r9.inflate(r12, r1)
            r9 = 262144(0x40000, float:3.67342E-40)
            r1.setDescendantFocusability(r9)
            r9 = 2131362036(0x7f0a00f4, float:1.8343841E38)
            android.view.View r9 = r1.findViewById(r9)
            androidx.media3.ui.AspectRatioFrameLayout r9 = (androidx.media3.ui.AspectRatioFrameLayout) r9
            r1.f8214V = r9
            if (r9 == 0) goto L_0x0156
            r9.setResizeMode(r3)
        L_0x0156:
            r3 = 2131362070(0x7f0a0116, float:1.834391E38)
            android.view.View r3 = r1.findViewById(r3)
            r1.f8215W = r3
            if (r3 == 0) goto L_0x0166
            if (r15 == 0) goto L_0x0166
            r3.setBackgroundColor(r14)
        L_0x0166:
            r3 = 34
            r12 = 2
            if (r9 == 0) goto L_0x01f5
            if (r13 == 0) goto L_0x01f5
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r15 = -1
            r14.<init>(r15, r15)
            if (r13 == r12) goto L_0x01d7
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r12 = 3
            if (r13 == r12) goto L_0x01b1
            r12 = 4
            if (r13 == r12) goto L_0x018c
            android.view.SurfaceView r12 = new android.view.SurfaceView
            r12.<init>(r0)
            int r13 = P0.z.f3748a
            if (r13 < r3) goto L_0x0189
            r12.setSurfaceLifecycle(2)
        L_0x0189:
            r1.f8216a0 = r12
            goto L_0x01de
        L_0x018c:
            java.lang.Class<n1.n> r12 = n1.n.class
            int r13 = n1.n.f13663V     // Catch:{ Exception -> 0x01a8 }
            r13 = 1
            java.lang.Class[] r3 = new java.lang.Class[r13]     // Catch:{ Exception -> 0x01a8 }
            r17 = 0
            r3[r17] = r15     // Catch:{ Exception -> 0x01a8 }
            java.lang.reflect.Constructor r3 = r12.getConstructor(r3)     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object[] r12 = new java.lang.Object[r13]     // Catch:{ Exception -> 0x01a8 }
            r12[r17] = r0     // Catch:{ Exception -> 0x01a8 }
            java.lang.Object r3 = r3.newInstance(r12)     // Catch:{ Exception -> 0x01a8 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ Exception -> 0x01a8 }
            r1.f8216a0 = r3     // Catch:{ Exception -> 0x01a8 }
            goto L_0x01de
        L_0x01a8:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "video_decoder_gl_surface_view requires an ExoPlayer dependency"
            r2.<init>(r3, r0)
            throw r2
        L_0x01b1:
            java.lang.Class<o1.k> r3 = o1.k.class
            int r12 = o1.k.f14187i0     // Catch:{ Exception -> 0x01ce }
            r12 = 1
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x01ce }
            r17 = 0
            r13[r17] = r15     // Catch:{ Exception -> 0x01ce }
            java.lang.reflect.Constructor r3 = r3.getConstructor(r13)     // Catch:{ Exception -> 0x01ce }
            java.lang.Object[] r13 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01ce }
            r13[r17] = r0     // Catch:{ Exception -> 0x01ce }
            java.lang.Object r3 = r3.newInstance(r13)     // Catch:{ Exception -> 0x01ce }
            android.view.View r3 = (android.view.View) r3     // Catch:{ Exception -> 0x01ce }
            r1.f8216a0 = r3     // Catch:{ Exception -> 0x01ce }
            r3 = 1
            goto L_0x01df
        L_0x01ce:
            r0 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "spherical_gl_surface_view requires an ExoPlayer dependency"
            r2.<init>(r3, r0)
            throw r2
        L_0x01d7:
            android.view.TextureView r3 = new android.view.TextureView
            r3.<init>(r0)
            r1.f8216a0 = r3
        L_0x01de:
            r3 = 0
        L_0x01df:
            android.view.View r12 = r1.f8216a0
            r12.setLayoutParams(r14)
            android.view.View r12 = r1.f8216a0
            r12.setOnClickListener(r5)
            android.view.View r5 = r1.f8216a0
            r12 = 0
            r5.setClickable(r12)
            android.view.View r5 = r1.f8216a0
            r9.addView(r5, r12)
            goto L_0x01f9
        L_0x01f5:
            r3 = 0
            r1.f8216a0 = r3
            r3 = 0
        L_0x01f9:
            r1.f8217b0 = r3
            int r3 = P0.z.f3748a
            r5 = 34
            if (r3 != r5) goto L_0x0207
            H3.P r3 = new H3.P
            r3.<init>()
            goto L_0x0208
        L_0x0207:
            r3 = 0
        L_0x0208:
            r1.f8218c0 = r3
            r3 = 2131362028(0x7f0a00ec, float:1.8343825E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r1.f8225j0 = r3
            r3 = 2131362055(0x7f0a0107, float:1.834388E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r1.f8226k0 = r3
            r3 = 2131362048(0x7f0a0100, float:1.8343866E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r1.f8219d0 = r3
            r1.f8234t0 = r11
            java.lang.Class<androidx.media3.exoplayer.ExoPlayer> r3 = androidx.media3.exoplayer.ExoPlayer.class
            java.lang.Class<androidx.media3.exoplayer.image.ImageOutput> r5 = androidx.media3.exoplayer.image.ImageOutput.class
            java.lang.String r9 = "setImageOutput"
            r11 = 1
            java.lang.Class[] r12 = new java.lang.Class[r11]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0251 }
            r13 = 0
            r12[r13] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x024f }
            java.lang.reflect.Method r9 = r3.getMethod(r9, r12)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x024f }
            java.lang.ClassLoader r12 = r5.getClassLoader()     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x024f }
            java.lang.Class[] r14 = new java.lang.Class[r11]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x024f }
            r14[r13] = r5     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x024f }
            Y1.x r5 = new Y1.x     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x024f }
            r5.<init>(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x024f }
            java.lang.Object r5 = java.lang.reflect.Proxy.newProxyInstance(r12, r14, r5)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x024f }
            goto L_0x0256
        L_0x024f:
            goto L_0x0253
        L_0x0251:
            r13 = 0
            goto L_0x024f
        L_0x0253:
            r3 = 0
            r5 = 0
            r9 = 0
        L_0x0256:
            r1.f8228m0 = r3
            r1.f8229n0 = r9
            r1.f8230o0 = r5
            r3 = 2131362029(0x7f0a00ed, float:1.8343827E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r1.f8220e0 = r3
            if (r18 == 0) goto L_0x0270
            if (r19 == 0) goto L_0x0270
            if (r3 == 0) goto L_0x0270
            r3 = r19
            goto L_0x0271
        L_0x0270:
            r3 = 0
        L_0x0271:
            r1.f8233s0 = r3
            if (r10 == 0) goto L_0x027f
            android.content.Context r3 = r23.getContext()
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r10)
            r1.f8235u0 = r3
        L_0x027f:
            r3 = 2131362073(0x7f0a0119, float:1.8343916E38)
            android.view.View r3 = r1.findViewById(r3)
            androidx.media3.ui.SubtitleView r3 = (androidx.media3.ui.SubtitleView) r3
            r1.f8221f0 = r3
            if (r3 == 0) goto L_0x0292
            r3.a()
            r3.b()
        L_0x0292:
            r3 = 2131362033(0x7f0a00f1, float:1.8343835E38)
            android.view.View r3 = r1.findViewById(r3)
            r1.f8222g0 = r3
            r5 = 8
            if (r3 == 0) goto L_0x02a2
            r3.setVisibility(r5)
        L_0x02a2:
            r1.f8236v0 = r8
            r3 = 2131362041(0x7f0a00f9, float:1.8343851E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.f8223h0 = r3
            if (r3 == 0) goto L_0x02b4
            r3.setVisibility(r5)
        L_0x02b4:
            r3 = 2131362037(0x7f0a00f5, float:1.8343843E38)
            android.view.View r5 = r1.findViewById(r3)
            Y1.r r5 = (Y1.r) r5
            r8 = 2131362038(0x7f0a00f6, float:1.8343845E38)
            android.view.View r8 = r1.findViewById(r8)
            if (r5 == 0) goto L_0x02c9
            r1.f8224i0 = r5
            goto L_0x02f0
        L_0x02c9:
            if (r8 == 0) goto L_0x02ed
            Y1.r r5 = new Y1.r
            r5.<init>(r0, r2)
            r1.f8224i0 = r5
            r5.setId(r3)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r5.setLayoutParams(r0)
            android.view.ViewParent r0 = r8.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.indexOfChild(r8)
            r0.removeView(r8)
            r0.addView(r5, r2)
            goto L_0x02f0
        L_0x02ed:
            r0 = 0
            r1.f8224i0 = r0
        L_0x02f0:
            Y1.r r0 = r1.f8224i0
            if (r0 == 0) goto L_0x02f7
            r2 = r16
            goto L_0x02f8
        L_0x02f7:
            r2 = 0
        L_0x02f8:
            r1.f8239y0 = r2
            r1.f8211B0 = r4
            r1.f8240z0 = r6
            r1.f8210A0 = r7
            if (r20 == 0) goto L_0x0306
            if (r0 == 0) goto L_0x0306
            r4 = 1
            goto L_0x0307
        L_0x0306:
            r4 = 0
        L_0x0307:
            r1.f8231q0 = r4
            if (r0 == 0) goto L_0x032b
            Y1.w r0 = r0.f6480U
            int r2 = r0.z
            r3 = 3
            if (r2 == r3) goto L_0x031c
            r3 = 2
            if (r2 != r3) goto L_0x0316
            goto L_0x031c
        L_0x0316:
            r0.f()
            r0.i(r3)
        L_0x031c:
            Y1.r r0 = r1.f8224i0
            Y1.z r2 = r1.f8213U
            r0.getClass()
            r2.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.f6489a0
            r0.add(r2)
        L_0x032b:
            if (r20 == 0) goto L_0x0331
            r0 = 1
            r1.setClickable(r0)
        L_0x0331:
            r23.m()
        L_0x0334:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        playerView.getClass();
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        if (!playerView.c()) {
            ImageView imageView = playerView.f8219d0;
            if (imageView != null) {
                imageView.setVisibility(0);
                playerView.p();
            }
            View view = playerView.f8215W;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f8219d0;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
            p();
        }
    }

    private void setImageOutput(Q q7) {
        Class cls = this.f8228m0;
        if (cls != null && cls.isAssignableFrom(q7.getClass())) {
            try {
                Method method = this.f8229n0;
                method.getClass();
                Object obj = this.f8230o0;
                obj.getClass();
                method.invoke(q7, new Object[]{obj});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final boolean b() {
        Q q7 = this.p0;
        if (q7 == null || this.f8230o0 == null || !((a) q7).e(30) || !((C0232y) q7).A().a(4)) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        Q q7 = this.p0;
        if (q7 == null || !((a) q7).e(30) || !((C0232y) q7).A().a(2)) {
            return false;
        }
        return true;
    }

    public final void d() {
        ImageView imageView = this.f8219d0;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(17170445);
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        P p3;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (P0.z.f3748a == 34 && (p3 = this.f8218c0) != null && this.f8212C0 && (surfaceSyncGroup = (SurfaceSyncGroup) p3.f2027U) != null) {
            surfaceSyncGroup.markSyncReady();
            p3.f2027U = null;
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        Q q7 = this.p0;
        if (q7 != null && ((a) q7).e(16) && ((C0232y) this.p0).G()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23) {
            z = true;
        } else {
            z = false;
        }
        r rVar = this.f8224i0;
        if (z && q() && !rVar.g()) {
            f(true);
        } else if ((q() && rVar.c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            f(true);
        } else if (!z || !q()) {
            return false;
        } else {
            f(true);
            return false;
        }
        return true;
    }

    public final boolean e() {
        Q q7 = this.p0;
        if (q7 == null || !((a) q7).e(16) || !((C0232y) this.p0).G() || !((C0232y) this.p0).C()) {
            return false;
        }
        return true;
    }

    public final void f(boolean z) {
        boolean z6;
        if ((!e() || !this.f8210A0) && q()) {
            r rVar = this.f8224i0;
            if (!rVar.g() || rVar.getShowTimeoutMs() > 0) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean h5 = h();
            if (z || z6 || h5) {
                i(h5);
            }
        }
    }

    public final boolean g(Drawable drawable) {
        ImageView imageView = this.f8220e0;
        if (!(imageView == null || drawable == null)) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f8 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f8233s0 == 2) {
                    f8 = ((float) getWidth()) / ((float) getHeight());
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f8214V;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f8);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public List<C0113a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f8226k0;
        if (frameLayout != null) {
            arrayList.add(new C0113a(frameLayout));
        }
        r rVar = this.f8224i0;
        if (rVar != null) {
            arrayList.add(new C0113a(rVar));
        }
        return O.m(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f8225j0;
        l.l(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f8233s0;
    }

    public boolean getControllerAutoShow() {
        return this.f8240z0;
    }

    public boolean getControllerHideOnTouch() {
        return this.f8211B0;
    }

    public int getControllerShowTimeoutMs() {
        return this.f8239y0;
    }

    public Drawable getDefaultArtwork() {
        return this.f8235u0;
    }

    public int getImageDisplayMode() {
        return this.f8234t0;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f8226k0;
    }

    public Q getPlayer() {
        return this.p0;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f8214V;
        l.k(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f8221f0;
    }

    @Deprecated
    public boolean getUseArtwork() {
        if (this.f8233s0 != 0) {
            return true;
        }
        return false;
    }

    public boolean getUseController() {
        return this.f8231q0;
    }

    public View getVideoSurfaceView() {
        return this.f8216a0;
    }

    public final boolean h() {
        Q q7 = this.p0;
        if (q7 == null) {
            return true;
        }
        int D8 = ((C0232y) q7).D();
        if (this.f8240z0 && (!((a) this.p0).e(17) || !((C0232y) this.p0).z().p())) {
            if (D8 == 1 || D8 == 4) {
                return true;
            }
            Q q8 = this.p0;
            q8.getClass();
            if (!((C0232y) q8).C()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        int i;
        if (q()) {
            if (z) {
                i = 0;
            } else {
                i = this.f8239y0;
            }
            r rVar = this.f8224i0;
            rVar.setShowTimeoutMs(i);
            w wVar = rVar.f6480U;
            r rVar2 = wVar.f6544a;
            if (!rVar2.h()) {
                rVar2.setVisibility(0);
                rVar2.i();
                ImageView imageView = rVar2.f6511l0;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            wVar.k();
        }
    }

    public final void j() {
        if (q() && this.p0 != null) {
            r rVar = this.f8224i0;
            if (!rVar.g()) {
                f(true);
            } else if (this.f8211B0) {
                rVar.f();
            }
        }
    }

    public final void k() {
        h0 h0Var;
        float f8;
        Q q7 = this.p0;
        if (q7 != null) {
            C0232y yVar = (C0232y) q7;
            yVar.Y();
            h0Var = yVar.f4941Z0;
        } else {
            h0Var = h0.f2952d;
        }
        int i = h0Var.f2953a;
        float f9 = 0.0f;
        int i8 = h0Var.f2954b;
        if (i8 == 0 || i == 0) {
            f8 = 0.0f;
        } else {
            f8 = (((float) i) * h0Var.f2955c) / ((float) i8);
        }
        if (!this.f8217b0) {
            f9 = f8;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f8214V;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f9);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (((T0.C0232y) r5.p0).C() == false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
            r5 = this;
            android.view.View r0 = r5.f8222g0
            if (r0 == 0) goto L_0x002d
            M0.Q r1 = r5.p0
            r2 = 0
            if (r1 == 0) goto L_0x0024
            T0.y r1 = (T0.C0232y) r1
            int r1 = r1.D()
            r3 = 2
            if (r1 != r3) goto L_0x0024
            int r1 = r5.f8236v0
            r4 = 1
            if (r1 == r3) goto L_0x0025
            if (r1 != r4) goto L_0x0024
            M0.Q r1 = r5.p0
            T0.y r1 = (T0.C0232y) r1
            boolean r1 = r1.C()
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r4 = 0
        L_0x0025:
            if (r4 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 8
        L_0x002a:
            r0.setVisibility(r2)
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.l():void");
    }

    public final void m() {
        String str = null;
        r rVar = this.f8224i0;
        if (rVar == null || !this.f8231q0) {
            setContentDescription((CharSequence) null);
        } else if (rVar.g()) {
            if (this.f8211B0) {
                str = getResources().getString(2131951726);
            }
            setContentDescription(str);
        } else {
            setContentDescription(getResources().getString(2131951740));
        }
    }

    public final void n() {
        TextView textView = this.f8223h0;
        if (textView != null) {
            CharSequence charSequence = this.f8238x0;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            Q q7 = this.p0;
            if (q7 != null) {
                C0232y yVar = (C0232y) q7;
                yVar.Y();
                C0220l lVar = yVar.f4945b1.f4753f;
            }
            textView.setVisibility(8);
        }
    }

    public final void o(boolean z) {
        boolean z6;
        Drawable drawable;
        Q q7 = this.p0;
        boolean z8 = true;
        boolean z9 = false;
        if (q7 == null || !((a) q7).e(30) || ((C0232y) q7).A().f2941a.isEmpty()) {
            z6 = false;
        } else {
            z6 = true;
        }
        boolean z10 = this.f8237w0;
        ImageView imageView = this.f8220e0;
        View view = this.f8215W;
        if (!z10 && (!z6 || z)) {
            if (imageView != null) {
                imageView.setImageResource(17170445);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            d();
        }
        if (z6) {
            boolean c8 = c();
            boolean b8 = b();
            if (!c8 && !b8) {
                if (view != null) {
                    view.setVisibility(0);
                }
                d();
            }
            ImageView imageView2 = this.f8219d0;
            if (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) {
                z8 = false;
            }
            if (b8 && !c8 && z8) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    p();
                }
            } else if (c8 && !b8 && z8) {
                d();
            }
            if (!c8 && !b8 && this.f8233s0 != 0) {
                l.k(imageView);
                if (q7 != null && ((a) q7).e(18)) {
                    C0232y yVar = (C0232y) q7;
                    yVar.Y();
                    byte[] bArr = yVar.f4921J0.f2818f;
                    if (bArr != null) {
                        z9 = g(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                    }
                }
                if (z9 || g(this.f8235u0)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(17170445);
                imageView.setVisibility(4);
            }
        }
    }

    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!q() || this.p0 == null) {
            return false;
        }
        f(true);
        return true;
    }

    public final void p() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f8219d0;
        if (imageView != null && (drawable = imageView.getDrawable()) != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f8 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f8234t0 == 1) {
                    f8 = ((float) getWidth()) / ((float) getHeight());
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f8214V) != null) {
                    aspectRatioFrameLayout.setAspectRatio(f8);
                }
                imageView.setScaleType(scaleType);
            }
        }
    }

    public final boolean performClick() {
        j();
        return super.performClick();
    }

    public final boolean q() {
        if (!this.f8231q0) {
            return false;
        }
        l.k(this.f8224i0);
        return true;
    }

    public void setArtworkDisplayMode(int i) {
        boolean z;
        if (i == 0 || this.f8220e0 != null) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        if (this.f8233s0 != i) {
            this.f8233s0 = i;
            o(false);
        }
    }

    public void setAspectRatioListener(C0368a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f8214V;
        l.k(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAnimationEnabled(boolean z) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setAnimationEnabled(z);
    }

    public void setControllerAutoShow(boolean z) {
        this.f8240z0 = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f8210A0 = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        l.k(this.f8224i0);
        this.f8211B0 = z;
        m();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(C0375h hVar) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setOnFullScreenModeChangedListener(hVar);
    }

    public void setControllerShowTimeoutMs(int i) {
        r rVar = this.f8224i0;
        l.k(rVar);
        this.f8239y0 = i;
        if (rVar.g()) {
            i(h());
        }
    }

    public void setControllerVisibilityListener(A a8) {
        if (a8 != null) {
            setControllerVisibilityListener((q) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z;
        if (this.f8223h0 != null) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        this.f8238x0 = charSequence;
        n();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f8235u0 != drawable) {
            this.f8235u0 = drawable;
            o(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.f8212C0 = z;
    }

    public void setErrorMessageProvider(C0127o oVar) {
        if (oVar != null) {
            n();
        }
    }

    public void setFullscreenButtonClickListener(B b8) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setOnFullScreenModeChangedListener(this.f8213U);
    }

    public void setFullscreenButtonState(boolean z) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.k(z);
    }

    public void setImageDisplayMode(int i) {
        boolean z;
        if (this.f8219d0 != null) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        if (this.f8234t0 != i) {
            this.f8234t0 = i;
            p();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f8237w0 != z) {
            this.f8237w0 = z;
            o(false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fc, code lost:
        if (r2 != false) goto L_0x01fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setPlayer(M0.Q r12) {
        /*
            r11 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000e
            r0 = 1
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            P0.l.j(r0)
            if (r12 == 0) goto L_0x0022
            r0 = r12
            T0.y r0 = (T0.C0232y) r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = r0.f4959n0
            if (r0 != r1) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r0 = 0
            goto L_0x0023
        L_0x0022:
            r0 = 1
        L_0x0023:
            P0.l.d(r0)
            M0.Q r0 = r11.p0
            if (r0 != r12) goto L_0x002b
            return
        L_0x002b:
            android.view.View r1 = r11.f8216a0
            r4 = 27
            Y1.z r5 = r11.f8213U
            r6 = 0
            if (r0 == 0) goto L_0x0099
            r7 = r0
            T0.y r7 = (T0.C0232y) r7
            r7.L(r5)
            r8 = r0
            E2.a r8 = (E2.a) r8
            boolean r8 = r8.e(r4)
            if (r8 == 0) goto L_0x0075
            boolean r8 = r1 instanceof android.view.TextureView
            if (r8 == 0) goto L_0x0057
            r8 = r1
            android.view.TextureView r8 = (android.view.TextureView) r8
            r7.Y()
            if (r8 == 0) goto L_0x0075
            android.view.TextureView r9 = r7.f4927P0
            if (r8 != r9) goto L_0x0075
            r7.q()
            goto L_0x0075
        L_0x0057:
            boolean r8 = r1 instanceof android.view.SurfaceView
            if (r8 == 0) goto L_0x0075
            r8 = r1
            android.view.SurfaceView r8 = (android.view.SurfaceView) r8
            r7.Y()
            if (r8 != 0) goto L_0x0065
            r8 = r6
            goto L_0x0069
        L_0x0065:
            android.view.SurfaceHolder r8 = r8.getHolder()
        L_0x0069:
            r7.Y()
            if (r8 == 0) goto L_0x0075
            android.view.SurfaceHolder r9 = r7.f4924M0
            if (r8 != r9) goto L_0x0075
            r7.q()
        L_0x0075:
            java.lang.Class r7 = r11.f8228m0
            if (r7 == 0) goto L_0x0099
            java.lang.Class r8 = r0.getClass()
            boolean r7 = r7.isAssignableFrom(r8)
            if (r7 == 0) goto L_0x0099
            java.lang.reflect.Method r7 = r11.f8229n0     // Catch:{ IllegalAccessException -> 0x0092, InvocationTargetException -> 0x0090 }
            r7.getClass()     // Catch:{ IllegalAccessException -> 0x0092, InvocationTargetException -> 0x0090 }
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException -> 0x0092, InvocationTargetException -> 0x0090 }
            r8[r3] = r6     // Catch:{ IllegalAccessException -> 0x0092, InvocationTargetException -> 0x0090 }
            r7.invoke(r0, r8)     // Catch:{ IllegalAccessException -> 0x0092, InvocationTargetException -> 0x0090 }
            goto L_0x0099
        L_0x0090:
            r12 = move-exception
            goto L_0x0093
        L_0x0092:
            r12 = move-exception
        L_0x0093:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r12)
            throw r0
        L_0x0099:
            androidx.media3.ui.SubtitleView r0 = r11.f8221f0
            if (r0 == 0) goto L_0x00a0
            r0.setCues(r6)
        L_0x00a0:
            r11.p0 = r12
            boolean r7 = r11.q()
            Y1.r r8 = r11.f8224i0
            if (r7 == 0) goto L_0x00ad
            r8.setPlayer(r12)
        L_0x00ad:
            r11.l()
            r11.n()
            r11.o(r2)
            if (r12 == 0) goto L_0x022a
            r7 = r12
            E2.a r7 = (E2.a) r7
            boolean r4 = r7.e(r4)
            if (r4 == 0) goto L_0x0201
            boolean r4 = r1 instanceof android.view.TextureView
            if (r4 == 0) goto L_0x0118
            android.view.TextureView r1 = (android.view.TextureView) r1
            r4 = r12
            T0.y r4 = (T0.C0232y) r4
            r4.Y()
            if (r1 != 0) goto L_0x00d4
            r4.q()
            goto L_0x01ba
        L_0x00d4:
            r4.M()
            r4.f4927P0 = r1
            android.view.TextureView$SurfaceTextureListener r8 = r1.getSurfaceTextureListener()
            if (r8 == 0) goto L_0x00e6
            java.lang.String r8 = "ExoPlayerImpl"
            java.lang.String r9 = "Replacing existing SurfaceTextureListener."
            P0.l.B(r8, r9)
        L_0x00e6:
            T0.v r8 = r4.f4964t0
            r1.setSurfaceTextureListener(r8)
            boolean r8 = r1.isAvailable()
            if (r8 == 0) goto L_0x00f6
            android.graphics.SurfaceTexture r8 = r1.getSurfaceTexture()
            goto L_0x00f7
        L_0x00f6:
            r8 = r6
        L_0x00f7:
            if (r8 != 0) goto L_0x0101
            r4.S(r6)
            r4.J(r3, r3)
            goto L_0x01ba
        L_0x0101:
            android.view.Surface r6 = new android.view.Surface
            r6.<init>(r8)
            r4.S(r6)
            r4.f4923L0 = r6
            int r6 = r1.getWidth()
            int r1 = r1.getHeight()
            r4.J(r6, r1)
            goto L_0x01ba
        L_0x0118:
            boolean r4 = r1 instanceof android.view.SurfaceView
            if (r4 == 0) goto L_0x01ba
            android.view.SurfaceView r1 = (android.view.SurfaceView) r1
            r4 = r12
            T0.y r4 = (T0.C0232y) r4
            r4.Y()
            boolean r8 = r1 instanceof n1.o
            if (r8 == 0) goto L_0x0137
            r4.M()
            r4.S(r1)
            android.view.SurfaceHolder r1 = r1.getHolder()
            r4.O(r1)
            goto L_0x01ba
        L_0x0137:
            boolean r8 = r1 instanceof o1.k
            T0.v r9 = r4.f4964t0
            if (r8 == 0) goto L_0x017a
            r4.M()
            r6 = r1
            o1.k r6 = (o1.k) r6
            r4.f4925N0 = r6
            T0.w r6 = r4.f4965u0
            T0.a0 r6 = r4.r(r6)
            boolean r8 = r6.f4775g
            r8 = r8 ^ r2
            P0.l.j(r8)
            r8 = 10000(0x2710, float:1.4013E-41)
            r6.f4773d = r8
            o1.k r8 = r4.f4925N0
            boolean r10 = r6.f4775g
            r10 = r10 ^ r2
            P0.l.j(r10)
            r6.e = r8
            r6.c()
            o1.k r6 = r4.f4925N0
            java.util.concurrent.CopyOnWriteArrayList r6 = r6.f14188U
            r6.add(r9)
            o1.k r6 = r4.f4925N0
            android.view.Surface r6 = r6.getVideoSurface()
            r4.S(r6)
            android.view.SurfaceHolder r1 = r1.getHolder()
            r4.O(r1)
            goto L_0x01ba
        L_0x017a:
            if (r1 != 0) goto L_0x017e
            r1 = r6
            goto L_0x0182
        L_0x017e:
            android.view.SurfaceHolder r1 = r1.getHolder()
        L_0x0182:
            r4.Y()
            if (r1 != 0) goto L_0x018b
            r4.q()
            goto L_0x01ba
        L_0x018b:
            r4.M()
            r4.f4926O0 = r2
            r4.f4924M0 = r1
            r1.addCallback(r9)
            android.view.Surface r8 = r1.getSurface()
            if (r8 == 0) goto L_0x01b4
            boolean r9 = r8.isValid()
            if (r9 == 0) goto L_0x01b4
            r4.S(r8)
            android.graphics.Rect r1 = r1.getSurfaceFrame()
            int r6 = r1.width()
            int r1 = r1.height()
            r4.J(r6, r1)
            goto L_0x01ba
        L_0x01b4:
            r4.S(r6)
            r4.J(r3, r3)
        L_0x01ba:
            r1 = 30
            boolean r1 = r7.e(r1)
            if (r1 == 0) goto L_0x01fe
            r1 = r12
            T0.y r1 = (T0.C0232y) r1
            M0.e0 r1 = r1.A()
            r4 = 0
        L_0x01ca:
            H3.O r6 = r1.f2941a
            int r8 = r6.size()
            if (r4 >= r8) goto L_0x01fb
            java.lang.Object r8 = r6.get(r4)
            M0.d0 r8 = (M0.d0) r8
            int r8 = r8.a()
            r9 = 2
            if (r8 != r9) goto L_0x01f9
            java.lang.Object r6 = r6.get(r4)
            M0.d0 r6 = (M0.d0) r6
            r8 = 0
        L_0x01e6:
            int[] r9 = r6.f2937d
            int r9 = r9.length
            if (r8 >= r9) goto L_0x01f5
            boolean r9 = r6.b(r8)
            if (r9 == 0) goto L_0x01f3
            r6 = 1
            goto L_0x01f6
        L_0x01f3:
            int r8 = r8 + r2
            goto L_0x01e6
        L_0x01f5:
            r6 = 0
        L_0x01f6:
            if (r6 == 0) goto L_0x01f9
            goto L_0x01fc
        L_0x01f9:
            int r4 = r4 + r2
            goto L_0x01ca
        L_0x01fb:
            r2 = 0
        L_0x01fc:
            if (r2 == 0) goto L_0x0201
        L_0x01fe:
            r11.k()
        L_0x0201:
            if (r0 == 0) goto L_0x0218
            r1 = 28
            boolean r1 = r7.e(r1)
            if (r1 == 0) goto L_0x0218
            r1 = r12
            T0.y r1 = (T0.C0232y) r1
            r1.Y()
            O0.c r1 = r1.f4933V0
            H3.O r1 = r1.f3544a
            r0.setCues(r1)
        L_0x0218:
            r0 = r12
            T0.y r0 = (T0.C0232y) r0
            r5.getClass()
            P0.k r0 = r0.f4952g0
            r0.a(r5)
            r11.setImageOutput(r12)
            r11.f(r3)
            goto L_0x022f
        L_0x022a:
            if (r8 == 0) goto L_0x022f
            r8.f()
        L_0x022f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.setPlayer(M0.Q):void");
    }

    public void setRepeatToggleModes(int i) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f8214V;
        l.k(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    public void setShowBuffering(int i) {
        if (this.f8236v0 != i) {
            this.f8236v0 = i;
            l();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setShowFastForwardButton(z);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setShowNextButton(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setShowPreviousButton(boolean z) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        r rVar = this.f8224i0;
        l.k(rVar);
        rVar.setShowVrButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f8215W;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(z ^ true ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z6;
        boolean z8 = true;
        r rVar = this.f8224i0;
        if (!z || rVar != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        l.j(z6);
        if (!z && !hasOnClickListeners()) {
            z8 = false;
        }
        setClickable(z8);
        if (this.f8231q0 != z) {
            this.f8231q0 = z;
            if (q()) {
                rVar.setPlayer(this.p0);
            } else if (rVar != null) {
                rVar.f();
                rVar.setPlayer((Q) null);
            }
            m();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f8216a0;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(q qVar) {
        r rVar = this.f8224i0;
        l.k(rVar);
        q qVar2 = this.f8232r0;
        if (qVar2 != qVar) {
            CopyOnWriteArrayList copyOnWriteArrayList = rVar.f6489a0;
            if (qVar2 != null) {
                copyOnWriteArrayList.remove(qVar2);
            }
            this.f8232r0 = qVar;
            if (qVar != null) {
                copyOnWriteArrayList.add(qVar);
                setControllerVisibilityListener((A) null);
            }
        }
    }
}
