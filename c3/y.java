package C3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import m0.C1195a;
import v0.C1510H;

public final class y extends ArrayAdapter {

    /* renamed from: U  reason: collision with root package name */
    public ColorStateList f676U;

    /* renamed from: V  reason: collision with root package name */
    public ColorStateList f677V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ z f678W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y(z zVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f678W = zVar;
        a();
    }

    public final void a() {
        boolean z;
        ColorStateList colorStateList;
        z zVar = this.f678W;
        ColorStateList colorStateList2 = zVar.f686i0;
        if (colorStateList2 != null) {
            z = true;
        } else {
            z = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z) {
            colorStateList = null;
        } else {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f677V = colorStateList;
        if (!(zVar.f685h0 == 0 || zVar.f686i0 == null)) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C1195a.b(zVar.f686i0.getColorForState(iArr3, 0), zVar.f685h0), C1195a.b(zVar.f686i0.getColorForState(iArr2, 0), zVar.f685h0), zVar.f685h0});
        }
        this.f676U = colorStateList3;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            z zVar = this.f678W;
            RippleDrawable rippleDrawable = null;
            if (zVar.getText().toString().contentEquals(textView.getText()) && zVar.f685h0 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(zVar.f685h0);
                if (this.f677V != null) {
                    colorDrawable.setTintList(this.f676U);
                    rippleDrawable = new RippleDrawable(this.f677V, colorDrawable, (Drawable) null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = C1510H.f15874a;
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
