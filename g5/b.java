package G5;

import A.f;
import A1.d;
import B.C0002c;
import D2.G;
import D2.o;
import H5.k;
import M3.n;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.util.List;

public final class b implements Handler.Callback {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1660U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ BarcodeView f1661V;

    public /* synthetic */ b(BarcodeView barcodeView, int i) {
        this.f1660U = i;
        this.f1661V = barcodeView;
    }

    public final boolean handleMessage(Message message) {
        d dVar;
        o oVar;
        Message message2 = message;
        switch (this.f1660U) {
            case 0:
                int i = message2.what;
                BarcodeView barcodeView = this.f1661V;
                if (i == 2131362664) {
                    a aVar = (a) message2.obj;
                    if (aVar == null || (dVar = barcodeView.f9518y0) == null || barcodeView.f9517x0 == 1) {
                        return true;
                    }
                    f fVar = (f) dVar.f35V;
                    ((i) fVar.f17V).f1698b.f9522U.g();
                    G g8 = ((i) fVar.f17V).i;
                    synchronized (g8) {
                        if (g8.f1051U) {
                            g8.i();
                        }
                    }
                    ((i) fVar.f17V).f1704j.post(new C0002c((Object) fVar, 8, (Object) aVar));
                    if (barcodeView.f9517x0 != 2) {
                        return true;
                    }
                    barcodeView.f9517x0 = 1;
                    barcodeView.f9518y0 = null;
                    barcodeView.i();
                    return true;
                } else if (i == 2131362663) {
                    return true;
                } else {
                    if (i != 2131362666) {
                        return false;
                    }
                    List<n> list = (List) message2.obj;
                    d dVar2 = barcodeView.f9518y0;
                    if (dVar2 == null || barcodeView.f9517x0 == 1) {
                        return true;
                    }
                    dVar2.getClass();
                    for (n nVar : list) {
                        ViewfinderView viewfinderView = ((DecoratedBarcodeView) dVar2.f36W).f9523V;
                        if (viewfinderView.f9532d0.size() < 20) {
                            viewfinderView.f9532d0.add(nVar);
                        }
                    }
                    return true;
                }
            default:
                int i8 = message2.what;
                BarcodeView barcodeView2 = this.f1661V;
                e eVar = barcodeView2.f1691v0;
                if (i8 == 2131362668) {
                    v vVar = (v) message2.obj;
                    barcodeView2.f1681k0 = vVar;
                    v vVar2 = barcodeView2.f1680j0;
                    if (vVar2 == null) {
                        return true;
                    }
                    if (vVar == null || (oVar = barcodeView2.f1678h0) == null) {
                        barcodeView2.f1685o0 = null;
                        barcodeView2.f1684n0 = null;
                        barcodeView2.f1682l0 = null;
                        throw new IllegalStateException("containerSize or previewSize is not set yet");
                    }
                    Rect b8 = ((k) oVar.f1139X).b(vVar, (v) oVar.f1138W);
                    if (b8.width() > 0 && b8.height() > 0) {
                        barcodeView2.f1682l0 = b8;
                        Rect rect = new Rect(0, 0, vVar2.f1735U, vVar2.f1736V);
                        Rect rect2 = barcodeView2.f1682l0;
                        Rect rect3 = new Rect(rect);
                        rect3.intersect(rect2);
                        if (barcodeView2.p0 != null) {
                            rect3.inset(Math.max(0, (rect3.width() - barcodeView2.p0.f1735U) / 2), Math.max(0, (rect3.height() - barcodeView2.p0.f1736V) / 2));
                        } else {
                            int min = (int) Math.min(((double) rect3.width()) * barcodeView2.f1686q0, ((double) rect3.height()) * barcodeView2.f1686q0);
                            rect3.inset(min, min);
                            if (rect3.height() > rect3.width()) {
                                rect3.inset(0, (rect3.height() - rect3.width()) / 2);
                            }
                        }
                        barcodeView2.f1684n0 = rect3;
                        Rect rect4 = new Rect(barcodeView2.f1684n0);
                        Rect rect5 = barcodeView2.f1682l0;
                        rect4.offset(-rect5.left, -rect5.top);
                        int i9 = rect4.left;
                        int i10 = vVar.f1735U;
                        int width = (i9 * i10) / barcodeView2.f1682l0.width();
                        int i11 = rect4.top;
                        int i12 = vVar.f1736V;
                        Rect rect6 = new Rect(width, (i11 * i12) / barcodeView2.f1682l0.height(), (rect4.right * i10) / barcodeView2.f1682l0.width(), (rect4.bottom * i12) / barcodeView2.f1682l0.height());
                        barcodeView2.f1685o0 = rect6;
                        if (rect6.width() <= 0 || barcodeView2.f1685o0.height() <= 0) {
                            barcodeView2.f1685o0 = null;
                            barcodeView2.f1684n0 = null;
                            Log.w("f", "Preview frame is too small");
                        } else {
                            eVar.e();
                        }
                    }
                    barcodeView2.requestLayout();
                    barcodeView2.e();
                    return true;
                }
                if (i8 == 2131362661) {
                    Exception exc = (Exception) message2.obj;
                    if (barcodeView2.f1668U != null) {
                        barcodeView2.g();
                        eVar.c(exc);
                    }
                } else if (i8 == 2131362660) {
                    eVar.a();
                }
                return false;
        }
    }
}
