package o3;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

public final class b extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Chip f14206a;

    public b(Chip chip) {
        this.f14206a = chip;
    }

    public final void getOutline(View view, Outline outline) {
        e eVar = this.f14206a.f9248b0;
        if (eVar != null) {
            eVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
