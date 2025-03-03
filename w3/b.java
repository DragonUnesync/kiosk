package W3;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f6178a = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f6179b;

    /* renamed from: c  reason: collision with root package name */
    public static final char[] f6180c = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f6181d;
    public static final char[] e = {'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', '~', 127};

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};
        f6179b = cArr;
        f6181d = cArr;
    }

    public static void a(int i, int i8, int[] iArr) {
        int i9 = ((i << 8) + i8) - 1;
        int i10 = i9 / 1600;
        iArr[0] = i10;
        int i11 = i9 - (i10 * 1600);
        int i12 = i11 / 40;
        iArr[1] = i12;
        iArr[2] = i11 - (i12 * 40);
    }

    public static int b(int i, int i8) {
        int i9 = i - (((i8 * 149) % 255) + 1);
        if (i9 >= 0) {
            return i9;
        }
        return i9 + 256;
    }
}
