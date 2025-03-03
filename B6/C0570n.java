package b6;

import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;

/* renamed from: b6.n  reason: case insensitive filesystem */
public final class C0570n implements SSLSessionBindingListener {
    final SSLSessionBindingListener delegate;
    final /* synthetic */ C0572o this$0;

    public C0570n(C0572o oVar, SSLSessionBindingListener sSLSessionBindingListener) {
        this.this$0 = oVar;
        this.delegate = sSLSessionBindingListener;
    }

    public void valueBound(SSLSessionBindingEvent sSLSessionBindingEvent) {
        this.delegate.valueBound(new SSLSessionBindingEvent(this.this$0, sSLSessionBindingEvent.getName()));
    }

    public void valueUnbound(SSLSessionBindingEvent sSLSessionBindingEvent) {
        this.delegate.valueUnbound(new SSLSessionBindingEvent(this.this$0, sSLSessionBindingEvent.getName()));
    }
}
