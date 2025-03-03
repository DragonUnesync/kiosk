package M2;

import B2.h;
import B2.i;
import B2.k;
import D2.D;
import android.content.Context;
import android.net.Uri;

public final class c implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final h f3104b = new h("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme", (Object) null, h.e);

    /* renamed from: a  reason: collision with root package name */
    public final Context f3105a;

    public c(Context context) {
        this.f3105a = context.getApplicationContext();
    }

    public final /* bridge */ /* synthetic */ D a(Object obj, int i, int i8, i iVar) {
        return c((Uri) obj, iVar);
    }

    public final boolean b(Object obj, i iVar) {
        String scheme = ((Uri) obj).getScheme();
        if (scheme == null || !scheme.equals("android.resource")) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final D2.D c(android.net.Uri r9, B2.i r10) {
        /*
            r8 = this;
            java.lang.String r0 = r9.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00ed
            android.content.Context r1 = r8.f3105a
            java.lang.String r2 = r1.getPackageName()
            boolean r2 = r0.equals(r2)
            r3 = 0
            if (r2 == 0) goto L_0x0019
        L_0x0017:
            r2 = r1
            goto L_0x002a
        L_0x0019:
            android.content.Context r2 = r1.createPackageContext(r0, r3)     // Catch:{ NameNotFoundException -> 0x001e }
            goto L_0x002a
        L_0x001e:
            r2 = move-exception
            java.lang.String r4 = r1.getPackageName()
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L_0x00d9
            goto L_0x0017
        L_0x002a:
            java.util.List r4 = r9.getPathSegments()
            int r5 = r4.size()
            r6 = 2
            r7 = 1
            if (r5 != r6) goto L_0x0075
            java.util.List r4 = r9.getPathSegments()
            java.lang.String r5 = r9.getAuthority()
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r4.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            android.content.res.Resources r6 = r2.getResources()
            int r5 = r6.getIdentifier(r4, r3, r5)
            if (r5 != 0) goto L_0x005e
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            java.lang.String r6 = "android"
            int r5 = r5.getIdentifier(r4, r3, r6)
        L_0x005e:
            if (r5 == 0) goto L_0x0061
            goto L_0x008b
        L_0x0061:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to find resource id for: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        L_0x0075:
            int r4 = r4.size()
            java.lang.String r5 = "Unrecognized Uri format: "
            if (r4 != r7) goto L_0x00c7
            java.util.List r4 = r9.getPathSegments()
            java.lang.Object r3 = r4.get(r3)     // Catch:{ NumberFormatException -> 0x00b4 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NumberFormatException -> 0x00b4 }
            int r5 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x00b4 }
        L_0x008b:
            java.lang.String r9 = r1.getPackageName()
            boolean r9 = r0.equals(r9)
            r0 = 0
            if (r9 == 0) goto L_0x009f
            B2.h r9 = f3104b
            java.lang.Object r9 = r10.c(r9)
            android.content.res.Resources$Theme r9 = (android.content.res.Resources.Theme) r9
            goto L_0x00a0
        L_0x009f:
            r9 = r0
        L_0x00a0:
            if (r9 != 0) goto L_0x00a7
            android.graphics.drawable.Drawable r9 = g7.C0996d.h(r1, r2, r5, r0)
            goto L_0x00ab
        L_0x00a7:
            android.graphics.drawable.Drawable r9 = g7.C0996d.h(r1, r1, r5, r9)
        L_0x00ab:
            if (r9 == 0) goto L_0x00b3
            M2.b r0 = new M2.b
            r10 = 0
            r0.<init>(r9, r10)
        L_0x00b3:
            return r0
        L_0x00b4:
            r10 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9, r10)
            throw r0
        L_0x00c7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        L_0x00d9:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to obtain context or unrecognized Uri format for: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9, r2)
            throw r10
        L_0x00ed:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Package name for "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = " is null or empty"
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.c.c(android.net.Uri, B2.i):D2.D");
    }
}
