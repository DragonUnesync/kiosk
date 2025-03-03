package U5;

import S5.C0185n;
import T5.C0247g0;
import T5.C0263o0;
import T5.K;
import T5.L;
import T5.P;
import T5.d1;
import V5.e;
import V5.h;
import g6.n0;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

public abstract class c extends i {
    private static final String EXPECTED_TYPES = (" (expected: " + n0.simpleClassName((Class<?>) C0185n.class) + ", " + n0.simpleClassName((Class<?>) d1.class) + ')');
    private static final C0247g0 METADATA = new C0247g0(false, 16);
    private final Runnable flushTask = new a(this);
    /* access modifiers changed from: private */
    public boolean inputClosedSeenErrorOnRead;

    public c(K k8, SelectableChannel selectableChannel) {
        super(k8, selectableChannel, 1);
    }

    private int doWriteInternal(C0263o0 o0Var, Object obj) {
        if (obj instanceof C0185n) {
            C0185n nVar = (C0185n) obj;
            if (!nVar.isReadable()) {
                o0Var.remove();
                return 0;
            }
            int doWriteBytes = doWriteBytes(nVar);
            if (doWriteBytes <= 0) {
                return Integer.MAX_VALUE;
            }
            o0Var.progress((long) doWriteBytes);
            if (nVar.isReadable()) {
                return 1;
            }
            o0Var.remove();
            return 1;
        }
        throw new Error();
    }

    /* access modifiers changed from: private */
    public static boolean isAllowHalfClosure(L l8) {
        if (!(l8 instanceof h) || !((e) ((h) l8)).isAllowHalfClosure()) {
            return false;
        }
        return true;
    }

    public final void clearOpWrite() {
        SelectionKey selectionKey = selectionKey();
        if (selectionKey.isValid()) {
            int interestOps = selectionKey.interestOps();
            if ((interestOps & 4) != 0) {
                selectionKey.interestOps(interestOps & -5);
            }
        }
    }

    public abstract int doReadBytes(C0185n nVar);

    public final int doWrite0(C0263o0 o0Var) {
        if (o0Var.current() == null) {
            return 0;
        }
        return doWriteInternal(o0Var, o0Var.current());
    }

    public abstract int doWriteBytes(C0185n nVar);

    public final Object filterOutboundMessage(Object obj) {
        if (obj instanceof C0185n) {
            C0185n nVar = (C0185n) obj;
            if (nVar.isDirect()) {
                return obj;
            }
            return newDirectBuffer(nVar);
        }
        throw new UnsupportedOperationException("unsupported message type: " + n0.simpleClassName(obj) + EXPECTED_TYPES);
    }

    public final void incompleteWrite(boolean z) {
        if (z) {
            setOpWrite();
            return;
        }
        clearOpWrite();
        eventLoop().execute(this.flushTask);
    }

    public abstract boolean isInputShutdown0();

    public C0247g0 metadata() {
        return METADATA;
    }

    public final void setOpWrite() {
        SelectionKey selectionKey = selectionKey();
        if (selectionKey.isValid()) {
            int interestOps = selectionKey.interestOps();
            if ((interestOps & 4) == 0) {
                selectionKey.interestOps(interestOps | 4);
            }
        }
    }

    public final boolean shouldBreakReadReady(L l8) {
        if (!isInputShutdown0() || (!this.inputClosedSeenErrorOnRead && isAllowHalfClosure(l8))) {
            return false;
        }
        return true;
    }

    public abstract P shutdownInput();
}
