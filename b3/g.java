package B3;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.datepicker.k;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import v0.C1529b;
import w0.C1576e;

public final class g extends C1529b {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f399d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(int i, Object obj) {
        this.f399d = i;
        this.e = obj;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f399d) {
            case 3:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).f9354a0);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    public final void d(View view, C1576e eVar) {
        String str;
        int i;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.f15919a;
        switch (this.f399d) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16192a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                eVar.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f16192a);
                k kVar = (k) obj;
                if (kVar.f9302a1.getVisibility() == 0) {
                    str = kVar.m().getString(2131951908);
                } else {
                    str = kVar.m().getString(2131951906);
                }
                eVar.j(str);
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f16192a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                int i8 = MaterialButtonToggleGroup.f9231h0;
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i9 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i9) == view) {
                                i = i10;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i9) instanceof MaterialButton) && materialButtonToggleGroup.c(i9)) {
                                    i10++;
                                }
                                i9++;
                            }
                        }
                    }
                    accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f9228l0));
                    return;
                }
                i = -1;
                accessibilityNodeInfo2.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).f9228l0));
                return;
            case 3:
                AccessibilityNodeInfo accessibilityNodeInfo3 = eVar.f16192a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo3.setCheckable(checkableImageButton.f9355b0);
                accessibilityNodeInfo3.setChecked(checkableImageButton.f9354a0);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo4 = eVar.f16192a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCheckable(((NavigationMenuItemView) obj).f9363u0);
                return;
        }
    }

    public boolean g(View view, int i, Bundle bundle) {
        switch (this.f399d) {
            case 0:
                if (i != 1048576) {
                    return super.g(view, i, bundle);
                }
                ((n) ((k) this.e)).a(3);
                return true;
            default:
                return super.g(view, i, bundle);
        }
    }
}
