package G5;

import android.content.Intent;
import android.util.Log;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1692U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ i f1693V;

    public /* synthetic */ g(i iVar, int i) {
        this.f1692U = i;
        this.f1693V = iVar;
    }

    public final void run() {
        i iVar = this.f1693V;
        int i = this.f1692U;
        iVar.getClass();
        switch (i) {
            case 0:
                Log.d("i", "Finishing due to inactivity");
                iVar.f1697a.finish();
                return;
            default:
                Intent intent = new Intent("com.google.zxing.client.android.SCAN");
                intent.putExtra("TIMEOUT", true);
                iVar.f1697a.setResult(0, intent);
                iVar.a();
                return;
        }
    }
}
