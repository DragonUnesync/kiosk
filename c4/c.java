package C4;

import I2.b;
import L4.h;
import V4.a;
import V4.f;
import i5.C1101a;
import i5.C1102b;
import i5.C1103c;
import l4.C1175a;
import l4.C1176b;
import z3.e;

public final class c {

    /* renamed from: g  reason: collision with root package name */
    public static final C1175a f690g = C1176b.a(c.class);

    /* renamed from: a  reason: collision with root package name */
    public final e f691a;

    /* renamed from: b  reason: collision with root package name */
    public final a f692b;

    /* renamed from: c  reason: collision with root package name */
    public final C1102b f693c;

    /* renamed from: d  reason: collision with root package name */
    public final C1101a f694d;
    public final C1102b e;

    /* renamed from: f  reason: collision with root package name */
    public final C1101a f695f;

    /* JADX WARNING: type inference failed for: r0v0, types: [i5.b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [i5.b, java.lang.Object] */
    public c(e eVar, a aVar) {
        ? obj = new Object();
        this.f693c = obj;
        this.f694d = new C1101a(obj);
        ? obj2 = new Object();
        this.e = obj2;
        this.f695f = new C1101a(obj2);
        this.f691a = eVar;
        this.f692b = aVar;
    }

    public final void a(f fVar) {
        a aVar = this.f692b;
        e eVar = aVar.f687a;
        f fVar2 = fVar.f704Z;
        int length = ((a) ((h) fVar2.f2711c)).f5975d.h().length;
        f[] fVarArr = aVar.f688b;
        a.a(fVar, fVarArr[2]);
        a.a(fVar, fVarArr[0]);
        if (fVar.E()) {
            a.a(fVar, fVarArr[3]);
        }
        if (fVar.E()) {
            f690g.warn("No publish flow registered for {}.", fVar2);
        }
        C1101a aVar2 = this.f695f;
        aVar2.a();
        while (true) {
            if (aVar2.hasNext()) {
                f fVar3 = (f) aVar2.next();
                if (((C1103c) ((b) fVar3.f10050V)) == null) {
                    if (aVar2.f12728W != 1 || !fVar3.E()) {
                        break;
                    }
                    aVar2.remove();
                    this.f691a.d(fVar3);
                } else {
                    throw null;
                }
            } else {
                C1101a aVar3 = this.f694d;
                aVar3.a();
                while (aVar3.hasNext()) {
                    f fVar4 = (f) aVar3.next();
                    if (((C1103c) ((b) fVar4.f10050V)) == null) {
                        if (aVar3.f12728W != 1 || !fVar4.E()) {
                            break;
                        }
                        aVar3.remove();
                    } else {
                        throw null;
                    }
                }
            }
        }
        b bVar = (b) fVar.f10050V;
        if (((C1103c) bVar) != null) {
            throw null;
        } else if (((C1103c) bVar) != null) {
            throw null;
        }
    }
}
