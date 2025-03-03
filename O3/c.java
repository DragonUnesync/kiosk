package o3;

import C0.b;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import w0.C1575d;
import w0.C1576e;

public final class c extends b {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Chip f14207q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Chip chip, Chip chip2) {
        super(chip2);
        this.f14207q = chip;
    }

    public final void l(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        Rect rect = Chip.f9245t0;
        Chip chip = this.f14207q;
        if (chip.c()) {
            e eVar = chip.f9248b0;
            if (eVar != null && eVar.f14214E0) {
                z = true;
            }
            if (z && chip.f9251e0 != null) {
                arrayList.add(1);
            }
        }
    }

    public final void o(int i, C1576e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16192a;
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.f14207q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(2131951869, new Object[]{charSequence}).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
            eVar.b(C1575d.e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription(charSequence);
        accessibilityNodeInfo.setBoundsInParent(Chip.f9245t0);
    }
}
