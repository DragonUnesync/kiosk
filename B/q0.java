package B;

import B7.h;
import D.C0051j0;
import D.C0054l;
import D.C0062p;
import D.C0063q;
import D.C0064s;
import D.C0069x;
import D.C0071z;
import D2.D;
import D2.j;
import D2.u;
import F2.e;
import G.c;
import G5.m;
import K1.i;
import K2.C0112d;
import M0.C0129q;
import M0.I;
import M0.r;
import M1.d;
import P0.l;
import P0.w;
import P0.z;
import P2.a;
import P6.f;
import Q0.g;
import Q0.s;
import Q0.t;
import T7.i1;
import V0.x;
import V0.y;
import V1.C;
import V1.G;
import X2.b;
import a0.k;
import a0.n;
import a1.C0410a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Surface;
import androidx.emoji2.text.v;
import com.samsung.android.knox.EnterpriseDeviceManager;
import j$.util.DesugarCollections;
import java.io.BufferedReader;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.sender.ReportSenderFactory;
import p1.F;
import p1.q;
import r7.C1395d;
import u0.C1488c;

public final class q0 implements c, k, q, a, d, C {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f299U;

    /* renamed from: V  reason: collision with root package name */
    public Object f300V;

    /* renamed from: W  reason: collision with root package name */
    public Object f301W;

    /* renamed from: X  reason: collision with root package name */
    public Object f302X;

    public /* synthetic */ q0(int i) {
        this.f299U = i;
    }

    private final void D() {
    }

    private final void E() {
    }

