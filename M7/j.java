package M7;

import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;

public final class j extends c {

    /* renamed from: c  reason: collision with root package name */
    public static final EnumSet f3197c = EnumSet.copyOf(Collections.singletonList(i.f3194U));

    /* renamed from: b  reason: collision with root package name */
    public final EnumSet f3198b;

    public j(i... iVarArr) {
        int i;
        EnumSet enumSet;
        boolean z = false;
        if (iVarArr != null) {
            i = Array.getLength(iVarArr);
        } else {
            i = 0;
        }
        if (i == 0 ? true : z) {
            enumSet = f3197c;
        } else {
            enumSet = EnumSet.copyOf(Arrays.asList(iVarArr));
        }
        this.f3198b = enumSet;
    }

    public final int a(int i, StringWriter stringWriter, String str) {
        int i8;
        int i9;
        int i10;
        int length = str.length();
        if (str.charAt(i) == '&' && i < length - 2 && str.charAt(i + 1) == '#') {
            int i11 = i + 2;
            char charAt = str.charAt(i11);
            if (charAt == 'x' || charAt == 'X') {
                i11 = i + 3;
                if (i11 == length) {
                    return 0;
                }
                i8 = 1;
            } else {
                i8 = 0;
            }
            int i12 = i11;
            while (i12 < length && ((str.charAt(i12) >= '0' && str.charAt(i12) <= '9') || ((str.charAt(i12) >= 'a' && str.charAt(i12) <= 'f') || (str.charAt(i12) >= 'A' && str.charAt(i12) <= 'F')))) {
                i12++;
            }
            if (i12 == length || str.charAt(i12) != ';') {
                i9 = 0;
            } else {
                i9 = 1;
            }
            if (i9 == 0) {
                i iVar = i.f3194U;
                EnumSet enumSet = this.f3198b;
                if (enumSet.contains(iVar)) {
                    return 0;
                }
                if (enumSet.contains(i.f3195V)) {
                    throw new IllegalArgumentException("Semi-colon required at end of numeric entity");
                }
            }
            if (i8 != 0) {
                try {
                    i10 = Integer.parseInt(str.subSequence(i11, i12).toString(), 16);
                } catch (NumberFormatException unused) {
                }
            } else {
                i10 = Integer.parseInt(str.subSequence(i11, i12).toString(), 10);
            }
            if (i10 > 65535) {
                char[] chars = Character.toChars(i10);
                stringWriter.write(chars[0]);
                stringWriter.write(chars[1]);
            } else {
                stringWriter.write(i10);
            }
            return ((i12 + 2) - i11) + i8 + i9;
        }
        return 0;
    }
}
