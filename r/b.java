package R;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final b f4230b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final a f4231a = a.c("1.4.0");

    public static b a() {
        return f4230b;
    }

    public static boolean c(a aVar) {
        int i;
        a aVar2 = f4230b.f4231a;
        int i8 = aVar.f4226U;
        int i9 = aVar2.f4226U;
        if (i9 == i8) {
            i = Integer.compare(aVar2.f4227V, aVar.f4227V);
        } else {
            i = Integer.compare(i9, i8);
        }
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public final a b() {
        return this.f4231a;
    }

    public final String d() {
        return this.f4231a.toString();
    }
}
