package B;

import a0.j;
import a0.k;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.concurrent.Executor;

public final /* synthetic */ class I implements k {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ K f154U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Executor f155V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ W f156W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Matrix f157X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ W f158Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Rect f159Z;

    /* renamed from: a0  reason: collision with root package name */
    public final /* synthetic */ B f160a0;

    public /* synthetic */ I(K k8, Executor executor, W w2, Matrix matrix, W w4, Rect rect, B b8) {
        this.f154U = k8;
        this.f155V = executor;
        this.f156W = w2;
        this.f157X = matrix;
        this.f158Y = w4;
        this.f159Z = rect;
        this.f160a0 = b8;
    }

    public final Object h(j jVar) {
        this.f155V.execute(new J(this.f154U, this.f156W, this.f157X, this.f158Y, this.f159Z, this.f160a0, jVar));
        return "analyzeImage";
    }
}
