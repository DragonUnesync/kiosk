package A1;

import B.C0002c;
import B.C0009j;
import B.C0018t;
import B.q0;
import B.r0;
import B2.f;
import B2.i;
import B2.l;
import D.B0;
import D.C0;
import D.C0035b0;
import D.C0047h0;
import D.C0048i;
import D.C0049i0;
import D.J0;
import D.L0;
import D2.C0077f;
import D2.D;
import D2.H;
import D2.n;
import F.h;
import G.c;
import H2.p;
import K2.C0110b;
import K2.C0112d;
import K2.o;
import K2.w;
import K2.z;
import M.k;
import P5.F;
import P5.P;
import Q5.e;
import Q7.b;
import R0.g;
import R0.m;
import S4.a;
import T5.C0260n;
import T5.O0;
import T5.Z0;
import V0.v;
import a0.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.Surface;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.r;
import androidx.lifecycle.x;
import com.samsung.android.knox.EnterpriseDeviceManager;
import f6.d0;
import g5.C0962a;
import g7.C0996d;
import j$.net.URLDecoder;
import j$.net.URLEncoder;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import l5.C1179a;
import l6.C1180a;
import m4.C1214b;
import m4.C1215c;
import o6.C1326b;
import org.altbeacon.bluetooth.Pdu;
import u.C1468i;
import u0.C1486a;

public final class d implements c, C0049i0, com.bumptech.glide.load.data.d, l, o, e, g {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f34U;

    /* renamed from: V  reason: collision with root package name */
    public Object f35V;

    /* renamed from: W  reason: collision with root package name */
    public Object f36W;

    public /* synthetic */ d(int i, Object obj, Object obj2, boolean z) {
        this.f34U = i;
        this.f36W = obj;
        this.f35V = obj2;
    }

    public static boolean E(char c8) {
        if ((c8 < '0' || c8 > '9') && ((c8 < 'A' || c8 > 'F') && (c8 < 'a' || c8 > 'f'))) {
            return false;
        }
        return true;
    }

