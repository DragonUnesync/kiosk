package l7;

import P6.f;
import java.util.concurrent.atomic.AtomicReference;

public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public static final r f13245a = new r(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f13246b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference[] f13247c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f13246b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f13247c = atomicReferenceArr;
    }

    public static final void a(r rVar) {
        int i;
        f.e(rVar, "segment");
        if (rVar.f13243f != null || rVar.f13244g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (!rVar.f13242d) {
            AtomicReference atomicReference = f13247c[(int) (Thread.currentThread().getId() & (((long) f13246b) - 1))];
            r rVar2 = f13245a;
            r rVar3 = (r) atomicReference.getAndSet(rVar2);
            if (rVar3 != rVar2) {
                if (rVar3 != null) {
                    i = rVar3.f13241c;
                } else {
                    i = 0;
                }
                if (i >= 65536) {
                    atomicReference.set(rVar3);
                    return;
                }
                rVar.f13243f = rVar3;
                rVar.f13240b = 0;
                rVar.f13241c = i + 8192;
                atomicReference.set(rVar);
            }
        }
    }

    public static final r b() {
        AtomicReference atomicReference = f13247c[(int) (Thread.currentThread().getId() & (((long) f13246b) - 1))];
        r rVar = f13245a;
        r rVar2 = (r) atomicReference.getAndSet(rVar);
        if (rVar2 == rVar) {
            return new r();
        }
        if (rVar2 == null) {
            atomicReference.set((Object) null);
            return new r();
        }
        atomicReference.set(rVar2.f13243f);
        rVar2.f13243f = null;
        rVar2.f13241c = 0;
        return rVar2;
    }
}
