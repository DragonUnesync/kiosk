package com.samsung.android.knox;

import N.e;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;

public class SupportLibUtils {
    public static String buildClassErrorMsg(Class<?> cls, int i) {
        return buildClassErrorMsgInternal(new StringBuilder(), cls, i);
    }

    private static String buildClassErrorMsgInternal(StringBuilder sb, Class<?> cls, int i) {
        sb.append(cls.getName());
        sb.append(" class is only supported from API level ");
        sb.append(i);
        sb.append(" and above (current is ");
        sb.append(EnterpriseDeviceManager.getAPILevel());
        sb.append(")");
        return sb.toString();
    }

    public static String buildFieldErrorMsg(Class<?> cls, String str, int i) {
        return buildClassErrorMsgInternal(e.B(str, " field from "), cls, i);
    }

    public static String buildMethodErrorMsg(Class<?> cls, String str, Class<?>[] clsArr, int i) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append("(");
            if (clsArr != null) {
                Iterator it = Arrays.asList(clsArr).iterator();
                while (it.hasNext()) {
                    sb.append(((Class) it.next()).getName());
                    if (it.hasNext()) {
                        sb.append(", ");
                    }
                }
            }
            sb.append(") method from ");
        }
        return buildClassErrorMsgInternal(sb, cls, i);
    }

    public static <T extends Enum<T>, S extends Enum<S>> S convertEnumToEnum(T t8, Class<S> cls) {
        if (t8 == null) {
            return null;
        }
        for (S s8 : (Enum[]) cls.getEnumConstants()) {
            if (t8.ordinal() == s8.ordinal()) {
                return s8;
            }
        }
        return null;
    }

    public static String getSupportLibVersion() {
        return "1.0.15";
    }
}
