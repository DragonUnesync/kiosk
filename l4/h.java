package L4;

import u4.C1493b;
import u5.C1495b;

public abstract class h implements c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2710b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2711c;

    public /* synthetic */ h(int i, Object obj) {
        this.f2710b = i;
        this.f2711c = obj;
    }

    public final C1493b b() {
        switch (this.f2710b) {
            case 0:
                return (C1493b) this.f2711c;
            default:
                return (C1493b) ((h) this.f2711c).f2711c;
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, i5.p] */
    public String c() {
        C1493b bVar = (C1493b) this.f2711c;
        if (bVar.f15777a.isEmpty()) {
            return "";
        }
        return "userProperties=" + bVar;
    }

    public C1495b getType() {
        return ((h) this.f2711c).getType();
    }
}
