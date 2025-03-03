package E2;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1329a;

    public /* synthetic */ c(int i) {
        this.f1329a = i;
    }

    public final int a(Object obj) {
        switch (this.f1329a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int b() {
        switch (this.f1329a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String c() {
        switch (this.f1329a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
