package m3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import m0.C1195a;

/* renamed from: m3.a  reason: case insensitive filesystem */
public final class C1209a extends N {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f13348a;

    /* renamed from: b  reason: collision with root package name */
    public final List f13349b = DesugarCollections.unmodifiableList(new ArrayList());

    public C1209a() {
        Paint paint = new Paint();
        this.f13348a = paint;
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, f0 f0Var) {
        onDrawOver(canvas, recyclerView);
        Paint paint = this.f13348a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(2131165462));
        for (C1211c cVar : this.f13349b) {
            cVar.getClass();
            ThreadLocal threadLocal = C1195a.f13315a;
            float f8 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((((float) Color.alpha(-16776961)) * 0.0f) + (((float) Color.alpha(-65281)) * f8)), (int) ((((float) Color.red(-16776961)) * 0.0f) + (((float) Color.red(-65281)) * f8)), (int) ((((float) Color.green(-16776961)) * 0.0f) + (((float) Color.green(-65281)) * f8)), (int) ((((float) Color.blue(-16776961)) * 0.0f) + (((float) Color.blue(-65281)) * f8))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).O0()) {
                canvas.drawLine(0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).f9243k0.i(), 0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).f9243k0.e(), paint);
            } else {
                canvas.drawLine((float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).f9243k0.f(), 0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).f9243k0.g(), 0.0f, paint);
            }
        }
    }
}
