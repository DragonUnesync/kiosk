package com.bumptech.glide.load.data;

import B2.c;
import H2.g;
import W2.d;
import W2.h;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.f;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import u.C1477r;

public final class k implements e {

    /* renamed from: U  reason: collision with root package name */
    public final g f9043U;

    /* renamed from: V  reason: collision with root package name */
    public final int f9044V;

    /* renamed from: W  reason: collision with root package name */
    public HttpURLConnection f9045W;

    /* renamed from: X  reason: collision with root package name */
    public InputStream f9046X;

    /* renamed from: Y  reason: collision with root package name */
    public volatile boolean f9047Y;

    public k(g gVar, int i) {
        this.f9043U = gVar;
        this.f9044V = i;
    }

    public static int c(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    public final Class a() {
        return InputStream.class;
    }

    public final void b() {
        InputStream inputStream = this.f9046X;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f9045W;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f9045W = null;
    }

    public final void cancel() {
        this.f9047Y = true;
    }

    public final InputStream d(URL url, int i, URL url2, Map map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new c(-1, (IOException) null, "In re-direct loop");
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int i8 = this.f9044V;
                httpURLConnection.setConnectTimeout(i8);
                httpURLConnection.setReadTimeout(i8);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.f9045W = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.f9046X = this.f9045W.getInputStream();
                    if (this.f9047Y) {
                        return null;
                    }
                    int c8 = c(this.f9045W);
                    int i9 = c8 / 100;
                    if (i9 == 2) {
                        HttpURLConnection httpURLConnection2 = this.f9045W;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.f9046X = new d(httpURLConnection2.getInputStream(), (long) httpURLConnection2.getContentLength());
                            } else {
                                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                                }
                                this.f9046X = httpURLConnection2.getInputStream();
                            }
                            return this.f9046X;
                        } catch (IOException e) {
                            throw new c(c(httpURLConnection2), e, "Failed to obtain InputStream");
                        }
                    } else if (i9 == 3) {
                        String headerField = this.f9045W.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                b();
                                return d(url3, i + 1, url, map);
                            } catch (MalformedURLException e8) {
                                throw new c(c8, e8, C1477r.d("Bad redirect url: ", headerField));
                            }
                        } else {
                            throw new c(c8, (IOException) null, "Received empty or null redirect url");
                        }
                    } else if (c8 == -1) {
                        throw new c(c8, (IOException) null, "Http request failed");
                    } else {
                        try {
                            throw new c(c8, (IOException) null, this.f9045W.getResponseMessage());
                        } catch (IOException e9) {
                            throw new c(c8, e9, "Failed to get a response message");
                        }
                    }
                } catch (IOException e10) {
                    throw new c(c(this.f9045W), e10, "Failed to connect or obtain data");
                }
            } catch (IOException e11) {
                throw new c(0, e11, "URL.openConnection threw");
            }
        } else {
            throw new c(-1, (IOException) null, "Too many (> 5) redirects!");
        }
    }

    public final int e() {
        return 2;
    }

    public final void f(f fVar, d dVar) {
        StringBuilder sb;
        g gVar = this.f9043U;
        int i = h.f6165b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            dVar.d(d(gVar.d(), 0, (URL) null, gVar.f1955b.b()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(h.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb.toString());
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            dVar.c(e);
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + h.a(elapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
