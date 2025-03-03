package F;

import android.os.Handler;
import android.os.Looper;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

public final class b extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1392a;

    public /* synthetic */ b(int i) {
        this.f1392a = i;
    }

    public final Object initialValue() {
        switch (this.f1392a) {
            case 0:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return D7.b.H();
                }
                if (Looper.myLooper() != null) {
                    return new e(new Handler(Looper.myLooper()));
                }
                return null;
            case 1:
                return new Random();
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(Z6.b.f6985d);
                return simpleDateFormat;
            default:
                return new Object();
        }
    }
}
