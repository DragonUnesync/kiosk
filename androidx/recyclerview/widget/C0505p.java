package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import java.util.WeakHashMap;
import v0.C1510H;

/* renamed from: androidx.recyclerview.widget.p  reason: case insensitive filesystem */
public final class C0505p extends N implements V {

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f8460C = {16842919};

    /* renamed from: D  reason: collision with root package name */
    public static final int[] f8461D = new int[0];

    /* renamed from: A  reason: collision with root package name */
    public int f8462A;

    /* renamed from: B  reason: collision with root package name */
    public final C0501l f8463B;

    /* renamed from: a  reason: collision with root package name */
    public final int f8464a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8465b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f8466c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f8467d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8468f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f8469g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f8470h;
    public final int i;

    /* renamed from: j  reason: collision with root package name */
    public final int f8471j;

    /* renamed from: k  reason: collision with root package name */
    public int f8472k;

    /* renamed from: l  reason: collision with root package name */
    public int f8473l;

    /* renamed from: m  reason: collision with root package name */
    public float f8474m;

    /* renamed from: n  reason: collision with root package name */
    public int f8475n;

    /* renamed from: o  reason: collision with root package name */
    public int f8476o;

    /* renamed from: p  reason: collision with root package name */
    public float f8477p;

    /* renamed from: q  reason: collision with root package name */
    public int f8478q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f8479r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final RecyclerView f8480s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f8481t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f8482u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f8483v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f8484w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f8485x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f8486y = new int[2];
    public final ValueAnimator z;

