package u;

import D.C0050j;
import D.F0;
import D.G0;
import java.util.ArrayList;

/* renamed from: u.r  reason: case insensitive filesystem */
public abstract /* synthetic */ class C1477r {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f15678a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};

    public static /* synthetic */ boolean a(int i, int i8) {
        if (i != 0) {
            return i == i8;
        }
        throw null;
    }

    public static F0 b(ArrayList arrayList, F0 f02) {
        arrayList.add(f02);
        return new F0();
    }

    public static String c(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static StringBuilder e(String str, int i, String str2, int i8, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i8);
        sb.append(str3);
        return sb;
    }

    public static void f(int i, G0 g02, long j7, F0 f02) {
        f02.a(new C0050j(i, g02, j7));
    }

    public static /* synthetic */ String g(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int h(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String j(int i) {
        switch (i) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int[] k(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f15678a, 0, iArr, 0, i);
        return iArr;
    }
}
