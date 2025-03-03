package t4;

import S5.C0185n;
import q4.k;
import u4.d;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final k f15466a = new k(13);

    /* renamed from: b  reason: collision with root package name */
    public static final k f15467b = new k(14);

    /* renamed from: c  reason: collision with root package name */
    public static final k f15468c = new k(15);

    /* renamed from: d  reason: collision with root package name */
    public static final k f15469d = new k(16);
    public static final k e = new k(17);

    /* renamed from: f  reason: collision with root package name */
    public static final k f15470f = new k(18);

    /* renamed from: g  reason: collision with root package name */
    public static final k f15471g = new k(19);

    /* renamed from: h  reason: collision with root package name */
    public static final k f15472h = new k(20);
    public static final k i = new k(21);

    public static void a(int i8, long j7, long j8, C0185n nVar) {
        if (j7 != j8) {
            nVar.writeByte(i8);
            nVar.writeInt((int) j7);
        }
    }

    public static int b(d dVar) {
        if (dVar == null) {
            return 0;
        }
        return dVar.e() + 1;
    }
}
