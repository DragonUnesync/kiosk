package de.ozerov.fully;

import Q0.g;
import android.util.Base64;
import android.util.Log;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import n2.a;

/* renamed from: de.ozerov.fully.o  reason: case insensitive filesystem */
public abstract class C0746o {

    /* renamed from: a  reason: collision with root package name */
    public static final List f10854a = Arrays.asList(new Integer[]{128, 192, 256});

    /* renamed from: b  reason: collision with root package name */
    public static final double f10855b = Math.pow(2.0d, 16.0d);

    /* renamed from: c  reason: collision with root package name */
    public static int f10856c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static SecureRandom f10857d;

    public static String a(String str) {
        try {
            return new String(b(Base64.decode(str, 2), e()), StandardCharsets.UTF_8);
        } catch (Exception e) {
            g.x(e, new StringBuilder("Decryption failed due to "), "o");
            return null;
        }
    }

    public static byte[] b(byte[] bArr, SecretKeySpec secretKeySpec) {
        Objects.requireNonNull(bArr, "Input message cannot be null");
        if (bArr.length != 0) {
            byte[] bArr2 = new byte[12];
            System.arraycopy(bArr, 0, bArr2, 0, 12);
            byte[] bArr3 = new byte[(bArr.length - 12)];
            System.arraycopy(bArr, 12, bArr3, 0, bArr.length - 12);
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr2);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, secretKeySpec, gCMParameterSpec);
            return instance.doFinal(bArr3);
        }
        throw new IllegalArgumentException("Input array cannot be empty");
    }

    public static String c(String str) {
        try {
            return Base64.encodeToString(d(str.getBytes(StandardCharsets.UTF_8), e()), 2);
        } catch (Exception e) {
            Log.e("o", "Encryption failed due to " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] d(byte[] bArr, SecretKeySpec secretKeySpec) {
        SecureRandom secureRandom;
        Objects.requireNonNull(bArr, "Input message cannot be null");
        if (bArr.length != 0) {
            if (f10854a.contains(Integer.valueOf(secretKeySpec.getEncoded().length * 8))) {
                Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
                byte[] bArr2 = new byte[12];
                if (f10857d == null) {
                    if (a.B0()) {
                        secureRandom = SecureRandom.getInstanceStrong();
                    } else {
                        secureRandom = new SecureRandom();
                    }
                    f10857d = secureRandom;
                }
                int i = f10856c;
                if (((double) i) > f10855b || i == 0) {
                    SecureRandom secureRandom2 = f10857d;
                    secureRandom2.setSeed(secureRandom2.generateSeed(12));
                    f10856c = 0;
                }
                f10857d.nextBytes(bArr2);
                f10856c += 12;
                instance.init(1, secretKeySpec, new GCMParameterSpec(128, bArr2));
                byte[] doFinal = instance.doFinal(bArr);
                byte[] bArr3 = new byte[(doFinal.length + 12)];
                System.arraycopy(bArr2, 0, bArr3, 0, 12);
                System.arraycopy(doFinal, 0, bArr3, 12, doFinal.length);
                return bArr3;
            }
            throw new IllegalArgumentException("Size of key must be 128, 192 or 256");
        }
        throw new IllegalArgumentException("Length of message cannot be 0");
    }

    public static SecretKeySpec e() {
        return new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec("aMdvpp1e1i3#iuNn?A?G&_6%ou+O%9AD".toCharArray(), Base64.decode("JswIMb4Ois7Aaq3ScUlZd/jKPAzZ4BJayd3HQeUMCJg=", 2), 1, 128)).getEncoded(), "AES");
    }
}
