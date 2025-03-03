package androidx.media;

import android.media.AudioAttributes;
import i2.C1096a;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C1096a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f8181a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f8181a, 1);
        audioAttributesImplApi21.f8182b = aVar.f(audioAttributesImplApi21.f8182b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C1096a aVar) {
        aVar.getClass();
        aVar.k(audioAttributesImplApi21.f8181a, 1);
        aVar.j(audioAttributesImplApi21.f8182b, 2);
    }
}
