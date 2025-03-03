package de.ozerov.fully;

import M0.C;
import M0.F;
import M0.H;
import M0.K;
import M0.L;
import M0.M;
import M0.N;
import M0.O;
import M0.P;
import M0.c0;
import M0.e0;
import M0.h0;
import O0.c;
import T0.C0232y;
import android.util.Log;
import androidx.media3.ui.PlayerView;
import java.util.List;

public final class J4 implements O {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ K4 f10036U;

    public J4(K4 k42) {
        this.f10036U = k42;
    }

    public final /* synthetic */ void A(boolean z) {
    }

    public final /* synthetic */ void B(int i, int i8) {
    }

    public final /* synthetic */ void C(F f8) {
    }

    public final /* synthetic */ void D(H h5) {
    }

    public final /* synthetic */ void E(h0 h0Var) {
    }

    public final /* synthetic */ void F(boolean z) {
    }

    public final /* synthetic */ void a(int i) {
    }

    public final /* synthetic */ void b(int i) {
    }

    public final /* synthetic */ void c(e0 e0Var) {
    }

    public final /* synthetic */ void d(c cVar) {
    }

    public final /* synthetic */ void e(K k8) {
    }

    public final /* synthetic */ void f(int i) {
    }

    public final /* synthetic */ void h(c0 c0Var) {
    }

    public final /* synthetic */ void i(boolean z) {
    }

    public final /* synthetic */ void j() {
    }

    public final /* synthetic */ void l(boolean z) {
    }

    public final /* synthetic */ void m(int i, P p3, P p8) {
    }

    public final /* synthetic */ void n(List list) {
    }

    public final /* synthetic */ void o(int i, boolean z) {
    }

    public final /* synthetic */ void p(int i, boolean z) {
    }

    public final /* synthetic */ void q(C c8, int i) {
    }

    public final /* synthetic */ void t(N n4) {
    }

    public final void v(K k8) {
        String str;
        int i = k8.f2843U;
        if (i == -100) {
            str = "ERROR_CODE_DISCONNECTED";
        } else if (i == -6) {
            str = "ERROR_CODE_NOT_SUPPORTED";
        } else if (i == -4) {
            str = "ERROR_CODE_PERMISSION_DENIED";
        } else if (i == -3) {
            str = "ERROR_CODE_BAD_VALUE";
        } else if (i == -2) {
            str = "ERROR_CODE_INVALID_STATE";
        } else if (i == 7000) {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        } else if (i != 7001) {
            switch (i) {
                case -110:
                    str = "ERROR_CODE_CONTENT_ALREADY_PLAYING";
                    break;
                case -109:
                    str = "ERROR_CODE_END_OF_PLAYLIST";
                    break;
                case -108:
                    str = "ERROR_CODE_SETUP_REQUIRED";
                    break;
                case -107:
                    str = "ERROR_CODE_SKIP_LIMIT_REACHED";
                    break;
                case -106:
                    str = "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
                    break;
                case -105:
                    str = "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
                    break;
                case -104:
                    str = "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
                    break;
                case -103:
                    str = "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
                    break;
                case -102:
                    str = "ERROR_CODE_AUTHENTICATION_EXPIRED";
                    break;
                default:
                    switch (i) {
                        case 1000:
                            str = "ERROR_CODE_UNSPECIFIED";
                            break;
                        case 1001:
                            str = "ERROR_CODE_REMOTE_ERROR";
                            break;
                        case 1002:
                            str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                            break;
                        case 1003:
                            str = "ERROR_CODE_TIMEOUT";
                            break;
                        case 1004:
                            str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                            break;
                        default:
                            switch (i) {
                                case 2000:
                                    str = "ERROR_CODE_IO_UNSPECIFIED";
                                    break;
                                case 2001:
                                    str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                    break;
                                case 2002:
                                    str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                    break;
                                case 2003:
                                    str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                    break;
                                case 2004:
                                    str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                    break;
                                case 2005:
                                    str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                    break;
                                case 2006:
                                    str = "ERROR_CODE_IO_NO_PERMISSION";
                                    break;
                                case 2007:
                                    str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                    break;
                                case 2008:
                                    str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                    break;
                                default:
                                    switch (i) {
                                        case 3001:
                                            str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                            break;
                                        case 3002:
                                            str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                            break;
                                        case 3003:
                                            str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                            break;
                                        case 3004:
                                            str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                            break;
                                        default:
                                            switch (i) {
                                                case 4001:
                                                    str = "ERROR_CODE_DECODER_INIT_FAILED";
                                                    break;
                                                case 4002:
                                                    str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                    break;
                                                case 4003:
                                                    str = "ERROR_CODE_DECODING_FAILED";
                                                    break;
                                                case 4004:
                                                    str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                    break;
                                                case 4005:
                                                    str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                    break;
                                                case 4006:
                                                    str = "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 5001:
                                                            str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                            break;
                                                        case 5002:
                                                            str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                            break;
                                                        case 5003:
                                                            str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                            break;
                                                        case 5004:
                                                            str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                            break;
                                                        default:
                                                            switch (i) {
                                                                case 6000:
                                                                    str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                                    break;
                                                                case 6001:
                                                                    str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                                    break;
                                                                case 6002:
                                                                    str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                                    break;
                                                                case 6003:
                                                                    str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                                    break;
                                                                case 6004:
                                                                    str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                                    break;
                                                                case 6005:
                                                                    str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                                    break;
                                                                case 6006:
                                                                    str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                                    break;
                                                                case 6007:
                                                                    str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                                    break;
                                                                case 6008:
                                                                    str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                                    break;
                                                                default:
                                                                    if (i < 1000000) {
                                                                        str = "invalid error code";
                                                                        break;
                                                                    } else {
                                                                        str = "custom error code";
                                                                        break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        Log.w("K4", "onPlayerError: ".concat(str));
        C0716j jVar = this.f10036U.f10060j;
        if (jVar != null) {
            jVar.a();
        }
    }

    public final void w(int i) {
        C0716j jVar;
        K4 k42 = this.f10036U;
        if (!k42.i && i == 3 && k42.f10062l != null) {
            PlayerView playerView = k42.f10056d;
            playerView.setControllerShowTimeoutMs(2000);
            playerView.setControllerAutoShow(false);
            playerView.i(playerView.h());
            k42.f10062l.c();
            k42.i = true;
        }
        if (i == 4 && (jVar = k42.f10061k) != null) {
            C0740n nVar = jVar.f10729a;
            if (nVar.f10833q) {
                K4 k43 = nVar.f10821c;
                if (k43.e == 1) {
                    k43.f10053a.seekTo((int) 0);
                } else {
                    C0232y yVar = k43.f10055c;
                    yVar.getClass();
                    yVar.k(0, yVar.v(), false);
                }
                k43.d();
            } else if (nVar.f10837u) {
                nVar.p();
            }
        }
    }

    public final /* synthetic */ void y(M m8) {
    }

    public final /* synthetic */ void z(L l8) {
    }
}
