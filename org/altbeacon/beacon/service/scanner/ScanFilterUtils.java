package org.altbeacon.beacon.service.scanner;

import android.annotation.TargetApi;
import android.bluetooth.le.ScanFilter;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.Identifier;
import org.altbeacon.beacon.Region;

@TargetApi(21)
public class ScanFilterUtils {
    public static final String TAG = "ScanFilterUtils";

    public class ScanFilterData {
        public byte[] filter;
        public int manufacturer;
        public byte[] mask;
        public Long serviceUuid = null;
        public byte[] serviceUuid128Bit = new byte[0];

        public ScanFilterData() {
        }
    }

    public List<ScanFilterData> createScanFilterDataForBeaconParser(BeaconParser beaconParser, List<Identifier> list) {
        int i;
        List<Identifier> list2 = list;
        ArrayList arrayList = new ArrayList();
        long longValue = beaconParser.getMatchingBeaconTypeCode().longValue();
        int matchingBeaconTypeCodeStartOffset = beaconParser.getMatchingBeaconTypeCodeStartOffset();
        int matchingBeaconTypeCodeEndOffset = beaconParser.getMatchingBeaconTypeCodeEndOffset();
        byte[] longToByteArray = BeaconParser.longToByteArray(longValue, (matchingBeaconTypeCodeEndOffset - matchingBeaconTypeCodeStartOffset) + 1);
        if (list2 != null && list.size() > 0 && list2.get(0) != null && beaconParser.getMatchingBeaconTypeCode().longValue() == 533) {
            int[] hardwareAssistManufacturers = beaconParser.getHardwareAssistManufacturers();
            if (hardwareAssistManufacturers.length > 0) {
                int i8 = hardwareAssistManufacturers[0];
                ScanFilterData scanFilterData = new ScanFilterData();
                scanFilterData.manufacturer = i8;
                if (list.size() == 2) {
                    i = 20;
                } else {
                    i = 18;
                }
                if (list.size() == 3) {
                    i = 22;
                }
                byte[] bArr = new byte[i];
                scanFilterData.filter = bArr;
                bArr[0] = longToByteArray[0];
                bArr[1] = longToByteArray[1];
                byte[] byteArray = list2.get(0).toByteArray();
                for (int i9 = 0; i9 < byteArray.length; i9++) {
                    scanFilterData.filter[i9 + 2] = byteArray[i9];
                }
                if (list.size() > 1 && list2.get(1) != null) {
                    byte[] byteArray2 = list2.get(1).toByteArray();
                    for (int i10 = 0; i10 < byteArray2.length; i10++) {
                        scanFilterData.filter[i10 + 18] = byteArray2[i10];
                    }
                }
                if (list.size() > 2 && list2.get(2) != null) {
                    byte[] byteArray3 = list2.get(2).toByteArray();
                    for (int i11 = 0; i11 < byteArray3.length; i11++) {
                        scanFilterData.filter[i11 + 20] = byteArray3[i11];
                    }
                }
                scanFilterData.mask = new byte[i];
                for (int i12 = 0; i12 < i; i12++) {
                    scanFilterData.mask[i12] = -1;
                }
                scanFilterData.serviceUuid = null;
                scanFilterData.serviceUuid128Bit = new byte[0];
                arrayList.add(scanFilterData);
                return arrayList;
            }
        }
        for (int i13 : beaconParser.getHardwareAssistManufacturers()) {
            ScanFilterData scanFilterData2 = new ScanFilterData();
            Long serviceUuid = beaconParser.getServiceUuid();
            int i14 = matchingBeaconTypeCodeEndOffset - 1;
            byte[] bArr2 = new byte[0];
            byte[] bArr3 = new byte[0];
            if (i14 > 0) {
                bArr2 = new byte[i14];
                bArr3 = new byte[i14];
                for (int i15 = 2; i15 <= matchingBeaconTypeCodeEndOffset; i15++) {
                    int i16 = i15 - 2;
                    if (i15 < matchingBeaconTypeCodeStartOffset) {
                        bArr2[i16] = 0;
                        bArr3[i16] = 0;
                    } else {
                        bArr2[i16] = longToByteArray[i15 - matchingBeaconTypeCodeStartOffset];
                        bArr3[i16] = -1;
                    }
                }
            }
            scanFilterData2.manufacturer = i13;
            scanFilterData2.filter = bArr2;
            scanFilterData2.mask = bArr3;
            scanFilterData2.serviceUuid = serviceUuid;
            scanFilterData2.serviceUuid128Bit = beaconParser.getServiceUuid128Bit();
            arrayList.add(scanFilterData2);
        }
        return arrayList;
    }

    public List<ScanFilter> createScanFiltersForBeaconParsers(List<BeaconParser> list) {
        return createScanFiltersForBeaconParsers(list, (List<Region>) null);
    }

