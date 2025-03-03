package b7;

import C0.e;
import P6.f;
import Q0.g;
import Z1.c;
import Z6.a;
import Z6.b;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* renamed from: b7.d  reason: case insensitive filesystem */
public final class C0598d {

    /* renamed from: h  reason: collision with root package name */
    public static final C0598d f8695h;
    public static final Logger i;

    /* renamed from: a  reason: collision with root package name */
    public final c f8696a;

    /* renamed from: b  reason: collision with root package name */
    public int f8697b = 10000;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8698c;

    /* renamed from: d  reason: collision with root package name */
    public long f8699d;
    public final ArrayList e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f8700f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final e f8701g = new e(16, this);

    static {
        String str = b.f6986f + " TaskRunner";
        f.e(str, "name");
        f8695h = new C0598d(new c(new a(str, true)));
        Logger logger = Logger.getLogger(C0598d.class.getName());
        f.d(logger, "getLogger(TaskRunner::class.java.name)");
        i = logger;
    }

    public C0598d(c cVar) {
        this.f8696a = cVar;
    }

    public static final void a(C0598d dVar, C0595a aVar) {
        dVar.getClass();
        byte[] bArr = b.f6982a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f8685a);
        try {
            long a8 = aVar.a();
            synchronized (dVar) {
                dVar.b(aVar, a8);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (dVar) {
                dVar.b(aVar, -1);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(C0595a aVar, long j7) {
        byte[] bArr = b.f6982a;
        C0597c cVar = aVar.f8687c;
        f.b(cVar);
        if (cVar.f8693d == aVar) {
            boolean z = cVar.f8694f;
            cVar.f8694f = false;
            cVar.f8693d = null;
            this.e.remove(cVar);
            if (j7 != -1 && !z && !cVar.f8692c) {
                cVar.d(aVar, j7, true);
            }
            if (!cVar.e.isEmpty()) {
                this.f8700f.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c5 A[Catch:{ all -> 0x00bb }, LOOP:2: B:45:0x00c3->B:46:0x00c5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d8 A[Catch:{ all -> 0x00bb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b7.C0595a c() {
        /*
            r17 = this;
            r1 = r17
            byte[] r2 = Z6.b.f6982a
        L_0x0004:
            java.util.ArrayList r2 = r1.f8700f
            boolean r3 = r2.isEmpty()
            r4 = 0
            if (r3 == 0) goto L_0x000e
            return r4
        L_0x000e:
            Z1.c r3 = r1.f8696a
            long r5 = java.lang.System.nanoTime()
            java.util.Iterator r7 = r2.iterator()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = r4
        L_0x001e:
            boolean r11 = r7.hasNext()
            r12 = 1
            r13 = 0
            r15 = 0
            if (r11 == 0) goto L_0x0052
            java.lang.Object r11 = r7.next()
            b7.c r11 = (b7.C0597c) r11
            java.util.ArrayList r11 = r11.e
            java.lang.Object r11 = r11.get(r15)
            b7.a r11 = (b7.C0595a) r11
            long r0 = r11.f8688d
            long r0 = r0 - r5
            long r0 = java.lang.Math.max(r13, r0)
            int r16 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r16 <= 0) goto L_0x0048
            long r8 = java.lang.Math.min(r0, r8)
            r1 = r17
            goto L_0x001e
        L_0x0048:
            if (r10 == 0) goto L_0x004e
            r0 = 1
        L_0x004b:
            r1 = r17
            goto L_0x0054
        L_0x004e:
            r1 = r17
            r10 = r11
            goto L_0x001e
        L_0x0052:
            r0 = 0
            goto L_0x004b
        L_0x0054:
            java.util.ArrayList r7 = r1.e
            if (r10 == 0) goto L_0x008b
            byte[] r4 = Z6.b.f6982a
            r4 = -1
            r10.f8688d = r4
            b7.c r4 = r10.f8687c
            P6.f.b(r4)
            java.util.ArrayList r5 = r4.e
            r5.remove(r10)
            r2.remove(r4)
            r4.f8693d = r10
            r7.add(r4)
            if (r0 != 0) goto L_0x007c
            boolean r0 = r1.f8698c
            if (r0 != 0) goto L_0x008a
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x008a
        L_0x007c:
            java.lang.String r0 = "runnable"
            C0.e r2 = r1.f8701g
            P6.f.e(r2, r0)
            java.lang.Object r0 = r3.f6955V
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0
            r0.execute(r2)
        L_0x008a:
            return r10
        L_0x008b:
            boolean r0 = r1.f8698c
            if (r0 == 0) goto L_0x009a
            long r2 = r1.f8699d
            long r2 = r2 - r5
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0099
            r17.notify()
        L_0x0099:
            return r4
        L_0x009a:
            r1.f8698c = r12
            long r5 = r5 + r8
            r1.f8699d = r5
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r8 / r3
            java.lang.Long.signum(r5)
            long r3 = r3 * r5
            long r3 = r8 - r3
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 > 0) goto L_0x00b3
            int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
        L_0x00b3:
            int r0 = (int) r3
            r1.wait(r5, r0)     // Catch:{ InterruptedException -> 0x00bd }
        L_0x00b7:
            r1.f8698c = r15
            goto L_0x0004
        L_0x00bb:
            r0 = move-exception
            goto L_0x00ef
        L_0x00bd:
            int r0 = r7.size()     // Catch:{ all -> 0x00bb }
            int r0 = r0 - r12
            r3 = -1
        L_0x00c3:
            if (r3 >= r0) goto L_0x00d0
            java.lang.Object r4 = r7.get(r0)     // Catch:{ all -> 0x00bb }
            b7.c r4 = (b7.C0597c) r4     // Catch:{ all -> 0x00bb }
            r4.b()     // Catch:{ all -> 0x00bb }
            int r0 = r0 + r3
            goto L_0x00c3
        L_0x00d0:
            int r0 = r2.size()     // Catch:{ all -> 0x00bb }
            int r0 = r0 - r12
            r3 = -1
        L_0x00d6:
            if (r3 >= r0) goto L_0x00b7
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x00bb }
            b7.c r3 = (b7.C0597c) r3     // Catch:{ all -> 0x00bb }
            r3.b()     // Catch:{ all -> 0x00bb }
            java.util.ArrayList r3 = r3.e     // Catch:{ all -> 0x00bb }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x00ec
            r2.remove(r0)     // Catch:{ all -> 0x00bb }
        L_0x00ec:
            r3 = -1
            int r0 = r0 + r3
            goto L_0x00d6
        L_0x00ef:
            r1.f8698c = r15
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.C0598d.c():b7.a");
    }

    public final void d(C0597c cVar) {
        f.e(cVar, "taskQueue");
        byte[] bArr = b.f6982a;
        if (cVar.f8693d == null) {
            boolean isEmpty = cVar.e.isEmpty();
            ArrayList arrayList = this.f8700f;
            if (!isEmpty) {
                f.e(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                arrayList.remove(cVar);
            }
        }
        boolean z = this.f8698c;
        c cVar2 = this.f8696a;
        if (z) {
            notify();
            return;
        }
        e eVar = this.f8701g;
        f.e(eVar, "runnable");
        ((ThreadPoolExecutor) cVar2.f6955V).execute(eVar);
    }

    public final C0597c e() {
        int i8;
        synchronized (this) {
            i8 = this.f8697b;
            this.f8697b = i8 + 1;
        }
        return new C0597c(this, g.m(i8, "Q"));
    }
}
