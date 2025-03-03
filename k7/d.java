package K7;

import java.util.regex.Pattern;

public abstract class d {
    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    public static String a(int i) {
        if (i <= 0) {
            return "";
        }
        if (i == 1) {
            return "😃";
        }
        int i8 = i * 2;
        char charAt = "😃".charAt(0);
        char charAt2 = "😃".charAt(1);
        char[] cArr = new char[i8];
        for (int i9 = i8 - 2; i9 >= 0; i9 -= 2) {
            cArr[i9] = charAt;
            cArr[i9 + 1] = charAt2;
        }
        return new String(cArr);
    }
}
