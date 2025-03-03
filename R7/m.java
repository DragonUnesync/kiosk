package r7;

import P6.e;
import P6.f;
import P6.h;
import P6.k;
import java.lang.reflect.Constructor;
import java.util.concurrent.TimeUnit;

public final class m {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ h[] f15054l;

    /* renamed from: a  reason: collision with root package name */
    public int f15055a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final l f15056b = new l(this, 1);

    /* renamed from: c  reason: collision with root package name */
    public final l f15057c = new l(this, 2);

    /* renamed from: d  reason: collision with root package name */
    public final l f15058d = new l(this, 3);
    public final l e = new l(this, 4);

    /* renamed from: f  reason: collision with root package name */
    public final l f15059f = new l(this, 5);

    /* renamed from: g  reason: collision with root package name */
    public final l f15060g = new l(this, 6);

    /* renamed from: h  reason: collision with root package name */
    public final l f15061h = new l(this, 7);
    public final l i = new l(this, 8);

    /* renamed from: j  reason: collision with root package name */
    public final l f15062j = new l(this, 9);

    /* renamed from: k  reason: collision with root package name */
    public final l f15063k = new l(this, 0);

    static {
        Class<m> cls = m.class;
        h hVar = new h("enabled", cls, "getEnabled()Ljava/lang/Boolean;");
        k.f3956a.getClass();
        f15054l = new h[]{hVar, new h("periodUnit", cls, "getPeriodUnit()Ljava/util/concurrent/TimeUnit;"), new h("period", cls, "getPeriod()Ljava/lang/Long;"), new h("overallLimit", cls, "getOverallLimit()Ljava/lang/Integer;"), new h("stacktraceLimit", cls, "getStacktraceLimit()Ljava/lang/Integer;"), new h("exceptionClassLimit", cls, "getExceptionClassLimit()Ljava/lang/Integer;"), new h("failedReportLimit", cls, "getFailedReportLimit()Ljava/lang/Integer;"), new h("ignoredCrashToast", cls, "getIgnoredCrashToast()Ljava/lang/String;"), new h("deleteReportsOnAppUpdate", cls, "getDeleteReportsOnAppUpdate()Ljava/lang/Boolean;"), new h("resetLimitsOnAppUpdate", cls, "getResetLimitsOnAppUpdate()Ljava/lang/Boolean;")};
    }

    public final k a() {
        boolean z;
        long j7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z6;
        boolean z8;
        Class cls = Boolean.TYPE;
        Class cls2 = Integer.TYPE;
        Constructor<k> constructor = k.class.getConstructor(new Class[]{cls, TimeUnit.class, Long.TYPE, cls2, cls2, cls2, cls2, String.class, cls, cls, cls2, e.class});
        l lVar = this.f15056b;
        h[] hVarArr = f15054l;
        Boolean bool = (Boolean) lVar.c(hVarArr[0]);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        TimeUnit timeUnit = (TimeUnit) this.f15057c.c(hVarArr[1]);
        Long l8 = (Long) this.f15058d.c(hVarArr[2]);
        if (l8 != null) {
            j7 = l8.longValue();
        } else {
            j7 = 0;
        }
        Long valueOf2 = Long.valueOf(j7);
        Integer num = (Integer) this.e.c(hVarArr[3]);
        if (num != null) {
            i8 = num.intValue();
        } else {
            i8 = 0;
        }
        Integer valueOf3 = Integer.valueOf(i8);
        Integer num2 = (Integer) this.f15059f.c(hVarArr[4]);
        if (num2 != null) {
            i9 = num2.intValue();
        } else {
            i9 = 0;
        }
        Integer valueOf4 = Integer.valueOf(i9);
        Integer num3 = (Integer) this.f15060g.c(hVarArr[5]);
        if (num3 != null) {
            i10 = num3.intValue();
        } else {
            i10 = 0;
        }
        Integer valueOf5 = Integer.valueOf(i10);
        Integer num4 = (Integer) this.f15061h.c(hVarArr[6]);
        if (num4 != null) {
            i11 = num4.intValue();
        } else {
            i11 = 0;
        }
        Integer valueOf6 = Integer.valueOf(i11);
        String str = (String) this.i.c(hVarArr[7]);
        Boolean bool2 = (Boolean) this.f15062j.c(hVarArr[8]);
        if (bool2 != null) {
            z6 = bool2.booleanValue();
        } else {
            z6 = false;
        }
        Boolean valueOf7 = Boolean.valueOf(z6);
        Boolean bool3 = (Boolean) this.f15063k.c(hVarArr[9]);
        if (bool3 != null) {
            z8 = bool3.booleanValue();
        } else {
            z8 = false;
        }
        k newInstance = constructor.newInstance(new Object[]{valueOf, timeUnit, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, str, valueOf7, Boolean.valueOf(z8), Integer.valueOf(this.f15055a), null});
        f.d(newInstance, "newInstance(...)");
        return newInstance;
    }
}
