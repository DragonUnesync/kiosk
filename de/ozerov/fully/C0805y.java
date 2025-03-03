package de.ozerov.fully;

import B3.n;
import U0.c;
import android.app.AlertDialog;
import android.app.Dialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.SwitchCompat;
import d3.d;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;
import z0.C1643e;

/* renamed from: de.ozerov.fully.y  reason: case insensitive filesystem */
public class C0805y extends D0 {

    /* renamed from: B1  reason: collision with root package name */
    public static final /* synthetic */ int f11098B1 = 0;

    /* renamed from: A1  reason: collision with root package name */
    public c f11099A1;

    /* renamed from: l1  reason: collision with root package name */
    public View f11100l1;

    /* renamed from: m1  reason: collision with root package name */
    public View f11101m1;

    /* renamed from: n1  reason: collision with root package name */
    public ListView f11102n1;

    /* renamed from: o1  reason: collision with root package name */
    public SearchView f11103o1;

    /* renamed from: p1  reason: collision with root package name */
    public SwitchCompat f11104p1;

    /* renamed from: q1  reason: collision with root package name */
    public String f11105q1 = "Select application(s)";

    /* renamed from: r1  reason: collision with root package name */
    public boolean f11106r1 = false;
    public boolean s1 = false;
    public boolean t1 = false;

    /* renamed from: u1  reason: collision with root package name */
    public ArrayList f11107u1 = new ArrayList();

    /* renamed from: v1  reason: collision with root package name */
    public ArrayList f11108v1;
    public C0793w w1;

    /* renamed from: x1  reason: collision with root package name */
    public boolean f11109x1 = false;

    /* renamed from: y1  reason: collision with root package name */
    public C1643e f11110y1;

    /* renamed from: z1  reason: collision with root package name */
    public C0799x f11111z1;

    public static void U(C0805y yVar) {
        c cVar = yVar.f11099A1;
        super.S();
    }

    public static void V(C0805y yVar) {
        super.S();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = yVar.f11108v1;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                T t8 = (T) it.next();
                if (t8.f10352f) {
                    arrayList.add(t8);
                }
            }
        }
        C0799x xVar = yVar.f11111z1;
        if (xVar != null) {
            xVar.k(arrayList);
        }
    }

    public static void W(C0805y yVar, int i) {
        Cursor cursor = (Cursor) yVar.f11110y1.getItem(i);
        if (cursor != null && cursor.getCount() > 0 && !cursor.isAfterLast()) {
            String string = cursor.getString(cursor.getColumnIndex("component"));
            if (yVar.f11102n1 != null && yVar.w1 != null) {
                for (int i8 = 0; i8 < yVar.w1.getCount(); i8++) {
                    if (((T) yVar.w1.getItem(i8)).f10349b.equals(string)) {
                        if (i8 > 2) {
                            yVar.f11102n1.setSelection(i8 - 2);
                        }
                        ListView listView = yVar.f11102n1;
                        listView.postDelayed(new C0769s(i8, listView, 0), 500);
                    }
                }
            }
        }
    }

    public final void D() {
        this.f8088y0 = true;
        Dialog dialog = this.f8029a1;
        if (dialog != null) {
            dialog.getWindow().setNavigationBarColor(-16777216);
            dialog.getWindow().setStatusBarColor(-16777216);
            if ((dialog instanceof AlertDialog) && dialog.isShowing() && !this.f11109x1) {
                ((AlertDialog) dialog).getButton(-1).setEnabled(false);
            }
        }
        this.f9852h1.requestFocus();
    }

    public final Dialog P(Bundle bundle) {
        AlertDialog.Builder builder;
        View inflate = this.f9850f1.getLayoutInflater().inflate(2131558435, (ViewGroup) null);
        this.f11100l1 = inflate.findViewById(2131362401);
        ListView listView = (ListView) inflate.findViewById(2131361889);
        this.f11102n1 = listView;
        listView.requestFocus();
        SearchView searchView = (SearchView) inflate.findViewById(2131362464);
        this.f11103o1 = searchView;
        searchView.setFocusable(true);
        this.f11103o1.setFocusableInTouchMode(true);
        this.f11103o1.setIconifiedByDefault(false);
        this.f11103o1.setQueryHint("Search App");
        this.f11103o1.setVisibility(8);
        C1643e eVar = new C1643e(h(), 2131558434, new String[]{"label", "package"}, new int[]{2131362179, 2131362175});
        this.f11110y1 = eVar;
        this.f11103o1.setSuggestionsAdapter(eVar);
        this.f11103o1.setOnSuggestionListener(new C0775t(this));
        this.f11103o1.setOnQueryTextListener(new C0775t(this));
        this.f11104p1 = (SwitchCompat) inflate.findViewById(2131362532);
        View findViewById = inflate.findViewById(2131362533);
        this.f11101m1 = findViewById;
        if (!this.s1) {
            findViewById.setVisibility(8);
        } else {
            this.f11104p1.setChecked(false);
            this.f11104p1.setOnCheckedChangeListener(new C0758q(0, this));
        }
        if (this.f9850f1.getResources().getBoolean(2131034117)) {
            builder = new AlertDialog.Builder(this.f9850f1);
        } else {
            builder = new AlertDialog.Builder(this.f9850f1, 2132017168);
        }
        builder.setTitle(this.f11105q1);
        builder.setView(inflate);
        builder.setCancelable(false);
        builder.setPositiveButton("OK", new r(0, this));
        builder.setNegativeButton("Cancel", new r(1, this));
        new C0686e(2, this).execute(new Void[0]);
        H(inflate, (Bundle) null);
        if (a.q0() && this.f9850f1.checkSelfPermission("android.permission.QUERY_ALL_PACKAGES") != 0) {
            n f8 = n.f(inflate, "If installed from Google Play you can't see all apps in the app picker. Check FAQs!", 15000);
            f8.g("OK", new d(f8, 1));
            f8.h();
        }
        return builder.create();
    }

    public final void S() {
        throw null;
    }

    public final ArrayList X(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f11108v1.iterator();
        while (it.hasNext()) {
            T t8 = (T) it.next();
            int i = 0;
            if (t8.f10349b.split("/")[0].toLowerCase().startsWith(str)) {
                i = 2;
            } else if (t8.f10349b.split("/")[0].toLowerCase().contains(str)) {
                i = 1;
            }
            if (t8.f10348a.toLowerCase().startsWith(str)) {
                i += 3;
            } else if (t8.f10348a.toLowerCase().contains(str)) {
                i += 2;
            }
            if (i > 0) {
                t8.f10353g = i;
                arrayList.add(t8);
            }
        }
        return arrayList;
    }

    public final void x(Bundle bundle) {
        super.x(bundle);
        R();
    }
}
