package f1;

import D.A;
import E.e;
import H3.O;
import P0.l;
import a1.C0412c;
import android.os.Handler;
import de.ozerov.fully.K2;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import l1.m;

public final class u implements m {

    /* renamed from: U  reason: collision with root package name */
    public final DataInputStream f11617U;

    /* renamed from: V  reason: collision with root package name */
    public final A f11618V;

    /* renamed from: W  reason: collision with root package name */
    public volatile boolean f11619W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ w f11620X;

    /* JADX WARNING: type inference failed for: r1v2, types: [D.A, java.lang.Object] */
    public u(w wVar, InputStream inputStream) {
        this.f11620X = wVar;
        this.f11617U = new DataInputStream(inputStream);
        ? obj = new Object();
        obj.f740c = new ArrayList();
        obj.f738a = 1;
        this.f11618V = obj;
    }

    public final void c() {
        boolean z;
        boolean z6;
        String str;
        while (!this.f11619W) {
            byte readByte = this.f11617U.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.f11617U.readUnsignedByte();
                int readUnsignedShort = this.f11617U.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.f11617U.readFully(bArr, 0, readUnsignedShort);
                C0886E e = (C0886E) this.f11620X.f11628W.get(Integer.valueOf(readUnsignedByte));
                if (e != null && !this.f11620X.f11631Z) {
                    e.f11492Y.add(bArr);
                }
            } else if (!this.f11620X.f11631Z) {
                K2 k22 = this.f11620X.f11626U;
                A a8 = this.f11618V;
                DataInputStream dataInputStream = this.f11617U;
                a8.getClass();
                O a9 = a8.a(A.b(readByte, dataInputStream));
                while (a9 == null) {
                    if (a8.f738a == 3) {
                        long j7 = a8.f739b;
                        if (j7 > 0) {
                            int c8 = e.c(j7);
                            if (c8 != -1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            l.j(z);
                            byte[] bArr2 = new byte[c8];
                            dataInputStream.readFully(bArr2, 0, c8);
                            if (a8.f738a == 3) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            l.j(z6);
                            if (c8 > 0) {
                                int i = c8 - 1;
                                if (bArr2[i] == 10) {
                                    if (c8 > 1) {
                                        int i8 = c8 - 2;
                                        if (bArr2[i8] == 13) {
                                            str = new String(bArr2, 0, i8, w.f11625a0);
                                            ArrayList arrayList = (ArrayList) a8.f740c;
                                            arrayList.add(str);
                                            a9 = O.m(arrayList);
                                            ((ArrayList) a8.f740c).clear();
                                            a8.f738a = 1;
                                            a8.f739b = 0;
                                        }
                                    }
                                    str = new String(bArr2, 0, i, w.f11625a0);
                                    ArrayList arrayList2 = (ArrayList) a8.f740c;
                                    arrayList2.add(str);
                                    a9 = O.m(arrayList2);
                                    ((ArrayList) a8.f740c).clear();
                                    a8.f738a = 1;
                                    a8.f739b = 0;
                                }
                            }
                            throw new IllegalArgumentException("Message body is empty or does not end with a LF.");
                        }
                        throw new IllegalStateException("Expects a greater than zero Content-Length.");
                    }
                    a9 = a8.a(A.b(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) k22.f10050V).post(new C0412c((Object) k22, 6, (Object) a9));
            } else {
                continue;
            }
        }
    }

    public final void e() {
        this.f11619W = true;
    }
}
