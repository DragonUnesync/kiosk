package m2;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: m2.a  reason: case insensitive filesystem */
public class C1208a extends RuntimeException {

    /* renamed from: U  reason: collision with root package name */
    public final StringBuffer f13347U;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1208a(java.lang.Exception r3, java.lang.String r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L_0x0003
            goto L_0x000b
        L_0x0003:
            if (r3 == 0) goto L_0x000a
            java.lang.String r4 = r3.getMessage()
            goto L_0x000b
        L_0x000a:
            r4 = 0
        L_0x000b:
            r2.<init>(r4, r3)
            boolean r4 = r3 instanceof m2.C1208a
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 == 0) goto L_0x002c
            m2.a r3 = (m2.C1208a) r3
            java.lang.StringBuffer r3 = r3.f13347U
            java.lang.String r3 = r3.toString()
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            int r1 = r3.length()
            int r1 = r1 + r0
            r4.<init>(r1)
            r2.f13347U = r4
            r4.append(r3)
            goto L_0x0033
        L_0x002c:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>(r0)
            r2.f13347U = r3
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.C1208a.<init>(java.lang.Exception, java.lang.String):void");
    }

    public static C1208a a(Exception exc, String str) {
        C1208a aVar;
        if (exc instanceof C1208a) {
            aVar = (C1208a) exc;
        } else {
            aVar = new C1208a(exc, (String) null);
        }
        if (str != null) {
            StringBuffer stringBuffer = aVar.f13347U;
            stringBuffer.append(str);
            if (!str.endsWith("\n")) {
                stringBuffer.append(10);
            }
            return aVar;
        }
        throw new NullPointerException("str == null");
    }

    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f13347U);
    }

    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f13347U);
    }
}
