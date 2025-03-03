package de.ozerov.fully;

import T2.b;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import n2.a;

/* renamed from: de.ozerov.fully.d0  reason: case insensitive filesystem */
public final class C0681d0 extends b {

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Context f10591X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10592Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f10593Z;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ Runnable f10594a0;

    public C0681d0(int i, Context context, Runnable runnable, String str) {
        this.f10591X = context;
        this.f10592Y = i;
        this.f10593Z = str;
        this.f10594a0 = runnable;
    }

    public final void b(Drawable drawable) {
        Log.w("w0", "Failed to load wallpaper from " + this.f10593Z);
    }

    public final void g(Drawable drawable) {
    }

    public final void i(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        WallpaperManager instance = WallpaperManager.getInstance(this.f10591X.getApplicationContext());
        int i = this.f10592Y;
        if (i != 1) {
            try {
                if (a.z0()) {
                    instance.setBitmap(bitmap, (Rect) null, false, i);
                    this.f10594a0.run();
                }
            } catch (Exception e) {
                Log.w("w0", "Failed to load wallpaper from " + this.f10593Z + " due to " + e.getMessage());
                return;
            }
        }
        instance.setBitmap(bitmap);
        this.f10594a0.run();
    }
}
