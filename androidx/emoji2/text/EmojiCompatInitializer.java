package androidx.emoji2.text;

import F2.e;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0477d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import c2.C0612a;
import c2.C0613b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EmojiCompatInitializer implements C0613b {
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public final void b(Context context) {
        Object obj;
        C0612a c8 = C0612a.c(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        c8.getClass();
        synchronized (C0612a.e) {
            try {
                obj = c8.f8877a.get(cls);
                if (obj == null) {
                    obj = c8.b(cls, new HashSet());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        final t e = ((r) obj).e();
        e.a(new C0477d() {
            public final void onResume(r rVar) {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = a.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new l(0), 500);
                e.f(this);
            }
        });
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.emoji2.text.f, androidx.emoji2.text.q] */
    public final Object create(Context context) {
        ? fVar = new f((i) new e(context, 10));
        fVar.f7785a = 1;
        if (j.f7792k == null) {
            synchronized (j.f7791j) {
                try {
                    if (j.f7792k == null) {
                        j.f7792k = new j(fVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b(context);
        return Boolean.TRUE;
    }
}
