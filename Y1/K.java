package Y1;

import H3.O;
import M0.Y;
import M0.Z;
import M0.d0;
import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.ui.TrackSelectionView;
import com.google.android.material.datepicker.k;
import h.C1018f;
import java.util.ArrayList;
import java.util.HashMap;
import m.C1182a;
import n.o;
import o.j1;

public final class K implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f6366U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f6367V;

    public /* synthetic */ K(int i, Object obj) {
        this.f6366U = i;
        this.f6367V = obj;
    }

    public final void onClick(View view) {
        boolean z;
        Message message;
        Message message2;
        Message message3;
        Message message4;
        o oVar;
        switch (this.f6366U) {
            case 0:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f6367V;
                CheckedTextView checkedTextView = trackSelectionView.f8252W;
                HashMap hashMap = trackSelectionView.f8256d0;
                boolean z6 = true;
                if (view == checkedTextView) {
                    trackSelectionView.f8261i0 = true;
                    hashMap.clear();
                } else if (view == trackSelectionView.f8253a0) {
                    trackSelectionView.f8261i0 = false;
                    hashMap.clear();
                } else {
                    trackSelectionView.f8261i0 = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    L l8 = (L) tag;
                    d0 d0Var = l8.f6368a;
                    Y y8 = d0Var.f2935b;
                    Z z8 = (Z) hashMap.get(y8);
                    int i = l8.f6369b;
                    if (z8 == null) {
                        if (!trackSelectionView.f8258f0 && hashMap.size() > 0) {
                            hashMap.clear();
                        }
                        hashMap.put(y8, new Z(y8, O.r(Integer.valueOf(i))));
                    } else {
                        ArrayList arrayList = new ArrayList(z8.f2890b);
                        boolean isChecked = ((CheckedTextView) view).isChecked();
                        if (!trackSelectionView.f8257e0 || !d0Var.f2936c) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z && (!trackSelectionView.f8258f0 || trackSelectionView.f8255c0.size() <= 1)) {
                            z6 = false;
                        }
                        if (isChecked && z6) {
                            arrayList.remove(Integer.valueOf(i));
                            if (arrayList.isEmpty()) {
                                hashMap.remove(y8);
                            } else {
                                hashMap.put(y8, new Z(y8, arrayList));
                            }
                        } else if (!isChecked) {
                            if (z) {
                                arrayList.add(Integer.valueOf(i));
                                hashMap.put(y8, new Z(y8, arrayList));
                            } else {
                                hashMap.put(y8, new Z(y8, O.r(Integer.valueOf(i))));
                            }
                        }
                    }
                }
                trackSelectionView.a();
                return;
            case 1:
                k kVar = (k) this.f6367V;
                int i8 = kVar.f9295T0;
                if (i8 == 2) {
                    kVar.P(1);
                    return;
                } else if (i8 == 1) {
                    kVar.P(2);
                    return;
                } else {
                    return;
                }
            case 2:
                C1018f fVar = (C1018f) this.f6367V;
                if (view == fVar.f12189h && (message4 = fVar.f12190j) != null) {
                    message = Message.obtain(message4);
                } else if (view == fVar.f12191k && (message3 = fVar.f12193m) != null) {
                    message = Message.obtain(message3);
                } else if (view != fVar.f12194n || (message2 = fVar.f12196p) == null) {
                    message = null;
                } else {
                    message = Message.obtain(message2);
                }
                if (message != null) {
                    message.sendToTarget();
                }
                fVar.f12181D.obtainMessage(1, fVar.f12184b).sendToTarget();
                return;
            case 3:
                ((C1182a) this.f6367V).a();
                return;
            default:
                j1 j1Var = ((Toolbar) this.f6367V).f7568J0;
                if (j1Var == null) {
                    oVar = null;
                } else {
                    oVar = j1Var.f13976V;
                }
                if (oVar != null) {
                    oVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
