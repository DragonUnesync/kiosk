package h;

import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import android.view.View;

/* renamed from: h.g  reason: case insensitive filesystem */
public class C1019g {

    /* renamed from: a  reason: collision with root package name */
    public final C1016d f12206a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12207b;

    public C1019g(Context context) {
        this(context, C1020h.i(context, 0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.widget.ArrayAdapter} */
    /* JADX WARNING: type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h.C1020h create() {
        /*
            r11 = this;
            h.h r0 = new h.h
            h.d r1 = r11.f12206a
            android.view.ContextThemeWrapper r2 = r1.f12165a
            int r3 = r11.f12207b
            r0.<init>(r2, r3)
            android.view.View r2 = r1.e
            h.f r3 = r0.f12210Z
            r4 = 0
            if (r2 == 0) goto L_0x0015
            r3.f12202v = r2
            goto L_0x0034
        L_0x0015:
            java.lang.CharSequence r2 = r1.f12168d
            if (r2 == 0) goto L_0x0022
            r3.f12186d = r2
            android.widget.TextView r5 = r3.f12200t
            if (r5 == 0) goto L_0x0022
            r5.setText(r2)
        L_0x0022:
            android.graphics.drawable.Drawable r2 = r1.f12167c
            if (r2 == 0) goto L_0x0034
            r3.f12198r = r2
            android.widget.ImageView r5 = r3.f12199s
            if (r5 == 0) goto L_0x0034
            r5.setVisibility(r4)
            android.widget.ImageView r5 = r3.f12199s
            r5.setImageDrawable(r2)
        L_0x0034:
            java.lang.CharSequence r2 = r1.f12169f
            if (r2 != 0) goto L_0x0039
            goto L_0x003f
        L_0x0039:
            android.content.DialogInterface$OnClickListener r5 = r1.f12170g
            r6 = -1
            r3.d(r6, r2, r5)
        L_0x003f:
            java.lang.CharSequence r2 = r1.f12171h
            if (r2 != 0) goto L_0x0044
            goto L_0x004a
        L_0x0044:
            android.content.DialogInterface$OnClickListener r5 = r1.i
            r6 = -2
            r3.d(r6, r2, r5)
        L_0x004a:
            java.lang.Object r2 = r1.f12173k
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x008d
            int r2 = r3.z
            android.view.LayoutInflater r7 = r1.f12166b
            android.view.View r2 = r7.inflate(r2, r6)
            androidx.appcompat.app.AlertController$RecycleListView r2 = (androidx.appcompat.app.AlertController$RecycleListView) r2
            boolean r7 = r1.f12176n
            if (r7 == 0) goto L_0x0061
            int r7 = r3.f12178A
            goto L_0x0063
        L_0x0061:
            int r7 = r3.f12179B
        L_0x0063:
            java.lang.Object r8 = r1.f12173k
            if (r8 == 0) goto L_0x0068
            goto L_0x0072
        L_0x0068:
            h.e r8 = new h.e
            android.view.ContextThemeWrapper r9 = r1.f12165a
            r10 = 16908308(0x1020014, float:2.3877285E-38)
            r8.<init>(r9, r7, r10, r6)
        L_0x0072:
            r3.f12203w = r8
            int r7 = r1.f12177o
            r3.f12204x = r7
            android.content.DialogInterface$OnClickListener r7 = r1.f12174l
            if (r7 == 0) goto L_0x0084
            h.c r7 = new h.c
            r7.<init>(r1, r3)
            r2.setOnItemClickListener(r7)
        L_0x0084:
            boolean r7 = r1.f12176n
            if (r7 == 0) goto L_0x008b
            r2.setChoiceMode(r5)
        L_0x008b:
            r3.e = r2
        L_0x008d:
            android.view.View r2 = r1.f12175m
            if (r2 == 0) goto L_0x0095
            r3.f12187f = r2
            r3.f12188g = r4
        L_0x0095:
            r0.setCancelable(r5)
            r0.setCanceledOnTouchOutside(r5)
            r0.setOnCancelListener(r6)
            r0.setOnDismissListener(r6)
            n.n r1 = r1.f12172j
            if (r1 == 0) goto L_0x00a8
            r0.setOnKeyListener(r1)
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1019g.create():h.h");
    }

    public Context getContext() {
        return this.f12206a.f12165a;
    }

    public C1019g setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        C1016d dVar = this.f12206a;
        dVar.f12171h = dVar.f12165a.getText(i);
        dVar.i = onClickListener;
        return this;
    }

    public C1019g setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        C1016d dVar = this.f12206a;
        dVar.f12169f = dVar.f12165a.getText(i);
        dVar.f12170g = onClickListener;
        return this;
    }

    public C1019g setTitle(CharSequence charSequence) {
        this.f12206a.f12168d = charSequence;
        return this;
    }

    public C1019g setView(View view) {
        this.f12206a.f12175m = view;
        return this;
    }

    public C1019g(Context context, int i) {
        this.f12206a = new C1016d(new ContextThemeWrapper(context, C1020h.i(context, i)));
        this.f12207b = i;
    }
}
