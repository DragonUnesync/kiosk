package T5;

import e6.Y;

public final class Q0 implements Y {
    final /* synthetic */ R0 this$1;

    public Q0(R0 r02) {
        this.this$1 = r02;
    }

    public boolean get() {
        if (this.this$1.attemptedBytesRead == this.this$1.lastBytesRead) {
            return true;
        }
        return false;
    }
}
