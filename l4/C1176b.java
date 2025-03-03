package l4;

/* renamed from: l4.b  reason: case insensitive filesystem */
public abstract class C1176b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f13194a;

    static {
        boolean z;
        try {
            Class.forName("org.slf4j.Logger");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f13194a = z;
    }

    public static C1175a a(Class cls) {
        if (f13194a) {
            return new C1178d(cls);
        }
        return C1177c.f13195a;
    }
}
