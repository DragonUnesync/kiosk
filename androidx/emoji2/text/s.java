package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

public final class s implements TextWatcher, SpanWatcher {

    /* renamed from: U  reason: collision with root package name */
    public final Object f7819U;

    /* renamed from: V  reason: collision with root package name */
    public final AtomicInteger f7820V = new AtomicInteger(0);

    public s(Object obj) {
        this.f7819U = obj;
    }

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f7819U).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        ((TextWatcher) this.f7819U).beforeTextChanged(charSequence, i, i8, i9);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i8) {
        if (this.f7820V.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f7819U).onSpanAdded(spannable, obj, i, i8);
        }
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i8, int i9, int i10) {
        int i11;
        int i12;
        if (this.f7820V.get() <= 0 || !(obj instanceof v)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i8) {
                    i = 0;
                }
                if (i9 > i10) {
                    i12 = i;
                    i11 = 0;
                    ((SpanWatcher) this.f7819U).onSpanChanged(spannable, obj, i12, i8, i11, i10);
                }
            }
            i12 = i;
            i11 = i9;
            ((SpanWatcher) this.f7819U).onSpanChanged(spannable, obj, i12, i8, i11, i10);
        }
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i8) {
        if (this.f7820V.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f7819U).onSpanRemoved(spannable, obj, i, i8);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i8, int i9) {
        ((TextWatcher) this.f7819U).onTextChanged(charSequence, i, i8, i9);
    }
}
