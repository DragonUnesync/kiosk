package t7;

import P6.f;
import android.content.Context;
import java.io.File;
import org.acra.file.Directory;

/* renamed from: t7.g  reason: case insensitive filesystem */
public final class C1439g extends Directory {
    public final File getFile(Context context, String str) {
        f.e(context, "context");
        f.e(str, "fileName");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        f.b(noBackupFilesDir);
        return new File(noBackupFilesDir, str);
    }
}
