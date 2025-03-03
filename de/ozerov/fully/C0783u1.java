package de.ozerov.fully;

import java.io.File;

/* renamed from: de.ozerov.fully.u1  reason: case insensitive filesystem */
public final class C0783u1 {

    /* renamed from: a  reason: collision with root package name */
    public File f10987a;

    /* renamed from: b  reason: collision with root package name */
    public File f10988b;

    /* renamed from: c  reason: collision with root package name */
    public long f10989c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f10990d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public String f10991f;

    /* renamed from: g  reason: collision with root package name */
    public int f10992g;

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, de.ozerov.fully.u1] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = E7.b.f1379a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2 = ((java.lang.Long) new B.B(4, r4).d()).longValue();
        r4.getAbsolutePath();
        r1 = r1.f9797d;
        r5 = new java.lang.Object();
        r5.f10987a = r4;
        r5.f10988b = r1;
        r5.f10989c = r2;
        r5.f10990d = true;
        r5.e = r4.isDirectory();
        r5.f10992g = 1;
        r0.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0089, code lost:
        throw new java.io.UncheckedIOException(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        r2 = new java.lang.StringBuilder("Failed to get size of ");
        r2.append(r4);
        r2.append(" due to ");
        Q0.g.z(r1, r2, "u1");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList a(java.util.ArrayList r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0009:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r1 = r7.next()
            de.ozerov.fully.B1 r1 = (de.ozerov.fully.B1) r1
            boolean r2 = r1.f9798f
            if (r2 == 0) goto L_0x0009
            boolean r2 = r1.f9799g
            if (r2 != 0) goto L_0x001e
            goto L_0x0009
        L_0x001e:
            java.util.Iterator r2 = r0.iterator()
        L_0x0022:
            boolean r3 = r2.hasNext()
            java.io.File r4 = r1.f9796c
            if (r3 == 0) goto L_0x0050
            java.lang.Object r3 = r2.next()
            de.ozerov.fully.u1 r3 = (de.ozerov.fully.C0783u1) r3
            r4.getAbsolutePath()
            java.io.File r5 = r3.f10987a
            r5.getAbsolutePath()
            java.io.File r5 = r3.f10987a
            boolean r6 = n2.a.s0(r4, r5)
            if (r6 != 0) goto L_0x0009
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L_0x0047
            goto L_0x0009
        L_0x0047:
            boolean r5 = n2.a.s0(r5, r4)
            if (r5 == 0) goto L_0x0022
            r0.remove(r3)
        L_0x0050:
            int r2 = E7.b.f1379a     // Catch:{ Exception -> 0x0081 }
            B.B r2 = new B.B     // Catch:{ Exception -> 0x0081 }
            r3 = 4
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object r2 = r2.d()     // Catch:{ IOException -> 0x0083 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x0081 }
            long r2 = r2.longValue()     // Catch:{ Exception -> 0x0081 }
            r4.getAbsolutePath()     // Catch:{ Exception -> 0x0081 }
            de.ozerov.fully.u1 r5 = new de.ozerov.fully.u1     // Catch:{ Exception -> 0x0081 }
            java.io.File r1 = r1.f9797d     // Catch:{ Exception -> 0x0081 }
            r5.<init>()     // Catch:{ Exception -> 0x0081 }
            r5.f10987a = r4     // Catch:{ Exception -> 0x0081 }
            r5.f10988b = r1     // Catch:{ Exception -> 0x0081 }
            r5.f10989c = r2     // Catch:{ Exception -> 0x0081 }
            r1 = 1
            r5.f10990d = r1     // Catch:{ Exception -> 0x0081 }
            boolean r2 = r4.isDirectory()     // Catch:{ Exception -> 0x0081 }
            r5.e = r2     // Catch:{ Exception -> 0x0081 }
            r5.f10992g = r1     // Catch:{ Exception -> 0x0081 }
            r0.add(r5)     // Catch:{ Exception -> 0x0081 }
            goto L_0x0009
        L_0x0081:
            r1 = move-exception
            goto L_0x008a
        L_0x0083:
            r1 = move-exception
            java.io.UncheckedIOException r2 = new java.io.UncheckedIOException     // Catch:{ Exception -> 0x0081 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0081 }
            throw r2     // Catch:{ Exception -> 0x0081 }
        L_0x008a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to get size of "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r3 = " due to "
            r2.append(r3)
            java.lang.String r3 = "u1"
            Q0.g.z(r1, r2, r3)
            goto L_0x0009
        L_0x00a0:
            java.util.Iterator r7 = r0.iterator()
        L_0x00a4:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00bb
            java.lang.Object r1 = r7.next()
            de.ozerov.fully.u1 r1 = (de.ozerov.fully.C0783u1) r1
            java.io.File r2 = r1.f10987a
            r2.getAbsolutePath()
            java.io.File r1 = r1.f10988b
            r1.getAbsolutePath()
            goto L_0x00a4
        L_0x00bb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0783u1.a(java.util.ArrayList):java.util.ArrayList");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r3v1, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r17, java.util.ArrayList r18, java.util.ArrayList r19) {
        /*
            r1 = r17
            r2 = 0
            r3 = 1
            java.util.Iterator r4 = r19.iterator()
        L_0x0008:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01aa
            java.lang.Object r0 = r4.next()
            r5 = r0
            de.ozerov.fully.u1 r5 = (de.ozerov.fully.C0783u1) r5
            boolean r0 = r5.f10990d
            java.io.File r6 = r5.f10987a
            if (r0 != 0) goto L_0x001c
            goto L_0x0008
        L_0x001c:
            int r0 = r5.f10992g
            if (r0 != r3) goto L_0x0023
            java.lang.String r7 = "Copy"
            goto L_0x0025
        L_0x0023:
            java.lang.String r7 = "Move"
        L_0x0025:
            java.io.File r8 = r5.f10988b
            j$.util.Objects.toString(r8)
            boolean r9 = r5.e
            java.lang.String r10 = "LocalFileMigration"
            java.lang.String r11 = "u1"
            if (r0 != r3) goto L_0x0045
            if (r9 == 0) goto L_0x003a
            E7.b.c(r6, r8)     // Catch:{ Exception -> 0x0038 }
            goto L_0x0045
        L_0x0038:
            r0 = move-exception
            goto L_0x0052
        L_0x003a:
            int r12 = E7.b.f1379a     // Catch:{ Exception -> 0x0038 }
            j$.nio.file.CopyOption[] r12 = new j$.nio.file.CopyOption[r3]     // Catch:{ Exception -> 0x0038 }
            j$.nio.file.StandardCopyOption r13 = j$.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch:{ Exception -> 0x0038 }
            r12[r2] = r13     // Catch:{ Exception -> 0x0038 }
            E7.b.d(r6, r8, r3, r12)     // Catch:{ Exception -> 0x0038 }
        L_0x0045:
            r12 = 2
            if (r0 != r12) goto L_0x007b
            if (r9 == 0) goto L_0x004e
            E7.b.h(r6, r8)     // Catch:{ Exception -> 0x0038 }
            goto L_0x007b
        L_0x004e:
            E7.b.i(r6, r8)     // Catch:{ Exception -> 0x0038 }
            goto L_0x007b
        L_0x0052:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = " failed for "
            r8.append(r7)
            r8.append(r6)
            java.lang.String r6 = " due to "
            r8.append(r6)
            java.lang.String r0 = r0.getMessage()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r5.f10991f = r0
            android.util.Log.w(r11, r0)
            de.ozerov.fully.C0794w0.q0(r2, r10, r0)
            goto L_0x0008
        L_0x007b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = " files finished from "
            r0.append(r7)
            r0.append(r6)
            java.lang.String r7 = "\n to "
            r0.append(r7)
            r0.append(r8)
            java.lang.String r7 = "\n ("
            r0.append(r7)
            long r12 = r5.f10989c
            java.lang.String r7 = n2.a.V(r12)
            r0.append(r7)
            java.lang.String r7 = ")"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r11, r0)
            de.ozerov.fully.C0794w0.q0(r2, r10, r0)
            d4.k r0 = new d4.k
            r0.<init>((android.content.Context) r1, (int) r3)
            java.util.Iterator r7 = r18.iterator()
        L_0x00b9:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x01a1
            java.lang.Object r9 = r7.next()
            de.ozerov.fully.B1 r9 = (de.ozerov.fully.B1) r9
            boolean r12 = r9.f9798f
            if (r12 != 0) goto L_0x00ca
            goto L_0x00b9
        L_0x00ca:
            de.ozerov.fully.A1 r12 = r9.f9794a
            int r13 = r12.f9785c
            r14 = 5
            if (r13 != r14) goto L_0x00d2
            goto L_0x00b9
        L_0x00d2:
            java.io.File r13 = r9.f9797d
            boolean r14 = r13.equals(r8)
            if (r14 != 0) goto L_0x00e4
            boolean r13 = n2.a.s0(r13, r8)
            if (r13 == 0) goto L_0x00e1
            goto L_0x00e4
        L_0x00e1:
            r3 = 0
            goto L_0x019d
        L_0x00e4:
            java.lang.String r9 = r9.f9795b
            java.lang.String r13 = n2.a.F(r1, r9)
            java.lang.String r14 = "/sdcard/"
            boolean r15 = r13.contains(r14)
            if (r15 == 0) goto L_0x011c
            java.io.File r15 = new java.io.File     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = "/sdcard"
            r15.<init>(r3)     // Catch:{ Exception -> 0x0117 }
            java.io.File r3 = r15.getCanonicalFile()     // Catch:{ Exception -> 0x0117 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0117 }
            r15.<init>()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x0117 }
            r15.append(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = java.io.File.separator     // Catch:{ Exception -> 0x0117 }
            r15.append(r3)     // Catch:{ Exception -> 0x0117 }
            java.lang.String r3 = r15.toString()     // Catch:{ Exception -> 0x0117 }
            java.lang.String r13 = r13.replace(r14, r3)     // Catch:{ Exception -> 0x0117 }
            goto L_0x011c
        L_0x0117:
            java.lang.String r3 = "Failed to resolve the canonical path of /sdcard"
            android.util.Log.w(r11, r3)
        L_0x011c:
            java.lang.String r3 = r6.getAbsolutePath()
            java.lang.String r14 = r8.getAbsolutePath()
            java.lang.String r3 = n2.a.U0(r13, r3, r14)
            android.net.Uri r13 = android.net.Uri.fromFile(r6)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "file://"
            java.lang.String r15 = ""
            java.lang.String r13 = r13.replace(r14, r15)
            android.net.Uri r16 = android.net.Uri.fromFile(r8)
            java.lang.String r2 = r16.toString()
            java.lang.String r2 = r2.replace(r14, r15)
            java.lang.String r2 = n2.a.U0(r3, r13, r2)
            java.lang.String r2 = n2.a.Y0(r1, r2)
            java.lang.String r3 = r12.f9783a
            java.lang.Object r13 = r0.f9767W
            Z1.c r13 = (Z1.c) r13
            r14 = 0
            java.lang.String r3 = r13.r(r3, r14)
            java.lang.String r13 = n2.a.U0(r3, r9, r2)
            boolean r3 = r3.equals(r13)
            if (r3 != 0) goto L_0x00e1
            java.lang.String r3 = r12.f9783a
            r0.V2(r3, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r13 = "Migrated the setting "
            r3.<init>(r13)
            java.lang.String r12 = r12.f9783a
            r3.append(r12)
            java.lang.String r12 = "\n old url: "
            r3.append(r12)
            r3.append(r9)
            java.lang.String r9 = "\n old location: "
            r3.append(r9)
            r3.append(r6)
            java.lang.String r9 = "\n new location: "
            r3.append(r9)
            r3.append(r8)
            java.lang.String r9 = "\n new url: "
            r3.append(r9)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.i(r11, r2)
            r3 = 0
            de.ozerov.fully.C0794w0.q0(r3, r10, r2)
        L_0x019d:
            r2 = 0
            r3 = 1
            goto L_0x00b9
        L_0x01a1:
            r3 = 0
            java.lang.String r0 = "OK"
            r5.f10991f = r0
            r2 = 0
            r3 = 1
            goto L_0x0008
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.C0783u1.b(android.content.Context, java.util.ArrayList, java.util.ArrayList):void");
    }
}
