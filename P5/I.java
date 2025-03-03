package P5;

import java.io.FilterOutputStream;

public final class I extends FilterOutputStream {
    public final void k() {
        this.out.write("0\r\n\r\n".getBytes());
    }

    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i8) {
        if (i8 != 0) {
            this.out.write(String.format("%x\r\n", new Object[]{Integer.valueOf(i8)}).getBytes());
            this.out.write(bArr, i, i8);
            this.out.write("\r\n".getBytes());
        }
    }
}
