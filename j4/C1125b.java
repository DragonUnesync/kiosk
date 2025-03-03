package j4;

/* renamed from: j4.b  reason: case insensitive filesystem */
public abstract /* synthetic */ class C1125b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f12868a = {2, 1, 4, 3};

    public static boolean a(int i, int i8, int i9) {
        switch (i) {
            case 1:
                if (((i8 + i9) & 1) == 0) {
                    return true;
                }
                return false;
            case 2:
                if ((i8 & 1) == 0) {
                    return true;
                }
                return false;
            case 3:
                if (i9 % 3 == 0) {
                    return true;
                }
                return false;
            case 4:
                if ((i8 + i9) % 3 == 0) {
                    return true;
                }
                return false;
            case 5:
                if ((((i9 / 3) + (i8 / 2)) & 1) == 0) {
                    return true;
                }
                return false;
            case 6:
                if ((i8 * i9) % 6 == 0) {
                    return true;
                }
                return false;
            case 7:
                if ((i8 * i9) % 6 < 3) {
                    return true;
                }
                return false;
            default:
                if (((((i8 * i9) % 3) + i8 + i9) & 1) == 0) {
                    return true;
                }
                return false;
        }
    }
}
