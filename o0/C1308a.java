package o0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import n.p;

/* renamed from: o0.a  reason: case insensitive filesystem */
public interface C1308a extends MenuItem {
    p a();

    C1308a b(p pVar);

    int getAlphabeticModifiers();

    CharSequence getContentDescription();

    ColorStateList getIconTintList();

    PorterDuff.Mode getIconTintMode();

    int getNumericModifiers();

    CharSequence getTooltipText();

    MenuItem setAlphabeticShortcut(char c8, int i);

    C1308a setContentDescription(CharSequence charSequence);

    MenuItem setIconTintList(ColorStateList colorStateList);

    MenuItem setIconTintMode(PorterDuff.Mode mode);

    MenuItem setNumericShortcut(char c8, int i);

    MenuItem setShortcut(char c8, char c9, int i, int i8);

    C1308a setTooltipText(CharSequence charSequence);
}
