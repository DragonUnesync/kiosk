package de.ozerov.fully;

import H5.i;
import android.view.View;

/* renamed from: de.ozerov.fully.f3  reason: case insensitive filesystem */
public final /* synthetic */ class C0696f3 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10635U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ QrCaptureActivity f10636V;

    public /* synthetic */ C0696f3(QrCaptureActivity qrCaptureActivity, int i) {
        this.f10635U = i;
        this.f10636V = qrCaptureActivity;
    }

    public final void onClick(View view) {
        QrCaptureActivity qrCaptureActivity = this.f10636V;
        switch (this.f10635U) {
            case 0:
                int i = QrCaptureActivity.f10307u0;
                qrCaptureActivity.onBackPressed();
                return;
            default:
                qrCaptureActivity.f10309t0.a();
                i cameraSettings = qrCaptureActivity.f10309t0.getCameraSettings();
                int i8 = 1;
                if (cameraSettings.f2200a == 1) {
                    i8 = 0;
                }
                cameraSettings.f2200a = i8;
                qrCaptureActivity.f10309t0.setCameraSettings(cameraSettings);
                qrCaptureActivity.f10309t0.f9522U.c();
                return;
        }
    }
}
