package com.google.android.material.datepicker;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f9349a = new AtomicReference();

    public static Calendar a(Calendar calendar) {
        Calendar c8 = c(calendar);
        Calendar c9 = c((Calendar) null);
        c9.set(c8.get(1), c8.get(2), c8.get(5));
        return c9;
    }

    public static Calendar b() {
        v vVar = (v) f9349a.get();
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar c(Calendar calendar) {
        Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
