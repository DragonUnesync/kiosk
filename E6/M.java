package e6;

public enum M {
    DISABLED,
    SIMPLE,
    ADVANCED,
    PARANOID;

    public static M parseLevel(String str) {
        String trim = str.trim();
        for (M m8 : values()) {
            if (trim.equalsIgnoreCase(m8.name()) || trim.equals(String.valueOf(m8.ordinal()))) {
                return m8;
            }
        }
        return P.DEFAULT_LEVEL;
    }
}
