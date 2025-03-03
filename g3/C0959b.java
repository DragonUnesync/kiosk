package g3;

import Y.i;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;

/* renamed from: g3.b  reason: case insensitive filesystem */
public final class C0959b {

    /* renamed from: a  reason: collision with root package name */
    public final i f12009a = new i((Object) null);

    /* renamed from: b  reason: collision with root package name */
    public final i f12010b = new i((Object) null);

    public static C0959b a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, g3.c] */
    public static C0959b b(ArrayList arrayList) {
        C0959b bVar = new C0959b();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                bVar.f12010b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C0958a.f12006b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C0958a.f12007c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C0958a.f12008d;
                }
                ? obj = new Object();
                obj.f12014d = 0;
                obj.e = 1;
                obj.f12011a = startDelay;
                obj.f12012b = duration;
                obj.f12013c = interpolator;
                obj.f12014d = objectAnimator.getRepeatCount();
                obj.e = objectAnimator.getRepeatMode();
                bVar.f12009a.put(propertyName, obj);
                i++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0959b)) {
            return false;
        }
        return this.f12009a.equals(((C0959b) obj).f12009a);
    }

    public final int hashCode() {
        return this.f12009a.hashCode();
    }

    public final String toString() {
        return "\n" + C0959b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f12009a + "}\n";
    }
}
