package de.ozerov.fully;

import B3.q;
import org.json.JSONObject;

public final /* synthetic */ class R1 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10314U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ q f10315V;

    public /* synthetic */ R1(q qVar, int i) {
        this.f10314U = i;
        this.f10315V = qVar;
    }

    public final void run() {
        switch (this.f10314U) {
            case 0:
                q qVar = this.f10315V;
                qVar.getClass();
                ((FullyActivity) qVar.f451W).runOnUiThread(new R1(qVar, 1));
                return;
            case 1:
                q qVar2 = this.f10315V;
                qVar2.b0("mqttConnected", (JSONObject) null);
                qVar2.a0();
                return;
            default:
                this.f10315V.a0();
                return;
        }
    }
}
