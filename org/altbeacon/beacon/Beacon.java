package org.altbeacon.beacon;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.client.BeaconDataFactory;
import org.altbeacon.beacon.client.NullBeaconDataFactory;
import org.altbeacon.beacon.distance.DistanceCalculator;
import org.altbeacon.beacon.logging.LogManager;

public class Beacon implements Parcelable, Serializable {
    @Deprecated
    public static final Parcelable.Creator<Beacon> CREATOR = new Parcelable.Creator<Beacon>() {
        public Beacon createFromParcel(Parcel parcel) {
            return new Beacon(parcel);
        }

        public Beacon[] newArray(int i) {
            return new Beacon[i];
        }
    };
    private static final String TAG = "Beacon";
    private static final List<Identifier> UNMODIFIABLE_LIST_OF_IDENTIFIER = DesugarCollections.unmodifiableList(new ArrayList());
    private static final List<Long> UNMODIFIABLE_LIST_OF_LONG = DesugarCollections.unmodifiableList(new ArrayList());
    protected static BeaconDataFactory beaconDataFactory = new NullBeaconDataFactory();
    protected static DistanceCalculator sDistanceCalculator = null;
    protected static boolean sHardwareEqualityEnforced = false;
    protected int mBeaconTypeCode;
    protected String mBluetoothAddress;
    protected String mBluetoothName;
    protected List<Long> mDataFields;
    protected Double mDistance;
    protected List<Long> mExtraDataFields;
    protected long mFirstCycleDetectionTimestamp;
    protected List<Identifier> mIdentifiers;
    protected long mLastCycleDetectionTimestamp;
    protected byte[] mLastPacketRawBytes;
    protected int mManufacturer;
    protected boolean mMultiFrameBeacon;
    private int mPacketCount;
    protected String mParserIdentifier;
    protected int mRssi;
    private int mRssiMeasurementCount;
    /* access modifiers changed from: private */
    public Double mRunningAverageRssi;
    protected int mServiceUuid;
    protected byte[] mServiceUuid128Bit;
    protected int mTxPower;

    public static class Builder {
        protected final Beacon mBeacon = new Beacon();
        private Identifier mId1;
        private Identifier mId2;
        private Identifier mId3;

        public Beacon build() {
            Identifier identifier = this.mId1;
            if (identifier != null) {
                this.mBeacon.mIdentifiers.add(identifier);
                Identifier identifier2 = this.mId2;
                if (identifier2 != null) {
                    this.mBeacon.mIdentifiers.add(identifier2);
                    Identifier identifier3 = this.mId3;
                    if (identifier3 != null) {
                        this.mBeacon.mIdentifiers.add(identifier3);
                    }
                }
            }
            return this.mBeacon;
        }

        public Builder copyBeaconFields(Beacon beacon) {
            setIdentifiers(beacon.getIdentifiers());
            setBeaconTypeCode(beacon.getBeaconTypeCode());
            setDataFields(beacon.getDataFields());
            setBluetoothAddress(beacon.getBluetoothAddress());
            setBluetoothName(beacon.getBluetoothName());
            setExtraDataFields(beacon.getExtraDataFields());
            setManufacturer(beacon.getManufacturer());
            setTxPower(beacon.getTxPower());
            setRssi(beacon.getRssi());
            setServiceUuid(beacon.getServiceUuid());
            setMultiFrameBeacon(beacon.isMultiFrameBeacon());
            setLastPacketRawBytes(beacon.getLastPacketRawBytes());
            return this;
        }

        public Builder setBeaconTypeCode(int i) {
            this.mBeacon.mBeaconTypeCode = i;
            return this;
        }

        public Builder setBluetoothAddress(String str) {
            this.mBeacon.mBluetoothAddress = str;
            return this;
        }

        public Builder setBluetoothName(String str) {
            this.mBeacon.mBluetoothName = str;
            return this;
        }

        public Builder setDataFields(List<Long> list) {
            this.mBeacon.mDataFields = list;
            return this;
        }

