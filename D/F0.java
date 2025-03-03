package D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class F0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f771a = new ArrayList();

    public static void b(ArrayList arrayList, int i, int[] iArr, int i8) {
        if (i8 >= iArr.length) {
            arrayList.add((int[]) iArr.clone());
            return;
        }
        for (int i9 = 0; i9 < i; i9++) {
            int i10 = 0;
            while (true) {
                if (i10 >= i8) {
                    iArr[i8] = i9;
                    b(arrayList, i, iArr, i8 + 1);
                    break;
                } else if (i9 == iArr[i10]) {
                    break;
                } else {
                    i10++;
                }
            }
        }
    }

    public final void a(C0050j jVar) {
        this.f771a.add(jVar);
    }

    public final List c(List list) {
        boolean z;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        int size = list.size();
        ArrayList arrayList = this.f771a;
        if (size != arrayList.size()) {
            return null;
        }
        int size2 = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        boolean z6 = false;
        b(arrayList2, size2, new int[size2], 0);
        C0050j[] jVarArr = new C0050j[list.size()];
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int[] iArr = (int[]) it.next();
            boolean z8 = true;
            for (int i = 0; i < arrayList.size(); i++) {
                if (iArr[i] < list.size()) {
                    C0050j jVar = (C0050j) arrayList.get(i);
                    C0050j jVar2 = (C0050j) list.get(iArr[i]);
                    jVar.getClass();
                    int i8 = jVar2.f908a;
                    if (jVar2.f909b.f782U > jVar.f909b.f782U || i8 != jVar.f908a) {
                        z = false;
                    } else {
                        z = true;
                    }
                    z8 &= z;
                    if (!z8) {
                        continue;
                        break;
                    }
                    jVarArr[iArr[i]] = (C0050j) arrayList.get(i);
                }
            }
            if (z8) {
                z6 = true;
                break;
            }
        }
        if (z6) {
            return Arrays.asList(jVarArr);
        }
        return null;
    }
}
