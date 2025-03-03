package D2;

import B.q0;
import B2.i;
import com.bumptech.glide.load.data.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class B {

    /* renamed from: a  reason: collision with root package name */
    public final q0 f1026a;

    /* renamed from: b  reason: collision with root package name */
    public final List f1027b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1028c;

    public B(Class cls, Class cls2, Class cls3, List list, q0 q0Var) {
        this.f1026a = q0Var;
        if (!list.isEmpty()) {
            this.f1027b = list;
            this.f1028c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final D a(int i, int i8, i iVar, j jVar, g gVar) {
        D d8;
        q0 q0Var = this.f1026a;
        List list = (List) q0Var.a();
        try {
            List list2 = this.f1027b;
            int size = list2.size();
            d8 = null;
            for (int i9 = 0; i9 < size; i9++) {
                d8 = ((m) list2.get(i9)).a(i, i8, iVar, jVar, gVar);
                if (d8 != null) {
                    break;
                }
            }
        } catch (y e) {
            list.add(e);
        } catch (Throwable th) {
            q0Var.A(list);
            throw th;
        }
        if (d8 != null) {
            q0Var.A(list);
            return d8;
        }
        throw new y(this.f1028c, new ArrayList(list));
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f1027b.toArray()) + '}';
    }
}
