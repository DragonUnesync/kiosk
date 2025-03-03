package T0;

import P0.l;
import P0.z;
import java.util.HashMap;
import l1.e;

/* renamed from: T0.j  reason: case insensitive filesystem */
public final class C0218j {

    /* renamed from: a  reason: collision with root package name */
    public final e f4855a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4856b;

    /* renamed from: c  reason: collision with root package name */
    public final long f4857c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4858d = z.O((long) 2500);
    public final long e = z.O((long) 5000);

    /* renamed from: f  reason: collision with root package name */
    public final int f4859f = -1;

    /* renamed from: g  reason: collision with root package name */
    public final long f4860g = z.O((long) 0);

    /* renamed from: h  reason: collision with root package name */
    public final HashMap f4861h = new HashMap();
    public long i = -1;

    public C0218j() {
        e eVar = new e();
        a("bufferForPlaybackMs", 2500, "0", 0);
        a("bufferForPlaybackAfterRebufferMs", 5000, "0", 0);
        a("minBufferMs", 50000, "bufferForPlaybackMs", 2500);
        a("minBufferMs", 50000, "bufferForPlaybackAfterRebufferMs", 5000);
        a("maxBufferMs", 50000, "minBufferMs", 50000);
        a("backBufferDurationMs", 0, "0", 0);
        this.f4855a = eVar;
        long j7 = (long) 50000;
        this.f4856b = z.O(j7);
        this.f4857c = z.O(j7);
    }

    public static void a(String str, int i8, String str2, int i9) {
        boolean z;
        if (i8 >= i9) {
            z = true;
        } else {
            z = false;
        }
        l.c(str + " cannot be less than " + str2, z);
    }

    public final int b() {
        int i8 = 0;
        for (C0217i iVar : this.f4861h.values()) {
            i8 += iVar.f4854b;
        }
        return i8;
    }

    public final boolean c(G g8) {
        int i8;
        boolean z;
        C0217i iVar = (C0217i) this.f4861h.get(g8.f4669a);
        iVar.getClass();
        e eVar = this.f4855a;
        synchronized (eVar) {
            i8 = eVar.f13107d * eVar.f13105b;
        }
        if (i8 >= b()) {
            z = true;
        } else {
            z = false;
        }
        long j7 = this.f4857c;
        long j8 = this.f4856b;
        float f8 = g8.f4671c;
        if (f8 > 1.0f) {
            j8 = Math.min(z.x(j8, f8), j7);
        }
        long max = Math.max(j8, 500000);
        long j9 = g8.f4670b;
        if (j9 < max) {
            iVar.f4853a = !z;
            if (z && j9 < 500000) {
                l.B("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j9 >= j7 || z) {
            iVar.f4853a = false;
        }
        return iVar.f4853a;
    }

    public final void d() {
        if (this.f4861h.isEmpty()) {
            e eVar = this.f4855a;
            synchronized (eVar) {
                if (eVar.f13104a) {
                    eVar.a(0);
                }
            }
            return;
        }
        this.f4855a.a(b());
    }
}
