package de.ozerov.fully;

import C3.C0025a;
import G5.h;
import N.e;
import Q0.g;
import android.os.AsyncTask;
import android.text.Html;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;

/* renamed from: de.ozerov.fully.y1  reason: case insensitive filesystem */
public final class C0807y1 extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11112a;

    /* renamed from: b  reason: collision with root package name */
    public volatile F f11113b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0813z1 f11114c;

    public /* synthetic */ C0807y1(C0813z1 z1Var, int i) {
        this.f11112a = i;
        this.f11114c = z1Var;
    }

    public final Object doInBackground(Object[] objArr) {
        switch (this.f11112a) {
            case 0:
                Void[] voidArr = (Void[]) objArr;
                C0813z1 z1Var = this.f11114c;
                ArrayList a8 = C0783u1.a(z1Var.f11120m1);
                z1Var.f11121n1 = a8;
                z1Var.f11122o1 = C0777t1.a(z1Var.f9850f1, a8);
                return null;
            default:
                Void[] voidArr2 = (Void[]) objArr;
                C0813z1 z1Var2 = this.f11114c;
                C0783u1.b(z1Var2.f9850f1, z1Var2.f11120m1, z1Var2.f11121n1);
                return null;
        }
    }

    public final void onPostExecute(Object obj) {
        switch (this.f11112a) {
            case 0:
                Void voidR = (Void) obj;
                if (this.f11113b != null && this.f11114c.f9850f1.w()) {
                    Button button = (Button) this.f11114c.f8045A0.findViewById(2131362262);
                    Button button2 = (Button) this.f11114c.f8045A0.findViewById(2131362131);
                    TextView textView = (TextView) this.f11114c.f8045A0.findViewById(2131362263);
                    C0813z1 z1Var = this.f11114c;
                    FullyActivity fullyActivity = z1Var.f9850f1;
                    ((RecyclerView) this.f11114c.f8045A0.findViewById(2131362264)).setAdapter(new C0795w1(0, z1Var.f11121n1));
                    if (!this.f11114c.f11122o1.isEmpty()) {
                        Iterator it = this.f11114c.f11122o1.iterator();
                        String str = "<p>We are going to migrate the files:</p>\n";
                        while (it.hasNext()) {
                            C0777t1 t1Var = (C0777t1) it.next();
                            StringBuilder r8 = g.r(e.x(str, "<p>"));
                            r8.append(a.V(t1Var.f10963c));
                            r8.append(" to ");
                            r8.append(t1Var.f10961a.getAbsolutePath());
                            String sb = r8.toString();
                            if (t1Var.f10964d == C0771s1.f10947V) {
                                sb = e.x(sb, " (free storage low)");
                            }
                            if (t1Var.f10964d == C0771s1.f10948W) {
                                sb = e.x(sb, " (not enough free storage, double check!)");
                            }
                            str = e.x(sb, "</p>\n");
                        }
                        textView.setText(Html.fromHtml(str + "Check the details below!"));
                        button.setText("Start Migration");
                        button.setOnClickListener(new C0025a(12, this));
                    } else {
                        textView.setText("Nothing found");
                        button.setVisibility(8);
                    }
                    button2.setVisibility(8);
                    if (this.f11113b.isShowing()) {
                        this.f11113b.dismiss();
                        this.f11113b = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                Void voidR2 = (Void) obj;
                if (this.f11113b != null && this.f11114c.f9850f1.w()) {
                    a.b1(this.f11114c.f9850f1, "Migration finished");
                    this.f11114c.f9850f1.f9952o1.c();
                    Iterator it2 = this.f11114c.f11121n1.iterator();
                    while (it2.hasNext()) {
                        C0783u1 u1Var = (C0783u1) it2.next();
                        if (u1Var.f10990d) {
                            Log.i("z1", "Migrated to " + u1Var.f10988b + " with result " + u1Var.f10991f);
                        }
                    }
                    if (this.f11113b.isShowing()) {
                        this.f11113b.dismiss();
                        this.f11113b = null;
                    }
                    this.f11114c.S();
                    return;
                }
                return;
        }
    }

    public final void onPreExecute() {
        switch (this.f11112a) {
            case 0:
                this.f11113b = new F(this.f11114c.f9850f1, "Calculating file size...");
                this.f11113b.show();
                this.f11113b.setOnCancelListener(new h(6, this));
                return;
            default:
                this.f11113b = new F(this.f11114c.f9850f1, "Migrating files...");
                this.f11113b.show();
                this.f11113b.setOnCancelListener(new h(7, this));
                return;
        }
    }
}
