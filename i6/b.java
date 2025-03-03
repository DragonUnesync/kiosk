package I6;

import D6.e;
import P6.f;
import java.io.Serializable;

public final class b extends e implements a, Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final Enum[] f2329U;

    public b(Enum[] enumArr) {
        f.e(enumArr, "entries");
        this.f2329U = enumArr;
    }

    public final int b() {
        return this.f2329U.length;
    }

    public final boolean contains(Object obj) {
        Enum enumR;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum enumR2 = (Enum) obj;
        f.e(enumR2, "element");
        int ordinal = enumR2.ordinal();
        Enum[] enumArr = this.f2329U;
        f.e(enumArr, "<this>");
        if (ordinal < 0 || ordinal >= enumArr.length) {
            enumR = null;
        } else {
            enumR = enumArr[ordinal];
        }
        if (enumR == enumR2) {
            return true;
        }
        return false;
    }

    public final Object get(int i) {
        Enum[] enumArr = this.f2329U;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + length);
    }

    public final int indexOf(Object obj) {
        Enum enumR;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum enumR2 = (Enum) obj;
        f.e(enumR2, "element");
        int ordinal = enumR2.ordinal();
        Enum[] enumArr = this.f2329U;
        f.e(enumArr, "<this>");
        if (ordinal < 0 || ordinal >= enumArr.length) {
            enumR = null;
        } else {
            enumR = enumArr[ordinal];
        }
        if (enumR == enumR2) {
            return ordinal;
        }
        return -1;
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum enumR = (Enum) obj;
        f.e(enumR, "element");
        return indexOf(enumR);
    }
}
