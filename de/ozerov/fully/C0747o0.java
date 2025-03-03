package de.ozerov.fully;

import android.content.Intent;
import android.os.Bundle;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import n2.a;

/* renamed from: de.ozerov.fully.o0  reason: case insensitive filesystem */
public final /* synthetic */ class C0747o0 implements Runnable {

    /* renamed from: U  reason: collision with root package name */
    public final /* synthetic */ int f10858U;

    /* renamed from: V  reason: collision with root package name */
    public final /* synthetic */ int f10859V;

    /* renamed from: W  reason: collision with root package name */
    public final /* synthetic */ Object f10860W;

    /* renamed from: X  reason: collision with root package name */
    public final /* synthetic */ Object f10861X;

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Object f10862Y;

    public /* synthetic */ C0747o0(Object obj, Object obj2, int i, Object obj3, int i8) {
        this.f10858U = i8;
        this.f10860W = obj;
        this.f10861X = obj2;
        this.f10859V = i;
        this.f10862Y = obj3;
    }

    public final void run() {
        switch (this.f10858U) {
            case 0:
                FullyActivity.D((FullyActivity) this.f10860W, (Intent) this.f10861X, this.f10859V, (Bundle) this.f10862Y);
                return;
            default:
                String str = (String) this.f10861X;
                int i = this.f10859V;
                String str2 = (String) this.f10862Y;
                FullyActivity fullyActivity = ((U0) this.f10860W).f10414a;
                try {
                    InetAddress byName = InetAddress.getByName(str);
                    Socket socket = new Socket();
                    socket.connect(new InetSocketAddress(byName, i), 3500);
                    socket.setSoTimeout(5000);
                    DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
                    dataOutputStream.write(a.k0(str2));
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    socket.close();
                    return;
                } catch (SocketTimeoutException e) {
                    a.b1(fullyActivity, "Socket connection timeout");
                    e.printStackTrace();
                    return;
                } catch (UnknownHostException e8) {
                    a.b1(fullyActivity, "Host not found for " + str);
                    e8.printStackTrace();
                    return;
                } catch (IOException e9) {
                    a.b1(fullyActivity, "Failed to open/write to " + str + ":" + i);
                    e9.printStackTrace();
                    return;
                } catch (Exception e10) {
                    a.b1(fullyActivity, "Failed to send data");
                    e10.printStackTrace();
                    return;
                }
        }
    }
}
