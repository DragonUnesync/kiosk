package com.jeremyfeinstein.slidingmenu.lib;

import A.f;
import F5.b;
import F5.c;
import F5.d;
import F5.e;
import F5.g;
import F5.h;
import F5.i;
import F5.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import v0.C1511I;

public class SlidingMenu extends RelativeLayout {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f9511a0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public boolean f9512U = false;

    /* renamed from: V  reason: collision with root package name */
    public final b f9513V;

    /* renamed from: W  reason: collision with root package name */
    public final c f9514W;

    /* JADX WARNING: type inference failed for: r4v0, types: [F5.b, android.view.View, java.lang.Object, android.view.ViewGroup] */
    public SlidingMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        c cVar = new c(context);
        this.f9514W = cVar;
        addView(cVar, layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        ? viewGroup = new ViewGroup(context, (AttributeSet) null);
        viewGroup.f1559i0 = -1;
        viewGroup.f1565o0 = true;
        viewGroup.f1569t0 = new ArrayList();
        viewGroup.f1570u0 = 0;
        viewGroup.f1571v0 = false;
        viewGroup.f1572w0 = 0.0f;
        viewGroup.setWillNotDraw(false);
        viewGroup.setDescendantFocusability(262144);
        viewGroup.setFocusable(true);
        Context context2 = viewGroup.getContext();
        viewGroup.f1550W = new Scroller(context2, b.f1547x0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        Method method = C1511I.f15880a;
        viewGroup.f1555e0 = viewConfiguration.getScaledPagingTouchSlop();
        viewGroup.f1561k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        viewGroup.f1562l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        viewGroup.f1566q0 = new f(17, (Object) viewGroup);
        viewGroup.f1563m0 = (int) (context2.getResources().getDisplayMetrics().density * 25.0f);
        this.f9513V = viewGroup;
        addView(viewGroup, layoutParams2);
        viewGroup.setCustomViewBehind(cVar);
        cVar.setCustomViewAbove(viewGroup);
        viewGroup.setOnPageChangeListener(new f(18, (Object) this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.f1590a);
        setMode(obtainStyledAttributes.getInt(5, 0));
        int resourceId = obtainStyledAttributes.getResourceId(12, -1);
        if (resourceId != -1) {
            setContent(resourceId);
        } else {
            setContent((View) new FrameLayout(context));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, -1);
        if (resourceId2 != -1) {
            setMenu(resourceId2);
        } else {
            setMenu((View) new FrameLayout(context));
        }
        setTouchModeAbove(obtainStyledAttributes.getInt(10, 0));
        setTouchModeBehind(obtainStyledAttributes.getInt(11, 0));
        int dimension = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(2, -1.0f);
        if (dimension == -1 || dimension2 == -1) {
            if (dimension != -1) {
                setBehindOffset(dimension);
            } else if (dimension2 != -1) {
                setBehindWidth(dimension2);
            } else {
                setBehindOffset(0);
            }
            setBehindScrollScale(obtainStyledAttributes.getFloat(1, 0.33f));
            int resourceId3 = obtainStyledAttributes.getResourceId(8, -1);
            if (resourceId3 != -1) {
                setShadowDrawable(resourceId3);
            }
            setShadowWidth((int) obtainStyledAttributes.getDimension(9, 0.0f));
            setFadeEnabled(obtainStyledAttributes.getBoolean(4, true));
            setFadeDegree(obtainStyledAttributes.getFloat(3, 0.33f));
            setSelectorEnabled(obtainStyledAttributes.getBoolean(7, false));
            int resourceId4 = obtainStyledAttributes.getResourceId(6, -1);
            if (resourceId4 != -1) {
                setSelectorDrawable(resourceId4);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException("Cannot set both behindOffset and behindWidth for a SlidingMenu");
    }

    public final void a(boolean z) {
        this.f9513V.h(1, 0, z, false);
    }

    public final boolean fitSystemWindows(Rect rect) {
        int i = rect.left;
        int i8 = rect.right;
        int i9 = rect.top;
        int i10 = rect.bottom;
        if (this.f9512U) {
            return true;
        }
        Log.v("SlidingMenu", "setting padding!");
        setPadding(i, i9, i8, i10);
        return true;
    }

    public int getBehindOffset() {
        return ((RelativeLayout.LayoutParams) this.f9514W.getLayoutParams()).rightMargin;
    }

    public float getBehindScrollScale() {
        return this.f9514W.getScrollScale();
    }

    public View getContent() {
        return this.f9513V.getContent();
    }

    public View getMenu() {
        return this.f9514W.getContent();
    }

    public int getMode() {
        return this.f9514W.getMode();
    }

    public View getSecondaryMenu() {
        return this.f9514W.getSecondaryContent();
    }

    public int getTouchModeAbove() {
        return this.f9513V.getTouchMode();
    }

    public int getTouchmodeMarginThreshold() {
        return this.f9514W.getMarginThreshold();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        this.f9513V.setCurrentItem(jVar.f1591U);
    }

    public final Parcelable onSaveInstanceState() {
        return new j(super.onSaveInstanceState(), this.f9513V.getCurrentItem());
    }

    public void setAboveOffset(int i) {
        this.f9513V.setAboveOffset(i);
    }

    public void setAboveOffsetRes(int i) {
        setAboveOffset((int) getContext().getResources().getDimension(i));
    }

    public void setBehindCanvasTransformer(e eVar) {
        this.f9514W.setCanvasTransformer(eVar);
    }

    public void setBehindOffset(int i) {
        this.f9514W.setWidthOffset(i);
    }

    public void setBehindOffsetRes(int i) {
        setBehindOffset((int) getContext().getResources().getDimension(i));
    }

    public void setBehindScrollScale(float f8) {
        if (f8 >= 0.0f || f8 <= 1.0f) {
            this.f9514W.setScrollScale(f8);
            return;
        }
        throw new IllegalStateException("ScrollScale must be between 0 and 1");
    }

    public void setBehindWidth(int i) {
        int i8;
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        Class<Display> cls = Display.class;
        try {
            Point point = new Point();
            cls.getMethod("getSize", new Class[]{Point.class}).invoke(defaultDisplay, new Object[]{point});
            i8 = point.x;
        } catch (Exception unused) {
            i8 = defaultDisplay.getWidth();
        }
        setBehindOffset(i8 - i);
    }

    public void setBehindWidthRes(int i) {
        setBehindWidth((int) getContext().getResources().getDimension(i));
    }

    public void setContent(int i) {
        setContent(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
    }

    public void setFadeDegree(float f8) {
        this.f9514W.setFadeDegree(f8);
    }

    public void setFadeEnabled(boolean z) {
        this.f9514W.setFadeEnabled(z);
    }

    public void setMenu(int i) {
        setMenu(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
    }

    public void setMode(int i) {
        if (i == 0 || i == 1 || i == 2) {
            this.f9514W.setMode(i);
            return;
        }
        throw new IllegalStateException("SlidingMenu mode must be LEFT, RIGHT, or LEFT_RIGHT");
    }

    public void setOnCloseListener(F5.f fVar) {
    }

    public void setOnClosedListener(g gVar) {
        this.f9513V.setOnClosedListener(gVar);
    }

    public void setOnOpenListener(h hVar) {
    }

    public void setOnOpenedListener(i iVar) {
        this.f9513V.setOnOpenedListener(iVar);
    }

    public void setSecondaryMenu(int i) {
        setSecondaryMenu(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
    }

    public void setSecondaryOnOpenListner(h hVar) {
    }

    public void setSecondaryShadowDrawable(int i) {
        setSecondaryShadowDrawable(getContext().getResources().getDrawable(i));
    }

    public void setSelectedView(View view) {
        this.f9514W.setSelectedView(view);
    }

    public void setSelectorBitmap(Bitmap bitmap) {
        this.f9514W.setSelectorBitmap(bitmap);
    }

    public void setSelectorDrawable(int i) {
        this.f9514W.setSelectorBitmap(BitmapFactory.decodeResource(getResources(), i));
    }

    public void setSelectorEnabled(boolean z) {
        this.f9514W.setSelectorEnabled(true);
    }

    public void setShadowDrawable(int i) {
        setShadowDrawable(getContext().getDrawable(i));
    }

    public void setShadowWidth(int i) {
        this.f9514W.setShadowWidth(i);
    }

    public void setShadowWidthRes(int i) {
        setShadowWidth((int) getResources().getDimension(i));
    }

    public void setSlidingEnabled(boolean z) {
        this.f9513V.setSlidingEnabled(z);
    }

    public void setStatic(boolean z) {
        b bVar = this.f9513V;
        if (z) {
            setSlidingEnabled(false);
            bVar.setCustomViewBehind((c) null);
            bVar.setCurrentItem(1);
            return;
        }
        bVar.setCurrentItem(1);
        bVar.setCustomViewBehind(this.f9514W);
        setSlidingEnabled(true);
    }

    public void setTouchModeAbove(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.f9513V.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    public void setTouchModeBehind(int i) {
        if (i == 1 || i == 0 || i == 2) {
            this.f9514W.setTouchMode(i);
            return;
        }
        throw new IllegalStateException("TouchMode must be set to eitherTOUCHMODE_FULLSCREEN or TOUCHMODE_MARGIN or TOUCHMODE_NONE.");
    }

    public void setTouchmodeMarginThreshold(int i) {
        this.f9514W.setMarginThreshold(i);
    }

    public void setContent(View view) {
        this.f9513V.setContent(view);
        a(true);
    }

    public void setMenu(View view) {
        this.f9514W.setContent(view);
    }

    public void setSecondaryMenu(View view) {
        this.f9514W.setSecondaryContent(view);
    }

    public void setSecondaryShadowDrawable(Drawable drawable) {
        this.f9514W.setSecondaryShadowDrawable(drawable);
    }

    public void setShadowDrawable(Drawable drawable) {
        this.f9514W.setShadowDrawable(drawable);
    }
}
