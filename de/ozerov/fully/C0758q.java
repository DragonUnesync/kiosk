package de.ozerov.fully;

import android.widget.CompoundButton;
import b3.C0528a;
import com.google.android.material.chip.Chip;
import d4.k;

/* renamed from: de.ozerov.fully.q  reason: case insensitive filesystem */
public final /* synthetic */ class C0758q implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10888a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10889b;

    public /* synthetic */ C0758q(int i, Object obj) {
        this.f10888a = i;
        this.f10889b = obj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.f10888a) {
            case 0:
                C0805y yVar = (C0805y) this.f10889b;
                yVar.t1 = z;
                new C0686e(2, yVar).execute(new Void[0]);
                return;
            case 1:
                k kVar = (k) ((C0528a) this.f10889b).e;
                kVar.getClass();
                kVar.R2("kioskTestMode", z);
                return;
            default:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f10889b).f9252f0;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                    return;
                }
                return;
        }
    }
}
