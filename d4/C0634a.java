package d4;

import M3.h;
import S3.a;

/* renamed from: d4.a  reason: case insensitive filesystem */
public final class C0634a extends C0638e {

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f9750W;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0634a(a aVar, int i) {
        super(aVar);
        this.f9750W = i;
    }

    public final String h() {
        if (((a) this.f2257U).f4504V == 60) {
            StringBuilder sb = new StringBuilder();
            j(5, sb);
            n(sb, 45, 15);
            return sb.toString();
        }
        throw h.f3144W;
    }

    public final void l(int i, StringBuilder sb) {
        switch (this.f9750W) {
            case 0:
                sb.append("(3103)");
                return;
            default:
                if (i < 10000) {
                    sb.append("(3202)");
                    return;
                } else {
                    sb.append("(3203)");
                    return;
                }
        }
    }

    public final int m(int i) {
        switch (this.f9750W) {
            case 0:
                return i;
            default:
                return i < 10000 ? i : i - 10000;
        }
    }
}
