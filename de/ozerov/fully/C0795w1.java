package de.ozerov.fully;

import B3.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.F;
import androidx.recyclerview.widget.j0;
import java.io.File;
import java.util.ArrayList;
import n2.a;

/* renamed from: de.ozerov.fully.w1  reason: case insensitive filesystem */
public final class C0795w1 extends F {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11038a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11039b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f11040c;

    public C0795w1(int i, ArrayList arrayList) {
        this.f11038a = i;
        switch (i) {
            case 1:
                this.f11039b = 2131558526;
                this.f11040c = arrayList;
                return;
            default:
                this.f11039b = 2131558524;
                this.f11040c = arrayList;
                return;
        }
    }

    public final int getItemCount() {
        switch (this.f11038a) {
            case 0:
                return this.f11040c.size();
            default:
                return this.f11040c.size();
        }
    }

    public final void onBindViewHolder(j0 j0Var, int i) {
        String str;
        String str2;
        String str3;
        switch (this.f11038a) {
            case 0:
                C0789v1 v1Var = (C0789v1) j0Var;
                ArrayList arrayList = this.f11040c;
                if (((C0783u1) arrayList.get(i)).f10990d) {
                    v1Var.f11011f.setImageResource(2131230958);
                } else {
                    v1Var.f11011f.setImageResource(2131230959);
                }
                if (((C0783u1) arrayList.get(i)).e) {
                    v1Var.f11007a.setImageResource(2131230973);
                } else {
                    v1Var.f11007a.setImageResource(2131230971);
                }
                if (((C0783u1) arrayList.get(i)).f10992g == 2) {
                    str = "Move";
                } else {
                    str = "Copy";
                }
                if (((C0783u1) arrayList.get(i)).e) {
                    str2 = "folder";
                } else {
                    str2 = "file";
                }
                TextView textView = v1Var.f11008b;
                textView.setText(str + " " + str2);
                StringBuilder sb = new StringBuilder("Size: ");
                sb.append(a.V(((C0783u1) arrayList.get(i)).f10989c));
                v1Var.f11009c.setText(sb.toString());
                v1Var.f11010d.setText("From: " + ((C0783u1) arrayList.get(i)).f10987a.getAbsolutePath());
                File file = ((C0783u1) arrayList.get(i)).f10988b;
                TextView textView2 = v1Var.e;
                if (file != null) {
                    textView2.setText("To: " + ((C0783u1) arrayList.get(i)).f10988b.getAbsolutePath());
                } else {
                    textView2.setText("Couldn't find a good new location");
                }
                v1Var.f11011f.setOnClickListener(new m(this, 3, v1Var));
                v1Var.itemView.setTag(arrayList.get(i));
                return;
            default:
                C1 c12 = (C1) j0Var;
                ArrayList arrayList2 = this.f11040c;
                if (!((B1) arrayList2.get(i)).f9798f || !((B1) arrayList2.get(i)).f9799g) {
                    c12.f9809d.setImageResource(2131230959);
                } else {
                    c12.f9809d.setImageResource(2131230958);
                }
                if (((B1) arrayList2.get(i)).e) {
                    c12.f9806a.setImageResource(2131230973);
                } else {
                    c12.f9806a.setImageResource(2131230971);
                }
                TextView textView3 = c12.f9807b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((B1) arrayList2.get(i)).f9794a.f9784b);
                if (((B1) arrayList2.get(i)).f9799g) {
                    str3 = "";
                } else {
                    str3 = " (NOT FOUND)";
                }
                sb2.append(str3);
                textView3.setText(sb2.toString());
                c12.f9807b.setSelected(true);
                String str4 = ((B1) arrayList2.get(i)).f9795b;
                TextView textView4 = c12.f9808c;
                textView4.setText(str4);
                textView4.setSelected(true);
                boolean z = ((B1) arrayList2.get(i)).f9799g;
                ImageView imageView = c12.f9809d;
                if (z) {
                    imageView.setOnClickListener(new m(this, 4, c12));
                } else {
                    imageView.setOnClickListener((View.OnClickListener) null);
                }
                c12.itemView.setTag(arrayList2.get(i));
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [androidx.recyclerview.widget.j0, de.ozerov.fully.v1] */
    /* JADX WARNING: type inference failed for: r4v7, types: [androidx.recyclerview.widget.j0, de.ozerov.fully.C1] */
    public final j0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (this.f11038a) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f11039b, viewGroup, false);
                ? j0Var = new j0(inflate);
                j0Var.f11007a = (ImageView) inflate.findViewById(2131362183);
                j0Var.f11008b = (TextView) inflate.findViewById(2131362185);
                j0Var.f11009c = (TextView) inflate.findViewById(2131362184);
                j0Var.f11010d = (TextView) inflate.findViewById(2131362182);
                j0Var.e = (TextView) inflate.findViewById(2131362186);
                j0Var.f11011f = (ImageView) inflate.findViewById(2131362173);
                return j0Var;
            default:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(this.f11039b, viewGroup, false);
                ? j0Var2 = new j0(inflate2);
                j0Var2.f9806a = (ImageView) inflate2.findViewById(2131362183);
                j0Var2.f9807b = (TextView) inflate2.findViewById(2131362185);
                j0Var2.f9808c = (TextView) inflate2.findViewById(2131362184);
                j0Var2.f9809d = (ImageView) inflate2.findViewById(2131362173);
                return j0Var2;
        }
    }
}
