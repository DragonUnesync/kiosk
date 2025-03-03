package M7;

import K7.c;
import java.io.StringWriter;

public final class h extends d {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3192b = true;

    /* renamed from: c  reason: collision with root package name */
    public final c f3193c;

    public h(int i, int i8) {
        this.f3193c = new c(Integer.valueOf(i), Integer.valueOf(i8));
    }

    public final boolean b(int i, StringWriter stringWriter) {
        boolean z;
        Integer valueOf = Integer.valueOf(i);
        c cVar = this.f3193c;
        Integer num = cVar.f2671X;
        cVar.f2668U.getClass();
        if (valueOf.compareTo(num) <= -1 || valueOf.compareTo(cVar.f2670W) >= 1) {
            z = false;
        } else {
            z = true;
        }
        if (this.f3192b != z) {
            return false;
        }
        stringWriter.write("&#");
        stringWriter.write(Integer.toString(i, 10));
        stringWriter.write(59);
        return true;
    }
}
