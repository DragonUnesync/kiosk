package com.google.android.material.datepicker;

import M0.S;
import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public final class o implements Comparable, Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new S(23);

    /* renamed from: U  reason: collision with root package name */
    public final Calendar f9329U;

    /* renamed from: V  reason: collision with root package name */
    public final int f9330V;

    /* renamed from: W  reason: collision with root package name */
    public final int f9331W;

    /* renamed from: X  reason: collision with root package name */
    public final int f9332X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f9333Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f9334Z;

    /* renamed from: a0  reason: collision with root package name */
    public String f9335a0;

    public o(Calendar calendar) {
        calendar.set(5, 1);
        Calendar a8 = w.a(calendar);
        this.f9329U = a8;
        this.f9330V = a8.get(2);
        this.f9331W = a8.get(1);
        this.f9332X = a8.getMaximum(7);
        this.f9333Y = a8.getActualMaximum(5);
        this.f9334Z = a8.getTimeInMillis();
    }

    public static o k(int i, int i8) {
        Calendar c8 = w.c((Calendar) null);
        c8.set(1, i);
        c8.set(2, i8);
        return new o(c8);
    }

    public static o v(long j7) {
        Calendar c8 = w.c((Calendar) null);
        c8.setTimeInMillis(j7);
        return new o(c8);
    }

    public final int compareTo(Object obj) {
        return this.f9329U.compareTo(((o) obj).f9329U);
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (com.google.android.material.datepicker.o) r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.material.datepicker.o
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            com.google.android.material.datepicker.o r5 = (com.google.android.material.datepicker.o) r5
            int r1 = r5.f9330V
            int r3 = r4.f9330V
            if (r3 != r1) goto L_0x0019
            int r1 = r4.f9331W
            int r5 = r5.f9331W
            if (r1 != r5) goto L_0x0019
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.o.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9330V), Integer.valueOf(this.f9331W)});
    }

    public final String w() {
        String str;
        if (this.f9335a0 == null) {
            long timeInMillis = this.f9329U.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                Locale locale = Locale.getDefault();
                AtomicReference atomicReference = w.f9349a;
                DateFormat a8 = DateFormat.getInstanceForSkeleton("yMMMM", locale);
                a8.setTimeZone(TimeZone.getTimeZone("UTC"));
                a8.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
                str = a8.format(new Date(timeInMillis));
            } else {
                str = DateUtils.formatDateTime((Context) null, timeInMillis, 8228);
            }
            this.f9335a0 = str;
        }
        return this.f9335a0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9331W);
        parcel.writeInt(this.f9330V);
    }

    public final int x(o oVar) {
        if (this.f9329U instanceof GregorianCalendar) {
            return (oVar.f9330V - this.f9330V) + ((oVar.f9331W - this.f9331W) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
