package Y2;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.Toast;
import n2.a;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ Context f6577U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ String f6578V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f6579W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ int f6580X;

    public /* synthetic */ e(Context context, String str, int i, int i8) {
        this.f6577U = context;
        this.f6578V = str;
        this.f6579W = i;
        this.f6580X = i8;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [Y2.c, android.content.ContextWrapper] */
    public final void run() {
        Context context = this.f6577U;
        String str = this.f6578V;
        int i = this.f6579W;
        try {
            Context applicationContext = context.getApplicationContext();
            int i8 = d.f6575b;
            Toast makeText = Toast.makeText(applicationContext, str, i);
            d.a(makeText.getView(), new ContextWrapper(applicationContext));
            d dVar = new d(applicationContext, makeText);
            Toast toast = dVar.f6576a;
            if (!a.q0() || context.getApplicationContext().getApplicationInfo().targetSdkVersion < 30) {
                int i9 = this.f6580X;
                if (i9 == 17) {
                    dVar.setGravity(i9, 0, 0);
                } else {
                    dVar.setGravity(i9, toast.getXOffset(), toast.getYOffset());
                }
            }
            dVar.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
