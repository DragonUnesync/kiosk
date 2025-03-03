package a6;

import Q0.g;
import S5.C0185n;
import S5.D0;
import Z5.C0388f;
import Z5.C0405x;
import Z5.C0406y;
import Z5.G;
import Z5.K;
import Z5.L;
import Z5.T;
import Z5.m0;
import Z5.r0;
import e6.C0847f;
import g6.Y;
import java.net.URI;
import java.nio.ByteBuffer;

public final class w extends C0427A {
    private C0185n expectedChallengeResponseBytes;

    public w(URI uri, O o2, String str, L l8, int i, long j7) {
        this(uri, o2, str, l8, i, j7, false);
    }

    private static String insertRandomCharacters(String str) {
        int randomNumber = N.randomNumber(1, 12);
        char[] cArr = new char[randomNumber];
        int i = 0;
        while (i < randomNumber) {
            int nextInt = Y.threadLocalRandom().nextInt(126) + 33;
            if ((33 < nextInt && nextInt < 47) || (58 < nextInt && nextInt < 126)) {
                cArr[i] = (char) nextInt;
                i++;
            }
        }
        for (int i8 = 0; i8 < randomNumber; i8++) {
            int randomNumber2 = N.randomNumber(0, str.length());
            String substring = str.substring(0, randomNumber2);
            String substring2 = str.substring(randomNumber2);
            StringBuilder r8 = g.r(substring);
            r8.append(cArr[i8]);
            r8.append(substring2);
            str = r8.toString();
        }
        return str;
    }

    private static String insertSpaces(String str, int i) {
        for (int i8 = 0; i8 < i; i8++) {
            int randomNumber = N.randomNumber(1, str.length() - 1);
            str = str.substring(0, randomNumber) + ' ' + str.substring(randomNumber);
        }
        return str;
    }

    public C0405x newHandshakeRequest() {
        int randomNumber = N.randomNumber(1, 12);
        int randomNumber2 = N.randomNumber(1, 12);
        int randomNumber3 = N.randomNumber(0, Integer.MAX_VALUE / randomNumber);
        int randomNumber4 = N.randomNumber(0, Integer.MAX_VALUE / randomNumber2);
        String num = Integer.toString(randomNumber3 * randomNumber);
        String num2 = Integer.toString(randomNumber4 * randomNumber2);
        String insertRandomCharacters = insertRandomCharacters(num);
        String insertRandomCharacters2 = insertRandomCharacters(num2);
        String insertSpaces = insertSpaces(insertRandomCharacters, randomNumber);
        String insertSpaces2 = insertSpaces(insertRandomCharacters2, randomNumber2);
        byte[] randomBytes = N.randomBytes(8);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(randomNumber3);
        byte[] array = allocate.array();
        ByteBuffer allocate2 = ByteBuffer.allocate(4);
        allocate2.putInt(randomNumber4);
        byte[] array2 = allocate2.array();
        byte[] bArr = new byte[16];
        System.arraycopy(array, 0, bArr, 0, 4);
        System.arraycopy(array2, 0, bArr, 4, 4);
        System.arraycopy(randomBytes, 0, bArr, 8, 8);
        this.expectedChallengeResponseBytes = D0.wrappedBuffer(N.md5(bArr));
        URI uri = uri();
        C0388f fVar = new C0388f(r0.HTTP_1_1, T.GET, upgradeUrl(uri), D0.wrappedBuffer(randomBytes));
        L headers = fVar.headers();
        L l8 = this.customHeaders;
        if (l8 != null) {
            headers.add(l8);
            C0847f fVar2 = G.HOST;
            if (!headers.contains((CharSequence) fVar2)) {
                headers.set((CharSequence) fVar2, (Object) C0427A.websocketHostValue(uri));
            }
        } else {
            headers.set((CharSequence) G.HOST, (Object) C0427A.websocketHostValue(uri));
        }
        headers.set((CharSequence) G.UPGRADE, (Object) K.WEBSOCKET).set((CharSequence) G.CONNECTION, (Object) K.UPGRADE).set((CharSequence) G.SEC_WEBSOCKET_KEY1, (Object) insertSpaces).set((CharSequence) G.SEC_WEBSOCKET_KEY2, (Object) insertSpaces2);
        if (this.generateOriginHeader) {
            C0847f fVar3 = G.ORIGIN;
            if (!headers.contains((CharSequence) fVar3)) {
                headers.set((CharSequence) fVar3, (Object) C0427A.websocketOriginValue(uri));
            }
        }
        String expectedSubprotocol = expectedSubprotocol();
        if (expectedSubprotocol != null && !expectedSubprotocol.isEmpty()) {
            headers.set((CharSequence) G.SEC_WEBSOCKET_PROTOCOL, (Object) expectedSubprotocol);
        }
        headers.set((CharSequence) G.CONTENT_LENGTH, (Object) Integer.valueOf(randomBytes.length));
        return fVar;
    }

    public I newWebSocketEncoder() {
        return new C0442j();
    }

    public H newWebsocketDecoder() {
        return new C0441i(maxFramePayloadLength());
    }

    public void verify(C0406y yVar) {
        m0 status = yVar.status();
        if (m0.SWITCHING_PROTOCOLS.equals(status)) {
            L headers = yVar.headers();
            String str = headers.get((CharSequence) G.UPGRADE);
            if (K.WEBSOCKET.contentEqualsIgnoreCase(str)) {
                C0847f fVar = G.CONNECTION;
                if (!headers.containsValue(fVar, K.UPGRADE, true)) {
                    throw new s("Invalid handshake response connection: " + headers.get((CharSequence) fVar), yVar);
                } else if (!yVar.content().equals(this.expectedChallengeResponseBytes)) {
                    throw new s("Invalid challenge", yVar);
                }
            } else {
                throw new s("Invalid handshake response upgrade: " + str, yVar);
            }
        } else {
            throw new s("Invalid handshake response getStatus: " + status, yVar);
        }
    }

    public w(URI uri, O o2, String str, L l8, int i, long j7, boolean z) {
        this(uri, o2, str, l8, i, j7, z, true);
    }

    public w(URI uri, O o2, String str, L l8, int i, long j7, boolean z, boolean z6) {
        super(uri, o2, str, l8, i, j7, z, z6);
    }
}
