package androidx.camera.view;

import B.Q;
import B.c0;
import B.e0;
import B.t0;
import B.w0;
import D.C0069x;
import H3.P;
import U.e;
import U.f;
import U.g;
import U.h;
import U.i;
import U.j;
import U.k;
import U.l;
import U.m;
import U.o;
import U.t;
import W.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import java.util.concurrent.atomic.AtomicReference;
import v0.C1510H;

public final class PreviewView extends FrameLayout {

    /* renamed from: j0  reason: collision with root package name */
    public static final /* synthetic */ int f7676j0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public h f7677U = h.PERFORMANCE;

    /* renamed from: V  reason: collision with root package name */
    public k f7678V;

    /* renamed from: W  reason: collision with root package name */
    public final o f7679W;

    /* renamed from: a0  reason: collision with root package name */
    public final e f7680a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f7681b0;

    /* renamed from: c0  reason: collision with root package name */
    public final z f7682c0;

    /* renamed from: d0  reason: collision with root package name */
    public final AtomicReference f7683d0;

    /* renamed from: e0  reason: collision with root package name */
    public final l f7684e0;

    /* renamed from: f0  reason: collision with root package name */
    public C0069x f7685f0;

    /* renamed from: g0  reason: collision with root package name */
    public final g f7686g0;

    /* renamed from: h0  reason: collision with root package name */
    public final f f7687h0;

