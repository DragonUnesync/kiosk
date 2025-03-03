package de.ozerov.fully;

import B3.m;
import android.text.method.TimeKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import androidx.recyclerview.widget.j0;
import com.woxthebox.draglistview.DragItemAdapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import n2.a;

/* renamed from: de.ozerov.fully.o3  reason: case insensitive filesystem */
public final class C0750o3 extends DragItemAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final int f10865a = 2131558583;

    /* renamed from: b  reason: collision with root package name */
    public final int f10866b = 2131362172;

    /* renamed from: c  reason: collision with root package name */
    public final FullyActivity f10867c;

    /* renamed from: d  reason: collision with root package name */
    public EditText f10868d;
    public C0726k3 e;

    /* renamed from: f  reason: collision with root package name */
    public String f10869f;

    public C0750o3(FullyActivity fullyActivity, ArrayList arrayList) {
        this.f10867c = fullyActivity;
        setItemList(arrayList);
    }

    public static /* synthetic */ void a(C0750o3 o3Var, C0744n3 n3Var, int i, View view, boolean z) {
        o3Var.getClass();
        if (n3Var.getAdapterPosition() >= 0) {
            o3Var.e(n3Var.f10849a, (C0726k3) o3Var.mItemList.get(i), "sleep", z);
        }
        if (z) {
            ((EditText) view).selectAll();
        }
    }

    public static /* synthetic */ void b(C0750o3 o3Var, C0744n3 n3Var) {
        o3Var.getClass();
        int adapterPosition = n3Var.getAdapterPosition();
        if (adapterPosition >= 0 && o3Var.mItemList.size() > adapterPosition) {
            o3Var.f();
            o3Var.mItemList.remove(adapterPosition);
            o3Var.notifyDataSetChanged();
        }
    }

    public static /* synthetic */ void c(C0750o3 o3Var, C0744n3 n3Var, int i, View view, boolean z) {
        o3Var.getClass();
        if (n3Var.getAdapterPosition() >= 0) {
            o3Var.e(n3Var.f10850b, (C0726k3) o3Var.mItemList.get(i), "wakeup", z);
        }
        if (z) {
            ((EditText) view).selectAll();
        }
    }

    public final void e(EditText editText, C0726k3 k3Var, String str, boolean z) {
        String str2;
        Date date;
        if (!z) {
            String trim = editText.getText().toString().trim();
            if (trim.length() != 4 || trim.contains(":")) {
                str2 = trim;
            } else {
                str2 = trim.substring(0, 2) + ":" + trim.substring(2, 4);
            }
            try {
                date = new SimpleDateFormat("HH:mm", Locale.getDefault()).parse(str2);
            } catch (Exception unused) {
                date = null;
            }
            if (date != null || trim.isEmpty()) {
                if (date != null) {
                    trim = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date);
                }
                editText.setText(trim);
                if (str.equals("sleep")) {
                    k3Var.f10772a = trim;
                } else {
                    k3Var.f10773b = trim;
                }
                editText.setTextColor(-16777216);
                return;
            }
            a.b1(this.f10867c, "Please enter " + str + " time in 24h format HH:MM or HHMM");
            editText.setTextColor(-65536);
            return;
        }
        this.f10868d = editText;
        this.e = k3Var;
        this.f10869f = str;
    }

    public final void f() {
        String str = this.f10869f;
        if ((str != null && this.f10868d != null) || this.e != null) {
            e(this.f10868d, this.e, str, false);
        }
    }

    /* renamed from: g */
    public final void onBindViewHolder(C0744n3 n3Var, int i) {
        super.onBindViewHolder(n3Var, i);
        n3Var.f10849a.setText(((C0726k3) this.mItemList.get(i)).f10772a);
        C0732l3 l3Var = new C0732l3(this, n3Var, i, 0);
        EditText editText = n3Var.f10849a;
        editText.setOnFocusChangeListener(l3Var);
        editText.setKeyListener(new TimeKeyListener());
        e(editText, (C0726k3) this.mItemList.get(i), "sleep", false);
        String str = ((C0726k3) this.mItemList.get(i)).f10773b;
        EditText editText2 = n3Var.f10850b;
        editText2.setText(str);
        editText2.setOnFocusChangeListener(new C0732l3(this, n3Var, i, 1));
        editText2.setKeyListener(new TimeKeyListener());
        e(editText2, (C0726k3) this.mItemList.get(i), "wakeup", false);
        if (!((C0726k3) this.mItemList.get(i)).f10775d) {
            editText2.requestFocus();
            ((C0726k3) this.mItemList.get(i)).f10775d = true;
        }
        n3Var.f10852d.setOnClickListener(new m(this, 9, n3Var));
        FullyActivity fullyActivity = this.f10867c;
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(fullyActivity, 2130903048, 2131558591);
        createFromResource.setDropDownViewResource(17367049);
        Spinner spinner = n3Var.f10851c;
        spinner.setAdapter(createFromResource);
        if (((C0726k3) this.mItemList.get(i)).f10774c < 0 || ((C0726k3) this.mItemList.get(i)).f10774c >= fullyActivity.getResources().getStringArray(2130903048).length) {
            spinner.setSelection(0);
        } else {
            spinner.setSelection(((C0726k3) this.mItemList.get(i)).f10774c);
        }
        spinner.setOnItemSelectedListener(new C0738m3(this, n3Var, i));
        n3Var.itemView.setTag(this.mItemList.get(i));
    }

    public final long getUniqueItemId(int i) {
        return (long) ((C0726k3) this.mItemList.get(i)).hashCode();
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [com.woxthebox.draglistview.DragItemAdapter$ViewHolder, androidx.recyclerview.widget.j0, de.ozerov.fully.n3] */
    public final j0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f10865a, viewGroup, false);
        ? viewHolder = new DragItemAdapter.ViewHolder(inflate, this.f10866b, false);
        viewHolder.f10849a = (EditText) inflate.findViewById(2131362488);
        viewHolder.f10850b = (EditText) inflate.findViewById(2131362631);
        viewHolder.f10851c = (Spinner) inflate.findViewById(2131361970);
        viewHolder.f10852d = (ImageView) inflate.findViewById(2131362170);
        return viewHolder;
    }
}
