package com.bumptech.glide;

public abstract class g extends RuntimeException {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f8998U = 0;

    public /* synthetic */ g(String str) {
        super(str);
    }

    private final synchronized Throwable a() {
        return this;
    }

    public synchronized Throwable fillInStackTrace() {
        switch (this.f8998U) {
            case 1:
                a();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    public /* synthetic */ g(String str, Throwable th) {
        super(str, th);
    }

    public /* synthetic */ g(Throwable th) {
        super(th);
    }
}
