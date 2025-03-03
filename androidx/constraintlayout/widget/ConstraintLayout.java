package androidx.constraintlayout.widget;

import T3.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import c0.C0607e;
import com.samsung.android.knox.EnterpriseDeviceManager;
import d0.d;
import d0.e;
import d0.h;
import de.ozerov.fully.K2;
import f0.C0875c;
import f0.C0876d;
import f0.C0877e;
import f0.l;
import f0.m;
import f0.n;
import f0.p;
import java.util.ArrayList;
import java.util.HashMap;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: U  reason: collision with root package name */
    public final SparseArray f7690U = new SparseArray();

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f7691V = new ArrayList(4);

    /* renamed from: W  reason: collision with root package name */
    public final e f7692W = new e();

    /* renamed from: a0  reason: collision with root package name */
    public int f7693a0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    public int f7694b0 = 0;

    /* renamed from: c0  reason: collision with root package name */
    public int f7695c0 = Integer.MAX_VALUE;

    /* renamed from: d0  reason: collision with root package name */
    public int f7696d0 = Integer.MAX_VALUE;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7697e0 = true;

    /* renamed from: f0  reason: collision with root package name */
    public int f7698f0 = 263;

    /* renamed from: g0  reason: collision with root package name */
    public l f7699g0 = null;

    /* renamed from: h0  reason: collision with root package name */
    public K2 f7700h0 = null;

    /* renamed from: i0  reason: collision with root package name */
    public int f7701i0 = -1;

    /* renamed from: j0  reason: collision with root package name */
    public HashMap f7702j0 = new HashMap();

    /* renamed from: k0  reason: collision with root package name */
    public final SparseArray f7703k0 = new SparseArray();

    /* renamed from: l0  reason: collision with root package name */
    public final a f7704l0 = new a(this);

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet, 0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, f0.e] */
    public static C0877e a() {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.f11331a = -1;
        marginLayoutParams.f11333b = -1;
        marginLayoutParams.f11335c = -1.0f;
        marginLayoutParams.f11337d = -1;
        marginLayoutParams.e = -1;
        marginLayoutParams.f11340f = -1;
        marginLayoutParams.f11342g = -1;
        marginLayoutParams.f11344h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f11347j = -1;
        marginLayoutParams.f11349k = -1;
        marginLayoutParams.f11351l = -1;
        marginLayoutParams.f11352m = -1;
        marginLayoutParams.f11353n = 0;
        marginLayoutParams.f11354o = 0.0f;
        marginLayoutParams.f11355p = -1;
        marginLayoutParams.f11356q = -1;
        marginLayoutParams.f11357r = -1;
        marginLayoutParams.f11358s = -1;
        marginLayoutParams.f11359t = -1;
        marginLayoutParams.f11360u = -1;
        marginLayoutParams.f11361v = -1;
        marginLayoutParams.f11362w = -1;
        marginLayoutParams.f11363x = -1;
        marginLayoutParams.f11364y = -1;
        marginLayoutParams.z = 0.5f;
        marginLayoutParams.f11305A = 0.5f;
        marginLayoutParams.f11306B = null;
        marginLayoutParams.f11307C = 1;
        marginLayoutParams.f11308D = -1.0f;
        marginLayoutParams.f11309E = -1.0f;
        marginLayoutParams.f11310F = 0;
        marginLayoutParams.f11311G = 0;
        marginLayoutParams.f11312H = 0;
        marginLayoutParams.f11313I = 0;
        marginLayoutParams.f11314J = 0;
        marginLayoutParams.f11315K = 0;
        marginLayoutParams.f11316L = 0;
        marginLayoutParams.f11317M = 0;
        marginLayoutParams.f11318N = 1.0f;
        marginLayoutParams.f11319O = 1.0f;
        marginLayoutParams.f11320P = -1;
        marginLayoutParams.f11321Q = -1;
        marginLayoutParams.f11322R = -1;
        marginLayoutParams.f11323S = false;
        marginLayoutParams.f11324T = false;
        marginLayoutParams.f11325U = null;
        marginLayoutParams.f11326V = true;
        marginLayoutParams.f11327W = true;
        marginLayoutParams.f11328X = false;
        marginLayoutParams.f11329Y = false;
        marginLayoutParams.f11330Z = false;
        marginLayoutParams.f11332a0 = -1;
        marginLayoutParams.f11334b0 = -1;
        marginLayoutParams.f11336c0 = -1;
        marginLayoutParams.f11338d0 = -1;
        marginLayoutParams.f11339e0 = -1;
        marginLayoutParams.f11341f0 = -1;
        marginLayoutParams.f11343g0 = 0.5f;
        marginLayoutParams.f11350k0 = new d();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public final d b(View view) {
        if (view == this) {
            return this.f7692W;
        }
        if (view == null) {
            return null;
        }
        return ((C0877e) view.getLayoutParams()).f11350k0;
    }

    public final void c(AttributeSet attributeSet, int i) {
        e eVar = this.f7692W;
        eVar.f9602U = this;
        a aVar = this.f7704l0;
        eVar.f9637g0 = aVar;
        eVar.f9636f0.f10494f = aVar;
        this.f7690U.put(getId(), this);
        this.f7699g0 = null;
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f11457b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 9) {
                    this.f7693a0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f7693a0);
                } else if (index == 10) {
                    this.f7694b0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f7694b0);
                } else if (index == 7) {
                    this.f7695c0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f7695c0);
                } else if (index == 8) {
                    this.f7696d0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.f7696d0);
                } else if (index == 89) {
                    this.f7698f0 = obtainStyledAttributes.getInt(index, this.f7698f0);
                } else if (index == 38) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f7700h0 = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        l lVar = new l();
                        this.f7699g0 = lVar;
                        lVar.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f7699g0 = null;
                    }
                    this.f7701i0 = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        int i9 = this.f7698f0;
        eVar.p0 = i9;
        if ((i9 & 256) == 256) {
            z = true;
        }
        C0607e.f8720p = z;
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0877e;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(int r10) {
        /*
            r9 = this;
            de.ozerov.fully.K2 r0 = new de.ozerov.fully.K2
            android.content.Context r1 = r9.getContext()
            r2 = 5
            r0.<init>((int) r2)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f10050V = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f10051W = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            r3 = 0
        L_0x0025:
            r4 = 1
            if (r2 == r4) goto L_0x00c9
            if (r2 == 0) goto L_0x00b9
            r5 = 2
            if (r2 == r5) goto L_0x002f
            goto L_0x00bc
        L_0x002f:
            java.lang.String r2 = r10.getName()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            int r6 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L_0x006b;
                case 80204913: goto L_0x0061;
                case 1382829617: goto L_0x0057;
                case 1657696882: goto L_0x004d;
                case 1901439077: goto L_0x003d;
                default: goto L_0x003c;
            }     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
        L_0x003c:
            goto L_0x0075
        L_0x003d:
            java.lang.String r6 = "Variant"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            if (r6 == 0) goto L_0x0075
            r6 = 3
            goto L_0x0076
        L_0x0047:
            r10 = move-exception
            goto L_0x00c2
        L_0x004a:
            r10 = move-exception
            goto L_0x00c6
        L_0x004d:
            java.lang.String r6 = "layoutDescription"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            if (r6 == 0) goto L_0x0075
            r6 = 0
            goto L_0x0076
        L_0x0057:
            java.lang.String r6 = "StateSet"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            if (r6 == 0) goto L_0x0075
            r6 = 1
            goto L_0x0076
        L_0x0061:
            java.lang.String r6 = "State"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            if (r6 == 0) goto L_0x0075
            r6 = 2
            goto L_0x0076
        L_0x006b:
            java.lang.String r6 = "ConstraintSet"
            boolean r6 = r2.equals(r6)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            if (r6 == 0) goto L_0x0075
            r6 = 4
            goto L_0x0076
        L_0x0075:
            r6 = -1
        L_0x0076:
            if (r6 == 0) goto L_0x00bc
            if (r6 == r4) goto L_0x00bc
            if (r6 == r5) goto L_0x00aa
            if (r6 == r8) goto L_0x009b
            if (r6 == r7) goto L_0x0097
            java.lang.String r4 = "ConstraintLayoutStates"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            r5.<init>()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            java.lang.String r6 = "unknown tag "
            r5.append(r6)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            r5.append(r2)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            java.lang.String r2 = r5.toString()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            android.util.Log.v(r4, r2)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            goto L_0x00bc
        L_0x0097:
            r0.Q(r1, r10)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            goto L_0x00bc
        L_0x009b:
            f0.f r2 = new f0.f     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            r2.<init>(r1, r10)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            if (r3 == 0) goto L_0x00bc
            java.lang.Object r4 = r3.f2353W     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            r4.add(r2)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            goto L_0x00bc
        L_0x00aa:
            J1.d r3 = new J1.d     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            r3.<init>(r1, r10)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            java.lang.Object r2 = r0.f10050V     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            int r4 = r3.f2351U     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            r2.put(r4, r3)     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            goto L_0x00bc
        L_0x00b9:
            r10.getName()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
        L_0x00bc:
            int r2 = r10.next()     // Catch:{ XmlPullParserException -> 0x004a, IOException -> 0x0047 }
            goto L_0x0025
        L_0x00c2:
            r10.printStackTrace()
            goto L_0x00c9
        L_0x00c6:
            r10.printStackTrace()
        L_0x00c9:
            r9.f7700h0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.d(int):void");
    }

    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f7691V;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((C0875c) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i9 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i10 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f8 = (float) i9;
                        float f9 = (float) i10;
                        float f10 = (float) (i9 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f11 = f9;
                        float f12 = f9;
                        float f13 = f10;
                        float f14 = f8;
                        Paint paint2 = paint;
                        canvas2.drawLine(f8, f11, f13, f12, paint);
                        float parseInt4 = (float) (i10 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f15 = f10;
                        float f16 = parseInt4;
                        canvas2.drawLine(f15, f12, f13, f16, paint);
                        float f17 = parseInt4;
                        float f18 = f14;
                        canvas2.drawLine(f15, f17, f18, f16, paint);
                        float f19 = f14;
                        canvas2.drawLine(f19, f17, f18, f12, paint);
                        paint.setColor(-16711936);
                        float f20 = f10;
                        Paint paint3 = paint;
                        canvas2.drawLine(f19, f12, f20, parseInt4, paint);
                        canvas2.drawLine(f19, parseInt4, f20, f12, paint);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x033b  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0421  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0432  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x036a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:386:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01be A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(d0.e r26, int r27, int r28, int r29) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            int r3 = android.view.View.MeasureSpec.getMode(r28)
            int r4 = android.view.View.MeasureSpec.getSize(r28)
            int r5 = android.view.View.MeasureSpec.getMode(r29)
            int r6 = android.view.View.MeasureSpec.getSize(r29)
            int r7 = r25.getPaddingTop()
            r8 = 0
            int r7 = java.lang.Math.max(r8, r7)
            int r9 = r25.getPaddingBottom()
            int r9 = java.lang.Math.max(r8, r9)
            int r10 = r7 + r9
            int r11 = r25.getPaddingWidth()
            T3.a r12 = r0.f7704l0
            r12.f4999a = r7
            r12.f5000b = r9
            r12.f5001c = r11
            r12.f5002d = r10
            r9 = r28
            r12.e = r9
            r9 = r29
            r12.f5003f = r9
            int r9 = r25.getPaddingStart()
            int r9 = java.lang.Math.max(r8, r9)
            int r13 = r25.getPaddingEnd()
            int r13 = java.lang.Math.max(r8, r13)
            r14 = 1
            if (r9 > 0) goto L_0x005e
            if (r13 <= 0) goto L_0x0055
            goto L_0x005e
        L_0x0055:
            int r9 = r25.getPaddingLeft()
            int r9 = java.lang.Math.max(r8, r9)
            goto L_0x0075
        L_0x005e:
            android.content.Context r15 = r25.getContext()
            android.content.pm.ApplicationInfo r15 = r15.getApplicationInfo()
            int r15 = r15.flags
            r16 = 4194304(0x400000, float:5.877472E-39)
            r15 = r15 & r16
            if (r15 == 0) goto L_0x0075
            int r15 = r25.getLayoutDirection()
            if (r14 != r15) goto L_0x0075
            r9 = r13
        L_0x0075:
            int r4 = r4 - r11
            int r6 = r6 - r10
            int r10 = r12.f5002d
            int r11 = r12.f5001c
            int r12 = r25.getChildCount()
            r15 = 1073741824(0x40000000, float:2.0)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r13) goto L_0x00a5
            if (r3 == 0) goto L_0x0097
            if (r3 == r15) goto L_0x008c
        L_0x0089:
            r17 = 0
            goto L_0x00b1
        L_0x008c:
            int r14 = r0.f7695c0
            int r14 = r14 - r11
            int r14 = java.lang.Math.min(r14, r4)
            r17 = r14
            r14 = 1
            goto L_0x00b1
        L_0x0097:
            if (r12 != 0) goto L_0x00a3
            int r14 = r0.f7693a0
            int r14 = java.lang.Math.max(r8, r14)
        L_0x009f:
            r17 = r14
        L_0x00a1:
            r14 = 2
            goto L_0x00b1
        L_0x00a3:
            r14 = 2
            goto L_0x0089
        L_0x00a5:
            if (r12 != 0) goto L_0x00ae
            int r14 = r0.f7693a0
            int r14 = java.lang.Math.max(r8, r14)
            goto L_0x009f
        L_0x00ae:
            r17 = r4
            goto L_0x00a1
        L_0x00b1:
            if (r5 == r13) goto L_0x00d1
            if (r5 == 0) goto L_0x00c4
            if (r5 == r15) goto L_0x00ba
            r12 = 1
        L_0x00b8:
            r13 = 0
            goto L_0x00dc
        L_0x00ba:
            int r12 = r0.f7696d0
            int r12 = r12 - r10
            int r12 = java.lang.Math.min(r12, r6)
            r13 = r12
            r12 = 1
            goto L_0x00dc
        L_0x00c4:
            if (r12 != 0) goto L_0x00cf
            int r12 = r0.f7694b0
            int r12 = java.lang.Math.max(r8, r12)
        L_0x00cc:
            r13 = r12
        L_0x00cd:
            r12 = 2
            goto L_0x00dc
        L_0x00cf:
            r12 = 2
            goto L_0x00b8
        L_0x00d1:
            if (r12 != 0) goto L_0x00da
            int r12 = r0.f7694b0
            int r12 = java.lang.Math.max(r8, r12)
            goto L_0x00cc
        L_0x00da:
            r13 = r6
            goto L_0x00cd
        L_0x00dc:
            int r15 = r26.l()
            de.ozerov.fully.X r8 = r1.f9636f0
            r19 = r6
            r6 = r17
            if (r6 != r15) goto L_0x00ee
            int r15 = r26.i()
            if (r13 == r15) goto L_0x00f0
        L_0x00ee:
            r15 = 1
            goto L_0x00f2
        L_0x00f0:
            r15 = 0
            goto L_0x00f5
        L_0x00f2:
            r8.f10491b = r15
            goto L_0x00f0
        L_0x00f5:
            r1.f9595N = r15
            r1.f9596O = r15
            int r15 = r0.f7695c0
            int r15 = r15 - r11
            r17 = r8
            int[] r8 = r1.f9629u
            r20 = r4
            r4 = 0
            r8[r4] = r15
            int r15 = r0.f7696d0
            int r15 = r15 - r10
            r18 = 1
            r8[r18] = r15
            r1.f9598Q = r4
            r1.f9599R = r4
            r1.w(r14)
            r1.y(r6)
            r1.x(r12)
            r1.v(r13)
            int r6 = r0.f7693a0
            int r6 = r6 - r11
            if (r6 >= 0) goto L_0x0124
            r1.f9598Q = r4
            goto L_0x0126
        L_0x0124:
            r1.f9598Q = r6
        L_0x0126:
            int r6 = r0.f7694b0
            int r6 = r6 - r10
            if (r6 >= 0) goto L_0x012e
            r1.f9599R = r4
            goto L_0x0130
        L_0x012e:
            r1.f9599R = r6
        L_0x0130:
            r1.f9640j0 = r9
            r1.f9641k0 = r7
            d4.k r4 = r1.f9635e0
            r4.getClass()
            T3.a r6 = r1.f9637g0
            java.util.ArrayList r7 = r1.f9634d0
            int r7 = r7.size()
            int r9 = r26.l()
            int r10 = r26.i()
            r11 = r2 & 128(0x80, float:1.794E-43)
            r12 = 128(0x80, float:1.794E-43)
            if (r11 != r12) goto L_0x0151
            r11 = 1
            goto L_0x0152
        L_0x0151:
            r11 = 0
        L_0x0152:
            if (r11 != 0) goto L_0x015c
            r12 = 64
            r2 = r2 & r12
            if (r2 != r12) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r2 = 0
            goto L_0x015d
        L_0x015c:
            r2 = 1
        L_0x015d:
            r12 = 3
            if (r2 == 0) goto L_0x01ba
            r13 = 0
        L_0x0161:
            if (r13 >= r7) goto L_0x01ba
            java.util.ArrayList r14 = r1.f9634d0
            java.lang.Object r14 = r14.get(r13)
            d0.d r14 = (d0.d) r14
            int[] r15 = r14.f9613c0
            r18 = 0
            r0 = r15[r18]
            if (r0 != r12) goto L_0x0177
            r0 = 1
        L_0x0174:
            r21 = 1
            goto L_0x0179
        L_0x0177:
            r0 = 0
            goto L_0x0174
        L_0x0179:
            r15 = r15[r21]
            if (r15 != r12) goto L_0x017f
            r15 = 1
            goto L_0x0180
        L_0x017f:
            r15 = 0
        L_0x0180:
            if (r0 == 0) goto L_0x018d
            if (r15 == 0) goto L_0x018d
            float r0 = r14.f9593L
            r15 = 0
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x018d
            r0 = 1
            goto L_0x018e
        L_0x018d:
            r0 = 0
        L_0x018e:
            boolean r15 = r14.q()
            if (r15 == 0) goto L_0x019a
            if (r0 == 0) goto L_0x019a
        L_0x0196:
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = 0
            goto L_0x01bc
        L_0x019a:
            boolean r15 = r14.r()
            if (r15 == 0) goto L_0x01a3
            if (r0 == 0) goto L_0x01a3
            goto L_0x0196
        L_0x01a3:
            boolean r0 = r14 instanceof d0.g
            if (r0 == 0) goto L_0x01a8
            goto L_0x0196
        L_0x01a8:
            boolean r0 = r14.q()
            if (r0 != 0) goto L_0x0196
            boolean r0 = r14.r()
            if (r0 == 0) goto L_0x01b5
            goto L_0x0196
        L_0x01b5:
            int r13 = r13 + 1
            r0 = r25
            goto L_0x0161
        L_0x01ba:
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x01bc:
            if (r3 != r0) goto L_0x01c0
            if (r5 == r0) goto L_0x01c2
        L_0x01c0:
            if (r11 == 0) goto L_0x01c4
        L_0x01c2:
            r0 = 1
            goto L_0x01c5
        L_0x01c4:
            r0 = 0
        L_0x01c5:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0421
            r0 = 0
            r13 = r8[r0]
            r0 = r20
            int r0 = java.lang.Math.min(r13, r0)
            r13 = 1
            r8 = r8[r13]
            r14 = r19
            int r8 = java.lang.Math.min(r8, r14)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r3 != r14) goto L_0x01eb
            int r15 = r26.l()
            if (r15 == r0) goto L_0x01eb
            r1.y(r0)
            de.ozerov.fully.X r0 = r1.f9636f0
            r0.f10490a = r13
        L_0x01eb:
            if (r5 != r14) goto L_0x01fa
            int r0 = r26.i()
            if (r0 == r8) goto L_0x01fa
            r1.v(r8)
            de.ozerov.fully.X r0 = r1.f9636f0
            r0.f10490a = r13
        L_0x01fa:
            if (r3 != r14) goto L_0x037b
            if (r5 != r14) goto L_0x037b
            r0 = r17
            boolean r8 = r0.f10490a
            java.lang.Object r13 = r0.f10492c
            d0.e r13 = (d0.e) r13
            if (r8 != 0) goto L_0x020f
            boolean r8 = r0.f10491b
            if (r8 == 0) goto L_0x020d
            goto L_0x020f
        L_0x020d:
            r15 = 0
            goto L_0x023f
        L_0x020f:
            java.util.ArrayList r8 = r13.f9634d0
            java.util.Iterator r8 = r8.iterator()
        L_0x0215:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto L_0x0230
            java.lang.Object r14 = r8.next()
            d0.d r14 = (d0.d) r14
            r15 = 0
            r14.f9608a = r15
            e0.i r12 = r14.f9614d
            r12.n()
            e0.k r12 = r14.e
            r12.m()
            r12 = 3
            goto L_0x0215
        L_0x0230:
            r15 = 0
            r13.f9608a = r15
            e0.i r8 = r13.f9614d
            r8.n()
            e0.k r8 = r13.e
            r8.m()
            r0.f10491b = r15
        L_0x023f:
            java.lang.Object r8 = r0.f10493d
            d0.e r8 = (d0.e) r8
            r0.c(r8)
            r13.f9595N = r15
            r13.f9596O = r15
            int r8 = r13.h(r15)
            r12 = 1
            int r14 = r13.h(r12)
            boolean r12 = r0.f10490a
            if (r12 == 0) goto L_0x025a
            r0.d()
        L_0x025a:
            int r12 = r13.m()
            int r15 = r13.n()
            e0.i r2 = r13.f9614d
            r19 = r6
            e0.e r6 = r2.f11161h
            r6.d(r12)
            e0.k r6 = r13.e
            r20 = r9
            e0.e r9 = r6.f11161h
            r9.d(r15)
            r0.h()
            java.lang.Object r9 = r0.e
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            r21 = r10
            e0.f r10 = r2.e
            r22 = r4
            e0.f r4 = r6.e
            r23 = r7
            r7 = 2
            if (r8 == r7) goto L_0x028f
            if (r14 != r7) goto L_0x028b
            goto L_0x028f
        L_0x028b:
            r24 = r5
        L_0x028d:
            r5 = 1
            goto L_0x02dc
        L_0x028f:
            if (r11 == 0) goto L_0x02a8
            java.util.Iterator r7 = r9.iterator()
        L_0x0295:
            boolean r24 = r7.hasNext()
            if (r24 == 0) goto L_0x02a8
            java.lang.Object r24 = r7.next()
            e0.l r24 = (e0.l) r24
            boolean r24 = r24.k()
            if (r24 != 0) goto L_0x0295
            r11 = 0
        L_0x02a8:
            if (r11 == 0) goto L_0x02c3
            r7 = 2
            if (r8 != r7) goto L_0x02c3
            r7 = 1
            r13.w(r7)
            r24 = r5
            r7 = 0
            int r5 = r0.e(r13, r7)
            r13.y(r5)
            int r5 = r13.l()
            r10.d(r5)
            goto L_0x02c5
        L_0x02c3:
            r24 = r5
        L_0x02c5:
            if (r11 == 0) goto L_0x028d
            r5 = 2
            if (r14 != r5) goto L_0x028d
            r5 = 1
            r13.x(r5)
            int r7 = r0.e(r13, r5)
            r13.v(r7)
            int r7 = r13.i()
            r4.d(r7)
        L_0x02dc:
            int[] r7 = r13.f9613c0
            r11 = 0
            r1 = r7[r11]
            if (r1 == r5) goto L_0x02e9
            r5 = 4
            if (r1 != r5) goto L_0x02e7
            goto L_0x02e9
        L_0x02e7:
            r0 = 0
            goto L_0x0314
        L_0x02e9:
            int r1 = r13.l()
            int r1 = r1 + r12
            e0.e r2 = r2.i
            r2.d(r1)
            int r1 = r1 - r12
            r10.d(r1)
            r0.h()
            r1 = 1
            r2 = r7[r1]
            if (r2 == r1) goto L_0x0302
            r1 = 4
            if (r2 != r1) goto L_0x0310
        L_0x0302:
            int r1 = r13.i()
            int r1 = r1 + r15
            e0.e r2 = r6.i
            r2.d(r1)
            int r1 = r1 - r15
            r4.d(r1)
        L_0x0310:
            r0.h()
            r0 = 1
        L_0x0314:
            java.util.Iterator r1 = r9.iterator()
        L_0x0318:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0331
            java.lang.Object r2 = r1.next()
            e0.l r2 = (e0.l) r2
            d0.d r4 = r2.f11156b
            if (r4 != r13) goto L_0x032d
            boolean r4 = r2.f11160g
            if (r4 != 0) goto L_0x032d
            goto L_0x0318
        L_0x032d:
            r2.e()
            goto L_0x0318
        L_0x0331:
            java.util.Iterator r1 = r9.iterator()
        L_0x0335:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x036a
            java.lang.Object r2 = r1.next()
            e0.l r2 = (e0.l) r2
            if (r0 != 0) goto L_0x0348
            d0.d r4 = r2.f11156b
            if (r4 != r13) goto L_0x0348
            goto L_0x0335
        L_0x0348:
            e0.e r4 = r2.f11161h
            boolean r4 = r4.f11146j
            if (r4 != 0) goto L_0x0350
        L_0x034e:
            r0 = 0
            goto L_0x036b
        L_0x0350:
            e0.e r4 = r2.i
            boolean r4 = r4.f11146j
            if (r4 != 0) goto L_0x035b
            boolean r4 = r2 instanceof e0.C0823g
            if (r4 != 0) goto L_0x035b
            goto L_0x034e
        L_0x035b:
            e0.f r4 = r2.e
            boolean r4 = r4.f11146j
            if (r4 != 0) goto L_0x0335
            boolean r4 = r2 instanceof e0.C0819c
            if (r4 != 0) goto L_0x0335
            boolean r2 = r2 instanceof e0.C0823g
            if (r2 != 0) goto L_0x0335
            goto L_0x034e
        L_0x036a:
            r0 = 1
        L_0x036b:
            r13.w(r8)
            r13.x(r14)
            r1 = r26
            r4 = r0
            r5 = r24
            r0 = 1073741824(0x40000000, float:2.0)
            r2 = 2
            goto L_0x0411
        L_0x037b:
            r22 = r4
            r24 = r5
            r19 = r6
            r23 = r7
            r20 = r9
            r21 = r10
            r0 = r17
            boolean r1 = r0.f10490a
            java.lang.Object r2 = r0.f10492c
            d0.e r2 = (d0.e) r2
            if (r1 == 0) goto L_0x03da
            java.util.ArrayList r1 = r2.f9634d0
            java.util.Iterator r1 = r1.iterator()
        L_0x0397:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x03bd
            java.lang.Object r4 = r1.next()
            d0.d r4 = (d0.d) r4
            r5 = 0
            r4.f9608a = r5
            e0.i r6 = r4.f9614d
            e0.f r7 = r6.e
            r7.f11146j = r5
            r6.f11160g = r5
            r6.n()
            e0.k r4 = r4.e
            e0.f r6 = r4.e
            r6.f11146j = r5
            r4.f11160g = r5
            r4.m()
            goto L_0x0397
        L_0x03bd:
            r5 = 0
            r2.f9608a = r5
            e0.i r1 = r2.f9614d
            e0.f r4 = r1.e
            r4.f11146j = r5
            r1.f11160g = r5
            r1.n()
            e0.k r1 = r2.e
            e0.f r4 = r1.e
            r4.f11146j = r5
            r1.f11160g = r5
            r1.m()
            r0.d()
            goto L_0x03db
        L_0x03da:
            r5 = 0
        L_0x03db:
            java.lang.Object r1 = r0.f10493d
            d0.e r1 = (d0.e) r1
            r0.c(r1)
            r2.f9595N = r5
            r2.f9596O = r5
            e0.i r0 = r2.f9614d
            e0.e r0 = r0.f11161h
            r0.d(r5)
            e0.k r0 = r2.e
            e0.e r0 = r0.f11161h
            r0.d(r5)
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = r26
            if (r3 != r0) goto L_0x0403
            boolean r2 = r1.D(r5, r11)
            r4 = r2
            r5 = r24
            r2 = 1
            goto L_0x0407
        L_0x0403:
            r5 = r24
            r2 = 0
            r4 = 1
        L_0x0407:
            if (r5 != r0) goto L_0x0411
            r6 = 1
            boolean r7 = r1.D(r6, r11)
            r4 = r4 & r7
            int r2 = r2 + 1
        L_0x0411:
            if (r4 == 0) goto L_0x042d
            if (r3 != r0) goto L_0x0417
            r3 = 1
            goto L_0x0418
        L_0x0417:
            r3 = 0
        L_0x0418:
            if (r5 != r0) goto L_0x041c
            r0 = 1
            goto L_0x041d
        L_0x041c:
            r0 = 0
        L_0x041d:
            r1.z(r3, r0)
            goto L_0x042d
        L_0x0421:
            r22 = r4
            r19 = r6
            r23 = r7
            r20 = r9
            r21 = r10
            r2 = 0
            r4 = 0
        L_0x042d:
            if (r4 == 0) goto L_0x0432
            r0 = 2
            if (r2 == r0) goto L_0x069f
        L_0x0432:
            if (r23 <= 0) goto L_0x04af
            java.util.ArrayList r0 = r1.f9634d0
            int r0 = r0.size()
            T3.a r2 = r1.f9637g0
            r15 = 0
        L_0x043d:
            if (r15 >= r0) goto L_0x0485
            java.util.ArrayList r3 = r1.f9634d0
            java.lang.Object r3 = r3.get(r15)
            d0.d r3 = (d0.d) r3
            boolean r4 = r3 instanceof d0.h
            if (r4 == 0) goto L_0x044f
        L_0x044b:
            r5 = r22
            r7 = 3
            goto L_0x0480
        L_0x044f:
            e0.i r4 = r3.f9614d
            e0.f r4 = r4.e
            boolean r4 = r4.f11146j
            if (r4 == 0) goto L_0x0460
            e0.k r4 = r3.e
            e0.f r4 = r4.e
            boolean r4 = r4.f11146j
            if (r4 == 0) goto L_0x0460
            goto L_0x044b
        L_0x0460:
            r4 = 0
            int r5 = r3.h(r4)
            r4 = 1
            int r6 = r3.h(r4)
            r7 = 3
            if (r5 != r7) goto L_0x047a
            int r5 = r3.f9618j
            if (r5 == r4) goto L_0x047a
            if (r6 != r7) goto L_0x047a
            int r5 = r3.f9619k
            if (r5 == r4) goto L_0x047a
            r5 = r22
            goto L_0x0480
        L_0x047a:
            r5 = r22
            r4 = 0
            r5.J2(r2, r3, r4)
        L_0x0480:
            int r15 = r15 + 1
            r22 = r5
            goto L_0x043d
        L_0x0485:
            r5 = r22
            java.lang.Object r0 = r2.f5004g
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            int r2 = r0.getChildCount()
            r15 = 0
        L_0x0490:
            if (r15 >= r2) goto L_0x0498
            r0.getChildAt(r15)
            int r15 = r15 + 1
            goto L_0x0490
        L_0x0498:
            java.util.ArrayList r0 = r0.f7691V
            int r2 = r0.size()
            if (r2 <= 0) goto L_0x04b1
            r15 = 0
        L_0x04a1:
            if (r15 >= r2) goto L_0x04b1
            java.lang.Object r3 = r0.get(r15)
            f0.c r3 = (f0.C0875c) r3
            r3.getClass()
            int r15 = r15 + 1
            goto L_0x04a1
        L_0x04af:
            r5 = r22
        L_0x04b1:
            int r0 = r1.p0
            java.lang.Object r2 = r5.f9766V
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r3 = r2.size()
            r4 = r20
            r6 = r21
            if (r23 <= 0) goto L_0x04c4
            r5.W2(r1, r4, r6)
        L_0x04c4:
            if (r3 <= 0) goto L_0x068f
            int[] r7 = r1.f9613c0
            r15 = 0
            r8 = r7[r15]
            r9 = 2
            if (r8 != r9) goto L_0x04d1
            r8 = 1
        L_0x04cf:
            r10 = 1
            goto L_0x04d3
        L_0x04d1:
            r8 = 0
            goto L_0x04cf
        L_0x04d3:
            r7 = r7[r10]
            if (r7 != r9) goto L_0x04d9
            r7 = 1
            goto L_0x04da
        L_0x04d9:
            r7 = 0
        L_0x04da:
            int r9 = r26.l()
            java.lang.Object r10 = r5.f9768X
            d0.e r10 = (d0.e) r10
            int r11 = r10.f9598Q
            int r9 = java.lang.Math.max(r9, r11)
            int r11 = r26.i()
            int r10 = r10.f9599R
            int r10 = java.lang.Math.max(r11, r10)
            r11 = 0
            r12 = 0
        L_0x04f4:
            if (r11 >= r3) goto L_0x0583
            java.lang.Object r14 = r2.get(r11)
            d0.d r14 = (d0.d) r14
            boolean r15 = r14 instanceof d0.g
            if (r15 != 0) goto L_0x0506
            r16 = r0
            r1 = r19
            goto L_0x0578
        L_0x0506:
            int r15 = r14.l()
            int r13 = r14.i()
            r16 = r0
            r1 = r19
            r0 = 1
            boolean r19 = r5.J2(r1, r14, r0)
            r0 = r12 | r19
            int r12 = r14.l()
            r19 = r0
            int r0 = r14.i()
            if (r12 == r15) goto L_0x054a
            r14.y(r12)
            if (r8 == 0) goto L_0x0548
            int r12 = r14.m()
            int r15 = r14.f9591J
            int r12 = r12 + r15
            if (r12 <= r9) goto L_0x0548
            int r12 = r14.m()
            int r15 = r14.f9591J
            int r12 = r12 + r15
            r15 = 4
            d0.c r19 = r14.g(r15)
            int r15 = r19.c()
            int r15 = r15 + r12
            int r9 = java.lang.Math.max(r9, r15)
        L_0x0548:
            r15 = 1
            goto L_0x054c
        L_0x054a:
            r15 = r19
        L_0x054c:
            if (r0 == r13) goto L_0x0572
            r14.v(r0)
            if (r7 == 0) goto L_0x0571
            int r0 = r14.n()
            int r12 = r14.f9592K
            int r0 = r0 + r12
            if (r0 <= r10) goto L_0x0571
            int r0 = r14.n()
            int r12 = r14.f9592K
            int r0 = r0 + r12
            r12 = 5
            d0.c r12 = r14.g(r12)
            int r12 = r12.c()
            int r12 = r12 + r0
            int r10 = java.lang.Math.max(r10, r12)
        L_0x0571:
            r15 = 1
        L_0x0572:
            d0.g r14 = (d0.g) r14
            boolean r0 = r14.f9685l0
            r0 = r0 | r15
            r12 = r0
        L_0x0578:
            int r11 = r11 + 1
            r19 = r1
            r0 = r16
            r15 = 0
            r1 = r26
            goto L_0x04f4
        L_0x0583:
            r16 = r0
            r1 = r19
            r0 = 2
            r15 = 0
        L_0x0589:
            if (r15 >= r0) goto L_0x066a
            r11 = 0
        L_0x058c:
            if (r11 >= r3) goto L_0x064e
            java.lang.Object r13 = r2.get(r11)
            d0.d r13 = (d0.d) r13
            boolean r14 = r13 instanceof d0.i
            if (r14 == 0) goto L_0x059c
            boolean r14 = r13 instanceof d0.g
            if (r14 == 0) goto L_0x05bd
        L_0x059c:
            boolean r14 = r13 instanceof d0.h
            if (r14 == 0) goto L_0x05a1
            goto L_0x05bd
        L_0x05a1:
            int r14 = r13.f9603V
            r0 = 8
            if (r14 != r0) goto L_0x05a8
            goto L_0x05bd
        L_0x05a8:
            e0.i r0 = r13.f9614d
            e0.f r0 = r0.e
            boolean r0 = r0.f11146j
            if (r0 == 0) goto L_0x05b9
            e0.k r0 = r13.e
            e0.f r0 = r0.e
            boolean r0 = r0.f11146j
            if (r0 == 0) goto L_0x05b9
            goto L_0x05bd
        L_0x05b9:
            boolean r0 = r13 instanceof d0.g
            if (r0 == 0) goto L_0x05c7
        L_0x05bd:
            r21 = r1
            r19 = r2
            r20 = r3
            r1 = 5
            r3 = 4
            goto L_0x0643
        L_0x05c7:
            int r0 = r13.l()
            int r14 = r13.i()
            r19 = r2
            int r2 = r13.f9597P
            r20 = r3
            r3 = 1
            boolean r21 = r5.J2(r1, r13, r3)
            r12 = r12 | r21
            int r3 = r13.l()
            r21 = r1
            int r1 = r13.i()
            if (r3 == r0) goto L_0x060f
            r13.y(r3)
            if (r8 == 0) goto L_0x060c
            int r0 = r13.m()
            int r3 = r13.f9591J
            int r0 = r0 + r3
            if (r0 <= r9) goto L_0x060c
            int r0 = r13.m()
            int r3 = r13.f9591J
            int r0 = r0 + r3
            r3 = 4
            d0.c r12 = r13.g(r3)
            int r12 = r12.c()
            int r12 = r12 + r0
            int r9 = java.lang.Math.max(r9, r12)
            goto L_0x060d
        L_0x060c:
            r3 = 4
        L_0x060d:
            r12 = 1
            goto L_0x0610
        L_0x060f:
            r3 = 4
        L_0x0610:
            if (r1 == r14) goto L_0x0639
            r13.v(r1)
            if (r7 == 0) goto L_0x0636
            int r0 = r13.n()
            int r1 = r13.f9592K
            int r0 = r0 + r1
            if (r0 <= r10) goto L_0x0636
            int r0 = r13.n()
            int r1 = r13.f9592K
            int r0 = r0 + r1
            r1 = 5
            d0.c r12 = r13.g(r1)
            int r12 = r12.c()
            int r12 = r12 + r0
            int r10 = java.lang.Math.max(r10, r12)
            goto L_0x0637
        L_0x0636:
            r1 = 5
        L_0x0637:
            r12 = 1
            goto L_0x063a
        L_0x0639:
            r1 = 5
        L_0x063a:
            boolean r0 = r13.f9631w
            if (r0 == 0) goto L_0x0643
            int r0 = r13.f9597P
            if (r2 == r0) goto L_0x0643
            r12 = 1
        L_0x0643:
            int r11 = r11 + 1
            r2 = r19
            r3 = r20
            r1 = r21
            r0 = 2
            goto L_0x058c
        L_0x064e:
            r21 = r1
            r19 = r2
            r20 = r3
            r1 = 5
            r3 = 4
            r0 = r26
            r2 = r21
            if (r12 == 0) goto L_0x0660
            r5.W2(r0, r4, r6)
            r12 = 0
        L_0x0660:
            int r15 = r15 + 1
            r1 = r2
            r2 = r19
            r3 = r20
            r0 = 2
            goto L_0x0589
        L_0x066a:
            r0 = r26
            if (r12 == 0) goto L_0x068c
            r5.W2(r0, r4, r6)
            int r1 = r26.l()
            if (r1 >= r9) goto L_0x067c
            r0.y(r9)
            r15 = 1
            goto L_0x067d
        L_0x067c:
            r15 = 0
        L_0x067d:
            int r1 = r26.i()
            if (r1 >= r10) goto L_0x0687
            r0.v(r10)
            r15 = 1
        L_0x0687:
            if (r15 == 0) goto L_0x068c
            r5.W2(r0, r4, r6)
        L_0x068c:
            r1 = r16
            goto L_0x0693
        L_0x068f:
            r16 = r0
            r0 = r1
            goto L_0x068c
        L_0x0693:
            r0.p0 = r1
            r0 = 256(0x100, float:3.59E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x069c
            r8 = 1
            goto L_0x069d
        L_0x069c:
            r8 = 0
        L_0x069d:
            c0.C0607e.f8720p = r8
        L_0x069f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.e(d0.e, int, int, int):void");
    }

    public final void forceLayout() {
        this.f7697e0 = true;
        super.forceLayout();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, f0.e] */
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        int i;
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.f11331a = -1;
        marginLayoutParams.f11333b = -1;
        marginLayoutParams.f11335c = -1.0f;
        marginLayoutParams.f11337d = -1;
        marginLayoutParams.e = -1;
        marginLayoutParams.f11340f = -1;
        marginLayoutParams.f11342g = -1;
        marginLayoutParams.f11344h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f11347j = -1;
        marginLayoutParams.f11349k = -1;
        marginLayoutParams.f11351l = -1;
        marginLayoutParams.f11352m = -1;
        marginLayoutParams.f11353n = 0;
        marginLayoutParams.f11354o = 0.0f;
        marginLayoutParams.f11355p = -1;
        marginLayoutParams.f11356q = -1;
        marginLayoutParams.f11357r = -1;
        marginLayoutParams.f11358s = -1;
        marginLayoutParams.f11359t = -1;
        marginLayoutParams.f11360u = -1;
        marginLayoutParams.f11361v = -1;
        marginLayoutParams.f11362w = -1;
        marginLayoutParams.f11363x = -1;
        marginLayoutParams.f11364y = -1;
        marginLayoutParams.z = 0.5f;
        marginLayoutParams.f11305A = 0.5f;
        marginLayoutParams.f11306B = null;
        marginLayoutParams.f11307C = 1;
        marginLayoutParams.f11308D = -1.0f;
        marginLayoutParams.f11309E = -1.0f;
        marginLayoutParams.f11310F = 0;
        marginLayoutParams.f11311G = 0;
        marginLayoutParams.f11312H = 0;
        marginLayoutParams.f11313I = 0;
        marginLayoutParams.f11314J = 0;
        marginLayoutParams.f11315K = 0;
        marginLayoutParams.f11316L = 0;
        marginLayoutParams.f11317M = 0;
        marginLayoutParams.f11318N = 1.0f;
        marginLayoutParams.f11319O = 1.0f;
        marginLayoutParams.f11320P = -1;
        marginLayoutParams.f11321Q = -1;
        marginLayoutParams.f11322R = -1;
        marginLayoutParams.f11323S = false;
        marginLayoutParams.f11324T = false;
        marginLayoutParams.f11325U = null;
        marginLayoutParams.f11326V = true;
        marginLayoutParams.f11327W = true;
        marginLayoutParams.f11328X = false;
        marginLayoutParams.f11329Y = false;
        marginLayoutParams.f11330Z = false;
        marginLayoutParams.f11332a0 = -1;
        marginLayoutParams.f11334b0 = -1;
        marginLayoutParams.f11336c0 = -1;
        marginLayoutParams.f11338d0 = -1;
        marginLayoutParams.f11339e0 = -1;
        marginLayoutParams.f11341f0 = -1;
        marginLayoutParams.f11343g0 = 0.5f;
        marginLayoutParams.f11350k0 = new d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f11457b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = obtainStyledAttributes.getIndex(i8);
            int i9 = C0876d.f11304a.get(index);
            switch (i9) {
                case 1:
                    marginLayoutParams.f11322R = obtainStyledAttributes.getInt(index, marginLayoutParams.f11322R);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11352m);
                    marginLayoutParams.f11352m = resourceId;
                    if (resourceId != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11352m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 3:
                    marginLayoutParams.f11353n = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11353n);
                    break;
                case 4:
                    float f8 = obtainStyledAttributes.getFloat(index, marginLayoutParams.f11354o) % 360.0f;
                    marginLayoutParams.f11354o = f8;
                    if (f8 >= 0.0f) {
                        break;
                    } else {
                        marginLayoutParams.f11354o = (360.0f - f8) % 360.0f;
                        break;
                    }
                case 5:
                    marginLayoutParams.f11331a = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f11331a);
                    break;
                case 6:
                    marginLayoutParams.f11333b = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f11333b);
                    break;
                case 7:
                    marginLayoutParams.f11335c = obtainStyledAttributes.getFloat(index, marginLayoutParams.f11335c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11337d);
                    marginLayoutParams.f11337d = resourceId2;
                    if (resourceId2 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11337d = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.e);
                    marginLayoutParams.e = resourceId3;
                    if (resourceId3 != -1) {
                        break;
                    } else {
                        marginLayoutParams.e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 10:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11340f);
                    marginLayoutParams.f11340f = resourceId4;
                    if (resourceId4 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11340f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11342g);
                    marginLayoutParams.f11342g = resourceId5;
                    if (resourceId5 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11342g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11344h);
                    marginLayoutParams.f11344h = resourceId6;
                    if (resourceId6 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11344h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.i);
                    marginLayoutParams.i = resourceId7;
                    if (resourceId7 != -1) {
                        break;
                    } else {
                        marginLayoutParams.i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11347j);
                    marginLayoutParams.f11347j = resourceId8;
                    if (resourceId8 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11347j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11349k);
                    marginLayoutParams.f11349k = resourceId9;
                    if (resourceId9 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11349k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11351l);
                    marginLayoutParams.f11351l = resourceId10;
                    if (resourceId10 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11351l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11355p);
                    marginLayoutParams.f11355p = resourceId11;
                    if (resourceId11 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11355p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11356q);
                    marginLayoutParams.f11356q = resourceId12;
                    if (resourceId12 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11356q = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11357r);
                    marginLayoutParams.f11357r = resourceId13;
                    if (resourceId13 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11357r = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.f11358s);
                    marginLayoutParams.f11358s = resourceId14;
                    if (resourceId14 != -1) {
                        break;
                    } else {
                        marginLayoutParams.f11358s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    }
                case 21:
                    marginLayoutParams.f11359t = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11359t);
                    break;
                case 22:
                    marginLayoutParams.f11360u = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11360u);
                    break;
                case 23:
                    marginLayoutParams.f11361v = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11361v);
                    break;
                case 24:
                    marginLayoutParams.f11362w = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11362w);
                    break;
                case 25:
                    marginLayoutParams.f11363x = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11363x);
                    break;
                case 26:
                    marginLayoutParams.f11364y = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11364y);
                    break;
                case 27:
                    marginLayoutParams.f11323S = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f11323S);
                    break;
                case 28:
                    marginLayoutParams.f11324T = obtainStyledAttributes.getBoolean(index, marginLayoutParams.f11324T);
                    break;
                case 29:
                    marginLayoutParams.z = obtainStyledAttributes.getFloat(index, marginLayoutParams.z);
                    break;
                case 30:
                    marginLayoutParams.f11305A = obtainStyledAttributes.getFloat(index, marginLayoutParams.f11305A);
                    break;
                case 31:
                    int i10 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f11312H = i10;
                    if (i10 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    }
                case 32:
                    int i11 = obtainStyledAttributes.getInt(index, 0);
                    marginLayoutParams.f11313I = i11;
                    if (i11 != 1) {
                        break;
                    } else {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    }
                case 33:
                    try {
                        marginLayoutParams.f11314J = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11314J);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f11314J) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f11314J = -2;
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.f11316L = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11316L);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f11316L) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f11316L = -2;
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.f11318N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f11318N));
                    marginLayoutParams.f11312H = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.f11315K = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11315K);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f11315K) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f11315K = -2;
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.f11317M = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.f11317M);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.f11317M) != -2) {
                            break;
                        } else {
                            marginLayoutParams.f11317M = -2;
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.f11319O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.f11319O));
                    marginLayoutParams.f11313I = 2;
                    break;
                default:
                    switch (i9) {
                        case 44:
                            String string = obtainStyledAttributes.getString(index);
                            marginLayoutParams.f11306B = string;
                            marginLayoutParams.f11307C = -1;
                            if (string == null) {
                                break;
                            } else {
                                int length = string.length();
                                int indexOf = marginLayoutParams.f11306B.indexOf(44);
                                if (indexOf <= 0 || indexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String substring = marginLayoutParams.f11306B.substring(0, indexOf);
                                    if (substring.equalsIgnoreCase("W")) {
                                        marginLayoutParams.f11307C = 0;
                                    } else if (substring.equalsIgnoreCase("H")) {
                                        marginLayoutParams.f11307C = 1;
                                    }
                                    i = indexOf + 1;
                                }
                                int indexOf2 = marginLayoutParams.f11306B.indexOf(58);
                                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                    String substring2 = marginLayoutParams.f11306B.substring(i, indexOf2);
                                    String substring3 = marginLayoutParams.f11306B.substring(indexOf2 + 1);
                                    if (substring2.length() > 0 && substring3.length() > 0) {
                                        try {
                                            float parseFloat = Float.parseFloat(substring2);
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                if (marginLayoutParams.f11307C != 1) {
                                                    Math.abs(parseFloat / parseFloat2);
                                                    break;
                                                } else {
                                                    Math.abs(parseFloat2 / parseFloat);
                                                    break;
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                } else {
                                    String substring4 = marginLayoutParams.f11306B.substring(i);
                                    if (substring4.length() <= 0) {
                                        break;
                                    } else {
                                        Float.parseFloat(substring4);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 45:
                            marginLayoutParams.f11308D = obtainStyledAttributes.getFloat(index, marginLayoutParams.f11308D);
                            break;
                        case 46:
                            marginLayoutParams.f11309E = obtainStyledAttributes.getFloat(index, marginLayoutParams.f11309E);
                            break;
                        case 47:
                            marginLayoutParams.f11310F = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            marginLayoutParams.f11311G = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            marginLayoutParams.f11320P = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f11320P);
                            break;
                        case 50:
                            marginLayoutParams.f11321Q = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.f11321Q);
                            break;
                        case 51:
                            marginLayoutParams.f11325U = obtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.a();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.f7696d0;
    }

    public int getMaxWidth() {
        return this.f7695c0;
    }

    public int getMinHeight() {
        return this.f7694b0;
    }

    public int getMinWidth() {
        return this.f7693a0;
    }

    public int getOptimizationLevel() {
        return this.f7692W.p0;
    }

    public void onLayout(boolean z, int i, int i8, int i9, int i10) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            C0877e eVar = (C0877e) childAt.getLayoutParams();
            d dVar = eVar.f11350k0;
            if (childAt.getVisibility() != 8 || eVar.f11329Y || eVar.f11330Z || isInEditMode) {
                int m8 = dVar.m();
                int n4 = dVar.n();
                childAt.layout(m8, n4, dVar.l() + m8, dVar.i() + n4);
            }
        }
        ArrayList arrayList = this.f7691V;
        int size = arrayList.size();
        if (size > 0) {
            for (int i12 = 0; i12 < size; i12++) {
                ((C0875c) arrayList.get(i12)).getClass();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:148:0x02e5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0301 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            android.content.Context r3 = r25.getContext()
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()
            int r3 = r3.flags
            r4 = 4194304(0x400000, float:5.877472E-39)
            r3 = r3 & r4
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x001f
            int r3 = r25.getLayoutDirection()
            if (r5 != r3) goto L_0x001f
            r3 = 1
            goto L_0x0020
        L_0x001f:
            r3 = 0
        L_0x0020:
            d0.e r6 = r0.f7692W
            r6.f9638h0 = r3
            boolean r3 = r0.f7697e0
            if (r3 == 0) goto L_0x05e8
            r0.f7697e0 = r4
            int r3 = r25.getChildCount()
            r7 = 0
        L_0x002f:
            if (r7 >= r3) goto L_0x0040
            android.view.View r8 = r0.getChildAt(r7)
            boolean r8 = r8.isLayoutRequested()
            if (r8 == 0) goto L_0x003d
            r3 = 1
            goto L_0x0041
        L_0x003d:
            int r7 = r7 + 1
            goto L_0x002f
        L_0x0040:
            r3 = 0
        L_0x0041:
            if (r3 == 0) goto L_0x05a8
            boolean r9 = r25.isInEditMode()
            int r10 = r25.getChildCount()
            r11 = 0
        L_0x004c:
            if (r11 >= r10) goto L_0x005f
            android.view.View r12 = r0.getChildAt(r11)
            d0.d r12 = r0.b(r12)
            if (r12 != 0) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            r12.s()
        L_0x005c:
            int r11 = r11 + 1
            goto L_0x004c
        L_0x005f:
            android.util.SparseArray r11 = r0.f7690U
            r13 = -1
            if (r9 == 0) goto L_0x00e8
            r14 = 0
        L_0x0065:
            if (r14 >= r10) goto L_0x00e8
            android.view.View r15 = r0.getChildAt(r14)
            android.content.res.Resources r8 = r25.getResources()     // Catch:{ NotFoundException -> 0x00e3 }
            int r7 = r15.getId()     // Catch:{ NotFoundException -> 0x00e3 }
            java.lang.String r7 = r8.getResourceName(r7)     // Catch:{ NotFoundException -> 0x00e3 }
            int r8 = r15.getId()     // Catch:{ NotFoundException -> 0x00e3 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ NotFoundException -> 0x00e3 }
            boolean r5 = r7 instanceof java.lang.String     // Catch:{ NotFoundException -> 0x00e3 }
            if (r5 == 0) goto L_0x00a3
            java.util.HashMap r5 = r0.f7702j0     // Catch:{ NotFoundException -> 0x00e3 }
            if (r5 != 0) goto L_0x008e
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ NotFoundException -> 0x00e3 }
            r5.<init>()     // Catch:{ NotFoundException -> 0x00e3 }
            r0.f7702j0 = r5     // Catch:{ NotFoundException -> 0x00e3 }
        L_0x008e:
            java.lang.String r5 = "/"
            int r5 = r7.indexOf(r5)     // Catch:{ NotFoundException -> 0x00e3 }
            if (r5 == r13) goto L_0x009d
            int r5 = r5 + 1
            java.lang.String r5 = r7.substring(r5)     // Catch:{ NotFoundException -> 0x00e3 }
            goto L_0x009e
        L_0x009d:
            r5 = r7
        L_0x009e:
            java.util.HashMap r12 = r0.f7702j0     // Catch:{ NotFoundException -> 0x00e3 }
            r12.put(r5, r8)     // Catch:{ NotFoundException -> 0x00e3 }
        L_0x00a3:
            r5 = 47
            int r5 = r7.indexOf(r5)     // Catch:{ NotFoundException -> 0x00e3 }
            if (r5 == r13) goto L_0x00b1
            int r5 = r5 + 1
            java.lang.String r7 = r7.substring(r5)     // Catch:{ NotFoundException -> 0x00e3 }
        L_0x00b1:
            int r5 = r15.getId()     // Catch:{ NotFoundException -> 0x00e3 }
            if (r5 != 0) goto L_0x00b9
        L_0x00b7:
            r5 = r6
            goto L_0x00e1
        L_0x00b9:
            java.lang.Object r8 = r11.get(r5)     // Catch:{ NotFoundException -> 0x00e3 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ NotFoundException -> 0x00e3 }
            if (r8 != 0) goto L_0x00d2
            android.view.View r8 = r0.findViewById(r5)     // Catch:{ NotFoundException -> 0x00e3 }
            if (r8 == 0) goto L_0x00d2
            if (r8 == r0) goto L_0x00d2
            android.view.ViewParent r5 = r8.getParent()     // Catch:{ NotFoundException -> 0x00e3 }
            if (r5 != r0) goto L_0x00d2
            r0.onViewAdded(r8)     // Catch:{ NotFoundException -> 0x00e3 }
        L_0x00d2:
            if (r8 != r0) goto L_0x00d5
            goto L_0x00b7
        L_0x00d5:
            if (r8 != 0) goto L_0x00d9
            r5 = 0
            goto L_0x00e1
        L_0x00d9:
            android.view.ViewGroup$LayoutParams r5 = r8.getLayoutParams()     // Catch:{ NotFoundException -> 0x00e3 }
            f0.e r5 = (f0.C0877e) r5     // Catch:{ NotFoundException -> 0x00e3 }
            d0.d r5 = r5.f11350k0     // Catch:{ NotFoundException -> 0x00e3 }
        L_0x00e1:
            r5.f9604W = r7     // Catch:{ NotFoundException -> 0x00e3 }
        L_0x00e3:
            int r14 = r14 + 1
            r5 = 1
            goto L_0x0065
        L_0x00e8:
            int r5 = r0.f7701i0
            if (r5 == r13) goto L_0x00f9
            r5 = 0
        L_0x00ed:
            if (r5 >= r10) goto L_0x00f9
            android.view.View r7 = r0.getChildAt(r5)
            r7.getId()
            int r5 = r5 + 1
            goto L_0x00ed
        L_0x00f9:
            f0.l r5 = r0.f7699g0
            if (r5 == 0) goto L_0x0100
            r5.a(r0)
        L_0x0100:
            java.util.ArrayList r5 = r6.f9634d0
            r5.clear()
            java.util.ArrayList r5 = r0.f7691V
            int r7 = r5.size()
            if (r7 <= 0) goto L_0x01c5
            r12 = 0
        L_0x010e:
            if (r12 >= r7) goto L_0x01c5
            java.lang.Object r14 = r5.get(r12)
            f0.c r14 = (f0.C0875c) r14
            boolean r15 = r14.isInEditMode()
            if (r15 == 0) goto L_0x0121
            java.lang.String r15 = r14.f11302b0
            r14.setIds(r15)
        L_0x0121:
            d0.i r15 = r14.f11301a0
            if (r15 != 0) goto L_0x012b
            r18 = r5
            r17 = r7
            goto L_0x01bb
        L_0x012b:
            r15.f9705e0 = r4
            d0.d[] r15 = r15.f9704d0
            r13 = 0
            java.util.Arrays.fill(r15, r13)
            r13 = 0
        L_0x0134:
            int r15 = r14.f11299V
            if (r13 >= r15) goto L_0x01b2
            int[] r15 = r14.f11298U
            r15 = r15[r13]
            android.util.SparseArray r4 = r0.f7690U
            java.lang.Object r4 = r4.get(r15)
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L_0x0170
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            java.util.HashMap r8 = r14.f11303c0
            java.lang.Object r15 = r8.get(r15)
            java.lang.String r15 = (java.lang.String) r15
            r17 = r4
            int r4 = r14.d(r0, r15)
            r18 = r5
            if (r4 == 0) goto L_0x0174
            int[] r5 = r14.f11298U
            r5[r13] = r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r8.put(r5, r15)
            android.util.SparseArray r5 = r0.f7690U
            java.lang.Object r4 = r5.get(r4)
            android.view.View r4 = (android.view.View) r4
            goto L_0x0176
        L_0x0170:
            r17 = r4
            r18 = r5
        L_0x0174:
            r4 = r17
        L_0x0176:
            if (r4 == 0) goto L_0x01a8
            d0.i r5 = r14.f11301a0
            d0.d r4 = r0.b(r4)
            r5.getClass()
            if (r4 == r5) goto L_0x01a8
            if (r4 != 0) goto L_0x0186
            goto L_0x01a8
        L_0x0186:
            int r8 = r5.f9705e0
            r15 = 1
            int r8 = r8 + r15
            d0.d[] r15 = r5.f9704d0
            r17 = r7
            int r7 = r15.length
            if (r8 <= r7) goto L_0x019d
            int r7 = r15.length
            r8 = 2
            int r7 = r7 * 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r15, r7)
            d0.d[] r7 = (d0.d[]) r7
            r5.f9704d0 = r7
        L_0x019d:
            d0.d[] r7 = r5.f9704d0
            int r8 = r5.f9705e0
            r7[r8] = r4
            r4 = 1
            int r8 = r8 + r4
            r5.f9705e0 = r8
            goto L_0x01aa
        L_0x01a8:
            r17 = r7
        L_0x01aa:
            int r13 = r13 + 1
            r7 = r17
            r5 = r18
            r4 = 0
            goto L_0x0134
        L_0x01b2:
            r18 = r5
            r17 = r7
            d0.i r4 = r14.f11301a0
            r4.B()
        L_0x01bb:
            int r12 = r12 + 1
            r7 = r17
            r5 = r18
            r4 = 0
            r13 = -1
            goto L_0x010e
        L_0x01c5:
            r4 = 0
        L_0x01c6:
            if (r4 >= r10) goto L_0x01ce
            r0.getChildAt(r4)
            int r4 = r4 + 1
            goto L_0x01c6
        L_0x01ce:
            android.util.SparseArray r4 = r0.f7703k0
            r4.clear()
            r5 = 0
            r4.put(r5, r6)
            int r5 = r25.getId()
            r4.put(r5, r6)
            r5 = 0
        L_0x01df:
            if (r5 >= r10) goto L_0x01f3
            android.view.View r7 = r0.getChildAt(r5)
            d0.d r8 = r0.b(r7)
            int r7 = r7.getId()
            r4.put(r7, r8)
            int r5 = r5 + 1
            goto L_0x01df
        L_0x01f3:
            r5 = 0
        L_0x01f4:
            if (r5 >= r10) goto L_0x05a8
            android.view.View r7 = r0.getChildAt(r5)
            d0.d r8 = r0.b(r7)
            if (r8 != 0) goto L_0x0208
        L_0x0200:
            r24 = r6
            r23 = r10
            r0 = 2
            r2 = -1
            goto L_0x059a
        L_0x0208:
            android.view.ViewGroup$LayoutParams r12 = r7.getLayoutParams()
            f0.e r12 = (f0.C0877e) r12
            java.util.ArrayList r13 = r6.f9634d0
            r13.add(r8)
            d0.d r13 = r8.f9590I
            if (r13 == 0) goto L_0x0222
            d0.e r13 = (d0.e) r13
            java.util.ArrayList r13 = r13.f9634d0
            r13.remove(r8)
            r13 = 0
            r8.f9590I = r13
            goto L_0x0223
        L_0x0222:
            r13 = 0
        L_0x0223:
            r8.f9590I = r6
            r12.a()
            int r14 = r7.getVisibility()
            r8.f9603V = r14
            r8.f9602U = r7
            boolean r14 = r7 instanceof f0.C0875c
            if (r14 == 0) goto L_0x023b
            f0.c r7 = (f0.C0875c) r7
            boolean r14 = r6.f9638h0
            r7.f(r8, r14)
        L_0x023b:
            boolean r7 = r12.f11329Y
            if (r7 == 0) goto L_0x0270
            d0.h r8 = (d0.h) r8
            int r7 = r12.f11345h0
            int r14 = r12.f11346i0
            float r12 = r12.f11348j0
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r16 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r16 == 0) goto L_0x0259
            if (r16 <= 0) goto L_0x0257
            r8.f9699d0 = r12
            r12 = -1
            r8.f9700e0 = r12
            r8.f9701f0 = r12
            goto L_0x0200
        L_0x0257:
            r12 = -1
            goto L_0x0200
        L_0x0259:
            r12 = -1
            if (r7 == r12) goto L_0x0265
            if (r7 <= r12) goto L_0x0200
            r8.f9699d0 = r15
            r8.f9700e0 = r7
            r8.f9701f0 = r12
            goto L_0x0200
        L_0x0265:
            if (r14 == r12) goto L_0x0200
            if (r14 <= r12) goto L_0x0200
            r8.f9699d0 = r15
            r8.f9700e0 = r12
            r8.f9701f0 = r14
            goto L_0x0200
        L_0x0270:
            int r7 = r12.f11332a0
            int r14 = r12.f11334b0
            int r15 = r12.f11336c0
            int r13 = r12.f11338d0
            r23 = r10
            int r10 = r12.f11339e0
            int r1 = r12.f11341f0
            float r2 = r12.f11343g0
            int r0 = r12.f11352m
            r24 = r6
            r6 = -1
            if (r0 == r6) goto L_0x02a6
            java.lang.Object r0 = r4.get(r0)
            r22 = r0
            d0.d r22 = (d0.d) r22
            if (r22 == 0) goto L_0x0402
            float r0 = r12.f11354o
            int r1 = r12.f11353n
            r19 = 7
            r21 = 0
            r17 = r8
            r18 = r19
            r20 = r1
            r17.o(r18, r19, r20, r21, r22)
            r8.f9630v = r0
            goto L_0x0402
        L_0x02a6:
            r0 = -1
            if (r7 == r0) goto L_0x02c5
            java.lang.Object r0 = r4.get(r7)
            r22 = r0
            d0.d r22 = (d0.d) r22
            if (r22 == 0) goto L_0x02c3
            int r0 = r12.leftMargin
            r17 = r8
            r6 = 2
            r18 = r6
            r19 = r6
            r20 = r0
            r21 = r10
            r17.o(r18, r19, r20, r21, r22)
        L_0x02c3:
            r0 = -1
            goto L_0x02e3
        L_0x02c5:
            if (r14 == r0) goto L_0x02e3
            java.lang.Object r0 = r4.get(r14)
            r22 = r0
            d0.d r22 = (d0.d) r22
            if (r22 == 0) goto L_0x02c3
            int r0 = r12.leftMargin
            r17 = r8
            r6 = 2
            r18 = r6
            r6 = 4
            r19 = r6
            r20 = r0
            r21 = r10
            r17.o(r18, r19, r20, r21, r22)
            goto L_0x02c3
        L_0x02e3:
            if (r15 == r0) goto L_0x0301
            java.lang.Object r0 = r4.get(r15)
            r22 = r0
            d0.d r22 = (d0.d) r22
            if (r22 == 0) goto L_0x031d
            int r0 = r12.rightMargin
            r17 = r8
            r6 = 4
            r18 = r6
            r6 = 2
            r19 = r6
            r20 = r0
            r21 = r1
            r17.o(r18, r19, r20, r21, r22)
            goto L_0x031d
        L_0x0301:
            if (r13 == r0) goto L_0x031d
            java.lang.Object r0 = r4.get(r13)
            r22 = r0
            d0.d r22 = (d0.d) r22
            if (r22 == 0) goto L_0x031d
            int r0 = r12.rightMargin
            r17 = r8
            r6 = 4
            r18 = r6
            r19 = r6
            r20 = r0
            r21 = r1
            r17.o(r18, r19, r20, r21, r22)
        L_0x031d:
            int r0 = r12.f11344h
            r1 = -1
            if (r0 == r1) goto L_0x033f
            java.lang.Object r0 = r4.get(r0)
            r22 = r0
            d0.d r22 = (d0.d) r22
            if (r22 == 0) goto L_0x0361
            int r0 = r12.topMargin
            int r1 = r12.f11360u
            r17 = r8
            r6 = 3
            r18 = r6
            r19 = r6
            r20 = r0
            r21 = r1
            r17.o(r18, r19, r20, r21, r22)
            goto L_0x0361
        L_0x033f:
            int r0 = r12.i
            r1 = -1
            if (r0 == r1) goto L_0x0361
            java.lang.Object r0 = r4.get(r0)
            r22 = r0
            d0.d r22 = (d0.d) r22
            if (r22 == 0) goto L_0x0361
            int r0 = r12.topMargin
            int r1 = r12.f11360u
            r17 = r8
            r6 = 3
            r18 = r6
            r6 = 5
            r19 = r6
            r20 = r0
            r21 = r1
            r17.o(r18, r19, r20, r21, r22)
        L_0x0361:
            int r0 = r12.f11347j
            r1 = -1
            if (r0 == r1) goto L_0x0384
            java.lang.Object r0 = r4.get(r0)
            r22 = r0
            d0.d r22 = (d0.d) r22
            if (r22 == 0) goto L_0x03a5
            int r0 = r12.bottomMargin
            int r1 = r12.f11362w
            r17 = r8
            r6 = 5
            r18 = r6
            r6 = 3
            r19 = r6
            r20 = r0
            r21 = r1
            r17.o(r18, r19, r20, r21, r22)
            goto L_0x03a5
        L_0x0384:
            int r0 = r12.f11349k
            r1 = -1
            if (r0 == r1) goto L_0x03a5
            java.lang.Object r0 = r4.get(r0)
            r22 = r0
            d0.d r22 = (d0.d) r22
            if (r22 == 0) goto L_0x03a5
            int r0 = r12.bottomMargin
            int r1 = r12.f11362w
            r17 = r8
            r6 = 5
            r18 = r6
            r19 = r6
            r20 = r0
            r21 = r1
            r17.o(r18, r19, r20, r21, r22)
        L_0x03a5:
            int r0 = r12.f11351l
            r1 = -1
            if (r0 == r1) goto L_0x03f3
            java.lang.Object r0 = r11.get(r0)
            android.view.View r0 = (android.view.View) r0
            int r1 = r12.f11351l
            java.lang.Object r1 = r4.get(r1)
            d0.d r1 = (d0.d) r1
            if (r1 == 0) goto L_0x03f3
            if (r0 == 0) goto L_0x03f3
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            boolean r6 = r6 instanceof f0.C0877e
            if (r6 == 0) goto L_0x03f3
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            f0.e r0 = (f0.C0877e) r0
            r6 = 1
            r12.f11328X = r6
            r0.f11328X = r6
            r7 = 6
            d0.c r10 = r8.g(r7)
            d0.c r1 = r1.g(r7)
            r7 = 0
            r13 = -1
            r10.b(r1, r7, r13, r6)
            r8.f9631w = r6
            d0.d r0 = r0.f11350k0
            r0.f9631w = r6
            r0 = 3
            d0.c r1 = r8.g(r0)
            r1.h()
            r0 = 5
            d0.c r1 = r8.g(r0)
            r1.h()
        L_0x03f3:
            r0 = 0
            int r1 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x03fa
            r8.f9600S = r2
        L_0x03fa:
            float r1 = r12.f11305A
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0402
            r8.f9601T = r1
        L_0x0402:
            if (r9 == 0) goto L_0x0413
            int r0 = r12.f11320P
            r1 = -1
            if (r0 != r1) goto L_0x040d
            int r2 = r12.f11321Q
            if (r2 == r1) goto L_0x0413
        L_0x040d:
            int r1 = r12.f11321Q
            r8.f9595N = r0
            r8.f9596O = r1
        L_0x0413:
            boolean r0 = r12.f11326V
            r1 = -2
            if (r0 != 0) goto L_0x0448
            int r0 = r12.width
            r2 = -1
            if (r0 != r2) goto L_0x043f
            boolean r0 = r12.f11323S
            if (r0 == 0) goto L_0x0427
            r0 = 3
            r8.w(r0)
        L_0x0425:
            r2 = 2
            goto L_0x042d
        L_0x0427:
            r0 = 3
            r2 = 4
            r8.w(r2)
            goto L_0x0425
        L_0x042d:
            d0.c r2 = r8.g(r2)
            int r6 = r12.leftMargin
            r2.e = r6
            r2 = 4
            d0.c r2 = r8.g(r2)
            int r6 = r12.rightMargin
            r2.e = r6
            goto L_0x0459
        L_0x043f:
            r0 = 3
            r8.w(r0)
            r0 = 0
            r8.y(r0)
            goto L_0x0459
        L_0x0448:
            r0 = 1
            r8.w(r0)
            int r0 = r12.width
            r8.y(r0)
            int r0 = r12.width
            if (r0 != r1) goto L_0x0459
            r0 = 2
            r8.w(r0)
        L_0x0459:
            boolean r0 = r12.f11327W
            if (r0 != 0) goto L_0x048d
            int r0 = r12.height
            r2 = -1
            if (r0 != r2) goto L_0x0484
            boolean r0 = r12.f11324T
            if (r0 == 0) goto L_0x046c
            r0 = 3
            r8.x(r0)
        L_0x046a:
            r1 = 3
            goto L_0x0472
        L_0x046c:
            r0 = 3
            r1 = 4
            r8.x(r1)
            goto L_0x046a
        L_0x0472:
            d0.c r1 = r8.g(r1)
            int r6 = r12.topMargin
            r1.e = r6
            r1 = 5
            d0.c r1 = r8.g(r1)
            int r6 = r12.bottomMargin
            r1.e = r6
            goto L_0x049f
        L_0x0484:
            r0 = 3
            r8.x(r0)
            r0 = 0
            r8.v(r0)
            goto L_0x049f
        L_0x048d:
            r0 = 1
            r2 = -1
            r8.x(r0)
            int r0 = r12.height
            r8.v(r0)
            int r0 = r12.height
            if (r0 != r1) goto L_0x049f
            r0 = 2
            r8.x(r0)
        L_0x049f:
            java.lang.String r0 = r12.f11306B
            if (r0 == 0) goto L_0x04a9
            int r1 = r0.length()
            if (r1 != 0) goto L_0x04ac
        L_0x04a9:
            r1 = 0
            goto L_0x053b
        L_0x04ac:
            int r1 = r0.length()
            r6 = 44
            int r6 = r0.indexOf(r6)
            if (r6 <= 0) goto L_0x04d9
            int r7 = r1 + -1
            if (r6 >= r7) goto L_0x04d9
            r7 = 0
            java.lang.String r10 = r0.substring(r7, r6)
            java.lang.String r7 = "W"
            boolean r7 = r10.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x04cb
            r7 = 0
            goto L_0x04d6
        L_0x04cb:
            java.lang.String r7 = "H"
            boolean r7 = r10.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x04d5
            r7 = 1
            goto L_0x04d6
        L_0x04d5:
            r7 = -1
        L_0x04d6:
            int r6 = r6 + 1
            goto L_0x04db
        L_0x04d9:
            r6 = 0
            r7 = -1
        L_0x04db:
            r10 = 58
            int r10 = r0.indexOf(r10)
            if (r10 < 0) goto L_0x0520
            int r1 = r1 + -1
            if (r10 >= r1) goto L_0x0520
            java.lang.String r1 = r0.substring(r6, r10)
            int r10 = r10 + 1
            java.lang.String r0 = r0.substring(r10)
            int r6 = r1.length()
            if (r6 <= 0) goto L_0x0530
            int r6 = r0.length()
            if (r6 <= 0) goto L_0x0530
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x0517 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0517 }
            r6 = 0
            int r10 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0530
            int r10 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x0530
            r6 = 1
            if (r7 != r6) goto L_0x0519
            float r0 = r0 / r1
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x0517 }
            goto L_0x051e
        L_0x0517:
            goto L_0x0530
        L_0x0519:
            float r1 = r1 / r0
            float r0 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x0517 }
        L_0x051e:
            r1 = 0
            goto L_0x0532
        L_0x0520:
            java.lang.String r0 = r0.substring(r6)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0530
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x052f }
            goto L_0x051e
        L_0x052f:
        L_0x0530:
            r0 = 0
            goto L_0x051e
        L_0x0532:
            int r6 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x053d
            r8.f9593L = r0
            r8.f9594M = r7
            goto L_0x053d
        L_0x053b:
            r8.f9593L = r1
        L_0x053d:
            float r0 = r12.f11308D
            float[] r1 = r8.f9607Z
            r6 = 0
            r1[r6] = r0
            float r0 = r12.f11309E
            r6 = 1
            r1[r6] = r0
            int r0 = r12.f11310F
            r8.f9605X = r0
            int r0 = r12.f11311G
            r8.f9606Y = r0
            int r0 = r12.f11312H
            int r1 = r12.f11314J
            int r6 = r12.f11316L
            float r7 = r12.f11318N
            r8.f9618j = r0
            r8.f9621m = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r6 != r1) goto L_0x0563
            r6 = 0
        L_0x0563:
            r8.f9622n = r6
            r8.f9623o = r7
            r6 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            int r13 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x0577
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0577
            if (r0 != 0) goto L_0x0577
            r0 = 2
            r8.f9618j = r0
        L_0x0577:
            int r0 = r12.f11313I
            int r7 = r12.f11315K
            int r10 = r12.f11317M
            float r12 = r12.f11319O
            r8.f9619k = r0
            r8.f9624p = r7
            if (r10 != r1) goto L_0x0586
            r10 = 0
        L_0x0586:
            r8.f9625q = r10
            r8.f9626r = r12
            r1 = 0
            int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0599
            int r1 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r1 >= 0) goto L_0x0599
            if (r0 != 0) goto L_0x0599
            r0 = 2
            r8.f9619k = r0
            goto L_0x059a
        L_0x0599:
            r0 = 2
        L_0x059a:
            int r5 = r5 + 1
            r0 = r25
            r1 = r26
            r2 = r27
            r10 = r23
            r6 = r24
            goto L_0x01f4
        L_0x05a8:
            r24 = r6
            r0 = r24
            if (r3 == 0) goto L_0x05e5
            d4.k r1 = r0.f9635e0
            java.lang.Object r1 = r1.f9766V
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            java.util.ArrayList r2 = r0.f9634d0
            int r2 = r2.size()
            r5 = 0
        L_0x05be:
            if (r5 >= r2) goto L_0x05e0
            java.util.ArrayList r3 = r0.f9634d0
            java.lang.Object r3 = r3.get(r5)
            d0.d r3 = (d0.d) r3
            int[] r4 = r3.f9613c0
            r6 = 0
            r7 = r4[r6]
            r6 = 3
            r8 = 4
            if (r7 == r6) goto L_0x05da
            if (r7 == r8) goto L_0x05da
            r7 = 1
            r4 = r4[r7]
            if (r4 == r6) goto L_0x05da
            if (r4 != r8) goto L_0x05dd
        L_0x05da:
            r1.add(r3)
        L_0x05dd:
            int r5 = r5 + 1
            goto L_0x05be
        L_0x05e0:
            de.ozerov.fully.X r1 = r0.f9636f0
            r2 = 1
            r1.f10490a = r2
        L_0x05e5:
            r1 = r25
            goto L_0x05ea
        L_0x05e8:
            r0 = r6
            goto L_0x05e5
        L_0x05ea:
            int r2 = r1.f7698f0
            r3 = r26
            r4 = r27
            r1.e(r0, r2, r3, r4)
            int r2 = r0.l()
            int r5 = r0.i()
            boolean r6 = r0.f9646q0
            boolean r0 = r0.f9647r0
            T3.a r7 = r1.f7704l0
            int r8 = r7.f5002d
            int r7 = r7.f5001c
            int r2 = r2 + r7
            int r5 = r5 + r8
            r7 = 0
            int r2 = android.view.View.resolveSizeAndState(r2, r3, r7)
            int r3 = android.view.View.resolveSizeAndState(r5, r4, r7)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r4
            r3 = r3 & r4
            int r4 = r1.f7695c0
            int r2 = java.lang.Math.min(r4, r2)
            int r4 = r1.f7696d0
            int r3 = java.lang.Math.min(r4, r3)
            r4 = 16777216(0x1000000, float:2.3509887E-38)
            if (r6 == 0) goto L_0x0626
            r2 = r2 | r4
        L_0x0626:
            if (r0 == 0) goto L_0x0629
            r3 = r3 | r4
        L_0x0629:
            r1.setMeasuredDimension(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d b8 = b(view);
        if ((view instanceof n) && !(b8 instanceof h)) {
            C0877e eVar = (C0877e) view.getLayoutParams();
            h hVar = new h();
            eVar.f11350k0 = hVar;
            eVar.f11329Y = true;
            hVar.B(eVar.f11322R);
        }
        if (view instanceof C0875c) {
            C0875c cVar = (C0875c) view;
            cVar.g();
            ((C0877e) view.getLayoutParams()).f11330Z = true;
            ArrayList arrayList = this.f7691V;
            if (!arrayList.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        this.f7690U.put(view.getId(), view);
        this.f7697e0 = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f7690U.remove(view.getId());
        d b8 = b(view);
        this.f7692W.f9634d0.remove(b8);
        b8.f9590I = null;
        this.f7691V.remove(view);
        this.f7697e0 = true;
    }

    public final void requestLayout() {
        this.f7697e0 = true;
        super.requestLayout();
    }

    public void setConstraintSet(l lVar) {
        this.f7699g0 = lVar;
    }

    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f7690U;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f7696d0) {
            this.f7696d0 = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f7695c0) {
            this.f7695c0 = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f7694b0) {
            this.f7694b0 = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f7693a0) {
            this.f7693a0 = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(m mVar) {
        K2 k22 = this.f7700h0;
        if (k22 != null) {
            k22.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        boolean z;
        this.f7698f0 = i;
        this.f7692W.p0 = i;
        if ((i & 256) == 256) {
            z = true;
        } else {
            z = false;
        }
        C0607e.f8720p = z;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c(attributeSet, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, f0.e] */
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f11331a = -1;
        marginLayoutParams.f11333b = -1;
        marginLayoutParams.f11335c = -1.0f;
        marginLayoutParams.f11337d = -1;
        marginLayoutParams.e = -1;
        marginLayoutParams.f11340f = -1;
        marginLayoutParams.f11342g = -1;
        marginLayoutParams.f11344h = -1;
        marginLayoutParams.i = -1;
        marginLayoutParams.f11347j = -1;
        marginLayoutParams.f11349k = -1;
        marginLayoutParams.f11351l = -1;
        marginLayoutParams.f11352m = -1;
        marginLayoutParams.f11353n = 0;
        marginLayoutParams.f11354o = 0.0f;
        marginLayoutParams.f11355p = -1;
        marginLayoutParams.f11356q = -1;
        marginLayoutParams.f11357r = -1;
        marginLayoutParams.f11358s = -1;
        marginLayoutParams.f11359t = -1;
        marginLayoutParams.f11360u = -1;
        marginLayoutParams.f11361v = -1;
        marginLayoutParams.f11362w = -1;
        marginLayoutParams.f11363x = -1;
        marginLayoutParams.f11364y = -1;
        marginLayoutParams.z = 0.5f;
        marginLayoutParams.f11305A = 0.5f;
        marginLayoutParams.f11306B = null;
        marginLayoutParams.f11307C = 1;
        marginLayoutParams.f11308D = -1.0f;
        marginLayoutParams.f11309E = -1.0f;
        marginLayoutParams.f11310F = 0;
        marginLayoutParams.f11311G = 0;
        marginLayoutParams.f11312H = 0;
        marginLayoutParams.f11313I = 0;
        marginLayoutParams.f11314J = 0;
        marginLayoutParams.f11315K = 0;
        marginLayoutParams.f11316L = 0;
        marginLayoutParams.f11317M = 0;
        marginLayoutParams.f11318N = 1.0f;
        marginLayoutParams.f11319O = 1.0f;
        marginLayoutParams.f11320P = -1;
        marginLayoutParams.f11321Q = -1;
        marginLayoutParams.f11322R = -1;
        marginLayoutParams.f11323S = false;
        marginLayoutParams.f11324T = false;
        marginLayoutParams.f11325U = null;
        marginLayoutParams.f11326V = true;
        marginLayoutParams.f11327W = true;
        marginLayoutParams.f11328X = false;
        marginLayoutParams.f11329Y = false;
        marginLayoutParams.f11330Z = false;
        marginLayoutParams.f11332a0 = -1;
        marginLayoutParams.f11334b0 = -1;
        marginLayoutParams.f11336c0 = -1;
        marginLayoutParams.f11338d0 = -1;
        marginLayoutParams.f11339e0 = -1;
        marginLayoutParams.f11341f0 = -1;
        marginLayoutParams.f11343g0 = 0.5f;
        marginLayoutParams.f11350k0 = new d();
        return marginLayoutParams;
    }
}
