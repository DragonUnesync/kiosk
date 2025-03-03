package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import h2.C1065f;
import h2.C1077r;
import j.e;
import k.C1129a;

public final class N0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13863a;

    public /* synthetic */ N0(int i) {
        this.f13863a = i;
    }

    public final Drawable a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f13863a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) N0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    C1129a.c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                    return null;
                }
            case 1:
                try {
                    return e.e(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e8) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e8);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    C1065f fVar = new C1065f(context);
                    fVar.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return fVar;
                } catch (Exception e9) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e9);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C1077r rVar = new C1077r();
                    rVar.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return rVar;
                } catch (Exception e10) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                    return null;
                }
        }
    }
}
