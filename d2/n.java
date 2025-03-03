package D2;

public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final n f1132b = new n(0);

    /* renamed from: c  reason: collision with root package name */
    public static final n f1133c = new n(1);

    /* renamed from: d  reason: collision with root package name */
    public static final n f1134d = new n(2);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1135a;

    public /* synthetic */ n(int i) {
        this.f1135a = i;
    }

    public final boolean a(int i) {
        switch (this.f1135a) {
            case 0:
                return false;
            case 1:
                return (i == 3 || i == 5) ? false : true;
            default:
                return i == 2;
        }
    }
}
