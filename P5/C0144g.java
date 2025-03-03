package P5;

import B.C0002c;
import B3.q;
import Q0.g;
import android.net.Uri;
import android.util.Log;
import de.ozerov.fully.C0782u0;
import de.ozerov.fully.C0808y2;
import de.ozerov.fully.P;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import n2.a;

/* renamed from: P5.g  reason: case insensitive filesystem */
public final class C0144g extends C0148k {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f3906w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0144g(int i) {
        super(3);
        this.f3906w = i;
    }

    public final K a() {
        String str;
        switch (this.f3906w) {
            case 0:
                if (!this.f3891p || !this.f3888m.equals("deleteSettingsFile") || this.f3884h.get("filename") == null || !((String) this.f3884h.get("filename")).endsWith(".json")) {
                    return null;
                }
                String str2 = (String) this.f3884h.get("filename");
                File file = new File(str2);
                boolean h02 = a.h0(this.f3879b);
                String str3 = this.f3878a;
                ArrayList arrayList = this.f3895t;
                if (!h02 && a.w0(this.f3879b, file)) {
                    Log.e(str3, "Missing runtime permissions to delete file");
                    arrayList.add("Missing runtime permissions to delete file");
                    return null;
                } else if (P.B() || !a.w0(this.f3879b, file)) {
                    try {
                        if (!file.delete()) {
                            return null;
                        }
                        ArrayList arrayList2 = this.f3894s;
                        arrayList2.add("Successfully deleted " + str2);
                        return null;
                    } catch (Exception unused) {
                        arrayList.add("Failed to delete " + str2);
                        return null;
                    }
                } else {
                    Log.e(str3, "Storage is not writable");
                    arrayList.add("Storage is not writable");
                    return null;
                }
            case 1:
                if (this.f3891p && this.f3888m.equals("downloadSettingsFile") && this.f3884h.get("filename") != null && ((String) this.f3884h.get("filename")).endsWith(".json")) {
                    String F8 = a.F(this.f3879b, (String) this.f3884h.get("filename"));
                    File file2 = new File(F8);
                    boolean g02 = a.g0(this.f3879b);
                    String str4 = this.f3878a;
                    ArrayList arrayList3 = this.f3895t;
                    if (!g02 && a.w0(this.f3879b, file2)) {
                        Log.e(str4, "Missing runtime permissions to read file");
                        arrayList3.add("Missing runtime permissions to read file");
                    } else if (P.C() || !a.w0(this.f3879b, file2)) {
                        try {
                            K g8 = P.g(J.OK, P.c(F8), new FileInputStream(file2));
                            D d8 = this.i;
                            if (d8 != null) {
                                d8.c(g8);
                            }
                            g8.k("content-disposition", "attachment; filename=\"" + file2.getName() + "\"");
                            return g8;
                        } catch (Exception unused2) {
                            arrayList3.add("Failed to download " + file2.getAbsolutePath());
                        }
                    } else {
                        Log.e(str4, "Storage is not readable");
                        arrayList3.add("Storage is not readable");
                    }
                }
                return null;
            case 2:
                if (!this.f3891p || !this.f3888m.equals("importSettingsFile")) {
                    return null;
                }
                String str5 = (String) this.f3884h.get("filename");
                String str6 = (String) this.f3884h.get("url");
                ArrayList arrayList4 = this.f3895t;
                if (str5 != null) {
                    if (!str5.endsWith(".json")) {
                        arrayList4.add("Missing or wrong filename parameter, must end with .json");
                    } else if (str6 == null) {
                        str6 = Uri.fromFile(new File(str5)).toString();
                    }
                }
                if (str6 == null || !P.I(str6)) {
                    arrayList4.add("Wrong URL to import from " + str6);
                    return null;
                }
                boolean startsWith = str6.startsWith("file://");
                ArrayList arrayList5 = this.f3894s;
                if (startsWith) {
                    try {
                        if (!this.f3879b.f9931T0.O(new File(new URI(str6)), 36)) {
                            arrayList4.add("Failed to import settings file from ".concat(str6));
                            return null;
                        }
                        this.f3879b.runOnUiThread(new C0143f(7, this));
                        arrayList5.add("Successfully imported settings");
                        return null;
                    } catch (Exception e) {
                        StringBuilder s8 = g.s("Failed to import settings file from ", str6, " due to ");
                        s8.append(e.getMessage());
                        arrayList4.add(s8.toString());
                        Log.w(this.f3878a, "Failed to import settings file from " + str6 + " due to " + e.getMessage());
                        return null;
                    }
                } else if (C0808y2.f(str6).equals("application/json") || C0808y2.e(this.f3879b, Uri.parse(str6)).equals("json")) {
                    q qVar = this.f3879b.f9931T0;
                    A.g gVar = new A.g(this, 6, str6);
                    qVar.getClass();
                    new C0782u0(qVar, 36, gVar).execute(new String[]{str6});
                    arrayList5.add("Importing settings...");
                    return null;
                } else {
                    arrayList4.add("URL not found or not JSON file ".concat(str6));
                    return null;
                }
            case 3:
                String str7 = (String) this.f3884h.get("config");
                if (!this.f3891p || !this.f3888m.equals("pushConfig") || str7 == null) {
                    return null;
                }
                a.a(200, str7);
                q qVar2 = this.f3879b.f9931T0;
                qVar2.getClass();
                if (!qVar2.P(new ByteArrayInputStream(str7.getBytes()), "config.json", 1)) {
                    this.f3895t.add("Config JSON check failed");
                    return null;
                }
                this.f3879b.runOnUiThread(new C0002c((Object) this, 18, (Object) str7));
                this.f3894s.add("Successfully pushed config");
                return null;
            default:
                if (!this.f3891p) {
                    return null;
                }
                if (!this.f3888m.equals("uploadSettingsFile") && !this.f3888m.equals("uploadAndImportSettingsFile")) {
                    return null;
                }
                String str8 = (String) this.f3884h.get("filename");
                String str9 = (String) this.f3884h.get("dir");
                String str10 = (String) this.f3882f.get("filename");
                ArrayList arrayList6 = this.f3895t;
                String str11 = this.f3878a;
                if (str8 == null || str10 == null || str8.isEmpty() || str9 == null) {
                    Log.e(str11, "File upload error");
                    arrayList6.add("File upload error");
                    return null;
                } else if (!str8.endsWith(".json")) {
                    Log.e(str11, "Only .json files allowed");
                    arrayList6.add("Only .json files allowed to upload");
                    return null;
                } else {
                    File file3 = new File(str10);
                    File file4 = new File(str9, str8);
                    boolean exists = file4.exists();
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file3);
                        FileOutputStream fileOutputStream = new FileOutputStream(file4);
                        byte[] bArr = new byte[65536];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read > 0) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                fileInputStream.close();
                                fileOutputStream.close();
                                if (!this.f3888m.equals("uploadSettingsFile")) {
                                    return null;
                                }
                                ArrayList arrayList7 = this.f3894s;
                                StringBuilder sb = new StringBuilder();
                                sb.append("Successfully uploaded ");
                                sb.append(str8);
                                if (exists) {
                                    str = " (overwriting old file)";
                                } else {
                                    str = "";
                                }
                                sb.append(str);
                                arrayList7.add(sb.toString());
                                return null;
                            }
                        }
                    } catch (IOException e8) {
                        Log.e(str11, "Failed to upload settings file due to " + e8.getMessage());
                        arrayList6.add("Failed to upload settings file due to " + e8.getMessage());
                        return null;
                    }
                }
                break;
        }
    }
}
