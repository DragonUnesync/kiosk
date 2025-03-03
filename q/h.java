package Q;

import D.C0062p;
import D.C0063q;
import D.C0064s;
import D.H0;
import D.r;
import Z1.c;
import android.hardware.camera2.CaptureResult;
import android.net.Uri;
import android.util.Log;
import androidx.fragment.app.C0450a;
import androidx.fragment.app.C0470v;
import androidx.fragment.app.L;
import d4.k;
import de.ozerov.fully.C0686e;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.P;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import n2.a;
import org.json.JSONObject;

public final class h implements C0064s {

    /* renamed from: X  reason: collision with root package name */
    public static volatile boolean f4003X;

    /* renamed from: U  reason: collision with root package name */
    public long f4004U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f4005V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f4006W;

    public h(FullyActivity fullyActivity) {
        this.f4004U = 0;
        this.f4005V = fullyActivity;
        this.f4006W = fullyActivity.f9961z0;
    }

    public static void f(h hVar, JSONObject jSONObject) {
        hVar.getClass();
        int R3 = a.R(jSONObject, "variant", 0);
        if (R3 == 0) {
            Uri.Builder buildUpon = Uri.parse(a.S(jSONObject, "orderLicenseUrl", "https://unknown.url")).buildUpon();
            FullyActivity fullyActivity = (FullyActivity) hVar.f4005V;
            String uri = buildUpon.appendQueryParameter("devid", P.i(fullyActivity)).build().toString();
            fullyActivity.C();
            C0470v C8 = fullyActivity.l().C("single_app_manager");
            if (C8 != null) {
                L l8 = fullyActivity.l();
                l8.getClass();
                C0450a aVar = new C0450a(l8);
                aVar.h(C8);
                aVar.e(true, true);
            }
            fullyActivity.f9917F0.n(uri, false);
            fullyActivity.f9921J0.d();
            fullyActivity.f9919H0.b();
        }
        if (R3 == 1) {
            Log.w("LicenseManager", "Google Play order fragment not found");
        }
    }

    public H0 a() {
        return (H0) this.f4006W;
    }

    public long b() {
        C0064s sVar = (C0064s) this.f4005V;
        if (sVar != null) {
            return sVar.b();
        }
        long j7 = this.f4004U;
        if (j7 != -1) {
            return j7;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    public C0062p c() {
        C0064s sVar = (C0064s) this.f4005V;
        if (sVar != null) {
            return sVar.c();
        }
        return C0062p.f922U;
    }

    public r d() {
        C0064s sVar = (C0064s) this.f4005V;
        if (sVar != null) {
            return sVar.d();
        }
        return r.f943U;
    }

    public /* synthetic */ CaptureResult e() {
        return null;
    }

    public void g() {
        if (a.l1(P.i((FullyActivity) this.f4005V), ((c) ((k) this.f4006W).f9767W).r("licenseSignature", ""))) {
            j(true);
        } else {
            j(false);
        }
    }

    public C0063q h() {
        C0064s sVar = (C0064s) this.f4005V;
        if (sVar != null) {
            return sVar.h();
        }
        return C0063q.f932U;
    }

    public void i(boolean z, boolean z6) {
        String readLine;
        g();
        if (!z && !((FullyActivity) this.f4005V).f9926O0.i() && !z6) {
            return;
        }
        if (z || this.f4004U == 0 || System.currentTimeMillis() - this.f4004U >= 3600000) {
            this.f4004U = System.currentTimeMillis();
            String i = P.i((FullyActivity) this.f4005V);
            if (!P.C()) {
                Log.e("LicenseManager", "External storage is not readable for offline license check");
            } else {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(a.c0((FullyActivity) this.f4005V, (String) null), "fully-license-bunch.txt")));
                    while (true) {
                        readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split(":");
                        if (split.length == 3) {
                            if (split[0].equals(i)) {
                                String trim = split[1].trim();
                                String trim2 = split[2].trim();
                                if (a.l1(i, trim)) {
                                    if (a.l1(i + "-" + "offline", trim2)) {
                                        ((k) this.f4006W).T2(i);
                                        ((k) this.f4006W).V2("licenseSignature", trim);
                                        if (!f4003X || z6) {
                                            a.a1(1, (FullyActivity) this.f4005V, "This device has a valid PLUS license. Thank you!");
                                        }
                                        j(true);
                                        return;
                                    }
                                }
                                Log.w("LicenseManager", "Offline license for device ID found but is bad, ignore");
                                a.a1(1, (FullyActivity) this.f4005V, "Offline license for this device found but it's bad");
                            }
                        }
                    }
                    if (readLine == null) {
                        a.a1(1, (FullyActivity) this.f4005V, "Offline license for this device not found");
                    }
                } catch (Exception e) {
                    Log.i("LicenseManager", "Couldn't read license file due to " + e.getMessage());
                }
            }
            Uri.Builder buildUpon = Uri.parse("https://licensing.fully-kiosk.com/api/check_license2.php").buildUpon();
            FullyActivity fullyActivity = (FullyActivity) this.f4005V;
            String uri = buildUpon.appendQueryParameter("devid", P.i(fullyActivity)).appendQueryParameter("appid", "56").appendQueryParameter("package", fullyActivity.getPackageName()).appendQueryParameter("play", String.valueOf(0)).appendQueryParameter("offer", String.valueOf(z6 ? 1 : 0)).appendQueryParameter("version", String.valueOf(101362)).build().toString();
            if (z6) {
                new C0686e(5, this).execute(new String[]{uri});
            } else {
                new C0686e(5, this).execute(new String[]{uri});
            }
        }
    }

    public void j(boolean z) {
        f4003X = z;
        ((FullyActivity) this.f4005V).f9926O0.n();
        ((FullyActivity) this.f4005V).f9960y1.e(false, false);
    }

    public h(C0064s sVar, H0 h02, long j7) {
        this.f4005V = sVar;
        this.f4006W = h02;
        this.f4004U = j7;
    }
}
