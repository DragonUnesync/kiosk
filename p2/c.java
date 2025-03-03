package P2;

import B2.i;
import D2.D;
import G5.q;
import K2.z;
import O2.g;
import W2.b;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class c implements a {

    /* renamed from: V  reason: collision with root package name */
    public static final c f3772V = new c(0);

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3773U;

    public /* synthetic */ c(int i) {
        this.f3773U = i;
    }

    public final D d(D d8, i iVar) {
        q qVar;
        byte[] bArr;
        switch (this.f3773U) {
            case 0:
                return d8;
            default:
                ByteBuffer asReadOnlyBuffer = ((g) ((O2.c) d8.get()).f3610U.f3609b).f3625a.f62d.asReadOnlyBuffer();
                AtomicReference atomicReference = b.f6155a;
                if (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) {
                    qVar = null;
                } else {
                    qVar = new q(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
                }
                if (qVar != null && qVar.f1721b == 0 && qVar.f1722c == qVar.f1720a.length) {
                    bArr = asReadOnlyBuffer.array();
                } else {
                    ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
                    ByteBuffer byteBuffer = (ByteBuffer) asReadOnlyBuffer2.position(0);
                    asReadOnlyBuffer2.get(bArr2);
                    bArr = bArr2;
                }
                return new z(bArr);
        }
    }
}
