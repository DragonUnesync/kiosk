package com.journeyapps.barcodescanner;

import G5.k;
import G5.n;
import H5.f;
import H5.i;
import Q3.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: U  reason: collision with root package name */
    public final BarcodeView f9522U;

    /* renamed from: V  reason: collision with root package name */
    public final ViewfinderView f9523V;

    /* renamed from: W  reason: collision with root package name */
    public final TextView f9524W;

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f4120c);
        int resourceId = obtainStyledAttributes.getResourceId(0, 2131558606);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(2131362659);
        this.f9522U = barcodeView;
        if (barcodeView != null) {
            barcodeView.b(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(2131362670);
            this.f9523V = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f9522U);
                this.f9524W = (TextView) findViewById(2131362669);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public final void a() {
        BarcodeView barcodeView = this.f9522U;
        f cameraInstance = barcodeView.getCameraInstance();
        barcodeView.g();
        long nanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.f2181g && System.nanoTime() - nanoTime <= 2000000000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(2131362659);
    }

    public i getCameraSettings() {
        return this.f9522U.getCameraSettings();
    }

    public k getDecoderFactory() {
        return this.f9522U.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f9524W;
    }

    public ViewfinderView getViewFinder() {
        return this.f9523V;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            this.f9522U.setTorch(true);
            return true;
        } else if (i == 25) {
            this.f9522U.setTorch(false);
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setCameraSettings(i iVar) {
        this.f9522U.setCameraSettings(iVar);
    }

    public void setDecoderFactory(k kVar) {
        this.f9522U.setDecoderFactory(kVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f9524W;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(n nVar) {
    }
}
