package h;

import E.e;
import Y1.K;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.activity.l;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.J;
import g7.C0996d;
import java.util.WeakHashMap;
import o.C1305y0;
import v0.C1503A;
import v0.C1510H;

/* renamed from: h.h  reason: case insensitive filesystem */
public final class C1020h extends l implements DialogInterface, C1023k {

    /* renamed from: X  reason: collision with root package name */
    public C1000A f12208X;

    /* renamed from: Y  reason: collision with root package name */
    public final C1001B f12209Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C1018f f12210Z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1020h(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = i(r5, r6)
            r0 = 1
            r1 = 2130968951(0x7f040177, float:1.754657E38)
            if (r6 != 0) goto L_0x0019
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x001a
        L_0x0019:
            r2 = r6
        L_0x001a:
            r4.<init>(r5, r2)
            h.B r2 = new h.B
            r2.<init>(r4)
            r4.f12209Y = r2
            h.o r2 = r4.f()
            if (r6 != 0) goto L_0x0038
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0038:
            r5 = r2
            h.A r5 = (h.C1000A) r5
            r5.f12063N0 = r6
            r2.d()
            h.f r5 = new h.f
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.f12210Z = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1020h.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130968620, typedValue, true);
        return typedValue.resourceId;
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C1000A a8 = (C1000A) f();
        a8.x();
        ((ViewGroup) a8.f12093u0.findViewById(16908290)).addView(view, layoutParams);
        a8.f12080g0.a(a8.f12079f0.getCallback());
    }

    public final void dismiss() {
        super.dismiss();
        f().e();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.k(this.f12209Y, getWindow().getDecorView(), this, keyEvent);
    }

    public final o f() {
        if (this.f12208X == null) {
            n nVar = o.f12221U;
            this.f12208X = new C1000A(getContext(), getWindow(), this, this);
        }
        return this.f12208X;
    }

    public final View findViewById(int i) {
        C1000A a8 = (C1000A) f();
        a8.x();
        return a8.f12079f0.findViewById(i);
    }

    public final void g() {
        J.b(getWindow().getDecorView(), this);
        R.e.t(getWindow().getDecorView(), this);
        C0996d.y(getWindow().getDecorView(), this);
    }

    public final void h(Bundle bundle) {
        f().a();
        super.onCreate(bundle);
        f().d();
    }

    public final void invalidateOptionsMenu() {
        f().b();
    }

    public final void j(CharSequence charSequence) {
        super.setTitle(charSequence);
        f().l(charSequence);
    }

    public final boolean k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z6;
        boolean z8;
        int i;
        boolean z9;
        ListAdapter listAdapter;
        int i8;
        int i9;
        View view;
        View findViewById;
        h(bundle);
        C1018f fVar = this.f12210Z;
        fVar.f12184b.setContentView(fVar.f12205y);
        Window window = fVar.f12185c;
        View findViewById2 = window.findViewById(2131362354);
        View findViewById3 = findViewById2.findViewById(2131362586);
        View findViewById4 = findViewById2.findViewById(2131361953);
        View findViewById5 = findViewById2.findViewById(2131361916);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(2131361967);
        View view2 = fVar.f12187f;
        if (view2 == null) {
            view2 = null;
        }
        int i10 = 0;
        if (view2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !C1018f.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(2131361961);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (fVar.f12188g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (fVar.e != null) {
                ((C1305y0) viewGroup.getLayoutParams()).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(2131362586);
        View findViewById7 = viewGroup.findViewById(2131361953);
        View findViewById8 = viewGroup.findViewById(2131361916);
        ViewGroup c8 = C1018f.c(findViewById6, findViewById3);
        ViewGroup c9 = C1018f.c(findViewById7, findViewById4);
        ViewGroup c10 = C1018f.c(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(2131362451);
        fVar.f12197q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        fVar.f12197q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) c9.findViewById(16908299);
        fVar.f12201u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            fVar.f12197q.removeView(fVar.f12201u);
            if (fVar.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) fVar.f12197q.getParent();
                int indexOfChild = viewGroup2.indexOfChild(fVar.f12197q);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(fVar.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                c9.setVisibility(8);
            }
        }
        Button button = (Button) c10.findViewById(16908313);
        fVar.f12189h = button;
        K k8 = fVar.f12182E;
        button.setOnClickListener(k8);
        if (TextUtils.isEmpty(fVar.i)) {
            fVar.f12189h.setVisibility(8);
            z6 = false;
        } else {
            fVar.f12189h.setText(fVar.i);
            fVar.f12189h.setVisibility(0);
            z6 = true;
        }
        Button button2 = (Button) c10.findViewById(16908314);
        fVar.f12191k = button2;
        button2.setOnClickListener(k8);
        if (TextUtils.isEmpty(fVar.f12192l)) {
            fVar.f12191k.setVisibility(8);
        } else {
            fVar.f12191k.setText(fVar.f12192l);
            fVar.f12191k.setVisibility(0);
            z6 |= true;
        }
        Button button3 = (Button) c10.findViewById(16908315);
        fVar.f12194n = button3;
        button3.setOnClickListener(k8);
        if (TextUtils.isEmpty(fVar.f12195o)) {
            fVar.f12194n.setVisibility(8);
        } else {
            fVar.f12194n.setText(fVar.f12195o);
            fVar.f12194n.setVisibility(0);
            z6 |= true;
        }
        TypedValue typedValue = new TypedValue();
        fVar.f12183a.getTheme().resolveAttribute(2130968618, typedValue, true);
        if (typedValue.data != 0) {
            if (z6) {
                Button button4 = fVar.f12189h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z6) {
                Button button5 = fVar.f12191k;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z6) {
                Button button6 = fVar.f12194n;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!z6) {
            c10.setVisibility(8);
        }
        if (fVar.f12202v != null) {
            c8.addView(fVar.f12202v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(2131362583).setVisibility(8);
        } else {
            fVar.f12199s = (ImageView) window.findViewById(16908294);
            if (TextUtils.isEmpty(fVar.f12186d) || !fVar.f12180C) {
                window.findViewById(2131362583).setVisibility(8);
                fVar.f12199s.setVisibility(8);
                c8.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(2131361874);
                fVar.f12200t = textView2;
                textView2.setText(fVar.f12186d);
                Drawable drawable = fVar.f12198r;
                if (drawable != null) {
                    fVar.f12199s.setImageDrawable(drawable);
                } else {
                    fVar.f12200t.setPadding(fVar.f12199s.getPaddingLeft(), fVar.f12199s.getPaddingTop(), fVar.f12199s.getPaddingRight(), fVar.f12199s.getPaddingBottom());
                    fVar.f12199s.setVisibility(8);
                }
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (c8 == null || c8.getVisibility() == 8) {
            i = 0;
        } else {
            i = 1;
        }
        if (c10.getVisibility() != 8) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 && (findViewById = c9.findViewById(2131362561)) != null) {
            findViewById.setVisibility(0);
        }
        if (i != 0) {
            NestedScrollView nestedScrollView2 = fVar.f12197q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (fVar.e != null) {
                view = c8.findViewById(2131362580);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = c9.findViewById(2131362562);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = fVar.e;
        if (alertController$RecycleListView instanceof AlertController$RecycleListView) {
            alertController$RecycleListView.getClass();
            if (!z9 || i == 0) {
                int paddingLeft = alertController$RecycleListView.getPaddingLeft();
                if (i != 0) {
                    i8 = alertController$RecycleListView.getPaddingTop();
                } else {
                    i8 = alertController$RecycleListView.f7355U;
                }
                int paddingRight = alertController$RecycleListView.getPaddingRight();
                if (z9) {
                    i9 = alertController$RecycleListView.getPaddingBottom();
                } else {
                    i9 = alertController$RecycleListView.f7356V;
                }
                alertController$RecycleListView.setPadding(paddingLeft, i8, paddingRight, i9);
            }
        }
        if (!z8) {
            View view3 = fVar.e;
            if (view3 == null) {
                view3 = fVar.f12197q;
            }
            if (view3 != null) {
                if (z9) {
                    i10 = 2;
                }
                int i11 = i | i10;
                View findViewById10 = window.findViewById(2131362450);
                View findViewById11 = window.findViewById(2131362449);
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 23) {
                    WeakHashMap weakHashMap = C1510H.f15874a;
                    if (i12 >= 23) {
                        C1503A.b(view3, i11, 3);
                    }
                    if (findViewById10 != null) {
                        c9.removeView(findViewById10);
                    }
                    if (findViewById11 != null) {
                        c9.removeView(findViewById11);
                    }
                } else {
                    if (findViewById10 != null && (i11 & 1) == 0) {
                        c9.removeView(findViewById10);
                        findViewById10 = null;
                    }
                    if (findViewById11 != null && (2 & i11) == 0) {
                        c9.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (!(findViewById10 == null && findViewById11 == null)) {
                        AlertController$RecycleListView alertController$RecycleListView2 = fVar.e;
                        if (alertController$RecycleListView2 != null) {
                            alertController$RecycleListView2.setOnScrollListener(new C1013a(findViewById10, findViewById11));
                            fVar.e.post(new C1014b(fVar, findViewById10, findViewById11));
                        } else {
                            if (findViewById10 != null) {
                                c9.removeView(findViewById10);
                            }
                            if (findViewById11 != null) {
                                c9.removeView(findViewById11);
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = fVar.e;
        if (alertController$RecycleListView3 != null && (listAdapter = fVar.f12203w) != null) {
            alertController$RecycleListView3.setAdapter(listAdapter);
            int i13 = fVar.f12204x;
            if (i13 > -1) {
                alertController$RecycleListView3.setItemChecked(i13, true);
                alertController$RecycleListView3.setSelection(i13);
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12210Z.f12197q;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f12210Z.f12197q;
        if (nestedScrollView == null || !nestedScrollView.j(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    public final void onStop() {
        super.onStop();
        C1000A a8 = (C1000A) f();
        a8.C();
        b bVar = a8.f12082i0;
        if (bVar != null) {
            bVar.I(false);
        }
    }

    public final void setContentView(int i) {
        g();
        f().h(i);
    }

    public final void setTitle(int i) {
        super.setTitle(i);
        f().l(getContext().getString(i));
    }

    public final void setContentView(View view) {
        g();
        f().i(view);
    }

    public final void setTitle(CharSequence charSequence) {
        j(charSequence);
        C1018f fVar = this.f12210Z;
        fVar.f12186d = charSequence;
        TextView textView = fVar.f12200t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        f().j(view, layoutParams);
    }
}
