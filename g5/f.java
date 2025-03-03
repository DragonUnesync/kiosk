package G5;

import A1.d;
import D2.o;
import H5.e;
import H5.h;
import H5.i;
import H5.j;
import H5.k;
import P0.q;
import Q3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.journeyapps.barcodescanner.BarcodeView;
import java.util.ArrayList;

public abstract class f extends ViewGroup {

    /* renamed from: w0  reason: collision with root package name */
    public static final /* synthetic */ int f1667w0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public H5.f f1668U;

    /* renamed from: V  reason: collision with root package name */
    public final WindowManager f1669V;

    /* renamed from: W  reason: collision with root package name */
    public final Handler f1670W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1671a0 = false;

    /* renamed from: b0  reason: collision with root package name */
    public SurfaceView f1672b0;

    /* renamed from: c0  reason: collision with root package name */
    public TextureView f1673c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f1674d0 = false;

    /* renamed from: e0  reason: collision with root package name */
    public final q f1675e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1676f0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public final ArrayList f1677g0 = new ArrayList();

    /* renamed from: h0  reason: collision with root package name */
    public o f1678h0;

    /* renamed from: i0  reason: collision with root package name */
    public i f1679i0 = new i();

    /* renamed from: j0  reason: collision with root package name */
    public v f1680j0;

    /* renamed from: k0  reason: collision with root package name */
    public v f1681k0;

    /* renamed from: l0  reason: collision with root package name */
    public Rect f1682l0;

    /* renamed from: m0  reason: collision with root package name */
    public v f1683m0;

    /* renamed from: n0  reason: collision with root package name */
    public Rect f1684n0 = null;

    /* renamed from: o0  reason: collision with root package name */
    public Rect f1685o0 = null;
    public v p0 = null;

    /* renamed from: q0  reason: collision with root package name */
    public double f1686q0 = 0.1d;

    /* renamed from: r0  reason: collision with root package name */
    public k f1687r0 = null;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f1688s0 = false;

    /* renamed from: t0  reason: collision with root package name */
    public final d f1689t0;

    /* renamed from: u0  reason: collision with root package name */
    public final A.f f1690u0;

