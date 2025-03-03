package b;

import a1.C0410a;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.util.Log;
import java.io.File;

/* renamed from: b.b  reason: case insensitive filesystem */
public final class C0516b extends PrintDocumentAdapter.LayoutResultCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PrintDocumentAdapter f8600a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ File f8601b;

    public C0516b(C0410a aVar, PrintDocumentAdapter printDocumentAdapter, File file) {
        this.f8600a = printDocumentAdapter;
        this.f8601b = file;
    }

    public final void onLayoutFinished(PrintDocumentInfo printDocumentInfo, boolean z) {
        ParcelFileDescriptor parcelFileDescriptor;
        PageRange[] pageRangeArr = {PageRange.ALL_PAGES};
        File file = this.f8601b;
        try {
            file.createNewFile();
            parcelFileDescriptor = ParcelFileDescriptor.open(file, 805306368);
        } catch (Exception e) {
            Log.e("a", "Failed to open ParcelFileDescriptor", e);
            parcelFileDescriptor = null;
        }
        this.f8600a.onWrite(pageRangeArr, parcelFileDescriptor, new CancellationSignal(), new C0515a());
    }
}
