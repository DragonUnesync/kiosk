package t7;

import P6.f;
import W6.l;
import android.content.Context;
import java.io.File;
import org.acra.file.Directory;

/* renamed from: t7.f  reason: case insensitive filesystem */
public final class C1438f extends Directory {
    public final File getFile(Context context, String str) {
        Directory directory;
        f.e(context, "context");
        f.e(str, "fileName");
        if (l.a0(str, "/", false)) {
            directory = Directory.ROOT;
        } else {
            directory = Directory.FILES;
        }
        return directory.getFile(context, str);
    }
}
