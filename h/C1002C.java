package h;

import Q0.g;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h.C  reason: case insensitive filesystem */
public final class C1002C implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final View f12100U;

    /* renamed from: V  reason: collision with root package name */
    public final String f12101V;

    /* renamed from: W  reason: collision with root package name */
    public Method f12102W;

    /* renamed from: X  reason: collision with root package name */
    public Context f12103X;

    public C1002C(View view, String str) {
        this.f12100U = view;
        this.f12101V = str;
    }

    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f12102W == null) {
            View view2 = this.f12100U;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f12101V;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, new Class[]{View.class})) != null) {
                            this.f12102W = method;
                            this.f12103X = context;
                            break;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder s8 = g.s("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    s8.append(view2.getClass());
                    s8.append(str);
                    throw new IllegalStateException(s8.toString());
                }
            }
        }
        try {
            this.f12102W.invoke(this.f12103X, new Object[]{view});
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e8) {
            throw new IllegalStateException("Could not execute method for android:onClick", e8);
        }
    }
}
