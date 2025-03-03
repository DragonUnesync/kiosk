package org.acra.collector;

import D6.b;
import D6.j;
import P6.f;
import W6.l;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import java.lang.reflect.Field;
import n2.a;
import n7.C1247a;
import org.acra.ErrorReporter;
import org.acra.ReportField;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.E;
import p7.C1347b;
import r7.C1395d;
import s7.C1408a;

public class DisplayManagerCollector extends BaseReportFieldCollector {
    public DisplayManagerCollector() {
        super(ReportField.DISPLAY);
    }

    private String activeFlags(SparseArray<String> sparseArray, int i) {
        StringBuilder sb = new StringBuilder();
        int size = sparseArray.size();
        for (int i8 = 0; i8 < size; i8++) {
            int keyAt = sparseArray.keyAt(i8) & i;
            if (keyAt > 0) {
                if (sb.length() > 0) {
                    sb.append('+');
                }
                sb.append(sparseArray.get(keyAt));
            }
        }
        String sb2 = sb.toString();
        f.d(sb2, "toString(...)");
        return sb2;
    }

    private void collectCurrentSizeRange(Display display, JSONObject jSONObject) {
        Point point = new Point();
        Point point2 = new Point();
        display.getCurrentSizeRange(point, point2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("smallest", new JSONArray(j.L(Integer.valueOf(point.x), Integer.valueOf(point.y))));
        jSONObject2.put("largest", new JSONArray(j.L(Integer.valueOf(point2.x), Integer.valueOf(point2.y))));
        jSONObject.put("currentSizeRange", jSONObject2);
    }

    private JSONObject collectDisplayData(Display display) {
        display.getMetrics(new DisplayMetrics());
        JSONObject jSONObject = new JSONObject();
        collectCurrentSizeRange(display, jSONObject);
        collectFlags(display, jSONObject);
        collectMetrics(display, jSONObject);
        collectRealMetrics(display, jSONObject);
        collectName(display, jSONObject);
        collectRealSize(display, jSONObject);
        collectRectSize(display, jSONObject);
        collectSize(display, jSONObject);
        collectRotation(display, jSONObject);
        collectIsValid(display, jSONObject);
        jSONObject.put("orientation", display.getRotation()).put("refreshRate", (double) display.getRefreshRate()).put("height", display.getHeight()).put("width", display.getWidth()).put("pixelFormat", display.getPixelFormat());
        return jSONObject;
    }

    private void collectFlags(Display display, JSONObject jSONObject) {
        SparseArray sparseArray = new SparseArray();
        int flags = display.getFlags();
        b g8 = f.g(display.getClass().getFields());
        while (g8.hasNext()) {
            Field field = (Field) g8.next();
            String name = field.getName();
            f.d(name, "getName(...)");
            if (l.a0(name, "FLAG_", false)) {
                try {
                    sparseArray.put(field.getInt((Object) null), field.getName());
                } catch (IllegalAccessException unused) {
                }
            }
        }
        jSONObject.put("flags", activeFlags(sparseArray, flags));
    }

    private void collectIsValid(Display display, JSONObject jSONObject) {
        jSONObject.put("isValid", display.isValid());
    }

    private void collectMetrics(Display display, JSONObject jSONObject) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        JSONObject jSONObject2 = new JSONObject();
        collectMetrics(displayMetrics, jSONObject2);
        jSONObject.put("metrics", jSONObject2);
    }

    private void collectName(Display display, JSONObject jSONObject) {
        jSONObject.put("name", display.getName());
    }

    private void collectRealMetrics(Display display, JSONObject jSONObject) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getRealMetrics(displayMetrics);
        JSONObject jSONObject2 = new JSONObject();
        collectMetrics(displayMetrics, jSONObject2);
        jSONObject.put("realMetrics", jSONObject2);
    }

    private void collectRealSize(Display display, JSONObject jSONObject) {
        Point point = new Point();
        display.getRealSize(point);
        jSONObject.put("realSize", new JSONArray(j.L(Integer.valueOf(point.x), Integer.valueOf(point.y))));
    }

    private void collectRectSize(Display display, JSONObject jSONObject) {
        Rect rect = new Rect();
        display.getRectSize(rect);
        jSONObject.put("rectSize", new JSONArray(j.L(Integer.valueOf(rect.top), Integer.valueOf(rect.left), Integer.valueOf(rect.width()), Integer.valueOf(rect.height()))));
    }

    private void collectRotation(Display display, JSONObject jSONObject) {
        jSONObject.put("rotation", rotationToString(display.getRotation()));
    }

    private void collectSize(Display display, JSONObject jSONObject) {
        Point point = new Point();
        display.getSize(point);
        jSONObject.put("size", new JSONArray(j.L(Integer.valueOf(point.x), Integer.valueOf(point.y))));
    }

    private Display[] getDisplays(Context context) {
        Object systemService = context.getSystemService("display");
        f.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        Display[] displays = ((DisplayManager) systemService).getDisplays();
        f.b(displays);
        return displays;
    }

    private String rotationToString(int i) {
        if (i == 0) {
            return "ROTATION_0";
        }
        if (i == 1) {
            return "ROTATION_90";
        }
        if (i == 2) {
            return "ROTATION_180";
        }
        if (i != 3) {
            return String.valueOf(i);
        }
        return "ROTATION_270";
    }

    public void collect(ReportField reportField, Context context, C1395d dVar, C1347b bVar, C1408a aVar) {
        f.e(reportField, "reportField");
        f.e(context, "context");
        f.e(dVar, "config");
        f.e(bVar, "reportBuilder");
        f.e(aVar, "target");
        JSONObject jSONObject = new JSONObject();
        for (Display display : getDisplays(context)) {
            try {
                jSONObject.put(String.valueOf(display.getDisplayId()), collectDisplayData(display));
            } catch (JSONException e) {
                ErrorReporter errorReporter = C1247a.f13789a;
                a.n1("Failed to collect data for display " + display.getDisplayId(), e);
            }
        }
        aVar.i(ReportField.DISPLAY, jSONObject);
    }

    public /* bridge */ /* synthetic */ boolean enabled(C1395d dVar) {
        E.a(dVar);
        return true;
    }

    private void collectMetrics(DisplayMetrics displayMetrics, JSONObject jSONObject) {
        JSONObject put = jSONObject.put("density", (double) displayMetrics.density).put("densityDpi", displayMetrics.densityDpi);
        float f8 = displayMetrics.scaledDensity;
        put.put("scaledDensity", "x" + f8).put("widthPixels", displayMetrics.widthPixels).put("heightPixels", displayMetrics.heightPixels).put("xdpi", (double) displayMetrics.xdpi).put("ydpi", (double) displayMetrics.ydpi);
    }
}
