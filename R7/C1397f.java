package r7;

import P6.e;
import P6.f;
import P6.h;
import P6.k;
import java.lang.reflect.Constructor;
import java.util.List;
import org.acra.data.StringFormat;
import org.acra.file.Directory;
import x7.b;

/* renamed from: r7.f  reason: case insensitive filesystem */
public final class C1397f {

    /* renamed from: D  reason: collision with root package name */
    public static final /* synthetic */ h[] f14981D;

    /* renamed from: A  reason: collision with root package name */
    public final C1396e f14982A = new C1396e(this, 17);

    /* renamed from: B  reason: collision with root package name */
    public final C1396e f14983B = new C1396e(this, 18);

    /* renamed from: C  reason: collision with root package name */
    public final C1396e f14984C = new C1396e(this, 19);

    /* renamed from: a  reason: collision with root package name */
    public int f14985a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final C1396e f14986b = new C1396e(this, 10);

    /* renamed from: c  reason: collision with root package name */
    public final C1396e f14987c = new C1396e(this, 20);

    /* renamed from: d  reason: collision with root package name */
    public final C1396e f14988d = new C1396e(this, 21);
    public final C1396e e = new C1396e(this, 22);

    /* renamed from: f  reason: collision with root package name */
    public final C1396e f14989f = new C1396e(this, 23);

    /* renamed from: g  reason: collision with root package name */
    public final C1396e f14990g = new C1396e(this, 24);

    /* renamed from: h  reason: collision with root package name */
    public final C1396e f14991h = new C1396e(this, 25);
    public final C1396e i = new C1396e(this, 26);

    /* renamed from: j  reason: collision with root package name */
    public final C1396e f14992j = new C1396e(this, 27);

    /* renamed from: k  reason: collision with root package name */
    public final C1396e f14993k = new C1396e(this, 0);

    /* renamed from: l  reason: collision with root package name */
    public final C1396e f14994l = new C1396e(this, 1);

    /* renamed from: m  reason: collision with root package name */
    public final C1396e f14995m = new C1396e(this, 2);

    /* renamed from: n  reason: collision with root package name */
    public final C1396e f14996n = new C1396e(this, 3);

    /* renamed from: o  reason: collision with root package name */
    public final C1396e f14997o = new C1396e(this, 4);

    /* renamed from: p  reason: collision with root package name */
    public final C1396e f14998p = new C1396e(this, 5);

    /* renamed from: q  reason: collision with root package name */
    public final C1396e f14999q = new C1396e(this, 6);

    /* renamed from: r  reason: collision with root package name */
    public final C1396e f15000r = new C1396e(this, 7);

    /* renamed from: s  reason: collision with root package name */
    public final C1396e f15001s = new C1396e(this, 8);

    /* renamed from: t  reason: collision with root package name */
    public final C1396e f15002t = new C1396e(this, 9);

    /* renamed from: u  reason: collision with root package name */
    public final C1396e f15003u = new C1396e(this, 11);

    /* renamed from: v  reason: collision with root package name */
    public final C1396e f15004v = new C1396e(this, 12);

    /* renamed from: w  reason: collision with root package name */
    public final C1396e f15005w = new C1396e(this, 13);

    /* renamed from: x  reason: collision with root package name */
    public final C1396e f15006x = new C1396e(this, 14);

    /* renamed from: y  reason: collision with root package name */
    public final C1396e f15007y = new C1396e(this, 15);
    public final C1396e z = new C1396e(this, 16);

