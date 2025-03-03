package u7;

import C6.c;
import P6.f;
import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.b;
import g7.C0996d;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.attachment.AcraContentProvider;
import org.acra.sender.HttpSender$Method;
import r7.C1395d;

/* renamed from: u7.c  reason: case insensitive filesystem */
public final class C1501c extends C1499a {

    /* renamed from: j  reason: collision with root package name */
    public final Context f15827j;

    /* renamed from: k  reason: collision with root package name */
    public final String f15828k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1501c(C1395d dVar, Context context, String str, String str2, String str3, int i, int i8, Map map) {
        super(dVar, context, HttpSender$Method.POST, str2, str3, i, i8, map);
        f.e(dVar, "config");
        f.e(context, "context");
        f.e(str, "contentType");
        this.f15827j = context;
        this.f15828k = str;
    }

    public final String b(Context context, Object obj) {
        f.e(context, "context");
        f.e((c) obj, "t");
        return "multipart/form-data; boundary=%&ACRA_REPORT_DIVIDER&%";
    }

    public final void e(FilterOutputStream filterOutputStream, Object obj) {
        String str;
        FilterOutputStream filterOutputStream2 = filterOutputStream;
        c cVar = (c) obj;
        Context context = this.f15827j;
        f.e(cVar, "content");
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(filterOutputStream2, "UTF-8"));
        printWriter.append("--%&ACRA_REPORT_DIVIDER&%\r\n").format("Content-Disposition: form-data; name=\"%s\"", new Object[]{"ACRA_REPORT"}).append("\r\n").format("Content-Type: %s\r\n", new Object[]{this.f15828k}).append("\r\n").append((CharSequence) cVar.f711U).append("\r\n");
        for (Uri uri : (List) cVar.f712V) {
            try {
                String n4 = b.n(context, uri);
                PrintWriter append = printWriter.append("--%&ACRA_REPORT_DIVIDER&%\r\n").format("Content-Disposition: form-data; name=\"%s\"; filename=\"%s\"", new Object[]{"ACRA_ATTACHMENT", n4}).append("\r\n");
                if (!f.a(uri.getScheme(), "content") || (str = context.getContentResolver().getType(uri)) == null) {
                    String[] strArr = AcraContentProvider.f14285V;
                    str = C0996d.i(uri);
                }
                append.format("Content-Type: %s\r\n", new Object[]{str}).append("\r\n").flush();
                b.i(context, filterOutputStream2, uri);
                printWriter.append("\r\n");
            } catch (FileNotFoundException e) {
                ErrorReporter errorReporter = C1247a.f13789a;
                a.n1("Not sending attachment", e);
            }
        }
        printWriter.append("--%&ACRA_REPORT_DIVIDER&%--\r\n").flush();
    }
}
