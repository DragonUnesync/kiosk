package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.m  reason: case insensitive filesystem */
public final class C0502m extends W {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0505p f8447a;

    public C0502m(C0505p pVar) {
        this.f8447a = pVar;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i8) {
        boolean z;
        boolean z6;
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        C0505p pVar = this.f8447a;
        int computeVerticalScrollRange = pVar.f8480s.computeVerticalScrollRange();
        int i9 = pVar.f8479r;
        int i10 = computeVerticalScrollRange - i9;
        int i11 = pVar.f8464a;
        if (i10 <= 0 || i9 < i11) {
            z = false;
        } else {
            z = true;
        }
        pVar.f8481t = z;
        int computeHorizontalScrollRange = pVar.f8480s.computeHorizontalScrollRange();
        int i12 = pVar.f8478q;
        if (computeHorizontalScrollRange - i12 <= 0 || i12 < i11) {
            z6 = false;
        } else {
            z6 = true;
        }
        pVar.f8482u = z6;
        boolean z8 = pVar.f8481t;
        if (z8 || z6) {
            if (z8) {
                float f8 = (float) i9;
                pVar.f8473l = (int) ((((f8 / 2.0f) + ((float) computeVerticalScrollOffset)) * f8) / ((float) computeVerticalScrollRange));
                pVar.f8472k = Math.min(i9, (i9 * i9) / computeVerticalScrollRange);
            }
            if (pVar.f8482u) {
                float f9 = (float) computeHorizontalScrollOffset;
                float f10 = (float) i12;
                pVar.f8476o = (int) ((((f10 / 2.0f) + f9) * f10) / ((float) computeHorizontalScrollRange));
                pVar.f8475n = Math.min(i12, (i12 * i12) / computeHorizontalScrollRange);
            }
            int i13 = pVar.f8483v;
            if (i13 == 0 || i13 == 1) {
                pVar.d(1);
            }
        } else if (pVar.f8483v != 0) {
            pVar.d(0);
        }
    }
}
