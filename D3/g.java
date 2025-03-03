package d3;

import B3.n;
import Z2.a;
import a3.C0415a;
import a3.C0417c;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import androidx.camera.lifecycle.c;
import b3.C0528a;
import b3.C0529b;
import b3.C0530c;
import c3.C0614a;
import com.woxthebox.draglistview.R;
import g7.l;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;

public final class g extends Dialog implements AdapterView.OnItemClickListener {

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ int f9731m0 = 0;

    /* renamed from: U  reason: collision with root package name */
    public final Context f9732U;

    /* renamed from: V  reason: collision with root package name */
    public ListView f9733V;

    /* renamed from: W  reason: collision with root package name */
    public TextView f9734W;

    /* renamed from: X  reason: collision with root package name */
    public TextView f9735X;

    /* renamed from: Y  reason: collision with root package name */
    public TextView f9736Y;

    /* renamed from: Z  reason: collision with root package name */
    public View f9737Z;

    /* renamed from: a0  reason: collision with root package name */
    public final C0528a f9738a0;

    /* renamed from: b0  reason: collision with root package name */
    public a f9739b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ArrayList f9740c0;

    /* renamed from: d0  reason: collision with root package name */
    public final C0614a f9741d0;

    /* renamed from: e0  reason: collision with root package name */
    public C0417c f9742e0;

    /* renamed from: f0  reason: collision with root package name */
    public Button f9743f0;

    /* renamed from: g0  reason: collision with root package name */
    public String f9744g0;

    /* renamed from: h0  reason: collision with root package name */
    public String f9745h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f9746i0;

    /* renamed from: j0  reason: collision with root package name */
    public f f9747j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayDeque f9748k0;

