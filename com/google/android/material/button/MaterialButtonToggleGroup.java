package com.google.android.material.button;

import B3.g;
import Q.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.f;
import f3.C0899a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k2.C1160q;
import l3.C1173a;
import l3.d;
import t3.k;
import v0.C1510H;
import z3.C1646a;
import z3.j;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ int f9231h0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public final ArrayList f9232U = new ArrayList();

    /* renamed from: V  reason: collision with root package name */
    public final C1160q f9233V = new C1160q(3, (Object) this);

    /* renamed from: W  reason: collision with root package name */
    public final LinkedHashSet f9234W = new LinkedHashSet();

    /* renamed from: a0  reason: collision with root package name */
    public final a f9235a0 = new a(1, this);

    /* renamed from: b0  reason: collision with root package name */
    public Integer[] f9236b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f9237c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f9238d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f9239e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f9240f0;

    /* renamed from: g0  reason: collision with root package name */
    public HashSet f9241g0 = new HashSet();

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(E3.a.a(context, attributeSet, 2130969319, 2132018265), attributeSet, 2130969319);
        TypedArray f8 = k.f(getContext(), attributeSet, C0899a.f11657k, 2130969319, 2132018265, new int[0]);
        setSingleSelection(f8.getBoolean(3, false));
        this.f9240f0 = f8.getResourceId(1, -1);
        this.f9239e0 = f8.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(f8.getBoolean(0, true));
        f8.recycle();
        WeakHashMap weakHashMap = C1510H.f15874a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            if ((getChildAt(i8) instanceof MaterialButton) && c(i8)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = C1510H.f15874a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f9233V);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f9228l0);
        z3.k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f9232U.add(new d(shapeAppearanceModel.e, shapeAppearanceModel.f16507h, shapeAppearanceModel.f16505f, shapeAppearanceModel.f16506g));
        materialButton.setEnabled(isEnabled());
        C1510H.p(materialButton, new g(2, this));
    }

    public final void b(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f9241g0);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f9238d0 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.f9239e0 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d(Set set) {
        HashSet hashSet = this.f9241g0;
        this.f9241g0 = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f9237c0 = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f9237c0 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f9234W.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f9235a0);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f9236b0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        boolean z;
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                j e = materialButton.getShapeAppearanceModel().e();
                d dVar2 = (d) this.f9232U.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1646a aVar = d.e;
                    if (i == firstVisibleChildIndex) {
                        if (!z) {
                            dVar = new d(dVar2.f13190a, aVar, dVar2.f13191b, aVar);
                        } else if (k.e(this)) {
                            dVar = new d(aVar, aVar, dVar2.f13191b, dVar2.f13192c);
                        } else {
                            dVar = new d(dVar2.f13190a, dVar2.f13193d, aVar, aVar);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        dVar2 = null;
                    } else if (!z) {
                        dVar = new d(aVar, dVar2.f13193d, aVar, dVar2.f13192c);
                    } else if (k.e(this)) {
                        dVar = new d(dVar2.f13190a, dVar2.f13193d, aVar, aVar);
                    } else {
                        dVar = new d(aVar, aVar, dVar2.f13191b, dVar2.f13192c);
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    e.e = new C1646a(0.0f);
                    e.f16495f = new C1646a(0.0f);
                    e.f16496g = new C1646a(0.0f);
                    e.f16497h = new C1646a(0.0f);
                } else {
                    e.e = dVar2.f13190a;
                    e.f16497h = dVar2.f13193d;
                    e.f16495f = dVar2.f13191b;
                    e.f16496g = dVar2.f13192c;
                }
                materialButton.setShapeAppearanceModel(e.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f9238d0 || this.f9241g0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f9241g0.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f9241g0.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final int getChildDrawingOrder(int i, int i8) {
        Integer[] numArr = this.f9236b0;
        if (numArr != null && i8 < numArr.length) {
            return numArr[i8].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i8;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f9240f0;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f9238d0) {
            i = 1;
        } else {
            i = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i));
    }

    public final void onMeasure(int i, int i8) {
        e();
        a();
        super.onMeasure(i, i8);
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((C1173a) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f9232U.remove(indexOfChild);
        }
        e();
        a();
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f9239e0 = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f9238d0 != z) {
            this.f9238d0 = z;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f9238d0 ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
