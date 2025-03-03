package k1;

import M0.c0;
import N.e;
import P0.z;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import h1.f0;
import j$.util.Objects;
import java.util.Map;

/* renamed from: k1.j  reason: case insensitive filesystem */
public final class C1141j extends c0 {

    /* renamed from: B  reason: collision with root package name */
    public static final /* synthetic */ int f12961B = 0;

    /* renamed from: A  reason: collision with root package name */
    public final SparseBooleanArray f12962A;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f12963s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f12964t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f12965u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f12966v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f12967w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f12968x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f12969y;
    public final SparseArray z;

    static {
        new C1141j(new C1140i());
        z.J(1000);
        z.J(1001);
        z.J(1002);
        z.J(1003);
        e.D(1004, 1005, 1006, 1007, 1008);
        e.D(1009, 1010, 1011, 1012, 1013);
        e.D(1014, 1015, 1016, 1017, 1018);
    }

    public C1141j(C1140i iVar) {
        super(iVar);
        this.f12963s = iVar.f12954s;
        this.f12964t = iVar.f12955t;
        this.f12965u = iVar.f12956u;
        this.f12966v = iVar.f12957v;
        this.f12967w = iVar.f12958w;
        this.f12968x = iVar.f12959x;
        this.f12969y = iVar.f12960y;
        this.z = iVar.z;
        this.f12962A = iVar.f12953A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1141j.class != obj.getClass()) {
            return false;
        }
        C1141j jVar = (C1141j) obj;
        if (super.equals(jVar) && this.f12963s == jVar.f12963s && this.f12964t == jVar.f12964t && this.f12965u == jVar.f12965u && this.f12966v == jVar.f12966v && this.f12967w == jVar.f12967w && this.f12968x == jVar.f12968x && this.f12969y == jVar.f12969y) {
            SparseBooleanArray sparseBooleanArray = this.f12962A;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = jVar.f12962A;
            if (sparseBooleanArray2.size() == size) {
                int i = 0;
                while (true) {
                    if (i >= size) {
                        SparseArray sparseArray = this.z;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = jVar.z;
                        if (sparseArray2.size() == size2) {
                            int i8 = 0;
                            while (i8 < size2) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i8);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            f0 f0Var = (f0) entry.getKey();
                                            if (map2.containsKey(f0Var)) {
                                                Object value = entry.getValue();
                                                Object obj2 = map2.get(f0Var);
                                                int i9 = z.f3748a;
                                                if (!Objects.equals(value, obj2)) {
                                                }
                                            }
                                        }
                                        i8++;
                                    }
                                }
                            }
                            return true;
                        }
                    } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f12963s ? 1 : 0)) * 961) + (this.f12964t ? 1 : 0)) * 961) + (this.f12965u ? 1 : 0)) * 28629151) + (this.f12966v ? 1 : 0)) * 31) + (this.f12967w ? 1 : 0)) * 31) + (this.f12968x ? 1 : 0)) * 961) + (this.f12969y ? 1 : 0)) * 31;
    }
}
