package R0;

import P0.z;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: R0.b  reason: case insensitive filesystem */
public final class C0157b extends C0158c {

    /* renamed from: Y  reason: collision with root package name */
    public final AssetManager f4245Y;

    /* renamed from: Z  reason: collision with root package name */
    public Uri f4246Z;

    /* renamed from: a0  reason: collision with root package name */
    public InputStream f4247a0;

    /* renamed from: b0  reason: collision with root package name */
    public long f4248b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f4249c0;

    public C0157b(Context context) {
        super(false);
        this.f4245Y = context.getAssets();
    }

    public final void close() {
        this.f4246Z = null;
        try {
            InputStream inputStream = this.f4247a0;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f4247a0 = null;
            if (this.f4249c0) {
                this.f4249c0 = false;
                e();
            }
        } catch (IOException e) {
            throw new i(e, 2000);
        } catch (Throwable th) {
            this.f4247a0 = null;
            if (this.f4249c0) {
                this.f4249c0 = false;
                e();
            }
            throw th;
        }
    }

    public final long f(l lVar) {
        int i;
        try {
            Uri uri = lVar.f4277a;
            long j7 = lVar.e;
            this.f4246Z = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            g();
            InputStream open = this.f4245Y.open(path, 1);
            this.f4247a0 = open;
            if (open.skip(j7) >= j7) {
                long j8 = lVar.f4281f;
                if (j8 != -1) {
                    this.f4248b0 = j8;
                } else {
                    long available = (long) this.f4247a0.available();
                    this.f4248b0 = available;
                    if (available == 2147483647L) {
                        this.f4248b0 = -1;
                    }
                }
                this.f4249c0 = true;
                h(lVar);
                return this.f4248b0;
            }
            throw new i((Exception) null, 2008);
        } catch (C0156a e) {
            throw e;
        } catch (IOException e8) {
            if (e8 instanceof FileNotFoundException) {
                i = 2005;
            } else {
                i = 2000;
            }
            throw new i(e8, i);
        }
    }

    public final Uri p() {
        return this.f4246Z;
    }

    public final int x(byte[] bArr, int i, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f4248b0;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, (long) i8);
            } catch (IOException e) {
                throw new i(e, 2000);
            }
        }
        InputStream inputStream = this.f4247a0;
        int i9 = z.f3748a;
        int read = inputStream.read(bArr, i, i8);
        if (read == -1) {
            return -1;
        }
        long j8 = this.f4248b0;
        if (j8 != -1) {
            this.f4248b0 = j8 - ((long) read);
        }
        b(read);
        return read;
    }
}
