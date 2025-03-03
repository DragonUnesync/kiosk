package v7;

import d4.k;
import de.ozerov.fully.MyApplication;
import java.io.File;
import java.util.concurrent.Callable;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.interaction.ReportInteraction;
import r7.C1395d;

public final /* synthetic */ class b implements Callable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ ReportInteraction f16143U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ k f16144V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ File f16145W;

    public /* synthetic */ b(ReportInteraction reportInteraction, k kVar, File file) {
        this.f16143U = reportInteraction;
        this.f16144V = kVar;
        this.f16145W = file;
    }

    public final Object call() {
        ErrorReporter errorReporter = C1247a.f13789a;
        k kVar = this.f16144V;
        return Boolean.valueOf(this.f16143U.performInteraction((MyApplication) kVar.f9766V, (C1395d) kVar.f9767W, this.f16145W));
    }
}
