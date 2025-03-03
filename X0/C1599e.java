package x0;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* renamed from: x0.e  reason: case insensitive filesystem */
public final class C1599e implements C1600f {

    /* renamed from: U  reason: collision with root package name */
    public final InputContentInfo f16233U;

    public C1599e(Object obj) {
        this.f16233U = (InputContentInfo) obj;
    }

    public final Object a() {
        return this.f16233U;
    }

    public final Uri b() {
        return this.f16233U.getContentUri();
    }

    public final void c() {
        this.f16233U.requestPermission();
    }

    public final Uri d() {
        return this.f16233U.getLinkUri();
    }

    public final ClipDescription getDescription() {
        return this.f16233U.getDescription();
    }

    public C1599e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f16233U = new InputContentInfo(uri, clipDescription, uri2);
    }
}