        public Builder setExtraDataFields(List<Long> list) {
            this.mBeacon.mExtraDataFields = list;
            return this;
        }

        public Builder setId1(String str) {
            this.mId1 = Identifier.parse(str);
            return this;
        }

        public Builder setId2(String str) {
            this.mId2 = Identifier.parse(str);
            return this;
        }

        public Builder setId3(String str) {
            this.mId3 = Identifier.parse(str);
            return this;
        }

        public Builder setIdentifiers(List<Identifier> list) {
            this.mId1 = null;
            this.mId2 = null;
            this.mId3 = null;
            this.mBeacon.mIdentifiers = list;
            return this;
        }

        public Builder setLastPacketRawBytes(byte[] bArr) {
            this.mBeacon.mLastPacketRawBytes = bArr;
            return this;
        }

        public Builder setManufacturer(int i) {
            this.mBeacon.mManufacturer = i;
            return this;
        }

        public Builder setMultiFrameBeacon(boolean z) {
            this.mBeacon.mMultiFrameBeacon = z;
            return this;
        }

        public Builder setParserIdentifier(String str) {
            this.mBeacon.mParserIdentifier = str;
            return this;
        }

        public Builder setRssi(int i) {
            this.mBeacon.mRssi = i;
            return this;
        }

        public Builder setRunningAverageRssi(double d8) {
            this.mBeacon.mRunningAverageRssi = Double.valueOf(d8);
            return this;
        }

        public Builder setServiceUuid(int i) {
            this.mBeacon.mServiceUuid = i;
            return this;
        }

        public Builder setServiceUuid128Bit(byte[] bArr) {
            this.mBeacon.mServiceUuid128Bit = bArr;
            return this;
        }

        public Builder setTxPower(int i) {
            this.mBeacon.mTxPower = i;
            return this;
        }
    }

    @Deprecated
    public Beacon(Parcel parcel) {
        int i = 0;
        this.mRssiMeasurementCount = 0;
        this.mPacketCount = 0;
        this.mRunningAverageRssi = null;
        this.mServiceUuid = -1;
        this.mServiceUuid128Bit = new byte[0];
        this.mMultiFrameBeacon = false;
        this.mFirstCycleDetectionTimestamp = 0;
        this.mLastCycleDetectionTimestamp = 0;
        this.mLastPacketRawBytes = new byte[0];
        int readInt = parcel.readInt();
        this.mIdentifiers = new ArrayList(readInt);
        for (int i8 = 0; i8 < readInt; i8++) {
            this.mIdentifiers.add(Identifier.parse(parcel.readString()));
        }
        this.mDistance = Double.valueOf(parcel.readDouble());
        this.mRssi = parcel.readInt();
        this.mTxPower = parcel.readInt();
        this.mBluetoothAddress = parcel.readString();
        this.mBeaconTypeCode = parcel.readInt();
        this.mServiceUuid = parcel.readInt();
        if (parcel.readBoolean()) {
            this.mServiceUuid128Bit = new byte[16];
            for (int i9 = 0; i9 < 16; i9++) {
                this.mServiceUuid128Bit[i9] = parcel.readByte();
            }
        }
        int readInt2 = parcel.readInt();
        this.mDataFields = new ArrayList(readInt2);
        for (int i10 = 0; i10 < readInt2; i10++) {
            this.mDataFields.add(Long.valueOf(parcel.readLong()));
        }
        int readInt3 = parcel.readInt();
        this.mExtraDataFields = new ArrayList(readInt3);
        for (int i11 = 0; i11 < readInt3; i11++) {
            this.mExtraDataFields.add(Long.valueOf(parcel.readLong()));
        }
        this.mManufacturer = parcel.readInt();
        this.mBluetoothName = parcel.readString();
        this.mParserIdentifier = parcel.readString();
        this.mMultiFrameBeacon = parcel.readByte() != 0;
        this.mRunningAverageRssi = (Double) parcel.readValue((ClassLoader) null);
        this.mRssiMeasurementCount = parcel.readInt();
        this.mPacketCount = parcel.readInt();
        this.mFirstCycleDetectionTimestamp = parcel.readLong();
        this.mLastCycleDetectionTimestamp = parcel.readLong();
        BeaconManager.setDebug(true);
        byte[] bArr = new byte[62];
        try {
            parcel.readByteArray(bArr);
        } catch (RuntimeException unused) {
            while (i < 62) {
                try {
                    byte readByte = parcel.readByte();
                    bArr[readByte] = readByte;
                    i++;
                } catch (RuntimeException unused2) {
                }
            }
        }
        this.mLastPacketRawBytes = bArr;
    }

