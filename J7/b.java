package J7;

import java.io.Serializable;
import java.io.Writer;

public final class b extends Writer implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final StringBuilder f2521U = new StringBuilder();

    public final Writer append(char c8) {
        this.f2521U.append(c8);
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        return this.f2521U.toString();
    }

    public final void write(char[] cArr, int i, int i8) {
        if (cArr != null) {
            this.f2521U.append(cArr, i, i8);
        }
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m2append(char c8) {
        this.f2521U.append(c8);
        return this;
    }

    public final void write(String str) {
        if (str != null) {
            this.f2521U.append(str);
        }
    }

    public final Writer append(CharSequence charSequence) {
        this.f2521U.append(charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m3append(CharSequence charSequence) {
        this.f2521U.append(charSequence);
        return this;
    }

    public final Writer append(CharSequence charSequence, int i, int i8) {
        this.f2521U.append(charSequence, i, i8);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m4append(CharSequence charSequence, int i, int i8) {
        this.f2521U.append(charSequence, i, i8);
        return this;
    }
}
