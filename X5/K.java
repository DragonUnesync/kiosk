package X5;

import T5.C0245f0;
import T5.Y;
import e6.I;
import g6.A0;
import java.util.List;

public abstract class K extends C0245f0 {
    private final A0 matcher = A0.find(this, K.class, "I");

    public boolean acceptInboundMessage(Object obj) {
        return this.matcher.match(obj);
    }

    public void channelRead(Y y8, Object obj) {
        C0360k newInstance = C0360k.newInstance();
        int i = 0;
        try {
            if (acceptInboundMessage(obj)) {
                decode(y8, obj, newInstance);
                I.release(obj);
            } else {
                newInstance.add(obj);
            }
            try {
                int size = newInstance.size();
                while (i < size) {
                    y8.fireChannelRead(newInstance.getUnsafe(i));
                    i++;
                }
            } finally {
                newInstance.recycle();
            }
        } catch (C0364o e) {
            throw e;
        } catch (Exception e8) {
            throw new C0364o((Throwable) e8);
        } catch (Throwable th) {
            newInstance.recycle();
            throw th;
        }
    }

    public abstract void decode(Y y8, Object obj, List<Object> list);
}
