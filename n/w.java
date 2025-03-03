package n;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;

public class w {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13544a;

    /* renamed from: b  reason: collision with root package name */
    public final m f13545b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13546c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13547d;
    public View e;

    /* renamed from: f  reason: collision with root package name */
    public int f13548f = 8388611;

    /* renamed from: g  reason: collision with root package name */
    public boolean f13549g;

    /* renamed from: h  reason: collision with root package name */
    public x f13550h;
    public u i;

    /* renamed from: j  reason: collision with root package name */
    public v f13551j;

    /* renamed from: k  reason: collision with root package name */
    public final v f13552k = new v(this);

    public w(int i8, Context context, View view, m mVar, boolean z) {
        this.f13544a = context;
        this.f13545b = mVar;
        this.e = view;
        this.f13546c = z;
        this.f13547d = i8;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [n.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n.u a() {
        /*
            r11 = this;
            n.u r0 = r11.i
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "window"
            android.content.Context r1 = r11.f13544a
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getRealSize(r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r2 = r1.getResources()
            r3 = 2131165206(0x7f070016, float:1.7944623E38)
            int r2 = r2.getDimensionPixelSize(r3)
            if (r0 < r2) goto L_0x003b
            n.g r0 = new n.g
            android.view.View r2 = r11.e
            int r3 = r11.f13547d
            boolean r4 = r11.f13546c
            r0.<init>(r1, r2, r3, r4)
            goto L_0x004b
        L_0x003b:
            n.D r0 = new n.D
            android.view.View r8 = r11.e
            android.content.Context r7 = r11.f13544a
            boolean r10 = r11.f13546c
            n.m r9 = r11.f13545b
            int r6 = r11.f13547d
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x004b:
            n.m r1 = r11.f13545b
            r0.l(r1)
            n.v r1 = r11.f13552k
            r0.r(r1)
            android.view.View r1 = r11.e
            r0.n(r1)
            n.x r1 = r11.f13550h
            r0.j(r1)
            boolean r1 = r11.f13549g
            r0.o(r1)
            int r1 = r11.f13548f
            r0.p(r1)
            r11.i = r0
        L_0x006b:
            n.u r0 = r11.i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.w.a():n.u");
    }

    public final boolean b() {
        u uVar = this.i;
        if (uVar == null || !uVar.b()) {
            return false;
        }
        return true;
    }

    public void c() {
        this.i = null;
        v vVar = this.f13551j;
        if (vVar != null) {
            vVar.onDismiss();
        }
    }

    public final void d(int i8, int i9, boolean z, boolean z6) {
        u a8 = a();
        a8.s(z6);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.f13548f, this.e.getLayoutDirection()) & 7) == 5) {
                i8 -= this.e.getWidth();
            }
            a8.q(i8);
            a8.t(i9);
            int i10 = (int) ((this.f13544a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a8.f13542U = new Rect(i8 - i10, i9 - i10, i8 + i10, i9 + i10);
        }
        a8.c();
    }
}
