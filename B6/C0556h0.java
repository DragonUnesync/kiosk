package b6;

import S5.L0;
import e6.I;
import g6.B;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.X509KeyManager;

/* renamed from: b6.h0  reason: case insensitive filesystem */
public final class C0556h0 extends V {
    private final Map<String, Object> materialMap = new HashMap();

    public C0556h0(X509KeyManager x509KeyManager, String str, Iterable<String> iterable) {
        super(x509KeyManager, str);
        String next;
        try {
            Iterator<String> it = iterable.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (next != null && !this.materialMap.containsKey(next)) {
                    this.materialMap.put(next, super.chooseKeyMaterial(L0.DEFAULT, next));
                }
            }
            B.checkNonEmpty(this.materialMap, "materialMap");
        } catch (Exception e) {
            this.materialMap.put(next, e);
        } catch (Throwable th) {
            destroy();
            throw th;
        }
    }

    public void destroy() {
        for (Object release : this.materialMap.values()) {
            I.release(release);
        }
        this.materialMap.clear();
    }
}
