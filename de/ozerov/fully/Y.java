package de.ozerov.fully;

import N5.e;
import a1.C0410a;
import android.content.Context;
import android.location.Location;
import android.os.Handler;
import java.util.Timer;

public abstract class Y {

    /* renamed from: a  reason: collision with root package name */
    public static final X f10505a;

    /* renamed from: b  reason: collision with root package name */
    public static Location f10506b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0410a f10507c = new C0410a(21);

    /* renamed from: d  reason: collision with root package name */
    public static Timer f10508d;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, de.ozerov.fully.X] */
    static {
        ? obj = new Object();
        obj.f10490a = false;
        obj.f10491b = false;
        obj.f10495g = new W(0);
        obj.f10496h = new W(1);
        f10505a = obj;
    }

    public static synchronized void a(Context context, int i) {
        synchronized (Y.class) {
            try {
                if (f10508d != null) {
                    b();
                }
                f10508d = new Timer();
                f10508d.schedule(new e(context, new Handler()), 0, (long) i);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public static synchronized void b() {
        synchronized (Y.class) {
            Timer timer = f10508d;
            if (timer != null) {
                timer.cancel();
                f10508d.purge();
                f10508d = null;
            }
        }
    }
}
