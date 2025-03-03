package de.ozerov.fully;

import N.e;
import Q0.g;

/* renamed from: de.ozerov.fully.q0  reason: case insensitive filesystem */
public final class C0759q0 {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f10890g = {"_id", "time", "type", "tag", "message", "version"};

    /* renamed from: a  reason: collision with root package name */
    public long f10891a;

    /* renamed from: b  reason: collision with root package name */
    public String f10892b;

    /* renamed from: c  reason: collision with root package name */
    public long f10893c;

    /* renamed from: d  reason: collision with root package name */
    public String f10894d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public long f10895f;

    public static String a() {
        String[] strArr = f10890g;
        String str = "";
        for (int i = 0; i < 6; i++) {
            String str2 = strArr[i];
            if (!str2.equals("_id")) {
                str = str + str2 + ";";
            }
        }
        return str.substring(0, str.length() - 1) + "\n";
    }

    public final String b() {
        StringBuilder r8 = g.r(e.A(e.B(e.A(g.r(g.o(g.r(e.A(new StringBuilder(""), this.f10892b, ";")), this.f10893c, ";")), this.f10894d, ";"), "\""), this.e, "\";"));
        r8.append(this.f10895f);
        return e.x(r8.toString(), "\n");
    }
}
