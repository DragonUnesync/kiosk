package n;

import I2.b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;
import o0.C1308a;

public final class t extends b implements MenuItem {

    /* renamed from: W  reason: collision with root package name */
    public final C1308a f13540W;

    /* renamed from: X  reason: collision with root package name */
    public Method f13541X;

    public t(Context context, C1308a aVar) {
        super(context);
        if (aVar != null) {
            this.f13540W = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final boolean collapseActionView() {
        return this.f13540W.collapseActionView();
    }

    public final boolean expandActionView() {
        return this.f13540W.expandActionView();
    }

    public final ActionProvider getActionProvider() {
        p a8 = this.f13540W.a();
        if (a8 instanceof p) {
            return a8.f13533b;
        }
        return null;
    }

    public final View getActionView() {
        View actionView = this.f13540W.getActionView();
        if (actionView instanceof q) {
            return (View) ((q) actionView).f13535U;
        }
        return actionView;
    }

    public final int getAlphabeticModifiers() {
        return this.f13540W.getAlphabeticModifiers();
    }

    public final char getAlphabeticShortcut() {
        return this.f13540W.getAlphabeticShortcut();
    }

    public final CharSequence getContentDescription() {
        return this.f13540W.getContentDescription();
    }

    public final int getGroupId() {
        return this.f13540W.getGroupId();
    }

    public final Drawable getIcon() {
        return this.f13540W.getIcon();
    }

    public final ColorStateList getIconTintList() {
        return this.f13540W.getIconTintList();
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.f13540W.getIconTintMode();
    }

    public final Intent getIntent() {
        return this.f13540W.getIntent();
    }

    public final int getItemId() {
        return this.f13540W.getItemId();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f13540W.getMenuInfo();
    }

    public final int getNumericModifiers() {
        return this.f13540W.getNumericModifiers();
    }

    public final char getNumericShortcut() {
        return this.f13540W.getNumericShortcut();
    }

    public final int getOrder() {
        return this.f13540W.getOrder();
    }

    public final SubMenu getSubMenu() {
        return this.f13540W.getSubMenu();
    }

    public final CharSequence getTitle() {
        return this.f13540W.getTitle();
    }

    public final CharSequence getTitleCondensed() {
        return this.f13540W.getTitleCondensed();
    }

    public final CharSequence getTooltipText() {
        return this.f13540W.getTooltipText();
    }

    public final boolean hasSubMenu() {
        return this.f13540W.hasSubMenu();
    }

    public final boolean isActionViewExpanded() {
        return this.f13540W.isActionViewExpanded();
    }

    public final boolean isCheckable() {
        return this.f13540W.isCheckable();
    }

    public final boolean isChecked() {
        return this.f13540W.isChecked();
    }

    public final boolean isEnabled() {
        return this.f13540W.isEnabled();
    }

    public final boolean isVisible() {
        return this.f13540W.isVisible();
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        p pVar = new p(this, actionProvider);
        if (actionProvider == null) {
            pVar = null;
        }
        this.f13540W.b(pVar);
        return this;
    }

    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new q(view);
        }
        this.f13540W.setActionView(view);
        return this;
    }

    public final MenuItem setAlphabeticShortcut(char c8) {
        this.f13540W.setAlphabeticShortcut(c8);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.f13540W.setCheckable(z);
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.f13540W.setChecked(z);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f13540W.setContentDescription(charSequence);
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.f13540W.setEnabled(z);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.f13540W.setIcon(drawable);
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13540W.setIconTintList(colorStateList);
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13540W.setIconTintMode(mode);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.f13540W.setIntent(intent);
        return this;
    }

    public final MenuItem setNumericShortcut(char c8) {
        this.f13540W.setNumericShortcut(c8);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        r rVar;
        if (onActionExpandListener != null) {
            rVar = new r(this, onActionExpandListener);
        } else {
            rVar = null;
        }
        this.f13540W.setOnActionExpandListener(rVar);
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        s sVar;
        if (onMenuItemClickListener != null) {
            sVar = new s(this, onMenuItemClickListener);
        } else {
            sVar = null;
        }
        this.f13540W.setOnMenuItemClickListener(sVar);
        return this;
    }

    public final MenuItem setShortcut(char c8, char c9) {
        this.f13540W.setShortcut(c8, c9);
        return this;
    }

    public final void setShowAsAction(int i) {
        this.f13540W.setShowAsAction(i);
    }

    public final MenuItem setShowAsActionFlags(int i) {
        this.f13540W.setShowAsActionFlags(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.f13540W.setTitle(charSequence);
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13540W.setTitleCondensed(charSequence);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f13540W.setTooltipText(charSequence);
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        return this.f13540W.setVisible(z);
    }

    public final MenuItem setAlphabeticShortcut(char c8, int i) {
        this.f13540W.setAlphabeticShortcut(c8, i);
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.f13540W.setIcon(i);
        return this;
    }

    public final MenuItem setNumericShortcut(char c8, int i) {
        this.f13540W.setNumericShortcut(c8, i);
        return this;
    }

    public final MenuItem setShortcut(char c8, char c9, int i, int i8) {
        this.f13540W.setShortcut(c8, c9, i, i8);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.f13540W.setTitle(i);
        return this;
    }

    public final MenuItem setActionView(int i) {
        C1308a aVar = this.f13540W;
        aVar.setActionView(i);
        View actionView = aVar.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            aVar.setActionView(new q(actionView));
        }
        return this;
    }
}
