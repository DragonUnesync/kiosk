package de.ozerov.fully;

import B3.q;
import Q0.g;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import androidx.camera.lifecycle.c;
import androidx.fragment.app.C0472x;
import b3.C0528a;
import d4.k;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import n2.a;
import o.s1;

/* renamed from: de.ozerov.fully.h0  reason: case insensitive filesystem */
public final /* synthetic */ class C0705h0 implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10684U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ C0717j0 f10685V;

    public /* synthetic */ C0705h0(C0717j0 j0Var, int i) {
        this.f10684U = i;
        this.f10685V = j0Var;
    }

    public final void onClick(View view) {
        C0717j0 j0Var = this.f10685V;
        switch (this.f10684U) {
            case 0:
                j0Var.getClass();
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://exam.fully-kiosk.com/"));
                    C0472x xVar = j0Var.f8079o0;
                    if (xVar != null) {
                        xVar.f8093e0.startActivity(intent, (Bundle) null);
                        return;
                    }
                    throw new IllegalStateException("Fragment " + j0Var + " not attached to Activity");
                } catch (Exception e) {
                    g.x(e, new StringBuilder("Failed to start web browser due to "), "j0");
                    a.b1(j0Var.f10731P0, "Failed to start web browser");
                    return;
                }
            case 1:
                C0794w0.G0(j0Var.f10731P0);
                return;
            case 2:
                j0Var.f10731P0.f9919H0.d(true);
                return;
            case 3:
                j0Var.Q("https://exam.fully-kiosk.com/exam/testexam.fek");
                j0Var.P();
                return;
            case 4:
                if (j0Var.f10740Y0 == null) {
                    a.b1(j0Var.f10731P0, "No valid exam configuration loaded");
                    return;
                }
                String string = Settings.Secure.getString(j0Var.f10731P0.getContentResolver(), "default_input_method");
                String[] W7 = a.W(a.S(j0Var.f10740Y0, "forbiddenKeyboardApps", ""));
                Arrays.toString(W7);
                if (string == null || !a.M0(string, W7)) {
                    j0Var.f10732Q0.P2();
                    q qVar = j0Var.f10731P0.f9931T0;
                    String jSONObject = j0Var.f10740Y0.toString();
                    qVar.getClass();
                    if (qVar.P(new ByteArrayInputStream(jSONObject.getBytes()), "fek.json", 4)) {
                        j0Var.f10731P0.f9952o1.c();
                    }
                    if (j0Var.f10742a1 != null) {
                        k kVar = j0Var.f10732Q0;
                        kVar.V2("startURL", j0Var.f10732Q0.h2() + j0Var.f10742a1);
                        j0Var.f10732Q0.h2();
                        return;
                    }
                    return;
                }
                a.b1(j0Var.f10731P0, "Forbidden keyboard detected, please use another one");
                return;
            case 5:
                j0Var.getClass();
                if (a.u0()) {
                    C0528a aVar = new C0528a();
                    aVar.f8653a = 0;
                    aVar.f8655c = 0;
                    aVar.f8658g = new String[]{"fek"};
                    d3.g gVar = new d3.g(j0Var.f10731P0, aVar);
                    gVar.setTitle("Select FEK File to Import");
                    gVar.f9745h0 = "Import".toString();
                    gVar.f9739b0 = new c(3, j0Var);
                    gVar.show();
                    return;
                }
                Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.addCategory("android.intent.category.OPENABLE");
                intent2.setType("*/*");
                j0Var.f10731P0.startActivityForResult(intent2, 1025);
                return;
            default:
                s1 s1Var = j0Var.f10731P0.f9941d1;
                s1Var.e = new Z1.c(11, (Object) j0Var);
                s1Var.b("Fully Exam Kiosk", "$code", -1, -1, true, true, false, true);
                return;
        }
    }
}
