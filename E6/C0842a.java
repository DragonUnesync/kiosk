package e6;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: e6.a  reason: case insensitive filesystem */
public abstract class C0842a implements C0853l {
    private static final AtomicLong uniqueIdGenerator = new AtomicLong();
    private final int id;
    private final String name;
    private final long uniquifier = uniqueIdGenerator.getAndIncrement();

    public C0842a(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String name() {
        return this.name;
    }

    public final String toString() {
        return name();
    }

    public final int compareTo(C0842a aVar) {
        if (this == aVar) {
            return 0;
        }
        int hashCode = hashCode() - aVar.hashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        long j7 = this.uniquifier;
        long j8 = aVar.uniquifier;
        if (j7 < j8) {
            return -1;
        }
        if (j7 > j8) {
            return 1;
        }
        throw new Error("failed to compare two different constants");
    }
}
