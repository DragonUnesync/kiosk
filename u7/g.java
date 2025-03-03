package U7;

import B.B;
import N.e;
import R7.b;
import R7.d;
import R7.h;
import S7.a;
import S7.c;
import S7.k;
import S7.p;
import g7.C0996d;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;

public final class g extends p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5443a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5444b;

    public /* synthetic */ g(int i, String str, boolean z) {
        this.f5443a = i;
        this.f5444b = str;
    }

    public int a() {
        switch (this.f5443a) {
            case 0:
                return 2;
            case 1:
                return 6;
            case 2:
                return 6;
            case 5:
                return 10;
            case 7:
                return 10;
            case 8:
                return 2;
            case 9:
                return 1;
            default:
                return super.a();
        }
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.util.function.BiConsumer, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, java.util.function.BinaryOperator] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.function.BiConsumer, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v9, types: [java.lang.Object, java.util.function.BinaryOperator] */
    public final boolean b(k kVar, k kVar2) {
        String str = "";
        String str2 = this.f5444b;
        switch (this.f5443a) {
            case 0:
                return kVar2.l(str2);
            case 1:
                c e = kVar2.e();
                e.getClass();
                ArrayList arrayList = new ArrayList(e.f4544U);
                for (int i = 0; i < e.f4544U; i++) {
                    String str3 = e.f4545V[i];
                    if (!c.m(str3)) {
                        arrayList.add(new a(str3, (String) e.f4546W[i], e));
                    }
                }
                for (a aVar : DesugarCollections.unmodifiableList(arrayList)) {
                    if (b.a(aVar.f4538U).startsWith(str2)) {
                        return true;
                    }
                }
                return false;
            case 2:
                c cVar = kVar2.f4562a0;
                if (cVar != null) {
                    String h5 = cVar.h("class");
                    int length = h5.length();
                    String str4 = this.f5444b;
                    int length2 = str4.length();
                    if (length != 0 && length >= length2) {
                        if (length == length2) {
                            return str4.equalsIgnoreCase(h5);
                        }
                        boolean z = false;
                        int i8 = 0;
                        for (int i9 = 0; i9 < length; i9++) {
                            if (Character.isWhitespace(h5.charAt(i9))) {
                                if (!z) {
                                    continue;
                                } else if (i9 - i8 == length2 && h5.regionMatches(true, i8, str4, 0, length2)) {
                                    return true;
                                } else {
                                    z = false;
                                }
                            } else if (!z) {
                                i8 = i9;
                                z = true;
                            }
                        }
                        if (z && length - i8 == length2) {
                            return h5.regionMatches(true, i8, str4, 0, length2);
                        }
                    }
                }
                return false;
            case 3:
                kVar2.getClass();
                StringBuilder b8 = h.b();
                D7.b.P(new B(13, b8), kVar2);
                return b.a(h.h(b8)).contains(str2);
            case 4:
                return b.a(kVar2.K()).contains(str2);
            case 5:
                return b.a(kVar2.O()).contains(str2);
            case 6:
                Stream map = Collection.-EL.stream(kVar2.f4561Z).map(new D4.h(9));
                String[] strArr = h.f4371a;
                return ((String) map.collect(Collector.-CC.of(new d(str), new Object(), new Object(), new D4.h(6), new Collector.Characteristics[0]))).contains(str2);
            case 7:
                kVar2.getClass();
                Stream map2 = C0996d.z(kVar2, p.class).map(new D4.h(9));
                String[] strArr2 = h.f4371a;
                return ((String) map2.collect(Collector.-CC.of(new d(str), new Object(), new Object(), new D4.h(6), new Collector.Characteristics[0]))).contains(str2);
            case 8:
                c cVar2 = kVar2.f4562a0;
                if (cVar2 != null) {
                    str = cVar2.h("id");
                }
                return str2.equals(str);
            case 9:
                return kVar2.o(str2);
            case 10:
                return kVar2.f4559X.f5086V.endsWith(str2);
            default:
                return kVar2.f4559X.f5086V.startsWith(str2);
        }
    }

    public final String toString() {
        switch (this.f5443a) {
            case 0:
                return e.A(new StringBuilder("["), this.f5444b, "]");
            case 1:
                return e.A(new StringBuilder("[^"), this.f5444b, "]");
            case 2:
                return "." + this.f5444b;
            case 3:
                return e.A(new StringBuilder(":containsData("), this.f5444b, ")");
            case 4:
                return e.A(new StringBuilder(":containsOwn("), this.f5444b, ")");
            case 5:
                return e.A(new StringBuilder(":contains("), this.f5444b, ")");
            case 6:
                return e.A(new StringBuilder(":containsWholeOwnText("), this.f5444b, ")");
            case 7:
                return e.A(new StringBuilder(":containsWholeText("), this.f5444b, ")");
            case 8:
                return "#" + this.f5444b;
            case 9:
                return this.f5444b;
            case 10:
                return this.f5444b;
            default:
                return this.f5444b;
        }
    }

    public g(String str, int i) {
        this.f5443a = i;
        switch (i) {
            case 3:
                this.f5444b = b.a(str);
                return;
            case 4:
                StringBuilder b8 = h.b();
                h.a(str, b8, false);
                this.f5444b = b.a(h.h(b8));
                return;
            case 5:
                StringBuilder b9 = h.b();
                h.a(str, b9, false);
                this.f5444b = b.a(h.h(b9));
                return;
            default:
                Q7.g.D(str);
                this.f5444b = b.a(str);
                return;
        }
    }
}
