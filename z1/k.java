package Z1;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final int f6967a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6968b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6969c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6970d;

    public k(int i, int i8, long j7, long j8) {
        this.f6967a = i;
        this.f6968b = i8;
        this.f6969c = j7;
        this.f6970d = j8;
    }

    public static k a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f6967a);
            dataOutputStream.writeInt(this.f6968b);
            dataOutputStream.writeLong(this.f6969c);
            dataOutputStream.writeLong(this.f6970d);
            dataOutputStream.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f6968b == kVar.f6968b && this.f6969c == kVar.f6969c && this.f6967a == kVar.f6967a && this.f6970d == kVar.f6970d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f6968b), Long.valueOf(this.f6969c), Integer.valueOf(this.f6967a), Long.valueOf(this.f6970d)});
    }
}
