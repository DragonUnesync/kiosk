package H7;

import j$.io.FileRetargetClass;
import j$.nio.file.FileVisitResult;
import j$.nio.file.Files;
import j$.nio.file.Path;
import java.io.File;
import java.io.Serializable;

public final class c extends a implements Serializable {
    static {
        new a();
    }

    public final FileVisitResult a(Path path) {
        if (Files.isSymbolicLink(path)) {
            return this.f2207U;
        }
        return this.f2208V;
    }

    public final boolean accept(File file) {
        return Files.isSymbolicLink(FileRetargetClass.toPath(file));
    }
}
