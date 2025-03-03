package de.ozerov.fully;

import P5.E;
import android.os.AsyncTask;
import java.io.File;
import java.util.HashMap;

public final class V1 extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public long f10431a;

    /* renamed from: b  reason: collision with root package name */
    public String f10432b;

    /* renamed from: c  reason: collision with root package name */
    public File f10433c;

    /* renamed from: d  reason: collision with root package name */
    public V4 f10434d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public String f10435f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ E f10436g;

    public V1(E e8) {
        this.f10436g = e8;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        if (!this.f10433c.exists()) {
            return null;
        }
        return C0808y2.a(this.f10432b, this.f10433c, 0, new j5(), this.e, this.f10435f);
    }

    public final void onPostExecute(Object obj) {
        C0802x2 x2Var = (C0802x2) obj;
        ((HashMap) this.f10436g.f3810W).remove(Long.valueOf(this.f10431a));
        V4 v4 = this.f10434d;
        if (v4 != null) {
            v4.i(x2Var);
        }
    }
}
