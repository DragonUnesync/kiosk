package T5;

/* renamed from: T5.g  reason: case insensitive filesystem */
public final class C0246g implements Runnable {
    final /* synthetic */ C0250i this$1;
    final /* synthetic */ boolean val$fireChannelInactive;
    final /* synthetic */ C0274u0 val$promise;

    public C0246g(C0250i iVar, boolean z, C0274u0 u0Var) {
        this.this$1 = iVar;
        this.val$fireChannelInactive = z;
        this.val$promise = u0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        if (r4.this$1.this$0.registered == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r4.this$1.this$0.registered != false) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        boolean unused = r4.this$1.this$0.registered = false;
        r4.this$1.this$0.pipeline.fireChannelUnregistered();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        r4.this$1.safeSetSuccess(r4.val$promise);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
            T5.i r1 = r4.this$1     // Catch:{ all -> 0x003b }
            T5.n r1 = r1.this$0     // Catch:{ all -> 0x003b }
            r1.doDeregister()     // Catch:{ all -> 0x003b }
            boolean r1 = r4.val$fireChannelInactive
            if (r1 == 0) goto L_0x0017
            T5.i r1 = r4.this$1
            T5.n r1 = r1.this$0
            T5.O0 r1 = r1.pipeline
            r1.fireChannelInactive()
        L_0x0017:
            T5.i r1 = r4.this$1
            T5.n r1 = r1.this$0
            boolean r1 = r1.registered
            if (r1 == 0) goto L_0x0033
        L_0x0021:
            T5.i r1 = r4.this$1
            T5.n r1 = r1.this$0
            boolean unused = r1.registered = r0
            T5.i r0 = r4.this$1
            T5.n r0 = r0.this$0
            T5.O0 r0 = r0.pipeline
            r0.fireChannelUnregistered()
        L_0x0033:
            T5.i r0 = r4.this$1
            T5.u0 r1 = r4.val$promise
            r0.safeSetSuccess(r1)
            goto L_0x005f
        L_0x003b:
            r1 = move-exception
            h6.c r2 = T5.C0260n.logger     // Catch:{ all -> 0x0060 }
            java.lang.String r3 = "Unexpected exception occurred while deregistering a channel."
            r2.warn((java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0060 }
            boolean r1 = r4.val$fireChannelInactive
            if (r1 == 0) goto L_0x0054
            T5.i r1 = r4.this$1
            T5.n r1 = r1.this$0
            T5.O0 r1 = r1.pipeline
            r1.fireChannelInactive()
        L_0x0054:
            T5.i r1 = r4.this$1
            T5.n r1 = r1.this$0
            boolean r1 = r1.registered
            if (r1 == 0) goto L_0x0033
            goto L_0x0021
        L_0x005f:
            return
        L_0x0060:
            r1 = move-exception
            boolean r2 = r4.val$fireChannelInactive
            if (r2 == 0) goto L_0x0070
            T5.i r2 = r4.this$1
            T5.n r2 = r2.this$0
            T5.O0 r2 = r2.pipeline
            r2.fireChannelInactive()
        L_0x0070:
            T5.i r2 = r4.this$1
            T5.n r2 = r2.this$0
            boolean r2 = r2.registered
            if (r2 == 0) goto L_0x008c
            T5.i r2 = r4.this$1
            T5.n r2 = r2.this$0
            boolean unused = r2.registered = r0
            T5.i r0 = r4.this$1
            T5.n r0 = r0.this$0
            T5.O0 r0 = r0.pipeline
            r0.fireChannelUnregistered()
        L_0x008c:
            T5.i r0 = r4.this$1
            T5.u0 r2 = r4.val$promise
            r0.safeSetSuccess(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T5.C0246g.run():void");
    }
}
