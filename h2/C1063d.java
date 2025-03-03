package h2;

import Y.e;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;

/* renamed from: h2.d  reason: case insensitive filesystem */
public final class C1063d extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public C1077r f12545a;

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f12546b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f12547c;

    /* renamed from: d  reason: collision with root package name */
    public e f12548d;

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
