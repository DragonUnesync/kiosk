package f0;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public final class n extends View {
    public n(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final void draw(Canvas canvas) {
    }

    public final void onMeasure(int i, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        C0877e eVar = (C0877e) getLayoutParams();
        eVar.f11331a = i;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i) {
        C0877e eVar = (C0877e) getLayoutParams();
        eVar.f11333b = i;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f8) {
        C0877e eVar = (C0877e) getLayoutParams();
        eVar.f11335c = f8;
        setLayoutParams(eVar);
    }

    public void setVisibility(int i) {
    }
}
