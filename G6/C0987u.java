package g6;

import N.e;
import Q0.g;
import e6.C0852k;
import h6.C1082c;
import h6.d;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import u.C1477r;

/* renamed from: g6.u  reason: case insensitive filesystem */
public abstract class C0987u {
    private static final boolean DELETE_NATIVE_LIB_AFTER_LOADING;
    private static final boolean DETECT_NATIVE_LIBRARY_DUPLICATES;
    private static final boolean TRY_TO_PATCH_SHADED_ID;
    private static final byte[] UNIQUE_ID_BYTES = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes(C0852k.US_ASCII);
    private static final File WORKDIR;
    private static final C1082c logger;

    static {
        C1082c instance = d.getInstance((Class<?>) C0987u.class);
        logger = instance;
        String str = p0.get("io.netty.native.workdir");
        if (str != null) {
            File file = new File(str);
            file.mkdirs();
            try {
                file = file.getAbsoluteFile();
            } catch (Exception unused) {
            }
            WORKDIR = file;
            C1082c cVar = logger;
            cVar.debug("-Dio.netty.native.workdir: " + file);
        } else {
            File tmpdir = Y.tmpdir();
            WORKDIR = tmpdir;
            instance.debug("-Dio.netty.native.workdir: " + tmpdir + " (io.netty.tmpdir)");
        }
        boolean z = p0.getBoolean("io.netty.native.deleteLibAfterLoading", true);
        DELETE_NATIVE_LIB_AFTER_LOADING = z;
        C1082c cVar2 = logger;
        cVar2.debug("-Dio.netty.native.deleteLibAfterLoading: {}", (Object) Boolean.valueOf(z));
        boolean z6 = p0.getBoolean("io.netty.native.tryPatchShadedId", true);
        TRY_TO_PATCH_SHADED_ID = z6;
        cVar2.debug("-Dio.netty.native.tryPatchShadedId: {}", (Object) Boolean.valueOf(z6));
        boolean z8 = p0.getBoolean("io.netty.native.detectNativeLibraryDuplicates", true);
        DETECT_NATIVE_LIBRARY_DUPLICATES = z8;
        cVar2.debug("-Dio.netty.native.detectNativeLibraryDuplicates: {}", (Object) Boolean.valueOf(z8));
    }

    private static String calculateMangledPackagePrefix() {
        String name = C0987u.class.getName();
        String replace = "io!netty!util!internal!NativeLibraryLoader".replace('!', '.');
        if (name.endsWith(replace)) {
            return name.substring(0, name.length() - replace.length()).replace("_", "_1").replace('.', '_');
        }
        throw new UnsatisfiedLinkError("Could not find prefix added to " + replace + " to get " + name + ". When shading, only adding a package prefix is supported");
    }

