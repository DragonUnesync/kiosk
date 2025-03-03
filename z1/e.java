package Z1;

import K1.i;
import Q0.g;
import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.altbeacon.bluetooth.Pdu;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final i f6956a = new i(26);

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f6957b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f6958c = {112, 114, 109, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f6959d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f6960f = {48, 48, 57, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f6961g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f6962h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f6963j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static byte[] b(g1.e[] eVarArr, byte[] bArr) {
        int i8 = 0;
        for (g1.e eVar : eVarArr) {
            i8 += ((((eVar.i * 2) + 7) & -8) / 8) + (eVar.f11874f * 2) + d((String) eVar.f11871b, bArr, (String) eVar.f11872c).getBytes(StandardCharsets.UTF_8).length + 16 + eVar.f11876h;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i8);
        if (Arrays.equals(bArr, f6960f)) {
            for (g1.e eVar2 : eVarArr) {
                p(byteArrayOutputStream, eVar2, d((String) eVar2.f11871b, bArr, (String) eVar2.f11872c));
                r(byteArrayOutputStream, eVar2);
                int[] iArr = (int[]) eVar2.f11873d;
                int length = iArr.length;
                int i9 = 0;
                int i10 = 0;
                while (i9 < length) {
                    int i11 = iArr[i9];
                    u(byteArrayOutputStream, i11 - i10);
                    i9++;
                    i10 = i11;
                }
                q(byteArrayOutputStream, eVar2);
            }
        } else {
            for (g1.e eVar3 : eVarArr) {
                p(byteArrayOutputStream, eVar3, d((String) eVar3.f11871b, bArr, (String) eVar3.f11872c));
            }
            for (g1.e eVar4 : eVarArr) {
                r(byteArrayOutputStream, eVar4);
                int[] iArr2 = (int[]) eVar4.f11873d;
                int length2 = iArr2.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length2) {
                    int i14 = iArr2[i12];
                    u(byteArrayOutputStream, i14 - i13);
                    i12++;
                    i13 = i14;
                }
                q(byteArrayOutputStream, eVar4);
            }
        }
        if (byteArrayOutputStream.size() == i8) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i8);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File c8 : listFiles) {
                if (!c(c8) || !z) {
                    z = false;
                } else {
                    z = true;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    public static String d(String str, byte[] bArr, String str2) {
        String str3;
        byte[] bArr2 = f6962h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f6961g;
        String str4 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            str3 = str4;
        } else {
            str3 = ":";
        }
        if (str.length() <= 0) {
            if (str4.equals(str3)) {
                return str2.replace(":", str4);
            }
            if (":".equals(str3)) {
                return str2.replace(str4, ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (str2.contains(str4) || str2.contains(":")) {
                if (str4.equals(str3)) {
                    return str2.replace(":", str4);
                }
                if (":".equals(str3)) {
                    return str2.replace(str4, ":");
                }
                return str2;
            } else if (str2.endsWith(".apk")) {
                return str2;
            } else {
                StringBuilder r8 = g.r(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str4 = ":";
                }
                return N.e.A(r8, str4, str2);
            }
        }
    }

    public static void e(PackageInfo packageInfo, File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static byte[] f(InputStream inputStream, int i8) {
        byte[] bArr = new byte[i8];
        int i9 = 0;
        while (i9 < i8) {
            int read = inputStream.read(bArr, i9, i8 - i9);
            if (read >= 0) {
                i9 += read;
            } else {
                throw new IllegalStateException(g.m(i8, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i8) {
        int[] iArr = new int[i8];
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            i9 += (int) m(byteArrayInputStream, 2);
            iArr[i10] = i9;
        }
        return iArr;
    }

    public static byte[] h(FileInputStream fileInputStream, int i8, int i9) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i9];
            byte[] bArr2 = new byte[2048];
            int i10 = 0;
            int i11 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i10 < i8) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i11 += inflater.inflate(bArr, i11, i9 - i11);
                    i10 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i8 + " bytes");
                }
            }
            if (i10 != i8) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i8 + " actual=" + i10);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e8) {
            throw new IllegalStateException(e8.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    public static g1.e[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, g1.e[] eVarArr) {
        byte[] bArr3 = i;
        if (Arrays.equals(bArr, bArr3)) {
            if (Arrays.equals(f6959d, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            } else if (Arrays.equals(bArr, bArr3)) {
                int m8 = (int) m(fileInputStream, 1);
                byte[] h5 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                if (fileInputStream.read() <= 0) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h5);
                    try {
                        g1.e[] j7 = j(byteArrayInputStream, m8, eVarArr);
                        byteArrayInputStream.close();
                        return j7;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                } else {
                    throw new IllegalStateException("Content found after the end of file");
                }
            } else {
                throw new IllegalStateException("Unsupported meta version");
            }
        } else if (Arrays.equals(bArr, f6963j)) {
            int m9 = (int) m(fileInputStream, 2);
            byte[] h8 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h8);
                try {
                    g1.e[] k8 = k(byteArrayInputStream2, bArr2, m9, eVarArr);
                    byteArrayInputStream2.close();
                    return k8;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
        throw th;
        throw th;
    }

    public static g1.e[] j(ByteArrayInputStream byteArrayInputStream, int i8, g1.e[] eVarArr) {
        int i9 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new g1.e[0];
        }
        if (i8 == eVarArr.length) {
            String[] strArr = new String[i8];
            int[] iArr = new int[i8];
            for (int i10 = 0; i10 < i8; i10++) {
                int m8 = (int) m(byteArrayInputStream, 2);
                iArr[i10] = (int) m(byteArrayInputStream, 2);
                strArr[i10] = new String(f(byteArrayInputStream, m8), StandardCharsets.UTF_8);
            }
            while (i9 < i8) {
                g1.e eVar = eVarArr[i9];
                if (((String) eVar.f11872c).equals(strArr[i9])) {
                    int i11 = iArr[i9];
                    eVar.f11874f = i11;
                    eVar.f11873d = g(byteArrayInputStream, i11);
                    i9++;
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return eVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static g1.e[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i8, g1.e[] eVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new g1.e[0];
        }
        if (i8 == eVarArr.length) {
            int i9 = 0;
            while (i9 < i8) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m8 = m(byteArrayInputStream, 4);
                int m9 = (int) m(byteArrayInputStream, 2);
                g1.e eVar = null;
                if (eVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 >= eVarArr.length) {
                            break;
                        } else if (((String) eVarArr[i10].f11872c).equals(str)) {
                            eVar = eVarArr[i10];
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (eVar != null) {
                    eVar.f11877j = m8;
                    int[] g8 = g(byteArrayInputStream, m9);
                    if (Arrays.equals(bArr, f6962h)) {
                        eVar.f11874f = m9;
                        eVar.f11873d = g8;
                    }
                    i9++;
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return eVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static g1.e[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, e)) {
            int m8 = (int) m(fileInputStream, 1);
            byte[] h5 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h5);
                try {
                    g1.e[] n4 = n(byteArrayInputStream, str, m8);
                    byteArrayInputStream.close();
                    return n4;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw new IllegalStateException("Content found after the end of file");
            }
        } else {
            throw new IllegalStateException("Unsupported version");
        }
        throw th;
    }

    public static long m(InputStream inputStream, int i8) {
        byte[] f8 = f(inputStream, i8);
        long j7 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            j7 += ((long) (f8[i9] & Pdu.MANUFACTURER_DATA_PDU_TYPE)) << (i9 * 8);
        }
        return j7;
    }

    public static g1.e[] n(ByteArrayInputStream byteArrayInputStream, String str, int i8) {
        TreeMap treeMap;
        int i9;
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        int i10 = i8;
        if (byteArrayInputStream.available() == 0) {
            return new g1.e[0];
        }
        g1.e[] eVarArr = new g1.e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int m8 = (int) m(byteArrayInputStream2, 2);
            String str2 = str;
            eVarArr[i11] = new g1.e(str2, new String(f(byteArrayInputStream2, (int) m(byteArrayInputStream2, 2)), StandardCharsets.UTF_8), m(byteArrayInputStream2, 4), m8, (int) m(byteArrayInputStream2, 4), (int) m(byteArrayInputStream2, 4), new int[m8], new TreeMap());
        }
        int i12 = 0;
        while (i12 < i10) {
            g1.e eVar = eVarArr[i12];
            int available = byteArrayInputStream.available() - eVar.f11876h;
            int i13 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = (TreeMap) eVar.e;
                if (available2 <= available) {
                    break;
                }
                i13 += (int) m(byteArrayInputStream2, 2);
                treeMap.put(Integer.valueOf(i13), 1);
                for (int m9 = (int) m(byteArrayInputStream2, 2); m9 > 0; m9--) {
                    m(byteArrayInputStream2, 2);
                    int m10 = (int) m(byteArrayInputStream2, 1);
                    if (!(m10 == 6 || m10 == 7)) {
                        while (m10 > 0) {
                            m(byteArrayInputStream2, 1);
                            for (int m11 = (int) m(byteArrayInputStream2, 1); m11 > 0; m11--) {
                                m(byteArrayInputStream2, 2);
                            }
                            m10--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                eVar.f11873d = g(byteArrayInputStream2, eVar.f11874f);
                int i14 = eVar.i;
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream2, (((i14 * 2) + 7) & -8) / 8));
                for (int i15 = 0; i15 < i14; i15++) {
                    if (valueOf.get(i15)) {
                        i9 = 2;
                    } else {
                        i9 = 0;
                    }
                    if (valueOf.get(i15 + i14)) {
                        i9 |= 4;
                    }
                    if (i9 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i15));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(i15), Integer.valueOf(i9 | num.intValue()));
                    }
                }
                i12++;
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return eVarArr;
    }

    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, g1.e[] eVarArr) {
        Throwable th;
        Throwable th2;
        Throwable th3;
        long j7;
        ArrayList arrayList;
        int length;
        ByteArrayOutputStream byteArrayOutputStream2;
        Throwable th4;
        ByteArrayOutputStream byteArrayOutputStream3;
        Throwable th5;
        ByteArrayOutputStream byteArrayOutputStream4 = byteArrayOutputStream;
        byte[] bArr2 = bArr;
        g1.e[] eVarArr2 = eVarArr;
        byte[] bArr3 = f6959d;
        int i8 = 0;
        if (Arrays.equals(bArr2, bArr3)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream5, eVarArr2.length);
                int i9 = 2;
                int i10 = 2;
                for (g1.e eVar : eVarArr2) {
                    t(byteArrayOutputStream5, eVar.f11875g, 4);
                    t(byteArrayOutputStream5, eVar.f11877j, 4);
                    t(byteArrayOutputStream5, (long) eVar.i, 4);
                    String d8 = d((String) eVar.f11871b, bArr3, (String) eVar.f11872c);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d8.getBytes(charset).length;
                    u(byteArrayOutputStream5, length2);
                    i10 = i10 + 14 + length2;
                    byteArrayOutputStream5.write(d8.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream5.toByteArray();
                if (i10 == byteArray.length) {
                    m mVar = new m(1, false, byteArray);
                    byteArrayOutputStream5.close();
                    arrayList2.add(mVar);
                    ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < eVarArr2.length) {
                        try {
                            g1.e eVar2 = eVarArr2[i11];
                            u(byteArrayOutputStream6, i11);
                            u(byteArrayOutputStream6, eVar2.f11874f);
                            i12 = i12 + 4 + (eVar2.f11874f * 2);
                            int[] iArr = (int[]) eVar2.f11873d;
                            int length3 = iArr.length;
                            int i13 = 0;
                            while (i8 < length3) {
                                int i14 = iArr[i8];
                                u(byteArrayOutputStream6, i14 - i13);
                                i8++;
                                i13 = i14;
                            }
                            i11++;
                            i8 = 0;
                        } catch (Throwable th6) {
                            th2.addSuppressed(th6);
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream6.toByteArray();
                    if (i12 == byteArray2.length) {
                        m mVar2 = new m(3, true, byteArray2);
                        byteArrayOutputStream6.close();
                        arrayList2.add(mVar2);
                        ByteArrayOutputStream byteArrayOutputStream7 = new ByteArrayOutputStream();
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < eVarArr2.length) {
                            try {
                                g1.e eVar3 = eVarArr2[i15];
                                int i17 = 0;
                                for (Map.Entry value : ((TreeMap) eVar3.e).entrySet()) {
                                    i17 |= ((Integer) value.getValue()).intValue();
                                }
                                byteArrayOutputStream2 = new ByteArrayOutputStream();
                                q(byteArrayOutputStream2, eVar3);
                                byte[] byteArray3 = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                byteArrayOutputStream3 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream3, eVar3);
                                byte[] byteArray4 = byteArrayOutputStream3.toByteArray();
                                byteArrayOutputStream3.close();
                                u(byteArrayOutputStream7, i15);
                                int length4 = byteArray3.length + i9 + byteArray4.length;
                                int i18 = i16 + 6;
                                ArrayList arrayList4 = arrayList3;
                                t(byteArrayOutputStream7, (long) length4, 4);
                                u(byteArrayOutputStream7, i17);
                                byteArrayOutputStream7.write(byteArray3);
                                byteArrayOutputStream7.write(byteArray4);
                                i16 = i18 + length4;
                                i15++;
                                arrayList3 = arrayList4;
                                i9 = 2;
                            } catch (Throwable th7) {
                                th3.addSuppressed(th7);
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream7.toByteArray();
                        if (i16 == byteArray5.length) {
                            m mVar3 = new m(4, true, byteArray5);
                            byteArrayOutputStream7.close();
                            arrayList2.add(mVar3);
                            long j8 = (long) 4;
                            long size = j8 + j8 + 4 + ((long) (arrayList2.size() * 16));
                            t(byteArrayOutputStream4, (long) arrayList2.size(), 4);
                            int i19 = 0;
                            while (i19 < arrayList2.size()) {
                                m mVar4 = (m) arrayList2.get(i19);
                                int i20 = mVar4.f6974a;
                                if (i20 == 1) {
                                    j7 = 0;
                                } else if (i20 == 2) {
                                    j7 = 1;
                                } else if (i20 == 3) {
                                    j7 = 2;
                                } else if (i20 == 4) {
                                    j7 = 3;
                                } else if (i20 == 5) {
                                    j7 = 4;
                                } else {
                                    throw null;
                                }
                                t(byteArrayOutputStream4, j7, 4);
                                t(byteArrayOutputStream4, size, 4);
                                byte[] bArr4 = mVar4.f6975b;
                                if (mVar4.f6976c) {
                                    long length5 = (long) bArr4.length;
                                    byte[] a8 = a(bArr4);
                                    arrayList = arrayList5;
                                    arrayList.add(a8);
                                    t(byteArrayOutputStream4, (long) a8.length, 4);
                                    t(byteArrayOutputStream4, length5, 4);
                                    length = a8.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr4);
                                    t(byteArrayOutputStream4, (long) bArr4.length, 4);
                                    t(byteArrayOutputStream4, 0, 4);
                                    length = bArr4.length;
                                }
                                size += (long) length;
                                i19++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                                byteArrayOutputStream4.write((byte[]) arrayList6.get(i21));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th8) {
                th.addSuppressed(th8);
            }
        } else {
            byte[] bArr5 = e;
            if (Arrays.equals(bArr2, bArr5)) {
                byte[] b8 = b(eVarArr2, bArr5);
                t(byteArrayOutputStream4, (long) eVarArr2.length, 1);
                t(byteArrayOutputStream4, (long) b8.length, 4);
                byte[] a9 = a(b8);
                t(byteArrayOutputStream4, (long) a9.length, 4);
                byteArrayOutputStream4.write(a9);
                return true;
            }
            byte[] bArr6 = f6961g;
            if (Arrays.equals(bArr2, bArr6)) {
                t(byteArrayOutputStream4, (long) eVarArr2.length, 1);
                for (g1.e eVar4 : eVarArr2) {
                    String d9 = d((String) eVar4.f11871b, bArr6, (String) eVar4.f11872c);
                    Charset charset2 = StandardCharsets.UTF_8;
                    u(byteArrayOutputStream4, d9.getBytes(charset2).length);
                    u(byteArrayOutputStream4, ((int[]) eVar4.f11873d).length);
                    t(byteArrayOutputStream4, (long) (((TreeMap) eVar4.e).size() * 4), 4);
                    t(byteArrayOutputStream4, eVar4.f11875g, 4);
                    byteArrayOutputStream4.write(d9.getBytes(charset2));
                    for (Integer intValue : ((TreeMap) eVar4.e).keySet()) {
                        u(byteArrayOutputStream4, intValue.intValue());
                        u(byteArrayOutputStream4, 0);
                    }
                    for (int u3 : (int[]) eVar4.f11873d) {
                        u(byteArrayOutputStream4, u3);
                    }
                }
                return true;
            }
            byte[] bArr7 = f6960f;
            if (Arrays.equals(bArr2, bArr7)) {
                byte[] b9 = b(eVarArr2, bArr7);
                t(byteArrayOutputStream4, (long) eVarArr2.length, 1);
                t(byteArrayOutputStream4, (long) b9.length, 4);
                byte[] a10 = a(b9);
                t(byteArrayOutputStream4, (long) a10.length, 4);
                byteArrayOutputStream4.write(a10);
                return true;
            }
            byte[] bArr8 = f6962h;
            if (!Arrays.equals(bArr2, bArr8)) {
                return false;
            }
            u(byteArrayOutputStream4, eVarArr2.length);
            for (g1.e eVar5 : eVarArr2) {
                String d10 = d((String) eVar5.f11871b, bArr8, (String) eVar5.f11872c);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream4, d10.getBytes(charset3).length);
                TreeMap treeMap = (TreeMap) eVar5.e;
                u(byteArrayOutputStream4, treeMap.size());
                u(byteArrayOutputStream4, ((int[]) eVar5.f11873d).length);
                t(byteArrayOutputStream4, eVar5.f11875g, 4);
                byteArrayOutputStream4.write(d10.getBytes(charset3));
                for (Integer intValue2 : treeMap.keySet()) {
                    u(byteArrayOutputStream4, intValue2.intValue());
                }
                for (int u8 : (int[]) eVar5.f11873d) {
                    u(byteArrayOutputStream4, u8);
                }
            }
            return true;
        }
        throw th4;
        throw th;
        throw th5;
        throw th3;
        throw th2;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, g1.e eVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, eVar.f11874f);
        t(byteArrayOutputStream, (long) eVar.f11876h, 4);
        t(byteArrayOutputStream, eVar.f11875g, 4);
        t(byteArrayOutputStream, (long) eVar.i, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, g1.e eVar) {
        byte[] bArr = new byte[((((eVar.i * 2) + 7) & -8) / 8)];
        for (Map.Entry entry : ((TreeMap) eVar.e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i8 = intValue / 8;
                bArr[i8] = (byte) (bArr[i8] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i9 = intValue + eVar.i;
                int i10 = i9 / 8;
                bArr[i10] = (byte) ((1 << (i9 % 8)) | bArr[i10]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, g1.e eVar) {
        int i8 = 0;
        for (Map.Entry entry : ((TreeMap) eVar.e).entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - i8);
                u(byteArrayOutputStream, 0);
                i8 = intValue;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01cf, code lost:
        if (r5 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0275, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0282, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
        r4.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:190:0x0261, B:206:0x027e] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0184 A[SYNTHETIC, Splitter:B:106:0x0184] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01b9 A[Catch:{ all -> 0x01a6, all -> 0x01b3, FileNotFoundException -> 0x01a4, IOException -> 0x01a1, IllegalStateException -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0106 A[SYNTHETIC, Splitter:B:54:0x0106] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void s(android.content.Context r19, java.util.concurrent.Executor r20, Z1.d r21, boolean r22) {
        /*
            r1 = r19
            r8 = r21
            android.content.Context r0 = r19.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r9 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r19.getPackageManager()
            r11 = 0
            android.content.pm.PackageInfo r12 = r0.getPackageInfo(r2, r11)     // Catch:{ NameNotFoundException -> 0x02c9 }
            java.io.File r13 = r19.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r14 = 0
            r15 = 1
            if (r22 != 0) goto L_0x008d
            java.io.File r0 = new java.io.File
            java.lang.String r4 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r13, r4)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x0041
        L_0x003f:
            r0 = 0
            goto L_0x0070
        L_0x0041:
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x0062 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0062 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0062 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0062 }
            long r16 = r4.readLong()     // Catch:{ all -> 0x0064 }
            r4.close()     // Catch:{ IOException -> 0x0062 }
            long r4 = r12.lastUpdateTime
            int r0 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            r0 = 1
            goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r0 == 0) goto L_0x0070
            r4 = 2
            r8.f(r4, r14)
            goto L_0x0070
        L_0x0062:
            goto L_0x003f
        L_0x0064:
            r0 = move-exception
            r5 = r0
            r4.close()     // Catch:{ all -> 0x006a }
            goto L_0x006f
        L_0x006a:
            r0 = move-exception
            r4 = r0
            r5.addSuppressed(r4)     // Catch:{ IOException -> 0x0062 }
        L_0x006f:
            throw r5     // Catch:{ IOException -> 0x0062 }
        L_0x0070:
            if (r0 != 0) goto L_0x0073
            goto L_0x008d
        L_0x0073:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r19.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            Z1.l.c(r1, r11)
            goto L_0x02c8
        L_0x008d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Installing profile for "
            r0.<init>(r4)
            java.lang.String r4 = r19.getPackageName()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.io.File r7 = new java.io.File
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "/data/misc/profiles/cur/0"
            r3.<init>(r4, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r3, r2)
            Z1.a r5 = new Z1.a
            java.lang.String r4 = "dexopt/baseline.prof"
            r2 = r5
            r3 = r9
            r11 = r4
            r4 = r20
            r10 = r5
            r5 = r21
            r18 = r7
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.Object r2 = r10.f6949d
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x00d4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 3
            r10.d(r2, r0)
        L_0x00d1:
            r6 = 1
            goto L_0x02bd
        L_0x00d4:
            boolean r0 = r18.exists()
            r3 = 4
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r18.canWrite()
            if (r0 != 0) goto L_0x00e8
            r10.d(r3, r14)
            goto L_0x00d1
        L_0x00e5:
            r18.createNewFile()     // Catch:{ IOException -> 0x02b9 }
        L_0x00e8:
            r10.f6946a = r15
            byte[] r4 = f6957b
            r5 = 6
            java.io.FileInputStream r0 = r10.c(r9, r11)     // Catch:{ FileNotFoundException -> 0x00fa, IOException -> 0x00f3 }
            r6 = r0
            goto L_0x0100
        L_0x00f3:
            r0 = move-exception
            r6 = r0
            r7 = 7
            r8.f(r7, r6)
            goto L_0x00ff
        L_0x00fa:
            r0 = move-exception
            r6 = r0
            r8.f(r5, r6)
        L_0x00ff:
            r6 = r14
        L_0x0100:
            java.lang.String r7 = "Invalid magic"
            r11 = 8
            if (r6 == 0) goto L_0x0160
            byte[] r0 = f(r6, r3)     // Catch:{ IOException -> 0x0145, IllegalStateException -> 0x012a }
            boolean r0 = java.util.Arrays.equals(r4, r0)     // Catch:{ IOException -> 0x0145, IllegalStateException -> 0x012a }
            if (r0 == 0) goto L_0x012e
            byte[] r0 = f(r6, r3)     // Catch:{ IOException -> 0x0145, IllegalStateException -> 0x012a }
            java.lang.Object r5 = r10.f6951g     // Catch:{ IOException -> 0x0145, IllegalStateException -> 0x012a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x0145, IllegalStateException -> 0x012a }
            g1.e[] r5 = l(r6, r0, r5)     // Catch:{ IOException -> 0x0145, IllegalStateException -> 0x012a }
            r6.close()     // Catch:{ IOException -> 0x0120 }
            goto L_0x0152
        L_0x0120:
            r0 = move-exception
            r6 = r0
            r15 = 7
            r8.f(r15, r6)
            goto L_0x0152
        L_0x0127:
            r0 = move-exception
        L_0x0128:
            r1 = r0
            goto L_0x0155
        L_0x012a:
            r0 = move-exception
            goto L_0x0134
        L_0x012c:
            r15 = 7
            goto L_0x0147
        L_0x012e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0145, IllegalStateException -> 0x012a }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0145, IllegalStateException -> 0x012a }
            throw r0     // Catch:{ IOException -> 0x0145, IllegalStateException -> 0x012a }
        L_0x0134:
            r8.f(r11, r0)     // Catch:{ all -> 0x0142 }
            r6.close()     // Catch:{ IOException -> 0x013b }
            goto L_0x0151
        L_0x013b:
            r0 = move-exception
            r5 = r0
            r15 = 7
        L_0x013e:
            r8.f(r15, r5)
            goto L_0x0151
        L_0x0142:
            r0 = move-exception
            r15 = 7
            goto L_0x0128
        L_0x0145:
            r0 = move-exception
            goto L_0x012c
        L_0x0147:
            r8.f(r15, r0)     // Catch:{ all -> 0x0127 }
            r6.close()     // Catch:{ IOException -> 0x014e }
            goto L_0x0151
        L_0x014e:
            r0 = move-exception
            r5 = r0
            goto L_0x013e
        L_0x0151:
            r5 = r14
        L_0x0152:
            r10.f6952h = r5
            goto L_0x0160
        L_0x0155:
            r6.close()     // Catch:{ IOException -> 0x0159 }
            goto L_0x015f
        L_0x0159:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.f(r3, r2)
        L_0x015f:
            throw r1
        L_0x0160:
            java.lang.Object r0 = r10.f6952h
            g1.e[] r0 = (g1.e[]) r0
            if (r0 == 0) goto L_0x01d2
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r5 < r6) goto L_0x01d2
            r15 = 34
            if (r5 <= r15) goto L_0x0172
            goto L_0x01d2
        L_0x0172:
            if (r5 == r6) goto L_0x017c
            r6 = 25
            if (r5 == r6) goto L_0x017c
            switch(r5) {
                case 31: goto L_0x017c;
                case 32: goto L_0x017c;
                case 33: goto L_0x017c;
                case 34: goto L_0x017c;
                default: goto L_0x017b;
            }
        L_0x017b:
            goto L_0x01d2
        L_0x017c:
            java.lang.String r5 = "dexopt/baseline.profm"
            java.io.FileInputStream r5 = r10.c(r9, r5)     // Catch:{ FileNotFoundException -> 0x01a4, IOException -> 0x01a1, IllegalStateException -> 0x019f }
            if (r5 == 0) goto L_0x01b9
            byte[] r6 = f6958c     // Catch:{ all -> 0x01a6 }
            byte[] r9 = f(r5, r3)     // Catch:{ all -> 0x01a6 }
            boolean r6 = java.util.Arrays.equals(r6, r9)     // Catch:{ all -> 0x01a6 }
            if (r6 == 0) goto L_0x01a9
            byte[] r3 = f(r5, r3)     // Catch:{ all -> 0x01a6 }
            g1.e[] r0 = i(r5, r3, r2, r0)     // Catch:{ all -> 0x01a6 }
            r10.f6952h = r0     // Catch:{ all -> 0x01a6 }
            r5.close()     // Catch:{ FileNotFoundException -> 0x01a4, IOException -> 0x01a1, IllegalStateException -> 0x019f }
            r5 = r10
            goto L_0x01cf
        L_0x019f:
            r0 = move-exception
            goto L_0x01bf
        L_0x01a1:
            r0 = move-exception
            r2 = 7
            goto L_0x01c5
        L_0x01a4:
            r0 = move-exception
            goto L_0x01c9
        L_0x01a6:
            r0 = move-exception
            r2 = r0
            goto L_0x01af
        L_0x01a9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01a6 }
            r0.<init>(r7)     // Catch:{ all -> 0x01a6 }
            throw r0     // Catch:{ all -> 0x01a6 }
        L_0x01af:
            r5.close()     // Catch:{ all -> 0x01b3 }
            goto L_0x01b8
        L_0x01b3:
            r0 = move-exception
            r3 = r0
            r2.addSuppressed(r3)     // Catch:{ FileNotFoundException -> 0x01a4, IOException -> 0x01a1, IllegalStateException -> 0x019f }
        L_0x01b8:
            throw r2     // Catch:{ FileNotFoundException -> 0x01a4, IOException -> 0x01a1, IllegalStateException -> 0x019f }
        L_0x01b9:
            if (r5 == 0) goto L_0x01ce
            r5.close()     // Catch:{ FileNotFoundException -> 0x01a4, IOException -> 0x01a1, IllegalStateException -> 0x019f }
            goto L_0x01ce
        L_0x01bf:
            r10.f6952h = r14
            r8.f(r11, r0)
            goto L_0x01ce
        L_0x01c5:
            r8.f(r2, r0)
            goto L_0x01ce
        L_0x01c9:
            r2 = 9
            r8.f(r2, r0)
        L_0x01ce:
            r5 = r14
        L_0x01cf:
            if (r5 == 0) goto L_0x01d2
            goto L_0x01d3
        L_0x01d2:
            r5 = r10
        L_0x01d3:
            java.lang.Object r0 = r5.f6948c
            r2 = r0
            Z1.d r2 = (Z1.d) r2
            java.lang.Object r0 = r5.f6952h
            g1.e[] r0 = (g1.e[]) r0
            java.lang.String r3 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L_0x0232
            java.lang.Object r6 = r5.f6949d
            byte[] r6 = (byte[]) r6
            if (r6 != 0) goto L_0x01e7
            goto L_0x0232
        L_0x01e7:
            boolean r7 = r5.f6946a
            if (r7 == 0) goto L_0x022c
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0206 }
            r7.<init>()     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0206 }
            r7.write(r4)     // Catch:{ all -> 0x020b }
            r7.write(r6)     // Catch:{ all -> 0x020b }
            boolean r0 = o(r7, r6, r0)     // Catch:{ all -> 0x020b }
            if (r0 != 0) goto L_0x020e
            r0 = 5
            r2.f(r0, r14)     // Catch:{ all -> 0x020b }
            r5.f6952h = r14     // Catch:{ all -> 0x020b }
            r7.close()     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0206 }
            goto L_0x0232
        L_0x0206:
            r0 = move-exception
            goto L_0x0222
        L_0x0208:
            r0 = move-exception
            r4 = 7
            goto L_0x0226
        L_0x020b:
            r0 = move-exception
            r4 = r0
            goto L_0x0218
        L_0x020e:
            byte[] r0 = r7.toByteArray()     // Catch:{ all -> 0x020b }
            r5.e = r0     // Catch:{ all -> 0x020b }
            r7.close()     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0206 }
            goto L_0x0229
        L_0x0218:
            r7.close()     // Catch:{ all -> 0x021c }
            goto L_0x0221
        L_0x021c:
            r0 = move-exception
            r6 = r0
            r4.addSuppressed(r6)     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0206 }
        L_0x0221:
            throw r4     // Catch:{ IOException -> 0x0208, IllegalStateException -> 0x0206 }
        L_0x0222:
            r2.f(r11, r0)
            goto L_0x0229
        L_0x0226:
            r2.f(r4, r0)
        L_0x0229:
            r5.f6952h = r14
            goto L_0x0232
        L_0x022c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0232:
            java.lang.Object r0 = r5.e
            byte[] r0 = (byte[]) r0
            if (r0 != 0) goto L_0x023c
            r0 = 0
            r6 = 1
            goto L_0x02a8
        L_0x023c:
            boolean r2 = r5.f6946a
            if (r2 == 0) goto L_0x02b3
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ FileNotFoundException -> 0x0298, IOException -> 0x0295 }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0298, IOException -> 0x0295 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0288 }
            java.lang.Object r0 = r5.f6950f     // Catch:{ all -> 0x0288 }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x0288 }
            r3.<init>(r0)     // Catch:{ all -> 0x0288 }
            r0 = 512(0x200, float:7.175E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x027b }
        L_0x0252:
            int r4 = r2.read(r0)     // Catch:{ all -> 0x027b }
            if (r4 <= 0) goto L_0x025d
            r6 = 0
            r3.write(r0, r6, r4)     // Catch:{ all -> 0x027b }
            goto L_0x0252
        L_0x025d:
            r6 = 1
            r5.d(r6, r14)     // Catch:{ all -> 0x0278 }
            r3.close()     // Catch:{ all -> 0x0275 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0272, IOException -> 0x026f }
            r5.e = r14
            r5.f6952h = r14
            r0 = 1
            goto L_0x02a8
        L_0x026d:
            r0 = move-exception
            goto L_0x02ae
        L_0x026f:
            r0 = move-exception
        L_0x0270:
            r2 = 7
            goto L_0x029b
        L_0x0272:
            r0 = move-exception
        L_0x0273:
            r2 = 6
            goto L_0x02a3
        L_0x0275:
            r0 = move-exception
        L_0x0276:
            r3 = r0
            goto L_0x028b
        L_0x0278:
            r0 = move-exception
        L_0x0279:
            r4 = r0
            goto L_0x027e
        L_0x027b:
            r0 = move-exception
            r6 = 1
            goto L_0x0279
        L_0x027e:
            r3.close()     // Catch:{ all -> 0x0282 }
            goto L_0x0287
        L_0x0282:
            r0 = move-exception
            r3 = r0
            r4.addSuppressed(r3)     // Catch:{ all -> 0x0275 }
        L_0x0287:
            throw r4     // Catch:{ all -> 0x0275 }
        L_0x0288:
            r0 = move-exception
            r6 = 1
            goto L_0x0276
        L_0x028b:
            r2.close()     // Catch:{ all -> 0x028f }
            goto L_0x0294
        L_0x028f:
            r0 = move-exception
            r2 = r0
            r3.addSuppressed(r2)     // Catch:{ FileNotFoundException -> 0x0272, IOException -> 0x026f }
        L_0x0294:
            throw r3     // Catch:{ FileNotFoundException -> 0x0272, IOException -> 0x026f }
        L_0x0295:
            r0 = move-exception
            r6 = 1
            goto L_0x0270
        L_0x0298:
            r0 = move-exception
            r6 = 1
            goto L_0x0273
        L_0x029b:
            r5.d(r2, r0)     // Catch:{ all -> 0x026d }
        L_0x029e:
            r5.e = r14
            r5.f6952h = r14
            goto L_0x02a7
        L_0x02a3:
            r5.d(r2, r0)     // Catch:{ all -> 0x026d }
            goto L_0x029e
        L_0x02a7:
            r0 = 0
        L_0x02a8:
            if (r0 == 0) goto L_0x02be
            e(r12, r13)
            goto L_0x02be
        L_0x02ae:
            r5.e = r14
            r5.f6952h = r14
            throw r0
        L_0x02b3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x02b9:
            r6 = 1
            r10.d(r3, r14)
        L_0x02bd:
            r0 = 0
        L_0x02be:
            if (r0 == 0) goto L_0x02c4
            if (r22 == 0) goto L_0x02c4
            r11 = 1
            goto L_0x02c5
        L_0x02c4:
            r11 = 0
        L_0x02c5:
            Z1.l.c(r1, r11)
        L_0x02c8:
            return
        L_0x02c9:
            r0 = move-exception
            r2 = r0
            r3 = 7
            r8.f(r3, r2)
            r2 = 0
            Z1.l.c(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.e.s(android.content.Context, java.util.concurrent.Executor, Z1.d, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j7, int i8) {
        byte[] bArr = new byte[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            bArr[i9] = (byte) ((int) ((j7 >> (i9 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int i8) {
        t(byteArrayOutputStream, (long) i8, 2);
    }
}
