package m4;

import D4.j;
import T5.K;

/* renamed from: m4.c  reason: case insensitive filesystem */
public final class C1215c {

    /* renamed from: a  reason: collision with root package name */
    public final short f13368a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f13369b;

    /* renamed from: c  reason: collision with root package name */
    public final short f13370c;

    /* renamed from: d  reason: collision with root package name */
    public final short f13371d;
    public final short e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13372f;

    /* renamed from: g  reason: collision with root package name */
    public final j f13373g;

    /* renamed from: h  reason: collision with root package name */
    public final K f13374h;
    public final int i;

    public C1215c(int i8, boolean z, boolean z6, long j7, boolean z8, int i9, int i10, boolean z9, boolean z10, int i11, int i12, int i13, boolean z11, boolean z12, boolean z13, boolean z14, K k8) {
        j jVar;
        boolean z15;
        int i14 = i13;
        this.f13368a = (short) i8;
        this.f13369b = (int) j7;
        this.f13370c = (short) i9;
        this.f13371d = (short) i10;
        this.e = (short) i11;
        this.f13372f = i12;
        if (i14 == 0) {
            jVar = null;
        } else {
            jVar = new j(i14);
        }
        this.f13373g = jVar;
        this.f13374h = k8;
        if (z9) {
            z15 = z8 | true;
        } else {
            z15 = z8;
        }
        z15 = z10 ? z15 | true : z15;
        z15 = z11 ? z15 | true : z15;
        z15 = z12 ? z15 | true : z15;
        z15 = z13 ? z15 | true : z15;
        z15 = z14 ? z15 | true : z15;
        z15 = z ? z15 | true : z15;
        this.i = z6 ? z15 | true : z15 ? 1 : 0;
    }
}
