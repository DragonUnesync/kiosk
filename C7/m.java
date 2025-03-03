package c7;

import C7.d;
import D2.j;
import D6.r;
import F.h;
import P5.E;
import P6.f;
import Y6.a;
import Y6.n;
import Y6.o;
import Y6.s;
import Y6.t;
import Y6.u;
import Z1.c;
import Z6.b;
import d7.C0659d;
import d7.C0660e;
import e7.C0866a;
import e7.C0867b;
import e7.C0868c;
import e7.C0869d;
import e7.C0870e;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import l7.q;
import l7.w;

public final class m implements C0659d {

    /* renamed from: a  reason: collision with root package name */
    public int f8959a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8960b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f8961c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f8962d;
    public final Object e;

    /* renamed from: f  reason: collision with root package name */
    public Object f8963f;

    /* renamed from: g  reason: collision with root package name */
    public Iterable f8964g;

    public m(a aVar, c cVar, h hVar) {
        List list;
        f.e(cVar, "routeDatabase");
        f.e(hVar, "call");
        this.f8960b = aVar;
        this.f8961c = cVar;
        this.f8962d = hVar;
        r rVar = r.f1269U;
        this.e = rVar;
        this.f8963f = rVar;
        this.f8964g = new ArrayList();
        o oVar = aVar.f6596h;
        f.e(oVar, "url");
        URI f8 = oVar.f();
        if (f8.getHost() == null) {
            list = b.k(Proxy.NO_PROXY);
        } else {
            List<Proxy> select = aVar.f6595g.select(f8);
            if (select == null || select.isEmpty()) {
                list = b.k(Proxy.NO_PROXY);
            } else {
                list = b.v(select);
            }
        }
        this.e = list;
        this.f8959a = 0;
    }

    public void a() {
        ((l7.o) this.e).flush();
    }

    public w b(u uVar) {
        if (!C0660e.a(uVar)) {
            return j(0);
        }
        String b8 = uVar.f6744Z.b("Transfer-Encoding");
        if (b8 == null) {
            b8 = null;
        }
        if ("chunked".equalsIgnoreCase(b8)) {
            o oVar = (o) uVar.f6739U.f732V;
            if (this.f8959a == 4) {
                this.f8959a = 5;
                return new C0868c(this, oVar);
            }
            throw new IllegalStateException(("state: " + this.f8959a).toString());
        }
        long j7 = b.j(uVar);
        if (j7 != -1) {
            return j(j7);
        }
        if (this.f8959a == 4) {
            this.f8959a = 5;
            ((j) this.f8961c).l();
            return new C0866a(this);
        }
        throw new IllegalStateException(("state: " + this.f8959a).toString());
    }

    public void c() {
        ((l7.o) this.e).flush();
    }

    public void cancel() {
        Socket socket = ((j) this.f8961c).f8940c;
        if (socket != null) {
            b.d(socket);
        }
    }

    public long d(u uVar) {
        if (!C0660e.a(uVar)) {
            return 0;
        }
        String b8 = uVar.f6744Z.b("Transfer-Encoding");
        if (b8 == null) {
            b8 = null;
        }
        if ("chunked".equalsIgnoreCase(b8)) {
            return -1;
        }
        return b.j(uVar);
    }

