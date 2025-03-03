package n3;

import B.C0003d;
import C3.m;
import D7.b;
import F.h;
import G5.s;
import Q0.g;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import h2.C1061b;
import h2.C1063d;
import h2.C1064e;
import h2.C1065f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C1289q;
import t3.k;

public final class c extends C1289q {

    /* renamed from: v0  reason: collision with root package name */
    public static final int[] f13761v0 = {2130969625};

    /* renamed from: w0  reason: collision with root package name */
    public static final int[] f13762w0 = {2130969624};

    /* renamed from: x0  reason: collision with root package name */
    public static final int[][] f13763x0 = {new int[]{16842910, 2130969624}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: y0  reason: collision with root package name */
    public static final int f13764y0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: b0  reason: collision with root package name */
    public final LinkedHashSet f13765b0 = new LinkedHashSet();

    /* renamed from: c0  reason: collision with root package name */
    public final LinkedHashSet f13766c0 = new LinkedHashSet();

    /* renamed from: d0  reason: collision with root package name */
    public ColorStateList f13767d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f13768e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f13769f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f13770g0;

    /* renamed from: h0  reason: collision with root package name */
    public CharSequence f13771h0;

    /* renamed from: i0  reason: collision with root package name */
    public Drawable f13772i0;

    /* renamed from: j0  reason: collision with root package name */
    public Drawable f13773j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f13774k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorStateList f13775l0;

    /* renamed from: m0  reason: collision with root package name */
    public ColorStateList f13776m0;

    /* renamed from: n0  reason: collision with root package name */
    public PorterDuff.Mode f13777n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f13778o0;
    public int[] p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f13779q0;

    /* renamed from: r0  reason: collision with root package name */
    public CharSequence f13780r0;

    /* renamed from: s0  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f13781s0;

    /* renamed from: t0  reason: collision with root package name */
    public final C1065f f13782t0;

    /* renamed from: u0  reason: collision with root package name */
    public final C1245a f13783u0;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006c A[Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0082 A[Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r13 = this;
            r0 = 1
            r7 = 2130968752(0x7f0400b0, float:1.7546167E38)
            r1 = 2132018257(0x7f140451, float:1.9674816E38)
            android.content.Context r14 = E3.a.a(r14, r15, r7, r1)
            r13.<init>(r14, r15, r7)
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet
            r14.<init>()
            r13.f13765b0 = r14
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet
            r14.<init>()
            r13.f13766c0 = r14
            android.content.Context r14 = r13.getContext()
            java.lang.String r1 = "parser error"
            java.lang.String r2 = "AnimatedVDCompat"
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            r8 = 2
            r9 = 0
            r5 = 2131231043(0x7f080143, float:1.8078156E38)
            if (r3 < r4) goto L_0x0053
            h2.f r1 = new h2.f
            r1.<init>(r14)
            android.content.res.Resources r2 = r14.getResources()
            android.content.res.Resources$Theme r14 = r14.getTheme()
            java.lang.ThreadLocal r3 = l0.l.f13083a
            android.graphics.drawable.Drawable r14 = r2.getDrawable(r5, r14)
            h2.c r2 = r1.f12554Z
            r14.setCallback(r2)
            O2.b r2 = new O2.b
            android.graphics.drawable.Drawable$ConstantState r3 = r14.getConstantState()
            r2.<init>(r0, r3)
            r1.f12557U = r14
            goto L_0x0092
        L_0x0053:
            int r3 = h2.C1065f.f12549a0
            android.content.res.Resources r3 = r14.getResources()
            android.content.res.XmlResourceParser r3 = r3.getXml(r5)     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }
            android.util.AttributeSet r4 = android.util.Xml.asAttributeSet(r3)     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }
        L_0x0061:
            int r5 = r3.next()     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }
            if (r5 == r8) goto L_0x006a
            if (r5 == r0) goto L_0x006a
            goto L_0x0061
        L_0x006a:
            if (r5 != r8) goto L_0x0082
            android.content.res.Resources r5 = r14.getResources()     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }
            android.content.res.Resources$Theme r6 = r14.getTheme()     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }
            h2.f r10 = new h2.f     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }
            r10.<init>(r14)     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }
            r10.inflate(r5, r3, r4, r6)     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }
            r1 = r10
            goto L_0x0092
        L_0x007e:
            r14 = move-exception
            goto L_0x008a
        L_0x0080:
            r14 = move-exception
            goto L_0x008e
        L_0x0082:
            org.xmlpull.v1.XmlPullParserException r14 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }
            java.lang.String r3 = "No start tag found"
            r14.<init>(r3)     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }
            throw r14     // Catch:{ XmlPullParserException -> 0x0080, IOException -> 0x007e }
        L_0x008a:
            android.util.Log.e(r2, r1, r14)
            goto L_0x0091
        L_0x008e:
            android.util.Log.e(r2, r1, r14)
        L_0x0091:
            r1 = r9
        L_0x0092:
            r13.f13782t0 = r1
            n3.a r14 = new n3.a
            r14.<init>(r13)
            r13.f13783u0 = r14
            android.content.Context r14 = r13.getContext()
            android.graphics.drawable.Drawable r1 = G5.s.p(r13)
            r13.f13772i0 = r1
            android.content.res.ColorStateList r1 = r13.getSuperButtonTintList()
            r13.f13775l0 = r1
            r13.setSupportButtonTintList(r9)
            int[] r10 = f3.C0899a.f11660n
            r11 = 0
            int[] r6 = new int[r11]
            r12 = 2132018257(0x7f140451, float:1.9674816E38)
            t3.k.a(r14, r15, r7, r12)
            r1 = r14
            r2 = r15
            r3 = r10
            r4 = r7
            r5 = r12
            t3.k.b(r1, r2, r3, r4, r5, r6)
            d4.k r1 = new d4.k
            android.content.res.TypedArray r15 = r14.obtainStyledAttributes(r15, r10, r7, r12)
            r1.<init>((android.content.Context) r14, (android.content.res.TypedArray) r15)
            android.graphics.drawable.Drawable r2 = r1.I(r8)
            r13.f13773j0 = r2
            android.graphics.drawable.Drawable r2 = r13.f13772i0
            if (r2 == 0) goto L_0x0106
            r2 = 2130969160(0x7f040248, float:1.7546994E38)
            boolean r2 = android.support.v4.media.session.b.C(r14, r2, r11)
            if (r2 == 0) goto L_0x0106
            int r2 = r15.getResourceId(r11, r11)
            int r3 = r15.getResourceId(r0, r11)
            int r4 = f13764y0
            if (r2 != r4) goto L_0x0106
            if (r3 != 0) goto L_0x0106
            super.setButtonDrawable((android.graphics.drawable.Drawable) r9)
            r2 = 2131231042(0x7f080142, float:1.8078154E38)
            android.graphics.drawable.Drawable r2 = B.C0003d.r(r14, r2)
            r13.f13772i0 = r2
            r13.f13774k0 = r0
            android.graphics.drawable.Drawable r2 = r13.f13773j0
            if (r2 != 0) goto L_0x0106
            r2 = 2131231044(0x7f080144, float:1.8078158E38)
            android.graphics.drawable.Drawable r2 = B.C0003d.r(r14, r2)
            r13.f13773j0 = r2
        L_0x0106:
            r2 = 3
            android.content.res.ColorStateList r14 = com.bumptech.glide.c.l(r14, r1, r2)
            r13.f13776m0 = r14
            r14 = 4
            r2 = -1
            int r14 = r15.getInt(r14, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r14 = t3.k.g(r14, r2)
            r13.f13777n0 = r14
            r14 = 10
            boolean r14 = r15.getBoolean(r14, r11)
            r13.f13768e0 = r14
            r14 = 6
            boolean r14 = r15.getBoolean(r14, r0)
            r13.f13769f0 = r14
            r14 = 9
            boolean r14 = r15.getBoolean(r14, r11)
            r13.f13770g0 = r14
            r14 = 8
            java.lang.CharSequence r14 = r15.getText(r14)
            r13.f13771h0 = r14
            r14 = 7
            boolean r0 = r15.hasValue(r14)
            if (r0 == 0) goto L_0x0148
            int r14 = r15.getInt(r14, r11)
            r13.setCheckedState(r14)
        L_0x0148:
            r1.M2()
            r13.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.c.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private String getButtonStateDescription() {
        int i = this.f13778o0;
        if (i == 1) {
            return getResources().getString(2131951866);
        }
        if (i == 0) {
            return getResources().getString(2131951868);
        }
        return getResources().getString(2131951867);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f13767d0 == null) {
            int o2 = b.o(this, 2130968815);
            int o8 = b.o(this, 2130968818);
            int o9 = b.o(this, 2130968856);
            int o10 = b.o(this, 2130968834);
            this.f13767d0 = new ColorStateList(f13763x0, new int[]{b.F(1.0f, o9, o8), b.F(1.0f, o9, o2), b.F(0.54f, o9, o10), b.F(0.38f, o9, o10), b.F(0.38f, o9, o10)});
        }
        return this.f13767d0;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f13775l0;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        LayerDrawable layerDrawable;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        m mVar;
        this.f13772i0 = h.i(this.f13772i0, this.f13775l0, getButtonTintMode());
        this.f13773j0 = h.i(this.f13773j0, this.f13776m0, this.f13777n0);
        if (this.f13774k0) {
            C1065f fVar = this.f13782t0;
            if (fVar != null) {
                C1063d dVar = fVar.f12550V;
                C1245a aVar = this.f13783u0;
                if (aVar != null) {
                    Drawable drawable = fVar.f12557U;
                    if (drawable != null) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                        if (aVar.f13758a == null) {
                            aVar.f13758a = new C1061b(aVar);
                        }
                        C1064e.c(animatedVectorDrawable, aVar.f13758a);
                    }
                    ArrayList arrayList = fVar.f12553Y;
                    if (arrayList != null) {
                        arrayList.remove(aVar);
                        if (fVar.f12553Y.size() == 0 && (mVar = fVar.f12552X) != null) {
                            dVar.f12546b.removeListener(mVar);
                            fVar.f12552X = null;
                        }
                    }
                }
                if (aVar != null) {
                    Drawable drawable2 = fVar.f12557U;
                    if (drawable2 != null) {
                        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                        if (aVar.f13758a == null) {
                            aVar.f13758a = new C1061b(aVar);
                        }
                        C1064e.b(animatedVectorDrawable2, aVar.f13758a);
                    } else {
                        if (fVar.f12553Y == null) {
                            fVar.f12553Y = new ArrayList();
                        }
                        if (!fVar.f12553Y.contains(aVar)) {
                            fVar.f12553Y.add(aVar);
                            if (fVar.f12552X == null) {
                                fVar.f12552X = new m(2, fVar);
                            }
                            dVar.f12546b.addListener(fVar.f12552X);
                        }
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Drawable drawable3 = this.f13772i0;
                if ((drawable3 instanceof AnimatedStateListDrawable) && fVar != null) {
                    ((AnimatedStateListDrawable) drawable3).addTransition(2131361936, 2131362602, fVar, false);
                    ((AnimatedStateListDrawable) this.f13772i0).addTransition(2131362161, 2131362602, fVar, false);
                }
            }
        }
        Drawable drawable4 = this.f13772i0;
        if (!(drawable4 == null || (colorStateList2 = this.f13775l0) == null)) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f13773j0;
        if (!(drawable5 == null || (colorStateList = this.f13776m0) == null)) {
            drawable5.setTintList(colorStateList);
        }
        Drawable drawable6 = this.f13772i0;
        Drawable drawable7 = this.f13773j0;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            int intrinsicWidth = drawable7.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable6.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable7.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable6.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable6.getIntrinsicWidth() || intrinsicHeight > drawable6.getIntrinsicHeight()) {
                float f8 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                if (f8 >= ((float) drawable6.getIntrinsicWidth()) / ((float) drawable6.getIntrinsicHeight())) {
                    int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (((float) intrinsicWidth2) / f8);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (f8 * ((float) intrinsicHeight));
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
                layerDrawable.setLayerGravity(1, 17);
            } else {
                layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
                int max = Math.max((drawable6.getIntrinsicWidth() - intrinsicWidth) / 2, 0);
                int max2 = Math.max((drawable6.getIntrinsicHeight() - intrinsicHeight) / 2, 0);
                layerDrawable.setLayerInset(1, max, max2, max, max2);
            }
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.f13772i0;
    }

    public Drawable getButtonIconDrawable() {
        return this.f13773j0;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f13776m0;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f13777n0;
    }

    public ColorStateList getButtonTintList() {
        return this.f13775l0;
    }

    public int getCheckedState() {
        return this.f13778o0;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f13771h0;
    }

    public final boolean isChecked() {
        if (this.f13778o0 == 1) {
            return true;
        }
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f13768e0 && this.f13775l0 == null && this.f13776m0 == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f13761v0);
        }
        if (this.f13770g0) {
            View.mergeDrawableStates(onCreateDrawableState, f13762w0);
        }
        int i8 = 0;
        while (true) {
            if (i8 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i9 = onCreateDrawableState[i8];
            if (i9 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            } else if (i9 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i8] = 16842912;
                break;
            } else {
                i8++;
            }
        }
        this.p0 = copyOf;
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        Drawable p3;
        int i;
        if (!this.f13769f0 || !TextUtils.isEmpty(getText()) || (p3 = s.p(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (k.e(this)) {
            i = -1;
        } else {
            i = 1;
        }
        int width = ((getWidth() - p3.getIntrinsicWidth()) / 2) * i;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = p3.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f13770g0) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.f13771h0);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f13760U);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, n3.b] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f13760U = getCheckedState();
        return baseSavedState;
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C0003d.r(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f13773j0 = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(C0003d.r(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f13776m0 != colorStateList) {
            this.f13776m0 = colorStateList;
            a();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f13777n0 != mode) {
            this.f13777n0 = mode;
            a();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f13775l0 != colorStateList) {
            this.f13775l0 = colorStateList;
            a();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f13769f0 = z;
    }

    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        boolean z;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f13778o0 != i) {
            this.f13778o0 = i;
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            super.setChecked(z);
            refreshDrawableState();
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30 && this.f13780r0 == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f13779q0) {
                this.f13779q0 = true;
                LinkedHashSet linkedHashSet = this.f13766c0;
                if (linkedHashSet != null) {
                    Iterator it = linkedHashSet.iterator();
                    if (it.hasNext()) {
                        throw g.k(it);
                    }
                }
                if (!(this.f13778o0 == 2 || (onCheckedChangeListener = this.f13781s0) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i8 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f13779q0 = false;
            }
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f13771h0 = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getResources().getText(i);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z) {
        if (this.f13770g0 != z) {
            this.f13770g0 = z;
            refreshDrawableState();
            Iterator it = this.f13765b0.iterator();
            if (it.hasNext()) {
                throw g.k(it);
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f13781s0 = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.f13780r0 = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f13768e0 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList((ColorStateList) null);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f13772i0 = drawable;
        this.f13774k0 = false;
        a();
    }
}
