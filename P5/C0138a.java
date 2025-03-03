package P5;

import B.B;
import N.e;
import android.text.TextUtils;
import d4.k;
import de.ozerov.fully.FullyActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: P5.a  reason: case insensitive filesystem */
public abstract class C0138a {

    /* renamed from: a  reason: collision with root package name */
    public final String f3878a = getClass().getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    public FullyActivity f3879b;

    /* renamed from: c  reason: collision with root package name */
    public k f3880c;

    /* renamed from: d  reason: collision with root package name */
    public G f3881d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap f3882f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public HashMap f3883g;

    /* renamed from: h  reason: collision with root package name */
    public HashMap f3884h;
    public D i;

    /* renamed from: j  reason: collision with root package name */
    public int f3885j;

    /* renamed from: k  reason: collision with root package name */
    public String f3886k;

    /* renamed from: l  reason: collision with root package name */
    public String f3887l;

    /* renamed from: m  reason: collision with root package name */
    public String f3888m;

    /* renamed from: n  reason: collision with root package name */
    public String f3889n;

    /* renamed from: o  reason: collision with root package name */
    public String f3890o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3891p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3892q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3893r = true;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f3894s = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public final ArrayList f3895t = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public B f3896u;

    public static String e(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "Error");
            jSONObject.put("statustext", str);
            return jSONObject.toString().replace("\\/", "/");
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static String f(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("<tr><td class='head'>");
        sb.append(str);
        sb.append("</td><td class='head'>");
        sb.append(str2);
        sb.append("</td><td class='head'>");
        return e.A(sb, str3, "</td></tr>\n");
    }

    public static String g(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder("<tr><td class='head'>");
        sb.append(str);
        sb.append("</td><td class='head'>");
        sb.append(str2);
        sb.append("</td><td class='head'>");
        sb.append(str3);
        sb.append("</td><td class='head'>");
        sb.append(str4);
        sb.append("</td><td class='head'>");
        return e.A(sb, str5, "</td></tr>\n");
    }

    public static String h(String str, String str2) {
        return "<tr><td class='cell'>" + str + "</td><td class='cell wrapanywhere'>" + str2 + "</td></tr>\n";
    }

    public static String i(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("<tr><td class='cell'>");
        sb.append(str);
        sb.append("</td><td class='cell wrapanywhere'>");
        sb.append(str2);
        sb.append("</td><td class='cell wrapanywhere'>");
        return e.A(sb, str3, "</td></tr>\n");
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder("<tr><td class='cell'>");
        sb.append(str);
        sb.append("</td><td class='cell'>");
        sb.append(str2);
        sb.append("</td><td class='cell'>");
        sb.append(str3);
        sb.append("</td><td class='cell'>");
        sb.append(str4);
        sb.append("</td><td class='cell'>");
        return e.A(sb, str5, "</td></tr>\n");
    }

    public static String k(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder("<tr><td class='cell wrapanywhere'>");
        sb.append(str);
        sb.append("</td><td class='cell'>");
        sb.append(str2);
        sb.append("</td><td class='cell'>");
        sb.append(str3);
        sb.append("</td><td class='cell center'>");
        sb.append(str4);
        sb.append("</td><td class='cell center'>");
        return e.A(sb, str5, "</td></tr>\n");
    }

    public K a() {
        return null;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f3895t.iterator();
        while (it.hasNext()) {
            sb.append("<p class='error'>" + TextUtils.htmlEncode((String) it.next()) + "</p>\n");
        }
        Iterator it2 = this.f3894s.iterator();
        while (it2.hasNext()) {
            sb.append("<p class='success'>" + TextUtils.htmlEncode((String) it2.next()) + "</p>\n");
        }
        return sb.toString();
    }

    public String c() {
        return "";
    }

    public String d() {
        if (!this.f3891p) {
            return e("Please login");
        }
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = this.f3895t;
        try {
            boolean isEmpty = arrayList.isEmpty();
            ArrayList arrayList2 = this.f3894s;
            if (isEmpty) {
                if (arrayList2.isEmpty()) {
                    jSONObject.put("status", "Error");
                    jSONObject.put("statustext", "Unknown command or error communicating with device");
                    jSONObject.toString();
                    return jSONObject.toString().replace("\\/", "/");
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(TextUtils.join("\n", arrayList2));
            if (!arrayList.isEmpty()) {
                if (sb.length() != 0) {
                    sb.append("\n");
                }
                sb.append(TextUtils.join("\n", arrayList));
            }
            jSONObject.put("statustext", sb.toString());
            if (!arrayList.isEmpty()) {
                jSONObject.put("status", "Error");
            } else {
                jSONObject.put("status", "OK");
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        jSONObject.toString();
        return jSONObject.toString().replace("\\/", "/");
    }
}
