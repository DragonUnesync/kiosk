package Y6;

import C6.c;
import D.s0;
import F.h;
import G5.s;
import P6.f;
import W6.d;
import Z6.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class m implements Iterable {

    /* renamed from: U  reason: collision with root package name */
    public final String[] f6660U;

    public m(String[] strArr) {
        this.f6660U = strArr;
    }

    public static final m e(Map map) {
        f.e(map, "<this>");
        String[] strArr = new String[(map.size() * 2)];
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String obj = d.s0((String) entry.getKey()).toString();
            String obj2 = d.s0((String) entry.getValue()).toString();
            h.f(obj);
            h.g(obj2, obj);
            strArr[i] = obj;
            strArr[i + 1] = obj2;
            i += 2;
        }
        return new m(strArr);
    }

    public final String b(String str) {
        f.e(str, "name");
        String[] strArr = this.f6660U;
        int length = strArr.length - 2;
        int r8 = s.r(length, 0, -2);
        if (r8 <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != r8) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i) {
        return this.f6660U[i * 2];
    }

    public final s0 d() {
        s0 s0Var = new s0(5);
        ArrayList arrayList = s0Var.f949a;
        f.e(arrayList, "<this>");
        String[] strArr = this.f6660U;
        f.e(strArr, "elements");
        arrayList.addAll(D6.h.A(strArr));
        return s0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (Arrays.equals(this.f6660U, ((m) obj).f6660U)) {
                return true;
            }
        }
        return false;
    }

    public final String f(int i) {
        return this.f6660U[(i * 2) + 1];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6660U);
    }

    public final Iterator iterator() {
        int size = size();
        c[] cVarArr = new c[size];
        for (int i = 0; i < size; i++) {
            cVarArr[i] = new c(c(i), f(i));
        }
        return f.g(cVarArr);
    }

    public final int size() {
        return this.f6660U.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String c8 = c(i);
            String f8 = f(i);
            sb.append(c8);
            sb.append(": ");
            if (b.p(c8)) {
                f8 = "██";
            }
            sb.append(f8);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        f.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
