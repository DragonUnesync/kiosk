package n;

import B.C0003d;
import E.e;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import k2.C1160q;
import o0.C1308a;

public final class o implements C1308a {

    /* renamed from: U  reason: collision with root package name */
    public final int f13504U;

    /* renamed from: V  reason: collision with root package name */
    public final int f13505V;

    /* renamed from: W  reason: collision with root package name */
    public final int f13506W;

    /* renamed from: X  reason: collision with root package name */
    public final int f13507X;

    /* renamed from: Y  reason: collision with root package name */
    public CharSequence f13508Y;

    /* renamed from: Z  reason: collision with root package name */
    public CharSequence f13509Z;

    /* renamed from: a0  reason: collision with root package name */
    public Intent f13510a0;

    /* renamed from: b0  reason: collision with root package name */
    public char f13511b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f13512c0 = 4096;

    /* renamed from: d0  reason: collision with root package name */
    public char f13513d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f13514e0 = 4096;

    /* renamed from: f0  reason: collision with root package name */
    public Drawable f13515f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f13516g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public final m f13517h0;

    /* renamed from: i0  reason: collision with root package name */
    public C1224E f13518i0;

    /* renamed from: j0  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f13519j0;

    /* renamed from: k0  reason: collision with root package name */
    public CharSequence f13520k0;

    /* renamed from: l0  reason: collision with root package name */
    public CharSequence f13521l0;

    /* renamed from: m0  reason: collision with root package name */
    public ColorStateList f13522m0 = null;

    /* renamed from: n0  reason: collision with root package name */
    public PorterDuff.Mode f13523n0 = null;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f13524o0 = false;
    public boolean p0 = false;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f13525q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public int f13526r0 = 16;

    /* renamed from: s0  reason: collision with root package name */
    public int f13527s0;

    /* renamed from: t0  reason: collision with root package name */
    public View f13528t0;

    /* renamed from: u0  reason: collision with root package name */
    public p f13529u0;