    static {
        Class<C1397f> cls = C1397f.class;
        h hVar = new h("sharedPreferencesName", cls, "getSharedPreferencesName()Ljava/lang/String;");
        k.f3956a.getClass();
        f14981D = new h[]{hVar, new h("includeDropBoxSystemTags", cls, "getIncludeDropBoxSystemTags()Ljava/lang/Boolean;"), new h("additionalDropBoxTags", cls, "getAdditionalDropBoxTags()Ljava/util/List;"), new h("dropboxCollectionMinutes", cls, "getDropboxCollectionMinutes()Ljava/lang/Integer;"), new h("logcatArguments", cls, "getLogcatArguments()Ljava/util/List;"), new h("reportContent", cls, "getReportContent()Ljava/util/List;"), new h("deleteUnapprovedReportsOnApplicationStart", cls, "getDeleteUnapprovedReportsOnApplicationStart()Ljava/lang/Boolean;"), new h("alsoReportToAndroidFramework", cls, "getAlsoReportToAndroidFramework()Ljava/lang/Boolean;"), new h("additionalSharedPreferences", cls, "getAdditionalSharedPreferences()Ljava/util/List;"), new h("logcatFilterByPid", cls, "getLogcatFilterByPid()Ljava/lang/Boolean;"), new h("logcatReadNonBlocking", cls, "getLogcatReadNonBlocking()Ljava/lang/Boolean;"), new h("sendReportsInDevMode", cls, "getSendReportsInDevMode()Ljava/lang/Boolean;"), new h("excludeMatchingSharedPreferencesKeys", cls, "getExcludeMatchingSharedPreferencesKeys()Ljava/util/List;"), new h("excludeMatchingSettingsKeys", cls, "getExcludeMatchingSettingsKeys()Ljava/util/List;"), new h("buildConfigClass", cls, "getBuildConfigClass()Ljava/lang/Class;"), new h("applicationLogFile", cls, "getApplicationLogFile()Ljava/lang/String;"), new h("applicationLogFileLines", cls, "getApplicationLogFileLines()Ljava/lang/Integer;"), new h("applicationLogFileDir", cls, "getApplicationLogFileDir()Lorg/acra/file/Directory;"), new h("retryPolicyClass", cls, "getRetryPolicyClass()Ljava/lang/Class;"), new h("stopServicesOnCrash", cls, "getStopServicesOnCrash()Ljava/lang/Boolean;"), new h("attachmentUris", cls, "getAttachmentUris()Ljava/util/List;"), new h("attachmentUriProvider", cls, "getAttachmentUriProvider()Ljava/lang/Class;"), new h("reportSendSuccessToast", cls, "getReportSendSuccessToast()Ljava/lang/String;"), new h("reportSendFailureToast", cls, "getReportSendFailureToast()Ljava/lang/String;"), new h("reportFormat", cls, "getReportFormat()Lorg/acra/data/StringFormat;"), new h("parallel", cls, "getParallel()Ljava/lang/Boolean;"), new h("pluginLoader", cls, "getPluginLoader()Lorg/acra/plugins/PluginLoader;"), new h("pluginConfigurations", cls, "getPluginConfigurations()Ljava/util/List;")};
    }

