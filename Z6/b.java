package Z6;

import B.C0003d;
import D6.f;
import F.h;
import N.e;
import P6.j;
import W6.d;
import Y6.m;
import Y6.o;
import Y6.r;
import Y6.u;
import Y6.v;
import f7.C0939b;
import h1.C1048n;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import l7.i;
import l7.n;
import l7.q;
import l7.w;
import n2.a;
import org.altbeacon.bluetooth.Pdu;
import u.C1477r;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f6982a;

    /* renamed from: b  reason: collision with root package name */
    public static final m f6983b = h.x(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final v f6984c;

    /* renamed from: d  reason: collision with root package name */
    public static final TimeZone f6985d;
    public static final j e = new j("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: f  reason: collision with root package name */
    public static final String f6986f;

    /* JADX WARNING: type inference failed for: r5v2, types: [l7.f, l7.h, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v18, types: [l7.f, java.lang.Object] */
    static {
        ArrayList arrayList;
        int i;
        byte[] bArr = new byte[0];
        f6982a = bArr;
        ? obj = new Object();
        obj.x(bArr, 0, 0);
        long j7 = (long) 0;
        f6984c = new v(j7, obj, 0);
        if (j7 < 0 || j7 > j7 || 0 < j7) {
            throw new ArrayIndexOutOfBoundsException();
        }
        i iVar = i.f13217X;
        i[] iVarArr = {C1048n.k("efbbbf"), C1048n.k("feff"), C1048n.k("fffe"), C1048n.k("0000ffff"), C1048n.k("ffff0000")};
        ArrayList arrayList2 = new ArrayList(new f(iVarArr, false));
        if (arrayList2.size() > 1) {
            Collections.sort(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(5);
        for (int i8 = 0; i8 < 5; i8++) {
            i iVar2 = iVarArr[i8];
            arrayList3.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList3.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        P6.f.e(copyOf, "elements");
        if (copyOf.length == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(new f(copyOf, true));
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 < 5) {
            i iVar3 = iVarArr[i9];
            int i11 = i10 + 1;
            int size = arrayList2.size();
            int size2 = arrayList2.size();
            if (size < 0) {
                throw new IllegalArgumentException(C1477r.c(size, "fromIndex (0) is greater than toIndex (", ")."));
            } else if (size <= size2) {
                int i12 = size - 1;
                int i13 = 0;
                while (true) {
                    if (i13 > i12) {
                        i = -(i13 + 1);
                        break;
                    }
                    i = (i13 + i12) >>> 1;
                    int i14 = C0003d.i((Comparable) arrayList2.get(i), iVar3);
                    if (i14 >= 0) {
                        if (i14 <= 0) {
                            break;
                        }
                        i12 = i - 1;
                    } else {
                        i13 = i + 1;
                    }
                }
                arrayList.set(i, Integer.valueOf(i10));
                i9++;
                i10 = i11;
            } else {
                throw new IndexOutOfBoundsException(e.v("toIndex (", size, ") is greater than size (", size2, ")."));
            }
        }
        if (((i) arrayList2.get(0)).a() > 0) {
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                i iVar4 = (i) arrayList2.get(i15);
                int i16 = i15 + 1;
                int i17 = i16;
                while (i17 < arrayList2.size()) {
                    i iVar5 = (i) arrayList2.get(i17);
                    iVar5.getClass();
                    P6.f.e(iVar4, "prefix");
                    if (!iVar5.f(iVar4, iVar4.a())) {
                        continue;
                        break;
                    } else if (iVar5.a() == iVar4.a()) {
                        throw new IllegalArgumentException(("duplicate option: " + iVar5).toString());
                    } else if (((Number) arrayList.get(i17)).intValue() > ((Number) arrayList.get(i15)).intValue()) {
                        arrayList2.remove(i17);
                        arrayList.remove(i17);
                    } else {
                        i17++;
                    }
                }
                i15 = i16;
            }
            ? obj2 = new Object();
            a.f(0, obj2, 0, arrayList2, 0, arrayList2.size(), arrayList);
            int[] iArr = new int[((int) (obj2.f13216V / ((long) 4)))];
            int i18 = 0;
            while (!obj2.k()) {
                iArr[i18] = obj2.q();
                i18++;
            }
            Object[] copyOf2 = Arrays.copyOf(iVarArr, 5);
            P6.f.d(copyOf2, "copyOf(this, size)");
            new n((i[]) copyOf2);
            TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
            P6.f.b(timeZone);
            f6985d = timeZone;
            String l02 = d.l0(r.class.getName(), "okhttp3.");
            if (l02.endsWith("Client")) {
                l02 = l02.substring(0, l02.length() - 6);
                P6.f.d(l02, "substring(...)");
            }
            f6986f = l02;
            return;
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public static final boolean a(o oVar, o oVar2) {
        P6.f.e(oVar, "<this>");
        P6.f.e(oVar2, "other");
        if (!P6.f.a(oVar.f6672d, oVar2.f6672d) || oVar.e != oVar2.e || !P6.f.a(oVar.f6669a, oVar2.f6669a)) {
            return false;
        }
        return true;
    }

    public static final int b(long j7, TimeUnit timeUnit) {
        int i = (j7 > 0 ? 1 : (j7 == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalStateException("timeout".concat(" < 0").toString());
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j7);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("timeout".concat(" too large.").toString());
            } else if (millis != 0 || i <= 0) {
                return (int) millis;
            } else {
                throw new IllegalArgumentException("timeout".concat(" too small.").toString());
            }
        } else {
            throw new IllegalStateException("unit == null");
        }
    }

    public static final void c(Closeable closeable) {
        P6.f.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e8) {
            throw e8;
        } catch (Exception unused) {
        }
    }

    public static final void d(Socket socket) {
        P6.f.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e8) {
            throw e8;
        } catch (RuntimeException e9) {
            if (!P6.f.a(e9.getMessage(), "bio == null")) {
                throw e9;
            }
        } catch (Exception unused) {
        }
    }

    public static final int e(String str, char c8, int i, int i8) {
        while (i < i8) {
            if (str.charAt(i) == c8) {
                return i;
            }
            i++;
        }
        return i8;
    }

    public static final int f(String str, int i, String str2, int i8) {
        while (i < i8) {
            if (d.b0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i8;
    }

    public static final boolean g(w wVar, TimeUnit timeUnit) {
        P6.f.e(timeUnit, "timeUnit");
        try {
            return s(wVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String h(String str, Object... objArr) {
        P6.f.e(str, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean i(String[] strArr, String[] strArr2, Comparator comparator) {
        P6.f.e(strArr, "<this>");
        if (!(strArr.length == 0 || strArr2 == null || strArr2.length == 0)) {
            for (String str : strArr) {
                D6.b g8 = P6.f.g(strArr2);
                while (g8.hasNext()) {
                    if (comparator.compare(str, (String) g8.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long j(u uVar) {
        String b8 = uVar.f6744Z.b("Content-Length");
        if (b8 == null) {
            return -1;
        }
        try {
            return Long.parseLong(b8);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static final List k(Object... objArr) {
        P6.f.e(objArr, "elements");
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = DesugarCollections.unmodifiableList(D6.j.L(Arrays.copyOf(objArr2, objArr2.length)));
        P6.f.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int l(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (P6.f.f(charAt, 31) <= 0 || P6.f.f(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int m(int i, int i8, String str) {
        while (i < i8) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i8;
    }

    public static final int n(int i, int i8, String str) {
        int i9 = i8 - 1;
        if (i <= i9) {
            while (true) {
                char charAt = str.charAt(i9);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i9 == i) {
                        break;
                    }
                    i9--;
                } else {
                    return i9 + 1;
                }
            }
        }
        return i;
    }

    public static final String[] o(String[] strArr, String[] strArr2, Comparator comparator) {
        P6.f.e(strArr2, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean p(String str) {
        P6.f.e(str, "name");
        if (str.equalsIgnoreCase("Authorization") || str.equalsIgnoreCase("Cookie") || str.equalsIgnoreCase("Proxy-Authorization") || str.equalsIgnoreCase("Set-Cookie")) {
            return true;
        }
        return false;
    }

    public static final int q(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 'W';
        }
        if ('A' > c8 || c8 >= 'G') {
            return -1;
        }
        return c8 - '7';
    }

    public static final int r(q qVar) {
        P6.f.e(qVar, "<this>");
        return (qVar.m() & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((qVar.m() & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((qVar.m() & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8);
    }

    /* JADX WARNING: type inference failed for: r12v6, types: [l7.f, java.lang.Object] */
    public static final boolean s(w wVar, int i, TimeUnit timeUnit) {
        long j7;
        P6.f.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (wVar.a().e()) {
            j7 = wVar.a().c() - nanoTime;
        } else {
            j7 = Long.MAX_VALUE;
        }
        wVar.a().d(Math.min(j7, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            ? obj = new Object();
            while (wVar.f(obj, 8192) != -1) {
                obj.t(obj.f13216V);
            }
            if (j7 == Long.MAX_VALUE) {
                wVar.a().a();
            } else {
                wVar.a().d(nanoTime + j7);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j7 == Long.MAX_VALUE) {
                wVar.a().a();
            } else {
                wVar.a().d(nanoTime + j7);
            }
            return false;
        } catch (Throwable th) {
            if (j7 == Long.MAX_VALUE) {
                wVar.a().a();
            } else {
                wVar.a().d(nanoTime + j7);
            }
            throw th;
        }
    }

    public static final m t(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0939b bVar = (C0939b) it.next();
            String h5 = bVar.f11700a.h();
            String h8 = bVar.f11701b.h();
            arrayList.add(h5);
            arrayList.add(d.s0(h8).toString());
        }
        return new m((String[]) arrayList.toArray(new String[0]));
    }

    public static final String u(o oVar, boolean z) {
        int i;
        P6.f.e(oVar, "<this>");
        String str = oVar.f6672d;
        if (d.c0(str, ":")) {
            str = "[" + str + ']';
        }
        int i8 = oVar.e;
        if (!z) {
            String str2 = oVar.f6669a;
            P6.f.e(str2, "scheme");
            if (str2.equals("http")) {
                i = 80;
            } else if (str2.equals("https")) {
                i = 443;
            } else {
                i = -1;
            }
            if (i8 == i) {
                return str;
            }
        }
        return str + ':' + i8;
    }

    public static final List v(List list) {
        P6.f.e(list, "<this>");
        List unmodifiableList = DesugarCollections.unmodifiableList(D6.i.V(list));
        P6.f.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int w(int i, String str) {
        if (str == null) {
            return i;
        }
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static final String x(int i, int i8, String str) {
        int m8 = m(i, i8, str);
        String substring = str.substring(m8, n(m8, i8, str));
        P6.f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
