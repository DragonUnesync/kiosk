package H2;

import B2.b;
import B2.i;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class z implements r, b {

    /* renamed from: V  reason: collision with root package name */
    public static final z f1999V = new z(0);

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f2000U;

    public /* synthetic */ z(int i) {
        this.f2000U = i;
    }

    public static ByteArrayInputStream a(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf == -1) {
                throw new IllegalArgumentException("Missing comma in data URL.");
            } else if (str.substring(0, indexOf).endsWith(";base64")) {
                return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
            } else {
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        } else {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
    }

    public Class b() {
        switch (this.f2000U) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    public boolean e(Object obj, File file, i iVar) {
        try {
            W2.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            return false;
        }
    }

    public q m0(w wVar) {
        switch (this.f2000U) {
            case 0:
                return A.f1933b;
            case 2:
                return new C0082c(0, new z(1));
            case 4:
                return new C0082c(0, new z(3));
            case 6:
                return new A(1);
            case 11:
                return new y(wVar.b(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new y(wVar.b(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new y(wVar.b(Uri.class, InputStream.class), 0);
            default:
                return new D(wVar.b(g.class, InputStream.class));
        }
    }
}
