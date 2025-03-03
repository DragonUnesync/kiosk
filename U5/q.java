package U5;

import T5.X0;
import T5.Z0;
import T5.b1;
import T5.h1;
import T5.q1;
import f6.W;
import f6.Y;
import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.Executor;

public final class q extends h1 {
    public q(int i, Executor executor) {
        this(i, executor, SelectorProvider.provider());
    }

    public q(int i, Executor executor, SelectorProvider selectorProvider) {
        this(i, executor, selectorProvider, X0.INSTANCE);
    }

    public Z0 newChild(Executor executor, Object... objArr) {
        SelectorProvider selectorProvider = objArr[0];
        q1 q1Var = objArr[1];
        W w2 = objArr[2];
        int length = objArr.length;
        if (length > 3 && objArr[3] != null) {
            throw new ClassCastException();
        } else if (length <= 4 || objArr[4] == null) {
            return new p(this, executor, selectorProvider, ((X0) q1Var).newSelectStrategy(), w2, (b1) null, (b1) null);
        } else {
            throw new ClassCastException();
        }
    }

    public q(int i, Executor executor, SelectorProvider selectorProvider, q1 q1Var) {
        super(i, executor, selectorProvider, q1Var, Y.reject());
    }
}
