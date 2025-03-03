package de.ozerov.fully;

import D.O;
import S7.h;
import Z1.c;
import android.graphics.Bitmap;
import android.os.AsyncTask;

/* renamed from: de.ozerov.fully.h  reason: case insensitive filesystem */
public final class C0704h extends AsyncTask {
    public static final /* synthetic */ int e = 0;

    /* renamed from: a  reason: collision with root package name */
    public volatile F f10680a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10681b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f10682c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f10683d;

    public C0704h(c cVar, String str, String str2) {
        this.f10683d = cVar;
        this.f10681b = str;
        this.f10682c = str2;
    }

    public final Object doInBackground(Object[] objArr) {
        R2.c o2;
        Void[] voidArr = (Void[]) objArr;
        h o02 = C0794w0.o0(this.f10681b);
        if (o02 == null || (o2 = C0794w0.o((C0780t4) this.f10683d.f6955V, C0794w0.w(o02))) == null) {
            return null;
        }
        return (Bitmap) o2.f4337W;
    }

    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (this.f10680a != null && ((C0780t4) this.f10683d.f6955V).w()) {
            if (this.f10680a.isShowing()) {
                this.f10680a.dismiss();
                this.f10680a = null;
            }
            C0710i iVar = new C0710i();
            iVar.f9865o1 = "Link Title";
            iVar.f9868r1 = "Cancel";
            iVar.f9867q1 = "Ok";
            iVar.Q();
            iVar.f10699A1 = this.f10682c;
            iVar.f9863m1 = new U0.c(13);
            iVar.f9862l1 = new O(this, bitmap, this.f10681b, 6);
            iVar.T(((C0780t4) this.f10683d.f6955V).l(), "LinkNameDialog");
        }
    }

    public final void onPreExecute() {
        this.f10680a = new F((C0780t4) this.f10683d.f6955V, "Getting icon for URL...");
        this.f10680a.show();
        this.f10680a.setOnCancelListener(new G5.h(1, this));
    }
}
