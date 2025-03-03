package H7;

import j$.nio.file.FileVisitResult;
import j$.nio.file.FileVisitor;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.util.Objects;
import java.io.File;
import java.io.IOException;

public abstract class a implements b, FileVisitor {

    /* renamed from: U  reason: collision with root package name */
    public final FileVisitResult f2207U;

    /* renamed from: V  reason: collision with root package name */
    public final FileVisitResult f2208V;

    public a() {
        this(FileVisitResult.CONTINUE, FileVisitResult.TERMINATE);
    }

    public abstract boolean accept(File file);

    public final boolean accept(File file, String str) {
        Objects.requireNonNull(str, "name");
        return accept(new File(file, str));
    }

    public final boolean matches(Path path) {
        if (((c) this).a(path) != FileVisitResult.TERMINATE) {
            return true;
        }
        return false;
    }

    public final FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
        Path path = (Path) obj;
        return FileVisitResult.CONTINUE;
    }

    public final FileVisitResult preVisitDirectory(Object obj, BasicFileAttributes basicFileAttributes) {
        return ((c) this).a((Path) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public final FileVisitResult visitFile(Object obj, BasicFileAttributes basicFileAttributes) {
        return ((c) this).a((Path) obj);
    }

    public final FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        Path path = (Path) obj;
        return FileVisitResult.CONTINUE;
    }

    public a(FileVisitResult fileVisitResult, FileVisitResult fileVisitResult2) {
        this.f2207U = fileVisitResult;
        this.f2208V = fileVisitResult2;
    }
}
