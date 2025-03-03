package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.woxthebox.draglistview.R;
import d4.k;
import g.C0940a;
import n.o;
import n.z;

public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: U  reason: collision with root package name */
    public o f7370U;

    /* renamed from: V  reason: collision with root package name */
    public ImageView f7371V;

    /* renamed from: W  reason: collision with root package name */
    public RadioButton f7372W;

    /* renamed from: a0  reason: collision with root package name */
    public TextView f7373a0;

    /* renamed from: b0  reason: collision with root package name */
    public CheckBox f7374b0;

    /* renamed from: c0  reason: collision with root package name */
    public TextView f7375c0;

    /* renamed from: d0  reason: collision with root package name */
    public ImageView f7376d0;

    /* renamed from: e0  reason: collision with root package name */
    public ImageView f7377e0;

    /* renamed from: f0  reason: collision with root package name */
    public LinearLayout f7378f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Drawable f7379g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f7380h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Context f7381i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f7382j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Drawable f7383k0;

    /* renamed from: l0  reason: collision with root package name */
    public final boolean f7384l0;

    /* renamed from: m0  reason: collision with root package name */
    public LayoutInflater f7385m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f7386n0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k K22 = k.K2(getContext(), attributeSet, C0940a.f11829r, 2130969294);
        this.f7379g0 = K22.I(5);
        TypedArray typedArray = (TypedArray) K22.f9767W;
        this.f7380h0 = typedArray.getResourceId(1, -1);
        this.f7382j0 = typedArray.getBoolean(7, false);
        this.f7381i0 = context;
        this.f7383k0 = K22.I(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, 2130968981, 0);
        this.f7384l0 = obtainStyledAttributes.hasValue(0);
        K22.M2();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f7385m0 == null) {
            this.f7385m0 = LayoutInflater.from(getContext());
        }
        return this.f7385m0;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f7376d0;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (r0 == false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(n.o r11) {
        /*
            r10 = this;
            r10.f7370U = r11
            boolean r0 = r11.isVisible()
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L_0x000d
            r0 = 0
            goto L_0x000f
        L_0x000d:
            r0 = 8
        L_0x000f:
            r10.setVisibility(r0)
            java.lang.CharSequence r0 = r11.f13508Y
            r10.setTitle(r0)
            boolean r0 = r11.isCheckable()
            r10.setCheckable(r0)
            n.m r0 = r11.f13517h0
            boolean r0 = r0.o()
            r3 = 1
            if (r0 == 0) goto L_0x0038
            n.m r0 = r11.f13517h0
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x0032
            char r0 = r11.f13513d0
            goto L_0x0034
        L_0x0032:
            char r0 = r11.f13511b0
        L_0x0034:
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            n.m r4 = r11.f13517h0
            r4.n()
            if (r0 == 0) goto L_0x005f
            n.o r0 = r10.f7370U
            n.m r4 = r0.f13517h0
            boolean r4 = r4.o()
            if (r4 == 0) goto L_0x005b
            n.m r4 = r0.f13517h0
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x0055
            char r0 = r0.f13513d0
            goto L_0x0057
        L_0x0055:
            char r0 = r0.f13511b0
        L_0x0057:
            if (r0 == 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            if (r0 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r2 = 8
        L_0x0061:
            if (r2 != 0) goto L_0x011f
            android.widget.TextView r0 = r10.f7375c0
            n.o r4 = r10.f7370U
            n.m r5 = r4.f13517h0
            boolean r5 = r5.n()
            if (r5 == 0) goto L_0x0072
            char r5 = r4.f13513d0
            goto L_0x0074
        L_0x0072:
            char r5 = r4.f13511b0
        L_0x0074:
            if (r5 != 0) goto L_0x007a
            java.lang.String r1 = ""
            goto L_0x011c
        L_0x007a:
            n.m r6 = r4.f13517h0
            android.content.Context r7 = r6.f13478U
            android.content.res.Resources r7 = r7.getResources()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            android.content.Context r9 = r6.f13478U
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            boolean r9 = r9.hasPermanentMenuKey()
            if (r9 == 0) goto L_0x009d
            r9 = 2131951633(0x7f130011, float:1.9539686E38)
            java.lang.String r9 = r7.getString(r9)
            r8.append(r9)
        L_0x009d:
            boolean r6 = r6.n()
            if (r6 == 0) goto L_0x00a6
            int r4 = r4.f13514e0
            goto L_0x00a8
        L_0x00a6:
            int r4 = r4.f13512c0
        L_0x00a8:
            r6 = 2131951629(0x7f13000d, float:1.9539678E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 65536(0x10000, float:9.18355E-41)
            n.o.c(r8, r4, r9, r6)
            r6 = 2131951625(0x7f130009, float:1.953967E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 4096(0x1000, float:5.74E-42)
            n.o.c(r8, r4, r9, r6)
            r6 = 2131951624(0x7f130008, float:1.9539668E38)
            java.lang.String r6 = r7.getString(r6)
            r9 = 2
            n.o.c(r8, r4, r9, r6)
            r6 = 2131951630(0x7f13000e, float:1.953968E38)
            java.lang.String r6 = r7.getString(r6)
            n.o.c(r8, r4, r3, r6)
            r3 = 2131951632(0x7f130010, float:1.9539684E38)
            java.lang.String r3 = r7.getString(r3)
            r6 = 4
            n.o.c(r8, r4, r6, r3)
            r3 = 2131951628(0x7f13000c, float:1.9539676E38)
            java.lang.String r3 = r7.getString(r3)
            n.o.c(r8, r4, r1, r3)
            if (r5 == r1) goto L_0x010e
            r1 = 10
            if (r5 == r1) goto L_0x0103
            r1 = 32
            if (r5 == r1) goto L_0x00f8
            r8.append(r5)
            goto L_0x0118
        L_0x00f8:
            r1 = 2131951631(0x7f13000f, float:1.9539682E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x0118
        L_0x0103:
            r1 = 2131951627(0x7f13000b, float:1.9539674E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
            goto L_0x0118
        L_0x010e:
            r1 = 2131951626(0x7f13000a, float:1.9539672E38)
            java.lang.String r1 = r7.getString(r1)
            r8.append(r1)
        L_0x0118:
            java.lang.String r1 = r8.toString()
        L_0x011c:
            r0.setText(r1)
        L_0x011f:
            android.widget.TextView r0 = r10.f7375c0
            int r0 = r0.getVisibility()
            if (r0 == r2) goto L_0x012c
            android.widget.TextView r0 = r10.f7375c0
            r0.setVisibility(r2)
        L_0x012c:
            android.graphics.drawable.Drawable r0 = r11.getIcon()
            r10.setIcon(r0)
            boolean r0 = r11.isEnabled()
            r10.setEnabled(r0)
            boolean r0 = r11.hasSubMenu()
            r10.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r11 = r11.f13520k0
            r10.setContentDescription(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.a(n.o):void");
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f7377e0;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f7377e0.getLayoutParams();
            rect.top = this.f7377e0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public o getItemData() {
        return this.f7370U;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f7379g0);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f7373a0 = textView;
        int i = this.f7380h0;
        if (i != -1) {
            textView.setTextAppearance(this.f7381i0, i);
        }
        this.f7375c0 = (TextView) findViewById(2131362474);
        ImageView imageView = (ImageView) findViewById(2131362527);
        this.f7376d0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f7383k0);
        }
        this.f7377e0 = (ImageView) findViewById(2131362134);
        this.f7378f0 = (LinearLayout) findViewById(2131361952);
    }

    public final void onMeasure(int i, int i8) {
        if (this.f7371V != null && this.f7382j0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f7371V.getLayoutParams();
            int i9 = layoutParams.height;
            if (i9 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i9;
            }
        }
        super.onMeasure(i, i8);
    }

    public void setCheckable(boolean z) {
        View view;
        CompoundButton compoundButton;
        if (z || this.f7372W != null || this.f7374b0 != null) {
            if ((this.f7370U.f13526r0 & 4) != 0) {
                if (this.f7372W == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(2131558417, this, false);
                    this.f7372W = radioButton;
                    LinearLayout linearLayout = this.f7378f0;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.f7372W;
                view = this.f7374b0;
            } else {
                if (this.f7374b0 == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(2131558414, this, false);
                    this.f7374b0 = checkBox;
                    LinearLayout linearLayout2 = this.f7378f0;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f7374b0;
                view = this.f7372W;
            }
            if (z) {
                compoundButton.setChecked(this.f7370U.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f7374b0;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.f7372W;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.f7370U.f13526r0 & 4) != 0) {
            if (this.f7372W == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(2131558417, this, false);
                this.f7372W = radioButton;
                LinearLayout linearLayout = this.f7378f0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f7372W;
        } else {
            if (this.f7374b0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(2131558414, this, false);
                this.f7374b0 = checkBox;
                LinearLayout linearLayout2 = this.f7378f0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f7374b0;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f7386n0 = z;
        this.f7382j0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f7377e0;
        if (imageView != null) {
            if (this.f7384l0 || !z) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f7370U.f13517h0.getClass();
        boolean z = this.f7386n0;
        if (z || this.f7382j0) {
            ImageView imageView = this.f7371V;
            if (imageView != null || drawable != null || this.f7382j0) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(2131558415, this, false);
                    this.f7371V = imageView2;
                    LinearLayout linearLayout = this.f7378f0;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f7382j0) {
                    ImageView imageView3 = this.f7371V;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f7371V.getVisibility() != 0) {
                        this.f7371V.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f7371V.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f7373a0.setText(charSequence);
            if (this.f7373a0.getVisibility() != 0) {
                this.f7373a0.setVisibility(0);
            }
        } else if (this.f7373a0.getVisibility() != 8) {
            this.f7373a0.setVisibility(8);
        }
    }
}
