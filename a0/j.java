package a0;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public Object f7011a;

    /* renamed from: b  reason: collision with root package name */
    public m f7012b;

    /* renamed from: c  reason: collision with root package name */
    public n f7013c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7014d;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            r4.f7014d = r0
            a0.m r1 = r4.f7012b
            r2 = 0
            if (r1 == 0) goto L_0x001d
            a0.l r1 = r1.f7017V
            r1.getClass()
            if (r5 != 0) goto L_0x0011
            java.lang.Object r5 = a0.i.f7007a0
        L_0x0011:
            com.bumptech.glide.c r3 = a0.i.f7006Z
            boolean r5 = r3.e(r1, r2, r5)
            if (r5 == 0) goto L_0x001d
            a0.i.b(r1)
            goto L_0x001e
        L_0x001d:
            r0 = 0
        L_0x001e:
            if (r0 == 0) goto L_0x0026
            r4.f7011a = r2
            r4.f7012b = r2
            r4.f7013c = r2
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.j.a(java.lang.Object):boolean");
    }

    public final boolean b(Throwable th) {
        boolean z = true;
        this.f7014d = true;
        m mVar = this.f7012b;
        if (mVar == null || !mVar.f7017V.i(th)) {
            z = false;
        }
        if (z) {
            this.f7011a = null;
            this.f7012b = null;
            this.f7013c = null;
        }
        return z;
    }

    public final void finalize() {
        n nVar;
        m mVar = this.f7012b;
        if (mVar != null) {
            l lVar = mVar.f7017V;
            if (!lVar.isDone()) {
                lVar.i(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f7011a, 1));
            }
        }
        if (!this.f7014d && (nVar = this.f7013c) != null) {
            nVar.j((Object) null);
        }
    }
}
