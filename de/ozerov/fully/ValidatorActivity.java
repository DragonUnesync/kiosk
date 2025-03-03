package de.ozerov.fully;

import C3.C0025a;
import android.app.Activity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import n2.a;
import org.json.JSONObject;

public class ValidatorActivity extends Activity {

    /* renamed from: U  reason: collision with root package name */
    public static final /* synthetic */ int f10463U = 0;

    public static LinearLayout.LayoutParams a(int i, int i8, int i9, int i10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i8);
        layoutParams.weight = (float) i9;
        layoutParams.gravity = i10;
        return layoutParams;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int applyDimension = (int) TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        int i = applyDimension * 32;
        int i8 = applyDimension * 16;
        linearLayout.setPadding(i, i8, i, i8);
        Space space = new Space(this);
        TextView textView = new TextView(this);
        int i9 = applyDimension * 8;
        textView.setPadding(0, i9, 0, i9);
        textView.setTextSize(32.0f);
        textView.setText("Re-install app");
        JSONObject j7 = P.j(this);
        TextView textView2 = new TextView(this);
        textView2.setPadding(0, i9, 0, i9);
        textView2.setTextSize(16.0f);
        textView2.setText("This copy of " + a.G(this) + " is corrupted and can't be launched. Please, install original version from Google Play.\n\nIn case of any questions send a screenshot to info@fully-kiosk.com");
        TextView textView3 = new TextView(this);
        textView3.setPadding(0, i9, 0, i9);
        textView3.setTextSize(10.0f);
        textView3.setText(j7.toString());
        Button button = new Button(this);
        button.setPadding(i8, i8, i8, i8);
        button.setText("Close");
        button.setOnClickListener(new C0025a(16, this));
        Space space2 = new Space(this);
        linearLayout.addView(space, a(0, 0, 1, -1));
        linearLayout.addView(textView, a(-2, -2, 0, -1));
        linearLayout.addView(textView2, a(-1, -2, 0, -1));
        linearLayout.addView(textView3, a(-1, -2, 0, -1));
        linearLayout.addView(button, a(-2, -2, 0, 1));
        linearLayout.addView(space2, a(-1, -2, 1, -1));
        setContentView(linearLayout);
    }
}
