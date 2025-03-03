package R0;

import P0.z;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class r extends C0158c {

    /* renamed from: Y  reason: collision with root package name */
    public RandomAccessFile f4308Y;

    /* renamed from: Z  reason: collision with root package name */
    public Uri f4309Z;

    /* renamed from: a0  reason: collision with root package name */
    public long f4310a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f4311b0;

    public final void close() {
        this.f4309Z = null;
        try {
            RandomAccessFile randomAccessFile = this.f4308Y;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f4308Y = null;
            if (this.f4311b0) {
                this.f4311b0 = false;
                e();
            }
        } catch (IOException e) {
            throw new i(e, 2000);
        } catch (Throwable th) {
            this.f4308Y = null;
            if (this.f4311b0) {
                this.f4311b0 = false;
                e();
            }
            throw th;
        }
    }

    public final long f(l lVar) {
        Uri uri = lVar.f4277a;
        long j7 = lVar.e;
        this.f4309Z = uri;
        g();
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f4308Y = randomAccessFile;
            try {
                randomAccessFile.seek(j7);
                long j8 = lVar.f4281f;
                if (j8 == -1) {
                    j8 = this.f4308Y.length() - j7;
                }
                this.f4310a0 = j8;
                if (j8 >= 0) {
                    this.f4311b0 = true;
                    h(lVar);
                    return this.f4310a0;
                }
                throw new i((String) null, (Exception) null, 2008);
            } catch (IOException e) {
                throw new i(e, 2000);
            }
        } catch (FileNotFoundException e8) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                String path2 = uri.getPath();
                String query = uri.getQuery();
                String fragment = uri.getFragment();
                throw new i("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + path2 + ",query=" + query + ",fragment=" + fragment, e8, 1004);
            }
            if (!(e8.getCause() instanceof ErrnoException) || ((ErrnoException) e8.getCause()).errno != OsConstants.EACCES) {
                i = 2005;
            }
            throw new i(e8, i);
        } catch (SecurityException e9) {
            throw new i(e9, 2006);
        } catch (RuntimeException e10) {
            throw new i(e10, 2000);
        }
    }

    public final Uri p() {
        return this.f4309Z;
    }

    public final int x(byte[] bArr, int i, int i8) {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.f4310a0;
        if (j7 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f4308Y;
            int i9 = z.f3748a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j7, (long) i8));
            if (read > 0) {
                this.f4310a0 -= (long) read;
                b(read);
            }
            return read;
        } catch (IOException e) {
            throw new i(e, 2000);
        }
    }
}
