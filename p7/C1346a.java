package p7;

import H3.C0100q;
import de.ozerov.fully.MyApplication;
import de.ozerov.fully.U1;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: p7.a  reason: case insensitive filesystem */
public final class C1346a {

    /* renamed from: a  reason: collision with root package name */
    public final C0100q f14672a = new C0100q();

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f14673b;

    /* renamed from: c  reason: collision with root package name */
    public final Condition f14674c;

    public C1346a(MyApplication myApplication) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f14673b = reentrantLock;
        this.f14674c = reentrantLock.newCondition();
        myApplication.registerActivityLifecycleCallbacks(new U1(1, this));
    }
}
