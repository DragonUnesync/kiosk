package org.acra.sender;

import I6.a;
import g7.C0996d;
import java.net.URL;
import s7.C1408a;

public enum HttpSender$Method {
    POST((String) null),
    PUT((String) null);

    static {
        HttpSender$Method[] $values;
        $ENTRIES = C0996d.g($values);
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public abstract URL createURL(String str, C1408a aVar);
}
