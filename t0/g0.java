package T0;

import P0.l;
import P6.f;
import Y6.g;
import Y6.h;
import Y6.x;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.Arrays;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4837a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4838b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4839c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4840d;
    public Object e;

    public /* synthetic */ g0(boolean z) {
        this.f4837a = 2;
    }

    public h a() {
        return new h(this.f4839c, this.f4840d, (String[]) this.f4838b, (String[]) this.e);
    }

    public void b(g... gVarArr) {
        f.e(gVarArr, "cipherSuites");
        if (this.f4839c) {
            ArrayList arrayList = new ArrayList(gVarArr.length);
            for (g gVar : gVarArr) {
                arrayList.add(gVar.f6636a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            c((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections");
    }

    public void c(String... strArr) {
        f.e(strArr, "cipherSuites");
        if (!this.f4839c) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.f4838b = (String[]) strArr.clone();
        } else {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
    }

    public void d(boolean z) {
        switch (this.f4837a) {
            case 0:
                if (z && ((PowerManager.WakeLock) this.e) == null) {
                    PowerManager powerManager = (PowerManager) ((Context) this.f4838b).getSystemService("power");
                    if (powerManager == null) {
                        l.B("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.e = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
                this.f4839c = z;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.e;
                if (wakeLock != null) {
                    if (!z || !this.f4840d) {
                        wakeLock.release();
                        return;
                    } else {
                        wakeLock.acquire();
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (z && ((WifiManager.WifiLock) this.e) == null) {
                    WifiManager wifiManager = (WifiManager) ((Context) this.f4838b).getApplicationContext().getSystemService("wifi");
                    if (wifiManager == null) {
                        l.B("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                        return;
                    }
                    WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.e = createWifiLock;
                    createWifiLock.setReferenceCounted(false);
                }
                this.f4839c = z;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.e;
                if (wifiLock != null) {
                    if (!z || !this.f4840d) {
                        wifiLock.release();
                        return;
                    } else {
                        wifiLock.acquire();
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public void e(x... xVarArr) {
        if (this.f4839c) {
            ArrayList arrayList = new ArrayList(xVarArr.length);
            for (x xVar : xVarArr) {
                arrayList.add(xVar.f6764U);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            f((String[]) Arrays.copyOf(strArr, strArr.length));
            return;
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections");
    }

    public void f(String... strArr) {
        f.e(strArr, "tlsVersions");
        if (!this.f4839c) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.e = (String[]) strArr.clone();
        } else {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
    }

    public g0(Context context, int i) {
        this.f4837a = i;
        switch (i) {
            case 1:
                this.f4838b = context.getApplicationContext();
                return;
            default:
                this.f4838b = context.getApplicationContext();
                return;
        }
    }

    public g0(int i) {
        this.f4837a = i;
        switch (i) {
            case 3:
                return;
            default:
                this.f4839c = true;
                return;
        }
    }
}
