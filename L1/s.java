package l1;

import R0.h;
import R0.j;
import R0.l;
import R0.z;
import android.net.Uri;
import h1.C1053t;
import java.util.Collections;
import java.util.Map;

public final class s implements m {

    /* renamed from: U  reason: collision with root package name */
    public final long f13153U = C1053t.f12513b.getAndIncrement();

    /* renamed from: V  reason: collision with root package name */
    public final l f13154V;

    /* renamed from: W  reason: collision with root package name */
    public final int f13155W;

    /* renamed from: X  reason: collision with root package name */
    public final z f13156X;

    /* renamed from: Y  reason: collision with root package name */
    public final r f13157Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile Object f13158Z;

    public s(h hVar, Uri uri, int i, r rVar) {
        Map emptyMap = Collections.emptyMap();
        Uri uri2 = uri;
        P0.l.l(uri, "The uri must be set.");
        l lVar = new l(uri, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 1);
        h hVar2 = hVar;
        this.f13156X = new z(hVar);
        this.f13154V = lVar;
        this.f13155W = i;
        this.f13157Y = rVar;
    }

    public final void c() {
        this.f13156X.f4323V = 0;
        j jVar = new j(this.f13156X, this.f13154V);
        try {
            jVar.f4266U.f(jVar.f4267V);
            jVar.f4269X = true;
            Uri p3 = this.f13156X.f4322U.p();
            p3.getClass();
            this.f13158Z = this.f13157Y.n(p3, jVar);
        } finally {
            P0.z.g(jVar);
        }
    }

    public final void e() {
    }
}
