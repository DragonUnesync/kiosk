package g2;

import Y.e;
import Y.i;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final C0948a f11994a;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal f11995b = new ThreadLocal();

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayList f11996c = new ArrayList();

    /* JADX WARNING: type inference failed for: r0v0, types: [g2.a, g2.p] */
    static {
        ? pVar = new p();
        pVar.f11926w0 = new ArrayList();
        pVar.f11927x0 = true;
        pVar.f11929z0 = false;
        pVar.f11925A0 = 0;
        pVar.f11927x0 = false;
        pVar.L(new C0955h(2));
        pVar.L(new p());
        pVar.L(new C0955h(1));
        f11994a = pVar;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, g2.s] */
    public static void a(FrameLayout frameLayout, p pVar) {
        ArrayList arrayList = f11996c;
        if (!arrayList.contains(frameLayout) && frameLayout.isLaidOut()) {
            arrayList.add(frameLayout);
            if (pVar == null) {
                pVar = f11994a;
            }
            p j7 = pVar.clone();
            ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).x(frameLayout);
                }
            }
            j7.h(frameLayout, true);
            if (frameLayout.getTag(2131362591) == null) {
                frameLayout.setTag(2131362591, (Object) null);
                ? obj = new Object();
                obj.f11992U = j7;
                obj.f11993V = frameLayout;
                frameLayout.addOnAttachStateChangeListener(obj);
                frameLayout.getViewTreeObserver().addOnPreDrawListener(obj);
                return;
            }
            throw new ClassCastException();
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [Y.e, Y.i, java.lang.Object] */
    public static e b() {
        e eVar;
        ThreadLocal threadLocal = f11995b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (e) weakReference.get()) != null) {
            return eVar;
        }
        ? iVar = new i((Object) null);
        threadLocal.set(new WeakReference(iVar));
        return iVar;
    }
}
