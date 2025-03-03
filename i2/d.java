package I2;

import B2.i;
import H2.q;
import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.e;
import java.io.FileNotFoundException;

public final class d implements e {

    /* renamed from: e0  reason: collision with root package name */
    public static final String[] f2259e0 = {"_data"};

    /* renamed from: U  reason: collision with root package name */
    public final Context f2260U;

    /* renamed from: V  reason: collision with root package name */
    public final q f2261V;

    /* renamed from: W  reason: collision with root package name */
    public final q f2262W;

    /* renamed from: X  reason: collision with root package name */
    public final Uri f2263X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f2264Y;

    /* renamed from: Z  reason: collision with root package name */
    public final int f2265Z;

    /* renamed from: a0  reason: collision with root package name */
    public final i f2266a0;

    /* renamed from: b0  reason: collision with root package name */
    public final Class f2267b0;

    /* renamed from: c0  reason: collision with root package name */
    public volatile boolean f2268c0;

    /* renamed from: d0  reason: collision with root package name */
    public volatile e f2269d0;

    public d(Context context, q qVar, q qVar2, Uri uri, int i, int i8, i iVar, Class cls) {
        this.f2260U = context.getApplicationContext();
        this.f2261V = qVar;
        this.f2262W = qVar2;
        this.f2263X = uri;
        this.f2264Y = i;
        this.f2265Z = i8;
        this.f2266a0 = iVar;
        this.f2267b0 = cls;
    }

    public final Class a() {
        return this.f2267b0;
    }

    public final void b() {
        e eVar = this.f2269d0;
        if (eVar != null) {
            eVar.b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.data.e c() {
        /*
            r14 = this;
            boolean r0 = android.os.Environment.isExternalStorageLegacy()
            r1 = 0
            android.content.Context r2 = r14.f2260U
            B2.i r3 = r14.f2266a0
            int r4 = r14.f2265Z
            int r5 = r14.f2264Y
            if (r0 == 0) goto L_0x0078
            android.net.Uri r0 = r14.f2263X
            java.lang.String r12 = "Failed to media store entry for: "
            java.lang.String r13 = "File path was empty in media store for: "
            android.content.ContentResolver r6 = r2.getContentResolver()     // Catch:{ all -> 0x0071 }
            java.lang.String[] r8 = f2259e0     // Catch:{ all -> 0x0071 }
            r10 = 0
            r11 = 0
            r9 = 0
            r7 = r0
            android.database.Cursor r2 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x005f
            boolean r6 = r2.moveToFirst()     // Catch:{ all -> 0x004a }
            if (r6 == 0) goto L_0x005f
            java.lang.String r6 = "_data"
            int r6 = r2.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = r2.getString(r6)     // Catch:{ all -> 0x004a }
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x004a }
            if (r7 != 0) goto L_0x004d
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x004a }
            r0.<init>(r6)     // Catch:{ all -> 0x004a }
            r2.close()
            H2.q r2 = r14.f2261V
            H2.p r0 = r2.a(r0, r5, r4, r3)
            goto L_0x00a1
        L_0x004a:
            r0 = move-exception
            r1 = r2
            goto L_0x0072
        L_0x004d:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r3.<init>(r13)     // Catch:{ all -> 0x004a }
            r3.append(r0)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x004a }
            r1.<init>(r0)     // Catch:{ all -> 0x004a }
            throw r1     // Catch:{ all -> 0x004a }
        L_0x005f:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r3.<init>(r12)     // Catch:{ all -> 0x004a }
            r3.append(r0)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x004a }
            r1.<init>(r0)     // Catch:{ all -> 0x004a }
            throw r1     // Catch:{ all -> 0x004a }
        L_0x0071:
            r0 = move-exception
        L_0x0072:
            if (r1 == 0) goto L_0x0077
            r1.close()
        L_0x0077:
            throw r0
        L_0x0078:
            android.net.Uri r0 = r14.f2263X
            boolean r6 = android.support.v4.media.session.b.u(r0)
            H2.q r7 = r14.f2262W
            if (r6 == 0) goto L_0x0093
            java.util.List r6 = r0.getPathSegments()
            java.lang.String r8 = "picker"
            boolean r6 = r6.contains(r8)
            if (r6 == 0) goto L_0x0093
            H2.p r0 = r7.a(r0, r5, r4, r3)
            goto L_0x00a1
        L_0x0093:
            int r2 = r2.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION")
            if (r2 != 0) goto L_0x009d
            android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
        L_0x009d:
            H2.p r0 = r7.a(r0, r5, r4, r3)
        L_0x00a1:
            if (r0 == 0) goto L_0x00a5
            com.bumptech.glide.load.data.e r1 = r0.f1976c
        L_0x00a5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.d.c():com.bumptech.glide.load.data.e");
    }

    public final void cancel() {
        this.f2268c0 = true;
        e eVar = this.f2269d0;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    public final int e() {
        return 1;
    }

    public final void f(f fVar, com.bumptech.glide.load.data.d dVar) {
        try {
            e c8 = c();
            if (c8 == null) {
                dVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f2263X));
                return;
            }
            this.f2269d0 = c8;
            if (this.f2268c0) {
                cancel();
            } else {
                c8.f(fVar, dVar);
            }
        } catch (FileNotFoundException e) {
            dVar.c(e);
        }
    }
}
