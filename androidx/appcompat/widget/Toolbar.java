package androidx.appcompat.widget;

import B.C0003d;
import B0.b;
import C0.e;
import D2.G;
import Y1.K;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.E;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.c;
import d4.k;
import g.C0940a;
import h.C1006G;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m.C1189h;
import n.m;
import n.o;
import o.C1260b0;
import o.C1277k;
import o.C1278k0;
import o.C1300w;
import o.C1302x;
import o.Q0;
import o.g1;
import o.h1;
import o.i1;
import o.j1;
import o.k1;
import o.l1;
import o.m1;
import o.o1;
import o.w1;
import v0.C1510H;
import v0.C1537j;

public class Toolbar extends ViewGroup implements C1537j {

    /* renamed from: A0  reason: collision with root package name */
    public final ArrayList f7559A0;

    /* renamed from: B0  reason: collision with root package name */
    public final ArrayList f7560B0;

    /* renamed from: C0  reason: collision with root package name */
    public final int[] f7561C0;

    /* renamed from: D0  reason: collision with root package name */
    public final k f7562D0;

    /* renamed from: E0  reason: collision with root package name */
    public ArrayList f7563E0;

    /* renamed from: F0  reason: collision with root package name */
    public l1 f7564F0;

    /* renamed from: G0  reason: collision with root package name */
    public final h1 f7565G0;

    /* renamed from: H0  reason: collision with root package name */
    public o1 f7566H0;

    /* renamed from: I0  reason: collision with root package name */
    public C1277k f7567I0;

    /* renamed from: J0  reason: collision with root package name */
    public j1 f7568J0;

    /* renamed from: K0  reason: collision with root package name */
    public G f7569K0;

    /* renamed from: L0  reason: collision with root package name */
    public C1006G f7570L0;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f7571M0;

    /* renamed from: N0  reason: collision with root package name */
    public OnBackInvokedCallback f7572N0;

    /* renamed from: O0  reason: collision with root package name */
    public OnBackInvokedDispatcher f7573O0;

    /* renamed from: P0  reason: collision with root package name */
    public boolean f7574P0;

    /* renamed from: Q0  reason: collision with root package name */
    public final e f7575Q0;

    /* renamed from: U  reason: collision with root package name */
    public ActionMenuView f7576U;

    /* renamed from: V  reason: collision with root package name */
    public C1260b0 f7577V;

    /* renamed from: W  reason: collision with root package name */
    public C1260b0 f7578W;

    /* renamed from: a0  reason: collision with root package name */
    public C1300w f7579a0;

    /* renamed from: b0  reason: collision with root package name */
    public C1302x f7580b0;

    /* renamed from: c0  reason: collision with root package name */
    public final Drawable f7581c0;

    /* renamed from: d0  reason: collision with root package name */
    public final CharSequence f7582d0;

    /* renamed from: e0  reason: collision with root package name */
    public C1300w f7583e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f7584f0;

    /* renamed from: g0  reason: collision with root package name */
    public Context f7585g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f7586h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f7587i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f7588j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f7589k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f7590l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f7591m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f7592n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f7593o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public Q0 f7594q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f7595r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f7596s0;

    /* renamed from: t0  reason: collision with root package name */
    public final int f7597t0;

    /* renamed from: u0  reason: collision with root package name */
    public CharSequence f7598u0;

    /* renamed from: v0  reason: collision with root package name */
    public CharSequence f7599v0;

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f7600w0;

