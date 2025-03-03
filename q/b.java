package Q;

import D.C0069x;
import D.C0071z;
import D.L0;
import E.c;
import E.f;
import F.h;
import H.j;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Rational;
import android.util.Size;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final double f3961h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a  reason: collision with root package name */
    public final Size f3962a;

    /* renamed from: b  reason: collision with root package name */
    public final Rational f3963b;

    /* renamed from: c  reason: collision with root package name */
    public final Rational f3964c;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f3965d;
    public final j e;

    /* renamed from: f  reason: collision with root package name */
    public final C0069x f3966f;

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f3967g = new HashMap();

    public b(C0071z zVar, HashSet hashSet) {
        Rational rational;
        Size d8 = f.d(zVar.m().O());
        C0069x l8 = zVar.l();
        j jVar = new j(l8, d8);
        this.f3962a = d8;
        if (((double) d8.getWidth()) / ((double) d8.getHeight()) > f3961h) {
            rational = E.b.f1284c;
        } else {
            rational = E.b.f1282a;
        }
        h.j("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + d8 + ") is " + rational + ".");
        this.f3963b = rational;
        Rational rational2 = E.b.f1282a;
        if (rational.equals(rational2)) {
            rational2 = E.b.f1284c;
        } else if (!rational.equals(E.b.f1284c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.f3964c = rational2;
        this.f3966f = l8;
        this.f3965d = hashSet;
        this.e = jVar;
    }

    public static Rect a(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational g8 = g(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational g9 = g(size);
        if (g8.floatValue() == g9.floatValue()) {
            rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
        } else {
            if (g8.floatValue() > g9.floatValue()) {
                float f8 = (float) width;
                float floatValue = f8 / g8.floatValue();
                float f9 = (((float) height) - floatValue) / 2.0f;
                rectF2 = new RectF(0.0f, f9, f8, floatValue + f9);
            } else {
                float f10 = (float) height;
                float floatValue2 = g8.floatValue() * f10;
                float f11 = (((float) width) - floatValue2) / 2.0f;
                rectF2 = new RectF(f11, 0.0f, floatValue2 + f11, f10);
            }
            rectF = rectF2;
        }
        Rect rect = new Rect();
        rectF.round(rect);
        return rect;
    }

    public static boolean c(Size size, Size size2) {
        if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth()) {
            return true;
        }
        return false;
    }

    public static Rational g(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public final List b(L0 l02) {
        Rational rational;
        if (this.f3965d.contains(l02)) {
            HashMap hashMap = this.f3967g;
            if (hashMap.containsKey(l02)) {
                List list = (List) hashMap.get(l02);
                Objects.requireNonNull(list);
                return list;
            }
            List<Size> b8 = this.e.b(l02);
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            for (Size size : b8) {
                Iterator it = hashMap2.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        rational = null;
                        break;
                    }
                    rational = (Rational) it.next();
                    if (E.b.a(rational, size)) {
                        break;
                    }
                }
                if (rational != null) {
                    Size size2 = (Size) hashMap2.get(rational);
                    Objects.requireNonNull(size2);
                    if (size.getHeight() <= size2.getHeight() && size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                } else {
                    rational = g(size);
                }
                arrayList.add(size);
                hashMap2.put(rational, size);
            }
            hashMap.put(l02, arrayList);
            return arrayList;
        }
        throw new IllegalArgumentException("Invalid child config: " + l02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(android.util.Rational r5, android.util.Size r6) {
        /*
            r4 = this;
            android.util.Rational r0 = r4.f3963b
            boolean r1 = r0.equals(r5)
            r2 = 0
            if (r1 != 0) goto L_0x0047
            boolean r1 = E.b.a(r5, r6)
            if (r1 == 0) goto L_0x0010
            goto L_0x0047
        L_0x0010:
            float r0 = r0.floatValue()
            float r5 = r5.floatValue()
            android.util.Rational r1 = E.b.f1282a
            boolean r3 = E.b.a(r1, r6)
            if (r3 == 0) goto L_0x0021
            goto L_0x002e
        L_0x0021:
            android.util.Rational r1 = E.b.f1284c
            boolean r3 = E.b.a(r1, r6)
            if (r3 == 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            android.util.Rational r1 = g(r6)
        L_0x002e:
            float r6 = r1.floatValue()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0047
            int r1 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x003b
            goto L_0x0047
        L_0x003b:
            r3 = 1
            if (r0 <= 0) goto L_0x0044
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0047
        L_0x0042:
            r2 = 1
            goto L_0x0047
        L_0x0044:
            if (r1 <= 0) goto L_0x0047
            goto L_0x0042
        L_0x0047:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.b.d(android.util.Rational, android.util.Size):boolean");
    }

    public final ArrayList e(List list, boolean z) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = E.b.f1282a;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = E.b.f1284c;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        list2 = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (E.b.a(rational3, size)) {
                        list2 = (List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational g8 = g(size);
                    arrayList.add(g8);
                    hashMap.put(g8, list2);
                }
                list2.add(size);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new a(0, g(this.f3962a)));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(E.b.f1284c) && !rational4.equals(E.b.f1282a)) {
                List list3 = (List) hashMap.get(rational4);
                Objects.requireNonNull(list3);
                arrayList3.addAll(f(rational4, list3, z));
            }
        }
        return arrayList3;
    }

    public final ArrayList f(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2;
        ArrayList<Size> arrayList3 = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (E.b.a(rational, size)) {
                arrayList3.add(size);
            }
        }
        Collections.sort(arrayList3, new c(true));
        HashSet hashSet = new HashSet(arrayList3);
        Iterator it2 = this.f3965d.iterator();
        while (it2.hasNext()) {
            List<Size> b8 = b((L0) it2.next());
            if (!z) {
                ArrayList arrayList4 = new ArrayList();
                for (Size size2 : b8) {
                    if (!d(rational, size2)) {
                        arrayList4.add(size2);
                    }
                }
                b8 = arrayList4;
            }
            if (b8.isEmpty()) {
                return new ArrayList();
            }
            if (b8.isEmpty() || arrayList3.isEmpty()) {
                arrayList3 = new ArrayList<>();
            } else {
                ArrayList arrayList5 = new ArrayList();
                for (Size size3 : arrayList3) {
                    Iterator it3 = b8.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!c((Size) it3.next(), size3)) {
                                arrayList5.add(size3);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                arrayList3 = arrayList5;
            }
            if (b8.isEmpty() || arrayList3.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                if (arrayList3.isEmpty()) {
                    arrayList2 = arrayList3;
                } else {
                    arrayList2 = new ArrayList<>(new LinkedHashSet(arrayList3));
                }
                arrayList = new ArrayList();
                for (Size size4 : arrayList2) {
                    Iterator it4 = b8.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (c((Size) it4.next(), size4)) {
                                break;
                            }
                        } else {
                            arrayList.add(size4);
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList3) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
