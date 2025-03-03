package de.ozerov.fully;

import T2.e;
import T2.f;
import android.graphics.drawable.Drawable;

/* renamed from: de.ozerov.fully.l  reason: case insensitive filesystem */
public final /* synthetic */ class C0728l implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0734m f10781a;

    public /* synthetic */ C0728l(C0734m mVar) {
        this.f10781a = mVar;
    }

    public final void b(int i, int i8) {
        C0734m mVar = this.f10781a;
        C0740n nVar = (C0740n) mVar.f10793b;
        if (nVar.f10831o != null) {
            A0 Q02 = C0794w0.Q0(nVar.f10819a);
            C0812z0 J8 = ((C0812z0) ((C0812z0) Q02.l(Drawable.class)).G(nVar.f10831o)).J(new C0734m(0, mVar));
            J8.getClass();
            J8.C(new e(J8.f9014m0, i, i8), J8);
        }
    }
}
