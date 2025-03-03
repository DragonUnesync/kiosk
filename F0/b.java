package F0;

import android.util.Log;
import j$.io.DesugarInputStream;
import j$.io.InputStreamRetargetInterface;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteOrder;
import u.C1477r;

public class b extends InputStream implements DataInput, InputStreamRetargetInterface {

    /* renamed from: Y  reason: collision with root package name */
    public static final ByteOrder f1422Y = ByteOrder.LITTLE_ENDIAN;

    /* renamed from: Z  reason: collision with root package name */
    public static final ByteOrder f1423Z = ByteOrder.BIG_ENDIAN;

    /* renamed from: U  reason: collision with root package name */
    public final DataInputStream f1424U;

    /* renamed from: V  reason: collision with root package name */
    public ByteOrder f1425V;

    /* renamed from: W  reason: collision with root package name */
    public int f1426W;

    /* renamed from: X  reason: collision with root package name */
    public byte[] f1427X;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final int available() {
        return this.f1424U.available();
    }

    public final void k(int i) {
        int i8 = 0;
        while (i8 < i) {
            DataInputStream dataInputStream = this.f1424U;
            int i9 = i - i8;
            int skip = (int) dataInputStream.skip((long) i9);
            if (skip <= 0) {
                if (this.f1427X == null) {
                    this.f1427X = new byte[8192];
                }
                skip = dataInputStream.read(this.f1427X, 0, Math.min(8192, i9));
                if (skip == -1) {
                    throw new EOFException(C1477r.c(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i8 += skip;
        }
        this.f1426W += i8;
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    public final int read() {
        this.f1426W++;
        return this.f1424U.read();
    }

    public final boolean readBoolean() {
        this.f1426W++;
        return this.f1424U.readBoolean();
    }

    public final byte readByte() {
        this.f1426W++;
        int read = this.f1424U.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.f1426W += 2;
        return this.f1424U.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr, int i, int i8) {
        this.f1426W += i8;
        this.f1424U.readFully(bArr, i, i8);
    }

    public final int readInt() {
        this.f1426W += 4;
        DataInputStream dataInputStream = this.f1424U;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f1425V;
            if (byteOrder == f1422Y) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f1423Z) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f1425V);
        }
        throw new EOFException();
    }

    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    public final long readLong() {
        this.f1426W += 8;
        DataInputStream dataInputStream = this.f1424U;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f1425V;
            if (byteOrder == f1422Y) {
                return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
            }
            int i = read;
            if (byteOrder == f1423Z) {
                return (((long) i) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
            }
            throw new IOException("Invalid byte order: " + this.f1425V);
        }
        throw new EOFException();
    }

    public final short readShort() {
        this.f1426W += 2;
        DataInputStream dataInputStream = this.f1424U;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f1425V;
            if (byteOrder == f1422Y) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f1423Z) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f1425V);
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.f1426W += 2;
        return this.f1424U.readUTF();
    }

    public final int readUnsignedByte() {
        this.f1426W++;
        return this.f1424U.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        this.f1426W += 2;
        DataInputStream dataInputStream = this.f1424U;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f1425V;
            if (byteOrder == f1422Y) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f1423Z) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f1425V);
        }
        throw new EOFException();
    }

    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        this.f1425V = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f1424U = dataInputStream;
        dataInputStream.mark(0);
        this.f1426W = 0;
        this.f1425V = byteOrder;
    }

    public final int read(byte[] bArr, int i, int i8) {
        int read = this.f1424U.read(bArr, i, i8);
        this.f1426W += read;
        return read;
    }

    public final void readFully(byte[] bArr) {
        this.f1426W += bArr.length;
        this.f1424U.readFully(bArr);
    }
}
