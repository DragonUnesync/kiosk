package f0;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import d0.g;

public abstract class q extends C0875c {

    /* renamed from: d0  reason: collision with root package name */
    public boolean f11463d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f11464e0;

    public void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f11457b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f11463d0 = true;
                } else if (index == 13) {
                    this.f11464e0 = true;
                }
            }
        }
    }

    public abstract void h(g gVar, int i, int i8);

    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f11463d0 || this.f11464e0) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f11299V; i++) {
                View view = (View) constraintLayout.f7690U.get(this.f11298U[i]);
                if (view != null) {
                    if (this.f11463d0) {
                        view.setVisibility(visibility);
                    }
                    if (this.f11464e0 && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f8) {
        super.setElevation(f8);
        c();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        c();
    }
}
