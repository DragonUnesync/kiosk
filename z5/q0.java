package Z5;

import e6.C0847f;
import g6.B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class q0 {
    private static final C0847f CHARSET_EQUALS = C0847f.of(K.CHARSET + "=");
    private static final String COMMA_STRING = String.valueOf(',');
    private static final C0847f SEMICOLON = C0847f.cached(";");

    public static long getContentLength(N n4, long j7) {
        String str = n4.headers().get((CharSequence) G.CONTENT_LENGTH);
        if (str != null) {
            return Long.parseLong(str);
        }
        long webSocketContentLength = (long) getWebSocketContentLength(n4);
        if (webSocketContentLength >= 0) {
            return webSocketContentLength;
        }
        return j7;
    }

    private static int getWebSocketContentLength(N n4) {
        L headers = n4.headers();
        if (n4 instanceof i0) {
            if (!T.GET.equals(((i0) n4).method()) || !headers.contains((CharSequence) G.SEC_WEBSOCKET_KEY1) || !headers.contains((CharSequence) G.SEC_WEBSOCKET_KEY2)) {
                return -1;
            }
            return 8;
        } else if (!(n4 instanceof k0) || ((k0) n4).status().code() != 101 || !headers.contains((CharSequence) G.SEC_WEBSOCKET_ORIGIN) || !headers.contains((CharSequence) G.SEC_WEBSOCKET_LOCATION)) {
            return -1;
        } else {
            return 16;
        }
    }

    public static boolean is100ContinueExpected(N n4) {
        if (!isExpectHeaderValid(n4) || !n4.headers().contains((CharSequence) G.EXPECT, (CharSequence) K.CONTINUE, true)) {
            return false;
        }
        return true;
    }

    public static boolean isContentLengthSet(N n4) {
        return n4.headers().contains((CharSequence) G.CONTENT_LENGTH);
    }

    private static boolean isExpectHeaderValid(N n4) {
        if (!(n4 instanceof i0) || n4.protocolVersion().compareTo(r0.HTTP_1_1) < 0) {
            return false;
        }
        return true;
    }

    public static boolean isKeepAlive(N n4) {
        L headers = n4.headers();
        C0847f fVar = G.CONNECTION;
        if (headers.containsValue(fVar, K.CLOSE, true) || (!n4.protocolVersion().isKeepAliveDefault() && !n4.headers().containsValue(fVar, K.KEEP_ALIVE, true))) {
            return false;
        }
        return true;
    }

    public static boolean isTransferEncodingChunked(N n4) {
        return n4.headers().containsValue(G.TRANSFER_ENCODING, K.CHUNKED, true);
    }

    public static boolean isUnsupportedExpectation(N n4) {
        String str;
        if (isExpectHeaderValid(n4) && (str = n4.headers().get((CharSequence) G.EXPECT)) != null && !K.CONTINUE.toString().equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    public static long normalizeAndGetContentLength(List<? extends CharSequence> list, boolean z, boolean z6) {
        if (list.isEmpty()) {
            return -1;
        }
        String charSequence = ((CharSequence) list.get(0)).toString();
        if ((list.size() > 1 || charSequence.indexOf(44) >= 0) && !z) {
            if (z6) {
                charSequence = null;
                for (CharSequence charSequence2 : list) {
                    String[] split = charSequence2.toString().split(COMMA_STRING, -1);
                    int length = split.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            String trim = split[i].trim();
                            if (charSequence == null) {
                                charSequence = trim;
                            } else if (!trim.equals(charSequence)) {
                                throw new IllegalArgumentException("Multiple Content-Length values found: " + list);
                            }
                            i++;
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Multiple Content-Length values found: " + list);
            }
        }
        if (charSequence.isEmpty() || !Character.isDigit(charSequence.charAt(0))) {
            throw new IllegalArgumentException("Content-Length value is not a number: ".concat(charSequence));
        }
        try {
            return B.checkPositiveOrZero(Long.parseLong(charSequence), "Content-Length value");
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Content-Length value is not a number: ".concat(charSequence), e);
        }
    }

    public static void setTransferEncodingChunked(N n4, boolean z) {
        if (z) {
            n4.headers().set((CharSequence) G.TRANSFER_ENCODING, (Object) K.CHUNKED);
            n4.headers().remove((CharSequence) G.CONTENT_LENGTH);
            return;
        }
        List<String> all = n4.headers().getAll((CharSequence) G.TRANSFER_ENCODING);
        if (!all.isEmpty()) {
            ArrayList arrayList = new ArrayList(all);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (K.CHUNKED.contentEqualsIgnoreCase((CharSequence) it.next())) {
                    it.remove();
                }
            }
            if (arrayList.isEmpty()) {
                n4.headers().remove((CharSequence) G.TRANSFER_ENCODING);
            } else {
                n4.headers().set((CharSequence) G.TRANSFER_ENCODING, (Iterable<?>) arrayList);
            }
        }
    }
}
