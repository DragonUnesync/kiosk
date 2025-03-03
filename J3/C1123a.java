package j3;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import o.w1;

/* renamed from: j3.a  reason: case insensitive filesystem */
public final class C1123a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12865a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12866b;

    public /* synthetic */ C1123a(int i, Object obj) {
        this.f12865a = i;
        this.f12866b = obj;
    }

    public final void onLayoutChange(View view, int i, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
        int i15;
        Object obj = this.f12866b;
        switch (this.f12865a) {
            case 0:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
            default:
                SearchView searchView = (SearchView) obj;
                View view2 = searchView.f7505u0;
                boolean z = true;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f7500o0.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z6 = w1.f14104a;
                    int i16 = 0;
                    if (searchView.getLayoutDirection() != 1) {
                        z = false;
                    }
                    if (searchView.f7480L0) {
                        i16 = resources.getDimensionPixelSize(2131165226) + resources.getDimensionPixelSize(2131165225);
                    }
                    SearchView.SearchAutoComplete searchAutoComplete = searchView.f7498m0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    if (z) {
                        i15 = -rect.left;
                    } else {
                        i15 = paddingLeft - (rect.left + i16);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i15);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i16) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
