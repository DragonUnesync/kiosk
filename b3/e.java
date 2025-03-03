package B3;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import t3.k;

public final class e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f396U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ k f397V;

    public /* synthetic */ e(k kVar, int i) {
        this.f396U = i;
        this.f397V = kVar;
    }

    public final void run() {
        Rect rect;
        k kVar = this.f397V;
        switch (this.f396U) {
            case 0:
                if (kVar.i != null) {
                    Context context = kVar.f424h;
                    int i = k.f15464d;
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        rect = windowManager.getCurrentWindowMetrics().getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    j jVar = kVar.i;
                    jVar.getLocationInWindow(iArr);
                    int height2 = (height - (jVar.getHeight() + iArr[1])) + ((int) jVar.getTranslationY());
                    int i8 = kVar.f431p;
                    if (height2 >= i8) {
                        kVar.f432q = i8;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = jVar.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w(k.z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    int i9 = kVar.f431p;
                    kVar.f432q = i9;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (i9 - height2) + marginLayoutParams.bottomMargin;
                    jVar.requestLayout();
                    return;
                }
                return;
            case 1:
                kVar.b();
                return;
            default:
                j jVar2 = kVar.i;
                if (jVar2 != null) {
                    ViewParent parent = jVar2.getParent();
                    j jVar3 = kVar.i;
                    if (parent != null) {
                        jVar3.setVisibility(0);
                    }
                    if (jVar3.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                        ofFloat.setInterpolator(kVar.f421d);
                        ofFloat.addUpdateListener(new c(kVar, 0, (byte) 0));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                        ofFloat2.setInterpolator(kVar.f422f);
                        ofFloat2.addUpdateListener(new c(kVar, 1, (byte) 0));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                        animatorSet.setDuration((long) kVar.f418a);
                        animatorSet.addListener(new b(kVar, 3));
                        animatorSet.start();
                        return;
                    }
                    int height3 = jVar3.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = jVar3.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    jVar3.setTranslationY((float) height3);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(new int[]{height3, 0});
                    valueAnimator.setInterpolator(kVar.e);
                    valueAnimator.setDuration((long) kVar.f420c);
                    valueAnimator.addListener(new b(kVar, 1));
                    valueAnimator.addUpdateListener(new c(kVar, height3));
                    valueAnimator.start();
                    return;
                }
                return;
        }
    }
}
