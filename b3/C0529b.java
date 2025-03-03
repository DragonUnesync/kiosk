package b3;

import java.util.Locale;

/* renamed from: b3.b  reason: case insensitive filesystem */
public final class C0529b implements Comparable {

    /* renamed from: U  reason: collision with root package name */
    public String f8659U;

    /* renamed from: V  reason: collision with root package name */
    public String f8660V;

    /* renamed from: W  reason: collision with root package name */
    public boolean f8661W;

    /* renamed from: X  reason: collision with root package name */
    public long f8662X;

    public final int compareTo(Object obj) {
        C0529b bVar = (C0529b) obj;
        boolean z = bVar.f8661W;
        if (z && this.f8661W) {
            return this.f8659U.toLowerCase().compareTo(bVar.f8659U.toLowerCase(Locale.getDefault()));
        }
        if (!z && !this.f8661W) {
            return this.f8659U.toLowerCase().compareTo(bVar.f8659U.toLowerCase(Locale.getDefault()));
        }
        if (!z || this.f8661W) {
            return -1;
        }
        return 1;
    }
}
