package Z5;

import e6.C0847f;

public enum p0 {
    INFORMATIONAL(100, 200, "Informational"),
    SUCCESS(200, 300, "Success"),
    REDIRECTION(300, 400, "Redirection"),
    CLIENT_ERROR(400, 500, "Client Error"),
    SERVER_ERROR(500, 600, "Server Error"),
    UNKNOWN(0, 0, "Unknown Status");
    
    private static final p0[] statusArray = null;
    private final C0847f defaultReasonPhrase;
    private final int max;
    private final int min;

    static {
        p0 p0Var;
        p0 p0Var2;
        p0 p0Var3;
        p0 p0Var4;
        p0 p0Var5;
        p0[] p0VarArr = new p0[6];
        statusArray = p0VarArr;
        p0VarArr[1] = p0Var;
        p0VarArr[2] = p0Var2;
        p0VarArr[3] = p0Var3;
        p0VarArr[4] = p0Var4;
        p0VarArr[5] = p0Var5;
    }

    private static int fast_div100(int i) {
        return (int) ((((long) i) * 1374389535) >> 37);
    }

    public boolean contains(int i) {
        if (i < this.min || i >= this.max) {
            return false;
        }
        return true;
    }

    private p0(int i, int i8, String str) {
        this.min = i;
        this.max = i8;
        this.defaultReasonPhrase = C0847f.cached(str);
    }

    public static p0 valueOf(int i) {
        p0 p0Var = UNKNOWN;
        if (p0Var.contains(i)) {
            return p0Var;
        }
        return statusArray[fast_div100(i)];
    }
}
