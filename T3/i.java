package t3;

import android.text.TextPaint;
import java.lang.ref.WeakReference;
import o3.C1317a;
import o3.e;
import w3.C1590d;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f15456a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final C1317a f15457b = new C1317a(1, this);

    /* renamed from: c  reason: collision with root package name */
    public float f15458c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15459d = true;
    public final WeakReference e = new WeakReference((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public C1590d f15460f;

    public i(e eVar) {
        this.e = new WeakReference(eVar);
    }

    public final float a(String str) {
        float f8;
        if (!this.f15459d) {
            return this.f15458c;
        }
        TextPaint textPaint = this.f15456a;
        if (str == null) {
            f8 = 0.0f;
        } else {
            f8 = textPaint.measureText(str, 0, str.length());
        }
        this.f15458c = f8;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f15459d = false;
        return this.f15458c;
    }
}
