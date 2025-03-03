package P5;

import j$.util.DesugarTimeZone;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;

public final class K implements Closeable {

    /* renamed from: U  reason: collision with root package name */
    public final J f3836U;

    /* renamed from: V  reason: collision with root package name */
    public final String f3837V;

    /* renamed from: W  reason: collision with root package name */
    public final InputStream f3838W;

    /* renamed from: X  reason: collision with root package name */
    public final long f3839X;

    /* renamed from: Y  reason: collision with root package name */
    public final H f3840Y = new H(this);

    /* renamed from: Z  reason: collision with root package name */
    public final HashMap f3841Z = new HashMap();

    /* renamed from: a0  reason: collision with root package name */
    public int f3842a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f3843b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f3844c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f3845d0;

    public K(J j7, String str, InputStream inputStream, long j8) {
        this.f3836U = j7;
        this.f3837V = str;
        boolean z = false;
        if (inputStream == null) {
            this.f3838W = new ByteArrayInputStream(new byte[0]);
            this.f3839X = 0;
        } else {
            this.f3838W = inputStream;
            this.f3839X = j8;
        }
        this.f3843b0 = this.f3839X < 0 ? true : z;
        this.f3845d0 = true;
    }

    public static void n(PrintWriter printWriter, String str, String str2) {
        printWriter.append(str).append(": ").append(str2).append("\r\n");
    }

    public final void close() {
        InputStream inputStream = this.f3838W;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final void k(String str, String str2) {
        this.f3840Y.put(str, str2);
    }

    public final String l(String str) {
        return (String) this.f3841Z.get(str.toLowerCase());
    }

    public final boolean m() {
        return "close".equals(l("connection"));
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.io.OutputStream, P5.I, java.io.FilterOutputStream] */
    public final void o(OutputStream outputStream) {
        long j7;
        String str;
        String str2 = this.f3837V;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        J j8 = this.f3836U;
        if (j8 != null) {
            try {
                PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream, new B(str2).a())), false);
                PrintWriter append = printWriter.append("HTTP/1.1 ");
                append.append("" + j8.f3834U + " " + j8.f3835V).append(" \r\n");
                if (str2 != null) {
                    n(printWriter, "Content-Type", str2);
                }
                if (l("date") == null) {
                    n(printWriter, "Date", simpleDateFormat.format(new Date()));
                }
                for (Map.Entry entry : this.f3840Y.entrySet()) {
                    n(printWriter, (String) entry.getKey(), (String) entry.getValue());
                }
                if (l("connection") == null) {
                    if (this.f3845d0) {
                        str = "keep-alive";
                    } else {
                        str = "close";
                    }
                    n(printWriter, "Connection", str);
                }
                if (l("content-length") != null) {
                    this.f3844c0 = false;
                }
                if (this.f3844c0) {
                    n(printWriter, "Content-Encoding", "gzip");
                    this.f3843b0 = true;
                }
                InputStream inputStream = this.f3838W;
                if (inputStream != null) {
                    j7 = this.f3839X;
                } else {
                    j7 = 0;
                }
                if (this.f3842a0 != 5 && this.f3843b0) {
                    n(printWriter, "Transfer-Encoding", "chunked");
                } else if (!this.f3844c0) {
                    j7 = q(printWriter, j7);
                }
                printWriter.append("\r\n");
                printWriter.flush();
                if (this.f3842a0 != 5 && this.f3843b0) {
                    ? filterOutputStream = new FilterOutputStream(outputStream);
                    if (this.f3844c0) {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(filterOutputStream);
                        p(gZIPOutputStream, -1);
                        gZIPOutputStream.finish();
                    } else {
                        p(filterOutputStream, -1);
                    }
                    filterOutputStream.k();
                } else if (this.f3844c0) {
                    GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(outputStream);
                    p(gZIPOutputStream2, -1);
                    gZIPOutputStream2.finish();
                } else {
                    p(outputStream, j7);
                }
                outputStream.flush();
                P.i(inputStream);
            } catch (IOException e) {
                P.f3856p.log(Level.SEVERE, "Could not send response to the client", e);
            }
        } else {
            throw new Error("sendResponse(): Status can't be null.");
        }
    }

    public final void p(OutputStream outputStream, long j7) {
        boolean z;
        long j8;
        byte[] bArr = new byte[((int) 16384)];
        if (j7 == -1) {
            z = true;
        } else {
            z = false;
        }
        while (true) {
            if (j7 > 0 || z) {
                if (z) {
                    j8 = 16384;
                } else {
                    j8 = Math.min(j7, 16384);
                }
                int read = this.f3838W.read(bArr, 0, (int) j8);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                    if (!z) {
                        j7 -= (long) read;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final long q(PrintWriter printWriter, long j7) {
        String l8 = l("content-length");
        if (l8 != null) {
            try {
                j7 = Long.parseLong(l8);
            } catch (NumberFormatException unused) {
                P.f3856p.severe("content-length was no number ".concat(l8));
            }
        }
        printWriter.print("Content-Length: " + j7 + "\r\n");
        return j7;
    }

    public final void r(boolean z) {
        this.f3844c0 = z;
    }

    public final void s(boolean z) {
        this.f3845d0 = z;
    }

    public final void t(int i) {
        this.f3842a0 = i;
    }
}
