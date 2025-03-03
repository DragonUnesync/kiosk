package D2;

import B2.c;
import B2.i;
import K2.z;
import M0.C0123k;
import P0.r;
import P2.a;
import Q0.g;
import S0.f;
import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.View;
import c1.t;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.samsung.android.knox.EnterpriseDeviceManager;
import f1.o;
import f1.p;
import h1.X;
import h1.Y;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.ToIntFunction;
import org.altbeacon.bluetooth.Pdu;
import p1.l;
import w0.C1586o;
import y2.C1630e;

public final class j implements a, t, Y, C1586o {

    /* renamed from: U  reason: collision with root package name */
    public int f1093U;

    /* renamed from: V  reason: collision with root package name */
    public Object f1094V;

    public /* synthetic */ j(int i, Serializable serializable) {
        this.f1093U = i;
        this.f1094V = serializable;
    }

    public void a() {
        c cVar = ((p) this.f1094V).f11596f0;
        if (cVar != null) {
            throw cVar;
        }
    }

    public boolean b(View view) {
        ((BottomSheetBehavior) this.f1094V).B(this.f1093U);
        return true;
    }

    public MediaCodecInfo c(int i) {
        if (((MediaCodecInfo[]) this.f1094V) == null) {
            this.f1094V = new MediaCodecList(this.f1093U).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f1094V)[i];
    }

    public D d(D d8, i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) d8.get()).compress((Bitmap.CompressFormat) this.f1094V, this.f1093U, byteArrayOutputStream);
        d8.e();
        return new z(byteArrayOutputStream.toByteArray());
    }

    public boolean e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public int f() {
        if (((MediaCodecInfo[]) this.f1094V) == null) {
            this.f1094V = new MediaCodecList(this.f1093U).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f1094V).length;
    }

    public boolean g() {
        p pVar = (p) this.f1094V;
        if (!pVar.f11601k0) {
            o oVar = (o) pVar.f11589Y.get(this.f1093U);
            if (oVar.f11582c.w(oVar.f11583d)) {
                return true;
            }
        }
        return false;
    }

    public boolean h(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public void i(long j7) {
        int i = this.f1093U;
        long[] jArr = (long[]) this.f1094V;
        if (i == jArr.length) {
            this.f1094V = Arrays.copyOf(jArr, i * 2);
        }
        int i8 = this.f1093U;
        this.f1093U = i8 + 1;
        ((long[]) this.f1094V)[i8] = j7;
    }

    public boolean j() {
        return true;
    }

    public void k(long[] jArr) {
        int length = this.f1093U + jArr.length;
        long[] jArr2 = (long[]) this.f1094V;
        if (length > jArr2.length) {
            this.f1094V = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f1094V, this.f1093U, jArr.length);
        this.f1093U = length;
    }

    public int l(R2.c cVar, f fVar, int i) {
        p pVar = (p) this.f1094V;
        if (pVar.f11601k0) {
            return -3;
        }
        o oVar = (o) pVar.f11589Y.get(this.f1093U);
        return oVar.f11582c.B(cVar, fVar, i, oVar.f11583d);
    }

    public void m(int i, int i8) {
        C1630e eVar = (C1630e) this.f1094V;
        int i9 = eVar.f16380W;
        if (i >= i9) {
            for (int i10 = i - i9; i10 >= 0; i10--) {
                eVar.e(-1);
            }
        }
        eVar.g(i, i8);
        int i11 = i8 + 1;
        if (this.f1093U < i11) {
            this.f1093U = i11;
        }
    }

    public long n(int i) {
        if (i >= 0 && i < this.f1093U) {
            return ((long[]) this.f1094V)[i];
        }
        StringBuilder p3 = g.p(i, "Invalid index ", ", size is ");
        p3.append(this.f1093U);
        throw new IndexOutOfBoundsException(p3.toString());
    }

    public int o(long j7) {
        p pVar = (p) this.f1094V;
        if (pVar.f11601k0) {
            return -3;
        }
        o oVar = (o) pVar.f11589Y.get(this.f1093U);
        X x8 = oVar.f11582c;
        int t8 = x8.t(j7, oVar.f11583d);
        x8.H(t8);
        return t8;
    }

    public boolean p() {
        if (this.f1093U < ((ArrayList) this.f1094V).size()) {
            return true;
        }
        return false;
    }

    public long q(l lVar) {
        r rVar = (r) this.f1094V;
        int i = 0;
        lVar.r(rVar.f3732a, 0, 1, false);
        byte b8 = rVar.f3732a[0] & Pdu.MANUFACTURER_DATA_PDU_TYPE;
        if (b8 == 0) {
            return Long.MIN_VALUE;
        }
        int i8 = 128;
        int i9 = 0;
        while ((b8 & i8) == 0) {
            i8 >>= 1;
            i9++;
        }
        int i10 = b8 & (~i8);
        lVar.r(rVar.f3732a, 1, i9, false);
        while (i < i9) {
            i++;
            i10 = (rVar.f3732a[i] & Pdu.MANUFACTURER_DATA_PDU_TYPE) + (i10 << 8);
        }
        this.f1093U = i9 + 1 + this.f1093U;
        return (long) i10;
    }

    public /* synthetic */ j(int i, Object obj) {
        this.f1094V = obj;
        this.f1093U = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public j(int i, byte b8) {
        this(32, 2);
        switch (i) {
            case 2:
                return;
            case 3:
                this.f1094V = Bitmap.CompressFormat.JPEG;
                this.f1093U = 100;
                return;
            default:
                this.f1094V = new r(8);
                return;
        }
    }

    public j(int i, int i8) {
        switch (i8) {
            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                this.f1094V = new C1630e(i);
                return;
            default:
                this.f1094V = new long[i];
                return;
        }
    }

    public j(ToIntFunction toIntFunction) {
        this(16, (Object) toIntFunction);
    }

    public j(int i, C0123k kVar) {
        this.f1093U = i;
        this.f1094V = new C0123k[]{kVar};
    }
}
