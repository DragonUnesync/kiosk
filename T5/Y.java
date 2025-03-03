package T5;

import S5.C0187o;
import e6.C0850i;
import f6.C0929t;

public interface Y extends C0850i, C0268r0 {
    C0187o alloc();

    K channel();

    C0929t executor();

    Y fireChannelActive();

    Y fireChannelInactive();

    Y fireChannelRead(Object obj);

    Y fireChannelReadComplete();

    Y fireChannelRegistered();

    Y fireChannelUnregistered();

    Y fireChannelWritabilityChanged();

    Y fireExceptionCaught(Throwable th);

    Y fireUserEventTriggered(Object obj);

    Y flush();

    W handler();

    boolean isRemoved();

    String name();

    C0270s0 pipeline();

    Y read();
}
