package androidx.media;

import android.util.SparseIntArray;
import i2.C1098c;

public class AudioAttributesCompat implements C1098c {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f8179b = 0;

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributesImpl f8180a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f8180a;
        if (audioAttributesImpl != null) {
            return audioAttributesImpl.equals(audioAttributesCompat.f8180a);
        }
        if (audioAttributesCompat.f8180a == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8180a.hashCode();
    }

    public final String toString() {
        return this.f8180a.toString();
    }
}
