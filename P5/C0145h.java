package P5;

import D.C0051j0;
import N.e;
import Y2.g;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.text.TextUtils;
import android.util.Log;
import de.ozerov.fully.C0770s0;
import de.ozerov.fully.C0794w0;
import de.ozerov.fully.D1;
import de.ozerov.fully.F3;
import de.ozerov.fully.G3;
import de.ozerov.fully.P;
import de.ozerov.fully.SwitchPref;
import de.ozerov.fully.T;
import de.ozerov.fully.TextPref;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import n2.a;
import org.json.JSONObject;

/* renamed from: P5.h  reason: case insensitive filesystem */
public abstract class C0145h extends C0138a {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f3907v;

    public /* synthetic */ C0145h(int i) {
        this.f3907v = i;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.io.FileFilter, java.lang.Object] */
    private final String l() {
        File file;
        boolean z;
        Iterator it;
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        if (this.f3891p && (this.f3888m.equals("listFiles") || this.f3888m.equals("deleteFile") || this.f3888m.equals("deleteFolder") || this.f3888m.equals("uploadFile") || this.f3888m.equals("copyFile") || this.f3888m.equals("copyFolder") || this.f3888m.equals("createFolder") || this.f3888m.equals("loadZipFile") || this.f3888m.equals("downloadFile"))) {
            if (this.f3884h.get("dir") != null && !((String) this.f3884h.get("dir")).isEmpty()) {
                file = new File((String) this.f3884h.get("dir"));
            } else if (this.f3884h.get("to") != null && !((String) this.f3884h.get("to")).isEmpty()) {
                file = new File((String) this.f3884h.get("to"));
            } else if (this.f3884h.get("filename") != null && !((String) this.f3884h.get("filename")).isEmpty()) {
                file = new File((String) this.f3884h.get("filename")).getParentFile();
            } else if (a.g0(this.f3879b)) {
                file = Environment.getExternalStorageDirectory();
            } else {
                file = this.f3879b.getExternalFilesDir((String) null);
            }
            if (!this.f3888m.equals("listFiles") && file != null) {
                sb.append("<script>history.replaceState(null, '', 'listFiles?dir=" + a.k1(file.getAbsolutePath()) + "');</script>");
            }
            sb.append("<h1>Manage Files</h1>\n");
            ArrayList arrayList = this.f3895t;
            String str4 = this.f3878a;
            if (file == null) {
                Log.e(str4, "Can't find any good folder to show");
                arrayList.add("Can't find any good folder to show");
                sb.append(b());
            } else if (!a.g0(this.f3879b) && a.w0(this.f3879b, file)) {
                Log.e(str4, "Missing runtime permissions to read files on shared storage");
                arrayList.add("Missing runtime permissions to read files on shared storage");
                sb.append(b());
            } else if (P.C() || !a.w0(this.f3879b, file)) {
                boolean z6 = false;
                ArrayList Z7 = a.Z(this.f3879b, false);
                File parentFile = file.getParentFile();
                Iterator it2 = Z7.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z = false;
                        break;
                    }
                    g gVar = (g) it2.next();
                    if (file.equals(gVar.f6584b)) {
                        z = !gVar.f6585c;
                        z6 = true;
                        break;
                    }
                }
                ? obj = new Object();
                List arrayList2 = new ArrayList();
                File[] listFiles = file.listFiles(obj);
                if (listFiles != null) {
                    arrayList2 = Arrays.asList(listFiles);
                }
                Collections.sort(arrayList2, new C0051j0(3));
                sb.append(b());
                sb.append("<div class='flexbox'>\n");
                sb.append("<div><form action='listFiles' method='get'><p class='formline scale90'><b>" + file.getAbsolutePath() + "</b>");
                if (!Z7.isEmpty()) {
                    sb.append(" in <span class='nowrap'><select name='dir'>\n");
                    Iterator it3 = Z7.iterator();
                    while (it3.hasNext()) {
                        g gVar2 = (g) it3.next();
                        sb.append("<option value='" + gVar2.f6584b + "'");
                        File file2 = gVar2.f6584b;
                        if (a.s0(file, file2) || file.equals(file2)) {
                            sb.append(" selected");
                        }
                        sb.append(">" + gVar2.f6583a + "</option>\n");
                    }
                    sb.append("</select>&nbsp;<input type='submit' class='button' value='Go!'></span>\n");
                }
                sb.append("</p></form></div>\n");
                if (file.canWrite()) {
                    StringBuilder sb2 = new StringBuilder("<div class='flexitem-right'><a href='uploadFile' onclick='$(\"#file-btn\").click(); return false;' title='Upload File'><img class='iconbutton' src='upload_file_48dp.svg' alt='Upload file");
                    if (this.f3892q) {
                        str3 = " (max. 8 MB)";
                    } else {
                        str3 = "";
                    }
                    sb2.append(str3);
                    sb2.append("' /></a>\n");
                    sb.append(sb2.toString());
                    sb.append("<a href='createFolder' onclick='return createFolder();' title='Create Folder'><img class='iconbutton' src='create_new_folder_48dp.svg' alt='Create new folder' /></a>\n</div>\n");
                }
                sb.append("</div>\n");
                if (file.canWrite()) {
                    sb.append("<form id='createFolderForm' action='createFolder' method='post'>\n<input type='hidden' name='foldername' value=''>\n");
                    sb.append("<input type='hidden' name='dir' value='" + file.getAbsolutePath() + "'>");
                    sb.append("</form>\n<form id='uploadFileForm' action='uploadFile' method='post' enctype='multipart/form-data' accept-charset='UTF-8'>\n<input id='file-btn' type='file' name='filename' onchange='form.submit();' style=\"display: none\">\n");
                    sb.append("<input type='hidden' name='dir' value='" + file.getAbsolutePath() + "'>");
                    sb.append("</form>\n");
                }
                if (a.w0(this.f3879b, file)) {
                    this.f3879b.getClass();
                    sb.append("<p>&#x26A0; In <a target='_blank' href='https://www.fully-kiosk.com/en/#faq-scoped'>scoped storage mode</a> you can only see the media files on the <a href='listFiles?dir=" + a.k1(Environment.getExternalStorageDirectory().getAbsolutePath()) + "'>Shared Storage</a>. Inside the <a href='listFiles?dir=" + a.k1(this.f3879b.getExternalFilesDir((String) null).getAbsolutePath()) + "'>App-Specific Storage</a> you can see and manage all files.</p>\n");
                }
                sb.append("<table class='table'>\n");
                sb.append(C0138a.g("Name", "Date", "Size", "Download", "Delete"));
                if (parentFile != null && parentFile.canRead() && !z6) {
                    sb.append(C0138a.k("<a href='listFiles?dir=" + a.k1(parentFile.getAbsolutePath()) + "'>...</a>", "", "", "", ""));
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    File file3 = (File) it4.next();
                    if (!file3.isDirectory()) {
                        String name = file3.getName();
                        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(new Date(file3.lastModified()));
                        String V8 = a.V(file3.length());
                        String str5 = "<a href='downloadFile?filename=" + a.k1(file3.getAbsolutePath()) + "' class='button'>Download</a>";
                        if (!file.canWrite() || !file3.canWrite()) {
                            it = it4;
                            str2 = "";
                        } else {
                            it = it4;
                            str2 = "<a href='deleteFile?filename=" + a.k1(file3.getAbsolutePath()) + "' class='button'>Delete</a>";
                        }
                        sb.append(C0138a.k(name, format, V8, str5, str2));
                    } else {
                        it = it4;
                        String str6 = "<a href='listFiles?dir=" + a.k1(file3.getAbsolutePath()) + "'>" + file3.getName() + "</a>";
                        String format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(new Date(file3.lastModified()));
                        if (!file.canWrite() || !file3.canWrite() || (z && (file3.getName().equals("files") || file3.getName().equals("cache")))) {
                            str = "";
                        } else {
                            str = "<a href='deleteFolder?dir=" + a.k1(file.getAbsolutePath()) + "&foldername=" + a.k1(file3.getAbsolutePath()) + "' onclick='return confirm(\"Sure want to delete folder including all contents recursively?\");' class='button'>Delete</a>";
                        }
                        sb.append(C0138a.k(str6, format2, "&lt;DIR&gt;", "", str));
                    }
                    it4 = it;
                }
                sb.append("</table>\n");
                if (this.f3892q) {
                    sb.append("<p>Note: Upload/download file size is limited to max. 8 MB if using Fully Cloud. Please use the <b>Load ZIP File</b> feature for large uploads.</p>\n");
                }
                if (file.canWrite() && !z) {
                    sb.append("<form action='loadZipFile' method='post' enctype='multipart/form-data'>\n<p class='formexpl scale90'><span name='loadZipFileExplain'>Enter ZIP file URL to load and unpack to this folder. Be careful, existing files will be overwritten!</span></p>\n<p class='formline'>ZIP File URL: <input type='text' name='url' value='' placeholder='URL' class='width20'>\n<input type='submit' name='submitButton' value='Load and Unzip' class='button'></p>\n");
                    sb.append("<input type='hidden' name='dir' value='" + file.getAbsolutePath() + "'>\n");
                    sb.append("</form>\n");
                }
            } else {
                Log.e(str4, "Storage is not readable");
                arrayList.add("Storage is not readable");
                sb.append(b());
            }
        }
        return sb.toString();
    }

    private final String m() {
        StringBuilder sb;
        String key;
        String str;
        String str2;
        String str3;
        SharedPreferences sharedPreferences;
        Iterator it;
        StringBuilder sb2;
        CharSequence[] charSequenceArr;
        CharSequence[] charSequenceArr2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String x8;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        C0145h hVar = this;
        String str19 = (String) hVar.f3884h.get("cat");
        String str20 = "/mainScreen";
        if (str19 == null) {
            str19 = str20;
        }
        StringBuilder sb3 = new StringBuilder();
        if (hVar.f3891p && (hVar.f3888m.equals("listSettings") || hVar.f3888m.equals("setBooleanSetting") || hVar.f3888m.equals("setStringSetting"))) {
            sb3.append("<h1>Settings</h1>\n");
            PreferenceScreen preferenceScreen = hVar.f3879b.f9932U0.f10938a;
            ArrayList arrayList = hVar.f3895t;
            if (preferenceScreen == null) {
                arrayList.add("The settings list could not be loaded");
            }
            sb3.append(b());
            Iterator it2 = new G3(hVar.f3879b).a().iterator();
            while (it2.hasNext()) {
                hVar.f3879b.getClass();
                sb3.append("<p>&#x26A0; " + ((F3) it2.next()).f9891a + "</p>\n");
            }
            if (arrayList.isEmpty()) {
                sb3.append("<table class='table normal'>\n");
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(hVar.f3879b);
                PreferenceScreen preferenceScreen2 = hVar.f3879b.f9932U0.f10938a;
                ArrayList arrayList2 = new ArrayList();
                String str21 = "";
                C0770s0.b(preferenceScreen2, str19, str21, arrayList2);
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    Preference preference = (Preference) it3.next();
                    if (preference == null) {
                        hVar = this;
                    } else if (!(preference.getTitle() == null || (key = preference.getKey()) == null)) {
                        if (preference instanceof PreferenceScreen) {
                            StringBuilder sb4 = new StringBuilder();
                            if (!preference.isEnabled() || str19.endsWith(key)) {
                                it = it3;
                            } else {
                                it = it3;
                                StringBuilder sb5 = new StringBuilder("<a class='bold' href='listSettings?cat=");
                                sb5.append(a.k1(str19 + "/" + key));
                                sb5.append("'>");
                                sb4.append(sb5.toString());
                            }
                            if (!preference.isEnabled()) {
                                sb4.append("<span class='disabled'>");
                            }
                            sb4.append(TextUtils.htmlEncode(preference.getTitle().toString()));
                            if (preference.isEnabled() && !str19.endsWith(key)) {
                                sb4.append("</a>");
                            }
                            if (preference.getSummary() != null) {
                                sb4.append("<br/><span class='small'>" + TextUtils.htmlEncode(preference.getSummary().toString()) + "</span>");
                            }
                            if (!preference.isEnabled()) {
                                sb4.append("</span>");
                            }
                            if (str19.endsWith(key)) {
                                sb3.append("<tr><td class='head' colspan='2'>" + sb4.toString() + "</td></tr>\n");
                            } else {
                                sb3.append("<tr><td class='cell' colspan='2'>" + sb4.toString() + "</td></tr>\n");
                            }
                            str2 = str19;
                            str = str20;
                            sb2 = sb3;
                            sharedPreferences = defaultSharedPreferences;
                            str3 = str21;
                        } else {
                            it = it3;
                            CharSequence[] charSequenceArr3 = new CharSequence[0];
                            boolean z = preference instanceof SwitchPref;
                            CharSequence[] charSequenceArr4 = new CharSequence[0];
                            if (z) {
                                CharSequence[] charSequenceArr5 = charSequenceArr3;
                                if (defaultSharedPreferences.getBoolean(key, false)) {
                                    str18 = "on";
                                } else {
                                    str18 = "off";
                                }
                                str2 = str19;
                                str = str20;
                                str5 = str21;
                                str3 = str5;
                                str4 = str18;
                                charSequenceArr = charSequenceArr4;
                                CharSequence[] charSequenceArr6 = charSequenceArr5;
                                sharedPreferences = defaultSharedPreferences;
                                charSequenceArr2 = charSequenceArr6;
                            } else {
                                CharSequence[] charSequenceArr7 = charSequenceArr3;
                                if (preference instanceof TextPref) {
                                    String htmlEncode = TextUtils.htmlEncode(defaultSharedPreferences.getString(key, "&nbsp;"));
                                    String str22 = "&nbsp;";
                                    TextPref textPref = (TextPref) preference;
                                    str2 = str19;
                                    String str23 = textPref.f10370X;
                                    str = str20;
                                    if (str23 == null) {
                                        str15 = str21;
                                    } else {
                                        str15 = " ".concat(str23);
                                    }
                                    if (preference.getTitle().toString().contains("JSON")) {
                                        str16 = "<span title='Configure this option in the app first to understand the JSON structure'>(JSON)</span>";
                                    } else {
                                        str16 = htmlEncode;
                                    }
                                    if (o(textPref)) {
                                        str16 = "*****";
                                    }
                                    if (str16.isEmpty()) {
                                        str17 = str22;
                                    } else {
                                        str17 = str16;
                                    }
                                    str4 = str17.replaceAll("\n", "<br/>");
                                    charSequenceArr = charSequenceArr4;
                                    str5 = str15;
                                    CharSequence[] charSequenceArr8 = charSequenceArr7;
                                    sharedPreferences = defaultSharedPreferences;
                                    charSequenceArr2 = charSequenceArr8;
                                    String str24 = htmlEncode;
                                    str3 = str21;
                                    str21 = str24;
                                } else {
                                    str2 = str19;
                                    str = str20;
                                    if (preference instanceof ListPreference) {
                                        String string = defaultSharedPreferences.getString(key, str21);
                                        ListPreference listPreference = (ListPreference) preference;
                                        charSequenceArr = listPreference.getEntries();
                                        CharSequence[] entryValues = listPreference.getEntryValues();
                                        sharedPreferences = defaultSharedPreferences;
                                        String str25 = str21;
                                        str3 = str25;
                                        for (int i = 0; i < charSequenceArr.length; i++) {
                                            if (entryValues[i].equals(string)) {
                                                str25 = charSequenceArr[i].toString();
                                            }
                                        }
                                        str21 = string;
                                        charSequenceArr2 = entryValues;
                                        str4 = str25;
                                        str5 = str3;
                                    } else {
                                        hVar = this;
                                        it3 = it;
                                        str19 = str2;
                                        str20 = str;
                                    }
                                }
                            }
                            StringBuilder sb6 = sb3;
                            String str26 = "</td></tr>\n";
                            String htmlEncode2 = TextUtils.htmlEncode(preference.getTitle().toString());
                            String str27 = "<span id='value-" + TextUtils.htmlEncode(key) + "'>" + str4 + "</span>" + str5;
                            if (preference.getSummary() != null) {
                                str6 = "<br/><span class='small'>" + TextUtils.htmlEncode(preference.getSummary().toString()) + "</span>";
                            } else {
                                str6 = str3;
                            }
                            String str28 = str27;
                            String str29 = " <a href='#' id='edit-button-" + key + "' onclick=\"$('#edit-" + key + "').toggle();return false;\" title='Change this setting'><img src='edit-icon.png' class='smallicon' /></a>";
                            String str30 = e.y("<div id='edit-", key, "' class='editArea'>") + "<form id='form-" + key + "' action='setStringSetting' method='post'>";
                            String str31 = "<br/><span class='key small'>Key: " + TextUtils.htmlEncode(key) + "</span>";
                            if (z) {
                                if (str4.equals("on")) {
                                    str11 = " checked";
                                } else {
                                    str11 = str3;
                                }
                                String str32 = " disabled";
                                if (!preference.isEnabled()) {
                                    str12 = str32;
                                } else {
                                    str12 = str3;
                                }
                                String str33 = str12;
                                if ((!key.equals("kioskMode") || C0794w0.Z(hVar.f3879b)) && !key.equals("remoteAdmin") && !key.equals("remoteAdminScreenshot") && !key.equals("remoteAdminCamshot") && !key.equals("remoteAdminFileManagement")) {
                                    str32 = str33;
                                    str13 = str3;
                                } else {
                                    if (!key.equals("kioskMode") || C0794w0.Z(hVar.f3879b)) {
                                        str13 = "This option can't be changed from Remote Admin";
                                    } else {
                                        str13 = "This option can't be changed from Remote Admin as kiosk mode changes require user input on the device";
                                    }
                                    if (key.equals("remoteAdmin")) {
                                        str13 = str13.concat(" to avoid lock out");
                                    }
                                }
                                if (!key.equals("kioskMode") || !C0794w0.Z(hVar.f3879b)) {
                                    str14 = str3;
                                } else {
                                    str14 = "if (this.checked) return true; else return confirm(\"You are going to switch OFF the kiosk mode. Continue?\");";
                                }
                                if (!str13.isEmpty()) {
                                    str6 = str6 + ". <span class='small'>" + str13 + "</span>";
                                }
                                str7 = "<input class='switch-input' type='checkbox' onclick='" + str14 + "' onchange='saveSwitchPref(this);' id='" + key + "' " + str11 + str32 + "><label for='" + key + "' class='switch-label' title=\"" + str13 + "\"></label>";
                            } else {
                                if (preference instanceof ListPreference) {
                                    str30 = e.x(str30, "<p class='formline scale90 narrow'>");
                                    for (int i8 = 0; i8 < charSequenceArr.length; i8++) {
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append(str30);
                                        sb7.append(" <input type='radio' name='value' id='");
                                        sb7.append(key);
                                        sb7.append(i8);
                                        sb7.append("' customValue='");
                                        sb7.append(TextUtils.htmlEncode(charSequenceArr[i8].toString()));
                                        sb7.append("' value='");
                                        sb7.append(charSequenceArr2[i8].toString());
                                        sb7.append("' ");
                                        if (charSequenceArr2[i8].equals(str21)) {
                                            str10 = " checked>";
                                        } else {
                                            str10 = ">";
                                        }
                                        sb7.append(str10);
                                        sb7.append(" <label for='");
                                        sb7.append(key);
                                        sb7.append(i8);
                                        sb7.append("'>");
                                        sb7.append(TextUtils.htmlEncode(charSequenceArr[i8].toString()));
                                        sb7.append("</label><br/>");
                                        str30 = sb7.toString();
                                    }
                                    if (key.equals("kioskExitGesture") && hVar.f3880c.g2().booleanValue()) {
                                        str6 = e.x(str6, " <span class='small'>This option has no effect in Single App mode!</span>");
                                    }
                                } else {
                                    boolean z6 = preference instanceof TextPref;
                                    if (z6) {
                                        if (!key.equals("remoteAdminPassword") || !hVar.f3892q) {
                                            str9 = str3;
                                        } else {
                                            str9 = "If you change this password you have to change the password saved in Fully Cloud too!";
                                        }
                                        if (!str9.isEmpty()) {
                                            str6 = str6 + ". <span class='small'>" + str9 + "</span>";
                                        }
                                        String x9 = e.x(str30, "<p class='formline scale90'>");
                                        if (!z6 || (((TextPref) preference).getEditText().getInputType() & 131072) == 0) {
                                            if (o((TextPref) preference)) {
                                                x8 = e.x(x9, "<input type='password' name='value' size='40' value='*****'> ");
                                            } else {
                                                String str34 = x9 + "<input type='text' name='value' size='40' value='" + str21 + "' ";
                                                if (key.equals("singleAppIntent")) {
                                                    str34 = e.x(str34, "list='launcherIntents' ");
                                                }
                                                x8 = e.x(str34, "> ");
                                            }
                                        } else if (preference.getTitle().toString().contains("JSON")) {
                                            x8 = x9 + "<textarea type='json' name='value' cols='80' rows='10'>" + str21 + "</textarea><br />";
                                            if (str21.isEmpty()) {
                                                x8 = e.x(x8, "<span class='small'>Configure this option in the app settings first (not in Remote Admin!) to see the required JSON structure.<br/></span>");
                                            }
                                        } else {
                                            x8 = x9 + "<textarea name='value' cols='80' rows='5'>" + str21 + "</textarea><br />";
                                        }
                                        str30 = x8;
                                    } else {
                                        str30 = e.x(str30, "<p class='formline scale90'>");
                                        str29 = str3;
                                    }
                                }
                                str7 = str28;
                            }
                            String x10 = e.x(e.x(e.x((str30 + "<input type='hidden' name='key' value='" + key + "'>") + "<input type='submit' name='button' value='Ok' class='button' onclick=\"savePref('" + key + "');return false;\">", "</p>"), "</form>"), "</div>\n");
                            if (!preference.isEnabled() || z) {
                                x10 = str3;
                                str8 = x10;
                            } else {
                                str8 = str29;
                            }
                            if (str4.length() > 15) {
                                sb2 = sb6;
                                sb2.append("<tr><td class='cell'>" + p(htmlEncode2 + str6 + str31, preference.isEnabled()) + "</td><td class='cell wrapanywhere right'>&nbsp;</td></tr>\n<tr><td class='cell wrapanywhere right' colspan='2'>" + (str7 + str8 + x10) + str26);
                            } else {
                                String str35 = str26;
                                sb2 = sb6;
                                String str36 = htmlEncode2;
                                String str37 = str31;
                                if (z) {
                                    sb2.append("<tr><td class='cell'>" + p(str36 + str6 + str37, preference.isEnabled()) + "</td><td class='cell wrapanywhere right top'>" + (str7 + str8 + x10) + str35);
                                } else {
                                    sb2.append("<tr><td class='cell'>" + p(str36 + str6 + str37 + x10, preference.isEnabled()) + "</td><td class='cell wrapanywhere right top'>" + e.x(str7, str8) + str35);
                                }
                            }
                        }
                        hVar = this;
                        sb3 = sb2;
                        it3 = it;
                        defaultSharedPreferences = sharedPreferences;
                        str21 = str3;
                        str19 = str2;
                        str20 = str;
                    }
                }
                String str38 = str19;
                sb = sb3;
                sb.append("</table>\n");
                if (!str19.equals(str20)) {
                    sb.append("<p class='buttonline'>");
                    sb.append("<a href='listSettings?cat=" + a.k1(str19.substring(0, str19.lastIndexOf("/"))) + "' class='button'>Back</a>\n");
                    sb.append("<a href='' class='button'>Refresh</a>\n<a href='#' onclick=\"$('.key').toggle();$(this).html(($(this).text()=='Show keys')?'Hide keys':'Show keys');return false;\" class='button'>Show keys</a></p>\n");
                } else {
                    sb.append("<p class='buttonline'><a href='manageSettings' class='button'>Export/Import settings</a>\n</p>\n");
                }
                if (str19.endsWith("settingsKioskModeSingleApp")) {
                    ArrayList n02 = C0794w0.n0(this.f3879b, false);
                    sb.append("<datalist id='launcherIntents'>\n");
                    Iterator it4 = n02.iterator();
                    while (it4.hasNext()) {
                        T t8 = (T) it4.next();
                        Intent intent = new Intent();
                        intent.setComponent(C0794w0.p(this.f3879b, t8.f10349b));
                        sb.append("<option value='" + a.o0(intent) + "'>" + t8.f10348a + "</option>\n");
                    }
                    sb.append("</datalist>\n");
                }
                return sb.toString();
            }
        }
        sb = sb3;
        return sb.toString();
    }

    public static boolean o(TextPref textPref) {
        int inputType = textPref.getEditText().getInputType();
        if ((inputType & 1) != 0 && (inputType & 128) != 0) {
            return true;
        }
        if ((inputType & 2) == 0 || (inputType & 16) == 0) {
            return false;
        }
        return true;
    }

    public static String p(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "<span class='enabled'>";
        } else {
            str2 = "<span class='disabled'>";
        }
        return e.y(str2, str, "</span>");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0500, code lost:
        if (de.ozerov.fully.Z0.g() == false) goto L_0x0507;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x052d, code lost:
        if (de.ozerov.fully.Z0.g() == false) goto L_0x0534;
     */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x05bf  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x05d3  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x05d5  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x05e9  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0603  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x061f  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x063a  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x063c  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x064e  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x0678  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x06b3  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x06b6  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x06e3  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0724  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x0778  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0782  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x07a7  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x07bc  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x07dd  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0816  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0863  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x08e2  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x08e5  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x08f9  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x08fc  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0929  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x092c  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x096c  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x096f  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x098e  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0991  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x09a8  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x09ab  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x09d7  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0a88 A[SYNTHETIC, Splitter:B:379:0x0a88] */
    /* JADX WARNING: Removed duplicated region for block: B:386:0x0aa7 A[SYNTHETIC, Splitter:B:386:0x0aa7] */
    /* JADX WARNING: Removed duplicated region for block: B:393:0x0ad2  */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x0afd A[SYNTHETIC, Splitter:B:402:0x0afd] */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0b28  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x0b2b  */
    /* JADX WARNING: Removed duplicated region for block: B:414:0x0b34  */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x0b42  */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0b4e  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0b5c  */
    /* JADX WARNING: Removed duplicated region for block: B:435:0x0bec  */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x0c0a  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x0c17  */
    /* JADX WARNING: Removed duplicated region for block: B:440:0x0c1a  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x0c7e  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0ca3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c() {
        /*
            r25 = this;
            r1 = r25
            java.lang.String r2 = ")"
            java.lang.String r3 = " ("
            java.lang.String r0 = "<option value='disableLockedMode'>Maintenance Mode Off</option>\n"
            java.lang.String r4 = "<option value='enableLockedMode'>Maintenance Mode On</option>\n"
            java.lang.String r5 = "</span>"
            java.lang.String r6 = "User input is required ON THE DEVICE in order to install the APK file!"
            java.lang.String r7 = ""
            java.lang.String r8 = "<span class='hidden addFields' name='loadApkFileExplain'>Enter APK file URL to load and install. Upgrade from APK can fail if the app was installed from Google Play. No downgrade is possible on this way. ATTENTION: Fully WILL STOP if you upgrade it! "
            java.lang.String r9 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r10 = "<table class='table'>\n"
            java.lang.String r12 = "</table>\n"
            r13 = 0
            int r14 = r1.f3907v
            switch(r14) {
                case 0: goto L_0x036b;
                case 1: goto L_0x0366;
                case 2: goto L_0x0361;
                case 3: goto L_0x0342;
                case 4: goto L_0x013a;
                default: goto L_0x001e;
            }
        L_0x001e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.HashMap r0 = r1.f3884h     // Catch:{ Exception -> 0x0032 }
            java.lang.String r3 = "max"
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0032 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0032 }
            goto L_0x0034
        L_0x0032:
            r0 = 50
        L_0x0034:
            boolean r3 = r1.f3891p
            if (r3 == 0) goto L_0x0135
            java.lang.String r3 = r1.f3888m
            java.lang.String r4 = "showLog"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x004c
            java.lang.String r3 = r1.f3888m
            java.lang.String r4 = "loadLogCSV"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0135
        L_0x004c:
            java.lang.String r3 = "<h1>Fully Log</h1>\n"
            r2.append(r3)
            java.lang.String r3 = r25.b()
            r2.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "<p class='small'>Show last max. "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " entries <a href='loadLogCSV' class='button'>Load all as CSV</a> <a href='logcat' class='button'>Logcat</a></p>\n"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            r2.append(r10)
            r3 = 0
            java.util.ArrayList r0 = de.ozerov.fully.C0794w0.y(r3, r0, r13)
            java.lang.String r5 = "Message"
            java.lang.String r6 = "Time"
            java.lang.String r7 = "Type"
            java.lang.String r5 = P5.C0138a.f(r6, r7, r5)
            r2.append(r5)
            java.util.Iterator r5 = r0.iterator()
        L_0x0088:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r0 = r5.next()
            r6 = r0
            de.ozerov.fully.q0 r6 = (de.ozerov.fully.C0759q0) r6
            long r7 = r6.f10895f
            java.lang.String r10 = r6.f10892b
            r13 = 1
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f6
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r7 = java.util.Locale.getDefault()
            r0.<init>(r9, r7)
            java.lang.String r7 = "UTC"
            java.util.TimeZone r7 = j$.util.DesugarTimeZone.getTimeZone(r7)
            r0.setTimeZone(r7)
            java.util.Date r0 = r0.parse(r10)     // Catch:{ Exception -> 0x00cb }
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x00cb }
            java.util.Locale r8 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x00cb }
            r7.<init>(r9, r8)     // Catch:{ Exception -> 0x00cb }
            java.util.TimeZone r8 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x00cb }
            r7.setTimeZone(r8)     // Catch:{ Exception -> 0x00cb }
            java.lang.String r0 = r7.format(r0)     // Catch:{ Exception -> 0x00cb }
        L_0x00c9:
            r10 = r0
            goto L_0x00f6
        L_0x00cb:
            r0 = move-exception
            java.lang.String r7 = "Couldn't convert UTC to local time for "
            java.lang.String r8 = " due to "
            java.lang.StringBuilder r7 = Q0.g.s(r7, r10, r8)
            java.lang.String r0 = r0.getMessage()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r7 = "a"
            android.util.Log.w(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            java.lang.String r7 = " UTC"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto L_0x00c9
        L_0x00f6:
            long r7 = r6.f10893c
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00ff
            java.lang.String r0 = "INFO"
            goto L_0x0123
        L_0x00ff:
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0106
            java.lang.String r0 = "WARNING"
            goto L_0x0123
        L_0x0106:
            r13 = 2
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x010f
            java.lang.String r0 = "ERROR"
            goto L_0x0123
        L_0x010f:
            r13 = 3
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0118
            java.lang.String r0 = "DEBUG"
            goto L_0x0123
        L_0x0118:
            r13 = 4
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x0121
            java.lang.String r0 = "EXCEPTION"
            goto L_0x0123
        L_0x0121:
            java.lang.String r0 = "UNKNOWN"
        L_0x0123:
            java.lang.String r6 = r6.e
            java.lang.String r6 = android.text.TextUtils.htmlEncode(r6)
            java.lang.String r0 = P5.C0138a.i(r10, r0, r6)
            r2.append(r0)
            goto L_0x0088
        L_0x0132:
            r2.append(r12)
        L_0x0135:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x013a:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            boolean r14 = r1.f3891p
            if (r14 == 0) goto L_0x033d
            java.lang.String r14 = r1.f3888m
            java.lang.String r15 = "manageApps"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x016b
            java.lang.String r14 = r1.f3888m
            java.lang.String r15 = "uninstallApp"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x016b
            java.lang.String r14 = r1.f3888m
            java.lang.String r15 = "clearAppData"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x016b
            java.lang.String r14 = r1.f3888m
            java.lang.String r15 = "killBackgroundProcesses"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x033d
        L_0x016b:
            java.util.HashMap r14 = r1.f3884h
            java.lang.String r15 = "showAllApps"
            java.lang.Object r14 = r14.get(r15)
            java.lang.String r14 = (java.lang.String) r14
            if (r14 == 0) goto L_0x0189
            java.lang.String r15 = "true"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x0187
            java.lang.String r15 = "1"
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x0189
        L_0x0187:
            r14 = 1
            goto L_0x018a
        L_0x0189:
            r14 = 0
        L_0x018a:
            java.lang.String r15 = "<h1>Installed Apps</h1>\n"
            r9.append(r15)
            java.lang.String r15 = r25.b()
            r9.append(r15)
            java.lang.String r15 = "<form action='' id='fastAdminForm' method='post' enctype='multipart/form-data'>\n<p class='formexpl scale90'>"
            r9.append(r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r8)
            de.ozerov.fully.FullyActivity r8 = r1.f3879b
            boolean r8 = de.ozerov.fully.C0794w0.Z(r8)
            if (r8 == 0) goto L_0x01b0
            boolean r8 = n2.a.y0()
            if (r8 != 0) goto L_0x01af
            goto L_0x01b0
        L_0x01af:
            r6 = r7
        L_0x01b0:
            r15.append(r6)
            r15.append(r5)
            java.lang.String r5 = r15.toString()
            r9.append(r5)
            java.lang.String r5 = "</p><p class='formline scale90'><select id='actionSelector' name='cmd' size='1' class='' onchange='showAddFields(\"\");'>\n<option value=''>Select Admin Command</option>\n<option value='loadApkFile' addFields='url,loadApkFileExplain'>Install APK from URL</option>\n"
            r9.append(r5)
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            Z1.a r5 = r5.f9942e1
            boolean r5 = r5.f6946a
            if (r5 != 0) goto L_0x01ce
            r9.append(r4)
            goto L_0x01d1
        L_0x01ce:
            r9.append(r0)
        L_0x01d1:
            java.lang.String r0 = "</select>\n<input type='text' name='url' value='' placeholder='URL' class='hidden width20 addFields'>\n<input type='submit' name='submitButton' value='Go!' class='button' onclick=\"submitFastAdmin('fully-single-app');return false;\"></p>\n</form>\n"
            r9.append(r0)
            if (r14 == 0) goto L_0x01de
            java.lang.String r0 = "<p class='right'><a href='manageApps?showAllApps=0'>Show launchable apps</a></p>\n"
            r9.append(r0)
            goto L_0x01e3
        L_0x01de:
            java.lang.String r0 = "<p class='right'><a href='manageApps?showAllApps=1'>Show all apps</a></p>\n"
            r9.append(r0)
        L_0x01e3:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.util.ArrayList r0 = de.ozerov.fully.C0794w0.n0(r0, r14)
            r9.append(r10)
            if (r14 == 0) goto L_0x01f1
            java.lang.String r4 = "App ID<br/>Version"
            goto L_0x01f3
        L_0x01f1:
            java.lang.String r4 = "App Component"
        L_0x01f3:
            java.lang.String r5 = "Title<br/>"
            java.lang.String r4 = r5.concat(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            boolean r6 = n2.a.F0()
            if (r6 != 0) goto L_0x0207
            java.lang.String r6 = "Kill App"
            goto L_0x0208
        L_0x0207:
            r6 = r7
        L_0x0208:
            r5.append(r6)
            java.lang.String r6 = "<br/>Uninstall"
            r5.append(r6)
            boolean r6 = n2.a.C0()
            if (r6 == 0) goto L_0x0221
            de.ozerov.fully.FullyActivity r6 = r1.f3879b
            boolean r6 = de.ozerov.fully.C0794w0.Z(r6)
            if (r6 == 0) goto L_0x0221
            java.lang.String r6 = "<br/>Clear data"
            goto L_0x0222
        L_0x0221:
            r6 = r7
        L_0x0222:
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Icon"
            java.lang.String r4 = P5.C0138a.f(r6, r4, r5)
            r9.append(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0236:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x033a
            java.lang.Object r4 = r0.next()
            de.ozerov.fully.T r4 = (de.ozerov.fully.T) r4
            int r5 = r4.f10354h
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 <= 0) goto L_0x024a
            r5 = 1
            goto L_0x024b
        L_0x024a:
            r5 = 0
        L_0x024b:
            if (r14 != 0) goto L_0x0250
            if (r5 == 0) goto L_0x0250
            goto L_0x0236
        L_0x0250:
            android.graphics.drawable.Drawable r6 = r4.e
            if (r6 == 0) goto L_0x0270
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream
            r6.<init>()
            android.graphics.drawable.Drawable r8 = r4.e
            android.graphics.Bitmap r8 = n2.a.A(r8)
            android.graphics.Bitmap$CompressFormat r10 = android.graphics.Bitmap.CompressFormat.PNG
            r15 = 90
            r8.compress(r10, r15, r6)
            byte[] r6 = r6.toByteArray()
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            goto L_0x0271
        L_0x0270:
            r6 = r7
        L_0x0271:
            java.lang.String r8 = r4.f10349b
            java.lang.String r8 = de.ozerov.fully.C0794w0.L(r8)
            java.lang.String r10 = "<img style=\"width:4em;height:4em;\" src=\"data:image/png;base64,"
            java.lang.String r15 = "\" />"
            java.lang.String r6 = N.e.y(r10, r6, r15)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r15 = "<b class='big'>"
            r10.<init>(r15)
            java.lang.String r15 = r4.f10348a
            java.lang.String r15 = android.text.TextUtils.htmlEncode(r15)
            r10.append(r15)
            java.lang.String r15 = "</b><br/>"
            r10.append(r15)
            if (r14 == 0) goto L_0x0298
            r15 = r8
            goto L_0x029a
        L_0x0298:
            java.lang.String r15 = r4.f10349b
        L_0x029a:
            r10.append(r15)
            java.lang.String r15 = "<br/>"
            r10.append(r15)
            if (r14 == 0) goto L_0x02c7
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r13 = r4.f10350c
            r15.append(r13)
            r15.append(r3)
            int r4 = r4.f10351d
            r15.append(r4)
            r15.append(r2)
            if (r5 == 0) goto L_0x02be
            java.lang.String r4 = " - System app"
            goto L_0x02bf
        L_0x02be:
            r4 = r7
        L_0x02bf:
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            goto L_0x02c8
        L_0x02c7:
            r4 = r7
        L_0x02c8:
            r10.append(r4)
            java.lang.String r4 = r10.toString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            boolean r13 = n2.a.F0()
            if (r13 != 0) goto L_0x02e3
            java.lang.String r13 = "<a href='killBackgroundProcesses?package="
            java.lang.String r15 = "' class='button' onclick='return confirm(\"Really kill this app? Note that you can&#39;t kill the foreground app!\");'>Kill app</a>"
            java.lang.String r13 = N.e.y(r13, r8, r15)
            goto L_0x02e4
        L_0x02e3:
            r13 = r7
        L_0x02e4:
            r10.append(r13)
            if (r5 != 0) goto L_0x030b
            java.lang.String r13 = "<br /><br /><a href='uninstallApp?package="
            java.lang.String r15 = "' class='button' onclick='return confirm(\"Really uninstall?"
            java.lang.StringBuilder r13 = Q0.g.s(r13, r8, r15)
            de.ozerov.fully.FullyActivity r15 = r1.f3879b
            boolean r15 = de.ozerov.fully.C0794w0.Z(r15)
            if (r15 == 0) goto L_0x0302
            boolean r15 = n2.a.y0()
            if (r15 != 0) goto L_0x0300
            goto L_0x0302
        L_0x0300:
            r15 = r7
            goto L_0x0304
        L_0x0302:
            java.lang.String r15 = " User confirmation will be required ON THE DEVICE in order to uninstall!"
        L_0x0304:
            java.lang.String r11 = "\");'>Uninstall</a>"
            java.lang.String r11 = N.e.A(r13, r15, r11)
            goto L_0x030c
        L_0x030b:
            r11 = r7
        L_0x030c:
            r10.append(r11)
            if (r5 != 0) goto L_0x0328
            boolean r5 = n2.a.C0()
            if (r5 == 0) goto L_0x0328
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            boolean r5 = de.ozerov.fully.C0794w0.Z(r5)
            if (r5 == 0) goto L_0x0328
            java.lang.String r5 = "<br /><br /><a href='clearAppData?package="
            java.lang.String r11 = "' class='button' onclick='return confirm(\"Really clear this app data? This will reset the app settings and can&#39;t be undone!\");'>Clear Data</a>"
            java.lang.String r5 = N.e.y(r5, r8, r11)
            goto L_0x0329
        L_0x0328:
            r5 = r7
        L_0x0329:
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            java.lang.String r4 = P5.C0138a.i(r6, r4, r5)
            r9.append(r4)
            r13 = 0
            goto L_0x0236
        L_0x033a:
            r9.append(r12)
        L_0x033d:
            java.lang.String r0 = r9.toString()
            return r0
        L_0x0342:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r2 = r1.f3891p
            if (r2 == 0) goto L_0x035c
            java.lang.String r2 = "<h1>Logcat</h1><p><a href='getLogcat?dl=1' class='button'>Download</a></p><pre>"
            r0.append(r2)
            java.lang.String r2 = r25.n()
            r0.append(r2)
            java.lang.String r2 = "</pre>"
            r0.append(r2)
        L_0x035c:
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0361:
            java.lang.String r0 = r25.m()
            return r0
        L_0x0366:
            java.lang.String r0 = r25.l()
            return r0
        L_0x036b:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            boolean r11 = r1.f3891p
            if (r11 == 0) goto L_0x0cbd
            de.ozerov.fully.FullyActivity r11 = r1.f3879b
            java.lang.String r11 = de.ozerov.fully.C0794w0.r(r11)
            java.lang.String r13 = r25.b()
            r10.append(r13)
            boolean r13 = de.ozerov.fully.C0813z1.f11119p1
            if (r13 == 0) goto L_0x038a
            java.lang.String r13 = "<p class='warn'>&#x26A0; Some settings are using local files on shared storage. Due to evolving Google Play policies Fully won't be able to access shared storage after the next app upgrade. <br/><a href='localFilesAlertCheck'>Click here for solutions</a>"
            r10.append(r13)
        L_0x038a:
            java.lang.String r13 = r1.f3888m
            java.lang.String r14 = "home"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0399
            java.lang.String r13 = "<script>history.replaceState(null, '', 'home');</script>"
            r10.append(r13)
        L_0x0399:
            java.lang.String r13 = "<h1>Send Command to Device</h1>\n<form action='' id='fastAdminForm' method='post' enctype='multipart/form-data'>\n<p class='formexpl scale90'>"
            r10.append(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r8)
            de.ozerov.fully.FullyActivity r8 = r1.f3879b
            boolean r8 = de.ozerov.fully.C0794w0.Z(r8)
            if (r8 == 0) goto L_0x03b3
            boolean r8 = n2.a.y0()
            if (r8 != 0) goto L_0x03b2
            goto L_0x03b3
        L_0x03b2:
            r6 = r7
        L_0x03b3:
            r13.append(r6)
            r13.append(r5)
            java.lang.String r5 = r13.toString()
            r10.append(r5)
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            r6 = 0
            java.io.File r5 = n2.a.c0(r5, r6)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r13 = "<span class='hidden addFields' name='loadZipFileExplain'>Enter ZIP file URL to load and unpack to <i>"
            r8.<init>(r13)
            java.lang.String r5 = r5.getAbsolutePath()
            r8.append(r5)
            java.lang.String r5 = "</i><br>Be careful, existing files will be overwritten!</span>"
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r10.append(r5)
            java.lang.String r5 = "</p><p class='formline scale90'><select id='actionSelector' name='cmd' size='1' class='' onchange='showAddFields(\"\");'>\n<option value=''>Select Admin Command</option>\n<option value='startSingleApp'>Start Single App</option>\n<option value='uploadAndImportSettingsFile' addFields='filename'>Upload & Import Settings File</option>\n<option value='loadApkFile' addFields='url,loadApkFileExplain'>Install APK from URL</option>\n<option value='loadZipFile' addFields='url,loadZipFileExplain'>Load/unpack ZIP from URL</option>\n<option value='setOverlayMessage' addFields='text'>Show Message</option>\n<option value='textToSpeech' addFields='text'>Speak Text</option>\n"
            r10.append(r5)
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            boolean r5 = de.ozerov.fully.C0794w0.h0(r5)
            if (r5 != 0) goto L_0x03f4
            java.lang.String r5 = "<option value='screenOn'>Turn Screen On</option>\n"
            r10.append(r5)
            goto L_0x03f9
        L_0x03f4:
            java.lang.String r5 = "<option value='screenOff'>Turn Screen Off</option>\n"
            r10.append(r5)
        L_0x03f9:
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            de.ozerov.fully.w3 r5 = r5.f9943f1
            boolean r5 = r5.f11044c
            if (r5 == 0) goto L_0x0407
            java.lang.String r5 = "<option value='stopScreensaver'>Stop Screensaver</option>\n"
            r10.append(r5)
            goto L_0x040c
        L_0x0407:
            java.lang.String r5 = "<option value='startScreensaver'>Start Screensaver</option>\n"
            r10.append(r5)
        L_0x040c:
            boolean r5 = n2.a.E0()
            if (r5 != 0) goto L_0x0425
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            de.ozerov.fully.w3 r5 = r5.f9943f1
            boolean r5 = r5.f11046f
            if (r5 == 0) goto L_0x0420
            java.lang.String r5 = "<option value='stopDaydream'>Stop Android Screen Saver</option>\n"
            r10.append(r5)
            goto L_0x0425
        L_0x0420:
            java.lang.String r5 = "<option value='startDaydream'>Start Android Screen Saver</option>\n"
            r10.append(r5)
        L_0x0425:
            d4.k r5 = r1.f3880c
            java.lang.String r8 = "remoteAdminCamshot"
            java.lang.Object r5 = r5.f9767W
            Z1.c r5 = (Z1.c) r5
            r13 = 1
            boolean r5 = r5.n(r8, r13)
            if (r5 == 0) goto L_0x0443
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            N5.k r5 = r5.f9958x1
            boolean r5 = r5.f()
            if (r5 == 0) goto L_0x0443
            java.lang.String r5 = "<option value='getCamshot' toggleImage=1>Show Cam Shot</option>\n"
            r10.append(r5)
        L_0x0443:
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            Z1.a r5 = r5.f9942e1
            boolean r5 = r5.f6946a
            if (r5 != 0) goto L_0x044f
            r10.append(r4)
            goto L_0x0452
        L_0x044f:
            r10.append(r0)
        L_0x0452:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            b3.a r0 = r0.f9921J0
            boolean r0 = r0.i()
            if (r0 == 0) goto L_0x0461
            java.lang.String r0 = "<option value='unlockKiosk' confirm='Sure want to unlock the remote kiosk?'>Unlock Kiosk</option>\n"
            r10.append(r0)
        L_0x0461:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            b3.a r0 = r0.f9921J0
            boolean r4 = r0.f8654b
            if (r4 == 0) goto L_0x0474
            boolean r0 = r0.i()
            if (r0 != 0) goto L_0x0474
            java.lang.String r0 = "<option value='lockKiosk' confirm='Sure want to lock the remote kiosk?'>Lock Kiosk</option>\n"
            r10.append(r0)
        L_0x0474:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.h0(r0)
            if (r0 == 0) goto L_0x049b
            if (r11 == 0) goto L_0x049b
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x049b
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            de.ozerov.fully.w3 r0 = r0.f9943f1
            boolean r4 = r0.f11044c
            if (r4 != 0) goto L_0x049b
            boolean r0 = r0.f11046f
            if (r0 != 0) goto L_0x049b
            java.lang.String r0 = "<option value='toForeground'>Bring Fully App to Foreground</option>\n"
            r10.append(r0)
        L_0x049b:
            java.lang.String r0 = "<option value='popFragment'>Close menu/settings etc.</option>\n<option value='restartApp'>Restart Fully App</option>\n"
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.Z(r0)
            if (r0 == 0) goto L_0x04b3
            boolean r0 = n2.a.p0()
            if (r0 == 0) goto L_0x04b3
            java.lang.String r0 = "<option value='installSystemUpdate' addFields='url' confirm='Are you really sure to install a system update from file? Device will reboot!'>Install System Update from URL</option>\n"
            r10.append(r0)
        L_0x04b3:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.Z(r0)
            if (r0 == 0) goto L_0x04c0
            java.lang.String r0 = "<option value='installUserCa' addFields='url'>Install User CA from URL</option>\n"
            r10.append(r0)
        L_0x04c0:
            java.lang.String r0 = "<option value='lockNow'>Lock Device</option>\n"
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.Z(r0)
            if (r0 == 0) goto L_0x04d2
            java.lang.String r0 = "<option value='wipeDevice' confirm='Are you really sure to wipe this device? This can&#39;t be undone! Don&#39;t forget to remove the Volume License from the device prior to wiping.'>Wipe Device</option>\n"
            r10.append(r0)
        L_0x04d2:
            d4.k r0 = r1.f3880c
            java.lang.Boolean r0 = r0.Q1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04e2
            boolean r0 = de.ozerov.fully.P.f10240j
            if (r0 != 0) goto L_0x0502
        L_0x04e2:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.Z(r0)
            if (r0 != 0) goto L_0x0502
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.lang.String r4 = r0.getPackageName()
            boolean r0 = de.ozerov.fully.C0794w0.j0(r0, r4)
            if (r0 != 0) goto L_0x0502
            boolean r0 = de.ozerov.fully.Z0.f()
            if (r0 == 0) goto L_0x0507
            boolean r0 = de.ozerov.fully.Z0.g()
            if (r0 == 0) goto L_0x0507
        L_0x0502:
            java.lang.String r0 = "<option value='rebootDevice' confirm='Are you really sure to reboot this device?'>Reboot Device</option>\n"
            r10.append(r0)
        L_0x0507:
            d4.k r0 = r1.f3880c
            java.lang.Boolean r0 = r0.Q1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0517
            boolean r0 = de.ozerov.fully.P.f10240j
            if (r0 != 0) goto L_0x052f
        L_0x0517:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.lang.String r4 = r0.getPackageName()
            boolean r0 = de.ozerov.fully.C0794w0.j0(r0, r4)
            if (r0 != 0) goto L_0x052f
            boolean r0 = de.ozerov.fully.Z0.f()
            if (r0 == 0) goto L_0x0534
            boolean r0 = de.ozerov.fully.Z0.g()
            if (r0 == 0) goto L_0x0534
        L_0x052f:
            java.lang.String r0 = "<option value='shutdownDevice' confirm='Are you really sure to shutdown this device?'>Shutdown Device</option>\n"
            r10.append(r0)
        L_0x0534:
            java.lang.String r0 = "</select>\n<input type='text' name='url' value='' placeholder='URL' class='hidden width20 addFields'>\n<input type='text' name='text' value='' placeholder='Message to show/speak' class='hidden width20 addFields'>\n<input type='file' name='filename' accept='application/json' class='hidden width20 addFields'>\n<input type='submit' name='submitButton' value='Go!' class='button' onclick=\"submitFastAdmin('fully-single-app');return false;\"></p>\n</form>\n<img id='imgholder' src='fully-single-app-loading.png'/>\n<p class='buttonline hidden' id='startrefreshbutton'><a href='' onclick='startAutoRefresh();return false;' class='button' title='Auto-reload the image as often as possible (experimental)'>Auto play</a></p><h1>App Info</h1>\n<table class='table normal marginbottom'>\n"
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.lang.String r0 = de.ozerov.fully.P.i(r0)
            java.lang.String r4 = "Fully Device ID"
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r4 = "App package"
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "1.17.1 (101362/"
            r0.<init>(r4)
            d4.k r4 = r1.f3880c
            java.lang.String r5 = "firstAppInstallVersionCode"
            java.lang.Object r4 = r4.f9767W
            Z1.c r4 = (Z1.c) r4
            r8 = 0
            int r4 = r4.q(r5, r8)
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "App version"
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r4 = Q.h.f4003X
            java.lang.String r5 = "yes"
            java.lang.String r8 = "no"
            if (r4 == 0) goto L_0x058d
            r4 = r5
            goto L_0x058e
        L_0x058d:
            r4 = r8
        L_0x058e:
            r0.append(r4)
            java.lang.String r4 = " (App ID: 56) "
            r0.append(r4)
            d4.k r4 = r1.f3880c
            java.lang.String r13 = "volumeLicenseStatus"
            java.lang.Object r4 = r4.f9767W
            Z1.c r4 = (Z1.c) r4
            java.lang.String r4 = r4.r(r13, r7)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "PLUS licensed"
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            Z1.a r0 = r0.f9942e1
            boolean r0 = r0.f6946a
            java.lang.String r4 = "off"
            if (r0 == 0) goto L_0x05bf
            java.lang.String r0 = "locked"
            goto L_0x05c0
        L_0x05bf:
            r0 = r4
        L_0x05c0:
            java.lang.String r13 = "Maintenance mode"
            java.lang.String r0 = P5.C0138a.h(r13, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            b3.a r0 = r0.f9921J0
            boolean r0 = r0.f8654b
            java.lang.String r13 = "on"
            if (r0 == 0) goto L_0x05d5
            r0 = r13
            goto L_0x05d6
        L_0x05d5:
            r0 = r4
        L_0x05d6:
            java.lang.String r14 = "Kiosk mode"
            java.lang.String r0 = P5.C0138a.h(r14, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            N5.k r0 = r0.f9958x1
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x05eb
            r0 = r13
            goto L_0x05ec
        L_0x05eb:
            r0 = r4
        L_0x05ec:
            java.lang.String r14 = "Motion detection"
            java.lang.String r0 = P5.C0138a.h(r14, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            d4.k r0 = r0.f9961z0
            java.lang.Boolean r0 = r0.t1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0605
            r0 = r13
            goto L_0x0606
        L_0x0605:
            r0 = r4
        L_0x0606:
            java.lang.String r14 = "Acoustic detection"
            java.lang.String r0 = P5.C0138a.h(r14, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            d4.k r0 = r0.f9961z0
            java.lang.Boolean r0 = r0.y1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x061f
            r0 = r13
            goto L_0x0620
        L_0x061f:
            r0 = r4
        L_0x0620:
            java.lang.String r14 = "Movement detection"
            java.lang.String r0 = P5.C0138a.h(r14, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.X(r0)
            if (r0 != 0) goto L_0x063c
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.Y(r0)
            if (r0 == 0) goto L_0x063a
            goto L_0x063c
        L_0x063a:
            r0 = r4
            goto L_0x063d
        L_0x063c:
            r0 = r13
        L_0x063d:
            java.lang.String r14 = "Device admin"
            java.lang.String r0 = P5.C0138a.h(r14, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.Z(r0)
            if (r0 == 0) goto L_0x0650
            r0 = r13
            goto L_0x0651
        L_0x0650:
            r0 = r4
        L_0x0651:
            java.lang.String r14 = "Device owner"
            java.lang.String r0 = P5.C0138a.h(r14, r0)
            r10.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            de.ozerov.fully.FullyActivity r14 = r1.f3879b
            boolean r14 = de.ozerov.fully.P.A(r14)
            if (r14 == 0) goto L_0x0669
            r14 = r5
            goto L_0x066a
        L_0x0669:
            r14 = r8
        L_0x066a:
            r0.append(r14)
            java.lang.String r14 = "/"
            r0.append(r14)
            boolean r15 = de.ozerov.fully.P.f10240j
            if (r15 == 0) goto L_0x0678
            r15 = r5
            goto L_0x0679
        L_0x0678:
            r15 = r8
        L_0x0679:
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r15 = "Root available/enabled"
            java.lang.String r0 = P5.C0138a.h(r15, r0)
            r10.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            de.ozerov.fully.FullyActivity r15 = r1.f3879b
            U.d r15 = r15.f9919H0
            java.lang.Object r15 = r15.f5259X
            java.lang.String r15 = (java.lang.String) r15
            r0.append(r15)
            java.lang.String r15 = " <a href='logcat' class='small button'>Logcat</a>"
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r15 = "Last app start"
            java.lang.String r0 = P5.C0138a.h(r15, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            de.ozerov.fully.w3 r15 = r0.f9943f1
            boolean r15 = r15.f11044c
            if (r15 == 0) goto L_0x06b6
            java.lang.String r0 = "screensaver"
            goto L_0x06d2
        L_0x06b6:
            boolean r0 = r0.v()
            if (r0 == 0) goto L_0x06c3
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.lang.String r0 = r0.u()
            goto L_0x06d2
        L_0x06c3:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            de.ozerov.fully.N1 r0 = r0.f9916E0
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x06d0
            java.lang.String r0 = "menu"
            goto L_0x06d2
        L_0x06d0:
            java.lang.String r0 = "main"
        L_0x06d2:
            java.lang.String r15 = "Active fragment"
            java.lang.String r0 = P5.C0138a.h(r15, r0)
            r10.append(r0)
            android.content.pm.PackageStats r0 = de.ozerov.fully.P.f10239h
            java.lang.String r15 = " KB"
            r17 = 1024(0x400, double:5.06E-321)
            if (r0 == 0) goto L_0x0724
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r19 = r12
            r20 = r13
            long r12 = r0.codeSize
            long r12 = r12 / r17
            r6.append(r12)
            r6.append(r14)
            long r12 = r0.dataSize
            long r12 = r12 / r17
            r6.append(r12)
            r6.append(r14)
            long r12 = r0.cacheSize
            long r12 = r12 / r17
            r6.append(r12)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r6.append(r15)
            java.lang.String r0 = r6.toString()
            java.lang.String r6 = "App Code/Data/Cache"
            java.lang.String r0 = P5.C0138a.h(r6, r0)
            r10.append(r0)
            goto L_0x0728
        L_0x0724:
            r19 = r12
            r20 = r13
        L_0x0728:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            long r12 = r6.maxMemory()
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            long r21 = r6.totalMemory()
            long r23 = r6.freeMemory()
            long r21 = r21 - r23
            long r12 = r12 - r21
            long r12 = r12 / r17
            r0.append(r12)
            r0.append(r14)
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            long r12 = r6.maxMemory()
            long r12 = r12 / r17
            r0.append(r12)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "App RAM (free/total)"
            java.lang.String r0 = P5.C0138a.h(r6, r0)
            r10.append(r0)
            boolean r0 = n2.a.q0()
            java.lang.String r6 = "Storage mode"
            if (r0 == 0) goto L_0x0782
            boolean r0 = android.os.Environment.isExternalStorageManager()
            if (r0 == 0) goto L_0x0782
            java.lang.String r0 = "managed"
            java.lang.String r0 = P5.C0138a.h(r6, r0)
            r10.append(r0)
            goto L_0x079b
        L_0x0782:
            boolean r0 = n2.a.u0()
            if (r0 == 0) goto L_0x0792
            java.lang.String r0 = "legacy"
            java.lang.String r0 = P5.C0138a.h(r6, r0)
            r10.append(r0)
            goto L_0x079b
        L_0x0792:
            java.lang.String r0 = "scoped"
            java.lang.String r0 = P5.C0138a.h(r6, r0)
            r10.append(r0)
        L_0x079b:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.lang.String r6 = r0.getPackageName()
            boolean r0 = de.ozerov.fully.C0794w0.j0(r0, r6)
            if (r0 == 0) goto L_0x07b0
            java.lang.String r0 = "System signed"
            java.lang.String r0 = P5.C0138a.h(r0, r5)
            r10.append(r0)
        L_0x07b0:
            d4.k r0 = r1.f3880c
            java.lang.Boolean r0 = r0.z1()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x07d1
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            B3.q r0 = r0.f9935X0
            boolean r0 = r0.Q()
            if (r0 == 0) goto L_0x07c7
            goto L_0x07c8
        L_0x07c7:
            r5 = r8
        L_0x07c8:
            java.lang.String r0 = "MQTT connected"
            java.lang.String r0 = P5.C0138a.h(r0, r5)
            r10.append(r0)
        L_0x07d1:
            d4.k r0 = r1.f3880c
            java.lang.Boolean r0 = r0.u()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x07e8
            java.lang.String r0 = de.ozerov.fully.CloudService.f9835j0
            java.lang.String r5 = "Cloud status"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
        L_0x07e8:
            java.lang.String r0 = "</table>\n<h1>Device Info</h1>\n<table class='table normal'>\n"
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.lang.String r0 = de.ozerov.fully.C0794w0.t(r0)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x080a
            java.lang.String r5 = "unknown"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x080a
            java.lang.String r5 = "Device Name"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
        L_0x080a:
            r0 = 1
            java.lang.String r5 = de.ozerov.fully.C0794w0.z(r0)
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0816
            goto L_0x081c
        L_0x0816:
            r5 = 0
            java.lang.String r6 = de.ozerov.fully.C0794w0.z(r5)
            r5 = r6
        L_0x081c:
            java.lang.String r6 = "Hostname"
            java.lang.String r5 = P5.C0138a.h(r6, r5)
            r10.append(r5)
            java.lang.String r5 = de.ozerov.fully.C0794w0.C(r0, r0)
            java.lang.String r6 = "IPv4 addresses"
            java.lang.String r5 = P5.C0138a.h(r6, r5)
            r10.append(r5)
            r5 = 0
            java.lang.String r6 = de.ozerov.fully.C0794w0.C(r5, r0)
            java.lang.String r0 = "IPv6 addresses"
            java.lang.String r0 = P5.C0138a.h(r0, r6)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            r5 = 0
            java.lang.String r0 = de.ozerov.fully.C0794w0.G(r0, r5)
            java.lang.String r5 = "Mac address"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.lang.String r0 = de.ozerov.fully.C0794w0.U(r0)
            java.lang.String r5 = "Wifi SSID"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
            android.location.Location r0 = de.ozerov.fully.Y.f10506b
            if (r0 == 0) goto L_0x08cb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            double r12 = r0.getLatitude()
            r5.append(r12)
            java.lang.String r6 = ","
            r5.append(r6)
            double r12 = r0.getLongitude()
            r5.append(r12)
            java.lang.String r12 = " "
            r5.append(r12)
            double r12 = r0.getAltitude()
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            r13 = 1
            java.lang.Object[] r13 = new java.lang.Object[r13]
            r15 = 0
            r13[r15] = r12
            java.lang.String r12 = "%.1f"
            java.lang.String r12 = java.lang.String.format(r12, r13)
            r5.append(r12)
            java.lang.String r12 = "m ("
            r5.append(r12)
            java.lang.String r12 = r0.getProvider()
            r5.append(r12)
            java.lang.String r12 = ") <a href='https://www.google.com/maps/place/"
            r5.append(r12)
            double r12 = r0.getLatitude()
            r5.append(r12)
            r5.append(r6)
            double r12 = r0.getLongitude()
            r5.append(r12)
            java.lang.String r0 = "' target='_blank' class='button'>Map</a>"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "Location"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
        L_0x08cb:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            float r0 = de.ozerov.fully.P.g(r0)
            int r0 = java.lang.Math.round(r0)
            float r0 = (float) r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            double r12 = (double) r0
            r15 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r6 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r6 != 0) goto L_0x08e5
            java.lang.String r0 = "(unknown) "
            goto L_0x08e9
        L_0x08e5:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x08e9:
            r5.append(r0)
            java.lang.String r0 = "%"
            r5.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.P.H(r0)
            if (r0 == 0) goto L_0x08fc
            java.lang.String r0 = " (plugged)"
            goto L_0x08fe
        L_0x08fc:
            java.lang.String r0 = " (unplugged)"
        L_0x08fe:
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "Battery level"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            int r0 = de.ozerov.fully.C0794w0.M(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = "Screen brightness"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.h0(r0)
            if (r0 == 0) goto L_0x092c
            r0 = r20
            goto L_0x092d
        L_0x092c:
            r0 = r4
        L_0x092d:
            java.lang.String r5 = "Screen status"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            int r5 = de.ozerov.fully.C0794w0.v(r5)
            r0.append(r5)
            java.lang.String r5 = "x"
            r0.append(r5)
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            int r5 = de.ozerov.fully.C0794w0.u(r5)
            r0.append(r5)
            java.lang.String r5 = " px"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "Screen size"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.g0(r0)
            if (r0 == 0) goto L_0x096f
            r0 = r20
            goto L_0x0970
        L_0x096f:
            r0 = r4
        L_0x0970:
            java.lang.String r5 = "Keyguard locked"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            B3.q r5 = r5.f10979t0
            java.lang.Object r5 = r5.f450V
            android.os.PowerManager$WakeLock r5 = (android.os.PowerManager.WakeLock) r5
            if (r5 == 0) goto L_0x0991
            boolean r5 = r5.isHeld()
            if (r5 == 0) goto L_0x0991
            r5 = r20
            goto L_0x0992
        L_0x0991:
            r5 = r4
        L_0x0992:
            r0.append(r5)
            r0.append(r14)
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            B3.q r5 = r5.f10979t0
            java.lang.Object r5 = r5.f449U
            android.os.PowerManager$WakeLock r5 = (android.os.PowerManager.WakeLock) r5
            if (r5 == 0) goto L_0x09ab
            boolean r5 = r5.isHeld()
            if (r5 == 0) goto L_0x09ab
            r5 = r20
            goto L_0x09ac
        L_0x09ab:
            r5 = r4
        L_0x09ac:
            r0.append(r5)
            r0.append(r14)
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            B3.q r5 = r5.f10979t0
            r5.getClass()
            android.os.PowerManager$WakeLock r5 = B3.q.f448Z
            if (r5 == 0) goto L_0x09c5
            boolean r5 = r5.isHeld()
            if (r5 == 0) goto L_0x09c5
            r4 = r20
        L_0x09c5:
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "Wakelock full/partial/up"
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
            if (r11 == 0) goto L_0x0a04
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = r0.f10980u0
            if (r0 != 0) goto L_0x09f6
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            de.ozerov.fully.w3 r4 = r0.f9943f1
            boolean r5 = r4.f11044c
            if (r5 != 0) goto L_0x09f6
            boolean r4 = r4.f11046f
            if (r4 != 0) goto L_0x09f6
            java.lang.String r0 = r0.getPackageName()
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x09f6
            java.lang.String r0 = " inactive"
            goto L_0x09f7
        L_0x09f6:
            r0 = r7
        L_0x09f7:
            java.lang.String r0 = r11.concat(r0)
            java.lang.String r4 = "Foreground app"
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
        L_0x0a04:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            r4 = 1000(0x3e8, double:4.94E-321)
            android.content.ComponentName r0 = de.ozerov.fully.C0794w0.q(r0, r4)
            if (r0 == 0) goto L_0x0a2c
            java.lang.String r4 = r0.getPackageName()
            de.ozerov.fully.FullyActivity r5 = r1.f3879b
            java.lang.String r5 = r5.getPackageName()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0a1f
            goto L_0x0a2c
        L_0x0a1f:
            java.lang.String r4 = "Foreground activity"
            java.lang.String r0 = r0.flattenToShortString()
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
        L_0x0a2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            de.ozerov.fully.FullyActivity r4 = r1.f3879b
            android.app.ActivityManager$MemoryInfo r5 = new android.app.ActivityManager$MemoryInfo
            r5.<init>()
            java.lang.String r6 = "activity"
            java.lang.Object r4 = r4.getSystemService(r6)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            r4.getMemoryInfo(r5)
            long r4 = r5.availMem
            long r4 = r4 / r17
            long r4 = r4 / r17
            r0.append(r4)
            r0.append(r14)
            de.ozerov.fully.FullyActivity r4 = r1.f3879b
            android.app.ActivityManager$MemoryInfo r5 = new android.app.ActivityManager$MemoryInfo
            r5.<init>()
            java.lang.Object r4 = r4.getSystemService(r6)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            r4.getMemoryInfo(r5)
            long r4 = r5.totalMem
            long r4 = r4 / r17
            long r4 = r4 / r17
            r0.append(r4)
            java.lang.String r4 = " MB"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "RAM (free/total)"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            r6 = 0
            java.io.File r0 = r0.getExternalFilesDir(r6)
            if (r0 == 0) goto L_0x0a92
            long r15 = r0.getUsableSpace()     // Catch:{ Exception -> 0x0a8d }
            goto L_0x0a94
        L_0x0a8d:
            r0 = move-exception
            r6 = r0
            r6.printStackTrace()
        L_0x0a92:
            r15 = -1
        L_0x0a94:
            long r15 = r15 / r17
            long r11 = r15 / r17
            r5.append(r11)
            r5.append(r14)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            r6 = 0
            java.io.File r0 = r0.getExternalFilesDir(r6)
            if (r0 == 0) goto L_0x0ab1
            long r11 = r0.getTotalSpace()     // Catch:{ Exception -> 0x0aac }
            goto L_0x0ab3
        L_0x0aac:
            r0 = move-exception
            r11 = r0
            r11.printStackTrace()
        L_0x0ab1:
            r11 = -1
        L_0x0ab3:
            long r11 = r11 / r17
            long r11 = r11 / r17
            r5.append(r11)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "Internal storage (free/total)"
            java.lang.String r0 = P5.C0138a.h(r5, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.io.File r0 = n2.a.J(r0)
            if (r0 == 0) goto L_0x0b20
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.io.File r0 = n2.a.J(r0)
            if (r0 == 0) goto L_0x0ae9
            long r11 = r0.getUsableSpace()     // Catch:{ Exception -> 0x0ae4 }
            goto L_0x0aeb
        L_0x0ae4:
            r0 = move-exception
            r11 = r0
            r11.printStackTrace()
        L_0x0ae9:
            r11 = -1
        L_0x0aeb:
            long r11 = r11 / r17
            long r11 = r11 / r17
            r5.append(r11)
            r5.append(r14)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.io.File r0 = n2.a.J(r0)
            if (r0 == 0) goto L_0x0b07
            long r11 = r0.getTotalSpace()     // Catch:{ Exception -> 0x0b02 }
            goto L_0x0b09
        L_0x0b02:
            r0 = move-exception
            r11 = r0
            r11.printStackTrace()
        L_0x0b07:
            r11 = -1
        L_0x0b09:
            long r11 = r11 / r17
            long r11 = r11 / r17
            r5.append(r11)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            java.lang.String r4 = "External storage (free/total)"
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
        L_0x0b20:
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.P.y(r0)
            if (r0 == 0) goto L_0x0b2b
            java.lang.String r0 = " (TV)"
            goto L_0x0b2c
        L_0x0b2b:
            r0 = r7
        L_0x0b2c:
            de.ozerov.fully.FullyActivity r4 = r1.f3879b
            boolean r4 = de.ozerov.fully.P.D(r4)
            if (r4 == 0) goto L_0x0b3a
            java.lang.String r4 = " (Fire OS)"
            java.lang.String r0 = r0.concat(r4)
        L_0x0b3a:
            de.ozerov.fully.FullyActivity r4 = r1.f3879b
            boolean r4 = de.ozerov.fully.P.x(r4)
            if (r4 == 0) goto L_0x0b48
            java.lang.String r4 = " (Go)"
            java.lang.String r0 = N.e.x(r0, r4)
        L_0x0b48:
            boolean r4 = de.ozerov.fully.P.z()
            if (r4 == 0) goto L_0x0b54
            java.lang.String r4 = " (ChromeOS)"
            java.lang.String r0 = N.e.x(r0, r4)
        L_0x0b54:
            de.ozerov.fully.FullyActivity r4 = r1.f3879b
            boolean r4 = de.ozerov.fully.P.E(r4)
            if (r4 == 0) goto L_0x0b62
            java.lang.String r4 = " (HarmonyOS)"
            java.lang.String r0 = N.e.x(r0, r4)
        L_0x0b62:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = android.os.Build.VERSION.RELEASE
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = " (SDK "
            r4.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "Android version"
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.util.ArrayList r4 = de.ozerov.fully.I1.f10008a
            boolean r4 = de.ozerov.fully.C0794w0.Z(r0)
            java.lang.String r5 = "device_policy"
            if (r4 == 0) goto L_0x0ba9
            boolean r4 = n2.a.B0()
            if (r4 == 0) goto L_0x0ba9
            java.lang.Object r4 = r0.getSystemService(r5)
            android.app.admin.DevicePolicyManager r4 = (android.app.admin.DevicePolicyManager) r4
            android.content.ComponentName r0 = de.ozerov.fully.DeviceOwnerReceiver.a(r0)
            android.app.admin.SystemUpdateInfo r6 = r4.getPendingSystemUpdate(r0)
        L_0x0ba9:
            if (r6 == 0) goto L_0x0be1
            boolean r0 = n2.a.B0()
            if (r0 == 0) goto L_0x0be1
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r4 = java.util.Locale.getDefault()
            r0.<init>(r9, r4)
            java.util.Date r4 = new java.util.Date
            long r11 = r6.getReceivedTime()
            r4.<init>(r11)
            java.lang.String r0 = r0.format(r4)
            java.lang.String r4 = "System update available"
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
            int r0 = r6.getSecurityPatchState()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "Security patch status"
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
        L_0x0be1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r4 = de.ozerov.fully.Z0.f()
            if (r4 == 0) goto L_0x0c0a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = de.ozerov.fully.Z0.e()
            r4.append(r6)
            r4.append(r3)
            int r6 = de.ozerov.fully.Z0.d()
            r4.append(r6)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            goto L_0x0c0b
        L_0x0c0a:
            r4 = r8
        L_0x0c0b:
            r0.append(r4)
            r0.append(r14)
            boolean r4 = de.ozerov.fully.Z0.g()
            if (r4 == 0) goto L_0x0c1a
            java.lang.String r8 = "premium"
            goto L_0x0c20
        L_0x0c1a:
            boolean r4 = de.ozerov.fully.Z0.f10525a
            if (r4 == 0) goto L_0x0c20
            java.lang.String r8 = "basic"
        L_0x0c20:
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "KNOX version/licensed"
            java.lang.String r0 = P5.C0138a.h(r4, r0)
            r10.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = android.os.Build.MODEL
            r0.append(r4)
            r0.append(r3)
            java.lang.String r3 = android.os.Build.MANUFACTURER
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Device model"
            java.lang.String r0 = P5.C0138a.h(r2, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.lang.String r0 = de.ozerov.fully.P.q(r0)
            java.lang.String r2 = "Serial"
            java.lang.String r0 = P5.C0138a.h(r2, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r2 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r2)
            java.lang.String r2 = "Android ID"
            java.lang.String r0 = P5.C0138a.h(r2, r0)
            r10.append(r0)
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            boolean r0 = de.ozerov.fully.C0794w0.Z(r0)
            if (r0 == 0) goto L_0x0c97
            de.ozerov.fully.FullyActivity r0 = r1.f3879b
            java.lang.Object r0 = r0.getSystemService(r5)
            android.app.admin.DevicePolicyManager r0 = (android.app.admin.DevicePolicyManager) r0
            int r0 = r0.getStorageEncryptionStatus()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Encryption status"
            java.lang.String r0 = P5.C0138a.h(r2, r0)
            r10.append(r0)
        L_0x0c97:
            d4.k r0 = r1.f3880c
            java.lang.String r0 = r0.y()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0cb8
            d4.k r0 = r1.f3880c
            java.lang.String r0 = r0.y()
            java.lang.String r2 = "android.permission."
            java.lang.String r0 = r0.replace(r2, r7)
            java.lang.String r2 = "Denied"
            java.lang.String r0 = P5.C0138a.h(r2, r0)
            r10.append(r0)
        L_0x0cb8:
            r2 = r19
            r10.append(r2)
        L_0x0cbd:
            java.lang.String r0 = r10.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: P5.C0145h.c():java.lang.String");
    }

    public String n() {
        StringBuilder sb = new StringBuilder();
        String a8 = D1.a(this.f3879b);
        String s8 = C0794w0.s(this.f3879b);
        JSONObject j7 = P.j(this.f3879b);
        a.b(j7, this.f3879b.E());
        sb.append("Local time: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.getDefault()).format(new Date()) + "\n");
        sb.append(TextUtils.htmlEncode(s8) + "\n\n");
        sb.append(TextUtils.htmlEncode(a8) + "\n\n");
        try {
            sb.append(j7.toString(2).replace("\\/", "/") + "\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
