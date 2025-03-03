package n2;

import G5.m;
import t2.k;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final m f13735a;

    /* renamed from: b  reason: collision with root package name */
    public final i f13736b;

    /* renamed from: c  reason: collision with root package name */
    public int f13737c = -1;

    /* renamed from: d  reason: collision with root package name */
    public k f13738d;

    public g(m mVar, i iVar) {
        this.f13735a = mVar;
        this.f13736b = iVar;
    }

    public final k a() {
        if (this.f13738d == null) {
            this.f13735a.f();
            if (this.f13738d == null) {
                throw new AssertionError();
            }
        }
        return this.f13738d;
    }

    public final String toString() {
        return "v" + this.f13737c + "(" + this.f13736b + ")";
    }
}
