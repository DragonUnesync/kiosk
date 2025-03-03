package org.altbeacon.beacon.service;

import P6.f;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import java.util.List;
import org.altbeacon.beacon.logging.LogManager;

public final class IntentScanStrategyCoordinator$runBackupScan$1$callback$1 extends ScanCallback {
    final /* synthetic */ BluetoothLeScanner $scanner;
    final /* synthetic */ IntentScanStrategyCoordinator this$0;

    public IntentScanStrategyCoordinator$runBackupScan$1$callback$1(IntentScanStrategyCoordinator intentScanStrategyCoordinator, BluetoothLeScanner bluetoothLeScanner) {
        this.this$0 = intentScanStrategyCoordinator;
        this.$scanner = bluetoothLeScanner;
    }

    public void onBatchScanResults(List<ScanResult> list) {
        f.e(list, "results");
        super.onBatchScanResults(list);
    }

    public void onScanFailed(int i) {
        super.onScanFailed(i);
        LogManager.d(IntentScanStrategyCoordinator.Companion.getTAG(), "Sending onScanFailed event", new Object[0]);
    }

    public void onScanResult(int i, ScanResult scanResult) {
        f.e(scanResult, "result");
        super.onScanResult(i, scanResult);
        ScanHelper access$getScanHelper$p = this.this$0.scanHelper;
        byte[] bArr = null;
        if (access$getScanHelper$p != null) {
            BluetoothDevice device = scanResult.getDevice();
            int rssi = scanResult.getRssi();
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord != null) {
                bArr = scanRecord.getBytes();
            }
            access$getScanHelper$p.processScanResult(device, rssi, bArr, scanResult.getTimestampNanos());
            try {
                this.$scanner.stopScan(this);
            } catch (IllegalStateException unused) {
            }
        } else {
            f.i("scanHelper");
            throw null;
        }
    }
}
