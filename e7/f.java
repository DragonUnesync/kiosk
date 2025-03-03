package E7;

import B.B;
import B7.g;
import F7.a;
import J7.b;
import J7.c;
import J7.e;
import j$.util.Objects;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f1385a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public static final e f1386b = new e(new d(1), 1);

    static {
        char c8 = File.separatorChar;
        System.lineSeparator();
        g.f1388V.getClass();
        g.f1387U.getClass();
        new e(new d(0), 0);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [F7.b, java.lang.Object] */
    public static byte[] a(InputStream inputStream) {
        int i = e.f2527Z;
        ? obj = new Object();
        Charset.defaultCharset();
        Charset.defaultCharset();
        new a(obj);
        e eVar = new e();
        c cVar = new c(new g(6), new B(5, eVar));
        try {
            byte[] bArr = new byte[8192];
            Objects.requireNonNull(inputStream, "inputStream");
            while (true) {
                int read = inputStream.read(bArr);
                if (-1 != read) {
                    cVar.write(bArr, 0, read);
                } else {
                    byte[] l8 = eVar.l();
                    cVar.close();
                    return l8;
                }
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static String b(InputStream inputStream, Charset charset) {
        b bVar = new b();
        int i = a.f1378a;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        char[] cArr = (char[]) f1386b.get();
        Arrays.fill(cArr, 0);
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return bVar.f2521U.toString();
            }
            bVar.write(cArr, 0, read);
        }
    }
}
