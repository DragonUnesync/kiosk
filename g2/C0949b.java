package g2;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: g2.b  reason: case insensitive filesystem */
public final class C0949b extends Property {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11930a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0949b(Class cls, String str, int i) {
        super(cls, str);
        this.f11930a = i;
    }

    public final Object get(Object obj) {
        switch (this.f11930a) {
            case 0:
                C0952e eVar = (C0952e) obj;
                return null;
            case 1:
                C0952e eVar2 = (C0952e) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return Float.valueOf(z.f12003a.r((View) obj));
            case 6:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f7555w0);
        }
    }

    public final void set(Object obj, Object obj2) {
        switch (this.f11930a) {
            case 0:
                C0952e eVar = (C0952e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f11933a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f11934b = round;
                int i = eVar.f11937f + 1;
                eVar.f11937f = i;
                if (i == eVar.f11938g) {
                    z.a(eVar.e, eVar.f11933a, round, eVar.f11935c, eVar.f11936d);
                    eVar.f11937f = 0;
                    eVar.f11938g = 0;
                    return;
                }
                return;
            case 1:
                C0952e eVar2 = (C0952e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f11935c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.f11936d = round2;
                int i8 = eVar2.f11938g + 1;
                eVar2.f11938g = i8;
                if (eVar2.f11937f == i8) {
                    z.a(eVar2.e, eVar2.f11933a, eVar2.f11934b, eVar2.f11935c, round2);
                    eVar2.f11937f = 0;
                    eVar2.f11938g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                z.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                z.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                z.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                z.f12003a.w((View) obj, floatValue);
                return;
            case 6:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
        }
    }
}
