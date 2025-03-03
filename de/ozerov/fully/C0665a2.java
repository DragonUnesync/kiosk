package de.ozerov.fully;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import n2.a;

/* renamed from: de.ozerov.fully.a2  reason: case insensitive filesystem */
public final /* synthetic */ class C0665a2 implements Preference.OnPreferenceClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0695f2 f10548a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f10549b;

    public /* synthetic */ C0665a2(C0695f2 f2Var, String str) {
        this.f10548a = f2Var;
        this.f10549b = str;
    }

    public final boolean onPreferenceClick(Preference preference) {
        String str = this.f10549b;
        int i = C0695f2.f10625d0;
        C0695f2 f2Var = this.f10548a;
        f2Var.getClass();
        try {
            f2Var.f10627V.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            a.a1(1, f2Var.f10627V, "Unable to find the app to open privacy policy");
        }
        return true;
    }
}
