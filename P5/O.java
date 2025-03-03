package P5;

import Q.h;
import U.d;
import U.p;
import Z1.c;
import a1.C0410a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import d4.k;
import de.ozerov.fully.C0808y2;
import de.ozerov.fully.CloudService;
import de.ozerov.fully.L3;
import de.ozerov.fully.P;
import de.ozerov.fully.S;
import de.ozerov.fully.W;
import de.ozerov.fully.X;
import de.ozerov.fully.Y;
import java.util.HashMap;
import java.util.TimerTask;
import n2.a;
import org.json.JSONObject;

public final class O extends TimerTask {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3851U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f3852V;

    public /* synthetic */ O(int i, Object obj) {
        this.f3851U = i;
        this.f3852V = obj;
    }

    public final void run() {
        long j7;
        Location location;
        int i;
        switch (this.f3851U) {
            case 0:
                Handler handler = ((P) this.f3852V).f3868k;
                if (handler != null) {
                    handler.post(new C0143f(29, this));
                    return;
                }
                return;
            case 1:
                d dVar = (d) this.f3852V;
                ((k) dVar.f5258W).S2(((c) ((k) dVar.f5258W).f9767W).q("hourCounter", 0) + 1, "hourCounter");
                return;
            case 2:
                CloudService cloudService = (CloudService) this.f3852V;
                if (!h.f4003X) {
                    c cVar = (c) cloudService.f9836V.f9767W;
                    cVar.getClass();
                    try {
                        j7 = ((SharedPreferences) cVar.f6955V).getLong("firstPingTime", 0);
                    } catch (Exception unused) {
                        j7 = 0;
                    }
                    if (j7 == 0) {
                        cloudService.f9836V.U2("firstPingTime", System.currentTimeMillis());
                    }
                } else {
                    String str = CloudService.f9835j0;
                    cloudService.getClass();
                }
                String i8 = P.i(cloudService);
                JSONObject j8 = P.j(cloudService);
                Bundle bundle = cloudService.f9846f0;
                if (bundle != null) {
                    a.b(j8, bundle);
                }
                if (!((c) cloudService.f9836V.f9767W).n("cloudServiceLocation", true)) {
                    j8.remove("altitude");
                    j8.remove("longitude");
                    j8.remove("latitude");
                    j8.remove("locationProvider");
                }
                try {
                    j8.put("pingInterval", cloudService.f9842b0);
                    j8.put("movementDetection", cloudService.f9836V.y1());
                    j8.put("customVariable", a.a(256, ((c) cloudService.f9836V.f9767W).r("customVariable", "")));
                    cloudService.f9839Y = System.currentTimeMillis();
                    HashMap hashMap = new HashMap(4);
                    hashMap.put("appid", "56");
                    hashMap.put("devid", i8);
                    hashMap.put("message", j8.toString().replace("\\/", "/"));
                    hashMap.put("log", cloudService.a().toString().replace("\\/", "/"));
                    hashMap.put("pass", a.j0(cloudService.f9836V.K1() + i8));
                    String l8 = C0808y2.l(((c) cloudService.f9836V.f9767W).r("remotingServerHost", "https://remoting2.fully-kiosk.com") + "/api/ping2.php", hashMap, cloudService.f9843c0, cloudService.f9843c0, 1);
                    if (l8 != null) {
                        CloudService.f9835j0 = "OK " + l8 + " at " + a.I();
                        String[] split = l8.split(":");
                        if (split.length >= 3) {
                            int parseInt = Integer.parseInt(split[0]);
                            long parseLong = Long.parseLong(split[1]);
                            cloudService.f9843c0 = Integer.parseInt(split[2]);
                            if (parseLong != cloudService.f9842b0) {
                                cloudService.f(parseLong);
                            }
                            cloudService.f9836V.U2("lastFullyLogTransmittedId", cloudService.f9847g0);
                            if (parseInt > 0) {
                                cloudService.c(0);
                                return;
                            }
                            return;
                        }
                        cloudService.f(CloudService.f9834i0);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    Log.e("CloudService", "Error making ping: " + e.getMessage());
                    CloudService.f9835j0 = "NOK due to " + e.getMessage() + " at " + a.I();
                    cloudService.f(CloudService.f9834i0);
                    return;
                }
            case 3:
                ((S) this.f3852V).f10068c.runOnUiThread(new p(19, (Object) this));
                return;
            case 4:
                X x8 = (X) this.f3852V;
                Location location2 = null;
                try {
                    ((LocationManager) x8.f10493d).removeUpdates((W) x8.f10495g);
                    ((LocationManager) x8.f10493d).removeUpdates((W) x8.f10496h);
                    if (x8.f10490a) {
                        location = ((LocationManager) x8.f10493d).getLastKnownLocation("gps");
                    } else {
                        location = null;
                    }
                    try {
                        if (x8.f10491b) {
                            location2 = ((LocationManager) x8.f10493d).getLastKnownLocation("network");
                        }
                    } catch (SecurityException e8) {
                        e = e8;
                        e.printStackTrace();
                        x8.f10494f = location;
                        x8.f10494f = location2;
                        ((C0410a) x8.e).getClass();
                        Y.f10506b = (Location) x8.f10494f;
                        return;
                    }
                } catch (SecurityException e9) {
                    e = e9;
                    location = null;
                    e.printStackTrace();
                    x8.f10494f = location;
                    x8.f10494f = location2;
                    ((C0410a) x8.e).getClass();
                    Y.f10506b = (Location) x8.f10494f;
                    return;
                }
                if (location != null && X.a(x8, location, (Location) x8.f10494f)) {
                    x8.f10494f = location;
                }
                if (location2 != null && X.a(x8, location2, (Location) x8.f10494f)) {
                    x8.f10494f = location2;
                }
                ((C0410a) x8.e).getClass();
                Y.f10506b = (Location) x8.f10494f;
                return;
            default:
                MediaRecorder mediaRecorder = ((L3) this.f3852V).f10079b;
                if (mediaRecorder != null) {
                    try {
                        i = mediaRecorder.getMaxAmplitude();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        i = -1;
                    }
                } else {
                    i = -2;
                }
                int i9 = ((L3) this.f3852V).e;
                if (i <= ((L3) this.f3852V).e) {
                    return;
                }
                if (L3.f10076f == 0 || System.currentTimeMillis() >= L3.f10076f + 1000) {
                    L3.f10076f = System.currentTimeMillis();
                    try {
                        Intent intent = new Intent("com.fullykiosk.singleapp.action.motion_detected");
                        intent.putExtra("type", "acoustic");
                        L0.c.a(((L3) this.f3852V).f10078a).c(intent);
                        return;
                    } catch (Exception unused2) {
                        Log.w("L3", "Failed broadcasting acoustic motion intent");
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
