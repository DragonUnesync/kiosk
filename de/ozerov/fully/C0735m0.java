package de.ozerov.fully;

import android.app.NotificationChannel;

/* renamed from: de.ozerov.fully.m0  reason: case insensitive filesystem */
public abstract /* synthetic */ class C0735m0 {
    public static /* synthetic */ NotificationChannel D() {
        return new NotificationChannel("4567", "Fully High Priority", 4);
    }

    public static /* synthetic */ NotificationChannel d() {
        return new NotificationChannel("4566", "Fully Default Priority", 3);
    }

    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel(str, "Errors", 3);
    }
}
