package Z5;

import g6.n0;

/* renamed from: Z5.a  reason: case insensitive filesystem */
public final class C0383a implements C0385c {
    final /* synthetic */ C0386d this$0;

    public C0383a(C0386d dVar) {
        this.this$0 = dVar;
    }

    public CharSequence escape(CharSequence charSequence, Object obj) {
        try {
            return n0.escapeCsv((CharSequence) this.this$0.valueConverter().convertObject(obj), true);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Failed to convert object value for header '" + charSequence + '\'', e);
        }
    }
}
