package de.ozerov.fully;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import d3.e;
import java.util.List;
import n2.a;

public class S4 extends E {

    /* renamed from: A1  reason: collision with root package name */
    public O4 f10331A1;

    /* renamed from: B1  reason: collision with root package name */
    public SwitchCompat f10332B1;

    /* renamed from: C1  reason: collision with root package name */
    public EditText f10333C1;

    /* renamed from: D1  reason: collision with root package name */
    public EditText f10334D1;

    /* renamed from: E1  reason: collision with root package name */
    public EditText f10335E1;

    /* renamed from: F1  reason: collision with root package name */
    public Spinner f10336F1;

    /* renamed from: G1  reason: collision with root package name */
    public Spinner f10337G1;

    /* renamed from: H1  reason: collision with root package name */
    public LinearLayout f10338H1;

    /* renamed from: I1  reason: collision with root package name */
    public LinearLayout f10339I1;

    /* renamed from: J1  reason: collision with root package name */
    public LinearLayout f10340J1;

    /* renamed from: K1  reason: collision with root package name */
    public TextView f10341K1;

    /* renamed from: L1  reason: collision with root package name */
    public TextView f10342L1;

    public final View U() {
        View inflate = this.f9850f1.getLayoutInflater().inflate(2131558473, (ViewGroup) null);
        if (inflate != null) {
            EditText editText = (EditText) inflate.findViewById(2131362607);
            this.f10333C1 = editText;
            editText.setText(this.f10331A1.f10229b);
            this.f10339I1 = (LinearLayout) inflate.findViewById(2131362550);
            this.f10341K1 = (TextView) inflate.findViewById(2131362551);
            EditText editText2 = (EditText) inflate.findViewById(2131362549);
            this.f10334D1 = editText2;
            editText2.setText(this.f10331A1.e);
            this.f10340J1 = (LinearLayout) inflate.findViewById(2131362613);
            this.f10342L1 = (TextView) inflate.findViewById(2131362614);
            EditText editText3 = (EditText) inflate.findViewById(2131362612);
            this.f10335E1 = editText3;
            editText3.setText(this.f10331A1.f10232f);
            SwitchCompat switchCompat = (SwitchCompat) inflate.findViewById(2131362015);
            this.f10332B1 = switchCompat;
            int i = 0;
            boolean z = true;
            if (this.f10331A1.f10228a != 1) {
                z = false;
            }
            switchCompat.setChecked(z);
            this.f10336F1 = (Spinner) inflate.findViewById(2131361845);
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.f9850f1, 17367048, O4.f10225g);
            arrayAdapter.setDropDownViewResource(17367049);
            this.f10336F1.setAdapter(arrayAdapter);
            Spinner spinner = this.f10336F1;
            List list = O4.f10226h;
            if (list.contains(this.f10331A1.f10230c)) {
                i = list.indexOf(this.f10331A1.f10230c);
            }
            spinner.setSelection(i);
            this.f10336F1.setOnItemSelectedListener(new e(1, this));
            this.f10338H1 = (LinearLayout) inflate.findViewById(2131362553);
            this.f10337G1 = (Spinner) inflate.findViewById(2131362552);
            W();
            return inflate;
        }
        throw new IllegalStateException("Can't get custom layout for ".concat(getClass().getSimpleName()));
    }

    public final void V() {
        List list;
        int i;
        if (this.f9862l1 != null && this.f9852h1 != null) {
            EditText editText = this.f10333C1;
            if (!(editText == null || editText.getText() == null)) {
                this.f10331A1.f10229b = this.f10333C1.getText().toString().trim();
            }
            EditText editText2 = this.f10334D1;
            if (!(editText2 == null || editText2.getText() == null)) {
                this.f10331A1.e = this.f10334D1.getText().toString().trim();
            }
            EditText editText3 = this.f10335E1;
            if (!(editText3 == null || editText3.getText() == null)) {
                this.f10331A1.f10232f = this.f10335E1.getText().toString();
            }
            SwitchCompat switchCompat = this.f10332B1;
            if (switchCompat != null) {
                O4 o42 = this.f10331A1;
                if (switchCompat.isChecked()) {
                    i = 1;
                } else {
                    i = 2;
                }
                o42.f10228a = i;
            }
            Spinner spinner = this.f10336F1;
            if (spinner != null) {
                int selectedItemPosition = spinner.getSelectedItemPosition();
                if (selectedItemPosition == -1) {
                    this.f10331A1.f10230c = "UNKNOWN";
                } else {
                    this.f10331A1.f10230c = (String) O4.f10226h.get(selectedItemPosition);
                }
                list = (List) O4.f10227j.get(selectedItemPosition);
            } else {
                list = null;
            }
            Spinner spinner2 = this.f10337G1;
            if (!(spinner2 == null || list == null)) {
                int selectedItemPosition2 = spinner2.getSelectedItemPosition();
                if (selectedItemPosition2 == -1) {
                    this.f10331A1.f10231d = "UNKNOWN";
                } else {
                    this.f10331A1.f10231d = (String) list.get(selectedItemPosition2);
                }
            }
            if (!this.f10331A1.c()) {
                a.b1(this.f9850f1, "The automation item is incomplete or has invalid fields and was DISABLED");
            }
            this.f9862l1.i((String) null);
        }
    }

    public final void W() {
        String str;
        int i;
        int selectedItemPosition = this.f10336F1.getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            str = "UNKNOWN";
        } else {
            str = (String) O4.f10226h.get(selectedItemPosition);
        }
        if (str.equals("UNKNOWN")) {
            this.f10338H1.setVisibility(8);
            this.f10339I1.setVisibility(8);
            this.f10340J1.setVisibility(8);
            return;
        }
        List list = (List) O4.f10227j.get(selectedItemPosition);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f9850f1, 17367048, (List) O4.i.get(selectedItemPosition));
        arrayAdapter.setDropDownViewResource(17367049);
        this.f10337G1.setAdapter(arrayAdapter);
        Spinner spinner = this.f10337G1;
        if (list.contains(this.f10331A1.f10231d)) {
            i = list.indexOf(this.f10331A1.f10231d);
        } else {
            i = 0;
        }
        spinner.setSelection(i);
        this.f10337G1.setOnItemSelectedListener(new R4(this, list));
        this.f10338H1.setVisibility(0);
        X(list);
        if (str.equals("FILL_FIELD")) {
            this.f10342L1.setText("Text to fill in");
            this.f10340J1.setVisibility(0);
        } else if (str.equals("TOGGLE_CHECKBOX")) {
            this.f10342L1.setText("True/false/toggle");
            this.f10340J1.setVisibility(0);
        } else {
            this.f10340J1.setVisibility(8);
        }
    }

    public final void X(List list) {
        String str;
        int selectedItemPosition = this.f10337G1.getSelectedItemPosition();
        char c8 = 65535;
        if (selectedItemPosition == -1) {
            str = "UNKNOWN";
        } else {
            str = (String) list.get(selectedItemPosition);
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1274967595:
                if (str.equals("TARGET_BY_ID")) {
                    c8 = 0;
                    break;
                }
                break;
            case -1178030907:
                if (str.equals("TARGET_BY_NAME")) {
                    c8 = 1;
                    break;
                }
                break;
            case -1177847961:
                if (str.equals("TARGET_BY_TEXT")) {
                    c8 = 2;
                    break;
                }
                break;
            case -237735655:
                if (str.equals("TARGET_BY_SELECTOR")) {
                    c8 = 3;
                    break;
                }
                break;
            case 972991905:
                if (str.equals("TARGET_URL")) {
                    c8 = 4;
                    break;
                }
                break;
            case 2125905502:
                if (str.equals("TARGET_BY_CLASS")) {
                    c8 = 5;
                    break;
                }
                break;
            case 2131508664:
                if (str.equals("TARGET_BY_INDEX")) {
                    c8 = 6;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                this.f10341K1.setText("ID");
                this.f10339I1.setVisibility(0);
                return;
            case 1:
                this.f10341K1.setText("Name");
                this.f10339I1.setVisibility(0);
                return;
            case 2:
                this.f10341K1.setText("Text");
                this.f10339I1.setVisibility(0);
                return;
            case 3:
                this.f10341K1.setText("Selector");
                this.f10339I1.setVisibility(0);
                return;
            case 4:
                this.f10341K1.setText("URL");
                this.f10339I1.setVisibility(0);
                return;
            case 5:
                this.f10341K1.setText("Class");
                this.f10339I1.setVisibility(0);
                return;
            case 6:
                this.f10341K1.setText("Index #");
                this.f10339I1.setVisibility(0);
                return;
            default:
                this.f10339I1.setVisibility(8);
                return;
        }
    }
}
