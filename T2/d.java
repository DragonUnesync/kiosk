package T2;

import W2.f;
import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static Integer f4989d;

    /* renamed from: a  reason: collision with root package name */
    public final View f4990a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f4991b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public c f4992c;

    public d(View view) {
        this.f4990a = view;
    }

    public final int a(int i, int i8, int i9) {
        int i10 = i8 - i9;
        if (i10 > 0) {
            return i10;
        }
        int i11 = i - i9;
        if (i11 > 0) {
            return i11;
        }
        View view = this.f4990a;
        if (view.isLayoutRequested() || i8 != -2) {
            return 0;
        }
        if (Log.isLoggable("CustomViewTarget", 4)) {
            Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f4989d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            f.c(windowManager, "Argument must not be null");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f4989d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f4989d.intValue();
    }
}
