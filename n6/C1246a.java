package n6;

import Q7.g;
import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: n6.a  reason: case insensitive filesystem */
public final class C1246a extends g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13784a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f13785b;

    public /* synthetic */ C1246a(int i, Object obj) {
        this.f13784a = i;
        this.f13785b = obj;
    }

    public final void F(String str) {
        switch (this.f13784a) {
            case 0:
                ((PrintStream) this.f13785b).println(str);
                return;
            default:
                ((PrintWriter) this.f13785b).println(str);
                return;
        }
    }
}
