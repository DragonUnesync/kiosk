package n2;

import java.util.HashMap;
import u2.u;
import v2.c;

public final class i {

    /* renamed from: d  reason: collision with root package name */
    public static final i f13743d;
    public static final i e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f13744f;

    /* renamed from: g  reason: collision with root package name */
    public static final i f13745g;

    /* renamed from: h  reason: collision with root package name */
    public static final i f13746h;
    public static final i i;

    /* renamed from: j  reason: collision with root package name */
    public static final i f13747j;

    /* renamed from: k  reason: collision with root package name */
    public static final i f13748k;

    /* renamed from: l  reason: collision with root package name */
    public static final i f13749l;

    /* renamed from: m  reason: collision with root package name */
    public static final i f13750m = new i(c.f16064o0);

    /* renamed from: n  reason: collision with root package name */
    public static final i f13751n = new i(c.p0);

    /* renamed from: o  reason: collision with root package name */
    public static final HashMap f13752o;

    /* renamed from: a  reason: collision with root package name */
    public final String f13753a;

    /* renamed from: b  reason: collision with root package name */
    public final c f13754b;

    /* renamed from: c  reason: collision with root package name */
    public final u f13755c;

    static {
        i iVar = new i(c.f16050a0);
        f13743d = iVar;
        i iVar2 = new i(c.f16051b0);
        e = iVar2;
        i iVar3 = new i(c.f16052c0);
        f13744f = iVar3;
        i iVar4 = new i(c.f16053d0);
        f13745g = iVar4;
        i iVar5 = new i(c.f16054e0);
        f13746h = iVar5;
        i iVar6 = new i(c.f16055f0);
        i = iVar6;
        i iVar7 = new i(c.f16056g0);
        f13747j = iVar7;
        i iVar8 = new i(c.f16057h0);
        f13748k = iVar8;
        i iVar9 = new i(c.f16058i0);
        f13749l = iVar9;
        HashMap hashMap = new HashMap();
        f13752o = hashMap;
        hashMap.put(Boolean.TYPE, iVar);
        hashMap.put(Byte.TYPE, iVar2);
        hashMap.put(Character.TYPE, iVar3);
        hashMap.put(Double.TYPE, iVar4);
        hashMap.put(Float.TYPE, iVar5);
        hashMap.put(Integer.TYPE, iVar6);
        hashMap.put(Long.TYPE, iVar7);
        hashMap.put(Short.TYPE, iVar8);
        hashMap.put(Void.TYPE, iVar9);
    }

    public i(String str, c cVar) {
        if (str == null || cVar == null) {
            throw null;
        }
        this.f13753a = str;
        this.f13754b = cVar;
        u uVar = new u(cVar);
        u uVar2 = (u) u.f15768W.putIfAbsent(cVar, uVar);
        this.f13755c = uVar2 != null ? uVar2 : uVar;
    }

    public static i a(Class cls) {
        c cVar;
        if (cls.isPrimitive()) {
            return (i) f13752o.get(cls);
        }
        String replace = cls.getName().replace('.', '/');
        if (!cls.isArray()) {
            replace = "L" + replace + ';';
        }
        try {
            if (replace.equals("V")) {
                cVar = c.f16058i0;
            } else {
                cVar = c.f(replace);
            }
            return new i(replace, cVar);
        } catch (NullPointerException unused) {
            throw new NullPointerException("descriptor == null");
        }
    }

    public final h b(i iVar, String str, i... iVarArr) {
        return new h(this, iVar, str, new j(iVarArr));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i) || !((i) obj).f13753a.equals(this.f13753a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13753a.hashCode();
    }

    public final String toString() {
        return this.f13753a;
    }

    public i(c cVar) {
        this(cVar.f16075U, cVar);
    }
}