    /* renamed from: x0  reason: collision with root package name */
    public ColorStateList f7601x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f7602y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f7603z0;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C1189h(getContext());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.k1, android.view.ViewGroup$MarginLayoutParams] */
    public static k1 h() {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f14001b = 0;
        marginLayoutParams.f14000a = 8388627;
        return marginLayoutParams;
    }

    public static k1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z = layoutParams instanceof k1;
        if (z) {
            k1 k1Var = (k1) layoutParams;
            k1 k1Var2 = new k1(k1Var);
            k1Var2.f14001b = 0;
            k1Var2.f14001b = k1Var.f14001b;
            return k1Var2;
        } else if (z) {
            k1 k1Var3 = new k1((k1) layoutParams);
            k1Var3.f14001b = 0;
            return k1Var3;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            k1 k1Var4 = new k1((ViewGroup.LayoutParams) marginLayoutParams);
            k1Var4.f14001b = 0;
            k1Var4.leftMargin = marginLayoutParams.leftMargin;
            k1Var4.topMargin = marginLayoutParams.topMargin;
            k1Var4.rightMargin = marginLayoutParams.rightMargin;
            k1Var4.bottomMargin = marginLayoutParams.bottomMargin;
            return k1Var4;
        } else {
            k1 k1Var5 = new k1(layoutParams);
            k1Var5.f14001b = 0;
            return k1Var5;
        }
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (z) {
            for (int i8 = childCount - 1; i8 >= 0; i8--) {
                View childAt = getChildAt(i8);
                k1 k1Var = (k1) childAt.getLayoutParams();
                if (k1Var.f14001b == 0 && u(childAt)) {
                    int i9 = k1Var.f14000a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i9, layoutDirection) & 7;
                    if (!(absoluteGravity2 == 1 || absoluteGravity2 == 3 || absoluteGravity2 == 5)) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            k1 k1Var2 = (k1) childAt2.getLayoutParams();
            if (k1Var2.f14001b == 0 && u(childAt2)) {
                int i11 = k1Var2.f14000a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i11, layoutDirection2) & 7;
                if (!(absoluteGravity3 == 1 || absoluteGravity3 == 3 || absoluteGravity3 == 5)) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        k1 k1Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            k1Var = h();
        } else if (!checkLayoutParams(layoutParams)) {
            k1Var = i(layoutParams);
        } else {
            k1Var = (k1) layoutParams;
        }
        k1Var.f14001b = 1;
        if (!z || this.f7584f0 == null) {
            addView(view, k1Var);
            return;
        }
        view.setLayoutParams(k1Var);
        this.f7560B0.add(view);
    }

    public final void c() {
        if (this.f7583e0 == null) {
            C1300w wVar = new C1300w(getContext(), (AttributeSet) null, 2130969790);
            this.f7583e0 = wVar;
            wVar.setImageDrawable(this.f7581c0);
            this.f7583e0.setContentDescription(this.f7582d0);
            k1 h5 = h();
            h5.f14000a = (this.f7589k0 & 112) | 8388611;
            h5.f14001b = 2;
            this.f7583e0.setLayoutParams(h5);
            this.f7583e0.setOnClickListener(new K(4, this));
        }
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof k1)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, o.Q0] */
    public final void d() {
        if (this.f7594q0 == null) {
            ? obj = new Object();
            obj.f13881a = 0;
            obj.f13882b = 0;
            obj.f13883c = RecyclerView.UNDEFINED_DURATION;
            obj.f13884d = RecyclerView.UNDEFINED_DURATION;
            obj.e = 0;
            obj.f13885f = 0;
            obj.f13886g = false;
            obj.f13887h = false;
            this.f7594q0 = obj;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f7576U;
        if (actionMenuView.f7445m0 == null) {
            m mVar = (m) actionMenuView.getMenu();
            if (this.f7568J0 == null) {
                this.f7568J0 = new j1(this);
            }
            this.f7576U.setExpandedActionViewsExclusive(true);
            mVar.b(this.f7568J0, this.f7585g0);
            w();
        }
    }

    public final void f() {
        if (this.f7576U == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f7576U = actionMenuView;
            actionMenuView.setPopupTheme(this.f7586h0);
            this.f7576U.setOnMenuItemClickListener(this.f7565G0);
            ActionMenuView actionMenuView2 = this.f7576U;
            G g8 = this.f7569K0;
            h1 h1Var = new h1(this);
            actionMenuView2.f7449r0 = g8;
            actionMenuView2.f7450s0 = h1Var;
            k1 h5 = h();
            h5.f14000a = (this.f7589k0 & 112) | 8388613;
            this.f7576U.setLayoutParams(h5);
            b(this.f7576U, false);
        }
    }

    public final void g() {
        if (this.f7579a0 == null) {
            this.f7579a0 = new C1300w(getContext(), (AttributeSet) null, 2130969790);
            k1 h5 = h();
            h5.f14000a = (this.f7589k0 & 112) | 8388611;
            this.f7579a0.setLayoutParams(h5);
        }
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1300w wVar = this.f7583e0;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1300w wVar = this.f7583e0;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Q0 q02 = this.f7594q0;
        if (q02 == null) {
            return 0;
        }
        if (q02.f13886g) {
            return q02.f13881a;
        }
        return q02.f13882b;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f7596s0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q0 q02 = this.f7594q0;
        if (q02 != null) {
            return q02.f13881a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q0 q02 = this.f7594q0;
        if (q02 != null) {
            return q02.f13882b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q0 q02 = this.f7594q0;
        if (q02 == null) {
            return 0;
        }
        if (q02.f13886g) {
            return q02.f13882b;
        }
        return q02.f13881a;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f7595r0;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        m mVar;
        ActionMenuView actionMenuView = this.f7576U;
        if (actionMenuView == null || (mVar = actionMenuView.f7445m0) == null || !mVar.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.f7596s0, 0));
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f7595r0, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        C1302x xVar = this.f7580b0;
        if (xVar != null) {
            return xVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1302x xVar = this.f7580b0;
        if (xVar != null) {
            return xVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f7576U.getMenu();
    }

    public View getNavButtonView() {
        return this.f7579a0;
    }

    public CharSequence getNavigationContentDescription() {
        C1300w wVar = this.f7579a0;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1300w wVar = this.f7579a0;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public C1277k getOuterActionMenuPresenter() {
        return this.f7567I0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f7576U.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f7585g0;
    }

    public int getPopupTheme() {
        return this.f7586h0;
    }

    public CharSequence getSubtitle() {
        return this.f7599v0;
    }

    public final TextView getSubtitleTextView() {
        return this.f7578W;
    }

    public CharSequence getTitle() {
        return this.f7598u0;
    }

    public int getTitleMarginBottom() {
        return this.p0;
    }

    public int getTitleMarginEnd() {
        return this.f7592n0;
    }

    public int getTitleMarginStart() {
        return this.f7591m0;
    }

    public int getTitleMarginTop() {
        return this.f7593o0;
    }

    public final TextView getTitleTextView() {
        return this.f7577V;
    }

    public C1278k0 getWrapper() {
        if (this.f7566H0 == null) {
            this.f7566H0 = new o1(this, true);
        }
        return this.f7566H0;
    }

    public final int j(View view, int i) {
        int i8;
        k1 k1Var = (k1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i8 = (measuredHeight - i) / 2;
        } else {
            i8 = 0;
        }
        int i9 = k1Var.f14000a & 112;
        if (!(i9 == 16 || i9 == 48 || i9 == 80)) {
            i9 = this.f7597t0 & 112;
        }
        if (i9 == 48) {
            return getPaddingTop() - i8;
        }
        if (i9 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - k1Var.bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i10 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i11 = k1Var.topMargin;
        if (i10 < i11) {
            i10 = i11;
        } else {
            int i12 = (((height - paddingBottom) - measuredHeight) - i10) - paddingTop;
            int i13 = k1Var.bottomMargin;
            if (i12 < i13) {
                i10 = Math.max(0, i10 - (i13 - i12));
            }
        }
        return paddingTop + i10;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        Iterator it = this.f7563E0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f7562D0.f9767W).iterator();
        while (it2.hasNext()) {
            ((E) it2.next()).f7842a.k();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f7563E0 = currentMenuItems2;
    }

    public final boolean o(View view) {
        if (view.getParent() == this || this.f7560B0.contains(view)) {
            return true;
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f7575Q0);
        w();
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f7603z0 = false;
        }
        if (!this.f7603z0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f7603z0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f7603z0 = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0298 A[LOOP:0: B:102:0x0296->B:103:0x0298, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02b5 A[LOOP:1: B:105:0x02b3->B:106:0x02b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02d3 A[LOOP:2: B:108:0x02d1->B:109:0x02d3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0321 A[LOOP:3: B:116:0x031f->B:117:0x0321, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getLayoutDirection()
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r18.getWidth()
            int r5 = r18.getHeight()
            int r6 = r18.getPaddingLeft()
            int r7 = r18.getPaddingRight()
            int r8 = r18.getPaddingTop()
            int r9 = r18.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f7561C0
            r11[r3] = r2
            r11[r2] = r2
            java.util.WeakHashMap r12 = v0.C1510H.f15874a
            int r12 = r18.getMinimumHeight()
            if (r12 < 0) goto L_0x003c
            int r13 = r23 - r21
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            o.w r13 = r0.f7579a0
            boolean r13 = r0.u(r13)
            if (r13 == 0) goto L_0x0058
            if (r1 == 0) goto L_0x0050
            o.w r13 = r0.f7579a0
            int r13 = r0.r(r13, r10, r12, r11)
            r14 = r13
            r13 = r6
            goto L_0x005a
        L_0x0050:
            o.w r13 = r0.f7579a0
            int r13 = r0.q(r13, r6, r12, r11)
        L_0x0056:
            r14 = r10
            goto L_0x005a
        L_0x0058:
            r13 = r6
            goto L_0x0056
        L_0x005a:
            o.w r15 = r0.f7583e0
            boolean r15 = r0.u(r15)
            if (r15 == 0) goto L_0x0071
            if (r1 == 0) goto L_0x006b
            o.w r15 = r0.f7583e0
            int r14 = r0.r(r15, r14, r12, r11)
            goto L_0x0071
        L_0x006b:
            o.w r15 = r0.f7583e0
            int r13 = r0.q(r15, r13, r12, r11)
        L_0x0071:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f7576U
            boolean r15 = r0.u(r15)
            if (r15 == 0) goto L_0x0088
            if (r1 == 0) goto L_0x0082
            androidx.appcompat.widget.ActionMenuView r15 = r0.f7576U
            int r13 = r0.q(r15, r13, r12, r11)
            goto L_0x0088
        L_0x0082:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f7576U
            int r14 = r0.r(r15, r14, r12, r11)
        L_0x0088:
            int r15 = r18.getCurrentContentInsetLeft()
            int r16 = r18.getCurrentContentInsetRight()
            int r3 = r15 - r13
            int r3 = java.lang.Math.max(r2, r3)
            r11[r2] = r3
            int r3 = r10 - r14
            int r3 = r16 - r3
            int r3 = java.lang.Math.max(r2, r3)
            r17 = 1
            r11[r17] = r3
            int r3 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f7584f0
            boolean r13 = r0.u(r13)
            if (r13 == 0) goto L_0x00c5
            if (r1 == 0) goto L_0x00bf
            android.view.View r13 = r0.f7584f0
            int r10 = r0.r(r13, r10, r12, r11)
            goto L_0x00c5
        L_0x00bf:
            android.view.View r13 = r0.f7584f0
            int r3 = r0.q(r13, r3, r12, r11)
        L_0x00c5:
            o.x r13 = r0.f7580b0
            boolean r13 = r0.u(r13)
            if (r13 == 0) goto L_0x00dc
            if (r1 == 0) goto L_0x00d6
            o.x r13 = r0.f7580b0
            int r10 = r0.r(r13, r10, r12, r11)
            goto L_0x00dc
        L_0x00d6:
            o.x r13 = r0.f7580b0
            int r3 = r0.q(r13, r3, r12, r11)
        L_0x00dc:
            o.b0 r13 = r0.f7577V
            boolean r13 = r0.u(r13)
            o.b0 r14 = r0.f7578W
            boolean r14 = r0.u(r14)
            if (r13 == 0) goto L_0x0101
            o.b0 r15 = r0.f7577V
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            o.k1 r15 = (o.k1) r15
            int r2 = r15.topMargin
            r22 = r7
            o.b0 r7 = r0.f7577V
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r2
            int r2 = r15.bottomMargin
            int r2 = r2 + r7
            goto L_0x0104
        L_0x0101:
            r22 = r7
            r2 = 0
        L_0x0104:
            if (r14 == 0) goto L_0x011e
            o.b0 r7 = r0.f7578W
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            o.k1 r7 = (o.k1) r7
            int r15 = r7.topMargin
            r16 = r4
            o.b0 r4 = r0.f7578W
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r7 = r7.bottomMargin
            int r4 = r4 + r7
            int r2 = r2 + r4
            goto L_0x0120
        L_0x011e:
            r16 = r4
        L_0x0120:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0125
            goto L_0x012b
        L_0x0125:
            r17 = r6
            r21 = r12
            goto L_0x028a
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            o.b0 r4 = r0.f7577V
            goto L_0x0132
        L_0x0130:
            o.b0 r4 = r0.f7578W
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            o.b0 r7 = r0.f7578W
            goto L_0x0139
        L_0x0137:
            o.b0 r7 = r0.f7577V
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            o.k1 r4 = (o.k1) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            o.k1 r7 = (o.k1) r7
            if (r13 == 0) goto L_0x014f
            o.b0 r15 = r0.f7577V
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            o.b0 r15 = r0.f7578W
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r17 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r17 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.f7597t0
            r6 = r6 & 112(0x70, float:1.57E-43)
            r21 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a2
            r12 = 80
            if (r6 == r12) goto L_0x0196
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r2
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r23 = r3
            int r3 = r0.f7593o0
            int r12 = r12 + r3
            if (r6 >= r12) goto L_0x017f
            r6 = r12
            goto L_0x0194
        L_0x017f:
            int r5 = r5 - r9
            int r5 = r5 - r2
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.p0
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0194
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0194:
            int r8 = r8 + r6
            goto L_0x01af
        L_0x0196:
            r23 = r3
            int r5 = r5 - r9
            int r3 = r7.bottomMargin
            int r5 = r5 - r3
            int r3 = r0.p0
            int r5 = r5 - r3
            int r8 = r5 - r2
            goto L_0x01af
        L_0x01a2:
            r23 = r3
            int r2 = r18.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f7593o0
            int r8 = r2 + r3
        L_0x01af:
            if (r1 == 0) goto L_0x0221
            if (r15 == 0) goto L_0x01b7
            int r1 = r0.f7591m0
        L_0x01b5:
            r2 = 1
            goto L_0x01b9
        L_0x01b7:
            r1 = 0
            goto L_0x01b5
        L_0x01b9:
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01ef
            o.b0 r1 = r0.f7577V
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.k1 r1 = (o.k1) r1
            o.b0 r2 = r0.f7577V
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            o.b0 r3 = r0.f7577V
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            o.b0 r4 = r0.f7577V
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f7592n0
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f0
        L_0x01ef:
            r2 = r10
        L_0x01f0:
            if (r14 == 0) goto L_0x0216
            o.b0 r1 = r0.f7578W
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.k1 r1 = (o.k1) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            o.b0 r1 = r0.f7578W
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            o.b0 r3 = r0.f7578W
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            o.b0 r4 = r0.f7578W
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f7592n0
            int r1 = r10 - r1
            goto L_0x0217
        L_0x0216:
            r1 = r10
        L_0x0217:
            if (r15 == 0) goto L_0x021e
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x021e:
            r3 = r23
            goto L_0x028a
        L_0x0221:
            if (r15 == 0) goto L_0x0227
            int r1 = r0.f7591m0
        L_0x0225:
            r2 = 0
            goto L_0x0229
        L_0x0227:
            r1 = 0
            goto L_0x0225
        L_0x0229:
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r23
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x025e
            o.b0 r1 = r0.f7577V
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.k1 r1 = (o.k1) r1
            o.b0 r2 = r0.f7577V
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            o.b0 r4 = r0.f7577V
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            o.b0 r5 = r0.f7577V
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f7592n0
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x025f
        L_0x025e:
            r2 = r3
        L_0x025f:
            if (r14 == 0) goto L_0x0283
            o.b0 r1 = r0.f7578W
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            o.k1 r1 = (o.k1) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            o.b0 r1 = r0.f7578W
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            o.b0 r4 = r0.f7578W
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            o.b0 r5 = r0.f7578W
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.f7592n0
            int r1 = r1 + r4
            goto L_0x0284
        L_0x0283:
            r1 = r3
        L_0x0284:
            if (r15 == 0) goto L_0x028a
            int r3 = java.lang.Math.max(r2, r1)
        L_0x028a:
            java.util.ArrayList r1 = r0.f7559A0
            r2 = 3
            r0.a(r2, r1)
            int r2 = r1.size()
            r4 = r3
            r3 = 0
        L_0x0296:
            if (r3 >= r2) goto L_0x02a7
            java.lang.Object r5 = r1.get(r3)
            android.view.View r5 = (android.view.View) r5
            r12 = r21
            int r4 = r0.q(r5, r4, r12, r11)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x0296
        L_0x02a7:
            r12 = r21
            r5 = 1
            r2 = 5
            r0.a(r2, r1)
            int r2 = r1.size()
            r3 = 0
        L_0x02b3:
            if (r3 >= r2) goto L_0x02c1
            java.lang.Object r6 = r1.get(r3)
            android.view.View r6 = (android.view.View) r6
            int r10 = r0.r(r6, r10, r12, r11)
            int r3 = r3 + r5
            goto L_0x02b3
        L_0x02c1:
            r0.a(r5, r1)
            r2 = 0
            r3 = r11[r2]
            r2 = r11[r5]
            int r5 = r1.size()
            r6 = r2
            r7 = r3
            r2 = 0
            r3 = 0
        L_0x02d1:
            if (r2 >= r5) goto L_0x0304
            java.lang.Object r8 = r1.get(r2)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            o.k1 r9 = (o.k1) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r6
            r6 = 0
            int r9 = java.lang.Math.max(r6, r13)
            int r14 = java.lang.Math.max(r6, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r6, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r6, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r3 = r3 + r8
            r8 = 1
            int r2 = r2 + r8
            r6 = r7
            r7 = r13
            goto L_0x02d1
        L_0x0304:
            r6 = 0
            int r2 = r16 - r17
            int r2 = r2 - r22
            int r2 = r2 / 2
            int r2 = r2 + r17
            int r5 = r3 / 2
            int r2 = r2 - r5
            int r3 = r3 + r2
            if (r2 >= r4) goto L_0x0314
            goto L_0x031b
        L_0x0314:
            if (r3 <= r10) goto L_0x031a
            int r3 = r3 - r10
            int r4 = r2 - r3
            goto L_0x031b
        L_0x031a:
            r4 = r2
        L_0x031b:
            int r2 = r1.size()
        L_0x031f:
            if (r6 >= r2) goto L_0x032e
            java.lang.Object r3 = r1.get(r6)
            android.view.View r3 = (android.view.View) r3
            int r4 = r0.q(r3, r4, r12, r11)
            r3 = 1
            int r6 = r6 + r3
            goto L_0x031f
        L_0x032e:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i8) {
        char c8;
        char c9;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z = w1.f14104a;
        int i16 = 0;
        if (getLayoutDirection() == 1) {
            c9 = 1;
            c8 = 0;
        } else {
            c9 = 0;
            c8 = 1;
        }
        if (u(this.f7579a0)) {
            t(this.f7579a0, i, 0, i8, this.f7590l0);
            i11 = k(this.f7579a0) + this.f7579a0.getMeasuredWidth();
            i10 = Math.max(0, l(this.f7579a0) + this.f7579a0.getMeasuredHeight());
            i9 = View.combineMeasuredStates(0, this.f7579a0.getMeasuredState());
        } else {
            i11 = 0;
            i10 = 0;
            i9 = 0;
        }
        if (u(this.f7583e0)) {
            t(this.f7583e0, i, 0, i8, this.f7590l0);
            i11 = k(this.f7583e0) + this.f7583e0.getMeasuredWidth();
            i10 = Math.max(i10, l(this.f7583e0) + this.f7583e0.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f7583e0.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i11);
        int max2 = Math.max(0, currentContentInsetStart - i11);
        int[] iArr = this.f7561C0;
        iArr[c9] = max2;
        if (u(this.f7576U)) {
            t(this.f7576U, i, max, i8, this.f7590l0);
            i12 = k(this.f7576U) + this.f7576U.getMeasuredWidth();
            i10 = Math.max(i10, l(this.f7576U) + this.f7576U.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f7576U.getMeasuredState());
        } else {
            i12 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max3 = max + Math.max(currentContentInsetEnd, i12);
        iArr[c8] = Math.max(0, currentContentInsetEnd - i12);
        if (u(this.f7584f0)) {
            max3 += s(this.f7584f0, i, max3, i8, 0, iArr);
            i10 = Math.max(i10, l(this.f7584f0) + this.f7584f0.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f7584f0.getMeasuredState());
        }
        if (u(this.f7580b0)) {
            max3 += s(this.f7580b0, i, max3, i8, 0, iArr);
            i10 = Math.max(i10, l(this.f7580b0) + this.f7580b0.getMeasuredHeight());
            i9 = View.combineMeasuredStates(i9, this.f7580b0.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (((k1) childAt.getLayoutParams()).f14001b == 0 && u(childAt)) {
                View view = childAt;
                max3 += s(childAt, i, max3, i8, 0, iArr);
                i10 = Math.max(i10, l(view) + view.getMeasuredHeight());
                i9 = View.combineMeasuredStates(i9, view.getMeasuredState());
            }
        }
        int i18 = this.f7593o0 + this.p0;
        int i19 = this.f7591m0 + this.f7592n0;
        if (u(this.f7577V)) {
            s(this.f7577V, i, max3 + i19, i8, i18, iArr);
            int k8 = k(this.f7577V) + this.f7577V.getMeasuredWidth();
            i13 = l(this.f7577V) + this.f7577V.getMeasuredHeight();
            i15 = View.combineMeasuredStates(i9, this.f7577V.getMeasuredState());
            i14 = k8;
        } else {
            i15 = i9;
            i14 = 0;
            i13 = 0;
        }
        if (u(this.f7578W)) {
            int i20 = i13 + i18;
            i14 = Math.max(i14, s(this.f7578W, i, max3 + i19, i8, i20, iArr));
            i13 = l(this.f7578W) + this.f7578W.getMeasuredHeight() + i13;
            i15 = View.combineMeasuredStates(i15, this.f7578W.getMeasuredState());
        } else {
            int i21 = i15;
        }
        int max4 = Math.max(i10, i13);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i14, getSuggestedMinimumWidth()), i, -16777216 & i15);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i8, i15 << 16);
        if (this.f7571M0) {
            int childCount2 = getChildCount();
            int i22 = 0;
            while (true) {
                if (i22 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i22);
                if (u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i22++;
            }
        }
        i16 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i16);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        m mVar;
        MenuItem findItem;
        if (!(parcelable instanceof m1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m1 m1Var = (m1) parcelable;
        super.onRestoreInstanceState(m1Var.f367U);
        ActionMenuView actionMenuView = this.f7576U;
        if (actionMenuView != null) {
            mVar = actionMenuView.f7445m0;
        } else {
            mVar = null;
        }
        int i = m1Var.f14012W;
        if (!(i == 0 || this.f7568J0 == null || mVar == null || (findItem = mVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (m1Var.f14013X) {
            e eVar = this.f7575Q0;
            removeCallbacks(eVar);
            post(eVar);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        Q0 q02 = this.f7594q0;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != q02.f13886g) {
            q02.f13886g = z;
            if (!q02.f13887h) {
                q02.f13881a = q02.e;
                q02.f13882b = q02.f13885f;
            } else if (z) {
                int i8 = q02.f13884d;
                if (i8 == Integer.MIN_VALUE) {
                    i8 = q02.e;
                }
                q02.f13881a = i8;
                int i9 = q02.f13883c;
                if (i9 == Integer.MIN_VALUE) {
                    i9 = q02.f13885f;
                }
                q02.f13882b = i9;
            } else {
                int i10 = q02.f13883c;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = q02.e;
                }
                q02.f13881a = i10;
                int i11 = q02.f13884d;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = q02.f13885f;
                }
                q02.f13882b = i11;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [o.m1, android.os.Parcelable, B0.b] */
    public final Parcelable onSaveInstanceState() {
        o oVar;
        ? bVar = new b(super.onSaveInstanceState());
        j1 j1Var = this.f7568J0;
        if (!(j1Var == null || (oVar = j1Var.f13976V) == null)) {
            bVar.f14012W = oVar.f13504U;
        }
        bVar.f14013X = p();
        return bVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f7602y0 = false;
        }
        if (!this.f7602y0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f7602y0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f7602y0 = false;
        }
        return true;
    }

    public final boolean p() {
        C1277k kVar;
        ActionMenuView actionMenuView = this.f7576U;
        if (actionMenuView == null || (kVar = actionMenuView.f7448q0) == null || !kVar.e()) {
            return false;
        }
        return true;
    }

    public final int q(View view, int i, int i8, int[] iArr) {
        k1 k1Var = (k1) view.getLayoutParams();
        int i9 = k1Var.leftMargin - iArr[0];
        int max = Math.max(0, i9) + i;
        iArr[0] = Math.max(0, -i9);
        int j7 = j(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, j7, max + measuredWidth, view.getMeasuredHeight() + j7);
        return measuredWidth + k1Var.rightMargin + max;
    }

    public final int r(View view, int i, int i8, int[] iArr) {
        k1 k1Var = (k1) view.getLayoutParams();
        int i9 = k1Var.rightMargin - iArr[1];
        int max = i - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int j7 = j(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, j7, max, view.getMeasuredHeight() + j7);
        return max - (measuredWidth + k1Var.leftMargin);
    }

    public final int s(View view, int i, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i12) + Math.max(0, i11);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f7574P0 != z) {
            this.f7574P0 = z;
            w();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C0003d.r(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f7571M0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f7596s0) {
            this.f7596s0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.f7595r0) {
            this.f7595r0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C0003d.r(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C0003d.r(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f7579a0.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(l1 l1Var) {
        this.f7564F0 = l1Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f7576U.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f7586h0 != i) {
            this.f7586h0 = i;
            if (i == 0) {
                this.f7585g0 = getContext();
            } else {
                this.f7585g0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.p0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f7592n0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f7591m0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f7593o0 = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final void t(View view, int i, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i10 >= 0) {
            if (mode != 0) {
                i10 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i10);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i10, O7.b.MAX_POW2);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean u(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    public final boolean v() {
        C1277k kVar;
        ActionMenuView actionMenuView = this.f7576U;
        if (actionMenuView == null || (kVar = actionMenuView.f7448q0) == null || !kVar.l()) {
            return false;
        }
        return true;
    }

    public final void w() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a8 = i1.a(this);
            j1 j1Var = this.f7568J0;
            if (j1Var == null || j1Var.f13976V == null || a8 == null || !isAttachedToWindow() || !this.f7574P0) {
                z = false;
            } else {
                z = true;
            }
            if (z && this.f7573O0 == null) {
                if (this.f7572N0 == null) {
                    this.f7572N0 = i1.b(new g1(this, 0));
                }
                i1.c(a8, this.f7572N0);
                this.f7573O0 = a8;
            } else if (!z && (onBackInvokedDispatcher = this.f7573O0) != null) {
                i1.d(onBackInvokedDispatcher, this.f7572N0);
                this.f7573O0 = null;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 2130969791);
        this.f7597t0 = 8388627;
        this.f7559A0 = new ArrayList();
        this.f7560B0 = new ArrayList();
        this.f7561C0 = new int[2];
        this.f7562D0 = new k((Runnable) new g1(this, 1));
        this.f7563E0 = new ArrayList();
        this.f7565G0 = new h1(this);
        this.f7575Q0 = new e(24, this);
        Context context2 = getContext();
        int[] iArr = C0940a.f11836y;
        k K22 = k.K2(context2, attributeSet, iArr, 2130969791);
        C1510H.o(this, context, iArr, attributeSet, (TypedArray) K22.f9767W, 2130969791);
        TypedArray typedArray = (TypedArray) K22.f9767W;
        this.f7587i0 = typedArray.getResourceId(28, 0);
        this.f7588j0 = typedArray.getResourceId(19, 0);
        this.f7597t0 = typedArray.getInteger(0, 8388627);
        this.f7589k0 = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.p0 = dimensionPixelOffset;
        this.f7593o0 = dimensionPixelOffset;
        this.f7592n0 = dimensionPixelOffset;
        this.f7591m0 = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f7591m0 = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f7592n0 = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f7593o0 = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.p0 = dimensionPixelOffset5;
        }
        this.f7590l0 = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, RecyclerView.UNDEFINED_DURATION);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, RecyclerView.UNDEFINED_DURATION);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        Q0 q02 = this.f7594q0;
        q02.f13887h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            q02.e = dimensionPixelSize;
            q02.f13881a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            q02.f13885f = dimensionPixelSize2;
            q02.f13882b = dimensionPixelSize2;
        }
        if (!(dimensionPixelOffset6 == Integer.MIN_VALUE && dimensionPixelOffset7 == Integer.MIN_VALUE)) {
            q02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f7595r0 = typedArray.getDimensionPixelOffset(10, RecyclerView.UNDEFINED_DURATION);
        this.f7596s0 = typedArray.getDimensionPixelOffset(6, RecyclerView.UNDEFINED_DURATION);
        this.f7581c0 = K22.I(4);
        this.f7582d0 = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f7585g0 = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable I8 = K22.I(16);
        if (I8 != null) {
            setNavigationIcon(I8);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable I9 = K22.I(11);
        if (I9 != null) {
            setLogo(I9);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(K22.v(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(K22.v(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        K22.M2();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, o.k1, android.view.ViewGroup$MarginLayoutParams] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f14000a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0940a.f11815b);
        marginLayoutParams.f14000a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.f14001b = 0;
        return marginLayoutParams;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C1300w wVar = this.f7583e0;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f7583e0.setImageDrawable(drawable);
            return;
        }
        C1300w wVar = this.f7583e0;
        if (wVar != null) {
            wVar.setImageDrawable(this.f7581c0);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f7580b0 == null) {
                this.f7580b0 = new C1302x(getContext(), (AttributeSet) null, 0);
            }
            if (!o(this.f7580b0)) {
                b(this.f7580b0, true);
            }
        } else {
            C1302x xVar = this.f7580b0;
            if (xVar != null && o(xVar)) {
                removeView(this.f7580b0);
                this.f7560B0.remove(this.f7580b0);
            }
        }
        C1302x xVar2 = this.f7580b0;
        if (xVar2 != null) {
            xVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f7580b0 == null) {
            this.f7580b0 = new C1302x(getContext(), (AttributeSet) null, 0);
        }
        C1302x xVar = this.f7580b0;
        if (xVar != null) {
            xVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C1300w wVar = this.f7579a0;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
            c.w(this.f7579a0, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f7579a0)) {
                b(this.f7579a0, true);
            }
        } else {
            C1300w wVar = this.f7579a0;
            if (wVar != null && o(wVar)) {
                removeView(this.f7579a0);
                this.f7560B0.remove(this.f7579a0);
            }
        }
        C1300w wVar2 = this.f7579a0;
        if (wVar2 != null) {
            wVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f7578W == null) {
                Context context = getContext();
                C1260b0 b0Var = new C1260b0(context, (AttributeSet) null);
                this.f7578W = b0Var;
                b0Var.setSingleLine();
                this.f7578W.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f7588j0;
                if (i != 0) {
                    this.f7578W.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f7601x0;
                if (colorStateList != null) {
                    this.f7578W.setTextColor(colorStateList);
                }
            }
            if (!o(this.f7578W)) {
                b(this.f7578W, true);
            }
        } else {
            C1260b0 b0Var2 = this.f7578W;
            if (b0Var2 != null && o(b0Var2)) {
                removeView(this.f7578W);
                this.f7560B0.remove(this.f7578W);
            }
        }
        C1260b0 b0Var3 = this.f7578W;
        if (b0Var3 != null) {
            b0Var3.setText(charSequence);
        }
        this.f7599v0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f7601x0 = colorStateList;
        C1260b0 b0Var = this.f7578W;
        if (b0Var != null) {
            b0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f7577V == null) {
                Context context = getContext();
                C1260b0 b0Var = new C1260b0(context, (AttributeSet) null);
                this.f7577V = b0Var;
                b0Var.setSingleLine();
                this.f7577V.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f7587i0;
                if (i != 0) {
                    this.f7577V.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f7600w0;
                if (colorStateList != null) {
                    this.f7577V.setTextColor(colorStateList);
                }
            }
            if (!o(this.f7577V)) {
                b(this.f7577V, true);
            }
        } else {
            C1260b0 b0Var2 = this.f7577V;
            if (b0Var2 != null && o(b0Var2)) {
                removeView(this.f7577V);
                this.f7560B0.remove(this.f7577V);
            }
        }
        C1260b0 b0Var3 = this.f7577V;
        if (b0Var3 != null) {
            b0Var3.setText(charSequence);
        }
        this.f7598u0 = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f7600w0 = colorStateList;
        C1260b0 b0Var = this.f7577V;
        if (b0Var != null) {
            b0Var.setTextColor(colorStateList);
        }
    }
}
