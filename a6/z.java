package a6;

import N.e;
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
import e6.C0852k;
import h6.C1082c;
import h6.d;
import java.net.URI;

public final class z extends C0427A {
    private static final C1082c logger = d.getInstance((Class<?>) z.class);
    private final boolean allowExtensions;
    private final boolean allowMaskMismatch;
    private String expectedChallengeResponseString;
    private final boolean performMasking;

    public z(URI uri, O o2, String str, boolean z, L l8, int i, boolean z6, boolean z8, long j7) {
        this(uri, o2, str, z, l8, i, z6, z8, j7, false);
    }

    public C0405x newHandshakeRequest() {
        URI uri = uri();
        String base64 = N.base64(N.randomBytes(16));
        this.expectedChallengeResponseString = N.base64(N.sha1(e.x(base64, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes(C0852k.US_ASCII)));
        C1082c cVar = logger;
        if (cVar.isDebugEnabled()) {
            cVar.debug("WebSocket version 13 client handshake key: {}, expected response: {}", base64, this.expectedChallengeResponseString);
        }
        C0388f fVar = new C0388f(r0.HTTP_1_1, T.GET, upgradeUrl(uri), D0.EMPTY_BUFFER);
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
        headers.set((CharSequence) G.UPGRADE, (Object) K.WEBSOCKET).set((CharSequence) G.CONNECTION, (Object) K.UPGRADE).set((CharSequence) G.SEC_WEBSOCKET_KEY, (Object) base64);
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
        headers.set((CharSequence) G.SEC_WEBSOCKET_VERSION, (Object) version().toAsciiString());
        return fVar;
    }

    public I newWebSocketEncoder() {
        return new r(this.performMasking);
    }

    public H newWebsocketDecoder() {
        return new q(false, this.allowExtensions, maxFramePayloadLength(), this.allowMaskMismatch);
    }

    public void verify(C0406y yVar) {
        m0 status = yVar.status();
        if (m0.SWITCHING_PROTOCOLS.equals(status)) {
            L headers = yVar.headers();
            String str = headers.get((CharSequence) G.UPGRADE);
            if (K.WEBSOCKET.contentEqualsIgnoreCase(str)) {
                C0847f fVar = G.CONNECTION;
                if (headers.containsValue(fVar, K.UPGRADE, true)) {
                    String str2 = headers.get((CharSequence) G.SEC_WEBSOCKET_ACCEPT);
                    if (str2 == null || !str2.equals(this.expectedChallengeResponseString)) {
                        String str3 = this.expectedChallengeResponseString;
                        throw new s("Invalid challenge. Actual: " + str2 + ". Expected: " + str3, yVar);
                    }
                    return;
                }
                throw new s("Invalid handshake response connection: " + headers.get((CharSequence) fVar), yVar);
            }
            throw new s("Invalid handshake response upgrade: " + str, yVar);
        }
        throw new s("Invalid handshake response getStatus: " + status, yVar);
    }

    public z(URI uri, O o2, String str, boolean z, L l8, int i, boolean z6, boolean z8, long j7, boolean z9) {
        this(uri, o2, str, z, l8, i, z6, z8, j7, z9, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(URI uri, O o2, String str, boolean z, L l8, int i, boolean z6, boolean z8, long j7, boolean z9, boolean z10) {
        super(uri, o2, str, l8, i, j7, z9, z10);
        this.allowExtensions = z;
        this.performMasking = z6;
        this.allowMaskMismatch = z8;
    }
}
