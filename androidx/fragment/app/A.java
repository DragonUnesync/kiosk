package androidx.fragment.app;

import G0.a;
import H0.c;
import H0.d;
import N.e;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import h.C1022j;

public final class A implements LayoutInflater.Factory2 {

    /* renamed from: U  reason: collision with root package name */
    public final L f7833U;

    public A(L l8) {
        this.f7833U = l8;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        Q q7;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        L l8 = this.f7833U;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, l8);
        }
        C1022j jVar = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f1625a);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                z = C0470v.class.isAssignableFrom(F.b(attributeValue, context.getClassLoader()));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                C0470v B8 = resourceId != -1 ? l8.B(resourceId) : null;
                if (B8 == null && string != null) {
                    B8 = l8.C(string);
                }
                if (B8 == null && i != -1) {
                    B8 = l8.B(i);
                }
                if (B8 == null) {
                    F I8 = l8.I();
                    context.getClassLoader();
                    B8 = I8.a(attributeValue);
                    B8.f8072h0 = true;
                    B8.f8081r0 = resourceId != 0 ? resourceId : i;
                    B8.f8082s0 = i;
                    B8.f8083t0 = string;
                    B8.f8073i0 = true;
                    B8.f8078n0 = l8;
                    C0472x xVar = l8.f7893w;
                    B8.f8079o0 = xVar;
                    C1022j jVar2 = xVar.f8093e0;
                    B8.f8088y0 = true;
                    if (xVar != null) {
                        jVar = xVar.f8092d0;
                    }
                    if (jVar != null) {
                        B8.f8088y0 = true;
                    }
                    q7 = l8.a(B8);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + B8 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else if (!B8.f8073i0) {
                    B8.f8073i0 = true;
                    B8.f8078n0 = l8;
                    C0472x xVar2 = l8.f7893w;
                    B8.f8079o0 = xVar2;
                    C1022j jVar3 = xVar2.f8093e0;
                    B8.f8088y0 = true;
                    if (xVar2 != null) {
                        jVar = xVar2.f8092d0;
                    }
                    if (jVar != null) {
                        B8.f8088y0 = true;
                    }
                    q7 = l8.g(B8);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + B8 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
                }
                ViewGroup viewGroup = (ViewGroup) view;
                c cVar = d.f1812a;
                d.b(new H0.a(B8, "Attempting to use <fragment> tag to add fragment " + B8 + " to container " + viewGroup));
                d.a(B8).getClass();
                B8.f8089z0 = viewGroup;
                q7.k();
                q7.j();
                View view2 = B8.f8045A0;
                if (view2 != null) {
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (B8.f8045A0.getTag() == null) {
                        B8.f8045A0.setTag(string);
                    }
                    B8.f8045A0.addOnAttachStateChangeListener(new z(this, q7));
                    return B8.f8045A0;
                }
                throw new IllegalStateException(e.y("Fragment ", attributeValue, " did not create a view."));
            }
        }
        return null;
    }
}
