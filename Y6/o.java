package Y6;

import P6.f;
import W6.d;
import Z6.b;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class o {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f6668j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a  reason: collision with root package name */
    public final String f6669a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6670b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6671c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6672d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f6673f;

    /* renamed from: g  reason: collision with root package name */
    public final String f6674g;

    /* renamed from: h  reason: collision with root package name */
    public final String f6675h;
    public final boolean i;

    public o(String str, String str2, String str3, String str4, int i8, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        f.e(str, "scheme");
        f.e(str4, "host");
        this.f6669a = str;
        this.f6670b = str2;
        this.f6671c = str3;
        this.f6672d = str4;
        this.e = i8;
        this.f6673f = arrayList2;
        this.f6674g = str5;
        this.f6675h = str6;
        this.i = str.equals("https");
    }

    public final String a() {
        if (this.f6671c.length() == 0) {
            return "";
        }
        String str = this.f6675h;
        String substring = str.substring(d.f0(str, ':', this.f6669a.length() + 3, false, 4) + 1, d.f0(str, '@', 0, false, 6));
        f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String b() {
        String str = this.f6675h;
        int f02 = d.f0(str, '/', this.f6669a.length() + 3, false, 4);
        String substring = str.substring(f02, b.f(str, f02, "?#", str.length()));
        f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final ArrayList c() {
        String str = this.f6675h;
        int f02 = d.f0(str, '/', this.f6669a.length() + 3, false, 4);
        int f8 = b.f(str, f02, "?#", str.length());
        ArrayList arrayList = new ArrayList();
        while (f02 < f8) {
            int i8 = f02 + 1;
            int e8 = b.e(str, '/', i8, f8);
            String substring = str.substring(i8, e8);
            f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            f02 = e8;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f6673f == null) {
            return null;
        }
        String str = this.f6675h;
        int f02 = d.f0(str, '?', 0, false, 6) + 1;
        String substring = str.substring(f02, b.e(str, '#', f02, str.length()));
        f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String e() {
        if (this.f6670b.length() == 0) {
            return "";
        }
        int length = this.f6669a.length() + 3;
        String str = this.f6675h;
        String substring = str.substring(length, b.f(str, length, ":@", str.length()));
        f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o) || !f.a(((o) obj).f6675h, this.f6675h)) {
            return false;
        }
        return true;
    }

    public final URI f() {
        int i8;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        n nVar = new n();
        String str4 = this.f6669a;
        nVar.f6661a = str4;
        nVar.f6662b = e();
        nVar.f6663c = a();
        nVar.f6664d = this.f6672d;
        f.e(str4, "scheme");
        int i9 = -1;
        if (str4.equals("http")) {
            i8 = 80;
        } else if (str4.equals("https")) {
            i8 = 443;
        } else {
            i8 = -1;
        }
        int i10 = this.e;
        if (i10 != i8) {
            i9 = i10;
        }
        nVar.e = i9;
        ArrayList arrayList2 = nVar.f6665f;
        arrayList2.clear();
        arrayList2.addAll(c());
        String d8 = d();
        String str5 = null;
        if (d8 != null) {
            arrayList = b.f(b.b(d8, 0, 0, " \"'<>#", true, false, true, false, 211));
        } else {
            arrayList = null;
        }
        nVar.f6666g = arrayList;
        if (this.f6674g == null) {
            str = null;
        } else {
            String str6 = this.f6675h;
            str = str6.substring(d.f0(str6, '#', 0, false, 6) + 1);
            f.d(str, "this as java.lang.String).substring(startIndex)");
        }
        nVar.f6667h = str;
        String str7 = nVar.f6664d;
        if (str7 != null) {
            Pattern compile = Pattern.compile("[\"<>^`{|}]");
            f.d(compile, "compile(...)");
            str2 = compile.matcher(str7).replaceAll("");
            f.d(str2, "replaceAll(...)");
        } else {
            str2 = null;
        }
        nVar.f6664d = str2;
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.set(i11, b.b((String) arrayList2.get(i11), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList3 = nVar.f6666g;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i12 = 0; i12 < size2; i12++) {
                String str8 = (String) arrayList3.get(i12);
                if (str8 != null) {
                    str3 = b.b(str8, 0, 0, "\\^`{|}", true, true, true, false, 195);
                } else {
                    str3 = null;
                }
                arrayList3.set(i12, str3);
            }
        }
        String str9 = nVar.f6667h;
        if (str9 != null) {
            str5 = b.b(str9, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        nVar.f6667h = str5;
        String nVar2 = nVar.toString();
        try {
            return new URI(nVar2);
        } catch (URISyntaxException e8) {
            try {
                Pattern compile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                f.d(compile2, "compile(...)");
                String replaceAll = compile2.matcher(nVar2).replaceAll("");
                f.d(replaceAll, "replaceAll(...)");
                URI create = URI.create(replaceAll);
                f.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e8);
            }
        }
    }

    public final int hashCode() {
        return this.f6675h.hashCode();
    }

    public final String toString() {
        return this.f6675h;
    }
}
