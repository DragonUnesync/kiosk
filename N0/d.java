package N0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f3237a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a();

    ByteBuffer b();

    void c();

    boolean d();

    void e(ByteBuffer byteBuffer);

    b f(b bVar);

    void flush();

    boolean isActive();
}
