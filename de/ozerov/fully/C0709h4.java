package de.ozerov.fully;

import Q0.g;
import a1.C0412c;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.net.URL;
import n2.a;

/* renamed from: de.ozerov.fully.h4  reason: case insensitive filesystem */
public final /* synthetic */ class C0709h4 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10693U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ String f10694V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ FullyActivity f10695W;

    public /* synthetic */ C0709h4(String str, FullyActivity fullyActivity, int i) {
        this.f10693U = i;
        this.f10694V = str;
        this.f10695W = fullyActivity;
    }

    public final void run() {
        FullyActivity fullyActivity = this.f10695W;
        String str = this.f10694V;
        switch (this.f10693U) {
            case 0:
                try {
                    fullyActivity.runOnUiThread(new C0412c((Object) fullyActivity, 4, (Object) new BitmapDrawable(fullyActivity.getResources(), BitmapFactory.decodeStream(new URL(str).openStream()))));
                    return;
                } catch (Exception e) {
                    a.b1(fullyActivity, "Failed loading background from ".concat(str));
                    g.x(e, new StringBuilder("Failed to load background from URL due to "), "w0");
                    return;
                } catch (OutOfMemoryError e8) {
                    a.b1(fullyActivity, "Out of memory when background from ".concat(str));
                    Log.e("w0", "Failed to load background with OOM from URL due to " + e8.getMessage());
                    return;
                }
            default:
                try {
                    fullyActivity.runOnUiThread(new C0412c((Object) fullyActivity, 5, (Object) Drawable.createFromStream(new URL(str).openStream(), (String) null)));
                    return;
                } catch (Exception e9) {
                    try {
                        fullyActivity.k().G(false);
                    } catch (Exception unused) {
                    }
                    a.b1(fullyActivity, "Failed loading icon from ".concat(str));
                    g.x(e9, new StringBuilder("Failed to load icon from URL due to "), "w0");
                    return;
                } catch (OutOfMemoryError e10) {
                    Log.e("w0", "Failed to load icon from URL with OOM due to " + e10.getMessage());
                    a.b1(fullyActivity, "Out of memory when loading icon from ".concat(str));
                    return;
                }
        }
    }
}
