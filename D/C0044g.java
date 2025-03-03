package D;

import B.C0022x;
import C7.d;
import java.util.Collections;
import java.util.List;

/* renamed from: D.g  reason: case insensitive filesystem */
public final class C0044g {

    /* renamed from: a  reason: collision with root package name */
    public final N f899a;

    /* renamed from: b  reason: collision with root package name */
    public final List f900b;

    /* renamed from: c  reason: collision with root package name */
    public final int f901c;

    /* renamed from: d  reason: collision with root package name */
    public final int f902d;
    public final C0022x e;

    public C0044g(N n4, List list, int i, int i8, C0022x xVar) {
        this.f899a = n4;
        this.f900b = list;
        this.f901c = i;
        this.f902d = i8;
        this.e = xVar;
    }

    public static d a(N n4) {
        d dVar = new d(1);
        if (n4 != null) {
            dVar.f732V = n4;
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                dVar.f733W = emptyList;
                dVar.f734X = -1;
                dVar.f735Y = -1;
                dVar.f736Z = C0022x.f360d;
                return dVar;
            }
            throw new NullPointerException("Null sharedSurfaces");
        }
        throw new NullPointerException("Null surface");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0044g)) {
            return false;
        }
        C0044g gVar = (C0044g) obj;
        if (!this.f899a.equals(gVar.f899a) || !this.f900b.equals(gVar.f900b) || this.f901c != gVar.f901c || this.f902d != gVar.f902d || !this.e.equals(gVar.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((this.f899a.hashCode() ^ 1000003) * 1000003) ^ this.f900b.hashCode()) * -721379959) ^ this.f901c) * 1000003) ^ this.f902d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f899a + ", sharedSurfaces=" + this.f900b + ", physicalCameraId=null, mirrorMode=" + this.f901c + ", surfaceGroupId=" + this.f902d + ", dynamicRange=" + this.e + "}";
    }
}
