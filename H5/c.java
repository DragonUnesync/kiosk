package H5;

import Q0.g;
import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2169a = 0;

    static {
        Pattern.compile(";");
    }

    public static String a(String str, List list, String... strArr) {
        StringBuilder s8 = g.s("Requesting ", str, " value from among: ");
        s8.append(Arrays.toString(strArr));
        Log.i("CameraConfiguration", s8.toString());
        Log.i("CameraConfiguration", "Supported " + str + " values: " + list);
        if (list != null) {
            for (String str2 : strArr) {
                if (list.contains(str2)) {
                    Log.i("CameraConfiguration", "Can set " + str + " to: " + str2);
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    public static void b(Camera.Parameters parameters, boolean z) {
        String str;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            str = a("flash mode", supportedFlashModes, "torch", "on");
        } else {
            str = a("flash mode", supportedFlashModes, "off");
        }
        if (str == null) {
            return;
        }
        if (str.equals(parameters.getFlashMode())) {
            Log.i("CameraConfiguration", "Flash mode already set to ".concat(str));
            return;
        }
        Log.i("CameraConfiguration", "Setting flash mode to ".concat(str));
        parameters.setFlashMode(str);
    }
}