    /* renamed from: i0  reason: collision with root package name */
    public final P f7688i0;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, U.e] */
    /* JADX WARNING: type inference failed for: r0v2, types: [androidx.lifecycle.x, androidx.lifecycle.z] */
    /* JADX WARNING: type inference failed for: r12v9, types: [U.o, android.view.View] */
    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        ? obj = new Object();
        obj.f5268h = i.FILL_CENTER;
        this.f7680a0 = obj;
        this.f7681b0 = true;
        this.f7682c0 = new x(j.f5282U);
        this.f7683d0 = new AtomicReference();
        this.f7684e0 = new l(obj);
        this.f7686g0 = new g(this);
        this.f7687h0 = new f(0, this);
        this.f7688i0 = new P((Object) this);
        g7.l.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = m.f5291a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C1510H.o(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(1, obj.f5268h.f5281U);
            for (i iVar : i.values()) {
                if (iVar.f5281U == integer) {
                    setScaleType(iVar);
                    int integer2 = obtainStyledAttributes.getInteger(0, 0);
                    for (h hVar : h.values()) {
                        if (hVar.f5275U == integer2) {
                            setImplementationMode(hVar);
                            obtainStyledAttributes.recycle();
                            new K1.i(context, new B7.g(this));
                            if (getBackground() == null) {
                                setBackgroundColor(j0.f.b(getContext(), 17170444));
                            }
                            ? view = new View(context, (AttributeSet) null, 0, 0);
                            view.setBackgroundColor(-1);
                            view.setAlpha(0.0f);
                            view.setElevation(Float.MAX_VALUE);
                            this.f7679W = view;
                            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean b(t0 t0Var, h hVar) {
        boolean z;
        boolean equals = t0Var.f309d.l().f().equals("androidx.camera.camera2.legacy");
        if (a.f6001a.j(SurfaceViewStretchedQuirk.class) == null && a.f6001a.j(SurfaceViewNotCroppedByParentQuirk.class) == null) {
            z = false;
        } else {
            z = true;
        }
        if (Build.VERSION.SDK_INT <= 24 || equals || z) {
            return true;
        }
        int ordinal = hVar.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + hVar);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private Q getScreenFlashInternal() {
        return this.f7679W.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (!(ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(Q q7) {
        F.h.j("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r5 = this;
            g7.l.a()
            U.k r0 = r5.f7678V
            if (r0 == 0) goto L_0x0031
            boolean r0 = r5.f7681b0
            if (r0 == 0) goto L_0x002c
            android.view.Display r0 = r5.getDisplay()
            if (r0 == 0) goto L_0x002c
            D.x r1 = r5.f7685f0
            if (r1 == 0) goto L_0x002c
            int r2 = r0.getRotation()
            int r1 = r1.g(r2)
            int r0 = r0.getRotation()
            U.e r2 = r5.f7680a0
            boolean r3 = r2.f5267g
            if (r3 != 0) goto L_0x0028
            goto L_0x002c
        L_0x0028:
            r2.f5264c = r1
            r2.e = r0
        L_0x002c:
            U.k r0 = r5.f7678V
            r0.f()
        L_0x0031:
            U.l r0 = r5.f7684e0
            android.util.Size r1 = new android.util.Size
            int r2 = r5.getWidth()
            int r3 = r5.getHeight()
            r1.<init>(r2, r3)
            int r2 = r5.getLayoutDirection()
            r0.getClass()
            g7.l.a()
            monitor-enter(r0)
            int r3 = r1.getWidth()     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x0065
            int r3 = r1.getHeight()     // Catch:{ all -> 0x0063 }
            if (r3 == 0) goto L_0x0065
            android.graphics.Rect r3 = r0.f5290b     // Catch:{ all -> 0x0063 }
            if (r3 != 0) goto L_0x005c
            goto L_0x0065
        L_0x005c:
            U.e r4 = r0.f5289a     // Catch:{ all -> 0x0063 }
            r4.a(r1, r2, r3)     // Catch:{ all -> 0x0063 }
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            goto L_0x0066
        L_0x0063:
            r1 = move-exception
            goto L_0x0067
        L_0x0065:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
        L_0x0066:
            return
        L_0x0067:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.PreviewView.a():void");
    }

    public Bitmap getBitmap() {
        Bitmap b8;
        g7.l.a();
        k kVar = this.f7678V;
        if (kVar == null || (b8 = kVar.b()) == null) {
            return null;
        }
        FrameLayout frameLayout = kVar.f5286b;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        e eVar = kVar.f5287c;
        if (!eVar.f()) {
            return b8;
        }
        Matrix d8 = eVar.d();
        RectF e = eVar.e(size, layoutDirection);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), b8.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(d8);
        matrix.postScale(e.width() / ((float) eVar.f5262a.getWidth()), e.height() / ((float) eVar.f5262a.getHeight()));
        matrix.postTranslate(e.left, e.top);
        canvas.drawBitmap(b8, matrix, new Paint(7));
        return createBitmap;
    }

    public U.a getController() {
        g7.l.a();
        return null;
    }

    public h getImplementationMode() {
        g7.l.a();
        return this.f7677U;
    }

    public c0 getMeteringPointFactory() {
        g7.l.a();
        return this.f7684e0;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.a] */
    public X.a getOutputTransform() {
        Matrix matrix;
        e eVar = this.f7680a0;
        g7.l.a();
        try {
            matrix = eVar.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = eVar.f5263b;
        if (matrix == null || rect == null) {
            F.h.j("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = E.f.f1294a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(E.f.f1294a, rectF2, Matrix.ScaleToFit.FILL);
        matrix.preConcat(matrix2);
        if (this.f7678V instanceof t) {
            matrix.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            F.h.I("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new Object();
    }

    public x getPreviewStreamState() {
        return this.f7682c0;
    }

    public i getScaleType() {
        g7.l.a();
        return this.f7680a0.f5268h;
    }

    public Q getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        g7.l.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        e eVar = this.f7680a0;
        if (!eVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(eVar.f5265d);
        matrix.postConcat(eVar.c(size, layoutDirection));
        return matrix;
    }

    public e0 getSurfaceProvider() {
        g7.l.a();
        return this.f7688i0;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, B.w0] */
    public w0 getViewPort() {
        g7.l.a();
        if (getDisplay() == null) {
            return null;
        }
        getDisplay().getRotation();
        g7.l.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new Object();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.f7686g0, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.f7687h0);
        k kVar = this.f7678V;
        if (kVar != null) {
            kVar.c();
        }
        g7.l.a();
        getViewPort();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f7687h0);
        k kVar = this.f7678V;
        if (kVar != null) {
            kVar.d();
        }
        DisplayManager displayManager = getDisplayManager();
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.f7686g0);
        }
    }

    public void setController(U.a aVar) {
        g7.l.a();
        g7.l.a();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(h hVar) {
        g7.l.a();
        this.f7677U = hVar;
    }

    public void setScaleType(i iVar) {
        g7.l.a();
        this.f7680a0.f5268h = iVar;
        a();
        g7.l.a();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.f7679W.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        g7.l.a();
        this.f7679W.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
