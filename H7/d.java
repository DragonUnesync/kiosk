package H7;

import j$.nio.file.FileVisitResult;
import j$.nio.file.Path;
import java.io.File;
import java.io.Serializable;

public final class d implements b, Serializable {

    /* renamed from: U  reason: collision with root package name */
    public static final String f2209U = Boolean.TRUE.toString();

    /* renamed from: V  reason: collision with root package name */
    public static final d f2210V = new Object();

    public final FileVisitResult a(Path path) {
        return FileVisitResult.CONTINUE;
    }

    public final boolean accept(File file) {
        return true;
    }

    public final boolean matches(Path path) {
        if (a(path) != FileVisitResult.TERMINATE) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return f2209U;
    }

    public final boolean accept(File file, String str) {
        return true;
    }
}
