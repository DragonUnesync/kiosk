package H2;

import B2.i;
import V2.b;
import java.io.File;

public final class A implements q {

    /* renamed from: b  reason: collision with root package name */
    public static final A f1933b = new A(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1934a;

    public /* synthetic */ A(int i) {
        this.f1934a = i;
    }

    public final p a(Object obj, int i, int i8, i iVar) {
        switch (this.f1934a) {
            case 0:
                return new p(new b(obj), new C0083d(1, obj));
            case 1:
                File file = (File) obj;
                return new p(new b(file), new C0083d(0, file));
            default:
                return null;
        }
    }

    public final boolean b(Object obj) {
        switch (this.f1934a) {
            case 0:
                return true;
            case 1:
                File file = (File) obj;
                return true;
            default:
                return false;
        }
    }
}
