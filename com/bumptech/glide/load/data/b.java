package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.f;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class b implements e {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f9027U;

    /* renamed from: V  reason: collision with root package name */
    public Object f9028V;

    /* renamed from: W  reason: collision with root package name */
    public final Comparable f9029W;

    /* renamed from: X  reason: collision with root package name */
    public final Object f9030X;

    public /* synthetic */ b(int i, Comparable comparable, Object obj) {
        this.f9027U = i;
        this.f9030X = obj;
        this.f9029W = comparable;
    }

    private final void c() {
    }

    private final void d() {
    }

    public final void b() {
        switch (this.f9027U) {
            case 0:
                Object obj = this.f9028V;
                if (obj != null) {
                    try {
                        g(obj);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                } else {
                    return;
                }
            default:
                Object obj2 = this.f9028V;
                if (obj2 != null) {
                    try {
                        g(obj2);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public final void cancel() {
        int i = this.f9027U;
    }

    public final int e() {
        switch (this.f9027U) {
            case 0:
                return 1;
            default:
                return 1;
        }
    }

    public final void f(f fVar, d dVar) {
        switch (this.f9027U) {
            case 0:
                try {
                    Object h5 = h((AssetManager) this.f9030X, (String) this.f9029W);
                    this.f9028V = h5;
                    dVar.d(h5);
                    return;
                } catch (IOException e) {
                    if (Log.isLoggable("AssetPathFetcher", 3)) {
                        Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
                    }
                    dVar.c(e);
                    return;
                }
            default:
                try {
                    Object i = i((Uri) this.f9029W, (ContentResolver) this.f9030X);
                    this.f9028V = i;
                    dVar.d(i);
                    return;
                } catch (FileNotFoundException e8) {
                    if (Log.isLoggable("LocalUriFetcher", 3)) {
                        Log.d("LocalUriFetcher", "Failed to open Uri", e8);
                    }
                    dVar.c(e8);
                    return;
                }
        }
    }

    public abstract void g(Object obj);

    public abstract Object h(AssetManager assetManager, String str);

    public abstract Object i(Uri uri, ContentResolver contentResolver);
}
