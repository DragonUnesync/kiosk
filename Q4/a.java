package Q4;

import q5.C1365a;
import w5.C1591a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final P4.a f4121a;

    public a(P4.a aVar) {
        this.f4121a = aVar;
    }

    public final C1365a a() {
        int ordinal = ((C1591a) this.f4121a.e).ordinal();
        if (ordinal == 0) {
            return C1365a.f14779U;
        }
        switch (ordinal) {
            case 5:
                return C1365a.f14780V;
            case 6:
                return C1365a.f14781W;
            case 7:
                return C1365a.f14783Y;
            case 8:
                return C1365a.f14784Z;
            case 9:
                return C1365a.f14782X;
            default:
                throw new IllegalStateException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f4121a.equals(((a) obj).f4121a);
    }

    public final int hashCode() {
        return this.f4121a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MqttConnAck{");
        sb.append("returnCode=" + a() + ", sessionPresent=" + this.f4121a.f3780f);
        sb.append('}');
        return sb.toString();
    }
}
