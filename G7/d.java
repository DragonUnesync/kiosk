package G7;

import E7.f;
import j$.nio.file.FileVisitResult;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.NoSuchFileException;
import java.util.Arrays;

public final class d extends c {

    /* renamed from: Y  reason: collision with root package name */
    public final String[] f1751Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f1752Z;

    /* renamed from: a0  reason: collision with root package name */
    public final LinkOption[] f1753a0;

    public d(b bVar, LinkOption[] linkOptionArr, g[] gVarArr, String... strArr) {
        super(bVar);
        boolean z;
        LinkOption[] linkOptionArr2;
        String[] strArr2 = (String[]) strArr.clone();
        Arrays.sort(strArr2);
        this.f1751Y = strArr2;
        byte[] bArr = f.f1385a;
        if (gVarArr.length == 0) {
            z = false;
        } else {
            z = Stream.-CC.of(gVarArr).anyMatch(new e(1));
        }
        this.f1752Z = z;
        if (linkOptionArr == null) {
            linkOptionArr2 = (LinkOption[]) f.f1756b.clone();
        } else {
            linkOptionArr2 = (LinkOption[]) linkOptionArr.clone();
        }
        this.f1753a0 = linkOptionArr2;
    }

    /* renamed from: a */
    public final FileVisitResult postVisitDirectory(Path path, IOException iOException) {
        DirectoryStream newDirectoryStream = Files.newDirectoryStream(path);
        try {
            boolean hasNext = newDirectoryStream.iterator().hasNext();
            newDirectoryStream.close();
            if (!hasNext) {
                Files.deleteIfExists(path);
            }
            return super.postVisitDirectory(path, iOException);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: b */
    public final FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        Path path2;
        super.preVisitDirectory(path, basicFileAttributes);
        String str = null;
        if (path != null) {
            path2 = path.getFileName();
        } else {
            path2 = null;
        }
        if (path2 != null) {
            str = path2.toString();
        }
        if (Arrays.binarySearch(this.f1751Y, str) < 0) {
            return FileVisitResult.CONTINUE;
        }
        return FileVisitResult.SKIP_SUBTREE;
    }

    /* renamed from: c */
    public final FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        Path path2;
        String str = null;
        if (path != null) {
            path2 = path.getFileName();
        } else {
            path2 = null;
        }
        if (path2 != null) {
            str = path2.toString();
        }
        if (Arrays.binarySearch(this.f1751Y, str) < 0) {
            LinkOption[] linkOptionArr = this.f1753a0;
            if (Files.exists(path, linkOptionArr)) {
                if (this.f1752Z) {
                    f.c(path, linkOptionArr);
                }
                Files.deleteIfExists(path);
            }
            if (Files.isSymbolicLink(path)) {
                try {
                    Files.delete(path);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        b bVar = this.f1748V;
        bVar.f1746c.f1743a++;
        bVar.f1744a.f1743a += basicFileAttributes.size();
        return FileVisitResult.CONTINUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1752Z != dVar.f1752Z || !Arrays.equals(this.f1751Y, dVar.f1751Y)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.f1752Z)}) + (((super.hashCode() * 31) + Arrays.hashCode(this.f1751Y)) * 31);
    }
}