    public static boolean n(Editable editable, KeyEvent keyEvent, boolean z) {
        v[] vVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd || (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) == null || vVarArr.length <= 0)) {
            int length = vVarArr.length;
            int i = 0;
            while (i < length) {
                v vVar = vVarArr[i];
                int spanStart = editable.getSpanStart(vVar);
                int spanEnd = editable.getSpanEnd(vVar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean A(Object obj) {
        if (obj instanceof b) {
            ((b) obj).b().f6281a = true;
        }
        switch (((i) this.f301W).f2568U) {
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                break;
            default:
                ((List) obj).clear();
                break;
        }
        return ((C1488c) this.f302X).c(obj);
    }

    public void B(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (((HashSet) this.f300V).remove(mediaCodec) && (loudnessCodecController = (LoudnessCodecController) this.f302X) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [java.lang.Object, B3.q] */
    public void C(boolean z, Bundle bundle) {
        String str;
        Context context = (Context) this.f300V;
        C1395d dVar = (C1395d) this.f301W;
        ErrorReporter errorReporter = C1247a.f13789a;
        try {
            f.e(context, "context");
            ArrayList a8 = ((x7.c) dVar.f14977t0).a(dVar, ReportSenderFactory.class);
            ArrayList arrayList = new ArrayList(D6.k.M(a8));
            Iterator it = a8.iterator();
            while (it.hasNext()) {
                h create = ((ReportSenderFactory) it.next()).create(context, dVar);
                ErrorReporter errorReporter2 = C1247a.f13789a;
                arrayList.add(create);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                ((h) next).getClass();
                if (!z) {
                    arrayList2.add(next);
                }
            }
            ArrayList V8 = D6.i.V(arrayList2);
            if (V8.isEmpty()) {
                ErrorReporter errorReporter3 = C1247a.f13789a;
                V8.add(new Object());
            }
            File[] c8 = ((e) this.f302X).c();
            f.e(context, "context");
            ? obj = new Object();
            obj.f449U = context;
            obj.f450V = dVar;
            obj.f451W = V8;
            obj.f452X = bundle;
            int length = c8.length;
            int i = 0;
            int i8 = 0;
            boolean z6 = false;
            while (true) {
                if (i >= length) {
                    break;
                }
                File file = c8[i];
                String name = file.getName();
                f.d(name, "getName(...)");
                boolean c02 = W6.d.c0(name, n7.b.f13790a);
                boolean z8 = !c02;
                if (!bundle.getBoolean("onlySendSilentReports") || c02) {
                    z6 |= z8;
                    if (i8 >= 5) {
                        break;
                    } else if (obj.u(file)) {
                        i8++;
                    }
                }
                i++;
            }
            if (i8 > 0) {
                str = dVar.p0;
            } else {
                str = dVar.f14974q0;
            }
            if (z6 && str != null) {
                if (str.length() != 0) {
                    ErrorReporter errorReporter4 = C1247a.f13789a;
                    new Handler(Looper.getMainLooper()).post(new C0002c((Object) this, 4, (Object) str));
                }
            }
        } catch (Exception e) {
            ErrorReporter errorReporter5 = C1247a.f13789a;
            n2.a.B("", e);
        }
        ErrorReporter errorReporter6 = C1247a.f13789a;
    }

    public List X(long j7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = (List) this.f300V;
            if (i >= list.size()) {
                break;
            }
            int i8 = i * 2;
            long[] jArr = (long[]) this.f301W;
            if (jArr[i8] <= j7 && j7 < jArr[i8 + 1]) {
                U1.d dVar = (U1.d) list.get(i);
                O0.b bVar = dVar.f5394a;
                if (bVar.e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new C0051j0(6));
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            O0.a a8 = ((U1.d) arrayList2.get(i9)).f5394a.a();
            a8.e = (float) (-1 - i9);
            a8.f3499f = 1;
            arrayList.add(a8.a());
        }
        return arrayList;
    }

    public Object a() {
        Object a8 = ((C1488c) this.f302X).a();
        if (a8 == null) {
            a8 = ((X2.a) this.f300V).d();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + a8.getClass());
            }
        }
        if (a8 instanceof b) {
            ((b) a8).b().f6281a = false;
        }
        return a8;
    }

    public void b(w wVar, q qVar, G g8) {
        this.f301W = wVar;
        g8.c();
        g8.d();
        p1.G q7 = qVar.q(g8.f5716c, 5);
        this.f302X = q7;
        q7.c((r) this.f300V);
    }

    public int c(long j7) {
        long[] jArr = (long[]) this.f302X;
        int a8 = z.a(jArr, j7, false);
        if (a8 < jArr.length) {
            return a8;
        }
        return -1;
    }

    public D d(D d8, B2.i iVar) {
        Drawable drawable = (Drawable) d8.get();
        if (drawable instanceof BitmapDrawable) {
            return ((j) this.f301W).d(C0112d.b((E2.b) this.f300V, ((BitmapDrawable) drawable).getBitmap()), iVar);
        } else if (drawable instanceof O2.c) {
            return ((P2.c) this.f302X).d(d8, iVar);
        } else {
            return null;
        }
    }

    public void e(P0.r rVar) {
        long d8;
        long j7;
        l.k((w) this.f301W);
        int i = z.f3748a;
        w wVar = (w) this.f301W;
        synchronized (wVar) {
            try {
                long j8 = wVar.f3744c;
                if (j8 != -9223372036854775807L) {
                    d8 = j8 + wVar.f3743b;
                } else {
                    d8 = wVar.d();
                }
                j7 = d8;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        long e = ((w) this.f301W).e();
        if (j7 != -9223372036854775807L && e != -9223372036854775807L) {
            r rVar2 = (r) this.f300V;
            if (e != rVar2.f3041s) {
                C0129q a8 = rVar2.a();
                a8.f3004r = e;
                r rVar3 = new r(a8);
                this.f300V = rVar3;
                ((p1.G) this.f302X).c(rVar3);
            }
            int a9 = rVar.a();
            ((p1.G) this.f302X).a(a9, rVar);
            ((p1.G) this.f302X).e(j7, 1, a9, 0, (F) null);
        }
    }

    public void f(Object obj) {
        switch (this.f299U) {
            case 0:
                Surface surface = (Surface) obj;
                F.a l8 = D7.b.l();
                G.i.e(true, (L3.b) this.f300V, (a0.j) this.f301W, l8);
                return;
            default:
                Void voidR = (Void) obj;
                ((U.d) this.f302X).f5261Z = null;
                return;
        }
    }

    public void g() {
        ((q) this.f300V).g();
    }

    public Object h(a0.j jVar) {
        C0.e eVar = new C0.e(3, this);
        F.a l8 = D7.b.l();
        n nVar = jVar.f7013c;
        if (nVar != null) {
            nVar.d(eVar, l8);
        }
        ((F.d) this.f302X).f1395U.set(jVar);
        return "HandlerScheduledFuture-" + ((Callable) this.f301W).toString();
    }

    public String i(String str, long j7, int i, long j8) {
        StringBuilder sb = new StringBuilder();
        int i8 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f301W;
            int size = arrayList.size();
            ArrayList arrayList2 = (ArrayList) this.f300V;
            if (i8 < size) {
                sb.append((String) arrayList2.get(i8));
                if (((Integer) arrayList.get(i8)).intValue() == 1) {
                    sb.append(str);
                } else {
                    int intValue = ((Integer) arrayList.get(i8)).intValue();
                    ArrayList arrayList3 = (ArrayList) this.f302X;
                    if (intValue == 2) {
                        sb.append(String.format(Locale.US, (String) arrayList3.get(i8), new Object[]{Long.valueOf(j7)}));
                    } else if (((Integer) arrayList.get(i8)).intValue() == 3) {
                        sb.append(String.format(Locale.US, (String) arrayList3.get(i8), new Object[]{Integer.valueOf(i)}));
                    } else if (((Integer) arrayList.get(i8)).intValue() == 4) {
                        sb.append(String.format(Locale.US, (String) arrayList3.get(i8), new Object[]{Long.valueOf(j8)}));
                    }
                }
                i8++;
            } else {
                sb.append((String) arrayList2.get(arrayList.size()));
                return sb.toString();
            }
        }
    }

    public void j(M.k kVar, Map.Entry entry) {
        C0071z zVar;
        M.k kVar2 = (M.k) entry.getValue();
        Size size = kVar.f2764g.f904a;
        Rect rect = ((O.b) entry.getKey()).f3470d;
        if (kVar.f2761c) {
            zVar = (C0071z) this.f301W;
        } else {
            zVar = null;
        }
        C0007h hVar = new C0007h(size, rect, zVar, ((O.b) entry.getKey()).f3471f, ((O.b) entry.getKey()).f3472g);
        int i = ((O.b) entry.getKey()).f3469c;
        kVar2.getClass();
        g7.l.a();
        kVar2.a();
        n2.a.m("Consumer can only be linked once.", !kVar2.f2766j);
        kVar2.f2766j = true;
        M.j jVar = kVar2.f2768l;
        G.b f8 = G.i.f(jVar.c(), new M.i(kVar2, jVar, i, hVar, (C0007h) null), D7.b.H());
        f8.d(new G.h(f8, 0, new A1.d(20, this, kVar2, false)), D7.b.H());
    }

    public void k(q qVar, G g8) {
        boolean z;
        int i = 0;
        while (true) {
            p1.G[] gArr = (p1.G[]) this.f301W;
            if (i < gArr.length) {
                g8.c();
                g8.d();
                p1.G q7 = qVar.q(g8.f5716c, 3);
                r rVar = (r) ((List) this.f300V).get(i);
                String str = rVar.f3036n;
                if ("application/cea-608".equals(str) || "application/cea-708".equals(str)) {
                    z = true;
                } else {
                    z = false;
                }
                l.c("Invalid closed caption MIME type provided: " + str, z);
                String str2 = rVar.f3025a;
                if (str2 == null) {
                    g8.d();
                    str2 = (String) g8.e;
                }
                C0129q qVar2 = new C0129q();
                qVar2.f2989a = str2;
                qVar2.f2999m = I.o(str);
                qVar2.e = rVar.e;
                qVar2.f2992d = rVar.f3028d;
                qVar2.f2984G = rVar.f3019H;
                qVar2.f3002p = rVar.f3039q;
                g.v(qVar2, q7);
                gArr[i] = q7;
                i++;
            } else {
                return;
            }
        }
    }

    public void l(p1.z zVar) {
        ((q) this.f300V).l(zVar);
    }

    public Bitmap m(BitmapFactory.Options options) {
        switch (this.f299U) {
            case 7:
                return BitmapFactory.decodeStream(new W2.a(W2.b.c((ByteBuffer) this.f300V)), (Rect) null, options);
            case 8:
                K2.w wVar = (K2.w) ((com.bumptech.glide.load.data.h) this.f300V).f9037V;
                wVar.reset();
                return BitmapFactory.decodeStream(wVar, (Rect) null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.h) this.f302X).e().getFileDescriptor(), (Rect) null, options);
        }
    }

    public Object o() {
        Object removeLast;
        synchronized (this.f301W) {
            removeLast = ((ArrayDeque) this.f300V).removeLast();
        }
        return removeLast;
    }

    public void p(W w2) {
        C0064s sVar;
        U e = w2.e();
        Object obj = null;
        if (e instanceof H.c) {
            sVar = ((H.c) e).f1765a;
        } else {
            sVar = null;
        }
        if ((sVar.h() == C0063q.f937Z || sVar.h() == C0063q.f935X) && sVar.c() == C0062p.f926Y && sVar.d() == D.r.f946X) {
            synchronized (this.f301W) {
                try {
                    if (((ArrayDeque) this.f300V).size() >= 3) {
                        obj = o();
                    }
                    ((ArrayDeque) this.f300V).addFirst(w2);
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (((l1.j) this.f302X) != null && obj != null) {
                ((W) obj).close();
                return;
            }
            return;
        }
        ((l1.j) this.f302X).getClass();
        w2.close();
    }

    public p1.G q(int i, int i8) {
        q qVar = (q) this.f300V;
        if (i8 != 3) {
            return qVar.q(i, i8);
        }
        SparseArray sparseArray = (SparseArray) this.f302X;
        M1.n nVar = (M1.n) sparseArray.get(i);
        if (nVar != null) {
            return nVar;
        }
        M1.n nVar2 = new M1.n(qVar.q(i, i8), (M1.j) this.f301W);
        sparseArray.put(i, nVar2);
        return nVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bumptech.glide.load.ImageHeaderParser$ImageType r() {
        /*
            r10 = this;
            int r0 = r10.f299U
            switch(r0) {
                case 7: goto L_0x006b;
                case 8: goto L_0x0053;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.f302X
            com.bumptech.glide.load.data.h r0 = (com.bumptech.glide.load.data.h) r0
            java.lang.Object r1 = r10.f300V
            E2.g r1 = (E2.g) r1
            java.lang.Object r2 = r10.f301W
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = 0
        L_0x0016:
            if (r4 >= r3) goto L_0x0050
            java.lang.Object r5 = r2.get(r4)
            B2.e r5 = (B2.e) r5
            r6 = 0
            K2.w r7 = new K2.w     // Catch:{ all -> 0x0046 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x0046 }
            android.os.ParcelFileDescriptor r9 = r0.e()     // Catch:{ all -> 0x0046 }
            java.io.FileDescriptor r9 = r9.getFileDescriptor()     // Catch:{ all -> 0x0046 }
            r8.<init>(r9)     // Catch:{ all -> 0x0046 }
            r7.<init>(r8, r1)     // Catch:{ all -> 0x0046 }
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.d(r7)     // Catch:{ all -> 0x0043 }
            r7.l()
            r0.e()
            com.bumptech.glide.load.ImageHeaderParser$ImageType r6 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
            if (r5 == r6) goto L_0x0040
            goto L_0x0052
        L_0x0040:
            int r4 = r4 + 1
            goto L_0x0016
        L_0x0043:
            r1 = move-exception
            r6 = r7
            goto L_0x0047
        L_0x0046:
            r1 = move-exception
        L_0x0047:
            if (r6 == 0) goto L_0x004c
            r6.l()
        L_0x004c:
            r0.e()
            throw r1
        L_0x0050:
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN
        L_0x0052:
            return r5
        L_0x0053:
            java.lang.Object r0 = r10.f300V
            com.bumptech.glide.load.data.h r0 = (com.bumptech.glide.load.data.h) r0
            java.lang.Object r0 = r0.f9037V
            K2.w r0 = (K2.w) r0
            r0.reset()
            java.lang.Object r1 = r10.f302X
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r10.f301W
            E2.g r2 = (E2.g) r2
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = N7.a.n(r1, r0, r2)
            return r0
        L_0x006b:
            java.lang.Object r0 = r10.f300V
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteBuffer r0 = W2.b.c(r0)
            java.lang.Object r1 = r10.f301W
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = N7.a.o(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B.q0.r():com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }

    public long s(int i) {
        boolean z;
        boolean z6 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        l.d(z);
        long[] jArr = (long[]) this.f302X;
        if (i < jArr.length) {
            z6 = true;
        }
        l.d(z6);
        return jArr[i];
    }

    public int s0() {
        return ((long[]) this.f302X).length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (r6 >= r7) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean t(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.u r13) {
        /*
            r9 = this;
            r0 = 1
            int r1 = r13.f7826c
            r1 = r1 & 3
            r2 = 2
            r3 = 0
            if (r1 != 0) goto L_0x0110
            java.lang.Object r1 = r9.f302X
            androidx.emoji2.text.c r1 = (androidx.emoji2.text.c) r1
            D0.a r4 = r13.c()
            r5 = 8
            int r5 = r4.a(r5)
            if (r5 == 0) goto L_0x0025
            java.lang.Object r6 = r4.f980d
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r4 = r4.f977a
            int r5 = r5 + r4
            short r4 = r6.getShort(r5)
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            r1.getClass()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 >= r6) goto L_0x0034
            if (r4 <= r5) goto L_0x0034
        L_0x0031:
            r10 = 0
            goto L_0x0103
        L_0x0034:
            java.lang.ThreadLocal r4 = androidx.emoji2.text.c.f7779b
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L_0x0044
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r4.set(r5)
        L_0x0044:
            java.lang.Object r4 = r4.get()
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            r4.setLength(r3)
        L_0x004d:
            if (r11 >= r12) goto L_0x0058
            char r5 = r10.charAt(r11)
            r4.append(r5)
            int r11 = r11 + r0
            goto L_0x004d
        L_0x0058:
            android.text.TextPaint r10 = r1.f7780a
            java.lang.String r11 = r4.toString()
            java.lang.ThreadLocal r12 = m0.C1198d.f13320a
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r6) goto L_0x006a
            boolean r10 = I.a.l(r10, r11)
            goto L_0x0103
        L_0x006a:
            int r12 = r11.length()
            if (r12 != r0) goto L_0x007d
            char r1 = r11.charAt(r3)
            boolean r1 = java.lang.Character.isWhitespace(r1)
            if (r1 == 0) goto L_0x007d
        L_0x007a:
            r10 = 1
            goto L_0x0103
        L_0x007d:
            java.lang.String r1 = "󟿽"
            float r4 = r10.measureText(r1)
            java.lang.String r5 = "m"
            float r5 = r10.measureText(r5)
            float r6 = r10.measureText(r11)
            r7 = 0
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 != 0) goto L_0x0093
            goto L_0x0031
        L_0x0093:
            int r8 = r11.length()
            int r8 = r11.codePointCount(r3, r8)
            if (r8 <= r0) goto L_0x00bf
            r8 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r8
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a6
            goto L_0x0031
        L_0x00a6:
            r5 = 0
        L_0x00a7:
            if (r5 >= r12) goto L_0x00b9
            int r8 = r11.codePointAt(r5)
            int r8 = java.lang.Character.charCount(r8)
            int r8 = r8 + r5
            float r5 = r10.measureText(r11, r5, r8)
            float r7 = r7 + r5
            r5 = r8
            goto L_0x00a7
        L_0x00b9:
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x00bf
            goto L_0x0031
        L_0x00bf:
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00c4
            goto L_0x007a
        L_0x00c4:
            java.lang.ThreadLocal r4 = m0.C1198d.f13320a
            java.lang.Object r5 = r4.get()
            u0.b r5 = (u0.C1487b) r5
            if (r5 != 0) goto L_0x00e1
            u0.b r5 = new u0.b
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r5.<init>(r6, r7)
            r4.set(r5)
            goto L_0x00ef
        L_0x00e1:
            java.lang.Object r4 = r5.f15731a
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
            java.lang.Object r4 = r5.f15732b
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
        L_0x00ef:
            java.lang.Object r4 = r5.f15731a
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r10.getTextBounds(r1, r3, r2, r4)
            java.lang.Object r1 = r5.f15732b
            r5 = r1
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            r10.getTextBounds(r11, r3, r12, r5)
            boolean r10 = r4.equals(r1)
            r10 = r10 ^ r0
        L_0x0103:
            int r11 = r13.f7826c
            r11 = r11 & 4
            if (r10 == 0) goto L_0x010c
            r10 = r11 | 2
            goto L_0x010e
        L_0x010c:
            r10 = r11 | 1
        L_0x010e:
            r13.f7826c = r10
        L_0x0110:
            int r10 = r13.f7826c
            r10 = r10 & 3
            if (r10 != r2) goto L_0x0117
            goto L_0x0118
        L_0x0117:
            r0 = 0
        L_0x0118:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: B.q0.t(java.lang.CharSequence, int, int, androidx.emoji2.text.u):boolean");
    }

    public boolean u() {
        String trim;
        if (((String) this.f302X) != null) {
            return true;
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f301W;
        if (!arrayDeque.isEmpty()) {
            String str = (String) arrayDeque.poll();
            str.getClass();
            this.f302X = str;
            return true;
        }
        do {
            String readLine = ((BufferedReader) this.f300V).readLine();
            this.f302X = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.f302X = trim;
        } while (trim.isEmpty());
        return true;
    }

    public String v() {
        if (u()) {
            String str = (String) this.f302X;
            this.f302X = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object w(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21, androidx.emoji2.text.n r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r22
            androidx.emoji2.text.o r5 = new androidx.emoji2.text.o
            java.lang.Object r6 = r0.f301W
            B3.q r6 = (B3.q) r6
            java.lang.Object r6 = r6.f451W
            androidx.emoji2.text.r r6 = (androidx.emoji2.text.r) r6
            r5.<init>(r6)
            int r6 = java.lang.Character.codePointAt(r17, r18)
            r7 = 1
            r8 = 0
            r8 = r18
            r9 = r6
            r10 = 0
            r11 = 1
            r6 = r8
        L_0x0023:
            r12 = 2
            if (r6 >= r2) goto L_0x00ce
            if (r10 >= r3) goto L_0x00ce
            if (r11 == 0) goto L_0x00ce
            androidx.emoji2.text.r r13 = r5.f7805c
            android.util.SparseArray r13 = r13.f7817a
            if (r13 != 0) goto L_0x0032
            r13 = 0
            goto L_0x0038
        L_0x0032:
            java.lang.Object r13 = r13.get(r9)
            androidx.emoji2.text.r r13 = (androidx.emoji2.text.r) r13
        L_0x0038:
            int r14 = r5.f7803a
            r15 = 3
            if (r14 == r12) goto L_0x004c
            if (r13 != 0) goto L_0x0044
            r5.a()
        L_0x0042:
            r13 = 1
            goto L_0x008c
        L_0x0044:
            r5.f7803a = r12
            r5.f7805c = r13
            r5.f7807f = r7
        L_0x004a:
            r13 = 2
            goto L_0x008c
        L_0x004c:
            if (r13 == 0) goto L_0x0056
            r5.f7805c = r13
            int r13 = r5.f7807f
            int r13 = r13 + r7
            r5.f7807f = r13
            goto L_0x004a
        L_0x0056:
            r13 = 65038(0xfe0e, float:9.1138E-41)
            if (r9 != r13) goto L_0x005f
            r5.a()
            goto L_0x0042
        L_0x005f:
            r13 = 65039(0xfe0f, float:9.1139E-41)
            if (r9 != r13) goto L_0x0065
            goto L_0x004a
        L_0x0065:
            androidx.emoji2.text.r r13 = r5.f7805c
            androidx.emoji2.text.u r14 = r13.f7818b
            if (r14 == 0) goto L_0x0088
            int r14 = r5.f7807f
            if (r14 != r7) goto L_0x0082
            boolean r13 = r5.b()
            if (r13 == 0) goto L_0x007e
            androidx.emoji2.text.r r13 = r5.f7805c
            r5.f7806d = r13
            r5.a()
        L_0x007c:
            r13 = 3
            goto L_0x008c
        L_0x007e:
            r5.a()
            goto L_0x0042
        L_0x0082:
            r5.f7806d = r13
            r5.a()
            goto L_0x007c
        L_0x0088:
            r5.a()
            goto L_0x0042
        L_0x008c:
            r5.e = r9
            if (r13 == r7) goto L_0x00bd
            if (r13 == r12) goto L_0x00ae
            if (r13 == r15) goto L_0x0095
            goto L_0x0023
        L_0x0095:
            if (r21 != 0) goto L_0x00a1
            androidx.emoji2.text.r r12 = r5.f7806d
            androidx.emoji2.text.u r12 = r12.f7818b
            boolean r12 = r0.t(r1, r8, r6, r12)
            if (r12 != 0) goto L_0x00ab
        L_0x00a1:
            androidx.emoji2.text.r r11 = r5.f7806d
            androidx.emoji2.text.u r11 = r11.f7818b
            boolean r11 = r4.m(r1, r8, r6, r11)
            int r10 = r10 + 1
        L_0x00ab:
            r8 = r6
            goto L_0x0023
        L_0x00ae:
            int r12 = java.lang.Character.charCount(r9)
            int r12 = r12 + r6
            if (r12 >= r2) goto L_0x00ba
            int r6 = java.lang.Character.codePointAt(r1, r12)
            r9 = r6
        L_0x00ba:
            r6 = r12
            goto L_0x0023
        L_0x00bd:
            int r6 = java.lang.Character.codePointAt(r1, r8)
            int r6 = java.lang.Character.charCount(r6)
            int r6 = r6 + r8
            if (r6 >= r2) goto L_0x00ab
            int r8 = java.lang.Character.codePointAt(r1, r6)
            r9 = r8
            goto L_0x00ab
        L_0x00ce:
            int r2 = r5.f7803a
            if (r2 != r12) goto L_0x00f9
            androidx.emoji2.text.r r2 = r5.f7805c
            androidx.emoji2.text.u r2 = r2.f7818b
            if (r2 == 0) goto L_0x00f9
            int r2 = r5.f7807f
            if (r2 > r7) goto L_0x00e2
            boolean r2 = r5.b()
            if (r2 == 0) goto L_0x00f9
        L_0x00e2:
            if (r10 >= r3) goto L_0x00f9
            if (r11 == 0) goto L_0x00f9
            if (r21 != 0) goto L_0x00f2
            androidx.emoji2.text.r r2 = r5.f7805c
            androidx.emoji2.text.u r2 = r2.f7818b
            boolean r2 = r0.t(r1, r8, r6, r2)
            if (r2 != 0) goto L_0x00f9
        L_0x00f2:
            androidx.emoji2.text.r r2 = r5.f7805c
            androidx.emoji2.text.u r2 = r2.f7818b
            r4.m(r1, r8, r6, r2)
        L_0x00f9:
            java.lang.Object r1 = r22.j()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B.q0.w(java.lang.CharSequence, int, int, int, boolean, androidx.emoji2.text.n):java.lang.Object");
    }

    public boolean x(int i, int i8, int i9, int i10) {
        if (i < 0) {
            i += i9;
            i8 += 4 - ((i9 + 4) & 7);
        }
        if (i8 < 0) {
            i8 += i10;
            i += 4 - ((i10 + 4) & 7);
        }
        ((S3.b) this.f301W).f(i8, i);
        return ((S3.b) this.f300V).b(i8, i);
    }

    public int y(int i, int i8, int i9, int i10) {
        int i11 = i - 2;
        int i12 = i8 - 2;
        int i13 = (x(i11, i12, i9, i10) ? 1 : 0) << true;
        int i14 = i8 - 1;
        if (x(i11, i14, i9, i10)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i - 1;
        if (x(i16, i12, i9, i10)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (x(i16, i14, i9, i10)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (x(i16, i8, i9, i10)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (x(i, i12, i9, i10)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (x(i, i14, i9, i10)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (x(i, i8, i9, i10)) {
            return i21 | 1;
        }
        return i21;
    }

    public void z(Throwable th) {
        switch (this.f299U) {
            case 0:
                boolean z = th instanceof CancellationException;
                a0.j jVar = (a0.j) this.f301W;
                if (z) {
                    n2.a.m((String) null, jVar.b(new RuntimeException(N.e.A(new StringBuilder(), (String) this.f302X, " cancelled."), th)));
                    return;
                } else {
                    jVar.a((Object) null);
                    return;
                }
            default:
                ((U.d) this.f302X).f5261Z = null;
                ArrayList arrayList = (ArrayList) this.f300V;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C0069x) this.f301W).i((C0054l) it.next());
                    }
                    arrayList.clear();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ q0(Object obj, int i, Object obj2) {
        this.f299U = i;
        this.f301W = obj;
        this.f300V = obj2;
    }

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, int i) {
        this.f299U = i;
        this.f300V = obj;
        this.f301W = obj2;
        this.f302X = obj3;
    }

    public /* synthetic */ q0(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.f299U = i;
        this.f302X = obj;
        this.f300V = obj2;
        this.f301W = obj3;
    }

    public q0(Context context, C1395d dVar) {
        this.f299U = 1;
        f.e(context, "context");
        this.f300V = context;
        this.f301W = dVar;
        this.f302X = new e(context, 13);
    }

    public q0(i1 i1Var) {
        this.f299U = 16;
        this.f300V = i1Var;
        this.f302X = i1Var.d();
        this.f301W = new ArrayList(0);
    }

    public q0(S3.b bVar) {
        int i;
        int i8;
        S3.b bVar2 = bVar;
        this.f299U = 24;
        int i9 = bVar2.f4506V;
        if (i9 < 8 || i9 > 144 || (i = i9 & 1) != 0) {
            throw M3.d.a();
        }
        W3.d[] dVarArr = W3.d.f6183h;
        if (i == 0) {
            int i10 = bVar2.f4505U;
            if ((i10 & 1) == 0) {
                W3.d[] dVarArr2 = W3.d.f6183h;
                for (int i11 = 0; i11 < 30; i11++) {
                    W3.d dVar = dVarArr2[i11];
                    int i12 = dVar.f6185b;
                    if (i12 == i9 && (i8 = dVar.f6186c) == i10) {
                        this.f302X = dVar;
                        if (i9 == i12) {
                            int i13 = dVar.f6187d;
                            int i14 = i12 / i13;
                            int i15 = dVar.e;
                            int i16 = i8 / i15;
                            S3.b bVar3 = new S3.b(i16 * i15, i14 * i13);
                            for (int i17 = 0; i17 < i14; i17++) {
                                int i18 = i17 * i13;
                                for (int i19 = 0; i19 < i16; i19++) {
                                    int i20 = i19 * i15;
                                    for (int i21 = 0; i21 < i13; i21++) {
                                        int i22 = ((i13 + 2) * i17) + 1 + i21;
                                        int i23 = i18 + i21;
                                        for (int i24 = 0; i24 < i15; i24++) {
                                            if (bVar2.b(((i15 + 2) * i19) + 1 + i24, i22)) {
                                                bVar3.f(i20 + i24, i23);
                                            }
                                        }
                                    }
                                }
                            }
                            this.f300V = bVar3;
                            this.f301W = new S3.b(bVar3.f4505U, bVar3.f4506V);
                            return;
                        }
                        throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                    }
                }
                throw M3.d.a();
            }
        }
        throw M3.d.a();
    }

    public q0(ArrayList arrayList) {
        this.f299U = 18;
        this.f300V = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f301W = new long[(arrayList.size() * 2)];
        for (int i = 0; i < arrayList.size(); i++) {
            U1.d dVar = (U1.d) arrayList.get(i);
            int i8 = i * 2;
            long[] jArr = (long[]) this.f301W;
            jArr[i8] = dVar.f5395b;
            jArr[i8 + 1] = dVar.f5396c;
        }
        long[] jArr2 = (long[]) this.f301W;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f302X = copyOf;
        Arrays.sort(copyOf);
    }

    public q0(List list) {
        this.f299U = 23;
        this.f300V = list;
        this.f301W = new p1.G[list.size()];
        this.f302X = new t((s) new B(28, this));
    }

    public q0(String str) {
        this.f299U = 22;
        C0129q qVar = new C0129q();
        qVar.f2999m = I.o(str);
        this.f300V = new r(qVar);
    }

    public q0(l1.j jVar) {
        this.f299U = 10;
        this.f301W = new Object();
        this.f300V = new ArrayDeque(3);
        this.f302X = jVar;
    }

    public q0(q qVar, M1.j jVar) {
        this.f299U = 12;
        this.f300V = qVar;
        this.f301W = jVar;
        this.f302X = new SparseArray();
    }

    public q0() {
        this.f299U = 29;
        c1.i iVar = c1.i.f8794U;
        this.f300V = new HashSet();
        this.f301W = iVar;
    }

    public q0(B3.q qVar, C0410a aVar, androidx.emoji2.text.c cVar, Set set) {
        this.f299U = 28;
        this.f300V = aVar;
        this.f301W = qVar;
        this.f302X = cVar;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                String str = new String(iArr, 0, iArr.length);
                w(str, 0, str.length(), 1, true, new G3.e(str, false));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: N0.d[]} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, N0.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q0(N0.d[] r6) {
        /*
            r5 = this;
            r0 = 19
            r5.f299U = r0
            V0.D r0 = new V0.D
            r0.<init>()
            N0.g r1 = new N0.g
            r1.<init>()
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.f3266c = r2
            r1.f3267d = r2
            N0.b r2 = N0.b.e
            r1.e = r2
            r1.f3268f = r2
            r1.f3269g = r2
            r1.f3270h = r2
            java.nio.ByteBuffer r2 = N0.d.f3237a
            r1.f3272k = r2
            java.nio.ShortBuffer r3 = r2.asShortBuffer()
            r1.f3273l = r3
            r1.f3274m = r2
            r2 = -1
            r1.f3265b = r2
            r5.<init>()
            int r2 = r6.length
            int r2 = r2 + 2
            N0.d[] r2 = new N0.d[r2]
            r5.f300V = r2
            r3 = 0
            int r4 = r6.length
            java.lang.System.arraycopy(r6, r3, r2, r3, r4)
            r5.f301W = r0
            r5.f302X = r1
            int r3 = r6.length
            r2[r3] = r0
            int r6 = r6.length
            int r6 = r6 + 1
            r2[r6] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B.q0.<init>(N0.d[]):void");
    }

    public q0(W2.j jVar, ArrayList arrayList, E2.g gVar) {
        this.f299U = 8;
        W2.f.c(gVar, "Argument must not be null");
        this.f301W = gVar;
        W2.f.c(arrayList, "Argument must not be null");
        this.f302X = arrayList;
        this.f300V = new com.bumptech.glide.load.data.h(jVar, gVar);
    }

    public q0(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, E2.g gVar) {
        this.f299U = 9;
        W2.f.c(gVar, "Argument must not be null");
        this.f300V = gVar;
        W2.f.c(arrayList, "Argument must not be null");
        this.f301W = arrayList;
        this.f302X = new com.bumptech.glide.load.data.h(parcelFileDescriptor);
    }

    public q0(D2.q qVar, S2.f fVar, u uVar) {
        this.f299U = 4;
        this.f302X = qVar;
        this.f301W = fVar;
        this.f300V = uVar;
    }

    public q0(AudioTrack audioTrack, m mVar) {
        this.f299U = 20;
        this.f300V = audioTrack;
        this.f301W = mVar;
        this.f302X = new V0.u(this);
        audioTrack.addOnRoutingChangedListener((V0.u) this.f302X, new Handler(Looper.myLooper()));
    }

    public q0(y yVar) {
        this.f299U = 21;
        this.f302X = yVar;
        this.f300V = new Handler(Looper.myLooper());
        this.f301W = new x(this);
    }
}
