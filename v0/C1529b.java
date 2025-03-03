package v0;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import k2.C1160q;
import w0.C1576e;

/* renamed from: v0.b  reason: case insensitive filesystem */
public class C1529b {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f15918c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f15919a;

    /* renamed from: b  reason: collision with root package name */
    public final C1528a f15920b;

    public C1529b() {
        this(f15918c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f15919a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C1160q b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f15919a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1160q(28, (Object) accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f15919a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, C1576e eVar) {
        this.f15919a.onInitializeAccessibilityNodeInfo(view, eVar.f16192a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f15919a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f15919a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARNING: type inference failed for: r9v10, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.View r7, int r8, android.os.Bundle r9) {
        /*
            r6 = this;
            r0 = 2131362536(0x7f0a02e8, float:1.8344855E38)
            java.lang.Object r0 = r7.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x000f:
            r1 = 0
            r2 = 0
        L_0x0011:
            int r3 = r0.size()
            r4 = 0
            if (r2 >= r3) goto L_0x0057
            java.lang.Object r3 = r0.get(r2)
            w0.d r3 = (w0.C1575d) r3
            int r5 = r3.a()
            if (r5 != r8) goto L_0x0054
            w0.o r0 = r3.f16190d
            if (r0 == 0) goto L_0x0057
            java.lang.Class r2 = r3.f16189c
            if (r2 != 0) goto L_0x002d
            goto L_0x004f
        L_0x002d:
            java.lang.reflect.Constructor r3 = r2.getDeclaredConstructor(r4)     // Catch:{ Exception -> 0x0038 }
            java.lang.Object r3 = r3.newInstance(r4)     // Catch:{ Exception -> 0x0038 }
            if (r3 != 0) goto L_0x003a
            throw r4     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r3 = move-exception
            goto L_0x0040
        L_0x003a:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException     // Catch:{ Exception -> 0x0038 }
            r3.<init>()     // Catch:{ Exception -> 0x0038 }
            throw r3     // Catch:{ Exception -> 0x0038 }
        L_0x0040:
            java.lang.String r2 = r2.getName()
            java.lang.String r5 = "Failed to execute command with argument class ViewCommandArgument: "
            java.lang.String r2 = r5.concat(r2)
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r2, r3)
        L_0x004f:
            boolean r0 = r0.b(r7)
            goto L_0x0058
        L_0x0054:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0057:
            r0 = 0
        L_0x0058:
            if (r0 != 0) goto L_0x0060
            android.view.View$AccessibilityDelegate r0 = r6.f15919a
            boolean r0 = r0.performAccessibilityAction(r7, r8, r9)
        L_0x0060:
            if (r0 != 0) goto L_0x00be
            r2 = 2131361808(0x7f0a0010, float:1.8343379E38)
            if (r8 != r2) goto L_0x00be
            if (r9 == 0) goto L_0x00be
            java.lang.String r8 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            r0 = -1
            int r8 = r9.getInt(r8, r0)
            r9 = 2131362537(0x7f0a02e9, float:1.8344857E38)
            java.lang.Object r9 = r7.getTag(r9)
            android.util.SparseArray r9 = (android.util.SparseArray) r9
            if (r9 == 0) goto L_0x00bd
            java.lang.Object r8 = r9.get(r8)
            java.lang.ref.WeakReference r8 = (java.lang.ref.WeakReference) r8
            if (r8 == 0) goto L_0x00bd
            java.lang.Object r8 = r8.get()
            android.text.style.ClickableSpan r8 = (android.text.style.ClickableSpan) r8
            if (r8 == 0) goto L_0x00bd
            android.view.accessibility.AccessibilityNodeInfo r9 = r7.createAccessibilityNodeInfo()
            java.lang.CharSequence r9 = r9.getText()
            boolean r0 = r9 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x00a7
            r0 = r9
            android.text.Spanned r0 = (android.text.Spanned) r0
            int r9 = r9.length()
            java.lang.Class<android.text.style.ClickableSpan> r2 = android.text.style.ClickableSpan.class
            java.lang.Object[] r9 = r0.getSpans(r1, r9, r2)
            r4 = r9
            android.text.style.ClickableSpan[] r4 = (android.text.style.ClickableSpan[]) r4
        L_0x00a7:
            r9 = 0
        L_0x00a8:
            if (r4 == 0) goto L_0x00bd
            int r0 = r4.length
            if (r9 >= r0) goto L_0x00bd
            r0 = r4[r9]
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00ba
            r8.onClick(r7)
            r1 = 1
            goto L_0x00bd
        L_0x00ba:
            int r9 = r9 + 1
            goto L_0x00a8
        L_0x00bd:
            r0 = r1
        L_0x00be:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.C1529b.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public void h(View view, int i) {
        this.f15919a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f15919a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1529b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f15919a = accessibilityDelegate;
        this.f15920b = new C1528a(this);
    }
}
