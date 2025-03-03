package O5;

import L0.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.util.Log;
import d4.k;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.U0;
import java.util.HashMap;
import n2.a;
import org.json.JSONObject;

public final class g extends BroadcastReceiver {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f3676b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f3677c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public static int f3678d = -1;

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f3679a;

    public g(FullyActivity fullyActivity) {
        this.f3679a = fullyActivity;
    }

    public static void a(Context context, int i, int i8, int i9) {
        try {
            ((AudioManager) context.getSystemService("audio")).setStreamVolume(i, i9, 8);
            Log.i("g", "Revert from volume = " + i8 + " to " + i9 + " on stream " + i);
        } catch (Exception e) {
            Q0.g.z(e, new StringBuilder("Could not revert volume due to "), "g");
        }
    }

    public static void b(int i, int i8) {
        Log.i("g", "Allowed volume level set to " + i8 + " for stream " + i);
        f3676b.put(Integer.valueOf(i), Integer.valueOf(i8));
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        Integer num;
        Integer num2;
        int i8;
        if (intent != null && intent.getAction() != null) {
            FullyActivity fullyActivity = this.f3679a;
            k kVar = new k((Context) fullyActivity, 1);
            AudioManager audioManager = (AudioManager) fullyActivity.getSystemService("audio");
            if ("android.intent.action.HEADSET_PLUG".equals(intent.getAction())) {
                try {
                    int intExtra = intent.getIntExtra("state", -1);
                    if (intExtra == 1) {
                        c.a(fullyActivity).c(new Intent("com.fullykiosk.singleapp.event.headphones_plug"));
                        U0.e("headphonesPlugged", (HashMap) null);
                        fullyActivity.f9935X0.b0("headphonesPlugged", (JSONObject) null);
                    } else if (intExtra == 0) {
                        c.a(fullyActivity).c(new Intent("com.fullykiosk.singleapp.event.headphones_unplug"));
                        U0.e("headphonesUnplugged", (HashMap) null);
                        fullyActivity.f9935X0.b0("headphonesUnplugged", (JSONObject) null);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            if ("android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction())) {
                try {
                    int intExtra2 = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
                    int intExtra3 = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", -1);
                    int intExtra4 = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1);
                    if (intExtra2 != -1 && intExtra3 != -1 && intExtra4 != -1) {
                        HashMap hashMap = f3677c;
                        if (!hashMap.containsKey(Integer.valueOf(intExtra4))) {
                            Log.i("g", "Start volume level set to " + intExtra3 + " for stream " + intExtra4);
                            hashMap.put(Integer.valueOf(intExtra4), Integer.valueOf(intExtra3));
                        }
                        if (!kVar.z2().isEmpty()) {
                            try {
                                int parseInt = Integer.parseInt(kVar.z2());
                                int streamMaxVolume = audioManager.getStreamMaxVolume(intExtra4);
                                if (a.C0()) {
                                    i8 = audioManager.getStreamMinVolume(intExtra4);
                                } else {
                                    i8 = 0;
                                }
                                i = (((streamMaxVolume - i8) * parseInt) / 100) + i8;
                                if (intExtra2 > i) {
                                    try {
                                        a(fullyActivity, intExtra4, intExtra2, i);
                                    } catch (Exception unused) {
                                    }
                                }
                            } catch (Exception unused2) {
                                i = -1;
                                Log.w("g", "Can't understand volume limits: " + kVar.z2());
                                num = (Integer) f3676b.get(Integer.valueOf(intExtra4));
                                num2 = (Integer) hashMap.get(Integer.valueOf(intExtra4));
                                if (!(num != null || intExtra2 != num.intValue())) {
                                }
                                a(fullyActivity, intExtra4, intExtra2, num2.intValue());
                                if (kVar.G().booleanValue() && f3678d == -1) {
                                    return;
                                }
                                return;
                            }
                        } else {
                            i = -1;
                        }
                        num = (Integer) f3676b.get(Integer.valueOf(intExtra4));
                        num2 = (Integer) hashMap.get(Integer.valueOf(intExtra4));
                        if (kVar.c0().booleanValue() && fullyActivity.f9921J0.i() && kVar.G().booleanValue()) {
                            if (num != null && intExtra2 != num.intValue() && (num.intValue() < i || i == -1)) {
                                a(fullyActivity, intExtra4, intExtra2, num.intValue());
                            } else if (num == null && num2 != null && intExtra2 != num2.intValue() && (num2.intValue() < i || i == -1)) {
                                a(fullyActivity, intExtra4, intExtra2, num2.intValue());
                            }
                        }
                        if (kVar.G().booleanValue() && f3678d == -1 && num2 != null && intExtra2 != num2.intValue() && intExtra4 == f3678d) {
                            a(fullyActivity, intExtra4, intExtra2, num2.intValue());
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
    }
}
