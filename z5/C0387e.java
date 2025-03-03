package Z5;

import X5.z;
import e6.C0847f;
import g6.n0;

/* renamed from: Z5.e  reason: case insensitive filesystem */
public final class C0387e extends C0395m {
    public C0387e(boolean z) {
        super((z) new C0386d(C0847f.CASE_INSENSITIVE_HASHER, C0395m.valueConverter(), C0395m.nameValidator(z), C0395m.valueValidator(z)));
    }

    public boolean containsValue(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return super.containsValue(charSequence, n0.trimOws(charSequence2), z);
    }
}
