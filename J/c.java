package j;

import D7.b;
import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

public final class c extends b {

    /* renamed from: U  reason: collision with root package name */
    public final ObjectAnimator f12798U;

    /* renamed from: V  reason: collision with root package name */
    public final boolean f12799V;

    /* JADX WARNING: type inference failed for: r4v0, types: [j.d, android.animation.TimeInterpolator, java.lang.Object] */
    public c(AnimationDrawable animationDrawable, boolean z, boolean z6) {
        int i;
        int i8;
        int i9;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        if (z) {
            i = numberOfFrames - 1;
        } else {
            i = 0;
        }
        if (z) {
            i8 = 0;
        } else {
            i8 = numberOfFrames - 1;
        }
        ? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f12801b = numberOfFrames2;
        int[] iArr = obj.f12800a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f12800a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f12800a;
        int i10 = 0;
        for (int i11 = 0; i11 < numberOfFrames2; i11++) {
            if (z) {
                i9 = (numberOfFrames2 - i11) - 1;
            } else {
                i9 = i11;
            }
            int duration = animationDrawable.getDuration(i9);
            iArr2[i11] = duration;
            i10 += duration;
        }
        obj.f12802c = i10;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i8});
        ofInt.setAutoCancel(true);
        ofInt.setDuration((long) obj.f12802c);
        ofInt.setInterpolator(obj);
        this.f12799V = z6;
        this.f12798U = ofInt;
    }

    public final void L() {
        this.f12798U.reverse();
    }

    public final void N() {
        this.f12798U.start();
    }

    public final void O() {
        this.f12798U.cancel();
    }

    public final boolean d() {
        return this.f12799V;
    }
}
