package de.ozerov.fully;

import Z2.a;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final /* synthetic */ class T2 implements D, a {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10359U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ V2 f10360V;

    public /* synthetic */ T2(V2 v22, int i) {
        this.f10359U = i;
        this.f10360V = v22;
    }

    public void d(String[] strArr) {
        V2 v22 = this.f10360V;
        switch (this.f10359U) {
            case 1:
                v22.getClass();
                for (String Y02 : strArr) {
                    O2 o2 = new O2();
                    o2.f10215a = n2.a.Y0(v22.f9850f1, Y02);
                    o2.f10216b = 2;
                    o2.f10223k = 1;
                    v22.V(o2);
                }
                return;
            default:
                if (v22.f9850f1.w() && strArr.length > 0) {
                    O2 o22 = new O2();
                    o22.f10215a = n2.a.Y0(v22.f9850f1, strArr[0]);
                    o22.f10216b = 3;
                    o22.f10223k = 1;
                    if (v22.f10441p1.equals("screensaverPlaylist")) {
                        o22.i = 10;
                        o22.f10222j = 0;
                    }
                    v22.V(o22);
                    return;
                }
                return;
        }
    }

    public void i(String str) {
        String str2;
        V2 v22 = this.f10360V;
        int i = this.f10359U;
        v22.getClass();
        switch (i) {
            case 0:
                String a8 = P.a(str);
                if (P.I(a8)) {
                    O2 o2 = new O2();
                    o2.f10215a = a8;
                    new C0711i0(2, v22).execute(new O2[]{o2});
                    return;
                }
                n2.a.a1(1, v22.f9850f1, "Wrong URL dismissed");
                return;
            default:
                String a9 = P.a(str);
                if (P.I(a9)) {
                    Matcher matcher = Pattern.compile("^(?:https?://|//)?(?:www\\.|m\\.|.+\\.)?(?:youtu\\.be/|youtube\\.com/(?:embed/|v/|shorts/|live/|feeds/api/videos/|watch\\?v=|watch\\?.+&v=))([\\w-]{11})(?![\\w-])").matcher(a9);
                    String str3 = null;
                    if (matcher.find()) {
                        str2 = matcher.group(1);
                    } else {
                        str2 = null;
                    }
                    Matcher matcher2 = Pattern.compile("(?:youtube\\.com.*(?:\\?|&)(?:list)=)((?!videoseries)[a-zA-Z0-9_]*)").matcher(a9);
                    if (matcher2.find()) {
                        str3 = matcher2.group(1);
                    }
                    if (str2 != null) {
                        O2 o22 = new O2();
                        o22.f10215a = a9;
                        o22.f10216b = 4;
                        o22.f10223k = 1;
                        v22.V(o22);
                        return;
                    } else if (str3 != null) {
                        O2 o23 = new O2();
                        o23.f10215a = a9;
                        o23.f10216b = 5;
                        o23.f10223k = 1;
                        v22.V(o23);
                        return;
                    } else {
                        n2.a.a1(1, v22.f9850f1, "Neigher YouTube Video no YouTube Playlist URL recognized");
                        return;
                    }
                } else {
                    n2.a.a1(1, v22.f9850f1, "Wrong URL dismissed");
                    return;
                }
        }
    }
}
