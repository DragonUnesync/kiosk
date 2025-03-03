package U;

import D.C0054l;
import D.C0060o;
import D.C0064s;
import D.C0069x;
import F.h;
import P0.g;
import a0.j;
import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class c extends C0054l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5253a = 1;

    /* renamed from: b  reason: collision with root package name */
    public Object f5254b;

    /* renamed from: c  reason: collision with root package name */
    public Object f5255c;

    public /* synthetic */ c() {
    }

    public void a(int i) {
        switch (this.f5253a) {
            case 1:
                Iterator it = ((HashSet) this.f5254b).iterator();
                while (it.hasNext()) {
                    C0054l lVar = (C0054l) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.f5255c).get(lVar)).execute(new A3.c(i, 9, (Object) lVar));
                    } catch (RejectedExecutionException e) {
                        h.m("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                    }
                }
                return;
            default:
                return;
        }
    }

    public final void b(int i, C0064s sVar) {
        switch (this.f5253a) {
            case 0:
                ((j) this.f5254b).a((Object) null);
                ((C0069x) this.f5255c).i(this);
                return;
            default:
                Iterator it = ((HashSet) this.f5254b).iterator();
                while (it.hasNext()) {
                    C0054l lVar = (C0054l) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.f5255c).get(lVar)).execute(new g((Object) lVar, i, (Object) sVar, 5));
                    } catch (RejectedExecutionException e) {
                        h.m("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                    }
                }
                return;
        }
    }

    public void c(int i, C0060o oVar) {
        switch (this.f5253a) {
            case 1:
                Iterator it = ((HashSet) this.f5254b).iterator();
                while (it.hasNext()) {
                    C0054l lVar = (C0054l) it.next();
                    try {
                        ((Executor) ((ArrayMap) this.f5255c).get(lVar)).execute(new g((Object) lVar, i, (Object) oVar, 4));
                    } catch (RejectedExecutionException e) {
                        h.m("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                    }
                }
                return;
            default:
                return;
        }
    }

    public c(j jVar, C0069x xVar) {
        this.f5254b = jVar;
        this.f5255c = xVar;
    }
}
