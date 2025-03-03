package l0;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f13078a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f13079b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13080c;

    public i(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int i;
        this.f13078a = colorStateList;
        this.f13079b = configuration;
        if (theme == null) {
            i = 0;
        } else {
            i = theme.hashCode();
        }
        this.f13080c = i;
    }
}
