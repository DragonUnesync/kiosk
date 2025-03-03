package de.ozerov.fully;

/* renamed from: de.ozerov.fully.q1  reason: case insensitive filesystem */
public final class C0760q1 extends C0765r1 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C0678c3 f10896d;

    public C0760q1(C0678c3 c3Var) {
        this.f10896d = c3Var;
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return a();
    }

    public final void onPostExecute(Object obj) {
        super.b((Long) obj);
        C0678c3 c3Var = this.f10896d;
        if (c3Var != null) {
            c3Var.run();
        }
    }
}
