package org.altbeacon.beacon;

public interface BeaconData {
    String get(String str);

    Double getLatitude();

    Double getLongitude();

    boolean isDirty();

    void set(String str, String str2);

    void setLatitude(Double d8);

    void setLongitude(Double d8);

    void sync(BeaconDataNotifier beaconDataNotifier);
}
