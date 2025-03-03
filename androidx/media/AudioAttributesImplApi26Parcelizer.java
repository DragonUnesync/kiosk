package androidx.media;

import android.media.AudioAttributes;
import i2.C1096a;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(C1096a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f8181a = (AudioAttributes) aVar.g(audioAttributesImplApi26.f8181a, 1);
        audioAttributesImplApi26.f8182b = aVar.f(audioAttributesImplApi26.f8182b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, C1096a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi26.f8181a, 1);
        aVar.j(audioAttributesImplApi26.f8182b, 2);
    }
}
