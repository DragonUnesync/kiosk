package h6;

import org.apache.logging.log4j.LogManager;

public final class j extends d {
    public static final d INSTANCE = new j();

    public C1082c newInstance(String str) {
        return new i(LogManager.getLogger(str));
    }
}
