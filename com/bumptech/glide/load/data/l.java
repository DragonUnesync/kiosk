package com.bumptech.glide.load.data;

import E2.g;
import java.io.InputStream;

public final class l implements f {

    /* renamed from: a  reason: collision with root package name */
    public final g f9048a;

    public l(g gVar) {
        this.f9048a = gVar;
    }

    public final Class a() {
        return InputStream.class;
    }

    public final g b(Object obj) {
        return new h((InputStream) obj, this.f9048a);
    }
}
