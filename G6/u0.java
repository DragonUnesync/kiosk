package g6;

import java.security.SecureRandom;

public final class u0 extends Thread {
    public u0(String str) {
        super(str);
    }

    public void run() {
        byte[] generateSeed = new SecureRandom().generateSeed(8);
        long unused = w0.seedGeneratorEndTime = System.nanoTime();
        w0.seedQueue.add(Long.valueOf(((((long) generateSeed[0]) & 255) << 56) | ((((long) generateSeed[1]) & 255) << 48) | ((((long) generateSeed[2]) & 255) << 40) | ((((long) generateSeed[3]) & 255) << 32) | ((((long) generateSeed[4]) & 255) << 24) | ((((long) generateSeed[5]) & 255) << 16) | ((((long) generateSeed[6]) & 255) << 8) | (((long) generateSeed[7]) & 255)));
    }
}
