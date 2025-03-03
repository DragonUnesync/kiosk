package de.ozerov.fully;

import android.view.View;
import android.widget.EditText;

/* renamed from: de.ozerov.fully.a4  reason: case insensitive filesystem */
public final /* synthetic */ class C0667a4 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10552U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ TextPref f10553V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ EditText f10554W;

    public /* synthetic */ C0667a4(TextPref textPref, EditText editText, int i) {
        this.f10552U = i;
        this.f10553V = textPref;
        this.f10554W = editText;
    }

    public final void onClick(View view) {
        EditText editText = this.f10554W;
        TextPref textPref = this.f10553V;
        switch (this.f10552U) {
            case 0:
                int i = TextPref.f10366Z;
                textPref.getClass();
                C0805y yVar = new C0805y();
                yVar.f11105q1 = "Pick application";
                yVar.f11106r1 = true;
                yVar.f11111z1 = new C0679c4(textPref, editText, 0);
                yVar.T(textPref.f10371Y.l(), "AppPicker");
                return;
            default:
                int i8 = TextPref.f10366Z;
                textPref.getClass();
                C0805y yVar2 = new C0805y();
                yVar2.f11105q1 = "Pick application(s)";
                yVar2.f11107u1 = TextPref.a(editText.getText().toString(), false, true);
                if (textPref.f10368V == 6) {
                    yVar2.s1 = true;
                }
                if (editText.getMaxLines() == 1) {
                    yVar2.f11106r1 = true;
                }
                yVar2.f11111z1 = new C0679c4(textPref, editText, 1);
                yVar2.T(textPref.f10371Y.l(), "AppPicker");
                return;
        }
    }
}
