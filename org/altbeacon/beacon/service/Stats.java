package org.altbeacon.beacon.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.logging.LogManager;

public class Stats {
    private static final Stats INSTANCE = new Stats();
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("HH:mm:ss.SSS");
    private static final String TAG = "Stats";
    private boolean mEnableHistoricalLogging;
    private boolean mEnableLogging;
    private boolean mEnabled;
    private Sample mSample;
    private long mSampleIntervalMillis = 0;
    private ArrayList<Sample> mSamples;

    public static class Sample {
        public long detectionCount = 0;
        public Date firstDetectionTime;
        public Date lastDetectionTime;
        public long maxMillisBetweenDetections;
        public Date sampleStartTime;
        public Date sampleStopTime;
    }

    private Stats() {
        clearSamples();
    }

    private String formattedDate(Date date) {
        String str = "";
        if (date != null) {
            SimpleDateFormat simpleDateFormat = SIMPLE_DATE_FORMAT;
            synchronized (simpleDateFormat) {
                str = simpleDateFormat.format(date);
            }
        }
        return str;
    }

    public static Stats getInstance() {
        return INSTANCE;
    }

    private void logSample(Sample sample, boolean z) {
        if (z) {
            LogManager.d(TAG, "sample start time, sample stop time, first detection time, last detection time, max millis between detections, detection count", new Object[0]);
        }
        LogManager.d(TAG, "%s, %s, %s, %s, %s, %s", formattedDate(sample.sampleStartTime), formattedDate(sample.sampleStopTime), formattedDate(sample.firstDetectionTime), formattedDate(sample.lastDetectionTime), Long.valueOf(sample.maxMillisBetweenDetections), Long.valueOf(sample.detectionCount));
    }

    private void logSamples() {
        boolean z = true;
        LogManager.d(TAG, "--- Stats for %s samples", Integer.valueOf(this.mSamples.size()));
        Iterator<Sample> it = this.mSamples.iterator();
        while (it.hasNext()) {
            logSample(it.next(), z);
            z = false;
        }
    }

    private void rollSampleIfNeeded() {
        if (this.mSample == null || (this.mSampleIntervalMillis > 0 && new Date().getTime() - this.mSample.sampleStartTime.getTime() >= this.mSampleIntervalMillis)) {
            newSampleInterval();
        }
    }

    public void clearSample() {
        this.mSample = null;
    }

    public void clearSamples() {
        this.mSamples = new ArrayList<>();
        newSampleInterval();
    }

    public ArrayList<Sample> getSamples() {
        rollSampleIfNeeded();
        return this.mSamples;
    }

    public boolean isEnabled() {
        return this.mEnabled;
    }

    public void log(Beacon beacon) {
        rollSampleIfNeeded();
        Sample sample = this.mSample;
        sample.detectionCount++;
        if (sample.firstDetectionTime == null) {
            sample.firstDetectionTime = new Date();
        }
        if (this.mSample.lastDetectionTime != null) {
            long time = new Date().getTime() - this.mSample.lastDetectionTime.getTime();
            Sample sample2 = this.mSample;
            if (time > sample2.maxMillisBetweenDetections) {
                sample2.maxMillisBetweenDetections = time;
            }
        }
        this.mSample.lastDetectionTime = new Date();
    }

    public void newSampleInterval() {
        Date date = new Date();
        if (this.mSample != null) {
            date = new Date(this.mSample.sampleStartTime.getTime() + this.mSampleIntervalMillis);
            Sample sample = this.mSample;
            sample.sampleStopTime = date;
            if (!this.mEnableHistoricalLogging && this.mEnableLogging) {
                logSample(sample, true);
            }
        }
        Sample sample2 = new Sample();
        this.mSample = sample2;
        sample2.sampleStartTime = date;
        this.mSamples.add(sample2);
        if (this.mEnableHistoricalLogging) {
            logSamples();
        }
    }

    public void setEnabled(boolean z) {
        this.mEnabled = z;
    }

    public void setHistoricalLoggingEnabled(boolean z) {
        this.mEnableHistoricalLogging = z;
    }

    public void setLoggingEnabled(boolean z) {
        this.mEnableLogging = z;
    }

    public void setSampleIntervalMillis(long j7) {
        this.mSampleIntervalMillis = j7;
    }
}
