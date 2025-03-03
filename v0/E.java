package V0;

import N0.b;
import N0.c;
import N0.e;
import java.nio.ByteBuffer;
import org.altbeacon.bluetooth.Pdu;

public final class E extends e {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void l(int i8, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (((double) i8) * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public final void e(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i8 = limit - position;
        int i9 = this.f3238b.f3235c;
        if (i9 == 21) {
            byteBuffer2 = k((i8 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | ((byteBuffer.get(position + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((byteBuffer.get(position + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i9 == 22) {
            byteBuffer2 = k(i8);
            while (position < limit) {
                l((byteBuffer.get(position) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((byteBuffer.get(position + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | ((byteBuffer.get(position + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((byteBuffer.get(position + 3) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24), byteBuffer2);
                position += 4;
            }
        } else if (i9 == 1342177280) {
            byteBuffer2 = k((i8 / 3) * 4);
            while (position < limit) {
                l(((byteBuffer.get(position + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | ((byteBuffer.get(position + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((byteBuffer.get(position) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i9 == 1610612736) {
            byteBuffer2 = k(i8);
            while (position < limit) {
                l((byteBuffer.get(position + 3) & Pdu.MANUFACTURER_DATA_PDU_TYPE) | ((byteBuffer.get(position + 2) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 8) | ((byteBuffer.get(position + 1) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 16) | ((byteBuffer.get(position) & Pdu.MANUFACTURER_DATA_PDU_TYPE) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public final b g(b bVar) {
        int i8 = bVar.f3235c;
        if (i8 != 21 && i8 != 1342177280 && i8 != 22 && i8 != 1610612736 && i8 != 4) {
            throw new c(bVar);
        } else if (i8 != 4) {
            return new b(bVar.f3233a, bVar.f3234b, 4);
        } else {
            return b.e;
        }
    }
}
