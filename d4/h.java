package D4;

import R7.g;
import S7.k;
import S7.p;
import S7.v;
import j$.util.DesugarCollections;
import j$.util.function.Function;
import java.io.File;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public final /* synthetic */ class h implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1231a;

    public /* synthetic */ h(int i) {
        this.f1231a = i;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int i = this.f1231a;
        return Function.-CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        switch (this.f1231a) {
            case 0:
                return ((i) obj).f1232a;
            case 1:
                return (CharSequence) ((Map.Entry) obj).getValue();
            case 2:
                return (CharSequence) ((Map.Entry) obj).getKey();
            case 3:
                return ((File) obj).getName();
            case 4:
                return new ArrayList();
            case 5:
                return new IdentityHashMap();
            case 6:
                g gVar = (g) obj;
                String h5 = R7.h.h(gVar.f4368a);
                gVar.f4368a = null;
                return h5;
            case 7:
                return v.class.cast((p) obj);
            case 8:
                return DesugarCollections.unmodifiableList((List) obj);
            case 9:
                p pVar = (p) obj;
                if (pVar instanceof v) {
                    return ((v) pVar).C();
                }
                if (pVar.o("br")) {
                    return "\n";
                }
                return "";
            default:
                return ((k) obj).s();
        }
    }

    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        int i = this.f1231a;
        return Function.-CC.$default$compose(this, function);
    }
}
