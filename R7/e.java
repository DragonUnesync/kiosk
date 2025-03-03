package R7;

import Q7.g;
import j$.util.function.BiConsumer;
import java.util.function.BiConsumer;

public final /* synthetic */ class e implements BiConsumer {
    public final void accept(Object obj, Object obj2) {
        g gVar = (g) obj;
        CharSequence charSequence = (CharSequence) obj2;
        g.D(gVar.f4368a);
        if (!gVar.f4370c) {
            gVar.f4368a.append(gVar.f4369b);
        }
        gVar.f4368a.append(charSequence);
        gVar.f4370c = false;
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer);
    }
}
