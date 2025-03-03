package e6;

import g6.B;
import g6.Y;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e6.m  reason: case insensitive filesystem */
public abstract class C0854m {
    private final ConcurrentMap<String, C0853l> constants = Y.newConcurrentHashMap();
    private final AtomicInteger nextId = new AtomicInteger(1);

    private C0853l getOrCreate(String str) {
        C0853l lVar = this.constants.get(str);
        if (lVar != null) {
            return lVar;
        }
        C0853l newConstant = newConstant(nextId(), str);
        C0853l putIfAbsent = this.constants.putIfAbsent(str, newConstant);
        if (putIfAbsent == null) {
            return newConstant;
        }
        return putIfAbsent;
    }

    public abstract C0853l newConstant(int i, String str);

    @Deprecated
    public final int nextId() {
        return this.nextId.getAndIncrement();
    }

    public C0853l valueOf(Class<?> cls, String str) {
        return valueOf(((Class) B.checkNotNull(cls, "firstNameComponent")).getName() + '#' + ((String) B.checkNotNull(str, "secondNameComponent")));
    }

    public C0853l valueOf(String str) {
        return getOrCreate(B.checkNonEmpty(str, "name"));
    }
}
