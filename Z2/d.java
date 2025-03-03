package z2;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

public final class d extends ByteArrayOutputStream {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ e f16442U;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar, int i) {
        super(i);
        this.f16442U = eVar;
    }

    public final String toString() {
        int i = this.count;
        if (i > 0 && this.buf[i - 1] == 13) {
            i--;
        }
        try {
            return new String(this.buf, 0, i, this.f16442U.f16444V.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
