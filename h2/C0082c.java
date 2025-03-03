package H2;

import B2.i;
import V2.b;
import java.io.File;

/* renamed from: H2.c  reason: case insensitive filesystem */
public final class C0082c implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1946a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1947b;

    public /* synthetic */ C0082c(int i, Object obj) {
        this.f1946a = i;
        this.f1947b = obj;
    }

    public final p a(Object obj, int i, int i8, i iVar) {
        switch (this.f1946a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new p(new b(bArr), new l(bArr, 1, (z) this.f1947b));
            case 1:
                return new p(new b(obj), new C2.b(1, obj.toString(), (z) this.f1947b));
            default:
                File file = (File) obj;
                return new p(new b(file), new C2.b(2, file, (z) this.f1947b));
        }
    }

    public final boolean b(Object obj) {
        switch (this.f1946a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                File file = (File) obj;
                return true;
        }
    }
}
