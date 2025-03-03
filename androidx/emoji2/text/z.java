package androidx.emoji2.text;

import a1.C0410a;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;

public final class z implements Spannable {

    /* renamed from: U  reason: collision with root package name */
    public boolean f7831U = false;

    /* renamed from: V  reason: collision with root package name */
    public Spannable f7832V;

    public z(Spannable spannable) {
        this.f7832V = spannable;
    }

    public final void a() {
        C0410a aVar;
        Spannable spannable = this.f7832V;
        if (!this.f7831U) {
            if (Build.VERSION.SDK_INT < 28) {
                aVar = new C0410a(4);
            } else {
                aVar = new C0410a(4);
            }
            if (aVar.u(spannable)) {
                this.f7832V = new SpannableString(spannable);
            }
        }
        this.f7831U = true;
    }

    public final char charAt(int i) {
        return this.f7832V.charAt(i);
    }

    /* renamed from: chars  reason: collision with other method in class */
    public final IntStream m16chars() {
        return IntStream.Wrapper.convert(IntStream.VivifiedWrapper.convert(this.f7832V.chars()));
    }

    /* renamed from: codePoints  reason: collision with other method in class */
    public final java.util.stream.IntStream m17codePoints() {
        return IntStream.Wrapper.convert(IntStream.VivifiedWrapper.convert(this.f7832V.codePoints()));
    }

    public final int getSpanEnd(Object obj) {
        return this.f7832V.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.f7832V.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.f7832V.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i8, Class cls) {
        return this.f7832V.getSpans(i, i8, cls);
    }

    public final int length() {
        return this.f7832V.length();
    }

    public final int nextSpanTransition(int i, int i8, Class cls) {
        return this.f7832V.nextSpanTransition(i, i8, cls);
    }

    public final void removeSpan(Object obj) {
        a();
        this.f7832V.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i, int i8, int i9) {
        a();
        this.f7832V.setSpan(obj, i, i8, i9);
    }

    public final CharSequence subSequence(int i, int i8) {
        return this.f7832V.subSequence(i, i8);
    }

    public final String toString() {
        return this.f7832V.toString();
    }

    public final j$.util.stream.IntStream chars() {
        return IntStream.VivifiedWrapper.convert(this.f7832V.chars());
    }

    public final j$.util.stream.IntStream codePoints() {
        return IntStream.VivifiedWrapper.convert(this.f7832V.codePoints());
    }
}
