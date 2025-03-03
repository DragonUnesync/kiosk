package O5;

import U.p;
import Z1.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import com.samsung.android.knox.license.EnterpriseLicenseManager;
import com.samsung.android.knox.license.KnoxEnterpriseLicenseManager;
import d4.k;
import de.ozerov.fully.C0663a0;
import de.ozerov.fully.C0686e;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.MyApplication;
import de.ozerov.fully.U0;
import de.ozerov.fully.Z0;
import java.util.HashMap;
import n2.a;
import org.json.JSONObject;

public final class d extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3668a;

    /* renamed from: b  reason: collision with root package name */
    public final FullyActivity f3669b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3670c;

    public d(FullyActivity fullyActivity, int i) {
        this.f3668a = i;
        switch (i) {
            case 1:
                this.f3669b = fullyActivity;
                return;
            default:
                this.f3669b = fullyActivity;
                this.f3670c = Boolean.valueOf(C0794w0.e0(fullyActivity));
                return;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        String str2;
        Context context2 = context;
        Intent intent2 = intent;
        FullyActivity fullyActivity = this.f3669b;
        switch (this.f3668a) {
            case 0:
                if (intent2 != null && intent.getAction() != null && intent.getExtras() != null && ((Boolean) this.f3670c) != null) {
                    String action = intent.getAction();
                    MyApplication myApplication = (MyApplication) context.getApplicationContext();
                    k kVar = new k((Context) myApplication, 1);
                    intent.toString();
                    if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        if (!((Boolean) this.f3670c).booleanValue() && C0794w0.e0(myApplication)) {
                            this.f3670c = Boolean.TRUE;
                            fullyActivity.f9917F0.s(true);
                            c cVar = (c) kVar.f9767W;
                            if (cVar.n("reloadOnWifiOn", false)) {
                                a.b1(myApplication, "Network connected");
                                fullyActivity.f9951n1.a();
                            }
                            cVar.n("rewindOnWifiOn", false);
                            fullyActivity.f9924M0.i(false, false);
                            U0.e("networkReconnect", (HashMap) null);
                            fullyActivity.f9935X0.b0("networkReconnect", (JSONObject) null);
                            if (C0794w0.f11017a && C0794w0.f11018b != null) {
                                C0794w0.a();
                                C0794w0.f11018b.f11059h++;
                            }
                            fullyActivity.f9960y1.e(false, true);
                        }
                        if (((Boolean) this.f3670c).booleanValue() && !C0794w0.e0(myApplication)) {
                            this.f3670c = Boolean.FALSE;
                            fullyActivity.f9917F0.s(false);
                            U0.e("networkDisconnect", (HashMap) null);
                            fullyActivity.f9935X0.b0("networkDisconnect", (JSONObject) null);
                            a.b1(myApplication, "Network connection lost");
                        }
                        AsyncTask.execute(new C0663a0(0));
                        fullyActivity.f9923L0.d();
                        fullyActivity.f9916E0.d();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (intent2 == null) {
                    a.b1(context2, context.getResources().getString(2131951784));
                    return;
                }
                Log.d("d", "onReceive " + a.o0(intent));
                String action2 = intent.getAction();
                if (action2 == null) {
                    a.b1(context2, context.getResources().getString(2131951785));
                    return;
                } else if (action2.equals(KnoxEnterpriseLicenseManager.ACTION_LICENSE_STATUS) || action2.equals("edm.intent.action.knox_license.status")) {
                    int intExtra = intent2.getIntExtra("edm.intent.extra.knox_license.errorcode", -1);
                    if (intExtra == -1) {
                        intExtra = intent2.getIntExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_ERROR_CODE, -1);
                    }
                    if (intExtra == 0) {
                        Log.d("d", context2.getString(2131951959));
                        if (Z0.d() >= 22) {
                            Z0.f10525a = true;
                            p pVar = (p) this.f3670c;
                            if (pVar != null) {
                                pVar.run();
                            }
                        }
                    } else {
                        if (intExtra == 101) {
                            str = context.getResources().getString(2131951709);
                        } else if (intExtra == 102) {
                            str = context.getResources().getString(2131951711);
                        } else if (intExtra == 201) {
                            str = context.getResources().getString(2131951704);
                        } else if (intExtra == 301) {
                            str = context.getResources().getString(2131951701);
                        } else if (intExtra == 401) {
                            str = context.getResources().getString(2131951702);
                        } else if (intExtra == 601) {
                            str = context.getResources().getString(2131951712);
                        } else if (intExtra == 501) {
                            str = context.getResources().getString(2131951706);
                        } else if (intExtra != 502) {
                            switch (intExtra) {
                                case 203:
                                    str = context.getResources().getString(2131951705);
                                    break;
                                case 204:
                                    str = context.getResources().getString(2131951703);
                                    break;
                                case 205:
                                    str = context.getResources().getString(2131951708);
                                    break;
                                default:
                                    str = context.getResources().getString(2131951700, new Object[]{Integer.toString(intExtra), intent2.getStringExtra(KnoxEnterpriseLicenseManager.EXTRA_LICENSE_STATUS)});
                                    break;
                            }
                        } else {
                            str = context.getResources().getString(2131951707);
                        }
                        a.b1(context2, str);
                        Log.w("d", str);
                    }
                    if (Z0.d() < 22) {
                        Log.d("Z0", "activateEmlLicense");
                        new C0686e(4, fullyActivity).execute(new Void[0]);
                        return;
                    }
                    return;
                } else if (action2.equals(EnterpriseLicenseManager.ACTION_LICENSE_STATUS) || action2.equals("edm.intent.action.license.status")) {
                    int intExtra2 = intent2.getIntExtra("edm.intent.extra.license.errorcode", -1);
                    if (intExtra2 == -1) {
                        intExtra2 = intent2.getIntExtra(EnterpriseLicenseManager.EXTRA_LICENSE_ERROR_CODE, -1);
                    }
                    if (intExtra2 == 0) {
                        Log.d("d", context2.getString(2131951682));
                        Z0.f10525a = true;
                        p pVar2 = (p) this.f3670c;
                        if (pVar2 != null) {
                            pVar2.run();
                            return;
                        }
                        return;
                    }
                    if (intExtra2 == 101) {
                        str2 = context.getResources().getString(2131951695);
                    } else if (intExtra2 == 102) {
                        str2 = context.getResources().getString(2131951697);
                    } else if (intExtra2 == 201) {
                        str2 = context.getResources().getString(2131951690);
                    } else if (intExtra2 == 301) {
                        str2 = context.getResources().getString(2131951687);
                    } else if (intExtra2 == 401) {
                        str2 = context.getResources().getString(2131951688);
                    } else if (intExtra2 == 601) {
                        str2 = context.getResources().getString(2131951698);
                    } else if (intExtra2 == 501) {
                        str2 = context.getResources().getString(2131951692);
                    } else if (intExtra2 != 502) {
                        switch (intExtra2) {
                            case 203:
                                str2 = context.getResources().getString(2131951691);
                                break;
                            case 204:
                                str2 = context.getResources().getString(2131951689);
                                break;
                            case 205:
                                str2 = context.getResources().getString(2131951694);
                                break;
                            case 206:
                                str2 = context.getResources().getString(2131951696);
                                break;
                            case 207:
                                str2 = context.getResources().getString(2131951699);
                                break;
                            default:
                                String stringExtra = intent2.getStringExtra("edm.intent.extra.license.status");
                                if (stringExtra == null) {
                                    stringExtra = intent2.getStringExtra(EnterpriseLicenseManager.EXTRA_LICENSE_STATUS);
                                }
                                str2 = context.getResources().getString(2131951686, new Object[]{Integer.toString(intExtra2), stringExtra});
                                break;
                        }
                    } else {
                        str2 = context.getResources().getString(2131951693);
                    }
                    a.b1(context2, str2);
                    Log.i("d", str2);
                    return;
                } else {
                    return;
                }
        }
    }
}
