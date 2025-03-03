package T0;

import B.q0;
import F2.e;
import N0.d;
import P0.l;
import R2.c;
import V0.B;
import V0.C0339d;
import V0.y;
import V0.z;
import android.content.Context;
import android.os.Handler;
import b1.g;
import d1.C0631b;
import j1.C1119d;
import java.util.ArrayList;
import n1.C1240e;
import o1.C1310b;

/* renamed from: T0.k  reason: case insensitive filesystem */
public final class C0219k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4862a;

    /* renamed from: b  reason: collision with root package name */
    public final e f4863b;

    public C0219k(Context context) {
        this.f4862a = context;
        this.f4863b = new e(context, 11, false);
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [V0.r, java.lang.Object] */
    public final C0213e[] a(Handler handler, C0229v vVar, C0229v vVar2, C0229v vVar3, C0229v vVar4) {
        ArrayList arrayList = new ArrayList();
        e eVar = this.f4863b;
        Context context = this.f4862a;
        arrayList.add(new C1240e(context, eVar, handler, vVar));
        ? obj = new Object();
        obj.f5586b = context;
        obj.f5587c = C0339d.f5512c;
        obj.e = z.f5672a;
        obj.f5589f = z.f5673b;
        l.j(!obj.f5585a);
        obj.f5585a = true;
        if (((q0) obj.f5588d) == null) {
            obj.f5588d = new q0(new d[0]);
        }
        if (((c) obj.f5590g) == null) {
            obj.f5590g = new c(context, 9);
        }
        arrayList.add(new B(this.f4862a, eVar, handler, vVar2, new y(obj)));
        arrayList.add(new C1119d(vVar3, handler.getLooper()));
        arrayList.add(new C0631b(vVar4, handler.getLooper()));
        arrayList.add(new C1310b());
        arrayList.add(new g(b1.c.f8623K));
        return (C0213e[]) arrayList.toArray(new C0213e[0]);
    }
}
