package C7;

import D6.i;
import F2.e;
import P6.f;
import W6.l;
import de.ozerov.fully.MyApplication;
import de.ozerov.fully.U0;
import de.ozerov.fully.g5;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import n2.a;
import n7.C1247a;
import n7.b;
import org.acra.ErrorReporter;
import org.acra.startup.StartupProcessor;
import q4.k;
import r7.C1395d;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f727U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f728V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f729W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ boolean f730X;

    public /* synthetic */ c(d dVar, Calendar calendar, boolean z, int i) {
        this.f727U = i;
        this.f728V = dVar;
        this.f729W = calendar;
        this.f730X = z;
    }

    public final void run() {
        boolean z = false;
        Object obj = this.f729W;
        boolean z6 = this.f730X;
        Object obj2 = this.f728V;
        switch (this.f727U) {
            case 0:
                new Thread(new c((d) obj2, (Calendar) obj, z6, 1)).start();
                return;
            case 1:
                d dVar = (d) obj2;
                e eVar = (e) dVar.f735Y;
                File dir = eVar.f1521V.getDir("ACRA-unapproved", 0);
                f.d(dir, "getDir(...)");
                File[] listFiles = dir.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File aVar : listFiles) {
                    arrayList.add(new a(aVar, false));
                }
                File[] c8 = eVar.c();
                ArrayList arrayList2 = new ArrayList(c8.length);
                for (File aVar2 : c8) {
                    arrayList2.add(new a(aVar2, true));
                }
                ArrayList R3 = i.R(arrayList, arrayList2);
                C1395d dVar2 = (C1395d) dVar.f733W;
                Iterator it = ((x7.c) dVar2.f14977t0).a(dVar2, StartupProcessor.class).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    MyApplication myApplication = (MyApplication) dVar.f732V;
                    if (hasNext) {
                        ((StartupProcessor) it.next()).processReports(myApplication, dVar2, R3);
                    } else {
                        Iterator it2 = R3.iterator();
                        while (true) {
                            boolean hasNext2 = it2.hasNext();
                            v.i iVar = (v.i) dVar.f734X;
                            if (hasNext2) {
                                a aVar3 = (a) it2.next();
                                String name = aVar3.f723a.getName();
                                f.d(name, "getName(...)");
                                ((k) dVar.f736Z).getClass();
                                String Y7 = l.Y(l.Y(name, ".stacktrace", ""), b.f13790a, "");
                                Calendar instance = Calendar.getInstance();
                                try {
                                    Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.ENGLISH).parse(Y7);
                                    f.b(parse);
                                    instance.setTime(parse);
                                } catch (ParseException unused) {
                                }
                                f.b(instance);
                                if (instance.before((Calendar) obj)) {
                                    boolean z8 = aVar3.f725c;
                                    File file = aVar3.f723a;
                                    if (z8) {
                                        if (!file.delete()) {
                                            ErrorReporter errorReporter = C1247a.f13789a;
                                            a.m1("Could not delete report " + file);
                                        }
                                    } else if (aVar3.f724b) {
                                        z = true;
                                    } else if (aVar3.f726d && z6 && new d4.k(myApplication, dVar2).L2(file)) {
                                        iVar.h(file);
                                    }
                                }
                            } else if (z && z6) {
                                iVar.h((File) null);
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                }
                break;
            default:
                g5 f8 = ((U0) obj2).f10414a.f9917F0.f(z6, false, false);
                if (f8 != null) {
                    f8.g((String) obj);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ c(U0 u02, boolean z, String str) {
        this.f727U = 2;
        this.f728V = u02;
        this.f730X = z;
        this.f729W = str;
    }
}
