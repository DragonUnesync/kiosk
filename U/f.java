package U;

import Y1.r;
import Y1.s;
import Y1.w;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.camera.view.PreviewView;
import com.google.android.material.carousel.CarouselLayoutManager;
import de.ozerov.fully.M2;
import g7.l;

public final /* synthetic */ class f implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5269a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5270b;

    public /* synthetic */ f(int i, Object obj) {
        this.f5269a = i;
        this.f5270b = obj;
    }

    public final void onLayoutChange(View view, int i, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z;
        View view2 = view;
        int i19 = i;
        int i20 = i8;
        int i21 = i9;
        int i22 = i10;
        int i23 = i11;
        int i24 = i12;
        int i25 = i13;
        int i26 = i14;
        boolean z6 = true;
        Object obj = this.f5270b;
        switch (this.f5269a) {
            case 0:
                int i27 = PreviewView.f7676j0;
                PreviewView previewView = (PreviewView) obj;
                previewView.getClass();
                if (i21 - i19 != i25 - i23 || i22 - i20 != i26 - i24) {
                    previewView.a();
                    l.a();
                    previewView.getViewPort();
                    return;
                }
                return;
            case 1:
                r rVar = (r) obj;
                rVar.getClass();
                int i28 = i22 - i20;
                int i29 = i26 - i24;
                if (i21 - i19 != i25 - i23 || i28 != i29) {
                    PopupWindow popupWindow = rVar.f6503h0;
                    if (popupWindow.isShowing()) {
                        rVar.q();
                        int width = rVar.getWidth() - popupWindow.getWidth();
                        int i30 = rVar.f6505i0;
                        popupWindow.update(view, width - i30, (-popupWindow.getHeight()) - i30, -1, -1);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                w wVar = (w) obj;
                r rVar2 = wVar.f6544a;
                int width2 = (rVar2.getWidth() - rVar2.getPaddingLeft()) - rVar2.getPaddingRight();
                int height = (rVar2.getHeight() - rVar2.getPaddingBottom()) - rVar2.getPaddingTop();
                ViewGroup viewGroup = wVar.f6546c;
                int c8 = w.c(viewGroup);
                if (viewGroup != null) {
                    i15 = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
                } else {
                    i15 = 0;
                }
                int i31 = c8 - i15;
                if (viewGroup == null) {
                    i16 = 0;
                } else {
                    i16 = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i16 += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                if (viewGroup != null) {
                    i17 = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
                } else {
                    i17 = 0;
                }
                int i32 = i16 - i17;
                int max = Math.max(i31, w.c(wVar.f6552k) + w.c(wVar.i));
                ViewGroup viewGroup2 = wVar.f6547d;
                if (viewGroup2 == null) {
                    i18 = 0;
                } else {
                    i18 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        i18 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                int i33 = (i18 * 2) + i32;
                if (width2 <= max || height <= i33) {
                    z = true;
                } else {
                    z = false;
                }
                if (wVar.f6541A != z) {
                    wVar.f6541A = z;
                    view2.post(new s(wVar, 1));
                }
                if (i21 - i19 == i25 - i23) {
                    z6 = false;
                }
                if (!wVar.f6541A && z6) {
                    view2.post(new s(wVar, 2));
                    return;
                }
                return;
            default:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                carouselLayoutManager.getClass();
                if (i19 != i23 || i20 != i24 || i21 != i25 || i22 != i26) {
                    view2.post(new M2(9, (Object) carouselLayoutManager));
                    return;
                }
                return;
        }
    }
}
