package org.altbeacon.bluetooth;

import java.util.ArrayList;
import java.util.List;

public class BleAdvertisement {
    private static final String TAG = "BleAdvertisement";
    private byte[] mBytes;
    private List<Pdu> mPdus;

    public BleAdvertisement(byte[] bArr) {
        int i;
        this.mBytes = bArr;
        ArrayList arrayList = new ArrayList();
        if (bArr.length < 31) {
            i = bArr.length;
        } else {
            i = 31;
        }
        parsePdus(0, i, arrayList);
        if (bArr.length > 31) {
            parsePdus(31, bArr.length, arrayList);
        }
        this.mPdus = arrayList;
    }

    private void parsePdus(int i, int i8, ArrayList<Pdu> arrayList) {
        do {
            Pdu parse = Pdu.parse(this.mBytes, i);
            if (parse != null) {
                arrayList.add(parse);
                i = parse.getDeclaredLength() + i + 1;
            }
            if (parse == null) {
                return;
            }
        } while (i < i8);
    }

    public List<Pdu> getPdus() {
        return this.mPdus;
    }
}
