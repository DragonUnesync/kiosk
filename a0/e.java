package a0;

import com.bumptech.glide.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class e extends c {

    /* renamed from: U  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6996U;

    /* renamed from: V  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6997V;

    /* renamed from: W  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6998W;

    /* renamed from: X  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f6999X;

    /* renamed from: Y  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7000Y;

    public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f6996U = atomicReferenceFieldUpdater;
        this.f6997V = atomicReferenceFieldUpdater2;
        this.f6998W = atomicReferenceFieldUpdater3;
        this.f6999X = atomicReferenceFieldUpdater4;
        this.f7000Y = atomicReferenceFieldUpdater5;
    }

    public final boolean d(i iVar, d dVar, d dVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6999X;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, dVar, dVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == dVar);
        return false;
    }

    public final boolean e(i iVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7000Y;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == obj);
        return false;
    }

    public final boolean f(i iVar, h hVar, h hVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6998W;
            if (atomicReferenceFieldUpdater.compareAndSet(iVar, hVar, hVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(iVar) == hVar);
        return false;
    }

    public final void t(h hVar, h hVar2) {
        this.f6997V.lazySet(hVar, hVar2);
    }

    public final void u(h hVar, Thread thread) {
        this.f6996U.lazySet(hVar, thread);
    }
}