    /* renamed from: v0  reason: collision with root package name */
    public final e f1691v0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        BarcodeView barcodeView = (BarcodeView) this;
        this.f1689t0 = new d(barcodeView);
        b bVar = new b(barcodeView, 1);
        this.f1690u0 = new A.f(23, (Object) barcodeView);
        this.f1691v0 = new e(0, barcodeView);
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        b(attributeSet);
        this.f1669V = (WindowManager) context.getSystemService("window");
        this.f1670W = new Handler(bVar);
        this.f1675e0 = new q(0, 2);
    }

    public static void a(BarcodeView barcodeView) {
        if (barcodeView.f1668U != null && barcodeView.getDisplayRotation() != barcodeView.f1676f0) {
            barcodeView.g();
            barcodeView.c();
        }
    }

    private int getDisplayRotation() {
        return this.f1669V.getDefaultDisplay().getRotation();
    }

    public final void b(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f4118a);
        int dimension = (int) obtainStyledAttributes.getDimension(1, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.p0 = new v(dimension, dimension2);
        }
        this.f1671a0 = obtainStyledAttributes.getBoolean(3, true);
        int integer = obtainStyledAttributes.getInteger(2, -1);
        if (integer == 1) {
            this.f1687r0 = new j(0);
        } else if (integer == 2) {
            this.f1687r0 = new j(1);
        } else if (integer == 3) {
            this.f1687r0 = new j(2);
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [H5.f, java.lang.Object] */
    public final void c() {
        b.U();
        Log.d("f", "resume()");
        if (this.f1668U != null) {
            Log.w("f", "initCamera called twice");
        } else {
            Context context = getContext();
            ? obj = new Object();
            obj.f2180f = false;
            obj.f2181g = true;
            obj.i = new i();
            e eVar = new e(obj, 0);
            obj.f2183j = new e(obj, 1);
            obj.f2184k = new e(obj, 2);
            obj.f2185l = new e(obj, 3);
            b.U();
            if (q.f3725g == null) {
                q.f3725g = new q(3, (byte) 0);
            }
            q qVar = q.f3725g;
            obj.f2176a = qVar;
            h hVar = new h(context);
            obj.f2178c = hVar;
            hVar.f2195g = obj.i;
            obj.f2182h = new Handler();
            i iVar = this.f1679i0;
            if (!obj.f2180f) {
                obj.i = iVar;
                hVar.f2195g = iVar;
            }
            this.f1668U = obj;
            obj.f2179d = this.f1670W;
            b.U();
            obj.f2180f = true;
            obj.f2181g = false;
            synchronized (qVar.e) {
                qVar.f3727b++;
                qVar.g(eVar);
            }
            this.f1676f0 = getDisplayRotation();
        }
        if (this.f1683m0 != null) {
            e();
        } else {
            SurfaceView surfaceView = this.f1672b0;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f1689t0);
            } else {
                TextureView textureView = this.f1673c0;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        this.f1673c0.getSurfaceTexture();
                        this.f1683m0 = new v(this.f1673c0.getWidth(), this.f1673c0.getHeight());
                        e();
                    } else {
                        this.f1673c0.setSurfaceTextureListener(new c(0, this));
                    }
                }
            }
        }
        requestLayout();
        q qVar2 = this.f1675e0;
        Context context2 = getContext();
        A.f fVar = this.f1690u0;
        r rVar = (r) qVar2.f3729d;
        if (rVar != null) {
            rVar.disable();
        }
        qVar2.f3729d = null;
        qVar2.f3728c = null;
        qVar2.e = null;
        Context applicationContext = context2.getApplicationContext();
        qVar2.e = fVar;
        qVar2.f3728c = (WindowManager) applicationContext.getSystemService("window");
        r rVar2 = new r(qVar2, applicationContext);
        qVar2.f3729d = rVar2;
        rVar2.enable();
        qVar2.f3727b = ((WindowManager) qVar2.f3728c).getDefaultDisplay().getRotation();
    }

    public final void d(d dVar) {
        if (!this.f1674d0 && this.f1668U != null) {
            Log.i("f", "Starting preview");
            H5.f fVar = this.f1668U;
            fVar.f2177b = dVar;
            b.U();
            if (fVar.f2180f) {
                fVar.f2176a.g(fVar.f2184k);
                this.f1674d0 = true;
                ((BarcodeView) this).h();
                this.f1691v0.g();
                return;
            }
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public final void e() {
        Rect rect;
        float f8;
        v vVar = this.f1683m0;
        if (vVar != null && this.f1681k0 != null && (rect = this.f1682l0) != null) {
            if (this.f1672b0 == null || !vVar.equals(new v(rect.width(), this.f1682l0.height()))) {
                TextureView textureView = this.f1673c0;
                if (textureView != null && textureView.getSurfaceTexture() != null) {
                    if (this.f1681k0 != null) {
                        int width = this.f1673c0.getWidth();
                        int height = this.f1673c0.getHeight();
                        v vVar2 = this.f1681k0;
                        float f9 = (float) height;
                        float f10 = ((float) width) / f9;
                        float f11 = ((float) vVar2.f1735U) / ((float) vVar2.f1736V);
                        float f12 = 1.0f;
                        if (f10 < f11) {
                            f12 = f11 / f10;
                            f8 = 1.0f;
                        } else {
                            f8 = f10 / f11;
                        }
                        Matrix matrix = new Matrix();
                        matrix.setScale(f12, f8);
                        float f13 = (float) width;
                        matrix.postTranslate((f13 - (f12 * f13)) / 2.0f, (f9 - (f8 * f9)) / 2.0f);
                        this.f1673c0.setTransform(matrix);
                    }
                    SurfaceTexture surfaceTexture = this.f1673c0.getSurfaceTexture();
                    d dVar = new d(14, false);
                    if (surfaceTexture != null) {
                        dVar.f36W = surfaceTexture;
                        d(dVar);
                        return;
                    }
                    throw new IllegalArgumentException("surfaceTexture may not be null");
                }
                return;
            }
            SurfaceHolder holder = this.f1672b0.getHolder();
            d dVar2 = new d(14, false);
            if (holder != null) {
                dVar2.f35V = holder;
                d(dVar2);
                return;
            }
            throw new IllegalArgumentException("surfaceHolder may not be null");
        }
    }

    public H5.f getCameraInstance() {
        return this.f1668U;
    }

    public i getCameraSettings() {
        return this.f1679i0;
    }

    public Rect getFramingRect() {
        return this.f1684n0;
    }

    public v getFramingRectSize() {
        return this.p0;
    }

    public double getMarginFraction() {
        return this.f1686q0;
    }

    public Rect getPreviewFramingRect() {
        return this.f1685o0;
    }

    public k getPreviewScalingStrategy() {
        k kVar = this.f1687r0;
        if (kVar != null) {
            return kVar;
        }
        if (this.f1673c0 != null) {
            return new j(0);
        }
        return new j(1);
    }

    public v getPreviewSize() {
        return this.f1681k0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1671a0) {
            TextureView textureView = new TextureView(getContext());
            this.f1673c0 = textureView;
            textureView.setSurfaceTextureListener(new c(0, this));
            addView(this.f1673c0);
            return;
        }
        SurfaceView surfaceView = new SurfaceView(getContext());
        this.f1672b0 = surfaceView;
        surfaceView.getHolder().addCallback(this.f1689t0);
        addView(this.f1672b0);
    }

    public final void onLayout(boolean z, int i, int i8, int i9, int i10) {
        v vVar = new v(i9 - i, i10 - i8);
        this.f1680j0 = vVar;
        H5.f fVar = this.f1668U;
        if (fVar != null && fVar.e == null) {
            int displayRotation = getDisplayRotation();
            o oVar = new o(3, (byte) 0);
            oVar.f1139X = new j(1);
            oVar.f1137V = displayRotation;
            oVar.f1138W = vVar;
            this.f1678h0 = oVar;
            oVar.f1139X = getPreviewScalingStrategy();
            H5.f fVar2 = this.f1668U;
            o oVar2 = this.f1678h0;
            fVar2.e = oVar2;
            fVar2.f2178c.f2196h = oVar2;
            b.U();
            if (fVar2.f2180f) {
                fVar2.f2176a.g(fVar2.f2183j);
                boolean z6 = this.f1688s0;
                if (z6) {
                    H5.f fVar3 = this.f1668U;
                    fVar3.getClass();
                    b.U();
                    if (fVar3.f2180f) {
                        fVar3.f2176a.g(new A.b(fVar3, z6, 1));
                    }
                }
            } else {
                throw new IllegalStateException("CameraInstance is not open");
            }
        }
        SurfaceView surfaceView = this.f1672b0;
        if (surfaceView != null) {
            Rect rect = this.f1682l0;
            if (rect == null) {
                surfaceView.layout(0, 0, getWidth(), getHeight());
            } else {
                surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        } else {
            TextureView textureView = this.f1673c0;
            if (textureView != null) {
                textureView.layout(0, 0, getWidth(), getHeight());
            }
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", onSaveInstanceState);
        bundle.putBoolean("torch", this.f1688s0);
        return bundle;
    }

    public void setCameraSettings(i iVar) {
        this.f1679i0 = iVar;
    }

    public void setFramingRectSize(v vVar) {
        this.p0 = vVar;
    }

    public void setMarginFraction(double d8) {
        if (d8 < 0.5d) {
            this.f1686q0 = d8;
            return;
        }
        throw new IllegalArgumentException("The margin fraction must be less than 0.5");
    }

    public void setPreviewScalingStrategy(k kVar) {
        this.f1687r0 = kVar;
    }

    public void setTorch(boolean z) {
        this.f1688s0 = z;
        H5.f fVar = this.f1668U;
        if (fVar != null) {
            b.U();
            if (fVar.f2180f) {
                fVar.f2176a.g(new A.b(fVar, z, 1));
            }
        }
    }

    public void setUseTextureView(boolean z) {
        this.f1671a0 = z;
    }
}
