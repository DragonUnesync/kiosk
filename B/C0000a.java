package B;

import A.f;
import D.H0;
import android.graphics.Matrix;
import android.media.Image;

/* renamed from: B.a  reason: case insensitive filesystem */
public final class C0000a implements W {

    /* renamed from: U  reason: collision with root package name */
    public final Image f208U;

    /* renamed from: V  reason: collision with root package name */
    public final f[] f209V;

    /* renamed from: W  reason: collision with root package name */
    public final C0006g f210W;

    public C0000a(Image image) {
        this.f208U = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f209V = new f[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f209V[i] = new f(2, (Object) planes[i]);
            }
        } else {
            this.f209V = new f[0];
        }
        this.f210W = new C0006g(H0.f784b, image.getTimestamp(), 0, new Matrix());
    }

    public final int b() {
        return this.f208U.getHeight();
    }

    public final int c() {
        return this.f208U.getWidth();
    }

    public final void close() {
        this.f208U.close();
    }

    public final f[] d() {
        return this.f209V;
    }

    public final U e() {
        return this.f210W;
    }

    public final Image g() {
        return this.f208U;
    }

    public final int getFormat() {
        return this.f208U.getFormat();
    }
}
