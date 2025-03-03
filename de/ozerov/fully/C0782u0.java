package de.ozerov.fully;

import B3.q;
import android.app.Activity;
import android.os.AsyncTask;
import java.io.File;
import java.net.CookieManager;

/* renamed from: de.ozerov.fully.u0  reason: case insensitive filesystem */
public final class C0782u0 extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10984a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2 f10985b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f10986c;

    public C0782u0(q qVar, int i, C2 c22) {
        this.f10986c = qVar;
        this.f10984a = i;
        this.f10985b = c22;
    }

    public final Object doInBackground(Object[] objArr) {
        String str = ((String[]) objArr)[0];
        q qVar = this.f10986c;
        C0802x2 a8 = C0808y2.a(str, ((Activity) qVar.f449U).getFilesDir(), 0, (CookieManager) null, false, (String) null);
        if (a8.f11070b != 200) {
            return "Settings file download failed with code " + a8.f11070b;
        } else if (!a8.f11071c.toLowerCase().endsWith(".json")) {
            return "JSON file must be in JSON format, now: " + a8.f11071c;
        } else {
            Activity activity = (Activity) qVar.f449U;
            File file = new File(activity.getFilesDir(), a8.f11071c);
            if (!file.exists()) {
                return "Ooops, downloaded file not found";
            }
            if (!qVar.O(new File(activity.getFilesDir(), a8.f11071c), 1)) {
                file.delete();
                return "Settings file check failed";
            } else if (!qVar.O(new File(activity.getFilesDir(), a8.f11071c), this.f10984a)) {
                file.delete();
                return "Settings import failed";
            } else {
                file.delete();
                return null;
            }
        }
    }

    public final void onPostExecute(Object obj) {
        this.f10985b.j((String) obj);
    }

    public final void onPreExecute() {
    }
}
