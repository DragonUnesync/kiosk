package B;

import N.e;
import u.C1477r;

/* renamed from: B.e  reason: case insensitive filesystem */
public final class C0004e {

    /* renamed from: a  reason: collision with root package name */
    public final int f233a;

    /* renamed from: b  reason: collision with root package name */
    public final C0005f f234b;

    public C0004e(int i, C0005f fVar) {
        if (i != 0) {
            this.f233a = i;
            this.f234b = fVar;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0004e)) {
            return false;
        }
        C0004e eVar = (C0004e) obj;
        if (C1477r.a(this.f233a, eVar.f233a)) {
            C0005f fVar = eVar.f234b;
            C0005f fVar2 = this.f234b;
            if (fVar2 == null) {
                if (fVar == null) {
                    return true;
                }
            } else if (fVar2.equals(fVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int h5 = (C1477r.h(this.f233a) ^ 1000003) * 1000003;
        C0005f fVar = this.f234b;
        if (fVar == null) {
            i = 0;
        } else {
            i = fVar.hashCode();
        }
        return h5 ^ i;
    }

    public final String toString() {
        return "CameraState{type=" + e.L(this.f233a) + ", error=" + this.f234b + "}";
    }
}
