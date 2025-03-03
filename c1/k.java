package c1;

import S0.b;
import Z1.c;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import n1.C1239d;

public interface k {
    void A(int i, long j7);

    int B();

    void c(int i, int i8, int i9, long j7);

    void d(int i, b bVar, long j7, int i8);

    void flush();

    void g(Bundle bundle);

    int h(MediaCodec.BufferInfo bufferInfo);

    void k(int i);

    void l(C1239d dVar, Handler handler);

    void n(int i);

    MediaFormat p();

    void q();

    ByteBuffer r(int i);

    void release();

    void s(Surface surface);

    boolean u(c cVar);

    ByteBuffer v(int i);
}
