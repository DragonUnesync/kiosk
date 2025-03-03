package b6;

import e6.C0852k;
import g6.C0978k;
import io.netty.internal.tcnative.SSL;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public final class H0 extends C0572o {
    private String[] peerSupportedSignatureAlgorithms;
    private List requestedServerNames;
    final /* synthetic */ Q0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H0(Q0 q02, Y y8) {
        super(y8);
        this.this$0 = q02;
    }

    public String[] getPeerSupportedSignatureAlgorithms() {
        String[] strArr;
        synchronized (this.this$0) {
            try {
                if (this.peerSupportedSignatureAlgorithms == null) {
                    if (this.this$0.isDestroyed()) {
                        this.peerSupportedSignatureAlgorithms = C0978k.EMPTY_STRINGS;
                    } else {
                        String[] sigAlgs = SSL.getSigAlgs(this.this$0.ssl);
                        if (sigAlgs == null) {
                            this.peerSupportedSignatureAlgorithms = C0978k.EMPTY_STRINGS;
                        } else {
                            LinkedHashSet linkedHashSet = new LinkedHashSet(sigAlgs.length);
                            for (String javaName : sigAlgs) {
                                String javaName2 = W0.toJavaName(javaName);
                                if (javaName2 != null) {
                                    linkedHashSet.add(javaName2);
                                }
                            }
                            this.peerSupportedSignatureAlgorithms = (String[]) linkedHashSet.toArray(C0978k.EMPTY_STRINGS);
                        }
                    }
                }
                strArr = (String[]) this.peerSupportedSignatureAlgorithms.clone();
            } catch (Throwable th) {
                throw th;
            }
        }
        return strArr;
    }

    public List getRequestedServerNames() {
        List list;
        if (this.this$0.clientMode) {
            return C0581t.getSniHostNames((List<String>) this.this$0.sniHostNames);
        }
        synchronized (this.this$0) {
            try {
                if (this.requestedServerNames == null) {
                    if (this.this$0.isDestroyed()) {
                        this.requestedServerNames = Collections.emptyList();
                    } else if (SSL.getSniHostname(this.this$0.ssl) == null) {
                        this.requestedServerNames = Collections.emptyList();
                    } else {
                        this.requestedServerNames = C0581t.getSniHostName(SSL.getSniHostname(this.this$0.ssl).getBytes(C0852k.UTF_8));
                    }
                }
                list = this.requestedServerNames;
            } catch (Throwable th) {
                throw th;
            }
        }
        return list;
    }
}
