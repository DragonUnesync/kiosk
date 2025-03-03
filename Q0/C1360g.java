package q0;

import android.os.LocaleList;
import h.t;
import java.util.Locale;

/* renamed from: q0.g  reason: case insensitive filesystem */
public final class C1360g implements C1359f {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f14707a;

    public C1360g(Object obj) {
        this.f14707a = t.f(obj);
    }

    public final String a() {
        return this.f14707a.toLanguageTags();
    }

    public final Object b() {
        return this.f14707a;
    }

    public final boolean equals(Object obj) {
        return this.f14707a.equals(((C1359f) obj).b());
    }

    public final Locale get(int i) {
        return this.f14707a.get(i);
    }

    public final int hashCode() {
        return this.f14707a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f14707a.isEmpty();
    }

    public final int size() {
        return this.f14707a.size();
    }

    public final String toString() {
        return this.f14707a.toString();
    }
}
