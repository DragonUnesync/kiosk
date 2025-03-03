package o;

import A.f;
import A1.d;
import E0.b;
import E0.e;
import E0.h;
import E0.i;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import androidx.emoji2.text.j;
import d4.k;
import g.C0940a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n0.C1233b;
import n0.C1234c;
import n2.a;

/* renamed from: o.A  reason: case insensitive filesystem */
public class C1248A {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f13792d = {16843067, 16843068};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13793a = 2;

    /* renamed from: b  reason: collision with root package name */
    public View f13794b;

    /* renamed from: c  reason: collision with root package name */
    public Object f13795c;

    public /* synthetic */ C1248A() {
    }

    public KeyListener a(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((d) ((f) this.f13795c).f17V).getClass();
        if (keyListener instanceof e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new e(keyListener);
    }

    /* JADX INFO: finally extract failed */
    public void b(AttributeSet attributeSet, int i) {
        switch (this.f13793a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f13794b;
                k K22 = k.K2(absSeekBar.getContext(), attributeSet, f13792d, i);
                Drawable J8 = K22.J(0);
                if (J8 != null) {
                    if (J8 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) J8;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i8 = 0; i8 < numberOfFrames; i8++) {
                            Drawable e = e(animationDrawable.getFrame(i8), true);
                            e.setLevel(10000);
                            animationDrawable2.addFrame(e, animationDrawable.getDuration(i8));
                        }
                        animationDrawable2.setLevel(10000);
                        J8 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(J8);
                }
                Drawable J9 = K22.J(1);
                if (J9 != null) {
                    absSeekBar.setProgressDrawable(e(J9, false));
                }
                K22.M2();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f13794b).getContext().obtainStyledAttributes(attributeSet, C0940a.i, i, 0);
                try {
                    boolean z = true;
                    if (obtainStyledAttributes.hasValue(14)) {
                        z = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    d(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public b c(InputConnection inputConnection, EditorInfo editorInfo) {
        f fVar = (f) this.f13795c;
        if (inputConnection == null) {
            fVar.getClass();
            inputConnection = null;
        } else {
            d dVar = (d) fVar.f17V;
            dVar.getClass();
            if (!(inputConnection instanceof b)) {
                inputConnection = new b((EditText) dVar.f35V, inputConnection, editorInfo);
            }
        }
        return (b) inputConnection;
    }

    public void d(boolean z) {
        i iVar = (i) ((d) ((f) this.f13795c).f17V).f36W;
        if (iVar.f1314W != z) {
            if (iVar.f1313V != null) {
                j a8 = j.a();
                h hVar = iVar.f1313V;
                a8.getClass();
                a.l(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a8.f7793a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a8.f7794b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.f1314W = z;
            if (z) {
                i.a(iVar.f1312U, j.a().b());
            }
        }
    }

    public Drawable e(Drawable drawable, boolean z) {
        boolean z6;
        if (drawable instanceof C1233b) {
            C1234c cVar = (C1234c) ((C1233b) drawable);
            Drawable drawable2 = cVar.f13560Z;
            if (drawable2 != null) {
                cVar.h(e(drawable2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable3 = layerDrawable.getDrawable(i);
                if (id == 16908301 || id == 16908303) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                drawableArr[i] = e(drawable3, z6);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i8 = 0; i8 < numberOfLayers; i8++) {
                layerDrawable2.setId(i8, layerDrawable.getId(i8));
                if (Build.VERSION.SDK_INT >= 23) {
                    I.a.w(layerDrawable, layerDrawable2, i8);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f13795c) == null) {
                this.f13795c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public C1248A(AbsSeekBar absSeekBar) {
        this.f13794b = absSeekBar;
    }

    public C1248A(EditText editText) {
        this.f13794b = editText;
        this.f13795c = new f(editText);
    }
}
