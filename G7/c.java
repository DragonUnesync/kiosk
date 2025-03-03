package G7;

import B.B;
import H7.a;
import H7.b;
import H7.d;
import j$.nio.file.FileVisitResult;
import j$.nio.file.FileVisitor;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.SimpleFileVisitor;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.util.Objects;
import java.io.IOException;

public class c extends SimpleFileVisitor implements FileVisitor {

    /* renamed from: U  reason: collision with root package name */
    public final B f1747U = new B(6, this);

    /* renamed from: V  reason: collision with root package name */
    public final b f1748V;

    /* renamed from: W  reason: collision with root package name */
    public final H7.c f1749W;

    /* renamed from: X  reason: collision with root package name */
    public final b f1750X;

    /* JADX WARNING: type inference failed for: r0v0, types: [H7.a, H7.c] */
    public c(b bVar) {
        ? aVar = new a(FileVisitResult.TERMINATE, FileVisitResult.CONTINUE);
        d dVar = d.f2210V;
        this.f1748V = bVar;
        this.f1749W = aVar;
        this.f1750X = dVar;
    }

    /* renamed from: a */
    public FileVisitResult postVisitDirectory(Path path, IOException iOException) {
        this.f1748V.f1745b.f1743a++;
        return FileVisitResult.CONTINUE;
    }

    /* renamed from: b */
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult a8 = this.f1750X.a(path);
        FileVisitResult fileVisitResult = FileVisitResult.CONTINUE;
        if (a8 != fileVisitResult) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        return fileVisitResult;
    }

    /* renamed from: c */
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        if (Files.exists(path, new LinkOption[0]) && this.f1749W.a(path) == FileVisitResult.CONTINUE) {
            b bVar = this.f1748V;
            bVar.f1746c.f1743a++;
            bVar.f1744a.f1743a += basicFileAttributes.size();
        }
        return FileVisitResult.CONTINUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return Objects.equals(this.f1748V, ((c) obj).f1748V);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f1748V});
    }

    public final String toString() {
        return this.f1748V.toString();
    }

    public final FileVisitResult visitFileFailed(Object obj, IOException iOException) {
        B b8 = this.f1747U;
        b8.getClass();
        return c.super.visitFileFailed((Path) obj, iOException);
    }
}
