package D2;

public final class x implements Appendable {

    /* renamed from: U  reason: collision with root package name */
    public final Appendable f1192U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f1193V = true;

    public x(Appendable appendable) {
        this.f1192U = appendable;
    }

    public final Appendable append(char c8) {
        boolean z = this.f1193V;
        Appendable appendable = this.f1192U;
        boolean z6 = false;
        if (z) {
            this.f1193V = false;
            appendable.append("  ");
        }
        if (c8 == 10) {
            z6 = true;
        }
        this.f1193V = z6;
        appendable.append(c8);
        return this;
    }

    public final Appendable append(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    public final Appendable append(CharSequence charSequence, int i, int i8) {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.f1193V;
        Appendable appendable = this.f1192U;
        boolean z6 = false;
        if (z) {
            this.f1193V = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i8 - 1) == 10) {
            z6 = true;
        }
        this.f1193V = z6;
        appendable.append(charSequence, i, i8);
        return this;
    }
}
