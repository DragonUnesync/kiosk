package W0;

import M0.J;
import R0.j;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l1.r;

public final class f implements r {

    /* renamed from: U  reason: collision with root package name */
    public static final Pattern f6047U = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    public final Object n(Uri uri, j jVar) {
        long j7;
        long j8;
        String readLine = new BufferedReader(new InputStreamReader(jVar, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = f6047U.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    if ("+".equals(matcher.group(4))) {
                        j7 = 1;
                    } else {
                        j7 = -1;
                    }
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    if (TextUtils.isEmpty(group2)) {
                        j8 = 0;
                    } else {
                        j8 = Long.parseLong(group2);
                    }
                    time -= (((parseLong * 60) + j8) * 60000) * j7;
                }
                return Long.valueOf(time);
            }
            throw J.b((Exception) null, "Couldn't parse timestamp: " + readLine);
        } catch (ParseException e) {
            throw J.b(e, (String) null);
        }
    }
}
