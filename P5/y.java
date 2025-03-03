package P5;

import B.C0002c;
import B3.q;
import Q0.g;
import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.util.Log;
import com.samsung.android.knox.EnterpriseDeviceManager;
import com.samsung.android.knox.custom.CustomDeviceManager;
import de.ozerov.fully.C0752p;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.P;
import de.ozerov.fully.Z0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import n2.a;

public final class y extends C0145h {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f3939w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i) {
        super(0);
        this.f3939w = i;
    }

    private final K q() {
        Class<String> cls = String.class;
        if (this.f3891p && this.f3888m.equals("shutdownDevice")) {
            if (!this.f3880c.Q1().booleanValue() || !P.f10240j) {
                FullyActivity fullyActivity = this.f3879b;
                if (C0794w0.j0(fullyActivity, fullyActivity.getPackageName())) {
                    a.b1(this.f3879b, "Shutting down...");
                    try {
                        Class cls2 = Class.forName("android.os.IPowerManager").getClasses()[0];
                        Object invoke = cls2.getMethod("asInterface", new Class[]{IBinder.class}).invoke((Object) null, new Object[]{(IBinder) Class.forName("android.os.ServiceManager").getMethod("getService", new Class[]{cls}).invoke((Object) null, new Object[]{"power"})});
                        Class cls3 = Boolean.TYPE;
                        Method method = cls2.getMethod("shutdown", new Class[]{cls3, cls, cls3});
                        Boolean bool = Boolean.FALSE;
                        method.invoke(invoke, new Object[]{bool, "userrequested", bool});
                    } catch (Exception e) {
                        String str = this.f3878a;
                        Log.e(str, "Failed to invoke IPowerManager.shutdown() due to " + e.getMessage());
                        e.printStackTrace();
                    }
                } else if (!Z0.f() || !Z0.g()) {
                    this.f3895t.add("Missing root and system signed permissions to shutdown the device");
                } else {
                    try {
                        CustomDeviceManager.getInstance().getSystemManager().setForceAutoShutDownState(2);
                    } catch (Error | Exception unused) {
                        Log.w(this.f3878a, "Failed to force shutdown by KNOX");
                    }
                }
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new C0143f(18, this), 3000);
                this.f3894s.add("Shutdown the device");
            }
        }
        return null;
    }

    public final K a() {
        int i = 1;
        switch (this.f3939w) {
            case 0:
                if (this.f3891p && this.f3888m.equals("restartApp")) {
                    this.f3894s.add("App restarted");
                    this.f3879b.runOnUiThread(new C0143f(13, this));
                }
                return null;
            case 1:
                if (this.f3891p && this.f3888m.equals("screenOff")) {
                    if (C0794w0.X(this.f3879b) || C0794w0.Y(this.f3879b) || C0794w0.Z(this.f3879b)) {
                        this.f3879b.runOnUiThread(new C0143f(14, this));
                        this.f3894s.add("Switching the screen off");
                        try {
                            Thread.sleep(500);
                        } catch (Exception unused) {
                        }
                    } else {
                        this.f3895t.add("Missing admin rights to switch off the screen");
                    }
                }
                return null;
            case 2:
                if (this.f3891p && this.f3888m.equals("screenOn")) {
                    this.f3879b.runOnUiThread(new C0143f(15, this));
                    this.f3894s.add("Switching the screen on");
                    try {
                        Thread.sleep(500);
                    } catch (Exception unused2) {
                    }
                }
                return null;
            case 3:
                ArrayList arrayList = this.f3895t;
                if (this.f3891p && this.f3888m.equals("setAudioVolume") && this.f3884h.get("level") != null && this.f3884h.get("stream") != null) {
                    try {
                        int parseInt = Integer.parseInt((String) this.f3884h.get("level"));
                        int parseInt2 = Integer.parseInt((String) this.f3884h.get("stream"));
                        if (((AudioManager) this.f3879b.getSystemService("audio")).isVolumeFixed()) {
                            arrayList.add("Volume level is fixed on the device and can't be changed programmatically");
                        } else {
                            if (parseInt >= 0) {
                                if (parseInt <= 100) {
                                    if (parseInt2 >= 1) {
                                        if (parseInt2 <= 10) {
                                            C0794w0.x0(this.f3879b, parseInt, parseInt2);
                                            ArrayList arrayList2 = this.f3894s;
                                            arrayList2.add("Audio volume set to " + parseInt + "% for stream " + parseInt2);
                                        }
                                    }
                                    arrayList.add("Stream ID 1-10 is accepted");
                                }
                            }
                            arrayList.add("Volume level 0-100 is accepted");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        arrayList.add("Wrong/non-numeric value dismissed");
                    }
                }
                return null;
            case 4:
                if (this.f3891p && this.f3888m.equals("setOverlayMessage") && this.f3884h.get("text") != null) {
                    this.f3879b.runOnUiThread(new C0143f(17, this));
                    this.f3894s.add("Overlay message set");
                    try {
                        Thread.sleep(500);
                    } catch (Exception unused3) {
                    }
                }
                return null;
            case 5:
                if (this.f3891p && this.f3888m.equals("showToast") && this.f3884h.get("text") != null) {
                    a.a1(1, this.f3879b, (String) this.f3884h.get("text"));
                    this.f3894s.add("Showing toast");
                }
                return null;
            case 6:
                return q();
            case 7:
                if (this.f3891p && this.f3888m.equals("startApplication") && this.f3884h.get("package") != null) {
                    String str = (String) this.f3884h.get("package");
                    try {
                        Intent F8 = C0794w0.F(this.f3879b, str);
                        this.f3879b.startActivity(F8);
                        F8.toString();
                        ArrayList arrayList3 = this.f3894s;
                        arrayList3.add("Started app " + str);
                    } catch (Exception unused4) {
                        ArrayList arrayList4 = this.f3895t;
                        arrayList4.add("Can't start package " + str);
                    }
                }
                return null;
            case 8:
                if (this.f3891p && this.f3888m.equals("startDaydream")) {
                    this.f3879b.runOnUiThread(new C0143f(19, this));
                    this.f3894s.add("Daydream started");
                    try {
                        Thread.sleep(500);
                    } catch (Exception unused5) {
                    }
                }
                return null;
            case 9:
                if (this.f3891p && this.f3888m.equals("startInstallApk")) {
                    if (!C0794w0.Z(this.f3879b)) {
                        this.f3895t.add("Missing device owner rights to install APK files");
                    } else if (!a.h0(this.f3879b) && a.u0()) {
                        this.f3895t.add("Missing runtime permissions to write files");
                    } else if (!P.B() && a.u0()) {
                        this.f3895t.add("External storage is not writable");
                    } else if (C0752p.d() || !C0752p.f10878c.equals("idle")) {
                        this.f3895t.add("APK installer already running");
                    } else {
                        C0752p.e(this.f3879b);
                        this.f3894s.add("APK installer started");
                    }
                }
                return null;
            case 10:
                if (this.f3891p && this.f3888m.equals("startIntent") && this.f3884h.get("url") != null) {
                    String str2 = (String) this.f3884h.get("url");
                    String str3 = (String) this.f3884h.get("result");
                    try {
                        Intent P02 = a.P0(str2);
                        if (str3 == null) {
                            this.f3879b.startActivity(P02);
                        } else {
                            this.f3879b.startActivityForResult(P02, Integer.parseInt(str3));
                        }
                        ArrayList arrayList5 = this.f3894s;
                        arrayList5.add("Started intent " + str2);
                    } catch (Exception e8) {
                        StringBuilder s8 = g.s("Can't start intent for ", str2, " due to ");
                        s8.append(e8.getMessage());
                        Log.w(this.f3878a, s8.toString());
                        ArrayList arrayList6 = this.f3895t;
                        StringBuilder s9 = g.s("Can't start intent ", str2, " due to ");
                        s9.append(e8.getMessage());
                        arrayList6.add(s9.toString());
                    }
                }
                return null;
            case 11:
                if (this.f3891p && this.f3888m.equals("startScreensaver")) {
                    this.f3879b.runOnUiThread(new C0143f(20, this));
                    this.f3894s.add("Screensaver started");
                    try {
                        Thread.sleep(500);
                    } catch (Exception unused6) {
                    }
                }
                return null;
            case 12:
                if (this.f3891p && this.f3888m.equals("startSingleApp")) {
                    this.f3879b.runOnUiThread(new C0143f(21, this));
                    this.f3894s.add("Starting single app...");
                    try {
                        Thread.sleep(500);
                    } catch (Exception unused7) {
                    }
                }
                return null;
            case 13:
                if (this.f3891p && this.f3888m.equals("stopDaydream")) {
                    this.f3879b.runOnUiThread(new C0143f(22, this));
                    this.f3894s.add("Daydream stopped");
                    try {
                        Thread.sleep(500);
                    } catch (Exception unused8) {
                    }
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                if (this.f3891p && this.f3888m.equals("stopScreensaver")) {
                    this.f3879b.runOnUiThread(new C0143f(23, this));
                    this.f3894s.add("Screensaver stopped");
                    try {
                        Thread.sleep(500);
                    } catch (Exception unused9) {
                    }
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                if (this.f3891p && this.f3888m.equals("stopSound")) {
                    this.f3879b.f9913C0.c();
                    this.f3894s.add("Stop playing sound");
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                if (this.f3891p && this.f3888m.equals("stopTextToSpeech")) {
                    TextToSpeech textToSpeech = (TextToSpeech) this.f3879b.f9915D0.f5586b;
                    if (textToSpeech != null) {
                        textToSpeech.stop();
                    }
                    this.f3894s.add("Stopping Text To Speech Ok");
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                if (this.f3891p && this.f3888m.equals("stopVideo")) {
                    try {
                        this.f3879b.runOnUiThread(new C0143f(24, this));
                        this.f3894s.add("Stopping Video...");
                        try {
                            Thread.sleep(500);
                        } catch (Exception unused10) {
                        }
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                if (this.f3891p && this.f3888m.equals("textToSpeech") && this.f3884h.get("text") != null) {
                    String str4 = (String) this.f3884h.get("queue");
                    if (str4 != null) {
                        try {
                            i = Integer.parseInt(str4);
                        } catch (Exception unused11) {
                            Log.e(this.f3878a, "Failed to parse queue");
                        }
                    }
                    this.f3879b.f9915D0.f((String) this.f3884h.get("text"), i, (String) this.f3884h.get("locale"), (String) this.f3884h.get("engine"));
                    this.f3894s.add("Sending Text To TTS Engine...");
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_6 /*19*/:
                if (this.f3891p && this.f3888m.equals("toBackground")) {
                    this.f3879b.moveTaskToBack(true);
                    this.f3894s.add("Bringing Fully to background");
                    try {
                        Thread.sleep(500);
                    } catch (Exception unused12) {
                    }
                }
                return null;
            case EnterpriseDeviceManager.KNOX_2_7 /*20*/:
                if (this.f3891p && this.f3888m.equals("toForeground")) {
                    this.f3879b.runOnUiThread(new C0143f(25, this));
                    this.f3894s.add("Bringing Fully to foreground");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception unused13) {
                    }
                }
                return null;
            case 21:
                if (this.f3891p && this.f3888m.equals("triggerMotion")) {
                    this.f3879b.runOnUiThread(new C0143f(26, this));
                    this.f3894s.add("Motion triggered");
                }
                return null;
            case 22:
                if (this.f3891p && this.f3888m.equals("unlockKiosk")) {
                    this.f3879b.runOnUiThread(new C0143f(27, this));
                    this.f3894s.add("Kiosk Unlocked");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception unused14) {
                    }
                }
                return null;
            case 23:
                String str5 = (String) this.f3884h.get("filename");
                if (this.f3891p && this.f3888m.equals("uploadAndImportSettingsFile")) {
                    String str6 = (String) this.f3882f.get("filename");
                    String str7 = this.f3878a;
                    ArrayList arrayList7 = this.f3895t;
                    if (str5 == null || str6 == null) {
                        Log.e(str7, "File upload error");
                        arrayList7.add("File upload error");
                    } else if (str5.isEmpty()) {
                        Log.e(str7, "No file selected");
                        arrayList7.add("No file selected");
                    } else if (!str5.endsWith(".json")) {
                        Log.e(str7, "Only .json files allowed");
                        arrayList7.add("Only .json files allowed to upload");
                    } else {
                        File file = new File(str6);
                        File file2 = new File(a.c0(this.f3879b, (String) null), str5);
                        if (a.w0(this.f3879b, file2) && !a.h0(this.f3879b)) {
                            Log.e(str7, "Missing runtime permissions to write file");
                            arrayList7.add("Missing runtime permissions to write file");
                        } else if (!a.w0(this.f3879b, file2) || P.B()) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                byte[] bArr = new byte[65536];
                                while (true) {
                                    int read = fileInputStream.read(bArr);
                                    if (read > 0) {
                                        fileOutputStream.write(bArr, 0, read);
                                    } else {
                                        fileInputStream.close();
                                        fileOutputStream.close();
                                    }
                                }
                            } catch (IOException e10) {
                                Log.e(str7, "Failed to upload settings file due to " + e10.getMessage());
                                arrayList7.add("Failed to upload settings file due to " + e10.getMessage());
                            }
                        } else {
                            Log.e(str7, "External storage is not writable");
                            arrayList7.add("External storage is not writable");
                        }
                        if (arrayList7.isEmpty()) {
                            Log.i(str7, "Going to import settings from " + file2.getAbsolutePath());
                            if (a.w0(this.f3879b, file2) && !a.g0(this.f3879b)) {
                                Log.e(str7, "Missing runtime permissions to read settings file");
                                arrayList7.add("Missing runtime permissions to read settings file");
                            } else if (!a.w0(this.f3879b, file2) || P.C()) {
                                q qVar = this.f3879b.f9931T0;
                                if (!qVar.O(new File(a.c0((Activity) qVar.f449U, (String) null), str5), 1)) {
                                    arrayList7.add("File check failed for ".concat(str5));
                                } else {
                                    this.f3879b.runOnUiThread(new C0002c((Object) this, 20, (Object) file2));
                                    this.f3894s.add("Successfully uploaded and imported settings");
                                }
                            } else {
                                Log.e(str7, "External storage is not readable");
                                arrayList7.add("External storage is not readable");
                            }
                        }
                    }
                }
                return null;
            default:
                if (this.f3891p && this.f3888m.equals("wipeDevice")) {
                    if (!C0794w0.Z(this.f3879b)) {
                        this.f3895t.add("Missing device owner rights to wipe the device");
                    } else {
                        new Handler(Looper.getMainLooper()).postDelayed(new C0143f(28, this), 3000);
                        this.f3894s.add("Wiping the device");
                    }
                }
                return null;
        }
    }
}
