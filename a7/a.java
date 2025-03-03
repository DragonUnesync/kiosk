package A7;

import P6.f;
import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import n7.C1247a;
import org.acra.ErrorReporter;

public final class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f130b;

    /* renamed from: c  reason: collision with root package name */
    public final String f131c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(int i, String str, String str2) {
        super(str);
        this.f130b = i;
        switch (i) {
            case 1:
                f.e(str2, "filePath");
                f.b(str);
                super(str);
                this.f131c = str2;
                return;
            default:
                f.e(str, "certificateType");
                this.f131c = str2;
                return;
        }
    }

    public final InputStream a(Context context) {
        String str = this.f131c;
        int i = this.f130b;
        f.e(context, "context");
        switch (i) {
            case 0:
                try {
                    return context.getAssets().open(str);
                } catch (IOException e) {
                    ErrorReporter errorReporter = C1247a.f13789a;
                    n2.a.B("Could not open certificate in asset://" + str, e);
                    return null;
                }
            default:
                try {
                    return new FileInputStream(str);
                } catch (FileNotFoundException e8) {
                    ErrorReporter errorReporter2 = C1247a.f13789a;
                    n2.a.B("Could not find File " + str, e8);
                    return null;
                }
        }
    }
}
