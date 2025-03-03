package f7;

import P6.f;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import l7.i;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final C0939b[] f11716a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map f11717b;

    static {
        C0939b bVar = new C0939b(C0939b.i, "");
        i iVar = C0939b.f11697f;
        C0939b bVar2 = new C0939b(iVar, "GET");
        C0939b bVar3 = new C0939b(iVar, "POST");
        i iVar2 = C0939b.f11698g;
        C0939b bVar4 = new C0939b(iVar2, "/");
        C0939b bVar5 = new C0939b(iVar2, "/index.html");
        i iVar3 = C0939b.f11699h;
        C0939b bVar6 = new C0939b(iVar3, "http");
        C0939b bVar7 = new C0939b(iVar3, "https");
        i iVar4 = C0939b.e;
        C0939b bVar8 = new C0939b(iVar4, "200");
        C0939b bVar9 = new C0939b(iVar4, "204");
        C0939b bVar10 = new C0939b(iVar4, "206");
        C0939b bVar11 = new C0939b(iVar4, "304");
        C0939b bVar12 = new C0939b(iVar4, "400");
        C0939b bVar13 = new C0939b(iVar4, "404");
        C0939b bVar14 = new C0939b(iVar4, "500");
        C0939b bVar15 = bVar14;
        C0939b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar15, new C0939b("accept-charset", ""), new C0939b("accept-encoding", "gzip, deflate"), new C0939b("accept-language", ""), new C0939b("accept-ranges", ""), new C0939b("accept", ""), new C0939b("access-control-allow-origin", ""), new C0939b("age", ""), new C0939b("allow", ""), new C0939b("authorization", ""), new C0939b("cache-control", ""), new C0939b("content-disposition", ""), new C0939b("content-encoding", ""), new C0939b("content-language", ""), new C0939b("content-length", ""), new C0939b("content-location", ""), new C0939b("content-range", ""), new C0939b("content-type", ""), new C0939b("cookie", ""), new C0939b("date", ""), new C0939b("etag", ""), new C0939b("expect", ""), new C0939b("expires", ""), new C0939b("from", ""), new C0939b("host", ""), new C0939b("if-match", ""), new C0939b("if-modified-since", ""), new C0939b("if-none-match", ""), new C0939b("if-range", ""), new C0939b("if-unmodified-since", ""), new C0939b("last-modified", ""), new C0939b("link", ""), new C0939b("location", ""), new C0939b("max-forwards", ""), new C0939b("proxy-authenticate", ""), new C0939b("proxy-authorization", ""), new C0939b("range", ""), new C0939b("referer", ""), new C0939b("refresh", ""), new C0939b("retry-after", ""), new C0939b("server", ""), new C0939b("set-cookie", ""), new C0939b("strict-transport-security", ""), new C0939b("transfer-encoding", ""), new C0939b("user-agent", ""), new C0939b("vary", ""), new C0939b("via", ""), new C0939b("www-authenticate", "")};
        f11716a = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(bVarArr[i].f11700a)) {
                linkedHashMap.put(bVarArr[i].f11700a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        f.d(unmodifiableMap, "unmodifiableMap(result)");
        f11717b = unmodifiableMap;
    }

    public static void a(i iVar) {
        f.e(iVar, "name");
        int a8 = iVar.a();
        int i = 0;
        while (i < a8) {
            byte d8 = iVar.d(i);
            if (65 > d8 || d8 >= 91) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.h()));
            }
        }
    }
}
