package de.ozerov.fully;

import Q.h;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0470v;
import d4.k;
import n2.a;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.j0  reason: case insensitive filesystem */
public class C0717j0 extends C0470v implements C0811z {

    /* renamed from: b1  reason: collision with root package name */
    public static final /* synthetic */ int f10730b1 = 0;

    /* renamed from: P0  reason: collision with root package name */
    public FullyActivity f10731P0;

    /* renamed from: Q0  reason: collision with root package name */
    public k f10732Q0;

    /* renamed from: R0  reason: collision with root package name */
    public TextView f10733R0;

    /* renamed from: S0  reason: collision with root package name */
    public TextView f10734S0;

    /* renamed from: T0  reason: collision with root package name */
    public TextView f10735T0;

    /* renamed from: U0  reason: collision with root package name */
    public ViewGroup f10736U0;

    /* renamed from: V0  reason: collision with root package name */
    public ViewGroup f10737V0;

    /* renamed from: W0  reason: collision with root package name */
    public ViewGroup f10738W0;

    /* renamed from: X0  reason: collision with root package name */
    public Button f10739X0;

    /* renamed from: Y0  reason: collision with root package name */
    public JSONObject f10740Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public String f10741Z0;

    /* renamed from: a1  reason: collision with root package name */
    public String f10742a1;

    public final void A() {
        this.f8088y0 = true;
    }

    public final void D() {
        this.f8088y0 = true;
        if (P.A(this.f10731P0)) {
            O("Sorry, this app can't run on rooted devices.");
            throw null;
        } else if (P.D(this.f10731P0)) {
            O("Sorry, this app can't run on Fire OS devices. Please use an Android OS device.");
            throw null;
        } else if (P.z()) {
            O("Sorry, this app can't run on ChromeOS devices. Please use an Android OS device.");
            throw null;
        } else if (!P.y(this.f10731P0)) {
            int Q02 = a.Q0(P.t(this.f10731P0));
            FullyActivity fullyActivity = this.f10731P0;
            String str = P.f10237f;
            if (str == null) {
                P.R(fullyActivity);
                str = P.f10237f;
            }
            TextView textView = (TextView) this.f8045A0.findViewById(2131361907);
            if (Q02 != -1) {
                if (Q02 < 78) {
                    textView.setText(Html.fromHtml("The Android Webview available on this device is somewhat outdated (current ver. " + Q02 + "). You should <a href=\"market://details?id=" + str + "\">update it</a> if possible."));
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    textView.setLinksClickable(true);
                    this.f10738W0.setVisibility(0);
                }
                if (h.f4003X) {
                    this.f10733R0.setVisibility(8);
                }
                this.f8045A0.findViewById(2131362554).setOnClickListener(new C0705h0(this, 0));
                this.f8045A0.findViewById(2131361983).setOnClickListener(new C0705h0(this, 1));
                this.f8045A0.findViewById(2131361914).setOnClickListener(new C0705h0(this, 2));
                this.f8045A0.findViewById(2131362555).setOnClickListener(new C0705h0(this, 3));
                Button button = (Button) this.f8045A0.findViewById(2131361919);
                this.f10739X0 = button;
                button.setOnClickListener(new C0705h0(this, 4));
                this.f8045A0.findViewById(2131361915).setOnClickListener(new C0705h0(this, 5));
                this.f8045A0.findViewById(2131361917).setOnClickListener(new C0705h0(this, 6));
                TextView textView2 = (TextView) this.f8045A0.findViewById(2131362512);
                textView2.setText(textView2.getText().toString().replace("$app_name", "Fully"));
                TextView textView3 = (TextView) this.f8045A0.findViewById(2131362514);
                textView3.setText(textView3.getText().toString().replace("$app_name", "Fully"));
                P();
                return;
            }
            O("It looks like Android Webview is not available on this device. We won't be able to open any website.");
            throw null;
        } else {
            O("Sorry, this app can't run on Android TV devices. Please use an Android OS device.");
            throw null;
        }
    }

    public final void H(View view, Bundle bundle) {
        this.f10738W0 = (ViewGroup) view.findViewById(2131361908);
        this.f10737V0 = (ViewGroup) view.findViewById(2131362327);
        this.f10736U0 = (ViewGroup) view.findViewById(2131362516);
        this.f10733R0 = (TextView) view.findViewById(2131362598);
        this.f10734S0 = (TextView) view.findViewById(2131362024);
        this.f10735T0 = (TextView) view.findViewById(2131362023);
    }

    public final void O(String str) {
        ((TextView) this.f8045A0.findViewById(2131361907)).setText(str);
        this.f10738W0.setVisibility(0);
        this.f10737V0.setVisibility(8);
        this.f8045A0.findViewById(2131362555).setVisibility(8);
        Q((String) null);
        throw null;
    }

    public final void P() {
        if (this.f10741Z0 != null) {
            new C0711i0(0, this).execute(new Void[0]);
        }
    }

    public final void Q(String str) {
        String str2;
        String[] split = str.split("\\?", 2);
        this.f10741Z0 = split[0];
        if (split.length > 1) {
            str2 = split[1];
        } else {
            str2 = null;
        }
        this.f10742a1 = str2;
    }

    public final void b() {
        FullyActivity fullyActivity = this.f10731P0;
        if (!fullyActivity.f9921J0.f8654b) {
            fullyActivity.moveTaskToBack(true);
        }
    }

    public final void v(Activity activity) {
        this.f8088y0 = true;
        if (h() instanceof FullyActivity) {
            this.f10731P0 = (FullyActivity) h();
            this.f10732Q0 = new k((Context) activity, 1);
            return;
        }
        throw new IllegalStateException("Fragment not attached to FullyActivity");
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(2131558485, viewGroup, false);
    }
}
