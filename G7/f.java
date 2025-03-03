package G7;

import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.StandardOpenOption;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.nio.file.attribute.DosFileAttributeView;
import j$.nio.file.attribute.PosixFileAttributes;
import j$.nio.file.attribute.PosixFilePermission;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkOption[] f1755a = new LinkOption[0];

    /* renamed from: b  reason: collision with root package name */
    public static final LinkOption[] f1756b = {LinkOption.NOFOLLOW_LINKS};

    static {
        StandardOpenOption standardOpenOption = StandardOpenOption.CREATE;
        StandardOpenOption standardOpenOption2 = StandardOpenOption.TRUNCATE_EXISTING;
        StandardOpenOption standardOpenOption3 = StandardOpenOption.APPEND;
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static G7.b a(j$.nio.file.Path r12, j$.nio.file.LinkOption[] r13, G7.g... r14) {
        /*
            boolean r0 = j$.nio.file.Files.isDirectory(r12, r13)
            if (r0 == 0) goto L_0x001a
            G7.d r0 = new G7.d
            G7.b r1 = new G7.b
            r1.<init>()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.<init>(r1, r13, r14, r2)
            j$.nio.file.Files.walkFileTree(r12, r0)
            G7.b r12 = r0.f1748V
            goto L_0x00ac
        L_0x001a:
            boolean r0 = j$.nio.file.Files.isDirectory(r12, r13)
            if (r0 != 0) goto L_0x00b7
            G7.b r0 = new G7.b
            r0.<init>()
            G7.a r1 = r0.f1744a
            G7.a r2 = r0.f1746c
            boolean r3 = b(r12, r13)
            r4 = 0
            if (r3 == 0) goto L_0x003c
            boolean r3 = j$.nio.file.Files.isSymbolicLink(r12)
            if (r3 != 0) goto L_0x003c
            long r6 = j$.nio.file.Files.size(r12)
            goto L_0x003d
        L_0x003c:
            r6 = r4
        L_0x003d:
            r8 = 1
            boolean r3 = j$.nio.file.Files.deleteIfExists(r12)     // Catch:{ AccessDeniedException -> 0x0050 }
            if (r3 == 0) goto L_0x0051
            long r10 = r2.f1743a     // Catch:{ AccessDeniedException -> 0x0050 }
            long r10 = r10 + r8
            r2.f1743a = r10     // Catch:{ AccessDeniedException -> 0x0050 }
            long r10 = r1.f1743a     // Catch:{ AccessDeniedException -> 0x0050 }
            long r10 = r10 + r6
            r1.f1743a = r10     // Catch:{ AccessDeniedException -> 0x0050 }
            goto L_0x00ab
        L_0x0050:
        L_0x0051:
            r3 = 0
            if (r12 != 0) goto L_0x0056
            r6 = r3
            goto L_0x005a
        L_0x0056:
            j$.nio.file.Path r6 = r12.getParent()
        L_0x005a:
            j$.util.stream.Stream r14 = j$.util.stream.Stream.-CC.of(r14)     // Catch:{ all -> 0x0090 }
            G7.e r7 = new G7.e     // Catch:{ all -> 0x0090 }
            r10 = 0
            r7.<init>(r10)     // Catch:{ all -> 0x0090 }
            boolean r14 = r14.anyMatch(r7)     // Catch:{ all -> 0x0090 }
            if (r14 == 0) goto L_0x007f
            java.lang.Class<j$.nio.file.attribute.PosixFileAttributes> r14 = j$.nio.file.attribute.PosixFileAttributes.class
            if (r6 != 0) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            j$.nio.file.attribute.BasicFileAttributes r14 = j$.nio.file.Files.readAttributes(r6, r14, r13)     // Catch:{ IOException | UnsupportedOperationException -> 0x0074 }
            goto L_0x0075
        L_0x0074:
            r14 = r3
        L_0x0075:
            j$.nio.file.attribute.PosixFileAttributes r14 = (j$.nio.file.attribute.PosixFileAttributes) r14     // Catch:{ all -> 0x0090 }
            c(r12, r13)     // Catch:{ all -> 0x007c }
            r3 = r14
            goto L_0x007f
        L_0x007c:
            r12 = move-exception
            r3 = r14
            goto L_0x00ad
        L_0x007f:
            boolean r13 = b(r12, r13)     // Catch:{ all -> 0x0090 }
            if (r13 == 0) goto L_0x0092
            boolean r13 = j$.nio.file.Files.isSymbolicLink(r12)     // Catch:{ all -> 0x0090 }
            if (r13 != 0) goto L_0x0092
            long r4 = j$.nio.file.Files.size(r12)     // Catch:{ all -> 0x0090 }
            goto L_0x0092
        L_0x0090:
            r12 = move-exception
            goto L_0x00ad
        L_0x0092:
            boolean r12 = j$.nio.file.Files.deleteIfExists(r12)     // Catch:{ all -> 0x0090 }
            if (r12 == 0) goto L_0x00a2
            long r12 = r2.f1743a     // Catch:{ all -> 0x0090 }
            long r12 = r12 + r8
            r2.f1743a = r12     // Catch:{ all -> 0x0090 }
            long r12 = r1.f1743a     // Catch:{ all -> 0x0090 }
            long r12 = r12 + r4
            r1.f1743a = r12     // Catch:{ all -> 0x0090 }
        L_0x00a2:
            if (r3 == 0) goto L_0x00ab
            java.util.Set r12 = r3.permissions()
            j$.nio.file.Files.setPosixFilePermissions(r6, r12)
        L_0x00ab:
            r12 = r0
        L_0x00ac:
            return r12
        L_0x00ad:
            if (r3 == 0) goto L_0x00b6
            java.util.Set r13 = r3.permissions()
            j$.nio.file.Files.setPosixFilePermissions(r6, r13)
        L_0x00b6:
            throw r12
        L_0x00b7:
            java.nio.file.NoSuchFileException r13 = new java.nio.file.NoSuchFileException
            java.lang.String r12 = r12.toString()
            r13.<init>(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: G7.f.a(j$.nio.file.Path, j$.nio.file.LinkOption[], G7.g[]):G7.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(j$.nio.file.Path r1, j$.nio.file.LinkOption... r2) {
        /*
            r0 = 0
            if (r1 == 0) goto L_0x0015
            if (r2 == 0) goto L_0x000c
            boolean r1 = j$.nio.file.Files.exists(r1, r2)
            if (r1 == 0) goto L_0x0015
            goto L_0x0014
        L_0x000c:
            j$.nio.file.LinkOption[] r2 = new j$.nio.file.LinkOption[r0]
            boolean r1 = j$.nio.file.Files.exists(r1, r2)
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G7.f.b(j$.nio.file.Path, j$.nio.file.LinkOption[]):boolean");
    }

    public static void c(Path path, LinkOption... linkOptionArr) {
        Path path2;
        try {
            DosFileAttributeView fileAttributeView = Files.getFileAttributeView(path, DosFileAttributeView.class, linkOptionArr);
            if (fileAttributeView != null) {
                fileAttributeView.setReadOnly(false);
                return;
            }
        } catch (IOException unused) {
        }
        BasicFileAttributes basicFileAttributes = null;
        if (path == null) {
            path2 = null;
        } else {
            path2 = path.getParent();
        }
        if (b(path2, linkOptionArr)) {
            Class<PosixFileAttributes> cls = PosixFileAttributes.class;
            if (path2 != null) {
                try {
                    basicFileAttributes = Files.readAttributes(path2, cls, linkOptionArr);
                } catch (IOException | UnsupportedOperationException unused2) {
                }
            }
            if (((PosixFileAttributes) basicFileAttributes) != null) {
                List asList = Arrays.asList(new PosixFilePermission[]{PosixFilePermission.OWNER_WRITE, PosixFilePermission.OWNER_EXECUTE});
                if (path2 != null) {
                    Set posixFilePermissions = Files.getPosixFilePermissions(path2, linkOptionArr);
                    HashSet hashSet = new HashSet(posixFilePermissions);
                    hashSet.addAll(asList);
                    if (!hashSet.equals(posixFilePermissions)) {
                        Files.setPosixFilePermissions(path2, hashSet);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new IOException(String.format("DOS or POSIX file operations not available for '%s', linkOptions %s", new Object[]{path, Arrays.toString(linkOptionArr)}));
    }
}
