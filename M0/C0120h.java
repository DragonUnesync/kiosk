package M0;

/* renamed from: M0.h  reason: case insensitive filesystem */
public final class C0120h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2947a;

    /* renamed from: b  reason: collision with root package name */
    public int f2948b;

    /* renamed from: c  reason: collision with root package name */
    public int f2949c;

    /* renamed from: d  reason: collision with root package name */
    public int f2950d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f2951f;

    public C0120h(int i, int i8, int i9, int i10, int i11, byte b8) {
        this.f2947a = i11;
        switch (i11) {
            case 4:
                this.f2951f = -1;
                this.f2948b = i;
                this.f2949c = i8;
                this.f2950d = i9;
                this.e = i10;
                return;
            default:
                this.f2948b = i;
                this.f2949c = i10;
                this.f2950d = i8;
                this.e = i9;
                this.f2951f = i8 + i9;
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static M0.C0120h c(java.lang.String r10) {
        /*
            r0 = 1
            java.lang.String r1 = "Format:"
            boolean r1 = r10.startsWith(r1)
            P0.l.d(r1)
            r1 = 7
            java.lang.String r10 = r10.substring(r1)
            java.lang.String r1 = ","
            java.lang.String[] r10 = android.text.TextUtils.split(r10, r1)
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = -1
            r6 = -1
            r7 = -1
            r8 = -1
        L_0x001c:
            int r4 = r10.length
            if (r3 >= r4) goto L_0x006d
            r4 = r10[r3]
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = F.h.E(r4)
            r4.getClass()
            int r9 = r4.hashCode()
            switch(r9) {
                case 100571: goto L_0x0056;
                case 3556653: goto L_0x004b;
                case 109757538: goto L_0x0040;
                case 109780401: goto L_0x0035;
                default: goto L_0x0033;
            }
        L_0x0033:
            r4 = -1
            goto L_0x0060
        L_0x0035:
            java.lang.String r9 = "style"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x003e
            goto L_0x0033
        L_0x003e:
            r4 = 3
            goto L_0x0060
        L_0x0040:
            java.lang.String r9 = "start"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0049
            goto L_0x0033
        L_0x0049:
            r4 = 2
            goto L_0x0060
        L_0x004b:
            java.lang.String r9 = "text"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x0054
            goto L_0x0033
        L_0x0054:
            r4 = 1
            goto L_0x0060
        L_0x0056:
            java.lang.String r9 = "end"
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x005f
            goto L_0x0033
        L_0x005f:
            r4 = 0
        L_0x0060:
            switch(r4) {
                case 0: goto L_0x006a;
                case 1: goto L_0x0068;
                case 2: goto L_0x0066;
                case 3: goto L_0x0064;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x006b
        L_0x0064:
            r7 = r3
            goto L_0x006b
        L_0x0066:
            r5 = r3
            goto L_0x006b
        L_0x0068:
            r8 = r3
            goto L_0x006b
        L_0x006a:
            r6 = r3
        L_0x006b:
            int r3 = r3 + r0
            goto L_0x001c
        L_0x006d:
            if (r5 == r1) goto L_0x007b
            if (r6 == r1) goto L_0x007b
            if (r8 == r1) goto L_0x007b
            M0.h r0 = new M0.h
            int r9 = r10.length
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.C0120h.c(java.lang.String):M0.h");
    }

    public boolean a() {
        int i;
        int i8;
        int i9;
        int i10 = this.f2948b;
        int i11 = 2;
        if ((i10 & 7) != 0) {
            int i12 = this.e;
            int i13 = this.f2949c;
            if (i12 > i13) {
                i9 = 1;
            } else if (i12 == i13) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            if ((i9 & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 112) != 0) {
            int i14 = this.e;
            int i15 = this.f2950d;
            if (i14 > i15) {
                i8 = 1;
            } else if (i14 == i15) {
                i8 = 2;
            } else {
                i8 = 4;
            }
            if (((i8 << 4) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 1792) != 0) {
            int i16 = this.f2951f;
            int i17 = this.f2949c;
            if (i16 > i17) {
                i = 1;
            } else if (i16 == i17) {
                i = 2;
            } else {
                i = 4;
            }
            if (((i << 8) & i10) == 0) {
                return false;
            }
        }
        if ((i10 & 28672) != 0) {
            int i18 = this.f2951f;
            int i19 = this.f2950d;
            if (i18 > i19) {
                i11 = 1;
            } else if (i18 != i19) {
                i11 = 4;
            }
            if ((i10 & (i11 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public C0121i b() {
        return new C0121i(this.f2948b, this.f2949c, this.f2950d, this.e, this.f2951f, (byte[]) null);
    }

    public boolean d(int i) {
        if (i == -1 || this.f2950d != (i % 3) * 3) {
            return false;
        }
        return true;
    }

    public void e(int i) {
        this.f2951f = i;
    }

    public void f(int i) {
        this.f2949c = i;
    }

    public void g(int i) {
        this.f2948b = i;
    }

    public void h(int i) {
        this.f2950d = i;
    }

    public void i(int i) {
        this.e = i;
    }

    public void j() {
        this.f2951f = (this.f2950d / 3) + ((this.e / 30) * 3);
    }

    public String toString() {
        switch (this.f2947a) {
            case 4:
                return this.f2951f + "|" + this.e;
            default:
                return super.toString();
        }
    }

    public C0120h(int i, int i8, int i9, int i10, int i11) {
        this.f2947a = 1;
        this.f2948b = i;
        this.f2949c = i8;
        this.f2950d = i9;
        this.e = i10;
        this.f2951f = i11;
    }

    public C0120h(int i) {
        this.f2947a = i;
        switch (i) {
            case 2:
                return;
            default:
                this.f2948b = -1;
                this.f2949c = -1;
                this.f2950d = -1;
                this.e = -1;
                this.f2951f = -1;
                return;
        }
    }
}
