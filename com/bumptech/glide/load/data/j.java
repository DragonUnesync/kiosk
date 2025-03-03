package com.bumptech.glide.load.data;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.InputStream;

public final class j extends b {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f9042Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(AssetManager assetManager, String str, int i) {
        super(0, str, assetManager);
        this.f9042Y = i;
    }

    public final Class a() {
        switch (this.f9042Y) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    public final void g(Object obj) {
        switch (this.f9042Y) {
            case 0:
                ((AssetFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    public final Object h(AssetManager assetManager, String str) {
        switch (this.f9042Y) {
            case 0:
                return assetManager.openFd(str);
            default:
                return assetManager.open(str);
        }
    }
}
