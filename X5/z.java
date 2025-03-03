package X5;

import e6.C0858q;
import g6.B;
import g6.C0984q;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class z implements C {
    /* access modifiers changed from: private */
    public final C0367s[] entries;
    private final byte hashMask;
    /* access modifiers changed from: private */
    public final C0858q hashingStrategy;
    protected final C0367s head;
    private final v nameValidator;
    int size;
    private final S valueConverter;
    private final y valueValidator;

    public z(C0858q qVar, S s8, v vVar, int i) {
        this(qVar, s8, vVar, i, y.NO_VALIDATION);
    }

    private void add0(int i, int i8, Object obj, Object obj2) {
        C0367s[] sVarArr = this.entries;
        sVarArr[i8] = newHeaderEntry(i, obj, obj2, sVarArr[i8]);
        this.size++;
    }

    private Object fromObject(Object obj, Object obj2) {
        try {
            return this.valueConverter.convertObject(B.checkNotNull(obj2, "value"));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Failed to convert object value for header '" + obj + '\'', e);
        }
    }

    /* access modifiers changed from: private */
    public int index(int i) {
        return i & this.hashMask;
    }

    private Object remove0(int i, int i8, Object obj) {
        C0367s sVar = this.entries[i8];
        Object obj2 = null;
        if (sVar == null) {
            return null;
        }
        for (C0367s sVar2 = sVar.next; sVar2 != null; sVar2 = sVar.next) {
            if (sVar2.hash != i || !this.hashingStrategy.equals(obj, sVar2.key)) {
                sVar = sVar2;
            } else {
                obj2 = sVar2.value;
                sVar.next = sVar2.next;
                sVar2.remove();
                this.size--;
            }
        }
        C0367s sVar3 = this.entries[i8];
        if (sVar3.hash == i && this.hashingStrategy.equals(obj, sVar3.key)) {
            if (obj2 == null) {
                obj2 = sVar3.value;
            }
            this.entries[i8] = sVar3.next;
            sVar3.remove();
            this.size--;
        }
        return obj2;
    }

    private C thisT() {
        return this;
    }

    public C add(Object obj, Object obj2) {
        validateName(this.nameValidator, true, obj);
        validateValue(this.valueValidator, obj, obj2);
        B.checkNotNull(obj2, "value");
        int hashCode = this.hashingStrategy.hashCode(obj);
        add0(hashCode, index(hashCode), obj, obj2);
        return thisT();
    }

    public void addImpl(C c8) {
        if (c8 instanceof z) {
            z zVar = (z) c8;
            C0367s sVar = zVar.head.after;
            if (zVar.hashingStrategy == this.hashingStrategy && zVar.nameValidator == this.nameValidator) {
                while (sVar != zVar.head) {
                    int i = sVar.hash;
                    add0(i, index(i), sVar.key, sVar.value);
                    sVar = sVar.after;
                }
                return;
            }
            while (sVar != zVar.head) {
                add(sVar.key, sVar.value);
                sVar = sVar.after;
            }
            return;
        }
        Iterator<Map.Entry<Object, Object>> it = ((z) c8).iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            add(next.getKey(), next.getValue());
        }
    }

    public C addObject(Object obj, Object obj2) {
        return add(obj, fromObject(obj, obj2));
    }

    public C clear() {
        Arrays.fill(this.entries, (Object) null);
        C0367s sVar = this.head;
        sVar.after = sVar;
        sVar.before = sVar;
        this.size = 0;
        return thisT();
    }

    public boolean contains(Object obj) {
        return get(obj) != null;
    }

    public z copy() {
        z zVar = new z(this.hashingStrategy, this.valueConverter, this.nameValidator, this.entries.length);
        zVar.addImpl(this);
        return zVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C)) {
            return false;
        }
        return equals((C) obj, C0858q.JAVA_HASHER);
    }

    public Object get(Object obj) {
        B.checkNotNull(obj, "name");
        int hashCode = this.hashingStrategy.hashCode(obj);
        Object obj2 = null;
        for (C0367s sVar = this.entries[index(hashCode)]; sVar != null; sVar = sVar.next) {
            if (sVar.hash == hashCode && this.hashingStrategy.equals(obj, sVar.key)) {
                obj2 = sVar.value;
            }
        }
        return obj2;
    }

    public List<Object> getAll(Object obj) {
        B.checkNotNull(obj, "name");
        LinkedList linkedList = new LinkedList();
        int hashCode = this.hashingStrategy.hashCode(obj);
        for (C0367s sVar = this.entries[index(hashCode)]; sVar != null; sVar = sVar.next) {
            if (sVar.hash == hashCode && this.hashingStrategy.equals(obj, sVar.key)) {
                linkedList.addFirst(sVar.getValue());
            }
        }
        return linkedList;
    }

    public Object getAndRemove(Object obj) {
        int hashCode = this.hashingStrategy.hashCode(obj);
        return remove0(hashCode, index(hashCode), B.checkNotNull(obj, "name"));
    }

    public int hashCode() {
        return hashCode(C0858q.JAVA_HASHER);
    }

    public boolean isEmpty() {
        C0367s sVar = this.head;
        if (sVar == sVar.after) {
            return true;
        }
        return false;
    }

    public Iterator<Map.Entry<Object, Object>> iterator() {
        return new t(this);
    }

    public Set<Object> names() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(size());
        for (C0367s sVar = this.head.after; sVar != this.head; sVar = sVar.after) {
            linkedHashSet.add(sVar.getKey());
        }
        return linkedHashSet;
    }

    public C0367s newHeaderEntry(int i, Object obj, Object obj2, C0367s sVar) {
        return new C0367s(i, obj, obj2, sVar, this.head);
    }

    public boolean remove(Object obj) {
        if (getAndRemove(obj) != null) {
            return true;
        }
        return false;
    }

    public C set(Object obj, Object obj2) {
        validateName(this.nameValidator, false, obj);
        validateValue(this.valueValidator, obj, obj2);
        B.checkNotNull(obj2, "value");
        int hashCode = this.hashingStrategy.hashCode(obj);
        int index = index(hashCode);
        remove0(hashCode, index, obj);
        add0(hashCode, index, obj, obj2);
        return thisT();
    }

    public C setObject(Object obj, Object obj2) {
        return set(obj, B.checkNotNull(fromObject(obj, obj2), "convertedValue"));
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        return G.toString(getClass(), iterator(), size());
    }

    public void validateName(v vVar, boolean z, Object obj) {
        vVar.validateName(obj);
    }

    public void validateValue(y yVar, Object obj, Object obj2) {
        try {
            yVar.validate(obj2);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Validation failed for header '" + obj + "'", e);
        }
    }

    public S valueConverter() {
        return this.valueConverter;
    }

    public Iterator<Object> valueIterator(Object obj) {
        return new w(this, obj);
    }

    public z(C0858q qVar, S s8, v vVar, int i, y yVar) {
        this.valueConverter = (S) B.checkNotNull(s8, "valueConverter");
        this.nameValidator = (v) B.checkNotNull(vVar, "nameValidator");
        this.hashingStrategy = (C0858q) B.checkNotNull(qVar, "nameHashingStrategy");
        this.valueValidator = (y) B.checkNotNull(yVar, "valueValidator");
        C0367s[] sVarArr = new C0367s[C0984q.findNextPositivePowerOfTwo(Math.max(2, Math.min(i, 128)))];
        this.entries = sVarArr;
        this.hashMask = (byte) (sVarArr.length - 1);
        this.head = new C0367s();
    }

    public final boolean contains(Object obj, Object obj2, C0858q qVar) {
        B.checkNotNull(obj, "name");
        int hashCode = this.hashingStrategy.hashCode(obj);
        for (C0367s sVar = this.entries[index(hashCode)]; sVar != null; sVar = sVar.next) {
            if (sVar.hash == hashCode && this.hashingStrategy.equals(obj, sVar.key) && qVar.equals(obj2, sVar.value)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode(C0858q qVar) {
        int i = -1028477387;
        for (Object next : names()) {
            int hashCode = this.hashingStrategy.hashCode(next) + (i * 31);
            List<Object> all = getAll(next);
            for (int i8 = 0; i8 < all.size(); i8++) {
                hashCode = (hashCode * 31) + qVar.hashCode(all.get(i8));
            }
            i = hashCode;
        }
        return i;
    }

    public final boolean equals(C c8, C0858q qVar) {
        z zVar = (z) c8;
        if (zVar.size() != size()) {
            return false;
        }
        if (this == zVar) {
            return true;
        }
        for (Object next : names()) {
            List<Object> all = zVar.getAll(next);
            List<Object> all2 = getAll(next);
            if (all.size() != all2.size()) {
                return false;
            }
            int i = 0;
            while (true) {
                if (i < all.size()) {
                    if (!qVar.equals(all.get(i), all2.get(i))) {
                        return false;
                    }
                    i++;
                }
            }
        }
        return true;
    }

    public C setObject(Object obj, Iterable<?> iterable) {
        Object next;
        validateName(this.nameValidator, false, obj);
        int hashCode = this.hashingStrategy.hashCode(obj);
        int index = index(hashCode);
        remove0(hashCode, index, obj);
        Iterator<?> it = iterable.iterator();
        while (it.hasNext() && (next = it.next()) != null) {
            Object fromObject = fromObject(obj, next);
            validateValue(this.valueValidator, obj, fromObject);
            add0(hashCode, index, obj, fromObject);
        }
        return thisT();
    }

    public C add(C c8) {
        if (c8 != this) {
            addImpl(c8);
            return thisT();
        }
        throw new IllegalArgumentException("can't add to itself.");
    }

    public C set(C c8) {
        if (c8 != this) {
            clear();
            addImpl(c8);
        }
        return thisT();
    }

    public C0367s remove0(C0367s sVar, C0367s sVar2) {
        int index = index(sVar.hash);
        C0367s[] sVarArr = this.entries;
        C0367s sVar3 = sVarArr[index];
        if (sVar3 == sVar) {
            sVar2 = sVar.next;
            sVarArr[index] = sVar2;
        } else if (sVar2 == null) {
            C0367s sVar4 = sVar3.next;
            while (sVar4 != null && sVar4 != sVar) {
                sVar3 = sVar4;
                sVar4 = sVar4.next;
            }
            sVar3.next = sVar.next;
            sVar2 = sVar3;
        } else {
            sVar2.next = sVar.next;
        }
        sVar.remove();
        this.size--;
        return sVar2;
    }
}
