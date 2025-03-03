package de.ozerov.fully;

import B3.q;
import Q0.g;
import android.app.Activity;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import n2.a;

/* renamed from: de.ozerov.fully.t0  reason: case insensitive filesystem */
public final /* synthetic */ class C0776t0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10956U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ q f10957V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ FullyActivity f10958W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Uri f10959X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ String f10960Y;

    public /* synthetic */ C0776t0(q qVar, FullyActivity fullyActivity, Uri uri, String str, int i) {
        this.f10956U = i;
        this.f10957V = qVar;
        this.f10958W = fullyActivity;
        this.f10959X = uri;
        this.f10960Y = str;
    }

    public final void run() {
        switch (this.f10956U) {
            case 0:
                FullyActivity fullyActivity = this.f10958W;
                Uri uri = this.f10959X;
                String str = this.f10960Y;
                q qVar = this.f10957V;
                qVar.getClass();
                try {
                    ParcelFileDescriptor openFileDescriptor = fullyActivity.getContentResolver().openFileDescriptor(uri, "w");
                    qVar.z(new FileOutputStream(openFileDescriptor.getFileDescriptor()));
                    qVar.n0("manual", str);
                    openFileDescriptor.close();
                    return;
                } catch (Exception e) {
                    StringBuilder s8 = g.s("Error writing settings to ", str, " due to ");
                    s8.append(e.getMessage());
                    Log.e("FullySettingsExportImport", s8.toString());
                    a.b1((Activity) qVar.f449U, "Error writing settings to ".concat(str));
                    return;
                }
            default:
                FullyActivity fullyActivity2 = this.f10958W;
                Uri uri2 = this.f10959X;
                String str2 = this.f10960Y;
                q qVar2 = this.f10957V;
                qVar2.getClass();
                try {
                    ParcelFileDescriptor openFileDescriptor2 = fullyActivity2.getContentResolver().openFileDescriptor(uri2, "r");
                    qVar2.P(new FileInputStream(openFileDescriptor2.getFileDescriptor()), str2, 2);
                    openFileDescriptor2.close();
                    return;
                } catch (Exception e8) {
                    StringBuilder s9 = g.s("Error reading settings from ", str2, " due to ");
                    s9.append(e8.getMessage());
                    Log.e("FullySettingsExportImport", s9.toString());
                    a.b1((Activity) qVar2.f449U, "Error reading settings from ".concat(str2));
                    return;
                }
        }
    }
}
