package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.j0;
import com.woxthebox.draglistview.R;
import java.util.WeakHashMap;
import v0.C1510H;
import v0.C1549v;

public final class r extends j0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f9343a;

    /* renamed from: b  reason: collision with root package name */
    public final MaterialCalendarGridView f9344b;

    public r(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(2131362271);
        this.f9343a = textView;
        WeakHashMap weakHashMap = C1510H.f15874a;
        new C1549v(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).d(textView, Boolean.TRUE);
        this.f9344b = (MaterialCalendarGridView) linearLayout.findViewById(2131362266);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
