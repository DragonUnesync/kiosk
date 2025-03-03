package k0;

import B.C0019u;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import java.util.concurrent.Executor;
import o.C1260b0;

/* renamed from: k0.a  reason: case insensitive filesystem */
public abstract class C1131a {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static String[] c(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static Executor d(Context context) {
        return context.getMainExecutor();
    }

    public static int e(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int h(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int i(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int j(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params k(C1260b0 b0Var) {
        return b0Var.getTextMetricsParams();
    }

    public static boolean l(Handler handler, C0019u uVar, long j7) {
        return handler.postDelayed(uVar, "retry_token", j7);
    }

    public static void m(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static boolean n(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
