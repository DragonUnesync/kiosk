package C3;

import E2.a;
import M0.Q;
import N5.f;
import Q0.g;
import T0.C0232y;
import U0.c;
import Y1.C0373f;
import Y1.C0379l;
import Y1.r;
import Y1.w;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import b3.C0528a;
import com.google.android.material.datepicker.m;
import com.samsung.android.knox.EnterpriseDeviceManager;
import de.ozerov.fully.C0695f2;
import de.ozerov.fully.C0726k3;
import de.ozerov.fully.C0762q3;
import de.ozerov.fully.C0783u1;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.C0807y1;
import de.ozerov.fully.C0813z1;
import de.ozerov.fully.E0;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.N1;
import de.ozerov.fully.O4;
import de.ozerov.fully.S4;
import de.ozerov.fully.U4;
import de.ozerov.fully.ValidatorActivity;
import de.ozerov.fully.g5;
import de.ozerov.fully.i5;
import de.ozerov.fully.m5;
import java.util.Iterator;
import k1.C1140i;
import k1.C1141j;

/* renamed from: C3.a  reason: case insensitive filesystem */
public final /* synthetic */ class C0025a implements View.OnClickListener {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f574U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ Object f575V;

    public /* synthetic */ C0025a(int i, Object obj) {
        this.f574U = i;
        this.f575V = obj;
    }

    public final void onClick(View view) {
        long j7 = 0;
        Object obj = this.f575V;
        switch (this.f574U) {
            case 0:
                C0029e eVar = (C0029e) obj;
                EditText editText = eVar.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.q();
                    return;
                }
                return;
            case 1:
                ((n) obj).u();
                return;
            case 2:
                A a8 = (A) obj;
                EditText editText2 = a8.f554f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = a8.f554f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        a8.f554f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        a8.f554f.setTransformationMethod((TransformationMethod) null);
                    }
                    if (selectionEnd >= 0) {
                        a8.f554f.setSelection(selectionEnd);
                    }
                    a8.q();
                    return;
                }
                return;
            case 3:
                r rVar = (r) obj;
                rVar.k(!rVar.f6500f1);
                return;
            case 4:
                r rVar2 = ((C0373f) obj).f6434d;
                Q q7 = rVar2.f6496d1;
                if (q7 != null && ((a) q7).e(29)) {
                    C1141j F8 = ((C0232y) rVar2.f6496d1).F();
                    Q q8 = rVar2.f6496d1;
                    F8.getClass();
                    C1140i iVar = new C1140i(F8);
                    iVar.a(1);
                    iVar.f(1);
                    ((C0232y) q8).R(new C1141j(iVar));
                    rVar2.f6493c0.f6447b[1] = rVar2.getResources().getString(2131951763);
                    rVar2.f6503h0.dismiss();
                    return;
                }
                return;
            case 5:
                C0379l lVar = (C0379l) obj;
                int bindingAdapterPosition = lVar.getBindingAdapterPosition();
                r rVar3 = lVar.f6445d;
                View view2 = rVar3.f6528w0;
                if (bindingAdapterPosition == 0) {
                    view2.getClass();
                    rVar3.d(rVar3.f6495d0, view2);
                    return;
                } else if (bindingAdapterPosition == 1) {
                    view2.getClass();
                    rVar3.d(rVar3.f6499f0, view2);
                    return;
                } else {
                    rVar3.f6503h0.dismiss();
                    return;
                }
            case 6:
                r rVar4 = ((C0373f) obj).f6434d;
                Q q9 = rVar4.f6496d1;
                if (q9 != null && ((a) q9).e(29)) {
                    C1141j F9 = ((C0232y) rVar4.f6496d1).F();
                    Q q10 = rVar4.f6496d1;
                    F9.getClass();
                    C1140i iVar2 = new C1140i(F9);
                    iVar2.a(3);
                    iVar2.f2911p = -3;
                    iVar2.c(new String[0]);
                    iVar2.f2910o = 0;
                    ((C0232y) q10).R(new C1141j(iVar2));
                    rVar4.f6503h0.dismiss();
                    return;
                }
                return;
            case 7:
                w wVar = (w) obj;
                wVar.g();
                if (view.getId() == 2131362054) {
                    wVar.f6558q.start();
                    return;
                } else if (view.getId() == 2131362053) {
                    wVar.f6559r.start();
                    return;
                } else {
                    return;
                }
            case 8:
                ((m) obj).S();
                throw null;
            case 9:
                FullyActivity fullyActivity = (FullyActivity) obj;
                ((ClipboardManager) fullyActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Fully Device Info", C0794w0.s(fullyActivity)));
                return;
            case 10:
                ((E0) obj).S();
                return;
            case 11:
                C0528a aVar = (C0528a) obj;
                aVar.getClass();
                try {
                    ((FullyActivity) aVar.f8656d).startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
                    ((AlertDialog) aVar.f8658g).dismiss();
                    return;
                } catch (Exception e) {
                    g.x(e, new StringBuilder("Opening accessibility settings failed due to "), "KioskManager");
                    return;
                }
            case 12:
                C0813z1 z1Var = ((C0807y1) obj).f11114c;
                Iterator it = z1Var.f11121n1.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C0783u1 u1Var = (C0783u1) it.next();
                    if (u1Var.f10990d) {
                        j7 += u1Var.f10989c;
                        i++;
                    }
                }
                if (i > 0) {
                    StringBuilder p3 = g.p(i, "Starting migration for ", " locations of ");
                    p3.append(n2.a.V(j7));
                    Log.i("z1", p3.toString());
                    new C0807y1(z1Var, 1).execute(new Void[0]);
                    return;
                }
                n2.a.b1(z1Var.f9850f1, "No locations selected");
                return;
            case 13:
                N1 n12 = (N1) obj;
                n12.getClass();
                if (System.currentTimeMillis() - n12.f10161f < 300) {
                    n12.f10161f = 0;
                    C0794w0.G0(n12.e);
                    return;
                }
                n12.f10161f = System.currentTimeMillis();
                return;
            case EnterpriseDeviceManager.KNOX_2_3 /*14*/:
                int i8 = C0695f2.f10625d0;
                Dialog dialog = (Dialog) obj;
                if (dialog.isShowing()) {
                    dialog.dismiss();
                    return;
                }
                return;
            case EnterpriseDeviceManager.KNOX_2_4 /*15*/:
                C0762q3 q3Var = (C0762q3) obj;
                q3Var.getClass();
                q3Var.f10898m1.add(new C0726k3());
                q3Var.f10899n1.f();
                q3Var.f10899n1.notifyDataSetChanged();
                q3Var.f10900o1.getRecyclerView().scrollToPosition(q3Var.f10898m1.size() - 1);
                return;
            case EnterpriseDeviceManager.KNOX_2_4_1 /*16*/:
                int i9 = ValidatorActivity.f10463U;
                ((ValidatorActivity) obj).finish();
                return;
            case EnterpriseDeviceManager.KNOX_2_5 /*17*/:
                U4 u42 = (U4) obj;
                u42.getClass();
                O4 o42 = new O4();
                S4 s42 = new S4();
                s42.f9865o1 = "Add Action";
                s42.f9868r1 = "Cancel";
                s42.f9867q1 = "Save";
                s42.Q();
                s42.f10331A1 = o42;
                s42.f9872y1 = false;
                s42.f9863m1 = new c(14);
                s42.f9862l1 = new A.g(u42, 13, o42);
                s42.T(u42.f9850f1.l(), "WebAutomationItemEditDialog");
                return;
            case EnterpriseDeviceManager.KNOX_2_5_1 /*18*/:
                i5 i5Var = (i5) obj;
                g5 f8 = i5Var.f(true, false, false);
                if (f8 != null) {
                    f8.j();
                    if (!i5Var.f10721p.isEmpty()) {
                        f8.g(i5Var.f10721p);
                        return;
                    } else if (f8.f10662d.getVisibility() == 0) {
                        f8.f10661c.requestFocus();
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            default:
                m5 m5Var = (m5) obj;
                m5Var.getClass();
                boolean B02 = n2.a.B0();
                f fVar = m5Var.f10806A1;
                if (B02) {
                    m5Var.f9851g1.registerReceiver(fVar, new IntentFilter("android.net.wifi.SCAN_RESULTS"), 2);
                } else {
                    m5Var.f9851g1.registerReceiver(fVar, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
                }
                C0794w0.I0(m5Var.f9851g1);
                n2.a.b1(m5Var.f9851g1, "Starting Wifi Scan...");
                return;
        }
    }
}
