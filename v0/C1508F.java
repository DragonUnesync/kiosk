package v0;

import android.view.ContentInfo;
import android.view.View;
import j$.util.Objects;
import k2.C1160q;

/* renamed from: v0.F  reason: case insensitive filesystem */
public abstract class C1508F {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C1533f b(View view, C1533f fVar) {
        ContentInfo t8 = fVar.f15939a.t();
        Objects.requireNonNull(t8);
        ContentInfo performReceiveContent = view.performReceiveContent(t8);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == t8) {
            return fVar;
        }
        return new C1533f(new C1160q(performReceiveContent));
    }
}
