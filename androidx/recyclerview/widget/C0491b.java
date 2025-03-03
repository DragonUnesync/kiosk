package androidx.recyclerview.widget;

import c0.C0608f;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.b  reason: case insensitive filesystem */
public final class C0491b {

    /* renamed from: a  reason: collision with root package name */
    public final C0608f f8366a = new C0608f(30);

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f8367b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f8368c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final D f8369d;
    public final O e;

    /* renamed from: f  reason: collision with root package name */
    public int f8370f = 0;

    public C0491b(D d8) {
        this.f8369d = d8;
        this.e = new O(2, this);
    }

    public final boolean a(int i) {
        ArrayList arrayList = this.f8368c;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C0490a aVar = (C0490a) arrayList.get(i8);
            int i9 = aVar.f8362a;
            if (i9 == 8) {
                if (f(aVar.f8365d, i8 + 1) == i) {
                    return true;
                }
            } else if (i9 == 1) {
                int i10 = aVar.f8363b;
                int i11 = aVar.f8365d + i10;
                while (i10 < i11) {
                    if (f(i10, i8 + 1) == i) {
                        return true;
                    }
                    i10++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f8368c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f8369d.a((C0490a) arrayList.get(i));
        }
        k(arrayList);
        this.f8370f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f8367b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0490a aVar = (C0490a) arrayList.get(i);
            int i8 = aVar.f8362a;
            D d8 = this.f8369d;
            if (i8 == 1) {
                d8.a(aVar);
                int i9 = aVar.f8363b;
                int i10 = aVar.f8365d;
                RecyclerView recyclerView = d8.f8270a;
                recyclerView.offsetPositionRecordsForInsert(i9, i10);
                recyclerView.mItemsAddedOrRemoved = true;
            } else if (i8 == 2) {
                d8.a(aVar);
                int i11 = aVar.f8363b;
                int i12 = aVar.f8365d;
                RecyclerView recyclerView2 = d8.f8270a;
                recyclerView2.offsetPositionRecordsForRemove(i11, i12, true);
                recyclerView2.mItemsAddedOrRemoved = true;
                recyclerView2.mState.f8397c += i12;
            } else if (i8 == 4) {
                d8.a(aVar);
                int i13 = aVar.f8363b;
                int i14 = aVar.f8365d;
                Object obj = aVar.f8364c;
                RecyclerView recyclerView3 = d8.f8270a;
                recyclerView3.viewRangeUpdate(i13, i14, obj);
                recyclerView3.mItemsChanged = true;
            } else if (i8 == 8) {
                d8.a(aVar);
                int i15 = aVar.f8363b;
                int i16 = aVar.f8365d;
                RecyclerView recyclerView4 = d8.f8270a;
                recyclerView4.offsetPositionRecordsForMove(i15, i16);
                recyclerView4.mItemsAddedOrRemoved = true;
            }
        }
        k(arrayList);
        this.f8370f = 0;
    }

    public final void d(C0490a aVar) {
        int i;
        int i8 = aVar.f8362a;
        if (i8 == 1 || i8 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int l8 = l(aVar.f8363b, i8);
        int i9 = aVar.f8363b;
        int i10 = aVar.f8362a;
        if (i10 == 2) {
            i = 0;
        } else if (i10 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + aVar);
        }
        int i11 = 1;
        for (int i12 = 1; i12 < aVar.f8365d; i12++) {
            int l9 = l((i * i12) + aVar.f8363b, aVar.f8362a);
            int i13 = aVar.f8362a;
            if (i13 == 2 ? l9 != l8 : !(i13 == 4 && l9 == l8 + 1)) {
                C0490a h5 = h(aVar.f8364c, i13, l8, i11);
                e(h5, i9);
                h5.f8364c = null;
                this.f8366a.c(h5);
                if (aVar.f8362a == 4) {
                    i9 += i11;
                }
                l8 = l9;
                i11 = 1;
            } else {
                i11++;
            }
        }
        Object obj = aVar.f8364c;
        aVar.f8364c = null;
        this.f8366a.c(aVar);
        if (i11 > 0) {
            C0490a h8 = h(obj, aVar.f8362a, l8, i11);
            e(h8, i9);
            h8.f8364c = null;
            this.f8366a.c(h8);
        }
    }

