package F2;

import A4.d;
import B.C0003d;
import D6.h;
import H2.C0081b;
import H2.m;
import H2.q;
import H2.r;
import H2.w;
import J5.a;
import M0.I;
import P0.l;
import P0.y;
import P0.z;
import P6.f;
import R2.c;
import W2.g;
import a1.C0410a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import androidx.emoji2.text.i;
import c1.j;
import c1.k;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import u.C1455O;

public final class e implements r, i, j, g {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1520U;

    /* renamed from: V  reason: collision with root package name */
    public final Context f1521V;

    public /* synthetic */ e(Context context, int i, boolean z) {
        this.f1520U = i;
        this.f1521V = context;
    }

    public static boolean b(String str) {
        boolean z = false;
        for (String str2 : a.a()) {
            String x8 = N.e.x(str2, str);
            if (new File(str2, str).exists()) {
                N7.a.z(x8 + " binary detected!");
                z = true;
            }
        }
        return z;
    }

    public void a(C0003d dVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new y("EmojiCompatInitializer", 1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new d(this, dVar, threadPoolExecutor, 9));
    }

    public File[] c() {
        File dir = this.f1521V.getDir("ACRA-approved", 0);
        f.d(dir, "getDir(...)");
        Object[] listFiles = dir.listFiles();
        if (listFiles != null) {
            C7.e eVar = new C7.e(6);
            if (listFiles.length != 0) {
                listFiles = Arrays.copyOf(listFiles, listFiles.length);
                f.d(listFiles, "copyOf(...)");
                if (listFiles.length > 1) {
                    Arrays.sort(listFiles, eVar);
                }
            }
            File[] fileArr = (File[]) h.A(listFiles).toArray(new File[0]);
            if (fileArr != null) {
                return fileArr;
            }
        }
        return new File[0];
    }

    public boolean d(ArrayList arrayList) {
        PackageManager packageManager = this.f1521V.getPackageManager();
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                packageManager.getPackageInfo(str, 0);
                N7.a.d(str + " ROOT management app detected!");
                z = true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return z;
    }

    public Object get() {
        return (ConnectivityManager) this.f1521V.getSystemService("connectivity");
    }

    public q m0(w wVar) {
        switch (this.f1520U) {
            case 1:
                return new C0081b(this.f1521V, this);
            case 2:
                return new C0081b(this.f1521V, this);
            case 3:
                return new C0081b(this.f1521V, this);
            case 4:
                return new m(this.f1521V, 0);
            case 5:
                return new C0081b(this.f1521V, wVar.b(Integer.class, AssetFileDescriptor.class));
            case 6:
                return new C0081b(this.f1521V, wVar.b(Integer.class, InputStream.class));
            case 7:
                return new m(this.f1521V, 1);
            default:
                return new m(this.f1521V, 2);
        }
    }

    public k t(C1455O o2) {
        Context context;
        int i = z.f3748a;
        if (i < 23 || (i < 31 && ((context = this.f1521V) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            return new C0410a(9).t(o2);
        }
        int i8 = I.i(((M0.r) o2.f15531c).f3036n);
        l.s("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + z.F(i8));
        return new c(i8).t(o2);
    }

    public e(Context context, int i) {
        this.f1520U = i;
        switch (i) {
            case 13:
                f.e(context, "context");
                this.f1521V = context;
                return;
            default:
                this.f1521V = context.getApplicationContext();
                return;
        }
    }
}
