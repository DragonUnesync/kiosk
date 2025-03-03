package b;

import android.print.PageRange;
import android.print.PrintDocumentAdapter;
import de.ozerov.fully.MyWebView;

/* renamed from: b.c  reason: case insensitive filesystem */
public final class C0517c extends PrintDocumentAdapter.WriteResultCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PrintDocumentAdapter.WriteResultCallback f8602a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0518d f8603b;

    public C0517c(C0518d dVar, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        this.f8603b = dVar;
        this.f8602a = writeResultCallback;
    }

    public final void onWriteCancelled() {
        String str = this.f8603b.f8604a;
        super.onWriteCancelled();
        this.f8602a.onWriteCancelled();
    }

    public final void onWriteFailed(CharSequence charSequence) {
        String str = this.f8603b.f8604a;
        super.onWriteFailed(charSequence);
        this.f8602a.onWriteFailed(charSequence);
    }

    public final void onWriteFinished(PageRange[] pageRangeArr) {
        C0518d dVar = this.f8603b;
        String str = dVar.f8604a;
        super.onWriteFinished(pageRangeArr);
        this.f8602a.onWriteFinished(pageRangeArr);
        ((MyWebView) dVar.f8606c.f7669V).f10143x0 = 9;
    }
}
