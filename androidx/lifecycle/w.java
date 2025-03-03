package androidx.lifecycle;

public abstract class w {

    /* renamed from: U  reason: collision with root package name */
    public final A f8163U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f8164V;

    /* renamed from: W  reason: collision with root package name */
    public int f8165W = -1;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ x f8166X;

    public w(x xVar, A a8) {
        this.f8166X = xVar;
        this.f8163U = a8;
    }

    public final void a(boolean z) {
        int i;
        boolean z6;
        boolean z8;
        if (z != this.f8164V) {
            this.f8164V = z;
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            x xVar = this.f8166X;
            int i8 = xVar.f8170c;
            xVar.f8170c = i + i8;
            if (!xVar.f8171d) {
                xVar.f8171d = true;
                while (true) {
                    try {
                        int i9 = xVar.f8170c;
                        if (i8 == i9) {
                            break;
                        }
                        if (i8 != 0 || i9 <= 0) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (i8 <= 0 || i9 != 0) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (z6) {
                            xVar.g();
                        } else if (z8) {
                            xVar.h();
                        }
                        i8 = i9;
                    } catch (Throwable th) {
                        xVar.f8171d = false;
                        throw th;
                    }
                }
                xVar.f8171d = false;
            }
            if (this.f8164V) {
                xVar.c(this);
            }
        }
    }

    public void b() {
    }

    public boolean d(r rVar) {
        return false;
    }

    public abstract boolean e();
}
