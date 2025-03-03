package P5;

import android.util.Log;
import de.ozerov.fully.D1;
import de.ozerov.fully.P;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import n2.a;

/* renamed from: P5.l  reason: case insensitive filesystem */
public final class C0149l extends C0145h {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f3912w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0149l(int i) {
        super(3);
        this.f3912w = i;
    }

    public K a() {
        boolean z;
        switch (this.f3912w) {
            case 0:
                if (this.f3891p && this.f3888m.equals("getLogcat")) {
                    if (this.f3884h.get("dl") == null || (!((String) this.f3884h.get("dl")).equals("1") && !((String) this.f3884h.get("dl")).equals("true"))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    try {
                        String str = "fully-single-app-logcat-" + P.i(this.f3879b) + "-" + a.H() + ".txt";
                        K g8 = P.g(J.OK, P.c(str), new ByteArrayInputStream(n().getBytes(StandardCharsets.UTF_8)));
                        D d8 = this.i;
                        if (d8 != null) {
                            d8.c(g8);
                        }
                        if (z) {
                            g8.k("content-disposition", "attachment; filename=\"" + str + "\"");
                            return g8;
                        }
                        g8.k("content-disposition", "inline; filename=\"" + str + "\"");
                        return g8;
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.e(this.f3878a, "Failed to make logcat");
                        this.f3895t.add("Failed to make logcat");
                    }
                }
                return null;
            default:
                return super.a();
        }
    }

    public String d() {
        switch (this.f3912w) {
            case 1:
                if (!this.f3891p) {
                    return C0138a.e("Please login");
                }
                String a8 = D1.a(this.f3879b);
                return "{\"logcat\",\"" + a8.replace("\"", "\\\"") + "\"}";
            default:
                return super.d();
        }
    }
}