    public final C1395d a() {
        boolean z6;
        int i8;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        boolean z13;
        boolean z14;
        Class<String> cls = String.class;
        Class cls2 = Boolean.TYPE;
        Class<List> cls3 = List.class;
        Class cls4 = Integer.TYPE;
        Class<Class> cls5 = Class.class;
        Constructor<C1395d> constructor = C1395d.class.getConstructor(new Class[]{cls, cls2, cls3, cls4, cls3, cls3, cls2, cls2, cls3, cls2, cls2, cls2, cls3, cls3, cls5, cls, cls4, Directory.class, cls5, cls2, cls3, cls5, cls, cls, StringFormat.class, cls2, b.class, cls3, cls4, e.class});
        C1396e eVar = this.f14986b;
        h[] hVarArr = f14981D;
        String str = (String) eVar.c(hVarArr[0]);
        Boolean bool = (Boolean) this.f14987c.c(hVarArr[1]);
        if (bool != null) {
            z6 = bool.booleanValue();
        } else {
            z6 = false;
        }
        Boolean valueOf = Boolean.valueOf(z6);
        List list = (List) this.f14988d.c(hVarArr[2]);
        Integer num = (Integer) this.e.c(hVarArr[3]);
        if (num != null) {
            i8 = num.intValue();
        } else {
            i8 = 0;
        }
        Integer valueOf2 = Integer.valueOf(i8);
        List list2 = (List) this.f14989f.c(hVarArr[4]);
        List list3 = (List) this.f14990g.c(hVarArr[5]);
        Boolean bool2 = (Boolean) this.f14991h.c(hVarArr[6]);
        if (bool2 != null) {
            z8 = bool2.booleanValue();
        } else {
            z8 = false;
        }
        Boolean valueOf3 = Boolean.valueOf(z8);
        Boolean bool3 = (Boolean) this.i.c(hVarArr[7]);
        if (bool3 != null) {
            z9 = bool3.booleanValue();
        } else {
            z9 = false;
        }
        Boolean valueOf4 = Boolean.valueOf(z9);
        List list4 = (List) this.f14992j.c(hVarArr[8]);
        Boolean bool4 = (Boolean) this.f14993k.c(hVarArr[9]);
        if (bool4 != null) {
            z10 = bool4.booleanValue();
        } else {
            z10 = false;
        }
        Boolean valueOf5 = Boolean.valueOf(z10);
        Boolean bool5 = (Boolean) this.f14994l.c(hVarArr[10]);
        if (bool5 != null) {
            z11 = bool5.booleanValue();
        } else {
            z11 = false;
        }
        Boolean valueOf6 = Boolean.valueOf(z11);
        Boolean bool6 = (Boolean) this.f14995m.c(hVarArr[11]);
        if (bool6 != null) {
            z12 = bool6.booleanValue();
        } else {
            z12 = false;
        }
        Boolean valueOf7 = Boolean.valueOf(z12);
        Constructor<C1395d> constructor2 = constructor;
        List list5 = (List) this.f14996n.c(hVarArr[12]);
        List list6 = (List) this.f14997o.c(hVarArr[13]);
        Class cls6 = (Class) this.f14998p.c(hVarArr[14]);
        String str2 = (String) this.f14999q.c(hVarArr[15]);
        Integer num2 = (Integer) this.f15000r.c(hVarArr[16]);
        if (num2 != null) {
            i9 = num2.intValue();
        } else {
            i9 = 0;
        }
        Integer valueOf8 = Integer.valueOf(i9);
        Directory directory = (Directory) this.f15001s.c(hVarArr[17]);
        Class cls7 = (Class) this.f15002t.c(hVarArr[18]);
        Boolean bool7 = (Boolean) this.f15003u.c(hVarArr[19]);
        if (bool7 != null) {
            z13 = bool7.booleanValue();
        } else {
            z13 = false;
        }
        Boolean valueOf9 = Boolean.valueOf(z13);
        List list7 = (List) this.f15004v.c(hVarArr[20]);
        Class cls8 = (Class) this.f15005w.c(hVarArr[21]);
        String str3 = (String) this.f15006x.c(hVarArr[22]);
        String str4 = (String) this.f15007y.c(hVarArr[23]);
        StringFormat stringFormat = (StringFormat) this.z.c(hVarArr[24]);
        Boolean bool8 = (Boolean) this.f14982A.c(hVarArr[25]);
        if (bool8 != null) {
            z14 = bool8.booleanValue();
        } else {
            z14 = false;
        }
        C1395d newInstance = constructor2.newInstance(new Object[]{str, valueOf, list, valueOf2, list2, list3, valueOf3, valueOf4, list4, valueOf5, valueOf6, valueOf7, list5, list6, cls6, str2, valueOf8, directory, cls7, valueOf9, list7, cls8, str3, str4, stringFormat, Boolean.valueOf(z14), (b) this.f14983B.c(hVarArr[26]), (List) this.f14984C.c(hVarArr[27]), Integer.valueOf(this.f14985a), null});
        f.d(newInstance, "newInstance(...)");
        return newInstance;
    }

    public final void b(C1392a... aVarArr) {
        this.f14984C.o(f14981D[27], D6.h.H(aVarArr));
    }
}
