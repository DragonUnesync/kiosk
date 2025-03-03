package de.ozerov.fully;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.widget.SwitchCompat;
import n2.a;

public class R2 extends E {

    /* renamed from: A1  reason: collision with root package name */
    public O2 f10316A1;

    /* renamed from: B1  reason: collision with root package name */
    public boolean f10317B1 = true;

    /* renamed from: C1  reason: collision with root package name */
    public final boolean f10318C1 = true;

    public final View U() {
        View findViewById;
        O2 o2 = this.f10316A1;
        int i = o2.f10216b;
        View view = null;
        if (i == 1) {
            view = this.f9850f1.getLayoutInflater().inflate(2131558471, (ViewGroup) null);
        } else if (i == 2) {
            view = this.f9850f1.getLayoutInflater().inflate(2131558469, (ViewGroup) null);
        } else if (o2.a()) {
            view = this.f9850f1.getLayoutInflater().inflate(2131558472, (ViewGroup) null);
        } else if (this.f10316A1.f10216b == 3) {
            view = this.f9850f1.getLayoutInflater().inflate(2131558470, (ViewGroup) null);
        }
        if (view != null) {
            EditText editText = (EditText) view.findViewById(2131362607);
            if (editText != null) {
                editText.setText(this.f10316A1.f10215a);
            }
            EditText editText2 = (EditText) view.findViewById(2131362311);
            if (editText2 != null) {
                editText2.setText(String.valueOf(this.f10316A1.f10221h));
            }
            EditText editText3 = (EditText) view.findViewById(2131362308);
            if (editText3 != null) {
                editText3.setText(String.valueOf(this.f10316A1.i));
            }
            EditText editText4 = (EditText) view.findViewById(2131362312);
            if (editText4 != null) {
                editText4.setText(String.valueOf(this.f10316A1.f10222j));
            }
            SwitchCompat switchCompat = (SwitchCompat) view.findViewById(2131362219);
            if (switchCompat != null) {
                switchCompat.setChecked(this.f10316A1.f10217c);
            }
            SwitchCompat switchCompat2 = (SwitchCompat) view.findViewById(2131362217);
            if (switchCompat2 != null) {
                switchCompat2.setChecked(this.f10316A1.f10218d);
            }
            SwitchCompat switchCompat3 = (SwitchCompat) view.findViewById(2131362309);
            if (switchCompat3 != null) {
                switchCompat3.setChecked(this.f10316A1.f10219f);
            }
            if (!this.f10317B1) {
                View findViewById2 = view.findViewById(2131362310);
                if (findViewById2 != null) {
                    findViewById2.setVisibility(8);
                }
                View findViewById3 = view.findViewById(2131362325);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(8);
                }
            }
            if (!this.f10318C1) {
                View findViewById4 = view.findViewById(2131362220);
                if (findViewById4 != null) {
                    findViewById4.setVisibility(8);
                }
                View findViewById5 = view.findViewById(2131362218);
                if (findViewById5 != null) {
                    findViewById5.setVisibility(8);
                }
            }
            int i8 = this.f10316A1.f10216b;
            if ((i8 == 0 || i8 == -1) && (findViewById = view.findViewById(2131362220)) != null) {
                findViewById.setVisibility(8);
            }
            Spinner spinner = (Spinner) view.findViewById(2131362324);
            if (spinner != null) {
                ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(this.f9850f1, 2130903063, 17367048);
                createFromResource.setDropDownViewResource(17367049);
                spinner.setAdapter(createFromResource);
                O2 o22 = this.f10316A1;
                if (o22.f10219f) {
                    spinner.setSelection(2);
                } else if (o22.f10220g) {
                    spinner.setSelection(1);
                } else {
                    spinner.setSelection(0);
                }
            }
            Spinner spinner2 = (Spinner) view.findViewById(2131362085);
            if (spinner2 != null) {
                ArrayAdapter<CharSequence> createFromResource2 = ArrayAdapter.createFromResource(this.f9850f1, 2130903050, 17367048);
                createFromResource2.setDropDownViewResource(17367049);
                spinner2.setAdapter(createFromResource2);
                int i9 = this.f10316A1.e;
                if (i9 < 0 || i9 >= m().getStringArray(2130903050).length) {
                    spinner2.setSelection(0);
                } else {
                    spinner2.setSelection(this.f10316A1.e);
                }
            }
            return view;
        }
        throw new IllegalStateException("Can't get custom layout for PlaylistItemEditDialog type: " + this.f10316A1.f10216b);
    }

    public final void V() {
        View view;
        if (this.f9862l1 != null && (view = this.f9852h1) != null) {
            EditText editText = (EditText) view.findViewById(2131362607);
            if (!(editText == null || editText.getText() == null || editText.getText().toString().isEmpty())) {
                this.f10316A1.f10215a = editText.getText().toString();
                O2 o2 = this.f10316A1;
                if (o2.f10216b == 1 || o2.a()) {
                    O2 o22 = this.f10316A1;
                    o22.f10215a = P.a(o22.f10215a);
                }
            }
            EditText editText2 = (EditText) this.f9852h1.findViewById(2131362311);
            if (!(editText2 == null || editText2.getText() == null)) {
                if (editText2.getText().toString().trim().isEmpty()) {
                    this.f10316A1.f10221h = 0;
                } else {
                    try {
                        int parseInt = Integer.parseInt(editText2.getText().toString().trim());
                        if (parseInt >= 0) {
                            this.f10316A1.f10221h = parseInt;
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (Exception unused) {
                        a.b1(this.f9850f1, "Wrong timer value dismissed");
                    }
                }
            }
            EditText editText3 = (EditText) this.f9852h1.findViewById(2131362308);
            if (!(editText3 == null || editText3.getText() == null)) {
                if (editText3.getText().toString().trim().isEmpty()) {
                    this.f10316A1.i = 0;
                } else {
                    try {
                        int parseInt2 = Integer.parseInt(editText3.getText().toString().trim());
                        if (parseInt2 >= 0) {
                            this.f10316A1.i = parseInt2;
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (Exception unused2) {
                        a.b1(this.f9850f1, "Wrong video timer value dismissed");
                    }
                }
            }
            EditText editText4 = (EditText) this.f9852h1.findViewById(2131362312);
            if (!(editText4 == null || editText4.getText() == null)) {
                if (editText4.getText().toString().trim().isEmpty()) {
                    this.f10316A1.f10222j = 0;
                } else {
                    try {
                        int parseInt3 = Integer.parseInt(editText4.getText().toString().trim());
                        if (parseInt3 >= 0) {
                            this.f10316A1.f10222j = parseInt3;
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (Exception unused3) {
                        a.b1(this.f9850f1, "Wrong image timer value dismissed");
                    }
                }
            }
            SwitchCompat switchCompat = (SwitchCompat) this.f9852h1.findViewById(2131362219);
            if (switchCompat != null) {
                this.f10316A1.f10217c = switchCompat.isChecked();
            }
            SwitchCompat switchCompat2 = (SwitchCompat) this.f9852h1.findViewById(2131362217);
            if (switchCompat2 != null) {
                this.f10316A1.f10218d = switchCompat2.isChecked();
            }
            SwitchCompat switchCompat3 = (SwitchCompat) this.f9852h1.findViewById(2131362309);
            if (switchCompat3 != null) {
                this.f10316A1.f10219f = switchCompat3.isChecked();
            }
            Spinner spinner = (Spinner) this.f9852h1.findViewById(2131362324);
            if (spinner != null) {
                if (spinner.getSelectedItemPosition() == 2) {
                    O2 o23 = this.f10316A1;
                    o23.f10219f = true;
                    o23.f10220g = false;
                }
                if (spinner.getSelectedItemPosition() == 1) {
                    O2 o24 = this.f10316A1;
                    o24.f10219f = false;
                    o24.f10220g = true;
                }
                if (spinner.getSelectedItemPosition() == 0) {
                    O2 o25 = this.f10316A1;
                    o25.f10219f = false;
                    o25.f10220g = false;
                }
            }
            Spinner spinner2 = (Spinner) this.f9852h1.findViewById(2131362085);
            if (spinner2 != null && spinner2.getSelectedItemPosition() >= 0 && spinner2.getSelectedItemPosition() < m().getStringArray(2130903050).length) {
                this.f10316A1.e = spinner2.getSelectedItemPosition();
            }
            this.f9862l1.i((String) null);
        }
    }
}
