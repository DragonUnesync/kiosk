package de.ozerov.fully;

import android.os.AsyncTask;
import android.util.Log;
import n2.a;

public abstract class N4 extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0674c f10165a;

    public N4(C0674c cVar) {
        this.f10165a = cVar;
    }

    public void a(String str) {
        C0674c cVar = this.f10165a;
        if (cVar.f10573a.w() && str == null) {
            Log.w("VolumeLicenseManager", "Error communicating with license server");
            a.a1(1, cVar.f10573a, "Error communicating with license server");
        }
    }

    public final Object doInBackground(Object[] objArr) {
        return C0808y2.j(((String[]) objArr)[0]);
    }
}