    public C0505p(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i8, int i9, int i10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z = ofFloat;
        this.f8462A = 0;
        C0501l lVar = new C0501l(0, this);
        this.f8463B = lVar;
        C0502m mVar = new C0502m(this);
        this.f8466c = stateListDrawable;
        this.f8467d = drawable;
        this.f8469g = stateListDrawable2;
        this.f8470h = drawable2;
        this.e = Math.max(i8, stateListDrawable.getIntrinsicWidth());
        this.f8468f = Math.max(i8, drawable.getIntrinsicWidth());
        this.i = Math.max(i8, stateListDrawable2.getIntrinsicWidth());
        this.f8471j = Math.max(i8, drawable2.getIntrinsicWidth());
        this.f8464a = i9;
        this.f8465b = i10;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0503n(this));
        ofFloat.addUpdateListener(new C0504o(this));
        RecyclerView recyclerView2 = this.f8480s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.f8480s.removeOnItemTouchListener(this);
                this.f8480s.removeOnScrollListener(mVar);
                this.f8480s.removeCallbacks(lVar);
            }
            this.f8480s = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.f8480s.addOnItemTouchListener(this);
                this.f8480s.addOnScrollListener(mVar);
            }
        }
    }

    public static int c(float f8, float f9, int[] iArr, int i8, int i9, int i10) {
        int i11 = iArr[1] - iArr[0];
        if (i11 == 0) {
            return 0;
        }
        int i12 = i8 - i10;
        int i13 = (int) (((f9 - f8) / ((float) i11)) * ((float) i12));
        int i14 = i9 + i13;
        if (i14 >= i12 || i14 < 0) {
            return 0;
        }
        return i13;
    }

    public final boolean a(float f8, float f9) {
        if (f9 >= ((float) (this.f8479r - this.i))) {
            int i8 = this.f8476o;
            int i9 = this.f8475n;
            if (f8 < ((float) (i8 - (i9 / 2))) || f8 > ((float) ((i9 / 2) + i8))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean b(float f8, float f9) {
        boolean z6;
        RecyclerView recyclerView = this.f8480s;
        WeakHashMap weakHashMap = C1510H.f15874a;
        if (recyclerView.getLayoutDirection() == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        int i8 = this.e;
        if (z6) {
            if (f8 > ((float) i8)) {
                return false;
            }
        } else if (f8 < ((float) (this.f8478q - i8))) {
            return false;
        }
        int i9 = this.f8473l;
        int i10 = this.f8472k / 2;
        if (f9 < ((float) (i9 - i10)) || f9 > ((float) (i10 + i9))) {
            return false;
        }
        return true;
    }

    public final void d(int i8) {
        C0501l lVar = this.f8463B;
        StateListDrawable stateListDrawable = this.f8466c;
        if (i8 == 2 && this.f8483v != 2) {
            stateListDrawable.setState(f8460C);
            this.f8480s.removeCallbacks(lVar);
        }
        if (i8 == 0) {
            this.f8480s.invalidate();
        } else {
            e();
        }
        if (this.f8483v == 2 && i8 != 2) {
            stateListDrawable.setState(f8461D);
            this.f8480s.removeCallbacks(lVar);
            this.f8480s.postDelayed(lVar, (long) 1200);
        } else if (i8 == 1) {
            this.f8480s.removeCallbacks(lVar);
            this.f8480s.postDelayed(lVar, (long) 1500);
        }
        this.f8483v = i8;
    }

    public final void e() {
        int i8 = this.f8462A;
        ValueAnimator valueAnimator = this.z;
        if (i8 != 0) {
            if (i8 == 3) {
                valueAnimator.cancel();
            } else {
                return;
            }
        }
        this.f8462A = 1;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        valueAnimator.setDuration(500);
        valueAnimator.setStartDelay(0);
        valueAnimator.start();
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, f0 f0Var) {
        int i8 = this.f8478q;
        RecyclerView recyclerView2 = this.f8480s;
        if (i8 != recyclerView2.getWidth() || this.f8479r != recyclerView2.getHeight()) {
            this.f8478q = recyclerView2.getWidth();
            this.f8479r = recyclerView2.getHeight();
            d(0);
        } else if (this.f8462A != 0) {
            if (this.f8481t) {
                int i9 = this.f8478q;
                int i10 = this.e;
                int i11 = i9 - i10;
                int i12 = this.f8473l;
                int i13 = this.f8472k;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable = this.f8466c;
                stateListDrawable.setBounds(0, 0, i10, i13);
                int i15 = this.f8479r;
                int i16 = this.f8468f;
                Drawable drawable = this.f8467d;
                drawable.setBounds(0, 0, i16, i15);
                WeakHashMap weakHashMap = C1510H.f15874a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate((float) i10, (float) i14);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate((float) (-i10), (float) (-i14));
                } else {
                    canvas.translate((float) i11, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, (float) i14);
                    stateListDrawable.draw(canvas);
                    canvas.translate((float) (-i11), (float) (-i14));
                }
            }
            if (this.f8482u) {
                int i17 = this.f8479r;
                int i18 = this.i;
                int i19 = i17 - i18;
                int i20 = this.f8476o;
                int i21 = this.f8475n;
                int i22 = i20 - (i21 / 2);
                StateListDrawable stateListDrawable2 = this.f8469g;
                stateListDrawable2.setBounds(0, 0, i21, i18);
                int i23 = this.f8478q;
                int i24 = this.f8471j;
                Drawable drawable2 = this.f8470h;
                drawable2.setBounds(0, 0, i23, i24);
                canvas.translate(0.0f, (float) i19);
                drawable2.draw(canvas);
                canvas.translate((float) i22, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate((float) (-i22), (float) (-i19));
            }
        }
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i8 = this.f8483v;
        if (i8 == 1) {
            boolean b8 = b(motionEvent.getX(), motionEvent.getY());
            boolean a8 = a(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!b8 && !a8) {
                return false;
            }
            if (a8) {
                this.f8484w = 1;
                this.f8477p = (float) ((int) motionEvent.getX());
            } else if (b8) {
                this.f8484w = 2;
                this.f8474m = (float) ((int) motionEvent.getY());
            }
            d(2);
        } else if (i8 == 2) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean z6) {
    }

    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f8483v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b8 = b(motionEvent.getX(), motionEvent.getY());
                boolean a8 = a(motionEvent.getX(), motionEvent.getY());
                if (b8 || a8) {
                    if (a8) {
                        this.f8484w = 1;
                        this.f8477p = (float) ((int) motionEvent.getX());
                    } else if (b8) {
                        this.f8484w = 2;
                        this.f8474m = (float) ((int) motionEvent.getY());
                    }
                    d(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f8483v == 2) {
                this.f8474m = 0.0f;
                this.f8477p = 0.0f;
                d(1);
                this.f8484w = 0;
            } else if (motionEvent.getAction() == 2 && this.f8483v == 2) {
                e();
                int i8 = this.f8484w;
                int i9 = this.f8465b;
                if (i8 == 1) {
                    float x8 = motionEvent.getX();
                    int[] iArr = this.f8486y;
                    iArr[0] = i9;
                    int i10 = this.f8478q - i9;
                    iArr[1] = i10;
                    float max = Math.max((float) i9, Math.min((float) i10, x8));
                    if (Math.abs(((float) this.f8476o) - max) >= 2.0f) {
                        int c8 = c(this.f8477p, max, iArr, this.f8480s.computeHorizontalScrollRange(), this.f8480s.computeHorizontalScrollOffset(), this.f8478q);
                        if (c8 != 0) {
                            this.f8480s.scrollBy(c8, 0);
                        }
                        this.f8477p = max;
                    }
                }
                if (this.f8484w == 2) {
                    float y8 = motionEvent.getY();
                    int[] iArr2 = this.f8485x;
                    iArr2[0] = i9;
                    int i11 = this.f8479r - i9;
                    iArr2[1] = i11;
                    float max2 = Math.max((float) i9, Math.min((float) i11, y8));
                    if (Math.abs(((float) this.f8473l) - max2) >= 2.0f) {
                        int c9 = c(this.f8474m, max2, iArr2, this.f8480s.computeVerticalScrollRange(), this.f8480s.computeVerticalScrollOffset(), this.f8479r);
                        if (c9 != 0) {
                            this.f8480s.scrollBy(0, c9);
                        }
                        this.f8474m = max2;
                    }
                }
            }
        }
    }
}
