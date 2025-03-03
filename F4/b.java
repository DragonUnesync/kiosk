package F4;

import T5.C0260n;
import T5.K;
import Z5.i0;
import com.bumptech.glide.g;
import de.ozerov.fully.K2;
import g7.C0996d;
import i5.f;
import i5.k;
import i5.p;
import j$.util.function.BiConsumer;
import java.util.List;
import java.util.function.BiConsumer;
import u4.C1493b;
import z4.e;

public final /* synthetic */ class b implements BiConsumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1535a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1536b;

    public /* synthetic */ b(int i, Object obj) {
        this.f1535a = i;
        this.f1536b = obj;
    }

    public final void accept(Object obj, Object obj2) {
        p pVar;
        Object obj3 = this.f1536b;
        switch (this.f1535a) {
            case 0:
                Integer num = (Integer) obj;
                List list = (List) obj2;
                c cVar = (c) obj3;
                cVar.getClass();
                C0996d.r(list, "Immutable list");
                if (list instanceof p) {
                    pVar = ((p) list).a();
                } else {
                    int size = list.size();
                    if (size == 0) {
                        pVar = k.f12748U;
                    } else if (size != 1) {
                        Object[] array = list.toArray();
                        C0996d.r(array, "Immutable list");
                        for (int i = 0; i < array.length; i++) {
                            C0996d.f(i, array[i]);
                        }
                        pVar = new f(0, array);
                    } else {
                        Object obj4 = list.get(0);
                        C0996d.f(0, obj4);
                        pVar = new f(1, obj4);
                    }
                }
                C1493b bVar = C1493b.f15776c;
                b5.b bVar2 = new b5.b(pVar);
                K2 k22 = cVar.f1541Y;
                a aVar = new a(bVar2, num.intValue());
                I2.b bVar3 = (I2.b) k22.f10050V;
                if (bVar3 == null) {
                    k22.f10051W = aVar;
                    k22.f10050V = aVar;
                    return;
                }
                bVar3.f2257U = aVar;
                aVar.f2258V = bVar3;
                k22.f10050V = aVar;
                return;
            case 1:
                ((i0) obj3).headers().set((String) obj, (Object) (String) obj2);
                return;
            default:
                x4.b bVar4 = (x4.b) obj3;
                bVar4.getClass();
                C0260n nVar = (C0260n) ((K) obj);
                nVar.close();
                e.C(bVar4.f16273U, 2, new g((Throwable) obj2), bVar4.f16274V, bVar4.f16275W, nVar.eventLoop());
                return;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        int i = this.f1535a;
        return BiConsumer.-CC.$default$andThen(this, biConsumer);
    }
}
