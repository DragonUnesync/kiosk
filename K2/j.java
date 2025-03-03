package K2;

import B2.g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import org.altbeacon.bluetooth.Pdu;

public final class j implements l, g, com.bumptech.glide.load.data.g {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2615U;

    /* renamed from: V  reason: collision with root package name */
    public final ByteBuffer f2616V;

    public j(int i) {
        this.f2615U = i;
        switch (i) {
            case 3:
                this.f2616V = ByteBuffer.allocate(4);
                return;
            default:
                this.f2616V = ByteBuffer.allocate(8);
                return;
        }
    }

    private final void e(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l8 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f2616V) {
            this.f2616V.position(0);
            messageDigest.update(this.f2616V.putLong(l8.longValue()).array());
        }
    }

    public int I() {
        return (q() << 8) | q();
    }

    public int U(int i, byte[] bArr) {
        ByteBuffer byteBuffer = this.f2616V;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    public Object a() {
        ByteBuffer byteBuffer = this.f2616V;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public void b() {
    }

    public void c(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f2615U) {
            case 2:
                e(bArr, obj, messageDigest);
                return;
            default:
                Integer num = (Integer) obj;
                if (num != null) {
                    messageDigest.update(bArr);
                    synchronized (this.f2616V) {
                        this.f2616V.position(0);
                        messageDigest.update(this.f2616V.putInt(num.intValue()).array());
                    }
                    return;
                }
                return;
        }
    }

    public short d(int i) {
        ByteBuffer byteBuffer = this.f2616V;
        if (byteBuffer.remaining() - i >= 2) {
            return byteBuffer.getShort(i);
        }
        return -1;
    }

    public short q() {
        ByteBuffer byteBuffer = this.f2616V;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & Pdu.MANUFACTURER_DATA_PDU_TYPE);
        }
        throw new k();
    }

    public long skip(long j7) {
        ByteBuffer byteBuffer = this.f2616V;
        int min = (int) Math.min((long) byteBuffer.remaining(), j7);
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }

    public j(int i, byte[] bArr) {
        this.f2615U = 1;
        this.f2616V = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
    }

    public j(int i, ByteBuffer byteBuffer) {
        this.f2615U = i;
        switch (i) {
            case 4:
                this.f2616V = byteBuffer;
                return;
            default:
                this.f2616V = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                return;
        }
    }
}
