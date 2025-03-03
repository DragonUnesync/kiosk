package w0;

import D.F;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: w0.d  reason: case insensitive filesystem */
public final class C1575d {
    public static final C1575d e = new C1575d(16);

    /* renamed from: f  reason: collision with root package name */
    public static final C1575d f16181f = new C1575d(4096);

    /* renamed from: g  reason: collision with root package name */
    public static final C1575d f16182g = new C1575d(8192);

    /* renamed from: h  reason: collision with root package name */
    public static final C1575d f16183h = new C1575d(262144);
    public static final C1575d i = new C1575d(524288);

    /* renamed from: j  reason: collision with root package name */
    public static final C1575d f16184j = new C1575d(1048576);

    /* renamed from: k  reason: collision with root package name */
    public static final C1575d f16185k;

    /* renamed from: l  reason: collision with root package name */
    public static final C1575d f16186l;

    /* renamed from: a  reason: collision with root package name */
    public final Object f16187a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16188b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f16189c;

    /* renamed from: d  reason: collision with root package name */
    public final C1586o f16190d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        new C1575d(1);
        new C1575d(2);
        new C1575d(4);
        new C1575d(8);
        new C1575d(32);
        new C1575d(64);
        new C1575d(128);
        Class<C1579h> cls = C1579h.class;
        new C1575d(cls, 256);
        new C1575d(cls, 512);
        Class<C1580i> cls2 = C1580i.class;
        new C1575d(cls2, 1024);
        new C1575d(cls2, 2048);
        new C1575d(16384);
        new C1575d(32768);
        new C1575d(65536);
        new C1575d(C1584m.class, 131072);
        new C1575d(C1585n.class, 2097152);
        int i8 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22 = null;
        if (i8 >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        new C1575d(accessibilityAction, 16908342, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        new C1575d(accessibilityAction2, 16908343, (String) null, (C1586o) null, C1582k.class);
        if (i8 >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        f16185k = new C1575d(accessibilityAction3, 16908344, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        new C1575d(accessibilityAction4, 16908345, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        f16186l = new C1575d(accessibilityAction5, 16908346, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        new C1575d(accessibilityAction6, 16908347, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction7 = null;
        }
        new C1575d(accessibilityAction7, 16908358, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 29) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction8 = null;
        }
        new C1575d(accessibilityAction8, 16908359, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        new C1575d(accessibilityAction9, 16908360, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 29) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction10 = null;
        }
        new C1575d(accessibilityAction10, 16908361, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 23) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction11 = null;
        }
        new C1575d(accessibilityAction11, 16908348, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 24) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction12 = null;
        }
        new C1575d(accessibilityAction12, 16908349, (String) null, (C1586o) null, C1583l.class);
        if (i8 >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        new C1575d(accessibilityAction13, 16908354, (String) null, (C1586o) null, C1581j.class);
        if (i8 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction14 = null;
        }
        new C1575d(accessibilityAction14, 16908356, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 28) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction15 = null;
        }
        new C1575d(accessibilityAction15, 16908357, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction16 = null;
        }
        new C1575d(accessibilityAction16, 16908362, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 30) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction17 = null;
        }
        new C1575d(accessibilityAction17, 16908372, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction18 = null;
        }
        new C1575d(accessibilityAction18, 16908373, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 32) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction19 = null;
        }
        new C1575d(accessibilityAction19, 16908374, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 32) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction20 = null;
        }
        new C1575d(accessibilityAction20, 16908375, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 33) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction21 = null;
        }
        new C1575d(accessibilityAction21, 16908376, (String) null, (C1586o) null, (Class) null);
        if (i8 >= 34) {
            accessibilityAction22 = F.b();
        }
        new C1575d(accessibilityAction22, 16908382, (String) null, (C1586o) null, (Class) null);
    }

    public C1575d(int i8) {
        this((Object) null, i8, (String) null, (C1586o) null, (Class) null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f16187a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1575d)) {
            return false;
        }
        Object obj2 = ((C1575d) obj).f16187a;
        Object obj3 = this.f16187a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.f16187a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String d8 = C1576e.d(this.f16188b);
        if (d8.equals("ACTION_UNKNOWN")) {
            Object obj = this.f16187a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d8 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(d8);
        return sb.toString();
    }

    public C1575d(Class cls, int i8) {
        this((Object) null, i8, (String) null, (C1586o) null, cls);
    }

    public C1575d(Object obj, int i8, String str, C1586o oVar, Class cls) {
        this.f16188b = i8;
        this.f16190d = oVar;
        if (obj == null) {
            this.f16187a = new AccessibilityNodeInfo.AccessibilityAction(i8, str);
        } else {
            this.f16187a = obj;
        }
        this.f16189c = cls;
    }
}
