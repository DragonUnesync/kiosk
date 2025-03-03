package de.ozerov.fully;

import A3.b;
import U0.c;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.j0;
import com.woxthebox.draglistview.DragItemAdapter;

public final class Q4 extends DragItemAdapter {

    /* renamed from: a  reason: collision with root package name */
    public int f10303a;

    /* renamed from: b  reason: collision with root package name */
    public int f10304b;

    /* renamed from: c  reason: collision with root package name */
    public FullyActivity f10305c;

    /* renamed from: d  reason: collision with root package name */
    public String f10306d;

    public static /* synthetic */ void a(Q4 q42) {
        q42.notifyDataSetChanged();
        O4.b(q42.f10305c, q42.f10306d, q42.mItemList);
    }

    public static void b(Q4 q42, P4 p42) {
        O4 o42;
        q42.getClass();
        int adapterPosition = p42.getAdapterPosition();
        if (adapterPosition >= 0 && q42.mItemList.size() > adapterPosition && (o42 = (O4) q42.mItemList.get(adapterPosition)) != null) {
            S4 s42 = new S4();
            s42.f9865o1 = "Edit Action";
            s42.f9868r1 = "Cancel";
            s42.f9867q1 = "Save";
            s42.Q();
            s42.f10331A1 = o42;
            s42.s1 = "Delete";
            s42.f9872y1 = false;
            s42.f9863m1 = new c(14);
            s42.f9864n1 = new b(adapterPosition, 5, q42);
            s42.f9862l1 = new androidx.camera.lifecycle.c(12, q42);
            s42.T(q42.f10305c.l(), "WebAutomationItemEditDialog");
        }
    }

