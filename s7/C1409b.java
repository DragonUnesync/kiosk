package s7;

import D6.h;
import D6.i;
import P6.f;
import Q.a;
import android.app.Application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.acra.collector.Collector;
import r7.C1395d;
import x7.c;

/* renamed from: s7.b  reason: case insensitive filesystem */
public final class C1409b {

    /* renamed from: a  reason: collision with root package name */
    public final Application f15156a;

    /* renamed from: b  reason: collision with root package name */
    public final C1395d f15157b;

    /* renamed from: c  reason: collision with root package name */
    public final List f15158c;

    public C1409b(Application application, C1395d dVar) {
        List list;
        this.f15156a = application;
        this.f15157b = dVar;
        ArrayList a8 = ((c) dVar.f14977t0).a(dVar, Collector.class);
        a aVar = new a(2, this);
        if (a8.size() <= 1) {
            list = i.U(a8);
        } else {
            Object[] array = a8.toArray(new Object[0]);
            f.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, aVar);
            }
            list = h.A(array);
        }
        this.f15158c = list;
    }
}
