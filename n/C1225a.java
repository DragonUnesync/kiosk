package n;

import E.e;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import o0.C1308a;

/* renamed from: n.a  reason: case insensitive filesystem */
public final class C1225a implements C1308a {

    /* renamed from: U  reason: collision with root package name */
    public CharSequence f13412U;

    /* renamed from: V  reason: collision with root package name */
    public CharSequence f13413V;

    /* renamed from: W  reason: collision with root package name */
    public Intent f13414W;

    /* renamed from: X  reason: collision with root package name */
    public char f13415X;

    /* renamed from: Y  reason: collision with root package name */
    public int f13416Y;

    /* renamed from: Z  reason: collision with root package name */
    public char f13417Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f13418a0;

    /* renamed from: b0  reason: collision with root package name */
    public Drawable f13419b0;

    /* renamed from: c0  reason: collision with root package name */
    public Context f13420c0;

    /* renamed from: d0  reason: collision with root package name */
    public CharSequence f13421d0;

    /* renamed from: e0  reason: collision with root package name */
    public CharSequence f13422e0;

    /* renamed from: f0  reason: collision with root package name */
    public ColorStateList f13423f0;

    /* renamed from: g0  reason: collision with root package name */
    public PorterDuff.Mode f13424g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f13425h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f13426i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f13427j0;

    public final p a() {
        return null;
    }

    public final C1308a b(p pVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f13419b0;
        if (drawable == null) {
            return;
        }
        if (this.f13425h0 || this.f13426i0) {
            Drawable z = e.z(drawable);
            this.f13419b0 = z;
            Drawable mutate = z.mutate();
            this.f13419b0 = mutate;
            if (this.f13425h0) {
                mutate.setTintList(this.f13423f0);
            }
            if (this.f13426i0) {
                this.f13419b0.setTintMode(this.f13424g0);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.f13418a0;
    }

    public final char getAlphabeticShortcut() {
        return this.f13417Z;
    }

    public final CharSequence getContentDescription() {
        return this.f13421d0;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.f13419b0;
    }

    public final ColorStateList getIconTintList() {
        return this.f13423f0;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f13424g0;
    }

    public final Intent getIntent() {
        return this.f13414W;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.f13416Y;
    }

    public final char getNumericShortcut() {
        return this.f13415X;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.f13412U;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13413V;
        if (charSequence != null) {
            return charSequence;
        }
        return this.f13412U;
    }

    public final CharSequence getTooltipText() {
        return this.f13422e0;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        if ((this.f13427j0 & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isChecked() {
        if ((this.f13427j0 & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isEnabled() {
        if ((this.f13427j0 & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean isVisible() {
        if ((this.f13427j0 & 8) == 0) {
            return true;
        }
        return false;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c8) {
        this.f13417Z = Character.toLowerCase(c8);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f13427j0 = z | (this.f13427j0 & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        int i;
        int i8 = this.f13427j0 & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        this.f13427j0 = i | i8;
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13421d0 = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        int i;
        int i8 = this.f13427j0 & -17;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        this.f13427j0 = i | i8;
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f13419b0 = drawable;
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13423f0 = colorStateList;
        this.f13425h0 = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13424g0 = mode;
        this.f13426i0 = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f13414W = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c8) {
        this.f13415X = c8;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c8, char c9) {
        this.f13415X = c8;
        this.f13417Z = Character.toLowerCase(c9);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13412U = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13413V = charSequence;
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13422e0 = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i8 = this.f13427j0 & 8;
        if (z) {
            i = 0;
        }
        this.f13427j0 = i8 | i;
        return this;
    }

    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c8, int i) {
        this.f13417Z = Character.toLowerCase(c8);
        this.f13418a0 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final C1308a m20setContentDescription(CharSequence charSequence) {
        this.f13421d0 = charSequence;
        return this;
    }

    public final MenuItem setNumericShortcut(char c8, int i) {
        this.f13415X = c8;
        this.f13416Y = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f13412U = this.f13420c0.getResources().getString(i);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final C1308a m21setTooltipText(CharSequence charSequence) {
        this.f13422e0 = charSequence;
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f13419b0 = this.f13420c0.getDrawable(i);
        c();
        return this;
    }

    public final MenuItem setShortcut(char c8, char c9, int i, int i8) {
        this.f13415X = c8;
        this.f13416Y = KeyEvent.normalizeMetaState(i);
        this.f13417Z = Character.toLowerCase(c9);
        this.f13418a0 = KeyEvent.normalizeMetaState(i8);
        return this;
    }
}
