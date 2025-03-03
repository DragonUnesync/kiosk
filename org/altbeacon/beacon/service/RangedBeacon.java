package org.altbeacon.beacon.service;

import android.os.SystemClock;
import java.io.Serializable;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconManager;
import org.altbeacon.beacon.logging.LogManager;

public class RangedBeacon implements Serializable {
    public static final long DEFAULT_MAX_TRACKING_AGE = 5000;
    public static final long DEFAULT_SAMPLE_EXPIRATION_MILLISECONDS = 20000;
    private static final String TAG = "RangedBeacon";
    public static long maxTrackingAge = 5000;
    private static long sampleExpirationMilliseconds = 20000;
    private long firstCycleDetectionTimestamp = 0;
    private long lastCycleDetectionTimestamp = 0;
    protected long lastTrackedTimeMillis = 0;
    Beacon mBeacon;
    protected transient RssiFilter mFilter = null;
    private boolean mTracked = true;
    private int packetCount = 0;

    public RangedBeacon(Beacon beacon) {
        updateBeacon(beacon);
    }

    private RssiFilter getFilter() {
        if (this.mFilter == null) {
            if (BeaconManager.getRssiFilterImplClass() != null) {
                try {
                    this.mFilter = (RssiFilter) BeaconManager.getRssiFilterImplClass().newInstance();
                } catch (Exception e) {
                    LogManager.e(TAG, "Failed with exception %s", e.toString());
                    LogManager.e(TAG, "Could not construct class %s", BeaconManager.getRssiFilterImplClass().getName());
                    LogManager.e(TAG, "Will default to RunningAverageRssiFilter", new Object[0]);
                    this.mFilter = new RunningAverageRssiFilter();
                }
            } else {
                this.mFilter = new RunningAverageRssiFilter();
            }
        }
        return this.mFilter;
    }

    public static void setMaxTrackinAge(int i) {
        maxTrackingAge = (long) i;
    }

    public static void setSampleExpirationMilliseconds(long j7) {
        sampleExpirationMilliseconds = j7;
        RunningAverageRssiFilter.setSampleExpirationMilliseconds(j7);
    }

    public void addMeasurement(Integer num) {
        if (num.intValue() != 127) {
            this.mTracked = true;
            this.lastTrackedTimeMillis = SystemClock.elapsedRealtime();
            getFilter().addMeasurement(num);
        }
    }

    public void commitMeasurements() {
        if (!getFilter().noMeasurementsAvailable()) {
            double calculateRssi = getFilter().calculateRssi();
            this.mBeacon.setRunningAverageRssi(calculateRssi);
            this.mBeacon.setRssiMeasurementCount(getFilter().getMeasurementCount());
            LogManager.d(TAG, "calculated new runningAverageRssi: %s", Double.valueOf(calculateRssi));
        } else {
            LogManager.d(TAG, "No measurements available to calculate running average", new Object[0]);
        }
        this.mBeacon.setPacketCount(this.packetCount);
        this.mBeacon.setFirstCycleDetectionTimestamp(this.firstCycleDetectionTimestamp);
        this.mBeacon.setLastCycleDetectionTimestamp(this.lastCycleDetectionTimestamp);
        this.packetCount = 0;
        this.firstCycleDetectionTimestamp = 0;
        this.lastCycleDetectionTimestamp = 0;
    }

    public Beacon getBeacon() {
        return this.mBeacon;
    }

    public long getTrackingAge() {
        return SystemClock.elapsedRealtime() - this.lastTrackedTimeMillis;
    }

    public boolean isExpired() {
        if (getTrackingAge() > maxTrackingAge) {
            return true;
        }
        return false;
    }

    public boolean isTracked() {
        return this.mTracked;
    }

    public boolean noMeasurementsAvailable() {
        return getFilter().noMeasurementsAvailable();
    }

    public void setTracked(boolean z) {
        this.mTracked = z;
    }

    public void updateBeacon(Beacon beacon) {
        this.packetCount++;
        this.mBeacon = beacon;
        if (this.firstCycleDetectionTimestamp == 0) {
            this.firstCycleDetectionTimestamp = beacon.getFirstCycleDetectionTimestamp();
        }
        this.lastCycleDetectionTimestamp = beacon.getLastCycleDetectionTimestamp();
        addMeasurement(Integer.valueOf(this.mBeacon.getRssi()));
    }
}
