package C3;

import android.view.View;
import com.bumptech.glide.d;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: C3.f  reason: case insensitive filesystem */
public final class C0030f extends t {
    public final /* synthetic */ int e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0030f(s sVar, int i) {
        super(sVar);
        this.e = i;
    }

    public void r() {
        switch (this.e) {
            case 0:
                s sVar = this.f641b;
                sVar.f633l0 = null;
                CheckableImageButton checkableImageButton = sVar.f625d0;
                checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
                d.s(checkableImageButton, (View.OnLongClickListener) null);
                return;
            default:
                return;
        }
    }
}
