package W0;

import A1.c;
import P0.z;
import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;
import l1.e;

public final class o implements Handler.Callback {

    /* renamed from: U  reason: collision with root package name */
    public final e f6113U;

    /* renamed from: V  reason: collision with root package name */
    public final d f6114V;

    /* renamed from: W  reason: collision with root package name */
    public final c f6115W = new c(0);

    /* renamed from: X  reason: collision with root package name */
    public final Handler f6116X = z.m(this);

    /* renamed from: Y  reason: collision with root package name */
    public final TreeMap f6117Y = new TreeMap();

    /* renamed from: Z  reason: collision with root package name */
    public X0.c f6118Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f6119a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f6120b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f6121c0;

    public o(X0.c cVar, d dVar, e eVar) {
        this.f6118Z = cVar;
        this.f6114V = dVar;
        this.f6113U = eVar;
    }

    public final boolean handleMessage(Message message) {
        if (this.f6121c0) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        m mVar = (m) message.obj;
        long j7 = mVar.f6107a;
        TreeMap treeMap = this.f6117Y;
        long j8 = mVar.f6108b;
        Long l8 = (Long) treeMap.get(Long.valueOf(j8));
        if (l8 == null) {
            treeMap.put(Long.valueOf(j8), Long.valueOf(j7));
        } else if (l8.longValue() > j7) {
            treeMap.put(Long.valueOf(j8), Long.valueOf(j7));
        }
        return true;
    }
}
