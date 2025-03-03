package org.acra.data;

import I6.a;
import g7.C0996d;
import java.util.List;
import org.acra.ReportField;
import s7.C1408a;

public enum StringFormat {
    JSON("application/json", (int) null),
    KEY_VALUE_LIST("application/x-www-form-urlencoded", (int) null);
    
    private final String matchingHttpContentType;

    static {
        StringFormat[] $values;
        $ENTRIES = C0996d.g($values);
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final String getMatchingHttpContentType() {
        return this.matchingHttpContentType;
    }

    public abstract String toFormattedString(C1408a aVar, List<? extends ReportField> list, String str, String str2, boolean z);

    private StringFormat(String str) {
        this.matchingHttpContentType = str;
    }
}
