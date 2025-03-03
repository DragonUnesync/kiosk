package h;

import E.e;
import I2.b;
import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import d4.k;
import java.util.Calendar;

public final class x extends b {

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ int f12242W = 0;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ C1000A f12243X;

    /* renamed from: Y  reason: collision with root package name */
    public final Object f12244Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(C1000A a8, k kVar) {
        super(a8);
        this.f12243X = a8;
        this.f12244Y = kVar;
    }

    public final IntentFilter d() {
        switch (this.f12242W) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARNING: type inference failed for: r3v13, types: [h.I, java.lang.Object] */
    public final int e() {
        boolean z;
        Location location;
        long j7;
        Location location2;
        switch (this.f12242W) {
            case 0:
                if (s.a((PowerManager) this.f12244Y)) {
                    return 2;
                }
                return 1;
            default:
                k kVar = (k) this.f12244Y;
                C1009J j8 = (C1009J) kVar.f9768X;
                if (j8.f12125b > System.currentTimeMillis()) {
                    z = j8.f12124a;
                } else {
                    Context context = (Context) kVar.f9766V;
                    int b8 = e.b(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location location3 = null;
                    LocationManager locationManager = (LocationManager) kVar.f9767W;
                    if (b8 == 0) {
                        try {
                            if (locationManager.isProviderEnabled("network")) {
                                location2 = locationManager.getLastKnownLocation("network");
                                location = location2;
                            }
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (e.b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e8) {
                            Log.d("TwilightManager", "Failed to get last known location", e8);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (C1008I.f12120d == null) {
                            C1008I.f12120d = new Object();
                        }
                        C1008I i = C1008I.f12120d;
                        C1008I i8 = i;
                        i8.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        i8.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
                        if (i.f12123c == 1) {
                            z = true;
                        }
                        long j9 = i.f12122b;
                        long j10 = i.f12121a;
                        long j11 = j9;
                        i.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
                        long j12 = i.f12122b;
                        if (j11 == -1 || j10 == -1) {
                            j7 = currentTimeMillis + 43200000;
                        } else {
                            if (currentTimeMillis <= j10) {
                                if (currentTimeMillis > j11) {
                                    j12 = j10;
                                } else {
                                    j12 = j11;
                                }
                            }
                            j7 = j12 + 60000;
                        }
                        j8.f12124a = z;
                        j8.f12125b = j7;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i9 = Calendar.getInstance().get(11);
                        if (i9 < 6 || i9 >= 22) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    return 2;
                }
                return 1;
        }
    }

    public final void g() {
        switch (this.f12242W) {
            case 0:
                this.f12243X.m(true, true);
                return;
            default:
                this.f12243X.m(true, true);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x(C1000A a8, Context context) {
        super(a8);
        this.f12243X = a8;
        this.f12244Y = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
