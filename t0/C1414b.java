package t0;

import D2.G;
import android.text.SpannableStringBuilder;

/* renamed from: t0.b  reason: case insensitive filesystem */
public final class C1414b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f15169b = Character.toString(8206);

    /* renamed from: c  reason: collision with root package name */
    public static final String f15170c = Character.toString(8207);

    /* renamed from: d  reason: collision with root package name */
    public static final C1414b f15171d = new C1414b(false);
    public static final C1414b e = new C1414b(true);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15172a;

    static {
        G g8 = C1418f.f15180c;
    }

    public C1414b(boolean z) {
        G g8 = C1418f.f15178a;
        this.f15172a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        r3 = r3 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            t0.a r0 = new t0.a
            r0.<init>(r9)
            r9 = 0
            r0.f15167c = r9
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x000b:
            int r4 = r0.f15167c
            int r5 = r0.f15166b
            r6 = 1
            r7 = -1
            if (r4 >= r5) goto L_0x0070
            if (r1 != 0) goto L_0x0070
            java.lang.CharSequence r5 = r0.f15165a
            char r4 = r5.charAt(r4)
            r0.f15168d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L_0x0037
            int r4 = r0.f15167c
            int r4 = java.lang.Character.codePointAt(r5, r4)
            int r5 = r0.f15167c
            int r8 = java.lang.Character.charCount(r4)
            int r8 = r8 + r5
            r0.f15167c = r8
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L_0x004b
        L_0x0037:
            int r4 = r0.f15167c
            int r4 = r4 + r6
            r0.f15167c = r4
            char r4 = r0.f15168d
            r5 = 1792(0x700, float:2.511E-42)
            if (r4 >= r5) goto L_0x0047
            byte[] r5 = t0.C1413a.e
            byte r4 = r5[r4]
            goto L_0x004b
        L_0x0047:
            byte r4 = java.lang.Character.getDirectionality(r4)
        L_0x004b:
            if (r4 == 0) goto L_0x006a
            if (r4 == r6) goto L_0x0066
            r5 = 2
            if (r4 == r5) goto L_0x0066
            r5 = 9
            if (r4 == r5) goto L_0x000b
            switch(r4) {
                case 14: goto L_0x0062;
                case 15: goto L_0x0062;
                case 16: goto L_0x005e;
                case 17: goto L_0x005e;
                case 18: goto L_0x005a;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x006e
        L_0x005a:
            int r3 = r3 + -1
            r2 = 0
            goto L_0x000b
        L_0x005e:
            int r3 = r3 + 1
            r2 = 1
            goto L_0x000b
        L_0x0062:
            int r3 = r3 + 1
            r2 = -1
            goto L_0x000b
        L_0x0066:
            if (r3 != 0) goto L_0x006e
        L_0x0068:
            r9 = 1
            goto L_0x008f
        L_0x006a:
            if (r3 != 0) goto L_0x006e
        L_0x006c:
            r9 = -1
            goto L_0x008f
        L_0x006e:
            r1 = r3
            goto L_0x000b
        L_0x0070:
            if (r1 != 0) goto L_0x0073
            goto L_0x008f
        L_0x0073:
            if (r2 == 0) goto L_0x0077
            r9 = r2
            goto L_0x008f
        L_0x0077:
            int r2 = r0.f15167c
            if (r2 <= 0) goto L_0x008f
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L_0x008c;
                case 15: goto L_0x008c;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r3 = r3 + 1
            goto L_0x0077
        L_0x0086:
            if (r1 != r3) goto L_0x0089
            goto L_0x0068
        L_0x0089:
            int r3 = r3 + -1
            goto L_0x0077
        L_0x008c:
            if (r1 != r3) goto L_0x0089
            goto L_0x006c
        L_0x008f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1414b.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r1 = r1 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r7) {
        /*
            t0.a r0 = new t0.a
            r0.<init>(r7)
            int r7 = r0.f15166b
            r0.f15167c = r7
            r7 = 0
            r1 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.f15167c
            if (r3 <= 0) goto L_0x0042
            byte r3 = r0.a()
            r4 = -1
            if (r3 == 0) goto L_0x003b
            r5 = 1
            if (r3 == r5) goto L_0x0035
            r6 = 2
            if (r3 == r6) goto L_0x0035
            r6 = 9
            if (r3 == r6) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x0031;
                case 15: goto L_0x0031;
                case 16: goto L_0x002a;
                case 17: goto L_0x002a;
                case 18: goto L_0x0027;
                default: goto L_0x0024;
            }
        L_0x0024:
            if (r2 != 0) goto L_0x000c
            goto L_0x0040
        L_0x0027:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x002a:
            if (r2 != r1) goto L_0x002e
        L_0x002c:
            r7 = 1
            goto L_0x0042
        L_0x002e:
            int r1 = r1 + -1
            goto L_0x000c
        L_0x0031:
            if (r2 != r1) goto L_0x002e
        L_0x0033:
            r7 = -1
            goto L_0x0042
        L_0x0035:
            if (r1 != 0) goto L_0x0038
            goto L_0x002c
        L_0x0038:
            if (r2 != 0) goto L_0x000c
            goto L_0x0040
        L_0x003b:
            if (r1 != 0) goto L_0x003e
            goto L_0x0033
        L_0x003e:
            if (r2 != 0) goto L_0x000c
        L_0x0040:
            r2 = r1
            goto L_0x000c
        L_0x0042:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1414b.b(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        G g8;
        String str;
        G g9;
        char c8;
        G g10 = C1418f.f15180c;
        if (charSequence == null) {
            return null;
        }
        boolean h5 = g10.h(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (h5) {
            g8 = C1418f.f15179b;
        } else {
            g8 = C1418f.f15178a;
        }
        boolean h8 = g8.h(charSequence, charSequence.length());
        String str2 = "";
        String str3 = f15170c;
        String str4 = f15169b;
        boolean z = this.f15172a;
        if (!z && (h8 || a(charSequence) == 1)) {
            str = str4;
        } else if (!z || (h8 && a(charSequence) != -1)) {
            str = str2;
        } else {
            str = str3;
        }
        spannableStringBuilder.append(str);
        if (h5 != z) {
            if (h5) {
                c8 = 8235;
            } else {
                c8 = 8234;
            }
            spannableStringBuilder.append(c8);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (h5) {
            g9 = C1418f.f15179b;
        } else {
            g9 = C1418f.f15178a;
        }
        boolean h9 = g9.h(charSequence, charSequence.length());
        if (!z && (h9 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!h9 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }
}
