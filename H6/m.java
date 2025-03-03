package h6;

import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public abstract class m {
    public static C1081b arrayFormat(String str, Object[] objArr) {
        Throwable th;
        boolean z;
        Throwable th2 = null;
        if (objArr == null || objArr.length == 0) {
            return new C1081b(str, (Throwable) null);
        }
        int length = objArr.length - 1;
        Throwable th3 = objArr[length];
        if (th3 instanceof Throwable) {
            th = th3;
        } else {
            th = null;
        }
        if (str == null) {
            return new C1081b((String) null, th);
        }
        int indexOf = str.indexOf("{}");
        if (indexOf == -1) {
            return new C1081b(str, th);
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i = 0;
        int i8 = 0;
        do {
            if (indexOf == 0 || str.charAt(indexOf - 1) != '\\') {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                sb.append(str, i, indexOf);
            } else {
                sb.append(str, i, indexOf - 1);
                if (indexOf < 2 || str.charAt(indexOf - 2) != '\\') {
                    z = false;
                } else {
                    z = true;
                }
            }
            i = indexOf + 2;
            if (z) {
                deeplyAppendParameter(sb, objArr[i8], (Set<Object[]>) null);
                i8++;
                if (i8 > length) {
                    break;
                }
            } else {
                sb.append("{}");
            }
            indexOf = str.indexOf("{}", i);
        } while (indexOf != -1);
        sb.append(str, i, str.length());
        String sb2 = sb.toString();
        if (i8 <= length) {
            th2 = th;
        }
        return new C1081b(sb2, th2);
    }

    private static void booleanArrayAppend(StringBuilder sb, boolean[] zArr) {
        if (zArr.length != 0) {
            sb.append(zArr[0]);
            for (int i = 1; i < zArr.length; i++) {
                sb.append(", ");
                sb.append(zArr[i]);
            }
        }
    }

    private static void byteArrayAppend(StringBuilder sb, byte[] bArr) {
        if (bArr.length != 0) {
            sb.append(bArr[0]);
            for (int i = 1; i < bArr.length; i++) {
                sb.append(", ");
                sb.append(bArr[i]);
            }
        }
    }

    private static void charArrayAppend(StringBuilder sb, char[] cArr) {
        if (cArr.length != 0) {
            sb.append(cArr[0]);
            for (int i = 1; i < cArr.length; i++) {
                sb.append(", ");
                sb.append(cArr[i]);
            }
        }
    }

    private static void deeplyAppendParameter(StringBuilder sb, Object obj, Set<Object[]> set) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            sb.append('[');
            if (cls == boolean[].class) {
                booleanArrayAppend(sb, (boolean[]) obj);
            } else if (cls == byte[].class) {
                byteArrayAppend(sb, (byte[]) obj);
            } else if (cls == char[].class) {
                charArrayAppend(sb, (char[]) obj);
            } else if (cls == short[].class) {
                shortArrayAppend(sb, (short[]) obj);
            } else if (cls == int[].class) {
                intArrayAppend(sb, (int[]) obj);
            } else if (cls == long[].class) {
                longArrayAppend(sb, (long[]) obj);
            } else if (cls == float[].class) {
                floatArrayAppend(sb, (float[]) obj);
            } else if (cls == double[].class) {
                doubleArrayAppend(sb, (double[]) obj);
            } else {
                objectArrayAppend(sb, (Object[]) obj, set);
            }
            sb.append(']');
        } else if (!Number.class.isAssignableFrom(cls)) {
            safeObjectAppend(sb, obj);
        } else if (cls == Long.class) {
            sb.append(((Long) obj).longValue());
        } else if (cls == Integer.class || cls == Short.class || cls == Byte.class) {
            sb.append(((Number) obj).intValue());
        } else if (cls == Double.class) {
            sb.append(((Double) obj).doubleValue());
        } else if (cls == Float.class) {
            sb.append(((Float) obj).floatValue());
        } else {
            safeObjectAppend(sb, obj);
        }
    }

    private static void doubleArrayAppend(StringBuilder sb, double[] dArr) {
        if (dArr.length != 0) {
            sb.append(dArr[0]);
            for (int i = 1; i < dArr.length; i++) {
                sb.append(", ");
                sb.append(dArr[i]);
            }
        }
    }

    private static void floatArrayAppend(StringBuilder sb, float[] fArr) {
        if (fArr.length != 0) {
            sb.append(fArr[0]);
            for (int i = 1; i < fArr.length; i++) {
                sb.append(", ");
                sb.append(fArr[i]);
            }
        }
    }

    public static C1081b format(String str, Object obj) {
        return arrayFormat(str, new Object[]{obj});
    }

    private static void intArrayAppend(StringBuilder sb, int[] iArr) {
        if (iArr.length != 0) {
            sb.append(iArr[0]);
            for (int i = 1; i < iArr.length; i++) {
                sb.append(", ");
                sb.append(iArr[i]);
            }
        }
    }

    private static void longArrayAppend(StringBuilder sb, long[] jArr) {
        if (jArr.length != 0) {
            sb.append(jArr[0]);
            for (int i = 1; i < jArr.length; i++) {
                sb.append(", ");
                sb.append(jArr[i]);
            }
        }
    }

    private static void objectArrayAppend(StringBuilder sb, Object[] objArr, Set<Object[]> set) {
        if (objArr.length != 0) {
            if (set == null) {
                set = new HashSet<>(objArr.length);
            }
            if (set.add(objArr)) {
                deeplyAppendParameter(sb, objArr[0], set);
                for (int i = 1; i < objArr.length; i++) {
                    sb.append(", ");
                    deeplyAppendParameter(sb, objArr[i], set);
                }
                set.remove(objArr);
                return;
            }
            sb.append("...");
        }
    }

    private static void safeObjectAppend(StringBuilder sb, Object obj) {
        try {
            sb.append(obj.toString());
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            printStream.println("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + ']');
            th.printStackTrace();
            sb.append("[FAILED toString()]");
        }
    }

    private static void shortArrayAppend(StringBuilder sb, short[] sArr) {
        if (sArr.length != 0) {
            sb.append(sArr[0]);
            for (int i = 1; i < sArr.length; i++) {
                sb.append(", ");
                sb.append(sArr[i]);
            }
        }
    }

    public static C1081b format(String str, Object obj, Object obj2) {
        return arrayFormat(str, new Object[]{obj, obj2});
    }
}
