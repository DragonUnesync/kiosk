package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f8181a;

    /* renamed from: b  reason: collision with root package name */
    public int f8182b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f8181a.equals(((AudioAttributesImplApi21) obj).f8181a);
    }

    public final int hashCode() {
        return this.f8181a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f8181a;
    }
}
