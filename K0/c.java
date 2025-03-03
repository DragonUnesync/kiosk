package k0;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f12902a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f12903b = new HashMap();

    public c(String str) {
        this.f12902a = str;
    }

    public static boolean a(String str, String str2) {
        String a8 = FileProvider.a(str);
        String a9 = FileProvider.a(str2);
        if (!a8.equals(a9)) {
            if (a8.startsWith(a9 + '/')) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final File b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.f12903b.get(decode);
        if (file != null) {
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (a(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        } else {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
    }
}
