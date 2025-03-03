package Q3;

import A.b;
import H5.h;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;

public final class a implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public h f4107a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f4108b;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f8 = sensorEvent.values[0];
        if (this.f4107a == null) {
            return;
        }
        if (f8 <= 45.0f) {
            this.f4108b.post(new b(this, true, 3));
        } else if (f8 >= 450.0f) {
            this.f4108b.post(new b(this, false, 3));
        }
    }
}
