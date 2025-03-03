package de.ozerov.fully;

import Z1.c;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import d4.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n2.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class A3 implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f9786a;

    /* renamed from: b  reason: collision with root package name */
    public final k f9787b;

    /* renamed from: c  reason: collision with root package name */
    public SensorManager f9788c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f9789d;

    public A3(FullyActivity fullyActivity) {
        this.f9786a = fullyActivity;
        this.f9787b = new k((Context) fullyActivity, 1);
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = this.f9789d;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0815z3 z3Var = (C0815z3) it.next();
                JSONObject jSONObject = new JSONObject();
                try {
                    Sensor sensor = z3Var.f11123a;
                    Sensor sensor2 = z3Var.f11123a;
                    jSONObject.put("type", sensor.getType());
                    jSONObject.put("name", sensor2.getName());
                    jSONObject.put("vendor", sensor2.getVendor());
                    jSONObject.put("version", sensor2.getVersion());
                    jSONObject.put("accuracy", z3Var.f11125c);
                    if (z3Var.f11124b != null) {
                        jSONObject.put("values", new JSONArray(z3Var.f11124b));
                    }
                    jSONObject.put("lastValuesTime", z3Var.f11126d);
                    jSONObject.put("lastAccuracyTime", z3Var.e);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                jSONArray.put(jSONObject);
            }
        }
        return jSONArray;
    }

    public final float[] b(int i) {
        ArrayList arrayList = this.f9789d;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0815z3 z3Var = (C0815z3) it.next();
            if (z3Var.f11123a.getType() == i) {
                return z3Var.f11124b;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [de.ozerov.fully.z3, java.lang.Object] */
    public final void c() {
        this.f9788c = (SensorManager) this.f9786a.getSystemService("sensor");
        this.f9789d = new ArrayList();
        SensorManager sensorManager = this.f9788c;
        if (sensorManager != null) {
            List<Sensor> sensorList = sensorManager.getSensorList(-1);
            if (sensorList != null) {
                String[] split = ((c) this.f9787b.f9767W).r("environmentSensorsTypes", "13,5,6,8,12,7,29,34").split(",");
                for (Sensor next : sensorList) {
                    if (a.d(split, String.valueOf(next.getType()))) {
                        this.f9788c.registerListener(this, next, 2);
                        ArrayList arrayList = this.f9789d;
                        ? obj = new Object();
                        obj.f11123a = next;
                        obj.f11125c = -1;
                        obj.f11124b = null;
                        obj.e = -1;
                        obj.f11126d = -1;
                        arrayList.add(obj);
                        next.getType();
                        next.getName();
                    }
                }
                return;
            }
            Log.w("A3", "No sensors found at all");
        }
    }

    public final void d() {
        ArrayList arrayList = this.f9789d;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f9788c.unregisterListener(this, ((C0815z3) it.next()).f11123a);
            }
            this.f9789d = null;
        }
        this.f9788c = null;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        sensor.getType();
        ArrayList arrayList = this.f9789d;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0815z3 z3Var = (C0815z3) it.next();
                if (z3Var.f11123a == sensor) {
                    z3Var.f11125c = i;
                    z3Var.e = System.currentTimeMillis();
                }
            }
        }
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        sensorEvent.sensor.getName();
        sensorEvent.sensor.getType();
        float f8 = sensorEvent.values[0];
        ArrayList arrayList = this.f9789d;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C0815z3 z3Var = (C0815z3) it.next();
                if (z3Var.f11123a == sensorEvent.sensor) {
                    z3Var.f11124b = sensorEvent.values;
                    z3Var.f11126d = System.currentTimeMillis();
                }
            }
        }
    }
}
