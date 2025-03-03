package S6;

import P6.f;
import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public final class a extends R6.a {
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        f.d(current, "current(...)");
        return current;
    }
}
