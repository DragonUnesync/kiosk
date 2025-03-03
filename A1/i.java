package a1;

import M0.C0126n;

public abstract class i implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public final String f7064U;

    /* renamed from: V  reason: collision with root package name */
    public final h f7065V;

    /* renamed from: W  reason: collision with root package name */
    public final long f7066W;

    /* renamed from: X  reason: collision with root package name */
    public final int f7067X;

    /* renamed from: Y  reason: collision with root package name */
    public final long f7068Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C0126n f7069Z;

    /* renamed from: a0  reason: collision with root package name */
    public final String f7070a0;

    /* renamed from: b0  reason: collision with root package name */
    public final String f7071b0;

    /* renamed from: c0  reason: collision with root package name */
    public final long f7072c0;

    /* renamed from: d0  reason: collision with root package name */
    public final long f7073d0;

    /* renamed from: e0  reason: collision with root package name */
    public final boolean f7074e0;

    public i(String str, h hVar, long j7, int i, long j8, C0126n nVar, String str2, String str3, long j9, long j10, boolean z) {
        this.f7064U = str;
        this.f7065V = hVar;
        this.f7066W = j7;
        this.f7067X = i;
        this.f7068Y = j8;
        this.f7069Z = nVar;
        this.f7070a0 = str2;
        this.f7071b0 = str3;
        this.f7072c0 = j9;
        this.f7073d0 = j10;
        this.f7074e0 = z;
    }

    public final int compareTo(Object obj) {
        Long l8 = (Long) obj;
        long longValue = l8.longValue();
        long j7 = this.f7068Y;
        if (j7 > longValue) {
            return 1;
        }
        if (j7 < l8.longValue()) {
            return -1;
        }
        return 0;
    }
}
