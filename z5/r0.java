package Z5;

import S5.C0185n;
import e6.C0852k;
import g6.B;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u.C1477r;

public final class r0 implements Comparable {
    public static final r0 HTTP_1_0 = new r0("HTTP", 1, 0, false, true);
    public static final r0 HTTP_1_1 = new r0("HTTP", 1, 1, true, true);
    private static final Pattern VERSION_PATTERN = Pattern.compile("(\\S+)/(\\d+)\\.(\\d+)");
    private final byte[] bytes;
    private final boolean keepAliveDefault;
    private final int majorVersion;
    private final int minorVersion;
    private final String protocolName;
    private final String text;

    public r0(String str, boolean z) {
        String upperCase = B.checkNonEmptyAfterTrim(str, "text").toUpperCase();
        Matcher matcher = VERSION_PATTERN.matcher(upperCase);
        if (matcher.matches()) {
            String group = matcher.group(1);
            this.protocolName = group;
            int parseInt = Integer.parseInt(matcher.group(2));
            this.majorVersion = parseInt;
            int parseInt2 = Integer.parseInt(matcher.group(3));
            this.minorVersion = parseInt2;
            this.text = group + '/' + parseInt + '.' + parseInt2;
            this.keepAliveDefault = z;
            this.bytes = null;
            return;
        }
        throw new IllegalArgumentException(C1477r.d("invalid version format: ", upperCase));
    }

    public static r0 valueOf(String str) {
        B.checkNotNull(str, "text");
        if (str == "HTTP/1.1") {
            return HTTP_1_1;
        }
        if (str == "HTTP/1.0") {
            return HTTP_1_0;
        }
        String trim = str.trim();
        if (!trim.isEmpty()) {
            r0 version0 = version0(trim);
            if (version0 == null) {
                return new r0(trim, true);
            }
            return version0;
        }
        throw new IllegalArgumentException("text is empty (possibly HTTP/0.9)");
    }

    private static r0 version0(String str) {
        if ("HTTP/1.1".equals(str)) {
            return HTTP_1_1;
        }
        if ("HTTP/1.0".equals(str)) {
            return HTTP_1_0;
        }
        return null;
    }

    public void encode(C0185n nVar) {
        byte[] bArr = this.bytes;
        if (bArr == null) {
            nVar.writeCharSequence(this.text, C0852k.US_ASCII);
        } else {
            nVar.writeBytes(bArr);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (minorVersion() == r0Var.minorVersion() && majorVersion() == r0Var.majorVersion() && protocolName().equals(r0Var.protocolName())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int majorVersion2 = majorVersion();
        return minorVersion() + ((majorVersion2 + (protocolName().hashCode() * 31)) * 31);
    }

    public boolean isKeepAliveDefault() {
        return this.keepAliveDefault;
    }

    public int majorVersion() {
        return this.majorVersion;
    }

    public int minorVersion() {
        return this.minorVersion;
    }

    public String protocolName() {
        return this.protocolName;
    }

    public String text() {
        return this.text;
    }

    public String toString() {
        return text();
    }

    public int compareTo(r0 r0Var) {
        int compareTo = protocolName().compareTo(r0Var.protocolName());
        if (compareTo != 0) {
            return compareTo;
        }
        int majorVersion2 = majorVersion() - r0Var.majorVersion();
        if (majorVersion2 != 0) {
            return majorVersion2;
        }
        return minorVersion() - r0Var.minorVersion();
    }

    private r0(String str, int i, int i8, boolean z, boolean z6) {
        String upperCase = B.checkNonEmptyAfterTrim(str, "protocolName").toUpperCase();
        for (int i9 = 0; i9 < upperCase.length(); i9++) {
            if (Character.isISOControl(upperCase.charAt(i9)) || Character.isWhitespace(upperCase.charAt(i9))) {
                throw new IllegalArgumentException("invalid character in protocolName");
            }
        }
        B.checkPositiveOrZero(i, "majorVersion");
        B.checkPositiveOrZero(i8, "minorVersion");
        this.protocolName = upperCase;
        this.majorVersion = i;
        this.minorVersion = i8;
        String str2 = upperCase + '/' + i + '.' + i8;
        this.text = str2;
        this.keepAliveDefault = z;
        if (z6) {
            this.bytes = str2.getBytes(C0852k.US_ASCII);
        } else {
            this.bytes = null;
        }
    }
}
