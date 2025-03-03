package org.acra.collector;

import android.content.Context;
import g7.C0996d;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;
import x7.a;

public interface Collector extends a {

    public enum Order {
        FIRST,
        EARLY,
        NORMAL,
        LATE,
        LAST;

        static {
            Order[] $values;
            $ENTRIES = C0996d.g($values);
        }

        public static I6.a getEntries() {
            return $ENTRIES;
        }
    }

    void collect(Context context, C1395d dVar, C1347b bVar, C1408a aVar);

    /* bridge */ /* synthetic */ boolean enabled(C1395d dVar);

    Order getOrder();
}
