package b6;

import java.util.Collections;
import java.util.List;

/* renamed from: b6.y  reason: case insensitive filesystem */
public final class C0591y implements C0587w {
    private static final C0585v DEFAULT_SSL_ENGINE_WRAPPER_FACTORY = new C0589x();
    public static final C0591y INSTANCE = new C0591y();

    private C0591y() {
    }

    public List<String> protocols() {
        return Collections.emptyList();
    }

    public C0585v wrapperFactory() {
        return DEFAULT_SSL_ENGINE_WRAPPER_FACTORY;
    }
}
