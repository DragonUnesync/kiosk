package b6;

public abstract /* synthetic */ class I0 {
    static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol;
    static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ClientAuth;
    static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState;

    /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
    static {
        /*
            b6.a[] r0 = b6.C0534a.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol = r0
            r1 = 1
            b6.a r2 = b6.C0534a.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            r0 = 2
            int[] r2 = $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch:{ NoSuchFieldError -> 0x001d }
            b6.a r3 = b6.C0534a.ALPN     // Catch:{ NoSuchFieldError -> 0x001d }
            int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            r2 = 3
            int[] r3 = $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch:{ NoSuchFieldError -> 0x0028 }
            b6.a r4 = b6.C0534a.NPN     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            r3 = 4
            int[] r4 = $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol     // Catch:{ NoSuchFieldError -> 0x0033 }
            b6.a r5 = b6.C0534a.NPN_AND_ALPN     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            b6.j[] r4 = b6.C0561j.values()
            int r4 = r4.length
            int[] r4 = new int[r4]
            $SwitchMap$io$netty$handler$ssl$ClientAuth = r4
            b6.j r5 = b6.C0561j.NONE     // Catch:{ NoSuchFieldError -> 0x0044 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
            r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
        L_0x0044:
            int[] r4 = $SwitchMap$io$netty$handler$ssl$ClientAuth     // Catch:{ NoSuchFieldError -> 0x004e }
            b6.j r5 = b6.C0561j.REQUIRE     // Catch:{ NoSuchFieldError -> 0x004e }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
            r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
        L_0x004e:
            int[] r4 = $SwitchMap$io$netty$handler$ssl$ClientAuth     // Catch:{ NoSuchFieldError -> 0x0058 }
            b6.j r5 = b6.C0561j.OPTIONAL     // Catch:{ NoSuchFieldError -> 0x0058 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
            r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
        L_0x0058:
            b6.L0[] r4 = b6.L0.values()
            int r4 = r4.length
            int[] r4 = new int[r4]
            $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState = r4
            b6.L0 r5 = b6.L0.NOT_STARTED     // Catch:{ NoSuchFieldError -> 0x0069 }
            int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
            r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
        L_0x0069:
            int[] r1 = $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState     // Catch:{ NoSuchFieldError -> 0x0073 }
            b6.L0 r4 = b6.L0.FINISHED     // Catch:{ NoSuchFieldError -> 0x0073 }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
            r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0073 }
        L_0x0073:
            int[] r0 = $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState     // Catch:{ NoSuchFieldError -> 0x007d }
            b6.L0 r1 = b6.L0.STARTED_IMPLICITLY     // Catch:{ NoSuchFieldError -> 0x007d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
        L_0x007d:
            int[] r0 = $SwitchMap$io$netty$handler$ssl$ReferenceCountedOpenSslEngine$HandshakeState     // Catch:{ NoSuchFieldError -> 0x0087 }
            b6.L0 r1 = b6.L0.STARTED_EXPLICITLY     // Catch:{ NoSuchFieldError -> 0x0087 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
            r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.I0.<clinit>():void");
    }
}
