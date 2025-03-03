package D2;

import A.f;
import F2.a;
import F2.d;
import F2.e;
import W2.g;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

public final class p implements g {

    /* renamed from: U  reason: collision with root package name */
    public volatile Object f1140U;

    /* renamed from: V  reason: collision with root package name */
    public final Object f1141V;

    public /* synthetic */ p(Object obj) {
        this.f1141V = obj;
    }

    public a a() {
        File file;
        if (((a) this.f1140U) == null) {
            synchronized (this) {
                try {
                    if (((a) this.f1140U) == null) {
                        File cacheDir = ((e) ((f) this.f1141V).f17V).f1521V.getCacheDir();
                        d dVar = null;
                        if (cacheDir == null) {
                            file = null;
                        } else {
                            file = new File(cacheDir, "image_manager_disk_cache");
                        }
                        if (file != null) {
                            if (file.isDirectory() || file.mkdirs()) {
                                dVar = new d(file);
                            }
                        }
                        this.f1140U = dVar;
                    }
                    if (((a) this.f1140U) == null) {
                        this.f1140U = new z3.e(24);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (a) this.f1140U;
    }

    public Object get() {
        if (this.f1140U == null) {
            synchronized (this) {
                try {
                    if (this.f1140U == null) {
                        Object obj = ((g) this.f1141V).get();
                        W2.f.c(obj, "Argument must not be null");
                        this.f1140U = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f1140U;
    }

    public p() {
        this.f1141V = new CopyOnWriteArraySet();
    }
}
