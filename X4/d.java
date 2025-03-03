package x4;

import A4.b;
import T5.C0245f0;
import T5.Y;

public abstract class d extends C0245f0 {

    /* renamed from: U  reason: collision with root package name */
    public Y f16289U;

    public abstract void c(Y y8, b bVar);

    public void handlerAdded(Y y8) {
        this.f16289U = y8;
    }

    public boolean isSharable() {
        return false;
    }

    public final void userEventTriggered(Y y8, Object obj) {
        if ((obj instanceof b) && this.f16289U != null) {
            this.f16289U = null;
            c(y8, (b) obj);
        }
        y8.fireUserEventTriggered(obj);
    }
}
