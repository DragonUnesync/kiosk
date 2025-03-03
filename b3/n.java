package B3;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;

public final class n extends k {

    /* renamed from: C  reason: collision with root package name */
    public static final int[] f439C = {2130969601, 2130969603};

    /* renamed from: A  reason: collision with root package name */
    public final AccessibilityManager f440A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f441B;

    public n(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f440A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static n f(View view, String str, int i) {
        ViewGroup viewGroup;
        int i8;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() == 16908290) {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                    viewGroup2 = (ViewGroup) view;
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            LayoutInflater from = LayoutInflater.from(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f439C);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            if (resourceId == -1 || resourceId2 == -1) {
                i8 = 2131558446;
            } else {
                i8 = 2131558545;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i8, viewGroup, false);
            n nVar = new n(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) nVar.i.getChildAt(0)).getMessageView().setText(str);
            nVar.f426k = i;
            return nVar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    public final void g(String str, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.i.getChildAt(0)).getActionView();
        if (!TextUtils.isEmpty(str)) {
            this.f441B = true;
            actionView.setVisibility(0);
            actionView.setText(str);
            actionView.setOnClickListener(new m(this, 0, onClickListener));
            return;
        }
        actionView.setVisibility(8);
        actionView.setOnClickListener((View.OnClickListener) null);
        this.f441B = false;
    }

    public final void h() {
        int i;
        q K4 = q.K();
        int i8 = this.f426k;
        boolean z = false;
        int i9 = -2;
        if (i8 != -2) {
            int i10 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.f440A;
            if (i10 >= 29) {
                if (this.f441B) {
                    i = 4;
                } else {
                    i = 0;
                }
                i9 = accessibilityManager.getRecommendedTimeoutMillis(i8, i | 3);
            } else {
                if (this.f441B && accessibilityManager.isTouchExplorationEnabled()) {
                    i8 = -2;
                }
                i9 = i8;
            }
        }
        h hVar = this.f435t;
        synchronized (K4.f449U) {
            try {
                if (K4.R(hVar)) {
                    p pVar = (p) K4.f451W;
                    pVar.f445b = i9;
                    ((Handler) K4.f450V).removeCallbacksAndMessages(pVar);
                    K4.j0((p) K4.f451W);
                    return;
                }
                p pVar2 = (p) K4.f452X;
                if (pVar2 != null && pVar2.f444a.get() == hVar) {
                    z = true;
                }
                if (z) {
                    ((p) K4.f452X).f445b = i9;
                } else {
                    K4.f452X = new p(i9, hVar);
                }
                p pVar3 = (p) K4.f451W;
                if (pVar3 == null || !K4.p(pVar3, 4)) {
                    K4.f451W = null;
                    K4.o0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
