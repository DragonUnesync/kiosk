package androidx.lifecycle;

import D6.r;
import P6.f;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import c2.C0612a;
import c2.C0613b;
import java.util.List;

public final class ProcessLifecycleInitializer implements C0613b {
    public final List a() {
        return r.f1269U;
    }

    public final Object create(Context context) {
        f.e(context, "context");
        C0612a c8 = C0612a.c(context);
        f.d(c8, "getInstance(context)");
        if (c8.f8878b.contains(ProcessLifecycleInitializer.class)) {
            if (!C0488o.f8151a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                f.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0487n());
            }
            E e = E.f8107c0;
            e.getClass();
            e.f8112Y = new Handler();
            e.f8113Z.d(C0485l.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            f.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new D(e));
            return e;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
