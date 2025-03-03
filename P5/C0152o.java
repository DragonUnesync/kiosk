package P5;

import java.util.ArrayList;

/* renamed from: P5.o  reason: case insensitive filesystem */
public final class C0152o extends C0145h {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f3914w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0152o(int i) {
        super(2);
        this.f3914w = i;
    }

    public K a() {
        switch (this.f3914w) {
            case 1:
                if (!this.f3891p || !this.f3888m.equals("setBooleanSetting") || this.f3884h.get("key") == null || this.f3884h.get("value") == null) {
                    return null;
                }
                try {
                    String d8 = this.f3879b.f9932U0.d((String) this.f3884h.get("key"));
                    if (d8 == null) {
                        d8 = (String) this.f3884h.get("key");
                    }
                    boolean equals = ((String) this.f3884h.get("key")).equals("remoteAdminScreenshot");
                    ArrayList arrayList = this.f3895t;
                    if (!equals) {
                        if (!((String) this.f3884h.get("key")).equals("remoteAdminCamshot")) {
                            if (!((String) this.f3884h.get("key")).equals("remoteAdminFileManagement")) {
                                if (this.f3879b.f9932U0.m((String) this.f3884h.get("key"), Boolean.valueOf(((String) this.f3884h.get("value")).equalsIgnoreCase("true")))) {
                                    this.f3879b.runOnUiThread(new C0143f(16, this));
                                    ArrayList arrayList2 = this.f3894s;
                                    arrayList2.add("Saved and applied " + d8);
                                    return null;
                                }
                                arrayList.add("Wrong/protected value dismissed " + d8);
                                return null;
                            }
                        }
                    }
                    arrayList.add("Wrong/protected value dismissed " + d8);
                    return null;
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            case 2:
                if (!this.f3891p || !this.f3888m.equals("setStringSetting") || this.f3884h.get("key") == null || this.f3884h.get("value") == null) {
                    return null;
                }
                try {
                    String d9 = this.f3879b.f9932U0.d((String) this.f3884h.get("key"));
                    if (d9 == null) {
                        d9 = (String) this.f3884h.get("key");
                    }
                    if (this.f3879b.f9932U0.n((String) this.f3884h.get("key"), (String) this.f3884h.get("value"))) {
                        if (((String) this.f3884h.get("key")).equals("startURL")) {
                            this.f3879b.runOnUiThread(new z(this, 0));
                        } else {
                            this.f3879b.runOnUiThread(new z(this, 1));
                        }
                        ArrayList arrayList3 = this.f3894s;
                        arrayList3.add("Saved and applied " + d9);
                        return null;
                    }
                    ArrayList arrayList4 = this.f3895t;
                    arrayList4.add("Wrong/protected value dismissed " + d9);
                    return null;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return null;
                }
            default:
                return super.a();
        }
    }

    public String d() {
        switch (this.f3914w) {
            case 0:
                if (!this.f3891p) {
                    return C0138a.e("Please login");
                }
                try {
                    return this.f3879b.f9931T0.M().toString(2).replace("\\/", "/");
                } catch (Exception e) {
                    e.printStackTrace();
                    return "";
                }
            default:
                return super.d();
        }
    }
}
