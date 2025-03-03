package h;

import B3.q;
import F.h;
import Y.i;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import de.ozerov.fully.K2;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import m.C1182a;
import m.C1184c;
import m.C1186e;
import m.C1192k;
import m.C1193l;
import m.C1194m;
import n.m;
import v0.C1510H;
import v0.C1514L;
import v0.C1551x;

public final class w implements Window.Callback {

    /* renamed from: U  reason: collision with root package name */
    public final Window.Callback f12236U;

    /* renamed from: V  reason: collision with root package name */
    public C1006G f12237V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f12238W;

    /* renamed from: X  reason: collision with root package name */
    public boolean f12239X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f12240Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C1000A f12241Z;

    public w(C1000A a8, Window.Callback callback) {
        this.f12241Z = a8;
        if (callback != null) {
            this.f12236U = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* JADX INFO: finally extract failed */
    public final void a(Window.Callback callback) {
        try {
            this.f12238W = true;
            callback.onContentChanged();
            this.f12238W = false;
        } catch (Throwable th) {
            this.f12238W = false;
            throw th;
        }
    }

    public final boolean b(int i, Menu menu) {
        return this.f12236U.onMenuOpened(i, menu);
    }

    public final void c(int i, Menu menu) {
        this.f12236U.onPanelClosed(i, menu);
    }

    public final void d(List list, Menu menu, int i) {
        C1193l.a(this.f12236U, list, menu, i);
    }

    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f12236U.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z = this.f12239X;
        Window.Callback callback = this.f12236U;
        if (z) {
            return callback.dispatchKeyEvent(keyEvent);
        }
        if (this.f12241Z.v(keyEvent) || callback.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (this.f12236U.dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        C1000A a8 = this.f12241Z;
        a8.C();
        b bVar = a8.f12082i0;
        if (bVar != null && bVar.y(keyCode, keyEvent)) {
            return true;
        }
        z zVar = a8.f12056G0;
        if (zVar == null || !a8.H(zVar, keyEvent.getKeyCode(), keyEvent)) {
            if (a8.f12056G0 == null) {
                z B8 = a8.B(0);
                a8.I(B8, keyEvent);
                boolean H8 = a8.H(B8, keyEvent.getKeyCode(), keyEvent);
                B8.f12254k = false;
                if (H8) {
                    return true;
                }
            }
            return false;
        }
        z zVar2 = a8.f12056G0;
        if (zVar2 == null) {
            return true;
        }
        zVar2.f12255l = true;
        return true;
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f12236U.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f12236U.dispatchTouchEvent(motionEvent);
    }

    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f12236U.dispatchTrackballEvent(motionEvent);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, B3.q] */
    /* JADX WARNING: type inference failed for: r5v10, types: [m.a, m.d, java.lang.Object, n.k] */
    public final C1186e e(ActionMode.Callback callback) {
        boolean z;
        ViewGroup viewGroup;
        Context context;
        C1000A a8 = this.f12241Z;
        Context context2 = a8.f12078e0;
        ? obj = new Object();
        obj.f450V = context2;
        obj.f449U = callback;
        obj.f451W = new ArrayList();
        obj.f452X = new i((Object) null);
        C1182a aVar = a8.f12088o0;
        if (aVar != null) {
            aVar.a();
        }
        K2 k22 = new K2(12, a8, obj, false);
        a8.C();
        b bVar = a8.f12082i0;
        if (bVar != null) {
            a8.f12088o0 = bVar.M(k22);
        }
        if (a8.f12088o0 == null) {
            C1514L l8 = a8.f12091s0;
            if (l8 != null) {
                l8.b();
            }
            C1182a aVar2 = a8.f12088o0;
            if (aVar2 != null) {
                aVar2.a();
            }
            if (a8.p0 == null) {
                boolean z6 = a8.f12052C0;
                Context context3 = a8.f12078e0;
                if (z6) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = context3.getTheme();
                    theme.resolveAttribute(2130968585, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = context3.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        C1184c cVar = new C1184c(context3, 0);
                        cVar.getTheme().setTo(newTheme);
                        context3 = cVar;
                    }
                    a8.p0 = new ActionBarContextView(context3, (AttributeSet) null);
                    PopupWindow popupWindow = new PopupWindow(context3, (AttributeSet) null, 2130968600);
                    a8.f12089q0 = popupWindow;
                    h.D(popupWindow, 2);
                    a8.f12089q0.setContentView(a8.p0);
                    a8.f12089q0.setWidth(-1);
                    context3.getTheme().resolveAttribute(2130968579, typedValue, true);
                    a8.p0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context3.getResources().getDisplayMetrics()));
                    a8.f12089q0.setHeight(-2);
                    a8.f12090r0 = new p(a8, 1);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) a8.f12093u0.findViewById(2131361861);
                    if (viewStubCompat != null) {
                        a8.C();
                        b bVar2 = a8.f12082i0;
                        if (bVar2 != null) {
                            context = bVar2.p();
                        } else {
                            context = null;
                        }
                        if (context != null) {
                            context3 = context;
                        }
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(context3));
                        a8.p0 = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (a8.p0 != null) {
                C1514L l9 = a8.f12091s0;
                if (l9 != null) {
                    l9.b();
                }
                a8.p0.e();
                Context context4 = a8.p0.getContext();
                ActionBarContextView actionBarContextView = a8.p0;
                ? obj2 = new Object();
                obj2.f13262W = context4;
                obj2.f13263X = actionBarContextView;
                obj2.f13264Y = k22;
                m mVar = new m(actionBarContextView.getContext());
                mVar.f13489f0 = 1;
                obj2.f13267b0 = mVar;
                mVar.f13482Y = obj2;
                if (((q) k22.f10050V).X(obj2, mVar)) {
                    obj2.g();
                    a8.p0.c(obj2);
                    a8.f12088o0 = obj2;
                    if (!a8.f12092t0 || (viewGroup = a8.f12093u0) == null || !viewGroup.isLaidOut()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        a8.p0.setAlpha(0.0f);
                        C1514L a9 = C1510H.a(a8.p0);
                        a9.a(1.0f);
                        a8.f12091s0 = a9;
                        a9.d(new r(1, a8));
                    } else {
                        a8.p0.setAlpha(1.0f);
                        a8.p0.setVisibility(0);
                        if (a8.p0.getParent() instanceof View) {
                            WeakHashMap weakHashMap = C1510H.f15874a;
                            C1551x.c((View) a8.p0.getParent());
                        }
                    }
                    if (a8.f12089q0 != null) {
                        a8.f12079f0.getDecorView().post(a8.f12090r0);
                    }
                } else {
                    a8.f12088o0 = null;
                }
            }
            a8.K();
            a8.f12088o0 = a8.f12088o0;
        }
        a8.K();
        C1182a aVar3 = a8.f12088o0;
        if (aVar3 != null) {
            return obj.F(aVar3);
        }
        return null;
    }

