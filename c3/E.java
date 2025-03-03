package C3;

import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import o.C1260b0;
import v0.C1529b;
import w0.C1576e;

public final class E extends C1529b {

    /* renamed from: d  reason: collision with root package name */
    public final TextInputLayout f571d;

    public E(TextInputLayout textInputLayout) {
        this.f571d = textInputLayout;
    }

    public final void d(View view, C1576e eVar) {
        Editable editable;
        boolean z;
        String str;
        C1576e eVar2 = eVar;
        View.AccessibilityDelegate accessibilityDelegate = this.f15919a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar2.f16192a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f571d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            editable = editText.getText();
        } else {
            editable = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean isEmpty = TextUtils.isEmpty(editable);
        boolean isEmpty2 = TextUtils.isEmpty(hint);
        boolean z6 = textInputLayout.f9454o1;
        boolean isEmpty3 = TextUtils.isEmpty(error);
        if (!isEmpty3 || !TextUtils.isEmpty(counterOverflowDescription)) {
            z = true;
        } else {
            z = false;
        }
        if (!isEmpty2) {
            str = hint.toString();
        } else {
            str = "";
        }
        B b8 = textInputLayout.f9418V;
        C1260b0 b0Var = b8.f557V;
        if (b0Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(b0Var);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(b0Var);
            }
        } else if (Build.VERSION.SDK_INT >= 22) {
            accessibilityNodeInfo.setTraversalAfter(b8.f559a0);
        }
        if (!isEmpty) {
            eVar2.k(editable);
        } else if (!TextUtils.isEmpty(str)) {
            eVar2.k(str);
            if (!z6 && placeholderText != null) {
                eVar2.k(str + ", " + placeholderText);
            }
        } else if (placeholderText != null) {
            eVar2.k(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 26) {
                eVar2.j(str);
            } else {
                if (!isEmpty) {
                    str = editable + ", " + str;
                }
                eVar2.k(str);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(isEmpty);
            } else {
                eVar2.h(4, isEmpty);
            }
        }
        if (editable == null || editable.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z) {
            if (isEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        C1260b0 b0Var2 = textInputLayout.f9437g0.f673y;
        if (b0Var2 != null) {
            accessibilityNodeInfo.setLabelFor(b0Var2);
        }
        textInputLayout.f9420W.b().n(eVar2);
    }

    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f571d.f9420W.b().o(accessibilityEvent);
    }
}
