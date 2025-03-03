package n1;

import M0.f0;
import M0.g0;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final j f13640a;

    public k(j jVar) {
        this.f13640a = jVar;
    }

    public final void a() {
        Exception exc;
        try {
            ((k) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(new Class[]{g0.class}).newInstance(new Object[]{this.f13640a})).a();
        } catch (Exception e) {
            int i = f0.f2942U;
            if (e instanceof f0) {
                exc = (f0) e;
            } else {
                exc = new Exception(e);
            }
            throw exc;
        }
    }
}
