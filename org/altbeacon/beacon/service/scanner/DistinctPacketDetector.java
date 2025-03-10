package org.altbeacon.beacon.service.scanner;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

public class DistinctPacketDetector {
    private static final int MAX_PACKETS_TO_TRACK = 1000;
    private final Set<ByteBuffer> mDistinctPacketsDetected = new HashSet();

    public void clearDetections() {
        this.mDistinctPacketsDetected.clear();
    }

    public boolean isPacketDistinct(String str, byte[] bArr) {
        byte[] bytes = str.getBytes();
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + bArr.length);
        allocate.put(bytes);
        allocate.put(bArr);
        allocate.rewind();
        if (this.mDistinctPacketsDetected.size() == MAX_PACKETS_TO_TRACK) {
            return this.mDistinctPacketsDetected.contains(allocate);
        }
        return this.mDistinctPacketsDetected.add(allocate);
    }
}
