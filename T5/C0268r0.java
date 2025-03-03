package T5;

import java.net.SocketAddress;

/* renamed from: T5.r0  reason: case insensitive filesystem */
public interface C0268r0 {
    P close();

    P close(C0274u0 u0Var);

    P connect(SocketAddress socketAddress, SocketAddress socketAddress2, C0274u0 u0Var);

    P disconnect(C0274u0 u0Var);

    P newFailedFuture(Throwable th);

    C0274u0 newPromise();

    C0274u0 voidPromise();

    P write(Object obj);

    P write(Object obj, C0274u0 u0Var);

    P writeAndFlush(Object obj);

    P writeAndFlush(Object obj, C0274u0 u0Var);
}