    public static void h(String str, StringBuilder sb, boolean z) {
        char c8;
        int i = 0;
        while (i < str.length()) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 32) {
                if (z) {
                    c8 = '+';
                } else {
                    c8 = "%20";
                }
                sb.append(c8);
            } else if (codePointAt == 37) {
                if (i < str.length() - 2) {
                    int i8 = i + 1;
                    if (E(str.charAt(i8))) {
                        int i9 = i + 2;
                        if (E(str.charAt(i9))) {
                            sb.append('%');
                            sb.append(str.charAt(i8));
                            sb.append(str.charAt(i9));
                            i = i9;
                        }
                    }
                }
                sb.append("%25");
            } else if (codePointAt > 127 || "<>\"{}|\\^[]`".indexOf(codePointAt) != -1) {
                sb.append(URLEncoder.encode(new String(Character.toChars(codePointAt)), b.f4194b.name()));
                if (Character.charCount(codePointAt) == 2) {
                    i++;
                }
            } else {
                sb.append((char) codePointAt);
            }
            i++;
        }
    }

    public static z m(ImageDecoder.Source source, int i, int i8, i iVar) {
        Drawable j7 = ImageDecoder.decodeDrawable(source, new J2.b(i, i8, iVar));
        if (D7.c.w(j7)) {
            return new z(2, D7.c.i(j7));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + j7);
    }

    public static String n(String str) {
        try {
            return URLDecoder.decode(str, b.f4194b.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public LinkedHashSet A() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f35V) {
            linkedHashSet = new LinkedHashSet(((LinkedHashMap) this.f36W).values());
        }
        return linkedHashSet;
    }

    public String B(f fVar) {
        String str;
        synchronized (((v) this.f35V)) {
            str = (String) ((v) this.f35V).a(fVar);
        }
        if (str == null) {
            str = k(fVar);
        }
        synchronized (((v) this.f35V)) {
            ((v) this.f35V).f(fVar, str);
        }
        return str;
    }

    public synchronized Map C() {
        try {
            if (((Map) this.f36W) == null) {
                this.f36W = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f35V));
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (Map) this.f36W;
    }

    public void D(C1468i iVar) {
        synchronized (this.f35V) {
            try {
                iVar.getClass();
                for (String str : new LinkedHashSet(iVar.f15651f)) {
                    h.j("CameraRepository", "Added camera: " + str);
                    ((LinkedHashMap) this.f36W).put(str, iVar.a(str));
                }
            } catch (C0018t e) {
                throw new Exception(e);
            }
        }
    }

    public boolean F(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f36W;
        if (!linkedHashMap.containsKey(str)) {
            return false;
        }
        return ((J0) linkedHashMap.get(str)).e;
    }

    public void G(E2.i iVar, Object obj) {
        HashMap hashMap = (HashMap) this.f36W;
        E2.d dVar = (E2.d) hashMap.get(iVar);
        if (dVar == null) {
            dVar = new E2.d(iVar);
            dVar.f1333d = dVar;
            E2.d dVar2 = (E2.d) this.f35V;
            dVar.f1333d = dVar2.f1333d;
            dVar.f1332c = dVar2;
            dVar2.f1333d = dVar;
            dVar.f1333d.f1332c = dVar;
            hashMap.put(iVar, dVar);
        } else {
            iVar.a();
        }
        if (dVar.f1331b == null) {
            dVar.f1331b = new ArrayList();
        }
        dVar.f1331b.add(obj);
    }

    public void H(String str) {
        F2.b bVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f35V).get(str);
                W2.f.c(obj, "Argument must not be null");
                bVar = (F2.b) obj;
                int i = bVar.f1513b;
                if (i >= 1) {
                    int i8 = i - 1;
                    bVar.f1513b = i8;
                    if (i8 == 0) {
                        F2.b bVar2 = (F2.b) ((HashMap) this.f35V).remove(str);
                        if (bVar2.equals(bVar)) {
                            ((F2.c) this.f36W).b(bVar2);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f1513b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.f1512a.unlock();
    }

    public Object I() {
        int i;
        E2.d dVar = (E2.d) this.f35V;
        E2.d dVar2 = dVar.f1333d;
        while (true) {
            Object obj = null;
            if (dVar2.equals(dVar)) {
                return null;
            }
            ArrayList arrayList = dVar2.f1331b;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            if (i > 0) {
                obj = dVar2.f1331b.remove(i - 1);
            }
            if (obj != null) {
                return obj;
            }
            E2.d dVar3 = dVar2.f1333d;
            dVar3.f1332c = dVar2.f1332c;
            dVar2.f1332c.f1333d = dVar3;
            E2.i iVar = dVar2.f1330a;
            ((HashMap) this.f36W).remove(iVar);
            iVar.a();
            dVar2 = dVar2.f1333d;
        }
    }

    public void J(C1180a aVar) {
        try {
            K(aVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            R.e.v(th);
            C0996d.s(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public void K(C1180a aVar) {
        C1215c cVar = ((C1214b) this.f35V).f13364k;
        C1326b bVar = C1326b.f14277U;
        if (cVar == null) {
            C1179a z = Q7.g.z();
            aVar.c(bVar);
            aVar.a(z);
            return;
        }
        A4.g gVar = (A4.g) ((O0) ((C0260n) cVar.f13374h).pipeline()).get("disconnect");
        if (gVar == null) {
            C1179a z6 = Q7.g.z();
            aVar.c(bVar);
            aVar.a(z6);
            return;
        }
        C0962a aVar2 = new C0962a(aVar);
        aVar.c(aVar2);
        A4.d dVar = new A4.d(gVar, (a) this.f36W, aVar2, 0);
        Z0 z02 = gVar.f114V.f13361g;
        boolean z8 = false;
        if (z02 != null) {
            try {
                ((d0) z02).execute(dVar);
                z8 = true;
            } catch (RejectedExecutionException unused) {
            }
        }
        if (!z8) {
            aVar.a(Q7.g.z());
        }
    }

    public void L(String str, C0 c02, L0 l02, C0048i iVar, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f36W;
        if (linkedHashMap.containsKey(str)) {
            J0 j02 = new J0(c02, l02, iVar, list);
            J0 j03 = (J0) linkedHashMap.get(str);
            j02.e = j03.e;
            j02.f804f = j03.f804f;
            linkedHashMap.put(str, j02);
        }
    }

    public void a(Executor executor, C0047h0 h0Var) {
        synchronized (((HashMap) this.f36W)) {
            C0035b0 b0Var = (C0035b0) ((HashMap) this.f36W).get(h0Var);
            if (b0Var != null) {
                b0Var.f885a.set(false);
            }
            C0035b0 b0Var2 = new C0035b0(executor, (U.d) h0Var);
            ((HashMap) this.f36W).put(h0Var, b0Var2);
            D7.b.H().execute(new A4.d(this, b0Var, b0Var2, 2));
        }
    }

    public void b(int i, List list, List list2) {
        ((int[]) this.f35V)[0] = i;
    }

    public void c(Exception exc) {
        p pVar = (p) this.f35V;
        p pVar2 = ((H) this.f36W).f1058Z;
        if (pVar2 != null && pVar2 == pVar) {
            H h5 = (H) this.f36W;
            D2.l lVar = h5.f1054V;
            C0077f fVar = h5.f1059a0;
            com.bumptech.glide.load.data.e eVar = ((p) this.f35V).f1976c;
            lVar.a(fVar, exc, eVar, eVar.e());
        }
    }

    public void d(Object obj) {
        p pVar = (p) this.f35V;
        p pVar2 = ((H) this.f36W).f1058Z;
        if (pVar2 != null && pVar2 == pVar) {
            H h5 = (H) this.f36W;
            p pVar3 = (p) this.f35V;
            n nVar = h5.f1053U.f1090p;
            if (obj == null || !nVar.a(pVar3.f1976c.e())) {
                D2.l lVar = h5.f1054V;
                f fVar = pVar3.f1974a;
                com.bumptech.glide.load.data.e eVar = pVar3.f1976c;
                lVar.c(fVar, obj, eVar, eVar.e(), h5.f1059a0);
                return;
            }
            h5.f1057Y = obj;
            h5.f1054V.o(2);
        }
    }

    public boolean e(Object obj, File file, i iVar) {
        return ((C0110b) this.f36W).e(new C0112d((E2.b) this.f35V, ((BitmapDrawable) ((D) obj).get()).getBitmap()), file, iVar);
    }

    public void f(Object obj) {
        switch (this.f34U) {
            case 2:
                Void voidR = (Void) obj;
                n2.a.m((String) null, ((j) this.f35V).a((Object) null));
                return;
            case 3:
                Void voidR2 = (Void) obj;
                ((C1486a) this.f35V).accept(new C0009j(0, (Surface) this.f36W));
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                M.l lVar = (M.l) obj;
                lVar.getClass();
                M.c cVar = (M.c) ((q0) this.f36W).f300V;
                if (cVar.f2723Y.get()) {
                    lVar.close();
                    return;
                }
                C0002c cVar2 = new C0002c((Object) cVar, 10, (Object) lVar);
                Objects.requireNonNull(lVar);
                cVar.b(cVar2, new A.d(16, lVar));
                return;
            default:
                M.l lVar2 = (M.l) obj;
                lVar2.getClass();
                N.f fVar = (N.f) ((C7.d) this.f36W).f732V;
                if (fVar.f3218a0.get()) {
                    lVar2.close();
                    return;
                }
                C0002c cVar3 = new C0002c((Object) fVar, 14, (Object) lVar2);
                Objects.requireNonNull(lVar2);
                fVar.b(cVar3, new A.d(16, lVar2));
                return;
        }
    }

    public R0.h g() {
        return new m((Context) this.f35V, ((J1.d) this.f36W).g());
    }

    public void i(C0047h0 h0Var) {
        synchronized (((HashMap) this.f36W)) {
            try {
                C0035b0 b0Var = (C0035b0) ((HashMap) this.f36W).remove(h0Var);
                if (b0Var != null) {
                    b0Var.f885a.set(false);
                    D7.b.H().execute(new C0002c((Object) this, 6, (Object) b0Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public URL j() {
        try {
            URI uri = new URI(((URL) this.f35V).getProtocol(), ((URL) this.f35V).getUserInfo(), IDN.toASCII(n(((URL) this.f35V).getHost())), ((URL) this.f35V).getPort(), (String) null, (String) null, (String) null);
            StringBuilder b8 = R7.h.b();
            b8.append(uri.toASCIIString());
            h(((URL) this.f35V).getPath(), b8, false);
            if (((StringBuilder) this.f36W) != null) {
                b8.append('?');
                h(R7.h.h((StringBuilder) this.f36W), b8, true);
            }
            if (((URL) this.f35V).getRef() != null) {
                b8.append('#');
                h(((URL) this.f35V).getRef(), b8, false);
            }
            URL url = new URL(R7.h.h(b8));
            this.f35V = url;
            return url;
        } catch (UnsupportedEncodingException | MalformedURLException | URISyntaxException unused) {
            return (URL) this.f35V;
        }
    }

    public String k(f fVar) {
        String str;
        F2.i iVar = (F2.i) ((q0) this.f36W).a();
        try {
            fVar.a(iVar.f1530U);
            byte[] digest = iVar.f1530U.digest();
            char[] cArr = W2.m.f6174b;
            synchronized (cArr) {
                for (int i = 0; i < digest.length; i++) {
                    byte b8 = digest[i];
                    int i8 = i * 2;
                    char[] cArr2 = W2.m.f6173a;
                    cArr[i8] = cArr2[(b8 & Pdu.MANUFACTURER_DATA_PDU_TYPE) >>> 4];
                    cArr[i8 + 1] = cArr2[b8 & 15];
                }
                str = new String(cArr);
            }
            ((q0) this.f36W).A(iVar);
            return str;
        } catch (Throwable th) {
            ((q0) this.f36W).A(iVar);
            throw th;
        }
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.f36W;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            F f8 = (F) it.next();
            try {
                P.i(f8.f3812b);
                File file = f8.f3811a;
                if (!file.delete()) {
                    throw new Exception("could not delete temporary file: " + file.getAbsolutePath());
                }
            } catch (Exception e) {
                P.f3856p.log(Level.WARNING, "could not delete file ", e);
            }
        }
        arrayList.clear();
    }

    public void o(String str, PrintWriter printWriter) {
        Y.j jVar = ((K0.a) this.f36W).f2536a;
        if (jVar.f6311W > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (jVar.f6311W > 0) {
                if (jVar.f6310V[0] == null) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(jVar.f6309U[0]);
                    printWriter.print(": ");
                    throw null;
                }
                throw new ClassCastException();
            }
        }
    }

    public byte[] p(b bVar) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f35V;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f36W;
        try {
            dataOutputStream.writeBytes(bVar.f27U);
            dataOutputStream.writeByte(0);
            String str = bVar.f28V;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(bVar.f29W);
            dataOutputStream.writeLong(bVar.f30X);
            dataOutputStream.write(bVar.f31Y);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int q(i iVar) {
        return 2;
    }

    public void r(E2.b bVar, Bitmap bitmap) {
        IOException iOException = ((W2.e) this.f36W).f6161V;
        if (iOException != null) {
            if (bitmap != null) {
                bVar.h(bitmap);
            }
            throw iOException;
        }
    }

    public void s() {
        w wVar = (w) this.f35V;
        synchronized (wVar) {
            wVar.f2649W = wVar.f2647U.length;
        }
    }

    public Object t(E2.i iVar) {
        int i;
        HashMap hashMap = (HashMap) this.f36W;
        E2.d dVar = (E2.d) hashMap.get(iVar);
        if (dVar == null) {
            dVar = new E2.d(iVar);
            hashMap.put(iVar, dVar);
        } else {
            iVar.a();
        }
        E2.d dVar2 = dVar.f1333d;
        dVar2.f1332c = dVar.f1332c;
        dVar.f1332c.f1333d = dVar2;
        E2.d dVar3 = (E2.d) this.f35V;
        dVar.f1333d = dVar3;
        E2.d dVar4 = dVar3.f1332c;
        dVar.f1332c = dVar4;
        dVar4.f1333d = dVar;
        dVar.f1333d.f1332c = dVar;
        ArrayList arrayList = dVar.f1331b;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            return dVar.f1331b.remove(i - 1);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r2 = r1.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r6 = this;
            int r0 = r6.f34U
            switch(r0) {
                case 10: goto L_0x007f;
                case 15: goto L_0x0016;
                case 22: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = super.toString()
            return r0
        L_0x000a:
            S3.b r0 = r6.x()     // Catch:{ h -> 0x0013 }
            java.lang.String r0 = r0.toString()     // Catch:{ h -> 0x0013 }
            goto L_0x0015
        L_0x0013:
            java.lang.String r0 = ""
        L_0x0015:
            return r0
        L_0x0016:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            java.lang.String r1 = "LoaderManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            java.lang.Object r1 = r6.f35V
            androidx.lifecycle.r r1 = (androidx.lifecycle.r) r1
            if (r1 != 0) goto L_0x003e
            java.lang.String r1 = "null"
            r0.append(r1)
            goto L_0x0075
        L_0x003e:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getSimpleName()
            int r3 = r2.length()
            if (r3 > 0) goto L_0x0062
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            r3 = 46
            int r3 = r2.lastIndexOf(r3)
            if (r3 <= 0) goto L_0x0062
            int r3 = r3 + 1
            java.lang.String r2 = r2.substring(r3)
        L_0x0062:
            r0.append(r2)
            r2 = 123(0x7b, float:1.72E-43)
            r0.append(r2)
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L_0x0075:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x007f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GroupedLinkedMap( "
            r0.<init>(r1)
            java.lang.Object r1 = r6.f35V
            E2.d r1 = (E2.d) r1
            E2.d r2 = r1.f1332c
            r3 = 0
            r4 = 0
        L_0x008e:
            boolean r5 = r2.equals(r1)
            if (r5 != 0) goto L_0x00b9
            r4 = 123(0x7b, float:1.72E-43)
            r0.append(r4)
            E2.i r4 = r2.f1330a
            r0.append(r4)
            r4 = 58
            r0.append(r4)
            java.util.ArrayList r4 = r2.f1331b
            if (r4 == 0) goto L_0x00ac
            int r4 = r4.size()
            goto L_0x00ad
        L_0x00ac:
            r4 = 0
        L_0x00ad:
            r0.append(r4)
            java.lang.String r4 = "}, "
            r0.append(r4)
            E2.d r2 = r2.f1332c
            r4 = 1
            goto L_0x008e
        L_0x00b9:
            if (r4 == 0) goto L_0x00c8
            int r1 = r0.length()
            int r1 = r1 + -2
            int r2 = r0.length()
            r0.delete(r1, r2)
        L_0x00c8:
            java.lang.String r1 = " )"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.d.toString():java.lang.String");
    }

    public B0 u() {
        B0 b02 = new B0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f36W).entrySet()) {
            J0 j02 = (J0) entry.getValue();
            if (j02.e) {
                b02.a(j02.f800a);
                arrayList.add((String) entry.getKey());
            }
        }
        h.j("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + ((String) this.f35V));
        return b02;
    }

    public Collection v() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f36W).entrySet()) {
            if (((J0) entry.getValue()).e) {
                arrayList.add(((J0) entry.getValue()).f800a);
            }
        }
        return DesugarCollections.unmodifiableCollection(arrayList);
    }

    public Collection w() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f36W).entrySet()) {
            if (((J0) entry.getValue()).e) {
                arrayList.add(((J0) entry.getValue()).f801b);
            }
        }
        return DesugarCollections.unmodifiableCollection(arrayList);
    }

    public S3.b x() {
        int[] iArr;
        int i;
        int i8;
        d dVar = this;
        if (((S3.b) dVar.f36W) == null) {
            S3.e eVar = (S3.e) dVar.f35V;
            S3.b bVar = eVar.f4523d;
            if (bVar == null) {
                M3.f fVar = eVar.f4520a;
                int i9 = fVar.f3139a;
                int i10 = fVar.f3140b;
                if (i9 < 40 || i10 < 40) {
                    S3.b bVar2 = new S3.b(i9, i10);
                    if (eVar.f4521b.length < i9) {
                        eVar.f4521b = new byte[i9];
                    }
                    int i11 = 0;
                    while (true) {
                        iArr = eVar.f4522c;
                        if (i11 >= 32) {
                            break;
                        }
                        iArr[i11] = 0;
                        i11++;
                    }
                    for (int i12 = 1; i12 < 5; i12++) {
                        byte[] b8 = fVar.b((i10 * i12) / 5, eVar.f4521b);
                        int i13 = (i9 << 2) / 5;
                        for (int i14 = i9 / 5; i14 < i13; i14++) {
                            int i15 = (b8[i14] & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> 3;
                            iArr[i15] = iArr[i15] + 1;
                        }
                    }
                    int a8 = S3.e.a(iArr);
                    byte[] a9 = fVar.a();
                    for (int i16 = 0; i16 < i10; i16++) {
                        int i17 = i16 * i9;
                        for (int i18 = 0; i18 < i9; i18++) {
                            if ((a9[i17 + i18] & Pdu.MANUFACTURER_DATA_PDU_TYPE) < a8) {
                                bVar2.f(i18, i16);
                            }
                        }
                    }
                    eVar.f4523d = bVar2;
                } else {
                    byte[] a10 = fVar.a();
                    int i19 = i9 >> 3;
                    if ((i9 & 7) != 0) {
                        i19++;
                    }
                    int i20 = i10 >> 3;
                    if ((i10 & 7) != 0) {
                        i20++;
                    }
                    int i21 = i10 - 8;
                    int i22 = i9 - 8;
                    int[] iArr2 = new int[2];
                    iArr2[1] = i19;
                    iArr2[0] = i20;
                    int[][] iArr3 = (int[][]) Array.newInstance(Integer.TYPE, iArr2);
                    int i23 = 0;
                    while (true) {
                        int i24 = 8;
                        if (i23 >= i20) {
                            break;
                        }
                        int i25 = i23 << 3;
                        if (i25 > i21) {
                            i25 = i21;
                        }
                        int i26 = 0;
                        while (i26 < i19) {
                            int i27 = i26 << 3;
                            if (i27 > i22) {
                                i27 = i22;
                            }
                            int i28 = (i25 * i9) + i27;
                            int i29 = 0;
                            int i30 = 0;
                            byte b9 = 0;
                            byte b10 = Pdu.MANUFACTURER_DATA_PDU_TYPE;
                            while (i29 < i24) {
                                int i31 = i25;
                                byte b11 = b9;
                                byte b12 = b10;
                                int i32 = 0;
                                while (i32 < i24) {
                                    S3.e eVar2 = eVar;
                                    byte b13 = a10[i28 + i32] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                                    i30 += b13;
                                    if (b13 < b12) {
                                        b12 = b13;
                                    }
                                    if (b13 > b11) {
                                        b11 = b13;
                                    }
                                    i32++;
                                    eVar = eVar2;
                                    i24 = 8;
                                }
                                S3.e eVar3 = eVar;
                                if (b11 - b12 <= 24) {
                                    i29++;
                                    i28 += i9;
                                    i24 = 8;
                                    b10 = b12;
                                    b9 = b11;
                                    i25 = i31;
                                    eVar = eVar3;
                                }
                                while (true) {
                                    i29++;
                                    i28 += i9;
                                    if (i29 >= 8) {
                                        break;
                                    }
                                    int i33 = 0;
                                    for (int i34 = 8; i33 < i34; i34 = 8) {
                                        i30 += a10[i28 + i33] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                                        i33++;
                                    }
                                }
                                i29++;
                                i28 += i9;
                                i24 = 8;
                                b10 = b12;
                                b9 = b11;
                                i25 = i31;
                                eVar = eVar3;
                            }
                            S3.e eVar4 = eVar;
                            int i35 = i25;
                            int i36 = i30 >> 6;
                            byte b14 = b10;
                            if (b9 - b14 <= 24) {
                                i36 = b14 / 2;
                                if (i23 > 0 && i26 > 0) {
                                    int[] iArr4 = iArr3[i23 - 1];
                                    int i37 = i26 - 1;
                                    int i38 = (((iArr3[i23][i37] * 2) + iArr4[i26]) + iArr4[i37]) / 4;
                                    if (b14 < i38) {
                                        i36 = i38;
                                    }
                                }
                            }
                            iArr3[i23][i26] = i36;
                            i26++;
                            i24 = 8;
                            i25 = i35;
                            eVar = eVar4;
                        }
                        S3.e eVar5 = eVar;
                        i23++;
                    }
                    S3.e eVar6 = eVar;
                    S3.b bVar3 = new S3.b(i9, i10);
                    for (int i39 = 0; i39 < i20; i39++) {
                        int i40 = i39 << 3;
                        if (i40 > i21) {
                            i40 = i21;
                        }
                        int i41 = i20 - 3;
                        if (i39 < 2) {
                            i = 2;
                        } else {
                            i = Math.min(i39, i41);
                        }
                        int i42 = 0;
                        while (i42 < i19) {
                            int i43 = i42 << 3;
                            if (i43 > i22) {
                                i43 = i22;
                            }
                            int i44 = i19 - 3;
                            if (i42 < 2) {
                                i8 = 2;
                            } else {
                                i8 = Math.min(i42, i44);
                            }
                            int i45 = -2;
                            int i46 = 0;
                            for (int i47 = 2; i45 <= i47; i47 = 2) {
                                int[] iArr5 = iArr3[i + i45];
                                i46 = iArr5[i8 - 2] + iArr5[i8 - 1] + iArr5[i8] + iArr5[i8 + 1] + iArr5[i8 + 2] + i46;
                                i45++;
                            }
                            int i48 = i46 / 25;
                            int i49 = (i40 * i9) + i43;
                            int i50 = i;
                            int i51 = 0;
                            while (true) {
                                if (i51 >= 8) {
                                    break;
                                }
                                int i52 = i19;
                                int i53 = 0;
                                for (int i54 = 8; i53 < i54; i54 = 8) {
                                    byte[] bArr = a10;
                                    if ((a10[i49 + i53] & Pdu.MANUFACTURER_DATA_PDU_TYPE) <= i48) {
                                        bVar3.f(i43 + i53, i40 + i51);
                                    }
                                    i53++;
                                    a10 = bArr;
                                }
                                byte[] bArr2 = a10;
                                i51++;
                                i49 += i9;
                                i19 = i52;
                            }
                            byte[] bArr3 = a10;
                            int i55 = i19;
                            i42++;
                            i = i50;
                        }
                        byte[] bArr4 = a10;
                        int i56 = i19;
                    }
                    eVar = eVar6;
                    eVar.f4523d = bVar3;
                }
                bVar = eVar.f4523d;
                dVar = this;
            }
            dVar.f36W = bVar;
        }
        return (S3.b) dVar.f36W;
    }

    public S3.a y(S3.a aVar, int i) {
        int[] iArr;
        S3.e eVar = (S3.e) this.f35V;
        M3.f fVar = eVar.f4520a;
        int i8 = fVar.f3139a;
        if (aVar.f4504V < i8) {
            aVar = new S3.a(i8);
        } else {
            int length = aVar.f4503U.length;
            for (int i9 = 0; i9 < length; i9++) {
                aVar.f4503U[i9] = 0;
            }
        }
        if (eVar.f4521b.length < i8) {
            eVar.f4521b = new byte[i8];
        }
        int i10 = 0;
        while (true) {
            iArr = eVar.f4522c;
            if (i10 >= 32) {
                break;
            }
            iArr[i10] = 0;
            i10++;
        }
        byte[] b8 = fVar.b(i, eVar.f4521b);
        for (int i11 = 0; i11 < i8; i11++) {
            int i12 = (b8[i11] & Pdu.MANUFACTURER_DATA_PDU_TYPE) >> 3;
            iArr[i12] = iArr[i12] + 1;
        }
        int a8 = S3.e.a(iArr);
        if (i8 < 3) {
            for (int i13 = 0; i13 < i8; i13++) {
                if ((b8[i13] & Pdu.MANUFACTURER_DATA_PDU_TYPE) < a8) {
                    aVar.f(i13);
                }
            }
        } else {
            byte b9 = b8[0] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
            int i14 = 1;
            byte b10 = b9;
            byte b11 = b8[1] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
            while (i14 < i8 - 1) {
                int i15 = i14 + 1;
                byte b12 = b8[i15] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
                if ((((b11 << 2) - b10) - b12) / 2 < a8) {
                    aVar.f(i14);
                }
                b10 = b11;
                i14 = i15;
                b11 = b12;
            }
        }
        return aVar;
    }

    public void z(Throwable th) {
        switch (this.f34U) {
            case 2:
                if (th instanceof r0) {
                    n2.a.m((String) null, ((a0.m) this.f36W).cancel(false));
                    return;
                } else {
                    n2.a.m((String) null, ((j) this.f35V).a((Object) null));
                    return;
                }
            case 3:
                n2.a.m("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof r0);
                ((C1486a) this.f35V).accept(new C0009j(1, (Surface) this.f36W));
                return;
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                int i = ((k) this.f35V).f2763f;
                if (i != 2 || !(th instanceof CancellationException)) {
                    h.J("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + R.e.h(i), th);
                    return;
                }
                h.j("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
            default:
                int i8 = ((k) this.f35V).f2763f;
                if (i8 != 2 || !(th instanceof CancellationException)) {
                    h.J("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: " + R.e.h(i8), th);
                    return;
                }
                h.j("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                return;
        }
    }

    public /* synthetic */ d(int i, boolean z) {
        this.f34U = i;
    }

    public /* synthetic */ d(Object obj, int i, Object obj2) {
        this.f34U = i;
        this.f35V = obj;
        this.f36W = obj2;
    }

    public d(URL url) {
        this.f34U = 27;
        this.f35V = url;
        if (url.getQuery() != null) {
            StringBuilder b8 = R7.h.b();
            b8.append(((URL) this.f35V).getQuery());
            this.f36W = b8;
        }
    }

    public d(int i) {
        this.f34U = i;
        switch (i) {
            case 5:
                this.f35V = new Object();
                this.f36W = new LinkedHashMap();
                new HashSet();
                return;
            case 6:
                this.f35V = new x();
                this.f36W = new HashMap();
                return;
            case 10:
                this.f35V = new E2.d((E2.i) null);
                this.f36W = new HashMap();
                return;
            case 11:
                this.f35V = new HashMap();
                this.f36W = new F2.c(0);
                return;
            case 12:
                this.f35V = new v(1000);
                this.f36W = X2.c.a(10, new z3.e(25));
                return;
            case 25:
                File file = new File(System.getProperty("java.io.tmpdir"));
                this.f35V = file;
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f36W = new ArrayList();
                return;
            case 29:
                this.f35V = new HashMap();
                return;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f35V = byteArrayOutputStream;
                this.f36W = new DataOutputStream(byteArrayOutputStream);
                return;
        }
    }

    public d(S3.e eVar) {
        this.f34U = 22;
        this.f35V = eVar;
    }

    public d(r rVar, O o2) {
        K0.a aVar;
        this.f34U = 15;
        this.f35V = rVar;
        P6.f.e(o2, "store");
        J0.a aVar2 = J0.a.f2337b;
        P6.f.e(aVar2, "defaultCreationExtras");
        Class<K0.a> cls = K0.a.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            P6.f.e(concat, "key");
            LinkedHashMap linkedHashMap = o2.f8131a;
            M m8 = (M) linkedHashMap.get(concat);
            if (cls.isInstance(m8)) {
                P6.f.c(m8, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(aVar2.f2338a);
                linkedHashMap2.put(N.f8130b, concat);
                try {
                    aVar = new K0.a();
                } catch (AbstractMethodError unused) {
                    aVar = new K0.a();
                }
                m8 = aVar;
                M m9 = (M) linkedHashMap.put(concat, m8);
                if (m9 != null) {
                    m9.onCleared();
                }
            }
            this.f36W = (K0.a) m8;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public d(String str) {
        this.f34U = 7;
        this.f36W = new LinkedHashMap();
        this.f35V = str;
    }

    public d(Context context) {
        this.f34U = 28;
        J1.d dVar = new J1.d(2);
        this.f35V = context.getApplicationContext();
        this.f36W = dVar;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.text.Editable$Factory, E0.a] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.widget.EditText r6) {
        /*
            r5 = this;
            r0 = 9
            r5.f34U = r0
            r0 = 0
            r5.<init>()
            r5.f35V = r6
            E0.i r1 = new E0.i
            r1.<init>(r6)
            r5.f36W = r1
            r6.addTextChangedListener(r1)
            E0.a r1 = E0.a.f1296b
            if (r1 != 0) goto L_0x003b
            java.lang.Object r1 = E0.a.f1295a
            monitor-enter(r1)
            E0.a r2 = E0.a.f1296b     // Catch:{ all -> 0x0035 }
            if (r2 != 0) goto L_0x0037
            E0.a r2 = new E0.a     // Catch:{ all -> 0x0035 }
            r2.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<E0.a> r4 = E0.a.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x0032 }
            java.lang.Class r0 = java.lang.Class.forName(r3, r0, r4)     // Catch:{ all -> 0x0032 }
            E0.a.f1297c = r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            E0.a.f1296b = r2     // Catch:{ all -> 0x0035 }
            goto L_0x0037
        L_0x0035:
            r6 = move-exception
            goto L_0x0039
        L_0x0037:
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            goto L_0x003b
        L_0x0039:
            monitor-exit(r1)     // Catch:{ all -> 0x0035 }
            throw r6
        L_0x003b:
            E0.a r0 = E0.a.f1296b
            r6.setEditableFactory(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A1.d.<init>(android.widget.EditText):void");
    }
}
