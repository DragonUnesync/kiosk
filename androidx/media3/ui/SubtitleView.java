package androidx.media3.ui;

import O0.a;
import O0.b;
import O0.f;
import Y1.C0370c;
import Y1.C0371d;
import Y1.H;
import Y1.O;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import g7.C0996d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView extends FrameLayout {

    /* renamed from: U  reason: collision with root package name */
    public List f8241U = Collections.emptyList();

    /* renamed from: V  reason: collision with root package name */
    public C0371d f8242V = C0371d.f6385g;

    /* renamed from: W  reason: collision with root package name */
    public float f8243W = 0.0533f;

    /* renamed from: a0  reason: collision with root package name */
    public float f8244a0 = 0.08f;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f8245b0 = true;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f8246c0 = true;

    /* renamed from: d0  reason: collision with root package name */
    public int f8247d0;

    /* renamed from: e0  reason: collision with root package name */
    public H f8248e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f8249f0;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0370c cVar = new C0370c(context);
        this.f8248e0 = cVar;
        this.f8249f0 = cVar;
        addView(cVar);
        this.f8247d0 = 1;
    }

    private List<b> getCuesWithStylingPreferencesApplied() {
        if (this.f8245b0 && this.f8246c0) {
            return this.f8241U;
        }
        ArrayList arrayList = new ArrayList(this.f8241U.size());
        for (int i = 0; i < this.f8241U.size(); i++) {
            a a8 = ((b) this.f8241U.get(i)).a();
            if (!this.f8245b0) {
                a8.f3506n = false;
                CharSequence charSequence = a8.f3495a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        a8.f3495a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = a8.f3495a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof f)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                C0996d.w(a8);
            } else if (!this.f8246c0) {
                C0996d.w(a8);
            }
            arrayList.add(a8.a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (!isInEditMode() && (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            return captioningManager.getFontScale();
        }
        return 1.0f;
    }

    private C0371d getUserCaptionStyle() {
        CaptioningManager captioningManager;
        int i;
        int i8;
        int i9;
        int i10;
        boolean isInEditMode = isInEditMode();
        C0371d dVar = C0371d.f6385g;
        if (isInEditMode || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return dVar;
        }
        CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
        if (userStyle.hasForegroundColor()) {
            i = userStyle.foregroundColor;
        } else {
            i = -1;
        }
        if (userStyle.hasBackgroundColor()) {
            i8 = userStyle.backgroundColor;
        } else {
            i8 = -16777216;
        }
        int i11 = 0;
        if (userStyle.hasWindowColor()) {
            i9 = userStyle.windowColor;
        } else {
            i9 = 0;
        }
        if (userStyle.hasEdgeType()) {
            i11 = userStyle.edgeType;
        }
        if (userStyle.hasEdgeColor()) {
            i10 = userStyle.edgeColor;
        } else {
            i10 = -1;
        }
        return new C0371d(i, i8, i9, i11, i10, userStyle.getTypeface());
    }

    private <T extends View & H> void setView(T t8) {
        removeView(this.f8249f0);
        View view = this.f8249f0;
        if (view instanceof O) {
            ((O) view).f6372V.destroy();
        }
        this.f8249f0 = t8;
        this.f8248e0 = (H) t8;
        addView(t8);
    }

    public final void a() {
        setStyle(getUserCaptionStyle());
    }

    public final void b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public final void c() {
        this.f8248e0.a(getCuesWithStylingPreferencesApplied(), this.f8242V, this.f8243W, this.f8244a0);
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        this.f8246c0 = z;
        c();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        this.f8245b0 = z;
        c();
    }

    public void setBottomPaddingFraction(float f8) {
        this.f8244a0 = f8;
        c();
    }

    public void setCues(List<b> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f8241U = list;
        c();
    }

    public void setFractionalTextSize(float f8) {
        this.f8243W = f8;
        c();
    }

    public void setStyle(C0371d dVar) {
        this.f8242V = dVar;
        c();
    }

    public void setViewType(int i) {
        if (this.f8247d0 != i) {
            if (i == 1) {
                setView(new C0370c(getContext()));
            } else if (i == 2) {
                setView(new O(getContext()));
            } else {
                throw new IllegalArgumentException();
            }
            this.f8247d0 = i;
        }
    }
}
