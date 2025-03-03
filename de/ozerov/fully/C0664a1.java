package de.ozerov.fully;

import Q0.g;
import Z1.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.util.Log;
import d4.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: de.ozerov.fully.a1  reason: case insensitive filesystem */
public final class C0664a1 {

    /* renamed from: a  reason: collision with root package name */
    public String f10543a;

    /* renamed from: b  reason: collision with root package name */
    public String f10544b;

    /* renamed from: c  reason: collision with root package name */
    public String f10545c;

    /* renamed from: d  reason: collision with root package name */
    public String f10546d;
    public Drawable e;

    /* renamed from: f  reason: collision with root package name */
    public int f10547f = 0;

    public static boolean a(Context context) {
        Iterator it = c(context).iterator();
        while (it.hasNext()) {
            C0664a1 a1Var = (C0664a1) it.next();
            if (a1Var.f10543a != null) {
                return true;
            }
            String str = a1Var.f10544b;
            if (str != null && str.startsWith("intent:")) {
                return true;
            }
        }
        return false;
    }

    public static void b(C0664a1 a1Var, Context context) {
        ComponentName componentName;
        PackageManager packageManager = context.getPackageManager();
        String str = a1Var.f10546d;
        if (str == null || str.isEmpty()) {
            String str2 = a1Var.f10543a;
            if (str2 != null) {
                ComponentName p3 = C0794w0.p(context, str2);
                try {
                    a1Var.e = context.getPackageManager().getActivityIcon(p3);
                    if (a1Var.f10545c == null) {
                        a1Var.f10545c = C0794w0.k(context, p3);
                    }
                    a1Var.f10547f = 1;
                } catch (Exception unused) {
                    Log.w("a1", "Launcher app " + a1Var.f10543a + " not found or failed to get info for " + p3);
                    a1Var.f10547f = 0;
                    if (a1Var.e == null) {
                        a1Var.e = context.getDrawable(2131230966);
                    }
                }
            } else {
                String str3 = a1Var.f10544b;
                if (str3 == null || !str3.startsWith("intent:")) {
                    String str4 = a1Var.f10544b;
                    if (str4 == null || !str4.startsWith("javascript:")) {
                        String str5 = a1Var.f10544b;
                        if (str5 == null || !str5.startsWith("file:")) {
                            a1Var.e = context.getDrawable(2131230971);
                            a1Var.f10547f = 1;
                            return;
                        }
                        try {
                            Intent e02 = a.e0(context, a1Var.f10544b);
                            ResolveInfo resolveActivity = packageManager.resolveActivity(e02, 65536);
                            if (resolveActivity.activityInfo.name.contains("ResolverActivity")) {
                                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(e02, 65536);
                                if (queryIntentActivities.size() > 0) {
                                    resolveActivity = queryIntentActivities.get(0);
                                    String str6 = resolveActivity.activityInfo.packageName;
                                } else {
                                    throw new IllegalStateException("No activity found for file");
                                }
                            }
                            a1Var.e = resolveActivity.loadIcon(packageManager);
                            if (a1Var.f10545c == null) {
                                a1Var.f10545c = a.j1(new File(a1Var.f10544b).getName());
                            }
                            a1Var.f10547f = 1;
                        } catch (Exception unused2) {
                            Log.e("a1", "Can't get default activity for file " + a1Var.f10544b);
                            a1Var.f10547f = 0;
                            a1Var.f10545c = "NO HANDLING APP FOUND";
                            if (a1Var.e == null) {
                                a1Var.e = context.getDrawable(2131230966);
                            }
                        }
                    } else {
                        a1Var.e = context.getDrawable(2131230963);
                        a1Var.f10547f = 1;
                        if (a1Var.f10545c == null) {
                            a1Var.f10545c = "JavaScript";
                        }
                    }
                } else {
                    try {
                        ResolveInfo resolveActivity2 = context.getPackageManager().resolveActivity(a.P0(a1Var.f10544b), 65536);
                        if (resolveActivity2 != null) {
                            ActivityInfo activityInfo = resolveActivity2.activityInfo;
                            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                        } else {
                            componentName = null;
                        }
                        a1Var.e = context.getPackageManager().getActivityIcon(componentName);
                        if (a1Var.f10545c == null) {
                            a1Var.f10545c = C0794w0.k(context, componentName);
                        }
                        a1Var.f10547f = 1;
                    } catch (Exception unused3) {
                        Log.w("a1", "Malformed Intent URL or target component not found for " + a1Var.f10544b);
                        a1Var.f10547f = 0;
                        if (a1Var.e == null) {
                            a1Var.e = context.getDrawable(2131230966);
                        }
                    }
                }
            }
        } else {
            a1Var.f10547f = 1;
        }
    }

    public static ArrayList c(Context context) {
        ArrayList arrayList = new ArrayList();
        String r8 = ((c) new k(context, 1).f9767W).r("launcherApps", "");
        if (!r8.trim().isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(r8);
                for (int i = 0; i < jSONArray.length(); i++) {
                    C0664a1 a1Var = new C0664a1();
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        a1Var.f10545c = a.S(jSONObject, "label", (String) null);
                        a1Var.f10543a = a.S(jSONObject, "component", (String) null);
                        a1Var.f10544b = a.S(jSONObject, "url", (String) null);
                        a1Var.f10546d = a.S(jSONObject, "iconUrl", (String) null);
                        b(a1Var, context);
                        arrayList.add(a1Var);
                    } catch (Exception e8) {
                        g.x(e8, new StringBuilder("getJSONObject failed due to "), "a1");
                    }
                }
            } catch (Exception e9) {
                g.x(e9, new StringBuilder("JSON parser failed due to "), "a1");
            }
        }
        return arrayList;
    }

    public static void d(FullyActivity fullyActivity, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0664a1 a1Var = (C0664a1) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("label", a1Var.f10545c);
                String str = a1Var.f10543a;
                if (str != null) {
                    jSONObject.put("component", str);
                }
                String str2 = a1Var.f10544b;
                if (str2 != null) {
                    jSONObject.put("url", str2);
                }
                String str3 = a1Var.f10546d;
                if (str3 != null) {
                    jSONObject.put("iconUrl", str3);
                }
                jSONArray.put(jSONObject);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        String str4 = "";
        try {
            if (!list.isEmpty()) {
                str4 = jSONArray.toString(2).replace("\\/", "/");
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        fullyActivity.f9961z0.V2("launcherApps", str4);
    }
}
