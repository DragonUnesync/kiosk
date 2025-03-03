package de.ozerov.fully;

import Q.h;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0470v;
import d4.k;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;

public class J3 extends C0470v implements C0811z {

    /* renamed from: Y0  reason: collision with root package name */
    public static final /* synthetic */ int f10026Y0 = 0;

    /* renamed from: P0  reason: collision with root package name */
    public FullyActivity f10027P0;

    /* renamed from: Q0  reason: collision with root package name */
    public k f10028Q0;

    /* renamed from: R0  reason: collision with root package name */
    public EditText f10029R0;

    /* renamed from: S0  reason: collision with root package name */
    public TextView f10030S0;

    /* renamed from: T0  reason: collision with root package name */
    public TextView f10031T0;

    /* renamed from: U0  reason: collision with root package name */
    public TextView f10032U0;

    /* renamed from: V0  reason: collision with root package name */
    public TextView f10033V0;

    /* renamed from: W0  reason: collision with root package name */
    public TextView f10034W0;

    /* renamed from: X0  reason: collision with root package name */
    public ImageView f10035X0;

    public final void A() {
        this.f8088y0 = true;
    }

    public final void D() {
        this.f8088y0 = true;
        if (!this.f10028Q0.e2().equals("")) {
            O(this.f10028Q0.e2());
        } else {
            this.f8045A0.findViewById(2131362481).setVisibility(8);
        }
        if (h.f4003X || !this.f10027P0.getPackageName().equals("com.fullykiosk.singleapp")) {
            this.f10032U0.setText("Swipe from LEFT for the Fully menu and 100+ other options.");
        }
        Button button = (Button) this.f8045A0.findViewById(2131361919);
        if (!this.f10027P0.f9921J0.f8654b) {
            button.setOnClickListener(new H3(this, 0));
            this.f8045A0.findViewById(2131361912).setVisibility(8);
        } else {
            button.setVisibility(8);
            ((Button) this.f8045A0.findViewById(2131361913)).setOnClickListener(new H3(this, 1));
            ((Button) this.f8045A0.findViewById(2131361920)).setOnClickListener(new H3(this, 2));
        }
        ((Button) this.f8045A0.findViewById(2131361918)).setOnClickListener(new H3(this, 3));
        EditText editText = (EditText) this.f8045A0.findViewById(2131362193);
        this.f10029R0 = editText;
        editText.setText(this.f10028Q0.d0());
        this.f10029R0.setOnEditorActionListener(new G0(1, this));
        this.f10033V0.setText(String.format(m().getString(2131951952), new Object[]{String.valueOf(this.f10028Q0.m2())}));
        LinearLayout linearLayout = (LinearLayout) this.f8045A0.findViewById(2131362142);
        linearLayout.removeAllViews();
        Iterator it = ((ArrayList) new G3(this.f10027P0).b(linearLayout)).iterator();
        while (it.hasNext()) {
            linearLayout.addView(((F3) it.next()).f9893c);
        }
        TextView textView = this.f10034W0;
        textView.setText(textView.getText().toString().replace("$app_name", "Fully"));
    }

    public final void H(View view, Bundle bundle) {
        this.f10030S0 = (TextView) view.findViewById(2131362484);
        this.f10031T0 = (TextView) view.findViewById(2131362482);
        this.f10035X0 = (ImageView) view.findViewById(2131362483);
        this.f10029R0 = (EditText) view.findViewById(2131362193);
        this.f10032U0 = (TextView) view.findViewById(2131362598);
        this.f10033V0 = (TextView) view.findViewById(2131362473);
        this.f10034W0 = (TextView) view.findViewById(2131362163);
    }

    public final void O(String str) {
        ComponentName componentName;
        if (this.f8045A0 != null) {
            try {
                ResolveInfo resolveActivity = this.f10027P0.getPackageManager().resolveActivity(a.P0(str), 65536);
                if (resolveActivity != null) {
                    ActivityInfo activityInfo = resolveActivity.activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    componentName = null;
                }
                this.f10030S0.setText(C0794w0.k(this.f10027P0, componentName));
                this.f10031T0.setText(componentName.flattenToShortString());
                this.f10035X0.setImageDrawable(this.f10027P0.getPackageManager().getActivityIcon(componentName));
            } catch (Exception unused) {
                this.f10030S0.setText("ERROR");
                this.f10031T0.setText("Bad single app intent URL or app not found");
                this.f10035X0.setImageDrawable(this.f10027P0.getDrawable(2131230966));
                Log.e("J3", "Failed to parse intent URL or find the app for " + str);
            }
            this.f10031T0.setSelected(true);
            this.f8045A0.findViewById(2131362481).setVisibility(0);
        }
    }

    public final void P() {
        EditText editText = this.f10029R0;
        if (editText != null) {
            String trim = editText.getText().toString().trim();
            if (trim.length() < 4) {
                this.f10028Q0.V2("kioskPin", "");
                this.f10029R0.setText("");
                a.b1(this.f10027P0, "Kiosk PIN must be at least 4 digits long");
            } else if (!this.f10028Q0.d0().equals(trim)) {
                this.f10028Q0.V2("kioskPin", trim);
                a.b1(this.f10027P0, "Kiosk PIN set to ".concat(trim));
            }
            C0794w0.V(this.f10027P0);
            this.f10029R0.clearFocus();
            return;
        }
        C0794w0.V(this.f10027P0);
    }

    public final void b() {
        FullyActivity fullyActivity = this.f10027P0;
        if (!fullyActivity.f9921J0.f8654b) {
            fullyActivity.moveTaskToBack(true);
        }
    }

    public final void v(Activity activity) {
        this.f8088y0 = true;
        if (h() instanceof FullyActivity) {
            this.f10027P0 = (FullyActivity) h();
            this.f10028Q0 = new k((Context) activity, 1);
            return;
        }
        throw new IllegalStateException("Fragment not attached to FullyActivity");
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558489, viewGroup, false);
    }
}
