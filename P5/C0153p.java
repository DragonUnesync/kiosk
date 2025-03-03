package P5;

import de.ozerov.fully.C0759q0;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.P;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: P5.p  reason: case insensitive filesystem */
public final class C0153p extends C0145h {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f3915w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0153p(int i) {
        super(5);
        this.f3915w = i;
    }

    public K a() {
        switch (this.f3915w) {
            case 0:
                if (this.f3891p) {
                    String str = "fully-single-app-log-" + P.i(this.f3879b) + "-" + a.H() + ".csv";
                    try {
                        ArrayList y8 = C0794w0.y(0, 32000, false);
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f3879b.getCacheDir(), str));
                        fileOutputStream.write(C0759q0.a().getBytes());
                        Iterator it = y8.iterator();
                        while (it.hasNext()) {
                            fileOutputStream.write(((C0759q0) it.next()).b().getBytes());
                        }
                        fileOutputStream.close();
                        K g8 = P.g(J.OK, P.c(str), new FileInputStream(new File(this.f3879b.getCacheDir(), str)));
                        D d8 = this.i;
                        if (d8 != null) {
                            d8.c(g8);
                        }
                        g8.k("content-disposition", "attachment; filename=\"" + str + "\"");
                        return g8;
                    } catch (Exception unused) {
                        this.f3895t.add("Failed to download " + str);
                    }
                }
                return null;
            default:
                return super.a();
        }
    }

    public String d() {
        int i;
        switch (this.f3915w) {
            case 1:
                if (!this.f3891p) {
                    return C0138a.e("Please login");
                }
                try {
                    i = Integer.parseInt((String) this.f3884h.get("max"));
                } catch (Exception unused) {
                    i = 50;
                }
                ArrayList y8 = C0794w0.y(0, i, false);
                JSONArray jSONArray = new JSONArray();
                Iterator it = y8.iterator();
                while (it.hasNext()) {
                    C0759q0 q0Var = (C0759q0) it.next();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("time", q0Var.f10892b);
                        jSONObject.put("type", q0Var.f10893c);
                        jSONObject.put("tag", q0Var.f10894d);
                        jSONObject.put("message", q0Var.e);
                        jSONObject.put("version", q0Var.f10895f);
                        jSONArray.put(jSONObject);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                try {
                    return jSONArray.toString(2).replace("\\/", "/");
                } catch (Exception unused2) {
                    return "";
                }
            default:
                return super.d();
        }
    }
}
