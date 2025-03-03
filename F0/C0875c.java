package f0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import d0.d;
import d0.i;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: f0.c  reason: case insensitive filesystem */
public abstract class C0875c extends View {

    /* renamed from: U  reason: collision with root package name */
    public int[] f11298U;

    /* renamed from: V  reason: collision with root package name */
    public int f11299V;

    /* renamed from: W  reason: collision with root package name */
    public Context f11300W;

    /* renamed from: a0  reason: collision with root package name */
    public i f11301a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f11302b0;

    /* renamed from: c0  reason: collision with root package name */
    public HashMap f11303c0;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x00a9
            int r0 = r6.length()
            if (r0 != 0) goto L_0x000a
            goto L_0x00a9
        L_0x000a:
            android.content.Context r0 = r5.f11300W
            if (r0 != 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L_0x0021
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L_0x0021:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L_0x0031
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L_0x0032
        L_0x0031:
            r1 = r2
        L_0x0032:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L_0x005b
            if (r1 == 0) goto L_0x005b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L_0x004f
            java.util.HashMap r3 = r1.f7702j0
            if (r3 == 0) goto L_0x004f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x004f
            java.util.HashMap r3 = r1.f7702j0
            java.lang.Object r3 = r3.get(r6)
            goto L_0x0050
        L_0x004f:
            r3 = r2
        L_0x0050:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x005b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x005c
        L_0x005b:
            r3 = 0
        L_0x005c:
            if (r3 != 0) goto L_0x0064
            if (r1 == 0) goto L_0x0064
            int r3 = r5.d(r1, r6)
        L_0x0064:
            if (r3 != 0) goto L_0x0072
            java.lang.Class<f0.o> r1 = f0.o.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch:{ Exception -> 0x0071 }
            int r3 = r1.getInt(r2)     // Catch:{ Exception -> 0x0071 }
            goto L_0x0072
        L_0x0071:
        L_0x0072:
            if (r3 != 0) goto L_0x0082
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L_0x0082:
            if (r3 == 0) goto L_0x0091
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap r1 = r5.f11303c0
            r1.put(r0, r6)
            r5.b(r3)
            goto L_0x00a9
        L_0x0091:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.C0875c.a(java.lang.String):void");
    }

    public final void b(int i) {
        if (i != getId()) {
            int i8 = this.f11299V + 1;
            int[] iArr = this.f11298U;
            if (i8 > iArr.length) {
                this.f11298U = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f11298U;
            int i9 = this.f11299V;
            iArr2[i9] = i;
            this.f11299V = i9 + 1;
        }
    }

    public final void c() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f11299V; i++) {
                View view = (View) constraintLayout.f7690U.get(this.f11298U[i]);
                if (view != null) {
                    view.setVisibility(visibility);
                    if (elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final int d(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f11300W.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void e(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f11457b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 19) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f11302b0 = string;
                    setIds(string);
                }
            }
        }
    }

    public abstract void f(d dVar, boolean z);

    public final void g() {
        if (this.f11301a0 != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof C0877e) {
                ((C0877e) layoutParams).f11350k0 = this.f11301a0;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f11298U, this.f11299V);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f11302b0;
        if (str != null) {
            setIds(str);
        }
    }

    public final void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f11302b0 = str;
        if (str != null) {
            int i = 0;
            this.f11299V = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    a(str.substring(i));
                    return;
                } else {
                    a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f11302b0 = null;
        this.f11299V = 0;
        for (int b8 : iArr) {
            b(b8);
        }
    }
}
