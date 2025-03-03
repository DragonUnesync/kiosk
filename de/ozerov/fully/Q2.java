package de.ozerov.fully;

import A3.b;
import B3.m;
import U0.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.j0;
import com.woxthebox.draglistview.DragItemAdapter;
import java.util.ArrayList;

public final class Q2 extends DragItemAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final int f10292a = 2131558579;

    /* renamed from: b  reason: collision with root package name */
    public final int f10293b = 2131362172;

    /* renamed from: c  reason: collision with root package name */
    public final FullyActivity f10294c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10295d;

    public Q2(FullyActivity fullyActivity, String str, ArrayList arrayList) {
        this.f10294c = fullyActivity;
        this.f10295d = str;
        setItemList(arrayList);
    }

    public static /* synthetic */ void a(Q2 q22, int i) {
        if (i < 0) {
            q22.getClass();
        } else if (q22.mItemList.size() > i) {
            q22.mItemList.remove(i);
            q22.notifyDataSetChanged();
            O2.c(q22.f10294c, q22.f10295d, q22.mItemList);
        }
    }

    public static void b(Q2 q22, P2 p22) {
        O2 o2;
        q22.getClass();
        int adapterPosition = p22.getAdapterPosition();
        if (adapterPosition >= 0 && q22.mItemList.size() > adapterPosition && (o2 = (O2) q22.mItemList.get(adapterPosition)) != null) {
            R2 r22 = new R2();
            r22.f9865o1 = "Edit Playlist Item";
            r22.f9868r1 = "Cancel";
            r22.f9867q1 = "Save";
            r22.Q();
            r22.f10316A1 = o2;
            r22.s1 = "Delete";
            r22.f9872y1 = false;
            if (q22.f10295d.equals("screensaverPlaylist")) {
                r22.f10317B1 = false;
            }
            r22.f9863m1 = new c(14);
            r22.f9864n1 = new b(adapterPosition, 4, q22);
            r22.f9862l1 = new androidx.camera.lifecycle.c(9, q22);
            r22.T(q22.f10294c.l(), "PlaylistItemEditDialog");
        }
    }

    public static /* synthetic */ void c(Q2 q22) {
        q22.notifyDataSetChanged();
        O2.c(q22.f10294c, q22.f10295d, q22.mItemList);
    }

    /* renamed from: d */
    public final void onBindViewHolder(P2 p22, int i) {
        super.onBindViewHolder(p22, i);
        if (((O2) this.mItemList.get(i)).f10216b == 1) {
            p22.f10250b.setText("Media URL");
            p22.f10249a.setImageResource(2131230987);
        } else if (((O2) this.mItemList.get(i)).f10216b == 2) {
            p22.f10250b.setText("Media File");
            p22.f10249a.setImageResource(2131230980);
        } else if (((O2) this.mItemList.get(i)).f10216b == 0) {
            p22.f10250b.setText("Webview URL");
            p22.f10249a.setImageResource(2131231014);
        } else if (((O2) this.mItemList.get(i)).f10216b == 3) {
            p22.f10250b.setText("Media Folder");
            p22.f10249a.setImageResource(2131230973);
        } else if (((O2) this.mItemList.get(i)).f10216b == 4) {
            p22.f10250b.setText("YouTube Video");
            p22.f10249a.setImageResource(2131230946);
        } else if (((O2) this.mItemList.get(i)).f10216b == 5) {
            p22.f10250b.setText("YouTube Playlist");
            p22.f10249a.setImageResource(2131230946);
        } else {
            p22.f10250b.setText("Unknown Content");
            p22.f10249a.setImageResource(2131230976);
        }
        p22.f10251c.setText(((O2) this.mItemList.get(i)).f10215a);
        p22.f10251c.setSelected(true);
        int i8 = ((O2) this.mItemList.get(i)).f10223k;
        TextView textView = p22.f10250b;
        FullyActivity fullyActivity = this.f10294c;
        if (i8 != 1) {
            textView.append(" (NOT FOUND)");
            p22.f10249a.setImageResource(2131230966);
            textView.setTextColor(fullyActivity.getResources().getColor(17170455));
        } else {
            textView.append("");
            textView.setTextColor(fullyActivity.getResources().getColor(17170444));
        }
        p22.f10252d.setOnClickListener(new m(this, 7, p22));
        p22.itemView.setTag(this.mItemList.get(i));
    }

    public final long getUniqueItemId(int i) {
        return (long) ((O2) this.mItemList.get(i)).hashCode();
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [com.woxthebox.draglistview.DragItemAdapter$ViewHolder, androidx.recyclerview.widget.j0, de.ozerov.fully.P2] */
    public final j0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f10292a, viewGroup, false);
        boolean y8 = P.y(this.f10294c);
        int i8 = this.f10293b;
        if (y8) {
            inflate.findViewById(i8).setVisibility(8);
        }
        ? viewHolder = new DragItemAdapter.ViewHolder(inflate, i8, false);
        viewHolder.f10249a = (ImageView) inflate.findViewById(2131362178);
        viewHolder.f10250b = (TextView) inflate.findViewById(2131362189);
        viewHolder.f10251c = (TextView) inflate.findViewById(2131362176);
        viewHolder.f10252d = (ImageView) inflate.findViewById(2131362171);
        return viewHolder;
    }
}
