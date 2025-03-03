package f7;

import b7.C0595a;
import java.util.List;

public final class m extends C0595a {
    public final /* synthetic */ int e = 1;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f11733f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f11734g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list) {
        super(str, true);
        this.f11733f = oVar;
        this.f11734g = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long b() {
        /*
            r3 = this;
            f7.o r0 = r3.f11733f
            f7.z r0 = r0.f11748e0
            r0.getClass()
            f7.o r0 = r3.f11733f     // Catch:{ IOException -> 0x0027 }
            f7.x r0 = r0.f11759q0     // Catch:{ IOException -> 0x0027 }
            int r1 = r3.f11734g     // Catch:{ IOException -> 0x0027 }
            r2 = 9
            r0.q(r1, r2)     // Catch:{ IOException -> 0x0027 }
            f7.o r0 = r3.f11733f     // Catch:{ IOException -> 0x0027 }
            monitor-enter(r0)     // Catch:{ IOException -> 0x0027 }
            f7.o r1 = r3.f11733f     // Catch:{ all -> 0x0024 }
            java.util.LinkedHashSet r1 = r1.f11761s0     // Catch:{ all -> 0x0024 }
            int r2 = r3.f11734g     // Catch:{ all -> 0x0024 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0024 }
            r1.remove(r2)     // Catch:{ all -> 0x0024 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x0027 }
            goto L_0x0027
        L_0x0024:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x0027 }
            throw r1     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.m.b():long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return -1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a() {
        /*
            r3 = this;
            int r0 = r3.e
            switch(r0) {
                case 0: goto L_0x002f;
                default: goto L_0x0005;
            }
        L_0x0005:
            f7.o r0 = r3.f11733f
            f7.z r0 = r0.f11748e0
            r0.getClass()
            f7.o r0 = r3.f11733f     // Catch:{ IOException -> 0x002c }
            f7.x r0 = r0.f11759q0     // Catch:{ IOException -> 0x002c }
            int r1 = r3.f11734g     // Catch:{ IOException -> 0x002c }
            r2 = 9
            r0.q(r1, r2)     // Catch:{ IOException -> 0x002c }
            f7.o r0 = r3.f11733f     // Catch:{ IOException -> 0x002c }
            monitor-enter(r0)     // Catch:{ IOException -> 0x002c }
            f7.o r1 = r3.f11733f     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashSet r1 = r1.f11761s0     // Catch:{ all -> 0x0029 }
            int r2 = r3.f11734g     // Catch:{ all -> 0x0029 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0029 }
            r1.remove(r2)     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ IOException -> 0x002c }
            goto L_0x002c
        L_0x0029:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ IOException -> 0x002c }
            throw r1     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r0 = -1
            return r0
        L_0x002f:
            long r0 = r3.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.m.a():long");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(String str, o oVar, int i, List list, boolean z) {
        super(str, true);
        this.f11733f = oVar;
        this.f11734g = i;
    }
}
