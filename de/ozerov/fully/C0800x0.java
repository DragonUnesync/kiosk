package de.ozerov.fully;

import N.e;
import Q0.g;
import android.content.ContentValues;
import android.database.Cursor;
import n2.a;

/* renamed from: de.ozerov.fully.x0  reason: case insensitive filesystem */
public final class C0800x0 {

    /* renamed from: q  reason: collision with root package name */
    public static final String[] f11052q = {"_id", "date", "pageViews", "pageErrors", "startUrlReloads", "screenOns", "screensaverStarts", "networkReconnects", "internetReconnects", "motionDetections", "appStarts", "appCrashes", "touches", "movementDetections", "playlistPlays", "itemPlays"};

    /* renamed from: a  reason: collision with root package name */
    public final long f11053a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11054b;

    /* renamed from: c  reason: collision with root package name */
    public long f11055c;

    /* renamed from: d  reason: collision with root package name */
    public long f11056d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public long f11057f;

    /* renamed from: g  reason: collision with root package name */
    public long f11058g;

    /* renamed from: h  reason: collision with root package name */
    public long f11059h;
    public long i;

    /* renamed from: j  reason: collision with root package name */
    public long f11060j;

    /* renamed from: k  reason: collision with root package name */
    public long f11061k;

    /* renamed from: l  reason: collision with root package name */
    public long f11062l;

    /* renamed from: m  reason: collision with root package name */
    public long f11063m;

    /* renamed from: n  reason: collision with root package name */
    public long f11064n;

    /* renamed from: o  reason: collision with root package name */
    public long f11065o;

    /* renamed from: p  reason: collision with root package name */
    public long f11066p;

    public C0800x0() {
        this.f11054b = a.H();
    }

    public static String b() {
        String[] strArr = f11052q;
        String str = "";
        for (int i8 = 0; i8 < 16; i8++) {
            String str2 = strArr[i8];
            if (!str2.equals("_id")) {
                str = str + str2 + ";";
            }
        }
        return str.substring(0, str.length() - 1) + "\n";
    }

    public final ContentValues a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("date", this.f11054b);
        contentValues.put("pageViews", Long.valueOf(this.f11055c));
        contentValues.put("pageErrors", Long.valueOf(this.f11056d));
        contentValues.put("startUrlReloads", Long.valueOf(this.e));
        contentValues.put("screenOns", Long.valueOf(this.f11057f));
        contentValues.put("screensaverStarts", Long.valueOf(this.f11058g));
        contentValues.put("networkReconnects", Long.valueOf(this.f11059h));
        contentValues.put("internetReconnects", Long.valueOf(this.i));
        contentValues.put("motionDetections", Long.valueOf(this.f11060j));
        contentValues.put("appStarts", Long.valueOf(this.f11061k));
        contentValues.put("appCrashes", Long.valueOf(this.f11062l));
        contentValues.put("touches", Long.valueOf(this.f11063m));
        contentValues.put("movementDetections", Long.valueOf(this.f11064n));
        contentValues.put("playlistPlays", Long.valueOf(this.f11065o));
        contentValues.put("itemPlays", Long.valueOf(this.f11066p));
        return contentValues;
    }

    public final String c() {
        return e.x(g.o(g.r(g.o(g.r(g.o(g.r(g.o(g.r(g.o(g.r(g.o(g.r(g.o(g.r(g.o(g.r(g.o(g.r(g.o(g.r(g.o(g.r(g.o(g.r(g.o(g.r(g.o(g.r(e.A(new StringBuilder(""), this.f11054b, ";")), this.f11055c, ";")), this.f11056d, ";")), this.e, ";")), this.f11057f, ";")), this.f11058g, ";")), this.f11059h, ";")), this.i, ";")), this.f11060j, ";")), this.f11061k, ";")), this.f11062l, ";")), this.f11063m, ";")), this.f11064n, ";")), this.f11065o, ";")), this.f11066p, ";"), "\n");
    }

    public C0800x0(Cursor cursor) {
        this.f11053a = cursor.getLong(0);
        this.f11054b = cursor.getString(1);
        this.f11055c = cursor.getLong(2);
        this.f11056d = cursor.getLong(3);
        this.e = cursor.getLong(4);
        this.f11057f = cursor.getLong(5);
        this.f11058g = cursor.getLong(6);
        this.f11059h = cursor.getLong(7);
        this.i = cursor.getLong(8);
        this.f11060j = cursor.getLong(9);
        this.f11061k = cursor.getLong(10);
        this.f11062l = cursor.getLong(11);
        this.f11063m = cursor.getLong(12);
        this.f11064n = cursor.getLong(13);
        this.f11065o = cursor.getLong(14);
        this.f11066p = cursor.getLong(15);
    }
}
