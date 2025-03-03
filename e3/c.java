package e3;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int f11202a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    public int f11203b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f11204c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d  reason: collision with root package name */
    public int f11205d = RecyclerView.UNDEFINED_DURATION;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f11206f;

    /* renamed from: g  reason: collision with root package name */
    public int f11207g;

    /* renamed from: h  reason: collision with root package name */
    public int f11208h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public float f11209j;

    /* renamed from: k  reason: collision with root package name */
    public float f11210k;

    /* renamed from: l  reason: collision with root package name */
    public int f11211l;

    /* renamed from: m  reason: collision with root package name */
    public int f11212m;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f11213n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public int f11214o;

    /* renamed from: p  reason: collision with root package name */
    public int f11215p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f11216q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f11217r;

    public final int a() {
        return this.f11208h - this.i;
    }

    public final void b(View view, int i8, int i9, int i10, int i11) {
        b bVar = (b) view.getLayoutParams();
        this.f11202a = Math.min(this.f11202a, (view.getLeft() - bVar.r()) - i8);
        this.f11203b = Math.min(this.f11203b, (view.getTop() - bVar.u()) - i9);
        this.f11204c = Math.max(this.f11204c, bVar.j() + view.getRight() + i10);
        this.f11205d = Math.max(this.f11205d, bVar.q() + view.getBottom() + i11);
    }
}
