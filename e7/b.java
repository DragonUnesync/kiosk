package E7;

import B7.g;
import I7.c;
import I7.d;
import j$.io.FileRetargetClass;
import j$.nio.file.CopyOption;
import j$.nio.file.Files;
import j$.nio.file.LinkOption;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.BasicFileAttributeView;
import j$.nio.file.attribute.BasicFileAttributes;
import j$.util.Objects;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1379a = 0;

    static {
        BigInteger valueOf = BigInteger.valueOf(1024);
        valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf)))));
        valueOf.multiply(BigInteger.valueOf(1024).multiply(BigInteger.valueOf(1152921504606846976L)));
    }

    public static void a(File file, String str) {
        Objects.requireNonNull(file, str);
        if (file.isFile()) {
            return;
        }
        if (file.exists()) {
            throw new IllegalArgumentException("Parameter '" + str + "' is not a file: " + file);
        } else if (!Files.isSymbolicLink(FileRetargetClass.toPath(file))) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
    }

    public static void b(File file) {
        int i;
        boolean z = false;
        g gVar = new g(5);
        c k8 = c.k(Stream.-CC.of(f(file)));
        d dVar = new d(0);
        k8.getClass();
        AtomicReference atomicReference = new AtomicReference();
        k8.f2334U.forEach(new I7.b(gVar, atomicReference, dVar, new AtomicInteger()));
        List list = (List) atomicReference.get();
        int i8 = c.f1380V;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (i == 0) {
            z = true;
        }
        if (!z) {
            throw new c((String) null, list);
        }
    }

    public static void c(File file, File file2) {
        ArrayList arrayList;
        CopyOption[] copyOptionArr = {StandardCopyOption.REPLACE_EXISTING, LinkOption.NOFOLLOW_LINKS};
        Objects.requireNonNull(file2, "destination");
        j(file, "srcDir");
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.equals(file2.getCanonicalPath())) {
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                File[] f8 = f(file);
                if (f8.length > 0) {
                    arrayList = new ArrayList(f8.length);
                    for (File name : f8) {
                        arrayList.add(new File(file2, name.getName()).getCanonicalPath());
                    }
                    e(file, file2, arrayList, copyOptionArr);
                    return;
                }
            }
            arrayList = null;
            e(file, file2, arrayList, copyOptionArr);
            return;
        }
        throw new IllegalArgumentException(String.format("File canonical paths are equal: '%s' (file1='%s', file2='%s')", new Object[]{canonicalPath, file, file2}));
    }

    public static void d(File file, File file2, boolean z, CopyOption... copyOptionArr) {
        Objects.requireNonNull(file2, "destination");
        a(file, "srcFile");
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.equals(file2.getCanonicalPath())) {
            g(file2.getParentFile());
            if (file2.exists()) {
                a(file2, "destFile");
            }
            Path path = FileRetargetClass.toPath(file);
            Files.copy(path, FileRetargetClass.toPath(file2), copyOptionArr);
            if (z && !Files.isSymbolicLink(path) && !k(file, file2)) {
                throw new IOException("Cannot set the file time.");
            }
            return;
        }
        throw new IllegalArgumentException(String.format("File canonical paths are equal: '%s' (file1='%s', file2='%s')", new Object[]{canonicalPath, file, file2}));
    }

    public static void e(File file, File file2, ArrayList arrayList, CopyOption... copyOptionArr) {
        File[] f8 = f(file);
        Objects.requireNonNull(file2, "destDir");
        if (!file2.exists() || file2.isDirectory()) {
            g(file2);
            for (File file3 : f8) {
                File file4 = new File(file2, file3.getName());
                if (arrayList == null || !arrayList.contains(file3.getCanonicalPath())) {
                    if (file3.isDirectory()) {
                        e(file3, file4, arrayList, copyOptionArr);
                    } else {
                        d(file3, file4, true, copyOptionArr);
                    }
                }
            }
            k(file, file2);
            return;
        }
        throw new IllegalArgumentException("Parameter 'destDir' is not a directory: '" + file2 + "'");
    }

    public static File[] f(File file) {
        j(file, "directory");
        File[] listFiles = file.listFiles((FileFilter) null);
        if (listFiles != null) {
            return listFiles;
        }
        throw new IOException("Unknown I/O error listing contents of directory: " + file);
    }

    public static void g(File file) {
        if (file != null && !file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Cannot create directory '" + file + "'.");
        }
    }

    public static void h(File file, File file2) {
        Objects.requireNonNull(file2, "destination");
        j(file, "srcDir");
        if (file2.exists()) {
            throw new IOException(String.format("File element in parameter '%s' already exists: '%s'", new Object[]{"destDir", file2}));
        } else if (!file.renameTo(file2)) {
            String canonicalPath = file2.getCanonicalPath();
            if (!canonicalPath.startsWith(file.getCanonicalPath() + File.separator)) {
                c(file, file2);
                if (file.exists()) {
                    if (!Files.isSymbolicLink(FileRetargetClass.toPath(file))) {
                        b(file);
                    }
                    Files.delete(FileRetargetClass.toPath(file));
                }
                if (file.exists()) {
                    throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + "'");
                }
                return;
            }
            throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i(java.io.File r5, java.io.File r6) {
        /*
            r0 = 1
            j$.nio.file.CopyOption[] r1 = new j$.nio.file.CopyOption[r0]
            j$.nio.file.StandardCopyOption r2 = j$.nio.file.StandardCopyOption.COPY_ATTRIBUTES
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "destination"
            j$.util.Objects.requireNonNull(r6, r2)
            java.lang.String r2 = "srcFile"
            a(r5, r2)
            boolean r2 = r6.exists()
            if (r2 != 0) goto L_0x0055
            boolean r0 = r5.renameTo(r6)
            if (r0 != 0) goto L_0x0054
            d(r5, r6, r3, r1)
            boolean r0 = r5.delete()
            if (r0 != 0) goto L_0x0054
            boolean r0 = r6.isDirectory()     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0030
            b(r6)     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            r6.delete()     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to delete original file '"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = "' after copy to '"
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = "'"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L_0x0054:
            return
        L_0x0055:
            B2.c r5 = new B2.c
            java.lang.String r1 = "File element in parameter '%s' already exists: '%s'"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r4 = "destFile"
            r2[r3] = r4
            r2[r0] = r6
            java.lang.String r6 = java.lang.String.format(r1, r2)
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: E7.b.i(java.io.File, java.io.File):void");
    }

    public static void j(File file, String str) {
        Objects.requireNonNull(file, str);
        if (file.isDirectory()) {
            return;
        }
        if (file.exists()) {
            throw new IllegalArgumentException("Parameter '" + str + "' is not a directory: '" + file + "'");
        }
        throw new FileNotFoundException("Directory '" + file + "' does not exist.");
    }

    public static boolean k(File file, File file2) {
        Objects.requireNonNull(file, "sourceFile");
        Objects.requireNonNull(file2, "targetFile");
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(FileRetargetClass.toPath(file), BasicFileAttributes.class, new LinkOption[0]);
            Files.getFileAttributeView(FileRetargetClass.toPath(file2), BasicFileAttributeView.class, new LinkOption[0]).setTimes(readAttributes.lastModifiedTime(), readAttributes.lastAccessTime(), readAttributes.creationTime());
            return true;
        } catch (IOException unused) {
            return file2.setLastModified(file.lastModified());
        }
    }
}
