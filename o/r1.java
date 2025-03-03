package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import k0.C1131a;
import v0.C1510H;
import v0.C1511I;

public final class r1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: e0  reason: collision with root package name */
    public static r1 f14053e0;

    /* renamed from: f0  reason: collision with root package name */
    public static r1 f14054f0;

    /* renamed from: U  reason: collision with root package name */
    public final View f14055U;

    /* renamed from: V  reason: collision with root package name */
    public final CharSequence f14056V;

    /* renamed from: W  reason: collision with root package name */
    public final int f14057W;

    /* renamed from: X  reason: collision with root package name */
    public final q1 f14058X = new q1(this, 0);

    /* renamed from: Y  reason: collision with root package name */
    public final q1 f14059Y = new q1(this, 1);

    /* renamed from: Z  reason: collision with root package name */
    public int f14060Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f14061a0;

    /* renamed from: b0  reason: collision with root package name */
    public s1 f14062b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f14063c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f14064d0;

    public r1(View view, CharSequence charSequence) {
        int i;
        this.f14055U = view;
        this.f14056V = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = C1511I.f15880a;
        if (Build.VERSION.SDK_INT >= 28) {
            i = C1131a.j(viewConfiguration);
        } else {
            i = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f14057W = i;
        this.f14064d0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(r1 r1Var) {
        r1 r1Var2 = f14053e0;
        if (r1Var2 != null) {
            r1Var2.f14055U.removeCallbacks(r1Var2.f14058X);
        }
        f14053e0 = r1Var;
        if (r1Var != null) {
            r1Var.f14055U.postDelayed(r1Var.f14058X, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        r1 r1Var = f14054f0;
        View view = this.f14055U;
        if (r1Var == this) {
            f14054f0 = null;
            s1 s1Var = this.f14062b0;
            if (s1Var != null) {
                View view2 = (View) s1Var.f14071b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) s1Var.f14070a).getSystemService("window")).removeView(view2);
                }
                this.f14062b0 = null;
                this.f14064d0 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f14053e0 == this) {
            b((r1) null);
        }
        view.removeCallbacks(this.f14059Y);
    }

    public final void c(boolean z) {
        int i;
        int i8;
        int i9;
        String str;
        long j7;
        long longPressTimeout;
        long j8;
        String str2;
        int i10;
        int i11;
        View view = this.f14055U;
        if (view.isAttachedToWindow()) {
            b((r1) null);
            r1 r1Var = f14054f0;
            if (r1Var != null) {
                r1Var.a();
            }
            f14054f0 = this;
            this.f14063c0 = z;
            s1 s1Var = new s1(view.getContext());
            this.f14062b0 = s1Var;
            int i12 = this.f14060Z;
            int i13 = this.f14061a0;
            boolean z6 = this.f14063c0;
            View view2 = (View) s1Var.f14071b;
            ViewParent parent = view2.getParent();
            Context context = (Context) s1Var.f14070a;
            if (!(parent == null || view2.getParent() == null)) {
                ((WindowManager) context.getSystemService("window")).removeView(view2);
            }
            ((TextView) s1Var.f14072c).setText(this.f14056V);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) s1Var.f14073d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(2131166036);
            if (view.getWidth() < dimensionPixelOffset) {
                i12 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(2131166035);
                i = i13 + dimensionPixelOffset2;
                i8 = i13 - dimensionPixelOffset2;
            } else {
                i = view.getHeight();
                i8 = 0;
            }
            layoutParams.gravity = 49;
            Resources resources = context.getResources();
            if (z6) {
                i9 = 2131166039;
            } else {
                i9 = 2131166038;
            }
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i9);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context2 = view.getContext();
                while (true) {
                    if (!(context2 instanceof ContextWrapper)) {
                        break;
                    } else if (context2 instanceof Activity) {
                        rootView = ((Activity) context2).getWindow().getDecorView();
                        break;
                    } else {
                        context2 = ((ContextWrapper) context2).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str = "window";
            } else {
                Rect rect = (Rect) s1Var.e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str2 = "window";
                    i10 = 0;
                } else {
                    Resources resources2 = context.getResources();
                    str2 = "window";
                    int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier != 0) {
                        i11 = resources2.getDimensionPixelSize(identifier);
                    } else {
                        i11 = 0;
                    }
                    DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                    i10 = 0;
                    rect.set(0, i11, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) s1Var.f14075g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) s1Var.f14074f;
                view.getLocationOnScreen(iArr2);
                int i14 = iArr2[i10] - iArr[i10];
                iArr2[i10] = i14;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams.x = (i14 + i12) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, i10);
                view2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i15 = iArr2[1];
                int i16 = ((i8 + i15) - dimensionPixelOffset3) - measuredHeight;
                int i17 = i15 + i + dimensionPixelOffset3;
                if (z6) {
                    if (i16 >= 0) {
                        layoutParams.y = i16;
                    } else {
                        layoutParams.y = i17;
                    }
                } else if (measuredHeight + i17 <= rect.height()) {
                    layoutParams.y = i17;
                } else {
                    layoutParams.y = i16;
                }
                str = str2;
            }
            ((WindowManager) context.getSystemService(str)).addView(view2, layoutParams);
            view.addOnAttachStateChangeListener(this);
            if (this.f14063c0) {
                j7 = 2500;
            } else {
                WeakHashMap weakHashMap = C1510H.f15874a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j8 = 3000;
                } else {
                    longPressTimeout = (long) ViewConfiguration.getLongPressTimeout();
                    j8 = 15000;
                }
                j7 = j8 - longPressTimeout;
            }
            q1 q1Var = this.f14059Y;
            view.removeCallbacks(q1Var);
            view.postDelayed(q1Var, j7);
        }
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        int i;
        if (this.f14062b0 != null && this.f14063c0) {
            return false;
        }
        View view2 = this.f14055U;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                this.f14064d0 = true;
                a();
            }
        } else if (view2.isEnabled() && this.f14062b0 == null) {
            int x8 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (this.f14064d0 || Math.abs(x8 - this.f14060Z) > (i = this.f14057W) || Math.abs(y8 - this.f14061a0) > i) {
                this.f14060Z = x8;
                this.f14061a0 = y8;
                this.f14064d0 = false;
                b(this);
            }
        }
        return false;
    }

    public final boolean onLongClick(View view) {
        this.f14060Z = view.getWidth() / 2;
        this.f14061a0 = view.getHeight() / 2;
        c(true);
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
