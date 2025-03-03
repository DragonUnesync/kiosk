package t7;

import P6.f;
import android.content.Context;
import android.os.Environment;
import java.io.File;
import org.acra.file.Directory;

/* renamed from: t7.d  reason: case insensitive filesystem */
public final class C1436d extends Directory {
    public final File getFile(Context context, String str) {
        f.e(context, "context");
        f.e(str, "fileName");
        return new File(Environment.getExternalStorageDirectory(), str);
    }
}
