package P5;

import C0.e;
import Q0.g;
import java.io.File;
import java.util.ArrayList;

/* renamed from: P5.j  reason: case insensitive filesystem */
public final class C0147j extends C0148k {

    /* renamed from: w  reason: collision with root package name */
    public File f3909w;

    /* renamed from: x  reason: collision with root package name */
    public final e f3910x = new e(7, this);

    public C0147j() {
        super(3);
    }

    public final K a() {
        if (!this.f3891p || !this.f3888m.equals("exportSettingsJson")) {
            return null;
        }
        String str = (String) this.f3884h.get("dir");
        String str2 = (String) this.f3884h.get("filename");
        if (str2 == null || str2.isEmpty() || str == null) {
            this.f3895t.add("Missing parameters");
            return null;
        } else if (!str2.endsWith(".json")) {
            this.f3895t.add("Filename must end by .json");
            return null;
        } else {
            File file = new File(str, str2);
            this.f3909w = file;
            if (!file.getParentFile().canWrite()) {
                ArrayList arrayList = this.f3895t;
                arrayList.add("Can't write to " + this.f3909w.getAbsolutePath());
                return null;
            }
            try {
                synchronized (this.f3910x) {
                    this.f3879b.runOnUiThread(this.f3910x);
                    this.f3910x.wait();
                    ArrayList arrayList2 = this.f3894s;
                    arrayList2.add("Settings successfully saved to " + this.f3909w.getAbsolutePath());
                }
                return null;
            } catch (Exception e) {
                g.x(e, new StringBuilder("Failed to save settings file due to "), this.f3878a);
                this.f3895t.add("Failed exporting settings");
                return null;
            }
        }
    }
}
