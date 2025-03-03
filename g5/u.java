package G5;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1733a = new HashMap(3);

    /* renamed from: b  reason: collision with root package name */
    public Class f1734b;

    static {
        DesugarCollections.unmodifiableList(Arrays.asList(new String[]{"UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14"}));
        DesugarCollections.unmodifiableList(Arrays.asList(new String[]{"UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED"}));
    }

    public final void a(Object obj, String str) {
        this.f1733a.put(str, obj);
    }
}
