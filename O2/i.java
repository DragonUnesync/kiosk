package O2;

import B2.k;
import D2.D;
import E2.g;
import N7.a;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class i implements k {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3641a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3642b;

    /* renamed from: c  reason: collision with root package name */
    public final g f3643c;

    public i(ArrayList arrayList, a aVar, g gVar) {
        this.f3641a = arrayList;
        this.f3642b = aVar;
        this.f3643c = gVar;
    }

    public final D a(Object obj, int i, int i8, B2.i iVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f3642b.a(ByteBuffer.wrap(bArr), i, i8, iVar);
    }

    public final boolean b(Object obj, B2.i iVar) {
        InputStream inputStream = (InputStream) obj;
        if (((Boolean) iVar.c(h.f3640b)).booleanValue() || a.n(this.f3641a, inputStream, this.f3643c) != ImageHeaderParser$ImageType.GIF) {
            return false;
        }
        return true;
    }
}
