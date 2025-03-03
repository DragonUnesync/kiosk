package Z5;

import e6.C0847f;

public final class n0 {
    public static final n0 HTTP = new n0(80, "http");
    public static final n0 HTTPS = new n0(443, "https");
    private final C0847f name;
    private final int port;

    private n0(int i, String str) {
        this.port = i;
        this.name = C0847f.cached(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (n0Var.port() != this.port || !n0Var.name().equals(this.name)) {
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
