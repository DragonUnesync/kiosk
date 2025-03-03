package Y1;

import android.text.Html;
import java.util.regex.Pattern;

public abstract class F {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f6332a = Pattern.compile("(&#13;)?&#10;");

    public static String a(CharSequence charSequence) {
        return f6332a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
