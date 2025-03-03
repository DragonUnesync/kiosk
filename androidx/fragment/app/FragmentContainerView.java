package androidx.fragment.app;

import G0.a;
import N.e;
import P6.f;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import h.C1022j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import v0.C1510H;
import v0.C1551x;
import v0.j0;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: U  reason: collision with root package name */
    public final ArrayList f7846U = new ArrayList();

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f7847V = new ArrayList();

    /* renamed from: W  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f7848W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f7849a0 = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        f.e(context, "context");
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1626b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    public final void a(View view) {
        if (this.f7847V.contains(view)) {
            this.f7846U.add(view);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C0470v vVar;
        f.e(view, "child");
        Object tag = view.getTag(2131362118);
        if (tag instanceof C0470v) {
            vVar = (C0470v) tag;
        } else {
            vVar = null;
        }
        if (vVar != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        j0 j0Var;
        f.e(windowInsets, "insets");
        j0 g8 = j0.g((View) null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f7848W;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            f.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            j0Var = j0.g((View) null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = C1510H.f15874a;
            WindowInsets f8 = g8.f();
            if (f8 != null) {
                WindowInsets b8 = C1551x.b(this, f8);
                if (!b8.equals(f8)) {
                    g8 = j0.g(this, b8);
                }
            }
            j0Var = g8;
        }
        if (!j0Var.f15952a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = C1510H.f15874a;
                WindowInsets f9 = j0Var.f();
                if (f9 != null) {
                    WindowInsets a8 = C1551x.a(childAt, f9);
                    if (!a8.equals(f9)) {
                        j0.g(childAt, a8);
                    }
                }
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        f.e(canvas, "canvas");
        if (this.f7849a0) {
            Iterator it = this.f7846U.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long j7) {
        f.e(canvas, "canvas");
        f.e(view, "child");
        if (this.f7849a0) {
            ArrayList arrayList = this.f7846U;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j7);
    }

    public final void endViewTransition(View view) {
        f.e(view, "view");
        this.f7847V.remove(view);
        if (this.f7846U.remove(view)) {
            this.f7849a0 = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends C0470v> F getFragment() {
        C1022j jVar;
        C0470v vVar;
        L l8;
        View view = this;
        while (true) {
            jVar = null;
            if (view == null) {
                vVar = null;
                break;
            }
            Object tag = view.getTag(2131362118);
            if (tag instanceof C0470v) {
                vVar = (C0470v) tag;
            } else {
                vVar = null;
            }
            if (vVar != null) {
                break;
            }
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        if (vVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof C1022j) {
                    jVar = (C1022j) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (jVar != null) {
                l8 = jVar.l();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        } else if (vVar.p()) {
            l8 = vVar.i();
        } else {
            throw new IllegalStateException("The Fragment " + vVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        return l8.B(getId());
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        f.e(windowInsets, "insets");
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                f.d(childAt, "view");
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    public final void removeView(View view) {
        f.e(view, "view");
        a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        f.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i);
    }

    public final void removeViewInLayout(View view) {
        f.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int i, int i8) {
        int i9 = i + i8;
        for (int i10 = i; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            f.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i, i8);
    }

    public final void removeViewsInLayout(int i, int i8) {
        int i9 = i + i8;
        for (int i10 = i; i10 < i9; i10++) {
            View childAt = getChildAt(i10);
            f.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i, i8);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.f7849a0 = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        f.e(onApplyWindowInsetsListener, "listener");
        this.f7848W = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        f.e(view, "view");
        if (view.getParent() == this) {
            this.f7847V.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, L l8) {
        super(context, attributeSet);
        View view;
        C1022j jVar;
        f.e(context, "context");
        f.e(attributeSet, "attrs");
        f.e(l8, "fm");
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1626b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        C0470v B8 = l8.B(id);
        if (classAttribute != null && B8 == null) {
            if (id == -1) {
                throw new IllegalStateException(e.y("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            F I8 = l8.I();
            context.getClassLoader();
            C0470v a8 = I8.a(classAttribute);
            f.d(a8, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a8.f8081r0 = id;
            a8.f8082s0 = id;
            a8.f8083t0 = string;
            a8.f8078n0 = l8;
            C0472x xVar = l8.f7893w;
            a8.f8079o0 = xVar;
            a8.f8088y0 = true;
            if (xVar == null) {
                jVar = null;
            } else {
                jVar = xVar.f8092d0;
            }
            if (jVar != null) {
                a8.f8088y0 = true;
            }
            C0450a aVar = new C0450a(l8);
            aVar.f7968p = true;
            a8.f8089z0 = this;
            a8.f8074j0 = true;
            aVar.f(getId(), a8, string, 1);
            if (!aVar.f7960g) {
                aVar.f7961h = false;
                L l9 = aVar.f7970r;
                if (l9.f7893w != null && !l9.f7866J) {
                    l9.y(true);
                    C0450a aVar2 = l9.f7879h;
                    if (aVar2 != null) {
                        aVar2.f7971s = false;
                        aVar2.d();
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Log.d("FragmentManager", "Reversing mTransitioningOp " + l9.f7879h + " as part of execSingleAction for action " + aVar);
                        }
                        l9.f7879h.e(false, false);
                        l9.f7879h.a(l9.f7868L, l9.f7869M);
                        Iterator it = l9.f7879h.f7955a.iterator();
                        while (it.hasNext()) {
                            C0470v vVar = ((S) it.next()).f7929b;
                            if (vVar != null) {
                                vVar.f8071g0 = false;
                            }
                        }
                        l9.f7879h = null;
                    }
                    aVar.a(l9.f7868L, l9.f7869M);
                    l9.f7874b = true;
                    try {
                        l9.V(l9.f7868L, l9.f7869M);
                        l9.d();
                        l9.g0();
                        if (l9.f7867K) {
                            l9.f7867K = false;
                            l9.e0();
                        }
                        ((HashMap) l9.f7875c.f450V).values().removeAll(Collections.singleton((Object) null));
                    } catch (Throwable th) {
                        l9.d();
                        throw th;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it2 = l8.f7875c.G().iterator();
        while (it2.hasNext()) {
            Q q7 = (Q) it2.next();
            C0470v vVar2 = q7.f7926c;
            if (vVar2.f8082s0 == getId() && (view = vVar2.f8045A0) != null && view.getParent() == null) {
                vVar2.f8089z0 = this;
                q7.b();
                q7.k();
            }
        }
    }
}
