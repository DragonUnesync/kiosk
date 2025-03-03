package q4;

import B6.a;
import D.s0;
import D.y0;
import D7.b;
import F.e;
import F.i;
import M0.C0113a;
import android.hardware.camera2.CameraCharacteristics;
import android.media.CamcorderProfile;
import android.os.Build;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.lifecycle.c;
import com.samsung.android.knox.EnterpriseDeviceManager;
import s4.f;
import u.C1467h;
import u.e0;

public final class k implements a, e0 {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f14778U;

    public /* synthetic */ k(int i) {
        this.f14778U = i;
    }

    public void a(y0 y0Var) {
    }

    public void b(boolean z) {
    }

    public void c(boolean z) {
    }

    public CamcorderProfile d(int i, int i8) {
        switch (this.f14778U) {
            case 23:
                return CamcorderProfile.get(i, i8);
            default:
                return CamcorderProfile.get(i, i8);
        }
    }

    public boolean e(int i, int i8) {
        switch (this.f14778U) {
            case 23:
                return CamcorderProfile.hasProfile(i, i8);
            default:
                return CamcorderProfile.hasProfile(i, i8);
        }
    }

    public Object get() {
        switch (this.f14778U) {
            case 0:
                return new Object();
            case 1:
                return new Object();
            case 2:
                return new Object();
            case 3:
                return new Object();
            case 4:
                return new f(1);
            case 5:
                return new Object();
            case 6:
                return new f(0);
            case 7:
                return new f(0);
            case 8:
                return new f(0);
            case 9:
                return new f(0);
            case 10:
                return new f(1);
            case 11:
                return new f(1);
            case 12:
                return new f(1);
            case 13:
                return new f(2);
            case EnterpriseDeviceManager.KNOX_2_3:
                return new f(2);
            case EnterpriseDeviceManager.KNOX_2_4:
                return new f(2);
            case EnterpriseDeviceManager.KNOX_2_4_1:
                return new f(2);
            case EnterpriseDeviceManager.KNOX_2_5:
                return new f(2);
            case EnterpriseDeviceManager.KNOX_2_5_1:
                return new f(2);
            case EnterpriseDeviceManager.KNOX_2_6:
                return new f(2);
            case EnterpriseDeviceManager.KNOX_2_7:
                return new f(2);
            default:
                return new f(2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [M0.a, v0.r] */
    public k(View view) {
        this.f14778U = 27;
        if (Build.VERSION.SDK_INT >= 30) {
            new C0113a(view).f15963b = view;
        } else {
            new C0113a(view);
        }
    }

    public k(C1467h hVar, v.k kVar, s0 s0Var, i iVar, e eVar) {
        this.f14778U = 24;
        Integer num = (Integer) kVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            int intValue = num.intValue();
        }
        s0Var.h(UseTorchAsFlashQuirk.class);
        b.C(new c(18, kVar));
    }
}
