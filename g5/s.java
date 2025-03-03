package G5;

import A4.b;
import D0.c;
import D6.h;
import D6.k;
import D6.u;
import N1.f;
import P0.l;
import S4.a;
import S5.C0185n;
import T5.C0260n;
import T5.K;
import T5.O0;
import Y6.i;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.g;
import g7.C0996d;
import j$.nio.channels.DesugarChannels;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q0.C1355b;
import q0.C1357d;
import q0.C1360g;
import t5.C1430b;
import u.C1477r;
import u4.C1493b;
import u4.d;
import x5.C1606a;
import x5.C1607b;

public final class s {

    /* renamed from: b  reason: collision with root package name */
    public static Field f1724b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f1725c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1726a;

    public /* synthetic */ s(int i) {
        this.f1726a = i;
    }

    public static void A(f fVar) {
        int i;
        int i8;
        int i9 = fVar.i(2);
        int i10 = 6;
        if (i9 == 0) {
            fVar.u(6);
            return;
        }
        int i11 = 5;
        int y8 = y(fVar, 5, 8, 16) + 1;
        if (i9 == 1) {
            fVar.u(y8 * 7);
        } else if (i9 == 2) {
            boolean h5 = fVar.h();
            if (h5) {
                i = 1;
            } else {
                i = 5;
            }
            if (h5) {
                i11 = 7;
            }
            if (h5) {
                i10 = 8;
            }
            int i12 = 0;
            while (i12 < y8) {
                if (fVar.h()) {
                    fVar.u(7);
                    i8 = 0;
                } else {
                    if (fVar.i(2) == 3 && fVar.i(i11) * i != 0) {
                        fVar.t();
                    }
                    i8 = fVar.i(i10) * i;
                    if (!(i8 == 0 || i8 == 180)) {
                        fVar.t();
                    }
                    fVar.t();
                }
                if (!(i8 == 0 || i8 == 180 || !fVar.h())) {
                    i12++;
                }
                i12++;
            }
        }
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i8) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i8, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i8 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i8, 33);
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    public static void c(int i, int i8, int i9) {
        if (i < 0 || i8 > i9) {
            StringBuilder e = C1477r.e("fromIndex: ", i, ", toIndex: ", i8, ", size: ");
            e.append(i9);
            throw new IndexOutOfBoundsException(e.toString());
        } else if (i > i8) {
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i8);
        }
    }

    public static void d(K k8, String str) {
        o(k8, new g(str, (Throwable) null), 2);
    }

    public static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long[] f(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (serializable instanceof long[]) {
            return (long[]) serializable;
        } else {
            return null;
        }
    }

    public static boolean g(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean h5 = h(file, inputStream);
                e(inputStream);
                return h5;
            } catch (Throwable th) {
                th = th;
                e(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            e(inputStream);
            throw th;
        }
    }

    public static boolean h(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        e(fileOutputStream2);
                        StrictMode.setThreadPolicy(allowThreadDiskWrites);
                        return true;
                    }
                }
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    e(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    e(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                e(fileOutputStream);
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            e(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        }
    }

    public static int i(boolean z, int i, int i8, String str) {
        boolean z6;
        while (i < i8) {
            char charAt = str.charAt(i);
            if ((charAt >= ' ' || charAt == 9) && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (z6 == (!z)) {
                return i;
            }
            i++;
        }
        return i8;
    }

    public static int j(C0185n nVar) {
        byte b8 = 0;
        int i = 0;
        while (b8 <= 21) {
            if (!nVar.isReadable()) {
                return -1;
            }
            byte readByte = nVar.readByte();
            i += (readByte & Byte.MAX_VALUE) << b8;
            b8 = (byte) (b8 + 7);
            if ((readByte & 128) == 0) {
                if (b8 <= 7 || readByte != 0) {
                    return i;
                }
                return -3;
            }
        }
        return -2;
    }

    public static void k(K k8, C1607b bVar, g gVar) {
        d g8;
        C1607b bVar2 = C1606a.f16298a;
        C1493b bVar3 = C1493b.f15776c;
        C0996d.r(bVar, "Reason Code");
        String message = gVar.getMessage();
        if (message == null) {
            g8 = null;
        } else {
            g8 = d.g(message, "Reason string");
        }
        o(k8, new C1430b(new a(bVar, -1, (d) null, g8, bVar3), gVar), 2);
    }

    public static void l(K k8, C1607b bVar, String str) {
        d g8;
        C1607b bVar2 = C1606a.f16298a;
        C1493b bVar3 = C1493b.f15776c;
        C0996d.r(bVar, "Reason Code");
        if (str == null) {
            g8 = null;
        } else {
            g8 = d.g(str, "Reason string");
        }
        o(k8, new C1430b(new a(bVar, -1, (d) null, g8, bVar3), str), 2);
    }

    public static void m(C0185n nVar, int i) {
        do {
            int i8 = i & 127;
            i >>>= 7;
            if (i > 0) {
                i8 |= 128;
            }
            nVar.writeByte(i8);
        } while (i > 0);
    }

    public static int n(int i) {
        if (i <= 127) {
            return 1;
        }
        if (i <= 16383) {
            return 2;
        }
        if (i > 2097151) {
            return 4;
        }
        return 3;
    }

    public static void o(K k8, g gVar, int i) {
        ((O0) ((C0260n) k8).pipeline()).fireUserEventTriggered(new b(gVar, i));
    }

    public static Drawable p(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return I.a.e(compoundButton);
        }
        if (!f1725c) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f1724b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f1725c = true;
        }
        Field field = f1724b;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e8) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e8);
                f1724b = null;
            }
        }
        return null;
    }

    public static C1357d q(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C1357d(new C1360g(C1355b.c(configuration)));
        }
        return C1357d.a(configuration.locale);
    }

    public static final int r(int i, int i8, int i9) {
        if (i9 > 0) {
            if (i >= i8) {
                return i8;
            }
            int i10 = i8 % i9;
            if (i10 < 0) {
                i10 += i9;
            }
            int i11 = i % i9;
            if (i11 < 0) {
                i11 += i9;
            }
            int i12 = (i10 - i11) % i9;
            if (i12 < 0) {
                i12 += i9;
            }
            return i8 - i12;
        } else if (i9 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i8) {
            return i8;
        } else {
            int i13 = -i9;
            int i14 = i % i13;
            if (i14 < 0) {
                i14 += i13;
            }
            int i15 = i8 % i13;
            if (i15 < 0) {
                i15 += i13;
            }
            int i16 = (i14 - i15) % i13;
            if (i16 < 0) {
                i16 += i13;
            }
            return i8 + i16;
        }
    }

    public static File s(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        int i = 0;
        while (i < 100) {
            File file = new File(cacheDir, str + i);
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean t(java.lang.String r4) {
        /*
            k2.b r0 = k2.C1156m.f13021a
            java.util.HashSet r0 = k2.C1146c.f13015c
            java.util.Set r0 = j$.util.DesugarCollections.unmodifiableSet(r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0011:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r0.next()
            k2.h r2 = (k2.C1151h) r2
            r3 = r2
            k2.c r3 = (k2.C1146c) r3
            java.lang.String r3 = r3.f13016a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0011
            r1.add(r2)
            goto L_0x0011
        L_0x002c:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0054
            java.util.Iterator r4 = r1.iterator()
        L_0x0036:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r4.next()
            k2.h r0 = (k2.C1151h) r0
            k2.c r0 = (k2.C1146c) r0
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0050
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0036
        L_0x0050:
            r4 = 1
            goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            return r4
        L_0x0054:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unknown feature "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.s.t(java.lang.String):boolean");
    }

    public static MappedByteBuffer u(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        FileInputStream fileInputStream;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", (CancellationSignal) null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel convertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
            MappedByteBuffer map = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0, convertMaybeLegacyFileChannelFromLibrary.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
            throw th;
            throw th;
        } catch (IOException unused) {
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
    }

    public static long v(int i, String str) {
        int i8 = i(false, 0, i, str);
        Matcher matcher = i.f6645m.matcher(str);
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        while (i8 < i) {
            int i15 = i(true, i8 + 1, i, str);
            matcher.region(i8, i15);
            if (i10 == -1 && matcher.usePattern(i.f6645m).matches()) {
                String group = matcher.group(1);
                P6.f.d(group, "matcher.group(1)");
                i10 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                P6.f.d(group2, "matcher.group(2)");
                i13 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                P6.f.d(group3, "matcher.group(3)");
                i14 = Integer.parseInt(group3);
            } else if (i11 != -1 || !matcher.usePattern(i.f6644l).matches()) {
                if (i12 == -1) {
                    Pattern pattern = i.f6643k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group4 = matcher.group(1);
                        P6.f.d(group4, "matcher.group(1)");
                        Locale locale = Locale.US;
                        P6.f.d(locale, "US");
                        String lowerCase = group4.toLowerCase(locale);
                        P6.f.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        P6.f.d(pattern2, "MONTH_PATTERN.pattern()");
                        i12 = W6.d.g0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i9 == -1 && matcher.usePattern(i.f6642j).matches()) {
                    String group5 = matcher.group(1);
                    P6.f.d(group5, "matcher.group(1)");
                    i9 = Integer.parseInt(group5);
                }
            } else {
                String group6 = matcher.group(1);
                P6.f.d(group6, "matcher.group(1)");
                i11 = Integer.parseInt(group6);
            }
            i8 = i(false, i15 + 1, i, str);
        }
        if (70 <= i9 && i9 < 100) {
            i9 += 1900;
        }
        if (i9 >= 0 && i9 < 70) {
            i9 += 2000;
        }
        if (i9 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (i12 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (1 > i11 || i11 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (i10 < 0 || i10 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (i13 < 0 || i13 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (i14 < 0 || i14 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Z6.b.f6985d);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i9);
            gregorianCalendar.set(2, i12 - 1);
            gregorianCalendar.set(5, i11);
            gregorianCalendar.set(11, i10);
            gregorianCalendar.set(12, i13);
            gregorianCalendar.set(13, i14);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [D0.c, D0.b] */
    public static D0.b x(MappedByteBuffer mappedByteBuffer) {
        long j7;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i8 = 0;
            while (true) {
                if (i8 >= i) {
                    j7 = -1;
                    break;
                }
                int i9 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                j7 = ((long) duplicate.getInt()) & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i9) {
                    break;
                }
                i8++;
            }
            if (j7 != -1) {
                duplicate.position(duplicate.position() + ((int) (j7 - ((long) duplicate.position()))));
                duplicate.position(duplicate.position() + 12);
                long j8 = ((long) duplicate.getInt()) & 4294967295L;
                for (int i10 = 0; ((long) i10) < j8; i10++) {
                    int i11 = duplicate.getInt();
                    long j9 = ((long) duplicate.getInt()) & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i11 || 1701669481 == i11) {
                        duplicate.position((int) (j9 + j7));
                        ? cVar = new c();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        cVar.f980d = duplicate;
                        cVar.f977a = position;
                        int i12 = position - duplicate.getInt(position);
                        cVar.f978b = i12;
                        cVar.f979c = ((ByteBuffer) cVar.f980d).getShort(i12);
                        return cVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static int y(f fVar, int i, int i8, int i9) {
        boolean z;
        if (Math.max(Math.max(i, i8), i9) <= 31) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        int i10 = (1 << i) - 1;
        int i11 = (1 << i8) - 1;
        n2.a.n(n2.a.n(i10, i11), 1 << i9);
        if (fVar.b() < i) {
            return -1;
        }
        int i12 = fVar.i(i);
        if (i12 != i10) {
            return i12;
        }
        if (fVar.b() < i8) {
            return -1;
        }
        int i13 = fVar.i(i8);
        int i14 = i12 + i13;
        if (i13 != i11) {
            return i14;
        }
        if (fVar.b() < i9) {
            return -1;
        }
        return i14 + fVar.i(i9);
    }

    public static void z(f fVar) {
        fVar.u(3);
        fVar.u(8);
        boolean h5 = fVar.h();
        boolean h8 = fVar.h();
        if (h5) {
            fVar.u(5);
        }
        if (h8) {
            fVar.u(6);
        }
    }

    public final Object w(int i, Intent intent) {
        Integer valueOf;
        boolean z;
        switch (this.f1726a) {
            case 0:
                if (i != -1) {
                    return new t((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, intent);
                }
                String stringExtra = intent.getStringExtra("SCAN_RESULT");
                String stringExtra2 = intent.getStringExtra("SCAN_RESULT_FORMAT");
                byte[] byteArrayExtra = intent.getByteArrayExtra("SCAN_RESULT_BYTES");
                int intExtra = intent.getIntExtra("SCAN_RESULT_ORIENTATION", RecyclerView.UNDEFINED_DURATION);
                if (intExtra == Integer.MIN_VALUE) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(intExtra);
                }
                return new t(stringExtra, stringExtra2, byteArrayExtra, valueOf, intent.getStringExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL"), intent.getStringExtra("SCAN_RESULT_IMAGE_PATH"), intent);
            case 1:
                return new androidx.activity.result.a(i, intent);
            case 2:
                D6.s sVar = D6.s.f1270U;
                if (i != -1 || intent == null) {
                    return sVar;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return sVar;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i8 : intArrayExtra) {
                    if (i8 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                ArrayList G8 = h.G(stringArrayExtra);
                Iterator it = G8.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(k.M(G8), k.M(arrayList)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new C6.c(it.next(), it2.next()));
                }
                return u.E(arrayList2);
            default:
                return new androidx.activity.result.a(i, intent);
        }
    }
}
