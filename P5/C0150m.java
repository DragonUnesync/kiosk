package P5;

import C0.e;
import android.graphics.Bitmap;
import android.util.Log;
import de.ozerov.fully.C0794w0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: P5.m  reason: case insensitive filesystem */
public final class C0150m extends C0138a {

    /* renamed from: v  reason: collision with root package name */
    public final e f3913v = new e(8, this);

    public final K a() {
        boolean z;
        InputStream inputStream;
        if (!this.f3891p || !this.f3888m.equals("getScreenshot")) {
            return null;
        }
        if (this.f3884h.get("dl") == null || (!((String) this.f3884h.get("dl")).equals("1") && !((String) this.f3884h.get("dl")).equals("true"))) {
            z = false;
        } else {
            z = true;
        }
        try {
            synchronized (this.f3913v) {
                this.f3879b.runOnUiThread(this.f3913v);
                this.f3913v.wait();
            }
            Bitmap bitmap = C0794w0.f11026l;
            if (bitmap != null) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f3879b.getCacheDir(), "fully-single-app-screenshot.png"));
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                bitmap.recycle();
                fileOutputStream.close();
                inputStream = new FileInputStream(new File(this.f3879b.getCacheDir(), "fully-single-app-screenshot.png"));
            } else {
                inputStream = this.f3879b.getAssets().open("RemoteAdmin/fully-single-app-screenshot-not-available.png");
            }
            K g8 = P.g(J.OK, P.c("fully-single-app-screenshot.png"), inputStream);
            D d8 = this.i;
            if (d8 != null) {
                d8.c(g8);
            }
            if (z) {
                g8.k("content-disposition", "attachment; filename=\"fully-single-app-screenshot.png\"");
            } else {
                g8.k("content-disposition", "inline; filename=\"fully-single-app-screenshot.png\"");
            }
            return g8;
        } catch (Exception e) {
            e.printStackTrace();
            Log.e(this.f3878a, "Failed to make a screenshot");
            this.f3895t.add("Failed to make a screenshot");
            return null;
        }
    }
}
