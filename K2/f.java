package K2;

import B.q0;
import B2.i;
import B2.k;
import D2.D;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2609a;

    /* renamed from: b  reason: collision with root package name */
    public final p f2610b;

    public /* synthetic */ f(p pVar, int i) {
        this.f2609a = i;
        this.f2610b = pVar;
    }

    public final D a(Object obj, int i, int i8, i iVar) {
        switch (this.f2609a) {
            case 0:
                p pVar = this.f2610b;
                return pVar.a(new q0((Object) (ByteBuffer) obj, (Object) pVar.f2635d, (Object) pVar.f2634c, 7), i, i8, iVar, p.f2630k);
            default:
                p pVar2 = this.f2610b;
                return pVar2.a(new q0((ParcelFileDescriptor) obj, pVar2.f2635d, pVar2.f2634c), i, i8, iVar, p.f2630k);
        }
    }

    public final boolean b(Object obj, i iVar) {
        switch (this.f2609a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                this.f2610b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) || "robolectric".equals(Build.FINGERPRINT)) {
                    return false;
                }
                return true;
        }
    }
}