    public void e(d dVar) {
        Proxy.Type type = ((j) this.f8961c).f8939b.f6756b.type();
        f.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) dVar.f733W);
        sb.append(' ');
        o oVar = (o) dVar.f732V;
        if (oVar.i || type != Proxy.Type.HTTP) {
            String b8 = oVar.b();
            String d8 = oVar.d();
            if (d8 != null) {
                b8 = b8 + '?' + d8;
            }
            sb.append(b8);
        } else {
            sb.append(oVar);
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        l((Y6.m) dVar.f734X, sb2);
    }

    public t f(boolean z) {
        E e8 = (E) this.f8963f;
        int i = this.f8959a;
        if (i == 1 || i == 2 || i == 3) {
            n nVar = null;
            try {
                String s8 = ((q) e8.f3810W).s(e8.f3809V);
                e8.f3809V -= (long) s8.length();
                D2.o I8 = D7.b.I(s8);
                int i8 = I8.f1137V;
                t tVar = new t();
                tVar.f6729b = (s) I8.f1138W;
                tVar.f6730c = i8;
                tVar.f6731d = (String) I8.f1139X;
                tVar.f6732f = e8.H().d();
                if (z && i8 == 100) {
                    return null;
                }
                if (i8 == 100) {
                    this.f8959a = 3;
                } else if (102 > i8 || i8 >= 200) {
                    this.f8959a = 4;
                } else {
                    this.f8959a = 3;
                }
                return tVar;
            } catch (EOFException e9) {
                o oVar = ((j) this.f8961c).f8939b.f6755a.f6596h;
                oVar.getClass();
                try {
                    n nVar2 = new n();
                    nVar2.c(oVar, "/...");
                    nVar = nVar2;
                } catch (IllegalArgumentException unused) {
                }
                f.b(nVar);
                nVar.f6662b = Y6.b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
                nVar.f6663c = Y6.b.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
                throw new IOException("unexpected end of stream on ".concat(nVar.a().f6675h), e9);
            }
        } else {
            throw new IllegalStateException(("state: " + this.f8959a).toString());
        }
    }

    public l7.u g(d dVar, long j7) {
        if ("chunked".equalsIgnoreCase(((Y6.m) dVar.f734X).b("Transfer-Encoding"))) {
            if (this.f8959a == 1) {
                this.f8959a = 2;
                return new C0867b(this);
            }
            throw new IllegalStateException(("state: " + this.f8959a).toString());
        } else if (j7 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f8959a == 1) {
            this.f8959a = 2;
            return new C0870e(this);
        } else {
            throw new IllegalStateException(("state: " + this.f8959a).toString());
        }
    }

    public j h() {
        return (j) this.f8961c;
    }

    public boolean i() {
        if (this.f8959a >= ((List) this.e).size() && ((ArrayList) this.f8964g).isEmpty()) {
            return false;
        }
        return true;
    }

    public C0869d j(long j7) {
        if (this.f8959a == 4) {
            this.f8959a = 5;
            return new C0869d(this, j7);
        }
        throw new IllegalStateException(("state: " + this.f8959a).toString());
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [D2.j, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.util.List, java.lang.Object] */
    public j k() {
        boolean z;
        String str;
        int i;
        boolean contains;
        List<InetAddress> list;
        if (i()) {
            ArrayList arrayList = new ArrayList();
            while (this.f8959a < ((List) this.e).size()) {
                if (this.f8959a < ((List) this.e).size()) {
                    z = true;
                } else {
                    z = false;
                }
                a aVar = (a) this.f8960b;
                if (z) {
                    int i8 = this.f8959a;
                    this.f8959a = i8 + 1;
                    Proxy proxy = (Proxy) ((List) this.e).get(i8);
                    ArrayList arrayList2 = new ArrayList();
                    this.f8963f = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        o oVar = aVar.f6596h;
                        str = oVar.f6672d;
                        i = oVar.e;
                    } else {
                        SocketAddress address = proxy.address();
                        if (address instanceof InetSocketAddress) {
                            f.d(address, "proxyAddress");
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                            f.e(inetSocketAddress, "<this>");
                            InetAddress address2 = inetSocketAddress.getAddress();
                            if (address2 == null) {
                                str = inetSocketAddress.getHostName();
                                f.d(str, "hostName");
                            } else {
                                str = address2.getHostAddress();
                                f.d(str, "address.hostAddress");
                            }
                            i = inetSocketAddress.getPort();
                        } else {
                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                        }
                    }
                    if (1 <= i && i < 65536) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            arrayList2.add(InetSocketAddress.createUnresolved(str, i));
                        } else {
                            byte[] bArr = b.f6982a;
                            f.e(str, "<this>");
                            P6.j jVar = b.e;
                            jVar.getClass();
                            if (((Pattern) jVar.f3955V).matcher(str).matches()) {
                                list = h.w(InetAddress.getByName(str));
                            } else {
                                f.e((h) this.f8962d, "call");
                                aVar.f6590a.getClass();
                                try {
                                    InetAddress[] allByName = InetAddress.getAllByName(str);
                                    f.d(allByName, "getAllByName(hostname)");
                                    List H8 = D6.h.H(allByName);
                                    if (!H8.isEmpty()) {
                                        list = H8;
                                    } else {
                                        throw new UnknownHostException(aVar.f6590a + " returned no addresses for " + str);
                                    }
                                } catch (NullPointerException e8) {
                                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                                    unknownHostException.initCause(e8);
                                    throw unknownHostException;
                                }
                            }
                            for (InetAddress inetSocketAddress2 : list) {
                                arrayList2.add(new InetSocketAddress(inetSocketAddress2, i));
                            }
                        }
                        for (InetSocketAddress wVar : this.f8963f) {
                            Y6.w wVar2 = new Y6.w((a) this.f8960b, proxy, wVar);
                            c cVar = (c) this.f8961c;
                            synchronized (cVar) {
                                contains = ((LinkedHashSet) cVar.f6955V).contains(wVar2);
                            }
                            if (contains) {
                                ((ArrayList) this.f8964g).add(wVar2);
                            } else {
                                arrayList.add(wVar2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            break;
                        }
                    } else {
                        throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
                    }
                } else {
                    throw new SocketException("No route to " + aVar.f6596h.f6672d + "; exhausted proxy configurations: " + ((List) this.e));
                }
            }
            if (arrayList.isEmpty()) {
                D6.o.N(arrayList, (ArrayList) this.f8964g);
                ((ArrayList) this.f8964g).clear();
            }
            ? obj = new Object();
            obj.f1094V = arrayList;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public void l(Y6.m mVar, String str) {
        f.e(str, "requestLine");
        if (this.f8959a == 0) {
            l7.o oVar = (l7.o) this.e;
            oVar.i(str);
            oVar.i("\r\n");
            int size = mVar.size();
            for (int i = 0; i < size; i++) {
                oVar.i(mVar.c(i));
                oVar.i(": ");
                oVar.i(mVar.f(i));
                oVar.i("\r\n");
            }
            oVar.i("\r\n");
            this.f8959a = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.f8959a).toString());
    }

    public m(Y6.r rVar, j jVar, q qVar, l7.o oVar) {
        f.e(jVar, "connection");
        f.e(qVar, "source");
        f.e(oVar, "sink");
        this.f8960b = rVar;
        this.f8961c = jVar;
        this.f8962d = qVar;
        this.e = oVar;
        this.f8963f = new E(qVar);
    }
}
