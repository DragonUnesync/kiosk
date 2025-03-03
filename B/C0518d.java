package b;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import androidx.camera.lifecycle.c;
import de.ozerov.fully.MyWebView;

/* renamed from: b.d  reason: case insensitive filesystem */
public final class C0518d extends PrintDocumentAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final String f8604a = C0518d.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public final PrintDocumentAdapter f8605b;

    /* renamed from: c  reason: collision with root package name */
    public final c f8606c;

    public C0518d(PrintDocumentAdapter printDocumentAdapter, c cVar) {
        this.f8605b = printDocumentAdapter;
        this.f8606c = cVar;
    }

    public final void onFinish() {
        this.f8605b.onFinish();
    }

    public final void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        ((MyWebView) this.f8606c.f7669V).f10143x0 = 2;
        this.f8605b.onLayout(printAttributes, printAttributes2, cancellationSignal, layoutResultCallback, bundle);
    }

    public final void onStart() {
        ((MyWebView) this.f8606c.f7669V).f10143x0 = 1;
        this.f8605b.onStart();
    }

    public final void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        this.f8605b.onWrite(pageRangeArr, parcelFileDescriptor, cancellationSignal, new C0517c(this, writeResultCallback));
    }
}
