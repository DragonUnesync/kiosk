package Z5;

import X5.C;
import X5.S;
import X5.v;
import X5.y;
import X5.z;
import e6.C0858q;
import g6.n0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Z5.d  reason: case insensitive filesystem */
public final class C0386d extends z {
    private C0385c charSequenceEscaper;
    private C0385c objectEscaper;

    public C0386d(C0858q qVar, S s8, v vVar, y yVar) {
        super(qVar, s8, vVar, 16, yVar);
    }

    private C0386d addEscapedValue(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3 = (CharSequence) get(charSequence);
        if (charSequence3 == null || cannotBeCombined(charSequence)) {
            super.add(charSequence, charSequence2);
        } else {
            set(charSequence, commaSeparateEscapedValues(charSequence3, charSequence2));
        }
        return this;
    }

    private static boolean cannotBeCombined(CharSequence charSequence) {
        return G.SET_COOKIE.contentEqualsIgnoreCase(charSequence);
    }

    private C0385c charSequenceEscaper() {
        if (this.charSequenceEscaper == null) {
            this.charSequenceEscaper = new C0384b(this);
        }
        return this.charSequenceEscaper;
    }

    private static <T> CharSequence commaSeparate(CharSequence charSequence, C0385c cVar, T... tArr) {
        StringBuilder sb = new StringBuilder(tArr.length * 10);
        if (tArr.length > 0) {
            int length = tArr.length - 1;
            for (int i = 0; i < length; i++) {
                sb.append(cVar.escape(charSequence, tArr[i]));
                sb.append(',');
            }
            sb.append(cVar.escape(charSequence, tArr[length]));
        }
        return sb;
    }

    private static CharSequence commaSeparateEscapedValues(CharSequence charSequence, CharSequence charSequence2) {
        StringBuilder sb = new StringBuilder(charSequence2.length() + charSequence.length() + 1);
        sb.append(charSequence);
        sb.append(',');
        sb.append(charSequence2);
        return sb;
    }

    private C0385c objectEscaper() {
        if (this.objectEscaper == null) {
            this.objectEscaper = new C0383a(this);
        }
        return this.objectEscaper;
    }

    public C0386d addObject(CharSequence charSequence, Object obj) {
        return addEscapedValue(charSequence, commaSeparate(charSequence, objectEscaper(), (T[]) new Object[]{obj}));
    }

    public List<CharSequence> getAll(CharSequence charSequence) {
        List<Object> all = super.getAll(charSequence);
        if (all.isEmpty() || cannotBeCombined(charSequence)) {
            return all;
        }
        if (all.size() == 1) {
            return n0.unescapeCsvFields((CharSequence) all.get(0));
        }
        throw new IllegalStateException("CombinedHttpHeaders should only have one value");
    }

    public C0386d set(C c8) {
        if (c8 == this) {
            return this;
        }
        clear();
        return add(c8);
    }

    public Iterator<CharSequence> valueIterator(CharSequence charSequence) {
        Iterator<Object> valueIterator = super.valueIterator(charSequence);
        if (!valueIterator.hasNext() || cannotBeCombined(charSequence)) {
            return valueIterator;
        }
        Iterator<CharSequence> it = n0.unescapeCsvFields((CharSequence) valueIterator.next()).iterator();
        if (!valueIterator.hasNext()) {
            return it;
        }
        throw new IllegalStateException("CombinedHttpHeaders should only have one value");
    }

    public C0386d add(C c8) {
        if (c8 != this) {
            if (!(c8 instanceof C0386d)) {
                Iterator<Map.Entry<Object, Object>> it = ((z) c8).iterator();
                while (it.hasNext()) {
                    Map.Entry next = it.next();
                    add((CharSequence) next.getKey(), (CharSequence) next.getValue());
                }
            } else if (isEmpty()) {
                addImpl(c8);
            } else {
                for (Map.Entry next2 : c8) {
                    addEscapedValue((CharSequence) next2.getKey(), (CharSequence) next2.getValue());
                }
            }
            return this;
        }
        throw new IllegalArgumentException("can't add to itself.");
    }

    public C0386d setObject(CharSequence charSequence, Object obj) {
        set(charSequence, commaSeparate(charSequence, objectEscaper(), (T[]) new Object[]{obj}));
        return this;
    }

    public C0386d setObject(CharSequence charSequence, Iterable<?> iterable) {
        set(charSequence, commaSeparate(charSequence, objectEscaper(), iterable));
        return this;
    }

    private static <T> CharSequence commaSeparate(CharSequence charSequence, C0385c cVar, Iterable<? extends T> iterable) {
        StringBuilder sb = iterable instanceof Collection ? new StringBuilder(((Collection) iterable).size() * 10) : new StringBuilder();
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                sb.append(cVar.escape(charSequence, next));
                sb.append(',');
                next = it.next();
            }
            sb.append(cVar.escape(charSequence, next));
        }
        return sb;
    }

    public C0386d add(CharSequence charSequence, CharSequence charSequence2) {
        return addEscapedValue(charSequence, charSequenceEscaper().escape(charSequence, charSequence2));
    }
}
