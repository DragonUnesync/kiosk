package f5;

import I7.d;
import U0.c;
import io.netty.channel.epoll.Epoll;
import io.netty.channel.epoll.EpollEventLoopGroup;
import io.netty.channel.epoll.EpollSocketChannel;
import java.util.concurrent.Executor;

/* renamed from: f5.d  reason: case insensitive filesystem */
public abstract class C0906d {
    public static /* synthetic */ EpollSocketChannel a() {
        return new EpollSocketChannel();
    }

    public static /* synthetic */ EpollEventLoopGroup b(int i, Executor executor) {
        return new EpollEventLoopGroup(i, executor);
    }

    public static C0907e c() {
        if (Epoll.isAvailable()) {
            return new C0907e(new d(2), new c(18));
        }
        return C0907e.a();
    }
}
