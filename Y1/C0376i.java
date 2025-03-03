package Y1;

import android.view.View;

/* renamed from: Y1.i  reason: case insensitive filesystem */
public final /* synthetic */ class C0376i implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ C0377j f6436U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f6437V;

    public /* synthetic */ C0376i(C0377j jVar, int i) {
        this.f6436U = jVar;
        this.f6437V = i;
    }

    public final void onClick(View view) {
        C0377j jVar = this.f6436U;
        int i = jVar.f6440c;
        int i8 = this.f6437V;
        r rVar = jVar.f6441d;
        if (i8 != i) {
            rVar.setPlaybackSpeed(jVar.f6439b[i8]);
        }
        rVar.f6503h0.dismiss();
    }
}
