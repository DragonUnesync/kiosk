package h7;

import P6.f;
import W6.d;
import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: h7.d  reason: case insensitive filesystem */
public final class C1086d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final C1086d f12622a = new Handler();

    public final void close() {
    }

    public final void flush() {
    }

    public final void publish(LogRecord logRecord) {
        int i;
        int min;
        f.e(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = C1085c.f12620a;
        String loggerName = logRecord.getLoggerName();
        f.d(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            i = 5;
        } else if (logRecord.getLevel().intValue() == level.intValue()) {
            i = 4;
        } else {
            i = 3;
        }
        String message = logRecord.getMessage();
        f.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) C1085c.f12621b.get(loggerName);
        if (str == null) {
            str = d.r0(23, loggerName);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + 10 + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i8 = 0;
            while (i8 < length) {
                int f02 = d.f0(message, 10, i8, false, 4);
                if (f02 == -1) {
                    f02 = length;
                }
                while (true) {
                    min = Math.min(f02, i8 + 4000);
                    String substring = message.substring(i8, min);
                    f.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= f02) {
                        break;
                    }
                    i8 = min;
                }
                i8 = min + 1;
            }
        }
    }
}
