package U5;

import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Set;

public final class u extends Selector {
    private final Selector delegate;
    private final t selectionKeys;

    public u(Selector selector, t tVar) {
        this.delegate = selector;
        this.selectionKeys = tVar;
    }

    public void close() {
        this.delegate.close();
    }

    public boolean isOpen() {
        return this.delegate.isOpen();
    }

    public Set<SelectionKey> keys() {
        return this.delegate.keys();
    }

    public SelectorProvider provider() {
        return this.delegate.provider();
    }

    public int select(long j7) {
        this.selectionKeys.reset();
        return this.delegate.select(j7);
    }

    public int selectNow() {
        this.selectionKeys.reset();
        return this.delegate.selectNow();
    }

    public Set<SelectionKey> selectedKeys() {
        return this.delegate.selectedKeys();
    }

    public Selector wakeup() {
        return this.delegate.wakeup();
    }

    public int select() {
        this.selectionKeys.reset();
        return this.delegate.select();
    }
}
