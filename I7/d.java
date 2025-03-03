package I7;

import U5.q;
import f5.C0906d;
import j$.util.function.BiFunction;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.Function;

public final /* synthetic */ class d implements BiFunction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2335a;

    public /* synthetic */ d(int i) {
        this.f2335a = i;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        int i = this.f2335a;
        return BiFunction.-CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        String str;
        switch (this.f2335a) {
            case 0:
                Integer num = (Integer) obj;
                num.intValue();
                IOException iOException = (IOException) obj2;
                String str2 = "Null";
                if (iOException == null) {
                    str = str2;
                } else {
                    str = iOException.getClass().getSimpleName();
                }
                if (iOException != null) {
                    str2 = iOException.getMessage();
                }
                return new IOException(String.format("%s #%,d: %s", new Object[]{str, num, str2}), iOException);
            case 1:
                return new q(((Integer) obj).intValue(), (Executor) obj2);
            default:
                return C0906d.b(((Integer) obj).intValue(), (Executor) obj2);
        }
    }
}
