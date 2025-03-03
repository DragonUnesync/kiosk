package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import n2.a;

public final class t extends SpannableStringBuilder {

    /* renamed from: U  reason: collision with root package name */
    public final Class f7821U;

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f7822V = new ArrayList();

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        a.l(cls, "watcherClass cannot be null");
        this.f7821U = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f7822V;
            if (i < arrayList.size()) {
                ((s) arrayList.get(i)).f7820V.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f7822V;
            if (i < arrayList.size()) {
                ((s) arrayList.get(i)).onTextChanged(this, 0, length(), length());
                i++;
            } else {
                return;
            }
        }
    }

    public final s c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f7822V;
            if (i >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i);
            if (sVar.f7819U == obj) {
                return sVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj == null || this.f7821U != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final Editable delete(int i, int i8) {
        super.delete(i, i8);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f7822V;
            if (i < arrayList.size()) {
                ((s) arrayList.get(i)).f7820V.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final int getSpanEnd(Object obj) {
        s c8;
        if (d(obj) && (c8 = c(obj)) != null) {
            obj = c8;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        s c8;
        if (d(obj) && (c8 = c(obj)) != null) {
            obj = c8;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        s c8;
        if (d(obj) && (c8 = c(obj)) != null) {
            obj = c8;
        }
        return super.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i8, Class cls) {
        if (this.f7821U != cls) {
            return super.getSpans(i, i8, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i, i8, s.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, sVarArr.length);
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            objArr[i9] = sVarArr[i9].f7819U;
        }
        return objArr;
    }

    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final int nextSpanTransition(int i, int i8, Class<s> cls) {
        if (cls == null || this.f7821U == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i, i8, cls);
    }

    public final void removeSpan(Object obj) {
        s sVar;
        if (d(obj)) {
            sVar = c(obj);
            if (sVar != null) {
                obj = sVar;
            }
        } else {
            sVar = null;
        }
        super.removeSpan(obj);
        if (sVar != null) {
            this.f7822V.remove(sVar);
        }
    }

    public final void setSpan(Object obj, int i, int i8, int i9) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.f7822V.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i, i8, i9);
    }

    public final CharSequence subSequence(int i, int i8) {
        return new t(this.f7821U, this, i, i8);
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m8append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m13delete(int i, int i8) {
        super.delete(i, i8);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m14insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m11append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final Editable insert(int i, CharSequence charSequence, int i8, int i9) {
        super.insert(i, charSequence, i8, i9);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i8, CharSequence charSequence) {
        a();
        super.replace(i, i8, charSequence);
        e();
        return this;
    }

    public final Editable append(char c8) {
        super.append(c8);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m15insert(int i, CharSequence charSequence, int i8, int i9) {
        super.insert(i, charSequence, i8, i9);
        return this;
    }

    public t(Class cls, t tVar, int i, int i8) {
        super(tVar, i, i8);
        a.l(cls, "watcherClass cannot be null");
        this.f7821U = cls;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m7append(char c8) {
        super.append(c8);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m10append(char c8) {
        super.append(c8);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i8, CharSequence charSequence, int i9, int i10) {
        a();
        super.replace(i, i8, charSequence, i9, i10);
        e();
        return this;
    }

    public final Editable append(CharSequence charSequence, int i, int i8) {
        super.append(charSequence, i, i8);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m9append(CharSequence charSequence, int i, int i8) {
        super.append(charSequence, i, i8);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m12append(CharSequence charSequence, int i, int i8) {
        super.append(charSequence, i, i8);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
