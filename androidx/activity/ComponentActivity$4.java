package androidx.activity;

import androidx.lifecycle.C0485l;
import androidx.lifecycle.C0489p;
import androidx.lifecycle.O;
import androidx.lifecycle.r;
import h.C1022j;

class ComponentActivity$4 implements C0489p {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C1022j f7261U;

    public ComponentActivity$4(C1022j jVar) {
        this.f7261U = jVar;
    }

    public final void c(r rVar, C0485l lVar) {
        C1022j jVar = this.f7261U;
        if (jVar.f7292Z == null) {
            i iVar = (i) jVar.getLastNonConfigurationInstance();
            if (iVar != null) {
                jVar.f7292Z = iVar.f7283a;
            }
            if (jVar.f7292Z == null) {
                jVar.f7292Z = new O();
            }
        }
        jVar.f7290X.f(this);
    }
}
