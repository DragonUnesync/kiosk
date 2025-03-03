package O4;

public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final b f3653h = new b(65535, 65535, 268435460, 0, 16, true, false);

    /* renamed from: a  reason: collision with root package name */
    public final int f3654a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3655b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3656c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3657d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3658f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3659g;

    public b(int i, int i8, int i9, int i10, int i11, boolean z, boolean z6) {
        this.f3654a = i;
        this.f3655b = i8;
        this.f3656c = i9;
        this.f3657d = i10;
        this.e = i11;
        this.f3658f = z;
        this.f3659g = z6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (O4.b) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof O4.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            O4.b r5 = (O4.b) r5
            int r1 = r5.f3654a
            int r3 = r4.f3654a
            if (r3 != r1) goto L_0x0037
            int r1 = r4.f3655b
            int r3 = r5.f3655b
            if (r1 != r3) goto L_0x0037
            int r1 = r4.f3656c
            int r3 = r5.f3656c
            if (r1 != r3) goto L_0x0037
            int r1 = r4.f3657d
            int r3 = r5.f3657d
            if (r1 != r3) goto L_0x0037
            int r1 = r4.e
            int r3 = r5.e
            if (r1 != r3) goto L_0x0037
            boolean r1 = r4.f3658f
            boolean r3 = r5.f3658f
            if (r1 != r3) goto L_0x0037
            boolean r1 = r4.f3659g
            boolean r5 = r5.f3659g
            if (r1 != r5) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: O4.b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i;
        int i8 = ((((((((((this.f3654a * 31) + this.f3655b) * 31) + 268435460) * 31) + this.f3656c) * 31) + this.f3657d) * 31) + this.e) * 31;
        int i9 = 1237;
        if (this.f3658f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i10 = (i8 + i) * 31;
        if (this.f3659g) {
            i9 = 1231;
        }
        return i10 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MqttConnectRestrictions{");
        sb.append("receiveMaximum=" + this.f3654a + ", sendMaximum=" + this.f3655b + ", maximumPacketSize=268435460, sendMaximumPacketSize=" + this.f3656c + ", topicAliasMaximum=" + this.f3657d + ", sendTopicAliasMaximum=" + this.e + ", requestProblemInformation=" + this.f3658f + ", requestResponseInformation=" + this.f3659g);
        sb.append('}');
        return sb.toString();
    }
}