    public static Double calculateDistance(int i, double d8) {
        if (getDistanceCalculator() != null) {
            return Double.valueOf(getDistanceCalculator().calculateDistance(i, d8));
        }
        LogManager.e(TAG, "Distance calculator not set.  Distance will bet set to -1", new Object[0]);
        return Double.valueOf(-1.0d);
    }

    public static DistanceCalculator getDistanceCalculator() {
        return sDistanceCalculator;
    }

    public static boolean getHardwareEqualityEnforced() {
        return sHardwareEqualityEnforced;
    }

    public static void setDistanceCalculator(DistanceCalculator distanceCalculator) {
        sDistanceCalculator = distanceCalculator;
    }

    public static void setHardwareEqualityEnforced(boolean z) {
        sHardwareEqualityEnforced = z;
    }

    private StringBuilder toStringBuilder() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Identifier next : this.mIdentifiers) {
            if (i > 1) {
                sb.append(" ");
            }
            sb.append("id");
            sb.append(i);
            sb.append(": ");
            if (next == null) {
                str = "null";
            } else {
                str = next.toString();
            }
            sb.append(str);
            i++;
        }
        if (this.mParserIdentifier != null) {
            sb.append(" type " + this.mParserIdentifier);
        }
        return sb;
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Beacon)) {
            return false;
        }
        Beacon beacon = (Beacon) obj;
        if (!this.mIdentifiers.equals(beacon.mIdentifiers)) {
            return false;
        }
        if (sHardwareEqualityEnforced) {
            return getBluetoothAddress().equals(beacon.getBluetoothAddress());
        }
        return true;
    }

    public int getBeaconTypeCode() {
        return this.mBeaconTypeCode;
    }

    public String getBluetoothAddress() {
        return this.mBluetoothAddress;
    }

    public String getBluetoothName() {
        return this.mBluetoothName;
    }

    public List<Long> getDataFields() {
        if (this.mDataFields.getClass().isInstance(UNMODIFIABLE_LIST_OF_LONG)) {
            return this.mDataFields;
        }
        return DesugarCollections.unmodifiableList(this.mDataFields);
    }

    public double getDistance() {
        if (this.mDistance == null) {
            double d8 = (double) this.mRssi;
            Double d9 = this.mRunningAverageRssi;
            if (d9 != null) {
                d8 = d9.doubleValue();
            } else {
                LogManager.d(TAG, "Not using running average RSSI because it is null", new Object[0]);
            }
            this.mDistance = calculateDistance(this.mTxPower, d8);
        }
        return this.mDistance.doubleValue();
    }

    public List<Long> getExtraDataFields() {
        if (this.mExtraDataFields.getClass().isInstance(UNMODIFIABLE_LIST_OF_LONG)) {
            return this.mExtraDataFields;
        }
        return DesugarCollections.unmodifiableList(this.mExtraDataFields);
    }

    public long getFirstCycleDetectionTimestamp() {
        return this.mFirstCycleDetectionTimestamp;
    }

    public Identifier getId1() {
        return this.mIdentifiers.get(0);
    }

    public Identifier getId2() {
        return this.mIdentifiers.get(1);
    }

    public Identifier getId3() {
        return this.mIdentifiers.get(2);
    }

    public Identifier getIdentifier(int i) {
        return this.mIdentifiers.get(i);
    }

    public List<Identifier> getIdentifiers() {
        if (this.mIdentifiers.getClass().isInstance(UNMODIFIABLE_LIST_OF_IDENTIFIER)) {
            return this.mIdentifiers;
        }
        return DesugarCollections.unmodifiableList(this.mIdentifiers);
    }

    public long getLastCycleDetectionTimestamp() {
        return this.mLastCycleDetectionTimestamp;
    }

    public byte[] getLastPacketRawBytes() {
        return this.mLastPacketRawBytes;
    }

    public int getManufacturer() {
        return this.mManufacturer;
    }

    public int getMeasurementCount() {
        return this.mRssiMeasurementCount;
    }

    public int getPacketCount() {
        return this.mPacketCount;
    }

    public String getParserIdentifier() {
        return this.mParserIdentifier;
    }

    public int getRssi() {
        return this.mRssi;
    }

    @Deprecated
    public double getRunningAverageRssi(double d8) {
        this.mRunningAverageRssi = Double.valueOf(d8);
        return d8;
    }

    public int getServiceUuid() {
        return this.mServiceUuid;
    }

    public byte[] getServiceUuid128Bit() {
        return this.mServiceUuid128Bit;
    }

    public int getTxPower() {
        return this.mTxPower;
    }

    public int hashCode() {
        StringBuilder stringBuilder = toStringBuilder();
        if (sHardwareEqualityEnforced) {
            stringBuilder.append(this.mBluetoothAddress);
        }
        return stringBuilder.toString().hashCode();
    }

    public boolean isExtraBeaconData() {
        if (this.mIdentifiers.size() != 0 || this.mDataFields.size() == 0) {
            return false;
        }
        return true;
    }

    public boolean isMultiFrameBeacon() {
        return this.mMultiFrameBeacon;
    }

    public void requestData(BeaconDataNotifier beaconDataNotifier) {
        beaconDataFactory.requestBeaconData(this, beaconDataNotifier);
    }

    public void setExtraDataFields(List<Long> list) {
        this.mExtraDataFields = list;
    }

    public void setFirstCycleDetectionTimestamp(long j7) {
        this.mFirstCycleDetectionTimestamp = j7;
    }

    public void setLastCycleDetectionTimestamp(long j7) {
        this.mLastCycleDetectionTimestamp = j7;
    }

    public void setLastPacketRawBytes(byte[] bArr) {
        this.mLastPacketRawBytes = bArr;
    }

    public void setPacketCount(int i) {
        this.mPacketCount = i;
    }

    public void setRssi(int i) {
        this.mRssi = i;
    }

    public void setRssiMeasurementCount(int i) {
        this.mRssiMeasurementCount = i;
    }

    public void setRunningAverageRssi(double d8) {
        this.mRunningAverageRssi = Double.valueOf(d8);
        this.mDistance = null;
    }

    public String toString() {
        return toStringBuilder().toString();
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        boolean z;
        String str;
        parcel.writeInt(this.mIdentifiers.size());
        for (Identifier next : this.mIdentifiers) {
            if (next == null) {
                str = null;
            } else {
                str = next.toString();
            }
            parcel.writeString(str);
        }
        parcel.writeDouble(getDistance());
        parcel.writeInt(this.mRssi);
        parcel.writeInt(this.mTxPower);
        parcel.writeString(this.mBluetoothAddress);
        parcel.writeInt(this.mBeaconTypeCode);
        parcel.writeInt(this.mServiceUuid);
        if (this.mServiceUuid128Bit.length != 0) {
            z = true;
        } else {
            z = false;
        }
        parcel.writeBoolean(z);
        if (this.mServiceUuid128Bit.length != 0) {
            for (int i8 = 0; i8 < 16; i8++) {
                parcel.writeByte(this.mServiceUuid128Bit[i8]);
            }
        }
        parcel.writeInt(this.mDataFields.size());
        for (Long longValue : this.mDataFields) {
            parcel.writeLong(longValue.longValue());
        }
        parcel.writeInt(this.mExtraDataFields.size());
        for (Long longValue2 : this.mExtraDataFields) {
            parcel.writeLong(longValue2.longValue());
        }
        parcel.writeInt(this.mManufacturer);
        parcel.writeString(this.mBluetoothName);
        parcel.writeString(this.mParserIdentifier);
        parcel.writeByte(this.mMultiFrameBeacon ? (byte) 1 : 0);
        parcel.writeValue(this.mRunningAverageRssi);
        parcel.writeInt(this.mRssiMeasurementCount);
        parcel.writeInt(this.mPacketCount);
        parcel.writeLong(this.mFirstCycleDetectionTimestamp);
        parcel.writeLong(this.mLastCycleDetectionTimestamp);
        byte[] bArr = this.mLastPacketRawBytes;
        int length = bArr.length;
        if (length > 62) {
            length = 62;
        }
        parcel.writeByteArray(bArr, 0, length);
        while (length < 62) {
            parcel.writeByte((byte) 0);
            length++;
        }
    }

    public double getRunningAverageRssi() {
        Double d8 = this.mRunningAverageRssi;
        if (d8 != null) {
            return d8.doubleValue();
        }
        return (double) this.mRssi;
    }

    public Beacon(Beacon beacon) {
        this.mRssiMeasurementCount = 0;
        this.mPacketCount = 0;
        this.mRunningAverageRssi = null;
        this.mServiceUuid = -1;
        this.mServiceUuid128Bit = new byte[0];
        this.mMultiFrameBeacon = false;
        this.mFirstCycleDetectionTimestamp = 0;
        this.mLastCycleDetectionTimestamp = 0;
        this.mLastPacketRawBytes = new byte[0];
        this.mIdentifiers = new ArrayList(beacon.mIdentifiers);
        this.mDataFields = new ArrayList(beacon.mDataFields);
        this.mExtraDataFields = new ArrayList(beacon.mExtraDataFields);
        this.mDistance = beacon.mDistance;
        this.mRunningAverageRssi = beacon.mRunningAverageRssi;
        this.mPacketCount = beacon.mPacketCount;
        this.mRssiMeasurementCount = beacon.mRssiMeasurementCount;
        this.mRssi = beacon.mRssi;
        this.mTxPower = beacon.mTxPower;
        this.mBluetoothAddress = beacon.mBluetoothAddress;
        this.mBeaconTypeCode = beacon.getBeaconTypeCode();
        this.mServiceUuid = beacon.getServiceUuid();
        this.mServiceUuid128Bit = beacon.getServiceUuid128Bit();
        this.mBluetoothName = beacon.mBluetoothName;
        this.mParserIdentifier = beacon.mParserIdentifier;
        this.mMultiFrameBeacon = beacon.mMultiFrameBeacon;
        this.mManufacturer = beacon.mManufacturer;
        this.mFirstCycleDetectionTimestamp = beacon.mFirstCycleDetectionTimestamp;
        this.mLastCycleDetectionTimestamp = beacon.mLastCycleDetectionTimestamp;
        this.mLastPacketRawBytes = beacon.mLastPacketRawBytes;
    }

    public Beacon() {
        this.mRssiMeasurementCount = 0;
        this.mPacketCount = 0;
        this.mRunningAverageRssi = null;
        this.mServiceUuid = -1;
        this.mServiceUuid128Bit = new byte[0];
        this.mMultiFrameBeacon = false;
        this.mFirstCycleDetectionTimestamp = 0;
        this.mLastCycleDetectionTimestamp = 0;
        this.mLastPacketRawBytes = new byte[0];
        this.mIdentifiers = new ArrayList(1);
        this.mDataFields = new ArrayList(1);
        this.mExtraDataFields = new ArrayList(1);
    }
}
