package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.w  reason: case insensitive filesystem */
public final class C0511w {

    /* renamed from: a  reason: collision with root package name */
    public boolean f8534a;

    /* renamed from: b  reason: collision with root package name */
    public int f8535b;

    /* renamed from: c  reason: collision with root package name */
    public int f8536c;

    /* renamed from: d  reason: collision with root package name */
    public int f8537d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f8538f;

    /* renamed from: g  reason: collision with root package name */
    public int f8539g;

    /* renamed from: h  reason: collision with root package name */
    public int f8540h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f8541j;

    /* renamed from: k  reason: collision with root package name */
    public List f8542k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f8543l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.f8542k.size();
        View view2 = null;
        int i8 = Integer.MAX_VALUE;
        for (int i9 = 0; i9 < size; i9++) {
            View view3 = ((j0) this.f8542k.get(i9)).itemView;
            S s8 = (S) view3.getLayoutParams();
            if (view3 != view && !s8.f8323U.isRemoved() && (layoutPosition = (s8.f8323U.getLayoutPosition() - this.f8537d) * this.e) >= 0 && layoutPosition < i8) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                }
                i8 = layoutPosition;
            }
        }
        if (view2 == null) {
            this.f8537d = -1;
        } else {
            this.f8537d = ((S) view2.getLayoutParams()).f8323U.getLayoutPosition();
        }
    }

    public final View b(Z z) {
        List list = this.f8542k;
        if (list != null) {
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                View view = ((j0) this.f8542k.get(i8)).itemView;
                S s8 = (S) view.getLayoutParams();
                if (!s8.f8323U.isRemoved() && this.f8537d == s8.f8323U.getLayoutPosition()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View view2 = z.l(this.f8537d, Long.MAX_VALUE).itemView;
        this.f8537d += this.e;
        return view2;
    }
}
