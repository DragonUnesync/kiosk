package org.altbeacon.beacon.distance;

import org.altbeacon.beacon.logging.LogManager;

public class CurveFittedDistanceCalculator implements DistanceCalculator {
    public static final String TAG = "CurveFittedDistanceCalculator";
    private double mCoefficient1;
    private double mCoefficient2;
    private double mCoefficient3;

    public CurveFittedDistanceCalculator(double d8, double d9, double d10) {
        this.mCoefficient1 = d8;
        this.mCoefficient2 = d9;
        this.mCoefficient3 = d10;
    }

    public double calculateDistance(int i, double d8) {
        double d9;
        if (d8 == 0.0d) {
            return -1.0d;
        }
        LogManager.d(TAG, "calculating distance based on mRssi of %s and txPower of %s", Double.valueOf(d8), Integer.valueOf(i));
        double d10 = (d8 * 1.0d) / ((double) i);
        if (d10 < 1.0d) {
            d9 = Math.pow(d10, 10.0d);
        } else {
            d9 = this.mCoefficient3 + (Math.pow(d10, this.mCoefficient2) * this.mCoefficient1);
        }
        LogManager.d(TAG, "avg mRssi: %s distance: %s", Double.valueOf(d8), Double.valueOf(d9));
        return d9;
    }
}
