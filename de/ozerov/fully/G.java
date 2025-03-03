package de.ozerov.fully;

import U.p;
import d4.k;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import n2.a;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.RangeNotifier;
import org.altbeacon.beacon.Region;
import org.json.JSONObject;
import u.C1455O;

public final class G implements RangeNotifier {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1455O f9963a;

    public G(C1455O o2) {
        this.f9963a = o2;
    }

    public final void didRangeBeaconsInRegion(Collection collection, Region region) {
        C1455O o2;
        Iterator it = collection.iterator();
        boolean z = false;
        while (true) {
            boolean hasNext = it.hasNext();
            o2 = this.f9963a;
            if (!hasNext) {
                break;
            }
            Beacon beacon = (Beacon) it.next();
            if (beacon.getIdentifiers().size() >= 3) {
                boolean M02 = a.M0(beacon.getId1() + "/" + beacon.getId2() + "/" + beacon.getId3(), (String[]) o2.e);
                k kVar = (k) o2.f15531c;
                if (M02 && beacon.getDistance() <= ((double) kVar.x1())) {
                    z = true;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("$id1", beacon.getId1().toString());
                hashMap.put("$id2", beacon.getId2().toString());
                hashMap.put("$id3", beacon.getId3().toString());
                hashMap.put("$mac", beacon.getBluetoothAddress());
                hashMap.put("$name", beacon.getBluetoothName());
                hashMap.put("$type", String.valueOf(beacon.getBeaconTypeCode()));
                hashMap.put("$manufactorer", String.valueOf(beacon.getManufacturer()));
                hashMap.put("$distance", String.valueOf(beacon.getDistance()));
                if (kVar.B2().booleanValue() && kVar.A().booleanValue()) {
                    U0.e("onIBeacon", hashMap);
                }
                JSONObject jSONObject = new JSONObject(hashMap);
                a.T0(jSONObject, "$id1", "id1");
                a.T0(jSONObject, "$id2", "id2");
                a.T0(jSONObject, "$id4", "id3");
                a.T0(jSONObject, "$mac", "mac");
                a.T0(jSONObject, "$name", "name");
                a.T0(jSONObject, "$type", "type");
                a.T0(jSONObject, "$manufactorer", "manufactorer");
                a.T0(jSONObject, "$distance", "distance");
                ((FullyActivity) o2.f15530b).f9935X0.b0("onIBeacon", jSONObject);
            }
        }
        if (z && ((k) o2.f15531c).y1().booleanValue()) {
            ((FullyActivity) o2.f15530b).runOnUiThread(new p(16, (Object) this));
        }
    }
}
