package b6;

import S5.C0187o;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.SSLEngine;

public abstract class O extends F0 {
    public O(Iterable<String> iterable, C0558i iVar, C0543d dVar, int i, Certificate[] certificateArr, C0561j jVar, String[] strArr, boolean z, boolean z6, Map.Entry<C0548e1, Object>... entryArr) {
        super(iterable, iVar, F0.toNegotiator(dVar), i, certificateArr, jVar, strArr, z, z6, false, entryArr);
    }

    public final void finalize() {
        super.finalize();
        F.releaseIfNeeded(this);
    }

    public final SSLEngine newEngine0(C0187o oVar, String str, int i, boolean z) {
        return new Q(this, oVar, str, i, z);
    }

    public O(Iterable<String> iterable, C0558i iVar, G g8, int i, Certificate[] certificateArr, C0561j jVar, String[] strArr, boolean z, boolean z6, Map.Entry<C0548e1, Object>... entryArr) {
        super(iterable, iVar, g8, i, certificateArr, jVar, strArr, z, z6, false, entryArr);
    }
}
