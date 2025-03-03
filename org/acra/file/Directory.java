package org.acra.file;

import I6.a;
import android.content.Context;
import g7.C0996d;
import java.io.File;

public enum Directory {
    FILES_LEGACY((String) null),
    FILES((String) null),
    EXTERNAL_FILES((String) null),
    CACHE((String) null),
    EXTERNAL_CACHE((String) null),
    NO_BACKUP_FILES((String) null),
    EXTERNAL_STORAGE((String) null),
    ROOT((String) null);

    static {
        Directory[] $values;
        $ENTRIES = C0996d.g($values);
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public abstract File getFile(Context context, String str);
}
