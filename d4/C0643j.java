package d4;

import M3.h;
import N.e;

/* renamed from: d4.j  reason: case insensitive filesystem */
public abstract class C0643j {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f9760a;

    /* renamed from: b  reason: collision with root package name */
    public static final Object[][] f9761b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object[][] f9762c;

    /* renamed from: d  reason: collision with root package name */
    public static final Object[][] f9763d;
    public static final Object[][] e;

    static {
        Object obj = new Object();
        f9760a = obj;
        f9761b = new Object[][]{new Object[]{"00", 18}, new Object[]{"01", 14}, new Object[]{"02", 14}, new Object[]{"10", obj, 20}, new Object[]{"11", 6}, new Object[]{"12", 6}, new Object[]{"13", 6}, new Object[]{"15", 6}, new Object[]{"17", 6}, new Object[]{"20", 2}, new Object[]{"21", obj, 20}, new Object[]{"22", obj, 29}, new Object[]{"30", obj, 8}, new Object[]{"37", obj, 8}, new Object[]{"90", obj, 30}, new Object[]{"91", obj, 30}, new Object[]{"92", obj, 30}, new Object[]{"93", obj, 30}, new Object[]{"94", obj, 30}, new Object[]{"95", obj, 30}, new Object[]{"96", obj, 30}, new Object[]{"97", obj, 30}, new Object[]{"98", obj, 30}, new Object[]{"99", obj, 30}};
        Object obj2 = obj;
        f9762c = new Object[][]{new Object[]{"240", obj, 30}, new Object[]{"241", obj, 30}, new Object[]{"242", obj, 6}, new Object[]{"250", obj, 30}, new Object[]{"251", obj, 30}, new Object[]{"253", obj, 17}, new Object[]{"254", obj, 20}, new Object[]{"400", obj, 30}, new Object[]{"401", obj, 30}, new Object[]{"402", 17}, new Object[]{"403", obj, 30}, new Object[]{"410", 13}, new Object[]{"411", 13}, new Object[]{"412", 13}, new Object[]{"413", 13}, new Object[]{"414", 13}, new Object[]{"420", obj, 20}, new Object[]{"421", obj, 15}, new Object[]{"422", 3}, new Object[]{"423", obj, 15}, new Object[]{"424", 3}, new Object[]{"425", 3}, new Object[]{"426", 3}};
        f9763d = new Object[][]{new Object[]{"310", 6}, new Object[]{"311", 6}, new Object[]{"312", 6}, new Object[]{"313", 6}, new Object[]{"314", 6}, new Object[]{"315", 6}, new Object[]{"316", 6}, new Object[]{"320", 6}, new Object[]{"321", 6}, new Object[]{"322", 6}, new Object[]{"323", 6}, new Object[]{"324", 6}, new Object[]{"325", 6}, new Object[]{"326", 6}, new Object[]{"327", 6}, new Object[]{"328", 6}, new Object[]{"329", 6}, new Object[]{"330", 6}, new Object[]{"331", 6}, new Object[]{"332", 6}, new Object[]{"333", 6}, new Object[]{"334", 6}, new Object[]{"335", 6}, new Object[]{"336", 6}, new Object[]{"340", 6}, new Object[]{"341", 6}, new Object[]{"342", 6}, new Object[]{"343", 6}, new Object[]{"344", 6}, new Object[]{"345", 6}, new Object[]{"346", 6}, new Object[]{"347", 6}, new Object[]{"348", 6}, new Object[]{"349", 6}, new Object[]{"350", 6}, new Object[]{"351", 6}, new Object[]{"352", 6}, new Object[]{"353", 6}, new Object[]{"354", 6}, new Object[]{"355", 6}, new Object[]{"356", 6}, new Object[]{"357", 6}, new Object[]{"360", 6}, new Object[]{"361", 6}, new Object[]{"362", 6}, new Object[]{"363", 6}, new Object[]{"364", 6}, new Object[]{"365", 6}, new Object[]{"366", 6}, new Object[]{"367", 6}, new Object[]{"368", 6}, new Object[]{"369", 6}, new Object[]{"390", obj2, 15}, new Object[]{"391", obj2, 18}, new Object[]{"392", obj2, 15}, new Object[]{"393", obj2, 18}, new Object[]{"703", obj2, 30}};
        e = new Object[][]{new Object[]{"7001", 13}, new Object[]{"7002", obj2, 30}, new Object[]{"7003", 10}, new Object[]{"8001", 14}, new Object[]{"8002", obj2, 20}, new Object[]{"8003", obj2, 30}, new Object[]{"8004", obj2, 30}, new Object[]{"8005", 6}, new Object[]{"8006", 18}, new Object[]{"8007", obj2, 30}, new Object[]{"8008", obj2, 12}, new Object[]{"8018", 18}, new Object[]{"8020", obj2, 25}, new Object[]{"8100", 6}, new Object[]{"8101", 10}, new Object[]{"8102", 2}, new Object[]{"8110", obj2, 70}, new Object[]{"8200", obj2, 70}};
    }

