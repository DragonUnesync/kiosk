package C7;

import B.C0007h;
import B.C0022x;
import B3.q;
import B6.a;
import D.C0044g;
import D.C0048i;
import D.C0071z;
import D.N;
import G.h;
import G.i;
import M.j;
import M.k;
import N.e;
import P0.z;
import Q0.g;
import S1.f;
import Y6.m;
import Y6.o;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.I1;
import de.ozerov.fully.MyApplication;
import e3.C0838a;
import e3.b;
import e3.c;
import g7.l;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import m4.C1214b;
import o4.C1318a;
import r7.C1395d;
import t.C1412a;

public final class d implements M1.d, a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f731U;

    /* renamed from: V  reason: collision with root package name */
    public Object f732V;

    /* renamed from: W  reason: collision with root package name */
    public Object f733W;

    /* renamed from: X  reason: collision with root package name */
    public Object f734X;

    /* renamed from: Y  reason: collision with root package name */
    public Object f735Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f736Z;

    public /* synthetic */ d(int i) {
        this.f731U = i;
    }

    public static int[] B(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            e3.d dVar = (e3.d) it.next();
            int i9 = dVar.f11218U;
            iArr[i8] = i9;
            sparseIntArray.append(i9, dVar.f11219V);
            i8++;
        }
        return iArr;
    }

    public static ArrayList h(int i, int i8, List list) {
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        cVar.f11207g = (i - i8) / 2;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (i9 == 0) {
                arrayList.add(cVar);
            }
            arrayList.add((c) list.get(i9));
            if (i9 == list.size() - 1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public void A(int i, int i8, c cVar, int i9, int i10, boolean z) {
        int i11;
        int i12;
        int i13;
        float f8;
        int i14;
        int i15;
        float f9;
        float f10;
        c cVar2 = cVar;
        int i16 = i9;
        int i17 = cVar2.e;
        float f11 = cVar2.f11210k;
        if (f11 > 0.0f && i16 <= i17) {
            float f12 = ((float) (i17 - i16)) / f11;
            cVar2.e = i10 + cVar2.f11206f;
            if (!z) {
                cVar2.f11207g = RecyclerView.UNDEFINED_DURATION;
            }
            int i18 = 0;
            boolean z6 = false;
            int i19 = 0;
            float f13 = 0.0f;
            while (i18 < cVar2.f11208h) {
                int i20 = cVar2.f11214o + i18;
                C0838a aVar = (C0838a) this.f732V;
                View g8 = aVar.g(i20);
                if (g8 == null || g8.getVisibility() == 8) {
                    i12 = i17;
                    i11 = i18;
                    int i21 = i19;
                    int i22 = i8;
                    i13 = i21;
                    f13 = f13;
                } else {
                    b bVar = (b) g8.getLayoutParams();
                    int flexDirection = aVar.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i11 = i18;
                        int i23 = i19;
                        float f14 = f13;
                        int i24 = i17;
                        int measuredWidth = g8.getMeasuredWidth();
                        long[] jArr = (long[]) this.f736Z;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i20];
                        }
                        int measuredHeight = g8.getMeasuredHeight();
                        long[] jArr2 = (long[]) this.f736Z;
                        if (jArr2 != null) {
                            i12 = i24;
                            measuredHeight = (int) (jArr2[i20] >> 32);
                        } else {
                            i12 = i24;
                        }
                        if (((boolean[]) this.f733W)[i20] || bVar.h() <= 0.0f) {
                            int i25 = i8;
                            f13 = f14;
                        } else {
                            float h5 = ((float) measuredWidth) - (bVar.h() * f12);
                            if (i11 == cVar2.f11208h - 1) {
                                h5 += f14;
                                f14 = 0.0f;
                            }
                            int round = Math.round(h5);
                            if (round < bVar.m()) {
                                round = bVar.m();
                                ((boolean[]) this.f733W)[i20] = true;
                                cVar2.f11210k -= bVar.h();
                                f13 = f14;
                                z6 = true;
                            } else {
                                float f15 = (h5 - ((float) round)) + f14;
                                double d8 = (double) f15;
                                if (d8 > 1.0d) {
                                    round++;
                                    f15 -= 1.0f;
                                } else if (d8 < -1.0d) {
                                    round--;
                                    f15 += 1.0f;
                                }
                                f13 = f15;
                            }
                            int q7 = q(i8, bVar, cVar2.f11212m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, O7.b.MAX_POW2);
                            g8.measure(makeMeasureSpec, q7);
                            int measuredWidth2 = g8.getMeasuredWidth();
                            int measuredHeight2 = g8.getMeasuredHeight();
                            F(i20, makeMeasureSpec, q7, g8);
                            aVar.h(g8, i20);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i23, aVar.k(g8) + bVar.q() + bVar.u() + measuredHeight);
                        cVar2.e = bVar.j() + bVar.r() + measuredWidth + cVar2.e;
                        i13 = max;
                    } else {
                        int measuredHeight3 = g8.getMeasuredHeight();
                        long[] jArr3 = (long[]) this.f736Z;
                        if (jArr3 != null) {
                            long j7 = jArr3[i20];
                            i14 = i19;
                            f8 = f13;
                            measuredHeight3 = (int) (j7 >> 32);
                        } else {
                            i14 = i19;
                            f8 = f13;
                        }
                        int measuredWidth3 = g8.getMeasuredWidth();
                        long[] jArr4 = (long[]) this.f736Z;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i20];
                        }
                        if (((boolean[]) this.f733W)[i20] || bVar.h() <= 0.0f) {
                            i15 = i17;
                            i11 = i18;
                        } else {
                            float h8 = ((float) measuredHeight3) - (bVar.h() * f12);
                            if (i18 == cVar2.f11208h - 1) {
                                h8 += f8;
                                f9 = 0.0f;
                            } else {
                                f9 = f8;
                            }
                            int round2 = Math.round(h8);
                            if (round2 < bVar.l()) {
                                round2 = bVar.l();
                                ((boolean[]) this.f733W)[i20] = true;
                                cVar2.f11210k -= bVar.h();
                                i11 = i18;
                                f10 = f9;
                                z6 = true;
                                i15 = i17;
                            } else {
                                f10 = (h8 - ((float) round2)) + f9;
                                i15 = i17;
                                i11 = i18;
                                double d9 = (double) f10;
                                if (d9 > 1.0d) {
                                    round2++;
                                    f10 -= 1.0f;
                                } else if (d9 < -1.0d) {
                                    round2--;
                                    f10 += 1.0f;
                                }
                            }
                            int r8 = r(i, bVar, cVar2.f11212m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, O7.b.MAX_POW2);
                            g8.measure(r8, makeMeasureSpec2);
                            int measuredWidth4 = g8.getMeasuredWidth();
                            int measuredHeight4 = g8.getMeasuredHeight();
                            F(i20, r8, makeMeasureSpec2, g8);
                            aVar.h(g8, i20);
                            f8 = f10;
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                        }
                        i13 = Math.max(i14, aVar.k(g8) + bVar.j() + bVar.r() + measuredWidth3);
                        cVar2.e = bVar.q() + bVar.u() + measuredHeight3 + cVar2.e;
                        int i26 = i8;
                        i12 = i15;
                        f13 = f8;
                    }
                    cVar2.f11207g = Math.max(cVar2.f11207g, i13);
                }
                i18 = i11 + 1;
                int i27 = i9;
                i19 = i13;
                i17 = i12;
            }
            int i28 = i8;
            int i29 = i17;
            if (z6 && i29 != cVar2.e) {
                A(i, i8, cVar, i9, i10, true);
            }
        }
    }

    public void C(View view, int i, int i8) {
        int i9;
        b bVar = (b) view.getLayoutParams();
        int r8 = (i - bVar.r()) - bVar.j();
        C0838a aVar = (C0838a) this.f732V;
        int min = Math.min(Math.max(r8 - aVar.k(view), bVar.m()), bVar.t());
        long[] jArr = (long[]) this.f736Z;
        if (jArr != null) {
            i9 = (int) (jArr[i8] >> 32);
        } else {
            i9 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, O7.b.MAX_POW2);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, O7.b.MAX_POW2);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        F(i8, makeMeasureSpec2, makeMeasureSpec, view);
        aVar.h(view, i8);
    }

    public void D(View view, int i, int i8) {
        int i9;
        b bVar = (b) view.getLayoutParams();
        int u3 = (i - bVar.u()) - bVar.q();
        C0838a aVar = (C0838a) this.f732V;
        int min = Math.min(Math.max(u3 - aVar.k(view), bVar.l()), bVar.o());
        long[] jArr = (long[]) this.f736Z;
        if (jArr != null) {
            i9 = (int) jArr[i8];
        } else {
            i9 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, O7.b.MAX_POW2);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, O7.b.MAX_POW2);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        F(i8, makeMeasureSpec, makeMeasureSpec2, view);
        aVar.h(view, i8);
    }

    public void E(int i) {
        int i8;
        View g8;
        int i9 = i;
        C0838a aVar = (C0838a) this.f732V;
        if (i9 < aVar.getFlexItemCount()) {
            int flexDirection = aVar.getFlexDirection();
            if (aVar.getAlignItems() == 4) {
                int[] iArr = (int[]) this.f734X;
                if (iArr != null) {
                    i8 = iArr[i9];
                } else {
                    i8 = 0;
                }
                List flexLinesInternal = aVar.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                while (i8 < size) {
                    c cVar = (c) flexLinesInternal.get(i8);
                    int i10 = cVar.f11208h;
                    for (int i11 = 0; i11 < i10; i11++) {
                        int i12 = cVar.f11214o + i11;
                        if (!(i11 >= aVar.getFlexItemCount() || (g8 = aVar.g(i12)) == null || g8.getVisibility() == 8)) {
                            b bVar = (b) g8.getLayoutParams();
                            if (bVar.g() == -1 || bVar.g() == 4) {
                                if (flexDirection == 0 || flexDirection == 1) {
                                    D(g8, cVar.f11207g, i12);
                                } else if (flexDirection == 2 || flexDirection == 3) {
                                    C(g8, cVar.f11207g, i12);
                                } else {
                                    throw new IllegalArgumentException(g.m(flexDirection, "Invalid flex direction: "));
                                }
                            }
                        }
                    }
                    i8++;
                }
                return;
            }
            for (c cVar2 : aVar.getFlexLinesInternal()) {
                Iterator it = cVar2.f11213n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View g9 = aVar.g(num.intValue());
                        if (flexDirection == 0 || flexDirection == 1) {
                            D(g9, cVar2.f11207g, num.intValue());
                        } else if (flexDirection == 2 || flexDirection == 3) {
                            C(g9, cVar2.f11207g, num.intValue());
                        } else {
                            throw new IllegalArgumentException(g.m(flexDirection, "Invalid flex direction: "));
                        }
                    }
                }
            }
        }
    }

    public void F(int i, int i8, int i9, View view) {
        long[] jArr = (long[]) this.f735Y;
        if (jArr != null) {
            jArr[i] = (((long) i8) & 4294967295L) | (((long) i9) << 32);
        }
        long[] jArr2 = (long[]) this.f736Z;
        if (jArr2 != null) {
            jArr2[i] = (((long) view.getMeasuredWidth()) & 4294967295L) | (((long) view.getMeasuredHeight()) << 32);
        }
    }

    public List X(long j7) {
        S1.c cVar = (S1.c) this.f732V;
        ArrayList arrayList = new ArrayList();
        cVar.g(j7, cVar.f4407h, arrayList);
        TreeMap treeMap = new TreeMap();
        long j8 = j7;
        cVar.i(j8, false, cVar.f4407h, treeMap);
        HashMap hashMap = (HashMap) this.f735Y;
        cVar.h(j8, (Map) this.f734X, hashMap, cVar.f4407h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) ((HashMap) this.f736Z).get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                f fVar = (f) hashMap.get(pair.first);
                fVar.getClass();
                arrayList2.add(new O0.b((CharSequence) null, (Layout.Alignment) null, (Layout.Alignment) null, decodeByteArray, fVar.f4426c, 0, fVar.e, fVar.f4425b, 0, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, fVar.f4428f, fVar.f4429g, false, -16777216, fVar.f4431j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f fVar2 = (f) hashMap.get(entry.getKey());
            fVar2.getClass();
            O0.a aVar = (O0.a) entry.getValue();
            CharSequence charSequence = aVar.f3495a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (S1.a aVar2 : (S1.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), S1.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i8 = i + 1;
                    int i9 = i8;
                    while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                        i9++;
                    }
                    int i10 = i9 - i8;
                    if (i10 > 0) {
                        spannableStringBuilder.delete(i, i10 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
                if (spannableStringBuilder.charAt(i11) == 10) {
                    int i12 = i11 + 1;
                    if (spannableStringBuilder.charAt(i12) == ' ') {
                        spannableStringBuilder.delete(i12, i11 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == ' ') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == 10) {
                        spannableStringBuilder.delete(i13, i14);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == 10) {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.e = fVar2.f4426c;
            aVar.f3499f = fVar2.f4427d;
            aVar.f3500g = fVar2.e;
            aVar.f3501h = fVar2.f4425b;
            aVar.f3504l = fVar2.f4428f;
            aVar.f3503k = fVar2.i;
            aVar.f3502j = fVar2.f4430h;
            aVar.f3508p = fVar2.f4431j;
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }

    public void a(List list, c cVar, int i, int i8) {
        cVar.f11212m = i8;
        ((C0838a) this.f732V).f(cVar);
        cVar.f11215p = i;
        list.add(cVar);
    }

    public C0044g b() {
        String str;
        if (((N) this.f732V) == null) {
            str = " surface";
        } else {
            str = "";
        }
        if (((List) this.f733W) == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (((Integer) this.f734X) == null) {
            str = e.x(str, " mirrorMode");
        }
        if (((Integer) this.f735Y) == null) {
            str = e.x(str, " surfaceGroupId");
        }
        if (((C0022x) this.f736Z) == null) {
            str = e.x(str, " dynamicRange");
        }
        if (str.isEmpty()) {
            return new C0044g((N) this.f732V, (List) this.f733W, ((Integer) this.f734X).intValue(), ((Integer) this.f735Y).intValue(), (C0022x) this.f736Z);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public int c(long j7) {
        long[] jArr = (long[]) this.f733W;
        int a8 = z.a(jArr, j7, false);
        if (a8 < jArr.length) {
            return a8;
        }
        return -1;
    }

    public C0048i d() {
        String str;
        if (((Size) this.f732V) == null) {
            str = " resolution";
        } else {
            str = "";
        }
        if (((C0022x) this.f733W) == null) {
            str = str.concat(" dynamicRange");
        }
        if (((Range) this.f734X) == null) {
            str = e.x(str, " expectedFrameRateRange");
        }
        if (((Boolean) this.f736Z) == null) {
            str = e.x(str, " zslDisabled");
        }
        if (str.isEmpty()) {
            return new C0048i((Size) this.f732V, (C0022x) this.f733W, (Range) this.f734X, (C1412a) this.f735Y, ((Boolean) this.f736Z).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0210, code lost:
        if (r8 < (r15 + r22)) goto L_0x0212;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02d0  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0324  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x033c  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03ac A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(V1.C0347f r29, int r30, int r31, int r32, int r33, int r34, java.util.List r35) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r34
            java.lang.Object r5 = r0.f732V
            e3.a r5 = (e3.C0838a) r5
            boolean r6 = r5.j()
            int r7 = android.view.View.MeasureSpec.getMode(r30)
            int r8 = android.view.View.MeasureSpec.getSize(r30)
            if (r35 != 0) goto L_0x0022
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            goto L_0x0024
        L_0x0022:
            r9 = r35
        L_0x0024:
            r1.f5767a = r9
            r11 = -1
            if (r4 != r11) goto L_0x002b
            r13 = 1
            goto L_0x002c
        L_0x002b:
            r13 = 0
        L_0x002c:
            if (r6 == 0) goto L_0x0033
            int r14 = r5.getPaddingStart()
            goto L_0x0037
        L_0x0033:
            int r14 = r5.getPaddingTop()
        L_0x0037:
            if (r6 == 0) goto L_0x003e
            int r15 = r5.getPaddingEnd()
            goto L_0x0042
        L_0x003e:
            int r15 = r5.getPaddingBottom()
        L_0x0042:
            if (r6 == 0) goto L_0x0049
            int r16 = r5.getPaddingTop()
            goto L_0x004d
        L_0x0049:
            int r16 = r5.getPaddingStart()
        L_0x004d:
            if (r6 == 0) goto L_0x0054
            int r17 = r5.getPaddingBottom()
            goto L_0x0058
        L_0x0054:
            int r17 = r5.getPaddingEnd()
        L_0x0058:
            e3.c r12 = new e3.c
            r12.<init>()
            r11 = r33
            r12.f11214o = r11
            int r14 = r14 + r15
            r12.e = r14
            int r15 = r5.getFlexItemCount()
            r19 = -2147483648(0xffffffff80000000, float:-0.0)
            r33 = r13
            r1 = 0
            r10 = 0
            r13 = 0
            r20 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0071:
            if (r11 >= r15) goto L_0x03c5
            android.view.View r4 = r5.g(r11)
            if (r4 != 0) goto L_0x008b
            int r4 = r15 + -1
            if (r11 != r4) goto L_0x0086
            int r4 = r12.a()
            if (r4 == 0) goto L_0x0086
            r0.a(r9, r12, r11, r10)
        L_0x0086:
            r22 = r1
            r21 = r13
            goto L_0x00af
        L_0x008b:
            r21 = r13
            int r13 = r4.getVisibility()
            r22 = r1
            r1 = 8
            if (r13 != r1) goto L_0x00c3
            int r1 = r12.i
            r4 = 1
            int r1 = r1 + r4
            r12.i = r1
            int r1 = r12.f11208h
            int r1 = r1 + r4
            r12.f11208h = r1
            int r1 = r15 + -1
            if (r11 != r1) goto L_0x00af
            int r1 = r12.a()
            if (r1 == 0) goto L_0x00af
            r0.a(r9, r12, r11, r10)
        L_0x00af:
            r1 = r34
            r26 = r7
            r7 = r9
            r23 = r15
            r13 = r21
            r27 = r22
            r4 = -1
            r18 = 1
            r15 = r32
            r9 = r33
            goto L_0x03b5
        L_0x00c3:
            boolean r1 = r4 instanceof android.widget.CompoundButton
            if (r1 == 0) goto L_0x0105
            r1 = r4
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            android.view.ViewGroup$LayoutParams r13 = r1.getLayoutParams()
            e3.b r13 = (e3.b) r13
            r23 = r15
            int r15 = r13.m()
            r24 = r9
            int r9 = r13.l()
            android.graphics.drawable.Drawable r1 = G5.s.p(r1)
            if (r1 != 0) goto L_0x00e5
            r25 = 0
            goto L_0x00e9
        L_0x00e5:
            int r25 = r1.getMinimumWidth()
        L_0x00e9:
            if (r1 != 0) goto L_0x00ef
            r1 = -1
            r26 = 0
            goto L_0x00f6
        L_0x00ef:
            int r1 = r1.getMinimumHeight()
            r26 = r1
            r1 = -1
        L_0x00f6:
            if (r15 != r1) goto L_0x00fa
            r15 = r25
        L_0x00fa:
            r13.p(r15)
            if (r9 != r1) goto L_0x0101
            r9 = r26
        L_0x0101:
            r13.a(r9)
            goto L_0x0109
        L_0x0105:
            r24 = r9
            r23 = r15
        L_0x0109:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            e3.b r1 = (e3.b) r1
            int r9 = r1.g()
            r13 = 4
            if (r9 != r13) goto L_0x011f
            java.util.ArrayList r9 = r12.f11213n
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r9.add(r13)
        L_0x011f:
            if (r6 == 0) goto L_0x0126
            int r9 = r1.c()
            goto L_0x012a
        L_0x0126:
            int r9 = r1.b()
        L_0x012a:
            float r13 = r1.f()
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x0143
            r13 = 1073741824(0x40000000, float:2.0)
            if (r7 != r13) goto L_0x0143
            float r9 = (float) r8
            float r13 = r1.f()
            float r13 = r13 * r9
            int r9 = java.lang.Math.round(r13)
        L_0x0143:
            if (r6 == 0) goto L_0x016f
            int r13 = r1.r()
            int r13 = r13 + r14
            int r15 = r1.j()
            int r15 = r15 + r13
            int r9 = r5.i(r2, r15, r9)
            int r13 = r16 + r17
            int r15 = r1.u()
            int r15 = r15 + r13
            int r13 = r1.q()
            int r13 = r13 + r15
            int r13 = r13 + r10
            int r15 = r1.b()
            int r13 = r5.d(r3, r13, r15)
            r4.measure(r9, r13)
            r0.F(r11, r9, r13, r4)
            goto L_0x0199
        L_0x016f:
            int r13 = r16 + r17
            int r15 = r1.r()
            int r15 = r15 + r13
            int r13 = r1.j()
            int r13 = r13 + r15
            int r13 = r13 + r10
            int r15 = r1.c()
            int r13 = r5.i(r3, r13, r15)
            int r15 = r1.u()
            int r15 = r15 + r14
            int r25 = r1.q()
            int r15 = r25 + r15
            int r9 = r5.d(r2, r15, r9)
            r4.measure(r13, r9)
            r0.F(r11, r13, r9, r4)
        L_0x0199:
            r5.h(r4, r11)
            r0.f(r4, r11)
            int r13 = r4.getMeasuredState()
            r15 = r22
            int r13 = android.view.View.combineMeasuredStates(r15, r13)
            int r15 = r12.e
            if (r6 == 0) goto L_0x01b2
            int r22 = r4.getMeasuredWidth()
            goto L_0x01b6
        L_0x01b2:
            int r22 = r4.getMeasuredHeight()
        L_0x01b6:
            if (r6 == 0) goto L_0x01bd
            int r25 = r1.r()
            goto L_0x01c1
        L_0x01bd:
            int r25 = r1.u()
        L_0x01c1:
            int r22 = r22 + r25
            if (r6 == 0) goto L_0x01ca
            int r25 = r1.j()
            goto L_0x01ce
        L_0x01ca:
            int r25 = r1.q()
        L_0x01ce:
            int r22 = r22 + r25
            int r25 = r24.size()
            int r26 = r5.getFlexWrap()
            if (r26 != 0) goto L_0x01e5
        L_0x01da:
            r26 = r7
            r27 = r13
        L_0x01de:
            r2 = r21
        L_0x01e0:
            r7 = r24
            r9 = 1
            goto L_0x0290
        L_0x01e5:
            boolean r26 = r1.n()
            if (r26 == 0) goto L_0x01f0
            r26 = r7
            r27 = r13
            goto L_0x0212
        L_0x01f0:
            if (r7 != 0) goto L_0x01f3
            goto L_0x01da
        L_0x01f3:
            int r2 = r5.getMaxLine()
            r26 = r7
            r7 = -1
            r27 = r13
            if (r2 == r7) goto L_0x0204
            r7 = 1
            int r13 = r25 + 1
            if (r2 > r13) goto L_0x0204
            goto L_0x01de
        L_0x0204:
            r2 = r21
            int r7 = r5.c(r4, r11, r2)
            if (r7 <= 0) goto L_0x020e
            int r22 = r22 + r7
        L_0x020e:
            int r15 = r15 + r22
            if (r8 >= r15) goto L_0x01e0
        L_0x0212:
            int r2 = r12.a()
            if (r2 <= 0) goto L_0x0229
            if (r11 <= 0) goto L_0x021f
            int r2 = r11 + -1
            r7 = r24
            goto L_0x0222
        L_0x021f:
            r7 = r24
            r2 = 0
        L_0x0222:
            r0.a(r7, r12, r2, r10)
            int r2 = r12.f11207g
            int r10 = r10 + r2
            goto L_0x022b
        L_0x0229:
            r7 = r24
        L_0x022b:
            if (r6 == 0) goto L_0x0257
            int r2 = r1.b()
            r12 = -1
            if (r2 != r12) goto L_0x0280
            int r2 = r5.getPaddingTop()
            int r12 = r5.getPaddingBottom()
            int r12 = r12 + r2
            int r2 = r1.u()
            int r2 = r2 + r12
            int r12 = r1.q()
            int r12 = r12 + r2
            int r12 = r12 + r10
            int r2 = r1.b()
            int r2 = r5.d(r3, r12, r2)
            r4.measure(r9, r2)
            r0.f(r4, r11)
            goto L_0x0280
        L_0x0257:
            int r2 = r1.c()
            r12 = -1
            if (r2 != r12) goto L_0x0280
            int r2 = r5.getPaddingLeft()
            int r12 = r5.getPaddingRight()
            int r12 = r12 + r2
            int r2 = r1.r()
            int r2 = r2 + r12
            int r12 = r1.j()
            int r12 = r12 + r2
            int r12 = r12 + r10
            int r2 = r1.c()
            int r2 = r5.i(r3, r12, r2)
            r4.measure(r2, r9)
            r0.f(r4, r11)
        L_0x0280:
            e3.c r12 = new e3.c
            r12.<init>()
            r9 = 1
            r12.f11208h = r9
            r12.e = r14
            r12.f11214o = r11
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = 0
            goto L_0x0299
        L_0x0290:
            int r13 = r12.f11208h
            int r13 = r13 + r9
            r12.f11208h = r13
            int r13 = r2 + 1
            r2 = r20
        L_0x0299:
            boolean r9 = r12.f11216q
            float r15 = r1.d()
            r20 = 0
            int r15 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r15 == 0) goto L_0x02a7
            r15 = 1
            goto L_0x02a8
        L_0x02a7:
            r15 = 0
        L_0x02a8:
            r9 = r9 | r15
            r12.f11216q = r9
            boolean r9 = r12.f11217r
            float r15 = r1.h()
            int r15 = (r15 > r20 ? 1 : (r15 == r20 ? 0 : -1))
            if (r15 == 0) goto L_0x02b7
            r15 = 1
            goto L_0x02b8
        L_0x02b7:
            r15 = 0
        L_0x02b8:
            r9 = r9 | r15
            r12.f11217r = r9
            java.lang.Object r9 = r0.f734X
            int[] r9 = (int[]) r9
            if (r9 == 0) goto L_0x02c7
            int r15 = r7.size()
            r9[r11] = r15
        L_0x02c7:
            int r9 = r12.e
            if (r6 == 0) goto L_0x02d0
            int r15 = r4.getMeasuredWidth()
            goto L_0x02d4
        L_0x02d0:
            int r15 = r4.getMeasuredHeight()
        L_0x02d4:
            if (r6 == 0) goto L_0x02db
            int r20 = r1.r()
            goto L_0x02df
        L_0x02db:
            int r20 = r1.u()
        L_0x02df:
            int r15 = r15 + r20
            if (r6 == 0) goto L_0x02e8
            int r20 = r1.j()
            goto L_0x02ec
        L_0x02e8:
            int r20 = r1.q()
        L_0x02ec:
            int r15 = r15 + r20
            int r15 = r15 + r9
            r12.e = r15
            float r9 = r12.f11209j
            float r15 = r1.d()
            float r15 = r15 + r9
            r12.f11209j = r15
            float r9 = r12.f11210k
            float r15 = r1.h()
            float r15 = r15 + r9
            r12.f11210k = r15
            r5.a(r4, r11, r13, r12)
            if (r6 == 0) goto L_0x030d
            int r9 = r4.getMeasuredHeight()
            goto L_0x0311
        L_0x030d:
            int r9 = r4.getMeasuredWidth()
        L_0x0311:
            if (r6 == 0) goto L_0x0318
            int r15 = r1.u()
            goto L_0x031c
        L_0x0318:
            int r15 = r1.r()
        L_0x031c:
            int r9 = r9 + r15
            if (r6 == 0) goto L_0x0324
            int r15 = r1.q()
            goto L_0x0328
        L_0x0324:
            int r15 = r1.j()
        L_0x0328:
            int r9 = r9 + r15
            int r15 = r5.k(r4)
            int r15 = r15 + r9
            int r2 = java.lang.Math.max(r2, r15)
            int r9 = r12.f11207g
            int r9 = java.lang.Math.max(r9, r2)
            r12.f11207g = r9
            if (r6 == 0) goto L_0x036b
            int r9 = r5.getFlexWrap()
            r15 = 2
            if (r9 == r15) goto L_0x0355
            int r9 = r12.f11211l
            int r4 = r4.getBaseline()
            int r1 = r1.u()
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r9, r1)
            r12.f11211l = r1
            goto L_0x036b
        L_0x0355:
            int r9 = r12.f11211l
            int r15 = r4.getMeasuredHeight()
            int r4 = r4.getBaseline()
            int r15 = r15 - r4
            int r1 = r1.q()
            int r1 = r1 + r15
            int r1 = java.lang.Math.max(r9, r1)
            r12.f11211l = r1
        L_0x036b:
            int r15 = r23 + -1
            if (r11 != r15) goto L_0x037b
            int r1 = r12.a()
            if (r1 == 0) goto L_0x037b
            r0.a(r7, r12, r11, r10)
            int r1 = r12.f11207g
            int r10 = r10 + r1
        L_0x037b:
            r1 = r34
            r4 = -1
            if (r1 == r4) goto L_0x03a4
            int r9 = r7.size()
            if (r9 <= 0) goto L_0x03a4
            int r9 = r7.size()
            r18 = 1
            int r9 = r9 + -1
            java.lang.Object r9 = r7.get(r9)
            e3.c r9 = (e3.c) r9
            int r9 = r9.f11215p
            if (r9 < r1) goto L_0x03a6
            if (r11 < r1) goto L_0x03a6
            if (r33 != 0) goto L_0x03a6
            int r9 = r12.f11207g
            int r9 = -r9
            r15 = r32
            r10 = r9
            r9 = 1
            goto L_0x03aa
        L_0x03a4:
            r18 = 1
        L_0x03a6:
            r15 = r32
            r9 = r33
        L_0x03aa:
            if (r10 <= r15) goto L_0x03b3
            if (r9 == 0) goto L_0x03b3
            r2 = r29
            r1 = r27
            goto L_0x03c8
        L_0x03b3:
            r20 = r2
        L_0x03b5:
            int r11 = r11 + 1
            r2 = r30
            r4 = r1
            r33 = r9
            r15 = r23
            r1 = r27
            r9 = r7
            r7 = r26
            goto L_0x0071
        L_0x03c5:
            r15 = r1
            r2 = r29
        L_0x03c8:
            r2.f5768b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C7.d.e(V1.f, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            e3.b r0 = (e3.b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.m()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.m()
        L_0x0019:
            r3 = 1
            goto L_0x0027
        L_0x001b:
            int r3 = r0.t()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.t()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.l()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.l()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.o()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.o()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0057
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.F(r8, r1, r0, r7)
            java.lang.Object r0 = r6.f732V
            e3.a r0 = (e3.C0838a) r0
            r0.h(r7, r8)
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C7.d.f(android.view.View, int):void");
    }

    public void g(int i, List list) {
        int i8 = ((int[]) this.f734X)[i];
        if (i8 == -1) {
            i8 = 0;
        }
        if (list.size() > i8) {
            list.subList(i8, list.size()).clear();
        }
        int[] iArr = (int[]) this.f734X;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.f735Y;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i, length2, 0);
        }
    }

    public Object get() {
        return new z4.f((O4.a) ((M5.b) this.f732V).f3175U, (z4.b) ((M5.b) this.f733W).f3175U, (C1214b) ((M5.b) this.f734X).f3175U, (x4.f) ((a) this.f735Y).get(), (C1318a) ((a) this.f736Z).get());
    }

    public void i(C0071z zVar, C0071z zVar2, k kVar, k kVar2, Map.Entry entry) {
        C0071z zVar3;
        C0071z zVar4;
        k kVar3 = (k) entry.getValue();
        Size size = kVar.f2764g.f904a;
        O.b bVar = ((N.a) entry.getKey()).f3200a;
        if (kVar.f2761c) {
            zVar3 = zVar;
        } else {
            zVar3 = null;
        }
        C0007h hVar = new C0007h(size, bVar.f3470d, zVar3, ((N.a) entry.getKey()).f3200a.f3471f, ((N.a) entry.getKey()).f3200a.f3472g);
        Size size2 = kVar2.f2764g.f904a;
        O.b bVar2 = ((N.a) entry.getKey()).f3201b;
        if (kVar2.f2761c) {
            zVar4 = zVar2;
        } else {
            zVar4 = null;
        }
        C0007h hVar2 = new C0007h(size2, bVar2.f3470d, zVar4, ((N.a) entry.getKey()).f3201b.f3471f, ((N.a) entry.getKey()).f3201b.f3472g);
        O.b bVar3 = ((N.a) entry.getKey()).f3200a;
        kVar3.getClass();
        l.a();
        kVar3.a();
        n2.a.m("Consumer can only be linked once.", !kVar3.f2766j);
        kVar3.f2766j = true;
        j jVar = kVar3.f2768l;
        G.b f8 = i.f(jVar.c(), new M.i(kVar3, jVar, bVar3.f3469c, hVar, hVar2), D7.b.H());
        f8.d(new h(f8, 0, new A1.d(23, this, kVar3, false)), D7.b.H());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, e3.d] */
    public ArrayList j(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i8 = 0; i8 < i; i8++) {
            ? obj = new Object();
            obj.f11219V = ((b) ((C0838a) this.f732V).b(i8).getLayoutParams()).getOrder();
            obj.f11218U = i8;
            arrayList.add(obj);
        }
        return arrayList;
    }

    public void k(int i, int i8, int i9) {
        int i10;
        int i11;
        C0838a aVar = (C0838a) this.f732V;
        int flexDirection = aVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            i11 = View.MeasureSpec.getMode(i8);
            i10 = View.MeasureSpec.getSize(i8);
        } else if (flexDirection == 2 || flexDirection == 3) {
            i11 = View.MeasureSpec.getMode(i);
            i10 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException(g.m(flexDirection, "Invalid flex direction: "));
        }
        List<c> flexLinesInternal = aVar.getFlexLinesInternal();
        if (i11 == 1073741824) {
            int sumOfCrossSize = aVar.getSumOfCrossSize() + i9;
            int i12 = 0;
            if (flexLinesInternal.size() == 1) {
                ((c) flexLinesInternal.get(0)).f11207g = i10 - i9;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = aVar.getAlignContent();
                if (alignContent == 1) {
                    c cVar = new c();
                    cVar.f11207g = i10 - sumOfCrossSize;
                    flexLinesInternal.add(0, cVar);
                } else if (alignContent == 2) {
                    aVar.setFlexLines(h(i10, sumOfCrossSize, flexLinesInternal));
                } else if (alignContent != 3) {
                    if (alignContent != 4) {
                        if (alignContent == 5 && sumOfCrossSize < i10) {
                            float size = ((float) (i10 - sumOfCrossSize)) / ((float) flexLinesInternal.size());
                            int size2 = flexLinesInternal.size();
                            float f8 = 0.0f;
                            while (i12 < size2) {
                                c cVar2 = (c) flexLinesInternal.get(i12);
                                float f9 = ((float) cVar2.f11207g) + size;
                                if (i12 == flexLinesInternal.size() - 1) {
                                    f9 += f8;
                                    f8 = 0.0f;
                                }
                                int round = Math.round(f9);
                                float f10 = (f9 - ((float) round)) + f8;
                                if (f10 > 1.0f) {
                                    round++;
                                    f10 -= 1.0f;
                                } else if (f10 < -1.0f) {
                                    round--;
                                    f10 += 1.0f;
                                }
                                f8 = f10;
                                cVar2.f11207g = round;
                                i12++;
                            }
                        }
                    } else if (sumOfCrossSize >= i10) {
                        aVar.setFlexLines(h(i10, sumOfCrossSize, flexLinesInternal));
                    } else {
                        int size3 = (i10 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                        ArrayList arrayList = new ArrayList();
                        c cVar3 = new c();
                        cVar3.f11207g = size3;
                        for (c add : flexLinesInternal) {
                            arrayList.add(cVar3);
                            arrayList.add(add);
                            arrayList.add(cVar3);
                        }
                        aVar.setFlexLines(arrayList);
                    }
                } else if (sumOfCrossSize < i10) {
                    float size4 = ((float) (i10 - sumOfCrossSize)) / ((float) (flexLinesInternal.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size5 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i12 < size5) {
                        arrayList2.add((c) flexLinesInternal.get(i12));
                        if (i12 != flexLinesInternal.size() - 1) {
                            c cVar4 = new c();
                            if (i12 == flexLinesInternal.size() - 2) {
                                cVar4.f11207g = Math.round(f11 + size4);
                                f11 = 0.0f;
                            } else {
                                cVar4.f11207g = Math.round(size4);
                            }
                            int i13 = cVar4.f11207g;
                            float f12 = (size4 - ((float) i13)) + f11;
                            if (f12 > 1.0f) {
                                cVar4.f11207g = i13 + 1;
                                f12 -= 1.0f;
                            } else if (f12 < -1.0f) {
                                cVar4.f11207g = i13 - 1;
                                f12 += 1.0f;
                            }
                            f11 = f12;
                            arrayList2.add(cVar4);
                        }
                        i12++;
                    }
                    aVar.setFlexLines(arrayList2);
                }
            }
        }
    }

    public void l(int i, int i8, int i9) {
        int i10;
        int paddingLeft;
        int paddingRight;
        C0838a aVar = (C0838a) this.f732V;
        int flexItemCount = aVar.getFlexItemCount();
        boolean[] zArr = (boolean[]) this.f733W;
        int i11 = 0;
        if (zArr == null) {
            this.f733W = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.f733W = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i9 < aVar.getFlexItemCount()) {
            int flexDirection = aVar.getFlexDirection();
            int flexDirection2 = aVar.getFlexDirection();
            if (flexDirection2 == 0 || flexDirection2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                int largestMainSize = aVar.getLargestMainSize();
                if (mode != 1073741824) {
                    size = Math.min(largestMainSize, size);
                }
                paddingLeft = aVar.getPaddingLeft();
                paddingRight = aVar.getPaddingRight();
            } else if (flexDirection2 == 2 || flexDirection2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i8);
                i10 = View.MeasureSpec.getSize(i8);
                if (mode2 != 1073741824) {
                    i10 = aVar.getLargestMainSize();
                }
                paddingLeft = aVar.getPaddingTop();
                paddingRight = aVar.getPaddingBottom();
            } else {
                throw new IllegalArgumentException(g.m(flexDirection, "Invalid flex direction: "));
            }
            int i12 = paddingRight + paddingLeft;
            int[] iArr = (int[]) this.f734X;
            if (iArr != null) {
                i11 = iArr[i9];
            }
            List flexLinesInternal = aVar.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            while (i11 < size2) {
                c cVar = (c) flexLinesInternal.get(i11);
                int i13 = cVar.e;
                if (i13 < i10 && cVar.f11216q) {
                    p(i, i8, cVar, i10, i12, false);
                } else if (i13 > i10 && cVar.f11217r) {
                    A(i, i8, cVar, i10, i12, false);
                }
                i11++;
            }
        }
    }

    public void m(int i) {
        int[] iArr = (int[]) this.f734X;
        if (iArr == null) {
            this.f734X = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.f734X = Arrays.copyOf((int[]) this.f734X, Math.max(iArr.length * 2, i));
        }
    }

    public void n(int i) {
        long[] jArr = (long[]) this.f735Y;
        if (jArr == null) {
            this.f735Y = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f735Y = Arrays.copyOf((long[]) this.f735Y, Math.max(jArr.length * 2, i));
        }
    }

    public void o(int i) {
        long[] jArr = (long[]) this.f736Z;
        if (jArr == null) {
            this.f736Z = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.f736Z = Arrays.copyOf((long[]) this.f736Z, Math.max(jArr.length * 2, i));
        }
    }

    public void p(int i, int i8, c cVar, int i9, int i10, boolean z) {
        int i11;
        int i12;
        int i13;
        View view;
        C0838a aVar;
        View view2;
        b bVar;
        double d8;
        double d9;
        c cVar2 = cVar;
        int i14 = i9;
        float f8 = cVar2.f11209j;
        if (f8 > 0.0f && i14 >= (i11 = cVar2.e)) {
            float f9 = ((float) (i14 - i11)) / f8;
            cVar2.e = i10 + cVar2.f11206f;
            if (!z) {
                cVar2.f11207g = RecyclerView.UNDEFINED_DURATION;
            }
            int i15 = 0;
            boolean z6 = false;
            int i16 = 0;
            float f10 = 0.0f;
            while (i15 < cVar2.f11208h) {
                int i17 = cVar2.f11214o + i15;
                C0838a aVar2 = (C0838a) this.f732V;
                View g8 = aVar2.g(i17);
                if (g8 == null || g8.getVisibility() == 8) {
                    int i18 = i8;
                    i12 = i11;
                } else {
                    b bVar2 = (b) g8.getLayoutParams();
                    int flexDirection = aVar2.getFlexDirection();
                    if (flexDirection == 0 || flexDirection == 1) {
                        i12 = i11;
                        int measuredWidth = g8.getMeasuredWidth();
                        long[] jArr = (long[]) this.f736Z;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i17];
                        }
                        int measuredHeight = g8.getMeasuredHeight();
                        long[] jArr2 = (long[]) this.f736Z;
                        if (jArr2 != null) {
                            long j7 = jArr2[i17];
                            aVar = aVar2;
                            view = g8;
                            measuredHeight = (int) (j7 >> 32);
                        } else {
                            aVar = aVar2;
                            view = g8;
                        }
                        if (((boolean[]) this.f733W)[i17] || bVar2.d() <= 0.0f) {
                            int i19 = i8;
                            view2 = view;
                        } else {
                            float d10 = (bVar2.d() * f9) + ((float) measuredWidth);
                            if (i15 == cVar2.f11208h - 1) {
                                d10 += f10;
                                f10 = 0.0f;
                            }
                            int round = Math.round(d10);
                            if (round > bVar2.t()) {
                                round = bVar2.t();
                                ((boolean[]) this.f733W)[i17] = true;
                                cVar2.f11209j -= bVar2.d();
                                bVar = bVar2;
                                z6 = true;
                            } else {
                                float f11 = (d10 - ((float) round)) + f10;
                                bVar = bVar2;
                                double d11 = (double) f11;
                                if (d11 > 1.0d) {
                                    round++;
                                    d8 = d11 - 1.0d;
                                } else {
                                    if (d11 < -1.0d) {
                                        round--;
                                        d8 = d11 + 1.0d;
                                    }
                                    f10 = f11;
                                }
                                f11 = (float) d8;
                                f10 = f11;
                            }
                            bVar2 = bVar;
                            int q7 = q(i8, bVar2, cVar2.f11212m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, O7.b.MAX_POW2);
                            view2 = view;
                            view2.measure(makeMeasureSpec, q7);
                            int measuredWidth2 = view2.getMeasuredWidth();
                            int measuredHeight2 = view2.getMeasuredHeight();
                            F(i17, makeMeasureSpec, q7, view2);
                            aVar.h(view2, i17);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i16, aVar.k(view2) + bVar2.q() + bVar2.u() + measuredHeight);
                        cVar2.e = bVar2.j() + bVar2.r() + measuredWidth + cVar2.e;
                        i13 = max;
                    } else {
                        int measuredHeight3 = g8.getMeasuredHeight();
                        long[] jArr3 = (long[]) this.f736Z;
                        if (jArr3 != null) {
                            i12 = i11;
                            measuredHeight3 = (int) (jArr3[i17] >> 32);
                        } else {
                            i12 = i11;
                        }
                        int measuredWidth3 = g8.getMeasuredWidth();
                        long[] jArr4 = (long[]) this.f736Z;
                        if (jArr4 != null) {
                            measuredWidth3 = (int) jArr4[i17];
                        }
                        if (((boolean[]) this.f733W)[i17] || bVar2.d() <= 0.0f) {
                            int i20 = i;
                        } else {
                            float d12 = (bVar2.d() * f9) + ((float) measuredHeight3);
                            if (i15 == cVar2.f11208h - 1) {
                                d12 += f10;
                                f10 = 0.0f;
                            }
                            int round2 = Math.round(d12);
                            if (round2 > bVar2.o()) {
                                round2 = bVar2.o();
                                ((boolean[]) this.f733W)[i17] = true;
                                cVar2.f11209j -= bVar2.d();
                                z6 = true;
                            } else {
                                float f12 = (d12 - ((float) round2)) + f10;
                                double d13 = (double) f12;
                                if (d13 > 1.0d) {
                                    round2++;
                                    d9 = d13 - 1.0d;
                                } else {
                                    if (d13 < -1.0d) {
                                        round2--;
                                        d9 = d13 + 1.0d;
                                    }
                                    f10 = f12;
                                }
                                f12 = (float) d9;
                                f10 = f12;
                            }
                            int r8 = r(i, bVar2, cVar2.f11212m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, O7.b.MAX_POW2);
                            g8.measure(r8, makeMeasureSpec2);
                            int measuredWidth4 = g8.getMeasuredWidth();
                            int measuredHeight4 = g8.getMeasuredHeight();
                            F(i17, r8, makeMeasureSpec2, g8);
                            aVar2.h(g8, i17);
                            measuredWidth3 = measuredWidth4;
                            measuredHeight3 = measuredHeight4;
                        }
                        i13 = Math.max(i16, aVar2.k(g8) + bVar2.j() + bVar2.r() + measuredWidth3);
                        cVar2.e = bVar2.q() + bVar2.u() + measuredHeight3 + cVar2.e;
                        int i21 = i8;
                    }
                    cVar2.f11207g = Math.max(cVar2.f11207g, i13);
                    i16 = i13;
                }
                i15++;
                i11 = i12;
            }
            int i22 = i8;
            int i23 = i11;
            if (z6 && i23 != cVar2.e) {
                p(i, i8, cVar, i9, i10, true);
            }
        }
    }

    public int q(int i, b bVar, int i8) {
        C0838a aVar = (C0838a) this.f732V;
        int d8 = aVar.d(i, bVar.q() + bVar.u() + aVar.getPaddingBottom() + aVar.getPaddingTop() + i8, bVar.b());
        int size = View.MeasureSpec.getSize(d8);
        if (size > bVar.o()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.o(), View.MeasureSpec.getMode(d8));
        }
        if (size < bVar.l()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.l(), View.MeasureSpec.getMode(d8));
        }
        return d8;
    }

    public int r(int i, b bVar, int i8) {
        C0838a aVar = (C0838a) this.f732V;
        int i9 = aVar.i(i, bVar.j() + bVar.r() + aVar.getPaddingRight() + aVar.getPaddingLeft() + i8, bVar.c());
        int size = View.MeasureSpec.getSize(i9);
        if (size > bVar.t()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.t(), View.MeasureSpec.getMode(i9));
        }
        if (size < bVar.m()) {
            return View.MeasureSpec.makeMeasureSpec(bVar.m(), View.MeasureSpec.getMode(i9));
        }
        return i9;
    }

    public long s(int i) {
        return ((long[]) this.f733W)[i];
    }

    public int s0() {
        return ((long[]) this.f733W).length;
    }

    public boolean t(ComponentName componentName) {
        if (componentName == null || (!n2.a.M0(componentName.flattenToShortString(), (String[]) this.f736Z) && !n2.a.M0(componentName.flattenToString(), (String[]) this.f736Z))) {
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.f731U) {
            case 5:
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append((String) this.f733W);
                sb.append(", url=");
                sb.append((o) this.f732V);
                m mVar = (m) this.f734X;
                if (mVar.size() != 0) {
                    sb.append(", headers=[");
                    Iterator it = mVar.iterator();
                    int i = 0;
                    while (true) {
                        D6.b bVar = (D6.b) it;
                        if (bVar.hasNext()) {
                            Object next = bVar.next();
                            int i8 = i + 1;
                            if (i >= 0) {
                                C6.c cVar = (C6.c) next;
                                String str = (String) cVar.f711U;
                                String str2 = (String) cVar.f712V;
                                if (i > 0) {
                                    sb.append(", ");
                                }
                                sb.append(str);
                                sb.append(':');
                                sb.append(str2);
                                i = i8;
                            } else {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                        } else {
                            sb.append(']');
                        }
                    }
                }
                Map map = (Map) this.f735Y;
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                P6.f.d(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public boolean u(ComponentName componentName) {
        if (componentName != null) {
            if (n2.a.M0(componentName.flattenToShortString(), (String[]) this.f735Y) || n2.a.M0(componentName.flattenToString(), (String[]) this.f735Y) || componentName.flattenToString().startsWith("com.android.vending/com.google.android.finsky.billing.") || componentName.flattenToString().startsWith("com.google.android.gms/com.google.android.gms.autofill.")) {
                return true;
            }
            if (!C0794w0.Z((FullyActivity) this.f732V) || ((Z1.c) ((d4.k) this.f733W).f9767W).n("mdmDisableADB", true) || !componentName.flattenToString().startsWith("com.android.systemui/com.android.systemui.usb.UsbDebuggingActivity")) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean v(String str) {
        if (!str.equals(((FullyActivity) this.f732V).getPackageName()) && !str.equals("com.google.android.packageinstaller") && !str.equals("com.android.packageinstaller") && !str.equals("com.android.dreams.basic") && !str.equals("com.samsung.klmsagent") && !str.equals("com.samsung.android.knox.containercore") && !str.equals("com.sec.esdk.elm") && !str.equals("com.sec.android.inputmethod") && !str.equals("com.google.android.permissioncontroller") && !str.equals("android")) {
            boolean equals = str.equals("com.android.chrome");
            d4.k kVar = (d4.k) this.f733W;
            if ((!equals || !kVar.e2().contains("component=org.chromium.webapk") || !kVar.g2().booleanValue()) && !n2.a.M0(str, (String[]) this.f735Y) && !str.equals((String) this.f734X) && (!kVar.e2().contains("component=".concat(str)) || !kVar.g2().booleanValue())) {
                return false;
            }
        }
        return true;
    }

    public void w(View view, c cVar, int i, int i8, int i9, int i10) {
        b bVar = (b) view.getLayoutParams();
        C0838a aVar = (C0838a) this.f732V;
        int alignItems = aVar.getAlignItems();
        if (bVar.g() != -1) {
            alignItems = bVar.g();
        }
        int i11 = cVar.f11207g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int u3 = ((bVar.u() + (i11 - view.getMeasuredHeight())) - bVar.q()) / 2;
                    if (aVar.getFlexWrap() != 2) {
                        int i12 = i8 + u3;
                        view.layout(i, i12, i9, view.getMeasuredHeight() + i12);
                        return;
                    }
                    int i13 = i8 - u3;
                    view.layout(i, i13, i9, view.getMeasuredHeight() + i13);
                    return;
                } else if (alignItems != 3) {
                    if (alignItems != 4) {
                        return;
                    }
                } else if (aVar.getFlexWrap() != 2) {
                    int max = Math.max(cVar.f11211l - view.getBaseline(), bVar.u());
                    view.layout(i, i8 + max, i9, i10 + max);
                    return;
                } else {
                    int max2 = Math.max(view.getBaseline() + (cVar.f11211l - view.getMeasuredHeight()), bVar.q());
                    view.layout(i, i8 - max2, i9, i10 - max2);
                    return;
                }
            } else if (aVar.getFlexWrap() != 2) {
                int i14 = i8 + i11;
                view.layout(i, (i14 - view.getMeasuredHeight()) - bVar.q(), i9, i14 - bVar.q());
                return;
            } else {
                view.layout(i, bVar.u() + view.getMeasuredHeight() + (i8 - i11), i9, bVar.u() + view.getMeasuredHeight() + (i10 - i11));
                return;
            }
        }
        if (aVar.getFlexWrap() != 2) {
            view.layout(i, bVar.u() + i8, i9, bVar.u() + i10);
        } else {
            view.layout(i, i8 - bVar.q(), i9, i10 - bVar.q());
        }
    }

    public void x(View view, c cVar, boolean z, int i, int i8, int i9, int i10) {
        b bVar = (b) view.getLayoutParams();
        int alignItems = ((C0838a) this.f732V).getAlignItems();
        if (bVar.g() != -1) {
            alignItems = bVar.g();
        }
        int i11 = cVar.f11207g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int marginStart = ((marginLayoutParams.getMarginStart() + (i11 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                    if (!z) {
                        view.layout(i + marginStart, i8, i9 + marginStart, i10);
                        return;
                    } else {
                        view.layout(i - marginStart, i8, i9 - marginStart, i10);
                        return;
                    }
                } else if (!(alignItems == 3 || alignItems == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i11) - view.getMeasuredWidth()) - bVar.j(), i8, ((i9 + i11) - view.getMeasuredWidth()) - bVar.j(), i10);
                return;
            } else {
                int r8 = bVar.r();
                view.layout(bVar.r() + view.getMeasuredWidth() + (i - i11), i8, r8 + view.getMeasuredWidth() + (i9 - i11), i10);
                return;
            }
        }
        if (!z) {
            view.layout(bVar.r() + i, i8, bVar.r() + i9, i10);
        } else {
            view.layout(i - bVar.j(), i8, i9 - bVar.j(), i10);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, B3.q] */
    public q y() {
        LinkedHashMap linkedHashMap;
        ? obj = new Object();
        obj.f452X = new LinkedHashMap();
        obj.f449U = (o) this.f732V;
        obj.f450V = (String) this.f733W;
        Map map = (Map) this.f735Y;
        if (map.isEmpty()) {
            linkedHashMap = new LinkedHashMap();
        } else {
            linkedHashMap = new LinkedHashMap(map);
        }
        obj.f452X = linkedHashMap;
        obj.f451W = ((m) this.f734X).d();
        return obj;
    }

    public void z(String str) {
        this.f734X = str;
        if (str != null) {
            I1.f10009b = str;
            I1.e((FullyActivity) this.f732V);
            return;
        }
        ArrayList arrayList = I1.f10008a;
    }

    public d(FullyActivity fullyActivity) {
        this.f731U = 6;
        this.f732V = fullyActivity;
        this.f733W = new d4.k((Context) fullyActivity, 1);
    }

    public d(o oVar, String str, m mVar, Q7.g gVar, Map map) {
        this.f731U = 5;
        P6.f.e(oVar, "url");
        P6.f.e(str, "method");
        this.f732V = oVar;
        this.f733W = str;
        this.f734X = mVar;
        this.f735Y = map;
    }

    public d(M5.b bVar, M5.b bVar2, M5.b bVar3, a aVar, a aVar2) {
        this.f731U = 8;
        this.f732V = bVar;
        this.f733W = bVar2;
        this.f734X = bVar3;
        this.f735Y = aVar;
        this.f736Z = aVar2;
    }

    public d(MyApplication myApplication, C1395d dVar, v.i iVar) {
        this.f731U = 0;
        this.f732V = myApplication;
        this.f733W = dVar;
        this.f734X = iVar;
        this.f735Y = new F2.e(myApplication, 13);
        this.f736Z = new q4.k(22);
    }

    public d(S1.c cVar, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f731U = 4;
        this.f732V = cVar;
        this.f735Y = hashMap2;
        this.f736Z = hashMap3;
        this.f734X = DesugarCollections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f733W = jArr;
    }

    public d(C0071z zVar, C0071z zVar2, N.f fVar) {
        this.f731U = 3;
        this.f733W = zVar;
        this.f734X = zVar2;
        this.f732V = fVar;
    }

    public d(C0838a aVar) {
        this.f731U = 7;
        this.f732V = aVar;
    }
}
