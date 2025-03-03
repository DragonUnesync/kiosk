package org.altbeacon.beacon.logging;

import P6.f;
import W6.d;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.MissingFormatArgumentException;

public final class ApiTrackingLogger implements Logger {
    private ArrayList<String> apiCalls = new ArrayList<>();
    private final SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    private final void trackApiLogs(String str) {
        if (str != null && d.g0(str, "API", 0, false, 6) == 0) {
            this.apiCalls.add(this.dateformat.format(new Date()) + " " + str);
        }
    }

    public final void clearApiCalls() {
        this.apiCalls.clear();
    }

    public void d(String str, String str2, Object... objArr) {
        f.e(objArr, "args");
        trackApiLogs(str2);
        Log.d(str, formatString(str2, Arrays.copyOf(objArr, objArr.length)));
    }

    public void e(String str, String str2, Object... objArr) {
        f.e(objArr, "args");
        trackApiLogs(str2);
        Log.e(str, formatString(str2, Arrays.copyOf(objArr, objArr.length)));
    }

    public final String formatString(String str, Object... objArr) {
        f.e(objArr, "args");
        try {
            if (objArr.length != 0) {
                if (str != null) {
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    return String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                }
            }
            f.b(str);
            return str;
        } catch (MissingFormatArgumentException unused) {
            f.b(str);
            return str;
        }
    }

    public final String[] getApiCalls() {
        return (String[]) this.apiCalls.toArray(new String[0]);
    }

    public void i(String str, String str2, Object... objArr) {
        f.e(objArr, "args");
        trackApiLogs(str2);
        Log.i(str, formatString(str2, Arrays.copyOf(objArr, objArr.length)));
    }

    public void v(String str, String str2, Object... objArr) {
        f.e(objArr, "args");
        trackApiLogs(str2);
        Log.v(str, new VerboseAndroidLogger().formatString(str2, Arrays.copyOf(objArr, objArr.length)));
    }

    public void w(String str, String str2, Object... objArr) {
        f.e(objArr, "args");
        trackApiLogs(str2);
        Log.w(str, formatString(str2, Arrays.copyOf(objArr, objArr.length)));
    }

    public void d(Throwable th, String str, String str2, Object... objArr) {
        f.e(objArr, "args");
        trackApiLogs(str2);
        Log.d(str, formatString(str2, Arrays.copyOf(objArr, objArr.length)), th);
    }

    public void e(Throwable th, String str, String str2, Object... objArr) {
        f.e(objArr, "args");
        trackApiLogs(str2);
        Log.e(str, formatString(str2, Arrays.copyOf(objArr, objArr.length)), th);
    }

    public void i(Throwable th, String str, String str2, Object... objArr) {
        f.e(objArr, "args");
        trackApiLogs(str2);
        Log.i(str, formatString(str2, Arrays.copyOf(objArr, objArr.length)), th);
    }

    public void v(Throwable th, String str, String str2, Object... objArr) {
        f.e(objArr, "args");
        trackApiLogs(str2);
        Log.v(str, formatString(str2, Arrays.copyOf(objArr, objArr.length)), th);
    }

    public void w(Throwable th, String str, String str2, Object... objArr) {
        f.e(objArr, "args");
        trackApiLogs(str2);
        Log.w(str, formatString(str2, Arrays.copyOf(objArr, objArr.length)), th);
    }
}
