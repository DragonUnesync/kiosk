package de.ozerov.fully;

import B3.m;
import C3.C0025a;
import D.O;
import P5.P;
import Q0.g;
import Q5.d;
import Z1.c;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.text.Html;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import d4.k;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import n2.a;
import z0.C1643e;

/* renamed from: de.ozerov.fully.f2  reason: case insensitive filesystem */
public class C0695f2 extends PreferenceFragment implements Preference.OnPreferenceChangeListener {

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ int f10625d0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public k f10626U;

    /* renamed from: V  reason: collision with root package name */
    public FullyActivity f10627V;

    /* renamed from: W  reason: collision with root package name */
    public Toolbar f10628W;

    /* renamed from: X  reason: collision with root package name */
    public LinearLayout f10629X;

    /* renamed from: Y  reason: collision with root package name */
    public C1643e f10630Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f10631Z = true;

    /* renamed from: a0  reason: collision with root package name */
    public Dialog f10632a0;

    /* renamed from: b0  reason: collision with root package name */
    public Dialog f10633b0;

    /* renamed from: c0  reason: collision with root package name */
    public String f10634c0;

    public static void a(C0695f2 f2Var, int i) {
        Cursor cursor = (Cursor) f2Var.f10630Y.getItem(i);
        if (cursor != null && cursor.getCount() > 0 && !cursor.isAfterLast()) {
            f2Var.b(cursor.getString(cursor.getColumnIndex("keyChain")));
        }
    }

