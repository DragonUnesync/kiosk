package r0;

import android.util.Base64;
import java.util.List;

/* renamed from: r0.d  reason: case insensitive filesystem */
public final class C1370d {

    /* renamed from: a  reason: collision with root package name */
    public final String f14794a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14795b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14796c;

    /* renamed from: d  reason: collision with root package name */
    public final List f14797d;
    public final String e;

    public C1370d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f14794a = str;
        str2.getClass();
        this.f14795b = str2;
        this.f14796c = str3;
        list.getClass();
        this.f14797d = list;
        this.e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f14794a + ", mProviderPackage: " + this.f14795b + ", mQuery: " + this.f14796c + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f14797d;
            if (i < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i);
                for (int i8 = 0; i8 < list2.size(); i8++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i8), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }
}
