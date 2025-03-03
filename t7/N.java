package T7;

import N.e;
import S7.c;

public final class N extends O {
    /* renamed from: A */
    public final O p() {
        super.p();
        this.f5107Z = null;
        return this;
    }

    public final String toString() {
        String str;
        boolean z;
        if (this.f5106Y) {
            str = "/>";
        } else {
            str = ">";
        }
        c cVar = this.f5107Z;
        if (cVar != null) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "[unset]";
        if (!z || cVar.f4544U <= 0) {
            StringBuilder sb = new StringBuilder("<");
            String str3 = this.f5104W;
            if (str3 != null) {
                str2 = str3;
            }
            return e.A(sb, str2, str);
        }
        StringBuilder sb2 = new StringBuilder("<");
        String str4 = this.f5104W;
        if (str4 != null) {
            str2 = str4;
        }
        sb2.append(str2);
        sb2.append(" ");
        sb2.append(this.f5107Z.toString());
        sb2.append(str);
        return sb2.toString();
    }
}
