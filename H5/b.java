package H5;

import B3.o;
import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;

public final class b {

    /* renamed from: g  reason: collision with root package name */
    public static final ArrayList f2163g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f2164a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2165b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2166c;

    /* renamed from: d  reason: collision with root package name */
    public final Camera f2167d;
    public final Handler e;

    /* renamed from: f  reason: collision with root package name */
    public final a f2168f = new a(this);

    static {
        ArrayList arrayList = new ArrayList(2);
        f2163g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public b(Camera camera, i iVar) {
        o oVar = new o(2, this);
        this.e = new Handler(oVar);
        this.f2167d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        iVar.getClass();
        boolean contains = f2163g.contains(focusMode);
        this.f2166c = contains;
        Log.i("b", "Current focus mode '" + focusMode + "'; use auto focus? " + contains);
        this.f2164a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.f2164a && !this.e.hasMessages(1)) {
            Handler handler = this.e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000);
        }
    }

    public final void b() {
        if (this.f2166c && !this.f2164a && !this.f2165b) {
            try {
                this.f2167d.autoFocus(this.f2168f);
                this.f2165b = true;
            } catch (RuntimeException e8) {
                Log.w("b", "Unexpected exception while focusing", e8);
                a();
            }
        }
    }

    public final void c() {
        this.f2164a = true;
        this.f2165b = false;
        this.e.removeMessages(1);
        if (this.f2166c) {
            try {
                this.f2167d.cancelAutoFocus();
            } catch (RuntimeException e8) {
                Log.w("b", "Unexpected exception while cancelling focusing", e8);
            }
        }
    }
}
