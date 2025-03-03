package S1;

import O0.a;
import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f4401a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4402b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4403c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4404d;
    public final long e;

    /* renamed from: f  reason: collision with root package name */
    public final g f4405f;

    /* renamed from: g  reason: collision with root package name */
    public final String[] f4406g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4407h;
    public final String i;

    /* renamed from: j  reason: collision with root package name */
    public final c f4408j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f4409k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f4410l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f4411m;

    public c(String str, String str2, long j7, long j8, g gVar, String[] strArr, String str3, String str4, c cVar) {
        boolean z;
        this.f4401a = str;
        this.f4402b = str2;
        this.i = str4;
        this.f4405f = gVar;
        this.f4406g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f4403c = z;
        this.f4404d = j7;
        this.e = j8;
        str3.getClass();
        this.f4407h = str3;
        this.f4408j = cVar;
        this.f4409k = new HashMap();
        this.f4410l = new HashMap();
    }

    public static c a(String str) {
        return new c((String) null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, (g) null, (String[]) null, "", (String) null, (c) null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            a aVar = new a();
            aVar.f3495a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((a) treeMap.get(str)).f3495a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i8) {
        ArrayList arrayList = this.f4411m;
        if (arrayList != null) {
            return (c) arrayList.get(i8);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f4411m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        boolean z6;
        String str = this.f4401a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j7 = this.f4404d;
            if (j7 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j7));
            }
            long j8 = this.e;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
        }
        if (this.f4411m != null) {
            for (int i8 = 0; i8 < this.f4411m.size(); i8++) {
                c cVar = (c) this.f4411m.get(i8);
                if (z || equals) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                cVar.d(treeSet, z6);
            }
        }
    }

    public final boolean f(long j7) {
        long j8 = this.e;
        long j9 = this.f4404d;
        if ((j9 != -9223372036854775807L || j8 != -9223372036854775807L) && ((j9 > j7 || j8 != -9223372036854775807L) && ((j9 != -9223372036854775807L || j7 >= j8) && (j9 > j7 || j7 >= j8)))) {
            return false;
        }
        return true;
    }

    public final void g(long j7, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f4407h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (!f(j7) || !"div".equals(this.f4401a) || (str2 = this.i) == null) {
            for (int i8 = 0; i8 < c(); i8++) {
                b(i8).g(j7, str, arrayList);
            }
            return;
        }
        arrayList.add(new Pair(str, str2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:136:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02c5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(long r20, java.util.Map r22, java.util.HashMap r23, java.lang.String r24, java.util.TreeMap r25) {
        /*
            r19 = this;
            r0 = r19
            r8 = r22
            r1 = -1
            r9 = 1
            boolean r2 = r19.f(r20)
            if (r2 != 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.String r2 = ""
            java.lang.String r3 = r0.f4407h
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x001a
            r10 = r24
            goto L_0x001b
        L_0x001a:
            r10 = r3
        L_0x001b:
            java.util.HashMap r2 = r0.f4410l
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0025:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x02cb
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.util.HashMap r6 = r0.f4409k
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L_0x004a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            java.lang.Object r3 = r3.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r6 == r3) goto L_0x02bf
            r11 = r25
            java.lang.Object r5 = r11.get(r5)
            O0.a r5 = (O0.a) r5
            r5.getClass()
            r12 = r23
            java.lang.Object r7 = r12.get(r10)
            S1.f r7 = (S1.f) r7
            r7.getClass()
            S1.g r13 = r0.f4405f
            java.lang.String[] r14 = r0.f4406g
            S1.g r13 = com.bumptech.glide.c.v(r13, r14, r8)
            java.lang.CharSequence r14 = r5.f3495a
            android.text.SpannableStringBuilder r14 = (android.text.SpannableStringBuilder) r14
            if (r14 != 0) goto L_0x0082
            android.text.SpannableStringBuilder r14 = new android.text.SpannableStringBuilder
            r14.<init>()
            r5.f3495a = r14
        L_0x0082:
            if (r13 == 0) goto L_0x02c3
            int r15 = r13.f4438h
            if (r15 != r1) goto L_0x008e
            int r4 = r13.i
            if (r4 != r1) goto L_0x008e
            r4 = -1
            goto L_0x009b
        L_0x008e:
            if (r15 != r9) goto L_0x0092
            r4 = 1
            goto L_0x0093
        L_0x0092:
            r4 = 0
        L_0x0093:
            int r15 = r13.i
            if (r15 != r9) goto L_0x0099
            r15 = 2
            goto L_0x009a
        L_0x0099:
            r15 = 0
        L_0x009a:
            r4 = r4 | r15
        L_0x009b:
            if (r4 == r1) goto L_0x00c4
            android.text.style.StyleSpan r4 = new android.text.style.StyleSpan
            int r15 = r13.f4438h
            if (r15 != r1) goto L_0x00ab
            int r9 = r13.i
            if (r9 != r1) goto L_0x00aa
            r9 = 1
            r15 = -1
            goto L_0x00bb
        L_0x00aa:
            r9 = 1
        L_0x00ab:
            if (r15 != r9) goto L_0x00b0
            r16 = 1
            goto L_0x00b2
        L_0x00b0:
            r16 = 0
        L_0x00b2:
            int r15 = r13.i
            if (r15 != r9) goto L_0x00b8
            r15 = 2
            goto L_0x00b9
        L_0x00b8:
            r15 = 0
        L_0x00b9:
            r15 = r16 | r15
        L_0x00bb:
            r4.<init>(r15)
            r15 = 33
            r14.setSpan(r4, r6, r3, r15)
            goto L_0x00c6
        L_0x00c4:
            r15 = 33
        L_0x00c6:
            int r4 = r13.f4436f
            if (r4 != r9) goto L_0x00d2
            android.text.style.StrikethroughSpan r4 = new android.text.style.StrikethroughSpan
            r4.<init>()
            r14.setSpan(r4, r6, r3, r15)
        L_0x00d2:
            int r4 = r13.f4437g
            if (r4 != r9) goto L_0x00de
            android.text.style.UnderlineSpan r4 = new android.text.style.UnderlineSpan
            r4.<init>()
            r14.setSpan(r4, r6, r3, r15)
        L_0x00de:
            boolean r4 = r13.f4434c
            if (r4 == 0) goto L_0x00f9
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            boolean r9 = r13.f4434c
            if (r9 == 0) goto L_0x00f1
            int r9 = r13.f4433b
            r4.<init>(r9)
            G5.s.a(r14, r4, r6, r3)
            goto L_0x00f9
        L_0x00f1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Font color has not been defined."
            r1.<init>(r2)
            throw r1
        L_0x00f9:
            boolean r4 = r13.e
            if (r4 == 0) goto L_0x0114
            android.text.style.BackgroundColorSpan r4 = new android.text.style.BackgroundColorSpan
            boolean r9 = r13.e
            if (r9 == 0) goto L_0x010c
            int r9 = r13.f4435d
            r4.<init>(r9)
            G5.s.a(r14, r4, r6, r3)
            goto L_0x0114
        L_0x010c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Background color has not been defined."
            r1.<init>(r2)
            throw r1
        L_0x0114:
            java.lang.String r4 = r13.f4432a
            if (r4 == 0) goto L_0x0122
            android.text.style.TypefaceSpan r4 = new android.text.style.TypefaceSpan
            java.lang.String r9 = r13.f4432a
            r4.<init>(r9)
            G5.s.a(r14, r4, r6, r3)
        L_0x0122:
            S1.b r4 = r13.f4447r
            r9 = 3
            if (r4 == 0) goto L_0x014a
            int r15 = r4.f4398a
            if (r15 != r1) goto L_0x013a
            int r7 = r7.f4431j
            r15 = 2
            if (r7 == r15) goto L_0x0136
            r15 = 1
            if (r7 != r15) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r7 = 1
            goto L_0x0137
        L_0x0136:
            r7 = 3
        L_0x0137:
            r15 = r7
            r7 = 1
            goto L_0x013c
        L_0x013a:
            int r7 = r4.f4399b
        L_0x013c:
            r1 = -2
            int r4 = r4.f4400c
            if (r4 != r1) goto L_0x0142
            r4 = 1
        L_0x0142:
            O0.h r1 = new O0.h
            r1.<init>(r15, r7, r4)
            G5.s.a(r14, r1, r6, r3)
        L_0x014a:
            int r1 = r13.f4442m
            r4 = 2
            if (r1 == r4) goto L_0x0162
            if (r1 == r9) goto L_0x0157
            r4 = 4
            if (r1 == r4) goto L_0x0157
        L_0x0154:
            r15 = -1
            goto L_0x0203
        L_0x0157:
            S1.a r1 = new S1.a
            r1.<init>()
            r4 = 33
            r14.setSpan(r1, r6, r3, r4)
            goto L_0x0154
        L_0x0162:
            S1.c r1 = r0.f4408j
        L_0x0164:
            if (r1 == 0) goto L_0x0179
            S1.g r7 = r1.f4405f
            java.lang.String[] r15 = r1.f4406g
            S1.g r7 = com.bumptech.glide.c.v(r7, r15, r8)
            if (r7 == 0) goto L_0x0176
            int r7 = r7.f4442m
            r15 = 1
            if (r7 != r15) goto L_0x0176
            goto L_0x017a
        L_0x0176:
            S1.c r1 = r1.f4408j
            goto L_0x0164
        L_0x0179:
            r1 = 0
        L_0x017a:
            if (r1 != 0) goto L_0x017d
            goto L_0x0154
        L_0x017d:
            java.util.ArrayDeque r7 = new java.util.ArrayDeque
            r7.<init>()
            r7.push(r1)
        L_0x0185:
            boolean r15 = r7.isEmpty()
            if (r15 != 0) goto L_0x01b6
            java.lang.Object r15 = r7.pop()
            S1.c r15 = (S1.c) r15
            S1.g r4 = r15.f4405f
            java.lang.String[] r9 = r15.f4406g
            S1.g r4 = com.bumptech.glide.c.v(r4, r9, r8)
            if (r4 == 0) goto L_0x01a2
            int r4 = r4.f4442m
            r9 = 3
            if (r4 != r9) goto L_0x01a2
            r4 = r15
            goto L_0x01b7
        L_0x01a2:
            int r4 = r15.c()
            r9 = 1
            int r4 = r4 - r9
        L_0x01a8:
            if (r4 < 0) goto L_0x01b4
            S1.c r9 = r15.b(r4)
            r7.push(r9)
            r9 = -1
            int r4 = r4 + r9
            goto L_0x01a8
        L_0x01b4:
            r9 = 3
            goto L_0x0185
        L_0x01b6:
            r4 = 0
        L_0x01b7:
            if (r4 != 0) goto L_0x01ba
            goto L_0x0154
        L_0x01ba:
            int r7 = r4.c()
            r9 = 1
            if (r7 != r9) goto L_0x01fb
            r7 = 0
            S1.c r9 = r4.b(r7)
            java.lang.String r9 = r9.f4402b
            if (r9 == 0) goto L_0x01fb
            S1.c r9 = r4.b(r7)
            java.lang.String r9 = r9.f4402b
            int r15 = P0.z.f3748a
            S1.g r15 = r4.f4405f
            java.lang.String[] r4 = r4.f4406g
            S1.g r4 = com.bumptech.glide.c.v(r15, r4, r8)
            if (r4 == 0) goto L_0x01e0
            int r4 = r4.f4443n
        L_0x01de:
            r15 = -1
            goto L_0x01e2
        L_0x01e0:
            r4 = -1
            goto L_0x01de
        L_0x01e2:
            if (r4 != r15) goto L_0x01f0
            S1.g r7 = r1.f4405f
            java.lang.String[] r1 = r1.f4406g
            S1.g r1 = com.bumptech.glide.c.v(r7, r1, r8)
            if (r1 == 0) goto L_0x01f0
            int r4 = r1.f4443n
        L_0x01f0:
            O0.g r1 = new O0.g
            r1.<init>(r9, r4)
            r4 = 33
            r14.setSpan(r1, r6, r3, r4)
            goto L_0x0203
        L_0x01fb:
            r15 = -1
            java.lang.String r1 = "TtmlRenderUtil"
            java.lang.String r4 = "Skipping rubyText node without exactly one text child."
            P0.l.s(r1, r4)
        L_0x0203:
            int r1 = r13.f4446q
            r4 = 1
            if (r1 != r4) goto L_0x0210
            O0.e r1 = new O0.e
            r1.<init>()
            G5.s.a(r14, r1, r6, r3)
        L_0x0210:
            int r1 = r13.f4439j
            r7 = 1120403456(0x42c80000, float:100.0)
            if (r1 == r4) goto L_0x0288
            r4 = 2
            if (r1 == r4) goto L_0x027b
            r4 = 3
            if (r1 == r4) goto L_0x0220
            r17 = r2
            goto L_0x0296
        L_0x0220:
            float r1 = r13.f4440k
            float r1 = r1 / r7
            java.lang.Class<android.text.style.RelativeSizeSpan> r4 = android.text.style.RelativeSizeSpan.class
            java.lang.Object[] r4 = r14.getSpans(r6, r3, r4)
            android.text.style.RelativeSizeSpan[] r4 = (android.text.style.RelativeSizeSpan[]) r4
            int r9 = r4.length
            r15 = 0
        L_0x022d:
            if (r15 >= r9) goto L_0x026e
            r7 = r4[r15]
            r17 = r2
            int r2 = r14.getSpanStart(r7)
            if (r2 > r6) goto L_0x0246
            int r2 = r14.getSpanEnd(r7)
            if (r2 < r3) goto L_0x0246
            float r2 = r7.getSizeChange()
            float r2 = r2 * r1
            r1 = r2
        L_0x0246:
            int r2 = r14.getSpanStart(r7)
            if (r2 != r6) goto L_0x0261
            int r2 = r14.getSpanEnd(r7)
            if (r2 != r3) goto L_0x0261
            int r2 = r14.getSpanFlags(r7)
            r18 = r4
            r4 = 33
            if (r2 != r4) goto L_0x025f
            r14.removeSpan(r7)
        L_0x025f:
            r2 = 1
            goto L_0x0266
        L_0x0261:
            r18 = r4
            r4 = 33
            goto L_0x025f
        L_0x0266:
            int r15 = r15 + r2
            r2 = r17
            r4 = r18
            r7 = 1120403456(0x42c80000, float:100.0)
            goto L_0x022d
        L_0x026e:
            r17 = r2
            r4 = 33
            android.text.style.RelativeSizeSpan r2 = new android.text.style.RelativeSizeSpan
            r2.<init>(r1)
            r14.setSpan(r2, r6, r3, r4)
            goto L_0x0296
        L_0x027b:
            r17 = r2
            android.text.style.RelativeSizeSpan r1 = new android.text.style.RelativeSizeSpan
            float r2 = r13.f4440k
            r1.<init>(r2)
            G5.s.a(r14, r1, r6, r3)
            goto L_0x0296
        L_0x0288:
            r17 = r2
            android.text.style.AbsoluteSizeSpan r1 = new android.text.style.AbsoluteSizeSpan
            float r2 = r13.f4440k
            int r2 = (int) r2
            r4 = 1
            r1.<init>(r2, r4)
            G5.s.a(r14, r1, r6, r3)
        L_0x0296:
            java.lang.String r1 = "p"
            java.lang.String r2 = r0.f4401a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02c5
            float r1 = r13.f4448s
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x02b2
            r2 = -1028390912(0xffffffffc2b40000, float:-90.0)
            float r1 = r1 * r2
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            r5.f3509q = r1
        L_0x02b2:
            android.text.Layout$Alignment r1 = r13.f4444o
            if (r1 == 0) goto L_0x02b8
            r5.f3497c = r1
        L_0x02b8:
            android.text.Layout$Alignment r1 = r13.f4445p
            if (r1 == 0) goto L_0x02c5
            r5.f3498d = r1
            goto L_0x02c5
        L_0x02bf:
            r12 = r23
            r11 = r25
        L_0x02c3:
            r17 = r2
        L_0x02c5:
            r2 = r17
            r1 = -1
            r9 = 1
            goto L_0x0025
        L_0x02cb:
            r12 = r23
            r11 = r25
            r9 = 0
        L_0x02d0:
            int r1 = r19.c()
            if (r9 >= r1) goto L_0x02e9
            S1.c r1 = r0.b(r9)
            r2 = r20
            r4 = r22
            r5 = r23
            r6 = r10
            r7 = r25
            r1.h(r2, r4, r5, r6, r7)
            r1 = 1
            int r9 = r9 + r1
            goto L_0x02d0
        L_0x02e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S1.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j7, boolean z, String str, TreeMap treeMap) {
        String str2;
        boolean z6;
        TreeMap treeMap2 = treeMap;
        HashMap hashMap = this.f4409k;
        hashMap.clear();
        HashMap hashMap2 = this.f4410l;
        hashMap2.clear();
        String str3 = this.f4401a;
        if (!"metadata".equals(str3)) {
            String str4 = this.f4407h;
            if ("".equals(str4)) {
                str2 = str;
            } else {
                str2 = str4;
            }
            if (this.f4403c && z) {
                SpannableStringBuilder e8 = e(str2, treeMap2);
                String str5 = this.f4402b;
                str5.getClass();
                e8.append(str5);
            } else if ("br".equals(str3) && z) {
                e(str2, treeMap2).append(10);
            } else if (f(j7)) {
                for (Map.Entry entry : treeMap.entrySet()) {
                    CharSequence charSequence = ((a) entry.getValue()).f3495a;
                    charSequence.getClass();
                    hashMap.put((String) entry.getKey(), Integer.valueOf(charSequence.length()));
                }
                boolean equals = "p".equals(str3);
                for (int i8 = 0; i8 < c(); i8++) {
                    c b8 = b(i8);
                    if (z || equals) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    b8.i(j7, z6, str2, treeMap);
                }
                if (equals) {
                    SpannableStringBuilder e9 = e(str2, treeMap2);
                    int length = e9.length() - 1;
                    while (length >= 0 && e9.charAt(length) == ' ') {
                        length--;
                    }
                    if (length >= 0 && e9.charAt(length) != 10) {
                        e9.append(10);
                    }
                }
                for (Map.Entry entry2 : treeMap.entrySet()) {
                    CharSequence charSequence2 = ((a) entry2.getValue()).f3495a;
                    charSequence2.getClass();
                    hashMap2.put((String) entry2.getKey(), Integer.valueOf(charSequence2.length()));
                }
            }
        }
    }
}
