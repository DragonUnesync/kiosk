package de.ozerov.fully;

import Q0.g;
import V0.r;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.s4  reason: case insensitive filesystem */
public final /* synthetic */ class C0774s4 implements TextToSpeech.OnInitListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f10953a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10954b;

    public /* synthetic */ C0774s4(r rVar, String str) {
        this.f10953a = rVar;
        this.f10954b = str;
    }

    public final void onInit(int i) {
        r rVar = this.f10953a;
        if (i == 0) {
            rVar.f5585a = true;
            try {
                rVar.f5587c = ((TextToSpeech) rVar.f5586b).getAvailableLanguages();
                rVar.f5588d = ((TextToSpeech) rVar.f5586b).getVoices();
            } catch (Exception e) {
                g.z(e, new StringBuilder("Failed to get the available TTS languages or voices due to "), "r");
                rVar.f5587c = null;
            }
            String str = this.f10954b;
            rVar.f5589f = str;
            try {
                JSONArray jSONArray = new JSONArray();
                for (TextToSpeech.EngineInfo engineInfo : ((TextToSpeech) rVar.f5586b).getEngines()) {
                    jSONArray.put(engineInfo.name);
                }
                JSONArray jSONArray2 = new JSONArray();
                for (Voice next : ((TextToSpeech) rVar.f5586b).getVoices()) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("name", next.getName());
                    jSONObject.put("locale", next.getLocale().toString());
                    jSONArray2.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                if (str == null) {
                    str = ((TextToSpeech) rVar.f5586b).getDefaultEngine();
                }
                jSONObject2.put("currentEngine", str);
                jSONObject2.put("engines", jSONArray);
                jSONObject2.put("defaultVoice", ((TextToSpeech) rVar.f5586b).getDefaultVoice().getName());
                jSONObject2.put("voices", jSONArray2);
                U0.e("ttsInitSuccess", a.E("$info", jSONObject2.toString()));
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            ArrayList arrayList = (ArrayList) rVar.f5590g;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    runnable.run();
                }
            }
            arrayList.clear();
            return;
        }
        rVar.getClass();
        Log.e("r", "Failed initializing TTS engine, status: " + i);
        U0.e("ttsInitFailed", (HashMap) null);
    }
}
