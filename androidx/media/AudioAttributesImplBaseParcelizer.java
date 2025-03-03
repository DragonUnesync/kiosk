package androidx.media;

import i2.C1096a;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C1096a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f8183a = aVar.f(audioAttributesImplBase.f8183a, 1);
        audioAttributesImplBase.f8184b = aVar.f(audioAttributesImplBase.f8184b, 2);
        audioAttributesImplBase.f8185c = aVar.f(audioAttributesImplBase.f8185c, 3);
        audioAttributesImplBase.f8186d = aVar.f(audioAttributesImplBase.f8186d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C1096a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f8183a, 1);
        aVar.j(audioAttributesImplBase.f8184b, 2);
        aVar.j(audioAttributesImplBase.f8185c, 3);
        aVar.j(audioAttributesImplBase.f8186d, 4);
    }
}
