package Y6;

import B3.q;
import H3.P;
import P6.f;
import Q7.g;
import U0.c;
import Z6.b;
import g7.n;
import i7.C1110a;
import java.net.ProxySelector;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import k7.C1165c;

public final class r implements Cloneable {

    /* renamed from: t0  reason: collision with root package name */
    public static final List f6694t0 = b.k(s.HTTP_2, s.HTTP_1_1);

    /* renamed from: u0  reason: collision with root package name */
    public static final List f6695u0 = b.k(h.e, h.f6637f);

    /* renamed from: U  reason: collision with root package name */
    public final q f6696U;

    /* renamed from: V  reason: collision with root package name */
    public final P f6697V;

    /* renamed from: W  reason: collision with root package name */
    public final List f6698W;

    /* renamed from: X  reason: collision with root package name */
    public final List f6699X;

    /* renamed from: Y  reason: collision with root package name */
    public final c f6700Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f6701Z;

    /* renamed from: a0  reason: collision with root package name */
    public final b f6702a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f6703b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f6704c0;

    /* renamed from: d0  reason: collision with root package name */
    public final j f6705d0;

    /* renamed from: e0  reason: collision with root package name */
    public final b f6706e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ProxySelector f6707f0;

    /* renamed from: g0  reason: collision with root package name */
    public final b f6708g0;

    /* renamed from: h0  reason: collision with root package name */
    public final SocketFactory f6709h0;

    /* renamed from: i0  reason: collision with root package name */
    public final SSLSocketFactory f6710i0;

    /* renamed from: j0  reason: collision with root package name */
    public final X509TrustManager f6711j0;

    /* renamed from: k0  reason: collision with root package name */
    public final List f6712k0;

    /* renamed from: l0  reason: collision with root package name */
    public final List f6713l0;

    /* renamed from: m0  reason: collision with root package name */
    public final C1165c f6714m0;

    /* renamed from: n0  reason: collision with root package name */
    public final e f6715n0;

    /* renamed from: o0  reason: collision with root package name */
    public final g f6716o0;
    public final int p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int f6717q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f6718r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Z1.c f6719s0;

    public r(q qVar) {
        this.f6696U = qVar.f6676a;
        this.f6697V = qVar.f6677b;
        this.f6698W = b.v(qVar.f6678c);
        this.f6699X = b.v(qVar.f6679d);
        this.f6700Y = qVar.e;
        this.f6701Z = qVar.f6680f;
        this.f6702a0 = qVar.f6681g;
        this.f6703b0 = qVar.f6682h;
        this.f6704c0 = qVar.i;
        this.f6705d0 = qVar.f6683j;
        this.f6706e0 = qVar.f6684k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f6707f0 = proxySelector == null ? C1110a.f12762a : proxySelector;
        this.f6708g0 = qVar.f6685l;
        this.f6709h0 = qVar.f6686m;
        List list = qVar.f6687n;
        this.f6712k0 = list;
        this.f6713l0 = qVar.f6688o;
        this.f6714m0 = qVar.f6689p;
        this.p0 = qVar.f6691r;
        this.f6717q0 = qVar.f6692s;
        this.f6718r0 = qVar.f6693t;
        this.f6719s0 = new Z1.c(7);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((h) it.next()).f6638a) {
                    n nVar = n.f12045a;
                    X509TrustManager m8 = n.f12045a.m();
                    this.f6711j0 = m8;
                    this.f6710i0 = n.f12045a.l(m8);
                    g b8 = n.f12045a.b(m8);
                    this.f6716o0 = b8;
                    e eVar = qVar.f6690q;
                    this.f6715n0 = !f.a(eVar.f6618b, b8) ? new e(eVar.f6617a, b8) : eVar;
                }
            }
        }
        this.f6710i0 = null;
        this.f6716o0 = null;
        this.f6711j0 = null;
        this.f6715n0 = e.f6616c;
        List list2 = this.f6698W;
        f.c(list2, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list2.contains((Object) null)) {
            List list3 = this.f6699X;
            f.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
            if (!list3.contains((Object) null)) {
                List<h> list4 = this.f6712k0;
                boolean z = list4 instanceof Collection;
                X509TrustManager x509TrustManager = this.f6711j0;
                g gVar = this.f6716o0;
                SSLSocketFactory sSLSocketFactory = this.f6710i0;
                if (!z || !list4.isEmpty()) {
                    for (h hVar : list4) {
                        if (hVar.f6638a) {
                            if (sSLSocketFactory == null) {
                                throw new IllegalStateException("sslSocketFactory == null");
                            } else if (gVar == null) {
                                throw new IllegalStateException("certificateChainCleaner == null");
                            } else if (x509TrustManager == null) {
                                throw new IllegalStateException("x509TrustManager == null");
                            } else {
                                return;
                            }
                        }
                    }
                }
                if (sSLSocketFactory != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (gVar != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (x509TrustManager != null) {
                    throw new IllegalStateException("Check failed.");
                } else if (!f.a(this.f6715n0, e.f6616c)) {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException(("Null network interceptor: " + list3).toString());
            }
        } else {
            throw new IllegalStateException(("Null interceptor: " + list2).toString());
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
