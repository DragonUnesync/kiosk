package r7;

import P6.e;
import P6.f;
import P6.h;
import P6.k;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import org.acra.sender.HttpSender$Method;

public final class j {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ h[] f15026r;

    /* renamed from: a  reason: collision with root package name */
    public int f15027a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final i f15028b = new i(this, 6);

    /* renamed from: c  reason: collision with root package name */
    public String f15029c;

    /* renamed from: d  reason: collision with root package name */
    public final i f15030d = new i(this, 7);
    public final i e = new i(this, 8);

    /* renamed from: f  reason: collision with root package name */
    public final i f15031f = new i(this, 9);

    /* renamed from: g  reason: collision with root package name */
    public final i f15032g = new i(this, 10);

    /* renamed from: h  reason: collision with root package name */
    public final i f15033h = new i(this, 11);
    public final i i = new i(this, 12);

    /* renamed from: j  reason: collision with root package name */
    public final i f15034j = new i(this, 13);

    /* renamed from: k  reason: collision with root package name */
    public final i f15035k = new i(this, 14);

    /* renamed from: l  reason: collision with root package name */
    public final i f15036l = new i(this, 0);

    /* renamed from: m  reason: collision with root package name */
    public final i f15037m = new i(this, 1);

    /* renamed from: n  reason: collision with root package name */
    public final i f15038n = new i(this, 2);

    /* renamed from: o  reason: collision with root package name */
    public final i f15039o = new i(this, 3);

    /* renamed from: p  reason: collision with root package name */
    public final i f15040p = new i(this, 4);

    /* renamed from: q  reason: collision with root package name */
    public final i f15041q = new i(this, 5);

    static {
        Class<j> cls = j.class;
        h hVar = new h("enabled", cls, "getEnabled()Ljava/lang/Boolean;");
        k.f3956a.getClass();
        f15026r = new h[]{hVar, new h("basicAuthLogin", cls, "getBasicAuthLogin()Ljava/lang/String;"), new h("basicAuthPassword", cls, "getBasicAuthPassword()Ljava/lang/String;"), new h("httpMethod", cls, "getHttpMethod()Lorg/acra/sender/HttpSender$Method;"), new h("connectionTimeout", cls, "getConnectionTimeout()Ljava/lang/Integer;"), new h("socketTimeout", cls, "getSocketTimeout()Ljava/lang/Integer;"), new h("dropReportsOnTimeout", cls, "getDropReportsOnTimeout()Ljava/lang/Boolean;"), new h("keyStoreFactoryClass", cls, "getKeyStoreFactoryClass()Ljava/lang/Class;"), new h("certificatePath", cls, "getCertificatePath()Ljava/lang/String;"), new h("resCertificate", cls, "getResCertificate()Ljava/lang/Integer;"), new h("certificateType", cls, "getCertificateType()Ljava/lang/String;"), new h("compress", cls, "getCompress()Ljava/lang/Boolean;"), new h("chunked", cls, "getChunked()Ljava/lang/Boolean;"), new h("tlsProtocols", cls, "getTlsProtocols()Ljava/util/List;"), new h("httpHeaders", cls, "getHttpHeaders()Ljava/util/Map;")};
    }

    public final C1399h a() {
        boolean z;
        int i8;
        int i9;
        boolean z6;
        boolean z8;
        boolean z9;
        if (this.f15029c != null) {
            Class cls = Boolean.TYPE;
            Class<String> cls2 = String.class;
            Class cls3 = Integer.TYPE;
            Constructor<C1399h> constructor = C1399h.class.getConstructor(new Class[]{cls, cls2, cls2, cls2, HttpSender$Method.class, cls3, cls3, cls, Class.class, cls2, Integer.class, cls2, cls, cls, List.class, Map.class, cls3, e.class});
            i iVar = this.f15028b;
            h[] hVarArr = f15026r;
            Boolean bool = (Boolean) iVar.c(hVarArr[0]);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            String str = this.f15029c;
            String str2 = (String) this.f15030d.c(hVarArr[1]);
            String str3 = (String) this.e.c(hVarArr[2]);
            HttpSender$Method httpSender$Method = (HttpSender$Method) this.f15031f.c(hVarArr[3]);
            Integer num = (Integer) this.f15032g.c(hVarArr[4]);
            if (num != null) {
                i8 = num.intValue();
            } else {
                i8 = 0;
            }
            Integer valueOf2 = Integer.valueOf(i8);
            Integer num2 = (Integer) this.f15033h.c(hVarArr[5]);
            if (num2 != null) {
                i9 = num2.intValue();
            } else {
                i9 = 0;
            }
            Integer valueOf3 = Integer.valueOf(i9);
            Boolean bool2 = (Boolean) this.i.c(hVarArr[6]);
            if (bool2 != null) {
                z6 = bool2.booleanValue();
            } else {
                z6 = false;
            }
            Boolean valueOf4 = Boolean.valueOf(z6);
            Class cls4 = (Class) this.f15034j.c(hVarArr[7]);
            String str4 = (String) this.f15035k.c(hVarArr[8]);
            Integer num3 = (Integer) this.f15036l.c(hVarArr[9]);
            String str5 = (String) this.f15037m.c(hVarArr[10]);
            Boolean bool3 = (Boolean) this.f15038n.c(hVarArr[11]);
            if (bool3 != null) {
                z8 = bool3.booleanValue();
            } else {
                z8 = false;
            }
            Boolean valueOf5 = Boolean.valueOf(z8);
            Constructor<C1399h> constructor2 = constructor;
            Boolean bool4 = (Boolean) this.f15039o.c(hVarArr[12]);
            if (bool4 != null) {
                z9 = bool4.booleanValue();
            } else {
                z9 = false;
            }
            C1399h newInstance = constructor2.newInstance(new Object[]{valueOf, str, str2, str3, httpSender$Method, valueOf2, valueOf3, valueOf4, cls4, str4, num3, str5, valueOf5, Boolean.valueOf(z9), (List) this.f15040p.c(hVarArr[13]), (Map) this.f15041q.c(hVarArr[14]), Integer.valueOf(this.f15027a), null});
            f.d(newInstance, "newInstance(...)");
            return newInstance;
        }
        throw new IllegalStateException("uri must be assigned.");
    }
}
