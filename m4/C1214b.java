package m4;

import I4.c;
import T5.Z0;
import b6.C0539b1;
import de.ozerov.fully.C0768r4;
import f5.C0907e;
import f6.d0;
import i5.p;
import j5.b;
import java.util.concurrent.atomic.AtomicReference;
import o.s1;
import u4.C1492a;

/* renamed from: m4.b  reason: case insensitive filesystem */
public final class C1214b {

    /* renamed from: a  reason: collision with root package name */
    public volatile C1492a f13356a;

    /* renamed from: b  reason: collision with root package name */
    public final d f13357b;

    /* renamed from: c  reason: collision with root package name */
    public final C1213a f13358c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13359d;
    public final Object e;

    /* renamed from: f  reason: collision with root package name */
    public final s1 f13360f;

    /* renamed from: g  reason: collision with root package name */
    public volatile Z0 f13361g;

    /* renamed from: h  reason: collision with root package name */
    public int f13362h;
    public long i;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReference f13363j = new AtomicReference(b.f12890U);

    /* renamed from: k  reason: collision with root package name */
    public volatile C1215c f13364k;

    /* renamed from: l  reason: collision with root package name */
    public f f13365l;

    /* renamed from: m  reason: collision with root package name */
    public C0539b1 f13366m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13367n;

    public C1214b(C1492a aVar, f fVar, d dVar, C1213a aVar2, p pVar, p pVar2) {
        this.f13356a = aVar;
        this.f13357b = dVar;
        this.f13358c = aVar2;
        this.f13359d = pVar;
        this.e = pVar2;
        I4.b bVar = c.f2316a;
        bVar.getClass();
        this.f13360f = new s1(bVar, this);
        this.f13365l = fVar;
    }

    public final Z0 a() {
        Z0 z02;
        synchronized (this.f13363j) {
            try {
                this.f13362h++;
                this.i++;
                z02 = this.f13361g;
                if (z02 == null) {
                    C0907e eVar = C0907e.f11689d;
                    this.f13357b.getClass();
                    z02 = eVar.b();
                    this.f13361g = z02;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z02;
    }

    public final b b() {
        return (b) this.f13363j.get();
    }

    public final void c() {
        synchronized (this.f13363j) {
            try {
                int i8 = this.f13362h - 1;
                this.f13362h = i8;
                if (i8 == 0) {
                    ((d0) this.f13361g).execute(new C0768r4(this, this.i, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
