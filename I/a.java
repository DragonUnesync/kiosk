package I;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.text.TextPaint;
import android.util.Size;
import android.view.Surface;
import android.view.inputmethod.InputMethodManager;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import o.C1260b0;
import o.C1306z;

public abstract class a {
    public static void a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static CaptureRequest.Builder b(CameraDevice cameraDevice, TotalCaptureResult totalCaptureResult) {
        return cameraDevice.createReprocessCaptureRequest(totalCaptureResult);
    }

    public static Image c(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static int d(C1260b0 b0Var) {
        return b0Var.getBreakStrategy();
    }

    public static Drawable e(CompoundButton compoundButton) {
        return compoundButton.getButtonDrawable();
    }

    public static int f(Context context, int i) {
        return context.getColor(i);
    }

    public static Size[] g(StreamConfigurationMap streamConfigurationMap, int i) {
        return streamConfigurationMap.getHighResolutionOutputSizes(i);
    }

    public static int h(C1260b0 b0Var) {
        return b0Var.getHyphenationFrequency();
    }

    public static int i(Drawable drawable) {
        return drawable.getLayoutDirection();
    }

    public static Object j(Context context) {
        return context.getSystemService(InputMethodManager.class);
    }

    public static String k(Context context) {
        return context.getSystemServiceName(InputMethodManager.class);
    }

    public static boolean l(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    public static ImageWriter m(int i, Surface surface) {
        return ImageWriter.newInstance(surface, i);
    }

    public static void n(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }

    public static void o(C1260b0 b0Var, int i) {
        b0Var.setBreakStrategy(i);
    }

    public static void p(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void q(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void r(C1260b0 b0Var, int i) {
        b0Var.setHyphenationFrequency(i);
    }

    public static void s(Image image, long j7) {
        image.setTimestamp(j7);
    }

    public static boolean t(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    public static void u(C1306z zVar, boolean z) {
        zVar.setOverlapAnchor(z);
    }

    public static void v(PopupWindow popupWindow, int i) {
        popupWindow.setWindowLayoutType(i);
    }

    public static void w(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i) {
        layerDrawable2.setLayerGravity(i, layerDrawable.getLayerGravity(i));
        layerDrawable2.setLayerWidth(i, layerDrawable.getLayerWidth(i));
        layerDrawable2.setLayerHeight(i, layerDrawable.getLayerHeight(i));
        layerDrawable2.setLayerInsetLeft(i, layerDrawable.getLayerInsetLeft(i));
        layerDrawable2.setLayerInsetRight(i, layerDrawable.getLayerInsetRight(i));
        layerDrawable2.setLayerInsetTop(i, layerDrawable.getLayerInsetTop(i));
        layerDrawable2.setLayerInsetBottom(i, layerDrawable.getLayerInsetBottom(i));
        layerDrawable2.setLayerInsetStart(i, layerDrawable.getLayerInsetStart(i));
        layerDrawable2.setLayerInsetEnd(i, layerDrawable.getLayerInsetEnd(i));
    }
}
