package v0;

import E.d;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.woxthebox.draglistview.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import k2.C1160q;
import w0.C1575d;
import w0.C1576e;

/* renamed from: v0.a  reason: case insensitive filesystem */
public final class C1528a extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final C1529b f15915a;

    public C1528a(C1529b bVar) {
        this.f15915a = bVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f15915a.a(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C1160q b8 = this.f15915a.b(view);
        if (b8 != null) {
            return (AccessibilityNodeProvider) b8.f13026V;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f15915a.c(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object obj;
        boolean z;
        Object obj2;
        boolean z6;
        Object obj3;
        ClickableSpan[] clickableSpanArr;
        int i;
        View view2 = view;
        AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
        int i8 = 1;
        C1576e eVar = new C1576e(accessibilityNodeInfo2);
        WeakHashMap weakHashMap = C1510H.f15874a;
        Class<Boolean> cls = Boolean.class;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = Boolean.valueOf(C1505C.c(view));
        } else {
            obj = view2.getTag(R.id.tag_screen_reader_focusable);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            accessibilityNodeInfo2.setScreenReaderFocusable(z);
        } else {
            eVar.h(1, z);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            obj2 = Boolean.valueOf(C1505C.b(view));
        } else {
            obj2 = view2.getTag(R.id.tag_accessibility_heading);
            if (!cls.isInstance(obj2)) {
                obj2 = null;
            }
        }
        Boolean bool2 = (Boolean) obj2;
        if (bool2 == null || !bool2.booleanValue()) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (i9 >= 28) {
            accessibilityNodeInfo2.setHeading(z6);
        } else {
            eVar.h(2, z6);
        }
        CharSequence d8 = C1510H.d(view);
        if (i9 >= 28) {
            accessibilityNodeInfo2.setPaneTitle(d8);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d8);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            obj3 = C1507E.a(view);
        } else {
            obj3 = view2.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(obj3)) {
                obj3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) obj3;
        if (i9 >= 30) {
            d.g(accessibilityNodeInfo2, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f15915a.d(view2, eVar);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i9 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                    if (((WeakReference) sparseArray.valueAt(i10)).get() == null) {
                        arrayList.add(Integer.valueOf(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    sparseArray.remove(((Integer) arrayList.get(i11)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view2.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                for (int i12 = 0; i12 < clickableSpanArr.length; i12++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i12];
                    int i13 = 0;
                    while (true) {
                        if (i13 >= sparseArray2.size()) {
                            i = C1576e.f16191c;
                            C1576e.f16191c = i + 1;
                            break;
                        } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i13)).get())) {
                            i = sparseArray2.keyAt(i13);
                            break;
                        } else {
                            i13 += i8;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i12]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i12];
                    Spanned spanned = (Spanned) text;
                    eVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    eVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    eVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    eVar.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    i8 = 1;
                }
            }
        }
        List list = (List) view2.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            eVar.b((C1575d) list.get(i14));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f15915a.e(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f15915a.f(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f15915a.g(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.f15915a.h(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f15915a.i(view, accessibilityEvent);
    }
}
