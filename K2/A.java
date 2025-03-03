package K2;

import B2.i;
import B2.k;
import D2.D;
import M2.b;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

public final class A implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2590a;

    public /* synthetic */ A(int i) {
        this.f2590a = i;
    }

    public final D a(Object obj, int i, int i8, i iVar) {
        switch (this.f2590a) {
            case 0:
                return new z(0, (Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new b(drawable, 0);
                }
                return null;
            default:
                return new z((File) obj);
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, i iVar) {
        switch (this.f2590a) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                return true;
            case 1:
                Drawable drawable = (Drawable) obj;
                return true;
            default:
                File file = (File) obj;
                return true;
        }
    }
}
