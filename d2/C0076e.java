package D2;

import B2.f;
import H2.p;
import H2.q;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;

/* renamed from: D2.e  reason: case insensitive filesystem */
public final class C0076e implements C0079h, d {

    /* renamed from: U  reason: collision with root package name */
    public final List f1066U;

    /* renamed from: V  reason: collision with root package name */
    public final i f1067V;

    /* renamed from: W  reason: collision with root package name */
    public final C0078g f1068W;

    /* renamed from: X  reason: collision with root package name */
    public int f1069X = -1;

    /* renamed from: Y  reason: collision with root package name */
    public f f1070Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f1071Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f1072a0;

    /* renamed from: b0  reason: collision with root package name */
    public volatile p f1073b0;

    /* renamed from: c0  reason: collision with root package name */
    public File f1074c0;

    public C0076e(List list, i iVar, C0078g gVar) {
        this.f1066U = list;
        this.f1067V = iVar;
        this.f1068W = gVar;
    }

    public final boolean b() {
        while (true) {
            List list = this.f1071Z;
            boolean z = false;
            if (list == null || this.f1072a0 >= list.size()) {
                int i = this.f1069X + 1;
                this.f1069X = i;
                if (i >= this.f1066U.size()) {
                    return false;
                }
                f fVar = (f) this.f1066U.get(this.f1069X);
                i iVar = this.f1067V;
                File b8 = iVar.f1083h.a().b(new C0077f(fVar, iVar.f1088n));
                this.f1074c0 = b8;
                if (b8 != null) {
                    this.f1070Y = fVar;
                    this.f1071Z = this.f1067V.f1079c.b().g(b8);
                    this.f1072a0 = 0;
                }
            } else {
                this.f1073b0 = null;
                while (!z && this.f1072a0 < this.f1071Z.size()) {
                    List list2 = this.f1071Z;
                    int i8 = this.f1072a0;
                    this.f1072a0 = i8 + 1;
                    File file = this.f1074c0;
                    i iVar2 = this.f1067V;
                    this.f1073b0 = ((q) list2.get(i8)).a(file, iVar2.e, iVar2.f1081f, iVar2.i);
                    if (!(this.f1073b0 == null || this.f1067V.c(this.f1073b0.f1976c.a()) == null)) {
                        this.f1073b0.f1976c.f(this.f1067V.f1089o, this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    public final void c(Exception exc) {
        this.f1068W.a(this.f1070Y, exc, this.f1073b0.f1976c, 3);
    }

    public final void cancel() {
        p pVar = this.f1073b0;
        if (pVar != null) {
            pVar.f1976c.cancel();
        }
    }

    public final void d(Object obj) {
        this.f1068W.c(this.f1070Y, obj, this.f1073b0.f1976c, 3, this.f1070Y);
    }
}
