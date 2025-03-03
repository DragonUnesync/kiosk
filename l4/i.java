package L4;

public abstract class i extends h implements b {

    /* renamed from: d  reason: collision with root package name */
    public final int f2712d;

    public i(h hVar, int i) {
        super(1, hVar);
        this.f2712d = i;
    }

    public final int a() {
        return this.f2712d;
    }

    public String c() {
        StringBuilder sb = new StringBuilder();
        sb.append("stateless=" + ((h) this.f2711c));
        sb.append(", packetIdentifier=");
        sb.append(this.f2712d);
        return sb.toString();
    }
}
