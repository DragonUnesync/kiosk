package de.ozerov.fully;

import Q0.g;
import T3.a;
import android.location.Location;
import d0.d;
import d0.e;
import d0.h;
import d0.i;
import e0.C0817a;
import e0.C0818b;
import e0.C0819c;
import e0.C0820d;
import e0.C0821e;
import e0.C0822f;
import e0.C0825i;
import e0.C0826j;
import e0.k;
import e0.l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class X {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10490a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f10491b;

    /* renamed from: c  reason: collision with root package name */
    public Object f10492c;

    /* renamed from: d  reason: collision with root package name */
    public Object f10493d;
    public Object e;

    /* renamed from: f  reason: collision with root package name */
    public Object f10494f;

    /* renamed from: g  reason: collision with root package name */
    public Object f10495g;

    /* renamed from: h  reason: collision with root package name */
    public Object f10496h;

    public static boolean a(X x8, Location location, Location location2) {
        boolean z;
        boolean z6;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        x8.getClass();
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        if (time > 120000) {
            z = true;
        } else {
            z = false;
        }
        if (time < -120000) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (time > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z) {
            return true;
        }
        if (!z6) {
            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
            if (accuracy > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (accuracy < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (accuracy > 200) {
                z11 = true;
            } else {
                z11 = false;
            }
            String provider = location.getProvider();
            String provider2 = location2.getProvider();
            if (provider != null) {
                z12 = provider.equals(provider2);
            } else if (provider2 == null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                return true;
            }
            if (z8 && !z9) {
                return true;
            }
            if (!z8 || z11 || !z12) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [e0.j, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(e0.C0821e r7, int r8, java.util.ArrayList r9, e0.C0826j r10) {
        /*
            r6 = this;
            e0.l r7 = r7.f11142d
            e0.j r0 = r7.f11157c
            if (r0 != 0) goto L_0x00e3
            java.lang.Object r0 = r6.f10492c
            d0.e r0 = (d0.e) r0
            e0.i r1 = r0.f9614d
            if (r7 == r1) goto L_0x00e3
            e0.k r0 = r0.e
            if (r7 != r0) goto L_0x0014
            goto L_0x00e3
        L_0x0014:
            if (r10 != 0) goto L_0x002a
            e0.j r10 = new e0.j
            r10.<init>()
            r0 = 0
            r10.f11151a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f11152b = r0
            r10.f11151a = r7
            r9.add(r10)
        L_0x002a:
            r7.f11157c = r10
            java.util.ArrayList r0 = r10.f11152b
            r0.add(r7)
            e0.e r0 = r7.f11161h
            java.util.ArrayList r1 = r0.f11147k
            java.util.Iterator r1 = r1.iterator()
        L_0x0039:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r1.next()
            e0.d r2 = (e0.C0820d) r2
            boolean r3 = r2 instanceof e0.C0821e
            if (r3 == 0) goto L_0x0039
            e0.e r2 = (e0.C0821e) r2
            r6.b(r2, r8, r9, r10)
            goto L_0x0039
        L_0x004f:
            e0.e r1 = r7.i
            java.util.ArrayList r2 = r1.f11147k
            java.util.Iterator r2 = r2.iterator()
        L_0x0057:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x006d
            java.lang.Object r3 = r2.next()
            e0.d r3 = (e0.C0820d) r3
            boolean r4 = r3 instanceof e0.C0821e
            if (r4 == 0) goto L_0x0057
            e0.e r3 = (e0.C0821e) r3
            r6.b(r3, r8, r9, r10)
            goto L_0x0057
        L_0x006d:
            r2 = 1
            if (r8 != r2) goto L_0x0095
            boolean r3 = r7 instanceof e0.k
            if (r3 == 0) goto L_0x0095
            r3 = r7
            e0.k r3 = (e0.k) r3
            e0.e r3 = r3.f11153k
            java.util.ArrayList r3 = r3.f11147k
            java.util.Iterator r3 = r3.iterator()
        L_0x007f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0095
            java.lang.Object r4 = r3.next()
            e0.d r4 = (e0.C0820d) r4
            boolean r5 = r4 instanceof e0.C0821e
            if (r5 == 0) goto L_0x007f
            e0.e r4 = (e0.C0821e) r4
            r6.b(r4, r8, r9, r10)
            goto L_0x007f
        L_0x0095:
            java.util.ArrayList r0 = r0.f11148l
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00ab
            java.lang.Object r3 = r0.next()
            e0.e r3 = (e0.C0821e) r3
            r6.b(r3, r8, r9, r10)
            goto L_0x009b
        L_0x00ab:
            java.util.ArrayList r0 = r1.f11148l
            java.util.Iterator r0 = r0.iterator()
        L_0x00b1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00c1
            java.lang.Object r1 = r0.next()
            e0.e r1 = (e0.C0821e) r1
            r6.b(r1, r8, r9, r10)
            goto L_0x00b1
        L_0x00c1:
            if (r8 != r2) goto L_0x00e3
            boolean r0 = r7 instanceof e0.k
            if (r0 == 0) goto L_0x00e3
            e0.k r7 = (e0.k) r7
            e0.e r7 = r7.f11153k
            java.util.ArrayList r7 = r7.f11148l
            java.util.Iterator r7 = r7.iterator()
        L_0x00d1:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00e3
            java.lang.Object r0 = r7.next()
            e0.e r0 = (e0.C0821e) r0
            r6.b(r0, r8, r9, r10)     // Catch:{ all -> 0x00e1 }
            goto L_0x00d1
        L_0x00e1:
            r7 = move-exception
            throw r7
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.X.b(e0.e, int, java.util.ArrayList, e0.j):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00aa, code lost:
        if (r5 == 2) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(d0.e r19) {
        /*
            r18 = this;
            r0 = r19
            java.util.ArrayList r1 = r0.f9634d0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x030e
            java.lang.Object r2 = r1.next()
            d0.d r2 = (d0.d) r2
            int[] r3 = r2.f9613c0
            r4 = 0
            r5 = r3[r4]
            r9 = 1
            r3 = r3[r9]
            int r6 = r2.f9603V
            r7 = 8
            if (r6 != r7) goto L_0x0025
            r2.f9608a = r9
            goto L_0x0008
        L_0x0025:
            float r6 = r2.f9623o
            r7 = 3
            r10 = 1065353216(0x3f800000, float:1.0)
            r8 = 2
            int r11 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r11 >= 0) goto L_0x0033
            if (r5 != r7) goto L_0x0033
            r2.f9618j = r8
        L_0x0033:
            float r11 = r2.f9626r
            int r12 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x003d
            if (r3 != r7) goto L_0x003d
            r2.f9619k = r8
        L_0x003d:
            float r12 = r2.f9593L
            r13 = 0
            r14 = 2
            r15 = 1
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0068
            if (r5 != r7) goto L_0x004f
            if (r3 == r14) goto L_0x004c
            if (r3 != r15) goto L_0x004f
        L_0x004c:
            r2.f9618j = r7
            goto L_0x0068
        L_0x004f:
            if (r3 != r7) goto L_0x0058
            if (r5 == r14) goto L_0x0055
            if (r5 != r15) goto L_0x0058
        L_0x0055:
            r2.f9619k = r7
            goto L_0x0068
        L_0x0058:
            if (r5 != r7) goto L_0x0068
            if (r3 != r7) goto L_0x0068
            int r12 = r2.f9618j
            if (r12 != 0) goto L_0x0062
            r2.f9618j = r7
        L_0x0062:
            int r12 = r2.f9619k
            if (r12 != 0) goto L_0x0068
            r2.f9619k = r7
        L_0x0068:
            d0.c r12 = r2.z
            d0.c r13 = r2.f9632x
            if (r5 != r7) goto L_0x007b
            int r10 = r2.f9618j
            if (r10 != r9) goto L_0x007b
            d0.c r10 = r13.f9579d
            if (r10 == 0) goto L_0x007a
            d0.c r10 = r12.f9579d
            if (r10 != 0) goto L_0x007b
        L_0x007a:
            r5 = 2
        L_0x007b:
            d0.c r10 = r2.f9582A
            d0.c r4 = r2.f9633y
            if (r3 != r7) goto L_0x008f
            int r8 = r2.f9619k
            if (r8 != r9) goto L_0x008f
            d0.c r8 = r4.f9579d
            if (r8 == 0) goto L_0x008d
            d0.c r8 = r10.f9579d
            if (r8 != 0) goto L_0x008f
        L_0x008d:
            r8 = 2
            goto L_0x0090
        L_0x008f:
            r8 = r3
        L_0x0090:
            e0.i r3 = r2.f9614d
            r3.f11158d = r5
            int r9 = r2.f9618j
            r3.f11155a = r9
            r16 = r6
            e0.k r6 = r2.e
            r6.f11158d = r8
            int r7 = r2.f9619k
            r6.f11155a = r7
            r14 = 4
            if (r5 == r14) goto L_0x00ad
            if (r5 == r15) goto L_0x00ad
            r17 = r4
            r4 = 2
            if (r5 != r4) goto L_0x00ba
            goto L_0x00b0
        L_0x00ad:
            r17 = r4
            r4 = 2
        L_0x00b0:
            if (r8 == r14) goto L_0x00b6
            if (r8 == r15) goto L_0x00b6
            if (r8 != r4) goto L_0x00ba
        L_0x00b6:
            r14 = r3
            r9 = r6
            goto L_0x02c3
        L_0x00ba:
            int[] r10 = r0.f9613c0
            d0.c[] r12 = r2.f9587F
            r13 = 1056964608(0x3f000000, float:0.5)
            r14 = 3
            if (r5 != r14) goto L_0x00c8
            if (r8 == r4) goto L_0x00cd
            if (r8 != r15) goto L_0x00c8
            goto L_0x00cd
        L_0x00c8:
            r14 = r3
        L_0x00c9:
            r13 = r6
            r3 = 3
            goto L_0x018b
        L_0x00cd:
            if (r9 != r14) goto L_0x010b
            if (r8 != r4) goto L_0x00df
            r7 = 0
            r5 = 0
            r14 = r3
            r3 = r18
            r8 = 2
            r4 = r8
            r9 = r6
            r6 = r8
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            goto L_0x00e1
        L_0x00df:
            r14 = r3
            r9 = r6
        L_0x00e1:
            int r7 = r2.i()
            float r3 = (float) r7
            float r4 = r2.f9593L
            float r3 = r3 * r4
            float r3 = r3 + r13
            int r5 = (int) r3
            r3 = r18
            r4 = r15
            r6 = r15
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            e0.f r3 = r14.e
            int r4 = r2.l()
            r3.d(r4)
            e0.f r3 = r9.e
            int r4 = r2.i()
            r3.d(r4)
            r3 = 1
            r2.f9608a = r3
            goto L_0x0008
        L_0x010b:
            r14 = r3
            r3 = 1
            if (r9 != r3) goto L_0x0123
            r5 = 0
            r7 = 0
            r3 = r18
            r4 = 2
            r6 = r8
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            e0.f r3 = r14.e
            int r2 = r2.l()
            r3.f11149m = r2
            goto L_0x0008
        L_0x0123:
            r3 = 2
            if (r9 != r3) goto L_0x015b
            r3 = 0
            r4 = r10[r3]
            if (r4 == r15) goto L_0x012e
            r3 = 4
            if (r4 != r3) goto L_0x00c9
        L_0x012e:
            int r3 = r19.l()
            float r3 = (float) r3
            float r3 = r3 * r16
            float r3 = r3 + r13
            int r5 = (int) r3
            int r7 = r2.i()
            r3 = r18
            r4 = r15
            r9 = r6
            r6 = r8
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            e0.f r3 = r14.e
            int r4 = r2.l()
            r3.d(r4)
            e0.f r3 = r9.e
            int r4 = r2.i()
            r3.d(r4)
            r3 = 1
            r2.f9608a = r3
            goto L_0x0008
        L_0x015b:
            r3 = 1
            r4 = 0
            r13 = r12[r4]
            d0.c r4 = r13.f9579d
            if (r4 == 0) goto L_0x0169
            r4 = r12[r3]
            d0.c r3 = r4.f9579d
            if (r3 != 0) goto L_0x00c9
        L_0x0169:
            r5 = 0
            r7 = 0
            r3 = r18
            r4 = 2
            r13 = r6
            r6 = r8
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            e0.f r3 = r14.e
            int r4 = r2.l()
            r3.d(r4)
            e0.f r3 = r13.e
            int r4 = r2.i()
            r3.d(r4)
            r3 = 1
            r2.f9608a = r3
            goto L_0x0008
        L_0x018b:
            if (r8 != r3) goto L_0x0193
            r6 = 2
            if (r5 == r6) goto L_0x0197
            if (r5 != r15) goto L_0x0193
            goto L_0x0197
        L_0x0193:
            r3 = 1
            r4 = 3
            goto L_0x0259
        L_0x0197:
            if (r7 != r3) goto L_0x01d9
            if (r5 != r6) goto L_0x01a4
            r7 = 0
            r5 = 0
            r3 = r18
            r4 = r6
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
        L_0x01a4:
            int r5 = r2.l()
            float r3 = r2.f9593L
            int r4 = r2.f9594M
            r6 = -1
            if (r4 != r6) goto L_0x01b3
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x01b3:
            float r4 = (float) r5
            float r4 = r4 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r3
            int r7 = (int) r4
            r3 = r18
            r4 = r15
            r6 = r15
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            e0.f r3 = r14.e
            int r4 = r2.l()
            r3.d(r4)
            e0.f r3 = r13.e
            int r4 = r2.i()
            r3.d(r4)
            r3 = 1
            r2.f9608a = r3
            goto L_0x0008
        L_0x01d9:
            r3 = 1
            if (r7 != r3) goto L_0x01f1
            r7 = 0
            r6 = 0
            r3 = r18
            r4 = r5
            r5 = r6
            r6 = 2
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            e0.f r3 = r13.e
            int r2 = r2.i()
            r3.f11149m = r2
            goto L_0x0008
        L_0x01f1:
            r3 = 2
            if (r7 != r3) goto L_0x022b
            r3 = 1
            r4 = r10[r3]
            if (r4 == r15) goto L_0x01fc
            r3 = 4
            if (r4 != r3) goto L_0x0193
        L_0x01fc:
            int r6 = r2.l()
            int r3 = r19.i()
            float r3 = (float) r3
            float r11 = r11 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 + r3
            int r7 = (int) r11
            r3 = r18
            r4 = r5
            r5 = r6
            r6 = r15
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            e0.f r3 = r14.e
            int r4 = r2.l()
            r3.d(r4)
            e0.f r3 = r13.e
            int r4 = r2.i()
            r3.d(r4)
            r3 = 1
            r2.f9608a = r3
            goto L_0x0008
        L_0x022b:
            r4 = r12[r3]
            d0.c r3 = r4.f9579d
            if (r3 == 0) goto L_0x0238
            r3 = 3
            r4 = r12[r3]
            d0.c r3 = r4.f9579d
            if (r3 != 0) goto L_0x0193
        L_0x0238:
            r5 = 0
            r7 = 0
            r3 = r18
            r4 = 2
            r6 = r8
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            e0.f r3 = r14.e
            int r4 = r2.l()
            r3.d(r4)
            e0.f r3 = r13.e
            int r4 = r2.i()
            r3.d(r4)
            r3 = 1
            r2.f9608a = r3
            goto L_0x0008
        L_0x0259:
            if (r5 != r4) goto L_0x0008
            if (r8 != r4) goto L_0x0008
            if (r9 == r3) goto L_0x02a7
            if (r7 != r3) goto L_0x0262
            goto L_0x02a7
        L_0x0262:
            r4 = 2
            if (r7 != r4) goto L_0x0008
            if (r9 != r4) goto L_0x0008
            r4 = 0
            r4 = r10[r4]
            if (r4 == r15) goto L_0x026e
            if (r4 != r15) goto L_0x0008
        L_0x026e:
            r4 = r10[r3]
            if (r4 == r15) goto L_0x0274
            if (r4 != r15) goto L_0x0008
        L_0x0274:
            int r3 = r19.l()
            float r3 = (float) r3
            float r6 = r16 * r3
            r3 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r3
            int r5 = (int) r6
            int r4 = r19.i()
            float r4 = (float) r4
            float r11 = r11 * r4
            float r11 = r11 + r3
            int r7 = (int) r11
            r3 = r18
            r4 = r15
            r6 = r15
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            e0.f r3 = r14.e
            int r4 = r2.l()
            r3.d(r4)
            e0.f r3 = r13.e
            int r4 = r2.i()
            r3.d(r4)
            r3 = 1
            r2.f9608a = r3
            goto L_0x0008
        L_0x02a7:
            r7 = 0
            r5 = 0
            r3 = r18
            r6 = 2
            r4 = r6
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            e0.f r3 = r14.e
            int r4 = r2.l()
            r3.f11149m = r4
            e0.f r3 = r13.e
            int r2 = r2.i()
            r3.f11149m = r2
            goto L_0x0008
        L_0x02c3:
            int r3 = r2.l()
            r4 = 4
            if (r5 != r4) goto L_0x02d7
            int r3 = r19.l()
            int r5 = r13.e
            int r3 = r3 - r5
            int r5 = r12.e
            int r3 = r3 - r5
            r6 = r3
            r5 = 1
            goto L_0x02d8
        L_0x02d7:
            r6 = r3
        L_0x02d8:
            int r3 = r2.i()
            if (r8 != r4) goto L_0x02ec
            int r3 = r19.i()
            r4 = r17
            int r4 = r4.e
            int r3 = r3 - r4
            int r4 = r10.e
            int r3 = r3 - r4
            r7 = r3
            goto L_0x02ee
        L_0x02ec:
            r7 = r3
            r15 = r8
        L_0x02ee:
            r3 = r18
            r4 = r5
            r5 = r6
            r6 = r15
            r8 = r2
            r3.g(r4, r5, r6, r7, r8)
            e0.f r3 = r14.e
            int r4 = r2.l()
            r3.d(r4)
            e0.f r3 = r9.e
            int r4 = r2.i()
            r3.d(r4)
            r3 = 1
            r2.f9608a = r3
            goto L_0x0008
        L_0x030e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.X.c(d0.e):void");
    }

    public void d() {
        ArrayList arrayList = (ArrayList) this.e;
        arrayList.clear();
        e eVar = (e) this.f10493d;
        eVar.f9614d.f();
        k kVar = eVar.e;
        kVar.f();
        arrayList.add(eVar.f9614d);
        arrayList.add(kVar);
        Iterator it = eVar.f9634d0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar instanceof h) {
                l lVar = new l(dVar);
                dVar.f9614d.f();
                dVar.e.f();
                lVar.f11159f = ((h) dVar).f9703h0;
                arrayList.add(lVar);
            } else {
                if (dVar.q()) {
                    if (dVar.f9610b == null) {
                        dVar.f9610b = new C0819c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f9610b);
                } else {
                    arrayList.add(dVar.f9614d);
                }
                if (dVar.r()) {
                    if (dVar.f9612c == null) {
                        dVar.f9612c = new C0819c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f9612c);
                } else {
                    arrayList.add(dVar.e);
                }
                if (dVar instanceof i) {
                    arrayList.add(new l(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            l lVar2 = (l) it3.next();
            if (lVar2.f11156b != eVar) {
                lVar2.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f10496h;
        arrayList2.clear();
        e eVar2 = (e) this.f10492c;
        f(eVar2.f9614d, 0, arrayList2);
        f(eVar2.e, 1, arrayList2);
        this.f10490a = false;
    }

    public int e(e eVar, int i) {
        ArrayList arrayList;
        int i8;
        int i9;
        long j7;
        l lVar;
        l lVar2;
        float f8;
        long j8;
        e eVar2 = eVar;
        int i10 = i;
        ArrayList arrayList2 = (ArrayList) this.f10496h;
        int size = arrayList2.size();
        int i11 = 0;
        long j9 = 0;
        while (i11 < size) {
            l lVar3 = ((C0826j) arrayList2.get(i11)).f11151a;
            if (!(lVar3 instanceof C0819c) ? i10 != 0 ? (lVar3 instanceof k) : (lVar3 instanceof C0825i) : ((C0819c) lVar3).f11159f == i10) {
                if (i10 == 0) {
                    lVar = eVar2.f9614d;
                } else {
                    lVar = eVar2.e;
                }
                C0821e eVar3 = lVar.f11161h;
                if (i10 == 0) {
                    lVar2 = eVar2.f9614d;
                } else {
                    lVar2 = eVar2.e;
                }
                C0821e eVar4 = lVar2.i;
                boolean contains = lVar3.f11161h.f11148l.contains(eVar3);
                C0821e eVar5 = lVar3.i;
                boolean contains2 = eVar5.f11148l.contains(eVar4);
                long j10 = lVar3.j();
                C0821e eVar6 = lVar3.f11161h;
                if (!contains || !contains2) {
                    arrayList = arrayList2;
                    i9 = size;
                    i8 = i11;
                    if (contains) {
                        j7 = Math.max(C0826j.b(eVar6, (long) eVar6.f11143f), ((long) eVar6.f11143f) + j10);
                    } else if (contains2) {
                        j7 = Math.max(-C0826j.a(eVar5, (long) eVar5.f11143f), ((long) (-eVar5.f11143f)) + j10);
                    } else {
                        j7 = (lVar3.j() + ((long) eVar6.f11143f)) - ((long) eVar5.f11143f);
                    }
                } else {
                    long b8 = C0826j.b(eVar6, 0);
                    ArrayList arrayList3 = arrayList2;
                    i9 = size;
                    long a8 = C0826j.a(eVar5, 0);
                    long j11 = b8 - j10;
                    int i12 = eVar5.f11143f;
                    arrayList = arrayList3;
                    i8 = i11;
                    if (j11 >= ((long) (-i12))) {
                        j11 += (long) i12;
                    }
                    long j12 = (long) eVar6.f11143f;
                    long j13 = ((-a8) - j10) - j12;
                    if (j13 >= j12) {
                        j13 -= j12;
                    }
                    d dVar = lVar3.f11156b;
                    if (i10 == 0) {
                        f8 = dVar.f9600S;
                    } else if (i10 == 1) {
                        f8 = dVar.f9601T;
                    } else {
                        dVar.getClass();
                        f8 = -1.0f;
                    }
                    if (f8 > 0.0f) {
                        j8 = (long) ((((float) j11) / (1.0f - f8)) + (((float) j13) / f8));
                    } else {
                        j8 = 0;
                    }
                    float f9 = (float) j8;
                    j7 = (((long) eVar6.f11143f) + ((((long) ((f9 * f8) + 0.5f)) + j10) + ((long) g.j(1.0f, f8, f9, 0.5f)))) - ((long) eVar5.f11143f);
                }
            } else {
                arrayList = arrayList2;
                i9 = size;
                i8 = i11;
                j7 = 0;
            }
            j9 = Math.max(j9, j7);
            i11 = i8 + 1;
            eVar2 = eVar;
            size = i9;
            arrayList2 = arrayList;
        }
        return (int) j9;
    }

    public void f(l lVar, int i, ArrayList arrayList) {
        C0821e eVar;
        Iterator it = lVar.f11161h.f11147k.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            eVar = lVar.i;
            if (!hasNext) {
                break;
            }
            C0820d dVar = (C0820d) it.next();
            if (dVar instanceof C0821e) {
                b((C0821e) dVar, i, arrayList, (C0826j) null);
            } else if (dVar instanceof l) {
                b(((l) dVar).f11161h, i, arrayList, (C0826j) null);
            }
        }
        Iterator it2 = eVar.f11147k.iterator();
        while (it2.hasNext()) {
            C0820d dVar2 = (C0820d) it2.next();
            if (dVar2 instanceof C0821e) {
                b((C0821e) dVar2, i, arrayList, (C0826j) null);
            } else if (dVar2 instanceof l) {
                b(((l) dVar2).i, i, arrayList, (C0826j) null);
            }
        }
        if (i == 1) {
            Iterator it3 = ((k) lVar).f11153k.f11147k.iterator();
            while (it3.hasNext()) {
                C0820d dVar3 = (C0820d) it3.next();
                if (dVar3 instanceof C0821e) {
                    b((C0821e) dVar3, i, arrayList, (C0826j) null);
                }
            }
        }
    }

    public void g(int i, int i8, int i9, int i10, d dVar) {
        boolean z;
        C0818b bVar = (C0818b) this.f10495g;
        bVar.f11129a = i;
        bVar.f11130b = i9;
        bVar.f11131c = i8;
        bVar.f11132d = i10;
        ((a) this.f10494f).d(dVar, bVar);
        dVar.y(bVar.e);
        dVar.v(bVar.f11133f);
        dVar.f9631w = bVar.f11135h;
        int i11 = bVar.f11134g;
        dVar.f9597P = i11;
        if (i11 > 0) {
            z = true;
        } else {
            z = false;
        }
        dVar.f9631w = z;
    }

    public void h() {
        boolean z;
        C0817a aVar;
        Iterator it = ((e) this.f10492c).f9634d0.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (!dVar.f9608a) {
                int[] iArr = dVar.f9613c0;
                boolean z6 = false;
                int i = iArr[0];
                int i8 = iArr[1];
                int i9 = dVar.f9618j;
                int i10 = dVar.f9619k;
                if (i == 2 || (i == 3 && i9 == 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (i8 == 2 || (i8 == 3 && i10 == 1)) {
                    z6 = true;
                }
                C0825i iVar = dVar.f9614d;
                C0822f fVar = iVar.e;
                boolean z8 = fVar.f11146j;
                k kVar = dVar.e;
                C0822f fVar2 = kVar.e;
                boolean z9 = fVar2.f11146j;
                if (z8 && z9) {
                    g(1, fVar.f11144g, 1, fVar2.f11144g, dVar);
                    dVar.f9608a = true;
                } else if (z8 && z6) {
                    g(1, fVar.f11144g, 2, fVar2.f11144g, dVar);
                    if (i8 == 3) {
                        kVar.e.f11149m = dVar.i();
                    } else {
                        kVar.e.d(dVar.i());
                        dVar.f9608a = true;
                    }
                } else if (z9 && z) {
                    g(2, fVar.f11144g, 1, fVar2.f11144g, dVar);
                    if (i == 3) {
                        iVar.e.f11149m = dVar.l();
                    } else {
                        iVar.e.d(dVar.l());
                        dVar.f9608a = true;
                    }
                }
                if (dVar.f9608a && (aVar = kVar.f11154l) != null) {
                    aVar.d(dVar.f9597P);
                }
            }
        }
    }
}
