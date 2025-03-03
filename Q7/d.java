package Q7;

import B.q0;
import T7.C0287b;
import T7.i1;
import java.net.CookieManager;
import java.util.ArrayList;

public final class d extends c {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f4201o = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f4202f = 30000;

    /* renamed from: g  reason: collision with root package name */
    public final int f4203g = 2097152;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f4204h = true;
    public final ArrayList i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public q0 f4205j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4206k = false;

    /* renamed from: l  reason: collision with root package name */
    public final String f4207l = b.f4195c;

    /* renamed from: m  reason: collision with root package name */
    public final CookieManager f4208m;

    /* renamed from: n  reason: collision with root package name */
    public volatile boolean f4209n = false;

    static {
        System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
    }

    public d() {
        this.f4198b = 1;
        a("Accept-Encoding", "gzip");
        a("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
        this.f4205j = new q0((i1) new C0287b());
        this.f4208m = new CookieManager();
    }
}
