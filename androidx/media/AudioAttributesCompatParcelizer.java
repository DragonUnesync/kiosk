package androidx.media;

import i2.C1096a;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C1096a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.f8180a;
        if (aVar.e(1)) {
            obj = aVar.h();
        }
        audioAttributesCompat.f8180a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C1096a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f8180a;
        aVar.i(1);
        aVar.l(audioAttributesImpl);
    }
}
