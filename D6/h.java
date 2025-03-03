package D6;

import E.e;
import P6.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class h extends e {
    public static List A(Object[] objArr) {
        f.e(objArr, "<this>");
        List asList = Arrays.asList(objArr);
        f.d(asList, "asList(...)");
        return asList;
    }

    public static void B(int i, int i8, int i9, Object[] objArr, Object[] objArr2) {
        f.e(objArr, "<this>");
        f.e(objArr2, "destination");
        System.arraycopy(objArr, i8, objArr2, i, i9 - i8);
    }

    public static void C(int i, int i8, int[] iArr, int[] iArr2, int i9) {
        f.e(iArr, "<this>");
        f.e(iArr2, "destination");
        System.arraycopy(iArr, i8, iArr2, i, i9 - i8);
    }

    public static void D(byte[] bArr, int i, byte[] bArr2, int i8, int i9) {
        f.e(bArr, "<this>");
        f.e(bArr2, "destination");
        System.arraycopy(bArr, i8, bArr2, i, i9 - i8);
    }

    public static /* synthetic */ void E(int i, int i8, int i9, Object[] objArr, Object[] objArr2) {
        if ((i9 & 4) != 0) {
            i = 0;
        }
        B(0, i, i8, objArr, objArr2);
    }

    public static void F(int i, int i8, Object[] objArr) {
        f.e(objArr, "<this>");
        Arrays.fill(objArr, i, i8, (Object) null);
    }

    public static ArrayList G(Object[] objArr) {
        f.e(objArr, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List H(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return r.f1269U;
        }
        if (length != 1) {
            return new ArrayList(new f(objArr, false));
        }
        return F.h.w(objArr[0]);
    }
}
