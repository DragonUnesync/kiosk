package H4;

import G5.s;
import S5.C0185n;
import T5.C0260n;
import T5.C0274u0;
import T5.M;
import T5.Y;
import a6.C0433a;
import a6.C0434b;
import a6.C0435c;
import a6.C0437e;
import a6.C0438f;
import a6.C0439g;
import a6.G;

public final class a extends M {
    public final void channelRead(Y y8, Object obj) {
        if (obj instanceof G) {
            G g8 = (G) obj;
            if ((obj instanceof C0433a) || (obj instanceof C0435c)) {
                y8.fireChannelRead(g8.content());
            } else if (obj instanceof C0439g) {
                g8.release();
                s.d(y8.channel(), "Must not receive text websocket frames");
            } else if (obj instanceof C0434b) {
                g8.release();
                y8.close();
            } else if (obj instanceof C0437e) {
                ((C0260n) y8.channel()).writeAndFlush(new C0438f(g8.content()));
            } else {
                g8.release();
            }
        } else {
            y8.fireChannelRead(obj);
        }
    }

    public final boolean isSharable() {
        return true;
    }

    public final void write(Y y8, Object obj, C0274u0 u0Var) {
        if (obj instanceof C0185n) {
            y8.write(new C0433a((C0185n) obj), u0Var);
        } else {
            y8.write(obj, u0Var);
        }
    }
}
