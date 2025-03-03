package e0;

import d0.C0629c;
import d0.d;
import u.C1477r;

public abstract class l implements C0820d {

    /* renamed from: a  reason: collision with root package name */
    public int f11155a;

    /* renamed from: b  reason: collision with root package name */
    public d f11156b;

    /* renamed from: c  reason: collision with root package name */
    public C0826j f11157c;

    /* renamed from: d  reason: collision with root package name */
    public int f11158d;
    public final C0822f e = new C0822f(this);

    /* renamed from: f  reason: collision with root package name */
    public int f11159f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f11160g = false;

    /* renamed from: h  reason: collision with root package name */
    public final C0821e f11161h = new C0821e(this);
    public final C0821e i = new C0821e(this);

    /* renamed from: j  reason: collision with root package name */
    public int f11162j = 1;

    public l(d dVar) {
        this.f11156b = dVar;
    }

    public static void b(C0821e eVar, C0821e eVar2, int i8) {
        eVar.f11148l.add(eVar2);
        eVar.f11143f = i8;
        eVar2.f11147k.add(eVar);
    }

    public static C0821e h(C0629c cVar) {
        C0629c cVar2 = cVar.f9579d;
        if (cVar2 == null) {
            return null;
        }
        int h5 = C1477r.h(cVar2.f9578c);
        d dVar = cVar2.f9577b;
        if (h5 == 1) {
            return dVar.f9614d.f11161h;
        }
        if (h5 == 2) {
            return dVar.e.f11161h;
        }
        if (h5 == 3) {
            return dVar.f9614d.i;
        }
        if (h5 == 4) {
            return dVar.e.i;
        }
        if (h5 != 5) {
            return null;
        }
        return dVar.e.f11153k;
    }

    public static C0821e i(C0629c cVar, int i8) {
        l lVar;
        C0629c cVar2 = cVar.f9579d;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.f9577b;
        if (i8 == 0) {
            lVar = dVar.f9614d;
        } else {
            lVar = dVar.e;
        }
        int h5 = C1477r.h(cVar2.f9578c);
        if (h5 == 1 || h5 == 2) {
            return lVar.f11161h;
        }
        if (h5 == 3 || h5 == 4) {
            return lVar.i;
        }
        return null;
    }

    public final void c(C0821e eVar, C0821e eVar2, int i8, C0822f fVar) {
        eVar.f11148l.add(eVar2);
        eVar.f11148l.add(this.e);
        eVar.f11145h = i8;
        eVar.i = fVar;
        eVar2.f11147k.add(eVar);
        fVar.f11147k.add(eVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i8, int i9) {
        int i10;
        if (i9 == 0) {
            d dVar = this.f11156b;
            int i11 = dVar.f9622n;
            i10 = Math.max(dVar.f9621m, i8);
            if (i11 > 0) {
                i10 = Math.min(i11, i8);
            }
            if (i10 == i8) {
                return i8;
            }
        } else {
            d dVar2 = this.f11156b;
            int i12 = dVar2.f9625q;
            int max = Math.max(dVar2.f9624p, i8);
            if (i12 > 0) {
                max = Math.min(i12, i8);
            }
            if (i10 == i8) {
                return i8;
            }
        }
        return i10;
    }

    public long j() {
        C0822f fVar = this.e;
        if (fVar.f11146j) {
            return (long) fVar.f11144g;
        }
        return 0;
    }

    public abstract boolean k();

    public final void l(C0629c cVar, C0629c cVar2, int i8) {
        float f8;
        l lVar;
        float f9;
        int i9;
        C0821e h5 = h(cVar);
        C0821e h8 = h(cVar2);
        if (h5.f11146j && h8.f11146j) {
            int c8 = cVar.c() + h5.f11144g;
            int c9 = h8.f11144g - cVar2.c();
            int i10 = c9 - c8;
            C0822f fVar = this.e;
            if (!fVar.f11146j && this.f11158d == 3) {
                int i11 = this.f11155a;
                if (i11 == 0) {
                    fVar.d(g(i10, i8));
                } else if (i11 == 1) {
                    fVar.d(Math.min(g(fVar.f11149m, i8), i10));
                } else if (i11 == 2) {
                    d dVar = this.f11156b;
                    d dVar2 = dVar.f9590I;
                    if (dVar2 != null) {
                        if (i8 == 0) {
                            lVar = dVar2.f9614d;
                        } else {
                            lVar = dVar2.e;
                        }
                        C0822f fVar2 = lVar.e;
                        if (fVar2.f11146j) {
                            if (i8 == 0) {
                                f9 = dVar.f9623o;
                            } else {
                                f9 = dVar.f9626r;
                            }
                            fVar.d(g((int) ((((float) fVar2.f11144g) * f9) + 0.5f), i8));
                        }
                    }
                } else if (i11 == 3) {
                    d dVar3 = this.f11156b;
                    l lVar2 = dVar3.f9614d;
                    int i12 = lVar2.f11158d;
                    l lVar3 = dVar3.e;
                    if (!(i12 == 3 && lVar2.f11155a == 3 && lVar3.f11158d == 3 && lVar3.f11155a == 3)) {
                        if (i8 == 0) {
                            lVar2 = lVar3;
                        }
                        C0822f fVar3 = lVar2.e;
                        if (fVar3.f11146j) {
                            float f10 = dVar3.f9593L;
                            if (i8 == 1) {
                                i9 = (int) ((((float) fVar3.f11144g) / f10) + 0.5f);
                            } else {
                                i9 = (int) ((f10 * ((float) fVar3.f11144g)) + 0.5f);
                            }
                            fVar.d(i9);
                        }
                    }
                }
            }
            if (fVar.f11146j) {
                int i13 = fVar.f11144g;
                C0821e eVar = this.i;
                C0821e eVar2 = this.f11161h;
                if (i13 == i10) {
                    eVar2.d(c8);
                    eVar.d(c9);
                    return;
                }
                d dVar4 = this.f11156b;
                if (i8 == 0) {
                    f8 = dVar4.f9600S;
                } else {
                    f8 = dVar4.f9601T;
                }
                if (h5 == h8) {
                    c8 = h5.f11144g;
                    c9 = h8.f11144g;
                    f8 = 0.5f;
                }
                eVar2.d((int) ((((float) ((c9 - c8) - i13)) * f8) + ((float) c8) + 0.5f));
                eVar.d(eVar2.f11144g + fVar.f11144g);
            }
        }
    }
}