    /* renamed from: l0  reason: collision with root package name */
    public Window f9749l0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(android.content.Context r3, b3.C0528a r4) {
        /*
            r2 = this;
            android.content.res.Resources r0 = r3.getResources()
            r1 = 2131034117(0x7f050005, float:1.7678742E38)
            boolean r0 = r0.getBoolean(r1)
            if (r0 == 0) goto L_0x0011
            r0 = 16973939(0x1030073, float:2.4061222E-38)
            goto L_0x0014
        L_0x0011:
            r0 = 16973934(0x103006e, float:2.4061208E-38)
        L_0x0014:
            r2.<init>(r3, r0)
            r0 = 0
            r2.f9744g0 = r0
            r2.f9745h0 = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.f9748k0 = r0
            r2.f9732U = r3
            r2.f9738a0 = r4
            c3.a r3 = new c3.a
            r3.<init>(r4)
            r2.f9741d0 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f9740c0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.g.<init>(android.content.Context, b3.a):void");
    }

    public final void a(File file, Runnable runnable) {
        f fVar = this.f9747j0;
        if (fVar != null) {
            fVar.cancel(true);
        }
        f fVar2 = new f(this, file, runnable);
        this.f9747j0 = fVar2;
        fVar2.execute(new Void[0]);
    }

    public final void b() {
        TextView textView = this.f9736Y;
        if (textView != null && this.f9734W != null) {
            if (this.f9744g0 != null) {
                if (textView.getVisibility() == 4) {
                    this.f9736Y.setVisibility(0);
                }
                this.f9736Y.setText(this.f9744g0);
                if (this.f9734W.getVisibility() == 0) {
                    this.f9734W.setVisibility(4);
                    return;
                }
                return;
            }
            if (textView.getVisibility() == 0) {
                this.f9736Y.setVisibility(4);
            }
            if (this.f9734W.getVisibility() == 4) {
                this.f9734W.setVisibility(0);
            }
        }
    }

    public final void dismiss() {
        HashMap hashMap = C0530c.f8663a;
        C0530c.f8663a = new HashMap();
        this.f9740c0.clear();
        super.dismiss();
    }

    public final void onBackPressed() {
        String charSequence = this.f9734W.getText().toString();
        ArrayList arrayList = this.f9740c0;
        if (arrayList.size() > 0) {
            File file = new File(((C0529b) arrayList.get(0)).f8660V);
            if (charSequence.equals(((File) this.f9738a0.f8656d).getName()) || !file.canRead()) {
                super.onBackPressed();
            } else {
                this.f9734W.setText(file.getName());
                this.f9735X.setText(file.getAbsolutePath());
                arrayList.clear();
                a(file, new b(this, 1));
            }
            b();
            return;
        }
        super.onBackPressed();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(2131558462);
        this.f9737Z = findViewById(2131362401);
        ListView listView = (ListView) findViewById(2131362084);
        this.f9733V = listView;
        listView.setOnItemSelectedListener(new e(0, this));
        this.f9743f0 = (Button) findViewById(2131362465);
        int size = C0530c.f8663a.size();
        Context context = this.f9732U;
        if (size == 0) {
            this.f9743f0.setEnabled(false);
            if (Build.VERSION.SDK_INT >= 23) {
                i = context.getResources().getColor(2131099695, context.getTheme());
            } else {
                i = context.getResources().getColor(2131099695);
            }
            this.f9743f0.setTextColor(Color.argb(128, Color.red(i), Color.green(i), Color.blue(i)));
        }
        this.f9734W = (TextView) findViewById(2131361993);
        this.f9736Y = (TextView) findViewById(R.id.title);
        this.f9735X = (TextView) findViewById(2131361986);
        this.f9743f0.setOnClickListener(new c(this, 0));
        ((Button) findViewById(2131361925)).setOnClickListener(new c(this, 1));
        Button button = (Button) findViewById(2131362524);
        ArrayList Z7 = n2.a.Z(context, false);
        C0528a aVar = this.f9738a0;
        if (!aVar.f8654b) {
            button.setVisibility(8);
        }
        button.setOnClickListener(new C0415a(this, button, Z7, 1));
        C0417c cVar = new C0417c(this.f9740c0, context, aVar);
        this.f9742e0 = cVar;
        cVar.f7179X = new c(2, this);
        this.f9733V.setAdapter(cVar);
        b();
        if (!n2.a.u0()) {
            n f8 = n.f(findViewById(2131362087), "Scoped storage mode active. Only allowed media files visible in shared storage. Check FAQs!", 5000);
            f8.g("OK", new d(f8, 0));
            f8.h();
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j7) {
        ArrayList arrayList = this.f9740c0;
        if (arrayList.size() > i) {
            C0529b bVar = (C0529b) arrayList.get(i);
            if (!bVar.f8661W) {
                ((CheckBox) view.findViewById(2131362089)).performClick();
            } else if (new File(bVar.f8660V).canRead()) {
                File file = new File(bVar.f8660V);
                this.f9734W.setText(file.getName());
                b();
                this.f9735X.setText(file.getAbsolutePath());
                a(file, new b(this, 2));
            } else {
                n2.a.b1(this.f9732U, getContext().getString(2131951715));
            }
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        View view;
        View findViewById;
        if ((i == 22 || i == 21) && (view = this.f9746i0) != null && view.isSelected() && (findViewById = this.f9746i0.findViewById(2131362089)) != null && findViewById.getVisibility() == 0) {
            findViewById.performClick();
        }
        return super.onKeyDown(i, keyEvent);
    }

    public final void onStart() {
        File file;
        super.onStart();
        String str = this.f9745h0;
        Context context = this.f9732U;
        if (str == null) {
            str = context.getResources().getString(2131951670);
        }
        this.f9745h0 = str;
        this.f9743f0.setText(str);
        if (l.b(context)) {
            C0528a aVar = this.f9738a0;
            if (((File) aVar.f8657f).isDirectory()) {
                String absolutePath = ((File) aVar.f8657f).getAbsolutePath();
                String absolutePath2 = ((File) aVar.f8656d).getAbsolutePath();
                if (!absolutePath.equals(absolutePath2) && absolutePath.contains(absolutePath2)) {
                    file = new File(((File) aVar.f8657f).getAbsolutePath());
                    this.f9734W.setText(file.getName());
                    this.f9735X.setText(file.getAbsolutePath());
                    b();
                    a(file, new b(this, 0));
                }
            }
            if (!((File) aVar.f8656d).exists() || !((File) aVar.f8656d).isDirectory()) {
                file = new File(((File) aVar.e).getAbsolutePath());
            } else {
                file = new File(((File) aVar.f8656d).getAbsolutePath());
            }
            this.f9734W.setText(file.getName());
            this.f9735X.setText(file.getAbsolutePath());
            b();
            a(file, new b(this, 0));
        }
    }

    public final void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f9744g0 = charSequence.toString();
        } else {
            this.f9744g0 = null;
        }
        b();
    }

    public final void show() {
        Context context = this.f9732U;
        if (l.b(context)) {
            super.show();
            String str = this.f9745h0;
            if (str == null) {
                str = context.getResources().getString(2131951670);
            }
            this.f9745h0 = str;
            this.f9743f0.setText(str);
            int size = C0530c.f8663a.size();
            if (size == 0) {
                this.f9743f0.setText(this.f9745h0);
            } else {
                this.f9743f0.setText(this.f9745h0 + " (" + size + ") ");
            }
        } else if (n2.a.q0() && n2.a.b0(context) >= 30 && !Environment.isExternalStorageManager() && n2.a.i0(context, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
            try {
                Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + context.getPackageName()));
                Log.d("g", "Request manage storage permission");
                ((Activity) context).startActivityForResult(intent, 112);
            } catch (Exception unused) {
                n2.a.b1(context, "Failed to get the Manage Storage Permission");
                Log.e("g", "Manage storage permission failed");
            }
        } else if (n2.a.F0() && n2.a.b0(context) >= 34) {
            ((Activity) context).requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}, 112);
        } else if (n2.a.E0() && n2.a.b0(context) >= 33) {
            ((Activity) context).requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_AUDIO", "android.permission.READ_MEDIA_VIDEO"}, 112);
        } else if (n2.a.y0()) {
            Activity activity = (Activity) context;
            if (!activity.shouldShowRequestPermissionRationale("android.permission.READ_EXTERNAL_STORAGE")) {
                n2.a.b1(context, "Missing file read permission");
            }
            activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 112);
        }
        if (this.f9749l0 != null) {
            Log.d("FilePickerDialog", "Copy window attrs");
            n2.a.r(this.f9749l0, getWindow());
        }
    }
}