    public static String a(String str) {
        if (str.isEmpty()) {
            return null;
        }
        if (str.length() >= 2) {
            String substring = str.substring(0, 2);
            Object[][] objArr = f9761b;
            int i = 0;
            while (true) {
                Object obj = f9760a;
                if (i < 24) {
                    Object[] objArr2 = objArr[i];
                    if (objArr2[0].equals(substring)) {
                        Object obj2 = objArr2[1];
                        if (obj2 == obj) {
                            return c(2, ((Integer) objArr2[2]).intValue(), str);
                        }
                        return b(2, ((Integer) obj2).intValue(), str);
                    }
                    i++;
                } else if (str.length() >= 3) {
                    String substring2 = str.substring(0, 3);
                    Object[][] objArr3 = f9762c;
                    for (int i8 = 0; i8 < 23; i8++) {
                        Object[] objArr4 = objArr3[i8];
                        if (objArr4[0].equals(substring2)) {
                            Object obj3 = objArr4[1];
                            if (obj3 == obj) {
                                return c(3, ((Integer) objArr4[2]).intValue(), str);
                            }
                            return b(3, ((Integer) obj3).intValue(), str);
                        }
                    }
                    Object[][] objArr5 = f9763d;
                    for (int i9 = 0; i9 < 57; i9++) {
                        Object[] objArr6 = objArr5[i9];
                        if (objArr6[0].equals(substring2)) {
                            Object obj4 = objArr6[1];
                            if (obj4 == obj) {
                                return c(4, ((Integer) objArr6[2]).intValue(), str);
                            }
                            return b(4, ((Integer) obj4).intValue(), str);
                        }
                    }
                    if (str.length() >= 4) {
                        String substring3 = str.substring(0, 4);
                        Object[][] objArr7 = e;
                        for (int i10 = 0; i10 < 18; i10++) {
                            Object[] objArr8 = objArr7[i10];
                            if (objArr8[0].equals(substring3)) {
                                Object obj5 = objArr8[1];
                                if (obj5 == obj) {
                                    return c(4, ((Integer) objArr8[2]).intValue(), str);
                                }
                                return b(4, ((Integer) obj5).intValue(), str);
                            }
                        }
                        throw h.f3144W;
                    }
                    throw h.f3144W;
                } else {
                    throw h.f3144W;
                }
            }
        } else {
            throw h.f3144W;
        }
    }

    public static String b(int i, int i8, String str) {
        if (str.length() >= i) {
            String substring = str.substring(0, i);
            int i9 = i8 + i;
            if (str.length() >= i9) {
                String substring2 = str.substring(i, i9);
                String str2 = "(" + substring + ')' + substring2;
                String a8 = a(str.substring(i9));
                if (a8 == null) {
                    return str2;
                }
                return e.x(str2, a8);
            }
            throw h.f3144W;
        }
        throw h.f3144W;
    }

    public static String c(int i, int i8, String str) {
        String substring = str.substring(0, i);
        int min = Math.min(str.length(), i8 + i);
        String substring2 = str.substring(i, min);
        String str2 = "(" + substring + ')' + substring2;
        String a8 = a(str.substring(min));
        if (a8 == null) {
            return str2;
        }
        return e.x(str2, a8);
    }
}
