package L7;

import M7.b;
import M7.c;
import M7.e;
import M7.f;
import M7.g;
import M7.h;
import M7.i;
import M7.j;
import M7.k;
import j$.util.DesugarCollections;
import j$.util.stream.Stream;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f2714a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("\"", "\\\"");
        hashMap.put("\\", "\\\\");
        g gVar = new g(DesugarCollections.unmodifiableMap(hashMap));
        Map map = e.i;
        Stream.-CC.of(new c[]{gVar, new g(map), new f(127)}).filter(new G7.e(2)).forEach(new M7.a(0, new ArrayList()));
        HashMap hashMap2 = new HashMap();
        hashMap2.put("'", "\\'");
        hashMap2.put("\"", "\\\"");
        hashMap2.put("\\", "\\\\");
        hashMap2.put("/", "\\/");
        f2714a = new b(new g(DesugarCollections.unmodifiableMap(hashMap2)), new g(map), new f(127));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("\"", "\\\"");
        hashMap3.put("\\", "\\\\");
        hashMap3.put("/", "\\/");
        Stream.-CC.of(new c[]{new g(DesugarCollections.unmodifiableMap(hashMap3)), new g(map), new f(126)}).filter(new G7.e(2)).forEach(new M7.a(0, new ArrayList()));
        HashMap hashMap4 = new HashMap();
        hashMap4.put("\u0000", "");
        hashMap4.put("\u0001", "");
        hashMap4.put("\u0002", "");
        hashMap4.put("\u0003", "");
        hashMap4.put("\u0004", "");
        hashMap4.put("\u0005", "");
        hashMap4.put("\u0006", "");
        hashMap4.put("\u0007", "");
        hashMap4.put("\b", "");
        hashMap4.put("\u000b", "");
        hashMap4.put("\f", "");
        hashMap4.put("\u000e", "");
        hashMap4.put("\u000f", "");
        hashMap4.put("\u0010", "");
        hashMap4.put("\u0011", "");
        hashMap4.put("\u0012", "");
        hashMap4.put("\u0013", "");
        hashMap4.put("\u0014", "");
        hashMap4.put("\u0015", "");
        hashMap4.put("\u0016", "");
        hashMap4.put("\u0017", "");
        hashMap4.put("\u0018", "");
        hashMap4.put("\u0019", "");
        hashMap4.put("\u001a", "");
        hashMap4.put("\u001b", "");
        hashMap4.put("\u001c", "");
        hashMap4.put("\u001d", "");
        hashMap4.put("\u001e", "");
        hashMap4.put("\u001f", "");
        hashMap4.put("￾", "");
        hashMap4.put("￿", "");
        Map map2 = e.e;
        g gVar2 = new g(map2);
        Map map3 = e.f3185g;
        Stream.-CC.of(new c[]{gVar2, new g(map3), new g(DesugarCollections.unmodifiableMap(hashMap4)), new h(127, 132), new h(134, 159), new Object()}).filter(new G7.e(2)).forEach(new M7.a(0, new ArrayList()));
        HashMap hashMap5 = new HashMap();
        hashMap5.put("\u0000", "");
        hashMap5.put("\u000b", "&#11;");
        hashMap5.put("\f", "&#12;");
        hashMap5.put("￾", "");
        hashMap5.put("￿", "");
        Stream.-CC.of(new c[]{new g(map2), new g(map3), new g(DesugarCollections.unmodifiableMap(hashMap5)), new h(1, 8), new h(14, 31), new h(127, 132), new h(134, 159), new Object()}).filter(new G7.e(2)).forEach(new M7.a(0, new ArrayList()));
        g gVar3 = new g(map2);
        Map map4 = e.f3180a;
        Stream.-CC.of(new c[]{gVar3, new g(map4)}).filter(new G7.e(2)).forEach(new M7.a(0, new ArrayList()));
        Stream.-CC.of(new c[]{new g(map2), new g(map4), new g(e.f3182c)}).filter(new G7.e(2)).forEach(new M7.a(0, new ArrayList()));
        HashMap hashMap6 = new HashMap();
        hashMap6.put("|", "\\|");
        hashMap6.put("&", "\\&");
        hashMap6.put(";", "\\;");
        hashMap6.put("<", "\\<");
        hashMap6.put(">", "\\>");
        hashMap6.put("(", "\\(");
        hashMap6.put(")", "\\)");
        hashMap6.put("$", "\\$");
        hashMap6.put("`", "\\`");
        Object obj = "\\";
        hashMap6.put(obj, "\\\\");
        Object obj2 = "\"";
        Object obj3 = "\\\"";
        hashMap6.put(obj2, obj3);
        Object obj4 = "'";
        Object obj5 = "\\'";
        hashMap6.put(obj4, obj5);
        hashMap6.put(" ", "\\ ");
        hashMap6.put("\t", "\\\t");
        hashMap6.put("\r\n", "");
        hashMap6.put("\n", "");
        hashMap6.put("*", "\\*");
        hashMap6.put("?", "\\?");
        hashMap6.put("[", "\\[");
        hashMap6.put("#", "\\#");
        hashMap6.put("~", "\\~");
        hashMap6.put("=", "\\=");
        hashMap6.put("%", "\\%");
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap6);
        if (unmodifiableMap != null) {
            HashMap hashMap7 = new HashMap();
            BitSet bitSet = new BitSet();
            int i = Integer.MAX_VALUE;
            int i8 = 0;
            for (Map.Entry entry : unmodifiableMap.entrySet()) {
                hashMap7.put(((CharSequence) entry.getKey()).toString(), ((CharSequence) entry.getValue()).toString());
                bitSet.set(((CharSequence) entry.getKey()).charAt(0));
                int length = ((CharSequence) entry.getKey()).length();
                if (length < i) {
                    i = length;
                }
                if (length > i8) {
                    i8 = length;
                }
            }
            HashMap hashMap8 = new HashMap();
            hashMap8.put("\\\\", obj);
            hashMap8.put(obj3, obj2);
            hashMap8.put(obj5, obj4);
            hashMap8.put(obj, "");
            new b(new k(0), new k(1), new g(e.f3187j), new g(DesugarCollections.unmodifiableMap(hashMap8)));
            Map map5 = e.f3184f;
            g gVar4 = new g(map5);
            Map map6 = e.f3181b;
            Stream.-CC.of(new c[]{gVar4, new g(map6), new j(new i[0])}).filter(new G7.e(2)).forEach(new M7.a(0, new ArrayList()));
            Stream.-CC.of(new c[]{new g(map5), new g(map6), new g(e.f3183d), new j(new i[0])}).filter(new G7.e(2)).forEach(new M7.a(0, new ArrayList()));
            Stream.-CC.of(new c[]{new g(map5), new g(e.f3186h), new j(new i[0])}).filter(new G7.e(2)).forEach(new M7.a(0, new ArrayList()));
            return;
        }
        throw new InvalidParameterException("lookupMap cannot be null");
    }
}