    private static byte[] classToByteArray(Class<?> cls) {
        String name = cls.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            name = name.substring(lastIndexOf + 1);
        }
        URL resource = cls.getResource(name + ".class");
        if (resource != null) {
            byte[] bArr = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
            try {
                InputStream openStream = resource.openStream();
                while (true) {
                    int read = openStream.read(bArr);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        closeQuietly(openStream);
                        closeQuietly(byteArrayOutputStream);
                        return byteArray;
                    }
                }
            } catch (IOException e) {
                throw new ClassNotFoundException(cls.getName(), e);
            } catch (Throwable th) {
                closeQuietly((Closeable) null);
                closeQuietly(byteArrayOutputStream);
                throw th;
            }
        } else {
            throw new ClassNotFoundException(cls.getName());
        }
    }

    private static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static byte[] digest(MessageDigest messageDigest, URL url) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = url.openStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        byte[] digest = messageDigest.digest();
                        closeQuietly(inputStream);
                        return digest;
                    }
                }
            } catch (IOException e) {
                e = e;
                try {
                    logger.debug("Can't read resource.", (Throwable) e);
                    closeQuietly(inputStream);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    closeQuietly(inputStream2);
                    throw th;
                }
            }
        } catch (IOException e8) {
            e = e8;
            inputStream = null;
            logger.debug("Can't read resource.", (Throwable) e);
            closeQuietly(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            closeQuietly(inputStream2);
            throw th;
        }
    }

    private static byte[] generateUniqueId(int i) {
        byte[] bArr = new byte[i];
        for (int i8 = 0; i8 < i; i8++) {
            byte[] bArr2 = UNIQUE_ID_BYTES;
            bArr[i8] = bArr2[Y.threadLocalRandom().nextInt(bArr2.length)];
        }
        return bArr;
    }

    private static URL getResource(String str, ClassLoader classLoader) {
        Enumeration<URL> enumeration;
        if (classLoader == null) {
            try {
                enumeration = ClassLoader.getSystemResources(str);
            } catch (IOException e) {
                throw new RuntimeException(C1477r.d("An error occurred while getting the resources for ", str), e);
            }
        } else {
            enumeration = classLoader.getResources(str);
        }
        ArrayList<T> list = Collections.list(enumeration);
        int size = list.size();
        if (size == 0) {
            return null;
        }
        int i = 1;
        if (size == 1) {
            return (URL) list.get(0);
        }
        if (DETECT_NATIVE_LIBRARY_DUPLICATES) {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                URL url = (URL) list.get(0);
                byte[] digest = digest(instance, url);
                if (digest != null) {
                    while (i < size) {
                        byte[] digest2 = digest(instance, (URL) list.get(i));
                        if (digest2 != null && Arrays.equals(digest, digest2)) {
                            i++;
                        }
                    }
                    return url;
                }
            } catch (NoSuchAlgorithmException e8) {
                logger.debug("Don't support SHA-256, can't check if resources have same content.", (Throwable) e8);
            }
            throw new IllegalStateException("Multiple resources found for '" + str + "' with different content: " + list);
        }
        C1082c cVar = logger;
        cVar.warn("Multiple resources found for '" + str + "' with different content: " + list + ". Please fix your dependency graph.");
        return (URL) list.get(0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.io.File} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0114 A[SYNTHETIC, Splitter:B:74:0x0114] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void load(java.lang.String r10, java.lang.ClassLoader r11) {
        /*
            java.lang.String r0 = ".jnilib"
            java.lang.String r1 = calculateMangledPackagePrefix()
            java.lang.String r2 = N.e.x(r1, r10)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            loadLibrary(r11, r2, r4)     // Catch:{ all -> 0x0014 }
            return
        L_0x0014:
            r5 = move-exception
            r3.add(r5)
            java.lang.String r5 = java.lang.System.mapLibraryName(r2)
            java.lang.String r6 = "META-INF/native/"
            java.lang.String r6 = u.C1477r.d(r6, r5)
            java.net.URL r7 = getResource(r6, r11)
            r8 = 0
            if (r7 != 0) goto L_0x0080
            boolean r7 = g6.Y.isOsx()     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            if (r7 == 0) goto L_0x0077
            boolean r6 = r6.endsWith(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            java.lang.String r7 = "META-INF/native/lib"
            if (r6 == 0) goto L_0x0058
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            r0.<init>(r7)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            r0.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            java.lang.String r6 = ".dynlib"
            r0.append(r6)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            java.lang.String r0 = r0.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            goto L_0x0067
        L_0x0049:
            r10 = move-exception
            r0 = r8
            r6 = r0
            goto L_0x0148
        L_0x004e:
            r10 = move-exception
            r0 = r8
            r6 = r0
            goto L_0x00f3
        L_0x0053:
            r10 = move-exception
            r5 = r8
            r6 = r5
            goto L_0x0112
        L_0x0058:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            r6.<init>(r7)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            r6.append(r2)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            r6.append(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            java.lang.String r0 = r6.toString()     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
        L_0x0067:
            java.net.URL r7 = getResource(r0, r11)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            if (r7 == 0) goto L_0x006e
            goto L_0x0080
        L_0x006e:
            java.io.FileNotFoundException r10 = new java.io.FileNotFoundException     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            r10.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            g6.x0.addSuppressedAndClear(r10, r3)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            throw r10     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
        L_0x0077:
            java.io.FileNotFoundException r10 = new java.io.FileNotFoundException     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            r10.<init>(r6)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            g6.x0.addSuppressedAndClear(r10, r3)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            throw r10     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
        L_0x0080:
            r0 = 46
            int r0 = r5.lastIndexOf(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            java.lang.String r6 = r5.substring(r4, r0)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            java.lang.String r0 = r5.substring(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            java.io.File r5 = WORKDIR     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            java.io.File r0 = g6.Y.createTempFile(r6, r0, r5)     // Catch:{ UnsatisfiedLinkError -> 0x0053, Exception -> 0x004e, all -> 0x0049 }
            java.io.InputStream r5 = r7.openStream()     // Catch:{ UnsatisfiedLinkError -> 0x00ef, Exception -> 0x00ec, all -> 0x00e9 }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ UnsatisfiedLinkError -> 0x00e6, Exception -> 0x00e3, all -> 0x00e0 }
            r6.<init>(r0)     // Catch:{ UnsatisfiedLinkError -> 0x00e6, Exception -> 0x00e3, all -> 0x00e0 }
            r7 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r7]     // Catch:{ UnsatisfiedLinkError -> 0x00b2, Exception -> 0x00af, all -> 0x00ab }
        L_0x00a1:
            int r9 = r5.read(r7)     // Catch:{ UnsatisfiedLinkError -> 0x00b2, Exception -> 0x00af, all -> 0x00ab }
            if (r9 <= 0) goto L_0x00b5
            r6.write(r7, r4, r9)     // Catch:{ UnsatisfiedLinkError -> 0x00b2, Exception -> 0x00af, all -> 0x00ab }
            goto L_0x00a1
        L_0x00ab:
            r10 = move-exception
        L_0x00ac:
            r8 = r5
            goto L_0x0148
        L_0x00af:
            r10 = move-exception
        L_0x00b0:
            r8 = r5
            goto L_0x00f3
        L_0x00b2:
            r10 = move-exception
        L_0x00b3:
            r8 = r0
            goto L_0x0112
        L_0x00b5:
            r6.flush()     // Catch:{ UnsatisfiedLinkError -> 0x00b2, Exception -> 0x00af, all -> 0x00ab }
            boolean r1 = shouldShadedLibraryIdBePatched(r1)     // Catch:{ UnsatisfiedLinkError -> 0x00b2, Exception -> 0x00af, all -> 0x00ab }
            if (r1 == 0) goto L_0x00c1
            tryPatchShadedLibraryIdAndSign(r0, r10)     // Catch:{ UnsatisfiedLinkError -> 0x00b2, Exception -> 0x00af, all -> 0x00ab }
        L_0x00c1:
            closeQuietly(r6)     // Catch:{ UnsatisfiedLinkError -> 0x00b2, Exception -> 0x00af, all -> 0x00ab }
            java.lang.String r10 = r0.getPath()     // Catch:{ UnsatisfiedLinkError -> 0x00e6, Exception -> 0x00e3, all -> 0x00e0 }
            r1 = 1
            loadLibrary(r11, r10, r1)     // Catch:{ UnsatisfiedLinkError -> 0x00e6, Exception -> 0x00e3, all -> 0x00e0 }
            closeQuietly(r5)
            closeQuietly(r8)
            boolean r10 = DELETE_NATIVE_LIB_AFTER_LOADING
            if (r10 == 0) goto L_0x00dc
            boolean r10 = r0.delete()
            if (r10 != 0) goto L_0x00df
        L_0x00dc:
            r0.deleteOnExit()
        L_0x00df:
            return
        L_0x00e0:
            r10 = move-exception
            r6 = r8
            goto L_0x00ac
        L_0x00e3:
            r10 = move-exception
            r6 = r8
            goto L_0x00b0
        L_0x00e6:
            r10 = move-exception
            r6 = r8
            goto L_0x00b3
        L_0x00e9:
            r10 = move-exception
            r6 = r8
            goto L_0x0148
        L_0x00ec:
            r10 = move-exception
            r6 = r8
            goto L_0x00f3
        L_0x00ef:
            r10 = move-exception
            r5 = r8
            r6 = r5
            goto L_0x00b3
        L_0x00f3:
            java.lang.UnsatisfiedLinkError r11 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r1.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = "could not load a native library: "
            r1.append(r4)     // Catch:{ all -> 0x0110 }
            r1.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0110 }
            r11.<init>(r1)     // Catch:{ all -> 0x0110 }
            r11.initCause(r10)     // Catch:{ all -> 0x0110 }
            g6.x0.addSuppressedAndClear(r11, r3)     // Catch:{ all -> 0x0110 }
            throw r11     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r10 = move-exception
            goto L_0x0148
        L_0x0112:
            if (r8 == 0) goto L_0x0144
            boolean r11 = r8.isFile()     // Catch:{ all -> 0x0134 }
            if (r11 == 0) goto L_0x0144
            boolean r11 = r8.canRead()     // Catch:{ all -> 0x0134 }
            if (r11 == 0) goto L_0x0144
            boolean r11 = g6.C0986t.canExecuteExecutable(r8)     // Catch:{ all -> 0x0134 }
            if (r11 != 0) goto L_0x0144
            h6.c r11 = logger     // Catch:{ all -> 0x0134 }
            java.lang.String r0 = "{} exists but cannot be executed even when execute permissions set; check volume for \"noexec\" flag; use -D{}=[path] to set native working directory separately."
            java.lang.String r1 = r8.getPath()     // Catch:{ all -> 0x0134 }
            java.lang.String r2 = "io.netty.native.workdir"
            r11.info(r0, r1, r2)     // Catch:{ all -> 0x0134 }
            goto L_0x0144
        L_0x0134:
            r11 = move-exception
            r3.add(r11)     // Catch:{ all -> 0x0140 }
            h6.c r0 = logger     // Catch:{ all -> 0x0140 }
            java.lang.String r1 = "Error checking if {} is on a file store mounted with noexec"
            r0.debug(r1, r8, r11)     // Catch:{ all -> 0x0140 }
            goto L_0x0144
        L_0x0140:
            r10 = move-exception
            r0 = r8
            goto L_0x00ac
        L_0x0144:
            g6.x0.addSuppressedAndClear(r10, r3)     // Catch:{ all -> 0x0140 }
            throw r10     // Catch:{ all -> 0x0140 }
        L_0x0148:
            closeQuietly(r8)
            closeQuietly(r6)
            if (r0 == 0) goto L_0x015d
            boolean r11 = DELETE_NATIVE_LIB_AFTER_LOADING
            if (r11 == 0) goto L_0x015a
            boolean r11 = r0.delete()
            if (r11 != 0) goto L_0x015d
        L_0x015a:
            r0.deleteOnExit()
        L_0x015d:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.C0987u.load(java.lang.String, java.lang.ClassLoader):void");
    }

    public static void loadFirstAvailable(ClassLoader classLoader, String... strArr) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                load(str, classLoader);
                logger.debug("Loaded library with name '{}'", (Object) str);
                return;
            } catch (Throwable th) {
                arrayList.add(th);
                i++;
            }
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Failed to load any of the given libraries: " + Arrays.toString(strArr));
        x0.addSuppressedAndClear(illegalArgumentException, arrayList);
        throw illegalArgumentException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r1 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        g6.x0.addSuppressed((java.lang.Throwable) r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        rethrowWithMoreDetailsIfPossible(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        g6.C0988v.loadLibrary(r4, r5);
        logger.debug("Successfully loaded the library {}", (java.lang.Object) r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0012 A[ExcHandler: NoSuchMethodError (r3v4 'e' java.lang.NoSuchMethodError A[CUSTOM_DECLARE]), PHI: r1 
      PHI: (r1v2 java.lang.Throwable) = (r1v0 java.lang.Throwable), (r1v1 java.lang.Throwable), (r1v1 java.lang.Throwable), (r1v0 java.lang.Throwable) binds: [B:1:0x0005, B:7:0x0018, B:8:?, B:2:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void loadLibrary(java.lang.ClassLoader r3, java.lang.String r4, boolean r5) {
        /*
            java.lang.String r0 = "Successfully loaded the library {}"
            r1 = 0
            java.lang.Class<g6.v> r2 = g6.C0988v.class
            java.lang.Class r3 = tryToLoadClass(r3, r2)     // Catch:{ UnsatisfiedLinkError -> 0x0016, Exception -> 0x0014, NoSuchMethodError -> 0x0012 }
            loadLibraryByHelper(r3, r4, r5)     // Catch:{ UnsatisfiedLinkError -> 0x0016, Exception -> 0x0014, NoSuchMethodError -> 0x0012 }
            h6.c r3 = logger     // Catch:{ UnsatisfiedLinkError -> 0x0016, Exception -> 0x0014, NoSuchMethodError -> 0x0012 }
            r3.debug((java.lang.String) r0, (java.lang.Object) r4)     // Catch:{ UnsatisfiedLinkError -> 0x0016, Exception -> 0x0014, NoSuchMethodError -> 0x0012 }
            return
        L_0x0012:
            r3 = move-exception
            goto L_0x0026
        L_0x0014:
            r3 = move-exception
            goto L_0x0017
        L_0x0016:
            r3 = move-exception
        L_0x0017:
            r1 = r3
            g6.C0988v.loadLibrary(r4, r5)     // Catch:{ NoSuchMethodError -> 0x0012, UnsatisfiedLinkError -> 0x0021 }
            h6.c r3 = logger     // Catch:{ NoSuchMethodError -> 0x0012, UnsatisfiedLinkError -> 0x0021 }
            r3.debug((java.lang.String) r0, (java.lang.Object) r4)     // Catch:{ NoSuchMethodError -> 0x0012, UnsatisfiedLinkError -> 0x0021 }
            goto L_0x002e
        L_0x0021:
            r3 = move-exception
            g6.x0.addSuppressed((java.lang.Throwable) r3, (java.lang.Throwable) r1)
            throw r3
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            g6.x0.addSuppressed((java.lang.Throwable) r3, (java.lang.Throwable) r1)
        L_0x002b:
            rethrowWithMoreDetailsIfPossible(r4, r3)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.C0987u.loadLibrary(java.lang.ClassLoader, java.lang.String, boolean):void");
    }

    private static void loadLibraryByHelper(Class<?> cls, String str, boolean z) {
        Object doPrivileged = AccessController.doPrivileged(new r(cls, str, z));
        if (doPrivileged instanceof Throwable) {
            Throwable th = (Throwable) doPrivileged;
            Throwable cause = th.getCause();
            if (cause instanceof UnsatisfiedLinkError) {
                throw ((UnsatisfiedLinkError) cause);
            }
            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(th.getMessage());
            unsatisfiedLinkError.initCause(th);
            throw unsatisfiedLinkError;
        }
    }

    private static void rethrowWithMoreDetailsIfPossible(String str, NoSuchMethodError noSuchMethodError) {
        if (Y.javaVersion() >= 7) {
            throw new LinkageError(e.y("Possible multiple incompatible native libraries on the classpath for '", str, "'?"), noSuchMethodError);
        }
        throw noSuchMethodError;
    }

    private static boolean shouldShadedLibraryIdBePatched(String str) {
        if (!TRY_TO_PATCH_SHADED_ID || !Y.isOsx() || str.isEmpty()) {
            return false;
        }
        return true;
    }

    private static boolean tryExec(String str) {
        try {
            int waitFor = Runtime.getRuntime().exec(str).waitFor();
            if (waitFor != 0) {
                logger.debug("Execution of '{}' failed: {}", str, Integer.valueOf(waitFor));
                return false;
            }
            logger.debug("Execution of '{}' succeed: {}", str, Integer.valueOf(waitFor));
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (IOException e) {
            logger.info("Execution of '{}' failed.", str, e);
            return false;
        } catch (SecurityException e8) {
            logger.error("Execution of '{}' failed.", str, e8);
            return false;
        }
    }

    public static void tryPatchShadedLibraryIdAndSign(File file, String str) {
        if (!new File("/Library/Developer/CommandLineTools").exists()) {
            logger.debug("Can't patch shaded library id as CommandLineTools are not installed. Consider installing CommandLineTools with 'xcode-select --install'");
            return;
        }
        StringBuilder s8 = g.s("install_name_tool -id ", new String(generateUniqueId(str.length()), C0852k.UTF_8), " ");
        s8.append(file.getAbsolutePath());
        if (tryExec(s8.toString())) {
            tryExec("codesign -s - " + file.getAbsolutePath());
        }
    }

    private static Class<?> tryToLoadClass(ClassLoader classLoader, Class<?> cls) {
        try {
            return Class.forName(cls.getName(), false, classLoader);
        } catch (ClassNotFoundException e) {
            if (classLoader != null) {
                try {
                    return (Class) AccessController.doPrivileged(new C0985s(classLoader, cls, classToByteArray(cls)));
                } catch (ClassNotFoundException e8) {
                    x0.addSuppressed((Throwable) e8, (Throwable) e);
                    throw e8;
                } catch (RuntimeException e9) {
                    x0.addSuppressed((Throwable) e9, (Throwable) e);
                    throw e9;
                } catch (Error e10) {
                    x0.addSuppressed((Throwable) e10, (Throwable) e);
                    throw e10;
                }
            } else {
                throw e;
            }
        }
    }
}