    public static /* synthetic */ void c(Q4 q42, int i) {
        if (i < 0) {
            q42.getClass();
        } else if (q42.mItemList.size() > i) {
            q42.mItemList.remove(i);
            q42.notifyDataSetChanged();
            O4.b(q42.f10305c, q42.f10306d, q42.mItemList);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b1, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0224, code lost:
        r3 = "Remove ???";
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(de.ozerov.fully.P4 r21, int r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r4 = "FILL_FIELD"
            java.lang.String r6 = "TOGGLE_CHECKBOX"
            java.lang.String r8 = "REMOVE_ITEMS_AFTER"
            java.lang.String r9 = "CLICK_BUTTON_LINK"
            java.lang.String r10 = "LOAD_URL"
            java.lang.String r12 = "REMOVE_ITEMS_BEFORE"
            r14 = 1
            super.onBindViewHolder(r21, (int) r22)
            java.util.List<T> r15 = r0.mItemList
            java.lang.Object r15 = r15.get(r2)
            de.ozerov.fully.O4 r15 = (de.ozerov.fully.O4) r15
            java.lang.String r15 = r15.f10230c
            r15.getClass()
            r3 = 2131230965(0x7f0800f5, float:1.8077998E38)
            r16 = -1
            int r17 = r15.hashCode()
            switch(r17) {
                case -1892720423: goto L_0x005e;
                case -1665445258: goto L_0x0055;
                case -1528576880: goto L_0x004c;
                case -339030750: goto L_0x0043;
                case 325225550: goto L_0x003a;
                case 1155828510: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            r15 = -1
            goto L_0x0066
        L_0x0031:
            boolean r15 = r15.equals(r4)
            if (r15 != 0) goto L_0x0038
            goto L_0x002f
        L_0x0038:
            r15 = 5
            goto L_0x0066
        L_0x003a:
            boolean r15 = r15.equals(r6)
            if (r15 != 0) goto L_0x0041
            goto L_0x002f
        L_0x0041:
            r15 = 4
            goto L_0x0066
        L_0x0043:
            boolean r15 = r15.equals(r8)
            if (r15 != 0) goto L_0x004a
            goto L_0x002f
        L_0x004a:
            r15 = 3
            goto L_0x0066
        L_0x004c:
            boolean r15 = r15.equals(r9)
            if (r15 != 0) goto L_0x0053
            goto L_0x002f
        L_0x0053:
            r15 = 2
            goto L_0x0066
        L_0x0055:
            boolean r15 = r15.equals(r10)
            if (r15 != 0) goto L_0x005c
            goto L_0x002f
        L_0x005c:
            r15 = 1
            goto L_0x0066
        L_0x005e:
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0065
            goto L_0x002f
        L_0x0065:
            r15 = 0
        L_0x0066:
            switch(r15) {
                case 0: goto L_0x00c6;
                case 1: goto L_0x00b6;
                case 2: goto L_0x00a6;
                case 3: goto L_0x0099;
                case 4: goto L_0x0089;
                case 5: goto L_0x0079;
                default: goto L_0x0069;
            }
        L_0x0069:
            android.widget.TextView r3 = r1.f10258b
            java.lang.String r15 = "Unknown Action"
            r3.setText(r15)
            android.widget.ImageView r3 = r1.f10257a
            r15 = 2131231003(0x7f08011b, float:1.8078075E38)
            r3.setImageResource(r15)
            goto L_0x00d2
        L_0x0079:
            android.widget.TextView r3 = r1.f10258b
            java.lang.String r15 = "Fill In Text Form Field"
            r3.setText(r15)
            android.widget.ImageView r3 = r1.f10257a
            r15 = 2131231010(0x7f080122, float:1.8078089E38)
            r3.setImageResource(r15)
            goto L_0x00d2
        L_0x0089:
            android.widget.TextView r3 = r1.f10258b
            java.lang.String r15 = "Toggle Checkbox"
            r3.setText(r15)
            android.widget.ImageView r3 = r1.f10257a
            r15 = 2131230958(0x7f0800ee, float:1.8077983E38)
            r3.setImageResource(r15)
            goto L_0x00d2
        L_0x0099:
            android.widget.TextView r15 = r1.f10258b
            java.lang.String r5 = "Remove After Load"
            r15.setText(r5)
            android.widget.ImageView r5 = r1.f10257a
            r5.setImageResource(r3)
            goto L_0x00d2
        L_0x00a6:
            android.widget.TextView r3 = r1.f10258b
            java.lang.String r5 = "Click Button or Link"
            r3.setText(r5)
            android.widget.ImageView r3 = r1.f10257a
            r5 = 2131231011(0x7f080123, float:1.807809E38)
            r3.setImageResource(r5)
            goto L_0x00d2
        L_0x00b6:
            android.widget.TextView r3 = r1.f10258b
            java.lang.String r5 = "Load URL"
            r3.setText(r5)
            android.widget.ImageView r3 = r1.f10257a
            r5 = 2131230968(0x7f0800f8, float:1.8078004E38)
            r3.setImageResource(r5)
            goto L_0x00d2
        L_0x00c6:
            android.widget.TextView r5 = r1.f10258b
            java.lang.String r15 = "Remove Before Load"
            r5.setText(r15)
            android.widget.ImageView r5 = r1.f10257a
            r5.setImageResource(r3)
        L_0x00d2:
            android.widget.TextView r3 = r1.f10259c
            java.util.List<T> r5 = r0.mItemList
            java.lang.Object r5 = r5.get(r2)
            de.ozerov.fully.O4 r5 = (de.ozerov.fully.O4) r5
            java.lang.String r5 = r5.f10229b
            r3.setText(r5)
            android.widget.TextView r3 = r1.f10259c
            r3.setSelected(r14)
            java.util.List<T> r3 = r0.mItemList
            java.lang.Object r3 = r3.get(r2)
            de.ozerov.fully.O4 r3 = (de.ozerov.fully.O4) r3
            java.util.List r5 = de.ozerov.fully.O4.f10226h
            java.lang.String r15 = r3.f10230c
            int r5 = r5.indexOf(r15)
            if (r5 > 0) goto L_0x00fc
            java.lang.String r3 = "Action not selected"
            goto L_0x0280
        L_0x00fc:
            java.util.List r15 = de.ozerov.fully.O4.i
            java.lang.Object r15 = r15.get(r5)
            java.util.List r15 = (java.util.List) r15
            java.util.List r7 = de.ozerov.fully.O4.f10227j
            java.lang.Object r5 = r7.get(r5)
            java.util.List r5 = (java.util.List) r5
            java.lang.String r7 = r3.f10231d
            int r5 = r5.indexOf(r7)
            java.lang.String r7 = r3.f10230c
            r7.getClass()
            java.lang.String r11 = " "
            java.lang.String r18 = "Remove ???"
            java.lang.String r14 = "Remove "
            java.lang.String r13 = "???"
            int r19 = r7.hashCode()
            switch(r19) {
                case -1892720423: goto L_0x0159;
                case -1665445258: goto L_0x014f;
                case -1528576880: goto L_0x0145;
                case -339030750: goto L_0x013b;
                case 325225550: goto L_0x0131;
                case 1155828510: goto L_0x0127;
                default: goto L_0x0126;
            }
        L_0x0126:
            goto L_0x0162
        L_0x0127:
            boolean r4 = r7.equals(r4)
            if (r4 != 0) goto L_0x012e
            goto L_0x0162
        L_0x012e:
            r16 = 5
            goto L_0x0162
        L_0x0131:
            boolean r4 = r7.equals(r6)
            if (r4 != 0) goto L_0x0138
            goto L_0x0162
        L_0x0138:
            r16 = 4
            goto L_0x0162
        L_0x013b:
            boolean r4 = r7.equals(r8)
            if (r4 != 0) goto L_0x0142
            goto L_0x0162
        L_0x0142:
            r16 = 3
            goto L_0x0162
        L_0x0145:
            boolean r4 = r7.equals(r9)
            if (r4 != 0) goto L_0x014c
            goto L_0x0162
        L_0x014c:
            r16 = 2
            goto L_0x0162
        L_0x014f:
            boolean r4 = r7.equals(r10)
            if (r4 != 0) goto L_0x0156
            goto L_0x0162
        L_0x0156:
            r16 = 1
            goto L_0x0162
        L_0x0159:
            boolean r4 = r7.equals(r12)
            if (r4 != 0) goto L_0x0160
            goto L_0x0162
        L_0x0160:
            r16 = 0
        L_0x0162:
            switch(r16) {
                case 0: goto L_0x026c;
                case 1: goto L_0x025b;
                case 2: goto L_0x0227;
                case 3: goto L_0x020f;
                case 4: goto L_0x01ba;
                case 5: goto L_0x0168;
                default: goto L_0x0165;
            }
        L_0x0165:
            r3 = r13
            goto L_0x0280
        L_0x0168:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Put '"
            r4.<init>(r6)
            java.lang.String r6 = r3.f10232f
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x017a
            java.lang.String r6 = "<empty>"
            goto L_0x017c
        L_0x017a:
            java.lang.String r6 = r3.f10232f
        L_0x017c:
            java.lang.String r7 = "' in "
            java.lang.String r4 = N.e.A(r4, r6, r7)
            if (r5 <= 0) goto L_0x01b4
            java.lang.StringBuilder r4 = Q0.g.r(r4)
            java.lang.Object r6 = r15.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = 2
            if (r5 <= r6) goto L_0x01b1
            java.lang.String r5 = r3.e
            if (r5 == 0) goto L_0x01b1
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x01b1
            java.lang.StringBuilder r4 = N.e.B(r4, r11)
            java.lang.String r3 = r3.e
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x0280
        L_0x01b1:
            r3 = r4
            goto L_0x0280
        L_0x01b4:
            java.lang.String r3 = N.e.x(r4, r13)
            goto L_0x0280
        L_0x01ba:
            java.lang.String r4 = r3.f10232f
            java.lang.String r6 = "toggle"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x01c7
            java.lang.String r4 = "Toggle"
            goto L_0x01d6
        L_0x01c7:
            java.lang.String r4 = r3.f10232f
            java.lang.String r6 = "true"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x01d4
            java.lang.String r4 = "Check"
            goto L_0x01d6
        L_0x01d4:
            java.lang.String r4 = "Uncheck"
        L_0x01d6:
            java.lang.String r4 = r4.concat(r11)
            if (r5 <= 0) goto L_0x0209
            java.lang.StringBuilder r4 = Q0.g.r(r4)
            java.lang.Object r6 = r15.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = 1
            if (r5 <= r6) goto L_0x01b1
            java.lang.String r5 = r3.e
            if (r5 == 0) goto L_0x01b1
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x01b1
            java.lang.StringBuilder r4 = N.e.B(r4, r11)
            java.lang.String r3 = r3.e
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x0280
        L_0x0209:
            java.lang.String r3 = N.e.x(r4, r13)
            goto L_0x0280
        L_0x020f:
            if (r5 <= 0) goto L_0x0224
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r14)
            java.lang.Object r4 = r15.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x0280
        L_0x0224:
            r3 = r18
            goto L_0x0280
        L_0x0227:
            if (r5 <= 0) goto L_0x0258
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Click "
            r4.<init>(r6)
            java.lang.Object r6 = r15.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r6 = 2
            if (r5 <= r6) goto L_0x01b1
            java.lang.String r5 = r3.e
            if (r5 == 0) goto L_0x01b1
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x01b1
            java.lang.StringBuilder r4 = N.e.B(r4, r11)
            java.lang.String r3 = r3.e
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x0280
        L_0x0258:
            java.lang.String r3 = "Click ???"
            goto L_0x0280
        L_0x025b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Load URL "
            r4.<init>(r5)
            java.lang.String r3 = r3.e
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x0280
        L_0x026c:
            if (r5 <= 0) goto L_0x0224
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r14)
            java.lang.Object r4 = r15.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r3 = r3.toString()
        L_0x0280:
            android.widget.TextView r4 = r1.f10260d
            r4.setText(r3)
            r3 = 1
            r4.setSelected(r3)
            java.util.List<T> r3 = r0.mItemList
            java.lang.Object r3 = r3.get(r2)
            de.ozerov.fully.O4 r3 = (de.ozerov.fully.O4) r3
            int r3 = r3.f10228a
            de.ozerov.fully.FullyActivity r4 = r0.f10305c
            android.widget.TextView r5 = r1.f10258b
            r6 = 2
            if (r3 != r6) goto L_0x02ad
            java.lang.String r3 = " (DISABLED)"
            r5.append(r3)
            android.content.res.Resources r3 = r4.getResources()
            r4 = 17170432(0x1060000, float:2.4611913E-38)
            int r3 = r3.getColor(r4)
            r5.setTextColor(r3)
            goto L_0x02e8
        L_0x02ad:
            java.util.List<T> r3 = r0.mItemList
            java.lang.Object r3 = r3.get(r2)
            de.ozerov.fully.O4 r3 = (de.ozerov.fully.O4) r3
            int r3 = r3.f10228a
            if (r3 != 0) goto L_0x02d5
            java.lang.String r3 = " (ERROR)"
            r5.append(r3)
            android.widget.ImageView r3 = r1.f10257a
            r6 = 2131230966(0x7f0800f6, float:1.8078E38)
            r3.setImageResource(r6)
            android.content.res.Resources r3 = r4.getResources()
            r4 = 17170455(0x1060017, float:2.4611977E-38)
            int r3 = r3.getColor(r4)
            r5.setTextColor(r3)
            goto L_0x02e8
        L_0x02d5:
            java.lang.String r3 = ""
            r5.append(r3)
            android.content.res.Resources r3 = r4.getResources()
            r4 = 17170444(0x106000c, float:2.4611947E-38)
            int r3 = r3.getColor(r4)
            r5.setTextColor(r3)
        L_0x02e8:
            B3.m r3 = new B3.m
            r4 = 10
            r3.<init>(r0, r4, r1)
            android.widget.ImageView r4 = r1.e
            r4.setOnClickListener(r3)
            android.view.View r1 = r1.itemView
            java.util.List<T> r3 = r0.mItemList
            java.lang.Object r2 = r3.get(r2)
            r1.setTag(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.ozerov.fully.Q4.onBindViewHolder(de.ozerov.fully.P4, int):void");
    }

    public final long getUniqueItemId(int i) {
        return (long) ((O4) this.mItemList.get(i)).hashCode();
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [com.woxthebox.draglistview.DragItemAdapter$ViewHolder, androidx.recyclerview.widget.j0, de.ozerov.fully.P4] */
    public final j0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f10303a, viewGroup, false);
        ? viewHolder = new DragItemAdapter.ViewHolder(inflate, this.f10304b, false);
        viewHolder.f10257a = (ImageView) inflate.findViewById(2131362178);
        viewHolder.f10258b = (TextView) inflate.findViewById(2131362189);
        viewHolder.f10259c = (TextView) inflate.findViewById(2131362176);
        viewHolder.f10260d = (TextView) inflate.findViewById(2131362177);
        viewHolder.e = (ImageView) inflate.findViewById(2131362171);
        return viewHolder;
    }
}
