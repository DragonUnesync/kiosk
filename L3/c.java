package l3;

import D7.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import v0.C1510H;
import z3.f;
import z3.g;
import z3.k;
import z3.u;

public final class c {

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f13170u = true;

    /* renamed from: v  reason: collision with root package name */
    public static final boolean f13171v;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f13172a;

    /* renamed from: b  reason: collision with root package name */
    public k f13173b;

    /* renamed from: c  reason: collision with root package name */
    public int f13174c;

    /* renamed from: d  reason: collision with root package name */
    public int f13175d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f13176f;

    /* renamed from: g  reason: collision with root package name */
    public int f13177g;

    /* renamed from: h  reason: collision with root package name */
    public int f13178h;
    public PorterDuff.Mode i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f13179j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f13180k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f13181l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f13182m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13183n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f13184o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f13185p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f13186q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f13187r = true;

    /* renamed from: s  reason: collision with root package name */
    public LayerDrawable f13188s;

    /* renamed from: t  reason: collision with root package name */
    public int f13189t;

    static {
        int i8 = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i8 > 22) {
            z = false;
        }
        f13171v = z;
    }

    public c(MaterialButton materialButton, k kVar) {
        this.f13172a = materialButton;
        this.f13173b = kVar;
    }

    public final u a() {
        LayerDrawable layerDrawable = this.f13188s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f13188s.getNumberOfLayers() > 2) {
            return (u) this.f13188s.getDrawable(2);
        }
        return (u) this.f13188s.getDrawable(1);
    }

    public final g b(boolean z) {
        LayerDrawable layerDrawable = this.f13188s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        if (f13170u) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f13188s.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
        }
        return (g) this.f13188s.getDrawable(z ^ true ? 1 : 0);
    }

    public final void c(k kVar) {
        this.f13173b = kVar;
        if (!f13171v || this.f13184o) {
            if (b(false) != null) {
                b(false).setShapeAppearanceModel(kVar);
            }
            if (b(true) != null) {
                b(true).setShapeAppearanceModel(kVar);
            }
            if (a() != null) {
                a().setShapeAppearanceModel(kVar);
                return;
            }
            return;
        }
        WeakHashMap weakHashMap = C1510H.f15874a;
        MaterialButton materialButton = this.f13172a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        e();
        materialButton.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    public final void d(int i8, int i9) {
        WeakHashMap weakHashMap = C1510H.f15874a;
        MaterialButton materialButton = this.f13172a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i10 = this.e;
        int i11 = this.f13176f;
        this.f13176f = i9;
        this.e = i8;
        if (!this.f13184o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i8) - i10, paddingEnd, (paddingBottom + i9) - i11);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [android.graphics.drawable.Drawable$ConstantState, x3.a] */
    /* JADX WARNING: type inference failed for: r6v11, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r14 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            z3.g r3 = new z3.g
            z3.k r4 = r14.f13173b
            r3.<init>((z3.k) r4)
            com.google.android.material.button.MaterialButton r4 = r14.f13172a
            android.content.Context r5 = r4.getContext()
            r3.h(r5)
            android.content.res.ColorStateList r5 = r14.f13179j
            r3.setTintList(r5)
            android.graphics.PorterDuff$Mode r5 = r14.i
            if (r5 == 0) goto L_0x001f
            r3.setTintMode(r5)
        L_0x001f:
            int r5 = r14.f13178h
            float r5 = (float) r5
            android.content.res.ColorStateList r6 = r14.f13180k
            z3.f r7 = r3.f16469U
            r7.f16461j = r5
            r3.invalidateSelf()
            z3.f r5 = r3.f16469U
            android.content.res.ColorStateList r7 = r5.f16457d
            if (r7 == r6) goto L_0x003a
            r5.f16457d = r6
            int[] r5 = r3.getState()
            r3.onStateChange(r5)
        L_0x003a:
            z3.g r5 = new z3.g
            z3.k r6 = r14.f13173b
            r5.<init>((z3.k) r6)
            r5.setTint(r2)
            int r6 = r14.f13178h
            float r6 = (float) r6
            boolean r7 = r14.f13183n
            if (r7 == 0) goto L_0x0053
            r7 = 2130968856(0x7f040118, float:1.7546377E38)
            int r7 = D7.b.o(r4, r7)
            goto L_0x0054
        L_0x0053:
            r7 = 0
        L_0x0054:
            z3.f r8 = r5.f16469U
            r8.f16461j = r6
            r5.invalidateSelf()
            android.content.res.ColorStateList r6 = android.content.res.ColorStateList.valueOf(r7)
            z3.f r7 = r5.f16469U
            android.content.res.ColorStateList r8 = r7.f16457d
            if (r8 == r6) goto L_0x006e
            r7.f16457d = r6
            int[] r6 = r5.getState()
            r5.onStateChange(r6)
        L_0x006e:
            boolean r6 = f13170u
            if (r6 == 0) goto L_0x00a8
            z3.g r6 = new z3.g
            z3.k r7 = r14.f13173b
            r6.<init>((z3.k) r7)
            r14.f13182m = r6
            r7 = -1
            r6.setTint(r7)
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r7 = r14.f13181l
            android.content.res.ColorStateList r7 = x3.d.a(r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
            r1[r2] = r5
            r1[r0] = r3
            r9.<init>(r1)
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f13174c
            int r11 = r14.e
            int r12 = r14.f13175d
            int r13 = r14.f13176f
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            android.graphics.drawable.Drawable r1 = r14.f13182m
            r6.<init>(r7, r0, r1)
            r14.f13188s = r6
            goto L_0x00e8
        L_0x00a8:
            x3.b r6 = new x3.b
            z3.k r7 = r14.f13173b
            x3.a r8 = new x3.a
            z3.g r9 = new z3.g
            r9.<init>((z3.k) r7)
            r8.<init>()
            r8.f16266a = r9
            r8.f16267b = r2
            r6.<init>(r8)
            r14.f13182m = r6
            android.content.res.ColorStateList r7 = r14.f13181l
            android.content.res.ColorStateList r7 = x3.d.a(r7)
            r6.setTintList(r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable r6 = r14.f13182m
            r7 = 3
            android.graphics.drawable.Drawable[] r7 = new android.graphics.drawable.Drawable[r7]
            r7[r2] = r5
            r7[r0] = r3
            r7[r1] = r6
            r9.<init>(r7)
            r14.f13188s = r9
            android.graphics.drawable.InsetDrawable r6 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f13174c
            int r11 = r14.e
            int r12 = r14.f13175d
            int r13 = r14.f13176f
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00e8:
            r4.setInternalBackground(r6)
            z3.g r0 = r14.b(r2)
            if (r0 == 0) goto L_0x00fe
            int r1 = r14.f13189t
            float r1 = (float) r1
            r0.i(r1)
            int[] r1 = r4.getDrawableState()
            r0.setState(r1)
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.c.e():void");
    }

    public final void f() {
        int i8 = 0;
        g b8 = b(false);
        g b9 = b(true);
        if (b8 != null) {
            ColorStateList colorStateList = this.f13180k;
            b8.f16469U.f16461j = (float) this.f13178h;
            b8.invalidateSelf();
            f fVar = b8.f16469U;
            if (fVar.f16457d != colorStateList) {
                fVar.f16457d = colorStateList;
                b8.onStateChange(b8.getState());
            }
            if (b9 != null) {
                float f8 = (float) this.f13178h;
                if (this.f13183n) {
                    i8 = b.o(this.f13172a, 2130968856);
                }
                b9.f16469U.f16461j = f8;
                b9.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i8);
                f fVar2 = b9.f16469U;
                if (fVar2.f16457d != valueOf) {
                    fVar2.f16457d = valueOf;
                    b9.onStateChange(b9.getState());
                }
            }
        }
    }
}
