package o;

import C3.x;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import n.C1228d;

public final class L extends G0 implements O {

    /* renamed from: A0  reason: collision with root package name */
    public int f13854A0;

    /* renamed from: B0  reason: collision with root package name */
    public final /* synthetic */ P f13855B0;

    /* renamed from: x0  reason: collision with root package name */
    public CharSequence f13856x0;

    /* renamed from: y0  reason: collision with root package name */
    public J f13857y0;

    /* renamed from: z0  reason: collision with root package name */
    public final Rect f13858z0 = new Rect();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public L(P p3, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 2130969607);
        this.f13855B0 = p3;
        this.f13831i0 = p3;
        this.f13840s0 = true;
        this.f13841t0.setFocusable(true);
        this.f13832j0 = new x(1, this);
    }

    public final void f(CharSequence charSequence) {
        this.f13856x0 = charSequence;
    }

    public final void i(int i) {
        this.f13854A0 = i;
    }

    public final void k(int i, int i8) {
        ViewTreeObserver viewTreeObserver;
        C1306z zVar = this.f13841t0;
        boolean isShowing = zVar.isShowing();
        r();
        this.f13841t0.setInputMethodMode(2);
        c();
        C1297u0 u0Var = this.f13819W;
        u0Var.setChoiceMode(1);
        u0Var.setTextDirection(i);
        u0Var.setTextAlignment(i8);
        P p3 = this.f13855B0;
        int selectedItemPosition = p3.getSelectedItemPosition();
        C1297u0 u0Var2 = this.f13819W;
        if (zVar.isShowing() && u0Var2 != null) {
            u0Var2.setListSelectionHidden(false);
            u0Var2.setSelection(selectedItemPosition);
            if (u0Var2.getChoiceMode() != 0) {
                u0Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = p3.getViewTreeObserver()) != null) {
            C1228d dVar = new C1228d(3, this);
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
            this.f13841t0.setOnDismissListener(new K(this, dVar));
        }
    }

    public final CharSequence n() {
        return this.f13856x0;
    }

    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.f13857y0 = (J) listAdapter;
    }

    public final void r() {
        int i;
        int i8;
        C1306z zVar = this.f13841t0;
        Drawable background = zVar.getBackground();
        P p3 = this.f13855B0;
        if (background != null) {
            background.getPadding(p3.f13880e0);
            boolean z = w1.f14104a;
            int layoutDirection = p3.getLayoutDirection();
            Rect rect = p3.f13880e0;
            if (layoutDirection == 1) {
                i = rect.right;
            } else {
                i = -rect.left;
            }
        } else {
            Rect rect2 = p3.f13880e0;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = p3.getPaddingLeft();
        int paddingRight = p3.getPaddingRight();
        int width = p3.getWidth();
        int i9 = p3.f13879d0;
        if (i9 == -2) {
            int a8 = p3.a(this.f13857y0, zVar.getBackground());
            int i10 = p3.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = p3.f13880e0;
            int i11 = (i10 - rect3.left) - rect3.right;
            if (a8 > i11) {
                a8 = i11;
            }
            q(Math.max(a8, (width - paddingLeft) - paddingRight));
        } else if (i9 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i9);
        }
        boolean z6 = w1.f14104a;
        if (p3.getLayoutDirection() == 1) {
            i8 = (((width - paddingRight) - this.f13821Y) - this.f13854A0) + i;
        } else {
            i8 = paddingLeft + this.f13854A0 + i;
        }
        this.f13822Z = i8;
    }
}
