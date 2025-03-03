package G;

import L3.b;
import a0.j;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.g;
import androidx.activity.result.e;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d4.k;
import de.ozerov.fully.C0798w4;
import j0.C1113b;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import n2.a;

public final class l implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1615U;

    /* renamed from: V  reason: collision with root package name */
    public int f1616V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f1617W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f1618X;

    public /* synthetic */ l(Object obj, int i, Object obj2, int i8) {
        this.f1615U = i8;
        this.f1618X = obj;
        this.f1616V = i;
        this.f1617W = obj2;
    }

    public final void run() {
        j jVar;
        ArrayList arrayList;
        switch (this.f1615U) {
            case 0:
                int i = this.f1616V;
                b bVar = (b) this.f1617W;
                m mVar = (m) this.f1618X;
                AtomicInteger atomicInteger = mVar.f1622X;
                ArrayList arrayList2 = mVar.f1620V;
                boolean isDone = mVar.isDone();
                boolean z = mVar.f1621W;
                if (isDone || arrayList2 == null) {
                    a.m("Future was done before all dependencies completed", z);
                    return;
                }
                boolean z6 = true;
                try {
                    a.m("Tried to set value from future which is not done", bVar.isDone());
                    arrayList2.set(i, i.b(bVar));
                    int decrementAndGet = atomicInteger.decrementAndGet();
                    if (decrementAndGet < 0) {
                        z6 = false;
                    }
                    a.m("Less than 0 remaining futures", z6);
                    if (decrementAndGet == 0) {
                        ArrayList arrayList3 = mVar.f1620V;
                        if (arrayList3 != null) {
                            jVar = mVar.f1624Z;
                            arrayList = new ArrayList(arrayList3);
                            jVar.a(arrayList);
                            return;
                        }
                        a.m((String) null, mVar.isDone());
                        return;
                    }
                    return;
                } catch (CancellationException unused) {
                    if (z) {
                        mVar.cancel(false);
                    }
                    int decrementAndGet2 = atomicInteger.decrementAndGet();
                    if (decrementAndGet2 < 0) {
                        z6 = false;
                    }
                    a.m("Less than 0 remaining futures", z6);
                    if (decrementAndGet2 == 0) {
                        ArrayList arrayList4 = mVar.f1620V;
                        if (arrayList4 != null) {
                            jVar = mVar.f1624Z;
                            arrayList = new ArrayList(arrayList4);
                        }
                    } else {
                        return;
                    }
                } catch (ExecutionException e) {
                    if (z) {
                        mVar.f1624Z.b(e.getCause());
                    }
                    int decrementAndGet3 = atomicInteger.decrementAndGet();
                    if (decrementAndGet3 < 0) {
                        z6 = false;
                    }
                    a.m("Less than 0 remaining futures", z6);
                    if (decrementAndGet3 == 0) {
                        ArrayList arrayList5 = mVar.f1620V;
                        if (arrayList5 != null) {
                            jVar = mVar.f1624Z;
                            arrayList = new ArrayList(arrayList5);
                        }
                    } else {
                        return;
                    }
                } catch (RuntimeException e8) {
                    if (z) {
                        mVar.f1624Z.b(e8);
                    }
                    int decrementAndGet4 = atomicInteger.decrementAndGet();
                    if (decrementAndGet4 < 0) {
                        z6 = false;
                    }
                    a.m("Less than 0 remaining futures", z6);
                    if (decrementAndGet4 == 0) {
                        ArrayList arrayList6 = mVar.f1620V;
                        if (arrayList6 != null) {
                            jVar = mVar.f1624Z;
                            arrayList = new ArrayList(arrayList6);
                        }
                    } else {
                        return;
                    }
                } catch (Error e9) {
                    mVar.f1624Z.b(e9);
                    int decrementAndGet5 = atomicInteger.decrementAndGet();
                    if (decrementAndGet5 < 0) {
                        z6 = false;
                    }
                    a.m("Less than 0 remaining futures", z6);
                    if (decrementAndGet5 == 0) {
                        ArrayList arrayList7 = mVar.f1620V;
                        if (arrayList7 != null) {
                            jVar = mVar.f1624Z;
                            arrayList = new ArrayList(arrayList7);
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th) {
                    int decrementAndGet6 = atomicInteger.decrementAndGet();
                    if (decrementAndGet6 < 0) {
                        z6 = false;
                    }
                    a.m("Less than 0 remaining futures", z6);
                    if (decrementAndGet6 == 0) {
                        ArrayList arrayList8 = mVar.f1620V;
                        if (arrayList8 != null) {
                            mVar.f1624Z.a(new ArrayList(arrayList8));
                        } else {
                            a.m((String) null, mVar.isDone());
                        }
                    }
                    throw th;
                }
            case 1:
                Object obj = ((Y0.b) this.f1617W).f6312a;
                g gVar = (g) this.f1618X;
                String str = (String) gVar.f7335a.get(Integer.valueOf(this.f1616V));
                if (str != null) {
                    e eVar = (e) gVar.e.get(str);
                    if (eVar != null) {
                        androidx.activity.result.b bVar2 = eVar.f7331a;
                        if (gVar.f7338d.remove(str)) {
                            bVar2.b(obj);
                            return;
                        }
                        return;
                    }
                    gVar.f7340g.remove(str);
                    gVar.f7339f.put(str, obj);
                    return;
                }
                return;
            case 2:
                ((g) this.f1618X).a(this.f1616V, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f1617W));
                return;
            case 3:
                ((Button) this.f1617W).setText(N.e.z(new StringBuilder("Got it ("), this.f1616V, ")"));
                int i8 = this.f1616V - 1;
                this.f1616V = i8;
                if (i8 == 0) {
                    ((k) this.f1618X).V2("lastVersionInfo", "1.17.1");
                    C0798w4.a();
                    return;
                }
                C0798w4.f11051b.postDelayed(this, 1000);
                return;
            case 4:
                String[] strArr = (String[]) this.f1617W;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) this.f1618X;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                for (int i9 = 0; i9 < length; i9++) {
                    iArr[i9] = packageManager.checkPermission(strArr[i9], packageName);
                }
                ((C1113b) activity).onRequestPermissionsResult(this.f1616V, strArr, iArr);
                return;
            case 5:
                ((BottomSheetBehavior) this.f1618X).E((View) this.f1617W, this.f1616V, false);
                return;
            default:
                ((TextView) this.f1617W).setTypeface((Typeface) this.f1618X, this.f1616V);
                return;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, int i, int i8) {
        this.f1615U = i8;
        this.f1617W = obj;
        this.f1618X = obj2;
        this.f1616V = i;
    }

    public l(Button button, k kVar) {
        this.f1615U = 3;
        this.f1617W = button;
        this.f1618X = kVar;
        this.f1616V = 60;
    }

    public l(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f1615U = 5;
        this.f1618X = bottomSheetBehavior;
        this.f1617W = view;
        this.f1616V = i;
    }
}
