package org.acra.security;

import I6.a;
import g7.C0996d;

public enum TLS {
    V1("TLSv1"),
    V1_1("TLSv1.1"),
    V1_2("TLSv1.2"),
    V1_3("TLSv1.3");
    
    private final String id;

    static {
        TLS[] $values;
        $ENTRIES = C0996d.g($values);
    }

    private TLS(String str) {
        this.id = str;
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public final String getId() {
        return this.id;
    }
}
