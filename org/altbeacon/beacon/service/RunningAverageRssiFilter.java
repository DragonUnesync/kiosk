package org.altbeacon.beacon.service;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.altbeacon.beacon.logging.LogManager;

public class RunningAverageRssiFilter implements RssiFilter {
    public static final long DEFAULT_SAMPLE_EXPIRATION_MILLISECONDS = 20000;
    private static final String TAG = "RunningAverageRssiFilter";
    private static long sampleExpirationMilliseconds = 20000;
    private ArrayList<Measurement> mMeasurements = new ArrayList<>();

    public class Measurement implements Comparable<Measurement> {
        Integer rssi;
        long timestamp;

        public /* synthetic */ Measurement(RunningAverageRssiFilter runningAverageRssiFilter, int i) {
            this();
        }

        private Measurement() {
        }

        public int compareTo(Measurement measurement) {
            return this.rssi.compareTo(measurement.rssi);
        }
    }

    public static long getSampleExpirationMilliseconds() {
        return sampleExpirationMilliseconds;
    }

    private synchronized void refreshMeasurements() {
        try {
            ArrayList<Measurement> arrayList = new ArrayList<>();
            Iterator<Measurement> it = this.mMeasurements.iterator();
            while (it.hasNext()) {
                Measurement next = it.next();
                if (SystemClock.elapsedRealtime() - next.timestamp < sampleExpirationMilliseconds) {
                    arrayList.add(next);
                }
            }
            this.mMeasurements = arrayList;
            Collections.sort(arrayList);
        } finally {
            while (true) {
            }
        }
    }

    public static void setSampleExpirationMilliseconds(long j7) {
        sampleExpirationMilliseconds = j7;
    }

    public void addMeasurement(Integer num) {
        Measurement measurement = new Measurement(this, 0);
        measurement.rssi = num;
        measurement.timestamp = SystemClock.elapsedRealtime();
        this.mMeasurements.add(measurement);
    }

    public double calculateRssi() {
        int i;
        refreshMeasurements();
        int size = this.mMeasurements.size();
        int i8 = size - 1;
        if (size > 2) {
            int i9 = size / 10;
            i = i9 + 1;
            i8 = (size - i9) - 2;
        } else {
            i = 0;
        }
        double d8 = 0.0d;
        for (int i10 = i; i10 <= i8; i10++) {
            d8 += (double) this.mMeasurements.get(i10).rssi.intValue();
        }
        double d9 = d8 / ((double) ((i8 - i) + 1));
        LogManager.d(TAG, "Running average mRssi based on %s measurements: %s", Integer.valueOf(size), Double.valueOf(d9));
        return d9;
    }

    public int getMeasurementCount() {
        return this.mMeasurements.size();
    }

    public boolean noMeasurementsAvailable() {
        if (this.mMeasurements.size() == 0) {
            return true;
        }
        return false;
    }
}
