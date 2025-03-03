package v3;

import D7.b;
import android.content.res.ColorStateList;
import o.C1249B;

/* renamed from: v3.a  reason: case insensitive filesystem */
public final class C1560a extends C1249B {

    /* renamed from: d0  reason: collision with root package name */
    public static final int[][] f16080d0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: b0  reason: collision with root package name */
    public ColorStateList f16081b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f16082c0;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f16081b0 == null) {
            int o2 = b.o(this, 2130968815);
            int o8 = b.o(this, 2130968834);
            int o9 = b.o(this, 2130968856);
            this.f16081b0 = new ColorStateList(f16080d0, new int[]{b.F(1.0f, o9, o2), b.F(0.54f, o9, o8), b.F(0.38f, o9, o8), b.F(0.38f, o9, o8)});
        }
        return this.f16081b0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f16082c0 && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f16082c0 = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList((ColorStateList) null);
        }
    }
}
