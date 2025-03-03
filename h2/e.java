package H2;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import g7.C0996d;
import java.io.IOException;
import java.io.InputStream;

public final class e implements com.bumptech.glide.load.data.e {

    /* renamed from: U  reason: collision with root package name */
    public final Resources.Theme f1950U;

    /* renamed from: V  reason: collision with root package name */
    public final Resources f1951V;

    /* renamed from: W  reason: collision with root package name */
    public final Object f1952W;

    /* renamed from: X  reason: collision with root package name */
    public final int f1953X;

    /* renamed from: Y  reason: collision with root package name */
    public Object f1954Y;

    public e(Resources.Theme theme, Resources resources, F2.e eVar, int i) {
        this.f1950U = theme;
        this.f1951V = resources;
        this.f1952W = eVar;
        this.f1953X = i;
    }

    public final Class a() {
        switch (((F2.e) this.f1952W).f1520U) {
            case 1:
                return AssetFileDescriptor.class;
            case 2:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    public final void b() {
        Object obj = this.f1954Y;
        if (obj != null) {
            try {
                switch (((F2.e) this.f1952W).f1520U) {
                    case 1:
                        ((AssetFileDescriptor) obj).close();
                        return;
                    case 2:
                        Drawable drawable = (Drawable) obj;
                        return;
                    default:
                        ((InputStream) obj).close();
                        return;
                }
            } catch (IOException unused) {
            }
        }
    }

    public final void cancel() {
    }

    public final int e() {
        return 1;
    }

    public final void f(f fVar, d dVar) {
        Object obj;
        try {
            Object obj2 = this.f1952W;
            Resources.Theme theme = this.f1950U;
            Resources resources = this.f1951V;
            int i = this.f1953X;
            F2.e eVar = (F2.e) obj2;
            switch (eVar.f1520U) {
                case 1:
                    obj = resources.openRawResourceFd(i);
                    break;
                case 2:
                    Context context = eVar.f1521V;
                    obj = C0996d.h(context, context, i, theme);
                    break;
                default:
                    obj = resources.openRawResource(i);
                    break;
            }
            this.f1954Y = obj;
            dVar.d(obj);
        } catch (Resources.NotFoundException e) {
            dVar.c(e);
        }
    }
}
