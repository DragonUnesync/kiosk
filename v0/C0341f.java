package V0;

import G5.m;
import H3.P;
import M0.C0117e;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: V0.f  reason: case insensitive filesystem */
public final class C0341f extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f5517a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f5518b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f5519c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0341f(m mVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f5519c = mVar;
        this.f5517a = contentResolver;
        this.f5518b = uri;
    }

    public final void onChange(boolean z) {
        m mVar = this.f5519c;
        mVar.l(C0339d.b((Context) mVar.f1713c, (C0117e) mVar.f1718j, (P) mVar.i));
    }
}
