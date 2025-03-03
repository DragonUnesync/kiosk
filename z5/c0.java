package Z5;

public abstract /* synthetic */ class c0 {
    static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State;

    /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
    static {
        /*
            Z5.f0[] r0 = Z5.f0.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State = r0
            Z5.f0 r1 = Z5.f0.SKIP_CONTROL_CHARS     // Catch:{ NoSuchFieldError -> 0x0012 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
        L_0x0012:
            int[] r0 = $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch:{ NoSuchFieldError -> 0x001d }
            Z5.f0 r1 = Z5.f0.READ_CHUNK_SIZE     // Catch:{ NoSuchFieldError -> 0x001d }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
        L_0x001d:
            int[] r0 = $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch:{ NoSuchFieldError -> 0x0028 }
            Z5.f0 r1 = Z5.f0.READ_INITIAL     // Catch:{ NoSuchFieldError -> 0x0028 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
        L_0x0028:
            int[] r0 = $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch:{ NoSuchFieldError -> 0x0033 }
            Z5.f0 r1 = Z5.f0.READ_HEADER     // Catch:{ NoSuchFieldError -> 0x0033 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
        L_0x0033:
            int[] r0 = $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch:{ NoSuchFieldError -> 0x003e }
            Z5.f0 r1 = Z5.f0.READ_VARIABLE_LENGTH_CONTENT     // Catch:{ NoSuchFieldError -> 0x003e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
        L_0x003e:
            int[] r0 = $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch:{ NoSuchFieldError -> 0x0049 }
            Z5.f0 r1 = Z5.f0.READ_FIXED_LENGTH_CONTENT     // Catch:{ NoSuchFieldError -> 0x0049 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
        L_0x0049:
            int[] r0 = $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch:{ NoSuchFieldError -> 0x0054 }
            Z5.f0 r1 = Z5.f0.READ_CHUNKED_CONTENT     // Catch:{ NoSuchFieldError -> 0x0054 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
        L_0x0054:
            int[] r0 = $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch:{ NoSuchFieldError -> 0x0060 }
            Z5.f0 r1 = Z5.f0.READ_CHUNK_DELIMITER     // Catch:{ NoSuchFieldError -> 0x0060 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
            r2 = 8
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
        L_0x0060:
            int[] r0 = $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch:{ NoSuchFieldError -> 0x006c }
            Z5.f0 r1 = Z5.f0.READ_CHUNK_FOOTER     // Catch:{ NoSuchFieldError -> 0x006c }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
            r2 = 9
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
        L_0x006c:
            int[] r0 = $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch:{ NoSuchFieldError -> 0x0078 }
            Z5.f0 r1 = Z5.f0.BAD_MESSAGE     // Catch:{ NoSuchFieldError -> 0x0078 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
            r2 = 10
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
        L_0x0078:
            int[] r0 = $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State     // Catch:{ NoSuchFieldError -> 0x0084 }
            Z5.f0 r1 = Z5.f0.UPGRADED     // Catch:{ NoSuchFieldError -> 0x0084 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
            r2 = 11
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
        L_0x0084:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z5.c0.<clinit>():void");
    }
}
