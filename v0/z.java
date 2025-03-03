package V0;

import B3.a;
import M0.C0117e;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import com.samsung.android.knox.EnterpriseDeviceManager;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final z f5672a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final z f5673b = new Object();

    public static AudioAttributes b(C0117e eVar, boolean z) {
        if (z) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) eVar.a().f2027U;
    }

    public static int c(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                        return 3062500;
                    case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                        return 8000;
                    case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                        return 256000;
                    case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                        return 336000;
                    case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    public AudioTrack a(j jVar, C0117e eVar, int i) {
        int i8 = P0.z.f3748a;
        boolean z = jVar.f5529a;
        int i9 = jVar.f5530b;
        int i10 = jVar.e;
        int i11 = jVar.f5531c;
        if (i8 < 23) {
            return new AudioTrack(b(eVar, z), P0.z.q(i11, i10, i9), jVar.f5533f, 1, i);
        }
        AudioTrack.Builder A8 = a.h().setAudioAttributes(b(eVar, z)).setAudioFormat(P0.z.q(i11, i10, i9)).setTransferMode(1).setBufferSizeInBytes(jVar.f5533f).setSessionId(i);
        if (i8 >= 29) {
            A8.setOffloadedPlayback(jVar.f5532d);
        }
        return A8.build();
    }
}
