package C3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import g2.p;
import h2.C1065f;
import java.util.ArrayList;
import n3.C1245a;
import n3.c;

public final class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f597a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f598b;

    public /* synthetic */ m(int i, Object obj) {
        this.f597a = i;
        this.f598b = obj;
    }

    public void onAnimationCancel(Animator animator) {
        switch (this.f597a) {
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f598b;
                actionBarOverlayLayout.f7439t0 = null;
                actionBarOverlayLayout.f7427g0 = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    public final void onAnimationEnd(Animator animator) {
        switch (this.f597a) {
            case 0:
                n nVar = (n) this.f598b;
                nVar.q();
                nVar.f610r.start();
                return;
            case 1:
                ((p) this.f598b).m();
                animator.removeListener(this);
                return;
            case 2:
                C1065f fVar = (C1065f) this.f598b;
                ArrayList arrayList = new ArrayList(fVar.f12553Y);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C1245a) arrayList.get(i)).f13759b.f13775l0;
                    if (colorStateList != null) {
                        fVar.setTintList(colorStateList);
                    }
                }
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) this.f598b).f9155h = null;
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f598b;
                actionBarOverlayLayout.f7439t0 = null;
                actionBarOverlayLayout.f7427g0 = false;
                return;
        }
    }

    public void onAnimationStart(Animator animator) {
        switch (this.f597a) {
            case 2:
                C1065f fVar = (C1065f) this.f598b;
                ArrayList arrayList = new ArrayList(fVar.f12553Y);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    c cVar = ((C1245a) arrayList.get(i)).f13759b;
                    ColorStateList colorStateList = cVar.f13775l0;
                    if (colorStateList != null) {
                        fVar.setTint(colorStateList.getColorForState(cVar.p0, colorStateList.getDefaultColor()));
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
