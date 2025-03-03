package t7;

import P6.f;
import android.content.Context;
import java.io.File;
import org.acra.file.Directory;

/* renamed from: t7.a  reason: case insensitive filesystem */
public final class C1433a extends Directory {
    public final File getFile(Context context, String str) {
        f.e(context, "context");
        f.e(str, "fileName");
        return new File(context.getCacheDir(), str);
    }
}