    /* renamed from: v0  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f13530v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f13531w0 = false;

    public o(m mVar, int i, int i8, int i9, int i10, CharSequence charSequence, int i11) {
        this.f13517h0 = mVar;
        this.f13504U = i8;
        this.f13505V = i;
        this.f13506W = i9;
        this.f13507X = i10;
        this.f13508Y = charSequence;
        this.f13527s0 = i11;
    }

    public static void c(StringBuilder sb, int i, int i8, String str) {
        if ((i & i8) == i8) {
            sb.append(str);
        }
    }

    public final p a() {
        return this.f13529u0;
    }

    public final C1308a b(p pVar) {
        this.f13528t0 = null;
        this.f13529u0 = pVar;
        this.f13517h0.p(true);
        p pVar2 = this.f13529u0;
        if (pVar2 != null) {
            pVar2.f13532a = new C1160q(7, (Object) this);
            pVar2.f13533b.setVisibilityListener(pVar2);
        }
        return this;
    }

    public final boolean collapseActionView() {
        if ((this.f13527s0 & 8) == 0) {
            return false;
        }
        if (this.f13528t0 == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13530v0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f13517h0.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f13525q0 && (this.f13524o0 || this.p0)) {
            drawable = e.z(drawable).mutate();
            if (this.f13524o0) {
                drawable.setTintList(this.f13522m0);
            }
            if (this.p0) {
                drawable.setTintMode(this.f13523n0);
            }
            this.f13525q0 = false;
        }
        return drawable;
    }

    public final boolean e() {
        p pVar;
        if ((this.f13527s0 & 8) == 0) {
            return false;
        }
        if (this.f13528t0 == null && (pVar = this.f13529u0) != null) {
            this.f13528t0 = pVar.f13533b.onCreateActionView(this);
        }
        if (this.f13528t0 != null) {
            return true;
        }
        return false;
    }

    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13530v0;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f13517h0.f(this);
        }
        return false;
    }

    public final boolean f() {
        if ((this.f13526r0 & 32) == 32) {
            return true;
        }
        return false;
    }

    public final void g(boolean z) {
        if (z) {
            this.f13526r0 |= 32;
        } else {
            this.f13526r0 &= -33;
        }
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final View getActionView() {
        View view = this.f13528t0;
        if (view != null) {
            return view;
        }
        p pVar = this.f13529u0;
        if (pVar == null) {
            return null;
        }
        View onCreateActionView = pVar.f13533b.onCreateActionView(this);
        this.f13528t0 = onCreateActionView;
        return onCreateActionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f13514e0;
    }

    public final char getAlphabeticShortcut() {
        return this.f13513d0;
    }

    public final CharSequence getContentDescription() {
        return this.f13520k0;
    }

    public final int getGroupId() {
        return this.f13505V;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.f13515f0;
        if (drawable != null) {
            return d(drawable);
        }
        int i = this.f13516g0;
        if (i == 0) {
            return null;
        }
        Drawable r8 = C0003d.r(this.f13517h0.f13478U, i);
        this.f13516g0 = 0;
        this.f13515f0 = r8;
        return d(r8);
    }

    public final ColorStateList getIconTintList() {
        return this.f13522m0;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f13523n0;
    }

    public final Intent getIntent() {
        return this.f13510a0;
    }

    public final int getItemId() {
        return this.f13504U;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f13512c0;
    }

    public final char getNumericShortcut() {
        return this.f13511b0;
    }

    public final int getOrder() {
        return this.f13506W;
    }

    public final SubMenu getSubMenu() {
        return this.f13518i0;
    }

    public final CharSequence getTitle() {
        return this.f13508Y;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13509Z;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f13508Y;
    }

    public final CharSequence getTooltipText() {
        return this.f13521l0;
    }

    public final boolean hasSubMenu() {
        if (this.f13518i0 != null) {
            return true;
        }
        return false;
    }

    public final boolean isActionViewExpanded() {
        return this.f13531w0;
    }

    public final boolean isCheckable() {
        if ((this.f13526r0 & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f13526r0 & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f13526r0 & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        p pVar = this.f13529u0;
        if (pVar == null || !pVar.f13533b.overridesItemVisibility()) {
            if ((this.f13526r0 & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f13526r0 & 8) != 0 || !this.f13529u0.f13533b.isVisible()) {
            return false;
        } else {
            return true;
        }
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final MenuItem setActionView(View view) {
        int i;
        this.f13528t0 = view;
        this.f13529u0 = null;
        if (view != null && view.getId() == -1 && (i = this.f13504U) > 0) {
            view.setId(i);
        }
        m mVar = this.f13517h0;
        mVar.f13488e0 = true;
        mVar.p(true);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c8) {
        if (this.f13513d0 == c8) {
            return this;
        }
        this.f13513d0 = Character.toLowerCase(c8);
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        int i = this.f13526r0;
        boolean z6 = z | (i & true);
        this.f13526r0 = z6 ? 1 : 0;
        if (i != z6) {
            this.f13517h0.p(false);
        }
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        boolean z6;
        int i;
        int i8 = this.f13526r0;
        int i9 = 2;
        if ((i8 & 4) != 0) {
            m mVar = this.f13517h0;
            mVar.getClass();
            ArrayList arrayList = mVar.f13483Z;
            int size = arrayList.size();
            mVar.w();
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) arrayList.get(i10);
                if (oVar.f13505V == this.f13505V && (oVar.f13526r0 & 4) != 0 && oVar.isCheckable()) {
                    if (oVar == this) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    int i11 = oVar.f13526r0;
                    int i12 = i11 & -3;
                    if (z6) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    int i13 = i | i12;
                    oVar.f13526r0 = i13;
                    if (i11 != i13) {
                        oVar.f13517h0.p(false);
                    }
                }
            }
            mVar.v();
        } else {
            int i14 = i8 & -3;
            if (!z) {
                i9 = 0;
            }
            int i15 = i14 | i9;
            this.f13526r0 = i15;
            if (i8 != i15) {
                this.f13517h0.p(false);
            }
        }
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.f13526r0 |= 16;
        } else {
            this.f13526r0 &= -17;
        }
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f13516g0 = 0;
        this.f13515f0 = drawable;
        this.f13525q0 = true;
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13522m0 = colorStateList;
        this.f13524o0 = true;
        this.f13525q0 = true;
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13523n0 = mode;
        this.p0 = true;
        this.f13525q0 = true;
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f13510a0 = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c8) {
        if (this.f13511b0 == c8) {
            return this;
        }
        this.f13511b0 = c8;
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13530v0 = onActionExpandListener;
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13519j0 = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c8, char c9) {
        this.f13511b0 = c8;
        this.f13513d0 = Character.toLowerCase(c9);
        this.f13517h0.p(false);
        return this;
    }

    public final void setShowAsAction(int i) {
        int i8 = i & 3;
        if (i8 == 0 || i8 == 1 || i8 == 2) {
            this.f13527s0 = i;
            m mVar = this.f13517h0;
            mVar.f13488e0 = true;
            mVar.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13508Y = charSequence;
        this.f13517h0.p(false);
        C1224E e = this.f13518i0;
        if (e != null) {
            e.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13509Z = charSequence;
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i;
        int i8 = this.f13526r0;
        int i9 = i8 & -9;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i10 = i | i9;
        this.f13526r0 = i10;
        if (i8 != i10) {
            m mVar = this.f13517h0;
            mVar.f13485b0 = true;
            mVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f13508Y;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final C1308a setContentDescription(CharSequence charSequence) {
        this.f13520k0 = charSequence;
        this.f13517h0.p(false);
        return this;
    }

    public final C1308a setTooltipText(CharSequence charSequence) {
        this.f13521l0 = charSequence;
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c8, int i) {
        if (this.f13513d0 == c8 && this.f13514e0 == i) {
            return this;
        }
        this.f13513d0 = Character.toLowerCase(c8);
        this.f13514e0 = KeyEvent.normalizeMetaState(i);
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setNumericShortcut(char c8, int i) {
        if (this.f13511b0 == c8 && this.f13512c0 == i) {
            return this;
        }
        this.f13511b0 = c8;
        this.f13512c0 = KeyEvent.normalizeMetaState(i);
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setShortcut(char c8, char c9, int i, int i8) {
        this.f13511b0 = c8;
        this.f13512c0 = KeyEvent.normalizeMetaState(i);
        this.f13513d0 = Character.toLowerCase(c9);
        this.f13514e0 = KeyEvent.normalizeMetaState(i8);
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f13515f0 = null;
        this.f13516g0 = i;
        this.f13525q0 = true;
        this.f13517h0.p(false);
        return this;
    }

    public final MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f13517h0.f13478U.getString(i));
        return this;
    }

    public final MenuItem setActionView(int i) {
        int i8;
        Context context = this.f13517h0.f13478U;
        View inflate = LayoutInflater.from(context).inflate(i, new LinearLayout(context), false);
        this.f13528t0 = inflate;
        this.f13529u0 = null;
        if (inflate != null && inflate.getId() == -1 && (i8 = this.f13504U) > 0) {
            inflate.setId(i8);
        }
        m mVar = this.f13517h0;
        mVar.f13488e0 = true;
        mVar.p(true);
        return this;
    }
}
