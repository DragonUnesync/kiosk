package e6;

import g6.B;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: e6.o  reason: case insensitive filesystem */
public class C0856o implements C0850i {
    private static final AtomicReferenceFieldUpdater<C0856o, C0855n[]> ATTRIBUTES_UPDATER = AtomicReferenceFieldUpdater.newUpdater(C0856o.class, C0855n[].class, "attributes");
    private static final C0855n[] EMPTY_ATTRIBUTES = new C0855n[0];
    private volatile C0855n[] attributes = EMPTY_ATTRIBUTES;

    private static void orderedCopyOnInsert(C0855n[] nVarArr, int i, C0855n[] nVarArr2, C0855n nVar) {
        C0849h unused = nVar.getClass();
        throw null;
    }

    private static int searchAttributeByKey(C0855n[] nVarArr, C0849h hVar) {
        int length = nVarArr.length - 1;
        if (length < 0) {
            return -1;
        }
        int i = length >>> 1;
        C0849h unused = nVarArr[i].getClass();
        return i;
    }

    public <T> C0848g attr(C0849h hVar) {
        C0855n[] nVarArr;
        B.checkNotNull(hVar, "key");
        C0855n nVar = null;
        while (true) {
            C0855n[] nVarArr2 = this.attributes;
            int searchAttributeByKey = searchAttributeByKey(nVarArr2, hVar);
            if (searchAttributeByKey >= 0) {
                C0855n nVar2 = nVarArr2[searchAttributeByKey];
                if (!nVar2.isRemoved()) {
                    return nVar2;
                }
                if (nVar == null) {
                    nVar = new C0855n(this, hVar);
                }
                nVarArr = (C0855n[]) Arrays.copyOf(nVarArr2, nVarArr2.length);
                nVarArr[searchAttributeByKey] = nVar;
            } else {
                if (nVar == null) {
                    nVar = new C0855n(this, hVar);
                }
                int length = nVarArr2.length;
                nVarArr = new C0855n[(length + 1)];
                orderedCopyOnInsert(nVarArr2, length, nVarArr, nVar);
            }
            AtomicReferenceFieldUpdater<C0856o, C0855n[]> atomicReferenceFieldUpdater = ATTRIBUTES_UPDATER;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, nVarArr2, nVarArr)) {
                    return nVar;
                }
                if (atomicReferenceFieldUpdater.get(this) != nVarArr2) {
                }
            }
        }
    }
}
