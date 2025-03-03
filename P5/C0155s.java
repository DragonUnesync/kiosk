package P5;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import de.ozerov.fully.B1;
import de.ozerov.fully.C0777t1;
import de.ozerov.fully.C0783u1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import n2.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: P5.s  reason: case insensitive filesystem */
public final class C0155s extends C0138a {

    /* renamed from: v  reason: collision with root package name */
    public ArrayList f3921v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList f3922w;

    /* renamed from: x  reason: collision with root package name */
    public ArrayList f3923x;

    public final K a() {
        if (!this.f3891p) {
            return null;
        }
        ArrayList b8 = B1.b(this.f3879b);
        this.f3921v = b8;
        ArrayList a8 = C0783u1.a(b8);
        this.f3922w = a8;
        this.f3923x = C0777t1.a(this.f3879b, a8);
        if (!this.f3888m.equals("localFilesAlertMigrate")) {
            return null;
        }
        if (!this.f3923x.isEmpty()) {
            new Thread(new t(this, 0)).start();
            this.f3894s.add("Migration started in background. Watch Fully Log for results. After migration remember to always use the app-specific storage for files!");
            return null;
        }
        this.f3895t.add("Nothing found to migrate");
        return null;
    }

    public final String c() {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        StringBuilder sb = new StringBuilder();
        if (this.f3891p) {
            sb.append(b());
            if (!this.f3888m.equals("localFilesAlertCheck")) {
                sb.append("<script>history.replaceState(null, '', 'localFilesAlertCheck');</script>");
            }
            sb.append("<h1>Local Files Alert</h1>\n");
            if (!this.f3921v.isEmpty()) {
                File I8 = this.f3879b.f9931T0.I();
                if (!a.i0(this.f3879b, "android.permission.MANAGE_EXTERNAL_STORAGE") || !a.q0() || Environment.isExternalStorageManager()) {
                    z = false;
                } else {
                    z = true;
                }
                this.f3879b.getClass();
                sb.append("<p>&#x26A0; Following settings are using local files on shared storage. Due to evolving Google Play policies Fully won't be able to access shared storage after the next app upgrade (starting February 2025).</p><h2>Affected Settings</h2>\n<table class='table'>\n");
                sb.append(C0138a.f("Setting", "Value", "Status"));
                Iterator it = this.f3921v.iterator();
                while (true) {
                    str = "FILE";
                    if (!it.hasNext()) {
                        break;
                    }
                    B1 b12 = (B1) it.next();
                    String str6 = b12.f9794a.f9784b;
                    if (b12.e) {
                        str = "FOLDER";
                    }
                    if (b12.f9799g) {
                        str5 = " FOUND";
                    } else {
                        str5 = " NOT FOUND";
                    }
                    sb.append(C0138a.i(str6, b12.f9795b, str.concat(str5)));
                }
                sb.append("</table>\n");
                if (z) {
                    sb.append("<p><b>Option 1:</b> You grant the <b>All Files Access</b> permission to Fully. This however must be done ON THE DEVICE! This button will open the permission dialog on the device!</p>");
                    if (!this.f3888m.equals("localFilesAlertMigrate")) {
                        String o02 = a.o0(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + this.f3879b.getPackageName())));
                        sb.append("<p class='buttonline'><a href='' class='button' onclick='sequentialAjaxRequests([\"startIntent?url=" + a.k1(o02) + "&result=1021&type=json\"]);return false;'>Show Permission Dialog</a></p>");
                    }
                }
                if (z) {
                    str2 = "<p><b>Option 2:</b> ";
                } else {
                    str2 = "<p><b>Solution:</b> ";
                }
                sb.append(str2.concat("We migrate affected files to the app-specific storage as listed below and adjust the settings accordingly. Note that the app-specific storage can only be accessed by our app and will be removed if you uninstall our app.</p>\n"));
                if (I8 != null) {
                    sb.append("<p>&#x26A0; We found a settings file <b>" + I8.getAbsolutePath() + "</b> which is imported on every app start. Please <b>remove this file</b> prior to starting the migration as the old settings could revert the migration results.</p>\n");
                }
                this.f3879b.getClass();
                sb.append("<p><a target='_blank' href='https://www.fully-kiosk.com/en/#faq-localfilesalert'>Read FAQ for details!</a></p>\n<h2>Files to Migrate</h2>\n");
                if (!this.f3922w.isEmpty()) {
                    sb.append("<table class='table'>\n");
                    sb.append(C0138a.f("Action", "Type", "Size"));
                    Iterator it2 = this.f3922w.iterator();
                    while (it2.hasNext()) {
                        C0783u1 u1Var = (C0783u1) it2.next();
                        StringBuilder sb2 = new StringBuilder();
                        if (u1Var.f10992g == 1) {
                            str3 = "Copy (overwriting)";
                        } else {
                            str3 = "Move (overwriting)";
                        }
                        sb2.append(str3);
                        sb2.append("<br/>From: ");
                        sb2.append(u1Var.f10987a.getAbsolutePath());
                        sb2.append("<br/>To: ");
                        sb2.append(u1Var.f10988b.getAbsolutePath());
                        String sb3 = sb2.toString();
                        if (u1Var.e) {
                            str4 = "FOLDER";
                        } else {
                            str4 = str;
                        }
                        sb.append(C0138a.i(sb3, str4, a.V(u1Var.f10989c)));
                    }
                    sb.append("</table>\n");
                } else {
                    sb.append("<p>No files to migrate found</p>");
                }
                if (!this.f3923x.isEmpty()) {
                    sb.append("<h2>Summary</h2>\n<table class='table'>\n");
                    sb.append(C0138a.f("Destination", "To Copy", "Free Space"));
                    Iterator it3 = this.f3923x.iterator();
                    while (it3.hasNext()) {
                        C0777t1 t1Var = (C0777t1) it3.next();
                        sb.append(C0138a.i(t1Var.f10961a.getAbsolutePath(), a.V(t1Var.f10963c), a.V(t1Var.f10962b)));
                    }
                    sb.append("</table>\n");
                    if (!this.f3888m.equals("localFilesAlertMigrate") && I8 == null) {
                        sb.append("<p class='buttonline'><a href='localFilesAlertMigrate' class='button'>Start Migration</a></p>");
                    }
                }
            } else {
                sb.append("<p>No settings using local files on shared storage found</p>");
            }
        }
        return sb.toString();
    }

    public final String d() {
        String str;
        if (!this.f3891p) {
            return C0138a.e("Please login");
        }
        if (!this.f3888m.equals("localFilesAlertCheck")) {
            return super.d();
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f3921v.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = this.f3878a;
            if (!hasNext) {
                break;
            }
            B1 b12 = (B1) it.next();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("key", b12.f9794a.f9783a);
                jSONObject2.put("title", b12.f9794a.f9784b);
                jSONObject2.put("value", b12.f9795b);
                jSONObject2.put("oldLocation", b12.f9796c);
                jSONObject2.put("newLocation", b12.f9797d);
                jSONObject2.put("isFound", b12.f9799g);
            } catch (JSONException e) {
                Log.e(str, "Failed to add JSON property due to " + e.getMessage());
            }
            jSONArray.put(jSONObject2);
        }
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f3922w.iterator();
        while (it2.hasNext()) {
            C0783u1 u1Var = (C0783u1) it2.next();
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("oldLocation", u1Var.f10987a);
                jSONObject3.put("newLocation", u1Var.f10988b);
                jSONObject3.put("isDirectory", u1Var.e);
                jSONObject3.put("size", u1Var.f10989c);
            } catch (JSONException e8) {
                Log.e(str, "Failed to add JSON property due to " + e8.getMessage());
            }
            jSONArray2.put(jSONObject3);
        }
        JSONArray jSONArray3 = new JSONArray();
        Iterator it3 = this.f3923x.iterator();
        while (it3.hasNext()) {
            C0777t1 t1Var = (C0777t1) it3.next();
            JSONObject jSONObject4 = new JSONObject();
            try {
                jSONObject4.put("location", t1Var.f10961a);
                jSONObject4.put("plannedUsage", t1Var.f10963c);
                jSONObject4.put("usableSpace", t1Var.f10962b);
                jSONObject4.put("spaceStatus", t1Var.f10964d);
            } catch (JSONException e9) {
                Log.e(str, "Failed to add JSON property due to " + e9.getMessage());
            }
            jSONArray3.put(jSONObject4);
        }
        try {
            jSONObject.put("migrationItems", jSONArray);
            jSONObject.put("mergedLocations", jSONArray2);
            jSONObject.put("destinations", jSONArray3);
        } catch (JSONException e10) {
            Log.e(str, "Failed to add JSON property due to " + e10.getMessage());
        }
        try {
            return jSONObject.toString(2).replace("\\/", "/");
        } catch (Exception unused) {
            return "";
        }
    }
}
