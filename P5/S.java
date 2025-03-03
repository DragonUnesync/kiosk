package P5;

import Q0.g;
import android.content.Context;
import android.util.Log;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.C0802x2;
import de.ozerov.fully.C0808y2;
import java.io.File;
import n2.a;

public final class S extends Thread {

    /* renamed from: U  reason: collision with root package name */
    public final Context f3874U;

    /* renamed from: V  reason: collision with root package name */
    public final String f3875V;

    /* renamed from: W  reason: collision with root package name */
    public final File f3876W;

    /* renamed from: X  reason: collision with root package name */
    public final int f3877X;

    public S(Context context, String str, File file, int i) {
        this.f3874U = context;
        this.f3875V = str;
        this.f3876W = file;
        this.f3877X = i;
        setName("ThreadLoadZipFile");
    }

    public final void run() {
        try {
            Thread.sleep(((long) this.f3877X) * 1000);
        } catch (Exception unused) {
        }
        String str = this.f3875V;
        File file = this.f3876W;
        Context context = this.f3874U;
        C0802x2 b8 = C0808y2.b(context, file, str);
        if (b8.f11070b != 200 || (!b8.e.equals("application/zip") && !b8.f11071c.toLowerCase().endsWith(".zip"))) {
            StringBuilder s8 = g.s("File download failed for ", str, " as ");
            s8.append(b8.f11070b);
            s8.append(" ");
            s8.append(b8.f11074g);
            String sb = s8.toString();
            Log.e("ThreadLoadZipFile", sb);
            C0794w0.q0(2, "ThreadLoadZipFile", sb);
            a.a1(1, context, sb);
            return;
        }
        File file2 = new File(file, b8.f11071c);
        try {
            a.i1(file2, file);
            String str2 = "File download and unzip completed for " + str + " to " + file.getAbsolutePath();
            Log.i("ThreadLoadZipFile", str2);
            C0794w0.q0(0, "ThreadLoadZipFile", str2);
        } catch (Exception e) {
            String str3 = "File unzipping failed with message " + e.getMessage();
            Log.e("ThreadLoadZipFile", str3);
            C0794w0.q0(2, "ThreadLoadZipFile", str3);
            a.b1(context, str3);
        }
        file2.delete();
    }
}
