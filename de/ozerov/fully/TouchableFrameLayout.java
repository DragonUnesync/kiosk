package de.ozerov.fully;

import android.content.Context;
import android.media.SoundPool;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class TouchableFrameLayout extends FrameLayout {

    /* renamed from: f0  reason: collision with root package name */
    public static long f10399f0;

    /* renamed from: g0  reason: collision with root package name */
    public static long f10400g0;

    /* renamed from: h0  reason: collision with root package name */
    public static long f10401h0;

    /* renamed from: i0  reason: collision with root package name */
    public static int f10402i0;

    /* renamed from: j0  reason: collision with root package name */
    public static int f10403j0;

    /* renamed from: U  reason: collision with root package name */
    public final Context f10404U;

    /* renamed from: V  reason: collision with root package name */
    public FullyActivity f10405V;

    /* renamed from: W  reason: collision with root package name */
    public SoundPool f10406W;

    /* renamed from: a0  reason: collision with root package name */
    public int f10407a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f10408b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f10409c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f10410d0 = -1;

    /* renamed from: e0  reason: collision with root package name */
    public long f10411e0 = -1;

    public TouchableFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f10404U = context;
        setClickable(true);
        setFocusable(false);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        long j7;
        long j8;
        int i;
        int i8;
        int i9;
        C0800x0 x0Var;
        if (motionEvent.getAction() == 0) {
            this.f10410d0 = System.currentTimeMillis();
            this.f10408b0 = motionEvent.getX();
            this.f10409c0 = motionEvent.getY();
            if (C0794w0.f11017a && (x0Var = C0794w0.f11018b) != null) {
                x0Var.f11063m++;
            }
        }
        if (motionEvent.getAction() == 1 && Math.abs(motionEvent.getX() - this.f10408b0) < 10.0f && Math.abs(motionEvent.getY() - this.f10409c0) < 10.0f) {
            long currentTimeMillis = System.currentTimeMillis();
            long j9 = this.f10410d0;
            if (j9 == -1 || currentTimeMillis - j9 >= 300) {
                j7 = currentTimeMillis;
            } else {
                SoundPool soundPool = this.f10406W;
                if (soundPool != null) {
                    soundPool.play(this.f10407a0, 1.0f, 1.0f, 0, 0, 1.0f);
                }
                if (System.currentTimeMillis() - f10400g0 > 1250) {
                    f10402i0 = 1;
                    f10400g0 = System.currentTimeMillis();
                } else {
                    f10402i0++;
                }
                int i10 = f10402i0;
                Context context = this.f10404U;
                if (i10 >= 5) {
                    if (this.f10405V.f9961z0.b0().equals(context.getResources().getString(2131951777))) {
                        this.f10405V.f9921J0.b();
                    }
                    f10402i0 = 0;
                }
                if (f10403j0 < 2 || System.currentTimeMillis() - f10401h0 >= 3000 || !this.f10405V.f9961z0.b0().equals(context.getResources().getString(2131951779))) {
                    j8 = currentTimeMillis;
                } else {
                    int width = getWidth();
                    int height = getHeight();
                    float x8 = motionEvent.getX();
                    float y8 = motionEvent.getY();
                    double d8 = (double) x8;
                    double d9 = (double) width;
                    if (d8 < d9 * 0.2d) {
                        j8 = currentTimeMillis;
                        if (((double) y8) > ((double) height) * 0.8d && (i9 = f10403j0) == 2) {
                            f10403j0 = i9 + 1;
                        }
                    } else {
                        j8 = currentTimeMillis;
                    }
                    if (d8 > d9 * 0.8d && ((double) y8) < ((double) height) * 0.2d && (i8 = f10403j0) == 3) {
                        f10403j0 = i8 + 1;
                        f10401h0 = 0;
                        this.f10405V.f9921J0.b();
                    }
                }
                long j10 = this.f10411e0;
                if (j10 != -1 && j8 - j10 < 300) {
                    int width2 = getWidth();
                    int height2 = getHeight();
                    if (width2 > height2) {
                        i = width2;
                    } else {
                        i = height2;
                    }
                    int i11 = i / 5;
                    float x9 = motionEvent.getX();
                    float y9 = motionEvent.getY();
                    float f8 = (float) i11;
                    if (x9 < f8 && y9 < f8) {
                        f10399f0 = System.currentTimeMillis();
                    } else if (x9 <= ((float) (width2 - i11)) || y9 <= ((float) (height2 - i11)) || System.currentTimeMillis() - f10399f0 >= 3000) {
                        f10399f0 = 0;
                    } else {
                        f10399f0 = 0;
                        if (this.f10405V.f9961z0.b0().equals(context.getResources().getString(2131951776))) {
                            this.f10405V.f9921J0.b();
                        }
                    }
                }
                j7 = j8;
            }
            this.f10411e0 = j7;
        }
        FullyActivity fullyActivity = this.f10405V;
        if (fullyActivity.f9955r1) {
            fullyActivity.f9919H0.d(true);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setEnableTapSound(boolean z) {
        if (!z) {
            SoundPool soundPool = this.f10406W;
            if (soundPool != null) {
                soundPool.release();
                this.f10406W = null;
            }
        } else if (this.f10406W == null) {
            SoundPool soundPool2 = new SoundPool(3, 3, 0);
            this.f10406W = soundPool2;
            this.f10407a0 = soundPool2.load(this.f10404U, 2131886080, 0);
        }
    }

    public void setFullyActivity(FullyActivity fullyActivity) {
        this.f10405V = fullyActivity;
    }
}
