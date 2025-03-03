package d3;

import android.os.AsyncTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public final class f extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ File f9728a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f9729b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f9730c;

    public f(g gVar, File file, Runnable runnable) {
        this.f9730c = gVar;
        this.f9728a = file;
        this.f9729b = runnable;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [b3.b, java.lang.Object] */
    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        ArrayList arrayList = new ArrayList();
        try {
            File[] listFiles = this.f9728a.listFiles(this.f9730c.f9741d0);
            int length = listFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Collections.sort(arrayList);
                    break;
                }
                File file = listFiles[i];
                if (file.canRead()) {
                    if (Thread.currentThread().isInterrupted()) {
                        break;
                    }
                    ? obj = new Object();
                    obj.f8659U = file.getName();
                    obj.f8661W = file.isDirectory();
                    obj.f8660V = file.getAbsolutePath();
                    obj.f8662X = file.lastModified();
                    arrayList.add(obj);
                }
                i++;
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            new ArrayList();
        }
        return arrayList;
    }

    public final void onPostExecute(Object obj) {
        g gVar = this.f9730c;
        gVar.f9740c0.addAll((ArrayList) obj);
        gVar.f9737Z.setVisibility(8);
        gVar.f9742e0.notifyDataSetChanged();
        Runnable runnable = this.f9729b;
        if (runnable != null) {
            runnable.run();
        }
        gVar.f9747j0 = null;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [b3.b, java.lang.Object] */
    public final void onPreExecute() {
        g gVar = this.f9730c;
        gVar.f9740c0.clear();
        File file = this.f9728a;
        if (!file.getAbsolutePath().equals(((File) gVar.f9738a0.f8656d).getAbsolutePath()) && file.getParentFile() != null) {
            ? obj = new Object();
            obj.f8659U = gVar.f9732U.getString(2131951786);
            obj.f8661W = true;
            obj.f8660V = file.getParentFile().getAbsolutePath();
            obj.f8662X = file.lastModified();
            gVar.f9740c0.add(obj);
        }
        gVar.f9742e0.notifyDataSetChanged();
        gVar.f9737Z.setVisibility(0);
    }
}
