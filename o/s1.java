package o;

import A.f;
import D2.q;
import G5.h;
import G5.s;
import G5.u;
import I4.b;
import N.e;
import Q0.g;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Rect;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.camera.lifecycle.c;
import d4.k;
import de.ozerov.fully.C0780t4;
import de.ozerov.fully.FullyActivity;
import de.ozerov.fully.G0;
import de.ozerov.fully.H0;
import de.ozerov.fully.I0;
import de.ozerov.fully.QrCaptureActivity;
import de.ozerov.fully.U0;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import m4.C1214b;
import n2.a;

public final class s1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14070a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14071b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14072c;

    /* renamed from: d  reason: collision with root package name */
    public Object f14073d;
    public Object e;

    /* renamed from: f  reason: collision with root package name */
    public Object f14074f;

    /* renamed from: g  reason: collision with root package name */
    public Object f14075g;

    public s1(FullyActivity fullyActivity) {
        this.f14074f = "";
        this.f14070a = fullyActivity;
        this.f14071b = new k((Context) fullyActivity, 1);
        s sVar = new s(0);
        c cVar = new c(10, this);
        this.f14072c = fullyActivity.f7297e0.c("activity_rq#" + fullyActivity.f7296d0.getAndIncrement(), fullyActivity, sVar, cVar);
    }

    public void a(String str, String str2, String str3) {
        Log.w("s1", "handleBarcodeScan " + str + " resultUrl: " + str3);
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("$code", str);
            hashMap.put("$rawcode", str);
        }
        if (str2 != null) {
            hashMap.put("$extras", str2);
        }
        U0.e("onQrScanSuccess", hashMap);
        FullyActivity fullyActivity = (FullyActivity) this.f14070a;
        if (!(str == null || str3 == null || str3.isEmpty() || fullyActivity.f9917F0 == null)) {
            if (str3.trim().startsWith("$code")) {
                fullyActivity.f9917F0.n(str3.replace("$code", str).replace("$rawcode", str), false);
            } else {
                fullyActivity.f9917F0.n(str3.replace("$code", a.k1(str)).replace("$rawcode", str).replace("$base64code", Base64.encodeToString(str.getBytes(StandardCharsets.UTF_8), 2)), false);
            }
        }
        if (str != null) {
            k kVar = (k) this.f14071b;
            if (((Z1.c) kVar.f9767W).n("barcodeScanInsertInputField", false) && fullyActivity.f9917F0 != null) {
                String r8 = ((Z1.c) kVar.f9767W).r("barcodeScanInsertInputFieldSelector", "input[type=\"text\"]");
                String str4 = "javascript:(function() { if (document.querySelectorAll('" + r8 + "').length) document.querySelectorAll('" + r8 + "')[0].value='" + str.replace("'", "\\'") + "' })();";
                if (((Z1.c) kVar.f9767W).n("barcodeScanSubmitInputField", false)) {
                    str4 = str4 + "(function() { if (document.querySelectorAll('" + r8 + "').length) document.querySelectorAll('" + r8 + "')[0].form.submit(); })();";
                }
                fullyActivity.f9917F0.n(e.x(str4, "void(0);"), false);
            }
        }
    }

    public void b(String str, String str2, int i, long j7, boolean z, boolean z6, boolean z8, boolean z9) {
        String r8 = ((Z1.c) ((k) this.f14071b).f9767W).r("barcodeScanIntent", "");
        boolean isEmpty = r8.isEmpty();
        FullyActivity fullyActivity = (FullyActivity) this.f14070a;
        if (!isEmpty) {
            try {
                fullyActivity.startActivity(a.P0(r8));
            } catch (Exception e8) {
                StringBuilder s8 = g.s("Failed to start ", r8, " due to ");
                s8.append(e8.getMessage());
                Log.e("s1", s8.toString());
                a.b1(fullyActivity, "Failed to start " + r8 + " due to " + e8.getMessage());
            }
        } else if (fullyActivity.f9958x1.f()) {
            a.b1(fullyActivity, "Can't use QR scanner while visual motion detection active");
        } else {
            u uVar = new u();
            if (str != null) {
                uVar.a(str, "PROMPT_MESSAGE");
            }
            uVar.a(Boolean.FALSE, "SCAN_ORIENTATION_LOCKED");
            uVar.f1734b = QrCaptureActivity.class;
            uVar.a(Boolean.valueOf(z), "BEEP_ENABLED");
            if (j7 != -1) {
                uVar.a(Long.valueOf(j7 * 1000), "TIMEOUT");
            }
            if (i != -1 && i >= 0) {
                uVar.a(Integer.valueOf(i), "SCAN_CAMERA_ID");
            }
            if (z6) {
                uVar.a(Boolean.TRUE, "showCancelButton");
            }
            if (z9) {
                uVar.a(Boolean.TRUE, "showFlipCameraButton");
            }
            if (z8) {
                uVar.a(Boolean.TRUE, "useFlashlight");
            }
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f14072c;
            androidx.activity.result.g gVar = cVar.f7328c;
            HashMap hashMap = gVar.f7336b;
            String str3 = cVar.f7326a;
            Integer num = (Integer) hashMap.get(str3);
            s sVar = cVar.f7327b;
            if (num != null) {
                gVar.f7338d.add(str3);
                try {
                    gVar.b(num.intValue(), sVar, uVar);
                    this.f14073d = str2;
                } catch (Exception e9) {
                    gVar.f7338d.remove(str3);
                    throw e9;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + sVar + " and input " + uVar + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }
    }

    public s1(C0780t4 t4Var, String str, String str2) {
        this.f14075g = new I0(0, this);
        this.f14070a = t4Var;
        View inflate = LayoutInflater.from(t4Var).inflate(2131558492, (ViewGroup) null);
        this.f14072c = (TextView) inflate.findViewById(2131362611);
        TextView textView = (TextView) inflate.findViewById(2131362359);
        this.f14073d = textView;
        textView.setOnEditorActionListener(new G0(0, this));
        this.f14071b = new AlertDialog.Builder(t4Var).setTitle(String.format(t4Var.getText(2131951957).toString(), new Object[]{str, str2})).setIconAttribute(16843605).setView(inflate).setPositiveButton(2131951955, new H0(this, 0)).setNegativeButton(2131951665, new H0(this, 1)).setOnCancelListener(new h(3, this)).create();
    }

    public s1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f14073d = layoutParams;
        this.e = new Rect();
        this.f14074f = new int[2];
        this.f14075g = new int[2];
        this.f14070a = context;
        View inflate = LayoutInflater.from(context).inflate(2131558427, (ViewGroup) null);
        this.f14071b = inflate;
        this.f14072c = (TextView) inflate.findViewById(2131362258);
        layoutParams.setTitle(s1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132017156;
        layoutParams.flags = 24;
    }

    public s1(b bVar, C1214b bVar2) {
        this.f14075g = bVar;
        this.f14070a = M5.b.a(bVar2);
        B6.a b8 = M5.a.b(C4.b.f689a);
        this.f14071b = b8;
        this.f14072c = M5.a.b(new A4.h((M5.b) this.f14070a, b8, 2));
        this.f14073d = M5.a.b(new A4.h((M5.b) this.f14070a, (B6.a) this.f14071b, 1));
        B6.a b9 = M5.a.b(new f(12, (Object) (M5.b) this.f14070a));
        this.e = b9;
        this.f14074f = M5.a.b(new k((B6.a) this.f14072c, (B6.a) this.f14073d, b9, 17));
    }

    public s1(G2.e eVar, G2.e eVar2, G2.e eVar3, G2.e eVar4, q qVar, q qVar2) {
        this.f14075g = X2.c.a(150, new f(11, (Object) this));
        this.f14070a = eVar;
        this.f14071b = eVar2;
        this.f14072c = eVar3;
        this.f14073d = eVar4;
        this.e = qVar;
        this.f14074f = qVar2;
    }
}
