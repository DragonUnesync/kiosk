package androidx.media;

import Q0.g;
import com.samsung.android.knox.EnterpriseDeviceManager;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a  reason: collision with root package name */
    public int f8183a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f8184b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f8185c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f8186d = -1;

    public final boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f8184b == audioAttributesImplBase.f8184b) {
            int i8 = this.f8185c;
            int i9 = audioAttributesImplBase.f8185c;
            int i10 = audioAttributesImplBase.f8186d;
            if (i10 == -1) {
                int i11 = audioAttributesImplBase.f8183a;
                int i12 = AudioAttributesCompat.f8179b;
                if ((i9 & 1) != 1) {
                    if ((i9 & 4) != 4) {
                        switch (i11) {
                            case 2:
                                i = 0;
                                break;
                            case 3:
                                i = 8;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i = 5;
                                break;
                            case 6:
                                i = 2;
                                break;
                            case 11:
                                i = 10;
                                break;
                            case 13:
                                i = 1;
                                break;
                            default:
                                i = 3;
                                break;
                        }
                    } else {
                        i = 6;
                    }
                } else {
                    i = 7;
                }
            } else {
                i = i10;
            }
            if (i == 6) {
                i9 |= 4;
            } else if (i == 7) {
                i9 |= 1;
            }
            if (i8 == (i9 & 273) && this.f8183a == audioAttributesImplBase.f8183a && this.f8186d == i10) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8184b), Integer.valueOf(this.f8185c), Integer.valueOf(this.f8183a), Integer.valueOf(this.f8186d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f8186d != -1) {
            sb.append(" stream=");
            sb.append(this.f8186d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i = this.f8183a;
        int i8 = AudioAttributesCompat.f8179b;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                str = "USAGE_GAME";
                break;
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                str = "USAGE_ASSISTANT";
                break;
            default:
                str = g.m(i, "unknown usage ");
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f8184b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f8185c).toUpperCase());
        return sb.toString();
    }
}
