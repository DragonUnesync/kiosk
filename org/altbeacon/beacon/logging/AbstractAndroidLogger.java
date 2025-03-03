package org.altbeacon.beacon.logging;

abstract class AbstractAndroidLogger implements Logger {
    public String formatString(String str, Object... objArr) {
        if (objArr.length == 0) {
            return str;
        }
        return String.format(str, objArr);
    }
}
