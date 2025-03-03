package g6;

import h6.C1082c;
import h6.d;
import java.security.AccessController;

public abstract class p0 {
    private static final C1082c logger = d.getInstance((Class<?>) p0.class);

    public static boolean contains(String str) {
        if (get(str) != null) {
            return true;
        }
        return false;
    }

    public static String get(String str) {
        return get(str, (String) null);
    }

    public static boolean getBoolean(String str, boolean z) {
        String str2 = get(str);
        if (str2 == null) {
            return z;
        }
        String lowerCase = str2.trim().toLowerCase();
        if (lowerCase.isEmpty()) {
            return z;
        }
        if ("true".equals(lowerCase) || "yes".equals(lowerCase) || "1".equals(lowerCase)) {
            return true;
        }
        if ("false".equals(lowerCase) || "no".equals(lowerCase) || "0".equals(lowerCase)) {
            return false;
        }
        logger.warn("Unable to parse the boolean system property '{}':{} - using the default value: {}", str, lowerCase, Boolean.valueOf(z));
        return z;
    }

    public static int getInt(String str, int i) {
        String str2 = get(str);
        if (str2 == null) {
            return i;
        }
        String trim = str2.trim();
        try {
            return Integer.parseInt(trim);
        } catch (Exception unused) {
            logger.warn("Unable to parse the integer system property '{}':{} - using the default value: {}", str, trim, Integer.valueOf(i));
            return i;
        }
    }

    public static long getLong(String str, long j7) {
        String str2 = get(str);
        if (str2 == null) {
            return j7;
        }
        String trim = str2.trim();
        try {
            return Long.parseLong(trim);
        } catch (Exception unused) {
            logger.warn("Unable to parse the long integer system property '{}':{} - using the default value: {}", str, trim, Long.valueOf(j7));
            return j7;
        }
    }

    public static String get(String str, String str2) {
        String str3;
        B.checkNonEmpty(str, "key");
        try {
            if (System.getSecurityManager() == null) {
                str3 = System.getProperty(str);
            } else {
                str3 = (String) AccessController.doPrivileged(new o0(str));
            }
        } catch (SecurityException e) {
            logger.warn("Unable to retrieve a system property '{}'; default values will be used.", str, e);
            str3 = null;
        }
        return str3 == null ? str2 : str3;
    }
}
