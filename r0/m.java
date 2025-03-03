package R0;

import P0.l;
import P0.z;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public final class m implements h {

    /* renamed from: U  reason: collision with root package name */
    public final Context f4284U;

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f4285V = new ArrayList();

    /* renamed from: W  reason: collision with root package name */
    public final h f4286W;

    /* renamed from: X  reason: collision with root package name */
    public r f4287X;

    /* renamed from: Y  reason: collision with root package name */
    public C0157b f4288Y;

    /* renamed from: Z  reason: collision with root package name */
    public e f4289Z;

    /* renamed from: a0  reason: collision with root package name */
    public h f4290a0;

    /* renamed from: b0  reason: collision with root package name */
    public C f4291b0;

    /* renamed from: c0  reason: collision with root package name */
    public f f4292c0;

    /* renamed from: d0  reason: collision with root package name */
    public y f4293d0;

    /* renamed from: e0  reason: collision with root package name */
    public h f4294e0;

    public m(Context context, h hVar) {
        this.f4284U = context.getApplicationContext();
        hVar.getClass();
        this.f4286W = hVar;
    }

    public static void e(h hVar, A a8) {
        if (hVar != null) {
            hVar.o(a8);
        }
    }

    public final void b(h hVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4285V;
            if (i < arrayList.size()) {
                hVar.o((A) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final void close() {
        h hVar = this.f4294e0;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.f4294e0 = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [R0.r, R0.c, R0.h] */
    /* JADX WARNING: type inference failed for: r0v20, types: [R0.f, R0.c, R0.h] */
    public final long f(l lVar) {
        boolean z;
        if (this.f4294e0 == null) {
            z = true;
        } else {
            z = false;
        }
        l.j(z);
        String scheme = lVar.f4277a.getScheme();
        int i = z.f3748a;
        Uri uri = lVar.f4277a;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f4284U;
        if (isEmpty || "file".equals(scheme2)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f4287X == null) {
                    ? cVar = new C0158c(false);
                    this.f4287X = cVar;
                    b(cVar);
                }
                this.f4294e0 = this.f4287X;
            } else {
                if (this.f4288Y == null) {
                    C0157b bVar = new C0157b(context);
                    this.f4288Y = bVar;
                    b(bVar);
                }
                this.f4294e0 = this.f4288Y;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f4288Y == null) {
                C0157b bVar2 = new C0157b(context);
                this.f4288Y = bVar2;
                b(bVar2);
            }
            this.f4294e0 = this.f4288Y;
        } else if ("content".equals(scheme)) {
            if (this.f4289Z == null) {
                e eVar = new e(context);
                this.f4289Z = eVar;
                b(eVar);
            }
            this.f4294e0 = this.f4289Z;
        } else {
            boolean equals = "rtmp".equals(scheme);
            h hVar = this.f4286W;
            if (equals) {
                if (this.f4290a0 == null) {
                    try {
                        h hVar2 = (h) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor((Class[]) null).newInstance((Object[]) null);
                        this.f4290a0 = hVar2;
                        b(hVar2);
                    } catch (ClassNotFoundException unused) {
                        l.B("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.f4290a0 == null) {
                        this.f4290a0 = hVar;
                    }
                }
                this.f4294e0 = this.f4290a0;
            } else if ("udp".equals(scheme)) {
                if (this.f4291b0 == null) {
                    C c8 = new C(8000);
                    this.f4291b0 = c8;
                    b(c8);
                }
                this.f4294e0 = this.f4291b0;
            } else if ("data".equals(scheme)) {
                if (this.f4292c0 == null) {
                    ? cVar2 = new C0158c(false);
                    this.f4292c0 = cVar2;
                    b(cVar2);
                }
                this.f4294e0 = this.f4292c0;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f4293d0 == null) {
                    y yVar = new y(context);
                    this.f4293d0 = yVar;
                    b(yVar);
                }
                this.f4294e0 = this.f4293d0;
            } else {
                this.f4294e0 = hVar;
            }
        }
        return this.f4294e0.f(lVar);
    }

    public final Map j() {
        h hVar = this.f4294e0;
        if (hVar == null) {
            return Collections.emptyMap();
        }
        return hVar.j();
    }

    public final void o(A a8) {
        a8.getClass();
        this.f4286W.o(a8);
        this.f4285V.add(a8);
        e(this.f4287X, a8);
        e(this.f4288Y, a8);
        e(this.f4289Z, a8);
        e(this.f4290a0, a8);
        e(this.f4291b0, a8);
        e(this.f4292c0, a8);
        e(this.f4293d0, a8);
    }

    public final Uri p() {
        h hVar = this.f4294e0;
        if (hVar == null) {
            return null;
        }
        return hVar.p();
    }

    public final int x(byte[] bArr, int i, int i8) {
        h hVar = this.f4294e0;
        hVar.getClass();
        return hVar.x(bArr, i, i8);
    }
}