    public final void b(String str) {
        Preference findPreference;
        ListView listView;
        String[] split = str.split(":");
        int i = 0;
        while (i < split.length - 2) {
            PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference(split[i]);
            int i8 = i + 1;
            Preference findPreference2 = findPreference(split[i8]);
            if (preferenceScreen != null && findPreference2 != null) {
                if (!findPreference2.isEnabled()) {
                    break;
                }
                ListAdapter rootAdapter = preferenceScreen.getRootAdapter();
                int count = rootAdapter.getCount();
                int i9 = 0;
                while (true) {
                    if (i9 >= count) {
                        break;
                    } else if (rootAdapter.getItem(i9).equals(findPreference2)) {
                        findPreference2.getKey();
                        preferenceScreen.getClass().toString();
                        preferenceScreen.onItemClick((AdapterView) null, (View) null, i9, 0);
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            i = i8;
        }
        if (i < split.length - 1 && (findPreference = findPreference(split[i + 1])) != null) {
            Dialog dialog = this.f10632a0;
            if (dialog != null && dialog.isShowing()) {
                listView = (ListView) this.f10632a0.findViewById(16908298);
            } else if (getView() != null) {
                listView = (ListView) getView().findViewById(16908298);
            } else {
                listView = null;
            }
            if (listView != null) {
                for (int i10 = 0; i10 < listView.getAdapter().getCount(); i10++) {
                    if (listView.getAdapter().getItem(i10) == findPreference) {
                        if (i10 > 2) {
                            listView.setSelection(i10 - 2);
                        }
                        listView.postDelayed(new C0769s(i10, listView, 1), 500);
                    }
                }
            }
        }
    }

    public final boolean c(Preference preference, Object obj, boolean z) {
        String str;
        Preference findPreference;
        Preference findPreference2;
        Preference preference2 = preference;
        String g8 = this.f10627V.f9932U0.g(preference.getKey());
        if (g8 == null) {
            g8 = "???";
        }
        if (preference.getKey().equals("singleAppMode")) {
            Preference findPreference3 = findPreference("kioskExitGesture");
            if (findPreference3 != null) {
                findPreference3.setEnabled(!obj.toString().equals("true"));
            }
            if (obj.toString().equals("true")) {
                findPreference3.setSummary("Always " + this.f10626U.m2() + " fast taps in Single App mode");
            } else {
                findPreference3.setSummary(this.f10627V.f9932U0.g(findPreference3.getKey()));
            }
        }
        if (preference.getKey().equals("motionDetection") || preference.getKey().equals("motionDetectionAcoustic")) {
            boolean equals = obj.toString().equals("true");
            boolean z6 = !preference.getKey().equals("motionDetection") ? equals || this.f10626U.s1().booleanValue() : equals || this.f10626U.t1().booleanValue();
            Preference findPreference4 = findPreference("screenOnOnMotion");
            if (findPreference4 != null) {
                findPreference4.setEnabled(z6);
            }
            Preference findPreference5 = findPreference("stopScreensaverOnMotion");
            if (findPreference5 != null) {
                findPreference5.setEnabled(z6);
            }
            Preference findPreference6 = findPreference("stopIdleReloadOnMotion");
            if (findPreference6 != null) {
                findPreference6.setEnabled(z6);
            }
        }
        if (preference.getKey().equals("screensaverDaydream") || preference.getKey().equals("screensaverOtherApp")) {
            boolean equals2 = obj.toString().equals("true");
            boolean z8 = !preference.getKey().equals("screensaverDaydream") ? !(equals2 || ((c) this.f10626U.f9767W).n("screensaverDaydream", false)) : !(equals2 || this.f10626U.T1().booleanValue());
            Preference findPreference7 = findPreference("screensaverPlaylist");
            if (findPreference7 != null) {
                findPreference7.setEnabled(z8);
            }
            Preference findPreference8 = findPreference("showScreensaverPlaylistSelector");
            if (findPreference8 != null) {
                findPreference8.setEnabled(z8);
            }
            Preference findPreference9 = findPreference("screensaverWallpaperURL");
            if (findPreference9 != null) {
                findPreference9.setEnabled(z8);
            }
            Preference findPreference10 = findPreference("screensaverBrightness");
            if (findPreference10 != null) {
                findPreference10.setEnabled(z8);
            }
            Preference findPreference11 = findPreference("screensaverFullscreen");
            if (findPreference11 != null) {
                findPreference11.setEnabled(z8);
            }
            Preference findPreference12 = findPreference("fadeInOutDuration");
            if (findPreference12 != null) {
                findPreference12.setEnabled(z8);
            }
            Preference findPreference13 = findPreference("playerCacheImages");
            if (findPreference13 != null) {
                findPreference13.setEnabled(z8);
            }
            Preference findPreference14 = findPreference("imageScaleType");
            if (findPreference14 != null) {
                findPreference14.setEnabled(z8);
            }
            Preference findPreference15 = findPreference("ignoreMotionWhenScreensaverOnOff");
            if (findPreference15 != null) {
                findPreference15.setEnabled(z8);
            }
        }
        if (preference.getKey().equals("screensaverDaydream")) {
            boolean z9 = !obj.toString().equals("true");
            Preference findPreference16 = findPreference("screensaverOtherApp");
            if (findPreference16 != null) {
                findPreference16.setEnabled(z9);
            }
        }
        if (preference.getKey().equals("screensaverOtherApp") && !a.E0()) {
            boolean z10 = !obj.toString().equals("true");
            Preference findPreference17 = findPreference("screensaverDaydream");
            if (findPreference17 != null) {
                findPreference17.setEnabled(z10);
            }
        }
        if (preference.getKey().equals("userAgent") && (findPreference2 = findPreference("customUserAgent")) != null) {
            findPreference2.setEnabled(obj.toString().equals("custom"));
        }
        if (preference.getKey().equals("kioskWifiPinAction") && (findPreference = findPreference("kioskWifiPinCustomIntent")) != null) {
            findPreference.setEnabled(obj.toString().equals("100"));
        }
        if (preference.getKey().equals("kioskMode") && obj.toString().equals("true") && z && a.r0() && !MyAccessibilityService.a() && ((!this.f10626U.c1().booleanValue() || !this.f10626U.R0().booleanValue()) && (!C0794w0.Z(this.f10627V) || (!this.f10626U.m1().booleanValue() && !this.f10626U.n1().booleanValue())))) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f10627V);
            builder.setTitle("Attention!");
            builder.setMessage(Html.fromHtml("Kiosk Mode protection can have some gaps with Android 12+. Fully can't prevent pulling the status bar and opening system dialogs. <a href='https://www.fully-kiosk.com/en/#faq-android12'>Check FAQ</a> for solutions!"));
            builder.setCancelable(false);
            builder.setPositiveButton("Got it", new V(7));
            builder.setNegativeButton(17039360, new X1(preference2, 1));
            AlertDialog create = builder.create();
            a.Z0(create);
            Button button = create.getButton(-1);
            Handler handler = new Handler();
            CharSequence text = button.getText();
            button.setEnabled(false);
            handler.post(new d(3, create, button, text, handler));
            ((TextView) create.findViewById(16908299)).setMovementMethod(LinkMovementMethod.getInstance());
            return true;
        } else if (preference.getKey().equals("remoteAdminSingleAppExit") && obj.toString().equals("true") && z) {
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this.f10627V);
            builder2.setTitle("Attention!");
            builder2.setMessage("You are going to make the Single App Kiosk Mode EXIT BY 7 FAST TAPS IMPOSSIBLE. In this mode you can only exit the Single App from Remote Admin. Check the Remote Admin before enabling this mode!");
            builder2.setCancelable(false);
            builder2.setPositiveButton("Got it", new V(6));
            builder2.setNegativeButton(17039360, new X1(preference2, 5));
            a.Z0(builder2.create());
            return true;
        } else if (preference.getKey().equals("singleAppMode") && obj.toString().equals("true") && z) {
            AlertDialog.Builder builder3 = new AlertDialog.Builder(this.f10627V);
            builder3.setTitle("Attention!");
            builder3.setMessage("You are going to enable the Single App Kiosk Mode. In this mode your device will be locked down to the selected app. \n\nIMPORTANT: Regardless to your selected Kiosk Exit Gesture you have to TAP " + this.f10626U.m2() + " TIMES VERY FAST anywhere on the screen to show the Kiosk PIN dialog!");
            builder3.setCancelable(false);
            builder3.setPositiveButton("Got it", new V(8));
            builder3.setNegativeButton(17039360, new X1(preference2, 6));
            a.Z0(builder3.create());
            return true;
        } else if (!preference.getKey().equals("forceImmersive") || !obj.toString().equals("true") || !z) {
            String str2 = "";
            if (preference.getKey().equals("lockSafeMode") && obj.toString().equals("true") && z) {
                AlertDialog.Builder builder4 = new AlertDialog.Builder(this.f10627V);
                builder4.setTitle("Attention!");
                if (a.z0()) {
                    str2 = " In Android 7+ your PIN/Pattern will stay unchanged.";
                }
                builder4.setMessage("You are going to enable the Android Safe Mode lock. For this purpose Fully will setup a lock screen protection with your Kiosk PIN. This PIN protection persists even if you disable the Kiosk Mode. You can change it in Android Security settings later.".concat(str2));
                builder4.setCancelable(false);
                builder4.setPositiveButton("Got it", new V(10));
                builder4.setNegativeButton(17039360, new X1(preference2, 8));
                a.Z0(builder4.create());
                return true;
            } else if (preference.getKey().equals("knoxEnabled") && obj.toString().equals("true") && z) {
                AlertDialog.Builder builder5 = new AlertDialog.Builder(this.f10627V);
                builder5.setTitle("Attention!");
                builder5.setMessage("You are going to use the KNOX features of your Samsung device. KNOX features are designed for business customers. KNOX settings take effect even when Fully app is not started. There is a good chance to brick your device if you disable the wifi connection, the safe mode, the back button, the power button, the volume buttons. Internet connection is required for Samsung KNOX license activation. KNOX licensing can fail on some devices.");
                builder5.setCancelable(false);
                builder5.setPositiveButton("Got it", new V(11));
                builder5.setNegativeButton(17039360, new X1(preference2, 9));
                a.Z0(builder5.create());
                return true;
            } else if (preference.getKey().equals("knoxDisableBackButton") && obj.toString().equals("true") && z) {
                AlertDialog.Builder builder6 = new AlertDialog.Builder(this.f10627V);
                builder6.setTitle("Attention!");
                builder6.setMessage("You are going to disable the BACK button globally. This WILL impact the device operability. This will likely BRICK your device. Are you sure?");
                builder6.setCancelable(false);
                builder6.setPositiveButton("Got it", new V(12));
                builder6.setNegativeButton(17039360, new X1(preference2, 10));
                a.Z0(builder6.create());
                return true;
            } else if (preference.getKey().equals("knoxDisableWiFi") && obj.toString().equals("true") && z) {
                AlertDialog.Builder builder7 = new AlertDialog.Builder(this.f10627V);
                builder7.setTitle("Attention!");
                builder7.setMessage("You are going to disable the Wifi globally. This can impact the device operability and can brick your device. Are you sure?");
                builder7.setCancelable(false);
                builder7.setPositiveButton("Got it", new V(15));
                builder7.setNegativeButton(17039360, new X1(preference2, 11));
                a.Z0(builder7.create());
                return true;
            } else if (preference.getKey().equals("knoxDisableSafeMode") && obj.toString().equals("true") && z) {
                AlertDialog.Builder builder8 = new AlertDialog.Builder(this.f10627V);
                builder8.setTitle("Attention!");
                builder8.setMessage("You are going to disable the safe mode. This will impact the device operability and can brick your device. Are you sure?");
                builder8.setCancelable(false);
                builder8.setPositiveButton("Got it", new V(16));
                builder8.setNegativeButton(17039360, new X1(preference2, 12));
                a.Z0(builder8.create());
                return true;
            } else if (preference.getKey().equals("knoxDisablePowerButton") && obj.toString().equals("true") && z) {
                AlertDialog.Builder builder9 = new AlertDialog.Builder(this.f10627V);
                builder9.setTitle("Attention!");
                builder9.setMessage("You are going to disable the power button globally. This can impact the device operability and can brick your device. Are you sure?");
                builder9.setCancelable(false);
                builder9.setPositiveButton("Got it", new V(2));
                builder9.setNegativeButton(17039360, new X1(preference2, 0));
                a.Z0(builder9.create());
                return true;
            } else if (preference.getKey().equals("knoxDisableVolumeButtons") && obj.toString().equals("true") && z) {
                AlertDialog.Builder builder10 = new AlertDialog.Builder(this.f10627V);
                builder10.setTitle("Attention!");
                builder10.setMessage("You are going to disable the volume buttons globally. This can impact the device operability and can brick your device. Are you sure?");
                builder10.setCancelable(false);
                builder10.setPositiveButton("Got it", new V(3));
                builder10.setNegativeButton(17039360, new X1(preference2, 2));
                a.Z0(builder10.create());
                return true;
            } else if (preference.getKey().equals("forceSleepIfUnplugged") && obj.toString().equals("true") && z) {
                AlertDialog.Builder builder11 = new AlertDialog.Builder(this.f10627V);
                builder11.setTitle("Attention!");
                builder11.setMessage("If you enable this option your device will be not operational until you plug in the power cord.");
                builder11.setCancelable(false);
                builder11.setPositiveButton("Got it", new V(4));
                builder11.setNegativeButton(17039360, new X1(preference2, 3));
                a.Z0(builder11.create());
                return true;
            } else if (preference.getKey().equals("cloudService") && obj.toString().equals("true") && z) {
                AlertDialog.Builder builder12 = new AlertDialog.Builder(this.f10627V);
                builder12.setTitle("Privacy Notice");
                builder12.setMessage("Your device information including personal data like IP address and geolocation will be sent to and saved on " + ((c) this.f10626U.f9767W).r("cloudName", "Fully Cloud") + " servers. User's activity can be observed from " + ((c) this.f10626U.f9767W).r("cloudName", "Fully Cloud") + " account. Advise your device users!");
                builder12.setCancelable(false);
                builder12.setPositiveButton("Accept", new V(5));
                builder12.setNegativeButton(17039360, new X1(preference2, 4));
                a.Z0(builder12.create());
                return true;
            } else if (preference.getKey().equals("sleepTime") || preference.getKey().equals("wakeupTime") || preference.getKey().equals("rebootTime") || preference.getKey().equals("folderCleanupTime")) {
                try {
                    if (obj.toString().trim().equals(str2)) {
                        str = g8 + getString(2131951933) + getString(2131951932);
                    } else {
                        new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(obj.toString().trim());
                        str = g8 + getString(2131951933) + obj.toString().trim();
                    }
                    preference2.setSummary(str);
                    return true;
                } catch (ParseException unused) {
                    a.b1(this.f10627V, "Please enter time in 24h format HH:MM");
                    return false;
                }
            } else if (preference.getKey().equals("fadeInOutDuration")) {
                try {
                    int parseInt = Integer.parseInt(obj.toString().trim());
                    if (parseInt >= 0) {
                        if (parseInt == 0) {
                            preference2.setSummary(g8 + getString(2131951933) + "no fading");
                        } else if (parseInt > 0) {
                            preference2.setSummary(g8 + getString(2131951933) + parseInt + "ms");
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                } catch (Exception unused2) {
                    a.b1(this.f10627V, "Please enter an integer duration or zero for default");
                    return false;
                }
            } else if (preference.getKey().equals("initialScale")) {
                try {
                    int parseInt2 = Integer.parseInt(obj.toString().trim());
                    if (parseInt2 >= 0) {
                        if (parseInt2 == 0) {
                            preference2.setSummary(g8 + getString(2131951933) + getString(2131951931));
                        } else if (parseInt2 > 0) {
                            preference2.setSummary(g8 + getString(2131951933) + parseInt2 + "%");
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                } catch (Exception unused3) {
                    a.b1(this.f10627V, "Please enter an integer percent value or zero for default");
                    return false;
                }
            } else if (preference.getKey().equals("appLauncherScaling")) {
                try {
                    int parseInt3 = Integer.parseInt(obj.toString().trim());
                    if (parseInt3 >= 0) {
                        if (parseInt3 == 0) {
                            preference2.setSummary(g8 + getString(2131951933) + getString(2131951931));
                        } else if (parseInt3 > 0) {
                            preference2.setSummary(g8 + getString(2131951933) + parseInt3 + "%");
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                } catch (Exception unused4) {
                    a.b1(this.f10627V, "Please enter an integer percent value or zero for default");
                    return false;
                }
            } else if (preference.getKey().equals("fontSize") || preference.getKey().equals("actionBarSize")) {
                try {
                    int parseInt4 = Integer.parseInt(obj.toString().trim());
                    if (parseInt4 >= 0) {
                        preference2.setSummary(g8 + getString(2131951933) + parseInt4 + "%");
                        return true;
                    }
                    throw new IllegalArgumentException();
                } catch (Exception unused5) {
                    a.b1(this.f10627V, "Please enter an integer percent value");
                    return false;
                }
            } else if (preference.getKey().equals("errorUrlOnDisconnection") || preference.getKey().equals("reloadPageFailure")) {
                try {
                    int parseInt5 = Integer.parseInt(obj.toString().trim());
                    if (parseInt5 >= 0) {
                        preference2.setSummary(g8 + getString(2131951933) + parseInt5);
                        return true;
                    }
                    throw new IllegalArgumentException();
                } catch (Exception unused6) {
                    a.a1(1, this.f10627V, "Please enter an integer number of seconds or zero for disable");
                    return false;
                }
            } else if (preference.getKey().equals("reloadEachSeconds") || preference.getKey().equals("rewindEachSeconds")) {
                try {
                    int parseInt6 = Integer.parseInt(obj.toString().trim());
                    if (parseInt6 >= 0) {
                        preference2.setSummary(g8 + getString(2131951933) + parseInt6);
                        if (parseInt6 > 0 && parseInt6 < 10) {
                            a.a1(1, this.f10627V, "Less than 10 seconds may make your device inoperable");
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                } catch (Exception unused7) {
                    a.a1(1, this.f10627V, "Enter a number of seconds or zero for disable");
                    return false;
                }
            } else if (preference.getKey().equals("screenBrightness") || preference.getKey().equals("screensaverBrightness")) {
                if (obj.toString().trim().equals(str2) || obj.toString().equals("-1")) {
                    StringBuilder r8 = g.r(g8);
                    r8.append(getString(2131951933));
                    r8.append("default");
                    preference2.setSummary(r8.toString());
                    return true;
                }
                try {
                    int parseInt7 = Integer.parseInt(obj.toString().trim());
                    if (parseInt7 < 0 || parseInt7 > C0794w0.I(this.f10627V)) {
                        throw new IllegalArgumentException();
                    }
                    preference2.setSummary(g8 + getString(2131951933) + parseInt7);
                    return true;
                } catch (Exception unused8) {
                    a.a1(1, this.f10627V, "Enter a number 0-" + C0794w0.I(this.f10627V) + " for brightness or empty for default");
                    return false;
                }
            } else if (preference.getKey().equals("rotateWebview")) {
                if (obj.toString().trim().equals(str2) || obj.toString().equals("-1")) {
                    StringBuilder r9 = g.r(g8);
                    r9.append(getString(2131951933));
                    r9.append("default");
                    preference2.setSummary(r9.toString());
                    return true;
                }
                try {
                    int parseInt8 = Integer.parseInt(obj.toString().trim());
                    if (parseInt8 < 0 || parseInt8 > 360) {
                        throw new IllegalArgumentException();
                    }
                    preference2.setSummary(g8 + getString(2131951933) + parseInt8);
                    return true;
                } catch (Exception unused9) {
                    a.a1(1, this.f10627V, "Enter a number 0-360 for rotation degrees or empty for default");
                    return false;
                }
            } else if (preference.getKey().equals("batteryWarning")) {
                try {
                    int parseInt9 = Integer.parseInt(obj.toString().trim());
                    if (parseInt9 >= 0) {
                        preference2.setSummary(g8 + getString(2131951933) + parseInt9 + "%");
                        return true;
                    }
                    throw new IllegalArgumentException();
                } catch (Exception unused10) {
                    a.a1(1, this.f10627V, "Please enter an integer percentage or zero for disable");
                    return false;
                }
            } else if (preference.getKey().equals("timeToClearLauncherAppData") || preference.getKey().equals("mdmTimeToClearLauncherAppData") || preference.getKey().equals("timeToShutdownOnPowerDisconnect") || preference.getKey().equals("timeToClearSingleAppData") || preference.getKey().equals("mdmTimeToClearSingleAppData") || preference.getKey().equals("timeToRegainFocus")) {
                try {
                    int parseInt10 = Integer.parseInt(obj.toString().trim());
                    if (parseInt10 >= 0) {
                        preference2.setSummary(g8 + getString(2131951933) + parseInt10);
                        return true;
                    }
                    throw new IllegalArgumentException();
                } catch (Exception unused11) {
                    a.b1(this.f10627V, "Please enter a number of seconds or zero for disable");
                    return false;
                }
            } else if (preference.getKey().equals("timeToScreenOffV2") || preference.getKey().equals("timeToScreensaverV2") || preference.getKey().equals("timeToGoBackground")) {
                try {
                    int parseInt11 = Integer.parseInt(obj.toString().trim());
                    if (parseInt11 >= 0) {
                        preference2.setSummary(g8 + getString(2131951933) + parseInt11);
                        if (parseInt11 > 0 && parseInt11 < 5) {
                            a.a1(1, this.f10627V, "Less than 5 seconds may make your device inoperable");
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                } catch (Exception unused12) {
                    a.b1(this.f10627V, "Enter a number of seconds or zero for disable");
                    return false;
                }
            } else if (preference.getKey().equals("motionSensitivity") || preference.getKey().equals("detectFacesConfidence") || preference.getKey().equals("darknessLevel") || preference.getKey().equals("motionSensitivityAcoustic")) {
                try {
                    int parseInt12 = Integer.parseInt(obj.toString().trim());
                    if (parseInt12 < 0 || parseInt12 > 100) {
                        throw new IllegalArgumentException();
                    }
                    preference2.setSummary(g8 + getString(2131951933) + parseInt12);
                    return true;
                } catch (Exception unused13) {
                    a.b1(this.f10627V, "Please enter an integer number 0-100");
                    return false;
                }
            } else if (preference.getKey().equals("accelerometerSensitivityV2")) {
                try {
                    int parseInt13 = Integer.parseInt(obj.toString().trim());
                    if (parseInt13 < 0 || parseInt13 > 100) {
                        throw new IllegalArgumentException();
                    }
                    preference2.setSummary(g8 + getString(2131951933) + parseInt13);
                    return true;
                } catch (Exception unused14) {
                    a.b1(this.f10627V, "Please enter an integer number 0-100");
                    return false;
                }
            } else if (preference.getKey().equals("movementBeaconDistance")) {
                try {
                    float parseFloat = Float.parseFloat(obj.toString().trim());
                    int i = (parseFloat > 0.0f ? 1 : (parseFloat == 0.0f ? 0 : -1));
                    if (i > 0 && parseFloat <= 100.0f) {
                        preference2.setSummary(g8 + getString(2131951933) + parseFloat);
                        return true;
                    } else if (i == 0) {
                        preference2.setSummary(g8 + getString(2131951933) + "disabled");
                        return true;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } catch (Exception unused15) {
                    a.b1(this.f10627V, "Please enter a number 0-100");
                    return false;
                }
            } else if (preference.getKey().equals("compassSensitivity")) {
                try {
                    int parseInt14 = Integer.parseInt(obj.toString().trim());
                    if (parseInt14 < 0 || parseInt14 > 100) {
                        throw new IllegalArgumentException();
                    }
                    preference2.setSummary(g8 + getString(2131951933) + parseInt14);
                    return true;
                } catch (Exception unused16) {
                    a.b1(this.f10627V, "Please enter an integer number 0-100");
                    return false;
                }
            } else if (preference.getKey().equals("motionFps")) {
                try {
                    int parseInt15 = Integer.parseInt(obj.toString().trim());
                    if (parseInt15 < 1 || parseInt15 > 25) {
                        throw new IllegalArgumentException();
                    }
                    preference2.setSummary(g8 + getString(2131951933) + parseInt15);
                    return true;
                } catch (Exception unused17) {
                    a.b1(this.f10627V, "Please enter an integer number 1-25");
                    return false;
                }
            } else if (preference.getKey().equals("startURL")) {
                String[] e12 = a.e1(obj.toString());
                for (int i8 = 0; i8 < e12.length; i8++) {
                    String a8 = P.a(e12[i8]);
                    e12[i8] = a8;
                    if (!P.I(a8)) {
                        a.b1(this.f10627V, "Wrong URL dismissed");
                        return false;
                    }
                    if (!a.M0(e12[i8], a.W(getResources().getString(2131951643)))) {
                        a.a1(1, this.f10627V, "Start URL " + e12[i8] + " not allowed, only URL like " + getResources().getString(2131951643) + " allowed");
                        return false;
                    }
                }
                if (e12.length > 1 && !((c) this.f10626U.f9767W).n("showTabs", false)) {
                    a.a1(1, this.f10627V, "For multiple Start URLs consider enabling Show Tabs\nin Toolbars and Appearance settings");
                }
                String join = TextUtils.join("\n", e12);
                preference2.setSummary(join);
                ((TextPref) preference2).setText(join);
                this.f10626U.V2("startURL", join);
                return false;
            } else if (a.d(new String[]{"mqttBrokerUrl", "errorURL", "webOverlayUrl", "actionBarIconUrl", "actionBarBgUrl", "screensaverWallpaperURL", "screensaverURL", "alarmSoundFileUrl", "searchProviderUrl", "actionBarCustomButtonUrl", "actionBarQrScanButtonUrl", "loadContentZipFileUrl", "barcodeScanTargetUrl", "newTabUrl"}, preference.getKey())) {
                String a9 = P.a(obj.toString());
                if (a9.isEmpty()) {
                    preference2.setSummary(g8);
                    return true;
                } else if (P.I(a9) || (preference.getKey().equals("barcodeScanTargetUrl") && (a9.contains("$code") || a9.contains("$rawcode")))) {
                    preference2.setSummary(a9);
                    ((TextPref) preference2).setText(a9);
                    this.f10626U.V2(preference.getKey(), a9);
                    return false;
                } else {
                    a.b1(this.f10627V, "Wrong URL dismissed");
                    return false;
                }
            } else if (a.d(new String[]{"sgProductType", "sgHost", "sgLanguage", "kioskExitGesture"}, preference.getKey())) {
                String obj2 = obj.toString();
                if (obj2.isEmpty()) {
                    preference2.setSummary(g8);
                    return true;
                } else if (preference2 instanceof ListPref) {
                    ListPref listPref = (ListPref) preference2;
                    int findIndexOfValue = listPref.findIndexOfValue(obj2);
                    CharSequence[] entries = listPref.getEntries();
                    if (findIndexOfValue >= 0) {
                        preference2.setSummary(entries[findIndexOfValue]);
                    }
                    return true;
                } else {
                    preference2.setSummary(obj2);
                    return true;
                }
            } else if (preference.getKey().equals("kioskMode")) {
                preference2.setSummary("Exit settings to apply the changed kiosk mode");
                return true;
            } else {
                if (preference.getKey().equals("volumeLicenseKey")) {
                    preference2.setSummary("Exit settings to apply the new volume key");
                }
                return true;
            }
        } else {
            AlertDialog.Builder builder13 = new AlertDialog.Builder(this.f10627V);
            builder13.setTitle("Attention!");
            builder13.setMessage("You are going to force the Fullscreen Mode for other apps. \n\nIMPORTANT: This experimental mode is NOT required for the Fully web browser and launcher. Use Toolbars and Appearance settings! \n\nVERY IMPORTANT: If this mode is activated ALL KEY INPUT including KEYBOARD and BACK KEY is OUT OF ORDER while using other apps. We can't change this.");
            builder13.setCancelable(false);
            builder13.setPositiveButton("Got it", new V(9));
            builder13.setNegativeButton(17039360, new X1(preference2, 7));
            a.Z0(builder13.create());
            return true;
        }
    }

    public final void d() {
        int i;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        this.f10627V.f9932U0.l(getPreferenceScreen());
        C0770s0.j(getPreferenceScreen(), this.f10627V.f9932U0.e, (Preference) null);
        C0770s0.j(getPreferenceScreen(), this.f10627V.f9932U0.f10943g, (Preference) null);
        C0770s0.j(getPreferenceScreen(), this.f10627V.f9932U0.f10944h, (Preference) null);
        k kVar = this.f10626U;
        e(((c) kVar.f9767W).r("startURL", (String) kVar.f9766V).trim(), "startURL");
        e(((c) this.f10626U.f9767W).r("errorURL", ""), "errorURL");
        e(((c) this.f10626U.f9767W).r("webOverlayUrl", ""), "webOverlayUrl");
        k kVar2 = this.f10626U;
        e(kVar2.N2(((c) kVar2.f9767W).r("newTabUrl", "")), "newTabUrl");
        e(((c) this.f10626U.f9767W).r("mqttBrokerUrl", ""), "mqttBrokerUrl");
        e(((c) this.f10626U.f9767W).r("actionBarIconUrl", ""), "actionBarIconUrl");
        e(((c) this.f10626U.f9767W).r("actionBarBgUrl", ""), "actionBarBgUrl");
        e(((c) this.f10626U.f9767W).r("screensaverURL", ""), "screensaverURL");
        e(((c) this.f10626U.f9767W).r("screensaverWallpaperURL", ""), "screensaverWallpaperURL");
        k kVar3 = this.f10626U;
        e(kVar3.N2(((c) kVar3.f9767W).r("alarmSoundFileUrl", "")), "alarmSoundFileUrl");
        e(((c) this.f10626U.f9767W).r("searchProviderUrl", ""), "searchProviderUrl");
        e(this.f10626U.h1(), "loadContentZipFileUrl");
        e(Integer.valueOf(this.f10626U.Y()), "initialScale");
        e(Integer.valueOf(this.f10626U.P()), "fadeInOutDuration");
        k kVar4 = this.f10626U;
        kVar4.getClass();
        try {
            i = Integer.parseInt(((c) kVar4.f9767W).r("fontSize", "100"));
        } catch (Exception unused) {
            i = 0;
        }
        e(Integer.valueOf(i), "fontSize");
        e(Integer.valueOf(this.f10626U.l()), "actionBarSize");
        e(Integer.valueOf(this.f10626U.H1()), "reloadEachSeconds");
        e(Integer.valueOf(this.f10626U.O()), "errorUrlOnDisconnection");
        k kVar5 = this.f10626U;
        kVar5.getClass();
        try {
            i8 = Integer.parseInt(((c) kVar5.f9767W).r("rewindEachSeconds", "0"));
        } catch (Exception unused2) {
            i8 = 0;
        }
        e(Integer.valueOf(i8), "rewindEachSeconds");
        e(Integer.valueOf(this.f10626U.I1()), "reloadPageFailure");
        k kVar6 = this.f10626U;
        kVar6.getClass();
        try {
            i9 = Integer.parseInt(((c) kVar6.f9767W).r("appLauncherScaling", "0"));
        } catch (Exception unused3) {
            i9 = 0;
        }
        e(Integer.valueOf(i9), "appLauncherScaling");
        e(Integer.valueOf(this.f10626U.R1()), "screenBrightness");
        e(Integer.valueOf(this.f10626U.r()), "batteryWarning");
        e(((c) this.f10626U.f9767W).r("sleepTime", ""), "sleepTime");
        e(((c) this.f10626U.f9767W).r("wakeupTime", ""), "wakeupTime");
        e(Integer.valueOf(this.f10626U.r2()), "timeToScreenOffV2");
        e(Integer.valueOf(this.f10626U.s2()), "timeToScreensaverV2");
        e(Integer.valueOf(this.f10626U.p2()), "timeToGoBackground");
        e(Integer.valueOf(this.f10626U.n2()), "timeToClearLauncherAppData");
        k kVar7 = this.f10626U;
        kVar7.getClass();
        try {
            i10 = Integer.parseInt(((c) kVar7.f9767W).r("mdmTimeToClearLauncherAppData", "0"));
        } catch (Exception unused4) {
            i10 = 0;
        }
        e(Integer.valueOf(i10), "mdmTimeToClearLauncherAppData");
        e(Integer.valueOf(this.f10626U.t2()), "timeToShutdownOnPowerDisconnect");
        e(Integer.valueOf(this.f10626U.q2()), "timeToRegainFocus");
        e(Integer.valueOf(this.f10626U.o2()), "timeToClearSingleAppData");
        e(Integer.valueOf(this.f10626U.p1()), "mdmTimeToClearSingleAppData");
        e(Integer.valueOf(this.f10626U.S1()), "screensaverBrightness");
        e(Integer.valueOf(this.f10626U.u1()), "motionFps");
        e(Integer.valueOf(this.f10626U.v1()), "motionSensitivity");
        e(Integer.valueOf(this.f10626U.z()), "detectFacesConfidence");
        e(Integer.valueOf(this.f10626U.w1()), "motionSensitivityAcoustic");
        e(Integer.valueOf(this.f10626U.x()), "darknessLevel");
        k kVar8 = this.f10626U;
        kVar8.getClass();
        try {
            i11 = Integer.parseInt(((c) kVar8.f9767W).r("accelerometerSensitivityV2", "90"));
        } catch (Exception unused5) {
            i11 = 0;
        }
        e(Integer.valueOf(i11), "accelerometerSensitivityV2");
        k kVar9 = this.f10626U;
        kVar9.getClass();
        try {
            i12 = Integer.parseInt(((c) kVar9.f9767W).r("compassSensitivity", "50"));
        } catch (Exception unused6) {
            i12 = 0;
        }
        e(Integer.valueOf(i12), "compassSensitivity");
        e(Float.valueOf(this.f10626U.x1()), "movementBeaconDistance");
        e(this.f10626U.b0(), "kioskExitGesture");
        e(((c) this.f10626U.f9767W).r("sgProductType", "SiteGuide"), "sgProductType");
        e(((c) this.f10626U.f9767W).r("sgHost", "192.168.1.1"), "sgHost");
        e(((c) this.f10626U.f9767W).r("sgLanguage", "en_UK"), "sgLanguage");
        e(((c) this.f10626U.f9767W).r("rebootTime", ""), "rebootTime");
        e(((c) this.f10626U.f9767W).r("folderCleanupTime", ""), "folderCleanupTime");
        e(this.f10626U.g2(), "singleAppMode");
        e(Boolean.valueOf(((c) this.f10626U.f9767W).n("screensaverDaydream", false)), "screensaverDaydream");
        e(this.f10626U.T1(), "screensaverOtherApp");
        e(((c) this.f10626U.f9767W).r("userAgent", "0"), "userAgent");
        e(this.f10626U.e0(), "kioskWifiPinAction");
        e(this.f10626U.s1(), "motionDetection");
        e(this.f10626U.s1(), "motionDetectionAcoustic");
        f("kioskMode");
        f("disableStatusBar");
        f("singleAppMode");
        f("remoteAdminSingleAppExit");
        f("forceImmersive");
        f("lockSafeMode");
        f("knoxEnabled");
        f("knoxDisableWiFi");
        f("knoxDisableSafeMode");
        f("knoxDisableBackButton");
        f("knoxDisablePowerButton");
        f("knoxDisableVolumeButtons");
        f("forceSleepIfUnplugged");
        f("cloudService");
        f("actionBarCustomButtonUrl");
        f("actionBarQrScanButtonUrl");
        f("barcodeScanTargetUrl");
        f("volumeLicenseKey");
        findPreference("kioskPin");
        findPreference("kioskWifiPin");
        Preference findPreference = findPreference("remoteAdminLan");
        if (findPreference != null) {
            String B8 = C0794w0.B();
            if (B8.equals("")) {
                B8 = "host";
            }
            findPreference.setSummary(this.f10627V.f9932U0.g("remoteAdminLan") + ", currently at http://" + B8 + ":" + P.f3859s);
        }
        Preference findPreference2 = findPreference("wifiSettings");
        if (findPreference2 != null) {
            findPreference2.setOnPreferenceClickListener(new Z1(this, 0));
        }
        Preference findPreference3 = findPreference("daydreamSettings");
        if (findPreference3 != null) {
            findPreference3.setOnPreferenceClickListener(new Z1(this, 11));
        }
        Preference findPreference4 = findPreference("androidSettings");
        if (findPreference4 != null) {
            findPreference4.setOnPreferenceClickListener(new Z1(this, 13));
        }
        Preference findPreference5 = findPreference("knoxActivateEmlLicense");
        if (findPreference5 != null) {
            findPreference5.setOnPreferenceClickListener(new Z1(this, 14));
        }
        Preference findPreference6 = findPreference("knoxActivateSklLicense");
        if (findPreference6 != null) {
            findPreference6.setOnPreferenceClickListener(new Z1(this, 15));
        }
        Preference findPreference7 = findPreference("exportSettings");
        if (findPreference7 != null) {
            findPreference7.setOnPreferenceClickListener(new Z1(this, 16));
        }
        Preference findPreference8 = findPreference("importSettings");
        if (findPreference8 != null) {
            findPreference8.setOnPreferenceClickListener(new Z1(this, 17));
        }
        Preference findPreference9 = findPreference("removeDeviceOwner");
        if (findPreference9 != null) {
            findPreference9.setOnPreferenceClickListener(new Z1(this, 18));
        }
        Preference findPreference10 = findPreference("resetSettings");
        if (findPreference10 != null) {
            findPreference10.setOnPreferenceClickListener(new Z1(this, 19));
        }
        Preference findPreference11 = findPreference("getAllRuntimePermissions");
        if (findPreference11 != null) {
            findPreference11.setOnPreferenceClickListener(new Z1(this, 20));
        }
        Preference findPreference12 = findPreference("showVersionInfo");
        if (findPreference12 != null) {
            findPreference12.setOnPreferenceClickListener(new Z1(this, 1));
        }
        Preference findPreference13 = findPreference("showDeviceInfo");
        if (findPreference13 != null) {
            findPreference13.setOnPreferenceClickListener(new Z1(this, 2));
        }
        Preference findPreference14 = findPreference("showAppLauncherSelector");
        if (findPreference14 != null) {
            findPreference14.setOnPreferenceClickListener(new Z1(this, 3));
        }
        Preference findPreference15 = findPreference("showSleepScheduleSelector");
        if (findPreference15 != null) {
            findPreference15.setOnPreferenceClickListener(new Z1(this, 4));
        }
        Preference findPreference16 = findPreference("showPlaylistSelector");
        if (findPreference16 != null) {
            findPreference16.setOnPreferenceClickListener(new Z1(this, 5));
        }
        Preference findPreference17 = findPreference("showScreensaverPlaylistSelector");
        if (findPreference17 != null) {
            findPreference17.setOnPreferenceClickListener(new Z1(this, 6));
        }
        Preference findPreference18 = findPreference("showWebAutomationSelector");
        if (findPreference18 != null) {
            findPreference18.setOnPreferenceClickListener(new Z1(this, 7));
        }
        Preference findPreference19 = findPreference("addDeviceToCloud");
        if (findPreference19 != null) {
            findPreference19.setOnPreferenceClickListener(new Z1(this, 8));
        }
        Preference findPreference20 = findPreference("selectWebViewImpl");
        if (findPreference20 != null) {
            findPreference20.setOnPreferenceClickListener(new Z1(this, 9));
        }
        Preference findPreference21 = findPreference("rateFully");
        if (findPreference21 != null) {
            findPreference21.setOnPreferenceClickListener(new Z1(this, 10));
        }
        Preference findPreference22 = findPreference("privacyPolicy");
        if (findPreference22 != null) {
            String string = this.f10627V.getString(2131951934);
            if (!string.isEmpty()) {
                findPreference22.setOnPreferenceClickListener(new C0665a2(this, string));
            } else {
                findPreference22.setEnabled(false);
            }
        }
        Preference findPreference23 = findPreference("copyDeviceId");
        if (findPreference23 != null) {
            findPreference23.setTitle("Device ID " + P.i(this.f10627V));
            findPreference23.setOnPreferenceClickListener(new Z1(this, 12));
        }
        this.f10627V.f9932U0.i(getPreferenceScreen());
    }

    public final void e(Object obj, String str) {
        Preference findPreference = findPreference(str);
        if (findPreference != null) {
            findPreference.setOnPreferenceChangeListener(this);
            c(findPreference, obj, false);
        }
    }

    public final void f(String str) {
        Preference findPreference = findPreference(str);
        if (findPreference != null) {
            findPreference.setOnPreferenceChangeListener(this);
        }
    }

    public final void g() {
        this.f10629X.removeAllViews();
        Iterator it = ((ArrayList) new G3(this.f10627V).b(this.f10629X)).iterator();
        while (it.hasNext()) {
            F3 f32 = (F3) it.next();
            String str = f32.f9892b;
            if (str == null) {
                Intent intent = f32.f9894d;
                if (intent != null) {
                    a.o0(intent);
                    f32.f9893c.setOnClickListener(new m(this, 6, f32));
                }
            } else if (str.equals("localFilesMigrationCheck")) {
                f32.f9893c.setOnClickListener(new C0671b2(this, 1));
            } else {
                C0770s0 s0Var = this.f10627V.f9932U0;
                String str2 = f32.f9892b;
                s0Var.getClass();
                ArrayList f8 = C0770s0.f(str2.toLowerCase(), s0Var.f10938a, "", "");
                if (!f8.isEmpty()) {
                    String str3 = ((C0788v0) f8.get(0)).f11004b;
                    f32.f9893c.setOnClickListener(new m(this, 5, f8));
                }
            }
            this.f10629X.addView(f32.f9893c);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        if (getActivity() instanceof FullyActivity) {
            this.f10627V = (FullyActivity) getActivity();
            this.f10626U = new k((Context) activity, 1);
            this.f10627V.f9918G0.setVisibility(8);
        }
        C0794w0.A0(this.f10627V, true, true);
        this.f10627V.f9942e1.f("");
        this.f10627V.getWindow().setNavigationBarColor(-16777216);
        this.f10627V.getWindow().setStatusBarColor(-16777216);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(2132148232);
        d();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setBackgroundColor(getResources().getColor(17170447));
        this.f10628W = (Toolbar) this.f10627V.findViewById(2131361844);
        if (((c) this.f10626U.f9767W).n("actionBarInSettings", false) || this.f10626U.N1().booleanValue() || (this.f10626U.c1().booleanValue() && ((c) this.f10626U.f9767W).n("knoxHideNavigationBar", false))) {
            this.f10628W.setTitle((CharSequence) "Settings");
            this.f10628W.setNavigationIcon(2131230949);
            this.f10628W.setBackgroundDrawable(new ColorDrawable(this.f10626U.i()));
            this.f10628W.setTitleTextColor(this.f10626U.j());
            this.f10628W.setNavigationOnClickListener(new C0671b2(this, 0));
            this.f10628W.setVisibility(0);
        } else {
            this.f10628W.setVisibility(8);
        }
        boolean z = onCreateView instanceof ViewGroup;
        if (z) {
            this.f10629X = new LinearLayout(this.f10627V);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            this.f10629X.setPadding(a.p(12.0f, this.f10627V), 0, a.p(12.0f, this.f10627V), 0);
            this.f10629X.setLayoutParams(layoutParams);
            this.f10629X.setOrientation(1);
            this.f10629X.setFocusable(false);
            ((ViewGroup) onCreateView).addView(this.f10629X, 0);
        }
        if (z && !P.y(this.f10627V)) {
            ViewGroup viewGroup2 = (ViewGroup) onCreateView;
            viewGroup2.addView((LinearLayout) layoutInflater.inflate(2131558584, viewGroup2, false), 0);
            SearchView searchView = (SearchView) onCreateView.findViewById(2131362464);
            searchView.setFocusable(true);
            searchView.setFocusableInTouchMode(true);
            searchView.setIconifiedByDefault(false);
            searchView.setQueryHint("Search in Settings");
            C1643e eVar = new C1643e(getActivity(), 2131558589, new String[]{"path", "title", "summary"}, new int[]{2131362187, 2131362189, 2131362188});
            this.f10630Y = eVar;
            searchView.setSuggestionsAdapter(eVar);
            searchView.setOnSuggestionListener(new C0689e2(this, searchView));
            searchView.setOnQueryTextListener(new C0689e2(this, searchView));
        }
        return onCreateView;
    }

    public final void onDetach() {
        Toolbar toolbar = this.f10628W;
        if (toolbar != null) {
            toolbar.setVisibility(8);
            this.f10628W.setNavigationOnClickListener((View.OnClickListener) null);
        }
        this.f10627V.f9918G0.setVisibility(0);
        if (!this.f10627V.isFinishing()) {
            this.f10627V.f9952o1.c();
        }
        super.onDetach();
    }

    public final boolean onPreferenceChange(Preference preference, Object obj) {
        return c(preference, obj, true);
    }

    public final boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        LinearLayout linearLayout;
        Dialog dialog;
        boolean z = preference instanceof PreferenceScreen;
        if (z) {
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preference;
            if (preferenceScreen2.getDialog() != null) {
                if (preference.getKey().equals(this.f10634c0) && (dialog = this.f10633b0) != null && dialog.isShowing()) {
                    this.f10633b0.dismiss();
                }
                this.f10633b0 = preferenceScreen2.getDialog();
                this.f10634c0 = preference.getKey();
            }
        }
        if (!this.f10631Z || preference.getKey() == null || !preference.getKey().contains("superPin")) {
            if (z) {
                PreferenceScreen preferenceScreen3 = (PreferenceScreen) preference;
                this.f10632a0 = preferenceScreen3.getDialog();
                a.r(this.f10627V.getWindow(), this.f10632a0.getWindow());
                this.f10632a0.getWindow().setBackgroundDrawable(new ColorDrawable(-1));
                this.f10632a0.getWindow().getDecorView().setBackgroundColor(Color.parseColor("#ffffff"));
                FrameLayout frameLayout = (FrameLayout) this.f10632a0.getWindow().getDecorView().findViewById(16908290);
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(Color.parseColor("#ffffff"));
                    frameLayout.getBackground().setAlpha(255);
                    if (frameLayout.getChildAt(0) != null) {
                        frameLayout.getChildAt(0).setBackgroundColor(Color.parseColor("#ffffff"));
                        frameLayout.getChildAt(0).getBackground().setAlpha(255);
                    }
                }
                if (((c) this.f10626U.f9767W).n("actionBarInSettings", false) || this.f10626U.N1().booleanValue() || (this.f10626U.c1().booleanValue() && ((c) this.f10626U.f9767W).n("knoxHideNavigationBar", false))) {
                    Dialog dialog2 = preferenceScreen3.getDialog();
                    try {
                        if (a.z0()) {
                            linearLayout = (LinearLayout) dialog2.findViewById(16908298).getParent().getParent();
                        } else {
                            linearLayout = (LinearLayout) dialog2.findViewById(16908298).getParent();
                        }
                        Toolbar toolbar = (Toolbar) LayoutInflater.from(this.f10627V).inflate(2131558428, linearLayout, false);
                        linearLayout.addView(toolbar, 0);
                        toolbar.setTitle(preferenceScreen3.getTitle());
                        toolbar.setNavigationIcon(2131230949);
                        toolbar.setBackgroundDrawable(new ColorDrawable(this.f10626U.i()));
                        toolbar.setTitleTextColor(this.f10626U.j());
                        toolbar.setNavigationOnClickListener(new C0025a(14, dialog2));
                        dialog2.setOnDismissListener(new C0677c2(this, toolbar, dialog2));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    this.f10632a0.setOnDismissListener(new Y1(this));
                }
            }
            return super.onPreferenceTreeClick(preferenceScreen, preference);
        }
        N2 n22 = new N2();
        n22.f9862l1 = new O(this, preferenceScreen, preference, 7);
        n22.f9865o1 = this.f10627V.getString(2131951685);
        if (this.f10627V.f10980u0) {
            n22.T(this.f10627V.l(), "SuperPINdialog");
        }
        if (!(preference instanceof PreferenceScreen)) {
            return true;
        }
        PreferenceScreen preferenceScreen4 = (PreferenceScreen) preference;
        if (preferenceScreen4.getDialog() == null || !preferenceScreen4.getDialog().isShowing()) {
            return true;
        }
        preferenceScreen4.getDialog().dismiss();
        return true;
    }

    public final void onResume() {
        ListView listView;
        super.onResume();
        new Handler().postDelayed(new W1(this, 0), 500);
        g();
        this.f10627V.k().q();
        if (getView() != null && (listView = (ListView) getView().findViewById(16908298)) != null) {
            listView.requestFocus();
            View findViewById = getView().findViewById(2131362464);
            if (findViewById != null) {
                listView.setNextFocusUpId(2131362464);
                findViewById.setNextFocusDownId(16908298);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0794w0.V(this.f10627V);
    }
}
