package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import v0.C1529b;
import w0.C1575d;
import w0.C1576e;

public final class g extends C1529b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f9285d;

    public /* synthetic */ g(int i) {
        this.f9285d = i;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        switch (this.f9285d) {
            case 3:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                if (nestedScrollView.getScrollRange() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    public final void d(View view, C1576e eVar) {
        int scrollRange;
        switch (this.f9285d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f15919a;
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16192a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
                return;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f15919a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f16192a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setScrollable(false);
                return;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f15919a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = eVar.f16192a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
                return;
            default:
                View.AccessibilityDelegate accessibilityDelegate4 = this.f15919a;
                AccessibilityNodeInfo accessibilityNodeInfo4 = eVar.f16192a;
                accessibilityDelegate4.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                eVar.i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo4.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        eVar.b(C1575d.f16182g);
                        eVar.b(C1575d.f16185k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        eVar.b(C1575d.f16181f);
                        eVar.b(C1575d.f16186l);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (r6 != 16908346) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.f9285d
            switch(r0) {
                case 3: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r5 = super.g(r5, r6, r7)
            return r5
        L_0x000a:
            boolean r7 = super.g(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L_0x0013
            goto L_0x00a0
        L_0x0013:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L_0x001f
        L_0x001c:
            r0 = 0
            goto L_0x00a0
        L_0x001f:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L_0x003c
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L_0x003c
            int r7 = r2.height()
        L_0x003c:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L_0x0076
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r6 == r2) goto L_0x004f
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L_0x004f
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L_0x0076
            goto L_0x001c
        L_0x004f:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L_0x001c
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.v(r1, r6, r0)
            goto L_0x00a0
        L_0x0076:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto L_0x001c
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.v(r1, r6, r0)
        L_0x00a0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
