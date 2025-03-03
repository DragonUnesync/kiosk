package e6;

import f6.C0934y;
import i6.q;

public final class B extends C0934y {
    final /* synthetic */ H this$0;

    public B(H h5) {
        this.this$0 = h5;
    }

    public G initialValue() {
        return new G(this.this$0.maxCapacityPerThread, this.this$0.interval, this.this$0.chunkSize);
    }

    public void onRemoval(G g8) {
        super.onRemoval(g8);
        q access$400 = g8.pooledHandles;
        q unused = g8.pooledHandles = null;
        Thread unused2 = g8.owner = null;
        access$400.clear();
    }
}
