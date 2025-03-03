package o;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: o.e0  reason: case insensitive filesystem */
public final class C1266e0 extends C1264d0 {
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
