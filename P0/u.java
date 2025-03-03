package P0;

import android.os.Message;
import java.util.ArrayList;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    public Message f3739a;

    public final void a() {
        this.f3739a = null;
        ArrayList arrayList = v.f3740b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.f3739a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
