package androidx.fragment.app;

import android.content.Intent;
import android.content.res.Configuration;
import h.C1022j;
import u0.C1486a;

/* renamed from: androidx.fragment.app.w  reason: case insensitive filesystem */
public final /* synthetic */ class C0471w implements C1486a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8090a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1022j f8091b;

    public /* synthetic */ C0471w(C1022j jVar, int i) {
        this.f8090a = i;
        this.f8091b = jVar;
    }

    public final void accept(Object obj) {
        switch (this.f8090a) {
            case 0:
                Configuration configuration = (Configuration) obj;
                this.f8091b.f12212m0.s();
                return;
            default:
                Intent intent = (Intent) obj;
                this.f8091b.f12212m0.s();
                return;
        }
    }
}
