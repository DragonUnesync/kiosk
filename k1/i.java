package K1;

import B2.l;
import B7.g;
import D2.D;
import H3.O;
import H3.P;
import K2.o;
import M1.j;
import P5.N;
import P6.f;
import W2.b;
import X2.a;
import Y0.c;
import Y0.e;
import Y0.h;
import Z1.d;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.ServerSocket;
import java.util.ArrayList;
import l1.r;
import p1.s;
import p1.z;
import u.C1477r;

public final class i implements g, o, j, l, N, r, a, h, d {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2568U;

    public /* synthetic */ i(int i) {
        this.f2568U = i;
    }

    public static byte[] t(O o2, long j7) {
        g gVar = new g(13);
        ArrayList arrayList = new ArrayList(o2.size());
        for (Object apply : o2) {
            arrayList.add((Bundle) gVar.apply(apply));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j7);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    private final void u() {
    }

    private final void v(int i, Serializable serializable) {
    }

    private final void w(Object obj) {
    }

    public boolean a(M0.r rVar) {
        switch (this.f2568U) {
            case 9:
                String str = rVar.f3036n;
                if (Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml")) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public P b(e eVar, M0.r rVar) {
        if (rVar.f3040r == null) {
            return null;
        }
        return new P((Object) new c(new Exception(), 6001));
    }

    public void c(Looper looper, U0.j jVar) {
    }

    public Object d() {
        return new ArrayList();
    }

    public boolean e(Object obj, File file, B2.i iVar) {
        try {
            b.d(((O2.g) ((O2.c) ((D) obj).get()).f3610U.f3609b).f3625a.f62d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            }
            return false;
        }
    }

    public void f(int i, Serializable serializable) {
        String str;
        switch (this.f2568U) {
            case 26:
                return;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                    default:
                        str = "";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    return;
                } else {
                    Log.d("ProfileInstaller", str);
                    return;
                }
        }
    }

    public z g() {
        return new s(-9223372036854775807L);
    }

    public long h(p1.l lVar) {
        return -1;
    }

    public /* synthetic */ void i() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public M1.l j(M0.r r7) {
        /*
            r6 = this;
            r0 = 7
            r1 = 5
            r2 = 0
            int r3 = r6.f2568U
            switch(r3) {
                case 9: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This SubtitleParser.Factory doesn't support any formats."
            r7.<init>(r0)
            throw r7
        L_0x0010:
            java.lang.String r3 = r7.f3036n
            if (r3 == 0) goto L_0x00ad
            java.util.List r7 = r7.f3039q
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1351681404: goto L_0x006d;
                case -1248334819: goto L_0x0062;
                case -1026075066: goto L_0x0057;
                case -1004728940: goto L_0x004c;
                case 691401887: goto L_0x0041;
                case 822864842: goto L_0x0036;
                case 1668750253: goto L_0x002b;
                case 1693976202: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0077
        L_0x0020:
            java.lang.String r5 = "application/ttml+xml"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0029
            goto L_0x0077
        L_0x0029:
            r4 = 7
            goto L_0x0077
        L_0x002b:
            java.lang.String r5 = "application/x-subrip"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0034
            goto L_0x0077
        L_0x0034:
            r4 = 6
            goto L_0x0077
        L_0x0036:
            java.lang.String r5 = "text/x-ssa"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x003f
            goto L_0x0077
        L_0x003f:
            r4 = 5
            goto L_0x0077
        L_0x0041:
            java.lang.String r5 = "application/x-quicktime-tx3g"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x004a
            goto L_0x0077
        L_0x004a:
            r4 = 4
            goto L_0x0077
        L_0x004c:
            java.lang.String r5 = "text/vtt"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0055
            goto L_0x0077
        L_0x0055:
            r4 = 3
            goto L_0x0077
        L_0x0057:
            java.lang.String r5 = "application/x-mp4-vtt"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0060
            goto L_0x0077
        L_0x0060:
            r4 = 2
            goto L_0x0077
        L_0x0062:
            java.lang.String r5 = "application/pgs"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x006b
            goto L_0x0077
        L_0x006b:
            r4 = 1
            goto L_0x0077
        L_0x006d:
            java.lang.String r5 = "application/dvbsubs"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r4 = 0
        L_0x0077:
            switch(r4) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x00a0;
                case 2: goto L_0x009a;
                case 3: goto L_0x0094;
                case 4: goto L_0x008e;
                case 5: goto L_0x0087;
                case 6: goto L_0x0081;
                case 7: goto L_0x007b;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x00ad
        L_0x007b:
            S1.e r7 = new S1.e
            r7.<init>()
            goto L_0x00ac
        L_0x0081:
            R1.a r7 = new R1.a
            r7.<init>()
            goto L_0x00ac
        L_0x0087:
            Q1.a r0 = new Q1.a
            r0.<init>(r7)
        L_0x008c:
            r7 = r0
            goto L_0x00ac
        L_0x008e:
            T1.a r0 = new T1.a
            r0.<init>(r7)
            goto L_0x008c
        L_0x0094:
            R2.c r7 = new R2.c
            r7.<init>((int) r0, (byte) r2)
            goto L_0x00ac
        L_0x009a:
            U1.a r7 = new U1.a
            r7.<init>(r2)
            goto L_0x00ac
        L_0x00a0:
            B3.q r7 = new B3.q
            r7.<init>((int) r1)
            goto L_0x00ac
        L_0x00a6:
            O1.h r0 = new O1.h
            r0.<init>(r7)
            goto L_0x008c
        L_0x00ac:
            return r7
        L_0x00ad:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported MIME type: "
            java.lang.String r0 = u.C1477r.d(r0, r3)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.i.j(M0.r):M1.l");
    }

    public int k(M0.r rVar) {
        if (rVar.f3040r != null) {
            return 1;
        }
        return 0;
    }

    public void l() {
        switch (this.f2568U) {
            case 26:
                return;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                return;
        }
    }

    public /* synthetic */ Y0.g m(e eVar, M0.r rVar) {
        return Y0.g.f6318a;
    }

    public Object n(Uri uri, R0.j jVar) {
        return Long.valueOf(P0.z.R(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    public int o(M0.r rVar) {
        switch (this.f2568U) {
            case 9:
                String str = rVar.f3036n;
                if (str != null) {
                    char c8 = 65535;
                    switch (str.hashCode()) {
                        case -1351681404:
                            if (str.equals("application/dvbsubs")) {
                                c8 = 0;
                                break;
                            }
                            break;
                        case -1248334819:
                            if (str.equals("application/pgs")) {
                                c8 = 1;
                                break;
                            }
                            break;
                        case -1026075066:
                            if (str.equals("application/x-mp4-vtt")) {
                                c8 = 2;
                                break;
                            }
                            break;
                        case -1004728940:
                            if (str.equals("text/vtt")) {
                                c8 = 3;
                                break;
                            }
                            break;
                        case 691401887:
                            if (str.equals("application/x-quicktime-tx3g")) {
                                c8 = 4;
                                break;
                            }
                            break;
                        case 822864842:
                            if (str.equals("text/x-ssa")) {
                                c8 = 5;
                                break;
                            }
                            break;
                        case 1668750253:
                            if (str.equals("application/x-subrip")) {
                                c8 = 6;
                                break;
                            }
                            break;
                        case 1693976202:
                            if (str.equals("application/ttml+xml")) {
                                c8 = 7;
                                break;
                            }
                            break;
                    }
                    switch (c8) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                            return 2;
                        case 3:
                        case 5:
                        case 6:
                        case 7:
                            return 1;
                    }
                }
                throw new IllegalArgumentException(C1477r.d("Unsupported MIME type: ", str));
            default:
                return 1;
        }
    }

    public void p(long j7) {
    }

    public int q(B2.i iVar) {
        return 1;
    }

    public void r(E2.b bVar, Bitmap bitmap) {
    }

    public /* synthetic */ void release() {
    }

    public void s() {
    }

    public i(Context context, g gVar) {
        this.f2568U = 18;
        f.e(context, "context");
        ViewConfiguration.get(context).getScaledTouchSlop();
        new GestureDetector(context, new V.a(0, this));
    }

    /* renamed from: d  reason: collision with other method in class */
    public ServerSocket m5d() {
        return new ServerSocket();
    }
}
