package N5;

import B.C0002c;
import B.C0004e;
import B.C0005f;
import N.e;
import Z1.c;
import android.app.Service;
import android.os.Handler;
import android.util.Log;
import androidx.lifecycle.A;
import n2.a;
import u.C1480u;

public final /* synthetic */ class m implements A {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3424a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3425b;

    public /* synthetic */ m(int i, Object obj) {
        this.f3424a = i;
        this.f3425b = obj;
    }

    public final void a(Object obj) {
        int i;
        Object obj2 = this.f3425b;
        switch (this.f3424a) {
            case 0:
                C0004e eVar = (C0004e) obj;
                p pVar = (p) obj2;
                pVar.getClass();
                C0005f fVar = eVar.f234b;
                int i8 = eVar.f233a;
                if (fVar != null) {
                    StringBuilder sb = new StringBuilder("CameraState:");
                    sb.append(e.L(i8));
                    sb.append(" Error: ");
                    int i9 = 2;
                    int i10 = fVar.f235a;
                    if (i10 == 2 || i10 == 1 || i10 == 3) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    sb.append(e.K(i));
                    sb.append(" Error code ");
                    sb.append(i10);
                    Log.w("p", sb.toString());
                    if (((c) pVar.f3441b.f9767W).n("showVisualMotionDetectionFailure", true) && System.currentTimeMillis() - pVar.f3438I > 11000) {
                        pVar.f3438I = System.currentTimeMillis();
                        Service service = pVar.f3440a;
                        if (i10 == 2) {
                            a.b1(service, "Camera in use by another app");
                        } else if (i10 == 1) {
                            a.b1(service, "Limit of open cameras reached");
                        } else if (i10 == 3) {
                            a.b1(service, "Other error when opening the cam");
                        } else if (i10 == 5) {
                            if (a.b0(service) < 34 || !a.F0()) {
                                a.b1(service, "Please enable cam and restart the app");
                            } else {
                                a.b1(service, "Read FAQs about using the cam with other apps on Android 14+");
                            }
                        } else if (i10 == 6) {
                            a.b1(service, "Fatal camera error, reboot the device");
                        } else if (i10 == 7) {
                            a.b1(service, "Disable DND mode and restart the app");
                        } else {
                            StringBuilder sb2 = new StringBuilder("Camera failed ");
                            if (i10 == 2 || i10 == 1 || i10 == 3) {
                                i9 = 1;
                            }
                            sb2.append(e.K(i9));
                            sb2.append(" when ");
                            sb2.append(e.L(i8));
                            sb2.append(" with code ");
                            sb2.append(i10);
                            a.b1(service, sb2.toString());
                        }
                    }
                }
                if (i8 != 1 && i8 != 5) {
                    Handler handler = pVar.f3439J;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                        pVar.f3439J = null;
                        return;
                    }
                    return;
                } else if (pVar.f3439J == null) {
                    Handler handler2 = new Handler();
                    pVar.f3439J = handler2;
                    handler2.postDelayed(new C0002c((Object) pVar, 15, (Object) eVar), 10000);
                    return;
                } else {
                    return;
                }
            default:
                ((C1480u) obj2).j(obj);
                return;
        }
    }
}
