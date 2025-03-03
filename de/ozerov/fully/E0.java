package de.ozerov.fully;

import C3.C0025a;
import Z1.c;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;

public abstract class E0 extends D0 {

    /* renamed from: l1  reason: collision with root package name */
    public Toolbar f9874l1;

    public void A() {
        super.A();
        Toolbar toolbar = this.f9874l1;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener((View.OnClickListener) null);
            this.f9874l1 = null;
        }
    }

    public void H(View view, Bundle bundle) {
        super.H(view, bundle);
        if (((c) this.f9850f1.f9961z0.f9767W).n("actionBarInSettings", false) || this.f9850f1.f9961z0.N1().booleanValue() || (((c) this.f9850f1.f9961z0.f9767W).n("knoxHideNavigationBar", false) && this.f9850f1.f9961z0.c1().booleanValue())) {
            try {
                LinearLayout linearLayout = (LinearLayout) view;
                Toolbar toolbar = (Toolbar) LayoutInflater.from(this.f9850f1).inflate(2131558428, linearLayout, false);
                this.f9874l1 = toolbar;
                linearLayout.addView(toolbar, 0);
                this.f9874l1.setTitle((CharSequence) U());
                this.f9874l1.setNavigationIcon(2131230949);
                this.f9874l1.setBackgroundDrawable(new ColorDrawable(this.f9850f1.f9961z0.i()));
                this.f9874l1.setTitleTextColor(this.f9850f1.f9961z0.j());
                this.f9874l1.setNavigationOnClickListener(new C0025a(10, this));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public abstract String U();
}
