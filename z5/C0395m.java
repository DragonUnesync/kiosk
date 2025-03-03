package Z5;

import X5.A;
import X5.G;
import X5.S;
import X5.v;
import X5.y;
import X5.z;
import e6.C0847f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Z5.m  reason: case insensitive filesystem */
public class C0395m extends L {
    static final v HttpNameValidator = new C0391i();
    private final z headers;

    public C0395m() {
        this(true);
    }

    public static v nameValidator(boolean z) {
        if (z) {
            return HttpNameValidator;
        }
        return v.NOT_NULL;
    }

    public static S valueConverter() {
        return C0393k.INSTANCE;
    }

    public static y valueValidator(boolean z) {
        if (z) {
            return C0394l.INSTANCE;
        }
        return y.NO_VALIDATION;
    }

    public L add(L l8) {
        if (!(l8 instanceof C0395m)) {
            return super.add(l8);
        }
        this.headers.add(((C0395m) l8).headers);
        return this;
    }

    public L clear() {
        this.headers.clear();
        return this;
    }

    public boolean contains(String str) {
        return contains((CharSequence) str);
    }

    public L copy() {
        return new C0395m(this.headers.copy());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0395m) || !this.headers.equals(((C0395m) obj).headers, C0847f.CASE_SENSITIVE_HASHER)) {
            return false;
        }
        return true;
    }

    public String get(String str) {
        return get((CharSequence) str);
    }

    public List<String> getAll(String str) {
        return getAll((CharSequence) str);
    }

    public int hashCode() {
        return this.headers.hashCode(C0847f.CASE_SENSITIVE_HASHER);
    }

    public boolean isEmpty() {
        return this.headers.isEmpty();
    }

    @Deprecated
    public Iterator<Map.Entry<String, String>> iterator() {
        return G.iteratorAsString(this.headers);
    }

    public Iterator<Map.Entry<CharSequence, CharSequence>> iteratorCharSequence() {
        return this.headers.iterator();
    }

    public L remove(String str) {
        this.headers.remove(str);
        return this;
    }

    public L set(L l8) {
        if (!(l8 instanceof C0395m)) {
            return super.set(l8);
        }
        this.headers.set(((C0395m) l8).headers);
        return this;
    }

    public int size() {
        return this.headers.size();
    }

    public Iterator<CharSequence> valueCharSequenceIterator(CharSequence charSequence) {
        return this.headers.valueIterator(charSequence);
    }

    public Iterator<String> valueStringIterator(CharSequence charSequence) {
        return new C0392j(this, valueCharSequenceIterator(charSequence));
    }

    public C0395m(boolean z) {
        this(z, nameValidator(z));
    }

    public boolean contains(CharSequence charSequence) {
        return this.headers.contains(charSequence);
    }

    public String get(CharSequence charSequence) {
        return G.getAsString(this.headers, charSequence);
    }

    public List<String> getAll(CharSequence charSequence) {
        return G.getAllAsString(this.headers, charSequence);
    }

    public L remove(CharSequence charSequence) {
        this.headers.remove(charSequence);
        return this;
    }

    public C0395m(boolean z, v vVar) {
        this((z) new A(C0847f.CASE_INSENSITIVE_HASHER, C0393k.INSTANCE, vVar, 16, valueValidator(z)));
    }

    public boolean contains(String str, String str2, boolean z) {
        return contains((CharSequence) str, (CharSequence) str2, z);
    }

    public L add(String str, Object obj) {
        this.headers.addObject(str, obj);
        return this;
    }

    public boolean contains(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        return this.headers.contains(charSequence, charSequence2, z ? C0847f.CASE_INSENSITIVE_HASHER : C0847f.CASE_SENSITIVE_HASHER);
    }

    public L set(String str, Object obj) {
        this.headers.setObject((Object) str, obj);
        return this;
    }

    public L add(CharSequence charSequence, Object obj) {
        this.headers.addObject(charSequence, obj);
        return this;
    }

    public L set(CharSequence charSequence, Object obj) {
        this.headers.setObject((Object) charSequence, obj);
        return this;
    }

    public C0395m(z zVar) {
        this.headers = zVar;
    }

    public L set(String str, Iterable<?> iterable) {
        this.headers.setObject((Object) str, iterable);
        return this;
    }

    public L set(CharSequence charSequence, Iterable<?> iterable) {
        this.headers.setObject((Object) charSequence, iterable);
        return this;
    }
}
