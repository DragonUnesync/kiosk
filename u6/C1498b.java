package u6;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import q6.d;

/* renamed from: u6.b  reason: case insensitive filesystem */
public final class C1498b implements d {

    /* renamed from: c0  reason: collision with root package name */
    public static final int f15808c0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: d0  reason: collision with root package name */
    public static final Object f15809d0 = new Object();

    /* renamed from: U  reason: collision with root package name */
    public final AtomicLong f15810U;

    /* renamed from: V  reason: collision with root package name */
    public final int f15811V;

    /* renamed from: W  reason: collision with root package name */
    public long f15812W;

    /* renamed from: X  reason: collision with root package name */
    public final int f15813X;

    /* renamed from: Y  reason: collision with root package name */
    public AtomicReferenceArray f15814Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f15815Z;

    /* renamed from: a0  reason: collision with root package name */
    public AtomicReferenceArray f15816a0;

    /* renamed from: b0  reason: collision with root package name */
    public final AtomicLong f15817b0 = new AtomicLong();

    public C1498b(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f15810U = atomicLong;
        int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i8 = numberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(numberOfLeadingZeros + 1);
        this.f15814Y = atomicReferenceArray;
        this.f15813X = i8;
        this.f15811V = Math.min(numberOfLeadingZeros / 4, f15808c0);
        this.f15816a0 = atomicReferenceArray;
        this.f15815Z = i8;
        this.f15812W = (long) (numberOfLeadingZeros - 2);
        atomicLong.lazySet(0);
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        if (this.f15810U.get() == this.f15817b0.get()) {
            return true;
        }
        return false;
    }

    public final boolean offer(Object obj) {
        if (obj != null) {
            AtomicReferenceArray atomicReferenceArray = this.f15814Y;
            AtomicLong atomicLong = this.f15810U;
            long j7 = atomicLong.get();
            int i = this.f15813X;
            int i8 = ((int) j7) & i;
            if (j7 < this.f15812W) {
                atomicReferenceArray.lazySet(i8, obj);
                atomicLong.lazySet(j7 + 1);
                return true;
            }
            long j8 = ((long) this.f15811V) + j7;
            if (atomicReferenceArray.get(((int) j8) & i) == null) {
                this.f15812W = j8 - 1;
                atomicReferenceArray.lazySet(i8, obj);
                atomicLong.lazySet(j7 + 1);
                return true;
            }
            long j9 = j7 + 1;
            if (atomicReferenceArray.get(((int) j9) & i) == null) {
                atomicReferenceArray.lazySet(i8, obj);
                atomicLong.lazySet(j9);
                return true;
            }
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
            this.f15814Y = atomicReferenceArray2;
            this.f15812W = (j7 + ((long) i)) - 1;
            atomicReferenceArray2.lazySet(i8, obj);
            atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
            atomicReferenceArray.lazySet(i8, f15809d0);
            atomicLong.lazySet(j9);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public final Object poll() {
        boolean z;
        AtomicReferenceArray atomicReferenceArray = this.f15816a0;
        AtomicLong atomicLong = this.f15817b0;
        long j7 = atomicLong.get();
        int i = this.f15815Z;
        int i8 = ((int) j7) & i;
        Object obj = atomicReferenceArray.get(i8);
        if (obj == f15809d0) {
            z = true;
        } else {
            z = false;
        }
        if (obj != null && !z) {
            atomicReferenceArray.lazySet(i8, (Object) null);
            atomicLong.lazySet(j7 + 1);
            return obj;
        } else if (!z) {
            return null;
        } else {
            int i9 = i + 1;
            AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i9);
            atomicReferenceArray.lazySet(i9, (Object) null);
            this.f15816a0 = atomicReferenceArray2;
            Object obj2 = atomicReferenceArray2.get(i8);
            if (obj2 != null) {
                atomicReferenceArray2.lazySet(i8, (Object) null);
                atomicLong.lazySet(j7 + 1);
            }
            return obj2;
        }
    }
}
