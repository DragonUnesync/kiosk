package X5;

import e6.C0847f;

/* renamed from: X5.e  reason: case insensitive filesystem */
public class C0354e implements S {
    public static final C0354e INSTANCE = new C0354e();
    private static final C0847f TRUE_ASCII = new C0847f("true");

    public CharSequence convertObject(Object obj) {
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }
}
