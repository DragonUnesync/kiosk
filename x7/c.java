package x7;

import P6.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import r7.C1395d;

public final class c implements b {
    public final ArrayList a(C1395d dVar, Class cls) {
        f.e(dVar, "config");
        ArrayList arrayList = new ArrayList();
        ServiceLoader load = ServiceLoader.load(cls, c.class.getClassLoader());
        ErrorReporter errorReporter = C1247a.f13789a;
        Iterator it = load.iterator();
        f.d(it, "iterator(...)");
        while (it.hasNext()) {
            try {
                try {
                    a aVar = (a) it.next();
                    f.e(aVar, "it");
                    if (aVar.enabled(dVar)) {
                        ErrorReporter errorReporter2 = C1247a.f13789a;
                        arrayList.add(aVar);
                    } else {
                        ErrorReporter errorReporter3 = C1247a.f13789a;
                    }
                } catch (ServiceConfigurationError e) {
                    ErrorReporter errorReporter4 = C1247a.f13789a;
                    a.B("Unable to load ".concat(cls.getSimpleName()), e);
                }
            } catch (ServiceConfigurationError e8) {
                ErrorReporter errorReporter5 = C1247a.f13789a;
                ErrorReporter errorReporter6 = C1247a.f13789a;
                a.B("Broken ServiceLoader for ".concat(cls.getSimpleName()), e8);
            }
        }
        return arrayList;
    }
}
