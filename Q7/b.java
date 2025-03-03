package Q7;

import B.q0;
import R7.a;
import S7.e;
import S7.h;
import S7.k;
import S7.p;
import S7.w;
import T7.i1;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f4193a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f4194b;

    /* renamed from: c  reason: collision with root package name */
    public static final String f4195c;

    /* renamed from: d  reason: collision with root package name */
    public static final char[] f4196d = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    static {
        Charset forName = Charset.forName("UTF-8");
        f4194b = forName;
        f4195c = forName.name();
    }

    public static q0 a(a aVar, String str, String str2, q0 q0Var) {
        String str3;
        w wVar;
        byte[] bArr = new byte[4];
        aVar.mark(4);
        aVar.read(bArr, 0, 4);
        aVar.reset();
        byte b8 = bArr[0];
        h hVar = null;
        if ((b8 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b8 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            str3 = "UTF-32";
        } else if ((b8 == -2 && bArr[1] == -1) || (b8 == -1 && bArr[1] == -2)) {
            str3 = "UTF-16";
        } else if (b8 == -17 && bArr[1] == -69 && bArr[2] == -65) {
            aVar.read(bArr, 0, 3);
            str3 = "UTF-8";
        } else {
            str3 = null;
        }
        if (str3 != null) {
            str = str3;
        }
        Charset charset = f4194b;
        String str4 = f4195c;
        if (str == null) {
            int i = aVar.f4350V;
            aVar.f4353Y = (5120 - i) + aVar.f4353Y;
            aVar.f4350V = 5120;
            aVar.mark(5120);
            aVar.f4356b0 = false;
            try {
                h f8 = ((i1) q0Var.f300V).f(new InputStreamReader(aVar, charset), str2, q0Var);
                aVar.reset();
                aVar.f4353Y = (i - aVar.f4350V) + aVar.f4353Y;
                aVar.f4350V = i;
                aVar.f4356b0 = true;
                Iterator it = f8.M("meta[http-equiv=content-type], meta[charset]").iterator();
                String str5 = null;
                while (it.hasNext()) {
                    k kVar = (k) it.next();
                    if (kVar.l("http-equiv")) {
                        str5 = b(kVar.c("content"));
                    }
                    if (str5 == null && kVar.l("charset")) {
                        str5 = kVar.c("charset");
                        continue;
                    }
                    if (str5 != null) {
                        break;
                    }
                }
                if (str5 == null && f8.f4561Z.size() > 0) {
                    p pVar = (p) f8.k().get(0);
                    if (pVar instanceof w) {
                        wVar = (w) pVar;
                    } else {
                        if (pVar instanceof e) {
                            e eVar = (e) pVar;
                            String C8 = eVar.C();
                            if (C8.length() > 1 && (C8.startsWith("!") || C8.startsWith("?"))) {
                                wVar = eVar.E();
                            }
                        }
                        wVar = null;
                    }
                    if (wVar != null && wVar.C().equalsIgnoreCase("xml")) {
                        str5 = wVar.c("encoding");
                    }
                }
                String d8 = d(str5);
                if (d8 != null && !d8.equalsIgnoreCase(str4)) {
                    str = d8.trim().replaceAll("[\"']", "");
                } else if (aVar.f4349U.f4366Y) {
                    aVar.close();
                    hVar = f8;
                }
            } catch (UncheckedIOException e) {
                throw e.getCause();
            } catch (Throwable th) {
                aVar.f4356b0 = true;
                throw th;
            }
        } else {
            g.B(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        if (str == null) {
            str = str4;
        }
        if (!str.equals(str4)) {
            charset = Charset.forName(str);
        }
        q0 q0Var2 = new q0(15);
        q0Var2.f300V = charset;
        q0Var2.f301W = aVar;
        q0Var2.f302X = hVar;
        return q0Var2;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f4193a.matcher(str);
        if (matcher.find()) {
            return d(matcher.group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    public static h c(q0 q0Var, String str, q0 q0Var2) {
        h hVar = (h) q0Var.f302X;
        if (hVar != null) {
            return hVar;
        }
        Charset charset = (Charset) q0Var.f300V;
        InputStreamReader inputStreamReader = new InputStreamReader((a) q0Var.f301W, charset);
        try {
            h f8 = ((i1) q0Var2.f300V).f(inputStreamReader, str, q0Var2);
            f8.f4553d0.f4548V = charset;
            if (!charset.canEncode()) {
                f8.Q(f4194b);
            }
            inputStreamReader.close();
            return f8;
        } catch (UncheckedIOException e) {
            throw e.getCause();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static String d(String str) {
        if (!(str == null || str.length() == 0)) {
            String replaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