    public List<ScanFilter> createWildcardScanFilters() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ScanFilter.Builder().build());
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x014b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.bluetooth.le.ScanFilter> createScanFiltersForBeaconParsers(java.util.List<org.altbeacon.beacon.BeaconParser> r17, java.util.List<org.altbeacon.beacon.Region> r18) {
        /*
            r16 = this;
            r0 = r18
            r1 = 1
            r2 = 0
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            if (r0 != 0) goto L_0x0010
            r3.add(r4)
            goto L_0x0013
        L_0x0010:
            r3.addAll(r0)
        L_0x0013:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x001c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0157
            java.lang.Object r5 = r3.next()
            org.altbeacon.beacon.Region r5 = (org.altbeacon.beacon.Region) r5
            java.util.Iterator r6 = r17.iterator()
        L_0x002c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0153
            java.lang.Object r7 = r6.next()
            org.altbeacon.beacon.BeaconParser r7 = (org.altbeacon.beacon.BeaconParser) r7
            if (r5 != 0) goto L_0x003e
            r9 = r16
            r8 = r4
            goto L_0x0044
        L_0x003e:
            java.util.List r8 = r5.getIdentifiers()
            r9 = r16
        L_0x0044:
            java.util.List r7 = r9.createScanFilterDataForBeaconParser(r7, r8)
            java.util.Iterator r7 = r7.iterator()
        L_0x004c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x002c
            java.lang.Object r8 = r7.next()
            org.altbeacon.beacon.service.scanner.ScanFilterUtils$ScanFilterData r8 = (org.altbeacon.beacon.service.scanner.ScanFilterUtils.ScanFilterData) r8
            android.bluetooth.le.ScanFilter$Builder r10 = new android.bluetooth.le.ScanFilter$Builder
            r10.<init>()
            java.lang.Long r11 = r8.serviceUuid
            java.lang.String r12 = "making scan filter with service mask: FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF "
            java.lang.String r13 = "making scan filter for service: "
            java.lang.String r14 = "FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF"
            java.lang.String r15 = " "
            java.lang.String r4 = "ScanFilterUtils"
            if (r11 == 0) goto L_0x00b3
            java.lang.String r8 = "0000%04X-0000-1000-8000-00805f9b34fb"
            r18 = r3
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r2] = r11
            java.lang.String r3 = java.lang.String.format(r8, r3)
            android.os.ParcelUuid r8 = android.os.ParcelUuid.fromString(r3)
            android.os.ParcelUuid r11 = android.os.ParcelUuid.fromString(r14)
            boolean r14 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r14 == 0) goto L_0x00ad
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            r14.append(r3)
            r14.append(r15)
            r14.append(r8)
            java.lang.String r3 = r14.toString()
            java.lang.Object[] r13 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r4, r3, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r12)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r12 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r4, r3, r12)
        L_0x00ad:
            r10.setServiceUuid(r8, r11)
        L_0x00b0:
            r3 = 0
            goto L_0x012e
        L_0x00b3:
            r18 = r3
            byte[] r3 = r8.serviceUuid128Bit
            int r11 = r3.length
            if (r11 == 0) goto L_0x00fe
            r8 = 16
            org.altbeacon.beacon.Identifier r3 = org.altbeacon.beacon.Identifier.fromBytes(r3, r2, r8, r1)
            java.lang.String r3 = r3.toString()
            android.os.ParcelUuid r8 = android.os.ParcelUuid.fromString(r3)
            android.os.ParcelUuid r11 = android.os.ParcelUuid.fromString(r14)
            boolean r14 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r14 == 0) goto L_0x00fa
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            r14.append(r3)
            r14.append(r15)
            r14.append(r8)
            java.lang.String r3 = r14.toString()
            java.lang.Object[] r13 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r4, r3, r13)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r12)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r12 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r4, r3, r12)
        L_0x00fa:
            r10.setServiceUuid(r8, r11)
            goto L_0x00b0
        L_0x00fe:
            r3 = 0
            r10.setServiceUuid(r3)
            int r11 = r8.manufacturer
            byte[] r12 = r8.filter
            byte[] r13 = r8.mask
            r10.setManufacturerData(r11, r12, r13)
            boolean r11 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r11 == 0) goto L_0x012e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "making scan filter for manufacturer: "
            r11.<init>(r12)
            int r12 = r8.manufacturer
            r11.append(r12)
            r11.append(r15)
            byte[] r8 = r8.filter
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object[] r11 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r4, r8, r11)
        L_0x012e:
            android.bluetooth.le.ScanFilter r8 = r10.build()
            boolean r10 = org.altbeacon.beacon.logging.LogManager.isVerboseLoggingEnabled()
            if (r10 == 0) goto L_0x014b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Set up a scan filter: "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            java.lang.Object[] r11 = new java.lang.Object[r2]
            org.altbeacon.beacon.logging.LogManager.d(r4, r10, r11)
        L_0x014b:
            r0.add(r8)
            r4 = r3
            r3 = r18
            goto L_0x004c
        L_0x0153:
            r9 = r16
            goto L_0x001c
        L_0x0157:
            r9 = r16
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.altbeacon.beacon.service.scanner.ScanFilterUtils.createScanFiltersForBeaconParsers(java.util.List, java.util.List):java.util.List");
    }
}
