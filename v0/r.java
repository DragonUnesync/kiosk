package V0;

import Q0.g;
import Z1.c;
import android.content.Context;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.util.Log;
import d4.k;
import de.ozerov.fully.C0686e;
import de.ozerov.fully.C0763q4;
import de.ozerov.fully.C0768r4;
import de.ozerov.fully.C0774s4;
import de.ozerov.fully.FullyActivity;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

public final class r {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f5584h = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f5585a;

    /* renamed from: b  reason: collision with root package name */
    public Object f5586b;

    /* renamed from: c  reason: collision with root package name */
    public Object f5587c;

    /* renamed from: d  reason: collision with root package name */
    public Object f5588d;
    public Object e;

    /* renamed from: f  reason: collision with root package name */
    public Object f5589f;

    /* renamed from: g  reason: collision with root package name */
    public Object f5590g;

    public r(FullyActivity fullyActivity, int i) {
        switch (i) {
            case 2:
                this.f5585a = false;
                this.f5590g = new ArrayList();
                this.e = fullyActivity;
                return;
            default:
                this.f5586b = fullyActivity;
                this.f5587c = new k((Context) fullyActivity, 1);
                return;
        }
    }

    public void a() {
        k kVar = (k) this.f5587c;
        if (kVar.J1().booleanValue() && kVar.u().booleanValue() && !kVar.K1().isEmpty()) {
            c cVar = (c) kVar.f9767W;
            if (cVar.r("cloudAccountEmailAdded", "").isEmpty() || !cVar.r("cloudAccountEmailAdded", "").equals(cVar.r("cloudAccountEmail", ""))) {
                this.e = cVar.r("cloudAccountEmail", "");
                this.f5590g = cVar.r("cloudAccountMasterPass", "");
                if (!((String) this.e).isEmpty() && !((String) this.f5590g).isEmpty()) {
                    if (!cVar.r("cloudAccountDeviceAlias", "").isEmpty()) {
                        this.f5588d = cVar.r("cloudAccountDeviceAlias", "");
                    }
                    d();
                    return;
                }
                return;
            }
            cVar.r("cloudAccountEmailAdded", "");
        }
    }

    public boolean b(Runnable runnable, String str) {
        if (((TextToSpeech) this.f5586b) != null && ((str != null && !str.equals((String) this.f5589f)) || (str == null && ((String) this.f5589f) != null))) {
            ((TextToSpeech) this.f5586b).shutdown();
            this.f5586b = null;
            this.f5585a = false;
        }
        TextToSpeech textToSpeech = (TextToSpeech) this.f5586b;
        ArrayList arrayList = (ArrayList) this.f5590g;
        if (textToSpeech == null) {
            if (runnable != null) {
                arrayList.add(runnable);
            }
            this.f5586b = new TextToSpeech(((FullyActivity) this.e).getApplicationContext(), new C0774s4(this, str), str);
            return true;
        } else if (this.f5585a) {
            return false;
        } else {
            if (runnable != null) {
                arrayList.add(runnable);
            }
            return true;
        }
    }

    public boolean c(long j7) {
        if (b(new C0768r4(this, j7, 0), (String) null)) {
            return true;
        }
        if (((TextToSpeech) this.f5586b).playSilentUtterance(j7, 1, UUID.randomUUID().toString()) == 0) {
            return true;
        }
        return false;
    }

    public void d() {
        String str;
        String str2 = (String) this.e;
        if (str2 != null && !str2.isEmpty()) {
            String str3 = (String) this.f5589f;
            if ((str3 != null && !str3.isEmpty()) || ((str = (String) this.f5590g) != null && !str.isEmpty())) {
                new C0686e(0, this).execute(new Void[0]);
            }
        }
    }

    public boolean e(String str, Locale locale, int i) {
        if (locale != null) {
            try {
                ((TextToSpeech) this.f5586b).setLanguage(locale);
            } catch (Exception e8) {
                g.x(e8, new StringBuilder("TTS failed due to "), "r");
                return false;
            }
        }
        if (((TextToSpeech) this.f5586b) == null) {
            return false;
        }
        if (((TextToSpeech) this.f5586b).speak(str, i, (Bundle) null, UUID.randomUUID().toString()) == 0) {
            return true;
        }
        return false;
    }

    public boolean f(String str, int i, String str2, String str3) {
        boolean z = true;
        if (b(new C0763q4(this, str, str2, str3, i), str3)) {
            return true;
        }
        if (((Set) this.f5587c) == null || str2 == null) {
            return e(str, (Locale) null, i);
        }
        for (Voice voice : (Set) this.f5588d) {
            if (voice.getName().equals(str2)) {
                try {
                    ((TextToSpeech) this.f5586b).setVoice(voice);
                    if (((TextToSpeech) this.f5586b) == null) {
                        return false;
                    }
                    if (((TextToSpeech) this.f5586b).speak(str, i, (Bundle) null, UUID.randomUUID().toString()) != 0) {
                        z = false;
                    }
                    return z;
                } catch (Exception e8) {
                    g.x(e8, new StringBuilder("TTS failed due to "), "r");
                    return false;
                }
            }
        }
        for (Locale locale : (Set) this.f5587c) {
            if (locale.toString().equals(str2)) {
                return e(str, locale, i);
            }
        }
        for (Locale locale2 : (Set) this.f5587c) {
            if (locale2.toString().startsWith(str2)) {
                return e(str, locale2, i);
            }
        }
        String str4 = str2.split("_")[0];
        for (Locale locale3 : (Set) this.f5587c) {
            if (locale3.toString().startsWith(str4)) {
                return e(str, locale3, i);
            }
        }
        String str5 = "";
        for (Locale locale4 : (Set) this.f5587c) {
            if (!str5.isEmpty()) {
                str5 = str5.concat(",");
            }
            StringBuilder r8 = g.r(str5);
            r8.append(locale4.toString());
            str5 = r8.toString();
        }
        Log.w("r", "Could not find a matching TTS locale for " + str2 + " on the TTS engine " + str3 + ", available TTS locales: " + str5);
        return false;
    }
}
