package V5;

import S5.C0187o;
import T5.B0;
import T5.C0251i0;
import T5.N;
import T5.g1;
import T5.o1;
import T5.w1;
import g6.B;
import g6.Y;
import java.net.Socket;
import java.net.SocketException;

public abstract class e extends B0 implements h {
    private volatile boolean allowHalfClosure;
    protected final Socket javaSocket;

    public e(g gVar, Socket socket) {
        super(gVar);
        this.javaSocket = (Socket) B.checkNotNull(socket, "javaSocket");
        if (Y.canEnableTcpNoDelayByDefault()) {
            try {
                setTcpNoDelay(true);
            } catch (Exception unused) {
            }
        }
    }

    public <T> T getOption(C0251i0 i0Var) {
        if (i0Var == C0251i0.SO_RCVBUF) {
            return Integer.valueOf(getReceiveBufferSize());
        }
        if (i0Var == C0251i0.SO_SNDBUF) {
            return Integer.valueOf(getSendBufferSize());
        }
        if (i0Var == C0251i0.TCP_NODELAY) {
            return Boolean.valueOf(isTcpNoDelay());
        }
        if (i0Var == C0251i0.SO_KEEPALIVE) {
            return Boolean.valueOf(isKeepAlive());
        }
        if (i0Var == C0251i0.SO_REUSEADDR) {
            return Boolean.valueOf(isReuseAddress());
        }
        if (i0Var == C0251i0.SO_LINGER) {
            return Integer.valueOf(getSoLinger());
        }
        if (i0Var == C0251i0.IP_TOS) {
            return Integer.valueOf(getTrafficClass());
        }
        if (i0Var == C0251i0.ALLOW_HALF_CLOSURE) {
            return Boolean.valueOf(isAllowHalfClosure());
        }
        return super.getOption(i0Var);
    }

    public int getReceiveBufferSize() {
        try {
            return this.javaSocket.getReceiveBufferSize();
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public int getSendBufferSize() {
        try {
            return this.javaSocket.getSendBufferSize();
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public int getSoLinger() {
        try {
            return this.javaSocket.getSoLinger();
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public int getTrafficClass() {
        try {
            return this.javaSocket.getTrafficClass();
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public boolean isAllowHalfClosure() {
        return this.allowHalfClosure;
    }

    public boolean isKeepAlive() {
        try {
            return this.javaSocket.getKeepAlive();
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public boolean isReuseAddress() {
        try {
            return this.javaSocket.getReuseAddress();
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public boolean isTcpNoDelay() {
        try {
            return this.javaSocket.getTcpNoDelay();
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public h setAllowHalfClosure(boolean z) {
        this.allowHalfClosure = z;
        return this;
    }

    public h setKeepAlive(boolean z) {
        try {
            this.javaSocket.setKeepAlive(z);
            return this;
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public <T> boolean setOption(C0251i0 i0Var, T t8) {
        validate(i0Var, t8);
        if (i0Var == C0251i0.SO_RCVBUF) {
            setReceiveBufferSize(((Integer) t8).intValue());
            return true;
        } else if (i0Var == C0251i0.SO_SNDBUF) {
            setSendBufferSize(((Integer) t8).intValue());
            return true;
        } else if (i0Var == C0251i0.TCP_NODELAY) {
            setTcpNoDelay(((Boolean) t8).booleanValue());
            return true;
        } else if (i0Var == C0251i0.SO_KEEPALIVE) {
            setKeepAlive(((Boolean) t8).booleanValue());
            return true;
        } else if (i0Var == C0251i0.SO_REUSEADDR) {
            setReuseAddress(((Boolean) t8).booleanValue());
            return true;
        } else if (i0Var == C0251i0.SO_LINGER) {
            setSoLinger(((Integer) t8).intValue());
            return true;
        } else if (i0Var == C0251i0.IP_TOS) {
            setTrafficClass(((Integer) t8).intValue());
            return true;
        } else if (i0Var != C0251i0.ALLOW_HALF_CLOSURE) {
            return super.setOption(i0Var, t8);
        } else {
            setAllowHalfClosure(((Boolean) t8).booleanValue());
            return true;
        }
    }

    public h setReceiveBufferSize(int i) {
        try {
            this.javaSocket.setReceiveBufferSize(i);
            return this;
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public h setReuseAddress(boolean z) {
        try {
            this.javaSocket.setReuseAddress(z);
            return this;
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public h setSendBufferSize(int i) {
        try {
            this.javaSocket.setSendBufferSize(i);
            return this;
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public h setSoLinger(int i) {
        if (i < 0) {
            try {
                this.javaSocket.setSoLinger(false, 0);
            } catch (SocketException e) {
                throw new N((Throwable) e);
            }
        } else {
            this.javaSocket.setSoLinger(true, i);
        }
        return this;
    }

    public h setTcpNoDelay(boolean z) {
        try {
            this.javaSocket.setTcpNoDelay(z);
            return this;
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public h setTrafficClass(int i) {
        try {
            this.javaSocket.setTrafficClass(i);
            return this;
        } catch (SocketException e) {
            throw new N((Throwable) e);
        }
    }

    public h setAllocator(C0187o oVar) {
        super.setAllocator(oVar);
        return this;
    }

    public h setAutoClose(boolean z) {
        super.setAutoClose(z);
        return this;
    }

    public h setAutoRead(boolean z) {
        super.setAutoRead(z);
        return this;
    }

    public h setConnectTimeoutMillis(int i) {
        super.setConnectTimeoutMillis(i);
        return this;
    }

    @Deprecated
    public h setMaxMessagesPerRead(int i) {
        super.setMaxMessagesPerRead(i);
        return this;
    }

    public h setMessageSizeEstimator(g1 g1Var) {
        super.setMessageSizeEstimator(g1Var);
        return this;
    }

    public h setRecvByteBufAllocator(o1 o1Var) {
        super.setRecvByteBufAllocator(o1Var);
        return this;
    }

    public h setWriteBufferHighWaterMark(int i) {
        super.setWriteBufferHighWaterMark(i);
        return this;
    }

    public h setWriteBufferLowWaterMark(int i) {
        super.setWriteBufferLowWaterMark(i);
        return this;
    }

    public h setWriteBufferWaterMark(w1 w1Var) {
        super.setWriteBufferWaterMark(w1Var);
        return this;
    }

    public h setWriteSpinCount(int i) {
        super.setWriteSpinCount(i);
        return this;
    }
}
