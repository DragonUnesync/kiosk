package de.ozerov.fully;

import C3.C0025a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.C0500k;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.woxthebox.draglistview.DragItemAdapter;
import com.woxthebox.draglistview.DragListView;
import java.util.ArrayList;

public class U4 extends E0 {

    /* renamed from: m1  reason: collision with root package name */
    public ArrayList f10424m1;

    /* renamed from: n1  reason: collision with root package name */
    public Q4 f10425n1;

    /* renamed from: o1  reason: collision with root package name */
    public DragListView f10426o1;

    /* renamed from: p1  reason: collision with root package name */
    public String f10427p1;

    /* renamed from: q1  reason: collision with root package name */
    public String f10428q1;

    public final void D() {
        this.f8088y0 = true;
        C0794w0.A0(this.f9850f1, true, true);
        this.f8029a1.getWindow().setNavigationBarColor(-16777216);
        this.f8029a1.getWindow().setStatusBarColor(-16777216);
    }

    public final String U() {
        return "Items on Playlist";
    }

    public final void x(Bundle bundle) {
        super.x(bundle);
        R();
        this.f10424m1 = O4.a(this.f9850f1, this.f10427p1);
    }

    /* JADX WARNING: type inference failed for: r5v7, types: [de.ozerov.fully.Q4, com.woxthebox.draglistview.DragItemAdapter] */
    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.y(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(2131558600, viewGroup, false);
        ((Button) inflate.findViewById(2131361867)).setOnClickListener(new C0025a(17, this));
        this.f10426o1 = (DragListView) inflate.findViewById(2131362470);
        FullyActivity fullyActivity = this.f9850f1;
        String str = this.f10427p1;
        ArrayList arrayList = this.f10424m1;
        ? dragItemAdapter = new DragItemAdapter();
        dragItemAdapter.f10303a = 2131558599;
        dragItemAdapter.f10304b = 2131362172;
        dragItemAdapter.f10305c = fullyActivity;
        dragItemAdapter.f10306d = str;
        dragItemAdapter.setItemList(arrayList);
        this.f10425n1 = dragItemAdapter;
        this.f10426o1.getRecyclerView().setVerticalScrollBarEnabled(true);
        this.f10426o1.setAdapter(this.f10425n1, true);
        this.f10426o1.setLayoutManager(new LinearLayoutManager(1));
        this.f10426o1.getRecyclerView().addItemDecoration(new C0500k(this.f10426o1.getRecyclerView().getContext(), new LinearLayoutManager(1).f8283j0));
        this.f10426o1.setDragListListener(new T4(this));
        if (this.f10428q1 != null) {
            ((TextView) inflate.findViewById(2131362471)).setText(this.f10428q1);
        }
        return inflate;
    }
}
