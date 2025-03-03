package T5;

/* renamed from: T5.d  reason: case insensitive filesystem */
public final class C0240d implements Runnable {
    final /* synthetic */ C0242e this$2;

    public C0240d(C0242e eVar) {
        this.this$2 = eVar;
    }

    public void run() {
        C0242e eVar = this.this$2;
        C0263o0 o0Var = eVar.val$outboundBuffer;
        if (o0Var != null) {
            o0Var.failFlushed(eVar.val$cause, eVar.val$notify);
            C0242e eVar2 = this.this$2;
            eVar2.val$outboundBuffer.close(eVar2.val$closeCause);
        }
        C0242e eVar3 = this.this$2;
        eVar3.this$1.fireChannelInactiveAndDeregister(eVar3.val$wasActive);
    }
}
