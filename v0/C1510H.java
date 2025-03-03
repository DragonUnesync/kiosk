package v0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.woxthebox.draglistview.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.C1296u;
import w0.C1575d;
import w0.C1586o;
import y0.C1623i;

/* renamed from: v0.H  reason: case insensitive filesystem */
public abstract class C1510H {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap f15874a;

    /* renamed from: b  reason: collision with root package name */
    public static Field f15875b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f15876c;

    /* renamed from: d  reason: collision with root package name */
    public static ThreadLocal f15877d;
    public static final int[] e = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: f  reason: collision with root package name */
    public static final C1548u f15878f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static final C1550w f15879g = new C1550w();

    public static C1514L a(View view) {
        if (f15874a == null) {
            f15874a = new WeakHashMap();
        }
        C1514L l8 = (C1514L) f15874a.get(view);
        if (l8 != null) {
            return l8;
        }
        C1514L l9 = new C1514L(view);
        f15874a.put(view, l9);
        return l9;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [v0.G, java.lang.Object] */
    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C1509G.f15870d;
        C1509G g8 = (C1509G) view.getTag(R.id.tag_unhandled_key_event_manager);
        C1509G g9 = g8;
        if (g8 == null) {
            ? obj = new Object();
            obj.f15871a = null;
            obj.f15872b = null;
            obj.f15873c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            g9 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = g9.f15871a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C1509G.f15870d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (g9.f15871a == null) {
                            g9.f15871a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C1509G.f15870d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                g9.f15871a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    g9.f15871a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a8 = g9.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a8 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (g9.f15872b == null) {
                    g9.f15872b = new SparseArray();
                }
                g9.f15872b.put(keyCode, new WeakReference(a8));
            }
        }
        if (a8 != null) {
            return true;
        }
        return false;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1506D.a(view);
        }
        if (f15876c) {
            return null;
        }
        if (f15875b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f15875b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f15876c = true;
                return null;
            }
        }
        try {
            Object obj = f15875b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f15876c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = C1505C.a(view);
        } else {
            obj = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static Rect f() {
        if (f15877d == null) {
            f15877d = new ThreadLocal();
        }
        Rect rect = (Rect) f15877d.get();
        if (rect == null) {
            rect = new Rect();
            f15877d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] g(C1296u uVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1508F.a(uVar);
        }
        return (String[]) uVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static j0 h(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C1503A.a(view);
        }
        return C1553z.f(view);
    }

    public static void i(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            if (d(view) == null || !view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            int i8 = 32;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i8 = 2048;
                }
                obtain.setEventType(i8);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e8);
                }
            }
        }
    }

    public static void j(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect f8 = f();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f8.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !f8.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            s(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                s((View) parent2);
            }
        }
        if (z && f8.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(f8);
        }
    }

    public static void k(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect f8 = f();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f8.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !f8.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            s(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                s((View) parent2);
            }
        }
        if (z && f8.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(f8);
        }
    }

    public static C1533f l(View view, C1533f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + fVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C1508F.b(view, fVar);
        }
        C1623i iVar = (C1623i) view.getTag(R.id.tag_on_receive_content_listener);
        C1543p pVar = f15878f;
        if (iVar != null) {
            C1533f a8 = C1623i.a(view, fVar);
            if (a8 == null) {
                return null;
            }
            if (view instanceof C1543p) {
                pVar = (C1543p) view;
            }
            return pVar.a(a8);
        }
        if (view instanceof C1543p) {
            pVar = (C1543p) view;
        }
        return pVar.a(fVar);
    }

    public static void m(View view, int i) {
        ArrayList e8 = e(view);
        for (int i8 = 0; i8 < e8.size(); i8++) {
            if (((C1575d) e8.get(i8)).a() == i) {
                e8.remove(i8);
                return;
            }
        }
    }

    public static void n(View view, C1575d dVar, C1586o oVar) {
        C1529b bVar;
        C1575d dVar2 = new C1575d((Object) null, dVar.f16188b, (String) null, oVar, dVar.f16189c);
        View.AccessibilityDelegate c8 = c(view);
        if (c8 == null) {
            bVar = null;
        } else if (c8 instanceof C1528a) {
            bVar = ((C1528a) c8).f15915a;
        } else {
            bVar = new C1529b(c8);
        }
        if (bVar == null) {
            bVar = new C1529b();
        }
        p(view, bVar);
        m(view, dVar2.a());
        e(view).add(dVar2);
        i(view, 0);
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1506D.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void p(View view, C1529b bVar) {
        C1528a aVar;
        if (bVar == null && (c(view) instanceof C1528a)) {
            bVar = new C1529b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f15920b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void q(View view, CharSequence charSequence) {
        boolean z;
        new C1549v(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).d(view, charSequence);
        C1550w wVar = f15879g;
        if (charSequence != null) {
            WeakHashMap weakHashMap = wVar.f15969U;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            } else {
                z = true;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(wVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(wVar);
                return;
            }
            return;
        }
        wVar.f15969U.remove(view);
        view.removeOnAttachStateChangeListener(wVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(wVar);
    }

    public static void r(View view, ColorStateList colorStateList) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        C1553z.j(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            if (C1553z.c(view) == null && C1553z.d(view) == null) {
                z = false;
            } else {
                z = true;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static void s(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
