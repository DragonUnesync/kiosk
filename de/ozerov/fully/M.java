package de.ozerov.fully;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import java.util.HashMap;
import n2.a;

public final class M extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10087a;

    public /* synthetic */ M(int i) {
        this.f10087a = i;
    }

    public final void onReceive(Context context, Intent intent) {
        UsbDevice usbDevice;
        switch (this.f10087a) {
            case 0:
                if (intent != null && intent.getAction() != null && intent.getAction().equals("android.hardware.usb.action.USB_DEVICE_ATTACHED") && (usbDevice = (UsbDevice) intent.getParcelableExtra("device")) != null && usbDevice.getProductId() == 3086 && usbDevice.getVendorId() == 1208) {
                    a.b1(context, "USB Device Attached");
                    return;
                }
                return;
            default:
                if (intent != null && intent.getAction() != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("$action", intent.getAction());
                    hashMap.put("$extras", a.O(intent).toString());
                    U0.e("broadcastReceived", hashMap);
                    return;
                }
                return;
        }
    }
}
