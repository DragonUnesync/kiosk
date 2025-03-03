package N1;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3281a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3282b;

    /* renamed from: c  reason: collision with root package name */
    public final StringBuilder f3283c;

    /* renamed from: d  reason: collision with root package name */
    public int f3284d = 15;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f3285f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f3286g;

    /* renamed from: h  reason: collision with root package name */
    public int f3287h;

    public b(int i, int i8) {
        ArrayList arrayList = new ArrayList();
        this.f3281a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f3282b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f3283c = sb;
        this.f3286g = i;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f3287h = i8;
    }

    public final void a(char c8) {
        StringBuilder sb = this.f3283c;
        if (sb.length() < 32) {
            sb.append(c8);
        }
    }

    public final void b() {
        StringBuilder sb = this.f3283c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f3281a;
            int size = arrayList.size() - 1;
            while (size >= 0) {
                a aVar = (a) arrayList.get(size);
                int i = aVar.f3280c;
                if (i == length) {
                    aVar.f3280c = i - 1;
                    size--;
                } else {
                    return;
                }
            }
        }
    }

    public final O0.b c(int i) {
        int i8;
        float f8;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f3282b;
            if (i9 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i9));
            spannableStringBuilder.append(10);
            i9++;
        }
        spannableStringBuilder.append(d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i10 = this.e + this.f3285f;
        int length = (32 - i10) - spannableStringBuilder.length();
        int i11 = i10 - length;
        int i12 = i;
        if (i12 != Integer.MIN_VALUE) {
            i8 = i12;
        } else if (this.f3286g == 2 && (Math.abs(i11) < 3 || length < 0)) {
            i8 = 1;
        } else if (this.f3286g != 2 || i11 <= 0) {
            i8 = 0;
        } else {
            i8 = 2;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                i10 = 32 - length;
            }
            f8 = ((((float) i10) / 32.0f) * 0.8f) + 0.1f;
        } else {
            f8 = 0.5f;
        }
        int i13 = this.f3284d;
        if (i13 > 7) {
            i13 -= 17;
        } else if (this.f3286g == 1) {
            i13 -= this.f3287h - 1;
        }
        return new O0.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, (Layout.Alignment) null, (Bitmap) null, (float) i13, 1, RecyclerView.UNDEFINED_DURATION, f8, i8, RecyclerView.UNDEFINED_DURATION, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, RecyclerView.UNDEFINED_DURATION, 0.0f);
    }

    public final SpannableString d() {
        int i;
        boolean z;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f3283c);
        int length = spannableStringBuilder.length();
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        boolean z6 = false;
        while (true) {
            ArrayList arrayList = this.f3281a;
            if (i8 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i8);
            boolean z8 = aVar.f3279b;
            int i14 = aVar.f3278a;
            if (i14 != 8) {
                if (i14 == 7) {
                    z = true;
                } else {
                    z = false;
                }
                if (i14 != 7) {
                    i13 = c.f3289B[i14];
                }
                z6 = z;
            }
            int i15 = aVar.f3280c;
            i8++;
            if (i8 < arrayList.size()) {
                i = ((a) arrayList.get(i8)).f3280c;
            } else {
                i = length;
            }
            if (i15 != i) {
                if (i9 != -1 && !z8) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i15, 33);
                    i9 = -1;
                } else if (i9 == -1 && z8) {
                    i9 = i15;
                }
                if (i10 != -1 && !z6) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i10, i15, 33);
                    i10 = -1;
                } else if (i10 == -1 && z6) {
                    i10 = i15;
                }
                if (i13 != i12) {
                    if (i12 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i11, i15, 33);
                    }
                    i12 = i13;
                    i11 = i15;
                }
            }
        }
        if (!(i9 == -1 || i9 == length)) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i9, length, 33);
        }
        if (!(i10 == -1 || i10 == length)) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
        }
        if (!(i11 == length || i12 == -1)) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i11, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (!this.f3281a.isEmpty() || !this.f3282b.isEmpty() || this.f3283c.length() != 0) {
            return false;
        }
        return true;
    }
}
