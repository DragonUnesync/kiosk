package P4;

import k5.a;
import w5.C1592b;

public final class b implements C1592b {

    /* renamed from: j  reason: collision with root package name */
    public static final b f3787j = new b(65535, 268435460, 0, C1592b.f16222a, true, true, true, true);

    /* renamed from: b  reason: collision with root package name */
    public final int f3788b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3789c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3790d;
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3791f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3792g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3793h;
    public final boolean i;

    public b(int i8, int i9, int i10, a aVar, boolean z, boolean z6, boolean z8, boolean z9) {
        this.f3788b = i8;
        this.f3789c = i9;
        this.f3790d = i10;
        this.e = aVar;
        this.f3791f = z;
        this.f3792g = z6;
        this.f3793h = z8;
        this.i = z9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (P4.b) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof P4.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            P4.b r5 = (P4.b) r5
            int r1 = r5.f3788b
            int r3 = r4.f3788b
            if (r3 != r1) goto L_0x003d
            int r1 = r4.f3789c
            int r3 = r5.f3789c
            if (r1 != r3) goto L_0x003d
            int r1 = r4.f3790d
            int r3 = r5.f3790d
            if (r1 != r3) goto L_0x003d
            k5.a r1 = r4.e
            k5.a r3 = r5.e
            if (r1 != r3) goto L_0x003d
            boolean r1 = r4.f3791f
            boolean r3 = r5.f3791f
            if (r1 != r3) goto L_0x003d
            boolean r1 = r4.f3792g
            boolean r3 = r5.f3792g
            if (r1 != r3) goto L_0x003d
            boolean r1 = r4.f3793h
            boolean r3 = r5.f3793h
            if (r1 != r3) goto L_0x003d
            boolean r1 = r4.i
            boolean r5 = r5.i
            if (r1 != r5) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P4.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i8;
        int i9;
        int i10;
        int hashCode = (this.e.hashCode() + (((((this.f3788b * 31) + this.f3789c) * 31) + this.f3790d) * 31)) * 31;
        int i11 = 1237;
        if (this.f3791f) {
            i8 = 1231;
        } else {
            i8 = 1237;
        }
        int i12 = (hashCode + i8) * 31;
        if (this.f3792g) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i13 = (i12 + i9) * 31;
        if (this.f3793h) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (i13 + i10) * 31;
        if (this.i) {
            i11 = 1231;
        }
        return i14 + i11;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MqttConnAckRestrictions{");
        sb.append("receiveMaximum=" + this.f3788b + ", maximumPacketSize=" + this.f3789c + ", topicAliasMaximum=" + this.f3790d + ", maximumQos=" + this.e + ", retainAvailable=" + this.f3791f + ", wildcardSubscriptionAvailable=" + this.f3792g + ", sharedSubscriptionAvailable=" + this.f3793h + ", subscriptionIdentifiersAvailable=" + this.i);
        sb.append('}');
        return sb.toString();
    }
}
