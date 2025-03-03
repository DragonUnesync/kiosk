package t7;

import P6.f;
import android.content.Context;
import java.io.File;
import org.acra.file.Directory;

/* renamed from: t7.c  reason: case insensitive filesystem */
public final class C1435c extends Directory {
    public final File getFile(Context context, String str) {
        f.e(context, "context");
        f.e(str, "fileName");
        return new File(context.getExternalFilesDir((String) null), str);
    }
}
