package U7;

import D4.h;
import R7.d;
import S7.k;
import S7.p;
import g7.C0996d;
import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.regex.Pattern;

public final class o extends p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5456a;

    /* renamed from: b  reason: collision with root package name */
    public final Pattern f5457b;

    public /* synthetic */ o(Pattern pattern, int i) {
        this.f5456a = i;
        this.f5457b = pattern;
    }

    public final int a() {
        switch (this.f5456a) {
            case 0:
                return 8;
            case 1:
                return 7;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.function.BiConsumer, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, java.util.function.BinaryOperator] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.function.BiConsumer, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.lang.Object, java.util.function.BinaryOperator] */
    public final boolean b(k kVar, k kVar2) {
        Pattern pattern = this.f5457b;
        switch (this.f5456a) {
            case 0:
                return pattern.matcher(kVar2.O()).find();
            case 1:
                return pattern.matcher(kVar2.K()).find();
            case 2:
                Stream map = Collection.-EL.stream(kVar2.f4561Z).map(new h(9));
                String[] strArr = R7.h.f4371a;
                return pattern.matcher((String) map.collect(Collector.-CC.of(new d(""), new Object(), new Object(), new h(6), new Collector.Characteristics[0]))).find();
            default:
                kVar2.getClass();
                Stream map2 = C0996d.z(kVar2, p.class).map(new h(9));
                String[] strArr2 = R7.h.f4371a;
                return pattern.matcher((String) map2.collect(Collector.-CC.of(new d(""), new Object(), new Object(), new h(6), new Collector.Characteristics[0]))).find();
        }
    }

    public final String toString() {
        switch (this.f5456a) {
            case 0:
                return ":matches(" + this.f5457b + ")";
            case 1:
                return ":matchesOwn(" + this.f5457b + ")";
            case 2:
                return ":matchesWholeOwnText(" + this.f5457b + ")";
            default:
                return ":matchesWholeText(" + this.f5457b + ")";
        }
    }
}
