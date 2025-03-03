package de.ozerov.fully;

import Z1.c;
import a1.C0412c;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.C0500k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d4.k;
import java.io.File;
import java.util.ArrayList;
import n2.a;

/* renamed from: de.ozerov.fully.z1  reason: case insensitive filesystem */
public class C0813z1 extends E0 {

    /* renamed from: p1  reason: collision with root package name */
    public static boolean f11119p1;

    /* renamed from: m1  reason: collision with root package name */
    public ArrayList f11120m1;

    /* renamed from: n1  reason: collision with root package name */
    public ArrayList f11121n1;

    /* renamed from: o1  reason: collision with root package name */
    public ArrayList f11122o1;

    public static void V(FullyActivity fullyActivity) {
        boolean z;
        ArrayList b8 = B1.b(fullyActivity);
        k kVar = new k((Context) fullyActivity, 1);
        boolean q02 = a.q0();
        c cVar = (c) kVar.f9767W;
        if (!q02 || Environment.isExternalStorageManager() || b8.isEmpty() || cVar.n("ignoreLocalFilesAlert", false)) {
            z = false;
        } else {
            z = true;
        }
        f11119p1 = z;
        fullyActivity.f9916E0.d();
        cVar.n("forceLocalFilesMigration", false);
        if (f11119p1 && cVar.n("forceLocalFilesMigration", false)) {
            new Thread(new C0412c((Object) b8, 2, (Object) fullyActivity)).start();
        }
        fullyActivity.f9960y1.e(false, false);
    }

    public final String U() {
        return "Local Files Alert";
    }

    public final void x(Bundle bundle) {
        super.x(bundle);
        R();
        this.f11120m1 = B1.b(this.f9850f1);
    }

    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        super.y(layoutInflater, viewGroup, bundle);
        boolean z = false;
        View inflate = layoutInflater.inflate(2131558525, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(2131362264);
        TextView textView = (TextView) inflate.findViewById(2131362263);
        Button button = (Button) inflate.findViewById(2131362131);
        Button button2 = (Button) inflate.findViewById(2131362262);
        Button button3 = (Button) inflate.findViewById(2131361943);
        if (!this.f11120m1.isEmpty()) {
            button2.setOnClickListener(new C0801x1(this, 0));
            File I8 = this.f9850f1.f9931T0.I();
            if (a.i0(this.f9851g1, "android.permission.MANAGE_EXTERNAL_STORAGE") && a.q0() && !Environment.isExternalStorageManager()) {
                z = true;
            }
            if (z) {
                button.setOnClickListener(new C0801x1(this, 1));
            } else {
                button.setVisibility(8);
            }
            FullyActivity fullyActivity = this.f9850f1;
            StringBuilder sb = new StringBuilder("<p>Following settings are using local files on shared storage. Due to evolving Google Play policies Fully won't be able to access shared storage after the next app upgrade (February 2025).</p>");
            if (z) {
                str = "<p>Option 1: You grant the <b>All Files Access</b> permission to Fully</p><p>Option 2: ";
            } else {
                str = "<p>Solution: ";
            }
            sb.append(str);
            sb.append("We migrate affected files to the app-specific storage and adjust the settings.</p>");
            if (I8 != null) {
                str2 = "<p>&#x26A0; We found a settings file <b>" + I8.getAbsolutePath() + "</b> which is imported on every app start. Please <b>remove this file</b> prior to starting the migration as the old settings could revert the migration results.</p>";
            } else {
                str2 = "";
            }
            sb.append(str2);
            sb.append("<a href='https://www.fully-kiosk.com/en/#faq-localfilesalert'>Read FAQ for details!</a>");
            String sb2 = sb.toString();
            fullyActivity.getClass();
            textView.setText(Html.fromHtml(sb2));
            textView.setLinksClickable(true);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            if (I8 != null) {
                button2.setVisibility(8);
            }
        } else {
            textView.setText("We couldn't find any usages of local files on shared storage in your configuration. Nothing to migrate.");
            button2.setVisibility(8);
            button.setVisibility(8);
        }
        button3.setOnClickListener(new C0801x1(this, 2));
        recyclerView.setAdapter(new C0795w1(1, this.f11120m1));
        recyclerView.setVerticalScrollBarEnabled(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.addItemDecoration(new C0500k(recyclerView.getContext(), new LinearLayoutManager(1).f8283j0));
        return inflate;
    }
}
