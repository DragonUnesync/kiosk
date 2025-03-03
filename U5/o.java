package U5;

import java.nio.channels.Selector;

public final class o {
    final Selector selector;
    final Selector unwrappedSelector;

    public o(Selector selector2) {
        this.unwrappedSelector = selector2;
        this.selector = selector2;
    }

    public o(Selector selector2, Selector selector3) {
        this.unwrappedSelector = selector2;
        this.selector = selector3;
    }
}
