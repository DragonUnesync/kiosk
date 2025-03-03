package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: f0.f  reason: case insensitive filesystem */
public final class C0878f {

    /* renamed from: a  reason: collision with root package name */
    public final float f11365a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    public final float f11366b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    public final float f11367c = Float.NaN;

    /* renamed from: d  reason: collision with root package name */
    public final float f11368d = Float.NaN;
    public final int e = -1;

    public C0878f(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), p.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new l().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f11368d = obtainStyledAttributes.getDimension(index, this.f11368d);
            } else if (index == 2) {
                this.f11366b = obtainStyledAttributes.getDimension(index, this.f11366b);
            } else if (index == 3) {
                this.f11367c = obtainStyledAttributes.getDimension(index, this.f11367c);
            } else if (index == 4) {
                this.f11365a = obtainStyledAttributes.getDimension(index, this.f11365a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
