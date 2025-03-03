package r0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: r0.e  reason: case insensitive filesystem */
public final class C1371e implements Callable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f14798U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ String f14799V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Context f14800W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ int f14801X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Object f14802Y;

    public /* synthetic */ C1371e(String str, Context context, Object obj, int i, int i8) {
        this.f14798U = i8;
        this.f14799V = str;
        this.f14800W = context;
        this.f14802Y = obj;
        this.f14801X = i;
    }

    public final Object call() {
        int i = this.f14801X;
        Object obj = this.f14802Y;
        Context context = this.f14800W;
        String str = this.f14799V;
        switch (this.f14798U) {
            case 0:
                Object[] objArr = {(C1370d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return C1373g.b(str, context, DesugarCollections.unmodifiableList(arrayList), i);
            default:
                try {
                    return C1373g.b(str, context, (List) obj, i);
                } catch (Throwable unused) {
                    return new C1372f(-3);
                }
        }
    }
}
