package de.ozerov.fully;

import Z1.f;
import android.content.Context;
import android.os.AsyncTask;
import java.util.HashSet;

public abstract class W4 {

    /* renamed from: a  reason: collision with root package name */
    public static volatile HashSet f10487a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f10488b = false;

    public static void a(Context context) {
        AsyncTask.execute(new f(context, 3));
    }

    public static boolean b(String str) {
        int indexOf;
        int i;
        if (str.isEmpty() || (indexOf = str.indexOf(".")) < 0) {
            return false;
        }
        if (f10487a.contains(str) || ((i = indexOf + 1) < str.length() && b(str.substring(i)))) {
            return true;
        }
        return false;
    }
}
