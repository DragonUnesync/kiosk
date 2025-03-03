package z2;

import com.bumptech.glide.j;
import java.io.File;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f16422a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f16423b;

    /* renamed from: c  reason: collision with root package name */
    public final File[] f16424c;

    /* renamed from: d  reason: collision with root package name */
    public final File[] f16425d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public j f16426f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c f16427g;

    public b(c cVar, String str) {
        this.f16427g = cVar;
        this.f16422a = str;
        int i = cVar.f16434a0;
        this.f16423b = new long[i];
        this.f16424c = new File[i];
        this.f16425d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i8 = 0; i8 < cVar.f16434a0; i8++) {
            sb.append(i8);
            File[] fileArr = this.f16424c;
            String sb2 = sb.toString();
            File file = cVar.f16428U;
            fileArr[i8] = new File(file, sb2);
            sb.append(".tmp");
            this.f16425d[i8] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long append : this.f16423b) {
            sb.append(' ');
            sb.append(append);
        }
        return sb.toString();
    }
}
