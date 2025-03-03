package C0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import k2.C1160q;
import o3.c;
import v0.C1510H;
import w0.C1576e;

public final class a extends C1160q {

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ b f491W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(28);
        this.f491W = bVar;
    }

    public final C1576e E(int i) {
        return new C1576e(AccessibilityNodeInfo.obtain(this.f491W.n(i).f16192a));
    }

    public final C1576e F(int i) {
        int i8;
        b bVar = this.f491W;
        if (i == 2) {
            i8 = bVar.f500k;
        } else {
            i8 = bVar.f501l;
        }
        if (i8 == Integer.MIN_VALUE) {
            return null;
        }
        return E(i8);
    }

    public final boolean L(int i, int i8, Bundle bundle) {
        int i9;
        b bVar = this.f491W;
        Chip chip = bVar.i;
        if (i != -1) {
            boolean z = true;
            if (i8 == 1) {
                return bVar.p(i);
            }
            if (i8 == 2) {
                return bVar.j(i);
            }
            boolean z6 = false;
            if (i8 == 64) {
                AccessibilityManager accessibilityManager = bVar.f498h;
                if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i9 = bVar.f500k) != i) {
                    if (i9 != Integer.MIN_VALUE) {
                        bVar.f500k = RecyclerView.UNDEFINED_DURATION;
                        bVar.i.invalidate();
                        bVar.q(i9, 65536);
                    }
                    bVar.f500k = i;
                    chip.invalidate();
                    bVar.q(i, 32768);
                    return z;
                }
            } else if (i8 != 128) {
                c cVar = (c) bVar;
                if (i8 != 16) {
                    return false;
                }
                Chip chip2 = cVar.f14207q;
                if (i == 0) {
                    return chip2.performClick();
                }
                if (i != 1) {
                    return false;
                }
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f9251e0;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z6 = true;
                }
                if (!chip2.p0) {
                    return z6;
                }
                chip2.f9261o0.q(1, 1);
                return z6;
            } else if (bVar.f500k == i) {
                bVar.f500k = RecyclerView.UNDEFINED_DURATION;
                chip.invalidate();
                bVar.q(i, 65536);
                return z;
            }
            z = false;
            return z;
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        return chip.performAccessibilityAction(i8, bundle);
    }
}
