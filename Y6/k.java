package Y6;

import D6.r;
import J0.b;
import J0.c;
import O6.a;
import P6.d;
import P6.f;
import P6.g;
import androidx.lifecycle.C0481h;
import androidx.lifecycle.I;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import c7.j;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class k extends g implements a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6654U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f6655V;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i, Object obj) {
        super(0);
        this.f6654U = i;
        this.f6655V = obj;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [P6.g, O6.a] */
    public final Object invoke() {
        b bVar;
        switch (this.f6654U) {
            case 0:
                return (List) this.f6655V;
            case 1:
                try {
                    return (List) ((g) this.f6655V).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return r.f1269U;
                }
            case 2:
                P p3 = (P) this.f6655V;
                ArrayList arrayList = new ArrayList();
                P6.k.f3956a.getClass();
                Class<L> cls = L.class;
                Class a8 = new d(cls).a();
                f.c(a8, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                arrayList.add(new J0.d(a8));
                J0.d[] dVarArr = (J0.d[]) arrayList.toArray(new J0.d[0]);
                J0.d[] dVarArr2 = (J0.d[]) Arrays.copyOf(dVarArr, dVarArr.length);
                f.e(dVarArr2, "initializers");
                O d8 = p3.d();
                if (p3 instanceof C0481h) {
                    bVar = ((C0481h) p3).c();
                } else {
                    bVar = J0.a.f2337b;
                }
                f.e(d8, "store");
                f.e(bVar, "defaultCreationExtras");
                LinkedHashMap linkedHashMap = d8.f8131a;
                M m8 = (M) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (cls.isInstance(m8)) {
                    f.c(m8, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                } else {
                    c cVar = new c(bVar);
                    cVar.f2338a.put(N.f8130b, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        M m9 = null;
                        for (J0.d dVar : dVarArr2) {
                            if (dVar.f2339a.equals(cls)) {
                                m9 = (M) I.f8118U.a(cVar);
                            }
                        }
                        if (m9 != null) {
                            M m10 = (M) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", m9);
                            if (m10 != null) {
                                m10.onCleared();
                            }
                            m8 = m9;
                        } else {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
                        }
                    } catch (AbstractMethodError unused2) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return (L) m8;
            default:
                l lVar = ((j) this.f6655V).e;
                f.b(lVar);
                List<Certificate> a9 = lVar.a();
                ArrayList arrayList2 = new ArrayList(D6.k.M(a9));
                for (Certificate certificate : a9) {
                    f.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList2.add((X509Certificate) certificate);
                }
                return arrayList2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(a aVar) {
        super(0);
        this.f6654U = 1;
        this.f6655V = (g) aVar;
    }
}
