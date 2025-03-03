package F3;

import H3.H;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import javax.annotation.processing.AbstractProcessor;

public final class a extends AbstractProcessor {
    public a() {
        DesugarCollections.synchronizedList(new ArrayList());
        H.h();
    }
}
