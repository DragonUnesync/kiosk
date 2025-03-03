package u6;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import q6.d;

/* renamed from: u6.a  reason: case insensitive filesystem */
public final class C1497a extends AtomicReferenceArray implements d {

    /* renamed from: Z  reason: collision with root package name */
    public static final Integer f15802Z = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: U  reason: collision with root package name */
    public final int f15803U = (length() - 1);

    /* renamed from: V  reason: collision with root package name */
    public final AtomicLong f15804V = new AtomicLong();

    /* renamed from: W  reason: collision with root package name */
    public long f15805W;

    /* renamed from: X  reason: collision with root package name */
    public final AtomicLong f15806X = new AtomicLong();

    /* renamed from: Y  reason: collision with root package name */
    public final int f15807Y;

    public C1497a(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.f15807Y = Math.min(i / 4, f15802Z.intValue());
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        if (this.f15804V.get() == this.f15806X.get()) {
            return true;
        }
        return false;
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            AtomicLong atomicLong = this.f15804V;
            long j7 = atomicLong.get();
            int i = this.f15803U;
            int i8 = ((int) j7) & i;
            if (j7 >= this.f15805W) {
                long j8 = ((long) this.f15807Y) + j7;
                if (get(i & ((int) j8)) == null) {
                    this.f15805W = j8;
                } else if (get(i8) != null) {
                    return false;
                }
            }
            lazySet(i8, obj);
            atomicLong.lazySet(j7 + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final Object poll() {
        AtomicLong atomicLong = this.f15806X;
        long j7 = atomicLong.get();
        int i = ((int) j7) & this.f15803U;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j7 + 1);
        lazySet(i, (Object) null);
        return obj;
    }
}
