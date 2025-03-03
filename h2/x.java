package H2;

import B2.i;
import D2.D;
import K2.C0112d;
import M0.I;
import M0.r;
import P2.a;
import Y1.J;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.InputStream;

public final class x implements r, a, J {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f1995U;

    /* renamed from: V  reason: collision with root package name */
    public final Resources f1996V;

    public /* synthetic */ x(Resources resources, int i) {
        this.f1995U = i;
        this.f1996V = resources;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(M0.r r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.f3028d
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0034
            java.lang.String r1 = "und"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0013
            goto L_0x0034
        L_0x0013:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            int r1 = P0.z.f3748a
            r3 = 24
            if (r1 < r3) goto L_0x0026
            java.util.Locale$Category r1 = java.util.Locale.Category.DISPLAY
            java.util.Locale r1 = java.util.Locale.getDefault(r1)
            goto L_0x002a
        L_0x0026:
            java.util.Locale r1 = java.util.Locale.getDefault()
        L_0x002a:
            java.lang.String r0 = r0.getDisplayName(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0036
        L_0x0034:
            r0 = r2
            goto L_0x0059
        L_0x0036:
            r3 = 1
            r4 = 0
            int r3 = r0.offsetByCodePoints(r4, r3)     // Catch:{ IndexOutOfBoundsException -> 0x0058 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x0058 }
            r5.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x0058 }
            java.lang.String r4 = r0.substring(r4, r3)     // Catch:{ IndexOutOfBoundsException -> 0x0058 }
            java.lang.String r1 = r4.toUpperCase(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0058 }
            r5.append(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0058 }
            java.lang.String r1 = r0.substring(r3)     // Catch:{ IndexOutOfBoundsException -> 0x0058 }
            r5.append(r1)     // Catch:{ IndexOutOfBoundsException -> 0x0058 }
            java.lang.String r0 = r5.toString()     // Catch:{ IndexOutOfBoundsException -> 0x0058 }
            goto L_0x0059
        L_0x0058:
        L_0x0059:
            java.lang.String r1 = r6.b(r7)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.lang.String r0 = r6.e(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0076
            java.lang.String r7 = r7.f3026b
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r2 = r7
        L_0x0075:
            r0 = r2
        L_0x0076:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H2.x.a(M0.r):java.lang.String");
    }

    public String b(r rVar) {
        String str;
        int i = rVar.f3029f & 2;
        Resources resources = this.f1996V;
        if (i != 0) {
            str = resources.getString(2131951759);
        } else {
            str = "";
        }
        int i8 = rVar.f3029f;
        if ((i8 & 4) != 0) {
            str = e(str, resources.getString(2131951762));
        }
        if ((i8 & 8) != 0) {
            str = e(str, resources.getString(2131951761));
        }
        if ((i8 & 1088) != 0) {
            return e(str, resources.getString(2131951760));
        }
        return str;
    }

    public String c(r rVar) {
        String str;
        String str2;
        String str3;
        int i = I.i(rVar.f3036n);
        int i8 = rVar.f3014C;
        int i9 = rVar.f3044v;
        int i10 = rVar.f3043u;
        if (i == -1) {
            String str4 = rVar.f3033k;
            if (I.j(str4) == null) {
                if (I.b(str4) == null) {
                    if (i10 == -1 && i9 == -1) {
                        if (i8 == -1 && rVar.f3015D == -1) {
                            i = -1;
                        }
                    }
                }
                i = 1;
            }
            i = 2;
        }
        Resources resources = this.f1996V;
        String str5 = "";
        int i11 = rVar.f3032j;
        if (i == 2) {
            String b8 = b(rVar);
            if (i10 == -1 || i9 == -1) {
                str3 = str5;
            } else {
                str3 = resources.getString(2131951758, new Object[]{Integer.valueOf(i10), Integer.valueOf(i9)});
            }
            if (i11 != -1) {
                str5 = resources.getString(2131951756, new Object[]{Float.valueOf(((float) i11) / 1000000.0f)});
            }
            str = e(b8, str3, str5);
        } else if (i == 1) {
            String a8 = a(rVar);
            if (i8 == -1 || i8 < 1) {
                str2 = str5;
            } else if (i8 == 1) {
                str2 = resources.getString(2131951757);
            } else if (i8 == 2) {
                str2 = resources.getString(2131951766);
            } else if (i8 == 6 || i8 == 7) {
                str2 = resources.getString(2131951768);
            } else if (i8 != 8) {
                str2 = resources.getString(2131951767);
            } else {
                str2 = resources.getString(2131951769);
            }
            if (i11 != -1) {
                str5 = resources.getString(2131951756, new Object[]{Float.valueOf(((float) i11) / 1000000.0f)});
            }
            str = e(a8, str2, str5);
        } else {
            str = a(rVar);
        }
        if (str.length() != 0) {
            return str;
        }
        String str6 = rVar.f3028d;
        if (str6 == null || str6.trim().isEmpty()) {
            return resources.getString(2131951770);
        }
        return resources.getString(2131951771, new Object[]{str6});
    }

    public D d(D d8, i iVar) {
        if (d8 == null) {
            return null;
        }
        return new C0112d(this.f1996V, d8);
    }

    public String e(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                if (TextUtils.isEmpty(str)) {
                    str = str2;
                } else {
                    str = this.f1996V.getString(2131951755, new Object[]{str, str2});
                }
            }
        }
        return str;
    }

    public q m0(w wVar) {
        switch (this.f1995U) {
            case 0:
                return new C0081b(this.f1996V, wVar.b(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C0081b(this.f1996V, wVar.b(Uri.class, InputStream.class));
            default:
                return new C0081b(this.f1996V, (q) A.f1933b);
        }
    }

    public x(Resources resources) {
        this.f1995U = 4;
        resources.getClass();
        this.f1996V = resources;
    }
}
