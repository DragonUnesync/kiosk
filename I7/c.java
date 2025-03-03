package I7;

import j$.util.Objects;
import j$.util.stream.Stream;
import java.io.Closeable;

public final class c implements Closeable {

    /* renamed from: U  reason: collision with root package name */
    public final Stream f2334U;

    public c(Stream stream) {
        Objects.requireNonNull(stream, "delegate");
        this.f2334U = stream;
    }

    public static c k(Stream stream) {
        if (stream != null) {
            return new c(stream);
        }
        return k(Stream.-CC.empty());
    }

    public final void close() {
        this.f2334U.close();
    }
}
