package P5;

import D4.h;
import Y2.g;
import android.util.Log;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.C0800x0;
import de.ozerov.fully.P;
import j$.util.Comparator;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import n2.a;

/* renamed from: P5.k  reason: case insensitive filesystem */
public class C0148k extends C0138a {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f3911v;

    public /* synthetic */ C0148k(int i) {
        this.f3911v = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: P5.K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: P5.K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v33, resolved type: P5.K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: P5.K} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v35 */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0038, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public P5.K a() {
        /*
            r13 = this;
            int r0 = r13.f3911v
            switch(r0) {
                case 0: goto L_0x01c4;
                case 1: goto L_0x011a;
                case 2: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            P5.K r0 = super.a()
            return r0
        L_0x000a:
            boolean r0 = r13.f3891p
            r1 = 0
            if (r0 == 0) goto L_0x0119
            java.lang.String r0 = r13.f3888m
            java.lang.String r2 = "listSettingsCsv"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0119
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            de.ozerov.fully.FullyActivity r2 = r13.f3879b
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)
            de.ozerov.fully.FullyActivity r3 = r13.f3879b
            de.ozerov.fully.s0 r3 = r3.f9932U0
            android.preference.PreferenceScreen r3 = r3.f10938a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = ""
            de.ozerov.fully.C0770s0.b(r3, r5, r5, r4)
            java.util.Iterator r3 = r4.iterator()
        L_0x0038:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0106
            java.lang.Object r4 = r3.next()
            android.preference.Preference r4 = (android.preference.Preference) r4
            if (r4 != 0) goto L_0x0047
            goto L_0x0038
        L_0x0047:
            boolean r6 = r4 instanceof android.preference.PreferenceScreen
            if (r6 == 0) goto L_0x005a
            java.lang.CharSequence r6 = r4.getTitle()
            if (r6 == 0) goto L_0x005a
            java.lang.CharSequence r1 = r4.getTitle()
            java.lang.String r1 = r1.toString()
            goto L_0x0038
        L_0x005a:
            boolean r6 = r4 instanceof de.ozerov.fully.MyPreferenceCategory
            if (r6 == 0) goto L_0x005f
            goto L_0x0038
        L_0x005f:
            boolean r6 = r4 instanceof de.ozerov.fully.SwitchPref
            r7 = 0
            if (r6 == 0) goto L_0x0076
            java.lang.String r6 = r4.getKey()
            boolean r6 = r2.getBoolean(r6, r7)
            if (r6 == 0) goto L_0x0071
            java.lang.String r6 = "on"
            goto L_0x0073
        L_0x0071:
            java.lang.String r6 = "off"
        L_0x0073:
            java.lang.String r7 = "Switch"
            goto L_0x00bb
        L_0x0076:
            boolean r6 = r4 instanceof de.ozerov.fully.TextPref
            if (r6 == 0) goto L_0x0085
            java.lang.String r6 = r4.getKey()
            java.lang.String r6 = r2.getString(r6, r5)
            java.lang.String r7 = "Text"
            goto L_0x00bb
        L_0x0085:
            boolean r6 = r4 instanceof android.preference.ListPreference
            if (r6 == 0) goto L_0x00b8
            java.lang.String r6 = r4.getKey()
            java.lang.String r6 = r2.getString(r6, r5)
            r8 = r4
            android.preference.ListPreference r8 = (android.preference.ListPreference) r8
            java.lang.CharSequence[] r9 = r8.getEntries()
            java.lang.CharSequence[] r8 = r8.getEntryValues()
            r7 = r5
            r10 = 0
        L_0x009e:
            int r11 = r9.length
            if (r10 >= r11) goto L_0x00b2
            r11 = r8[r10]
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto L_0x00af
            r7 = r9[r10]
            java.lang.String r7 = r7.toString()
        L_0x00af:
            int r10 = r10 + 1
            goto L_0x009e
        L_0x00b2:
            java.lang.String r6 = "List"
            r12 = r7
            r7 = r6
            r6 = r12
            goto L_0x00bb
        L_0x00b8:
            java.lang.String r7 = "Button"
            r6 = r5
        L_0x00bb:
            if (r1 != 0) goto L_0x00bf
            java.lang.String r1 = "???"
        L_0x00bf:
            java.lang.String r8 = r4.getKey()
            if (r8 == 0) goto L_0x0038
            java.lang.CharSequence r8 = r4.getTitle()
            if (r8 == 0) goto L_0x0038
            java.lang.String r8 = ";"
            java.lang.StringBuilder r9 = N.e.B(r1, r8)
            java.lang.String r10 = r4.getKey()
            r9.append(r10)
            r9.append(r8)
            java.lang.CharSequence r10 = r4.getTitle()
            r9.append(r10)
            r9.append(r8)
            r9.append(r7)
            r9.append(r8)
            java.lang.CharSequence r4 = r4.getSummary()
            r9.append(r4)
            r9.append(r8)
            r9.append(r6)
            java.lang.String r4 = "\n"
            r9.append(r4)
            java.lang.String r4 = r9.toString()
            r0.append(r4)
            goto L_0x0038
        L_0x0106:
            java.lang.String r0 = r0.toString()
            P5.J r1 = P5.J.OK
            java.lang.String r2 = "text/html"
            P5.K r1 = P5.P.h(r1, r2, r0)
            P5.D r0 = r13.i
            if (r0 == 0) goto L_0x0119
            r0.c(r1)
        L_0x0119:
            return r1
        L_0x011a:
            boolean r0 = r13.f3891p
            r1 = 0
            if (r0 == 0) goto L_0x01c3
            java.lang.String r0 = r13.f3888m
            java.lang.String r2 = "getHtmlSource"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01c3
            java.util.HashMap r0 = r13.f3884h
            java.lang.String r2 = "dl"
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0155
            java.util.HashMap r0 = r13.f3884h
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "1"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0153
            java.util.HashMap r0 = r13.f3884h
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "true"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0155
        L_0x0153:
            r0 = 1
            goto L_0x0156
        L_0x0155:
            r0 = 0
        L_0x0156:
            de.ozerov.fully.FullyActivity r2 = r13.f3879b
            P5.f r3 = new P5.f
            r4 = 6
            r3.<init>(r4, r13)
            r2.runOnUiThread(r3)
            r2 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r2)     // Catch:{ Exception -> 0x0167 }
            goto L_0x0168
        L_0x0167:
        L_0x0168:
            de.ozerov.fully.FullyActivity r2 = r13.f3879b
            de.ozerov.fully.i5 r2 = r2.f9917F0
            if (r2 == 0) goto L_0x0179
            de.ozerov.fully.g5 r2 = r2.f10711d
            if (r2 == 0) goto L_0x0179
            de.ozerov.fully.MyWebView r2 = r2.f10664g
            if (r2 == 0) goto L_0x0179
            java.lang.String r2 = r2.f10130j0
            goto L_0x017a
        L_0x0179:
            r2 = r1
        L_0x017a:
            java.util.ArrayList r3 = r13.f3895t
            if (r2 == 0) goto L_0x01be
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x019d }
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ Exception -> 0x019d }
            byte[] r2 = r2.getBytes(r5)     // Catch:{ Exception -> 0x019d }
            r4.<init>(r2)     // Catch:{ Exception -> 0x019d }
            P5.J r2 = P5.J.OK     // Catch:{ Exception -> 0x019d }
            java.lang.String r5 = "fully-single-app-snapshot.html"
            java.lang.String r5 = P5.P.c(r5)     // Catch:{ Exception -> 0x019d }
            P5.K r2 = P5.P.g(r2, r5, r4)     // Catch:{ Exception -> 0x019d }
            P5.D r4 = r13.i     // Catch:{ Exception -> 0x019d }
            if (r4 == 0) goto L_0x019f
            r4.c(r2)     // Catch:{ Exception -> 0x019d }
            goto L_0x019f
        L_0x019d:
            r0 = move-exception
            goto L_0x01b0
        L_0x019f:
            java.lang.String r4 = "content-disposition"
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = "attachment; filename=\"fully-single-app-snapshot.html\""
            r2.k(r4, r0)     // Catch:{ Exception -> 0x019d }
            goto L_0x01ae
        L_0x01a9:
            java.lang.String r0 = "inline; filename=\"fully-single-app-snapshot.html\""
            r2.k(r4, r0)     // Catch:{ Exception -> 0x019d }
        L_0x01ae:
            r1 = r2
            goto L_0x01c3
        L_0x01b0:
            r0.printStackTrace()
            java.lang.String r0 = r13.f3878a
            java.lang.String r2 = "Failed to make a HTML snapshot"
            android.util.Log.e(r0, r2)
            r3.add(r2)
            goto L_0x01c3
        L_0x01be:
            java.lang.String r0 = "No snapshot available"
            r3.add(r0)
        L_0x01c3:
            return r1
        L_0x01c4:
            java.lang.String r0 = "fully-single-app-camshot.jpg"
            boolean r1 = r13.f3891p
            if (r1 == 0) goto L_0x027b
            java.lang.String r1 = r13.f3888m
            java.lang.String r2 = "getCamshot"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x027b
            java.util.HashMap r1 = r13.f3884h
            java.lang.String r2 = "dl"
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x0200
            java.util.HashMap r1 = r13.f3884h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "1"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x01fe
            java.util.HashMap r1 = r13.f3884h
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "true"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0200
        L_0x01fe:
            r1 = 1
            goto L_0x0201
        L_0x0200:
            r1 = 0
        L_0x0201:
            de.ozerov.fully.FullyActivity r2 = r13.f3879b
            N5.k r2 = r2.f9958x1
            android.graphics.Bitmap r2 = r2.d()
            java.util.ArrayList r3 = r13.f3895t
            if (r2 == 0) goto L_0x0276
            de.ozerov.fully.FullyActivity r4 = r13.f3879b
            N5.k r4 = r4.f9958x1
            boolean r4 = r4.f()
            if (r4 == 0) goto L_0x0276
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0256 }
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x0256 }
            de.ozerov.fully.FullyActivity r6 = r13.f3879b     // Catch:{ Exception -> 0x0256 }
            java.io.File r6 = r6.getCacheDir()     // Catch:{ Exception -> 0x0256 }
            r5.<init>(r6, r0)     // Catch:{ Exception -> 0x0256 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0256 }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0256 }
            r6 = 90
            r2.compress(r5, r6, r4)     // Catch:{ Exception -> 0x0256 }
            r2.recycle()     // Catch:{ Exception -> 0x0256 }
            r4.close()     // Catch:{ Exception -> 0x0256 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0256 }
            java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0256 }
            de.ozerov.fully.FullyActivity r5 = r13.f3879b     // Catch:{ Exception -> 0x0256 }
            java.io.File r5 = r5.getCacheDir()     // Catch:{ Exception -> 0x0256 }
            r4.<init>(r5, r0)     // Catch:{ Exception -> 0x0256 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0256 }
            P5.J r4 = P5.J.OK     // Catch:{ Exception -> 0x0256 }
            java.lang.String r0 = P5.P.c(r0)     // Catch:{ Exception -> 0x0256 }
            P5.K r0 = P5.P.g(r4, r0, r2)     // Catch:{ Exception -> 0x0256 }
            P5.D r2 = r13.i     // Catch:{ Exception -> 0x0256 }
            if (r2 == 0) goto L_0x0258
            r2.c(r0)     // Catch:{ Exception -> 0x0256 }
            goto L_0x0258
        L_0x0256:
            r0 = move-exception
            goto L_0x0268
        L_0x0258:
            java.lang.String r2 = "content-disposition"
            if (r1 == 0) goto L_0x0262
            java.lang.String r1 = "attachment; filename=\"fully-single-app-camshot.jpg\""
            r0.k(r2, r1)     // Catch:{ Exception -> 0x0256 }
            goto L_0x027c
        L_0x0262:
            java.lang.String r1 = "inline; filename=\"fully-single-app-camshot.jpg\""
            r0.k(r2, r1)     // Catch:{ Exception -> 0x0256 }
            goto L_0x027c
        L_0x0268:
            r0.printStackTrace()
            java.lang.String r0 = r13.f3878a
            java.lang.String r1 = "Failed to make a camshot"
            android.util.Log.e(r0, r1)
            r3.add(r1)
            goto L_0x027b
        L_0x0276:
            java.lang.String r0 = "No camshot available"
            r3.add(r0)
        L_0x027b:
            r0 = 0
        L_0x027c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.C0148k.a():P5.K");
    }

    public String c() {
        File file;
        String str;
        String str2;
        switch (this.f3911v) {
            case 3:
                StringBuilder sb = new StringBuilder();
                if (this.f3891p && (this.f3888m.equals("manageSettings") || this.f3888m.equals("uploadSettingsFile") || this.f3888m.equals("uploadAndImportSettingsFile") || this.f3888m.equals("deleteSettingsFile") || this.f3888m.equals("downloadSettingsFile") || this.f3888m.equals("importSettingsFile") || this.f3888m.equals("exportSettingsJson"))) {
                    sb.append("<h1>Export/Import Settings</h1>\n");
                    if (this.f3884h.get("dir") != null && !((String) this.f3884h.get("dir")).isEmpty()) {
                        file = new File((String) this.f3884h.get("dir"));
                    } else if (this.f3884h.get("filename") == null || ((String) this.f3884h.get("filename")).isEmpty()) {
                        file = a.c0(this.f3879b, (String) null);
                    } else {
                        file = new File((String) this.f3884h.get("filename")).getParentFile();
                    }
                    boolean g02 = a.g0(this.f3879b);
                    ArrayList arrayList = this.f3895t;
                    String str3 = this.f3878a;
                    if (!g02 && a.w0(this.f3879b, file)) {
                        Log.e(str3, "Missing runtime permissions to read files");
                        arrayList.add("Missing runtime permissions to read files");
                        sb.append(b());
                    } else if (P.C() || !a.w0(this.f3879b, file)) {
                        ArrayList arrayList2 = new ArrayList(1);
                        Object obj = new Object[]{"json"}[0];
                        Objects.requireNonNull(obj);
                        arrayList2.add(obj);
                        ArrayList K02 = a.K0(file, new u(0, DesugarCollections.unmodifiableList(arrayList2)));
                        Collections.sort(K02, Comparator.-CC.comparing(new h(3)));
                        sb.append(b());
                        sb.append("<div class='flexbox'>\n");
                        sb.append("<div><form action='manageSettings' method='get'><p class='formline scale90'><b>" + file.getAbsolutePath() + "</b>");
                        ArrayList Z7 = a.Z(this.f3879b, true);
                        if (!Z7.isEmpty()) {
                            sb.append(" in <span class='nowrap'><select name='dir'>\n");
                            Iterator it = Z7.iterator();
                            while (it.hasNext()) {
                                g gVar = (g) it.next();
                                sb.append("<option value='" + gVar.f6584b + "' ");
                                if (file.getAbsolutePath().startsWith(gVar.f6584b.getAbsolutePath())) {
                                    sb.append(" selected");
                                }
                                sb.append(">" + gVar.f6583a + "</option>\n");
                            }
                            sb.append("</select>&nbsp;<input type='submit' class='button' value='Go!'></span>\n");
                        }
                        sb.append("</p></form></div>\n");
                        if (file.canWrite()) {
                            StringBuilder sb2 = new StringBuilder("<div class='flexitem-right'><a href='uploadSettingsFile' onclick='$(\"#file-btn\").click(); return false;' title='Upload File'><img class='iconbutton' src='upload_file_48dp.svg' alt='Upload settings file");
                            if (this.f3892q) {
                                str2 = " (max. 8 MB)";
                            } else {
                                str2 = "";
                            }
                            sb2.append(str2);
                            sb2.append("' /></a>\n");
                            sb.append(sb2.toString());
                            sb.append("</div>\n");
                        }
                        sb.append("</div>\n");
                        if (K02.isEmpty()) {
                            sb.append("<p>No settings files found here</p>");
                        } else {
                            sb.append("<table class='table'>\n");
                            sb.append(C0138a.g("Name", "Date", "Import", "Download", "Delete"));
                            Iterator it2 = K02.iterator();
                            while (it2.hasNext()) {
                                File file2 = (File) it2.next();
                                if (!file2.isDirectory()) {
                                    String name = file2.getName();
                                    String format = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(new Date(file2.lastModified()));
                                    String str4 = "<a href='importSettingsFile?filename=" + a.k1(file2.getAbsolutePath()) + "' class='button'>Import</a> ";
                                    String str5 = "<a href='downloadSettingsFile?filename=" + a.k1(file2.getAbsolutePath()) + "' class='button'>Download</a> ";
                                    if (file2.canWrite()) {
                                        str = "<a href='deleteSettingsFile?filename=" + a.k1(file2.getAbsolutePath()) + "' class='button'>Delete</a>";
                                    } else {
                                        str = "";
                                    }
                                    sb.append(C0138a.j(name, format, str4, str5, str));
                                }
                            }
                            sb.append("</table>\n");
                        }
                        sb.append("<p class='buttonline'>\n<a href='listSettings' class='button'>View/Edit Settings</a>");
                        if (file.canWrite()) {
                            sb.append("<a onclick='return exportSettingsJson(\"fully-single-app-settings.json\");' href='exportSettingsJson' class='button'>Export Settings</a>");
                        }
                        sb.append("</p>\n");
                        if (file.canWrite()) {
                            sb.append("<form id='exportSettingsJsonForm' action='exportSettingsJson' method='post'>\n<input type='hidden' name='filename' value=''>\n");
                            sb.append("<input type='hidden' name='dir' value='" + file.getAbsolutePath() + "'>");
                            sb.append("</form>\n<form id='uploadFileForm' action='uploadSettingsFile' method='post' enctype='multipart/form-data' accept-charset='UTF-8'>\n<input id='file-btn' type='file' name='filename' onchange='form.submit();' accept='application/json' style=\"display: none\">\n");
                            sb.append("<input type='hidden' name='dir' value='" + file.getAbsolutePath() + "'>");
                            sb.append("</form>\n");
                        }
                    } else {
                        Log.e(str3, "External storage is not readable");
                        arrayList.add("External storage is not readable");
                        sb.append(b());
                    }
                }
                return sb.toString();
            case 4:
                StringBuilder sb3 = new StringBuilder();
                if (this.f3891p && this.f3888m.equals("showCamshot")) {
                    sb3.append("<p><a href=\"getCamshot\" style=\"cursor: zoom-in;\"><img class=\"screenshot\" src=\"getCamshot\" /></a></p>\n");
                }
                return sb3.toString();
            case 5:
                StringBuilder sb4 = new StringBuilder();
                if (this.f3891p && this.f3888m.equals("showScreenshot")) {
                    sb4.append("<p><a href=\"getScreenshot\" style=\"cursor: zoom-in;\"><img class=\"screenshot\" src=\"getScreenshot\" /></a></p>\n");
                }
                return sb4.toString();
            case 6:
                StringBuilder sb5 = new StringBuilder();
                if (this.f3891p && (this.f3888m.equals("showStats") || this.f3888m.equals("loadStatsCSV"))) {
                    sb5.append("<h1>Usage Statistics</h1>\n");
                    sb5.append(b());
                    C0794w0.P0(C0794w0.f11018b);
                    ArrayList E8 = C0794w0.E(10);
                    if (E8 != null) {
                        sb5.append("<p class='small'>Show max. last 10 days</p><table class='table'>\n");
                        sb5.append(C0138a.g("Date", "Touches", "Motions", "Screen Ons", "Reconnects"));
                        Iterator it3 = E8.iterator();
                        while (it3.hasNext()) {
                            C0800x0 x0Var = (C0800x0) it3.next();
                            sb5.append(C0138a.j(x0Var.f11054b, String.valueOf(x0Var.f11063m), String.valueOf(x0Var.f11060j), String.valueOf(x0Var.f11057f), String.valueOf(x0Var.i)));
                        }
                        sb5.append("</table>\n");
                    }
                    sb5.append("<p class='buttonline'>\n<a href='loadStatsCSV' class='button'>Load all stats as CSV</a></p>\n");
                }
                return sb5.toString();
            default:
                return super.c();
        }
    }
}
