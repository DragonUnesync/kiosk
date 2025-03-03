package de.ozerov.fully;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.C0500k;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.woxthebox.draglistview.DragListView;
import java.util.ArrayList;

/* renamed from: de.ozerov.fully.j1  reason: case insensitive filesystem */
public class C0718j1 extends E0 {

    /* renamed from: m1  reason: collision with root package name */
    public ArrayList f10743m1;

    /* renamed from: n1  reason: collision with root package name */
    public C0676c1 f10744n1;

    /* renamed from: o1  reason: collision with root package name */
    public DragListView f10745o1;

    public final String U() {
        return "Items on Launcher";
    }

    public final void x(Bundle bundle) {
        super.x(bundle);
        R();
        this.f10743m1 = C0664a1.c(this.f9850f1);
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.y(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(2131558498, viewGroup, false);
        ((Button) inflate.findViewById(2131362195)).setOnClickListener(new C0700g1(this, 0));
        ((Button) inflate.findViewById(2131362197)).setOnClickListener(new C0700g1(this, 1));
        ((Button) inflate.findViewById(2131362196)).setOnClickListener(new C0700g1(this, 2));
        this.f10745o1 = (DragListView) inflate.findViewById(2131362198);
        this.f10744n1 = new C0676c1(this.f9850f1, this.f10743m1);
        this.f10745o1.getRecyclerView().setVerticalScrollBarEnabled(true);
        this.f10745o1.setAdapter(this.f10744n1, true);
        this.f10745o1.setLayoutManager(new LinearLayoutManager(1));
        this.f10745o1.getRecyclerView().addItemDecoration(new C0500k(this.f10745o1.getRecyclerView().getContext(), new LinearLayoutManager(1).f8283j0));
        this.f10745o1.setDragListListener(new C0712i1(this));
        return inflate;
    }
}
