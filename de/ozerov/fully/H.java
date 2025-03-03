package de.ozerov.fully;

import B7.e;
import Q0.g;
import U.p;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.util.Log;
import com.samsung.android.knox.accounts.HostAuth;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;
import n2.a;
import org.json.JSONObject;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    public final FullyActivity f9981a;

    /* renamed from: b  reason: collision with root package name */
    public volatile BluetoothSocket f9982b;

    /* renamed from: c  reason: collision with root package name */
    public volatile BluetoothDevice f9983c;

    /* renamed from: d  reason: collision with root package name */
    public volatile UUID f9984d;
    public volatile OutputStream e;

    /* renamed from: f  reason: collision with root package name */
    public volatile InputStream f9985f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f9986g;

    /* renamed from: h  reason: collision with root package name */
    public int f9987h;
    public volatile boolean i;

    public H(FullyActivity fullyActivity) {
        this.f9981a = fullyActivity;
    }

    public static int c(BluetoothDevice bluetoothDevice) {
        try {
            return ((Integer) bluetoothDevice.getClass().getMethod("getBatteryLevel", (Class[]) null).invoke(bluetoothDevice, (Object[]) null)).intValue();
        } catch (Exception e8) {
            g.x(e8, new StringBuilder("Failed to get the bluetooth battery level due to "), "H");
            return -1;
        }
    }

    public static boolean e(BluetoothDevice bluetoothDevice) {
        try {
            return ((Boolean) bluetoothDevice.getClass().getMethod("isConnected", (Class[]) null).invoke(bluetoothDevice, (Object[]) null)).booleanValue();
        } catch (Exception e8) {
            Log.e("H", "Failed to get the bluetooth device connection status due to " + e8.getMessage());
            throw new IllegalStateException();
        }
    }

    public final void a() {
        try {
            this.i = false;
            this.f9987h = 0;
            this.f9986g = new byte[1024];
            new Thread(new p(17, (Object) this)).start();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b() {
        boolean z;
        if (this.f9983c == null || this.f9982b == null) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Log.w("H", "Bluetooth device isn't open");
            return;
        }
        try {
            this.i = true;
            this.e.close();
            this.f9985f.close();
            this.f9982b.close();
            Log.i("H", "Bluetooth device closed");
        } catch (Exception e8) {
            e8.printStackTrace();
        } catch (Throwable th) {
            this.f9983c = null;
            this.f9984d = null;
            this.f9982b = null;
            throw th;
        }
        this.f9983c = null;
        this.f9984d = null;
        this.f9982b = null;
    }

    public final String d() {
        boolean z;
        if (this.f9983c == null || this.f9982b == null || !this.f9982b.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return "";
        }
        if (!a.r0() || this.f9981a.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("name", this.f9983c.getName());
                jSONObject.put(HostAuth.ADDRESS, this.f9983c.getAddress());
                jSONObject.put("uuid", this.f9984d.toString());
                jSONObject.put("batteryLevel", c(this.f9983c));
                return jSONObject.toString();
            } catch (Exception e8) {
                e8.printStackTrace();
                return "";
            }
        } else {
            Log.w("H", "Missing Bluetooth Connect permission for this operation");
            return "";
        }
    }

    public final void f(String str, String str2, String str3) {
        new Thread(new e(this, str, str2, str3, 5)).start();
    }

    public final boolean g(byte[] bArr) {
        Log.i("H", "Trying to send data to device...");
        try {
            this.e.write(bArr);
            Log.i("H", "Data sent to BT device, size=" + bArr.length);
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
