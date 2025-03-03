package b6;

/* renamed from: b6.A  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0533A {
    static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$Protocol;
    static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior;
    static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior;
    static final /* synthetic */ int[] $SwitchMap$io$netty$handler$ssl$ClientAuth;

    /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|19|20|21|22|23|25|26|27|28|(3:29|30|32)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|19|20|21|22|23|25|26|27|28|29|30|32) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
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
            b6.b[] r3 = b6.C0537b.values()
            int r3 = r3.length
            int[] r3 = new int[r3]
            $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior = r3
            b6.b r4 = b6.C0537b.ACCEPT     // Catch:{ NoSuchFieldError -> 0x0039 }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
            r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
        L_0x0039:
            int[] r3 = $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectedListenerFailureBehavior     // Catch:{ NoSuchFieldError -> 0x0043 }
            b6.b r4 = b6.C0537b.FATAL_ALERT     // Catch:{ NoSuchFieldError -> 0x0043 }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
            r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
        L_0x0043:
            b6.c[] r3 = b6.C0540c.values()
            int r3 = r3.length
            int[] r3 = new int[r3]
            $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior = r3
            b6.c r4 = b6.C0540c.FATAL_ALERT     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            int[] r3 = $SwitchMap$io$netty$handler$ssl$ApplicationProtocolConfig$SelectorFailureBehavior     // Catch:{ NoSuchFieldError -> 0x005e }
            b6.c r4 = b6.C0540c.NO_ADVERTISE     // Catch:{ NoSuchFieldError -> 0x005e }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
            r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
        L_0x005e:
            b6.j[] r3 = b6.C0561j.values()
            int r3 = r3.length
            int[] r3 = new int[r3]
            $SwitchMap$io$netty$handler$ssl$ClientAuth = r3
            b6.j r4 = b6.C0561j.OPTIONAL     // Catch:{ NoSuchFieldError -> 0x006f }
            int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
            r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006f }
        L_0x006f:
            int[] r1 = $SwitchMap$io$netty$handler$ssl$ClientAuth     // Catch:{ NoSuchFieldError -> 0x0079 }
            b6.j r3 = b6.C0561j.REQUIRE     // Catch:{ NoSuchFieldError -> 0x0079 }
            int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
            r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0079 }
        L_0x0079:
            int[] r0 = $SwitchMap$io$netty$handler$ssl$ClientAuth     // Catch:{ NoSuchFieldError -> 0x0083 }
            b6.j r1 = b6.C0561j.NONE     // Catch:{ NoSuchFieldError -> 0x0083 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C0533A.<clinit>():void");
    }
}
