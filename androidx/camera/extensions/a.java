package androidx.camera.extensions;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f7645a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static a f7646b;

    /* JADX WARNING: type inference failed for: r1v2, types: [androidx.camera.extensions.a, java.lang.Object] */
    public static a a() {
        synchronized (f7645a) {
            try {
                a aVar = f7646b;
                if (aVar != null) {
                    return aVar;
                }
                ? obj = new Object();
                f7646b = obj;
                return obj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
