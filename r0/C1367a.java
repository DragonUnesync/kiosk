package r0;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;

/* renamed from: r0.a  reason: case insensitive filesystem */
public final class C1367a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14787a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentProviderClient f14788b;

    public C1367a(Context context, Uri uri, int i) {
        this.f14787a = i;
        switch (i) {
            case 1:
                this.f14788b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                return;
            default:
                this.f14788b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                return;
        }
    }

    public final void a() {
        switch (this.f14787a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f14788b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                    return;
                }
                return;
            default:
                ContentProviderClient contentProviderClient2 = this.f14788b;
                if (contentProviderClient2 != null) {
                    contentProviderClient2.release();
                    return;
                }
                return;
        }
    }
}
