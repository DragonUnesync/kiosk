package de.ozerov.fully;

import android.content.Context;
import android.os.Process;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class D1 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9856a = Integer.toString(Process.myPid());

    public static String a(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(new String[]{"logcat", "-d", "-v", "threadtime"}).getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (!readLine.contains(f9856a)) {
                    if (readLine.contains(context.getPackageName())) {
                    }
                }
                if (readLine.contains("")) {
                    sb.append(readLine + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            sb.append("Failed to read logcat");
        }
        return sb.toString();
    }
}
