package h;

import Y1.K;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import de.ozerov.fully.B4;
import g.C0940a;
import java.lang.ref.WeakReference;

/* renamed from: h.f  reason: case insensitive filesystem */
public final class C1018f {

    /* renamed from: A  reason: collision with root package name */
    public final int f12178A;

    /* renamed from: B  reason: collision with root package name */
    public final int f12179B;

    /* renamed from: C  reason: collision with root package name */
    public final boolean f12180C;

    /* renamed from: D  reason: collision with root package name */
    public final B4 f12181D;

    /* renamed from: E  reason: collision with root package name */
    public final K f12182E = new K(2, this);

    /* renamed from: a  reason: collision with root package name */
    public final Context f12183a;

    /* renamed from: b  reason: collision with root package name */
    public final C1020h f12184b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f12185c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f12186d;
    public AlertController$RecycleListView e;

    /* renamed from: f  reason: collision with root package name */
    public View f12187f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12188g = false;

    /* renamed from: h  reason: collision with root package name */
    public Button f12189h;
    public CharSequence i;

    /* renamed from: j  reason: collision with root package name */
    public Message f12190j;

    /* renamed from: k  reason: collision with root package name */
    public Button f12191k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f12192l;

    /* renamed from: m  reason: collision with root package name */
    public Message f12193m;

    /* renamed from: n  reason: collision with root package name */
    public Button f12194n;

    /* renamed from: o  reason: collision with root package name */
    public CharSequence f12195o;

    /* renamed from: p  reason: collision with root package name */
    public Message f12196p;

    /* renamed from: q  reason: collision with root package name */
    public NestedScrollView f12197q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f12198r;

    /* renamed from: s  reason: collision with root package name */
    public ImageView f12199s;

    /* renamed from: t  reason: collision with root package name */
    public TextView f12200t;

    /* renamed from: u  reason: collision with root package name */
    public TextView f12201u;

    /* renamed from: v  reason: collision with root package name */
    public View f12202v;

    /* renamed from: w  reason: collision with root package name */
    public ListAdapter f12203w;

    /* renamed from: x  reason: collision with root package name */
    public int f12204x = -1;

    /* renamed from: y  reason: collision with root package name */
    public final int f12205y;
    public final int z;

    public C1018f(Context context, C1020h hVar, Window window) {
        this.f12183a = context;
        this.f12184b = hVar;
        this.f12185c = window;
        B4 b42 = new B4();
        b42.f9803b = new WeakReference(hVar);
        this.f12181D = b42;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C0940a.e, 2130968619, 0);
        this.f12205y = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.z = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f12178A = obtainStyledAttributes.getResourceId(7, 0);
        this.f12179B = obtainStyledAttributes.getResourceId(3, 0);
        this.f12180C = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        hVar.f().g(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        int i8;
        int i9 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i8 = 0;
            } else {
                i8 = 4;
            }
            view2.setVisibility(i8);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i9 = 0;
            }
            view3.setVisibility(i9);
        }
    }

    public static ViewGroup c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void d(int i8, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message message;
        if (onClickListener != null) {
            message = this.f12181D.obtainMessage(i8, onClickListener);
        } else {
            message = null;
        }
        if (i8 == -3) {
            this.f12195o = charSequence;
            this.f12196p = message;
        } else if (i8 == -2) {
            this.f12192l = charSequence;
            this.f12193m = message;
        } else if (i8 == -1) {
            this.i = charSequence;
            this.f12190j = message;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
