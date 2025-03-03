package H;

import D.C0069x;
import E.b;
import E.c;
import F.h;
import android.util.Rational;
import android.util.Size;
import android.view.View;
import g3.C0958a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import v0.C1523V;
import v0.j0;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f1794a;

    /* renamed from: b  reason: collision with root package name */
    public int f1795b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1796c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1797d;
    public final Object e;

    public j(C0069x xVar, Size size) {
        Rational rational;
        this.f1796c = xVar;
        this.f1794a = xVar.c();
        this.f1795b = xVar.d();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List l8 = xVar.l(256);
            if (l8.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(l8, new c(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f1797d = rational;
        this.e = new k(xVar, rational);
    }

    public static ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(b.f1282a);
        arrayList2.add(b.f1284c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (b.a((Rational) it2.next(), size)) {
                            break;
                        }
                    } else {
                        arrayList2.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational c(int i, boolean z) {
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    h.l("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
                } else if (z) {
                    return b.f1284c;
                } else {
                    return b.f1285d;
                }
            } else if (z) {
                return b.f1282a;
            } else {
                return b.f1283b;
            }
        }
        return null;
    }

    public static HashMap d(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = a(arrayList).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (b.a(rational, size)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static void f(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void g(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: android.util.Rational} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.util.Rational} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.util.Size} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.util.Rational} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.util.Rational} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: android.util.Rational} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.util.Rational} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: android.util.Rational} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.util.Rational} */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b7, code lost:
        if (L.a.a(r0) < (r5.getHeight() * r5.getWidth())) goto L_0x00b9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List b(D.L0 r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = 0
            r2 = r14
            D.X r2 = (D.X) r2
            java.util.ArrayList r3 = r2.S()
            if (r3 == 0) goto L_0x000c
            return r3
        L_0x000c:
            P.b r3 = r2.T()
            java.util.List r4 = r2.u()
            int r5 = r14.A()
            if (r4 == 0) goto L_0x0039
            java.util.Iterator r4 = r4.iterator()
        L_0x001e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0039
            java.lang.Object r6 = r4.next()
            android.util.Pair r6 = (android.util.Pair) r6
            java.lang.Object r7 = r6.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 != r5) goto L_0x001e
            java.lang.Object r4 = r6.second
            android.util.Size[] r4 = (android.util.Size[]) r4
            goto L_0x003a
        L_0x0039:
            r4 = r1
        L_0x003a:
            if (r4 != 0) goto L_0x003e
            r4 = r1
            goto L_0x0042
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)
        L_0x0042:
            if (r4 != 0) goto L_0x004c
            java.lang.Object r4 = r13.f1796c
            D.x r4 = (D.C0069x) r4
            java.util.List r4 = r4.l(r5)
        L_0x004c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            E.c r4 = new E.c
            r7 = 1
            r4.<init>(r7)
            java.util.Collections.sort(r6, r4)
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto L_0x0078
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "The retrieved supported resolutions from camera info internal is empty. Format is "
            r4.<init>(r8)
            r4.append(r5)
            java.lang.String r5 = "."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "SupportedOutputSizesCollector"
            F.h.I(r5, r4)
        L_0x0078:
            if (r3 != 0) goto L_0x0205
            java.lang.Object r2 = r13.e
            H.k r2 = (H.k) r2
            r2.getClass()
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x0089
            goto L_0x01e0
        L_0x0089:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            E.c r4 = new E.c
            r4.<init>(r7)
            java.util.Collections.sort(r3, r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            D.X r14 = (D.X) r14
            android.util.Size r5 = r14.c0()
            java.lang.Object r0 = r3.get(r0)
            android.util.Size r0 = (android.util.Size) r0
            if (r5 == 0) goto L_0x00b9
            int r6 = L.a.a(r0)
            int r8 = r5.getWidth()
            int r9 = r5.getHeight()
            int r9 = r9 * r8
            if (r6 >= r9) goto L_0x00ba
        L_0x00b9:
            r5 = r0
        L_0x00ba:
            android.util.Size r0 = r2.c(r14)
            android.util.Size r6 = L.a.f2674b
            int r8 = L.a.a(r6)
            int r9 = L.a.a(r5)
            if (r9 >= r8) goto L_0x00cd
            android.util.Size r6 = L.a.f2673a
            goto L_0x00dc
        L_0x00cd:
            if (r0 == 0) goto L_0x00dc
            int r9 = r0.getWidth()
            int r10 = r0.getHeight()
            int r10 = r10 * r9
            if (r10 >= r8) goto L_0x00dc
            r6 = r0
        L_0x00dc:
            java.util.Iterator r8 = r3.iterator()
        L_0x00e0:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0116
            java.lang.Object r9 = r8.next()
            android.util.Size r9 = (android.util.Size) r9
            int r10 = L.a.a(r9)
            int r11 = r5.getWidth()
            int r12 = r5.getHeight()
            int r12 = r12 * r11
            if (r10 > r12) goto L_0x00e0
            int r10 = r9.getWidth()
            int r11 = r9.getHeight()
            int r11 = r11 * r10
            int r10 = L.a.a(r6)
            if (r11 < r10) goto L_0x00e0
            boolean r10 = r4.contains(r9)
            if (r10 != 0) goto L_0x00e0
            r4.add(r9)
            goto L_0x00e0
        L_0x0116:
            boolean r8 = r4.isEmpty()
            if (r8 != 0) goto L_0x01e1
            boolean r3 = r14.r()
            if (r3 == 0) goto L_0x012d
            int r1 = r14.v()
            boolean r3 = r2.f1800c
            android.util.Rational r1 = c(r1, r3)
            goto L_0x015c
        L_0x012d:
            android.util.Size r3 = r2.c(r14)
            if (r3 == 0) goto L_0x015c
            java.util.ArrayList r1 = a(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x013b:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x014f
            java.lang.Object r5 = r1.next()
            android.util.Rational r5 = (android.util.Rational) r5
            boolean r6 = E.b.a(r5, r3)
            if (r6 == 0) goto L_0x013b
            r1 = r5
            goto L_0x015c
        L_0x014f:
            android.util.Rational r1 = new android.util.Rational
            int r5 = r3.getWidth()
            int r3 = r3.getHeight()
            r1.<init>(r5, r3)
        L_0x015c:
            if (r0 != 0) goto L_0x0162
            android.util.Size r0 = r14.g0()
        L_0x0162:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            if (r1 != 0) goto L_0x0177
            r6.addAll(r4)
            if (r0 == 0) goto L_0x01e0
            f(r6, r0, r7)
            goto L_0x01e0
        L_0x0177:
            java.util.HashMap r14 = d(r4)
            if (r0 == 0) goto L_0x019b
            java.util.Set r3 = r14.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0185:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x019b
            java.lang.Object r4 = r3.next()
            android.util.Rational r4 = (android.util.Rational) r4
            java.lang.Object r4 = r14.get(r4)
            java.util.List r4 = (java.util.List) r4
            f(r4, r0, r7)
            goto L_0x0185
        L_0x019b:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Set r3 = r14.keySet()
            r0.<init>(r3)
            E.a r3 = new E.a
            java.io.Serializable r2 = r2.f1801d
            android.util.Rational r2 = (android.util.Rational) r2
            r3.<init>((android.util.Rational) r1, (android.util.Rational) r2)
            java.util.Collections.sort(r0, r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x01b4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e0
            java.lang.Object r1 = r0.next()
            android.util.Rational r1 = (android.util.Rational) r1
            java.lang.Object r1 = r14.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x01ca:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01b4
            java.lang.Object r2 = r1.next()
            android.util.Size r2 = (android.util.Size) r2
            boolean r3 = r6.contains(r2)
            if (r3 != 0) goto L_0x01ca
            r6.add(r2)
            goto L_0x01ca
        L_0x01e0:
            return r6
        L_0x01e1:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "All supported output sizes are filtered out according to current resolution selection settings. \nminSize = "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r1 = "\nmaxSize = "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = "\ninitial size list: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x0205:
            r3 = r14
            D.X r3 = (D.X) r3
            android.util.Size r3 = r3.c0()
            int r4 = r2.h0(r0)
            boolean r5 = r14.R()
            if (r5 != 0) goto L_0x0219
            r14.A()
        L_0x0219:
            P.b r14 = r2.w()
            P.a r2 = r14.f3682a
            java.util.HashMap r5 = d(r6)
            java.lang.Object r6 = r13.f1797d
            android.util.Rational r6 = (android.util.Rational) r6
            if (r6 == 0) goto L_0x0233
            int r8 = r6.getNumerator()
            int r9 = r6.getDenominator()
            if (r8 < r9) goto L_0x0235
        L_0x0233:
            r8 = 1
            goto L_0x0236
        L_0x0235:
            r8 = 0
        L_0x0236:
            r2.getClass()
            android.util.Rational r2 = c(r0, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.Set r9 = r5.keySet()
            r8.<init>(r9)
            E.a r9 = new E.a
            r9.<init>((android.util.Rational) r2, (android.util.Rational) r6)
            java.util.Collections.sort(r8, r9)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r6 = r8.iterator()
        L_0x0257:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x026d
            java.lang.Object r8 = r6.next()
            android.util.Rational r8 = (android.util.Rational) r8
            java.lang.Object r9 = r5.get(r8)
            java.util.List r9 = (java.util.List) r9
            r2.put(r8, r9)
            goto L_0x0257
        L_0x026d:
            if (r3 == 0) goto L_0x02bb
            android.util.Size r5 = L.a.f2673a
            int r5 = r3.getWidth()
            int r3 = r3.getHeight()
            int r3 = r3 * r5
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0283:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02bb
            java.lang.Object r6 = r5.next()
            android.util.Rational r6 = (android.util.Rational) r6
            java.lang.Object r6 = r2.get(r6)
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r6.iterator()
        L_0x029e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x02b4
            java.lang.Object r10 = r9.next()
            android.util.Size r10 = (android.util.Size) r10
            int r11 = L.a.a(r10)
            if (r11 > r3) goto L_0x029e
            r8.add(r10)
            goto L_0x029e
        L_0x02b4:
            r6.clear()
            r6.addAll(r8)
            goto L_0x0283
        L_0x02bb:
            P.c r3 = r14.f3683b
            if (r3 != 0) goto L_0x02c0
            goto L_0x0319
        L_0x02c0:
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x02c8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0319
            java.lang.Object r6 = r5.next()
            android.util.Rational r6 = (android.util.Rational) r6
            java.lang.Object r6 = r2.get(r6)
            java.util.List r6 = (java.util.List) r6
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x02e1
            goto L_0x02c8
        L_0x02e1:
            P.c r8 = P.c.f3685c
            boolean r8 = r3.equals(r8)
            if (r8 == 0) goto L_0x02ea
            goto L_0x02c8
        L_0x02ea:
            int r8 = r3.f3687b
            android.util.Size r9 = r3.f3686a
            if (r8 == 0) goto L_0x030c
            if (r8 == r7) goto L_0x0308
            r10 = 2
            if (r8 == r10) goto L_0x0304
            r10 = 3
            if (r8 == r10) goto L_0x0300
            r10 = 4
            if (r8 == r10) goto L_0x02fc
            goto L_0x02c8
        L_0x02fc:
            g(r6, r9, r0)
            goto L_0x02c8
        L_0x0300:
            g(r6, r9, r7)
            goto L_0x02c8
        L_0x0304:
            f(r6, r9, r0)
            goto L_0x02c8
        L_0x0308:
            f(r6, r9, r7)
            goto L_0x02c8
        L_0x030c:
            boolean r8 = r6.contains(r9)
            r6.clear()
            if (r8 == 0) goto L_0x02c8
            r6.add(r9)
            goto L_0x02c8
        L_0x0319:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0326:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x034c
            java.lang.Object r5 = r2.next()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L_0x0336:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0326
            java.lang.Object r6 = r5.next()
            android.util.Size r6 = (android.util.Size) r6
            boolean r8 = r3.contains(r6)
            if (r8 != 0) goto L_0x0336
            r3.add(r6)
            goto L_0x0336
        L_0x034c:
            N5.l r14 = r14.f3684c
            if (r14 != 0) goto L_0x0352
            goto L_0x03c0
        L_0x0352:
            int r2 = com.bumptech.glide.c.z(r4)
            int r4 = r13.f1795b
            if (r4 != r7) goto L_0x035b
            goto L_0x035c
        L_0x035b:
            r7 = 0
        L_0x035c:
            int r4 = r13.f1794a
            com.bumptech.glide.c.p(r2, r4, r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            N5.p r14 = r14.f3423a
            d4.k r14 = r14.f3441b
            r14.getClass()
            r4 = 101376(0x18c00, float:1.42058E-40)
            java.lang.Object r14 = r14.f9767W     // Catch:{ Exception -> 0x0382 }
            Z1.c r14 = (Z1.c) r14     // Catch:{ Exception -> 0x0382 }
            java.lang.String r5 = "motionDetectionResolution"
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0382 }
            java.lang.String r14 = r14.r(r5, r6)     // Catch:{ Exception -> 0x0382 }
            int r4 = java.lang.Integer.parseInt(r14)     // Catch:{ Exception -> 0x0382 }
        L_0x0382:
            java.util.Iterator r14 = r2.iterator()
        L_0x0386:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x03af
            java.lang.Object r5 = r14.next()
            android.util.Size r5 = (android.util.Size) r5
            int r6 = r5.getWidth()
            int r7 = r5.getHeight()
            int r7 = r7 * r6
            int r6 = r7 - r4
            int r6 = java.lang.Math.abs(r6)
            int r8 = r0 - r4
            int r8 = java.lang.Math.abs(r8)
            if (r6 < r8) goto L_0x03ac
            if (r0 != 0) goto L_0x0386
        L_0x03ac:
            r1 = r5
            r0 = r7
            goto L_0x0386
        L_0x03af:
            if (r1 == 0) goto L_0x03b9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r1)
        L_0x03b9:
            boolean r14 = r3.containsAll(r2)
            if (r14 == 0) goto L_0x03c1
            r3 = r2
        L_0x03c0:
            return r3
        L_0x03c1:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The returned sizes list of the resolution filter must be a subset of the provided sizes list."
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: H.j.b(D.L0):java.util.List");
    }

    public void e(j0 j0Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1523V v4 = (C1523V) it.next();
            if ((v4.f15904a.c() & 8) != 0) {
                int i = this.f1795b;
                ((View) this.f1797d).setTranslationY((float) C0958a.c(v4.f15904a.b(), i, 0));
                return;
            }
        }
    }

    public j(View view) {
        this.e = new int[2];
        this.f1797d = view;
    }
}
