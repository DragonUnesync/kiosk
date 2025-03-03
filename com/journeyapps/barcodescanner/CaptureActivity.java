package com.journeyapps.barcodescanner;

import A.f;
import A1.d;
import G5.i;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class CaptureActivity extends Activity {

    /* renamed from: U  reason: collision with root package name */
    public i f9520U;

    /* renamed from: V  reason: collision with root package name */
    public DecoratedBarcodeView f9521V;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131558607);
        this.f9521V = (DecoratedBarcodeView) findViewById(2131362658);
        i iVar = new i(this, this.f9521V);
        this.f9520U = iVar;
        iVar.c(getIntent(), bundle);
        i iVar2 = this.f9520U;
        f fVar = iVar2.f1706l;
        DecoratedBarcodeView decoratedBarcodeView = iVar2.f1698b;
        BarcodeView barcodeView = decoratedBarcodeView.f9522U;
        d dVar = new d(13, decoratedBarcodeView, fVar, false);
        barcodeView.f9517x0 = 2;
        barcodeView.f9518y0 = dVar;
        barcodeView.h();
    }

    public final void onDestroy() {
        super.onDestroy();
        i iVar = this.f9520U;
        iVar.f1702g = true;
        iVar.f1703h.b();
        iVar.f1704j.removeCallbacksAndMessages((Object) null);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f9521V.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent)) {
            return true;
        }
        return false;
    }

    public final void onPause() {
        super.onPause();
        i iVar = this.f9520U;
        iVar.f1703h.b();
        iVar.f1698b.a();
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        i iVar = this.f9520U;
        iVar.getClass();
        if (i != 250) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            Intent intent = new Intent("com.google.zxing.client.android.SCAN");
            intent.putExtra("MISSING_CAMERA_PERMISSION", true);
            iVar.f1697a.setResult(0, intent);
            if (iVar.e) {
                iVar.b(iVar.f1701f);
            } else {
                iVar.a();
            }
        } else {
            iVar.f1698b.f9522U.c();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f9520U.d();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f9520U.f1699c);
    }
}
