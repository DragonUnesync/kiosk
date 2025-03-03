package androidx.media3.ui;

import H2.x;
import M0.Y;
import M0.Z;
import M0.d0;
import Y1.J;
import Y1.K;
import Y1.L;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TrackSelectionView extends LinearLayout {

    /* renamed from: U  reason: collision with root package name */
    public final int f8250U;

    /* renamed from: V  reason: collision with root package name */
    public final LayoutInflater f8251V;

    /* renamed from: W  reason: collision with root package name */
    public final CheckedTextView f8252W;

    /* renamed from: a0  reason: collision with root package name */
    public final CheckedTextView f8253a0;

    /* renamed from: b0  reason: collision with root package name */
    public final K f8254b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ArrayList f8255c0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    public final HashMap f8256d0 = new HashMap();

    /* renamed from: e0  reason: collision with root package name */
    public boolean f8257e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f8258f0;

    /* renamed from: g0  reason: collision with root package name */
    public J f8259g0 = new x(getResources());

    /* renamed from: h0  reason: collision with root package name */
    public CheckedTextView[][] f8260h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f8261i0;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.f8250U = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.f8251V = from;
        K k8 = new K(0, this);
        this.f8254b0 = k8;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.f8252W = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(2131951764);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(k8);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(2131558475, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.f8253a0 = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(2131951763);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(k8);
        addView(checkedTextView2);
    }

    public final void a() {
        boolean z;
        this.f8252W.setChecked(this.f8261i0);
        boolean z6 = this.f8261i0;
        HashMap hashMap = this.f8256d0;
        if (z6 || hashMap.size() != 0) {
            z = false;
        } else {
            z = true;
        }
        this.f8253a0.setChecked(z);
        for (int i = 0; i < this.f8260h0.length; i++) {
            Z z8 = (Z) hashMap.get(((d0) this.f8255c0.get(i)).f2935b);
            int i8 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f8260h0[i];
                if (i8 >= checkedTextViewArr.length) {
                    break;
                }
                if (z8 != null) {
                    Object tag = checkedTextViewArr[i8].getTag();
                    tag.getClass();
                    this.f8260h0[i][i8].setChecked(z8.f2890b.contains(Integer.valueOf(((L) tag).f6369b)));
                } else {
                    checkedTextViewArr[i8].setChecked(false);
                }
                i8++;
            }
        }
    }

    public final void b() {
        boolean z;
        boolean z6;
        int i;
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f8255c0;
        boolean isEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f8253a0;
        CheckedTextView checkedTextView2 = this.f8252W;
        if (isEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f8260h0 = new CheckedTextView[arrayList.size()][];
        if (!this.f8258f0 || arrayList.size() <= 1) {
            z = false;
        } else {
            z = true;
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            d0 d0Var = (d0) arrayList.get(i8);
            if (!this.f8257e0 || !d0Var.f2936c) {
                z6 = false;
            } else {
                z6 = true;
            }
            CheckedTextView[][] checkedTextViewArr = this.f8260h0;
            int i9 = d0Var.f2934a;
            checkedTextViewArr[i8] = new CheckedTextView[i9];
            L[] lArr = new L[i9];
            for (int i10 = 0; i10 < d0Var.f2934a; i10++) {
                lArr[i10] = new L(d0Var, i10);
            }
            for (int i11 = 0; i11 < i9; i11++) {
                LayoutInflater layoutInflater = this.f8251V;
                if (i11 == 0) {
                    addView(layoutInflater.inflate(2131558475, this, false));
                }
                if (z6 || z) {
                    i = 17367056;
                } else {
                    i = 17367055;
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate(i, this, false);
                checkedTextView3.setBackgroundResource(this.f8250U);
                J j7 = this.f8259g0;
                L l8 = lArr[i11];
                checkedTextView3.setText(((x) j7).c(l8.f6368a.f2935b.f2888d[l8.f6369b]));
                checkedTextView3.setTag(lArr[i11]);
                if (d0Var.b(i11)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f8254b0);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f8260h0[i8][i11] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        a();
    }

    public boolean getIsDisabled() {
        return this.f8261i0;
    }

    public Map<Y, Z> getOverrides() {
        return this.f8256d0;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.f8257e0 != z) {
            this.f8257e0 = z;
            b();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.f8258f0 != z) {
            this.f8258f0 = z;
            if (!z) {
                HashMap hashMap = this.f8256d0;
                if (hashMap.size() > 1) {
                    ArrayList arrayList = this.f8255c0;
                    HashMap hashMap2 = new HashMap();
                    for (int i = 0; i < arrayList.size(); i++) {
                        Z z6 = (Z) hashMap.get(((d0) arrayList.get(i)).f2935b);
                        if (z6 != null && hashMap2.isEmpty()) {
                            hashMap2.put(z6.f2889a, z6);
                        }
                    }
                    hashMap.clear();
                    hashMap.putAll(hashMap2);
                }
            }
            b();
        }
    }

    public void setShowDisableOption(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f8252W.setVisibility(i);
    }

    public void setTrackNameProvider(J j7) {
        j7.getClass();
        this.f8259g0 = j7;
        b();
    }
}
