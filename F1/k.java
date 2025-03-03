package f1;

import D2.o;
import H3.C0103u;
import H3.n0;
import P0.l;
import P0.q;
import P0.z;
import T7.C;
import Z1.c;
import android.net.Uri;
import android.util.SparseArray;
import de.ozerov.fully.K2;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import javax.net.SocketFactory;

public final class k implements Closeable {

    /* renamed from: U  reason: collision with root package name */
    public final c f11554U;

    /* renamed from: V  reason: collision with root package name */
    public final c f11555V;

    /* renamed from: W  reason: collision with root package name */
    public final String f11556W;

    /* renamed from: X  reason: collision with root package name */
    public final SocketFactory f11557X;

    /* renamed from: Y  reason: collision with root package name */
    public final ArrayDeque f11558Y = new ArrayDeque();

    /* renamed from: Z  reason: collision with root package name */
    public final SparseArray f11559Z = new SparseArray();

    /* renamed from: a0  reason: collision with root package name */
    public final o f11560a0 = new o(11, (Object) this);

    /* renamed from: b0  reason: collision with root package name */
    public Uri f11561b0;

    /* renamed from: c0  reason: collision with root package name */
    public w f11562c0;

    /* renamed from: d0  reason: collision with root package name */
    public C f11563d0;

    /* renamed from: e0  reason: collision with root package name */
    public String f11564e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f11565f0;

    /* renamed from: g0  reason: collision with root package name */
    public C0897j f11566g0;

    /* renamed from: h0  reason: collision with root package name */
    public q f11567h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f11568i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f11569j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f11570k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f11571l0;

    /* renamed from: m0  reason: collision with root package name */
    public long f11572m0;

    public k(c cVar, c cVar2, String str, Uri uri, SocketFactory socketFactory) {
        this.f11554U = cVar;
        this.f11555V = cVar2;
        this.f11556W = str;
        this.f11557X = socketFactory;
        this.f11561b0 = x.f(uri);
        this.f11562c0 = new w(new K2(this));
        this.f11565f0 = 60000;
        this.f11563d0 = x.d(uri);
        this.f11572m0 = -9223372036854775807L;
        this.f11568i0 = -1;
    }

    public static void m(k kVar, B2.c cVar) {
        kVar.getClass();
        if (kVar.f11569j0) {
            kVar.f11555V.t(cVar);
            return;
        }
        String message = cVar.getMessage();
        if (message == null) {
            message = "";
        }
        kVar.f11554U.u(message, cVar);
    }

    public final void close() {
        C0897j jVar = this.f11566g0;
        if (jVar != null) {
            jVar.close();
            this.f11566g0 = null;
            Uri uri = this.f11561b0;
            String str = this.f11564e0;
            str.getClass();
            o oVar = this.f11560a0;
            k kVar = (k) oVar.f1139X;
            int i = kVar.f11568i0;
            if (!(i == -1 || i == 0)) {
                kVar.f11568i0 = 0;
                oVar.q(oVar.j(12, str, n0.f2094a0, uri));
            }
        }
        this.f11562c0.close();
    }

    public final void o() {
        long j7;
        n nVar = (n) this.f11558Y.pollFirst();
        if (nVar == null) {
            p pVar = (p) this.f11555V.f6955V;
            long j8 = pVar.f11598h0;
            if (j8 != -9223372036854775807L) {
                j7 = z.c0(j8);
            } else {
                long j9 = pVar.f11599i0;
                if (j9 != -9223372036854775807L) {
                    j7 = z.c0(j9);
                } else {
                    j7 = 0;
                }
            }
            pVar.f11588X.r(j7);
            return;
        }
        Uri a8 = nVar.a();
        l.k(nVar.f11578c);
        String str = nVar.f11578c;
        String str2 = this.f11564e0;
        o oVar = this.f11560a0;
        ((k) oVar.f1139X).f11568i0 = 0;
        C0103u.d("Transport", str);
        oVar.q(oVar.j(10, str2, n0.b(1, new Object[]{"Transport", str}, (o) null), a8));
    }

    public final Socket p(Uri uri) {
        boolean z;
        int i;
        if (uri.getHost() != null) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        if (uri.getPort() > 0) {
            i = uri.getPort();
        } else {
            i = 554;
        }
        String host = uri.getHost();
        host.getClass();
        return this.f11557X.createSocket(host, i);
    }

    public final void q(long j7) {
        boolean z;
        if (this.f11568i0 == 2 && !this.f11571l0) {
            Uri uri = this.f11561b0;
            String str = this.f11564e0;
            str.getClass();
            o oVar = this.f11560a0;
            k kVar = (k) oVar.f1139X;
            if (kVar.f11568i0 == 2) {
                z = true;
            } else {
                z = false;
            }
            l.j(z);
            oVar.q(oVar.j(5, str, n0.f2094a0, uri));
            kVar.f11571l0 = true;
        }
        this.f11572m0 = j7;
    }

    public final void r(long j7) {
        boolean z;
        Uri uri = this.f11561b0;
        String str = this.f11564e0;
        str.getClass();
        o oVar = this.f11560a0;
        int i = ((k) oVar.f1139X).f11568i0;
        if (i == 1 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        z zVar = z.f11643c;
        Object[] objArr = {Double.valueOf(((double) j7) / 1000.0d)};
        int i8 = z.f3748a;
        oVar.q(oVar.j(6, str, n0.b(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, (o) null), uri));
    }
}
