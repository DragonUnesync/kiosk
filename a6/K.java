package a6;

import e6.C0847f;

public final class K {
    public static final K WS = new K(80, "ws");
    public static final K WSS = new K(443, "wss");
    private final C0847f name;
    private final int port;

    private K(int i, String str) {
        this.port = i;
        this.name = C0847f.cached(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof K)) {
            return false;
        }
        K k8 = (K) obj;
        if (k8.port() != this.port || !k8.name().equals(this.name)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.name.hashCode() + (this.port * 31);
    }

    public C0847f name() {
        return this.name;
    }

    public int port() {
        return this.port;
    }

    public String toString() {
        return this.name.toString();
    }
}
