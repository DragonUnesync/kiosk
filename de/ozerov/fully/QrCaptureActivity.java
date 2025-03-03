package de.ozerov.fully;

import A.f;
import A1.d;
import G5.i;
import android.content.Context;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import com.journeyapps.barcodescanner.BarcodeView;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import d4.k;
import h.C1022j;
import k2.C1160q;

public class QrCaptureActivity extends C1022j {

    /* renamed from: u0  reason: collision with root package name */
    public static final /* synthetic */ int f10307u0 = 0;

    /* renamed from: s0  reason: collision with root package name */
    public i f10308s0;

    /* renamed from: t0  reason: collision with root package name */
    public DecoratedBarcodeView f10309t0;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1160q.J(this);
        setContentView(2131558431);
        this.f10309t0 = (DecoratedBarcodeView) findViewById(2131362658);
        i iVar = new i(this, this.f10309t0);
        this.f10308s0 = iVar;
        iVar.c(getIntent(), bundle);
        i iVar2 = this.f10308s0;
        f fVar = iVar2.f1706l;
        DecoratedBarcodeView decoratedBarcodeView = iVar2.f1698b;
        BarcodeView barcodeView = decoratedBarcodeView.f9522U;
        d dVar = new d(13, decoratedBarcodeView, fVar, false);
        barcodeView.f9517x0 = 2;
        barcodeView.f9518y0 = dVar;
        barcodeView.h();
        Button button = (Button) findViewById(2131362657);
        button.setOnClickListener(new C0696f3(this, 0));
        View findViewById = findViewById(2131362665);
        findViewById.setOnClickListener(new C0696f3(this, 1));
        if (!getIntent().getBooleanExtra("showCancelButton", false)) {
            button.setVisibility(8);
        }
        if (!getIntent().getBooleanExtra("showFlipCameraButton", false) || Camera.getNumberOfCameras() < 2) {
            findViewById.setVisibility(8);
        }
        if (getIntent().getBooleanExtra("useFlashlight", false)) {
            this.f10309t0.f9522U.setTorch(true);
        }
        k kVar = new k((Context) this, 1);
        if (kVar.S().booleanValue()) {
            C0794w0.O0(this);
        }
        if (kVar.Z().booleanValue()) {
            getWindow().addFlags(128);
        }
        C0794w0.A0(this, kVar.Z1().booleanValue(), kVar.c2().booleanValue());
    }

    public final void onDestroy() {
        super.onDestroy();
        i iVar = this.f10308s0;
        iVar.f1702g = true;
        iVar.f1703h.b();
        iVar.f1704j.removeCallbacksAndMessages((Object) null);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f10309t0.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public final void onPause() {
        super.onPause();
        i iVar = this.f10308s0;
        iVar.f1703h.b();
        iVar.f1698b.a();
    }

    public final void onResume() {
        super.onResume();
        this.f10308s0.d();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f10308s0.f1699c);
    }

    public final boolean t() {
        onBackPressed();
        return true;
    }
}
