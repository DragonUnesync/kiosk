package P7;

import java.io.IOException;

public final class b extends IOException {

    /* renamed from: U  reason: collision with root package name */
    public final String f3957U;

    /* renamed from: V  reason: collision with root package name */
    public final String f3958V;

    public b(String str, String str2) {
        super("Unhandled content type. Must be text/*, */xml, or */*+xml");
        this.f3957U = str;
        this.f3958V = str2;
    }

    public final String toString() {
        return super.toString() + ". Mimetype=" + this.f3957U + ", URL=" + this.f3958V;
    }
}
