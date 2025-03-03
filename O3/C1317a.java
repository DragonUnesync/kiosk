package o3;

import android.graphics.Typeface;
import com.bumptech.glide.d;
import com.google.android.material.chip.Chip;
import t3.h;
import t3.i;

/* renamed from: o3.a  reason: case insensitive filesystem */
public final class C1317a extends d {
    public final /* synthetic */ int i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14205j;

    public /* synthetic */ C1317a(int i8, Object obj) {
        this.i = i8;
        this.f14205j = obj;
    }

    private final void w(int i8) {
    }

    public final void m(int i8) {
        switch (this.i) {
            case 0:
                return;
            default:
                i iVar = (i) this.f14205j;
                iVar.f15459d = true;
                h hVar = (h) iVar.e.get();
                if (hVar != null) {
                    e eVar = (e) hVar;
                    eVar.u();
                    eVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    public final void n(Typeface typeface, boolean z) {
        CharSequence charSequence;
        switch (this.i) {
            case 0:
                Chip chip = (Chip) this.f14205j;
                e eVar = chip.f9248b0;
                if (eVar.w1) {
                    charSequence = eVar.f14264y0;
                } else {
                    charSequence = chip.getText();
                }
                chip.setText(charSequence);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z) {
                    i iVar = (i) this.f14205j;
                    iVar.f15459d = true;
                    h hVar = (h) iVar.e.get();
                    if (hVar != null) {
                        e eVar2 = (e) hVar;
                        eVar2.u();
                        eVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
