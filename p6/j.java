package P6;

import F.h;
import W6.d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j implements Serializable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f3954U = 0;

    /* renamed from: V  reason: collision with root package name */
    public Object f3955V;

    public /* synthetic */ j() {
    }

    public List a(String str) {
        int i = 0;
        d.m0(0);
        Matcher matcher = ((Pattern) this.f3955V).matcher(str);
        if (!matcher.find()) {
            return h.w(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(str.subSequence(i, matcher.start()).toString());
            i = matcher.end();
        } while (matcher.find());
        arrayList.add(str.subSequence(i, str.length()).toString());
        return arrayList;
    }

    public final String toString() {
        switch (this.f3954U) {
            case 0:
                return String.valueOf(this.f3955V);
            default:
                String pattern = ((Pattern) this.f3955V).toString();
                f.d(pattern, "toString(...)");
                return pattern;
        }
    }

    public j(String str) {
        Pattern compile = Pattern.compile(str);
        f.d(compile, "compile(...)");
        this.f3955V = compile;
    }
}
