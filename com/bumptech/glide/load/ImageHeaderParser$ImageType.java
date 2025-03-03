package com.bumptech.glide.load;

import B2.d;

public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);
    

    /* renamed from: U  reason: collision with root package name */
    public final boolean f9024U;

    /* access modifiers changed from: public */
    ImageHeaderParser$ImageType(boolean z) {
        this.f9024U = z;
    }

    public boolean hasAlpha() {
        return this.f9024U;
    }

    public boolean isWebp() {
        int i = d.f382a[ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return true;
        }
        return false;
    }
}
