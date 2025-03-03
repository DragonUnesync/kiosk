package de.ozerov.fully;

import V0.r;

/* renamed from: de.ozerov.fully.q4  reason: case insensitive filesystem */
public final /* synthetic */ class C0763q4 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ r f10902U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ String f10903V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ String f10904W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ String f10905X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10906Y;

    public /* synthetic */ C0763q4(r rVar, String str, String str2, String str3, int i) {
        this.f10902U = rVar;
        this.f10903V = str;
        this.f10904W = str2;
        this.f10905X = str3;
        this.f10906Y = i;
    }

    public final void run() {
        this.f10902U.f(this.f10903V, this.f10906Y, this.f10904W, this.f10905X);
    }
}
