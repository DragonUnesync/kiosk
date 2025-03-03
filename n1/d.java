package N1;

import D.C0051j0;
import O0.b;
import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.recyclerview.widget.RecyclerView;

public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final C0051j0 f3312c = new C0051j0(1);

    /* renamed from: a  reason: collision with root package name */
    public final b f3313a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3314b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f8, int i, float f9, int i8, boolean z, int i9, int i10) {
        int i11;
        boolean z6;
        if (z) {
            i11 = i9;
            z6 = true;
        } else {
            z6 = false;
            i11 = -16777216;
        }
        this.f3313a = new b(spannableStringBuilder, alignment, (Layout.Alignment) null, (Bitmap) null, f8, 0, i, f9, i8, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z6, i11, RecyclerView.UNDEFINED_DURATION, 0.0f);
        this.f3314b = i10;
    }
}
