package Z5;

import S5.C0185n;
import S5.D0;
import T5.C0270s0;
import T5.O0;
import T5.Y;
import X5.J;
import e6.C0847f;
import h6.C1082c;
import h6.d;

public final class a0 extends J {
    private static final C0406y CONTINUE;
    private static final C0406y EXPECTATION_FAILED;
    private static final C0406y TOO_LARGE;
    private static final C0406y TOO_LARGE_CLOSE;
    /* access modifiers changed from: private */
    public static final C1082c logger = d.getInstance((Class<?>) a0.class);
    private final boolean closeOnExpectationFailed;

    static {
        r0 r0Var = r0.HTTP_1_1;
        m0 m0Var = m0.CONTINUE;
        C0185n nVar = D0.EMPTY_BUFFER;
        CONTINUE = new C0389g(r0Var, m0Var, nVar);
        C0389g gVar = new C0389g(r0Var, m0.EXPECTATION_FAILED, nVar);
        EXPECTATION_FAILED = gVar;
        m0 m0Var2 = m0.REQUEST_ENTITY_TOO_LARGE;
        C0389g gVar2 = new C0389g(r0Var, m0Var2, nVar);
        TOO_LARGE_CLOSE = gVar2;
        C0389g gVar3 = new C0389g(r0Var, m0Var2, nVar);
        TOO_LARGE = gVar3;
        L headers = gVar.headers();
        C0847f fVar = G.CONTENT_LENGTH;
        headers.set((CharSequence) fVar, (Object) 0);
        gVar3.headers().set((CharSequence) fVar, (Object) 0);
        gVar2.headers().set((CharSequence) fVar, (Object) 0);
        gVar2.headers().set((CharSequence) G.CONNECTION, (Object) K.CLOSE);
    }

    public a0(int i) {
        this(i, false);
    }

    private static Object continueResponse(N n4, int i, C0270s0 s0Var) {
        if (q0.isUnsupportedExpectation(n4)) {
            ((O0) s0Var).fireUserEventTriggered(F.INSTANCE);
            return EXPECTATION_FAILED.retainedDuplicate();
        } else if (!q0.is100ContinueExpected(n4)) {
            return null;
        } else {
            if (q0.getContentLength(n4, -1) <= ((long) i)) {
                return CONTINUE.retainedDuplicate();
            }
            ((O0) s0Var).fireUserEventTriggered(F.INSTANCE);
            return TOO_LARGE.retainedDuplicate();
        }
    }

    public boolean closeAfterContinueResponse(Object obj) {
        if (!this.closeOnExpectationFailed || !ignoreContentAfterContinueResponse(obj)) {
            return false;
        }
        return true;
    }

    public boolean ignoreContentAfterContinueResponse(Object obj) {
        if (obj instanceof k0) {
            return ((k0) obj).status().codeClass().equals(p0.CLIENT_ERROR);
        }
        return false;
    }

    public a0(int i, boolean z) {
        super(i);
        this.closeOnExpectationFailed = z;
    }

    public void aggregate(C0404w wVar, D d8) {
        if (d8 instanceof t0) {
            ((X) wVar).setTrailingHeaders(((t0) d8).trailingHeaders());
        }
    }

    public C0404w beginAggregation(N n4, C0185n nVar) {
        q0.setTransferEncodingChunked(n4, false);
        if (n4 instanceof i0) {
            return new Y((i0) n4, nVar, (L) null);
        }
        if (n4 instanceof k0) {
            return new Z((k0) n4, nVar, (L) null);
        }
        throw new Error();
    }

    public void finishAggregation(C0404w wVar) {
        if (!q0.isContentLengthSet(wVar)) {
            wVar.headers().set((CharSequence) G.CONTENT_LENGTH, (Object) String.valueOf(wVar.content().readableBytes()));
        }
    }

    public void handleOversizedMessage(Y y8, N n4) {
        if (n4 instanceof i0) {
            if ((n4 instanceof C0404w) || (!q0.is100ContinueExpected(n4) && !q0.isKeepAlive(n4))) {
                y8.writeAndFlush(TOO_LARGE_CLOSE.retainedDuplicate()).addListener(new V(this, y8));
            } else {
                y8.writeAndFlush(TOO_LARGE.retainedDuplicate()).addListener(new W(this, y8));
            }
        } else if (n4 instanceof k0) {
            y8.close();
            throw new u0("Response entity too large: " + n4);
        } else {
            throw new IllegalStateException();
        }
    }

    public boolean isAggregated(U u3) {
        return u3 instanceof C0404w;
    }

    public boolean isContentLengthInvalid(N n4, int i) {
        try {
            return q0.getContentLength(n4, -1) > ((long) i);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean isContentMessage(U u3) {
        return u3 instanceof D;
    }

    public boolean isLastContentMessage(D d8) {
        return d8 instanceof t0;
    }

    public boolean isStartMessage(U u3) {
        return u3 instanceof N;
    }

    public Object newContinueResponse(N n4, int i, C0270s0 s0Var) {
        Object continueResponse = continueResponse(n4, i, s0Var);
        if (continueResponse != null) {
            n4.headers().remove((CharSequence) G.EXPECT);
        }
        return continueResponse;
    }
}