    public final void e(C0490a aVar, int i) {
        D d8 = this.f8369d;
        d8.a(aVar);
        int i8 = aVar.f8362a;
        RecyclerView recyclerView = d8.f8270a;
        if (i8 == 2) {
            int i9 = aVar.f8365d;
            recyclerView.offsetPositionRecordsForRemove(i, i9, true);
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f8397c += i9;
        } else if (i8 == 4) {
            recyclerView.viewRangeUpdate(i, aVar.f8365d, aVar.f8364c);
            recyclerView.mItemsChanged = true;
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final int f(int i, int i8) {
        ArrayList arrayList = this.f8368c;
        int size = arrayList.size();
        while (i8 < size) {
            C0490a aVar = (C0490a) arrayList.get(i8);
            int i9 = aVar.f8362a;
            if (i9 == 8) {
                int i10 = aVar.f8363b;
                if (i10 == i) {
                    i = aVar.f8365d;
                } else {
                    if (i10 < i) {
                        i--;
                    }
                    if (aVar.f8365d <= i) {
                        i++;
                    }
                }
            } else {
                int i11 = aVar.f8363b;
                if (i11 > i) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = aVar.f8365d;
                    if (i < i11 + i12) {
                        return -1;
                    }
                    i -= i12;
                } else if (i9 == 1) {
                    i += aVar.f8365d;
                }
            }
            i8++;
        }
        return i;
    }

    public final boolean g() {
        if (this.f8367b.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, androidx.recyclerview.widget.a] */
    public final C0490a h(Object obj, int i, int i8, int i9) {
        C0490a aVar = (C0490a) this.f8366a.a();
        if (aVar == null) {
            ? obj2 = new Object();
            obj2.f8362a = i;
            obj2.f8363b = i8;
            obj2.f8365d = i9;
            obj2.f8364c = obj;
            return obj2;
        }
        aVar.f8362a = i;
        aVar.f8363b = i8;
        aVar.f8365d = i9;
        aVar.f8364c = obj;
        return aVar;
    }

    public final void i(C0490a aVar) {
        this.f8368c.add(aVar);
        int i = aVar.f8362a;
        D d8 = this.f8369d;
        if (i == 1) {
            int i8 = aVar.f8363b;
            int i9 = aVar.f8365d;
            RecyclerView recyclerView = d8.f8270a;
            recyclerView.offsetPositionRecordsForInsert(i8, i9);
            recyclerView.mItemsAddedOrRemoved = true;
        } else if (i == 2) {
            int i10 = aVar.f8363b;
            int i11 = aVar.f8365d;
            RecyclerView recyclerView2 = d8.f8270a;
            recyclerView2.offsetPositionRecordsForRemove(i10, i11, false);
            recyclerView2.mItemsAddedOrRemoved = true;
        } else if (i == 4) {
            int i12 = aVar.f8363b;
            int i13 = aVar.f8365d;
            Object obj = aVar.f8364c;
            RecyclerView recyclerView3 = d8.f8270a;
            recyclerView3.viewRangeUpdate(i12, i13, obj);
            recyclerView3.mItemsChanged = true;
        } else if (i == 8) {
            int i14 = aVar.f8363b;
            int i15 = aVar.f8365d;
            RecyclerView recyclerView4 = d8.f8270a;
            recyclerView4.offsetPositionRecordsForMove(i14, i15);
            recyclerView4.mItemsAddedOrRemoved = true;
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:177:0x0009 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r17 = this;
            r0 = r17
            java.util.ArrayList r1 = r0.f8367b
            androidx.recyclerview.widget.O r2 = r0.e
            r2.getClass()
        L_0x0009:
            int r3 = r1.size()
            r4 = 1
            int r3 = r3 - r4
            r6 = 0
        L_0x0010:
            r7 = -1
            r8 = 8
            if (r3 < 0) goto L_0x0026
            java.lang.Object r9 = r1.get(r3)
            androidx.recyclerview.widget.a r9 = (androidx.recyclerview.widget.C0490a) r9
            int r9 = r9.f8362a
            if (r9 != r8) goto L_0x0022
            if (r6 == 0) goto L_0x0023
            goto L_0x0027
        L_0x0022:
            r6 = 1
        L_0x0023:
            int r3 = r3 + -1
            goto L_0x0010
        L_0x0026:
            r3 = -1
        L_0x0027:
            r6 = 0
            r9 = 4
            r10 = 2
            if (r3 == r7) goto L_0x01cb
            int r8 = r3 + 1
            java.lang.Object r11 = r1.get(r3)
            androidx.recyclerview.widget.a r11 = (androidx.recyclerview.widget.C0490a) r11
            java.lang.Object r12 = r1.get(r8)
            androidx.recyclerview.widget.a r12 = (androidx.recyclerview.widget.C0490a) r12
            int r13 = r12.f8362a
            if (r13 == r4) goto L_0x01a1
            java.lang.Object r7 = r2.f8303b
            androidx.recyclerview.widget.b r7 = (androidx.recyclerview.widget.C0491b) r7
            if (r13 == r10) goto L_0x00a9
            if (r13 == r9) goto L_0x0047
            goto L_0x0009
        L_0x0047:
            int r5 = r11.f8365d
            int r10 = r12.f8363b
            if (r5 >= r10) goto L_0x0052
            int r10 = r10 + -1
            r12.f8363b = r10
            goto L_0x0064
        L_0x0052:
            int r13 = r12.f8365d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0064
            int r13 = r13 + -1
            r12.f8365d = r13
            int r5 = r11.f8363b
            java.lang.Object r10 = r12.f8364c
            androidx.recyclerview.widget.a r4 = r7.h(r10, r9, r5, r4)
            goto L_0x0065
        L_0x0064:
            r4 = r6
        L_0x0065:
            int r5 = r11.f8363b
            int r10 = r12.f8363b
            if (r5 > r10) goto L_0x0070
            int r10 = r10 + 1
            r12.f8363b = r10
            goto L_0x0084
        L_0x0070:
            int r13 = r12.f8365d
            int r10 = r10 + r13
            if (r5 >= r10) goto L_0x0084
            int r10 = r10 - r5
            int r5 = r5 + 1
            java.lang.Object r13 = r12.f8364c
            androidx.recyclerview.widget.a r5 = r7.h(r13, r9, r5, r10)
            int r9 = r12.f8365d
            int r9 = r9 - r10
            r12.f8365d = r9
            goto L_0x0085
        L_0x0084:
            r5 = r6
        L_0x0085:
            r1.set(r8, r11)
            int r8 = r12.f8365d
            if (r8 <= 0) goto L_0x0090
            r1.set(r3, r12)
            goto L_0x009d
        L_0x0090:
            r1.remove(r3)
            r7.getClass()
            r12.f8364c = r6
            c0.f r6 = r7.f8366a
            r6.c(r12)
        L_0x009d:
            if (r4 == 0) goto L_0x00a2
            r1.add(r3, r4)
        L_0x00a2:
            if (r5 == 0) goto L_0x0009
            r1.add(r3, r5)
            goto L_0x0009
        L_0x00a9:
            int r9 = r11.f8363b
            int r13 = r11.f8365d
            if (r9 >= r13) goto L_0x00be
            int r14 = r12.f8363b
            if (r14 != r9) goto L_0x00bc
            int r14 = r12.f8365d
            int r9 = r13 - r9
            if (r14 != r9) goto L_0x00bc
            r5 = 1
        L_0x00ba:
            r9 = 0
            goto L_0x00ce
        L_0x00bc:
            r5 = 0
            goto L_0x00ba
        L_0x00be:
            int r14 = r12.f8363b
            int r15 = r13 + 1
            if (r14 != r15) goto L_0x00cc
            int r14 = r12.f8365d
            int r9 = r9 - r13
            if (r14 != r9) goto L_0x00cc
            r5 = 1
        L_0x00ca:
            r9 = 1
            goto L_0x00ce
        L_0x00cc:
            r5 = 0
            goto L_0x00ca
        L_0x00ce:
            int r14 = r12.f8363b
            if (r13 >= r14) goto L_0x00d7
            int r14 = r14 + -1
            r12.f8363b = r14
            goto L_0x00f7
        L_0x00d7:
            int r15 = r12.f8365d
            int r14 = r14 + r15
            if (r13 >= r14) goto L_0x00f7
            int r15 = r15 + -1
            r12.f8365d = r15
            r11.f8362a = r10
            r11.f8365d = r4
            int r3 = r12.f8365d
            if (r3 != 0) goto L_0x0009
            r1.remove(r8)
            r7.getClass()
            r12.f8364c = r6
            c0.f r3 = r7.f8366a
            r3.c(r12)
            goto L_0x0009
        L_0x00f7:
            int r4 = r11.f8363b
            int r13 = r12.f8363b
            if (r4 > r13) goto L_0x0102
            int r13 = r13 + 1
            r12.f8363b = r13
            goto L_0x0116
        L_0x0102:
            int r14 = r12.f8365d
            int r13 = r13 + r14
            if (r4 >= r13) goto L_0x0116
            int r13 = r13 - r4
            int r4 = r4 + 1
            androidx.recyclerview.widget.a r4 = r7.h(r6, r10, r4, r13)
            int r10 = r11.f8363b
            int r13 = r12.f8363b
            int r10 = r10 - r13
            r12.f8365d = r10
            goto L_0x0117
        L_0x0116:
            r4 = r6
        L_0x0117:
            if (r5 == 0) goto L_0x012b
            r1.set(r3, r12)
            r1.remove(r8)
            r7.getClass()
            r11.f8364c = r6
            c0.f r3 = r7.f8366a
            r3.c(r11)
            goto L_0x0009
        L_0x012b:
            if (r9 == 0) goto L_0x015c
            if (r4 == 0) goto L_0x0145
            int r5 = r11.f8363b
            int r6 = r4.f8363b
            if (r5 <= r6) goto L_0x013a
            int r6 = r4.f8365d
            int r5 = r5 - r6
            r11.f8363b = r5
        L_0x013a:
            int r5 = r11.f8365d
            int r6 = r4.f8363b
            if (r5 <= r6) goto L_0x0145
            int r6 = r4.f8365d
            int r5 = r5 - r6
            r11.f8365d = r5
        L_0x0145:
            int r5 = r11.f8363b
            int r6 = r12.f8363b
            if (r5 <= r6) goto L_0x0150
            int r6 = r12.f8365d
            int r5 = r5 - r6
            r11.f8363b = r5
        L_0x0150:
            int r5 = r11.f8365d
            int r6 = r12.f8363b
            if (r5 <= r6) goto L_0x018a
            int r6 = r12.f8365d
            int r5 = r5 - r6
            r11.f8365d = r5
            goto L_0x018a
        L_0x015c:
            if (r4 == 0) goto L_0x0174
            int r5 = r11.f8363b
            int r6 = r4.f8363b
            if (r5 < r6) goto L_0x0169
            int r6 = r4.f8365d
            int r5 = r5 - r6
            r11.f8363b = r5
        L_0x0169:
            int r5 = r11.f8365d
            int r6 = r4.f8363b
            if (r5 < r6) goto L_0x0174
            int r6 = r4.f8365d
            int r5 = r5 - r6
            r11.f8365d = r5
        L_0x0174:
            int r5 = r11.f8363b
            int r6 = r12.f8363b
            if (r5 < r6) goto L_0x017f
            int r6 = r12.f8365d
            int r5 = r5 - r6
            r11.f8363b = r5
        L_0x017f:
            int r5 = r11.f8365d
            int r6 = r12.f8363b
            if (r5 < r6) goto L_0x018a
            int r6 = r12.f8365d
            int r5 = r5 - r6
            r11.f8365d = r5
        L_0x018a:
            r1.set(r3, r12)
            int r5 = r11.f8363b
            int r6 = r11.f8365d
            if (r5 == r6) goto L_0x0197
            r1.set(r8, r11)
            goto L_0x019a
        L_0x0197:
            r1.remove(r8)
        L_0x019a:
            if (r4 == 0) goto L_0x0009
            r1.add(r3, r4)
            goto L_0x0009
        L_0x01a1:
            int r4 = r11.f8365d
            int r6 = r12.f8363b
            if (r4 >= r6) goto L_0x01a9
            r5 = -1
            goto L_0x01aa
        L_0x01a9:
            r5 = 0
        L_0x01aa:
            int r7 = r11.f8363b
            if (r7 >= r6) goto L_0x01b0
            int r5 = r5 + 1
        L_0x01b0:
            if (r6 > r7) goto L_0x01b7
            int r6 = r12.f8365d
            int r7 = r7 + r6
            r11.f8363b = r7
        L_0x01b7:
            int r6 = r12.f8363b
            if (r6 > r4) goto L_0x01c0
            int r7 = r12.f8365d
            int r4 = r4 + r7
            r11.f8365d = r4
        L_0x01c0:
            int r6 = r6 + r5
            r12.f8363b = r6
            r1.set(r3, r12)
            r1.set(r8, r11)
            goto L_0x0009
        L_0x01cb:
            int r2 = r1.size()
            r3 = 0
        L_0x01d0:
            if (r3 >= r2) goto L_0x029f
            java.lang.Object r11 = r1.get(r3)
            androidx.recyclerview.widget.a r11 = (androidx.recyclerview.widget.C0490a) r11
            int r12 = r11.f8362a
            if (r12 == r4) goto L_0x0297
            androidx.recyclerview.widget.D r13 = r0.f8369d
            if (r12 == r10) goto L_0x023e
            if (r12 == r9) goto L_0x01eb
            if (r12 == r8) goto L_0x01e6
            goto L_0x029a
        L_0x01e6:
            r0.i(r11)
            goto L_0x029a
        L_0x01eb:
            int r12 = r11.f8363b
            int r14 = r11.f8365d
            int r14 = r14 + r12
            r15 = r12
            r5 = 0
        L_0x01f2:
            if (r12 >= r14) goto L_0x0222
            androidx.recyclerview.widget.j0 r16 = r13.b(r12)
            if (r16 != 0) goto L_0x0210
            boolean r16 = r0.a(r12)
            if (r16 == 0) goto L_0x0201
            goto L_0x0210
        L_0x0201:
            if (r7 != r4) goto L_0x020e
            java.lang.Object r7 = r11.f8364c
            androidx.recyclerview.widget.a r5 = r0.h(r7, r9, r15, r5)
            r0.i(r5)
            r15 = r12
            r5 = 0
        L_0x020e:
            r7 = 0
            goto L_0x021e
        L_0x0210:
            if (r7 != 0) goto L_0x021d
            java.lang.Object r7 = r11.f8364c
            androidx.recyclerview.widget.a r5 = r0.h(r7, r9, r15, r5)
            r0.d(r5)
            r15 = r12
            r5 = 0
        L_0x021d:
            r7 = 1
        L_0x021e:
            int r5 = r5 + r4
            int r12 = r12 + 1
            goto L_0x01f2
        L_0x0222:
            int r12 = r11.f8365d
            if (r5 == r12) goto L_0x0233
            java.lang.Object r12 = r11.f8364c
            r11.f8364c = r6
            c0.f r13 = r0.f8366a
            r13.c(r11)
            androidx.recyclerview.widget.a r11 = r0.h(r12, r9, r15, r5)
        L_0x0233:
            if (r7 != 0) goto L_0x023a
            r0.d(r11)
            goto L_0x029a
        L_0x023a:
            r0.i(r11)
            goto L_0x029a
        L_0x023e:
            int r5 = r11.f8363b
            int r7 = r11.f8365d
            int r7 = r7 + r5
            r12 = r5
            r14 = 0
            r15 = -1
        L_0x0246:
            if (r12 >= r7) goto L_0x027e
            androidx.recyclerview.widget.j0 r16 = r13.b(r12)
            if (r16 != 0) goto L_0x0264
            boolean r16 = r0.a(r12)
            if (r16 == 0) goto L_0x0255
            goto L_0x0264
        L_0x0255:
            if (r15 != r4) goto L_0x0260
            androidx.recyclerview.widget.a r15 = r0.h(r6, r10, r5, r14)
            r0.i(r15)
            r15 = 1
            goto L_0x0261
        L_0x0260:
            r15 = 0
        L_0x0261:
            r16 = 0
            goto L_0x0272
        L_0x0264:
            if (r15 != 0) goto L_0x026f
            androidx.recyclerview.widget.a r15 = r0.h(r6, r10, r5, r14)
            r0.d(r15)
            r15 = 1
            goto L_0x0270
        L_0x026f:
            r15 = 0
        L_0x0270:
            r16 = 1
        L_0x0272:
            if (r15 == 0) goto L_0x0278
            int r12 = r12 - r14
            int r7 = r7 - r14
            r14 = 1
            goto L_0x027a
        L_0x0278:
            int r14 = r14 + 1
        L_0x027a:
            int r12 = r12 + r4
            r15 = r16
            goto L_0x0246
        L_0x027e:
            int r7 = r11.f8365d
            if (r14 == r7) goto L_0x028d
            r11.f8364c = r6
            c0.f r7 = r0.f8366a
            r7.c(r11)
            androidx.recyclerview.widget.a r11 = r0.h(r6, r10, r5, r14)
        L_0x028d:
            if (r15 != 0) goto L_0x0293
            r0.d(r11)
            goto L_0x029a
        L_0x0293:
            r0.i(r11)
            goto L_0x029a
        L_0x0297:
            r0.i(r11)
        L_0x029a:
            int r3 = r3 + 1
            r7 = -1
            goto L_0x01d0
        L_0x029f:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0491b.j():void");
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0490a aVar = (C0490a) arrayList.get(i);
            aVar.f8364c = null;
            this.f8366a.c(aVar);
        }
        arrayList.clear();
    }

    public final int l(int i, int i8) {
        int i9;
        int i10;
        ArrayList arrayList = this.f8368c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0490a aVar = (C0490a) arrayList.get(size);
            int i11 = aVar.f8362a;
            if (i11 == 8) {
                int i12 = aVar.f8363b;
                int i13 = aVar.f8365d;
                if (i12 < i13) {
                    i10 = i12;
                    i9 = i13;
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                if (i < i10 || i > i9) {
                    if (i < i12) {
                        if (i8 == 1) {
                            aVar.f8363b = i12 + 1;
                            aVar.f8365d = i13 + 1;
                        } else if (i8 == 2) {
                            aVar.f8363b = i12 - 1;
                            aVar.f8365d = i13 - 1;
                        }
                    }
                } else if (i10 == i12) {
                    if (i8 == 1) {
                        aVar.f8365d = i13 + 1;
                    } else if (i8 == 2) {
                        aVar.f8365d = i13 - 1;
                    }
                    i++;
                } else {
                    if (i8 == 1) {
                        aVar.f8363b = i12 + 1;
                    } else if (i8 == 2) {
                        aVar.f8363b = i12 - 1;
                    }
                    i--;
                }
            } else {
                int i14 = aVar.f8363b;
                if (i14 <= i) {
                    if (i11 == 1) {
                        i -= aVar.f8365d;
                    } else if (i11 == 2) {
                        i += aVar.f8365d;
                    }
                } else if (i8 == 1) {
                    aVar.f8363b = i14 + 1;
                } else if (i8 == 2) {
                    aVar.f8363b = i14 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0490a aVar2 = (C0490a) arrayList.get(size2);
            if (aVar2.f8362a == 8) {
                int i15 = aVar2.f8365d;
                if (i15 == aVar2.f8363b || i15 < 0) {
                    arrayList.remove(size2);
                    aVar2.f8364c = null;
                    this.f8366a.c(aVar2);
                }
            } else if (aVar2.f8365d <= 0) {
                arrayList.remove(size2);
                aVar2.f8364c = null;
                this.f8366a.c(aVar2);
            }
        }
        return i;
    }
}