    public final void onActionModeFinished(ActionMode actionMode) {
        this.f12236U.onActionModeFinished(actionMode);
    }

    public final void onActionModeStarted(ActionMode actionMode) {
        this.f12236U.onActionModeStarted(actionMode);
    }

    public final void onAttachedToWindow() {
        this.f12236U.onAttachedToWindow();
    }

    public final void onContentChanged() {
        if (this.f12238W) {
            this.f12236U.onContentChanged();
        }
    }

    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof m)) {
            return this.f12236U.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    public final View onCreatePanelView(int i) {
        View view;
        C1006G g8 = this.f12237V;
        if (g8 != null) {
            if (i == 0) {
                view = new View(g8.f12112U.f12113a.f14023a.getContext());
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return this.f12236U.onCreatePanelView(i);
    }

    public final void onDetachedFromWindow() {
        this.f12236U.onDetachedFromWindow();
    }

    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f12236U.onMenuItemSelected(i, menuItem);
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        b(i, menu);
        C1000A a8 = this.f12241Z;
        if (i == 108) {
            a8.C();
            b bVar = a8.f12082i0;
            if (bVar != null) {
                bVar.k(true);
            }
        } else {
            a8.getClass();
        }
        return true;
    }

    public final void onPanelClosed(int i, Menu menu) {
        if (this.f12240Y) {
            this.f12236U.onPanelClosed(i, menu);
            return;
        }
        c(i, menu);
        C1000A a8 = this.f12241Z;
        if (i == 108) {
            a8.C();
            b bVar = a8.f12082i0;
            if (bVar != null) {
                bVar.k(false);
            }
        } else if (i == 0) {
            z B8 = a8.B(i);
            if (B8.f12256m) {
                a8.t(B8, false);
            }
        } else {
            a8.getClass();
        }
    }

    public final void onPointerCaptureChanged(boolean z) {
        C1194m.a(this.f12236U, z);
    }

    public final boolean onPreparePanel(int i, View view, Menu menu) {
        m mVar;
        if (menu instanceof m) {
            mVar = (m) menu;
        } else {
            mVar = null;
        }
        if (i == 0 && mVar == null) {
            return false;
        }
        if (mVar != null) {
            mVar.f13500r0 = true;
        }
        C1006G g8 = this.f12237V;
        if (g8 != null && i == 0) {
            C1007H h5 = g8.f12112U;
            if (!h5.f12116d) {
                h5.f12113a.f14032l = true;
                h5.f12116d = true;
            }
        }
        boolean onPreparePanel = this.f12236U.onPreparePanel(i, view, menu);
        if (mVar != null) {
            mVar.f13500r0 = false;
        }
        return onPreparePanel;
    }

    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        m mVar = this.f12241Z.B(0).f12252h;
        if (mVar != null) {
            d(list, mVar, i);
        } else {
            d(list, menu, i);
        }
    }

    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return C1192k.a(this.f12236U, searchEvent);
    }

    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f12236U.onWindowAttributesChanged(layoutParams);
    }

    public final void onWindowFocusChanged(boolean z) {
        this.f12236U.onWindowFocusChanged(z);
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        this.f12241Z.getClass();
        if (i != 0) {
            return C1192k.b(this.f12236U, callback, i);
        }
        return e(callback);
    }

    public final boolean onSearchRequested() {
        return this.f12236U.onSearchRequested();
    }

    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 23) {
            return null;
        }
        this.f12241Z.getClass();
        return e(callback);
    }
}
