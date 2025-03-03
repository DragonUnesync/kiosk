package N5;

import H3.P;
import K1.i;
import P6.f;
import Q0.g;
import android.view.View;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.o0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.altbeacon.bluetooth.Pdu;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3368a;

    /* renamed from: b  reason: collision with root package name */
    public int f3369b;

    /* renamed from: c  reason: collision with root package name */
    public int f3370c;

    /* renamed from: d  reason: collision with root package name */
    public int f3371d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public Object f3372f;

    /* renamed from: g  reason: collision with root package name */
    public Object f3373g;

    public c() {
        this.f3368a = 0;
        this.f3372f = null;
        this.f3373g = null;
        this.f3369b = 0;
        this.f3370c = 0;
        this.f3371d = 0;
        this.e = 0;
    }

    public void a() {
        View view = (View) g.l(1, (ArrayList) this.f3372f);
        this.f3370c = ((StaggeredGridLayoutManager) this.f3373g).f8334l0.b(view);
        ((o0) view.getLayoutParams()).getClass();
    }

    public void b() {
        ((ArrayList) this.f3372f).clear();
        this.f3369b = RecyclerView.UNDEFINED_DURATION;
        this.f3370c = RecyclerView.UNDEFINED_DURATION;
        this.f3371d = 0;
    }

    public boolean c(int i) {
        byte[] bArr = (byte[]) this.f3373g;
        int i8 = this.f3370c;
        int i9 = this.e;
        long j7 = 0;
        for (int i10 = 0; i10 < i8 * i9; i10++) {
            j7 += (long) (bArr[i10] & Pdu.MANUFACTURER_DATA_PDU_TYPE);
        }
        if ((j7 / ((long) i8)) / ((long) i9) <= (((long) i) * 256) / 100) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r4 > ((long) ((((100 - r11) * r2) * r1) / 100))) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f3373g
            byte[] r0 = (byte[]) r0
            int r1 = r10.f3370c
            int r2 = r10.e
            r3 = 0
            if (r0 == 0) goto L_0x0052
            java.lang.Object r4 = r10.f3372f
            byte[] r4 = (byte[]) r4
            if (r4 != 0) goto L_0x0012
            goto L_0x0052
        L_0x0012:
            int r5 = r0.length
            int r4 = r4.length
            r6 = 1
            if (r5 == r4) goto L_0x0019
        L_0x0017:
            r3 = 1
            goto L_0x0052
        L_0x0019:
            int r4 = r10.f3369b
            if (r4 != r1) goto L_0x0017
            int r4 = r10.f3371d
            if (r4 == r2) goto L_0x0022
            goto L_0x0017
        L_0x0022:
            r4 = 0
            r7 = 0
        L_0x0025:
            int r8 = r1 * r2
            if (r7 >= r8) goto L_0x0044
            byte r8 = r0[r7]
            java.lang.Object r9 = r10.f3372f
            byte[] r9 = (byte[]) r9
            byte r9 = r9[r7]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r8 = r8 - r9
            if (r8 > 0) goto L_0x003a
            int r8 = 0 - r8
        L_0x003a:
            r9 = 25
            if (r8 < r9) goto L_0x0041
            r8 = 1
            long r4 = r4 + r8
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x0025
        L_0x0044:
            int r11 = 100 - r11
            int r11 = r11 * r2
            int r11 = r11 * r1
            int r11 = r11 / 100
            long r0 = (long) r11
            int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x0052
            goto L_0x0017
        L_0x0052:
            java.lang.Object r11 = r10.f3373g
            byte[] r11 = (byte[]) r11
            r10.f3372f = r11
            int r11 = r10.f3370c
            r10.f3369b = r11
            int r11 = r10.e
            r10.f3371d = r11
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.c.d(int):boolean");
    }

    public int e() {
        boolean z = ((StaggeredGridLayoutManager) this.f3373g).f8338q0;
        ArrayList arrayList = (ArrayList) this.f3372f;
        if (z) {
            return g(arrayList.size() - 1, -1);
        }
        return g(0, arrayList.size());
    }

    public int f() {
        boolean z = ((StaggeredGridLayoutManager) this.f3373g).f8338q0;
        ArrayList arrayList = (ArrayList) this.f3372f;
        if (z) {
            return g(0, arrayList.size());
        }
        return g(arrayList.size() - 1, -1);
    }

    public int g(int i, int i8) {
        int i9;
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f3373g;
        int k8 = staggeredGridLayoutManager.f8334l0.k();
        int g8 = staggeredGridLayoutManager.f8334l0.g();
        if (i8 > i) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        while (i != i8) {
            View view = (View) ((ArrayList) this.f3372f).get(i);
            int e8 = staggeredGridLayoutManager.f8334l0.e(view);
            int b8 = staggeredGridLayoutManager.f8334l0.b(view);
            boolean z6 = false;
            if (e8 <= g8) {
                z = true;
            } else {
                z = false;
            }
            if (b8 >= k8) {
                z6 = true;
            }
            if (z && z6 && (e8 < k8 || b8 > g8)) {
                return Q.S(view);
            }
            i += i9;
        }
        return -1;
    }

    public Object h(Object obj) {
        f.e(obj, "key");
        synchronized (((i) this.f3373g)) {
            P p3 = (P) this.f3372f;
            p3.getClass();
            Object obj2 = ((LinkedHashMap) p3.f2027U).get(obj);
            if (obj2 != null) {
                this.f3371d++;
                return obj2;
            }
            this.e++;
            return null;
        }
    }

    public int i(int i) {
        int i8 = this.f3370c;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (((ArrayList) this.f3372f).size() == 0) {
            return i;
        }
        a();
        return this.f3370c;
    }

    public View j(int i, int i8) {
        ArrayList arrayList = (ArrayList) this.f3372f;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f3373g;
        View view = null;
        if (i8 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f8338q0 && Q.S(view2) >= i) || ((!staggeredGridLayoutManager.f8338q0 && Q.S(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i9 = 0;
            while (i9 < size2) {
                View view3 = (View) arrayList.get(i9);
                if ((staggeredGridLayoutManager.f8338q0 && Q.S(view3) <= i) || ((!staggeredGridLayoutManager.f8338q0 && Q.S(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i9++;
                view = view3;
            }
        }
        return view;
    }

    public int k(int i) {
        int i8 = this.f3369b;
        if (i8 != Integer.MIN_VALUE) {
            return i8;
        }
        if (((ArrayList) this.f3372f).size() == 0) {
            return i;
        }
        View view = (View) ((ArrayList) this.f3372f).get(0);
        this.f3369b = ((StaggeredGridLayoutManager) this.f3373g).f8334l0.e(view);
        ((o0) view.getLayoutParams()).getClass();
        return this.f3369b;
    }

    public Object l(Object obj, Object obj2) {
        Object put;
        f.e(obj, "key");
        synchronized (((i) this.f3373g)) {
            this.f3370c++;
            P p3 = (P) this.f3372f;
            p3.getClass();
            put = ((LinkedHashMap) p3.f2027U).put(obj, obj2);
            if (put != null) {
                this.f3370c--;
            }
        }
        o(this.f3369b);
        return put;
    }

    public void m(ByteBuffer byteBuffer, int i, int i8) {
        byteBuffer.getClass();
        int i9 = i * i8;
        byte[] bArr = new byte[i9];
        byteBuffer.get(bArr);
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = (bArr[i10] & Pdu.MANUFACTURER_DATA_PDU_TYPE) - 16;
            if (i11 < 0) {
                i11 = 0;
            }
            bArr[i10] = (byte) i11;
        }
        this.f3373g = bArr;
        this.f3370c = i;
        this.e = i8;
    }

    public void n(byte[] bArr, int i, int i8) {
        bArr.getClass();
        int i9 = i * i8;
        byte[] bArr2 = new byte[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            int i11 = (bArr[i10] & Pdu.MANUFACTURER_DATA_PDU_TYPE) - 16;
            if (i11 < 0) {
                i11 = 0;
            }
            bArr2[i10] = (byte) i11;
        }
        this.f3373g = bArr2;
        this.f3370c = i;
        this.e = i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009e, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(int r6) {
        /*
            r5 = this;
        L_0x0000:
            java.lang.Object r0 = r5.f3373g
            K1.i r0 = (K1.i) r0
            monitor-enter(r0)
            int r1 = r5.f3370c     // Catch:{ all -> 0x001c }
            if (r1 < 0) goto L_0x0097
            java.lang.Object r1 = r5.f3372f     // Catch:{ all -> 0x001c }
            H3.P r1 = (H3.P) r1     // Catch:{ all -> 0x001c }
            java.lang.Object r1 = r1.f2027U     // Catch:{ all -> 0x001c }
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch:{ all -> 0x001c }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x001f
            int r1 = r5.f3370c     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0097
            goto L_0x001f
        L_0x001c:
            r6 = move-exception
            goto L_0x009f
        L_0x001f:
            int r1 = r5.f3370c     // Catch:{ all -> 0x001c }
            if (r1 <= r6) goto L_0x0095
            java.lang.Object r1 = r5.f3372f     // Catch:{ all -> 0x001c }
            H3.P r1 = (H3.P) r1     // Catch:{ all -> 0x001c }
            java.lang.Object r1 = r1.f2027U     // Catch:{ all -> 0x001c }
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch:{ all -> 0x001c }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0032
            goto L_0x0095
        L_0x0032:
            java.lang.Object r1 = r5.f3372f     // Catch:{ all -> 0x001c }
            H3.P r1 = (H3.P) r1     // Catch:{ all -> 0x001c }
            java.lang.Object r1 = r1.f2027U     // Catch:{ all -> 0x001c }
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch:{ all -> 0x001c }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x001c }
            java.lang.String r2 = "map.entries"
            P6.f.d(r1, r2)     // Catch:{ all -> 0x001c }
            boolean r2 = r1 instanceof java.util.List     // Catch:{ all -> 0x001c }
            r3 = 0
            if (r2 == 0) goto L_0x0057
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x001c }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x0051
            goto L_0x0066
        L_0x0051:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch:{ all -> 0x001c }
            goto L_0x0066
        L_0x0057:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x001c }
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x001c }
            if (r2 != 0) goto L_0x0062
            goto L_0x0066
        L_0x0062:
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x001c }
        L_0x0066:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x001c }
            if (r3 != 0) goto L_0x006c
            monitor-exit(r0)
            return
        L_0x006c:
            java.lang.Object r1 = r3.getKey()     // Catch:{ all -> 0x001c }
            java.lang.Object r2 = r3.getValue()     // Catch:{ all -> 0x001c }
            java.lang.Object r3 = r5.f3372f     // Catch:{ all -> 0x001c }
            H3.P r3 = (H3.P) r3     // Catch:{ all -> 0x001c }
            r3.getClass()     // Catch:{ all -> 0x001c }
            java.lang.String r4 = "key"
            P6.f.e(r1, r4)     // Catch:{ all -> 0x001c }
            java.lang.Object r3 = r3.f2027U     // Catch:{ all -> 0x001c }
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch:{ all -> 0x001c }
            r3.remove(r1)     // Catch:{ all -> 0x001c }
            int r1 = r5.f3370c     // Catch:{ all -> 0x001c }
            java.lang.String r3 = "value"
            P6.f.e(r2, r3)     // Catch:{ all -> 0x001c }
            int r1 = r1 + -1
            r5.f3370c = r1     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            goto L_0x0000
        L_0x0095:
            monitor-exit(r0)
            return
        L_0x0097:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001c }
            r1.<init>(r6)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x009f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: N5.c.o(int):void");
    }

    public String toString() {
        int i;
        String str;
        switch (this.f3368a) {
            case 1:
                synchronized (((i) this.f3373g)) {
                    try {
                        int i8 = this.f3371d;
                        int i9 = this.e + i8;
                        if (i9 != 0) {
                            i = (i8 * 100) / i9;
                        } else {
                            i = 0;
                        }
                        str = "LruCache[maxSize=" + this.f3369b + ",hits=" + this.f3371d + ",misses=" + this.e + ",hitRate=" + i + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public c(int i) {
        this.f3368a = 1;
        this.f3369b = i;
        if (i > 0) {
            this.f3372f = new P(25);
            this.f3373g = new i(24);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public c(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f3368a = 2;
        this.f3373g = staggeredGridLayoutManager;
        this.f3372f = new ArrayList();
        this.f3369b = RecyclerView.UNDEFINED_DURATION;
        this.f3370c = RecyclerView.UNDEFINED_DURATION;
        this.f3371d = 0;
        this.e = i;
    }
}
