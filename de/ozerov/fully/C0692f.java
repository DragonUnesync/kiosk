package de.ozerov.fully;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: de.ozerov.fully.f  reason: case insensitive filesystem */
public class C0692f extends E {

    /* renamed from: A1  reason: collision with root package name */
    public String f10618A1;

    /* renamed from: B1  reason: collision with root package name */
    public String f10619B1;

    /* renamed from: C1  reason: collision with root package name */
    public String f10620C1;

    /* renamed from: D1  reason: collision with root package name */
    public boolean f10621D1;

    public final View U() {
        View inflate = this.f9850f1.getLayoutInflater().inflate(2131558433, (ViewGroup) null);
        if (inflate != null) {
            EditText editText = (EditText) inflate.findViewById(2131361981);
            if (editText != null) {
                editText.setText(this.f10618A1);
            }
            EditText editText2 = (EditText) inflate.findViewById(2131362012);
            if (editText2 != null) {
                editText2.setText(this.f10619B1);
            }
            EditText editText3 = (EditText) inflate.findViewById(2131362357);
            if (editText3 != null) {
                editText3.setText(this.f10620C1);
            }
            SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(2131362430);
            if (switchCompat != null) {
                switchCompat.setChecked(this.f10621D1);
            }
            return inflate;
        }
        throw new IllegalStateException("Can't get custom layout for AddDeviceToCloudDialog");
    }

    public final void V() {
        View view;
        if (this.f9862l1 != null && (view = this.f9852h1) != null) {
            EditText editText = (EditText) view.findViewById(2131361981);
            if (!(editText == null || editText.getText() == null)) {
                this.f10618A1 = editText.getText().toString().trim();
            }
            EditText editText2 = (EditText) this.f9852h1.findViewById(2131362012);
            if (!(editText2 == null || editText2.getText() == null)) {
                this.f10619B1 = editText2.getText().toString().trim();
            }
            EditText editText3 = (EditText) this.f9852h1.findViewById(2131362357);
            if (!(editText3 == null || editText3.getText() == null)) {
                this.f10620C1 = editText3.getText().toString().trim();
            }
            SwitchCompat switchCompat = (SwitchCompat) this.f9852h1.findViewById(2131362430);
            if (switchCompat != null) {
                this.f10621D1 = switchCompat.isChecked();
            }
            this.f9862l1.i((String) null);
        }
    }
}
