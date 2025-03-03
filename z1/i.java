package Z1;

import android.os.Handler;
import android.os.Looper;

public abstract class i {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }
}
