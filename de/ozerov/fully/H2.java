package de.ozerov.fully;

import V.a;
import Z1.c;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0470v;
import d4.k;

@TargetApi(21)
public class H2 extends C0470v implements View.OnClickListener {

    /* renamed from: X0  reason: collision with root package name */
    public static final /* synthetic */ int f9991X0 = 0;

    /* renamed from: P0  reason: collision with root package name */
    public ParcelFileDescriptor f9992P0;

    /* renamed from: Q0  reason: collision with root package name */
    public PdfRenderer f9993Q0;

    /* renamed from: R0  reason: collision with root package name */
    public PdfRenderer.Page f9994R0;

    /* renamed from: S0  reason: collision with root package name */
    public TouchImageView f9995S0;

    /* renamed from: T0  reason: collision with root package name */
    public DimmableImageButton f9996T0;

    /* renamed from: U0  reason: collision with root package name */
    public DimmableImageButton f9997U0;

    /* renamed from: V0  reason: collision with root package name */
    public DimmableImageButton f9998V0;

    /* renamed from: W0  reason: collision with root package name */
    public Bitmap f9999W0;

    public final void A() {
        try {
            O();
            PdfRenderer pdfRenderer = this.f9993Q0;
            if (pdfRenderer != null) {
                pdfRenderer.close();
            }
            ParcelFileDescriptor parcelFileDescriptor = this.f9992P0;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f8088y0 = true;
    }

    public final void D() {
        this.f8088y0 = true;
    }

    public final void E(Bundle bundle) {
        PdfRenderer.Page page = this.f9994R0;
        if (page != null) {
            bundle.putInt("current_page_index", page.getIndex());
        }
    }

    public final void H(View view, Bundle bundle) {
        int i;
        int i8;
        c cVar = (c) new k((Context) h(), 1).f9767W;
        view.requestFocus();
        C0794w0.V(h());
        GestureDetector gestureDetector = new GestureDetector(view.getContext(), new a(1, this));
        TouchImageView touchImageView = (TouchImageView) view.findViewById(2131362364);
        this.f9995S0 = touchImageView;
        touchImageView.setOnTouchListener(new C3.k(3, gestureDetector));
        TouchImageView touchImageView2 = this.f9995S0;
        try {
            i = Integer.parseInt(cVar.r("pdfMaxZoom", "300"));
        } catch (Exception unused) {
            i = 300;
        }
        touchImageView2.setMaxZoom(((float) i) / 100.0f);
        TouchImageView touchImageView3 = this.f9995S0;
        try {
            i8 = Integer.parseInt(cVar.r("pdfMinZoom", "100"));
        } catch (Exception unused2) {
            i8 = 100;
        }
        touchImageView3.setMinZoom(((float) i8) / 100.0f);
        this.f9996T0 = (DimmableImageButton) view.findViewById(2131362395);
        this.f9997U0 = (DimmableImageButton) view.findViewById(2131362307);
        this.f9998V0 = (DimmableImageButton) view.findViewById(2131361943);
        this.f9996T0.setOnClickListener(this);
        this.f9997U0.setOnClickListener(this);
        this.f9998V0.setOnClickListener(this);
        int i9 = 0;
        if (bundle != null) {
            i9 = bundle.getInt("current_page_index", 0);
        }
        P(i9);
    }

    public final void O() {
        this.f9995S0.setVisibility(8);
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.f9995S0.getDrawable();
        if (bitmapDrawable != null) {
            bitmapDrawable.getBitmap().recycle();
        }
        Bitmap bitmap = this.f9999W0;
        if (bitmap != null) {
            bitmap.recycle();
            this.f9999W0 = null;
        }
        PdfRenderer.Page page = this.f9994R0;
        if (page != null) {
            page.close();
            this.f9994R0 = null;
        }
        Runtime.getRuntime().gc();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        r8 = 100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d3, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d7, code lost:
        android.util.Log.w("H2", "Out of memory when rendering PDF page due to " + r10.getMessage());
        n2.a.b1(h(), "Out of memory when rendering PDF page");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f6, code lost:
        android.util.Log.w("H2", "Failed to render PDF page due to " + r10.getMessage());
        r10.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d3 A[ExcHandler: OutOfMemoryError (r10v2 'e' java.lang.OutOfMemoryError A[CUSTOM_DECLARE]), Splitter:B:6:0x0023] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P(int r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "100"
            java.lang.String r3 = "pdfRendererScaling"
            java.lang.String r4 = "H2"
            android.graphics.pdf.PdfRenderer r5 = r9.f9993Q0
            if (r5 == 0) goto L_0x010e
            int r5 = r5.getPageCount()
            if (r5 <= r10) goto L_0x010e
            if (r10 >= 0) goto L_0x0016
            goto L_0x010e
        L_0x0016:
            d4.k r5 = new d4.k
            h.j r6 = r9.h()
            r5.<init>((android.content.Context) r6, (int) r1)
            java.lang.Object r5 = r5.f9767W
            Z1.c r5 = (Z1.c) r5
            r9.O()     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            android.graphics.pdf.PdfRenderer r6 = r9.f9993Q0     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            android.graphics.pdf.PdfRenderer$Page r6 = r6.openPage(r10)     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            r9.f9994R0 = r6     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            android.content.res.Resources r6 = r9.m()     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            int r6 = r6.widthPixels     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            r7 = 100
            java.lang.String r8 = r5.r(r3, r2)     // Catch:{ Exception -> 0x0043, OutOfMemoryError -> 0x00d3 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ Exception -> 0x0043, OutOfMemoryError -> 0x00d3 }
            goto L_0x0045
        L_0x0043:
            r8 = 100
        L_0x0045:
            int r6 = r6 * r8
            int r6 = r6 / r7
            android.content.res.Resources r8 = r9.m()     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            int r8 = r8.heightPixels     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            java.lang.String r2 = r5.r(r3, r2)     // Catch:{ Exception -> 0x005b, OutOfMemoryError -> 0x00d3 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x005b, OutOfMemoryError -> 0x00d3 }
            goto L_0x005d
        L_0x005b:
            r2 = 100
        L_0x005d:
            int r8 = r8 * r2
            int r8 = r8 / r7
            android.graphics.pdf.PdfRenderer$Page r2 = r9.f9994R0     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            int r2 = r2.getWidth()     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            android.graphics.pdf.PdfRenderer$Page r3 = r9.f9994R0     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            int r3 = r3.getHeight()     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            float r5 = (float) r6     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            float r2 = (float) r2     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            float r5 = r5 / r2
            float r6 = (float) r8     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            float r3 = (float) r3     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            float r6 = r6 / r3
            float r5 = java.lang.Math.max(r5, r6)     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            float r2 = r2 * r5
            int r2 = (int) r2     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            float r3 = r3 * r5
            int r3 = (int) r3     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r5)     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            r9.f9999W0 = r2     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            android.graphics.pdf.PdfRenderer$Page r3 = r9.f9994R0     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            r5 = 0
            r3.render(r2, r5, r5, r1)     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            de.ozerov.fully.TouchImageView r2 = r9.f9995S0     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            android.graphics.Bitmap r3 = r9.f9999W0     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            r2.setImageBitmap(r3)     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            de.ozerov.fully.TouchImageView r2 = r9.f9995S0     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            r2.setVisibility(r0)     // Catch:{ Exception -> 0x00d5, OutOfMemoryError -> 0x00d3 }
            android.graphics.pdf.PdfRenderer r2 = r9.f9993Q0
            int r2 = r2.getPageCount()
            de.ozerov.fully.DimmableImageButton r3 = r9.f9996T0
            if (r10 == 0) goto L_0x00a2
            r4 = 1
            goto L_0x00a3
        L_0x00a2:
            r4 = 0
        L_0x00a3:
            r3.setEnabled(r4)
            de.ozerov.fully.DimmableImageButton r3 = r9.f9997U0
            int r10 = r10 + r1
            if (r10 >= r2) goto L_0x00ad
            r4 = 1
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            r3.setEnabled(r4)
            h.j r3 = r9.h()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r10
            r4[r1] = r2
            android.content.res.Resources r10 = r9.m()
            r0 = 2131951928(0x7f130138, float:1.9540284E38)
            java.lang.String r10 = r10.getString(r0, r4)
            r3.setTitle(r10)
            return
        L_0x00d3:
            r10 = move-exception
            goto L_0x00d7
        L_0x00d5:
            r10 = move-exception
            goto L_0x00f6
        L_0x00d7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Out of memory when rendering PDF page due to "
            r0.<init>(r1)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            android.util.Log.w(r4, r10)
            h.j r10 = r9.h()
            java.lang.String r0 = "Out of memory when rendering PDF page"
            n2.a.b1(r10, r0)
            return
        L_0x00f6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to render PDF page due to "
            r0.<init>(r1)
            java.lang.String r1 = r10.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r4, r0)
            r10.printStackTrace()
        L_0x010e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.H2.P(int):void");
    }

    public final void onClick(View view) {
        if (this.f9994R0 != null) {
            int id = view.getId();
            if (id == 2131361943) {
                ((FullyActivity) h()).C();
            } else if (id == 2131362307) {
                P(this.f9994R0.getIndex() + 1);
            } else if (id == 2131362395) {
                P(this.f9994R0.getIndex() - 1);
            }
        }
    }

    public final void v(Activity activity) {
        this.f8088y0 = true;
        if (h() instanceof FullyActivity) {
            String string = this.f8064Z.getString("url", "");
            try {
                if (!string.startsWith("content:")) {
                    if (!string.startsWith("file:")) {
                        throw new IllegalArgumentException("Not supported URL ".concat(string));
                    }
                }
                this.f9992P0 = activity.getContentResolver().openFileDescriptor(Uri.parse(string), "r");
                this.f9993Q0 = new PdfRenderer(this.f9992P0);
            } catch (Exception e) {
                Log.w("H2", e.getMessage());
                n2.a.b1(activity, "Error: Can't open PDF viewer for " + string);
                ((FullyActivity) h()).C();
            }
        } else {
            throw new IllegalStateException("Fragment not attached to FullyActivity");
        }
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558487, viewGroup, false);
    }
}
