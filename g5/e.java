package G5;

import android.graphics.Rect;
import android.util.Log;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.ViewfinderView;
import java.util.Iterator;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1665a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1666b;

    public /* synthetic */ e(int i, Object obj) {
        this.f1665a = i;
        this.f1666b = obj;
    }

    private final void b() {
    }

    private final void d(Exception exc) {
    }

    private final void f() {
    }

    private final void h() {
    }

    private final void i() {
    }

    private final void k() {
    }

    private final void l() {
    }

    public final void a() {
        Object obj = this.f1666b;
        switch (this.f1665a) {
            case 0:
                Iterator it = ((BarcodeView) obj).f1677g0.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a();
                }
                return;
            case 1:
                i iVar = (i) obj;
                if (iVar.f1705k) {
                    Log.d("i", "Camera closed; finishing activity");
                    iVar.f1697a.finish();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void c(Exception exc) {
        switch (this.f1665a) {
            case 0:
                Iterator it = ((BarcodeView) this.f1666b).f1677g0.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c(exc);
                }
                return;
            case 1:
                i iVar = (i) this.f1666b;
                iVar.b(iVar.f1697a.getString(2131951974));
                return;
            default:
                return;
        }
    }

    public final void e() {
        switch (this.f1665a) {
            case 0:
                Iterator it = ((BarcodeView) this.f1666b).f1677g0.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).e();
                }
                return;
            case 1:
                return;
            default:
                ViewfinderView viewfinderView = (ViewfinderView) this.f1666b;
                f fVar = viewfinderView.f9534f0;
                if (fVar != null) {
                    Rect framingRect = fVar.getFramingRect();
                    v previewSize = viewfinderView.f9534f0.getPreviewSize();
                    if (!(framingRect == null || previewSize == null)) {
                        viewfinderView.f9535g0 = framingRect;
                        viewfinderView.f9536h0 = previewSize;
                    }
                }
                viewfinderView.invalidate();
                return;
        }
    }

    public final void g() {
        switch (this.f1665a) {
            case 0:
                Iterator it = ((BarcodeView) this.f1666b).f1677g0.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).g();
                }
                return;
            default:
                return;
        }
    }

    public final void j() {
        switch (this.f1665a) {
            case 0:
                Iterator it = ((BarcodeView) this.f1666b).f1677g0.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).j();
                }
                return;
            default:
                return;
        }
    }
}
