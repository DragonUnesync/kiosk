package S5;

import java.nio.ByteBuffer;

/* renamed from: S5.d  reason: case insensitive filesystem */
public abstract class C0165d extends C0159a {
    public C0165d(int i) {
        super(i);
    }

    public ByteBuffer internalNioBuffer(int i, int i8) {
        return nioBuffer(i, i8);
    }

    public final boolean isAccessible() {
        return isAccessible0();
    }

    public boolean isAccessible0() {
        return unwrap().isAccessible();
    }

    public boolean isContiguous() {
        return unwrap().isContiguous();
    }

    public boolean isReadOnly() {
        return unwrap().isReadOnly();
    }

    public ByteBuffer nioBuffer(int i, int i8) {
        return unwrap().nioBuffer(i, i8);
    }

    public final int refCnt() {
        return refCnt0();
    }

    public int refCnt0() {
        return unwrap().refCnt();
    }

    public final boolean release() {
        return release0();
    }

    public boolean release0() {
        return unwrap().release();
    }

    public final C0185n retain() {
        return retain0();
    }

    public C0185n retain0() {
        unwrap().retain();
        return this;
    }

    public C0185n touch0(Object obj) {
        unwrap().touch(obj);
        return this;
    }

    public final C0185n touch(Object obj) {
        return touch0(obj);
    }
}
