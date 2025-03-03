package b6;

import e6.C0847f;

public final class M {
    private final int hash;
    private final String host;
    private final int port;

    public M(String str, int i) {
        this.host = str;
        this.port = i;
        this.hash = (C0847f.hashCode(str) * 31) + i;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        if (this.port != m8.port || !this.host.equalsIgnoreCase(m8.host)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.hash;
    }

    public String toString() {
        return "HostPort{host='" + this.host + "', port=" + this.port + '}';
    }
}
